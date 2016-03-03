/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class xi
/*     */   extends sa
/*     */ {
/*  32 */   private boolean a = true;
/*  33 */   private double b = 0.07D;
/*     */   private int c;
/*     */   
/*  36 */   public xi(ahb paramahb) { super(paramahb);
/*  37 */     this.k = true;
/*  38 */     a(1.5F, 0.6F);
/*  39 */     this.L = (this.N / 2.0F);
/*     */   }
/*     */   
/*     */   private double d;
/*     */   protected boolean g_() {
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   private double e;
/*     */   private double f;
/*     */   protected void c() {
/*  50 */     this.af.a(17, new Integer(0));
/*  51 */     this.af.a(18, new Integer(1));
/*  52 */     this.af.a(19, new Float(0.0F));
/*     */   }
/*     */   
/*     */ 
/*     */   public azt h(sa paramsa)
/*     */   {
/*  58 */     return paramsa.C;
/*     */   }
/*     */   
/*     */   public azt J()
/*     */   {
/*  63 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean S()
/*     */   {
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   public xi(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  72 */     this(paramahb);
/*  73 */     b(paramDouble1, paramDouble2 + this.L, paramDouble3);
/*     */     
/*  75 */     this.v = 0.0D;
/*  76 */     this.w = 0.0D;
/*  77 */     this.x = 0.0D;
/*     */     
/*  79 */     this.p = paramDouble1;
/*  80 */     this.q = paramDouble2;
/*  81 */     this.r = paramDouble3;
/*     */   }
/*     */   
/*     */   public double ae()
/*     */   {
/*  86 */     return this.N * 0.0D - 0.30000001192092896D;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  91 */     if (aw()) return false;
/*  92 */     if ((this.o.E) || (this.K)) return true;
/*  93 */     c(-i());
/*  94 */     a(10);
/*  95 */     a(e() + paramFloat * 10.0F);
/*  96 */     Q();
/*  97 */     int j = ((paramro.j() instanceof yz)) && (((yz)paramro.j()).bE.d) ? 1 : 0;
/*  98 */     if ((j != 0) || (e() > 40.0F)) {
/*  99 */       if (this.l != null) this.l.a(this);
/* 100 */       if (j == 0) a(ade.az, 1, 0.0F);
/* 101 */       B();
/*     */     }
/* 103 */     return true;
/*     */   }
/*     */   
/*     */   public void aj()
/*     */   {
/* 108 */     c(-i());
/* 109 */     a(10);
/* 110 */     a(e() * 11.0F);
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/* 115 */     return !this.K;
/*     */   }
/*     */   
/*     */   private double g;
/*     */   private double h;
/*     */   private double i;
/*     */   private double at;
/*     */   private double au;
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
/* 124 */     if (this.a) {
/* 125 */       this.c = (paramInt + 5);
/*     */     } else {
/* 127 */       double d1 = paramDouble1 - this.s;
/* 128 */       double d2 = paramDouble2 - this.t;
/* 129 */       double d3 = paramDouble3 - this.u;
/* 130 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 132 */       if (d4 > 1.0D) {
/* 133 */         this.c = 3;
/*     */       } else {
/* 135 */         return;
/*     */       }
/*     */     }
/*     */     
/* 139 */     this.d = paramDouble1;
/* 140 */     this.e = paramDouble2;
/* 141 */     this.f = paramDouble3;
/* 142 */     this.g = paramFloat1;
/* 143 */     this.h = paramFloat2;
/*     */     
/* 145 */     this.v = this.i;
/* 146 */     this.w = this.at;
/* 147 */     this.x = this.au;
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 152 */     this.i = (this.v = paramDouble1);
/* 153 */     this.at = (this.w = paramDouble2);
/* 154 */     this.au = (this.x = paramDouble3);
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 159 */     super.h();
/* 160 */     if (f() > 0) a(f() - 1);
/* 161 */     if (e() > 0.0F) a(e() - 1.0F);
/* 162 */     this.p = this.s;
/* 163 */     this.q = this.t;
/* 164 */     this.r = this.u;
/*     */     
/* 166 */     int j = 5;
/* 167 */     double d1 = 0.0D;
/* 168 */     for (int k = 0; k < j; k++) {
/* 169 */       double d3 = this.C.b + (this.C.e - this.C.b) * (k + 0) / j - 0.125D;
/* 170 */       double d6 = this.C.b + (this.C.e - this.C.b) * (k + 1) / j - 0.125D;
/* 171 */       azt localazt = azt.a(this.C.a, d3, this.C.c, this.C.d, d6, this.C.f);
/* 172 */       if (this.o.b(localazt, awt.h)) {
/* 173 */         d1 += 1.0D / j;
/*     */       }
/*     */     }
/*     */     
/* 177 */     double d2 = Math.sqrt(this.v * this.v + this.x * this.x);
/*     */     double d4;
/* 179 */     double d7; if (d2 > 0.26249999999999996D) {
/* 180 */       d4 = Math.cos(this.y * 3.141592653589793D / 180.0D);
/* 181 */       d7 = Math.sin(this.y * 3.141592653589793D / 180.0D);
/*     */       
/* 183 */       for (int i1 = 0; i1 < 1.0D + d2 * 60.0D; i1++)
/*     */       {
/* 185 */         double d11 = this.Z.nextFloat() * 2.0F - 1.0F;
/*     */         
/* 187 */         double d14 = (this.Z.nextInt(2) * 2 - 1) * 0.7D;
/* 188 */         double d16; double d17; if (this.Z.nextBoolean()) {
/* 189 */           d16 = this.s - d4 * d11 * 0.8D + d7 * d14;
/* 190 */           d17 = this.u - d7 * d11 * 0.8D - d4 * d14;
/* 191 */           this.o.a("splash", d16, this.t - 0.125D, d17, this.v, this.w, this.x);
/*     */         } else {
/* 193 */           d16 = this.s + d4 + d7 * d11 * 0.7D;
/* 194 */           d17 = this.u + d7 - d4 * d11 * 0.7D;
/* 195 */           this.o.a("splash", d16, this.t - 0.125D, d17, this.v, this.w, this.x);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 200 */     if ((this.o.E) && (this.a)) { double d9;
/* 201 */       if (this.c > 0) {
/* 202 */         d4 = this.s + (this.d - this.s) / this.c;
/* 203 */         d7 = this.t + (this.e - this.t) / this.c;
/* 204 */         d9 = this.u + (this.f - this.u) / this.c;
/*     */         
/* 206 */         double d12 = qh.g(this.g - this.y);
/*     */         
/* 208 */         this.y = ((float)(this.y + d12 / this.c));
/* 209 */         this.z = ((float)(this.z + (this.h - this.z) / this.c));
/*     */         
/* 211 */         this.c -= 1;
/* 212 */         b(d4, d7, d9);
/* 213 */         b(this.y, this.z);
/*     */       } else {
/* 215 */         d4 = this.s + this.v;
/* 216 */         d7 = this.t + this.w;
/* 217 */         d9 = this.u + this.x;
/* 218 */         b(d4, d7, d9);
/* 219 */         if (this.D) {
/* 220 */           this.v *= 0.5D;
/* 221 */           this.w *= 0.5D;
/* 222 */           this.x *= 0.5D;
/*     */         }
/* 224 */         this.v *= 0.9900000095367432D;
/* 225 */         this.w *= 0.949999988079071D;
/* 226 */         this.x *= 0.9900000095367432D;
/*     */       }
/*     */       
/* 229 */       return;
/*     */     }
/*     */     
/* 232 */     if (d1 < 1.0D) {
/* 233 */       d4 = d1 * 2.0D - 1.0D;
/* 234 */       this.w += 0.03999999910593033D * d4;
/*     */     } else {
/* 236 */       if (this.w < 0.0D) this.w /= 2.0D;
/* 237 */       this.w += 0.007000000216066837D;
/*     */     }
/*     */     
/* 240 */     if ((this.l != null) && ((this.l instanceof sv))) {
/* 241 */       sv localsv = (sv)this.l;
/* 242 */       float f1 = this.l.y + -localsv.bd * 90.0F;
/* 243 */       this.v += -Math.sin(f1 * 3.1415927F / 180.0F) * this.b * localsv.be * 0.05000000074505806D;
/* 244 */       this.x += Math.cos(f1 * 3.1415927F / 180.0F) * this.b * localsv.be * 0.05000000074505806D;
/*     */     }
/*     */     
/* 247 */     double d5 = Math.sqrt(this.v * this.v + this.x * this.x);
/*     */     
/* 249 */     if (d5 > 0.35D) {
/* 250 */       d7 = 0.35D / d5;
/*     */       
/* 252 */       this.v *= d7;
/* 253 */       this.x *= d7;
/* 254 */       d5 = 0.35D;
/*     */     }
/*     */     
/* 257 */     if ((d5 > d2) && (this.b < 0.35D)) {
/* 258 */       this.b += (0.35D - this.b) / 35.0D;
/* 259 */       if (this.b > 0.35D) this.b = 0.35D;
/*     */     } else {
/* 261 */       this.b -= (this.b - 0.07D) / 35.0D;
/* 262 */       if (this.b < 0.07D) { this.b = 0.07D;
/*     */       }
/*     */     }
/* 265 */     for (int m = 0; m < 4; m++) {
/* 266 */       int n = qh.c(this.s + (m % 2 - 0.5D) * 0.8D);
/* 267 */       int i2 = qh.c(this.u + (m / 2 - 0.5D) * 0.8D);
/*     */       
/* 269 */       for (int i3 = 0; i3 < 2; i3++) {
/* 270 */         int i4 = qh.c(this.t) + i3;
/*     */         
/* 272 */         aji localaji = this.o.a(n, i4, i2);
/* 273 */         if (localaji == ajn.aC) {
/* 274 */           this.o.f(n, i4, i2);
/* 275 */           this.E = false;
/* 276 */         } else if (localaji == ajn.bi) {
/* 277 */           this.o.a(n, i4, i2, true);
/* 278 */           this.E = false;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 283 */     if (this.D) {
/* 284 */       this.v *= 0.5D;
/* 285 */       this.w *= 0.5D;
/* 286 */       this.x *= 0.5D;
/*     */     }
/* 288 */     d(this.v, this.w, this.x);
/*     */     
/* 290 */     if ((this.E) && (d2 > 0.2D)) {
/* 291 */       if ((!this.o.E) && (!this.K)) {
/* 292 */         B();
/* 293 */         for (m = 0; m < 3; m++) {
/* 294 */           a(adb.a(ajn.f), 1, 0.0F);
/*     */         }
/* 296 */         for (m = 0; m < 2; m++) {
/* 297 */           a(ade.y, 1, 0.0F);
/*     */         }
/*     */       }
/*     */     } else {
/* 301 */       this.v *= 0.9900000095367432D;
/* 302 */       this.w *= 0.949999988079071D;
/* 303 */       this.x *= 0.9900000095367432D;
/*     */     }
/*     */     
/* 306 */     this.z = 0.0F;
/* 307 */     double d8 = this.y;
/* 308 */     double d10 = this.p - this.s;
/* 309 */     double d13 = this.r - this.u;
/* 310 */     if (d10 * d10 + d13 * d13 > 0.001D) {
/* 311 */       d8 = (float)(Math.atan2(d13, d10) * 180.0D / 3.141592653589793D);
/*     */     }
/*     */     
/* 314 */     double d15 = qh.g(d8 - this.y);
/*     */     
/* 316 */     if (d15 > 20.0D) d15 = 20.0D;
/* 317 */     if (d15 < -20.0D) { d15 = -20.0D;
/*     */     }
/* 319 */     this.y = ((float)(this.y + d15));
/* 320 */     b(this.y, this.z);
/*     */     
/* 322 */     if (this.o.E) { return;
/*     */     }
/* 324 */     List localList = this.o.b(this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 325 */     if ((localList != null) && (!localList.isEmpty())) {
/* 326 */       for (int i5 = 0; i5 < localList.size(); i5++) {
/* 327 */         sa localsa = (sa)localList.get(i5);
/* 328 */         if ((localsa != this.l) && (localsa.S()) && ((localsa instanceof xi))) {
/* 329 */           localsa.g(this);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 334 */     if ((this.l != null) && 
/* 335 */       (this.l.K)) { this.l = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void ac()
/*     */   {
/* 341 */     if (this.l == null) { return;
/*     */     }
/* 343 */     double d1 = Math.cos(this.y * 3.141592653589793D / 180.0D) * 0.4D;
/* 344 */     double d2 = Math.sin(this.y * 3.141592653589793D / 180.0D) * 0.4D;
/* 345 */     this.l.b(this.s + d1, this.t + ae() + this.l.ad(), this.u + d2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void b(dh paramdh) {}
/*     */   
/*     */ 
/*     */   protected void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public float Y()
/*     */   {
/* 358 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean c(yz paramyz)
/*     */   {
/* 363 */     if ((this.l != null) && ((this.l instanceof yz)) && (this.l != paramyz)) return true;
/* 364 */     if (!this.o.E) {
/* 365 */       paramyz.a(this);
/*     */     }
/* 367 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(double paramDouble, boolean paramBoolean)
/*     */   {
/* 372 */     int j = qh.c(this.s);
/* 373 */     int k = qh.c(this.t);
/* 374 */     int m = qh.c(this.u);
/* 375 */     if (paramBoolean) {
/* 376 */       if (this.R > 3.0F) {
/* 377 */         b(this.R);
/* 378 */         if ((!this.o.E) && (!this.K)) {
/* 379 */           B();
/* 380 */           for (int n = 0; n < 3; n++) {
/* 381 */             a(adb.a(ajn.f), 1, 0.0F);
/*     */           }
/* 383 */           for (n = 0; n < 2; n++) {
/* 384 */             a(ade.y, 1, 0.0F);
/*     */           }
/*     */         }
/* 387 */         this.R = 0.0F;
/*     */       }
/* 389 */     } else if ((this.o.a(j, k - 1, m).o() != awt.h) && 
/* 390 */       (paramDouble < 0.0D)) this.R = ((float)(this.R - paramDouble));
/*     */   }
/*     */   
/*     */   public void a(float paramFloat)
/*     */   {
/* 395 */     this.af.b(19, Float.valueOf(paramFloat));
/*     */   }
/*     */   
/*     */   public float e() {
/* 399 */     return this.af.d(19);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 403 */     this.af.b(17, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int f() {
/* 407 */     return this.af.c(17);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 411 */     this.af.b(18, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int i() {
/* 415 */     return this.af.c(18);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(boolean paramBoolean)
/*     */   {
/* 423 */     this.a = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */