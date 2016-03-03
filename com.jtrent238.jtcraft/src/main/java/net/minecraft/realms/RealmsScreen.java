/*     */ package net.minecraft.realms;
/*     */ 
/*     */ import add;
/*     */ import bao;
/*     */ import bbw;
/*     */ import bcq;
/*     */ import blg;
/*     */ import bqf;
/*     */ import bqx;
/*     */ import brp;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RealmsScreen
/*     */ {
/*     */   public static final int SKIN_HEAD_U = 8;
/*     */   public static final int SKIN_HEAD_V = 8;
/*     */   public static final int SKIN_HEAD_WIDTH = 8;
/*     */   public static final int SKIN_HEAD_HEIGHT = 8;
/*     */   public static final int SKIN_TEX_WIDTH = 64;
/*     */   public static final int SKIN_TEX_HEIGHT = 32;
/*     */   public static final int SKIN_HAT_U = 40;
/*     */   public static final int SKIN_HAT_V = 8;
/*     */   public static final int SKIN_HAT_WIDTH = 8;
/*     */   public static final int SKIN_HAT_HEIGHT = 8;
/*     */   protected bao minecraft;
/*     */   public int width;
/*     */   public int height;
/*     */   private bcq proxy;
/*     */   
/*     */   public RealmsScreen()
/*     */   {
/*  35 */     this.proxy = new bcq(this);
/*     */   }
/*     */   
/*     */   public bcq getProxy() {
/*  39 */     return this.proxy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void init() {}
/*     */   
/*     */ 
/*     */   public void init(bao parambao, int paramInt1, int paramInt2) {}
/*     */   
/*     */ 
/*     */   public void drawCenteredString(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  52 */     this.proxy.a(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void drawString(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  56 */     this.proxy.b(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void blit(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  60 */     this.proxy.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public static void blit(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat3, float paramFloat4) {
/*  64 */     bbw.a(paramInt1, paramInt2, paramFloat1, paramFloat2, paramInt3, paramInt4, paramInt5, paramInt6, paramFloat3, paramFloat4);
/*     */   }
/*     */   
/*     */   public static void blit(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4) {
/*  68 */     bbw.a(paramInt1, paramInt2, paramFloat1, paramFloat2, paramInt3, paramInt4, paramFloat3, paramFloat4);
/*     */   }
/*     */   
/*     */   public void fillGradient(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  72 */     this.proxy.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*     */   }
/*     */   
/*     */   public void renderBackground() {
/*  76 */     this.proxy.c();
/*     */   }
/*     */   
/*     */   public boolean isPauseScreen() {
/*  80 */     return this.proxy.d();
/*     */   }
/*     */   
/*     */   public void renderBackground(int paramInt) {
/*  84 */     this.proxy.c_(paramInt);
/*     */   }
/*     */   
/*     */   public void render(int paramInt1, int paramInt2, float paramFloat) {
/*  88 */     for (int i = 0; i < this.proxy.j().size(); i++) {
/*  89 */       ((RealmsButton)this.proxy.j().get(i)).render(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void renderTooltip(add paramadd, int paramInt1, int paramInt2) {
/*  94 */     this.proxy.a(paramadd, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void renderTooltip(String paramString, int paramInt1, int paramInt2) {
/*  98 */     this.proxy.a(paramString, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void renderTooltip(List paramList, int paramInt1, int paramInt2) {
/* 102 */     this.proxy.a(paramList, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public static void bindFace(String paramString) {
/* 106 */     bqx localbqx = blg.c(paramString);
/* 107 */     if (localbqx == null) {
/* 108 */       localbqx = blg.c("default");
/*     */     }
/* 110 */     blg.a(localbqx, paramString);
/* 111 */     bao.B().P().a(localbqx);
/*     */   }
/*     */   
/*     */   public static void bind(String paramString) {
/* 115 */     bqx localbqx = new bqx(paramString);
/* 116 */     bao.B().P().a(localbqx);
/*     */   }
/*     */   
/*     */   public void tick() {}
/*     */   
/*     */   public int width()
/*     */   {
/* 123 */     return this.proxy.l;
/*     */   }
/*     */   
/*     */   public int height() {
/* 127 */     return this.proxy.m;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int fontLineHeight()
/*     */   {
/* 136 */     return this.proxy.h();
/*     */   }
/*     */   
/*     */   public int fontWidth(String paramString) {
/* 140 */     return this.proxy.c(paramString);
/*     */   }
/*     */   
/*     */   public void fontDrawShadow(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 144 */     this.proxy.c(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public List fontSplit(String paramString, int paramInt) {
/* 148 */     return this.proxy.a(paramString, paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void buttonClicked(RealmsButton paramRealmsButton) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static RealmsButton newButton(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*     */   {
/* 161 */     return new RealmsButton(paramInt1, paramInt2, paramInt3, paramString);
/*     */   }
/*     */   
/*     */   public static RealmsButton newButton(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
/* 165 */     return new RealmsButton(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/*     */   }
/*     */   
/*     */   public void buttonsClear() {
/* 169 */     this.proxy.i();
/*     */   }
/*     */   
/*     */   public void buttonsAdd(RealmsButton paramRealmsButton) {
/* 173 */     this.proxy.a(paramRealmsButton);
/*     */   }
/*     */   
/*     */   public List buttons() {
/* 177 */     return this.proxy.j();
/*     */   }
/*     */   
/*     */   public void buttonsRemove(RealmsButton paramRealmsButton) {
/* 181 */     this.proxy.b(paramRealmsButton);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public RealmsEditBox newEditBox(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 189 */     return new RealmsEditBox(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void mouseClicked(int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseEvent() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void keyboardEvent() {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseReleased(int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void mouseDragged(int paramInt1, int paramInt2, int paramInt3, long paramLong) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void keyPressed(char paramChar, int paramInt) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void confirmResult(boolean paramBoolean, int paramInt) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public static String getLocalizedString(String paramString)
/*     */   {
/* 225 */     return brp.a(paramString, new Object[0]);
/*     */   }
/*     */   
/*     */   public static String getLocalizedString(String paramString, Object... paramVarArgs) {
/* 229 */     return brp.a(paramString, paramVarArgs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RealmsAnvilLevelStorageSource getLevelStorageSource()
/*     */   {
/* 238 */     return new RealmsAnvilLevelStorageSource(bao.B().d());
/*     */   }
/*     */   
/*     */   public void removed() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */