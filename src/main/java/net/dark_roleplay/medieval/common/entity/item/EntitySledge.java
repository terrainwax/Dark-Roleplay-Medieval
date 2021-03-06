package net.dark_roleplay.medieval.common.entity.item;

import javax.annotation.Nullable;

import net.dark_roleplay.medieval.common.DarkRoleplayMedieval;
import net.dark_roleplay.medieval.common.gui.GuiHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ContainerHorseChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.IInventoryChangedListener;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldNameable;
import net.minecraft.world.World;

public class EntitySledge extends EntityLiving implements IWorldNameable, IInventoryChangedListener {
	
	private ContainerHorseChest chest;
    private static final DataParameter<Byte> CHESTED = EntityDataManager.<Byte>createKey(EntityHorse.class, DataSerializers.BYTE);
	
    private net.minecraftforge.items.IItemHandler itemHandler = null;
    
	public EntitySledge(World worldIn){
        super(worldIn);
        this.setSize(1f, 0.6f);
        //this.preventEntitySpawning = true;
    }

	private double prevHeight;
	
	protected void entityInit(){
        super.entityInit();
        this.dataManager.register(CHESTED, Byte.valueOf((byte)0));
    }
	
    public EntitySledge(World worldIn, double x, double y, double z){
        this(worldIn);
        this.setPosition(posX, posY, posZ);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
    }
    
    public ContainerHorseChest getChest(){
    	return this.chest;
    }
    
    
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(){
        return this.getEntityBoundingBox();
    }

    private void initSledgeChest(){
    	ContainerHorseChest animalchest = this.chest;
        this.chest = new ContainerHorseChest("SledgeChest", 27);
        this.chest.setCustomName(this.getName());

        if (animalchest != null)
        {
            animalchest.removeInventoryChangeListener(this);
            int i = Math.min(animalchest.getSizeInventory(), this.chest.getSizeInventory());

            for (int j = 0; j < i; ++j)
            {
                ItemStack itemstack = animalchest.getStackInSlot(j);

                if (itemstack != null)
                {
                    this.chest.setInventorySlotContents(j, itemstack.copy());
                }
            }
        }

        this.chest.addInventoryChangeListener(this);
       // this.updateHorseSlots();
        this.itemHandler = new net.minecraftforge.items.wrapper.InvWrapper(this.chest);
    }
    
    public boolean isChested(){
        return ((Byte)this.dataManager.get(CHESTED)).byteValue() != 0;
    }
    
    public void setChested(boolean chested){
    	 byte b0 = ((Byte)this.dataManager.get(CHESTED)).byteValue();

         if (chested)
         {
             this.dataManager.set(CHESTED, Byte.valueOf((byte)(b0 | (byte) 1)));
         }
         else
         {
             this.dataManager.set(CHESTED, Byte.valueOf((byte)(b0 & (byte) 0)));
         }
    }
    
    public void dropChestItems(){
        this.dropItemsInChest(this, this.chest);
        this.dropChests();
    }
    
    private void dropItemsInChest(Entity entityIn, ContainerHorseChest animalChestIn){
        if (animalChestIn != null && !this.getEntityWorld().isRemote){
            for (int i = 0; i < animalChestIn.getSizeInventory(); ++i){
                ItemStack itemstack = animalChestIn.getStackInSlot(i);

                if (itemstack != null){
                    this.entityDropItem(itemstack, 0.0F);
                }
            }
        }
    }
    
    public void dropChests(){
        if (!this.getEntityWorld().isRemote && this.isChested()){
            this.dropItem(Item.getItemFromBlock(Blocks.CHEST), 1);
            this.setChested(false);
        }
    }
    
    @Override
	public boolean processInteract(EntityPlayer player, EnumHand hand){
        //if (net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.entity.minecart.MinecartInteractEvent(this, player, stack, hand))) return true;

        if (player.isSneaking()){
        //	if(this.isChested())
        	//	this.openGUI(player);
            return true;
        }else if(!this.isChested() && player.getHeldItem(hand) != null && player.getHeldItem(hand).getItem() == Item.getItemFromBlock(Blocks.CHEST)){
        //	this.initSledgeChest();
        //	this.setChested(true);
        //	if(!player.capabilities.isCreativeMode)
       // 		player.getHeldItem(hand).shrink(1);
        	return true;
    	}else if (this.isBeingRidden()){
            return true;
        }
        else{
            if (!this.getEntityWorld().isRemote){
                player.rotationYaw = this.rotationYaw;
                player.rotationPitch = this.rotationPitch;
                player.startRiding(this);
            }
            return true;
        }
    }
    
    public boolean canBeSteered(){
        return true;
    }
    
    @Nullable
    public Entity getControllingPassenger(){
        return this.getPassengers().isEmpty() ? null : (Entity)this.getPassengers().get(0);
    }
    
