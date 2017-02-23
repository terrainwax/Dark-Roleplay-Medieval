package net.drpmedieval.common.blocks.building;

import net.drpmedieval.common.util.DRPMedievalCreativeTabs;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StonePillar extends BlockRotatedPillar{

	public StonePillar(String registryName) {
	    super(Material.ROCK);
	    this.setRegistryName(registryName);
	    this.setUnlocalizedName(registryName);
	    this.setCreativeTab(DRPMedievalCreativeTabs.BUILDING_MATS);
	    this.setHardness(1.5F);
	    this.setResistance(10.0F);
	    this.setSoundType(SoundType.STONE);
    }	
}