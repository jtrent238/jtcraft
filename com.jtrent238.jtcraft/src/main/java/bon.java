/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bon
/*     */   extends bno
/*     */ {
/*  15 */   private static final bqx a = new bqx("textures/painting/paintings_kristoffer_zetterstrand.png");
/*     */   
/*     */   public void a(tb paramtb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  19 */     GL11.glPushMatrix();
/*  20 */     GL11.glTranslated(paramDouble1, paramDouble2, paramDouble3);
/*  21 */     GL11.glRotatef(paramFloat1, 0.0F, 1.0F, 0.0F);
/*  22 */     GL11.glEnable(32826);
/*     */     
/*  24 */     b(paramtb);
/*  25 */     tc localtc = paramtb.e;
/*     */     
/*  27 */     float f = 0.0625F;
/*  28 */     GL11.glScalef(f, f, f);
/*  29 */     a(paramtb, localtc.C, localtc.D, localtc.E, localtc.F);
/*  30 */     GL11.glDisable(32826);
/*  31 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   protected bqx a(tb paramtb)
/*     */   {
/*  36 */     return a;
/*     */   }
/*     */   
/*     */   private void a(tb paramtb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  40 */     float f1 = -paramInt1 / 2.0F;
/*  41 */     float f2 = -paramInt2 / 2.0F;
/*     */     
/*  43 */     float f3 = 0.5F;
/*     */     
/*     */ 
/*  46 */     float f4 = 0.75F;
/*  47 */     float f5 = 0.8125F;
/*  48 */     float f6 = 0.0F;
/*  49 */     float f7 = 0.0625F;
/*     */     
/*     */ 
/*  52 */     float f8 = 0.75F;
/*  53 */     float f9 = 0.8125F;
/*  54 */     float f10 = 0.001953125F;
/*  55 */     float f11 = 0.001953125F;
/*     */     
/*     */ 
/*  58 */     float f12 = 0.7519531F;
/*  59 */     float f13 = 0.7519531F;
/*  60 */     float f14 = 0.0F;
/*  61 */     float f15 = 0.0625F;
/*     */     
/*  63 */     for (int i = 0; i < paramInt1 / 16; i++)
/*  64 */       for (int j = 0; j < paramInt2 / 16; j++) {
/*  65 */         float f16 = f1 + (i + 1) * 16;
/*  66 */         float f17 = f1 + i * 16;
/*  67 */         float f18 = f2 + (j + 1) * 16;
/*  68 */         float f19 = f2 + j * 16;
/*     */         
/*  70 */         a(paramtb, (f16 + f17) / 2.0F, (f18 + f19) / 2.0F);
/*     */         
/*     */ 
/*  73 */         float f20 = (paramInt3 + paramInt1 - i * 16) / 256.0F;
/*  74 */         float f21 = (paramInt3 + paramInt1 - (i + 1) * 16) / 256.0F;
/*  75 */         float f22 = (paramInt4 + paramInt2 - j * 16) / 256.0F;
/*  76 */         float f23 = (paramInt4 + paramInt2 - (j + 1) * 16) / 256.0F;
/*     */         
/*  78 */         bmh localbmh = bmh.a;
/*  79 */         localbmh.b();
/*  80 */         localbmh.c(0.0F, 0.0F, -1.0F);
/*  81 */         localbmh.a(f16, f19, -f3, f21, f22);
/*  82 */         localbmh.a(f17, f19, -f3, f20, f22);
/*  83 */         localbmh.a(f17, f18, -f3, f20, f23);
/*  84 */         localbmh.a(f16, f18, -f3, f21, f23);
/*     */         
/*  86 */         localbmh.c(0.0F, 0.0F, 1.0F);
/*  87 */         localbmh.a(f16, f18, f3, f4, f6);
/*  88 */         localbmh.a(f17, f18, f3, f5, f6);
/*  89 */         localbmh.a(f17, f19, f3, f5, f7);
/*  90 */         localbmh.a(f16, f19, f3, f4, f7);
/*     */         
/*  92 */         localbmh.c(0.0F, 1.0F, 0.0F);
/*  93 */         localbmh.a(f16, f18, -f3, f8, f10);
/*  94 */         localbmh.a(f17, f18, -f3, f9, f10);
/*  95 */         localbmh.a(f17, f18, f3, f9, f11);
/*  96 */         localbmh.a(f16, f18, f3, f8, f11);
/*     */         
/*  98 */         localbmh.c(0.0F, -1.0F, 0.0F);
/*  99 */         localbmh.a(f16, f19, f3, f8, f10);
/* 100 */         localbmh.a(f17, f19, f3, f9, f10);
/* 101 */         localbmh.a(f17, f19, -f3, f9, f11);
/* 102 */         localbmh.a(f16, f19, -f3, f8, f11);
/*     */         
/* 104 */         localbmh.c(-1.0F, 0.0F, 0.0F);
/* 105 */         localbmh.a(f16, f18, f3, f13, f14);
/* 106 */         localbmh.a(f16, f19, f3, f13, f15);
/* 107 */         localbmh.a(f16, f19, -f3, f12, f15);
/* 108 */         localbmh.a(f16, f18, -f3, f12, f14);
/*     */         
/* 110 */         localbmh.c(1.0F, 0.0F, 0.0F);
/* 111 */         localbmh.a(f17, f18, -f3, f13, f14);
/* 112 */         localbmh.a(f17, f19, -f3, f13, f15);
/* 113 */         localbmh.a(f17, f19, f3, f12, f15);
/* 114 */         localbmh.a(f17, f18, f3, f12, f14);
/* 115 */         localbmh.a();
/*     */       }
/*     */   }
/*     */   
/*     */   private void a(tb paramtb, float paramFloat1, float paramFloat2) {
/* 120 */     int i = qh.c(paramtb.s);
/* 121 */     int j = qh.c(paramtb.t + paramFloat2 / 16.0F);
/* 122 */     int k = qh.c(paramtb.u);
/* 123 */     if (paramtb.a == 2) i = qh.c(paramtb.s + paramFloat1 / 16.0F);
/* 124 */     if (paramtb.a == 1) k = qh.c(paramtb.u - paramFloat1 / 16.0F);
/* 125 */     if (paramtb.a == 0) i = qh.c(paramtb.s - paramFloat1 / 16.0F);
/* 126 */     if (paramtb.a == 3) k = qh.c(paramtb.u + paramFloat1 / 16.0F);
/* 127 */     int m = this.b.g.c(i, j, k, 0);
/* 128 */     int n = m % 65536;
/* 129 */     int i1 = m / 65536;
/* 130 */     buu.a(buu.c, n, i1);
/* 131 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */