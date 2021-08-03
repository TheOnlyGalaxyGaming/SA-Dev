// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Claws;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer Teeth;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer Neck;
	private final ModelRenderer Tail;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer Legs;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bb_main;
	private final ModelRenderer Body_r1;

	public Modelcustom_model() {
		textureWidth = 32;
		textureHeight = 32;

		Claws = new ModelRenderer(this);
		Claws.setRotationPoint(0.0F, 25.0F, 0.0F);
		Claws.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Claws.setTextureOffset(0, 0).addBox(5.0F, -2.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Claws.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Claws.setTextureOffset(0, 0).addBox(5.0F, -2.0F, 14.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Claws.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 2.7925F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-12.0F, -2.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, 6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -1.0F, 0.0F);
		Claws.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(0.0F, -1.0F, 15.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Claws.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 15.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Claws.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -2.7925F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(11.0F, -2.0F, -13.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 0).addBox(4.0F, -2.0F, 6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.setTextureOffset(0, 13).addBox(-4.0F, -15.0F, -20.0F, 8.0F, 6.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 4).addBox(-4.0F, -17.0F, -19.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 4).addBox(-4.0F, -18.0F, -23.0F, 8.0F, 3.0F, 6.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 23).addBox(-5.0F, -13.0F, -23.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);

		Teeth = new ModelRenderer(this);
		Teeth.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Teeth.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-2.0F, -15.0F, -22.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(-1.0F, -15.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(0.0F, -15.0F, -23.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(1.0F, -15.0F, -22.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 0).addBox(3.0F, -15.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Teeth.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(0, 0).addBox(3.0F, -14.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(2.0F, -15.0F, -23.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 0).addBox(-3.0F, -15.0F, -23.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 24.0F, 0.0F);
		Neck.setTextureOffset(0, 22).addBox(-3.0F, -14.0F, -16.0F, 6.0F, 5.0F, 3.0F, 0.0F, false);
		Neck.setTextureOffset(0, 18).addBox(-2.0F, -14.0F, -14.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(0, 12).addBox(-3.0F, -27.0F, 43.0F, 6.0F, 4.0F, 16.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(0, 0).addBox(-4.0F, -24.0F, 17.0F, 8.0F, 6.0F, 29.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		Legs.setTextureOffset(1, 6).addBox(-7.0F, -1.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Legs.setTextureOffset(0, 5).addBox(-7.0F, -1.0F, 16.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Legs.setTextureOffset(0, 20).addBox(4.0F, -1.0F, 16.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		Legs.setTextureOffset(0, 21).addBox(4.0F, -1.0F, -5.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3054F, 0.0F, 0.0436F);
		cube_r11.setTextureOffset(0, 23).addBox(4.0F, -6.0F, -4.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.1744F, 0.0076F, -0.043F);
		cube_r12.setTextureOffset(0, 19).addBox(4.0F, -13.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1744F, 0.0076F, -0.043F);
		cube_r13.setTextureOffset(2, 17).addBox(4.0F, -19.0F, 12.0F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(4, 19).addBox(4.0F, -2.0F, 16.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		cube_r14.setTextureOffset(0, 22).addBox(-7.0F, -2.0F, 16.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1744F, -0.0076F, 0.043F);
		cube_r15.setTextureOffset(0, 17).addBox(-8.0F, -19.0F, 12.0F, 4.0F, 10.0F, 5.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3054F, 0.0F, -0.0436F);
		cube_r16.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, -4.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Legs.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.1744F, -0.0076F, 0.043F);
		cube_r17.setTextureOffset(0, 19).addBox(-8.0F, -13.0F, -3.0F, 4.0F, 8.0F, 5.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(Body_r1);
		setRotationAngle(Body_r1, 0.2182F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(0, 0).addBox(-5.0F, -17.0F, -7.0F, 10.0F, 8.0F, 32.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Claws.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Teeth.render(matrixStack, buffer, packedLight, packedOverlay);
		Neck.render(matrixStack, buffer, packedLight, packedOverlay);
		Tail.render(matrixStack, buffer, packedLight, packedOverlay);
		Legs.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Tail.rotateAngleZ = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.Teeth.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Teeth.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}