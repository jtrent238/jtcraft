/*    */ package net.minecraft.realms;
/*    */ 
/*    */ import bcr;
/*    */ 
/*    */ public class RealmsScrolledSelectionList
/*    */ {
/*    */   private final bcr proxy;
/*    */   
/*    */   public RealmsScrolledSelectionList(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 10 */     this.proxy = new bcr(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*    */   }
/*    */   
/*    */   public void render(int paramInt1, int paramInt2, float paramFloat) {
/* 14 */     this.proxy.a(paramInt1, paramInt2, paramFloat);
/*    */   }
/*    */   
/*    */   public int width() {
/* 18 */     return this.proxy.k();
/*    */   }
/*    */   
/*    */   public int ym() {
/* 22 */     return this.proxy.l();
/*    */   }
/*    */   
/*    */   public int xm() {
/* 26 */     return this.proxy.m();
/*    */   }
/*    */   
/*    */ 
/*    */   protected void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Tezzelator paramTezzelator, int paramInt5, int paramInt6) {}
/*    */   
/*    */   public void renderItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 34 */     renderItem(paramInt1, paramInt2, paramInt3, paramInt4, Tezzelator.instance, paramInt5, paramInt6);
/*    */   }
/*    */   
/*    */   public int getItemCount() {
/* 38 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public void selectItem(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*    */   
/*    */   public boolean isSelectedItem(int paramInt)
/*    */   {
/* 46 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public void renderBackground() {}
/*    */   
/*    */   public int getMaxPosition()
/*    */   {
/* 54 */     return 0;
/*    */   }
/*    */   
/*    */   public int getScrollbarPosition() {
/* 58 */     return this.proxy.k() / 2 + 124;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsScrolledSelectionList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */