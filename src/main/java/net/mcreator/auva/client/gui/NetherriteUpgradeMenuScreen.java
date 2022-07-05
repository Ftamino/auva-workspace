
package net.mcreator.auva.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.auva.world.inventory.NetherriteUpgradeMenuMenu;
import net.mcreator.auva.procedures.UpgradeArmorGUIShowProtectionProcedure;
import net.mcreator.auva.procedures.UpgradeArmorGUIShowFlyingProcedure;
import net.mcreator.auva.procedures.UpgradeArmorGUIShowFallProtectionProcedure;
import net.mcreator.auva.network.NetherriteUpgradeMenuButtonMessage;
import net.mcreator.auva.AuvaMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NetherriteUpgradeMenuScreen extends AbstractContainerScreen<NetherriteUpgradeMenuMenu> {
	private final static HashMap<String, Object> guistate = NetherriteUpgradeMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public NetherriteUpgradeMenuScreen(NetherriteUpgradeMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("auva:textures/netherrite_upgrade_menu.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (UpgradeArmorGUIShowFallProtectionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("auva:textures/water_falling_rune.png"));
			this.blit(ms, this.leftPos + 43, this.topPos + 101, 0, 0, 16, 16, 16, 16);
		}
		if (UpgradeArmorGUIShowFlyingProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("auva:textures/flying_rune.png"));
			this.blit(ms, this.leftPos + 25, this.topPos + 101, 0, 0, 16, 16, 16, 16);
		}
		if (UpgradeArmorGUIShowProtectionProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("auva:textures/protection_enchanting_rune.png"));
			this.blit(ms, this.leftPos + 7, this.topPos + 101, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("auva:textures/banner_pattern_outline.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 54, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Rune", 76, 41, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 67, this.topPos + 72, 40, 20, new TextComponent("Add"), e -> {
			if (true) {
				AuvaMod.PACKET_HANDLER.sendToServer(new NetherriteUpgradeMenuButtonMessage(0, x, y, z));
				NetherriteUpgradeMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
