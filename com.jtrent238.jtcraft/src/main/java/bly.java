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
/*     */ public class bly
/*     */ {
/*  28 */   private static final bqx a = new bqx("textures/misc/enchanted_item_glint.png");
/*  29 */   private static final bqx b = new bqx("textures/map/map_background.png");
/*  30 */   private static final bqx c = new bqx("textures/misc/underwater.png");
/*     */   
/*     */   private bao d;
/*     */   private add e;
/*     */   private float f;
/*     */   private float g;
/*  36 */   private blm h = new blm();
/*     */   
/*     */   public bly(bao parambao) {
/*  39 */     this.d = parambao;
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, add paramadd, int paramInt) {
/*  43 */     GL11.glPushMatrix();
/*  44 */     bqf localbqf = this.d.P();
/*     */     
/*  46 */     adb localadb = paramadd.b();
/*  47 */     aji localaji = aji.a(localadb);
/*     */     
/*  49 */     if ((paramadd != null) && (localaji != null) && (localaji.w() != 0)) {
/*  50 */       GL11.glEnable(3042);
/*  51 */       GL11.glEnable(2884);
/*  52 */       buu.c(770, 771, 1, 0);
/*     */     }
/*     */     
/*  55 */     if ((paramadd.d() == 0) && ((localadb instanceof abh)) && (blm.a(localaji.b()))) {
/*  56 */       localbqf.a(localbqf.a(0));
/*  57 */       if ((paramadd != null) && (localaji != null) && (localaji.w() != 0)) {
/*  58 */         GL11.glDepthMask(false);
/*  59 */         this.h.a(localaji, paramadd.k(), 1.0F);
/*  60 */         GL11.glDepthMask(true);
/*     */       } else {
/*  62 */         this.h.a(localaji, paramadd.k(), 1.0F);
/*     */       }
/*     */     } else {
/*  65 */       rf localrf = paramsv.b(paramadd, paramInt);
/*  66 */       if (localrf == null) {
/*  67 */         GL11.glPopMatrix();
/*  68 */         return;
/*     */       }
/*     */       
/*  71 */       localbqf.a(localbqf.a(paramadd.d()));
/*  72 */       bqi.a(false, false, 1.0F);
/*     */       
/*  74 */       bmh localbmh = bmh.a;
/*     */       
/*     */ 
/*     */ 
/*  78 */       float f1 = localrf.c();
/*  79 */       float f2 = localrf.d();
/*  80 */       float f3 = localrf.e();
/*  81 */       float f4 = localrf.f();
/*     */       
/*  83 */       float f5 = 0.0F;
/*  84 */       float f6 = 0.3F;
/*     */       
/*  86 */       GL11.glEnable(32826);
/*  87 */       GL11.glTranslatef(-f5, -f6, 0.0F);
/*  88 */       float f7 = 1.5F;
/*  89 */       GL11.glScalef(f7, f7, f7);
/*     */       
/*  91 */       GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
/*  92 */       GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
/*  93 */       GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
/*     */       
/*  95 */       a(localbmh, f2, f3, f1, f4, localrf.a(), localrf.b(), 0.0625F);
/*     */       
/*  97 */       if ((paramadd.v()) && (paramInt == 0)) {
/*  98 */         GL11.glDepthFunc(514);
/*  99 */         GL11.glDisable(2896);
/* 100 */         localbqf.a(a);
/* 101 */         GL11.glEnable(3042);
/* 102 */         buu.c(768, 1, 1, 0);
/* 103 */         float f8 = 0.76F;
/* 104 */         GL11.glColor4f(0.5F * f8, 0.25F * f8, 0.8F * f8, 1.0F);
/* 105 */         GL11.glMatrixMode(5890);
/* 106 */         GL11.glPushMatrix();
/* 107 */         float f9 = 0.125F;
/* 108 */         GL11.glScalef(f9, f9, f9);
/* 109 */         float f10 = (float)(bao.K() % 3000L) / 3000.0F * 8.0F;
/* 110 */         GL11.glTranslatef(f10, 0.0F, 0.0F);
/* 111 */         GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
/*     */         
/* 113 */         a(localbmh, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
/* 114 */         GL11.glPopMatrix();
/* 115 */         GL11.glPushMatrix();
/* 116 */         GL11.glScalef(f9, f9, f9);
/* 117 */         f10 = (float)(bao.K() % 4873L) / 4873.0F * 8.0F;
/* 118 */         GL11.glTranslatef(-f10, 0.0F, 0.0F);
/* 119 */         GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
/* 120 */         a(localbmh, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
/* 121 */         GL11.glPopMatrix();
/* 122 */         GL11.glMatrixMode(5888);
/* 123 */         GL11.glDisable(3042);
/* 124 */         GL11.glEnable(2896);
/* 125 */         GL11.glDepthFunc(515);
/*     */       }
/*     */       
/* 128 */       GL11.glDisable(32826);
/* 129 */       localbqf.a(localbqf.a(paramadd.d()));
/* 130 */       bqi.b();
/*     */     }
/*     */     
/* 133 */     if ((paramadd != null) && (localaji != null) && (localaji.w() != 0)) {
/* 134 */       GL11.glDisable(3042);
/*     */     }
/*     */     
/* 137 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public static void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, float paramFloat5)
/*     */   {
/* 142 */     parambmh.b();
/* 143 */     parambmh.c(0.0F, 0.0F, 1.0F);
/* 144 */     parambmh.a(0.0D, 0.0D, 0.0D, paramFloat1, paramFloat4);
/* 145 */     parambmh.a(1.0D, 0.0D, 0.0D, paramFloat3, paramFloat4);
/* 146 */     parambmh.a(1.0D, 1.0D, 0.0D, paramFloat3, paramFloat2);
/* 147 */     parambmh.a(0.0D, 1.0D, 0.0D, paramFloat1, paramFloat2);
/* 148 */     parambmh.a();
/*     */     
/* 150 */     parambmh.b();
/* 151 */     parambmh.c(0.0F, 0.0F, -1.0F);
/* 152 */     parambmh.a(0.0D, 1.0D, 0.0F - paramFloat5, paramFloat1, paramFloat2);
/* 153 */     parambmh.a(1.0D, 1.0D, 0.0F - paramFloat5, paramFloat3, paramFloat2);
/* 154 */     parambmh.a(1.0D, 0.0D, 0.0F - paramFloat5, paramFloat3, paramFloat4);
/* 155 */     parambmh.a(0.0D, 0.0D, 0.0F - paramFloat5, paramFloat1, paramFloat4);
/* 156 */     parambmh.a();
/*     */     
/* 158 */     float f1 = 0.5F * (paramFloat1 - paramFloat3) / paramInt1;
/* 159 */     float f2 = 0.5F * (paramFloat4 - paramFloat2) / paramInt2;
/*     */     
/* 161 */     parambmh.b();
/* 162 */     parambmh.c(-1.0F, 0.0F, 0.0F);
/* 163 */     float f3; float f4; float f5; for (int j = 0; j < paramInt1; j++) {
/* 164 */       f3 = j / paramInt1;
/* 165 */       f4 = paramFloat1 + (paramFloat3 - paramFloat1) * f3 - f1;
/* 166 */       f5 = f3;
/* 167 */       parambmh.a(f5, 0.0D, 0.0F - paramFloat5, f4, paramFloat4);
/* 168 */       parambmh.a(f5, 0.0D, 0.0D, f4, paramFloat4);
/* 169 */       parambmh.a(f5, 1.0D, 0.0D, f4, paramFloat2);
/* 170 */       parambmh.a(f5, 1.0D, 0.0F - paramFloat5, f4, paramFloat2);
/*     */     }
/* 172 */     parambmh.a();
/*     */     
/* 174 */     parambmh.b();
/* 175 */     parambmh.c(1.0F, 0.0F, 0.0F);
/* 176 */     for (j = 0; j < paramInt1; j++) {
/* 177 */       f3 = j / paramInt1;
/* 178 */       f4 = paramFloat1 + (paramFloat3 - paramFloat1) * f3 - f1;
/* 179 */       f5 = f3 + 1.0F / paramInt1;
/* 180 */       parambmh.a(f5, 1.0D, 0.0F - paramFloat5, f4, paramFloat2);
/* 181 */       parambmh.a(f5, 1.0D, 0.0D, f4, paramFloat2);
/* 182 */       parambmh.a(f5, 0.0D, 0.0D, f4, paramFloat4);
/* 183 */       parambmh.a(f5, 0.0D, 0.0F - paramFloat5, f4, paramFloat4);
/*     */     }
/* 185 */     parambmh.a();
/*     */     
/* 187 */     parambmh.b();
/* 188 */     parambmh.c(0.0F, 1.0F, 0.0F);
/* 189 */     for (j = 0; j < paramInt2; j++) {
/* 190 */       f3 = j / paramInt2;
/* 191 */       f4 = paramFloat4 + (paramFloat2 - paramFloat4) * f3 - f2;
/* 192 */       f5 = f3 + 1.0F / paramInt2;
/* 193 */       parambmh.a(0.0D, f5, 0.0D, paramFloat1, f4);
/* 194 */       parambmh.a(1.0D, f5, 0.0D, paramFloat3, f4);
/* 195 */       parambmh.a(1.0D, f5, 0.0F - paramFloat5, paramFloat3, f4);
/* 196 */       parambmh.a(0.0D, f5, 0.0F - paramFloat5, paramFloat1, f4);
/*     */     }
/* 198 */     parambmh.a();
/*     */     
/* 200 */     parambmh.b();
/* 201 */     parambmh.c(0.0F, -1.0F, 0.0F);
/* 202 */     for (j = 0; j < paramInt2; j++) {
/* 203 */       f3 = j / paramInt2;
/* 204 */       f4 = paramFloat4 + (paramFloat2 - paramFloat4) * f3 - f2;
/* 205 */       f5 = f3;
/* 206 */       parambmh.a(1.0D, f5, 0.0D, paramFloat3, f4);
/* 207 */       parambmh.a(0.0D, f5, 0.0D, paramFloat1, f4);
/* 208 */       parambmh.a(0.0D, f5, 0.0F - paramFloat5, paramFloat1, f4);
/* 209 */       parambmh.a(1.0D, f5, 0.0F - paramFloat5, paramFloat3, f4);
/*     */     }
/* 211 */     parambmh.a();
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 215 */     float f1 = this.g + (this.f - this.g) * paramFloat;
/* 216 */     bjk localbjk = this.d.h;
/*     */     
/* 218 */     float f2 = localbjk.B + (localbjk.z - localbjk.B) * paramFloat;
/*     */     
/* 220 */     GL11.glPushMatrix();
/* 221 */     GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
/* 222 */     GL11.glRotatef(localbjk.A + (localbjk.y - localbjk.A) * paramFloat, 0.0F, 1.0F, 0.0F);
/* 223 */     bam.b();
/* 224 */     GL11.glPopMatrix();
/*     */     
/* 226 */     blk localblk = (blk)localbjk;
/* 227 */     float f3 = localblk.bL + (localblk.h - localblk.bL) * paramFloat;
/* 228 */     float f4 = localblk.i + (localblk.g - localblk.i) * paramFloat;
/* 229 */     GL11.glRotatef((localbjk.z - f3) * 0.1F, 1.0F, 0.0F, 0.0F);
/* 230 */     GL11.glRotatef((localbjk.y - f4) * 0.1F, 0.0F, 1.0F, 0.0F);
/*     */     
/* 232 */     add localadd = this.e;
/*     */     
/* 234 */     if ((localadd != null) && ((localadd.b() instanceof aek))) {
/* 235 */       GL11.glEnable(3042);
/* 236 */       buu.c(770, 771, 1, 0);
/*     */     }
/*     */     
/* 239 */     int j = this.d.f.c(qh.c(localbjk.s), qh.c(localbjk.t), qh.c(localbjk.u), 0);
/* 240 */     int k = j % 65536;
/* 241 */     int m = j / 65536;
/* 242 */     buu.a(buu.c, k / 1.0F, m / 1.0F);
/* 243 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 244 */     float f6; float f8; float f10; if (localadd != null) {
/* 245 */       int n = localadd.b().a(localadd, 0);
/* 246 */       f6 = (n >> 16 & 0xFF) / 255.0F;
/* 247 */       f8 = (n >> 8 & 0xFF) / 255.0F;
/* 248 */       f10 = (n & 0xFF) / 255.0F;
/*     */       
/* 250 */       GL11.glColor4f(f6, f8, f10, 1.0F);
/*     */     }
/*     */     else {
/* 253 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); }
/*     */     float f5;
/*     */     float f14;
/* 256 */     float f9; float f11; float f12; float f13; if ((localadd != null) && (localadd.b() == ade.aY)) {
/* 257 */       GL11.glPushMatrix();
/* 258 */       f5 = 0.8F;
/*     */       
/*     */ 
/* 261 */       f6 = localbjk.k(paramFloat);
/*     */       
/* 263 */       f8 = qh.a(f6 * 3.1415927F);
/* 264 */       f10 = qh.a(qh.c(f6) * 3.1415927F);
/* 265 */       GL11.glTranslatef(-f10 * 0.4F, qh.a(qh.c(f6) * 3.1415927F * 2.0F) * 0.2F, -f8 * 0.2F);
/*     */       
/*     */ 
/* 268 */       f6 = 1.0F - f2 / 45.0F + 0.1F;
/* 269 */       if (f6 < 0.0F) f6 = 0.0F;
/* 270 */       if (f6 > 1.0F) f6 = 1.0F;
/* 271 */       f6 = -qh.b(f6 * 3.1415927F) * 0.5F + 0.5F;
/*     */       
/* 273 */       GL11.glTranslatef(0.0F, 0.0F * f5 - (1.0F - f1) * 1.2F - f6 * 0.5F + 0.04F, -0.9F * f5);
/*     */       
/* 275 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 276 */       GL11.glRotatef(f6 * -85.0F, 0.0F, 0.0F, 1.0F);
/* 277 */       GL11.glEnable(32826);
/*     */       
/*     */ 
/* 280 */       this.d.P().a(localbjk.r());
/* 281 */       for (int i1 = 0; i1 < 2; i1++) {
/* 282 */         int i2 = i1 * 2 - 1;
/* 283 */         GL11.glPushMatrix();
/*     */         
/* 285 */         GL11.glTranslatef(-0.0F, -0.6F, 1.1F * i2);
/* 286 */         GL11.glRotatef(-45 * i2, 1.0F, 0.0F, 0.0F);
/* 287 */         GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
/* 288 */         GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
/* 289 */         GL11.glRotatef(-65 * i2, 0.0F, 1.0F, 0.0F);
/*     */         
/* 291 */         bno localbno1 = bnn.a.a(this.d.h);
/* 292 */         bop localbop1 = (bop)localbno1;
/* 293 */         f14 = 1.0F;
/* 294 */         GL11.glScalef(f14, f14, f14);
/* 295 */         localbop1.a(this.d.h);
/* 296 */         GL11.glPopMatrix();
/*     */       }
/*     */       
/* 299 */       f9 = localbjk.k(paramFloat);
/* 300 */       f11 = qh.a(f9 * f9 * 3.1415927F);
/* 301 */       f12 = qh.a(qh.c(f9) * 3.1415927F);
/* 302 */       GL11.glRotatef(-f11 * 20.0F, 0.0F, 1.0F, 0.0F);
/* 303 */       GL11.glRotatef(-f12 * 20.0F, 0.0F, 0.0F, 1.0F);
/* 304 */       GL11.glRotatef(-f12 * 80.0F, 1.0F, 0.0F, 0.0F);
/*     */       
/* 306 */       f13 = 0.38F;
/* 307 */       GL11.glScalef(f13, f13, f13);
/*     */       
/* 309 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 310 */       GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*     */       
/* 312 */       GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
/*     */       
/* 314 */       f14 = 0.015625F;
/* 315 */       GL11.glScalef(f14, f14, f14);
/*     */       
/* 317 */       this.d.P().a(b);
/* 318 */       bmh localbmh = bmh.a;
/*     */       
/* 320 */       GL11.glNormal3f(0.0F, 0.0F, -1.0F);
/* 321 */       localbmh.b();
/* 322 */       int i4 = 7;
/* 323 */       localbmh.a(0 - i4, 128 + i4, 0.0D, 0.0D, 1.0D);
/* 324 */       localbmh.a(128 + i4, 128 + i4, 0.0D, 1.0D, 1.0D);
/* 325 */       localbmh.a(128 + i4, 0 - i4, 0.0D, 1.0D, 0.0D);
/* 326 */       localbmh.a(0 - i4, 0 - i4, 0.0D, 0.0D, 0.0D);
/* 327 */       localbmh.a();
/*     */       
/* 329 */       ayi localayi = ade.aY.a(localadd, this.d.f);
/* 330 */       if (localayi != null) { this.d.p.i().a(localayi, false);
/*     */       }
/* 332 */       GL11.glPopMatrix(); } else { float f7;
/* 333 */       if (localadd != null) {
/* 334 */         GL11.glPushMatrix();
/* 335 */         f5 = 0.8F;
/*     */         
/* 337 */         if (localbjk.bx() > 0) {
/* 338 */           aei localaei1 = localadd.o();
/* 339 */           if ((localaei1 == aei.b) || (localaei1 == aei.c)) {
/* 340 */             f9 = localbjk.bx() - paramFloat + 1.0F;
/*     */             
/* 342 */             f11 = 1.0F - f9 / localadd.n();
/* 343 */             f12 = 1.0F - f11;
/* 344 */             f12 = f12 * f12 * f12;
/* 345 */             f12 = f12 * f12 * f12;
/* 346 */             f12 = f12 * f12 * f12;
/* 347 */             f13 = 1.0F - f12;
/* 348 */             GL11.glTranslatef(0.0F, qh.e(qh.b(f9 / 4.0F * 3.1415927F) * 0.1F) * (f11 > 0.2D ? 1 : 0), 0.0F);
/* 349 */             GL11.glTranslatef(f13 * 0.6F, -f13 * 0.5F, 0.0F);
/* 350 */             GL11.glRotatef(f13 * 90.0F, 0.0F, 1.0F, 0.0F);
/* 351 */             GL11.glRotatef(f13 * 10.0F, 1.0F, 0.0F, 0.0F);
/* 352 */             GL11.glRotatef(f13 * 30.0F, 0.0F, 0.0F, 1.0F);
/*     */           }
/*     */         }
/*     */         else {
/* 356 */           f7 = localbjk.k(paramFloat);
/*     */           
/* 358 */           f9 = qh.a(f7 * 3.1415927F);
/* 359 */           f11 = qh.a(qh.c(f7) * 3.1415927F);
/* 360 */           GL11.glTranslatef(-f11 * 0.4F, qh.a(qh.c(f7) * 3.1415927F * 2.0F) * 0.2F, -f9 * 0.2F);
/*     */         }
/*     */         
/* 363 */         GL11.glTranslatef(0.7F * f5, -0.65F * f5 - (1.0F - f1) * 0.6F, -0.9F * f5);
/*     */         
/* 365 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 366 */         GL11.glEnable(32826);
/* 367 */         f7 = localbjk.k(paramFloat);
/* 368 */         f9 = qh.a(f7 * f7 * 3.1415927F);
/* 369 */         f11 = qh.a(qh.c(f7) * 3.1415927F);
/* 370 */         GL11.glRotatef(-f9 * 20.0F, 0.0F, 1.0F, 0.0F);
/* 371 */         GL11.glRotatef(-f11 * 20.0F, 0.0F, 0.0F, 1.0F);
/* 372 */         GL11.glRotatef(-f11 * 80.0F, 1.0F, 0.0F, 0.0F);
/* 373 */         f12 = 0.4F;
/* 374 */         GL11.glScalef(f12, f12, f12);
/* 375 */         float f15; float f16; if (localbjk.bx() > 0) {
/* 376 */           aei localaei2 = localadd.o();
/* 377 */           if (localaei2 == aei.d) {
/* 378 */             GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
/* 379 */             GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
/* 380 */             GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
/* 381 */             GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
/*     */           }
/* 383 */           else if (localaei2 == aei.e)
/*     */           {
/* 385 */             GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
/* 386 */             GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
/* 387 */             GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
/* 388 */             GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
/* 389 */             f14 = localadd.n() - (localbjk.bx() - paramFloat + 1.0F);
/* 390 */             f15 = f14 / 20.0F;
/* 391 */             f15 = (f15 * f15 + f15 * 2.0F) / 3.0F;
/* 392 */             if (f15 > 1.0F) f15 = 1.0F;
/* 393 */             if (f15 > 0.1F) {
/* 394 */               GL11.glTranslatef(0.0F, qh.a((f14 - 0.1F) * 1.3F) * 0.01F * (f15 - 0.1F), 0.0F);
/*     */             }
/* 396 */             GL11.glTranslatef(0.0F, 0.0F, f15 * 0.1F);
/*     */             
/* 398 */             GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
/* 399 */             GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
/* 400 */             GL11.glTranslatef(0.0F, 0.5F, 0.0F);
/* 401 */             f16 = 1.0F + f15 * 0.2F;
/* 402 */             GL11.glScalef(1.0F, 1.0F, f16);
/* 403 */             GL11.glTranslatef(0.0F, -0.5F, 0.0F);
/* 404 */             GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
/* 405 */             GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
/*     */           }
/*     */         }
/*     */         
/* 409 */         if (localadd.b().g()) {
/* 410 */           GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*     */         }
/* 412 */         if (localadd.b().b())
/*     */         {
/*     */ 
/* 415 */           a(localbjk, localadd, 0);
/*     */           
/* 417 */           int i3 = localadd.b().a(localadd, 1);
/* 418 */           f14 = (i3 >> 16 & 0xFF) / 255.0F;
/* 419 */           f15 = (i3 >> 8 & 0xFF) / 255.0F;
/* 420 */           f16 = (i3 & 0xFF) / 255.0F;
/*     */           
/* 422 */           GL11.glColor4f(1.0F * f14, 1.0F * f15, 1.0F * f16, 1.0F);
/*     */           
/* 424 */           a(localbjk, localadd, 1);
/*     */         } else {
/* 426 */           a(localbjk, localadd, 0);
/*     */         }
/* 428 */         GL11.glPopMatrix();
/* 429 */       } else if (!localbjk.ap()) {
/* 430 */         GL11.glPushMatrix();
/* 431 */         f5 = 0.8F;
/*     */         
/*     */ 
/* 434 */         f7 = localbjk.k(paramFloat);
/*     */         
/* 436 */         f9 = qh.a(f7 * 3.1415927F);
/* 437 */         f11 = qh.a(qh.c(f7) * 3.1415927F);
/* 438 */         GL11.glTranslatef(-f11 * 0.3F, qh.a(qh.c(f7) * 3.1415927F * 2.0F) * 0.4F, -f9 * 0.4F);
/*     */         
/*     */ 
/* 441 */         GL11.glTranslatef(0.8F * f5, -0.75F * f5 - (1.0F - f1) * 0.6F, -0.9F * f5);
/*     */         
/* 443 */         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 444 */         GL11.glEnable(32826);
/* 445 */         f7 = localbjk.k(paramFloat);
/* 446 */         f9 = qh.a(f7 * f7 * 3.1415927F);
/* 447 */         f11 = qh.a(qh.c(f7) * 3.1415927F);
/* 448 */         GL11.glRotatef(f11 * 70.0F, 0.0F, 1.0F, 0.0F);
/* 449 */         GL11.glRotatef(-f9 * 20.0F, 0.0F, 0.0F, 1.0F);
/*     */         
/*     */ 
/* 452 */         this.d.P().a(localbjk.r());
/* 453 */         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
/* 454 */         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
/* 455 */         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
/* 456 */         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
/* 457 */         GL11.glScalef(1.0F, 1.0F, 1.0F);
/* 458 */         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
/*     */         
/* 460 */         bno localbno2 = bnn.a.a(this.d.h);
/* 461 */         bop localbop2 = (bop)localbno2;
/* 462 */         f14 = 1.0F;
/* 463 */         GL11.glScalef(f14, f14, f14);
/* 464 */         localbop2.a(this.d.h);
/* 465 */         GL11.glPopMatrix();
/*     */       }
/*     */     }
/* 468 */     if ((localadd != null) && ((localadd.b() instanceof aek))) {
/* 469 */       GL11.glDisable(3042);
/*     */     }
/*     */     
/* 472 */     GL11.glDisable(32826);
/* 473 */     bam.a();
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 477 */     GL11.glDisable(3008);
/* 478 */     if (this.d.h.al()) {
/* 479 */       d(paramFloat);
/*     */     }
/*     */     
/* 482 */     if (this.d.h.aa()) {
/* 483 */       int j = qh.c(this.d.h.s);
/* 484 */       int k = qh.c(this.d.h.t);
/* 485 */       int m = qh.c(this.d.h.u);
/*     */       
/* 487 */       aji localaji = this.d.f.a(j, k, m);
/* 488 */       if (this.d.f.a(j, k, m).r()) {
/* 489 */         a(paramFloat, localaji.h(2));
/*     */       } else {
/* 491 */         for (int n = 0; n < 8; n++) {
/* 492 */           float f1 = ((n >> 0) % 2 - 0.5F) * this.d.h.M * 0.9F;
/* 493 */           float f2 = ((n >> 1) % 2 - 0.5F) * this.d.h.N * 0.2F;
/* 494 */           float f3 = ((n >> 2) % 2 - 0.5F) * this.d.h.M * 0.9F;
/* 495 */           int i1 = qh.d(j + f1);
/* 496 */           int i2 = qh.d(k + f2);
/* 497 */           int i3 = qh.d(m + f3);
/* 498 */           if (this.d.f.a(i1, i2, i3).r()) {
/* 499 */             localaji = this.d.f.a(i1, i2, i3);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 504 */       if (localaji.o() != awt.a) {
/* 505 */         a(paramFloat, localaji.h(2));
/*     */       }
/*     */     }
/*     */     
/* 509 */     if (this.d.h.a(awt.h)) {
/* 510 */       c(paramFloat);
/*     */     }
/* 512 */     GL11.glEnable(3008);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat, rf paramrf) {
/* 516 */     this.d.P().a(bpz.b);
/*     */     
/* 518 */     bmh localbmh = bmh.a;
/*     */     
/* 520 */     float f1 = 0.1F;
/* 521 */     GL11.glColor4f(f1, f1, f1, 0.5F);
/*     */     
/* 523 */     GL11.glPushMatrix();
/*     */     
/* 525 */     float f2 = -1.0F;
/* 526 */     float f3 = 1.0F;
/* 527 */     float f4 = -1.0F;
/* 528 */     float f5 = 1.0F;
/* 529 */     float f6 = -0.5F;
/*     */     
/* 531 */     float f7 = paramrf.c();
/* 532 */     float f8 = paramrf.d();
/* 533 */     float f9 = paramrf.e();
/* 534 */     float f10 = paramrf.f();
/*     */     
/* 536 */     localbmh.b();
/* 537 */     localbmh.a(f2, f4, f6, f8, f10);
/* 538 */     localbmh.a(f3, f4, f6, f7, f10);
/* 539 */     localbmh.a(f3, f5, f6, f7, f9);
/* 540 */     localbmh.a(f2, f5, f6, f8, f9);
/* 541 */     localbmh.a();
/* 542 */     GL11.glPopMatrix();
/*     */     
/* 544 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void c(float paramFloat) {
/* 548 */     this.d.P().a(c);
/*     */     
/* 550 */     bmh localbmh = bmh.a;
/*     */     
/* 552 */     float f1 = this.d.h.d(paramFloat);
/* 553 */     GL11.glColor4f(f1, f1, f1, 0.5F);
/* 554 */     GL11.glEnable(3042);
/* 555 */     buu.c(770, 771, 1, 0);
/*     */     
/* 557 */     GL11.glPushMatrix();
/*     */     
/* 559 */     float f2 = 4.0F;
/*     */     
/* 561 */     float f3 = -1.0F;
/* 562 */     float f4 = 1.0F;
/* 563 */     float f5 = -1.0F;
/* 564 */     float f6 = 1.0F;
/* 565 */     float f7 = -0.5F;
/*     */     
/* 567 */     float f8 = -this.d.h.y / 64.0F;
/* 568 */     float f9 = this.d.h.z / 64.0F;
/*     */     
/* 570 */     localbmh.b();
/* 571 */     localbmh.a(f3, f5, f7, f2 + f8, f2 + f9);
/* 572 */     localbmh.a(f4, f5, f7, 0.0F + f8, f2 + f9);
/* 573 */     localbmh.a(f4, f6, f7, 0.0F + f8, 0.0F + f9);
/* 574 */     localbmh.a(f3, f6, f7, f2 + f8, 0.0F + f9);
/* 575 */     localbmh.a();
/* 576 */     GL11.glPopMatrix();
/*     */     
/* 578 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 579 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   private void d(float paramFloat) {
/* 583 */     bmh localbmh = bmh.a;
/* 584 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
/* 585 */     GL11.glEnable(3042);
/* 586 */     buu.c(770, 771, 1, 0);
/*     */     
/* 588 */     float f1 = 1.0F;
/* 589 */     for (int j = 0; j < 2; j++) {
/* 590 */       GL11.glPushMatrix();
/*     */       
/* 592 */       rf localrf = ajn.ab.c(1);
/* 593 */       this.d.P().a(bpz.b);
/*     */       
/* 595 */       float f2 = localrf.c();
/* 596 */       float f3 = localrf.d();
/* 597 */       float f4 = localrf.e();
/* 598 */       float f5 = localrf.f();
/*     */       
/* 600 */       float f6 = (0.0F - f1) / 2.0F;
/* 601 */       float f7 = f6 + f1;
/* 602 */       float f8 = 0.0F - f1 / 2.0F;
/* 603 */       float f9 = f8 + f1;
/* 604 */       float f10 = -0.5F;
/* 605 */       GL11.glTranslatef(-(j * 2 - 1) * 0.24F, -0.3F, 0.0F);
/* 606 */       GL11.glRotatef((j * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 608 */       localbmh.b();
/* 609 */       localbmh.a(f6, f8, f10, f3, f5);
/* 610 */       localbmh.a(f7, f8, f10, f2, f5);
/* 611 */       localbmh.a(f7, f9, f10, f2, f4);
/* 612 */       localbmh.a(f6, f9, f10, f3, f4);
/* 613 */       localbmh.a();
/* 614 */       GL11.glPopMatrix();
/*     */     }
/* 616 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 617 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/* 620 */   private int i = -1;
/*     */   
/*     */   public void a() {
/* 623 */     this.g = this.f;
/*     */     
/* 625 */     bjk localbjk = this.d.h;
/*     */     
/* 627 */     add localadd = localbjk.bm.h();
/*     */     
/* 629 */     int j = (this.i == localbjk.bm.c) && (localadd == this.e) ? 1 : 0;
/* 630 */     if ((this.e == null) && (localadd == null)) {
/* 631 */       j = 1;
/*     */     }
/* 633 */     if ((localadd != null) && (this.e != null) && (localadd != this.e) && (localadd.b() == this.e.b()) && (localadd.k() == this.e.k())) {
/* 634 */       this.e = localadd;
/* 635 */       j = 1;
/*     */     }
/*     */     
/* 638 */     float f1 = 0.4F;
/* 639 */     float f2 = j != 0 ? 1.0F : 0.0F;
/* 640 */     float f3 = f2 - this.f;
/* 641 */     if (f3 < -f1) f3 = -f1;
/* 642 */     if (f3 > f1) { f3 = f1;
/*     */     }
/* 644 */     this.f += f3;
/* 645 */     if (this.f < 0.1F) {
/* 646 */       this.e = localadd;
/* 647 */       this.i = localbjk.bm.c;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 652 */     this.f = 0.0F;
/*     */   }
/*     */   
/*     */   public void c() {
/* 656 */     this.f = 0.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */