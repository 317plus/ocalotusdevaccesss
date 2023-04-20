package net.mcreator.ocalotusoriginalsedition.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.ocalotusoriginalsedition.init.OcalotusOriginalsEditionModBlocks;

public class Seapurslanespawn1BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getFluidState().isSource() == false && world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude() == false) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getFluidState().isSource() == false || world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude() == false) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == OcalotusOriginalsEditionModBlocks.SEAPURSLANESPAWN_1.get()) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
