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
/*     */ public class xa
/*     */   extends sw
/*     */   implements ww, wx, yb
/*     */ {
/*     */   public double h;
/*     */   public double i;
/*     */   public double bm;
/*  23 */   public double[][] bn = new double[64][3];
/*  24 */   public int bo = -1;
/*     */   
/*     */   public wy[] bp;
/*     */   
/*     */   public wy bq;
/*     */   public wy br;
/*     */   public wy bs;
/*     */   public wy bt;
/*     */   public wy bu;
/*     */   public wy bv;
/*     */   public wy bw;
/*     */   public float bx;
/*     */   public float by;
/*     */   public boolean bz;
/*     */   public boolean bA;
/*     */   private sa bD;
/*     */   public int bB;
/*     */   public wz bC;
/*     */   
/*     */   public xa(ahb paramahb)
/*     */   {
/*  45 */     super(paramahb);
/*     */     
/*  47 */     this.bp = new wy[] { this.bq = new wy(this, "head", 6.0F, 6.0F), this.br = new wy(this, "body", 8.0F, 8.0F), this.bs = new wy(this, "tail", 4.0F, 4.0F), this.bt = new wy(this, "tail", 4.0F, 4.0F), this.bu = new wy(this, "tail", 4.0F, 4.0F), this.bv = new wy(this, "wing", 4.0F, 4.0F), this.bw = new wy(this, "wing", 4.0F, 4.0F) };
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  57 */     g(aY());
/*     */     
/*  59 */     a(16.0F, 8.0F);
/*     */     
/*  61 */     this.X = true;
/*  62 */     this.ae = true;
/*     */     
/*  64 */     this.i = 100.0D;
/*     */     
/*  66 */     this.ak = true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  71 */     super.aD();
/*     */     
/*  73 */     a(yj.a).a(200.0D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  78 */     super.c();
/*     */   }
/*     */   
/*     */   public double[] b(int paramInt, float paramFloat) {
/*  82 */     if (aS() <= 0.0F) {
/*  83 */       paramFloat = 0.0F;
/*     */     }
/*     */     
/*  86 */     paramFloat = 1.0F - paramFloat;
/*     */     
/*  88 */     int j = this.bo - paramInt * 1 & 0x3F;
/*  89 */     int k = this.bo - paramInt * 1 - 1 & 0x3F;
/*  90 */     double[] arrayOfDouble = new double[3];
/*  91 */     double d1 = this.bn[j][0];
/*  92 */     double d2 = qh.g(this.bn[k][0] - d1);
/*  93 */     arrayOfDouble[0] = (d1 + d2 * paramFloat);
/*     */     
/*  95 */     d1 = this.bn[j][1];
/*  96 */     d2 = this.bn[k][1] - d1;
/*     */     
/*  98 */     arrayOfDouble[1] = (d1 + d2 * paramFloat);
/*  99 */     arrayOfDouble[2] = (this.bn[j][2] + (this.bn[k][2] - this.bn[j][2]) * paramFloat);
/* 100 */     return arrayOfDouble;
/*     */   }
/*     */   
/*     */   public void e() {
/*     */     float f2;
/* 105 */     if (this.o.E) {
/* 106 */       f1 = qh.b(this.by * 3.1415927F * 2.0F);
/* 107 */       f2 = qh.b(this.bx * 3.1415927F * 2.0F);
/* 108 */       if ((f2 <= -0.3F) && (f1 >= -0.3F)) {
/* 109 */         this.o.a(this.s, this.t, this.u, "mob.enderdragon.wings", 5.0F, 0.8F + this.Z.nextFloat() * 0.3F, false);
/*     */       }
/*     */     }
/*     */     
/* 113 */     this.bx = this.by;
/*     */     
/*     */ 
/* 116 */     if (aS() <= 0.0F) {
/* 117 */       f1 = (this.Z.nextFloat() - 0.5F) * 8.0F;
/* 118 */       f2 = (this.Z.nextFloat() - 0.5F) * 4.0F;
/* 119 */       f4 = (this.Z.nextFloat() - 0.5F) * 8.0F;
/* 120 */       this.o.a("largeexplode", this.s + f1, this.t + 2.0D + f2, this.u + f4, 0.0D, 0.0D, 0.0D);
/* 121 */       return;
/*     */     }
/*     */     
/* 124 */     bP();
/*     */     
/* 126 */     float f1 = 0.2F / (qh.a(this.v * this.v + this.x * this.x) * 10.0F + 1.0F);
/* 127 */     f1 *= (float)Math.pow(2.0D, this.w);
/* 128 */     if (this.bA) this.by += f1 * 0.5F; else {
/* 129 */       this.by += f1;
/*     */     }
/* 131 */     this.y = qh.g(this.y);
/*     */     
/* 133 */     if (this.bo < 0) {
/* 134 */       for (int j = 0; j < this.bn.length; j++) {
/* 135 */         this.bn[j][0] = this.y;
/* 136 */         this.bn[j][1] = this.t;
/*     */       }
/*     */     }
/*     */     
/* 140 */     if (++this.bo == this.bn.length) this.bo = 0;
/* 141 */     this.bn[this.bo][0] = this.y;
/* 142 */     this.bn[this.bo][1] = this.t;
/*     */     double d1;
/* 144 */     double d2; double d3; double d4; if (this.o.E) {
/* 145 */       if (this.bg > 0) {
/* 146 */         d1 = this.s + (this.bh - this.s) / this.bg;
/* 147 */         d2 = this.t + (this.bi - this.t) / this.bg;
/* 148 */         d3 = this.u + (this.bj - this.u) / this.bg;
/*     */         
/* 150 */         d4 = qh.g(this.bk - this.y);
/*     */         
/* 152 */         this.y = ((float)(this.y + d4 / this.bg));
/* 153 */         this.z = ((float)(this.z + (this.bl - this.z) / this.bg));
/*     */         
/* 155 */         this.bg -= 1;
/* 156 */         b(d1, d2, d3);
/* 157 */         b(this.y, this.z);
/*     */       }
/*     */       
/*     */     }
/*     */     else
/*     */     {
/* 163 */       d1 = this.h - this.s;
/* 164 */       d2 = this.i - this.t;
/* 165 */       d3 = this.bm - this.u;
/*     */       
/* 167 */       d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 168 */       if (this.bD != null) {
/* 169 */         this.h = this.bD.s;
/* 170 */         this.bm = this.bD.u;
/*     */         
/* 172 */         double d5 = this.h - this.s;
/* 173 */         double d7 = this.bm - this.u;
/* 174 */         double d9 = Math.sqrt(d5 * d5 + d7 * d7);
/* 175 */         double d10 = 0.4000000059604645D + d9 / 80.0D - 1.0D;
/* 176 */         if (d10 > 10.0D) d10 = 10.0D;
/* 177 */         this.i = (this.bD.C.b + d10);
/*     */       } else {
/* 179 */         this.h += this.Z.nextGaussian() * 2.0D;
/* 180 */         this.bm += this.Z.nextGaussian() * 2.0D;
/*     */       }
/* 182 */       if ((this.bz) || (d4 < 100.0D) || (d4 > 22500.0D) || (this.E) || (this.F)) {
/* 183 */         bQ();
/*     */       }
/* 185 */       d2 /= qh.a(d1 * d1 + d3 * d3);
/* 186 */       f9 = 0.6F;
/* 187 */       if (d2 < -f9) d2 = -f9;
/* 188 */       if (d2 > f9) d2 = f9;
/* 189 */       this.w += d2 * 0.10000000149011612D;
/* 190 */       this.y = qh.g(this.y);
/*     */       
/* 192 */       double d6 = 180.0D - Math.atan2(d1, d3) * 180.0D / 3.1415927410125732D;
/* 193 */       double d8 = qh.g(d6 - this.y);
/*     */       
/* 195 */       if (d8 > 50.0D) d8 = 50.0D;
/* 196 */       if (d8 < -50.0D) { d8 = -50.0D;
/*     */       }
/* 198 */       azw localazw1 = azw.a(this.h - this.s, this.i - this.t, this.bm - this.u).a();
/* 199 */       azw localazw2 = azw.a(qh.a(this.y * 3.1415927F / 180.0F), this.w, -qh.b(this.y * 3.1415927F / 180.0F)).a();
/* 200 */       float f16 = (float)(localazw2.b(localazw1) + 0.5D) / 1.5F;
/* 201 */       if (f16 < 0.0F) { f16 = 0.0F;
/*     */       }
/* 203 */       this.bf *= 0.8F;
/*     */       
/* 205 */       float f17 = qh.a(this.v * this.v + this.x * this.x) * 1.0F + 1.0F;
/* 206 */       double d11 = Math.sqrt(this.v * this.v + this.x * this.x) * 1.0D + 1.0D;
/* 207 */       if (d11 > 40.0D) d11 = 40.0D;
/* 208 */       this.bf = ((float)(this.bf + d8 * (0.699999988079071D / d11 / f17)));
/* 209 */       this.y += this.bf * 0.1F;
/*     */       
/* 211 */       float f18 = (float)(2.0D / (d11 + 1.0D));
/* 212 */       float f19 = 0.06F;
/* 213 */       a(0.0F, -1.0F, f19 * (f16 * f18 + (1.0F - f18)));
/* 214 */       if (this.bA) {
/* 215 */         d(this.v * 0.800000011920929D, this.w * 0.800000011920929D, this.x * 0.800000011920929D);
/*     */       } else {
/* 217 */         d(this.v, this.w, this.x);
/*     */       }
/*     */       
/*     */ 
/* 221 */       azw localazw3 = azw.a(this.v, this.w, this.x).a();
/* 222 */       float f20 = (float)(localazw3.b(localazw2) + 1.0D) / 2.0F;
/* 223 */       f20 = 0.8F + 0.15F * f20;
/*     */       
/* 225 */       this.v *= f20;
/* 226 */       this.x *= f20;
/* 227 */       this.w *= 0.9100000262260437D;
/*     */     }
/*     */     
/* 230 */     this.aM = this.y;
/*     */     
/* 232 */     this.bq.M = (this.bq.N = 3.0F);
/* 233 */     this.bs.M = (this.bs.N = 2.0F);
/* 234 */     this.bt.M = (this.bt.N = 2.0F);
/* 235 */     this.bu.M = (this.bu.N = 2.0F);
/* 236 */     this.br.N = 3.0F;
/* 237 */     this.br.M = 5.0F;
/* 238 */     this.bv.N = 2.0F;
/* 239 */     this.bv.M = 4.0F;
/* 240 */     this.bw.N = 3.0F;
/* 241 */     this.bw.M = 4.0F;
/*     */     
/* 243 */     float f3 = (float)(b(5, 1.0F)[1] - b(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
/* 244 */     float f4 = qh.b(f3);
/* 245 */     float f5 = -qh.a(f3);
/*     */     
/* 247 */     float f6 = this.y * 3.1415927F / 180.0F;
/* 248 */     float f7 = qh.a(f6);
/* 249 */     float f8 = qh.b(f6);
/*     */     
/* 251 */     this.br.h();
/* 252 */     this.br.b(this.s + f7 * 0.5F, this.t, this.u - f8 * 0.5F, 0.0F, 0.0F);
/* 253 */     this.bv.h();
/* 254 */     this.bv.b(this.s + f8 * 4.5F, this.t + 2.0D, this.u + f7 * 4.5F, 0.0F, 0.0F);
/* 255 */     this.bw.h();
/* 256 */     this.bw.b(this.s - f8 * 4.5F, this.t + 2.0D, this.u - f7 * 4.5F, 0.0F, 0.0F);
/*     */     
/* 258 */     if ((!this.o.E) && (this.ax == 0)) {
/* 259 */       a(this.o.b(this, this.bv.C.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
/* 260 */       a(this.o.b(this, this.bw.C.b(4.0D, 2.0D, 4.0D).d(0.0D, -2.0D, 0.0D)));
/* 261 */       b(this.o.b(this, this.bq.C.b(1.0D, 1.0D, 1.0D)));
/*     */     }
/*     */     
/* 264 */     double[] arrayOfDouble1 = b(5, 1.0F);
/*     */     
/* 266 */     double[] arrayOfDouble2 = b(0, 1.0F);
/* 267 */     float f9 = qh.a(this.y * 3.1415927F / 180.0F - this.bf * 0.01F);
/* 268 */     float f10 = qh.b(this.y * 3.1415927F / 180.0F - this.bf * 0.01F);
/* 269 */     this.bq.h();
/* 270 */     this.bq.b(this.s + f9 * 5.5F * f4, this.t + (arrayOfDouble2[1] - arrayOfDouble1[1]) * 1.0D + f5 * 5.5F, this.u - f10 * 5.5F * f4, 0.0F, 0.0F);
/*     */     
/*     */ 
/* 273 */     for (int k = 0; k < 3; k++) {
/* 274 */       wy localwy = null;
/*     */       
/* 276 */       if (k == 0) localwy = this.bs;
/* 277 */       if (k == 1) localwy = this.bt;
/* 278 */       if (k == 2) { localwy = this.bu;
/*     */       }
/* 280 */       double[] arrayOfDouble3 = b(12 + k * 2, 1.0F);
/*     */       
/* 282 */       float f11 = this.y * 3.1415927F / 180.0F + b(arrayOfDouble3[0] - arrayOfDouble1[0]) * 3.1415927F / 180.0F * 1.0F;
/* 283 */       float f12 = qh.a(f11);
/* 284 */       float f13 = qh.b(f11);
/*     */       
/* 286 */       float f14 = 1.5F;
/* 287 */       float f15 = (k + 1) * 2.0F;
/* 288 */       localwy.h();
/* 289 */       localwy.b(this.s - (f7 * f14 + f12 * f15) * f4, this.t + (arrayOfDouble3[1] - arrayOfDouble1[1]) * 1.0D - (f15 + f14) * f5 + 1.5D, this.u + (f8 * f14 + f13 * f15) * f4, 0.0F, 0.0F);
/*     */     }
/*     */     
/* 292 */     if (!this.o.E) {
/* 293 */       this.bA = (a(this.bq.C) | a(this.br.C));
/*     */     }
/*     */   }
/*     */   
/*     */   private void bP() {
/* 298 */     if (this.bC != null) {
/* 299 */       if (this.bC.K) {
/* 300 */         if (!this.o.E) {
/* 301 */           a(this.bq, ro.a(null), 10.0F);
/*     */         }
/*     */         
/* 304 */         this.bC = null;
/* 305 */       } else if ((this.aa % 10 == 0) && 
/* 306 */         (aS() < aY())) { g(aS() + 1.0F);
/*     */       }
/*     */     }
/*     */     
/* 310 */     if (this.Z.nextInt(10) == 0) {
/* 311 */       float f = 32.0F;
/* 312 */       List localList = this.o.a(wz.class, this.C.b(f, f, f));
/*     */       
/* 314 */       Object localObject = null;
/* 315 */       double d1 = Double.MAX_VALUE;
/* 316 */       for (wz localwz : localList) {
/* 317 */         double d2 = localwz.f(this);
/* 318 */         if (d2 < d1) {
/* 319 */           d1 = d2;
/* 320 */           localObject = localwz;
/*     */         }
/*     */       }
/*     */       
/* 324 */       this.bC = ((wz)localObject);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(List paramList) {
/* 329 */     double d1 = (this.br.C.a + this.br.C.d) / 2.0D;
/* 330 */     double d2 = (this.br.C.c + this.br.C.f) / 2.0D;
/*     */     
/* 332 */     for (sa localsa : paramList) {
/* 333 */       if ((localsa instanceof sv)) {
/* 334 */         double d3 = localsa.s - d1;
/* 335 */         double d4 = localsa.u - d2;
/* 336 */         double d5 = d3 * d3 + d4 * d4;
/* 337 */         localsa.g(d3 / d5 * 4.0D, 0.20000000298023224D, d4 / d5 * 4.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(List paramList) {
/* 343 */     for (int j = 0; j < paramList.size(); j++) {
/* 344 */       sa localsa = (sa)paramList.get(j);
/* 345 */       if ((localsa instanceof sv)) {
/* 346 */         localsa.a(ro.a(this), 10.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void bQ() {
/* 352 */     this.bz = false;
/* 353 */     if ((this.Z.nextInt(2) == 0) && (!this.o.h.isEmpty())) {
/* 354 */       this.bD = ((sa)this.o.h.get(this.Z.nextInt(this.o.h.size())));
/*     */     } else {
/* 356 */       int j = 0;
/*     */       do {
/* 358 */         this.h = 0.0D;
/* 359 */         this.i = (70.0F + this.Z.nextFloat() * 50.0F);
/* 360 */         this.bm = 0.0D;
/* 361 */         this.h += this.Z.nextFloat() * 120.0F - 60.0F;
/* 362 */         this.bm += this.Z.nextFloat() * 120.0F - 60.0F;
/* 363 */         double d1 = this.s - this.h;
/* 364 */         double d2 = this.t - this.i;
/* 365 */         double d3 = this.u - this.bm;
/* 366 */         j = d1 * d1 + d2 * d2 + d3 * d3 > 100.0D ? 1 : 0;
/* 367 */       } while (j == 0);
/* 368 */       this.bD = null;
/*     */     }
/*     */   }
/*     */   
/*     */   private float b(double paramDouble) {
/* 373 */     return (float)qh.g(paramDouble);
/*     */   }
/*     */   
/*     */   private boolean a(azt paramazt) {
/* 377 */     int j = qh.c(paramazt.a);
/* 378 */     int k = qh.c(paramazt.b);
/* 379 */     int m = qh.c(paramazt.c);
/* 380 */     int n = qh.c(paramazt.d);
/* 381 */     int i1 = qh.c(paramazt.e);
/* 382 */     int i2 = qh.c(paramazt.f);
/* 383 */     boolean bool = false;
/* 384 */     int i3 = 0;
/* 385 */     for (int i4 = j; i4 <= n; i4++) {
/* 386 */       for (int i5 = k; i5 <= i1; i5++) {
/* 387 */         for (int i6 = m; i6 <= i2; i6++) {
/* 388 */           aji localaji = this.o.a(i4, i5, i6);
/* 389 */           if (localaji.o() != awt.a)
/*     */           {
/* 391 */             if ((localaji == ajn.Z) || (localaji == ajn.bs) || (localaji == ajn.h) || (!this.o.O().b("mobGriefing"))) {
/* 392 */               bool = true;
/*     */             } else {
/* 394 */               i3 = (this.o.f(i4, i5, i6)) || (i3 != 0) ? 1 : 0;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 400 */     if (i3 != 0) {
/* 401 */       double d1 = paramazt.a + (paramazt.d - paramazt.a) * this.Z.nextFloat();
/* 402 */       double d2 = paramazt.b + (paramazt.e - paramazt.b) * this.Z.nextFloat();
/* 403 */       double d3 = paramazt.c + (paramazt.f - paramazt.c) * this.Z.nextFloat();
/* 404 */       this.o.a("largeexplode", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     
/* 407 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean a(wy paramwy, ro paramro, float paramFloat)
/*     */   {
/* 412 */     if (paramwy != this.bq) {
/* 413 */       paramFloat = paramFloat / 4.0F + 1.0F;
/*     */     }
/*     */     
/* 416 */     float f1 = this.y * 3.1415927F / 180.0F;
/* 417 */     float f2 = qh.a(f1);
/* 418 */     float f3 = qh.b(f1);
/*     */     
/* 420 */     this.h = (this.s + f2 * 5.0F + (this.Z.nextFloat() - 0.5F) * 2.0F);
/* 421 */     this.i = (this.t + this.Z.nextFloat() * 3.0F + 1.0D);
/* 422 */     this.bm = (this.u - f3 * 5.0F + (this.Z.nextFloat() - 0.5F) * 2.0F);
/* 423 */     this.bD = null;
/* 424 */     if (((paramro.j() instanceof yz)) || (paramro.c())) {
/* 425 */       e(paramro, paramFloat);
/*     */     }
/* 427 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 432 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean e(ro paramro, float paramFloat) {
/* 436 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   protected void aF()
/*     */   {
/* 441 */     this.bB += 1;
/* 442 */     if ((this.bB >= 180) && (this.bB <= 200)) {
/* 443 */       float f1 = (this.Z.nextFloat() - 0.5F) * 8.0F;
/* 444 */       float f2 = (this.Z.nextFloat() - 0.5F) * 4.0F;
/* 445 */       float f3 = (this.Z.nextFloat() - 0.5F) * 8.0F;
/* 446 */       this.o.a("hugeexplosion", this.s + f1, this.t + 2.0D + f2, this.u + f3, 0.0D, 0.0D, 0.0D); }
/*     */     int j;
/* 448 */     int k; if (!this.o.E) {
/* 449 */       if ((this.bB > 150) && (this.bB % 5 == 0)) {
/* 450 */         j = 1000;
/* 451 */         while (j > 0) {
/* 452 */           k = sq.a(j);
/* 453 */           j -= k;
/* 454 */           this.o.d(new sq(this.o, this.s, this.t, this.u, k));
/*     */         }
/*     */       }
/* 457 */       if (this.bB == 1) {
/* 458 */         this.o.b(1018, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */       }
/*     */     }
/*     */     
/* 462 */     d(0.0D, 0.10000000149011612D, 0.0D);
/* 463 */     this.aM = (this.y += 20.0F);
/*     */     
/* 465 */     if ((this.bB == 200) && (!this.o.E)) {
/* 466 */       j = 2000;
/* 467 */       while (j > 0) {
/* 468 */         k = sq.a(j);
/* 469 */         j -= k;
/* 470 */         this.o.d(new sq(this.o, this.s, this.t, this.u, k));
/*     */       }
/* 472 */       b(qh.c(this.s), qh.c(this.u));
/* 473 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2) {
/* 478 */     int j = 64;
/*     */     
/* 480 */     akt.a = true;
/*     */     
/* 482 */     int k = 4;
/* 483 */     for (int m = j - 1; m <= j + 32; m++) {
/* 484 */       for (int n = paramInt1 - k; n <= paramInt1 + k; n++) {
/* 485 */         for (int i1 = paramInt2 - k; i1 <= paramInt2 + k; i1++) {
/* 486 */           double d1 = n - paramInt1;
/* 487 */           double d2 = i1 - paramInt2;
/* 488 */           double d3 = d1 * d1 + d2 * d2;
/* 489 */           if (d3 <= (k - 0.5D) * (k - 0.5D)) {
/* 490 */             if (m < j) {
/* 491 */               if (d3 <= (k - 1 - 0.5D) * (k - 1 - 0.5D)) {
/* 492 */                 this.o.b(n, m, i1, ajn.h);
/*     */               }
/* 494 */             } else if (m > j) {
/* 495 */               this.o.b(n, m, i1, ajn.a);
/*     */             }
/* 497 */             else if (d3 > (k - 1 - 0.5D) * (k - 1 - 0.5D)) {
/* 498 */               this.o.b(n, m, i1, ajn.h);
/*     */             } else {
/* 500 */               this.o.b(n, m, i1, ajn.bq);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 506 */     this.o.b(paramInt1, j + 0, paramInt2, ajn.h);
/* 507 */     this.o.b(paramInt1, j + 1, paramInt2, ajn.h);
/* 508 */     this.o.b(paramInt1, j + 2, paramInt2, ajn.h);
/* 509 */     this.o.b(paramInt1 - 1, j + 2, paramInt2, ajn.aa);
/* 510 */     this.o.b(paramInt1 + 1, j + 2, paramInt2, ajn.aa);
/* 511 */     this.o.b(paramInt1, j + 2, paramInt2 - 1, ajn.aa);
/* 512 */     this.o.b(paramInt1, j + 2, paramInt2 + 1, ajn.aa);
/* 513 */     this.o.b(paramInt1, j + 3, paramInt2, ajn.h);
/* 514 */     this.o.b(paramInt1, j + 4, paramInt2, ajn.bt);
/*     */     
/* 516 */     akt.a = false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void w() {}
/*     */   
/*     */ 
/*     */   public sa[] at()
/*     */   {
/* 525 */     return this.bp;
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/* 530 */     return false;
/*     */   }
/*     */   
/*     */   public ahb a()
/*     */   {
/* 535 */     return this.o;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 540 */     return "mob.enderdragon.growl";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 545 */     return "mob.enderdragon.hit";
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/* 550 */     return 5.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */