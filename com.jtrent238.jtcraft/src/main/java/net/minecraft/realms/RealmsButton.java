/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bao;
/*    */ import bcb;
/*    */ import bcp;
/*    */ 
/*    */ public class RealmsButton
/*    */ {
/*    */   private bcp proxy;
/*    */   
/*    */   public RealmsButton(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*    */   {
/* 13 */     this.proxy = new bcp(this, paramInt1, paramInt2, paramInt3, paramString);
/*    */   }
/*    */   
/*    */   public RealmsButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
/* 17 */     this.proxy = new bcp(this, paramInt1, paramInt2, paramInt3, paramString, paramInt4, paramInt5);
/*    */   }
/*    */   
/*    */   public bcb getProxy() {
/* 21 */     return this.proxy;
/*    */   }
/*    */   
/*    */   public int id() {
/* 25 */     return this.proxy.d();
/*    */   }
/*    */   
/*    */   public boolean active() {
/* 29 */     return this.proxy.e();
/*    */   }
/*    */   
/*    */   public void active(boolean paramBoolean) {
/* 33 */     this.proxy.b(paramBoolean);
/*    */   }
/*    */   
/*    */   public void msg(String paramString) {
/* 37 */     this.proxy.a(paramString);
/*    */   }
/*    */   
/*    */   public int getWidth() {
/* 41 */     return this.proxy.b();
/*    */   }
/*    */   
/*    */   public int getHeight() {
/* 45 */     return this.proxy.c();
/*    */   }
/*    */   
/*    */   public int y() {
/* 49 */     return this.proxy.f();
/*    */   }
/*    */   
/*    */   public void render(int paramInt1, int paramInt2) {
/* 53 */     this.proxy.a(bao.B(), paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */ 
/*    */   public void clicked(int paramInt1, int paramInt2) {}
/*    */   
/*    */   public void released(int paramInt1, int paramInt2) {}
/*    */   
/*    */   public void blit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 63 */     this.proxy.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */ 
/*    */   public void renderBg(int paramInt1, int paramInt2) {}
/*    */   
/*    */   public int getYImage(boolean paramBoolean)
/*    */   {
/* 71 */     return this.proxy.c(paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */