package net.drpmedieval.common.crafting;

import net.dark_roleplay.drpcore.common.crafting.CraftingRegistry;
import net.dark_roleplay.drpcore.common.crafting.SimpleRecipe;
//import net.drpcore.common.crafting.AdvancedRecipe;
//import net.drpcore.common.crafting.CraftingController;
import net.drpmedieval.common.DarkRoleplayMedieval;
import net.drpmedieval.common.blocks.DRPMBlocks;
import net.drpmedieval.common.items.DRPMItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class DRPMedievalCrafting {

//	//Used to do all Crafting stuff (Registration)
//	public static void preInit(FMLPreInitializationEvent event) {}
//	
//	public static void init(FMLInitializationEvent event) {}

	public static void postInit(FMLPostInitializationEvent event) {
		//Decorative Stuff
		
		registerAirRecipes();
		registerSpinningWheelRecipes();
		registerMortarRecipes();
		registerAnvilRecipes();
		registerCauldronRecipes();
		registerChoppingBlockRecipes();
		
	}
	
	private static void registerAirRecipes(){
		
		//Sittables
		/*Simple Chairs*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 0)}), true);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_chair_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_CHAIR_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 5)}), false);
		
		/*Barrel Chairs*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_chair_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CHAIR_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 5)}), false);
		
		/*Barrel Chairs*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_OAK, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"sittables",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "log_chair_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LOG_CHAIR_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 0)}), false);
		
		//Crafting Materials
		/*Planks Different Types*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_oak"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 0)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_spruce"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 1)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_birch"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 2)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_jungle"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 3)},new ItemStack[]{new ItemStack(Blocks.LOG, 1, 3)}), false);	
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 4)},new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "plank_acacia"),
			new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 5)},new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 0)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "trigger_trap"),
			new ItemStack[]{new ItemStack(DRPMItems.TriggerTrap, 1, 0)},new ItemStack[]{new ItemStack(Blocks.TRIPWIRE_HOOK,1,0), new ItemStack(Items.STRING, 1, 0)}), false);	
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"food_ingredients",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "dough_wheat"),
			new ItemStack[]{new ItemStack(DRPMItems.DoughWheat, 3, 0)},new ItemStack[]{new ItemStack(DRPMItems.FlourWheat,3,0), new ItemStack(Items.WATER_BUCKET, 1, 0)}), false);	
		CraftingRegistry.registerRecipe(Blocks.AIR,"food_ingredients",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "dough_barley"),
			new ItemStack[]{new ItemStack(DRPMItems.DoughBarley, 3, 0)},new ItemStack[]{new ItemStack(DRPMItems.FlourBarley,3,0), new ItemStack(Items.WATER_BUCKET, 1, 0)}), false);	
		CraftingRegistry.registerRecipe(Blocks.AIR,"food_ingredients",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "dough_wheat_pumpkin"),
			new ItemStack[]{new ItemStack(DRPMItems.DoughPumpkin, 3, 0)},new ItemStack[]{new ItemStack(DRPMItems.FlourWheat,3,0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.PUMPKIN_SEEDS,9,0)}), false);	
		CraftingRegistry.registerRecipe(Blocks.AIR,"food_ingredients",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "dough_barley_pumpkin"),
			new ItemStack[]{new ItemStack(DRPMItems.DoughPumpkin, 3, 1)},new ItemStack[]{new ItemStack(DRPMItems.FlourBarley,3,0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.PUMPKIN_SEEDS,9,0)}), false);	
		
		/*Empty Bucket Spruce*/
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative", new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "empty_bucket_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BUCKET_EMPTY, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank, 3, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative", new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "water_bucket_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BUCKET_WATER, 1, 0)}, new ItemStack[]{new ItemStack(DRPMBlocks.BUCKET_EMPTY, 1, 0), new ItemStack(Items.WATER_BUCKET, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative", new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "dirt_bucket_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BUCKET_DIRT, 1, 0)}, new ItemStack[]{new ItemStack(DRPMBlocks.BUCKET_EMPTY, 1, 0), new ItemStack(Blocks.DIRT, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative", new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "flower_pot_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.FLOWER_POT, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank,2,1), new ItemStack(Blocks.DIRT)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "rope"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ROPE, 1, 0)}, new ItemStack[]{new ItemStack(Items.STRING,3,0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "rope_anchor"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ROPE_ANCHOR, 3, 0)}, new ItemStack[]{new ItemStack(Blocks.LOG, 1, 0)}), false);
		
		/*SimpleTables*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_table_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SIMPLE_TABLE_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 5)}), false);
		
		/*Barrels*/
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_empty_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 8, 5)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_closed_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_CLOSED_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 10, 5)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_OAK,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_SPRUCE,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_BIRCH,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_JUNGLE,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_DARK_OAK,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_water_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_WATER_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_ACACIA,1,0), new ItemStack(Items.WATER_BUCKET)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_OAK,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_SPRUCE,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_BIRCH,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_JUNGLE,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_DARK_OAK,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_gunpowder_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_GUNPOWDER_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_EMPTY_ACACIA,1,0), new ItemStack(Items.GUNPOWDER, 9, 0)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "hanging_bridge"),
			new ItemStack[]{new ItemStack(DRPMBlocks.HANGING_BRIDGE, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank,3,0), new ItemStack(DRPMBlocks.ROPE, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "rope_fence"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ROPE_FENCE, 4, 0)}, new ItemStack[]{new ItemStack(Blocks.LOG,1,0), new ItemStack(DRPMBlocks.ROPE, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "mug_empty"),
			new ItemStack[]{new ItemStack(DRPMBlocks.MUG_EMPTY, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "ships_helm"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SHIPS_HELM, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank, 4, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "large_target"),
			new ItemStack[]{new ItemStack(DRPMBlocks.TARGET, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "book"),
			new ItemStack[]{new ItemStack(DRPMBlocks.bookOne, 1, 0)}, new ItemStack[]{new ItemStack(Items.BOOK, 1, 0)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_BIRCH, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_JUNGLE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_DARK_OAK, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "barrel_table_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.BARREL_TABLE_ACACIA, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 2, 5)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"decorative",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "lectern_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.LARGE_LECTERN_SPRUCE, 1, 0)},new ItemStack[]{new ItemStack(DRPMItems.Plank, 6, 1)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 0)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 1)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 1)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_birch"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 2)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_jungle"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 3)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 3)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 4)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 5)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "clean_plank_acacia"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CLEAN_PLANKS, 1, 5)},new ItemStack[]{new ItemStack(Blocks.PLANKS, 1, 4)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "brick_diorite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.DIORITE_BRICKS, 4, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 4, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "pillar_diorite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.DIORITE_PILLAR, 3, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 3, 4)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "brick_granite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.GRANITE_BRICKS, 4, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 4, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "pillar_granite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.GRANITE_PILLAR, 3, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 3, 2)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "brick_andesite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ANDESITE_BRICKS, 4, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 4, 6)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR,"building",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "pillar_andesite"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ANDESITE_PILLAR, 3, 0)},new ItemStack[]{new ItemStack(Blocks.STONE, 3, 6)}), false);
		
		CraftingRegistry.registerRecipe(Blocks.AIR, "crafting_stations",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "anvil"),
			new ItemStack[]{new ItemStack(DRPMBlocks.ANVIL, 1, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,32,0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "crafting_stations",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "mortar"),
			new ItemStack[]{new ItemStack(DRPMBlocks.MORTAR, 1, 0)}, new ItemStack[]{new ItemStack(Blocks.STONE,1,0), new ItemStack(Items.STICK, 1, 0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "crafting_stations",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "chopping_block"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CHOPPING_BLOCK, 1, 0)}, new ItemStack[]{new ItemStack(Blocks.LOG,1,0), new ItemStack(Items.IRON_AXE,1,0)}), false);
		CraftingRegistry.registerRecipe(Blocks.AIR, "crafting_stations",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "spinning_wheel"),
			new ItemStack[]{new ItemStack(DRPMBlocks.SPINNING_WHEEL, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Plank, 20, 0)}), false);
	}
	
	private static void registerSpinningWheelRecipes(){
		CraftingRegistry.registerRecipe(DRPMBlocks.SPINNING_WHEEL,"crafting_materials",new SimpleRecipe(new ResourceLocation(DarkRoleplayMedieval.MODID, "simple_string"),
			new ItemStack[]{new ItemStack(Items.STRING, 4, 0)},new ItemStack[]{new ItemStack(Blocks.WOOL, 1, 0)}), false);
	}
	
	private static void registerMortarRecipes(){
		CraftingRegistry.registerRecipe(DRPMBlocks.MORTAR, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "wheat_flour"),
			new ItemStack[]{new ItemStack(DRPMItems.FlourWheat, 1, 0)}, new ItemStack[]{new ItemStack(Items.WHEAT, 1, 0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.MORTAR, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "wheat_barley"),
			new ItemStack[]{new ItemStack(DRPMItems.FlourBarley, 1, 0)}, new ItemStack[]{new ItemStack(DRPMItems.Barley, 1, 0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.MORTAR, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "bone_meal"),
			new ItemStack[]{new ItemStack(Items.DYE, 4, 15)}, new ItemStack[]{new ItemStack(Items.BONE, 1, 0)}), false);
	}
	
	private static void registerAnvilRecipes(){
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "torch_holder_empty"),
			new ItemStack[]{new ItemStack(DRPMBlocks.TORCH_HOLDER_EMPTY, 1, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,1,0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "iron_chain"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CHAIN, 1, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,1,0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "iron_hook"),
			new ItemStack[]{new ItemStack(DRPMBlocks.IRON_HOOK, 1, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,1,0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "decorative",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "golden_ship_bell"),
			new ItemStack[]{new ItemStack(DRPMBlocks.GOLDEN_SHIPS_BELL, 1, 0)}, new ItemStack[]{new ItemStack(Items.GOLD_INGOT,4,0), new ItemStack(DRPMBlocks.ROPE,1,0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "crafting_stations",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "cauldron_firepit"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CAULDRON, 1, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,16,0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.ANVIL, "storage",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "crate_spruce"),
			new ItemStack[]{new ItemStack(DRPMBlocks.CRATE, 2, 0)}, new ItemStack[]{new ItemStack(Items.IRON_INGOT,1,0), new ItemStack(DRPMItems.Plank, 12, 1)}), false);
	}
	
	private static void registerChoppingBlockRecipes(){
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_oak"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 0)}, new ItemStack[]{new ItemStack(Blocks.LOG, 1, 0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_spruce"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 1)}, new ItemStack[]{new ItemStack(Blocks.LOG, 1, 1)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_birch"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 2)}, new ItemStack[]{new ItemStack(Blocks.LOG, 1, 2)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_jungle"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 3)}, new ItemStack[]{new ItemStack(Blocks.LOG, 1, 3)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_dark_oak"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 4)}, new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 1)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CHOPPING_BLOCK, "crafting_materials",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "firewood_acacia"),
			new ItemStack[]{new ItemStack(DRPMItems.Firewood, 4, 5)}, new ItemStack[]{new ItemStack(Blocks.LOG2, 1, 0)}), false);
	}
	
	private static void registerCauldronRecipes(){
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "chicken_stew"),
			new ItemStack[]{new ItemStack(DRPMItems.ChickenStew, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.CHICKEN, 1, 0), new ItemStack(Items.CARROT, 1, 0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "cod_stew"),
			new ItemStack[]{new ItemStack(DRPMItems.CodStew, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.FISH, 1, 0), new ItemStack(Items.CARROT, 1, 0)}), false);		
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "veggie_stew"),
			new ItemStack[]{new ItemStack(DRPMItems.VegieStew, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.POTATO, 1, 0), new ItemStack(Items.CARROT, 1, 0)}), false);	
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "pumpkin_stew"),
			new ItemStack[]{new ItemStack(DRPMItems.PumpkinStew, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Blocks.PUMPKIN, 1, 0), new ItemStack(Items.CARROT, 1, 0)}), false);	
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "rabbit_stew"),
			new ItemStack[]{new ItemStack(Items.RABBIT_STEW, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0),  new ItemStack(Items.RABBIT, 2, 0), new ItemStack(Items.CARROT, 3, 0), new ItemStack(Items.POTATO, 3, 0), new ItemStack(Blocks.BROWN_MUSHROOM, 3, 0)}), false);	
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "beetroot_stew"),
			new ItemStack[]{new ItemStack(Items.BEETROOT_SOUP, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Items.BEETROOT, 9, 0)}), false);
		CraftingRegistry.registerRecipe(DRPMBlocks.CAULDRON, "soups",new SimpleRecipe( new ResourceLocation(DarkRoleplayMedieval.MODID, "mushroom_stew"),
			new ItemStack[]{new ItemStack(Items.MUSHROOM_STEW, 3, 0)}, new ItemStack[]{new ItemStack(Items.BOWL, 3, 0), new ItemStack(Items.WATER_BUCKET, 1, 0), new ItemStack(Blocks.RED_MUSHROOM, 3, 0), new ItemStack(Blocks.BROWN_MUSHROOM, 3, 0)}), false);
		
	}
	
}

