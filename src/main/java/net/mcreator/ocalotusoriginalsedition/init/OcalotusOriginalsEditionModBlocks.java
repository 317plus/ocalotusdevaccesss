
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ocalotusoriginalsedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ocalotusoriginalsedition.block.Seapurslanespawn1Block;
import net.mcreator.ocalotusoriginalsedition.OcalotusOriginalsEditionMod;

public class OcalotusOriginalsEditionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OcalotusOriginalsEditionMod.MODID);
	public static final RegistryObject<Block> SEAPURSLANESPAWN_1 = REGISTRY.register("seapurslanespawn_1", () -> new Seapurslanespawn1Block());
}
