package net.dark_roleplay.medieval.common.blocks.decorative;

import net.dark_roleplay.medieval.common.blocks.tileentitys.TileEntityKeyHanging;
import net.dark_roleplay.medieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class KeyHanging extends BlockContainer {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public KeyHanging(String registryName) {
		super(Material.IRON);
		this.setRegistryName(registryName);
		this.setUnlocalizedName(registryName);
		this.setCreativeTab(DRPMedievalCreativeTabs.DECORATION);
		this.setHardness(2F);
		this.setSoundType(SoundType.METAL);
	}

	// -------------------------------------------------- Block Data --------------------------------------------------
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
		if(state.getValue(KeyHanging.FACING) == EnumFacing.NORTH)
			return new AxisAlignedBB(0.3125F, 0.125F, 0.8125F, 0.6875F, 0.875F, 1F);
		else if( state.getValue(KeyHanging.FACING) == EnumFacing.EAST )
			return new AxisAlignedBB(0F, 0.125F, 0.3125F, 0.1875F, 0.875F, 0.6875F);
		else if( state.getValue(KeyHanging.FACING) == EnumFacing.SOUTH )
			return new AxisAlignedBB(0.3125F, 0.125F, 0F, 0.6875F, 0.875F, 0.1875F);
		else if( state.getValue(KeyHanging.FACING) == EnumFacing.WEST )
			return new AxisAlignedBB(0.8125F, 0.125F, 0.3125F, 1F, 0.875F, 0.6875F);
		return null;
    }
	
	@Override
	public IBlockState getStateFromMeta(int meta) {

		switch (meta) {
			case 0:
				return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.NORTH);
			case 1:
				return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.EAST);
			case 2:
				return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.SOUTH);
			case 3:
				return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.WEST);
			default:
				return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.NORTH);
		}
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {

		EnumFacing facing = state.getValue(KeyHanging.FACING);
		if(facing.equals(EnumFacing.NORTH)) return 0;
		if(facing.equals(EnumFacing.EAST)) return 1;
		if(facing.equals(EnumFacing.SOUTH)) return 2;
		if(facing.equals(EnumFacing.WEST)) return 3;
		return 0;
	}

	@Override
	protected BlockStateContainer createBlockState() {

		return new BlockStateContainer(this, new IProperty[] {KeyHanging.FACING});
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
			
	// -------------------------------------------------- Block Placement --------------------------------------------------
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos){

		EnumFacing enumfacing = state.getValue(KeyHanging.FACING);

		if(!this.canBlockStay(worldIn, pos, enumfacing)){
			this.dropBlockAsItem(worldIn, pos, state, 0);
			worldIn.setBlockToAir(pos);
		}

				super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
	}

	protected boolean canBlockStay(World worldIn, BlockPos pos, EnumFacing facing) {

		return worldIn.isSideSolid(pos.offset(facing.getOpposite()), facing, true);
	}
	
	// -------------------------------------------------- Block Events --------------------------------------------------
	
	@Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){

		if(facing.equals(EnumFacing.SOUTH))
			return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.SOUTH);
		else if(facing.equals(EnumFacing.WEST))
			return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.WEST);
		else if(facing.equals(EnumFacing.NORTH))
			return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.NORTH);
		else if(facing.equals(EnumFacing.EAST))
			return this.getDefaultState().withProperty(KeyHanging.FACING, EnumFacing.EAST);
		else
			return Blocks.AIR.getDefaultState();

	}
	
	// -------------------------------------------------- Old Rendering System --------------------------------------------------
	// TODO Old Rendering System
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {

		return new TileEntityKeyHanging();
	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state){
		return EnumBlockRenderType.INVISIBLE;
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
}
