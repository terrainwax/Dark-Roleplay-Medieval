package net.dark_roleplay.medieval.common.handler;

import net.dark_roleplay.drpcore.api.items.DRPEquip;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DRPMedievalCreativeTabs {

	public static CreativeTabs DECORATION = new CreativeTabs("DRPMDecoration") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(DRPMedievalBlocks.FLOWER_POT);
			//return Item.getItemFromBlock(DRPMedievalBlocks.SIMPLE_CHAIR_OAK);
		}
		
		@Override
		public boolean hasSearchBar(){
	        return true;
	    }
		
		@Override
		public int getSearchbarWidth(){
		    return 75;
		}
	}.setBackgroundImageName("drpmedieval.png");;
	
	public static CreativeTabs BUILDING_MATS = new CreativeTabs("DRPMBuildingMats") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(DRPMedievalBlocks.MOSSY_LOG_SPRUCE));
		}
	};
	
	public static CreativeTabs UTILITY = new CreativeTabs("DRPMUtility") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {

			return new ItemStack(Item.getItemFromBlock(DRPMedievalBlocks.CHOPPING_BLOCK));
		}
	};

	public static CreativeTabs drpmedievalFoodTab = new CreativeTabs("DRPMFood") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {

			return new ItemStack(DRPMedievalItems.CatfishCooked);
		}
	};

	public static CreativeTabs drpmedievalEquipTab = new CreativeTabs("DRPEquip") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack((Item)((DRPEquip)DRPMedievalItems.LeatherPurse));
		}
	};

	public static CreativeTabs drpmedievalMiscTab = new CreativeTabs("DRPMMisc") {

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {

			return new ItemStack(DRPMedievalItems.Firewood,1,2);
		}
	};

}
