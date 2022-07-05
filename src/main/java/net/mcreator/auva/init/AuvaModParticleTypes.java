
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.auva.AuvaMod;

public class AuvaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AuvaMod.MODID);
	public static final RegistryObject<ParticleType<?>> EQUIP_NETHERRITE_ARMOR = REGISTRY.register("equip_netherrite_armor",
			() -> new SimpleParticleType(false));
}
