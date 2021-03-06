package net.dark_roleplay.medieval.common.blocks.building;

import java.util.Random;

import net.dark_roleplay.medieval.common.handler.DRPMedievalCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PackedIceBricks extends Block{

	public PackedIceBricks(String registryName) {
	    super(Material.PACKED_ICE);
	    this.setRegistryName(registryName);
	    this.setUnlocalizedName(registryName);
	    this.setCreativeTab(DRPMedievalCreativeTabs.BUILDING_MATS);
	    this.setHardness(0.5F);
	    this.setSoundType(SoundType.GLASS);
        this.slipperiness = 0.98F;
    }
	
	@Override
    public int quantityDropped(Random random){
        return 0;
    }
	
	
}
