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
/*     */ public class bny
/*     */   extends bno
/*     */ {
/*  30 */   private static final bqx h = new bqx("textures/misc/enchanted_item_glint.png");
/*     */   
/*  32 */   private blm i = new blm();
/*  33 */   private Random j = new Random();
/*  34 */   public boolean a = true;
/*     */   public float f;
/*     */   public static boolean g;
/*     */   
/*     */   public bny() {
/*  39 */     this.d = 0.15F;
/*  40 */     this.e = 0.75F;
/*     */   }
/*     */   
/*     */   public void a(xk paramxk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  45 */     add localadd = paramxk.f();
/*  46 */     if (localadd.b() == null) { return;
/*     */     }
/*  48 */     b(paramxk);
/*  49 */     bqi.a(false, false, 1.0F);
/*     */     
/*  51 */     this.j.setSeed(187L);
/*     */     
/*  53 */     GL11.glPushMatrix();
/*  54 */     float f1 = qh.a((paramxk.a + paramFloat2) / 10.0F + paramxk.c) * 0.1F + 0.1F;
/*  55 */     float f2 = ((paramxk.a + paramFloat2) / 20.0F + paramxk.c) * 57.295776F;
/*     */     
/*  57 */     int k = 1;
/*  58 */     if (paramxk.f().b > 1) k = 2;
/*  59 */     if (paramxk.f().b > 5) k = 3;
/*  60 */     if (paramxk.f().b > 20) k = 4;
/*  61 */     if (paramxk.f().b > 40) { k = 5;
/*     */     }
/*  63 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + f1, (float)paramDouble3);
/*  64 */     GL11.glEnable(32826);
/*     */     int i1;
/*  66 */     float f6; float f7; if ((localadd.d() == 0) && ((localadd.b() instanceof abh)) && (blm.a(aji.a(localadd.b()).b()))) {
/*  67 */       aji localaji = aji.a(localadd.b());
/*  68 */       GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*     */       
/*  70 */       if (g) {
/*  71 */         GL11.glScalef(1.25F, 1.25F, 1.25F);
/*  72 */         GL11.glTranslatef(0.0F, 0.05F, 0.0F);
/*  73 */         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*     */       }
/*     */       
/*  76 */       float f3 = 0.25F;
/*  77 */       i1 = localaji.b();
/*  78 */       if ((i1 == 1) || (i1 == 19) || (i1 == 12) || (i1 == 2)) {
/*  79 */         f3 = 0.5F;
/*     */       }
/*     */       
/*  82 */       if (localaji.w() > 0) {
/*  83 */         GL11.glAlphaFunc(516, 0.1F);
/*  84 */         GL11.glEnable(3042);
/*  85 */         buu.c(770, 771, 1, 0);
/*     */       }
/*  87 */       GL11.glScalef(f3, f3, f3);
/*  88 */       for (int i2 = 0; i2 < k; i2++) {
/*  89 */         GL11.glPushMatrix();
/*  90 */         if (i2 > 0) {
/*  91 */           f6 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.2F / f3;
/*  92 */           f7 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.2F / f3;
/*  93 */           float f8 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.2F / f3;
/*  94 */           GL11.glTranslatef(f6, f7, f8);
/*     */         }
/*     */         
/*  97 */         this.i.a(localaji, localadd.k(), 1.0F);
/*  98 */         GL11.glPopMatrix();
/*     */       }
/* 100 */       if (localaji.w() > 0)
/* 101 */         GL11.glDisable(3042);
/*     */     } else { float f5;
/* 103 */       if ((localadd.d() == 1) && (localadd.b().b())) {
/* 104 */         if (g) {
/* 105 */           GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
/* 106 */           GL11.glTranslatef(0.0F, -0.05F, 0.0F);
/*     */         } else {
/* 108 */           GL11.glScalef(0.5F, 0.5F, 0.5F);
/*     */         }
/*     */         
/* 111 */         for (int m = 0; m <= 1; m++) {
/* 112 */           this.j.setSeed(187L);
/* 113 */           rf localrf2 = localadd.b().a(localadd.k(), m);
/*     */           
/* 115 */           if (this.a) {
/* 116 */             i1 = localadd.b().a(localadd, m);
/* 117 */             f5 = (i1 >> 16 & 0xFF) / 255.0F;
/* 118 */             f6 = (i1 >> 8 & 0xFF) / 255.0F;
/* 119 */             f7 = (i1 & 0xFF) / 255.0F;
/*     */             
/* 121 */             GL11.glColor4f(f5, f6, f7, 1.0F);
/* 122 */             a(paramxk, localrf2, k, paramFloat2, f5, f6, f7);
/*     */           } else {
/* 124 */             a(paramxk, localrf2, k, paramFloat2, 1.0F, 1.0F, 1.0F);
/*     */           }
/*     */         }
/*     */       } else {
/* 128 */         if ((localadd != null) && ((localadd.b() instanceof aek))) {
/* 129 */           GL11.glAlphaFunc(516, 0.1F);
/* 130 */           GL11.glEnable(3042);
/* 131 */           buu.c(770, 771, 1, 0);
/*     */         }
/*     */         
/* 134 */         if (g) {
/* 135 */           GL11.glScalef(0.5128205F, 0.5128205F, 0.5128205F);
/* 136 */           GL11.glTranslatef(0.0F, -0.05F, 0.0F);
/*     */         } else {
/* 138 */           GL11.glScalef(0.5F, 0.5F, 0.5F);
/*     */         }
/*     */         
/* 141 */         rf localrf1 = localadd.c();
/* 142 */         if (this.a) {
/* 143 */           int n = localadd.b().a(localadd, 0);
/* 144 */           float f4 = (n >> 16 & 0xFF) / 255.0F;
/* 145 */           f5 = (n >> 8 & 0xFF) / 255.0F;
/* 146 */           f6 = (n & 0xFF) / 255.0F;
/*     */           
/* 148 */           a(paramxk, localrf1, k, paramFloat2, f4, f5, f6);
/*     */         } else {
/* 150 */           a(paramxk, localrf1, k, paramFloat2, 1.0F, 1.0F, 1.0F);
/*     */         }
/*     */         
/* 153 */         if ((localadd != null) && ((localadd.b() instanceof aek))) {
/* 154 */           GL11.glDisable(3042);
/*     */         }
/*     */       }
/*     */     }
/* 158 */     GL11.glDisable(32826);
/* 159 */     GL11.glPopMatrix();
/* 160 */     b(paramxk);
/* 161 */     bqi.b();
/*     */   }
/*     */   
/*     */   protected bqx a(xk paramxk)
/*     */   {
/* 166 */     return this.b.e.a(paramxk.f().d());
/*     */   }
/*     */   
/*     */   private void a(xk paramxk, rf paramrf, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 170 */     bmh localbmh = bmh.a;
/*     */     
/* 172 */     if (paramrf == null)
/*     */     {
/* 174 */       bqf localbqf = bao.B().P();
/* 175 */       bqx localbqx = localbqf.a(paramxk.f().d());
/*     */       
/* 177 */       paramrf = ((bpz)localbqf.b(localbqx)).b("missingno");
/*     */     }
/*     */     
/* 180 */     float f1 = paramrf.c();
/* 181 */     float f2 = paramrf.d();
/* 182 */     float f3 = paramrf.e();
/* 183 */     float f4 = paramrf.f();
/*     */     
/* 185 */     float f5 = 1.0F;
/* 186 */     float f6 = 0.5F;
/* 187 */     float f7 = 0.25F;
/*     */     float f9;
/* 189 */     if (this.b.l.i) {
/* 190 */       GL11.glPushMatrix();
/* 191 */       if (g) {
/* 192 */         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*     */       } else {
/* 194 */         GL11.glRotatef(((paramxk.a + paramFloat1) / 20.0F + paramxk.c) * 57.295776F, 0.0F, 1.0F, 0.0F);
/*     */       }
/*     */       
/* 197 */       float f8 = 0.0625F;
/* 198 */       f9 = 0.021875F;
/* 199 */       add localadd = paramxk.f();
/* 200 */       int m = localadd.b;
/*     */       
/* 202 */       if (m < 2) {
/* 203 */         paramInt = 1;
/* 204 */       } else if (m < 16) {
/* 205 */         paramInt = 2;
/* 206 */       } else if (m < 32) {
/* 207 */         paramInt = 3;
/*     */       } else {
/* 209 */         paramInt = 4;
/*     */       }
/*     */       
/* 212 */       GL11.glTranslatef(-f6, -f7, -((f8 + f9) * paramInt / 2.0F));
/*     */       
/* 214 */       for (int n = 0; n < paramInt; n++) {
/* 215 */         GL11.glTranslatef(0.0F, 0.0F, f8 + f9);
/*     */         
/* 217 */         if (localadd.d() == 0) {
/* 218 */           a(bpz.b);
/*     */         } else {
/* 220 */           a(bpz.c);
/*     */         }
/* 222 */         GL11.glColor4f(paramFloat2, paramFloat3, paramFloat4, 1.0F);
/* 223 */         bly.a(localbmh, f2, f3, f1, f4, paramrf.a(), paramrf.b(), f8);
/*     */         
/* 225 */         if (localadd.v()) {
/* 226 */           GL11.glDepthFunc(514);
/* 227 */           GL11.glDisable(2896);
/*     */           
/* 229 */           this.b.e.a(h);
/* 230 */           GL11.glEnable(3042);
/* 231 */           GL11.glBlendFunc(768, 1);
/* 232 */           float f12 = 0.76F;
/* 233 */           GL11.glColor4f(0.5F * f12, 0.25F * f12, 0.8F * f12, 1.0F);
/* 234 */           GL11.glMatrixMode(5890);
/* 235 */           GL11.glPushMatrix();
/* 236 */           float f13 = 0.125F;
/* 237 */           GL11.glScalef(f13, f13, f13);
/* 238 */           float f14 = (float)(bao.K() % 3000L) / 3000.0F * 8.0F;
/* 239 */           GL11.glTranslatef(f14, 0.0F, 0.0F);
/* 240 */           GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
/*     */           
/* 242 */           bly.a(localbmh, 0.0F, 0.0F, 1.0F, 1.0F, 255, 255, f8);
/* 243 */           GL11.glPopMatrix();
/* 244 */           GL11.glPushMatrix();
/* 245 */           GL11.glScalef(f13, f13, f13);
/* 246 */           f14 = (float)(bao.K() % 4873L) / 4873.0F * 8.0F;
/* 247 */           GL11.glTranslatef(-f14, 0.0F, 0.0F);
/* 248 */           GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
/* 249 */           bly.a(localbmh, 0.0F, 0.0F, 1.0F, 1.0F, 255, 255, f8);
/* 250 */           GL11.glPopMatrix();
/* 251 */           GL11.glMatrixMode(5888);
/* 252 */           GL11.glDisable(3042);
/* 253 */           GL11.glEnable(2896);
/* 254 */           GL11.glDepthFunc(515);
/*     */         }
/*     */       }
/*     */       
/* 258 */       GL11.glPopMatrix();
/*     */     } else {
/* 260 */       for (int k = 0; k < paramInt; k++) {
/* 261 */         GL11.glPushMatrix();
/* 262 */         if (k > 0) {
/* 263 */           f9 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.3F;
/* 264 */           float f10 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.3F;
/* 265 */           float f11 = (this.j.nextFloat() * 2.0F - 1.0F) * 0.3F;
/* 266 */           GL11.glTranslatef(f9, f10, f11);
/*     */         }
/*     */         
/* 269 */         if (!g) GL11.glRotatef(180.0F - this.b.j, 0.0F, 1.0F, 0.0F);
/* 270 */         GL11.glColor4f(paramFloat2, paramFloat3, paramFloat4, 1.0F);
/* 271 */         localbmh.b();
/* 272 */         localbmh.c(0.0F, 1.0F, 0.0F);
/* 273 */         localbmh.a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/* 274 */         localbmh.a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/* 275 */         localbmh.a(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
/* 276 */         localbmh.a(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
/* 277 */         localbmh.a();
/* 278 */         GL11.glPopMatrix();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bbu parambbu, bqf parambqf, add paramadd, int paramInt1, int paramInt2) {
/* 284 */     int k = paramadd.k();
/* 285 */     Object localObject1 = paramadd.c();
/*     */     Object localObject2;
/* 287 */     int m; float f5; if ((paramadd.d() == 0) && (blm.a(aji.a(paramadd.b()).b()))) {
/* 288 */       parambqf.a(bpz.b);
/*     */       
/* 290 */       localObject2 = aji.a(paramadd.b());
/*     */       
/* 292 */       GL11.glEnable(3008);
/*     */       
/* 294 */       if (((aji)localObject2).w() != 0) {
/* 295 */         GL11.glAlphaFunc(516, 0.1F);
/* 296 */         GL11.glEnable(3042);
/* 297 */         buu.c(770, 771, 1, 0);
/*     */       } else {
/* 299 */         GL11.glAlphaFunc(516, 0.5F);
/* 300 */         GL11.glDisable(3042);
/*     */       }
/*     */       
/* 303 */       GL11.glPushMatrix();
/* 304 */       GL11.glTranslatef(paramInt1 - 2, paramInt2 + 3, -3.0F + this.f);
/* 305 */       GL11.glScalef(10.0F, 10.0F, 10.0F);
/* 306 */       GL11.glTranslatef(1.0F, 0.5F, 1.0F);
/* 307 */       GL11.glScalef(1.0F, 1.0F, -1.0F);
/* 308 */       GL11.glRotatef(210.0F, 1.0F, 0.0F, 0.0F);
/* 309 */       GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/*     */       
/* 311 */       m = paramadd.b().a(paramadd, 0);
/* 312 */       float f1 = (m >> 16 & 0xFF) / 255.0F;
/* 313 */       float f3 = (m >> 8 & 0xFF) / 255.0F;
/* 314 */       f5 = (m & 0xFF) / 255.0F;
/*     */       
/* 316 */       if (this.a) GL11.glColor4f(f1, f3, f5, 1.0F);
/* 317 */       GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/* 318 */       this.i.c = this.a;
/* 319 */       this.i.a((aji)localObject2, k, 1.0F);
/* 320 */       this.i.c = true;
/*     */       
/* 322 */       if (((aji)localObject2).w() == 0) {
/* 323 */         GL11.glAlphaFunc(516, 0.1F);
/*     */       }
/*     */       
/* 326 */       GL11.glPopMatrix();
/* 327 */     } else if (paramadd.b().b())
/*     */     {
/* 329 */       GL11.glDisable(2896);
/* 330 */       GL11.glEnable(3008);
/* 331 */       parambqf.a(bpz.c);
/*     */       
/*     */ 
/* 334 */       GL11.glDisable(3008);
/* 335 */       GL11.glDisable(3553);
/* 336 */       GL11.glEnable(3042);
/* 337 */       buu.c(0, 0, 0, 0);
/* 338 */       GL11.glColorMask(false, false, false, true);
/* 339 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 340 */       localObject2 = bmh.a;
/* 341 */       ((bmh)localObject2).b();
/* 342 */       ((bmh)localObject2).c(-1);
/* 343 */       ((bmh)localObject2).a(paramInt1 - 2, paramInt2 + 18, this.f);
/* 344 */       ((bmh)localObject2).a(paramInt1 + 18, paramInt2 + 18, this.f);
/* 345 */       ((bmh)localObject2).a(paramInt1 + 18, paramInt2 - 2, this.f);
/* 346 */       ((bmh)localObject2).a(paramInt1 - 2, paramInt2 - 2, this.f);
/* 347 */       ((bmh)localObject2).a();
/* 348 */       GL11.glColorMask(true, true, true, true);
/* 349 */       GL11.glEnable(3553);
/* 350 */       GL11.glEnable(3008);
/*     */       
/* 352 */       buu.c(770, 771, 1, 0);
/* 353 */       for (m = 0; m <= 1; m++) {
/* 354 */         rf localrf = paramadd.b().a(k, m);
/*     */         
/* 356 */         int n = paramadd.b().a(paramadd, m);
/* 357 */         f5 = (n >> 16 & 0xFF) / 255.0F;
/* 358 */         float f6 = (n >> 8 & 0xFF) / 255.0F;
/* 359 */         float f7 = (n & 0xFF) / 255.0F;
/*     */         
/* 361 */         if (this.a) GL11.glColor4f(f5, f6, f7, 1.0F);
/* 362 */         a(paramInt1, paramInt2, localrf, 16, 16);
/*     */       }
/*     */       
/* 365 */       GL11.glEnable(2896);
/*     */     } else {
/* 367 */       GL11.glDisable(2896);
/*     */       
/* 369 */       GL11.glEnable(3042);
/* 370 */       buu.c(770, 771, 1, 0);
/*     */       
/* 372 */       localObject2 = parambqf.a(paramadd.d());
/* 373 */       parambqf.a((bqx)localObject2);
/*     */       
/* 375 */       if (localObject1 == null) {
/* 376 */         localObject1 = ((bpz)bao.B().P().b((bqx)localObject2)).b("missingno");
/*     */       }
/*     */       
/* 379 */       m = paramadd.b().a(paramadd, 0);
/* 380 */       float f2 = (m >> 16 & 0xFF) / 255.0F;
/* 381 */       float f4 = (m >> 8 & 0xFF) / 255.0F;
/* 382 */       f5 = (m & 0xFF) / 255.0F;
/*     */       
/* 384 */       if (this.a) GL11.glColor4f(f2, f4, f5, 1.0F);
/* 385 */       a(paramInt1, paramInt2, (rf)localObject1, 16, 16);
/* 386 */       GL11.glEnable(2896);
/*     */       
/* 388 */       GL11.glDisable(3042);
/*     */     }
/* 390 */     GL11.glEnable(2884);
/*     */   }
/*     */   
/*     */   public void b(bbu parambbu, bqf parambqf, add paramadd, int paramInt1, int paramInt2) {
/* 394 */     if (paramadd == null) {
/* 395 */       return;
/*     */     }
/*     */     
/* 398 */     this.f += 50.0F;
/*     */     try {
/* 400 */       a(parambbu, parambqf, paramadd, paramInt1, paramInt2);
/*     */     } catch (Throwable localThrowable) {
/* 402 */       b localb = b.a(localThrowable, "Rendering item");
/* 403 */       k localk = localb.a("Item being rendered");
/*     */       
/* 405 */       localk.a("Item Type", new bnz(this, paramadd));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */       localk.a("Item Aux", new boa(this, paramadd));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */       localk.a("Item NBT", new bob(this, paramadd));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 426 */       localk.a("Item Foil", new boc(this, paramadd));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 433 */       throw new s(localb);
/*     */     }
/*     */     
/* 436 */     if (paramadd.v()) {
/* 437 */       GL11.glDepthFunc(514);
/* 438 */       GL11.glDisable(2896);
/* 439 */       GL11.glDepthMask(false);
/* 440 */       parambqf.a(h);
/* 441 */       GL11.glEnable(3008);
/* 442 */       GL11.glEnable(3042);
/* 443 */       GL11.glColor4f(0.5F, 0.25F, 0.8F, 1.0F);
/* 444 */       a(paramInt1 * 431278612 + paramInt2 * 32178161, paramInt1 - 2, paramInt2 - 2, 20, 20);
/* 445 */       buu.c(770, 771, 1, 0);
/* 446 */       GL11.glDepthMask(true);
/* 447 */       GL11.glEnable(2896);
/* 448 */       GL11.glDepthFunc(515);
/*     */     }
/* 450 */     this.f -= 50.0F;
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 454 */     for (int k = 0; k < 2; k++) {
/* 455 */       buu.c(772, 1, 0, 0);
/* 456 */       float f1 = 0.00390625F;
/* 457 */       float f2 = 0.00390625F;
/* 458 */       float f3 = (float)(bao.K() % (3000 + k * 1873)) / (3000.0F + k * 1873) * 256.0F;
/* 459 */       float f4 = 0.0F;
/* 460 */       bmh localbmh = bmh.a;
/* 461 */       float f5 = 4.0F;
/* 462 */       if (k == 1) f5 = -1.0F;
/* 463 */       localbmh.b();
/* 464 */       localbmh.a(paramInt2 + 0, paramInt3 + paramInt5, this.f, (f3 + paramInt5 * f5) * f1, (f4 + paramInt5) * f2);
/* 465 */       localbmh.a(paramInt2 + paramInt4, paramInt3 + paramInt5, this.f, (f3 + paramInt4 + paramInt5 * f5) * f1, (f4 + paramInt5) * f2);
/* 466 */       localbmh.a(paramInt2 + paramInt4, paramInt3 + 0, this.f, (f3 + paramInt4) * f1, (f4 + 0.0F) * f2);
/* 467 */       localbmh.a(paramInt2 + 0, paramInt3 + 0, this.f, (f3 + 0.0F) * f1, (f4 + 0.0F) * f2);
/* 468 */       localbmh.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(bbu parambbu, bqf parambqf, add paramadd, int paramInt1, int paramInt2) {
/* 473 */     a(parambbu, parambqf, paramadd, paramInt1, paramInt2, null);
/*     */   }
/*     */   
/*     */   public void a(bbu parambbu, bqf parambqf, add paramadd, int paramInt1, int paramInt2, String paramString) {
/* 477 */     if (paramadd == null) {
/* 478 */       return;
/*     */     }
/*     */     
/* 481 */     if ((paramadd.b > 1) || (paramString != null)) {
/* 482 */       String str = paramString == null ? String.valueOf(paramadd.b) : paramString;
/* 483 */       GL11.glDisable(2896);
/* 484 */       GL11.glDisable(2929);
/* 485 */       GL11.glDisable(3042);
/* 486 */       parambbu.a(str, paramInt1 + 19 - 2 - parambbu.a(str), paramInt2 + 6 + 3, 16777215);
/* 487 */       GL11.glEnable(2896);
/* 488 */       GL11.glEnable(2929);
/*     */     }
/*     */     
/* 491 */     if (paramadd.i()) {
/* 492 */       int k = (int)Math.round(13.0D - paramadd.j() * 13.0D / paramadd.l());
/* 493 */       int m = (int)Math.round(255.0D - paramadd.j() * 255.0D / paramadd.l());
/* 494 */       GL11.glDisable(2896);
/* 495 */       GL11.glDisable(2929);
/* 496 */       GL11.glDisable(3553);
/* 497 */       GL11.glDisable(3008);
/* 498 */       GL11.glDisable(3042);
/*     */       
/* 500 */       bmh localbmh = bmh.a;
/*     */       
/* 502 */       int n = 255 - m << 16 | m << 8;
/* 503 */       int i1 = (255 - m) / 4 << 16 | 0x3F00;
/* 504 */       a(localbmh, paramInt1 + 2, paramInt2 + 13, 13, 2, 0);
/* 505 */       a(localbmh, paramInt1 + 2, paramInt2 + 13, 12, 1, i1);
/* 506 */       a(localbmh, paramInt1 + 2, paramInt2 + 13, k, 1, n);
/*     */       
/* 508 */       GL11.glEnable(3042);
/* 509 */       GL11.glEnable(3008);
/* 510 */       GL11.glEnable(3553);
/* 511 */       GL11.glEnable(2896);
/* 512 */       GL11.glEnable(2929);
/* 513 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bmh parambmh, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 518 */     parambmh.b();
/* 519 */     parambmh.c(paramInt5);
/* 520 */     parambmh.a(paramInt1 + 0, paramInt2 + 0, 0.0D);
/* 521 */     parambmh.a(paramInt1 + 0, paramInt2 + paramInt4, 0.0D);
/* 522 */     parambmh.a(paramInt1 + paramInt3, paramInt2 + paramInt4, 0.0D);
/* 523 */     parambmh.a(paramInt1 + paramInt3, paramInt2 + 0, 0.0D);
/* 524 */     parambmh.a();
/*     */   }
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
/*     */   public void a(int paramInt1, int paramInt2, rf paramrf, int paramInt3, int paramInt4)
/*     */   {
/* 540 */     bmh localbmh = bmh.a;
/* 541 */     localbmh.b();
/* 542 */     localbmh.a(paramInt1 + 0, paramInt2 + paramInt4, this.f, paramrf.c(), paramrf.f());
/* 543 */     localbmh.a(paramInt1 + paramInt3, paramInt2 + paramInt4, this.f, paramrf.d(), paramrf.f());
/* 544 */     localbmh.a(paramInt1 + paramInt3, paramInt2 + 0, this.f, paramrf.d(), paramrf.e());
/* 545 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, this.f, paramrf.c(), paramrf.e());
/* 546 */     localbmh.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */