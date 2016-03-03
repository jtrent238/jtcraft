/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.lwjgl.input.Keyboard;
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
/*     */ public abstract class bex
/*     */   extends bdw
/*     */ {
/*  23 */   protected static final bqx a = new bqx("textures/gui/container/inventory.png");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  29 */   protected int f = 176;
/*  30 */   protected int g = 166;
/*     */   
/*     */   public zs h;
/*     */   protected int i;
/*     */   protected int r;
/*     */   private aay u;
/*     */   private aay v;
/*     */   private boolean w;
/*     */   private add x;
/*     */   private int y;
/*     */   private int z;
/*     */   private aay A;
/*     */   private long B;
/*     */   private add C;
/*     */   private aay D;
/*     */   private long E;
/*  46 */   protected final Set s = new HashSet();
/*     */   protected boolean t;
/*     */   private int F;
/*     */   private int G;
/*     */   private boolean H;
/*     */   private int I;
/*     */   private long J;
/*     */   private aay K;
/*     */   private int L;
/*     */   private boolean M;
/*     */   private add N;
/*     */   
/*     */   public bex(zs paramzs) {
/*  59 */     this.h = paramzs;
/*  60 */     this.H = true;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  65 */     super.b();
/*  66 */     this.k.h.bo = this.h;
/*     */     
/*  68 */     this.i = ((this.l - this.f) / 2);
/*  69 */     this.r = ((this.m - this.g) / 2);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/*  74 */     c();
/*  75 */     int j = this.i;
/*  76 */     int k = this.r;
/*     */     
/*  78 */     a(paramFloat, paramInt1, paramInt2);
/*     */     
/*  80 */     GL11.glDisable(32826);
/*  81 */     bam.a();
/*  82 */     GL11.glDisable(2896);
/*  83 */     GL11.glDisable(2929);
/*     */     
/*  85 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/*  87 */     bam.c();
/*     */     
/*  89 */     GL11.glPushMatrix();
/*  90 */     GL11.glTranslatef(j, k, 0.0F);
/*     */     
/*  92 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  93 */     GL11.glEnable(32826);
/*     */     
/*  95 */     this.u = null;
/*     */     
/*  97 */     int m = 240;
/*  98 */     int n = 240;
/*  99 */     buu.a(buu.c, m / 1.0F, n / 1.0F);
/* 100 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     int i2;
/* 102 */     int i3; for (int i1 = 0; i1 < this.h.c.size(); i1++) {
/* 103 */       localObject = (aay)this.h.c.get(i1);
/*     */       
/* 105 */       a((aay)localObject);
/*     */       
/* 107 */       if ((a((aay)localObject, paramInt1, paramInt2)) && (((aay)localObject).b())) {
/* 108 */         this.u = ((aay)localObject);
/*     */         
/* 110 */         GL11.glDisable(2896);
/* 111 */         GL11.glDisable(2929);
/*     */         
/* 113 */         i2 = ((aay)localObject).h;
/* 114 */         i3 = ((aay)localObject).i;
/* 115 */         GL11.glColorMask(true, true, true, false);
/* 116 */         a(i2, i3, i2 + 16, i3 + 16, -2130706433, -2130706433);
/* 117 */         GL11.glColorMask(true, true, true, true);
/* 118 */         GL11.glEnable(2896);
/* 119 */         GL11.glEnable(2929);
/*     */       }
/*     */     }
/*     */     
/* 123 */     b(paramInt1, paramInt2);
/*     */     
/* 125 */     yx localyx = this.k.h.bm;
/* 126 */     Object localObject = this.x == null ? localyx.o() : this.x;
/*     */     
/* 128 */     if (localObject != null) {
/* 129 */       i2 = 8;
/* 130 */       i3 = this.x == null ? 8 : 16;
/* 131 */       String str = null;
/*     */       
/* 133 */       if ((this.x != null) && (this.w)) {
/* 134 */         localObject = ((add)localObject).m();
/* 135 */         ((add)localObject).b = qh.f(((add)localObject).b / 2.0F);
/* 136 */       } else if ((this.t) && (this.s.size() > 1)) {
/* 137 */         localObject = ((add)localObject).m();
/* 138 */         ((add)localObject).b = this.I;
/* 139 */         if (((add)localObject).b == 0) {
/* 140 */           str = "" + a.o + "0";
/*     */         }
/*     */       }
/* 143 */       a((add)localObject, paramInt1 - j - i2, paramInt2 - k - i3, str);
/*     */     }
/*     */     
/* 146 */     if (this.C != null) {
/* 147 */       float f1 = (float)(bao.K() - this.B) / 100.0F;
/*     */       
/* 149 */       if (f1 >= 1.0F) {
/* 150 */         f1 = 1.0F;
/* 151 */         this.C = null;
/*     */       }
/*     */       
/* 154 */       i3 = this.A.h - this.y;
/* 155 */       int i4 = this.A.i - this.z;
/* 156 */       int i5 = this.y + (int)(i3 * f1);
/* 157 */       int i6 = this.z + (int)(i4 * f1);
/*     */       
/* 159 */       a(this.C, i5, i6, null);
/*     */     }
/*     */     
/* 162 */     GL11.glPopMatrix();
/*     */     
/* 164 */     if ((localyx.o() == null) && (this.u != null) && (this.u.e())) {
/* 165 */       add localadd = this.u.d();
/* 166 */       a(localadd, paramInt1, paramInt2);
/*     */     }
/*     */     
/* 169 */     GL11.glEnable(2896);
/* 170 */     GL11.glEnable(2929);
/* 171 */     bam.b();
/*     */   }
/*     */   
/*     */   private void a(add paramadd, int paramInt1, int paramInt2, String paramString) {
/* 175 */     GL11.glTranslatef(0.0F, 0.0F, 32.0F);
/* 176 */     this.e = 200.0F;
/* 177 */     j.f = 200.0F;
/*     */     
/* 179 */     j.b(this.q, this.k.P(), paramadd, paramInt1, paramInt2);
/* 180 */     j.a(this.q, this.k.P(), paramadd, paramInt1, paramInt2 - (this.x == null ? 0 : 8), paramString);
/* 181 */     this.e = 0.0F;
/* 182 */     j.f = 0.0F;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2) {}
/*     */   
/*     */   protected abstract void a(float paramFloat, int paramInt1, int paramInt2);
/*     */   
/*     */   private void a(aay paramaay)
/*     */   {
/* 191 */     int j = paramaay.h;
/* 192 */     int k = paramaay.i;
/* 193 */     add localadd1 = paramaay.d();
/* 194 */     int m = 0;
/* 195 */     int n = (paramaay == this.v) && (this.x != null) && (!this.w) ? 1 : 0;
/* 196 */     add localadd2 = this.k.h.bm.o();
/* 197 */     String str = null;
/*     */     
/* 199 */     if ((paramaay == this.v) && (this.x != null) && (this.w) && (localadd1 != null)) {
/* 200 */       localadd1 = localadd1.m();
/* 201 */       localadd1.b /= 2;
/* 202 */     } else if ((this.t) && (this.s.contains(paramaay)) && (localadd2 != null)) {
/* 203 */       if (this.s.size() == 1) return;
/* 204 */       if ((zs.a(paramaay, localadd2, true)) && (this.h.b(paramaay))) {
/* 205 */         localadd1 = localadd2.m();
/* 206 */         m = 1;
/*     */         
/* 208 */         zs.a(this.s, this.F, localadd1, paramaay.d() == null ? 0 : paramaay.d().b);
/*     */         
/* 210 */         if (localadd1.b > localadd1.e()) {
/* 211 */           str = a.o + "" + localadd1.e();
/* 212 */           localadd1.b = localadd1.e();
/*     */         }
/* 214 */         if (localadd1.b > paramaay.a()) {
/* 215 */           str = a.o + "" + paramaay.a();
/* 216 */           localadd1.b = paramaay.a();
/*     */         }
/*     */       } else {
/* 219 */         this.s.remove(paramaay);
/* 220 */         a();
/*     */       }
/*     */     }
/*     */     
/* 224 */     this.e = 100.0F;
/* 225 */     j.f = 100.0F;
/* 226 */     if (localadd1 == null) {
/* 227 */       rf localrf = paramaay.c();
/* 228 */       if (localrf != null) {
/* 229 */         GL11.glDisable(2896);
/* 230 */         this.k.P().a(bpz.c);
/* 231 */         a(j, k, localrf, 16, 16);
/* 232 */         GL11.glEnable(2896);
/* 233 */         n = 1;
/*     */       }
/*     */     }
/*     */     
/* 237 */     if (n == 0) {
/* 238 */       if (m != 0) a(j, k, j + 16, k + 16, -2130706433);
/* 239 */       GL11.glEnable(2929);
/* 240 */       j.b(this.q, this.k.P(), localadd1, j, k);
/* 241 */       j.a(this.q, this.k.P(), localadd1, j, k, str);
/*     */     }
/* 243 */     j.f = 0.0F;
/* 244 */     this.e = 0.0F;
/*     */   }
/*     */   
/*     */   private void a() {
/* 248 */     add localadd1 = this.k.h.bm.o();
/* 249 */     if ((localadd1 == null) || (!this.t)) return;
/* 250 */     this.I = localadd1.b;
/*     */     
/* 252 */     for (aay localaay : this.s) {
/* 253 */       add localadd2 = localadd1.m();
/* 254 */       int j = localaay.d() == null ? 0 : localaay.d().b;
/* 255 */       zs.a(this.s, this.F, localadd2, j);
/* 256 */       if (localadd2.b > localadd2.e()) localadd2.b = localadd2.e();
/* 257 */       if (localadd2.b > localaay.a()) localadd2.b = localaay.a();
/* 258 */       this.I -= localadd2.b - j;
/*     */     }
/*     */   }
/*     */   
/*     */   private aay c(int paramInt1, int paramInt2) {
/* 263 */     for (int j = 0; j < this.h.c.size(); j++) {
/* 264 */       aay localaay = (aay)this.h.c.get(j);
/* 265 */       if (a(localaay, paramInt1, paramInt2)) return localaay;
/*     */     }
/* 267 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 272 */     super.a(paramInt1, paramInt2, paramInt3);
/* 273 */     int j = paramInt3 == this.k.u.ae.i() + 100 ? 1 : 0;
/* 274 */     aay localaay = c(paramInt1, paramInt2);
/* 275 */     long l = bao.K();
/* 276 */     this.M = ((this.K == localaay) && (l - this.J < 250L) && (this.L == paramInt3));
/* 277 */     this.H = false;
/*     */     
/* 279 */     if ((paramInt3 == 0) || (paramInt3 == 1) || (j != 0)) {
/* 280 */       int k = this.i;
/* 281 */       int m = this.r;
/* 282 */       int n = (paramInt1 < k) || (paramInt2 < m) || (paramInt1 >= k + this.f) || (paramInt2 >= m + this.g) ? 1 : 0;
/*     */       
/* 284 */       int i1 = -1;
/* 285 */       if (localaay != null) { i1 = localaay.g;
/*     */       }
/* 287 */       if (n != 0) {
/* 288 */         i1 = 64537;
/*     */       }
/*     */       
/* 291 */       if ((this.k.u.y) && (n != 0) && (this.k.h.bm.o() == null)) {
/* 292 */         this.k.a(null);
/* 293 */         return;
/*     */       }
/*     */       
/* 296 */       if (i1 != -1) {
/* 297 */         if (this.k.u.y) {
/* 298 */           if ((localaay != null) && (localaay.e())) {
/* 299 */             this.v = localaay;
/* 300 */             this.x = null;
/* 301 */             this.w = (paramInt3 == 1);
/*     */           } else {
/* 303 */             this.v = null;
/*     */           }
/* 305 */         } else if (!this.t) {
/* 306 */           if (this.k.h.bm.o() == null) {
/* 307 */             if (paramInt3 == this.k.u.ae.i() + 100) {
/* 308 */               a(localaay, i1, paramInt3, 3);
/*     */             } else {
/* 310 */               int i2 = (i1 != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54))) ? 1 : 0;
/* 311 */               int i3 = 0;
/* 312 */               if (i2 != 0) {
/* 313 */                 this.N = ((localaay != null) && (localaay.e()) ? localaay.d() : null);
/* 314 */                 i3 = 1;
/* 315 */               } else if (i1 == 64537) {
/* 316 */                 i3 = 4;
/*     */               }
/* 318 */               a(localaay, i1, paramInt3, i3);
/*     */             }
/* 320 */             this.H = true;
/*     */           } else {
/* 322 */             this.t = true;
/* 323 */             this.G = paramInt3;
/* 324 */             this.s.clear();
/*     */             
/* 326 */             if (paramInt3 == 0) {
/* 327 */               this.F = 0;
/* 328 */             } else if (paramInt3 == 1) {
/* 329 */               this.F = 1;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 336 */     this.K = localaay;
/* 337 */     this.J = l;
/* 338 */     this.L = paramInt3;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, long paramLong)
/*     */   {
/* 343 */     aay localaay = c(paramInt1, paramInt2);
/* 344 */     add localadd = this.k.h.bm.o();
/*     */     
/* 346 */     if ((this.v != null) && (this.k.u.y)) {
/* 347 */       if ((paramInt3 == 0) || (paramInt3 == 1)) {
/* 348 */         if (this.x == null) {
/* 349 */           if (localaay != this.v) this.x = this.v.d().m();
/* 350 */         } else if ((this.x.b > 1) && (localaay != null) && (zs.a(localaay, this.x, false))) {
/* 351 */           long l = bao.K();
/*     */           
/* 353 */           if (this.D == localaay) {
/* 354 */             if (l - this.E > 500L) {
/* 355 */               a(this.v, this.v.g, 0, 0);
/* 356 */               a(localaay, localaay.g, 1, 0);
/* 357 */               a(this.v, this.v.g, 0, 0);
/* 358 */               this.E = (l + 750L);
/* 359 */               this.x.b -= 1;
/*     */             }
/*     */           } else {
/* 362 */             this.D = localaay;
/* 363 */             this.E = l;
/*     */           }
/*     */         }
/*     */       }
/* 367 */     } else if ((this.t) && (localaay != null) && (localadd != null) && (localadd.b > this.s.size()) && (zs.a(localaay, localadd, true)) && (localaay.a(localadd)) && (this.h.b(localaay)))
/*     */     {
/* 369 */       this.s.add(localaay);
/* 370 */       a();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 376 */     aay localaay1 = c(paramInt1, paramInt2);
/* 377 */     int j = this.i;
/* 378 */     int k = this.r;
/* 379 */     int m = (paramInt1 < j) || (paramInt2 < k) || (paramInt1 >= j + this.f) || (paramInt2 >= k + this.g) ? 1 : 0;
/*     */     
/* 381 */     int n = -1;
/* 382 */     if (localaay1 != null) { n = localaay1.g;
/*     */     }
/* 384 */     if (m != 0) {
/* 385 */       n = 64537;
/*     */     }
/*     */     aay localaay2;
/* 388 */     if ((this.M) && (localaay1 != null) && (paramInt3 == 0) && (this.h.a(null, localaay1))) { Iterator localIterator1;
/* 389 */       if (r()) {
/* 390 */         if ((localaay1 != null) && (localaay1.f != null) && (this.N != null)) {
/* 391 */           for (localIterator1 = this.h.c.iterator(); localIterator1.hasNext();) { localaay2 = (aay)localIterator1.next();
/* 392 */             if ((localaay2 != null) && (localaay2.a(this.k.h)) && (localaay2.e()) && (localaay2.f == localaay1.f) && (zs.a(localaay2, this.N, true)))
/*     */             {
/* 394 */               a(localaay2, localaay2.g, paramInt3, 1);
/*     */             }
/*     */           }
/*     */         }
/*     */       } else {
/* 399 */         a(localaay1, n, paramInt3, 6);
/*     */       }
/* 401 */       this.M = false;
/* 402 */       this.J = 0L;
/*     */     } else {
/* 404 */       if ((this.t) && (this.G != paramInt3)) {
/* 405 */         this.t = false;
/* 406 */         this.s.clear();
/* 407 */         this.H = true;
/* 408 */         return; }
/* 409 */       if (this.H) {
/* 410 */         this.H = false;
/* 411 */         return;
/*     */       }
/*     */       
/* 414 */       if ((this.v != null) && (this.k.u.y)) {
/* 415 */         if ((paramInt3 == 0) || (paramInt3 == 1)) {
/* 416 */           if ((this.x == null) && (localaay1 != this.v)) {
/* 417 */             this.x = this.v.d();
/*     */           }
/*     */           
/* 420 */           boolean bool = zs.a(localaay1, this.x, false);
/*     */           
/* 422 */           if ((n != -1) && (this.x != null) && (bool)) {
/* 423 */             a(this.v, this.v.g, paramInt3, 0);
/* 424 */             a(localaay1, n, 0, 0);
/*     */             
/* 426 */             if (this.k.h.bm.o() != null) {
/* 427 */               a(this.v, this.v.g, paramInt3, 0);
/* 428 */               this.y = (paramInt1 - j);
/* 429 */               this.z = (paramInt2 - k);
/* 430 */               this.A = this.v;
/* 431 */               this.C = this.x;
/* 432 */               this.B = bao.K();
/*     */             } else {
/* 434 */               this.C = null;
/*     */             }
/* 436 */           } else if (this.x != null) {
/* 437 */             this.y = (paramInt1 - j);
/* 438 */             this.z = (paramInt2 - k);
/* 439 */             this.A = this.v;
/* 440 */             this.C = this.x;
/* 441 */             this.B = bao.K();
/*     */           }
/*     */           
/* 444 */           this.x = null;
/* 445 */           this.v = null;
/*     */         }
/* 447 */       } else if ((this.t) && (!this.s.isEmpty())) {
/* 448 */         a(null, 64537, zs.d(0, this.F), 5);
/*     */         
/*     */ 
/* 451 */         for (Iterator localIterator2 = this.s.iterator(); localIterator2.hasNext();) { localaay2 = (aay)localIterator2.next();
/* 452 */           a(localaay2, localaay2.g, zs.d(1, this.F), 5);
/*     */         }
/*     */         
/* 455 */         a(null, 64537, zs.d(2, this.F), 5);
/*     */       }
/* 457 */       else if (this.k.h.bm.o() != null) {
/* 458 */         if (paramInt3 == this.k.u.ae.i() + 100) {
/* 459 */           a(localaay1, n, paramInt3, 3);
/*     */         } else {
/* 461 */           int i1 = (n != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54))) ? 1 : 0;
/* 462 */           if (i1 != 0) this.N = ((localaay1 != null) && (localaay1.e()) ? localaay1.d() : null);
/* 463 */           a(localaay1, n, paramInt3, i1 != 0 ? 1 : 0);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 468 */     if (this.k.h.bm.o() == null) {
/* 469 */       this.J = 0L;
/*     */     }
/*     */     
/* 472 */     this.t = false;
/*     */   }
/*     */   
/*     */   private boolean a(aay paramaay, int paramInt1, int paramInt2) {
/* 476 */     return c(paramaay.h, paramaay.i, 16, 16, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   protected boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 480 */     int j = this.i;
/* 481 */     int k = this.r;
/* 482 */     paramInt5 -= j;
/* 483 */     paramInt6 -= k;
/*     */     
/* 485 */     return (paramInt5 >= paramInt1 - 1) && (paramInt5 < paramInt1 + paramInt3 + 1) && (paramInt6 >= paramInt2 - 1) && (paramInt6 < paramInt2 + paramInt4 + 1);
/*     */   }
/*     */   
/*     */   protected void a(aay paramaay, int paramInt1, int paramInt2, int paramInt3) {
/* 489 */     if (paramaay != null) paramInt1 = paramaay.g;
/* 490 */     this.k.c.a(this.h.d, paramInt1, paramInt2, paramInt3, this.k.h);
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 495 */     if ((paramInt == 1) || (paramInt == this.k.u.aa.i())) {
/* 496 */       this.k.h.k();
/*     */     }
/*     */     
/* 499 */     b(paramInt);
/*     */     
/* 501 */     if ((this.u != null) && (this.u.e())) {
/* 502 */       if (paramInt == this.k.u.ae.i()) {
/* 503 */         a(this.u, this.u.g, 0, 3);
/* 504 */       } else if (paramInt == this.k.u.ac.i()) {
/* 505 */         a(this.u, this.u.g, q() ? 1 : 0, 4);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean b(int paramInt) {
/* 511 */     if ((this.k.h.bm.o() == null) && (this.u != null)) {
/* 512 */       for (int j = 0; j < 9; j++) {
/* 513 */         if (paramInt == this.k.u.ar[j].i()) {
/* 514 */           a(this.u, this.u.g, j, 2);
/* 515 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 520 */     return false;
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 525 */     if (this.k.h == null) return;
/* 526 */     this.h.b(this.k.h);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 531 */     return false;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 536 */     super.e();
/* 537 */     if ((!this.k.h.Z()) || (this.k.h.K)) this.k.h.k();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */