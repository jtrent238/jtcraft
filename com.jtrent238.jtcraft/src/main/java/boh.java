/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class boh
/*     */   extends bno
/*     */ {
/*  23 */   private static final Logger a = ;
/*  24 */   private static final bqx f = new bqx("textures/misc/enchanted_item_glint.png");
/*     */   
/*     */   protected bhr i;
/*     */   protected bhr j;
/*     */   
/*     */   public boh(bhr parambhr, float paramFloat)
/*     */   {
/*  31 */     this.i = parambhr;
/*  32 */     this.d = paramFloat;
/*     */   }
/*     */   
/*     */   public void a(bhr parambhr) {
/*  36 */     this.j = parambhr;
/*     */   }
/*     */   
/*     */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  40 */     float f1 = paramFloat2 - paramFloat1;
/*  41 */     while (f1 < -180.0F)
/*  42 */       f1 += 360.0F;
/*  43 */     while (f1 >= 180.0F)
/*  44 */       f1 -= 360.0F;
/*  45 */     return paramFloat1 + paramFloat3 * f1;
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  50 */     GL11.glPushMatrix();
/*  51 */     GL11.glDisable(2884);
/*     */     
/*  53 */     this.i.p = d(paramsv, paramFloat2);
/*  54 */     if (this.j != null) this.j.p = this.i.p;
/*  55 */     this.i.q = paramsv.am();
/*  56 */     if (this.j != null) this.j.q = this.i.q;
/*  57 */     this.i.s = paramsv.f();
/*  58 */     if (this.j != null) { this.j.s = this.i.s;
/*     */     }
/*     */     try
/*     */     {
/*  62 */       float f1 = a(paramsv.aN, paramsv.aM, paramFloat2);
/*  63 */       float f2 = a(paramsv.aP, paramsv.aO, paramFloat2);
/*     */       
/*  65 */       if ((paramsv.am()) && ((paramsv.m instanceof sv))) {
/*  66 */         sv localsv = (sv)paramsv.m;
/*  67 */         f1 = a(localsv.aN, localsv.aM, paramFloat2);
/*     */         
/*  69 */         f4 = qh.g(f2 - f1);
/*  70 */         if (f4 < -85.0F) f4 = -85.0F;
/*  71 */         if (f4 >= 85.0F) f4 = 85.0F;
/*  72 */         f1 = f2 - f4;
/*  73 */         if (f4 * f4 > 2500.0F) {
/*  74 */           f1 += f4 * 0.2F;
/*     */         }
/*     */       }
/*     */       
/*  78 */       float f3 = paramsv.B + (paramsv.z - paramsv.B) * paramFloat2;
/*     */       
/*  80 */       a(paramsv, paramDouble1, paramDouble2, paramDouble3);
/*     */       
/*  82 */       float f4 = b(paramsv, paramFloat2);
/*  83 */       a(paramsv, f4, f1, paramFloat2);
/*     */       
/*  85 */       float f5 = 0.0625F;
/*  86 */       GL11.glEnable(32826);
/*  87 */       GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*     */       
/*  89 */       a(paramsv, paramFloat2);
/*  90 */       GL11.glTranslatef(0.0F, -24.0F * f5 - 0.0078125F, 0.0F);
/*     */       
/*  92 */       float f6 = paramsv.aE + (paramsv.aF - paramsv.aE) * paramFloat2;
/*  93 */       float f7 = paramsv.aG - paramsv.aF * (1.0F - paramFloat2);
/*  94 */       if (paramsv.f()) {
/*  95 */         f7 *= 3.0F;
/*     */       }
/*     */       
/*  98 */       if (f6 > 1.0F) { f6 = 1.0F;
/*     */       }
/* 100 */       GL11.glEnable(3008);
/* 101 */       this.i.a(paramsv, f7, f6, paramFloat2);
/* 102 */       a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/*     */       float f11;
/* 104 */       float f13; for (int k = 0; k < 4; k++) {
/* 105 */         m = a(paramsv, k, paramFloat2);
/* 106 */         if (m > 0) {
/* 107 */           this.j.a(paramsv, f7, f6, paramFloat2);
/* 108 */           this.j.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/* 109 */           if ((m & 0xF0) == 16) {
/* 110 */             c(paramsv, k, paramFloat2);
/* 111 */             this.j.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/*     */           }
/* 113 */           if ((m & 0xF) == 15)
/*     */           {
/* 115 */             float f9 = paramsv.aa + paramFloat2;
/* 116 */             a(f);
/* 117 */             GL11.glEnable(3042);
/* 118 */             f11 = 0.5F;
/* 119 */             GL11.glColor4f(f11, f11, f11, 1.0F);
/* 120 */             GL11.glDepthFunc(514);
/* 121 */             GL11.glDepthMask(false);
/*     */             
/* 123 */             for (int i1 = 0; i1 < 2; i1++) {
/* 124 */               GL11.glDisable(2896);
/* 125 */               f13 = 0.76F;
/* 126 */               GL11.glColor4f(0.5F * f13, 0.25F * f13, 0.8F * f13, 1.0F);
/* 127 */               GL11.glBlendFunc(768, 1);
/* 128 */               GL11.glMatrixMode(5890);
/* 129 */               GL11.glLoadIdentity();
/* 130 */               float f14 = f9 * (0.001F + i1 * 0.003F) * 20.0F;
/* 131 */               float f15 = 0.33333334F;
/* 132 */               GL11.glScalef(f15, f15, f15);
/* 133 */               GL11.glRotatef(30.0F - i1 * 60.0F, 0.0F, 0.0F, 1.0F);
/* 134 */               GL11.glTranslatef(0.0F, f14, 0.0F);
/* 135 */               GL11.glMatrixMode(5888);
/* 136 */               this.j.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/*     */             }
/*     */             
/* 139 */             GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 140 */             GL11.glMatrixMode(5890);
/* 141 */             GL11.glDepthMask(true);
/* 142 */             GL11.glLoadIdentity();
/* 143 */             GL11.glMatrixMode(5888);
/* 144 */             GL11.glEnable(2896);
/* 145 */             GL11.glDisable(3042);
/* 146 */             GL11.glDepthFunc(515);
/*     */           }
/*     */           
/* 149 */           GL11.glDisable(3042);
/* 150 */           GL11.glEnable(3008);
/*     */         }
/*     */       }
/* 153 */       GL11.glDepthMask(true);
/*     */       
/* 155 */       c(paramsv, paramFloat2);
/* 156 */       float f8 = paramsv.d(paramFloat2);
/* 157 */       int m = a(paramsv, f8, paramFloat2);
/* 158 */       buu.j(buu.c);
/* 159 */       GL11.glDisable(3553);
/* 160 */       buu.j(buu.b);
/*     */       
/* 162 */       if (((m >> 24 & 0xFF) > 0) || (paramsv.ax > 0) || (paramsv.aA > 0)) {
/* 163 */         GL11.glDisable(3553);
/* 164 */         GL11.glDisable(3008);
/* 165 */         GL11.glEnable(3042);
/* 166 */         GL11.glBlendFunc(770, 771);
/* 167 */         GL11.glDepthFunc(514);
/*     */         
/* 169 */         if ((paramsv.ax > 0) || (paramsv.aA > 0)) {
/* 170 */           GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
/* 171 */           this.i.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/* 172 */           for (int n = 0; n < 4; n++) {
/* 173 */             if (b(paramsv, n, paramFloat2) >= 0) {
/* 174 */               GL11.glColor4f(f8, 0.0F, 0.0F, 0.4F);
/* 175 */               this.j.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 180 */         if ((m >> 24 & 0xFF) > 0) {
/* 181 */           float f10 = (m >> 16 & 0xFF) / 255.0F;
/* 182 */           f11 = (m >> 8 & 0xFF) / 255.0F;
/* 183 */           float f12 = (m & 0xFF) / 255.0F;
/* 184 */           f13 = (m >> 24 & 0xFF) / 255.0F;
/* 185 */           GL11.glColor4f(f10, f11, f12, f13);
/* 186 */           this.i.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/* 187 */           for (int i2 = 0; i2 < 4; i2++) {
/* 188 */             if (b(paramsv, i2, paramFloat2) >= 0) {
/* 189 */               GL11.glColor4f(f10, f11, f12, f13);
/* 190 */               this.j.a(paramsv, f7, f6, f4, f2 - f1, f3, f5);
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 195 */         GL11.glDepthFunc(515);
/* 196 */         GL11.glDisable(3042);
/* 197 */         GL11.glEnable(3008);
/* 198 */         GL11.glEnable(3553);
/*     */       }
/* 200 */       GL11.glDisable(32826);
/*     */     } catch (Exception localException) {
/* 202 */       a.error("Couldn't render entity", localException);
/*     */     }
/* 204 */     buu.j(buu.c);
/* 205 */     GL11.glEnable(3553);
/* 206 */     buu.j(buu.b);
/* 207 */     GL11.glEnable(2884);
/*     */     
/* 209 */     GL11.glPopMatrix();
/*     */     
/* 211 */     b(paramsv, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   protected void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 215 */     b(paramsv);
/* 216 */     if (!paramsv.ap()) {
/* 217 */       this.i.a(paramsv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 218 */     } else if (!paramsv.d(bao.B().h)) {
/* 219 */       GL11.glPushMatrix();
/* 220 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
/* 221 */       GL11.glDepthMask(false);
/* 222 */       GL11.glEnable(3042);
/* 223 */       GL11.glBlendFunc(770, 771);
/* 224 */       GL11.glAlphaFunc(516, 0.003921569F);
/* 225 */       this.i.a(paramsv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/* 226 */       GL11.glDisable(3042);
/* 227 */       GL11.glAlphaFunc(516, 0.1F);
/* 228 */       GL11.glPopMatrix();
/* 229 */       GL11.glDepthMask(true);
/*     */     } else {
/* 231 */       this.i.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsv);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 236 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*     */   }
/*     */   
/*     */   protected void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 241 */     GL11.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
/* 242 */     if (paramsv.aA > 0) {
/* 243 */       float f1 = (paramsv.aA + paramFloat3 - 1.0F) / 20.0F * 1.6F;
/* 244 */       f1 = qh.c(f1);
/* 245 */       if (f1 > 1.0F) f1 = 1.0F;
/* 246 */       GL11.glRotatef(f1 * a(paramsv), 0.0F, 0.0F, 1.0F);
/*     */     } else {
/* 248 */       String str = a.a(paramsv.b_());
/* 249 */       if (((str.equals("Dinnerbone")) || (str.equals("Grumm"))) && (
/* 250 */         (!(paramsv instanceof yz)) || (!((yz)paramsv).bT()))) {
/* 251 */         GL11.glTranslatef(0.0F, paramsv.N + 0.1F, 0.0F);
/* 252 */         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected float d(sv paramsv, float paramFloat)
/*     */   {
/* 259 */     return paramsv.k(paramFloat);
/*     */   }
/*     */   
/*     */   protected float b(sv paramsv, float paramFloat) {
/* 263 */     return paramsv.aa + paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c(sv paramsv, float paramFloat) {}
/*     */   
/*     */   protected void e(sv paramsv, float paramFloat)
/*     */   {
/* 271 */     int k = paramsv.aZ();
/* 272 */     if (k > 0) {
/* 273 */       zc localzc = new zc(paramsv.o, paramsv.s, paramsv.t, paramsv.u);
/* 274 */       Random localRandom = new Random(paramsv.y());
/* 275 */       bam.a();
/* 276 */       for (int m = 0; m < k; m++) {
/* 277 */         GL11.glPushMatrix();
/* 278 */         bix localbix = this.i.a(localRandom);
/* 279 */         bis localbis = (bis)localbix.l.get(localRandom.nextInt(localbix.l.size()));
/* 280 */         localbix.c(0.0625F);
/* 281 */         float f1 = localRandom.nextFloat();
/* 282 */         float f2 = localRandom.nextFloat();
/* 283 */         float f3 = localRandom.nextFloat();
/* 284 */         float f4 = (localbis.a + (localbis.d - localbis.a) * f1) / 16.0F;
/* 285 */         float f5 = (localbis.b + (localbis.e - localbis.b) * f2) / 16.0F;
/* 286 */         float f6 = (localbis.c + (localbis.f - localbis.c) * f3) / 16.0F;
/* 287 */         GL11.glTranslatef(f4, f5, f6);
/* 288 */         f1 = f1 * 2.0F - 1.0F;
/* 289 */         f2 = f2 * 2.0F - 1.0F;
/* 290 */         f3 = f3 * 2.0F - 1.0F;
/*     */         
/* 292 */         f1 *= -1.0F;
/* 293 */         f2 *= -1.0F;
/* 294 */         f3 *= -1.0F;
/*     */         
/* 296 */         float f7 = qh.c(f1 * f1 + f3 * f3);
/* 297 */         localzc.A = (localzc.y = (float)(Math.atan2(f1, f3) * 180.0D / 3.1415927410125732D));
/* 298 */         localzc.B = (localzc.z = (float)(Math.atan2(f2, f7) * 180.0D / 3.1415927410125732D));
/* 299 */         double d1 = 0.0D;
/* 300 */         double d2 = 0.0D;
/* 301 */         double d3 = 0.0D;
/* 302 */         float f8 = 0.0F;
/* 303 */         this.b.a(localzc, d1, d2, d3, f8, paramFloat);
/* 304 */         GL11.glPopMatrix();
/*     */       }
/* 306 */       bam.b();
/*     */     }
/*     */   }
/*     */   
/*     */   protected int b(sv paramsv, int paramInt, float paramFloat)
/*     */   {
/* 312 */     return a(paramsv, paramInt, paramFloat);
/*     */   }
/*     */   
/*     */   protected int a(sv paramsv, int paramInt, float paramFloat) {
/* 316 */     return -1;
/*     */   }
/*     */   
/*     */   protected void c(sv paramsv, int paramInt, float paramFloat) {}
/*     */   
/*     */   protected float a(sv paramsv)
/*     */   {
/* 323 */     return 90.0F;
/*     */   }
/*     */   
/*     */   protected int a(sv paramsv, float paramFloat1, float paramFloat2) {
/* 327 */     return 0;
/*     */   }
/*     */   
/*     */   protected void a(sv paramsv, float paramFloat) {}
/*     */   
/*     */   protected void b(sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 334 */     GL11.glAlphaFunc(516, 0.1F);
/* 335 */     if (b(paramsv)) {
/* 336 */       float f1 = 1.6F;
/* 337 */       float f2 = 0.016666668F * f1;
/* 338 */       double d = paramsv.f(this.b.h);
/*     */       
/* 340 */       float f3 = paramsv.an() ? 32.0F : 64.0F;
/*     */       
/* 342 */       if (d < f3 * f3) {
/* 343 */         String str = paramsv.c_().d();
/*     */         
/* 345 */         if (paramsv.an()) {
/* 346 */           bbu localbbu = c();
/* 347 */           GL11.glPushMatrix();
/* 348 */           GL11.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + paramsv.N + 0.5F, (float)paramDouble3);
/* 349 */           GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/*     */           
/* 351 */           GL11.glRotatef(-this.b.j, 0.0F, 1.0F, 0.0F);
/* 352 */           GL11.glRotatef(this.b.k, 1.0F, 0.0F, 0.0F);
/*     */           
/* 354 */           GL11.glScalef(-f2, -f2, f2);
/* 355 */           GL11.glDisable(2896);
/*     */           
/* 357 */           GL11.glTranslatef(0.0F, 0.25F / f2, 0.0F);
/* 358 */           GL11.glDepthMask(false);
/* 359 */           GL11.glEnable(3042);
/* 360 */           buu.c(770, 771, 1, 0);
/* 361 */           bmh localbmh = bmh.a;
/*     */           
/* 363 */           GL11.glDisable(3553);
/* 364 */           localbmh.b();
/* 365 */           int k = localbbu.a(str) / 2;
/* 366 */           localbmh.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 367 */           localbmh.a(-k - 1, -1.0D, 0.0D);
/* 368 */           localbmh.a(-k - 1, 8.0D, 0.0D);
/* 369 */           localbmh.a(k + 1, 8.0D, 0.0D);
/* 370 */           localbmh.a(k + 1, -1.0D, 0.0D);
/* 371 */           localbmh.a();
/* 372 */           GL11.glEnable(3553);
/* 373 */           GL11.glDepthMask(true);
/* 374 */           localbbu.b(str, -localbbu.a(str) / 2, 0, 553648127);
/* 375 */           GL11.glEnable(2896);
/* 376 */           GL11.glDisable(3042);
/* 377 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 378 */           GL11.glPopMatrix();
/*     */         } else {
/* 380 */           a(paramsv, paramDouble1, paramDouble2, paramDouble3, str, f2, d);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean b(sv paramsv) {
/* 387 */     return (bao.w()) && (paramsv != this.b.h) && (!paramsv.d(bao.B().h)) && (paramsv.l == null);
/*     */   }
/*     */   
/*     */   protected void a(sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4) {
/* 391 */     if (paramsv.bm()) {
/* 392 */       a(paramsv, paramString, paramDouble1, paramDouble2 - 1.5D, paramDouble3, 64);
/*     */     } else {
/* 394 */       a(paramsv, paramString, paramDouble1, paramDouble2, paramDouble3, 64);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */