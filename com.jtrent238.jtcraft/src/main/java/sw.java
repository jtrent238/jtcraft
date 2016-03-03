/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public abstract class sw
/*     */   extends sv
/*     */ {
/*     */   public int a_;
/*     */   protected int b;
/*     */   private tu h;
/*     */   private tv i;
/*     */   private tt bm;
/*     */   private tr bn;
/*     */   private vv bo;
/*     */   protected final uj c;
/*     */   protected final uj d;
/*     */   private sv bp;
/*     */   private vw bq;
/*  45 */   private add[] br = new add[5];
/*  46 */   protected float[] e = new float[5];
/*     */   private boolean bs;
/*     */   private boolean bt;
/*     */   
/*     */   public sw(ahb paramahb) {
/*  51 */     super(paramahb);
/*     */     
/*  53 */     this.c = new uj((paramahb == null) || (paramahb.C == null) ? null : paramahb.C);
/*  54 */     this.d = new uj((paramahb == null) || (paramahb.C == null) ? null : paramahb.C);
/*  55 */     this.h = new tu(this);
/*  56 */     this.i = new tv(this);
/*  57 */     this.bm = new tt(this);
/*  58 */     this.bn = new tr(this);
/*  59 */     this.bo = new vv(this, paramahb);
/*  60 */     this.bq = new vw(this);
/*     */     
/*  62 */     for (int j = 0; j < this.e.length; j++) {
/*  63 */       this.e[j] = 0.085F;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  69 */     super.aD();
/*     */     
/*  71 */     bc().b(yj.b).a(16.0D);
/*     */   }
/*     */   
/*     */   public tu j() {
/*  75 */     return this.h;
/*     */   }
/*     */   
/*     */   public tv k() {
/*  79 */     return this.i;
/*     */   }
/*     */   
/*     */   public tt l() {
/*  83 */     return this.bm;
/*     */   }
/*     */   
/*     */   public vv m() {
/*  87 */     return this.bo;
/*     */   }
/*     */   
/*     */   public vw n() {
/*  91 */     return this.bq;
/*     */   }
/*     */   
/*     */   public sv o() {
/*  95 */     return this.bp;
/*     */   }
/*     */   
/*     */   public void d(sv paramsv) {
/*  99 */     this.bp = paramsv;
/*     */   }
/*     */   
/*     */   public boolean a(Class paramClass) {
/* 103 */     return (xz.class != paramClass) && (yd.class != paramClass);
/*     */   }
/*     */   
/*     */ 
/*     */   public void p() {}
/*     */   
/*     */ 
/*     */   protected void c()
/*     */   {
/* 112 */     super.c();
/* 113 */     this.af.a(11, Byte.valueOf((byte)0));
/* 114 */     this.af.a(10, "");
/*     */   }
/*     */   
/*     */   public int q() {
/* 118 */     return 80;
/*     */   }
/*     */   
/*     */   public void r() {
/* 122 */     String str = t();
/* 123 */     if (str != null) {
/* 124 */       a(str, bf(), bg());
/*     */     }
/*     */   }
/*     */   
/*     */   public void C()
/*     */   {
/* 130 */     super.C();
/*     */     
/* 132 */     this.o.C.a("mobBaseTick");
/* 133 */     if ((Z()) && (this.Z.nextInt(1000) < this.a_++)) {
/* 134 */       this.a_ = (-q());
/* 135 */       r();
/*     */     }
/* 137 */     this.o.C.b();
/*     */   }
/*     */   
/*     */   protected int e(yz paramyz)
/*     */   {
/* 142 */     if (this.b > 0) {
/* 143 */       int j = this.b;
/*     */       
/* 145 */       add[] arrayOfadd = ak();
/* 146 */       for (int k = 0; k < arrayOfadd.length; k++) {
/* 147 */         if ((arrayOfadd[k] != null) && (this.e[k] <= 1.0F)) {
/* 148 */           j += 1 + this.Z.nextInt(3);
/*     */         }
/*     */       }
/*     */       
/* 152 */       return j;
/*     */     }
/* 154 */     return this.b;
/*     */   }
/*     */   
/*     */   public void s()
/*     */   {
/* 159 */     for (int j = 0; j < 20; j++) {
/* 160 */       double d1 = this.Z.nextGaussian() * 0.02D;
/* 161 */       double d2 = this.Z.nextGaussian() * 0.02D;
/* 162 */       double d3 = this.Z.nextGaussian() * 0.02D;
/* 163 */       double d4 = 10.0D;
/* 164 */       this.o.a("explode", this.s + this.Z.nextFloat() * this.M * 2.0F - this.M - d1 * d4, this.t + this.Z.nextFloat() * this.N - d2 * d4, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M - d3 * d4, d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void h()
/*     */   {
/* 171 */     super.h();
/*     */     
/* 173 */     if (!this.o.E) {
/* 174 */       bL();
/*     */     }
/*     */   }
/*     */   
/*     */   protected float f(float paramFloat1, float paramFloat2)
/*     */   {
/* 180 */     if (bk()) {
/* 181 */       this.bn.a();
/* 182 */       return paramFloat2;
/*     */     }
/* 184 */     return super.f(paramFloat1, paramFloat2);
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 189 */     return null;
/*     */   }
/*     */   
/*     */   protected adb u() {
/* 193 */     return adb.d(0);
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 198 */     adb localadb = u();
/* 199 */     if (localadb != null) {
/* 200 */       int j = this.Z.nextInt(3);
/* 201 */       if (paramInt > 0) {
/* 202 */         j += this.Z.nextInt(paramInt + 1);
/*     */       }
/* 204 */       for (int k = 0; k < j; k++) {
/* 205 */         a(localadb, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/* 211 */     super.b(paramdh);
/* 212 */     paramdh.a("CanPickUpLoot", bJ());
/* 213 */     paramdh.a("PersistenceRequired", this.bt);
/*     */     
/* 215 */     dq localdq1 = new dq();
/* 216 */     for (int j = 0; j < this.br.length; j++) {
/* 217 */       dh localdh1 = new dh();
/* 218 */       if (this.br[j] != null) this.br[j].b(localdh1);
/* 219 */       localdq1.a(localdh1);
/*     */     }
/* 221 */     paramdh.a("Equipment", localdq1);
/*     */     
/* 223 */     dq localdq2 = new dq();
/* 224 */     for (int k = 0; k < this.e.length; k++) {
/* 225 */       localdq2.a(new dm(this.e[k]));
/*     */     }
/* 227 */     paramdh.a("DropChances", localdq2);
/* 228 */     paramdh.a("CustomName", bG());
/* 229 */     paramdh.a("CustomNameVisible", bI());
/*     */     
/*     */ 
/* 232 */     paramdh.a("Leashed", this.bv);
/* 233 */     if (this.bw != null) {
/* 234 */       dh localdh2 = new dh();
/* 235 */       if ((this.bw instanceof sv))
/*     */       {
/* 237 */         localdh2.a("UUIDMost", this.bw.aB().getMostSignificantBits());
/* 238 */         localdh2.a("UUIDLeast", this.bw.aB().getLeastSignificantBits());
/* 239 */       } else if ((this.bw instanceof ss))
/*     */       {
/* 241 */         ss localss = (ss)this.bw;
/* 242 */         localdh2.a("X", localss.b);
/* 243 */         localdh2.a("Y", localss.c);
/* 244 */         localdh2.a("Z", localss.d);
/*     */       }
/* 246 */       paramdh.a("Leash", localdh2);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 253 */     super.a(paramdh);
/*     */     
/* 255 */     h(paramdh.n("CanPickUpLoot"));
/* 256 */     this.bt = paramdh.n("PersistenceRequired");
/* 257 */     if ((paramdh.b("CustomName", 8)) && (paramdh.j("CustomName").length() > 0)) a(paramdh.j("CustomName"));
/* 258 */     g(paramdh.n("CustomNameVisible"));
/*     */     dq localdq;
/* 260 */     int j; if (paramdh.b("Equipment", 9)) {
/* 261 */       localdq = paramdh.c("Equipment", 10);
/*     */       
/* 263 */       for (j = 0; j < this.br.length; j++) {
/* 264 */         this.br[j] = add.a(localdq.b(j));
/*     */       }
/*     */     }
/*     */     
/* 268 */     if (paramdh.b("DropChances", 9)) {
/* 269 */       localdq = paramdh.c("DropChances", 5);
/* 270 */       for (j = 0; j < localdq.c(); j++) {
/* 271 */         this.e[j] = localdq.e(j);
/*     */       }
/*     */     }
/*     */     
/* 275 */     this.bv = paramdh.n("Leashed");
/* 276 */     if ((this.bv) && (paramdh.b("Leash", 10))) {
/* 277 */       this.bx = paramdh.m("Leash");
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void n(float paramFloat)
/*     */   {
/* 284 */     this.be = paramFloat;
/*     */   }
/*     */   
/*     */   public void i(float paramFloat)
/*     */   {
/* 289 */     super.i(paramFloat);
/* 290 */     n(paramFloat);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 295 */     super.e();
/*     */     
/* 297 */     this.o.C.a("looting");
/* 298 */     if ((!this.o.E) && (bJ()) && (!this.aT) && (this.o.O().b("mobGriefing"))) {
/* 299 */       List localList = this.o.a(xk.class, this.C.b(1.0D, 0.0D, 1.0D));
/* 300 */       for (xk localxk : localList)
/* 301 */         if ((!localxk.K) && (localxk.f() != null)) {
/* 302 */           add localadd1 = localxk.f();
/* 303 */           int j = b(localadd1);
/*     */           
/* 305 */           if (j > -1) {
/* 306 */             int k = 1;
/* 307 */             add localadd2 = q(j);
/*     */             Object localObject1;
/* 309 */             if (localadd2 != null) { Object localObject2;
/* 310 */               if (j == 0) {
/* 311 */                 if (((localadd1.b() instanceof aeh)) && (!(localadd2.b() instanceof aeh))) {
/* 312 */                   k = 1;
/* 313 */                 } else if (((localadd1.b() instanceof aeh)) && ((localadd2.b() instanceof aeh))) {
/* 314 */                   localObject1 = (aeh)localadd1.b();
/* 315 */                   localObject2 = (aeh)localadd2.b();
/*     */                   
/* 317 */                   if (((aeh)localObject1).i() == ((aeh)localObject2).i()) {
/* 318 */                     k = (localadd1.k() > localadd2.k()) || ((localadd1.p()) && (!localadd2.p())) ? 1 : 0;
/*     */                   } else {
/* 320 */                     k = ((aeh)localObject1).i() > ((aeh)localObject2).i() ? 1 : 0;
/*     */                   }
/*     */                 } else {
/* 323 */                   k = 0;
/*     */                 }
/*     */               }
/* 326 */               else if (((localadd1.b() instanceof abb)) && (!(localadd2.b() instanceof abb))) {
/* 327 */                 k = 1;
/* 328 */               } else if (((localadd1.b() instanceof abb)) && ((localadd2.b() instanceof abb))) {
/* 329 */                 localObject1 = (abb)localadd1.b();
/* 330 */                 localObject2 = (abb)localadd2.b();
/*     */                 
/* 332 */                 if (((abb)localObject1).c == ((abb)localObject2).c) {
/* 333 */                   k = (localadd1.k() > localadd2.k()) || ((localadd1.p()) && (!localadd2.p())) ? 1 : 0;
/*     */                 } else {
/* 335 */                   k = ((abb)localObject1).c > ((abb)localObject2).c ? 1 : 0;
/*     */                 }
/*     */               } else {
/* 338 */                 k = 0;
/*     */               }
/*     */             }
/*     */             
/*     */ 
/* 343 */             if (k != 0) {
/* 344 */               if ((localadd2 != null) && (this.Z.nextFloat() - 0.1F < this.e[j])) {
/* 345 */                 a(localadd2, 0.0F);
/*     */               }
/*     */               
/* 348 */               if ((localadd1.b() == ade.i) && (localxk.j() != null)) {
/* 349 */                 localObject1 = this.o.a(localxk.j());
/* 350 */                 if (localObject1 != null) {
/* 351 */                   ((yz)localObject1).a(pc.x);
/*     */                 }
/*     */               }
/*     */               
/* 355 */               c(j, localadd1);
/* 356 */               this.e[j] = 2.0F;
/* 357 */               this.bt = true;
/* 358 */               a(localxk, 1);
/* 359 */               localxk.B();
/*     */             }
/*     */           }
/*     */         }
/*     */     }
/* 364 */     this.o.C.b();
/*     */   }
/*     */   
/*     */   protected boolean bk()
/*     */   {
/* 369 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean v() {
/* 373 */     return true;
/*     */   }
/*     */   
/*     */   protected float f;
/*     */   private sa bu;
/*     */   protected void w()
/*     */   {
/* 380 */     if (this.bt) {
/* 381 */       this.aU = 0;
/* 382 */       return;
/*     */     }
/*     */     
/* 385 */     yz localyz = this.o.a(this, -1.0D);
/* 386 */     if (localyz != null) {
/* 387 */       double d1 = localyz.s - this.s;
/* 388 */       double d2 = localyz.t - this.t;
/* 389 */       double d3 = localyz.u - this.u;
/* 390 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 392 */       if ((v()) && (d4 > 16384.0D)) {
/* 393 */         B();
/*     */       }
/*     */       
/* 396 */       if ((this.aU > 600) && (this.Z.nextInt(800) == 0) && (d4 > 1024.0D) && (v())) {
/* 397 */         B();
/* 398 */       } else if (d4 < 1024.0D) {
/* 399 */         this.aU = 0;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bn()
/*     */   {
/* 406 */     this.aU += 1;
/* 407 */     this.o.C.a("checkDespawn");
/* 408 */     w();
/* 409 */     this.o.C.b();
/*     */     
/* 411 */     this.o.C.a("sensing");
/* 412 */     this.bq.a();
/* 413 */     this.o.C.b();
/*     */     
/* 415 */     this.o.C.a("targetSelector");
/* 416 */     this.d.a();
/* 417 */     this.o.C.b();
/*     */     
/* 419 */     this.o.C.a("goalSelector");
/* 420 */     this.c.a();
/* 421 */     this.o.C.b();
/*     */     
/* 423 */     this.o.C.a("navigation");
/* 424 */     this.bo.f();
/* 425 */     this.o.C.b();
/*     */     
/* 427 */     this.o.C.a("mob tick");
/* 428 */     bp();
/* 429 */     this.o.C.b();
/*     */     
/* 431 */     this.o.C.a("controls");
/* 432 */     this.o.C.a("move");
/* 433 */     this.i.c();
/* 434 */     this.o.C.c("look");
/* 435 */     this.h.a();
/* 436 */     this.o.C.c("jump");
/* 437 */     this.bm.b();
/* 438 */     this.o.C.b();
/* 439 */     this.o.C.b();
/*     */   }
/*     */   
/*     */   protected void bq()
/*     */   {
/* 444 */     super.bq();
/* 445 */     this.bd = 0.0F;
/* 446 */     this.be = 0.0F;
/* 447 */     w();
/*     */     
/* 449 */     float f1 = 8.0F;
/* 450 */     if (this.Z.nextFloat() < 0.02F) {
/* 451 */       yz localyz = this.o.a(this, f1);
/* 452 */       if (localyz != null) {
/* 453 */         this.bu = localyz;
/* 454 */         this.g = (10 + this.Z.nextInt(20));
/*     */       } else {
/* 456 */         this.bf = ((this.Z.nextFloat() - 0.5F) * 20.0F);
/*     */       }
/*     */     }
/*     */     
/* 460 */     if (this.bu != null) {
/* 461 */       a(this.bu, 10.0F, x());
/* 462 */       if ((this.g-- <= 0) || (this.bu.K) || (this.bu.f(this) > f1 * f1)) {
/* 463 */         this.bu = null;
/*     */       }
/*     */     } else {
/* 466 */       if (this.Z.nextFloat() < 0.05F) {
/* 467 */         this.bf = ((this.Z.nextFloat() - 0.5F) * 20.0F);
/*     */       }
/* 469 */       this.y += this.bf;
/* 470 */       this.z = this.f;
/*     */     }
/*     */     
/* 473 */     boolean bool1 = M();
/* 474 */     boolean bool2 = P();
/* 475 */     if ((bool1) || (bool2)) this.bc = (this.Z.nextFloat() < 0.8F);
/*     */   }
/*     */   
/*     */   public int x() {
/* 479 */     return 40;
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2) {
/* 483 */     double d1 = paramsa.s - this.s;
/*     */     
/* 485 */     double d3 = paramsa.u - this.u;
/*     */     double d2;
/* 487 */     if ((paramsa instanceof sv)) {
/* 488 */       sv localsv = (sv)paramsa;
/* 489 */       d2 = localsv.t + localsv.g() - (this.t + g());
/*     */     } else {
/* 491 */       d2 = (paramsa.C.b + paramsa.C.e) / 2.0D - (this.t + g());
/*     */     }
/*     */     
/* 494 */     double d4 = qh.a(d1 * d1 + d3 * d3);
/*     */     
/* 496 */     float f1 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 497 */     float f2 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/* 498 */     this.z = b(this.z, f2, paramFloat2);
/* 499 */     this.y = b(this.y, f1, paramFloat1);
/*     */   }
/*     */   
/*     */ 
/*     */   protected int g;
/*     */   
/*     */   private boolean bv;
/*     */   
/*     */   private sa bw;
/*     */   private dh bx;
/*     */   private float b(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 511 */     float f1 = qh.g(paramFloat2 - paramFloat1);
/* 512 */     if (f1 > paramFloat3) {
/* 513 */       f1 = paramFloat3;
/*     */     }
/* 515 */     if (f1 < -paramFloat3) {
/* 516 */       f1 = -paramFloat3;
/*     */     }
/* 518 */     return paramFloat1 + f1;
/*     */   }
/*     */   
/*     */   public boolean by() {
/* 522 */     return (this.o.b(this.C)) && (this.o.a(this, this.C).isEmpty()) && (!this.o.d(this.C));
/*     */   }
/*     */   
/*     */   public float bz() {
/* 526 */     return 1.0F;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int bB()
/*     */   {
/* 534 */     return 4;
/*     */   }
/*     */   
/*     */   public int ax()
/*     */   {
/* 539 */     if (o() == null) return 3;
/* 540 */     int j = (int)(aS() - aY() * 0.33F);
/* 541 */     j -= (3 - this.o.r.a()) * 4;
/* 542 */     if (j < 0) j = 0;
/* 543 */     return j + 3;
/*     */   }
/*     */   
/*     */   public add be()
/*     */   {
/* 548 */     return this.br[0];
/*     */   }
/*     */   
/*     */   public add q(int paramInt)
/*     */   {
/* 553 */     return this.br[paramInt];
/*     */   }
/*     */   
/*     */   public add r(int paramInt)
/*     */   {
/* 558 */     return this.br[(paramInt + 1)];
/*     */   }
/*     */   
/*     */   public void c(int paramInt, add paramadd)
/*     */   {
/* 563 */     this.br[paramInt] = paramadd;
/*     */   }
/*     */   
/*     */   public add[] ak()
/*     */   {
/* 568 */     return this.br;
/*     */   }
/*     */   
/*     */   protected void a(boolean paramBoolean, int paramInt)
/*     */   {
/* 573 */     for (int j = 0; j < ak().length; j++) {
/* 574 */       add localadd = q(j);
/* 575 */       int k = this.e[j] > 1.0F ? 1 : 0;
/*     */       
/* 577 */       if ((localadd != null) && ((paramBoolean) || (k != 0)) && (this.Z.nextFloat() - paramInt * 0.01F < this.e[j])) {
/* 578 */         if ((k == 0) && (localadd.g())) {
/* 579 */           int m = Math.max(localadd.l() - 25, 1);
/* 580 */           int n = localadd.l() - this.Z.nextInt(this.Z.nextInt(m) + 1);
/* 581 */           if (n > m) n = m;
/* 582 */           if (n < 1) n = 1;
/* 583 */           localadd.b(n);
/*     */         }
/* 585 */         a(localadd, 0.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bC() {
/* 591 */     if (this.Z.nextFloat() < 0.15F * this.o.b(this.s, this.t, this.u)) {
/* 592 */       int j = this.Z.nextInt(2);
/* 593 */       float f1 = this.o.r == rd.d ? 0.1F : 0.25F;
/* 594 */       if (this.Z.nextFloat() < 0.095F) j++;
/* 595 */       if (this.Z.nextFloat() < 0.095F) j++;
/* 596 */       if (this.Z.nextFloat() < 0.095F) { j++;
/*     */       }
/* 598 */       for (int k = 3; k >= 0; k--) {
/* 599 */         add localadd = r(k);
/* 600 */         if ((k < 3) && (this.Z.nextFloat() < f1)) break;
/* 601 */         if (localadd == null) {
/* 602 */           adb localadb = a(k + 1, j);
/* 603 */           if (localadb != null) c(k + 1, new add(localadb));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(add paramadd) {
/* 610 */     if ((paramadd.b() == adb.a(ajn.aK)) || (paramadd.b() == ade.bL)) {
/* 611 */       return 4;
/*     */     }
/*     */     
/* 614 */     if ((paramadd.b() instanceof abb)) {
/* 615 */       switch (((abb)paramadd.b()).b) {
/*     */       case 3: 
/* 617 */         return 1;
/*     */       case 2: 
/* 619 */         return 2;
/*     */       case 1: 
/* 621 */         return 3;
/*     */       case 0: 
/* 623 */         return 4;
/*     */       }
/*     */       
/*     */     }
/* 627 */     return 0;
/*     */   }
/*     */   
/*     */   public static adb a(int paramInt1, int paramInt2) {
/* 631 */     switch (paramInt1) {
/*     */     case 4: 
/* 633 */       if (paramInt2 == 0) return ade.Q;
/* 634 */       if (paramInt2 == 1) return ade.ag;
/* 635 */       if (paramInt2 == 2) return ade.U;
/* 636 */       if (paramInt2 == 3) return ade.Y;
/* 637 */       if (paramInt2 == 4) return ade.ac;
/*     */     case 3: 
/* 639 */       if (paramInt2 == 0) return ade.R;
/* 640 */       if (paramInt2 == 1) return ade.ah;
/* 641 */       if (paramInt2 == 2) return ade.V;
/* 642 */       if (paramInt2 == 3) return ade.Z;
/* 643 */       if (paramInt2 == 4) return ade.ad;
/*     */     case 2: 
/* 645 */       if (paramInt2 == 0) return ade.S;
/* 646 */       if (paramInt2 == 1) return ade.ai;
/* 647 */       if (paramInt2 == 2) return ade.W;
/* 648 */       if (paramInt2 == 3) return ade.aa;
/* 649 */       if (paramInt2 == 4) return ade.ae;
/*     */     case 1: 
/* 651 */       if (paramInt2 == 0) return ade.T;
/* 652 */       if (paramInt2 == 1) return ade.aj;
/* 653 */       if (paramInt2 == 2) return ade.X;
/* 654 */       if (paramInt2 == 3) return ade.ab;
/* 655 */       if (paramInt2 == 4) return ade.af;
/*     */       break;
/*     */     }
/* 658 */     return null;
/*     */   }
/*     */   
/*     */   protected void bD() {
/* 662 */     float f1 = this.o.b(this.s, this.t, this.u);
/*     */     
/* 664 */     if ((be() != null) && (this.Z.nextFloat() < 0.25F * f1)) {
/* 665 */       afv.a(this.Z, be(), (int)(5.0F + f1 * this.Z.nextInt(18)));
/*     */     }
/*     */     
/* 668 */     for (int j = 0; j < 4; j++) {
/* 669 */       add localadd = r(j);
/* 670 */       if ((localadd != null) && (this.Z.nextFloat() < 0.5F * f1)) {
/* 671 */         afv.a(this.Z, localadd, (int)(5.0F + f1 * this.Z.nextInt(18)));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public sy a(sy paramsy)
/*     */   {
/* 685 */     a(yj.b).a(new tj("Random spawn bonus", this.Z.nextGaussian() * 0.05D, 1));
/*     */     
/* 687 */     return paramsy;
/*     */   }
/*     */   
/*     */   public boolean bE() {
/* 691 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public String b_()
/*     */   {
/* 698 */     if (bH()) return bG();
/* 699 */     return super.b_();
/*     */   }
/*     */   
/*     */   public void bF() {
/* 703 */     this.bt = true;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 707 */     this.af.b(10, paramString);
/*     */   }
/*     */   
/*     */   public String bG() {
/* 711 */     return this.af.e(10);
/*     */   }
/*     */   
/*     */   public boolean bH() {
/* 715 */     return this.af.e(10).length() > 0;
/*     */   }
/*     */   
/*     */   public void g(boolean paramBoolean) {
/* 719 */     this.af.b(11, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */   
/*     */   public boolean bI() {
/* 723 */     return this.af.a(11) == 1;
/*     */   }
/*     */   
/*     */   public boolean bi()
/*     */   {
/* 728 */     return bI();
/*     */   }
/*     */   
/*     */   public void a(int paramInt, float paramFloat) {
/* 732 */     this.e[paramInt] = paramFloat;
/*     */   }
/*     */   
/*     */   public boolean bJ() {
/* 736 */     return this.bs;
/*     */   }
/*     */   
/*     */   public void h(boolean paramBoolean) {
/* 740 */     this.bs = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean bK() {
/* 744 */     return this.bt;
/*     */   }
/*     */   
/*     */ 
/*     */   public final boolean c(yz paramyz)
/*     */   {
/* 750 */     if ((bN()) && (bO() == paramyz)) {
/* 751 */       a(true, !paramyz.bE.d);
/* 752 */       return true;
/*     */     }
/*     */     
/* 755 */     add localadd = paramyz.bm.h();
/* 756 */     if (localadd != null)
/*     */     {
/*     */ 
/*     */ 
/* 760 */       if ((localadd.b() == ade.ca) && 
/* 761 */         (bM())) {
/* 762 */         if (((this instanceof tg)) && (((tg)this).bZ())) {
/* 763 */           if (((tg)this).e(paramyz)) {
/* 764 */             b(paramyz, true);
/* 765 */             localadd.b -= 1;
/* 766 */             return true;
/*     */           }
/*     */         } else {
/* 769 */           b(paramyz, true);
/* 770 */           localadd.b -= 1;
/* 771 */           return true;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 777 */     if (a(paramyz)) {
/* 778 */       return true;
/*     */     }
/*     */     
/* 781 */     return super.c(paramyz);
/*     */   }
/*     */   
/*     */   protected boolean a(yz paramyz) {
/* 785 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void bL()
/*     */   {
/* 795 */     if (this.bx != null) {
/* 796 */       bP();
/*     */     }
/* 798 */     if (!this.bv) {
/* 799 */       return;
/*     */     }
/*     */     
/* 802 */     if ((this.bw == null) || (this.bw.K)) {
/* 803 */       a(true, true);
/* 804 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean1, boolean paramBoolean2) {
/* 809 */     if (this.bv) {
/* 810 */       this.bv = false;
/* 811 */       this.bw = null;
/* 812 */       if ((!this.o.E) && (paramBoolean2)) {
/* 813 */         a(ade.ca, 1);
/*     */       }
/*     */       
/* 816 */       if ((!this.o.E) && (paramBoolean1) && ((this.o instanceof mt))) {
/* 817 */         ((mt)this.o).r().a(this, new hx(1, this, null));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean bM() {
/* 823 */     return (!bN()) && (!(this instanceof yb));
/*     */   }
/*     */   
/*     */   public boolean bN() {
/* 827 */     return this.bv;
/*     */   }
/*     */   
/*     */   public sa bO() {
/* 831 */     return this.bw;
/*     */   }
/*     */   
/*     */   public void b(sa paramsa, boolean paramBoolean) {
/* 835 */     this.bv = true;
/* 836 */     this.bw = paramsa;
/*     */     
/* 838 */     if ((!this.o.E) && (paramBoolean) && ((this.o instanceof mt))) {
/* 839 */       ((mt)this.o).r().a(this, new hx(1, this, this.bw));
/*     */     }
/*     */   }
/*     */   
/*     */   private void bP()
/*     */   {
/* 845 */     if ((this.bv) && (this.bx != null)) { UUID localUUID;
/* 846 */       Iterator localIterator; Object localObject; if ((this.bx.b("UUIDMost", 4)) && (this.bx.b("UUIDLeast", 4))) {
/* 847 */         localUUID = new UUID(this.bx.g("UUIDMost"), this.bx.g("UUIDLeast"));
/* 848 */         List localList = this.o.a(sv.class, this.C.b(10.0D, 10.0D, 10.0D));
/* 849 */         for (localIterator = localList.iterator(); localIterator.hasNext();) { localObject = (sv)localIterator.next();
/* 850 */           if (((sv)localObject).aB().equals(localUUID)) {
/* 851 */             this.bw = ((sa)localObject);
/* 852 */             break;
/*     */           }
/*     */         }
/* 855 */       } else if ((this.bx.b("X", 99)) && (this.bx.b("Y", 99)) && (this.bx.b("Z", 99))) {
/* 856 */         int j = this.bx.f("X");
/* 857 */         int k = this.bx.f("Y");
/* 858 */         int m = this.bx.f("Z");
/*     */         
/* 860 */         localObject = su.b(this.o, j, k, m);
/* 861 */         if (localObject == null) {
/* 862 */           localObject = su.a(this.o, j, k, m);
/*     */         }
/* 864 */         this.bw = ((sa)localObject);
/*     */       }
/*     */       else {
/* 867 */         a(false, true);
/*     */       }
/*     */     }
/* 870 */     this.bx = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */