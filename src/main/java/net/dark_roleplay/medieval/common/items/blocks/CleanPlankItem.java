package net.dark_roleplay.medieval.common.items.blocks;

import java.util.List;

import net.dark_roleplay.medieval.common.blocks.building.CleanPlanks;
import net.dark_roleplay.medieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CleanPlankItem extends ItemBlock{

	public CleanPlankItem(Block block) {
		super(block);
		this.setHasSubtypes(true);
		this.setRegistryName("CleanPlank");
		this.setUnlocalizedName("CleanPlank");
		this.setCreativeTab(DRPMedievalCreativeTabs.drpmedievalMiscTab);
	}


    @SideOnly(Side.CLIENT)
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
    	for (CleanPlanks.EnumType type : CleanPlanks.EnumType.values()){
    		subItems.add(new ItemStack(itemIn, 1, type.getMetadata()));
        }
	}
    
    public int getMetadata(int damage){
        return damage;
    }

	
}
