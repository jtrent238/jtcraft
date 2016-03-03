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
/*     */ public class blk
/*     */   extends blg
/*     */ {
/*     */   public bli c;
/*     */   protected bao d;
/*     */   protected int e;
/*     */   public int f;
/*     */   public float g;
/*     */   public float h;
/*     */   public float i;
/*     */   public float bL;
/*     */   private int a;
/*     */   private float bO;
/*     */   
/*     */   public blk(bao parambao, ahb paramahb, bbs parambbs, int paramInt)
/*     */   {
/*  43 */     super(paramahb, parambbs.e());
/*  44 */     this.d = parambao;
/*  45 */     this.ap = paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  52 */   private qm bS = new qm();
/*  53 */   private qm bT = new qm();
/*  54 */   private qm bU = new qm();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float bM;
/*     */   
/*     */ 
/*     */ 
/*     */   public float bN;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void bq()
/*     */   {
/*  70 */     super.bq();
/*  71 */     this.bd = this.c.a;
/*  72 */     this.be = this.c.b;
/*  73 */     this.bc = this.c.c;
/*     */     
/*  75 */     this.i = this.g;
/*  76 */     this.bL = this.h;
/*  77 */     this.h = ((float)(this.h + (this.z - this.h) * 0.5D));
/*  78 */     this.g = ((float)(this.g + (this.y - this.g) * 0.5D));
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  83 */     if (this.f > 0) {
/*  84 */       this.f -= 1;
/*  85 */       if (this.f == 0) {
/*  86 */         c(false);
/*     */       }
/*     */     }
/*     */     
/*  90 */     if (this.e > 0) this.e -= 1;
/*  91 */     if (this.d.c.a()) {
/*  92 */       this.s = (this.u = 0.5D);
/*  93 */       this.s = 0.0D;
/*  94 */       this.u = 0.0D;
/*  95 */       this.y = (this.aa / 12.0F);
/*  96 */       this.z = 10.0F;
/*  97 */       this.t = 68.5D;
/*  98 */       return;
/*     */     }
/*     */     
/* 101 */     this.bN = this.bM;
/*     */     
/* 103 */     if (this.an) {
/* 104 */       if (this.d.n != null) { this.d.a(null);
/*     */       }
/* 106 */       if (this.bM == 0.0F) {
/* 107 */         this.d.X().a(bso.a(new bqx("portal.trigger"), this.Z.nextFloat() * 0.4F + 0.8F));
/*     */       }
/* 109 */       this.bM += 0.0125F;
/* 110 */       if (this.bM >= 1.0F) {
/* 111 */         this.bM = 1.0F;
/*     */       }
/* 113 */       this.an = false;
/* 114 */     } else if ((a(rv.k)) && (b(rv.k).b() > 60)) {
/* 115 */       this.bM += 0.006666667F;
/* 116 */       if (this.bM > 1.0F) {
/* 117 */         this.bM = 1.0F;
/*     */       }
/*     */     } else {
/* 120 */       if (this.bM > 0.0F) this.bM -= 0.05F;
/* 121 */       if (this.bM < 0.0F) { this.bM = 0.0F;
/*     */       }
/*     */     }
/* 124 */     if (this.am > 0) this.am -= 1;
/* 125 */     boolean bool = this.c.c;
/* 126 */     float f1 = 0.8F;
/* 127 */     int j = this.c.b >= f1 ? 1 : 0;
/*     */     
/* 129 */     this.c.a();
/* 130 */     if ((by()) && (!am())) {
/* 131 */       this.c.a *= 0.2F;
/* 132 */       this.c.b *= 0.2F;
/* 133 */       this.e = 0;
/*     */     }
/*     */     
/* 136 */     if ((this.c.d) && 
/* 137 */       (this.V < 0.2F)) { this.V = 0.2F;
/*     */     }
/*     */     
/* 140 */     j(this.s - this.M * 0.35D, this.C.b + 0.5D, this.u + this.M * 0.35D);
/* 141 */     j(this.s - this.M * 0.35D, this.C.b + 0.5D, this.u - this.M * 0.35D);
/* 142 */     j(this.s + this.M * 0.35D, this.C.b + 0.5D, this.u - this.M * 0.35D);
/* 143 */     j(this.s + this.M * 0.35D, this.C.b + 0.5D, this.u + this.M * 0.35D);
/*     */     
/* 145 */     int k = (bQ().a() > 6.0F) || (this.bE.c) ? 1 : 0;
/* 146 */     if ((this.D) && (j == 0) && (this.c.b >= f1) && (!ao()) && (k != 0) && (!by()) && (!a(rv.q))) {
/* 147 */       if ((this.e > 0) || (this.d.u.af.d())) {
/* 148 */         c(true);
/*     */       } else {
/* 150 */         this.e = 7;
/*     */       }
/*     */     }
/* 153 */     if ((!ao()) && (this.c.b >= f1) && (k != 0) && (!by()) && (!a(rv.q)) && (this.d.u.af.d())) {
/* 154 */       c(true);
/*     */     }
/* 156 */     if ((ao()) && ((this.c.b < f1) || (this.E) || (k == 0))) {
/* 157 */       c(false);
/*     */     }
/*     */     
/* 160 */     if ((this.bE.c) && 
/* 161 */       (!bool) && (this.c.c)) {
/* 162 */       if (this.bq == 0) { this.bq = 7;
/*     */       } else {
/* 164 */         this.bE.b = (!this.bE.b);
/* 165 */         q();
/* 166 */         this.bq = 0;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 171 */     if (this.bE.b) {
/* 172 */       if (this.c.d) this.w -= 0.15D;
/* 173 */       if (this.c.c) { this.w += 0.15D;
/*     */       }
/*     */     }
/* 176 */     if (u()) {
/* 177 */       if (this.a < 0) {
/* 178 */         this.a += 1;
/* 179 */         if (this.a == 0)
/*     */         {
/* 181 */           this.bO = 0.0F;
/*     */         }
/*     */       }
/* 184 */       if ((bool) && (!this.c.c))
/*     */       {
/* 186 */         this.a = -10;
/* 187 */         i();
/* 188 */       } else if ((!bool) && (this.c.c))
/*     */       {
/* 190 */         this.a = 0;
/* 191 */         this.bO = 0.0F;
/* 192 */       } else if (bool)
/*     */       {
/* 194 */         this.a += 1;
/* 195 */         if (this.a < 10) {
/* 196 */           this.bO = (this.a * 0.1F);
/*     */         } else {
/* 198 */           this.bO = (0.8F + 2.0F / (this.a - 9) * 0.1F);
/*     */         }
/*     */       }
/*     */     } else {
/* 202 */       this.bO = 0.0F;
/*     */     }
/*     */     
/* 205 */     super.e();
/* 206 */     if ((this.D) && (this.bE.b)) {
/* 207 */       this.bE.b = false;
/* 208 */       q();
/*     */     }
/*     */   }
/*     */   
/*     */   public float t() {
/* 213 */     float f1 = 1.0F;
/*     */     
/*     */ 
/* 216 */     if (this.bE.b) f1 *= 1.1F;
/* 217 */     ti localti = a(yj.d);
/* 218 */     f1 = (float)(f1 * ((localti.e() / this.bE.b() + 1.0D) / 2.0D));
/*     */     
/* 220 */     if ((this.bE.b() == 0.0F) || (Float.isNaN(f1)) || (Float.isInfinite(f1))) {
/* 221 */       f1 = 1.0F;
/*     */     }
/*     */     
/*     */ 
/* 225 */     if ((by()) && (bw().b() == ade.f)) {
/* 226 */       int j = bz();
/* 227 */       float f2 = j / 20.0F;
/* 228 */       if (f2 > 1.0F) {
/* 229 */         f2 = 1.0F;
/*     */       } else {
/* 231 */         f2 *= f2;
/*     */       }
/* 233 */       f1 *= (1.0F - f2 * 0.15F);
/*     */     }
/*     */     
/* 236 */     return f1;
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 241 */     super.k();
/* 242 */     this.d.a(null);
/*     */   }
/*     */   
/*     */   public void a(aor paramaor)
/*     */   {
/* 247 */     if ((paramaor instanceof apm)) {
/* 248 */       this.d.a(new bfx((apm)paramaor));
/* 249 */     } else if ((paramaor instanceof aox)) {
/* 250 */       this.d.a(new bfh(((aox)paramaor).a()));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(agp paramagp)
/*     */   {
/* 256 */     this.d.a(new bfh(paramagp));
/*     */   }
/*     */   
/*     */   public void b(add paramadd)
/*     */   {
/* 261 */     adb localadb = paramadd.b();
/*     */     
/* 263 */     if (localadb == ade.bB) {
/* 264 */       this.d.a(new bfe(this, paramadd, false));
/* 265 */     } else if (localadb == ade.bA) {
/* 266 */       this.d.a(new bfe(this, paramadd, true));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/* 272 */     this.d.a(new bfi(this.bm, paramrb));
/*     */   }
/*     */   
/*     */   public void a(api paramapi)
/*     */   {
/* 277 */     this.d.a(new bfs(this.bm, paramapi));
/*     */   }
/*     */   
/*     */   public void a(xr paramxr)
/*     */   {
/* 282 */     this.d.a(new bfs(this.bm, paramxr));
/*     */   }
/*     */   
/*     */   public void a(wi paramwi, rb paramrb)
/*     */   {
/* 287 */     this.d.a(new bft(this.bm, paramrb, paramwi));
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 292 */     this.d.a(new bfj(this.bm, this.o, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*     */   {
/* 297 */     this.d.a(new bfq(this.bm, this.o, paramInt1, paramInt2, paramInt3, paramString));
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 302 */     this.d.a(new bey(this.bm, this.o, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(apg paramapg)
/*     */   {
/* 307 */     this.d.a(new bfr(this.bm, paramapg));
/*     */   }
/*     */   
/*     */   public void a(aov paramaov)
/*     */   {
/* 312 */     this.d.a(new bfg(this.bm, paramaov));
/*     */   }
/*     */   
/*     */   public void a(aoq paramaoq)
/*     */   {
/* 317 */     this.d.a(new bez(this.bm, paramaoq));
/*     */   }
/*     */   
/*     */   public void a(apb paramapb)
/*     */   {
/* 322 */     this.d.a(new bfy(this.bm, paramapb));
/*     */   }
/*     */   
/*     */   public void a(agm paramagm, String paramString)
/*     */   {
/* 327 */     this.d.a(new bfv(this.bm, paramagm, this.o, paramString));
/*     */   }
/*     */   
/*     */   public void b(sa paramsa)
/*     */   {
/* 332 */     this.d.k.a(new bjw(this.d.f, paramsa));
/*     */   }
/*     */   
/*     */   public void c(sa paramsa)
/*     */   {
/* 337 */     bjw localbjw = new bjw(this.d.f, paramsa, "magicCrit");
/* 338 */     this.d.k.a(localbjw);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, int paramInt)
/*     */   {
/* 343 */     this.d.k.a(new blb(this.d.f, paramsa, this, -0.5F));
/*     */   }
/*     */   
/*     */   public boolean an()
/*     */   {
/* 348 */     return (this.c.d) && (!this.bA);
/*     */   }
/*     */   
/*     */   public void n(float paramFloat) {
/* 352 */     float f1 = aS() - paramFloat;
/* 353 */     if (f1 <= 0.0F) {
/* 354 */       g(paramFloat);
/* 355 */       if (f1 < 0.0F) {
/* 356 */         this.ad = (this.aH / 2);
/*     */       }
/*     */     } else {
/* 359 */       this.bb = f1;
/* 360 */       g(aS());
/* 361 */       this.ad = this.aH;
/* 362 */       d(ro.j, f1);
/* 363 */       this.ax = (this.ay = 10);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(fj paramfj)
/*     */   {
/* 369 */     this.d.r.b().a(paramfj);
/*     */   }
/*     */   
/*     */   private boolean e(int paramInt1, int paramInt2, int paramInt3) {
/* 373 */     return this.o.a(paramInt1, paramInt2, paramInt3).r();
/*     */   }
/*     */   
/*     */   protected boolean j(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 378 */     int j = qh.c(paramDouble1);
/* 379 */     int k = qh.c(paramDouble2);
/* 380 */     int m = qh.c(paramDouble3);
/*     */     
/* 382 */     double d1 = paramDouble1 - j;
/* 383 */     double d2 = paramDouble3 - m;
/*     */     
/* 385 */     if ((e(j, k, m)) || (e(j, k + 1, m))) {
/* 386 */       int n = (!e(j - 1, k, m)) && (!e(j - 1, k + 1, m)) ? 1 : 0;
/* 387 */       int i1 = (!e(j + 1, k, m)) && (!e(j + 1, k + 1, m)) ? 1 : 0;
/* 388 */       int i2 = (!e(j, k, m - 1)) && (!e(j, k + 1, m - 1)) ? 1 : 0;
/* 389 */       int i3 = (!e(j, k, m + 1)) && (!e(j, k + 1, m + 1)) ? 1 : 0;
/*     */       
/* 391 */       int i4 = -1;
/* 392 */       double d3 = 9999.0D;
/* 393 */       if ((n != 0) && (d1 < d3)) {
/* 394 */         d3 = d1;
/* 395 */         i4 = 0;
/*     */       }
/* 397 */       if ((i1 != 0) && (1.0D - d1 < d3)) {
/* 398 */         d3 = 1.0D - d1;
/* 399 */         i4 = 1;
/*     */       }
/* 401 */       if ((i2 != 0) && (d2 < d3)) {
/* 402 */         d3 = d2;
/* 403 */         i4 = 4;
/*     */       }
/* 405 */       if ((i3 != 0) && (1.0D - d2 < d3)) {
/* 406 */         d3 = 1.0D - d2;
/* 407 */         i4 = 5;
/*     */       }
/*     */       
/* 410 */       float f1 = 0.1F;
/* 411 */       if (i4 == 0) this.v = (-f1);
/* 412 */       if (i4 == 1) this.v = f1;
/* 413 */       if (i4 == 4) this.x = (-f1);
/* 414 */       if (i4 == 5) { this.x = f1;
/*     */       }
/*     */     }
/* 417 */     return false;
/*     */   }
/*     */   
/*     */   public void c(boolean paramBoolean)
/*     */   {
/* 422 */     super.c(paramBoolean);
/* 423 */     this.f = (paramBoolean ? 600 : 0);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat, int paramInt1, int paramInt2) {
/* 427 */     this.bH = paramFloat;
/* 428 */     this.bG = paramInt1;
/* 429 */     this.bF = paramInt2;
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 434 */     this.d.r.b().a(paramfj);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, String paramString)
/*     */   {
/* 439 */     return paramInt <= 0;
/*     */   }
/*     */   
/*     */   public r f_()
/*     */   {
/* 444 */     return new r(qh.c(this.s + 0.5D), qh.c(this.t + 0.5D), qh.c(this.u + 0.5D));
/*     */   }
/*     */   
/*     */   public void a(String paramString, float paramFloat1, float paramFloat2)
/*     */   {
/* 449 */     this.o.a(this.s, this.t - this.L, this.u, paramString, paramFloat1, paramFloat2, false);
/*     */   }
/*     */   
/*     */   public boolean br()
/*     */   {
/* 454 */     return true;
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 458 */     return (this.m != null) && ((this.m instanceof wi));
/*     */   }
/*     */   
/*     */   public float v() {
/* 462 */     return this.bO;
/*     */   }
/*     */   
/*     */   protected void i() {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */