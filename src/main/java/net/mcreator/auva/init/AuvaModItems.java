
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.auva.item.UpgradeArmorProtectionItemItem;
import net.mcreator.auva.item.TaaffeiteItem;
import net.mcreator.auva.item.TaaffeiteFragmentItem;
import net.mcreator.auva.item.NetheriteUpgradableArmorItem;
import net.mcreator.auva.item.GhostRuneItem;
import net.mcreator.auva.item.FlyingRuneItem;
import net.mcreator.auva.item.FallProtectionRuneItem;
import net.mcreator.auva.AuvaMod;

public class AuvaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AuvaMod.MODID);
	public static final RegistryObject<Item> NETHERITE_UPGRADABLE_ARMOR_HELMET = REGISTRY.register("netherite_upgradable_armor_helmet",
			() -> new NetheriteUpgradableArmorItem.Helmet());
	public static final RegistryObject<Item> NETHERITE_UPGRADABLE_ARMOR_CHESTPLATE = REGISTRY.register("netherite_upgradable_armor_chestplate",
			() -> new NetheriteUpgradableArmorItem.Chestplate());
	public static final RegistryObject<Item> NETHERITE_UPGRADABLE_ARMOR_LEGGINGS = REGISTRY.register("netherite_upgradable_armor_leggings",
			() -> new NetheriteUpgradableArmorItem.Leggings());
	public static final RegistryObject<Item> NETHERITE_UPGRADABLE_ARMOR_BOOTS = REGISTRY.register("netherite_upgradable_armor_boots",
			() -> new NetheriteUpgradableArmorItem.Boots());
	public static final RegistryObject<Item> UPGRADE_ARMOR_PROTECTION_ITEM = REGISTRY.register("upgrade_armor_protection_item",
			() -> new UpgradeArmorProtectionItemItem());
	public static final RegistryObject<Item> FLYING_RUNE = REGISTRY.register("flying_rune", () -> new FlyingRuneItem());
	public static final RegistryObject<Item> FALL_PROTECTION_RUNE = REGISTRY.register("fall_protection_rune", () -> new FallProtectionRuneItem());
	public static final RegistryObject<Item> RUNE_TABLE_BLOCK = block(AuvaModBlocks.RUNE_TABLE_BLOCK, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> GHOST_RUNE = REGISTRY.register("ghost_rune", () -> new GhostRuneItem());
	public static final RegistryObject<Item> TAAFFEITE = REGISTRY.register("taaffeite", () -> new TaaffeiteItem());
	public static final RegistryObject<Item> TAAFFEITE_ORE = block(AuvaModBlocks.TAAFFEITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TAAFFEITE_BLOCK = block(AuvaModBlocks.TAAFFEITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TAAFFEITE_FRAGMENT = REGISTRY.register("taaffeite_fragment", () -> new TaaffeiteFragmentItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
