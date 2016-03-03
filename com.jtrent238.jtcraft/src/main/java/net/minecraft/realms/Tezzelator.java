/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bmh;
/*    */ import bmi;
/*    */ 
/*    */ public class Tezzelator
/*    */ {
/*  8 */   public static bmh t = bmh.a;
/*    */   
/* 10 */   public static final Tezzelator instance = new Tezzelator();
/*    */   
/*    */   public int end() {
/* 13 */     return t.a();
/*    */   }
/*    */   
/*    */   public void vertex(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 17 */     t.a(paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   public void color(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 21 */     t.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */   }
/*    */   
/*    */   public void color(int paramInt1, int paramInt2, int paramInt3) {
/* 25 */     t.a(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void tex2(int paramInt) {
/* 29 */     t.b(paramInt);
/*    */   }
/*    */   
/*    */   public void normal(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 33 */     t.c(paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public void noColor() {
/* 37 */     t.c();
/*    */   }
/*    */   
/*    */   public void color(int paramInt) {
/* 41 */     t.c(paramInt);
/*    */   }
/*    */   
/*    */   public void color(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 45 */     t.b(paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public bmi sortQuads(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 49 */     return t.a(paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public void restoreState(bmi parambmi) {
/* 53 */     t.a(parambmi);
/*    */   }
/*    */   
/*    */   public void begin(int paramInt) {
/* 57 */     t.a(paramInt);
/*    */   }
/*    */   
/*    */   public void begin() {
/* 61 */     t.b();
/*    */   }
/*    */   
/*    */   public void vertexUV(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5) {
/* 65 */     t.a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/*    */   }
/*    */   
/*    */   public void color(int paramInt1, int paramInt2) {
/* 69 */     t.a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void offset(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 73 */     t.b(paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   public void color(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 77 */     t.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */   public void addOffset(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 81 */     t.d(paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public void tex(double paramDouble1, double paramDouble2) {
/* 85 */     t.a(paramDouble1, paramDouble2);
/*    */   }
/*    */   
/*    */   public void color(byte paramByte1, byte paramByte2, byte paramByte3) {
/* 89 */     t.a(paramByte1, paramByte2, paramByte3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\Tezzelator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */