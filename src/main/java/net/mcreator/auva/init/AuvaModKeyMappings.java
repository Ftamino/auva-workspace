
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auva.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.auva.network.UpgradeArmorGUIKeybindMessage;
import net.mcreator.auva.AuvaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AuvaModKeyMappings {
	public static final KeyMapping UPGRADE_ARMOR_GUI_KEYBIND = new KeyMapping("key.auva.upgrade_armor_gui_keybind", GLFW.GLFW_KEY_PERIOD,
			"key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(UPGRADE_ARMOR_GUI_KEYBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == UPGRADE_ARMOR_GUI_KEYBIND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						AuvaMod.PACKET_HANDLER.sendToServer(new UpgradeArmorGUIKeybindMessage(0, 0));
						UpgradeArmorGUIKeybindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
