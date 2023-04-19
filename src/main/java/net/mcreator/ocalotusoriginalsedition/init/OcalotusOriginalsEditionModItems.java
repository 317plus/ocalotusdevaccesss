
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ocalotusoriginalsedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ocalotusoriginalsedition.OcalotusOriginalsEditionMod;

public class OcalotusOriginalsEditionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OcalotusOriginalsEditionMod.MODID);
	public static final RegistryObject<Item> SEA_PURSLANELAYOVER = block(OcalotusOriginalsEditionModBlocks.SEA_PURSLANELAYOVER, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> SEA_PURSLANE_ITEM_PLANT = block(OcalotusOriginalsEditionModBlocks.SEA_PURSLANE_ITEM_PLANT, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
