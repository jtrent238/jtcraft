/*     */ import java.util.Random;
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
/*     */ 
/*     */ public class bnl
/*     */   extends bok
/*     */ {
/*  17 */   private static final bqx f = new bqx("textures/entity/enderdragon/dragon_exploding.png");
/*  18 */   private static final bqx g = new bqx("textures/entity/endercrystal/endercrystal_beam.png");
/*  19 */   private static final bqx h = new bqx("textures/entity/enderdragon/dragon_eyes.png");
/*  20 */   private static final bqx k = new bqx("textures/entity/enderdragon/dragon.png");
/*     */   protected biq a;
/*     */   
/*     */   public bnl()
/*     */   {
/*  25 */     super(new biq(0.0F), 0.5F);
/*     */     
/*  27 */     this.a = ((biq)this.i);
/*  28 */     a(this.i);
/*     */   }
/*     */   
/*     */   protected void a(xa paramxa, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  33 */     float f1 = (float)paramxa.b(7, paramFloat3)[0];
/*  34 */     float f2 = (float)(paramxa.b(5, paramFloat3)[1] - paramxa.b(10, paramFloat3)[1]);
/*  35 */     GL11.glRotatef(-f1, 0.0F, 1.0F, 0.0F);
/*  36 */     GL11.glRotatef(f2 * 10.0F, 1.0F, 0.0F, 0.0F);
/*  37 */     GL11.glTranslatef(0.0F, 0.0F, 1.0F);
/*  38 */     if (paramxa.aA > 0) {
/*  39 */       float f3 = (paramxa.aA + paramFloat3 - 1.0F) / 20.0F * 1.6F;
/*  40 */       f3 = qh.c(f3);
/*  41 */       if (f3 > 1.0F) f3 = 1.0F;
/*  42 */       GL11.glRotatef(f3 * a(paramxa), 0.0F, 0.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(xa paramxa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  48 */     if (paramxa.bB > 0) {
/*  49 */       float f1 = paramxa.bB / 200.0F;
/*  50 */       GL11.glDepthFunc(515);
/*  51 */       GL11.glEnable(3008);
/*  52 */       GL11.glAlphaFunc(516, f1);
/*  53 */       a(f);
/*  54 */       this.i.a(paramxa, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  55 */       GL11.glAlphaFunc(516, 0.1F);
/*     */       
/*  57 */       GL11.glDepthFunc(514);
/*     */     }
/*     */     
/*  60 */     b(paramxa);
/*  61 */     this.i.a(paramxa, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*     */     
/*  63 */     if (paramxa.ax > 0) {
/*  64 */       GL11.glDepthFunc(514);
/*  65 */       GL11.glDisable(3553);
/*  66 */       GL11.glEnable(3042);
/*  67 */       GL11.glBlendFunc(770, 771);
/*  68 */       GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
/*  69 */       this.i.a(paramxa, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  70 */       GL11.glEnable(3553);
/*  71 */       GL11.glDisable(3042);
/*  72 */       GL11.glDepthFunc(515);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(xa paramxa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  78 */     bln.a(paramxa, false);
/*  79 */     super.a(paramxa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  80 */     if (paramxa.bC != null) {
/*  81 */       float f1 = paramxa.bC.a + paramFloat2;
/*  82 */       float f2 = qh.a(f1 * 0.2F) / 2.0F + 0.5F;
/*  83 */       f2 = (f2 * f2 + f2) * 0.2F;
/*     */       
/*  85 */       float f3 = (float)(paramxa.bC.s - paramxa.s - (paramxa.p - paramxa.s) * (1.0F - paramFloat2));
/*  86 */       float f4 = (float)(f2 + paramxa.bC.t - 1.0D - paramxa.t - (paramxa.q - paramxa.t) * (1.0F - paramFloat2));
/*  87 */       float f5 = (float)(paramxa.bC.u - paramxa.u - (paramxa.r - paramxa.u) * (1.0F - paramFloat2));
/*     */       
/*  89 */       float f6 = qh.c(f3 * f3 + f5 * f5);
/*  90 */       float f7 = qh.c(f3 * f3 + f4 * f4 + f5 * f5);
/*     */       
/*  92 */       GL11.glPushMatrix();
/*  93 */       GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + 2.0F, (float)paramDouble3);
/*  94 */       GL11.glRotatef((float)-Math.atan2(f5, f3) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
/*  95 */       GL11.glRotatef((float)-Math.atan2(f6, f4) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
/*  96 */       bmh localbmh = bmh.a;
/*  97 */       bam.a();
/*  98 */       GL11.glDisable(2884);
/*     */       
/* 100 */       a(g);
/*     */       
/* 102 */       GL11.glShadeModel(7425);
/*     */       
/* 104 */       float f8 = 0.0F - (paramxa.aa + paramFloat2) * 0.01F;
/* 105 */       float f9 = qh.c(f3 * f3 + f4 * f4 + f5 * f5) / 32.0F - (paramxa.aa + paramFloat2) * 0.01F;
/* 106 */       localbmh.a(5);
/*     */       
/* 108 */       int i = 8;
/* 109 */       for (int j = 0; j <= i; j++) {
/* 110 */         float f10 = qh.a(j % i * 3.1415927F * 2.0F / i) * 0.75F;
/* 111 */         float f11 = qh.b(j % i * 3.1415927F * 2.0F / i) * 0.75F;
/* 112 */         float f12 = j % i * 1.0F / i;
/* 113 */         localbmh.c(0);
/* 114 */         localbmh.a(f10 * 0.2F, f11 * 0.2F, 0.0D, f12, f9);
/* 115 */         localbmh.c(16777215);
/* 116 */         localbmh.a(f10, f11, f7, f12, f8);
/*     */       }
/*     */       
/* 119 */       localbmh.a();
/* 120 */       GL11.glEnable(2884);
/* 121 */       GL11.glShadeModel(7424);
/*     */       
/* 123 */       bam.b();
/* 124 */       GL11.glPopMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */   protected bqx a(xa paramxa)
/*     */   {
/* 130 */     return k;
/*     */   }
/*     */   
/*     */   protected void a(xa paramxa, float paramFloat)
/*     */   {
/* 135 */     super.c(paramxa, paramFloat);
/* 136 */     bmh localbmh = bmh.a;
/*     */     
/* 138 */     if (paramxa.bB > 0) {
/* 139 */       bam.a();
/* 140 */       float f1 = (paramxa.bB + paramFloat) / 200.0F;
/* 141 */       float f2 = 0.0F;
/* 142 */       if (f1 > 0.8F) {
/* 143 */         f2 = (f1 - 0.8F) / 0.2F;
/*     */       }
/*     */       
/* 146 */       Random localRandom = new Random(432L);
/* 147 */       GL11.glDisable(3553);
/* 148 */       GL11.glShadeModel(7425);
/* 149 */       GL11.glEnable(3042);
/* 150 */       GL11.glBlendFunc(770, 1);
/* 151 */       GL11.glDisable(3008);
/* 152 */       GL11.glEnable(2884);
/* 153 */       GL11.glDepthMask(false);
/* 154 */       GL11.glPushMatrix();
/* 155 */       GL11.glTranslatef(0.0F, -1.0F, -2.0F);
/* 156 */       for (int i = 0; i < (f1 + f1 * f1) / 2.0F * 60.0F; i++) {
/* 157 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
/* 158 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
/* 159 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
/* 160 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
/* 161 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
/* 162 */         GL11.glRotatef(localRandom.nextFloat() * 360.0F + f1 * 90.0F, 0.0F, 0.0F, 1.0F);
/* 163 */         localbmh.a(6);
/* 164 */         float f3 = localRandom.nextFloat() * 20.0F + 5.0F + f2 * 10.0F;
/* 165 */         float f4 = localRandom.nextFloat() * 2.0F + 1.0F + f2 * 2.0F;
/* 166 */         localbmh.a(16777215, (int)(255.0F * (1.0F - f2)));
/* 167 */         localbmh.a(0.0D, 0.0D, 0.0D);
/* 168 */         localbmh.a(16711935, 0);
/* 169 */         localbmh.a(-0.866D * f4, f3, -0.5F * f4);
/* 170 */         localbmh.a(0.866D * f4, f3, -0.5F * f4);
/* 171 */         localbmh.a(0.0D, f3, 1.0F * f4);
/* 172 */         localbmh.a(-0.866D * f4, f3, -0.5F * f4);
/* 173 */         localbmh.a();
/*     */       }
/* 175 */       GL11.glPopMatrix();
/* 176 */       GL11.glDepthMask(true);
/* 177 */       GL11.glDisable(2884);
/* 178 */       GL11.glDisable(3042);
/* 179 */       GL11.glShadeModel(7424);
/* 180 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 181 */       GL11.glEnable(3553);
/* 182 */       GL11.glEnable(3008);
/* 183 */       bam.b();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected int a(xa paramxa, int paramInt, float paramFloat)
/*     */   {
/* 190 */     if (paramInt == 1) {
/* 191 */       GL11.glDepthFunc(515);
/*     */     }
/* 193 */     if (paramInt != 0) { return -1;
/*     */     }
/* 195 */     a(h);
/* 196 */     GL11.glEnable(3042);
/* 197 */     GL11.glDisable(3008);
/* 198 */     GL11.glBlendFunc(1, 1);
/* 199 */     GL11.glDisable(2896);
/* 200 */     GL11.glDepthFunc(514);
/*     */     
/* 202 */     int i = 61680;
/* 203 */     int j = i % 65536;
/* 204 */     int m = i / 65536;
/*     */     
/* 206 */     buu.a(buu.c, j / 1.0F, m / 1.0F);
/*     */     
/* 208 */     GL11.glEnable(2896);
/* 209 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 210 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */