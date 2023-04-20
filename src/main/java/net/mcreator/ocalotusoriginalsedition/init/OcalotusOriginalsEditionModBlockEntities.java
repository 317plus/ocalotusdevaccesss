
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ocalotusoriginalsedition.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.ocalotusoriginalsedition.block.entity.Seapurslanespawn1BlockEntity;
import net.mcreator.ocalotusoriginalsedition.OcalotusOriginalsEditionMod;

public class OcalotusOriginalsEditionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OcalotusOriginalsEditionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SEAPURSLANESPAWN_1 = register("seapurslanespawn_1", OcalotusOriginalsEditionModBlocks.SEAPURSLANESPAWN_1, Seapurslanespawn1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