    public void moveEntityWithHeading(float strafe, float forward){
        EntityLivingBase entity = (EntityLivingBase)this.getControllingPassenger();
        
        if (this.isBeingRidden() && this.canBeSteered()){
        	//Steer with A&D
        	strafe = entity.moveStrafing;
            forward = entity.moveForward * 0.2F;
            this.rotationYaw = this.rotationYaw -strafe * 5;
            
            this.prevRotationYaw = this.rotationYaw;
            this.rotationPitch = entity.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.renderYawOffset = this.rotationYaw;
            this.rotationYawHead = this.rotationYaw;
            this.stepHeight = 0.5F;
            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

            if (this.canPassengerSteer()){

            	Block at = this.getEntityWorld().getBlockState(this.getPosition()).getBlock();
            	Block below = this.getEntityWorld().getBlockState(this.getPosition().add(0,-1,0)).getBlock();
            	
            	if((at == Blocks.SNOW_LAYER || below == Blocks.SNOW || below == Blocks.SNOW_LAYER) && forward > 0){
            		if(prevHeight > this.posY)
            			forward *= 4F;
            		forward *= 4F;
            		this.stepHeight = 1F;
            	}
            	
                float f = (float)this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue() * 1F;
                this.setAIMoveSpeed(f);
                super.moveRelative(0F, 0F, forward, 0F);
            }else{
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }
        } else{
            this.stepHeight = 1F;
            this.jumpMovementFactor = 0.02F;
            super.moveRelative(strafe, 0F, forward, 0F);
        }
        prevHeight = this.posY;
    }
    
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.22499999403953552D);
    }
    
    public void updatePassenger(Entity passenger) {
        super.updatePassenger(passenger);
        //if (passenger instanceof EntityPlayer){
       // 	EntityPlayer entityliving = (EntityPlayer)passenger;
        //    this.renderYawOffset = entityliving.renderYawOffset;
        //}
        passenger.setRenderYawOffset(this.rotationYaw);
        float f = MathHelper.wrapDegrees(passenger.rotationYaw - this.rotationYaw);
        float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
        passenger.prevRotationYaw += f1 - f;
        passenger.rotationYaw += f1 - f;
        passenger.setRotationYawHead(passenger.rotationYaw);
    }

    public void onDeath(DamageSource cause){
        super.onDeath(cause);

        if (!this.getEntityWorld().isRemote){
            this.dropChestItems();
        }
    }
    
    public void openGUI(EntityPlayer player){
        if ((!this.isBeingRidden() || this.isPassenger(player))){
    		player.openGui(DarkRoleplayMedieval.instance, GuiHandler.GUI_SLEDGE, player.getEntityWorld(), (int) Math.floor(this.posX), (int) Math.floor(this.posY), (int) Math.floor(this.posZ));
        }
    }
	
	public void writeEntityToNBT(NBTTagCompound compound){
        super.writeEntityToNBT(compound);
        compound.setBoolean("Chested", this.isChested());

        if (this.isChested())
        {
            NBTTagList nbttaglist = new NBTTagList();

            for (int i = 2; i < this.chest.getSizeInventory(); ++i)
            {
                ItemStack itemstack = this.chest.getStackInSlot(i);

                if (itemstack != null)
                {
                    NBTTagCompound nbttagcompound = new NBTTagCompound();
                    nbttagcompound.setByte("Slot", (byte)i);
                    itemstack.writeToNBT(nbttagcompound);
                    nbttaglist.appendTag(nbttagcompound);
                }
            }

            compound.setTag("Items", nbttaglist);
        }
    }
	
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setChested(compound.getBoolean("Chested"));

		if (this.isChested()) {
			NBTTagList nbttaglist = compound.getTagList("Items", 10);
			this.initSledgeChest();

			for (int i = 0; i < nbttaglist.tagCount(); ++i) {
				NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
				int j = nbttagcompound.getByte("Slot") & 255;

				if (j >= 2 && j < this.chest.getSizeInventory()) {
					this.chest.setInventorySlotContents(j, new ItemStack(nbttagcompound));
				}
			}
		}
	}

	public boolean replaceItemInInventory(int inventorySlot, @Nullable ItemStack itemStackIn) {
		if (inventorySlot == 499) {
			if (itemStackIn == null && this.isChested()) {
				this.setChested(false);
				this.initSledgeChest();
				return true;
			}

			if (itemStackIn != null && itemStackIn.getItem() == Item.getItemFromBlock(Blocks.CHEST)
					&& !this.isChested()) {
				this.setChested(true);
				this.initSledgeChest();
				return true;
			}
		}

		int i = inventorySlot - 400;


			int j = inventorySlot - 500 + 2;

			if (j >= 2 && j < this.chest.getSizeInventory()) {
				this.chest.setInventorySlotContents(j, itemStackIn);
				return true;
			} else {
				return false;
			}
		
	}

	@Override
	public void onInventoryChanged(IInventory invBasic) {}
}
