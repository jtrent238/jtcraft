/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import org.lwjgl.input.Mouse;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bei
/*     */   extends bdw
/*     */   implements ber
/*     */ {
/*  41 */   private static final int y = pc.a * 24 - 112;
/*  42 */   private static final int z = pc.b * 24 - 112;
/*  43 */   private static final int A = pc.c * 24 - 77;
/*  44 */   private static final int B = pc.d * 24 - 77;
/*     */   
/*     */ 
/*  47 */   private static final bqx C = new bqx("textures/gui/achievement/achievement_background.png");
/*     */   
/*     */ 
/*     */   protected bdw a;
/*     */   
/*  52 */   protected int f = 256;
/*  53 */   protected int g = 202;
/*     */   protected int h;
/*     */   protected int i;
/*  56 */   protected float r = 1.0F;
/*     */   protected double s;
/*     */   protected double t;
/*     */   protected double u;
/*     */   protected double v;
/*     */   protected double w;
/*     */   protected double x;
/*     */   private int D;
/*     */   private pq E;
/*  65 */   private boolean F = true;
/*     */   
/*     */   public bei(bdw parambdw, pq parampq) {
/*  68 */     this.a = parambdw;
/*  69 */     this.E = parampq;
/*  70 */     int j = 141;
/*  71 */     int k = 141;
/*     */     
/*  73 */     this.s = (this.u = this.w = pc.f.a * 24 - j / 2 - 12);
/*  74 */     this.t = (this.v = this.x = pc.f.b * 24 - k / 2);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  79 */     this.k.v().a(new is(it.b));
/*  80 */     this.n.clear();
/*  81 */     this.n.add(new bcj(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, brp.a("gui.done", new Object[0])));
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  86 */     if (this.F) return;
/*  87 */     if (parambcb.k == 1) {
/*  88 */       this.k.a(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  94 */     if (paramInt == this.k.u.aa.i()) {
/*  95 */       this.k.a(null);
/*  96 */       this.k.l();
/*     */     } else {
/*  98 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 104 */     if (this.F) {
/* 105 */       c();
/* 106 */       a(this.q, brp.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
/* 107 */       a(this.q, b_[((int)(bao.K() / 150L % b_.length))], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
/*     */     } else {
/* 109 */       if (Mouse.isButtonDown(0)) {
/* 110 */         j = (this.l - this.f) / 2;
/* 111 */         int k = (this.m - this.g) / 2;
/*     */         
/* 113 */         int m = j + 8;
/* 114 */         int n = k + 17;
/*     */         
/* 116 */         if (((this.D == 0) || (this.D == 1)) && 
/* 117 */           (paramInt1 >= m) && (paramInt1 < m + 224) && (paramInt2 >= n) && (paramInt2 < n + 155)) {
/* 118 */           if (this.D == 0) {
/* 119 */             this.D = 1;
/*     */           } else {
/* 121 */             this.u -= (paramInt1 - this.h) * this.r;
/* 122 */             this.v -= (paramInt2 - this.i) * this.r;
/* 123 */             this.w = (this.s = this.u);
/* 124 */             this.x = (this.t = this.v);
/*     */           }
/* 126 */           this.h = paramInt1;
/* 127 */           this.i = paramInt2;
/*     */         }
/*     */       }
/*     */       else {
/* 131 */         this.D = 0;
/*     */       }
/*     */       
/* 134 */       int j = Mouse.getDWheel();
/* 135 */       float f1 = this.r;
/* 136 */       if (j < 0) {
/* 137 */         this.r += 0.25F;
/* 138 */       } else if (j > 0) {
/* 139 */         this.r -= 0.25F;
/*     */       }
/*     */       
/* 142 */       this.r = qh.a(this.r, 1.0F, 2.0F);
/*     */       
/* 144 */       if (this.r != f1) {
/* 145 */         float f2 = f1 - this.r;
/* 146 */         float f3 = f1 * this.f;
/* 147 */         float f4 = f1 * this.g;
/* 148 */         float f5 = this.r * this.f;
/* 149 */         float f6 = this.r * this.g;
/* 150 */         this.u -= (f5 - f3) * 0.5F;
/* 151 */         this.v -= (f6 - f4) * 0.5F;
/* 152 */         this.w = (this.s = this.u);
/* 153 */         this.x = (this.t = this.v);
/*     */       }
/*     */       
/*     */ 
/* 157 */       if (this.w < y) this.w = y;
/* 158 */       if (this.x < z) this.x = z;
/* 159 */       if (this.w >= A) this.w = (A - 1);
/* 160 */       if (this.x >= B) { this.x = (B - 1);
/*     */       }
/* 162 */       c();
/* 163 */       b(paramInt1, paramInt2, paramFloat);
/*     */       
/* 165 */       GL11.glDisable(2896);
/* 166 */       GL11.glDisable(2929);
/*     */       
/* 168 */       f();
/*     */       
/* 170 */       GL11.glEnable(2896);
/* 171 */       GL11.glEnable(2929);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/* 177 */     if (this.F) {
/* 178 */       this.F = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 184 */     if (this.F) return;
/* 185 */     this.s = this.u;
/* 186 */     this.t = this.v;
/*     */     
/* 188 */     double d1 = this.w - this.u;
/* 189 */     double d2 = this.x - this.v;
/* 190 */     if (d1 * d1 + d2 * d2 < 4.0D) {
/* 191 */       this.u += d1;
/* 192 */       this.v += d2;
/*     */     } else {
/* 194 */       this.u += d1 * 0.85D;
/* 195 */       this.v += d2 * 0.85D;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void f() {
/* 200 */     int j = (this.l - this.f) / 2;
/* 201 */     int k = (this.m - this.g) / 2;
/* 202 */     this.q.b(brp.a("gui.achievements", new Object[0]), j + 15, k + 5, 4210752);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, float paramFloat) {
/* 206 */     int j = qh.c(this.s + (this.u - this.s) * paramFloat);
/* 207 */     int k = qh.c(this.t + (this.v - this.t) * paramFloat);
/*     */     
/* 209 */     if (j < y) j = y;
/* 210 */     if (k < z) k = z;
/* 211 */     if (j >= A) j = A - 1;
/* 212 */     if (k >= B) { k = B - 1;
/*     */     }
/* 214 */     int m = (this.l - this.f) / 2;
/* 215 */     int n = (this.m - this.g) / 2;
/*     */     
/* 217 */     int i1 = m + 16;
/* 218 */     int i2 = n + 17;
/*     */     
/* 220 */     this.e = 0.0F;
/* 221 */     GL11.glDepthFunc(518);
/* 222 */     GL11.glPushMatrix();
/* 223 */     GL11.glTranslatef(i1, i2, -200.0F);
/* 224 */     GL11.glScalef(1.0F / this.r, 1.0F / this.r, 0.0F);
/*     */     
/* 226 */     GL11.glEnable(3553);
/* 227 */     GL11.glDisable(2896);
/* 228 */     GL11.glEnable(32826);
/* 229 */     GL11.glEnable(2903);
/*     */     
/* 231 */     int i3 = j + 288 >> 4;
/* 232 */     int i4 = k + 288 >> 4;
/* 233 */     int i5 = (j + 288) % 16;
/* 234 */     int i6 = (k + 288) % 16;
/*     */     
/* 236 */     int i7 = 4;
/* 237 */     int i8 = 8;
/* 238 */     int i9 = 10;
/* 239 */     int i10 = 22;
/* 240 */     int i11 = 37;
/*     */     
/* 242 */     Random localRandom = new Random();
/* 243 */     float f1 = 16.0F / this.r;
/* 244 */     float f2 = 16.0F / this.r;
/*     */     int i13;
/* 246 */     int i14; for (int i12 = 0; i12 * f1 - i6 < 155.0F; i12++) {
/* 247 */       float f3 = 0.6F - (i4 + i12) / 25.0F * 0.3F;
/* 248 */       GL11.glColor4f(f3, f3, f3, 1.0F);
/*     */       
/* 250 */       for (i13 = 0; i13 * f2 - i5 < 224.0F; i13++) {
/* 251 */         localRandom.setSeed(this.k.M().b().hashCode() + (i3 + i13) + (i4 + i12) * 16);
/* 252 */         i14 = localRandom.nextInt(1 + i4 + i12) + (i4 + i12) / 2;
/* 253 */         rf localrf = ajn.m.a(0, 0);
/*     */         
/* 255 */         if ((i14 > 37) || (i4 + i12 == 35)) {
/* 256 */           localrf = ajn.h.a(0, 0);
/* 257 */         } else if (i14 == 22) {
/* 258 */           if (localRandom.nextInt(2) == 0) {
/* 259 */             localrf = ajn.ag.a(0, 0);
/*     */           } else {
/* 261 */             localrf = ajn.ax.a(0, 0);
/*     */           }
/* 263 */         } else if (i14 == 10) {
/* 264 */           localrf = ajn.p.a(0, 0);
/* 265 */         } else if (i14 == 8) {
/* 266 */           localrf = ajn.q.a(0, 0);
/* 267 */         } else if (i14 > 4) {
/* 268 */           localrf = ajn.b.a(0, 0);
/* 269 */         } else if (i14 > 0) {
/* 270 */           localrf = ajn.d.a(0, 0);
/*     */         }
/*     */         
/* 273 */         this.k.P().a(bpz.b);
/*     */         
/* 275 */         a(i13 * 16 - i5, i12 * 16 - i6, localrf, 16, 16);
/*     */       }
/*     */     }
/*     */     
/* 279 */     GL11.glEnable(2929);
/* 280 */     GL11.glDepthFunc(515);
/* 281 */     this.k.P().a(C);
/*     */     int i19;
/* 283 */     for (i12 = 0; i12 < pc.e.size(); i12++) {
/* 284 */       localObject2 = (pb)pc.e.get(i12);
/* 285 */       if (((pb)localObject2).c != null)
/*     */       {
/* 287 */         i13 = ((pb)localObject2).a * 24 - j + 11;
/* 288 */         i14 = ((pb)localObject2).b * 24 - k + 11;
/*     */         
/* 290 */         i15 = ((pb)localObject2).c.a * 24 - j + 11;
/* 291 */         int i16 = ((pb)localObject2).c.b * 24 - k + 11;
/*     */         
/* 293 */         boolean bool1 = this.E.a((pb)localObject2);
/* 294 */         boolean bool2 = this.E.b((pb)localObject2);
/* 295 */         i19 = this.E.c((pb)localObject2);
/*     */         
/* 297 */         if (i19 <= 4)
/*     */         {
/* 299 */           int i20 = -16777216;
/* 300 */           if (bool1) { i20 = -6250336;
/* 301 */           } else if (bool2) { i20 = -16711936;
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/* 307 */           a(i13, i15, i14, i20);
/* 308 */           b(i15, i14, i16, i20);
/*     */           
/* 310 */           if (i13 > i15)
/*     */           {
/* 312 */             b(i13 - 11 - 7, i14 - 5, 114, 234, 7, 11);
/* 313 */           } else if (i13 < i15)
/*     */           {
/* 315 */             b(i13 + 11, i14 - 5, 107, 234, 7, 11);
/* 316 */           } else if (i14 > i16)
/*     */           {
/* 318 */             b(i13 - 5, i14 - 11 - 7, 96, 234, 11, 7);
/* 319 */           } else if (i14 < i16)
/*     */           {
/* 321 */             b(i13 - 5, i14 + 11, 96, 241, 11, 7); }
/*     */         }
/*     */       }
/*     */     }
/* 325 */     Object localObject1 = null;
/* 326 */     Object localObject2 = new bny();
/* 327 */     float f4 = (paramInt1 - i1) * this.r;
/* 328 */     float f5 = (paramInt2 - i2) * this.r;
/*     */     
/* 330 */     bam.c();
/* 331 */     GL11.glDisable(2896);
/* 332 */     GL11.glEnable(32826);
/* 333 */     GL11.glEnable(2903);
/*     */     Object localObject3;
/* 335 */     int i17; int i18; for (int i15 = 0; i15 < pc.e.size(); i15++) {
/* 336 */       localObject3 = (pb)pc.e.get(i15);
/*     */       
/* 338 */       i17 = ((pb)localObject3).a * 24 - j;
/* 339 */       i18 = ((pb)localObject3).b * 24 - k;
/*     */       
/* 341 */       if ((i17 >= -24) && (i18 >= -24) && (i17 <= 224.0F * this.r) && (i18 <= 155.0F * this.r)) {
/* 342 */         i19 = this.E.c((pb)localObject3);
/*     */         float f6;
/* 344 */         if (this.E.a((pb)localObject3)) {
/* 345 */           f6 = 0.75F;
/* 346 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/* 347 */         } else if (this.E.b((pb)localObject3)) {
/* 348 */           f6 = 1.0F;
/* 349 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/* 350 */         } else if (i19 < 3) {
/* 351 */           f6 = 0.3F;
/* 352 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/* 353 */         } else if (i19 == 3) {
/* 354 */           f6 = 0.2F;
/* 355 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/* 356 */         } else { if (i19 != 4) continue;
/* 357 */           f6 = 0.1F;
/* 358 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 367 */         this.k.P().a(C);
/*     */         
/* 369 */         if (((pb)localObject3).g()) {
/* 370 */           b(i17 - 2, i18 - 2, 26, 202, 26, 26);
/*     */         } else {
/* 372 */           b(i17 - 2, i18 - 2, 0, 202, 26, 26);
/*     */         }
/*     */         
/* 375 */         if (!this.E.b((pb)localObject3)) {
/* 376 */           f6 = 0.1F;
/* 377 */           GL11.glColor4f(f6, f6, f6, 1.0F);
/* 378 */           ((bny)localObject2).a = false;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 385 */         GL11.glEnable(2896);
/* 386 */         GL11.glEnable(2884);
/* 387 */         ((bny)localObject2).b(this.k.l, this.k.P(), ((pb)localObject3).d, i17 + 3, i18 + 3);
/* 388 */         GL11.glBlendFunc(770, 771);
/* 389 */         GL11.glDisable(2896);
/* 390 */         if (!this.E.b((pb)localObject3)) {
/* 391 */           ((bny)localObject2).a = true;
/*     */         }
/* 393 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */         
/* 395 */         if ((f4 >= i17) && (f4 <= i17 + 22) && (f5 >= i18) && (f5 <= i18 + 22)) {
/* 396 */           localObject1 = localObject3;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 401 */     GL11.glDisable(2929);
/* 402 */     GL11.glEnable(3042);
/*     */     
/* 404 */     GL11.glPopMatrix();
/* 405 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 406 */     this.k.P().a(C);
/* 407 */     b(m, n, 0, 0, this.f, this.g);
/*     */     
/* 409 */     this.e = 0.0F;
/* 410 */     GL11.glDepthFunc(515);
/*     */     
/* 412 */     GL11.glDisable(2929);
/* 413 */     GL11.glEnable(3553);
/* 414 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 420 */     if (localObject1 != null) {
/* 421 */       String str1 = ((pb)localObject1).e().c();
/* 422 */       localObject3 = ((pb)localObject1).f();
/*     */       
/* 424 */       i17 = paramInt1 + 12;
/* 425 */       i18 = paramInt2 - 4;
/* 426 */       i19 = this.E.c((pb)localObject1);
/*     */       int i21;
/* 428 */       if (this.E.b((pb)localObject1)) {
/* 429 */         i21 = Math.max(this.q.a(str1), 120);
/* 430 */         int i22 = this.q.b((String)localObject3, i21);
/* 431 */         if (this.E.a((pb)localObject1)) {
/* 432 */           i22 += 12;
/*     */         }
/* 434 */         a(i17 - 3, i18 - 3, i17 + i21 + 3, i18 + i22 + 3 + 12, -1073741824, -1073741824);
/*     */         
/* 436 */         this.q.a((String)localObject3, i17, i18 + 12, i21, -6250336);
/* 437 */         if (this.E.a((pb)localObject1))
/* 438 */           this.q.a(brp.a("achievement.taken", new Object[0]), i17, i18 + i22 + 4, -7302913); } else { String str2;
/*     */         int i23;
/* 440 */         if (i19 == 3) {
/* 441 */           str1 = brp.a("achievement.unknown", new Object[0]);
/* 442 */           i21 = Math.max(this.q.a(str1), 120);
/* 443 */           str2 = new fr("achievement.requires", new Object[] { ((pb)localObject1).c.e() }).c();
/* 444 */           i23 = this.q.b(str2, i21);
/* 445 */           a(i17 - 3, i18 - 3, i17 + i21 + 3, i18 + i23 + 12 + 3, -1073741824, -1073741824);
/* 446 */           this.q.a(str2, i17, i18 + 12, i21, -9416624);
/* 447 */         } else if (i19 < 3) {
/* 448 */           i21 = Math.max(this.q.a(str1), 120);
/* 449 */           str2 = new fr("achievement.requires", new Object[] { ((pb)localObject1).c.e() }).c();
/* 450 */           i23 = this.q.b(str2, i21);
/* 451 */           a(i17 - 3, i18 - 3, i17 + i21 + 3, i18 + i23 + 12 + 3, -1073741824, -1073741824);
/* 452 */           this.q.a(str2, i17, i18 + 12, i21, -9416624);
/*     */         } else {
/* 454 */           str1 = null;
/*     */         }
/*     */       }
/* 457 */       if (str1 != null) {
/* 458 */         this.q.a(str1, i17, i18, ((pb)localObject1).g() ? -8355776 : this.E.b((pb)localObject1) ? -1 : ((pb)localObject1).g() ? -128 : -8355712);
/*     */       }
/*     */     }
/*     */     
/* 462 */     GL11.glEnable(2929);
/* 463 */     GL11.glEnable(2896);
/* 464 */     bam.a();
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 469 */     return !this.F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */