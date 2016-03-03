/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bmj
/*     */   extends bml
/*     */ {
/*  13 */   private static final bqx b = new bqx("textures/entity/beacon_beam.png");
/*     */   
/*     */   public void a(aoq paramaoq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*     */   {
/*  17 */     float f1 = paramaoq.i();
/*     */     
/*  19 */     GL11.glAlphaFunc(516, 0.1F);
/*  20 */     if (f1 > 0.0F) {
/*  21 */       bmh localbmh = bmh.a;
/*     */       
/*  23 */       a(b);
/*  24 */       GL11.glTexParameterf(3553, 10242, 10497.0F);
/*  25 */       GL11.glTexParameterf(3553, 10243, 10497.0F);
/*  26 */       GL11.glDisable(2896);
/*  27 */       GL11.glDisable(2884);
/*  28 */       GL11.glDisable(3042);
/*  29 */       GL11.glDepthMask(true);
/*  30 */       buu.c(770, 1, 1, 0);
/*     */       
/*  32 */       float f2 = (float)paramaoq.w().I() + paramFloat;
/*  33 */       float f3 = -f2 * 0.2F - qh.d(-f2 * 0.1F);
/*     */       
/*     */ 
/*  36 */       int i = 1;
/*     */       
/*  38 */       double d2 = f2 * 0.025D * (1.0D - (i & 0x1) * 2.5D);
/*     */       
/*  40 */       localbmh.b();
/*  41 */       localbmh.a(255, 255, 255, 32);
/*     */       
/*  43 */       double d4 = i * 0.2D;
/*     */       
/*  45 */       double d6 = 0.5D + Math.cos(d2 + 2.356194490192345D) * d4;
/*  46 */       double d8 = 0.5D + Math.sin(d2 + 2.356194490192345D) * d4;
/*  47 */       double d10 = 0.5D + Math.cos(d2 + 0.7853981633974483D) * d4;
/*  48 */       double d12 = 0.5D + Math.sin(d2 + 0.7853981633974483D) * d4;
/*     */       
/*  50 */       double d14 = 0.5D + Math.cos(d2 + 3.9269908169872414D) * d4;
/*  51 */       double d16 = 0.5D + Math.sin(d2 + 3.9269908169872414D) * d4;
/*  52 */       double d18 = 0.5D + Math.cos(d2 + 5.497787143782138D) * d4;
/*  53 */       double d20 = 0.5D + Math.sin(d2 + 5.497787143782138D) * d4;
/*     */       
/*  55 */       double d22 = 256.0F * f1;
/*     */       
/*  57 */       double d24 = 0.0D;
/*  58 */       double d26 = 1.0D;
/*  59 */       double d27 = -1.0F + f3;
/*  60 */       double d28 = 256.0F * f1 * (0.5D / d4) + d27;
/*     */       
/*  62 */       localbmh.a(paramDouble1 + d6, paramDouble2 + d22, paramDouble3 + d8, d26, d28);
/*  63 */       localbmh.a(paramDouble1 + d6, paramDouble2, paramDouble3 + d8, d26, d27);
/*  64 */       localbmh.a(paramDouble1 + d10, paramDouble2, paramDouble3 + d12, d24, d27);
/*  65 */       localbmh.a(paramDouble1 + d10, paramDouble2 + d22, paramDouble3 + d12, d24, d28);
/*     */       
/*  67 */       localbmh.a(paramDouble1 + d18, paramDouble2 + d22, paramDouble3 + d20, d26, d28);
/*  68 */       localbmh.a(paramDouble1 + d18, paramDouble2, paramDouble3 + d20, d26, d27);
/*  69 */       localbmh.a(paramDouble1 + d14, paramDouble2, paramDouble3 + d16, d24, d27);
/*  70 */       localbmh.a(paramDouble1 + d14, paramDouble2 + d22, paramDouble3 + d16, d24, d28);
/*     */       
/*  72 */       localbmh.a(paramDouble1 + d10, paramDouble2 + d22, paramDouble3 + d12, d26, d28);
/*  73 */       localbmh.a(paramDouble1 + d10, paramDouble2, paramDouble3 + d12, d26, d27);
/*  74 */       localbmh.a(paramDouble1 + d18, paramDouble2, paramDouble3 + d20, d24, d27);
/*  75 */       localbmh.a(paramDouble1 + d18, paramDouble2 + d22, paramDouble3 + d20, d24, d28);
/*     */       
/*  77 */       localbmh.a(paramDouble1 + d14, paramDouble2 + d22, paramDouble3 + d16, d26, d28);
/*  78 */       localbmh.a(paramDouble1 + d14, paramDouble2, paramDouble3 + d16, d26, d27);
/*  79 */       localbmh.a(paramDouble1 + d6, paramDouble2, paramDouble3 + d8, d24, d27);
/*  80 */       localbmh.a(paramDouble1 + d6, paramDouble2 + d22, paramDouble3 + d8, d24, d28);
/*     */       
/*  82 */       localbmh.a();
/*     */       
/*     */ 
/*  85 */       GL11.glEnable(3042);
/*  86 */       buu.c(770, 771, 1, 0);
/*  87 */       GL11.glDepthMask(false);
/*     */       
/*     */ 
/*  90 */       localbmh.b();
/*  91 */       localbmh.a(255, 255, 255, 32);
/*     */       
/*  93 */       double d1 = 0.2D;
/*  94 */       double d3 = 0.2D;
/*  95 */       double d5 = 0.8D;
/*  96 */       double d7 = 0.2D;
/*     */       
/*  98 */       double d9 = 0.2D;
/*  99 */       double d11 = 0.8D;
/* 100 */       double d13 = 0.8D;
/* 101 */       double d15 = 0.8D;
/*     */       
/* 103 */       double d17 = 256.0F * f1;
/*     */       
/* 105 */       double d19 = 0.0D;
/* 106 */       double d21 = 1.0D;
/* 107 */       double d23 = -1.0F + f3;
/* 108 */       double d25 = 256.0F * f1 + d23;
/*     */       
/* 110 */       localbmh.a(paramDouble1 + d1, paramDouble2 + d17, paramDouble3 + d3, d21, d25);
/* 111 */       localbmh.a(paramDouble1 + d1, paramDouble2, paramDouble3 + d3, d21, d23);
/* 112 */       localbmh.a(paramDouble1 + d5, paramDouble2, paramDouble3 + d7, d19, d23);
/* 113 */       localbmh.a(paramDouble1 + d5, paramDouble2 + d17, paramDouble3 + d7, d19, d25);
/*     */       
/* 115 */       localbmh.a(paramDouble1 + d13, paramDouble2 + d17, paramDouble3 + d15, d21, d25);
/* 116 */       localbmh.a(paramDouble1 + d13, paramDouble2, paramDouble3 + d15, d21, d23);
/* 117 */       localbmh.a(paramDouble1 + d9, paramDouble2, paramDouble3 + d11, d19, d23);
/* 118 */       localbmh.a(paramDouble1 + d9, paramDouble2 + d17, paramDouble3 + d11, d19, d25);
/*     */       
/* 120 */       localbmh.a(paramDouble1 + d5, paramDouble2 + d17, paramDouble3 + d7, d21, d25);
/* 121 */       localbmh.a(paramDouble1 + d5, paramDouble2, paramDouble3 + d7, d21, d23);
/* 122 */       localbmh.a(paramDouble1 + d13, paramDouble2, paramDouble3 + d15, d19, d23);
/* 123 */       localbmh.a(paramDouble1 + d13, paramDouble2 + d17, paramDouble3 + d15, d19, d25);
/*     */       
/* 125 */       localbmh.a(paramDouble1 + d9, paramDouble2 + d17, paramDouble3 + d11, d21, d25);
/* 126 */       localbmh.a(paramDouble1 + d9, paramDouble2, paramDouble3 + d11, d21, d23);
/* 127 */       localbmh.a(paramDouble1 + d1, paramDouble2, paramDouble3 + d3, d19, d23);
/* 128 */       localbmh.a(paramDouble1 + d1, paramDouble2 + d17, paramDouble3 + d3, d19, d25);
/*     */       
/* 130 */       localbmh.a();
/*     */       
/*     */ 
/* 133 */       GL11.glEnable(2896);
/* 134 */       GL11.glEnable(3553);
/*     */       
/* 136 */       GL11.glDepthMask(true);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */