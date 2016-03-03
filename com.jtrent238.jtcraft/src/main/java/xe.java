/*     */ import java.util.Arrays;
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
/*     */ public class xe
/*     */   extends sa
/*     */ {
/*  32 */   private static final List d = Arrays.asList(new xf[] { new xf(new add(ade.T), 10).a(0.9F), new xf(new add(ade.aA), 10), new xf(new add(ade.aS), 10), new xf(new add(ade.bn), 10), new xf(new add(ade.F), 5), new xf(new add(ade.aM), 2).a(0.9F), new xf(new add(ade.z), 10), new xf(new add(ade.y), 5), new xf(new add(ade.aR, 10, 0), 1), new xf(new add(ajn.bC), 10), new xf(new add(ade.bh), 10) });
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
/*  45 */   private static final List e = Arrays.asList(new xf[] { new xf(new add(ajn.bi), 1), new xf(new add(ade.cb), 1), new xf(new add(ade.av), 1), new xf(new add(ade.f), 1).a(0.25F).a(), new xf(new add(ade.aM), 1).a(0.25F).a(), new xf(new add(ade.aG), 1).a() });
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  53 */   private static final List f = Arrays.asList(new xf[] { new xf(new add(ade.aP, 1, acu.a.a()), 60), new xf(new add(ade.aP, 1, acu.b.a()), 25), new xf(new add(ade.aP, 1, acu.c.a()), 2), new xf(new add(ade.aP, 1, acu.d.a()), 13) });
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  60 */   private int g = -1;
/*  61 */   private int h = -1;
/*  62 */   private int i = -1;
/*     */   private aji at;
/*     */   private boolean au;
/*     */   public int a;
/*     */   public yz b;
/*     */   private int av;
/*     */   private int aw;
/*     */   private int ax;
/*     */   private int ay;
/*     */   private int az;
/*     */   private float aA;
/*     */   
/*     */   public xe(ahb paramahb)
/*     */   {
/*  76 */     super(paramahb);
/*  77 */     a(0.25F, 0.25F);
/*  78 */     this.ak = true;
/*     */   }
/*     */   
/*     */   public xe(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, yz paramyz) {
/*  82 */     this(paramahb);
/*  83 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  84 */     this.ak = true;
/*  85 */     this.b = paramyz;
/*  86 */     paramyz.bK = this;
/*     */   }
/*     */   
/*     */   public xe(ahb paramahb, yz paramyz) {
/*  90 */     super(paramahb);
/*  91 */     this.ak = true;
/*  92 */     this.b = paramyz;
/*  93 */     this.b.bK = this;
/*     */     
/*  95 */     a(0.25F, 0.25F);
/*     */     
/*  97 */     b(paramyz.s, paramyz.t + 1.62D - paramyz.L, paramyz.u, paramyz.y, paramyz.z);
/*     */     
/*  99 */     this.s -= qh.b(this.y / 180.0F * 3.1415927F) * 0.16F;
/* 100 */     this.t -= 0.10000000149011612D;
/* 101 */     this.u -= qh.a(this.y / 180.0F * 3.1415927F) * 0.16F;
/* 102 */     b(this.s, this.t, this.u);
/* 103 */     this.L = 0.0F;
/*     */     
/* 105 */     float f1 = 0.4F;
/* 106 */     this.v = (-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/* 107 */     this.x = (qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/* 108 */     this.w = (-qh.a(this.z / 180.0F * 3.1415927F) * f1);
/*     */     
/* 110 */     c(this.v, this.w, this.x, 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public boolean a(double paramDouble)
/*     */   {
/* 119 */     double d1 = this.C.a() * 4.0D;
/* 120 */     d1 *= 64.0D;
/* 121 */     return paramDouble < d1 * d1;
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 125 */     float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/* 127 */     paramDouble1 /= f1;
/* 128 */     paramDouble2 /= f1;
/* 129 */     paramDouble3 /= f1;
/*     */     
/* 131 */     paramDouble1 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 132 */     paramDouble2 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/* 133 */     paramDouble3 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/* 135 */     paramDouble1 *= paramFloat1;
/* 136 */     paramDouble2 *= paramFloat1;
/* 137 */     paramDouble3 *= paramFloat1;
/*     */     
/* 139 */     this.v = paramDouble1;
/* 140 */     this.w = paramDouble2;
/* 141 */     this.x = paramDouble3;
/*     */     
/* 143 */     float f2 = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/* 145 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/* 146 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D));
/* 147 */     this.av = 0;
/*     */   }
/*     */   
/*     */   public sa c;
/*     */   private int aB;
/*     */   private double aC;
/*     */   private double aD;
/*     */   private double aE;
/*     */   
/* 156 */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) { this.aC = paramDouble1;
/* 157 */     this.aD = paramDouble2;
/* 158 */     this.aE = paramDouble3;
/* 159 */     this.aF = paramFloat1;
/* 160 */     this.aG = paramFloat2;
/*     */     
/* 162 */     this.aB = paramInt;
/*     */     
/* 164 */     this.v = this.aH;
/* 165 */     this.w = this.aI;
/* 166 */     this.x = this.aJ; }
/*     */   
/*     */   private double aF;
/*     */   private double aG;
/*     */   
/* 171 */   public void i(double paramDouble1, double paramDouble2, double paramDouble3) { this.aH = (this.v = paramDouble1);
/* 172 */     this.aI = (this.w = paramDouble2);
/* 173 */     this.aJ = (this.x = paramDouble3); }
/*     */   
/*     */   private double aH;
/*     */   private double aI;
/*     */   private double aJ;
/* 178 */   public void h() { super.h();
/*     */     
/* 180 */     if (this.aB > 0) {
/* 181 */       double d1 = this.s + (this.aC - this.s) / this.aB;
/* 182 */       double d2 = this.t + (this.aD - this.t) / this.aB;
/* 183 */       double d3 = this.u + (this.aE - this.u) / this.aB;
/*     */       
/* 185 */       double d5 = qh.g(this.aF - this.y);
/*     */       
/* 187 */       this.y = ((float)(this.y + d5 / this.aB));
/* 188 */       this.z = ((float)(this.z + (this.aG - this.z) / this.aB));
/*     */       
/* 190 */       this.aB -= 1;
/* 191 */       b(d1, d2, d3);
/* 192 */       b(this.y, this.z);
/* 193 */       return;
/*     */     }
/*     */     
/* 196 */     if (!this.o.E) {
/* 197 */       localObject1 = this.b.bF();
/* 198 */       if ((this.b.K) || (!this.b.Z()) || (localObject1 == null) || (((add)localObject1).b() != ade.aM) || (f(this.b) > 1024.0D)) {
/* 199 */         B();
/* 200 */         this.b.bK = null;
/* 201 */         return;
/*     */       }
/*     */       
/* 204 */       if (this.c != null) {
/* 205 */         if (this.c.K) { this.c = null;
/*     */         } else {
/* 207 */           this.s = this.c.s;
/* 208 */           this.t = (this.c.C.b + this.c.N * 0.8D);
/* 209 */           this.u = this.c.u;
/* 210 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 215 */     if (this.a > 0) { this.a -= 1;
/*     */     }
/* 217 */     if (this.au) {
/* 218 */       if (this.o.a(this.g, this.h, this.i) == this.at) {
/* 219 */         this.av += 1;
/* 220 */         if (this.av == 1200) B();
/* 221 */         return;
/*     */       }
/* 223 */       this.au = false;
/*     */       
/* 225 */       this.v *= this.Z.nextFloat() * 0.2F;
/* 226 */       this.w *= this.Z.nextFloat() * 0.2F;
/* 227 */       this.x *= this.Z.nextFloat() * 0.2F;
/* 228 */       this.av = 0;
/* 229 */       this.aw = 0;
/*     */     }
/*     */     else {
/* 232 */       this.aw += 1;
/*     */     }
/*     */     
/* 235 */     Object localObject1 = azw.a(this.s, this.t, this.u);
/* 236 */     azw localazw = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 237 */     azu localazu1 = this.o.a((azw)localObject1, localazw);
/*     */     
/* 239 */     localObject1 = azw.a(this.s, this.t, this.u);
/* 240 */     localazw = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 241 */     if (localazu1 != null) {
/* 242 */       localazw = azw.a(localazu1.f.a, localazu1.f.b, localazu1.f.c);
/*     */     }
/* 244 */     Object localObject2 = null;
/* 245 */     List localList = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 246 */     double d4 = 0.0D;
/* 247 */     for (int j = 0; j < localList.size(); j++) {
/* 248 */       sa localsa = (sa)localList.get(j);
/* 249 */       if ((localsa.R()) && ((localsa != this.b) || (this.aw >= 5)))
/*     */       {
/* 251 */         float f3 = 0.3F;
/* 252 */         azt localazt1 = localsa.C.b(f3, f3, f3);
/* 253 */         azu localazu2 = localazt1.a((azw)localObject1, localazw);
/* 254 */         if (localazu2 != null) {
/* 255 */           double d7 = ((azw)localObject1).d(localazu2.f);
/* 256 */           if ((d7 < d4) || (d4 == 0.0D)) {
/* 257 */             localObject2 = localsa;
/* 258 */             d4 = d7;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 263 */     if (localObject2 != null) {
/* 264 */       localazu1 = new azu((sa)localObject2);
/*     */     }
/*     */     
/* 267 */     if (localazu1 != null) {
/* 268 */       if (localazu1.g != null) {
/* 269 */         if (localazu1.g.a(ro.a(this, this.b), 0.0F)) {
/* 270 */           this.c = localazu1.g;
/*     */         }
/*     */       } else {
/* 273 */         this.au = true;
/*     */       }
/*     */     }
/*     */     
/* 277 */     if (this.au) { return;
/*     */     }
/* 279 */     d(this.v, this.w, this.x);
/*     */     
/* 281 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/* 282 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/* 283 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.1415927410125732D));
/*     */     
/* 285 */     while (this.z - this.B < -180.0F)
/* 286 */       this.B -= 360.0F;
/* 287 */     while (this.z - this.B >= 180.0F) {
/* 288 */       this.B += 360.0F;
/*     */     }
/* 290 */     while (this.y - this.A < -180.0F)
/* 291 */       this.A -= 360.0F;
/* 292 */     while (this.y - this.A >= 180.0F) {
/* 293 */       this.A += 360.0F;
/*     */     }
/* 295 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 296 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 298 */     float f2 = 0.92F;
/*     */     
/* 300 */     if ((this.D) || (this.E)) {
/* 301 */       f2 = 0.5F;
/*     */     }
/*     */     
/* 304 */     int k = 5;
/* 305 */     double d6 = 0.0D;
/* 306 */     for (int m = 0; m < k; m++) {
/* 307 */       double d9 = this.C.b + (this.C.e - this.C.b) * (m + 0) / k - 0.125D + 0.125D;
/* 308 */       double d10 = this.C.b + (this.C.e - this.C.b) * (m + 1) / k - 0.125D + 0.125D;
/* 309 */       azt localazt2 = azt.a(this.C.a, d9, this.C.c, this.C.d, d10, this.C.f);
/* 310 */       if (this.o.b(localazt2, awt.h)) {
/* 311 */         d6 += 1.0D / k;
/*     */       }
/*     */     }
/*     */     
/* 315 */     if ((!this.o.E) && (d6 > 0.0D)) {
/* 316 */       mt localmt = (mt)this.o;
/*     */       
/* 318 */       int n = 1;
/* 319 */       if ((this.Z.nextFloat() < 0.25F) && (this.o.y(qh.c(this.s), qh.c(this.t) + 1, qh.c(this.u)))) n = 2;
/* 320 */       if ((this.Z.nextFloat() < 0.5F) && (!this.o.i(qh.c(this.s), qh.c(this.t) + 1, qh.c(this.u)))) { n--;
/*     */       }
/* 322 */       if (this.ax > 0) {
/* 323 */         this.ax -= 1;
/*     */         
/* 325 */         if (this.ax <= 0) {
/* 326 */           this.ay = 0;
/* 327 */           this.az = 0; } } else { float f4;
/*     */         float f5;
/* 329 */         float f6; double d11; double d12; double d13; if (this.az > 0) {
/* 330 */           this.az -= n;
/*     */           
/* 332 */           if (this.az <= 0) {
/* 333 */             this.w -= 0.20000000298023224D;
/* 334 */             a("random.splash", 0.25F, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
/* 335 */             f4 = qh.c(this.C.b);
/* 336 */             localmt.a("bubble", this.s, f4 + 1.0F, this.u, (int)(1.0F + this.M * 20.0F), this.M, 0.0D, this.M, 0.20000000298023224D);
/* 337 */             localmt.a("wake", this.s, f4 + 1.0F, this.u, (int)(1.0F + this.M * 20.0F), this.M, 0.0D, this.M, 0.20000000298023224D);
/*     */             
/* 339 */             this.ax = qh.a(this.Z, 10, 30);
/*     */           } else {
/* 341 */             this.aA = ((float)(this.aA + this.Z.nextGaussian() * 4.0D));
/*     */             
/* 343 */             f4 = this.aA * 0.017453292F;
/* 344 */             f5 = qh.a(f4);
/* 345 */             f6 = qh.b(f4);
/* 346 */             d11 = this.s + f5 * this.az * 0.1F;
/* 347 */             d12 = qh.c(this.C.b) + 1.0F;
/* 348 */             d13 = this.u + f6 * this.az * 0.1F;
/*     */             
/* 350 */             if (this.Z.nextFloat() < 0.15F) {
/* 351 */               localmt.a("bubble", d11, d12 - 0.10000000149011612D, d13, 1, f5, 0.1D, f6, 0.0D);
/*     */             }
/*     */             
/* 354 */             float f7 = f5 * 0.04F;
/* 355 */             float f8 = f6 * 0.04F;
/*     */             
/* 357 */             localmt.a("wake", d11, d12, d13, 0, f8, 0.01D, -f7, 1.0D);
/* 358 */             localmt.a("wake", d11, d12, d13, 0, -f8, 0.01D, f7, 1.0D);
/*     */           }
/* 360 */         } else if (this.ay > 0) {
/* 361 */           this.ay -= n;
/*     */           
/* 363 */           f4 = 0.15F;
/*     */           
/* 365 */           if (this.ay < 20) {
/* 366 */             f4 = (float)(f4 + (20 - this.ay) * 0.05D);
/* 367 */           } else if (this.ay < 40) {
/* 368 */             f4 = (float)(f4 + (40 - this.ay) * 0.02D);
/* 369 */           } else if (this.ay < 60) {
/* 370 */             f4 = (float)(f4 + (60 - this.ay) * 0.01D);
/*     */           }
/*     */           
/* 373 */           if (this.Z.nextFloat() < f4) {
/* 374 */             f5 = qh.a(this.Z, 0.0F, 360.0F) * 0.017453292F;
/* 375 */             f6 = qh.a(this.Z, 25.0F, 60.0F);
/* 376 */             d11 = this.s + qh.a(f5) * f6 * 0.1F;
/* 377 */             d12 = qh.c(this.C.b) + 1.0F;
/* 378 */             d13 = this.u + qh.b(f5) * f6 * 0.1F;
/*     */             
/* 380 */             localmt.a("splash", d11, d12, d13, 2 + this.Z.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D);
/*     */           }
/*     */           
/* 383 */           if (this.ay <= 0) {
/* 384 */             this.aA = qh.a(this.Z, 0.0F, 360.0F);
/* 385 */             this.az = qh.a(this.Z, 20, 80);
/*     */           }
/*     */         } else {
/* 388 */           this.ay = qh.a(this.Z, 100, 900);
/* 389 */           this.ay -= afv.h(this.b) * 20 * 5;
/*     */         }
/*     */       }
/* 392 */       if (this.ax > 0) {
/* 393 */         this.w -= this.Z.nextFloat() * this.Z.nextFloat() * this.Z.nextFloat() * 0.2D;
/*     */       }
/*     */     }
/*     */     
/* 397 */     double d8 = d6 * 2.0D - 1.0D;
/* 398 */     this.w += 0.03999999910593033D * d8;
/* 399 */     if (d6 > 0.0D) {
/* 400 */       f2 = (float)(f2 * 0.9D);
/* 401 */       this.w *= 0.8D;
/*     */     }
/*     */     
/* 404 */     this.v *= f2;
/* 405 */     this.w *= f2;
/* 406 */     this.x *= f2;
/*     */     
/* 408 */     b(this.s, this.t, this.u);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 413 */     paramdh.a("xTile", (short)this.g);
/* 414 */     paramdh.a("yTile", (short)this.h);
/* 415 */     paramdh.a("zTile", (short)this.i);
/* 416 */     paramdh.a("inTile", (byte)aji.b(this.at));
/* 417 */     paramdh.a("shake", (byte)this.a);
/* 418 */     paramdh.a("inGround", (byte)(this.au ? 1 : 0));
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 423 */     this.g = paramdh.e("xTile");
/* 424 */     this.h = paramdh.e("yTile");
/* 425 */     this.i = paramdh.e("zTile");
/* 426 */     this.at = aji.e(paramdh.d("inTile") & 0xFF);
/* 427 */     this.a = (paramdh.d("shake") & 0xFF);
/* 428 */     this.au = (paramdh.d("inGround") == 1);
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 433 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public int e() {
/* 437 */     if (this.o.E) { return 0;
/*     */     }
/* 439 */     int j = 0;
/* 440 */     if (this.c != null) {
/* 441 */       double d1 = this.b.s - this.s;
/* 442 */       double d3 = this.b.t - this.t;
/* 443 */       double d5 = this.b.u - this.u;
/*     */       
/* 445 */       double d7 = qh.a(d1 * d1 + d3 * d3 + d5 * d5);
/* 446 */       double d9 = 0.1D;
/* 447 */       this.c.v += d1 * d9;
/* 448 */       this.c.w += d3 * d9 + qh.a(d7) * 0.08D;
/* 449 */       this.c.x += d5 * d9;
/* 450 */       j = 3;
/* 451 */     } else if (this.ax > 0) {
/* 452 */       xk localxk = new xk(this.o, this.s, this.t, this.u, f());
/* 453 */       double d2 = this.b.s - this.s;
/* 454 */       double d4 = this.b.t - this.t;
/* 455 */       double d6 = this.b.u - this.u;
/*     */       
/* 457 */       double d8 = qh.a(d2 * d2 + d4 * d4 + d6 * d6);
/* 458 */       double d10 = 0.1D;
/* 459 */       localxk.v = (d2 * d10);
/* 460 */       localxk.w = (d4 * d10 + qh.a(d8) * 0.08D);
/* 461 */       localxk.x = (d6 * d10);
/* 462 */       this.o.d(localxk);
/* 463 */       this.b.o.d(new sq(this.b.o, this.b.s, this.b.t + 0.5D, this.b.u + 0.5D, this.Z.nextInt(6) + 1));
/* 464 */       j = 1;
/*     */     }
/* 466 */     if (this.au) { j = 2;
/*     */     }
/* 468 */     B();
/* 469 */     this.b.bK = null;
/* 470 */     return j;
/*     */   }
/*     */   
/*     */   private add f() {
/* 474 */     float f1 = this.o.s.nextFloat();
/* 475 */     int j = afv.g(this.b);
/* 476 */     int k = afv.h(this.b);
/* 477 */     float f2 = 0.1F - j * 0.025F - k * 0.01F;
/* 478 */     float f3 = 0.05F + j * 0.01F - k * 0.01F;
/*     */     
/* 480 */     f2 = qh.a(f2, 0.0F, 1.0F);
/* 481 */     f3 = qh.a(f3, 0.0F, 1.0F);
/*     */     
/* 483 */     if (f1 < f2) {
/* 484 */       this.b.a(pp.A, 1);
/* 485 */       return ((xf)qv.a(this.Z, d)).a(this.Z);
/*     */     }
/* 487 */     f1 -= f2;
/*     */     
/* 489 */     if (f1 < f3) {
/* 490 */       this.b.a(pp.B, 1);
/* 491 */       return ((xf)qv.a(this.Z, e)).a(this.Z);
/*     */     }
/* 493 */     f1 -= f3;
/*     */     
/* 495 */     this.b.a(pp.z, 1);
/* 496 */     return ((xf)qv.a(this.Z, f)).a(this.Z);
/*     */   }
/*     */   
/*     */   public void B()
/*     */   {
/* 501 */     super.B();
/* 502 */     if (this.b != null) this.b.bK = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */