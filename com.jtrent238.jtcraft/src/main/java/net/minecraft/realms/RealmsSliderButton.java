/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bcb;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import qh;
/*    */ 
/*    */ public class RealmsSliderButton extends RealmsButton
/*    */ {
/*  9 */   public float value = 1.0F;
/*    */   public boolean sliding;
/*    */   private final float minValue;
/*    */   private final float maxValue;
/*    */   private int steps;
/*    */   
/*    */   public RealmsSliderButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 16 */     this(paramInt1, paramInt2, paramInt3, paramInt4, paramInt6, 0, 1.0F, paramInt5);
/*    */   }
/*    */   
/*    */   public RealmsSliderButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2) {
/* 20 */     super(paramInt1, paramInt2, paramInt3, paramInt4, 20, "");
/* 21 */     this.minValue = paramFloat1;
/* 22 */     this.maxValue = paramFloat2;
/*    */     
/* 24 */     this.value = toPct(paramInt6);
/* 25 */     getProxy().j = getMessage();
/*    */   }
/*    */   
/*    */   public String getMessage() {
/* 29 */     return "";
/*    */   }
/*    */   
/*    */   public float toPct(float paramFloat) {
/* 33 */     return qh.a((clamp(paramFloat) - this.minValue) / (this.maxValue - this.minValue), 0.0F, 1.0F);
/*    */   }
/*    */   
/*    */   public float toValue(float paramFloat) {
/* 37 */     return clamp(this.minValue + (this.maxValue - this.minValue) * qh.a(paramFloat, 0.0F, 1.0F));
/*    */   }
/*    */   
/*    */   public float clamp(float paramFloat) {
/* 41 */     paramFloat = clampSteps(paramFloat);
/* 42 */     return qh.a(paramFloat, this.minValue, this.maxValue);
/*    */   }
/*    */   
/*    */   protected float clampSteps(float paramFloat) {
/* 46 */     if (this.steps > 0) {
/* 47 */       paramFloat = this.steps * Math.round(paramFloat / this.steps);
/*    */     }
/* 49 */     return paramFloat;
/*    */   }
/*    */   
/*    */   public int getYImage(boolean paramBoolean)
/*    */   {
/* 54 */     return 0;
/*    */   }
/*    */   
/*    */   public void renderBg(int paramInt1, int paramInt2)
/*    */   {
/* 59 */     if (!getProxy().m) { return;
/*    */     }
/* 61 */     if (this.sliding) {
/* 62 */       this.value = ((paramInt1 - (getProxy().h + 4)) / (getProxy().b() - 8));
/* 63 */       if (this.value < 0.0F) this.value = 0.0F;
/* 64 */       if (this.value > 1.0F) this.value = 1.0F;
/* 65 */       float f = toValue(this.value);
/* 66 */       clicked(f);
/* 67 */       this.value = toPct(f);
/* 68 */       getProxy().j = getMessage();
/*    */     }
/*    */     
/* 71 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 72 */     blit(getProxy().h + (int)(this.value * (getProxy().b() - 8)), getProxy().i, 0, 66, 4, 20);
/* 73 */     blit(getProxy().h + (int)(this.value * (getProxy().b() - 8)) + 4, getProxy().i, 196, 66, 4, 20);
/*    */   }
/*    */   
/*    */   public void clicked(int paramInt1, int paramInt2)
/*    */   {
/* 78 */     this.value = ((paramInt1 - (getProxy().h + 4)) / (getProxy().b() - 8));
/* 79 */     if (this.value < 0.0F) this.value = 0.0F;
/* 80 */     if (this.value > 1.0F) this.value = 1.0F;
/* 81 */     clicked(toValue(this.value));
/* 82 */     getProxy().j = getMessage();
/* 83 */     this.sliding = true;
/*    */   }
/*    */   
/*    */ 
/*    */   public void clicked(float paramFloat) {}
/*    */   
/*    */ 
/*    */   public void released(int paramInt1, int paramInt2)
/*    */   {
/* 92 */     this.sliding = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsSliderButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */