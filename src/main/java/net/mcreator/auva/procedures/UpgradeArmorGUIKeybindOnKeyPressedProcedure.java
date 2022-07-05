package net.mcreator.auva.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.auva.world.inventory.NetherriteUpgradeMenuMenu;
import net.mcreator.auva.init.AuvaModItems;

import io.netty.buffer.Unpooled;

public class UpgradeArmorGUIKeybindOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == AuvaModItems.NETHERITE_UPGRADABLE_ARMOR_HELMET.get()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("NetherriteUpgradeMenu");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new NetherriteUpgradeMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		} else {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
					.getItem() == AuvaModItems.NETHERITE_UPGRADABLE_ARMOR_CHESTPLATE.get()) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("NetherriteUpgradeMenu");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new NetherriteUpgradeMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			} else {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == AuvaModItems.NETHERITE_UPGRADABLE_ARMOR_LEGGINGS.get()) {
					{
						if (entity instanceof ServerPlayer _ent) {
							BlockPos _bpos = new BlockPos(x, y, z);
							NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return new TextComponent("NetherriteUpgradeMenu");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new NetherriteUpgradeMenuMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					}
				} else {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == AuvaModItems.NETHERITE_UPGRADABLE_ARMOR_BOOTS.get()) {
						{
							if (entity instanceof ServerPlayer _ent) {
								BlockPos _bpos = new BlockPos(x, y, z);
								NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
									@Override
									public Component getDisplayName() {
										return new TextComponent("NetherriteUpgradeMenu");
									}

									@Override
									public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
										return new NetherriteUpgradeMenuMenu(id, inventory,
												new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
									}
								}, _bpos);
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(new TextComponent("The Armor couldnt be detected"), (false));
					}
				}
			}
		}
	}
}
