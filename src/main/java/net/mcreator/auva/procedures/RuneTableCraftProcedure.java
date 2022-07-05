package net.mcreator.auva.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.auva.init.AuvaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class RuneTableCraftProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.BEACON.asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.CRYING_OBSIDIAN.asItem()) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.SHIELD) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == Blocks.CRYING_OBSIDIAN.asItem()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(AuvaModItems.UPGRADE_ARMOR_PROTECTION_ITEM.get());
							_setstack.setCount(1);
							((Slot) _slots.get(4)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						for (int index0 = 0; index0 < (int) (1000); index0++) {
							if (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(4) == 0) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(1)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(2)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(3)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
							}
						}
						if (entity instanceof Player _player)
							_player.closeContainer();
					}
				}
			}
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.BEACON.asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.PHANTOM_MEMBRANE) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.ELYTRA) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == Items.PHANTOM_MEMBRANE) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(AuvaModItems.FLYING_RUNE.get());
							_setstack.setCount(1);
							((Slot) _slots.get(4)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						for (int index1 = 0; index1 < (int) (1000); index1++) {
							if (new Object() {
								public int getAmount(int sltid) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(4) == 0) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(1)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(2)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(3)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
							}
						}
						if (entity instanceof Player _player)
							_player.closeContainer();
					}
				}
			}
		}
	}
}
