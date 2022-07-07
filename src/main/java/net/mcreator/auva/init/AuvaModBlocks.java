
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.auva.block.TaaffeiteOreBlock;
import net.mcreator.auva.block.TaaffeiteBlockBlock;
import net.mcreator.auva.block.RuneTableBlockBlock;
import net.mcreator.auva.AuvaMod;

public class AuvaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AuvaMod.MODID);
	public static final RegistryObject<Block> RUNE_TABLE_BLOCK = REGISTRY.register("rune_table_block", () -> new RuneTableBlockBlock());
	public static final RegistryObject<Block> TAAFFEITE_ORE = REGISTRY.register("taaffeite_ore", () -> new TaaffeiteOreBlock());
	public static final RegistryObject<Block> TAAFFEITE_BLOCK = REGISTRY.register("taaffeite_block", () -> new TaaffeiteBlockBlock());
}
