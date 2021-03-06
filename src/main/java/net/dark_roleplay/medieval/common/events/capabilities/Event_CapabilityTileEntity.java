package net.dark_roleplay.medieval.common.events.capabilities;

import net.dark_roleplay.medieval.common.blocks.tileentitys.BedFrameTileEntity;
import net.dark_roleplay.medieval.common.capabilities.blocks.bedframe.BedFrameMattressProvider;
import net.dark_roleplay.medieval.common.capabilities.blocks.bedframe.DefaultBedFrameMattress;
import net.dark_roleplay.medieval.common.handler.DRPMedievalCapabilities;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Event_CapabilityTileEntity {

	@SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<TileEntity> event){
		if(event.getObject() instanceof BedFrameTileEntity && !event.getObject().hasCapability(DRPMedievalCapabilities.MATTRESS, null) )
			event.addCapability(new ResourceLocation("drpmedieval_mattress"), new BedFrameMattressProvider(new DefaultBedFrameMattress()));
	
       // if (!(event.getEntity() instanceof EntityPlayer)) return;

//		event.addCapability(DRPMedievalInfo.MODID + "inventory", CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
		
//        event.addCapability(new ResourceLocation(DRPCoreInfo.MODID, "recipe_controller"), new CapabilityProvider(DRPCoreCapabilities.DRPCORE_RECIPE_CONTROLLER));
//        event.addCapability(new ResourceLocation(DRPCoreInfo.MODID, "skill_controller"), new CapabilityProvider(DRPCoreCapabilities.DRPCORE_SKILL_CONTROLLER));
    }
	
}
