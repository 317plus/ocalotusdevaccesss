
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ocalotusoriginalsedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ocalotusoriginalsedition.block.SeapurslaneforpotBlock;
import net.mcreator.ocalotusoriginalsedition.block.SeaPurslanelayoverBlock;
import net.mcreator.ocalotusoriginalsedition.OcalotusOriginalsEditionMod;

public class OcalotusOriginalsEditionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OcalotusOriginalsEditionMod.MODID);
	public static final RegistryObject<Block> SEA_PURSLANELAYOVER = REGISTRY.register("sea_purslanelayover", () -> new SeaPurslanelayoverBlock());
	public static final RegistryObject<Block> SEA_PURSLANE_ITEM_PLANT = REGISTRY.register("sea_purslane_item_plant", () -> new SeapurslaneforpotBlock());
}
