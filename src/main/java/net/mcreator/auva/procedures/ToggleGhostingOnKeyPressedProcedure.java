package net.mcreator.auva.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ToggleGhostingOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag()
				.getString("invisible_keytrigger")).equals("true")) {
			if (!entity.isInvisible()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1000000000, 1, (true), (false)));
			}
			if (entity.isInvisible()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
			}
		}
	}
}
