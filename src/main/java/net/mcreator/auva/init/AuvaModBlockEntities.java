
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.auva.block.entity.RuneTableBlockBlockEntity;
import net.mcreator.auva.AuvaMod;

public class AuvaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, AuvaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RUNE_TABLE_BLOCK = register("rune_table_block", AuvaModBlocks.RUNE_TABLE_BLOCK,
			RuneTableBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
