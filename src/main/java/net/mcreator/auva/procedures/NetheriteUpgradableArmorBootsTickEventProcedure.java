package net.mcreator.auva.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class NetheriteUpgradableArmorBootsTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((itemstack.getOrCreateTag().getString("water_falling")).equals("true")) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
				if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR) {
					if ((world.getBlockState(new BlockPos(x, y - 3, z))).getBlock() == Blocks.AIR) {
						if (!((world.getBlockState(new BlockPos(x, y - 4, z))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x, y - 3, z), Blocks.WATER.defaultBlockState(), 3);
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER) {
								world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
