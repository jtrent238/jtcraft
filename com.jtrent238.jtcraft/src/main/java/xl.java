/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public abstract class xl
/*     */   extends sa
/*     */ {
/*     */   private boolean a;
/*     */   private String b;
/*     */   
/*     */   public xl(ahb paramahb)
/*     */   {
/*  42 */     super(paramahb);
/*  43 */     this.k = true;
/*  44 */     a(0.98F, 0.7F);
/*  45 */     this.L = (this.N / 2.0F);
/*     */   }
/*     */   
/*     */   public static xl a(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*  49 */     switch (paramInt) {
/*     */     case 1: 
/*  51 */       return new xm(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     case 2: 
/*  53 */       return new xq(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     case 3: 
/*  55 */       return new xv(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     case 4: 
/*  57 */       return new xt(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     case 5: 
/*  59 */       return new xr(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     case 6: 
/*  61 */       return new xn(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     }
/*  63 */     return new xs(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean g_()
/*     */   {
/*  69 */     return false;
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  74 */     this.af.a(17, new Integer(0));
/*  75 */     this.af.a(18, new Integer(1));
/*  76 */     this.af.a(19, new Float(0.0F));
/*  77 */     this.af.a(20, new Integer(0));
/*  78 */     this.af.a(21, new Integer(6));
/*  79 */     this.af.a(22, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public azt h(sa paramsa)
/*     */   {
/*  84 */     if (paramsa.S()) {
/*  85 */       return paramsa.C;
/*     */     }
/*  87 */     return null;
/*     */   }
/*     */   
/*     */   public azt J()
/*     */   {
/*  92 */     return null;
/*     */   }
/*     */   
/*     */   public boolean S()
/*     */   {
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public xl(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 101 */     this(paramahb);
/* 102 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/* 104 */     this.v = 0.0D;
/* 105 */     this.w = 0.0D;
/* 106 */     this.x = 0.0D;
/*     */     
/* 108 */     this.p = paramDouble1;
/* 109 */     this.q = paramDouble2;
/* 110 */     this.r = paramDouble3;
/*     */   }
/*     */   
/*     */   public double ae()
/*     */   {
/* 115 */     return this.N * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 120 */     if ((this.o.E) || (this.K)) return true;
/* 121 */     if (aw()) return false;
/* 122 */     j(-l());
/* 123 */     c(10);
/* 124 */     Q();
/* 125 */     a(j() + paramFloat * 10.0F);
/* 126 */     int j = ((paramro.j() instanceof yz)) && (((yz)paramro.j()).bE.d) ? 1 : 0;
/*     */     
/* 128 */     if ((j != 0) || (j() > 40.0F)) {
/* 129 */       if (this.l != null) { this.l.a(this);
/*     */       }
/* 131 */       if ((j == 0) || (k_())) {
/* 132 */         a(paramro);
/*     */       } else {
/* 134 */         B();
/*     */       }
/*     */     }
/* 137 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ro paramro) {
/* 141 */     B();
/* 142 */     add localadd = new add(ade.au, 1);
/* 143 */     if (this.b != null) localadd.c(this.b);
/* 144 */     a(localadd, 0.0F);
/*     */   }
/*     */   
/*     */   public void aj()
/*     */   {
/* 149 */     j(-l());
/* 150 */     c(10);
/* 151 */     a(j() + j() * 10.0F);
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/* 156 */     return !this.K;
/*     */   }
/*     */   
/*     */   public void B()
/*     */   {
/* 161 */     super.B();
/*     */   }
/*     */   
/*     */ 
/* 165 */   private static final int[][][] c = { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
/*     */   
/*     */   private int d;
/*     */   
/*     */   private double e;
/*     */   
/*     */   private double f;
/*     */   private double g;
/*     */   private double h;
/*     */   private double i;
/*     */   private double at;
/*     */   private double au;
/*     */   private double av;
/*     */   
/*     */   public void h()
/*     */   {
/* 181 */     if (k() > 0) c(k() - 1);
/* 182 */     if (j() > 0.0F) a(j() - 1.0F);
/* 183 */     if (this.t < -64.0D) {
/* 184 */       G();
/*     */     }
/*     */     
/* 187 */     if ((!this.o.E) && ((this.o instanceof mt))) {
/* 188 */       this.o.C.a("portal");
/* 189 */       MinecraftServer localMinecraftServer = ((mt)this.o).q();
/* 190 */       k = D();
/*     */       
/* 192 */       if (this.an) {
/* 193 */         if (localMinecraftServer.w()) {
/* 194 */           if ((this.m == null) && 
/* 195 */             (this.ao++ >= k)) {
/* 196 */             this.ao = k;
/* 197 */             this.am = ai();
/*     */             
/*     */             int m;
/*     */             
/* 201 */             if (this.o.t.i == -1) {
/* 202 */               m = 0;
/*     */             } else {
/* 204 */               m = -1;
/*     */             }
/*     */             
/* 207 */             b(m);
/*     */           }
/*     */           
/* 210 */           this.an = false;
/*     */         }
/*     */       } else {
/* 213 */         if (this.ao > 0) this.ao -= 4;
/* 214 */         if (this.ao < 0) this.ao = 0;
/*     */       }
/* 216 */       if (this.am > 0) this.am -= 1;
/* 217 */       this.o.C.b();
/*     */     }
/*     */     
/* 220 */     if (this.o.E) {
/* 221 */       if (this.d > 0) {
/* 222 */         double d1 = this.s + (this.e - this.s) / this.d;
/* 223 */         double d2 = this.t + (this.f - this.t) / this.d;
/* 224 */         double d4 = this.u + (this.g - this.u) / this.d;
/*     */         
/* 226 */         double d6 = qh.g(this.h - this.y);
/*     */         
/* 228 */         this.y = ((float)(this.y + d6 / this.d));
/* 229 */         this.z = ((float)(this.z + (this.i - this.z) / this.d));
/*     */         
/* 231 */         this.d -= 1;
/* 232 */         b(d1, d2, d4);
/* 233 */         b(this.y, this.z);
/*     */       } else {
/* 235 */         b(this.s, this.t, this.u);
/* 236 */         b(this.y, this.z);
/*     */       }
/*     */       
/* 239 */       return;
/*     */     }
/* 241 */     this.p = this.s;
/* 242 */     this.q = this.t;
/* 243 */     this.r = this.u;
/*     */     
/* 245 */     this.w -= 0.03999999910593033D;
/*     */     
/* 247 */     int j = qh.c(this.s);
/* 248 */     int k = qh.c(this.t);
/* 249 */     int n = qh.c(this.u);
/* 250 */     if (aje.b_(this.o, j, k - 1, n)) {
/* 251 */       k--;
/*     */     }
/*     */     
/* 254 */     double d3 = 0.4D;
/*     */     
/* 256 */     double d5 = 0.0078125D;
/*     */     
/* 258 */     aji localaji = this.o.a(j, k, n);
/* 259 */     if (aje.a(localaji)) {
/* 260 */       int i1 = this.o.e(j, k, n);
/* 261 */       a(j, k, n, d3, d5, localaji, i1);
/*     */       
/* 263 */       if (localaji == ajn.cc) {
/* 264 */         a(j, k, n, (i1 & 0x8) != 0);
/*     */       }
/*     */     } else {
/* 267 */       b(d3);
/*     */     }
/*     */     
/* 270 */     I();
/*     */     
/* 272 */     this.z = 0.0F;
/* 273 */     double d7 = this.p - this.s;
/* 274 */     double d8 = this.r - this.u;
/* 275 */     if (d7 * d7 + d8 * d8 > 0.001D) {
/* 276 */       this.y = ((float)(Math.atan2(d8, d7) * 180.0D / 3.141592653589793D));
/* 277 */       if (this.a) { this.y += 180.0F;
/*     */       }
/*     */     }
/* 280 */     double d9 = qh.g(this.y - this.A);
/* 281 */     if ((d9 < -170.0D) || (d9 >= 170.0D)) {
/* 282 */       this.y += 180.0F;
/* 283 */       this.a = (!this.a);
/*     */     }
/* 285 */     b(this.y, this.z);
/*     */     
/* 287 */     List localList = this.o.b(this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 288 */     if ((localList != null) && (!localList.isEmpty())) {
/* 289 */       for (int i2 = 0; i2 < localList.size(); i2++) {
/* 290 */         sa localsa = (sa)localList.get(i2);
/* 291 */         if ((localsa != this.l) && (localsa.S()) && ((localsa instanceof xl))) {
/* 292 */           localsa.g(this);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 297 */     if ((this.l != null) && 
/* 298 */       (this.l.K)) {
/* 299 */       if (this.l.m == this) {
/* 300 */         this.l.m = null;
/*     */       }
/* 302 */       this.l = null;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
/*     */   
/*     */   protected void b(double paramDouble)
/*     */   {
/* 311 */     if (this.v < -paramDouble) this.v = (-paramDouble);
/* 312 */     if (this.v > paramDouble) this.v = paramDouble;
/* 313 */     if (this.x < -paramDouble) this.x = (-paramDouble);
/* 314 */     if (this.x > paramDouble) this.x = paramDouble;
/* 315 */     if (this.D) {
/* 316 */       this.v *= 0.5D;
/* 317 */       this.w *= 0.5D;
/* 318 */       this.x *= 0.5D;
/*     */     }
/* 320 */     d(this.v, this.w, this.x);
/*     */     
/* 322 */     if (!this.D) {
/* 323 */       this.v *= 0.949999988079071D;
/* 324 */       this.w *= 0.949999988079071D;
/* 325 */       this.x *= 0.949999988079071D;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, aji paramaji, int paramInt4) {
/* 330 */     this.R = 0.0F;
/*     */     
/* 332 */     azw localazw1 = a(this.s, this.t, this.u);
/* 333 */     this.t = paramInt2;
/*     */     
/* 335 */     int j = 0;
/* 336 */     int k = 0;
/* 337 */     if (paramaji == ajn.D) {
/* 338 */       j = (paramInt4 & 0x8) != 0 ? 1 : 0;
/* 339 */       k = j == 0 ? 1 : 0;
/*     */     }
/* 341 */     if (((aje)paramaji).e()) {
/* 342 */       paramInt4 &= 0x7;
/*     */     }
/*     */     
/* 345 */     if ((paramInt4 >= 2) && (paramInt4 <= 5)) {
/* 346 */       this.t = (paramInt2 + 1);
/*     */     }
/*     */     
/* 349 */     if (paramInt4 == 2) this.v -= paramDouble2;
/* 350 */     if (paramInt4 == 3) this.v += paramDouble2;
/* 351 */     if (paramInt4 == 4) this.x += paramDouble2;
/* 352 */     if (paramInt4 == 5) { this.x -= paramDouble2;
/*     */     }
/* 354 */     int[][] arrayOfInt = c[paramInt4];
/*     */     
/* 356 */     double d1 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 357 */     double d2 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 358 */     double d3 = Math.sqrt(d1 * d1 + d2 * d2);
/*     */     
/* 360 */     double d4 = this.v * d1 + this.x * d2;
/* 361 */     if (d4 < 0.0D) {
/* 362 */       d1 = -d1;
/* 363 */       d2 = -d2;
/*     */     }
/*     */     
/* 366 */     double d5 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 367 */     if (d5 > 2.0D) {
/* 368 */       d5 = 2.0D;
/*     */     }
/*     */     
/* 371 */     this.v = (d5 * d1 / d3);
/* 372 */     this.x = (d5 * d2 / d3);
/*     */     
/* 374 */     if ((this.l != null) && ((this.l instanceof sv))) {
/* 375 */       d6 = ((sv)this.l).be;
/*     */       
/* 377 */       if (d6 > 0.0D) {
/* 378 */         d7 = -Math.sin(this.l.y * 3.1415927F / 180.0F);
/* 379 */         d8 = Math.cos(this.l.y * 3.1415927F / 180.0F);
/*     */         
/* 381 */         d9 = this.v * this.v + this.x * this.x;
/*     */         
/* 383 */         if (d9 < 0.01D) {
/* 384 */           this.v += d7 * 0.1D;
/* 385 */           this.x += d8 * 0.1D;
/*     */           
/* 387 */           k = 0;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 393 */     if (k != 0) {
/* 394 */       d6 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 395 */       if (d6 < 0.03D) {
/* 396 */         this.v *= 0.0D;
/* 397 */         this.w *= 0.0D;
/* 398 */         this.x *= 0.0D;
/*     */       } else {
/* 400 */         this.v *= 0.5D;
/* 401 */         this.w *= 0.0D;
/* 402 */         this.x *= 0.5D;
/*     */       }
/*     */     }
/*     */     
/* 406 */     double d6 = 0.0D;
/* 407 */     double d7 = paramInt1 + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 408 */     double d8 = paramInt3 + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 409 */     double d9 = paramInt1 + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 410 */     double d10 = paramInt3 + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */     
/* 412 */     d1 = d9 - d7;
/* 413 */     d2 = d10 - d8;
/*     */     
/* 415 */     if (d1 == 0.0D) {
/* 416 */       this.s = (paramInt1 + 0.5D);
/* 417 */       d6 = this.u - paramInt3;
/* 418 */     } else if (d2 == 0.0D) {
/* 419 */       this.u = (paramInt3 + 0.5D);
/* 420 */       d6 = this.s - paramInt1;
/*     */     }
/*     */     else {
/* 423 */       d11 = this.s - d7;
/* 424 */       d12 = this.u - d8;
/*     */       
/* 426 */       d6 = (d11 * d1 + d12 * d2) * 2.0D;
/*     */     }
/*     */     
/* 429 */     this.s = (d7 + d1 * d6);
/* 430 */     this.u = (d8 + d2 * d6);
/*     */     
/* 432 */     b(this.s, this.t + this.L, this.u);
/*     */     
/* 434 */     double d11 = this.v;
/* 435 */     double d12 = this.x;
/* 436 */     if (this.l != null) {
/* 437 */       d11 *= 0.75D;
/* 438 */       d12 *= 0.75D;
/*     */     }
/* 440 */     if (d11 < -paramDouble1) d11 = -paramDouble1;
/* 441 */     if (d11 > paramDouble1) d11 = paramDouble1;
/* 442 */     if (d12 < -paramDouble1) d12 = -paramDouble1;
/* 443 */     if (d12 > paramDouble1) { d12 = paramDouble1;
/*     */     }
/* 445 */     d(d11, 0.0D, d12);
/*     */     
/* 447 */     if ((arrayOfInt[0][1] != 0) && (qh.c(this.s) - paramInt1 == arrayOfInt[0][0]) && (qh.c(this.u) - paramInt3 == arrayOfInt[0][2])) {
/* 448 */       b(this.s, this.t + arrayOfInt[0][1], this.u);
/* 449 */     } else if ((arrayOfInt[1][1] != 0) && (qh.c(this.s) - paramInt1 == arrayOfInt[1][0]) && (qh.c(this.u) - paramInt3 == arrayOfInt[1][2])) {
/* 450 */       b(this.s, this.t + arrayOfInt[1][1], this.u);
/*     */     }
/*     */     
/* 453 */     i();
/*     */     
/* 455 */     azw localazw2 = a(this.s, this.t, this.u);
/* 456 */     if ((localazw2 != null) && (localazw1 != null)) {
/* 457 */       double d13 = (localazw1.b - localazw2.b) * 0.05D;
/*     */       
/* 459 */       d5 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 460 */       if (d5 > 0.0D) {
/* 461 */         this.v = (this.v / d5 * (d5 + d13));
/* 462 */         this.x = (this.x / d5 * (d5 + d13));
/*     */       }
/* 464 */       b(this.s, localazw2.b, this.u);
/*     */     }
/*     */     
/* 467 */     int m = qh.c(this.s);
/* 468 */     int n = qh.c(this.u);
/* 469 */     if ((m != paramInt1) || (n != paramInt3)) {
/* 470 */       d5 = Math.sqrt(this.v * this.v + this.x * this.x);
/*     */       
/* 472 */       this.v = (d5 * (m - paramInt1));
/* 473 */       this.x = (d5 * (n - paramInt3));
/*     */     }
/*     */     
/*     */ 
/* 477 */     if (j != 0) {
/* 478 */       double d14 = Math.sqrt(this.v * this.v + this.x * this.x);
/* 479 */       if (d14 > 0.01D) {
/* 480 */         double d15 = 0.06D;
/* 481 */         this.v += this.v / d14 * d15;
/* 482 */         this.x += this.x / d14 * d15;
/*     */ 
/*     */ 
/*     */       }
/* 486 */       else if (paramInt4 == 1) {
/* 487 */         if (this.o.a(paramInt1 - 1, paramInt2, paramInt3).r()) {
/* 488 */           this.v = 0.02D;
/* 489 */         } else if (this.o.a(paramInt1 + 1, paramInt2, paramInt3).r()) {
/* 490 */           this.v = -0.02D;
/*     */         }
/* 492 */       } else if (paramInt4 == 0) {
/* 493 */         if (this.o.a(paramInt1, paramInt2, paramInt3 - 1).r()) {
/* 494 */           this.x = 0.02D;
/* 495 */         } else if (this.o.a(paramInt1, paramInt2, paramInt3 + 1).r()) {
/* 496 */           this.x = -0.02D;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void i()
/*     */   {
/* 504 */     if (this.l != null) {
/* 505 */       this.v *= 0.996999979019165D;
/* 506 */       this.w *= 0.0D;
/* 507 */       this.x *= 0.996999979019165D;
/*     */     } else {
/* 509 */       this.v *= 0.9599999785423279D;
/* 510 */       this.w *= 0.0D;
/* 511 */       this.x *= 0.9599999785423279D;
/*     */     }
/*     */   }
/*     */   
/*     */   public azw a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 516 */     int j = qh.c(paramDouble1);
/* 517 */     int k = qh.c(paramDouble2);
/* 518 */     int m = qh.c(paramDouble3);
/* 519 */     if (aje.b_(this.o, j, k - 1, m)) {
/* 520 */       k--;
/*     */     }
/*     */     
/* 523 */     aji localaji = this.o.a(j, k, m);
/* 524 */     if (aje.a(localaji)) {
/* 525 */       int n = this.o.e(j, k, m);
/*     */       
/* 527 */       if (((aje)localaji).e()) {
/* 528 */         n &= 0x7;
/*     */       }
/*     */       
/* 531 */       paramDouble2 = k;
/* 532 */       if ((n >= 2) && (n <= 5)) {
/* 533 */         paramDouble2 = k + 1;
/*     */       }
/*     */       
/* 536 */       int[][] arrayOfInt = c[n];
/*     */       
/* 538 */       double d1 = arrayOfInt[1][0] - arrayOfInt[0][0];
/* 539 */       double d2 = arrayOfInt[1][2] - arrayOfInt[0][2];
/* 540 */       double d3 = Math.sqrt(d1 * d1 + d2 * d2);
/* 541 */       d1 /= d3;
/* 542 */       d2 /= d3;
/*     */       
/* 544 */       paramDouble1 += d1 * paramDouble4;
/* 545 */       paramDouble3 += d2 * paramDouble4;
/*     */       
/* 547 */       if ((arrayOfInt[0][1] != 0) && (qh.c(paramDouble1) - j == arrayOfInt[0][0]) && (qh.c(paramDouble3) - m == arrayOfInt[0][2])) {
/* 548 */         paramDouble2 += arrayOfInt[0][1];
/* 549 */       } else if ((arrayOfInt[1][1] != 0) && (qh.c(paramDouble1) - j == arrayOfInt[1][0]) && (qh.c(paramDouble3) - m == arrayOfInt[1][2])) {
/* 550 */         paramDouble2 += arrayOfInt[1][1];
/*     */       }
/*     */       
/* 553 */       return a(paramDouble1, paramDouble2, paramDouble3);
/*     */     }
/* 555 */     return null;
/*     */   }
/*     */   
/*     */   public azw a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 559 */     int j = qh.c(paramDouble1);
/* 560 */     int k = qh.c(paramDouble2);
/* 561 */     int m = qh.c(paramDouble3);
/* 562 */     if (aje.b_(this.o, j, k - 1, m)) {
/* 563 */       k--;
/*     */     }
/*     */     
/* 566 */     aji localaji = this.o.a(j, k, m);
/* 567 */     if (aje.a(localaji)) {
/* 568 */       int n = this.o.e(j, k, m);
/* 569 */       paramDouble2 = k;
/*     */       
/* 571 */       if (((aje)localaji).e()) {
/* 572 */         n &= 0x7;
/*     */       }
/*     */       
/* 575 */       if ((n >= 2) && (n <= 5)) {
/* 576 */         paramDouble2 = k + 1;
/*     */       }
/*     */       
/* 579 */       int[][] arrayOfInt = c[n];
/*     */       
/* 581 */       double d1 = 0.0D;
/* 582 */       double d2 = j + 0.5D + arrayOfInt[0][0] * 0.5D;
/* 583 */       double d3 = k + 0.5D + arrayOfInt[0][1] * 0.5D;
/* 584 */       double d4 = m + 0.5D + arrayOfInt[0][2] * 0.5D;
/* 585 */       double d5 = j + 0.5D + arrayOfInt[1][0] * 0.5D;
/* 586 */       double d6 = k + 0.5D + arrayOfInt[1][1] * 0.5D;
/* 587 */       double d7 = m + 0.5D + arrayOfInt[1][2] * 0.5D;
/*     */       
/* 589 */       double d8 = d5 - d2;
/* 590 */       double d9 = (d6 - d3) * 2.0D;
/* 591 */       double d10 = d7 - d4;
/*     */       
/* 593 */       if (d8 == 0.0D) {
/* 594 */         paramDouble1 = j + 0.5D;
/* 595 */         d1 = paramDouble3 - m;
/* 596 */       } else if (d10 == 0.0D) {
/* 597 */         paramDouble3 = m + 0.5D;
/* 598 */         d1 = paramDouble1 - j;
/*     */       }
/*     */       else {
/* 601 */         double d11 = paramDouble1 - d2;
/* 602 */         double d12 = paramDouble3 - d4;
/*     */         
/* 604 */         d1 = (d11 * d8 + d12 * d10) * 2.0D;
/*     */       }
/*     */       
/* 607 */       paramDouble1 = d2 + d8 * d1;
/* 608 */       paramDouble2 = d3 + d9 * d1;
/* 609 */       paramDouble3 = d4 + d10 * d1;
/* 610 */       if (d9 < 0.0D) paramDouble2 += 1.0D;
/* 611 */       if (d9 > 0.0D) paramDouble2 += 0.5D;
/* 612 */       return azw.a(paramDouble1, paramDouble2, paramDouble3);
/*     */     }
/* 614 */     return null;
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 619 */     if (paramdh.n("CustomDisplayTile")) {
/* 620 */       k(paramdh.f("DisplayTile"));
/* 621 */       l(paramdh.f("DisplayData"));
/* 622 */       m(paramdh.f("DisplayOffset"));
/*     */     }
/*     */     
/* 625 */     if ((paramdh.b("CustomName", 8)) && (paramdh.j("CustomName").length() > 0)) this.b = paramdh.j("CustomName");
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 630 */     if (t()) {
/* 631 */       paramdh.a("CustomDisplayTile", true);
/* 632 */       paramdh.a("DisplayTile", n().o() == awt.a ? 0 : aji.b(n()));
/* 633 */       paramdh.a("DisplayData", p());
/* 634 */       paramdh.a("DisplayOffset", r());
/*     */     }
/*     */     
/* 637 */     if ((this.b != null) && (this.b.length() > 0)) paramdh.a("CustomName", this.b);
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 642 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void g(sa paramsa)
/*     */   {
/* 647 */     if (this.o.E) { return;
/*     */     }
/* 649 */     if (paramsa == this.l) return;
/* 650 */     if (((paramsa instanceof sv)) && (!(paramsa instanceof yz)) && (!(paramsa instanceof wt)) && (m() == 0) && (this.v * this.v + this.x * this.x > 0.01D) && 
/* 651 */       (this.l == null) && (paramsa.m == null)) {
/* 652 */       paramsa.a(this);
/*     */     }
/*     */     
/*     */ 
/* 656 */     double d1 = paramsa.s - this.s;
/* 657 */     double d2 = paramsa.u - this.u;
/*     */     
/* 659 */     double d3 = d1 * d1 + d2 * d2;
/* 660 */     if (d3 >= 9.999999747378752E-5D) {
/* 661 */       d3 = qh.a(d3);
/* 662 */       d1 /= d3;
/* 663 */       d2 /= d3;
/* 664 */       double d4 = 1.0D / d3;
/* 665 */       if (d4 > 1.0D) d4 = 1.0D;
/* 666 */       d1 *= d4;
/* 667 */       d2 *= d4;
/* 668 */       d1 *= 0.10000000149011612D;
/* 669 */       d2 *= 0.10000000149011612D;
/*     */       
/* 671 */       d1 *= (1.0F - this.Y);
/* 672 */       d2 *= (1.0F - this.Y);
/* 673 */       d1 *= 0.5D;
/* 674 */       d2 *= 0.5D;
/*     */       
/* 676 */       if ((paramsa instanceof xl)) {
/* 677 */         double d5 = paramsa.s - this.s;
/* 678 */         double d6 = paramsa.u - this.u;
/*     */         
/* 680 */         azw localazw1 = azw.a(d5, 0.0D, d6).a();
/* 681 */         azw localazw2 = azw.a(qh.b(this.y * 3.1415927F / 180.0F), 0.0D, qh.a(this.y * 3.1415927F / 180.0F)).a();
/*     */         
/* 683 */         double d7 = Math.abs(localazw1.b(localazw2));
/*     */         
/* 685 */         if (d7 < 0.800000011920929D) {
/* 686 */           return;
/*     */         }
/*     */         
/* 689 */         double d8 = paramsa.v + this.v;
/* 690 */         double d9 = paramsa.x + this.x;
/*     */         
/* 692 */         if ((((xl)paramsa).m() == 2) && (m() != 2)) {
/* 693 */           this.v *= 0.20000000298023224D;
/* 694 */           this.x *= 0.20000000298023224D;
/* 695 */           g(paramsa.v - d1, 0.0D, paramsa.x - d2);
/* 696 */           paramsa.v *= 0.949999988079071D;
/* 697 */           paramsa.x *= 0.949999988079071D;
/* 698 */         } else if ((((xl)paramsa).m() != 2) && (m() == 2)) {
/* 699 */           paramsa.v *= 0.20000000298023224D;
/* 700 */           paramsa.x *= 0.20000000298023224D;
/* 701 */           paramsa.g(this.v + d1, 0.0D, this.x + d2);
/* 702 */           this.v *= 0.949999988079071D;
/* 703 */           this.x *= 0.949999988079071D;
/*     */         } else {
/* 705 */           d8 /= 2.0D;
/* 706 */           d9 /= 2.0D;
/* 707 */           this.v *= 0.20000000298023224D;
/* 708 */           this.x *= 0.20000000298023224D;
/* 709 */           g(d8 - d1, 0.0D, d9 - d2);
/* 710 */           paramsa.v *= 0.20000000298023224D;
/* 711 */           paramsa.x *= 0.20000000298023224D;
/* 712 */           paramsa.g(d8 + d1, 0.0D, d9 + d2);
/*     */         }
/*     */       }
/*     */       else {
/* 716 */         g(-d1, 0.0D, -d2);
/* 717 */         paramsa.g(d1 / 4.0D, 0.0D, d2 / 4.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt)
/*     */   {
/* 728 */     this.e = paramDouble1;
/* 729 */     this.f = paramDouble2;
/* 730 */     this.g = paramDouble3;
/* 731 */     this.h = paramFloat1;
/* 732 */     this.i = paramFloat2;
/*     */     
/* 734 */     this.d = (paramInt + 2);
/*     */     
/* 736 */     this.v = this.at;
/* 737 */     this.w = this.au;
/* 738 */     this.x = this.av;
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 743 */     this.at = (this.v = paramDouble1);
/* 744 */     this.au = (this.w = paramDouble2);
/* 745 */     this.av = (this.x = paramDouble3);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 749 */     this.af.b(19, Float.valueOf(paramFloat));
/*     */   }
/*     */   
/*     */   public float j() {
/* 753 */     return this.af.d(19);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 757 */     this.af.b(17, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int k() {
/* 761 */     return this.af.c(17);
/*     */   }
/*     */   
/*     */   public void j(int paramInt) {
/* 765 */     this.af.b(18, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int l() {
/* 769 */     return this.af.c(18);
/*     */   }
/*     */   
/*     */   public abstract int m();
/*     */   
/*     */   public aji n() {
/* 775 */     if (!t()) return o();
/* 776 */     int j = z().c(20) & 0xFFFF;
/* 777 */     return aji.e(j);
/*     */   }
/*     */   
/*     */   public aji o() {
/* 781 */     return ajn.a;
/*     */   }
/*     */   
/*     */   public int p() {
/* 785 */     if (!t()) return q();
/* 786 */     return z().c(20) >> 16;
/*     */   }
/*     */   
/*     */   public int q() {
/* 790 */     return 0;
/*     */   }
/*     */   
/*     */   public int r() {
/* 794 */     if (!t()) return s();
/* 795 */     return z().c(21);
/*     */   }
/*     */   
/*     */   public int s() {
/* 799 */     return 6;
/*     */   }
/*     */   
/*     */   public void k(int paramInt) {
/* 803 */     z().b(20, Integer.valueOf(paramInt & 0xFFFF | p() << 16));
/* 804 */     a(true);
/*     */   }
/*     */   
/*     */   public void l(int paramInt)
/*     */   {
/* 809 */     z().b(20, Integer.valueOf(aji.b(n()) & 0xFFFF | paramInt << 16));
/* 810 */     a(true);
/*     */   }
/*     */   
/*     */   public void m(int paramInt) {
/* 814 */     z().b(21, Integer.valueOf(paramInt));
/* 815 */     a(true);
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 819 */     return z().a(22) == 1;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 823 */     z().b(22, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 827 */     this.b = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public String b_()
/*     */   {
/* 833 */     if (this.b != null) return this.b;
/* 834 */     return super.b_();
/*     */   }
/*     */   
/*     */   public boolean k_() {
/* 838 */     return this.b != null;
/*     */   }
/*     */   
/*     */   public String u() {
/* 842 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */