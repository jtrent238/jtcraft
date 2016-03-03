/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbw
/*     */ {
/*   9 */   public static final bqx b = new bqx("textures/gui/options_background.png");
/*  10 */   public static final bqx c = new bqx("textures/gui/container/stats_icons.png");
/*  11 */   public static final bqx d = new bqx("textures/gui/icons.png");
/*     */   protected float e;
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  15 */     if (paramInt2 < paramInt1) {
/*  16 */       int i = paramInt1;
/*  17 */       paramInt1 = paramInt2;
/*  18 */       paramInt2 = i;
/*     */     }
/*  20 */     a(paramInt1, paramInt3, paramInt2 + 1, paramInt3 + 1, paramInt4);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  24 */     if (paramInt3 < paramInt2) {
/*  25 */       int i = paramInt2;
/*  26 */       paramInt2 = paramInt3;
/*  27 */       paramInt3 = i;
/*     */     }
/*  29 */     a(paramInt1, paramInt2 + 1, paramInt1 + 1, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) { int i;
/*  33 */     if (paramInt1 < paramInt3) {
/*  34 */       i = paramInt1;
/*  35 */       paramInt1 = paramInt3;
/*  36 */       paramInt3 = i;
/*     */     }
/*  38 */     if (paramInt2 < paramInt4) {
/*  39 */       i = paramInt2;
/*  40 */       paramInt2 = paramInt4;
/*  41 */       paramInt4 = i;
/*     */     }
/*  43 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/*  44 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/*  45 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/*  46 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/*  47 */     bmh localbmh = bmh.a;
/*  48 */     GL11.glEnable(3042);
/*  49 */     GL11.glDisable(3553);
/*  50 */     buu.c(770, 771, 1, 0);
/*  51 */     GL11.glColor4f(f2, f3, f4, f1);
/*  52 */     localbmh.b();
/*  53 */     localbmh.a(paramInt1, paramInt4, 0.0D);
/*  54 */     localbmh.a(paramInt3, paramInt4, 0.0D);
/*  55 */     localbmh.a(paramInt3, paramInt2, 0.0D);
/*  56 */     localbmh.a(paramInt1, paramInt2, 0.0D);
/*  57 */     localbmh.a();
/*  58 */     GL11.glEnable(3553);
/*  59 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  63 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/*  64 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/*  65 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/*  66 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/*     */     
/*  68 */     float f5 = (paramInt6 >> 24 & 0xFF) / 255.0F;
/*  69 */     float f6 = (paramInt6 >> 16 & 0xFF) / 255.0F;
/*  70 */     float f7 = (paramInt6 >> 8 & 0xFF) / 255.0F;
/*  71 */     float f8 = (paramInt6 & 0xFF) / 255.0F;
/*  72 */     GL11.glDisable(3553);
/*  73 */     GL11.glEnable(3042);
/*  74 */     GL11.glDisable(3008);
/*  75 */     buu.c(770, 771, 1, 0);
/*  76 */     GL11.glShadeModel(7425);
/*     */     
/*  78 */     bmh localbmh = bmh.a;
/*  79 */     localbmh.b();
/*  80 */     localbmh.a(f2, f3, f4, f1);
/*  81 */     localbmh.a(paramInt3, paramInt2, this.e);
/*  82 */     localbmh.a(paramInt1, paramInt2, this.e);
/*  83 */     localbmh.a(f6, f7, f8, f5);
/*  84 */     localbmh.a(paramInt1, paramInt4, this.e);
/*  85 */     localbmh.a(paramInt3, paramInt4, this.e);
/*  86 */     localbmh.a();
/*     */     
/*  88 */     GL11.glShadeModel(7424);
/*  89 */     GL11.glDisable(3042);
/*  90 */     GL11.glEnable(3008);
/*  91 */     GL11.glEnable(3553);
/*     */   }
/*     */   
/*     */   public void a(bbu parambbu, String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  95 */     parambbu.a(paramString, paramInt1 - parambbu.a(paramString) / 2, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(bbu parambbu, String paramString, int paramInt1, int paramInt2, int paramInt3) {
/*  99 */     parambbu.a(paramString, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 103 */     float f1 = 0.00390625F;
/* 104 */     float f2 = 0.00390625F;
/* 105 */     bmh localbmh = bmh.a;
/* 106 */     localbmh.b();
/* 107 */     localbmh.a(paramInt1 + 0, paramInt2 + paramInt6, this.e, (paramInt3 + 0) * f1, (paramInt4 + paramInt6) * f2);
/* 108 */     localbmh.a(paramInt1 + paramInt5, paramInt2 + paramInt6, this.e, (paramInt3 + paramInt5) * f1, (paramInt4 + paramInt6) * f2);
/* 109 */     localbmh.a(paramInt1 + paramInt5, paramInt2 + 0, this.e, (paramInt3 + paramInt5) * f1, (paramInt4 + 0) * f2);
/* 110 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, this.e, (paramInt3 + 0) * f1, (paramInt4 + 0) * f2);
/* 111 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, rf paramrf, int paramInt3, int paramInt4) {
/* 115 */     bmh localbmh = bmh.a;
/* 116 */     localbmh.b();
/* 117 */     localbmh.a(paramInt1 + 0, paramInt2 + paramInt4, this.e, paramrf.c(), paramrf.f());
/* 118 */     localbmh.a(paramInt1 + paramInt3, paramInt2 + paramInt4, this.e, paramrf.d(), paramrf.f());
/* 119 */     localbmh.a(paramInt1 + paramInt3, paramInt2 + 0, this.e, paramrf.d(), paramrf.e());
/* 120 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, this.e, paramrf.c(), paramrf.e());
/* 121 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4) {
/* 125 */     float f1 = 1.0F / paramFloat3;
/* 126 */     float f2 = 1.0F / paramFloat4;
/* 127 */     bmh localbmh = bmh.a;
/* 128 */     localbmh.b();
/* 129 */     localbmh.a(paramInt1, paramInt2 + paramInt4, 0.0D, paramFloat1 * f1, (paramFloat2 + paramInt4) * f2);
/* 130 */     localbmh.a(paramInt1 + paramInt3, paramInt2 + paramInt4, 0.0D, (paramFloat1 + paramInt3) * f1, (paramFloat2 + paramInt4) * f2);
/* 131 */     localbmh.a(paramInt1 + paramInt3, paramInt2, 0.0D, (paramFloat1 + paramInt3) * f1, paramFloat2 * f2);
/* 132 */     localbmh.a(paramInt1, paramInt2, 0.0D, paramFloat1 * f1, paramFloat2 * f2);
/* 133 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat3, float paramFloat4) {
/* 137 */     float f1 = 1.0F / paramFloat3;
/* 138 */     float f2 = 1.0F / paramFloat4;
/* 139 */     bmh localbmh = bmh.a;
/* 140 */     localbmh.b();
/* 141 */     localbmh.a(paramInt1, paramInt2 + paramInt6, 0.0D, paramFloat1 * f1, (paramFloat2 + paramInt4) * f2);
/* 142 */     localbmh.a(paramInt1 + paramInt5, paramInt2 + paramInt6, 0.0D, (paramFloat1 + paramInt3) * f1, (paramFloat2 + paramInt4) * f2);
/* 143 */     localbmh.a(paramInt1 + paramInt5, paramInt2, 0.0D, (paramFloat1 + paramInt3) * f1, paramFloat2 * f2);
/* 144 */     localbmh.a(paramInt1, paramInt2, 0.0D, paramFloat1 * f1, paramFloat2 * f2);
/* 145 */     localbmh.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */