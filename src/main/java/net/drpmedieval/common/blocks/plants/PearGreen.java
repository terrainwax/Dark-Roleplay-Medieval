package net.drpmedieval.common.blocks.plants;

import net.drpmedieval.common.blocks.helper.TreePlant;
import net.drpmedieval.common.items.DRPMItems;
import net.drpmedieval.common.util.DRPMedievalCreativeTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.ItemStack;

public class PearGreen extends TreePlant {

	public PearGreen() {
		super(4, 25F, true, new ItemStack(DRPMItems.PearGreen, 1));
		this.setRegistryName("PearGreen");
		this.setUnlocalizedName("PearGreen");
		this.setCreativeTab(DRPMedievalCreativeTabs.DECORATION);
		this.setHardness(0.5F);
		this.setSoundType(SoundType.PLANT);
		this.setTickRandomly(true);
	}

	static { 
		AGE = PropertyInteger.create("age", 0, 5);
	}
}
