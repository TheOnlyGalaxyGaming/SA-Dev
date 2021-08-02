
package net.mcreator.rpg.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.rpg.procedures.Progressbar9Procedure;
import net.mcreator.rpg.procedures.Progressbar7Procedure;
import net.mcreator.rpg.procedures.ProgressBar6Procedure;
import net.mcreator.rpg.procedures.ProgressBar5Procedure;
import net.mcreator.rpg.procedures.ProgressBar4Procedure;
import net.mcreator.rpg.procedures.ProgressBar3Procedure;
import net.mcreator.rpg.procedures.ProgressBar2Procedure;
import net.mcreator.rpg.procedures.ProgressBar1Procedure;
import net.mcreator.rpg.procedures.ProgressBar0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class PressGUIGuiWindow extends ContainerScreen<PressGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public PressGUIGuiWindow(PressGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("sa:textures/press_gui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbarempty.png"));
		this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		if (ProgressBar0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar0.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar1Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar1.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar2Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar2.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar3Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar3.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar4Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar4.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar5Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar5.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (ProgressBar6Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar6.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (Progressbar7Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar7.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		if (Progressbar9Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("sa:textures/progressbar8.png"));
			this.blit(ms, this.guiLeft + 70, this.guiTop + 36, 0, 0, 64, 16, 64, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Press", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
