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
/*     */ 
/*     */ public class zc
/*     */   extends sa
/*     */   implements zh
/*     */ {
/*  34 */   private int d = -1;
/*  35 */   private int e = -1;
/*  36 */   private int f = -1;
/*     */   private aji g;
/*     */   private int h;
/*     */   private boolean i;
/*     */   public int a;
/*     */   public int b;
/*     */   public sa c;
/*     */   private int at;
/*     */   private int au;
/*  45 */   private double av = 2.0D;
/*     */   private int aw;
/*     */   
/*     */   public zc(ahb paramahb)
/*     */   {
/*  50 */     super(paramahb);
/*  51 */     this.j = 10.0D;
/*  52 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public zc(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  56 */     super(paramahb);
/*  57 */     this.j = 10.0D;
/*     */     
/*  59 */     a(0.5F, 0.5F);
/*     */     
/*  61 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  62 */     this.L = 0.0F;
/*     */   }
/*     */   
/*     */   public zc(ahb paramahb, sv paramsv1, sv paramsv2, float paramFloat1, float paramFloat2) {
/*  66 */     super(paramahb);
/*  67 */     this.j = 10.0D;
/*  68 */     this.c = paramsv1;
/*  69 */     if ((paramsv1 instanceof yz)) { this.a = 1;
/*     */     }
/*  71 */     this.t = (paramsv1.t + paramsv1.g() - 0.10000000149011612D);
/*     */     
/*  73 */     double d1 = paramsv2.s - paramsv1.s;
/*  74 */     double d2 = paramsv2.C.b + paramsv2.N / 3.0F - this.t;
/*  75 */     double d3 = paramsv2.u - paramsv1.u;
/*  76 */     double d4 = qh.a(d1 * d1 + d3 * d3);
/*  77 */     if (d4 < 1.0E-7D) { return;
/*     */     }
/*  79 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/*  80 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/*     */     
/*  82 */     double d5 = d1 / d4;
/*  83 */     double d6 = d3 / d4;
/*  84 */     b(paramsv1.s + d5, this.t, paramsv1.u + d6, f1, f2);
/*  85 */     this.L = 0.0F;
/*     */     
/*  87 */     float f3 = (float)d4 * 0.2F;
/*  88 */     c(d1, d2 + f3, d3, paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   public zc(ahb paramahb, sv paramsv, float paramFloat) {
/*  92 */     super(paramahb);
/*  93 */     this.j = 10.0D;
/*  94 */     this.c = paramsv;
/*  95 */     if ((paramsv instanceof yz)) { this.a = 1;
/*     */     }
/*  97 */     a(0.5F, 0.5F);
/*     */     
/*  99 */     b(paramsv.s, paramsv.t + paramsv.g(), paramsv.u, paramsv.y, paramsv.z);
/*     */     
/* 101 */     this.s -= qh.b(this.y / 180.0F * 3.1415927F) * 0.16F;
/* 102 */     this.t -= 0.10000000149011612D;
/* 103 */     this.u -= qh.a(this.y / 180.0F * 3.1415927F) * 0.16F;
/* 104 */     b(this.s, this.t, this.u);
/* 105 */     this.L = 0.0F;
/*     */     
/* 107 */     this.v = (-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F));
/* 108 */     this.x = (qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F));
/* 109 */     this.w = (-qh.a(this.z / 180.0F * 3.1415927F));
/*     */     
/* 111 */     c(this.v, this.w, this.x, paramFloat * 1.5F, 1.0F);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/* 116 */     this.af.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/* 121 */     float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/* 123 */     paramDouble1 /= f1;
/* 124 */     paramDouble2 /= f1;
/* 125 */     paramDouble3 /= f1;
/*     */     
/* 127 */     paramDouble1 += this.Z.nextGaussian() * (this.Z.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 128 */     paramDouble2 += this.Z.nextGaussian() * (this.Z.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/* 129 */     paramDouble3 += this.Z.nextGaussian() * (this.Z.nextBoolean() ? -1 : 1) * 0.007499999832361937D * paramFloat2;
/*     */     
/* 131 */     paramDouble1 *= paramFloat1;
/* 132 */     paramDouble2 *= paramFloat1;
/* 133 */     paramDouble3 *= paramFloat1;
/*     */     
/* 135 */     this.v = paramDouble1;
/* 136 */     this.w = paramDouble2;
/* 137 */     this.x = paramDouble3;
/*     */     
/* 139 */     float f2 = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/* 141 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/* 142 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D));
/* 143 */     this.at = 0;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt)
/*     */   {
/* 148 */     b(paramDouble1, paramDouble2, paramDouble3);
/* 149 */     b(paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 154 */     this.v = paramDouble1;
/* 155 */     this.w = paramDouble2;
/* 156 */     this.x = paramDouble3;
/* 157 */     if ((this.B == 0.0F) && (this.A == 0.0F)) {
/* 158 */       float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 159 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/* 160 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.1415927410125732D));
/* 161 */       this.B = this.z;
/* 162 */       this.A = this.y;
/* 163 */       b(this.s, this.t, this.u, this.y, this.z);
/* 164 */       this.at = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 170 */     super.h();
/*     */     
/* 172 */     if ((this.B == 0.0F) && (this.A == 0.0F)) {
/* 173 */       float f1 = qh.a(this.v * this.v + this.x * this.x);
/* 174 */       this.A = (this.y = (float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/* 175 */       this.B = (this.z = (float)(Math.atan2(this.w, f1) * 180.0D / 3.1415927410125732D));
/*     */     }
/*     */     
/* 178 */     aji localaji = this.o.a(this.d, this.e, this.f);
/* 179 */     if (localaji.o() != awt.a) {
/* 180 */       localaji.a(this.o, this.d, this.e, this.f);
/* 181 */       azt localazt = localaji.a(this.o, this.d, this.e, this.f);
/* 182 */       if ((localazt != null) && (localazt.a(azw.a(this.s, this.t, this.u)))) {
/* 183 */         this.i = true;
/*     */       }
/*     */     }
/*     */     
/* 187 */     if (this.b > 0) { this.b -= 1;
/*     */     }
/* 189 */     if (this.i) {
/* 190 */       int j = this.o.e(this.d, this.e, this.f);
/* 191 */       if ((localaji != this.g) || (j != this.h)) {
/* 192 */         this.i = false;
/*     */         
/* 194 */         this.v *= this.Z.nextFloat() * 0.2F;
/* 195 */         this.w *= this.Z.nextFloat() * 0.2F;
/* 196 */         this.x *= this.Z.nextFloat() * 0.2F;
/* 197 */         this.at = 0;
/* 198 */         this.au = 0;
/* 199 */         return;
/*     */       }
/* 201 */       this.at += 1;
/* 202 */       if (this.at == 1200) {
/* 203 */         B();
/*     */       }
/* 205 */       return;
/*     */     }
/*     */     
/* 208 */     this.au += 1;
/*     */     
/*     */ 
/* 211 */     azw localazw1 = azw.a(this.s, this.t, this.u);
/* 212 */     azw localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 213 */     azu localazu1 = this.o.a(localazw1, localazw2, false, true, false);
/*     */     
/* 215 */     localazw1 = azw.a(this.s, this.t, this.u);
/* 216 */     localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 217 */     if (localazu1 != null) {
/* 218 */       localazw2 = azw.a(localazu1.f.a, localazu1.f.b, localazu1.f.c);
/*     */     }
/* 220 */     Object localObject1 = null;
/* 221 */     List localList = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 222 */     double d1 = 0.0D;
/* 223 */     Object localObject2; for (int k = 0; k < localList.size(); k++) {
/* 224 */       sa localsa = (sa)localList.get(k);
/* 225 */       if ((localsa.R()) && ((localsa != this.c) || (this.au >= 5)))
/*     */       {
/* 227 */         float f5 = 0.3F;
/* 228 */         localObject2 = localsa.C.b(f5, f5, f5);
/* 229 */         azu localazu2 = ((azt)localObject2).a(localazw1, localazw2);
/* 230 */         if (localazu2 != null) {
/* 231 */           double d2 = localazw1.d(localazu2.f);
/* 232 */           if ((d2 < d1) || (d1 == 0.0D)) {
/* 233 */             localObject1 = localsa;
/* 234 */             d1 = d2;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 239 */     if (localObject1 != null) {
/* 240 */       localazu1 = new azu((sa)localObject1);
/*     */     }
/*     */     
/* 243 */     if ((localazu1 != null) && (localazu1.g != null) && ((localazu1.g instanceof yz))) {
/* 244 */       yz localyz = (yz)localazu1.g;
/* 245 */       if ((localyz.bE.a) || (((this.c instanceof yz)) && (!((yz)this.c).a(localyz)))) {
/* 246 */         localazu1 = null;
/*     */       }
/*     */     }
/*     */     float f7;
/* 250 */     if (localazu1 != null) { float f2;
/* 251 */       if (localazu1.g != null)
/*     */       {
/* 253 */         f2 = qh.a(this.v * this.v + this.w * this.w + this.x * this.x);
/* 254 */         int n = qh.f(f2 * this.av);
/*     */         
/* 256 */         if (f()) { n += this.Z.nextInt(n / 2 + 2);
/*     */         }
/* 258 */         ro localro = null;
/* 259 */         if (this.c == null) {
/* 260 */           localro = ro.a(this, this);
/*     */         } else {
/* 262 */           localro = ro.a(this, this.c);
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 267 */         if ((al()) && (!(localazu1.g instanceof ya))) {
/* 268 */           localazu1.g.e(5);
/*     */         }
/* 270 */         if (localazu1.g.a(localro, n)) {
/* 271 */           if ((localazu1.g instanceof sv)) {
/* 272 */             localObject2 = (sv)localazu1.g;
/*     */             
/* 274 */             if (!this.o.E) {
/* 275 */               ((sv)localObject2).p(((sv)localObject2).aZ() + 1);
/*     */             }
/*     */             
/* 278 */             if (this.aw > 0) {
/* 279 */               f7 = qh.a(this.v * this.v + this.x * this.x);
/* 280 */               if (f7 > 0.0F) {
/* 281 */                 localazu1.g.g(this.v * this.aw * 0.6000000238418579D / f7, 0.1D, this.x * this.aw * 0.6000000238418579D / f7);
/*     */               }
/*     */             }
/*     */             
/* 285 */             if ((this.c != null) && ((this.c instanceof sv))) {
/* 286 */               afv.a((sv)localObject2, this.c);
/* 287 */               afv.b((sv)this.c, (sa)localObject2);
/*     */             }
/*     */             
/* 290 */             if ((this.c != null) && (localazu1.g != this.c) && ((localazu1.g instanceof yz)) && ((this.c instanceof mw))) {
/* 291 */               ((mw)this.c).a.a(new gv(6, 0.0F));
/*     */             }
/*     */           }
/* 294 */           a("random.bowhit", 1.0F, 1.2F / (this.Z.nextFloat() * 0.2F + 0.9F));
/* 295 */           if (!(localazu1.g instanceof ya)) B();
/*     */         } else {
/* 297 */           this.v *= -0.10000000149011612D;
/* 298 */           this.w *= -0.10000000149011612D;
/* 299 */           this.x *= -0.10000000149011612D;
/* 300 */           this.y += 180.0F;
/* 301 */           this.A += 180.0F;
/* 302 */           this.au = 0;
/*     */         }
/*     */       } else {
/* 305 */         this.d = localazu1.b;
/* 306 */         this.e = localazu1.c;
/* 307 */         this.f = localazu1.d;
/* 308 */         this.g = this.o.a(this.d, this.e, this.f);
/* 309 */         this.h = this.o.e(this.d, this.e, this.f);
/* 310 */         this.v = ((float)(localazu1.f.a - this.s));
/* 311 */         this.w = ((float)(localazu1.f.b - this.t));
/* 312 */         this.x = ((float)(localazu1.f.c - this.u));
/* 313 */         f2 = qh.a(this.v * this.v + this.w * this.w + this.x * this.x);
/* 314 */         this.s -= this.v / f2 * 0.05000000074505806D;
/* 315 */         this.t -= this.w / f2 * 0.05000000074505806D;
/* 316 */         this.u -= this.x / f2 * 0.05000000074505806D;
/*     */         
/* 318 */         a("random.bowhit", 1.0F, 1.2F / (this.Z.nextFloat() * 0.2F + 0.9F));
/* 319 */         this.i = true;
/* 320 */         this.b = 7;
/* 321 */         a(false);
/*     */         
/* 323 */         if (this.g.o() != awt.a) {
/* 324 */           this.g.a(this.o, this.d, this.e, this.f, this);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 329 */     if (f()) {
/* 330 */       for (int m = 0; m < 4; m++) {
/* 331 */         this.o.a("crit", this.s + this.v * m / 4.0D, this.t + this.w * m / 4.0D, this.u + this.x * m / 4.0D, -this.v, -this.w + 0.2D, -this.x);
/*     */       }
/*     */     }
/*     */     
/* 335 */     this.s += this.v;
/* 336 */     this.t += this.w;
/* 337 */     this.u += this.x;
/*     */     
/* 339 */     float f3 = qh.a(this.v * this.v + this.x * this.x);
/* 340 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/* 341 */     this.z = ((float)(Math.atan2(this.w, f3) * 180.0D / 3.1415927410125732D));
/*     */     
/* 343 */     while (this.z - this.B < -180.0F)
/* 344 */       this.B -= 360.0F;
/* 345 */     while (this.z - this.B >= 180.0F) {
/* 346 */       this.B += 360.0F;
/*     */     }
/* 348 */     while (this.y - this.A < -180.0F)
/* 349 */       this.A -= 360.0F;
/* 350 */     while (this.y - this.A >= 180.0F) {
/* 351 */       this.A += 360.0F;
/*     */     }
/* 353 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 354 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 356 */     float f4 = 0.99F;
/* 357 */     float f6 = 0.05F;
/*     */     
/* 359 */     if (M()) {
/* 360 */       for (int i1 = 0; i1 < 4; i1++) {
/* 361 */         f7 = 0.25F;
/* 362 */         this.o.a("bubble", this.s - this.v * f7, this.t - this.w * f7, this.u - this.x * f7, this.v, this.w, this.x);
/*     */       }
/* 364 */       f4 = 0.8F;
/*     */     }
/*     */     
/* 367 */     if (L()) { F();
/*     */     }
/* 369 */     this.v *= f4;
/* 370 */     this.w *= f4;
/* 371 */     this.x *= f4;
/* 372 */     this.w -= f6;
/*     */     
/* 374 */     b(this.s, this.t, this.u);
/*     */     
/* 376 */     I();
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 381 */     paramdh.a("xTile", (short)this.d);
/* 382 */     paramdh.a("yTile", (short)this.e);
/* 383 */     paramdh.a("zTile", (short)this.f);
/* 384 */     paramdh.a("life", (short)this.at);
/* 385 */     paramdh.a("inTile", (byte)aji.b(this.g));
/* 386 */     paramdh.a("inData", (byte)this.h);
/* 387 */     paramdh.a("shake", (byte)this.b);
/* 388 */     paramdh.a("inGround", (byte)(this.i ? 1 : 0));
/* 389 */     paramdh.a("pickup", (byte)this.a);
/* 390 */     paramdh.a("damage", this.av);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 395 */     this.d = paramdh.e("xTile");
/* 396 */     this.e = paramdh.e("yTile");
/* 397 */     this.f = paramdh.e("zTile");
/* 398 */     this.at = paramdh.e("life");
/* 399 */     this.g = aji.e(paramdh.d("inTile") & 0xFF);
/* 400 */     this.h = (paramdh.d("inData") & 0xFF);
/* 401 */     this.b = (paramdh.d("shake") & 0xFF);
/* 402 */     this.i = (paramdh.d("inGround") == 1);
/* 403 */     if (paramdh.b("damage", 99)) {
/* 404 */       this.av = paramdh.i("damage");
/*     */     }
/*     */     
/* 407 */     if (paramdh.b("pickup", 99)) {
/* 408 */       this.a = paramdh.d("pickup");
/* 409 */     } else if (paramdh.b("player", 99)) {
/* 410 */       this.a = (paramdh.n("player") ? 1 : 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b_(yz paramyz)
/*     */   {
/* 416 */     if ((this.o.E) || (!this.i) || (this.b > 0)) { return;
/*     */     }
/* 418 */     int j = (this.a == 1) || ((this.a == 2) && (paramyz.bE.d)) ? 1 : 0;
/*     */     
/* 420 */     if ((this.a == 1) && 
/* 421 */       (!paramyz.bm.a(new add(ade.g, 1)))) {
/* 422 */       j = 0;
/*     */     }
/*     */     
/*     */ 
/* 426 */     if (j != 0) {
/* 427 */       a("random.pop", 0.2F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 428 */       paramyz.a(this, 1);
/* 429 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean g_()
/*     */   {
/* 435 */     return false;
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 440 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void b(double paramDouble) {
/* 444 */     this.av = paramDouble;
/*     */   }
/*     */   
/*     */   public double e() {
/* 448 */     return this.av;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 452 */     this.aw = paramInt;
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 457 */     return false;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 461 */     int j = this.af.a(16);
/* 462 */     if (paramBoolean) {
/* 463 */       this.af.b(16, Byte.valueOf((byte)(j | 0x1)));
/*     */     } else {
/* 465 */       this.af.b(16, Byte.valueOf((byte)(j & 0xFFFFFFFE)));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 470 */     int j = this.af.a(16);
/* 471 */     return (j & 0x1) != 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */