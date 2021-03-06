
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.auva.client.gui.RuneTableRecipeProtScreen;
import net.mcreator.auva.client.gui.RuneTableGUIScreen;
import net.mcreator.auva.client.gui.NetherriteUpgradeMenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AuvaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AuvaModMenus.NETHERRITE_UPGRADE_MENU, NetherriteUpgradeMenuScreen::new);
			MenuScreens.register(AuvaModMenus.RUNE_TABLE_GUI, RuneTableGUIScreen::new);
			MenuScreens.register(AuvaModMenus.RUNE_TABLE_RECIPE_PROT, RuneTableRecipeProtScreen::new);
		});
	}
}
