/*     */ import java.util.Calendar;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yq
/*     */   extends yg
/*     */ {
/*  38 */   protected static final th bp = new to("zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D).a("Spawn Reinforcements Chance");
/*  39 */   private static final UUID bq = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
/*  40 */   private static final tj br = new tj(bq, "Baby speed boost", 0.5D, 1);
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
/*  53 */   private final tz bs = new tz(this);
/*     */   private int bt;
/*  55 */   private boolean bu = false;
/*     */   
/*     */   public yq(ahb paramahb) {
/*  58 */     super(paramahb);
/*     */     
/*  60 */     m().b(true);
/*  61 */     this.c.a(0, new uf(this));
/*  62 */     this.c.a(2, new uq(this, yz.class, 1.0D, false));
/*  63 */     this.c.a(4, new uq(this, yv.class, 1.0D, true));
/*  64 */     this.c.a(5, new ut(this, 1.0D));
/*  65 */     this.c.a(6, new us(this, 1.0D, false));
/*  66 */     this.c.a(7, new vc(this, 1.0D));
/*  67 */     this.c.a(8, new un(this, yz.class, 8.0F));
/*  68 */     this.c.a(8, new vb(this));
/*     */     
/*  70 */     this.d.a(1, new vn(this, true));
/*  71 */     this.d.a(2, new vo(this, yz.class, 0, true));
/*  72 */     this.d.a(2, new vo(this, yv.class, 0, false));
/*     */     
/*  74 */     a(0.6F, 1.8F);
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  79 */     super.aD();
/*     */     
/*  81 */     a(yj.b).a(40.0D);
/*  82 */     a(yj.d).a(0.23000000417232513D);
/*  83 */     a(yj.e).a(3.0D);
/*     */     
/*  85 */     bc().b(bp).a(this.Z.nextDouble() * 0.10000000149011612D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  90 */     super.c();
/*     */     
/*  92 */     z().a(12, Byte.valueOf((byte)0));
/*  93 */     z().a(13, Byte.valueOf((byte)0));
/*  94 */     z().a(14, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public int aV()
/*     */   {
/*  99 */     int i = super.aV() + 2;
/* 100 */     if (i > 20) i = 20;
/* 101 */     return i;
/*     */   }
/*     */   
/*     */   protected boolean bk()
/*     */   {
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 110 */     return this.bu;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 114 */     if (this.bu != paramBoolean) {
/* 115 */       this.bu = paramBoolean;
/*     */       
/* 117 */       if (paramBoolean) {
/* 118 */         this.c.a(1, this.bs);
/*     */       } else {
/* 120 */         this.c.a(this.bs);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 127 */     return z().a(12) == 1;
/*     */   }
/*     */   
/*     */   protected int e(yz paramyz)
/*     */   {
/* 132 */     if (f()) {
/* 133 */       this.b = ((int)(this.b * 2.5F));
/*     */     }
/*     */     
/* 136 */     return super.e(paramyz);
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 140 */     z().b(12, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */     
/* 142 */     if ((this.o != null) && (!this.o.E)) {
/* 143 */       ti localti = a(yj.d);
/* 144 */       localti.b(br);
/* 145 */       if (paramBoolean) {
/* 146 */         localti.a(br);
/*     */       }
/*     */     }
/*     */     
/* 150 */     k(paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean cb() {
/* 154 */     return z().a(13) == 1;
/*     */   }
/*     */   
/*     */   public void j(boolean paramBoolean) {
/* 158 */     z().b(13, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 163 */     if ((this.o.w()) && (!this.o.E) && (!f())) {
/* 164 */       float f = d(1.0F);
/* 165 */       if ((f > 0.5F) && (this.Z.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) && (this.o.i(qh.c(this.s), qh.c(this.t), qh.c(this.u)))) {
/* 166 */         int i = 1;
/*     */         
/* 168 */         add localadd = q(4);
/* 169 */         if (localadd != null) {
/* 170 */           if (localadd.g()) {
/* 171 */             localadd.b(localadd.j() + this.Z.nextInt(2));
/* 172 */             if (localadd.j() >= localadd.l()) {
/* 173 */               a(localadd);
/* 174 */               c(4, null);
/*     */             }
/*     */           }
/*     */           
/* 178 */           i = 0;
/*     */         }
/*     */         
/* 181 */         if (i != 0) {
/* 182 */           e(8);
/*     */         }
/*     */       }
/*     */     }
/* 186 */     if ((am()) && (o() != null) && ((this.m instanceof wg))) {
/* 187 */       ((sw)this.m).m().a(m().e(), 1.5D);
/*     */     }
/* 189 */     super.e();
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 194 */     if (super.a(paramro, paramFloat)) {
/* 195 */       sv localsv = o();
/* 196 */       if ((localsv == null) && ((bT() instanceof sv))) localsv = (sv)bT();
/* 197 */       if ((localsv == null) && ((paramro.j() instanceof sv))) { localsv = (sv)paramro.j();
/*     */       }
/* 199 */       if ((localsv != null) && (this.o.r == rd.d) && (this.Z.nextFloat() < a(bp).e())) {
/* 200 */         int i = qh.c(this.s);
/* 201 */         int j = qh.c(this.t);
/* 202 */         int k = qh.c(this.u);
/* 203 */         yq localyq = new yq(this.o);
/*     */         
/* 205 */         for (int m = 0; m < 50; m++) {
/* 206 */           int n = i + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
/* 207 */           int i1 = j + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
/* 208 */           int i2 = k + qh.a(this.Z, 7, 40) * qh.a(this.Z, -1, 1);
/*     */           
/* 210 */           if ((ahb.a(this.o, n, i1 - 1, i2)) && (this.o.k(n, i1, i2) < 10)) {
/* 211 */             localyq.b(n, i1, i2);
/*     */             
/* 213 */             if ((this.o.b(localyq.C)) && (this.o.a(localyq, localyq.C).isEmpty()) && (!this.o.d(localyq.C))) {
/* 214 */               this.o.d(localyq);
/* 215 */               localyq.d(localsv);
/* 216 */               localyq.a(null);
/*     */               
/* 218 */               a(bp).a(new tj("Zombie reinforcement caller charge", -0.05000000074505806D, 0));
/* 219 */               localyq.a(bp).a(new tj("Zombie reinforcement callee charge", -0.05000000074505806D, 0));
/*     */               
/* 221 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 227 */       return true;
/*     */     }
/*     */     
/* 230 */     return false;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 235 */     if ((!this.o.E) && (cc())) {
/* 236 */       int i = ce();
/*     */       
/* 238 */       this.bt -= i;
/*     */       
/* 240 */       if (this.bt <= 0) {
/* 241 */         cd();
/*     */       }
/*     */     }
/*     */     
/* 245 */     super.h();
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/* 250 */     boolean bool = super.n(paramsa);
/*     */     
/* 252 */     if (bool) {
/* 253 */       int i = this.o.r.a();
/* 254 */       if ((be() == null) && (al()) && (this.Z.nextFloat() < i * 0.3F)) {
/* 255 */         paramsa.e(2 * i);
/*     */       }
/*     */     }
/*     */     
/* 259 */     return bool;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 264 */     return "mob.zombie.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 269 */     return "mob.zombie.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 274 */     return "mob.zombie.death";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 279 */     a("mob.zombie.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 284 */     return ade.bh;
/*     */   }
/*     */   
/*     */   public sz bd()
/*     */   {
/* 289 */     return sz.b;
/*     */   }
/*     */   
/*     */   protected void n(int paramInt)
/*     */   {
/* 294 */     switch (this.Z.nextInt(3)) {
/*     */     case 0: 
/* 296 */       a(ade.j, 1);
/* 297 */       break;
/*     */     case 1: 
/* 299 */       a(ade.bF, 1);
/* 300 */       break;
/*     */     case 2: 
/* 302 */       a(ade.bG, 1);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   protected void bC()
/*     */   {
/* 309 */     super.bC();
/*     */     
/* 311 */     if (this.Z.nextFloat() < (this.o.r == rd.d ? 0.05F : 0.01F)) {
/* 312 */       int i = this.Z.nextInt(3);
/* 313 */       if (i == 0) {
/* 314 */         c(0, new add(ade.l));
/*     */       } else {
/* 316 */         c(0, new add(ade.a));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 323 */     super.b(paramdh);
/*     */     
/* 325 */     if (f()) paramdh.a("IsBaby", true);
/* 326 */     if (cb()) paramdh.a("IsVillager", true);
/* 327 */     paramdh.a("ConversionTime", cc() ? this.bt : -1);
/* 328 */     paramdh.a("CanBreakDoors", bZ());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 333 */     super.a(paramdh);
/*     */     
/* 335 */     if (paramdh.n("IsBaby")) i(true);
/* 336 */     if (paramdh.n("IsVillager")) j(true);
/* 337 */     if ((paramdh.b("ConversionTime", 99)) && (paramdh.f("ConversionTime") > -1)) a(paramdh.f("ConversionTime"));
/* 338 */     a(paramdh.n("CanBreakDoors"));
/*     */   }
/*     */   
/*     */   public void a(sv paramsv)
/*     */   {
/* 343 */     super.a(paramsv);
/*     */     
/* 345 */     if (((this.o.r == rd.c) || (this.o.r == rd.d)) && ((paramsv instanceof yv))) {
/* 346 */       if ((this.o.r != rd.d) && (this.Z.nextBoolean())) { return;
/*     */       }
/* 348 */       yq localyq = new yq(this.o);
/* 349 */       localyq.k(paramsv);
/* 350 */       this.o.e(paramsv);
/* 351 */       localyq.a(null);
/* 352 */       localyq.j(true);
/* 353 */       if (paramsv.f()) localyq.i(true);
/* 354 */       this.o.d(localyq);
/*     */       
/* 356 */       this.o.a(null, 1016, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 362 */     paramsy = super.a(paramsy);
/* 363 */     float f = this.o.b(this.s, this.t, this.u);
/*     */     
/* 365 */     h(this.Z.nextFloat() < 0.55F * f);
/*     */     
/* 367 */     if (paramsy == null) {
/* 368 */       paramsy = new ys(this, this.o.s.nextFloat() < 0.05F, this.o.s.nextFloat() < 0.05F, null);
/*     */     }
/*     */     Object localObject1;
/* 371 */     if ((paramsy instanceof ys)) {
/* 372 */       localObject1 = (ys)paramsy;
/*     */       
/* 374 */       if (((ys)localObject1).b) {
/* 375 */         j(true);
/*     */       }
/*     */       
/* 378 */       if (((ys)localObject1).a) {
/* 379 */         i(true);
/*     */         Object localObject2;
/* 381 */         if (this.o.s.nextFloat() < 0.05D) {
/* 382 */           localObject2 = this.o.a(wg.class, this.C.b(5.0D, 3.0D, 5.0D), sj.b);
/*     */           
/* 384 */           if (!((List)localObject2).isEmpty()) {
/* 385 */             wg localwg = (wg)((List)localObject2).get(0);
/* 386 */             localwg.i(true);
/* 387 */             a(localwg);
/*     */           }
/* 389 */         } else if (this.o.s.nextFloat() < 0.05D) {
/* 390 */           localObject2 = new wg(this.o);
/* 391 */           ((wg)localObject2).b(this.s, this.t, this.u, this.y, 0.0F);
/* 392 */           ((wg)localObject2).a(null);
/* 393 */           ((wg)localObject2).i(true);
/* 394 */           this.o.d((sa)localObject2);
/* 395 */           a((sa)localObject2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 400 */     a(this.Z.nextFloat() < f * 0.1F);
/*     */     
/* 402 */     bC();
/* 403 */     bD();
/*     */     
/* 405 */     if (q(4) == null) {
/* 406 */       localObject1 = this.o.V();
/*     */       
/*     */ 
/* 409 */       if ((((Calendar)localObject1).get(2) + 1 == 10) && (((Calendar)localObject1).get(5) == 31) && (this.Z.nextFloat() < 0.25F))
/*     */       {
/* 411 */         c(4, new add(this.Z.nextFloat() < 0.1F ? ajn.aP : ajn.aK));
/* 412 */         this.e[4] = 0.0F;
/*     */       }
/*     */     }
/*     */     
/* 416 */     a(yj.c).a(new tj("Random spawn bonus", this.Z.nextDouble() * 0.05000000074505806D, 0));
/* 417 */     double d = this.Z.nextDouble() * 1.5D * this.o.b(this.s, this.t, this.u);
/* 418 */     if (d > 1.0D) {
/* 419 */       a(yj.b).a(new tj("Random zombie-spawn bonus", d, 2));
/*     */     }
/*     */     
/* 422 */     if (this.Z.nextFloat() < f * 0.05F) {
/* 423 */       a(bp).a(new tj("Leader zombie bonus", this.Z.nextDouble() * 0.25D + 0.5D, 0));
/* 424 */       a(yj.a).a(new tj("Leader zombie bonus", this.Z.nextDouble() * 3.0D + 1.0D, 2));
/* 425 */       a(true);
/*     */     }
/*     */     
/* 428 */     return paramsy;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 433 */     add localadd = paramyz.bF();
/*     */     
/* 435 */     if ((localadd != null) && (localadd.b() == ade.ao) && (localadd.k() == 0) && (cb()) && (a(rv.t))) {
/* 436 */       if (!paramyz.bE.d) localadd.b -= 1;
/* 437 */       if (localadd.b <= 0) {
/* 438 */         paramyz.bm.a(paramyz.bm.c, null);
/*     */       }
/*     */       
/* 441 */       if (!this.o.E) {
/* 442 */         a(this.Z.nextInt(2401) + 3600);
/*     */       }
/*     */       
/* 445 */       return true;
/*     */     }
/*     */     
/* 448 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt) {
/* 452 */     this.bt = paramInt;
/* 453 */     z().b(14, Byte.valueOf((byte)1));
/*     */     
/* 455 */     m(rv.t.H);
/* 456 */     c(new rw(rv.g.H, paramInt, Math.min(this.o.r.a() - 1, 0)));
/*     */     
/* 458 */     this.o.a(this, (byte)16);
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 463 */     if (paramByte == 16) {
/* 464 */       this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "mob.zombie.remedy", 1.0F + this.Z.nextFloat(), this.Z.nextFloat() * 0.7F + 0.3F, false);
/*     */     } else {
/* 466 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/* 472 */     return !cc();
/*     */   }
/*     */   
/*     */   public boolean cc() {
/* 476 */     return z().a(14) == 1;
/*     */   }
/*     */   
/*     */   protected void cd() {
/* 480 */     yv localyv = new yv(this.o);
/* 481 */     localyv.k(this);
/* 482 */     localyv.a(null);
/* 483 */     localyv.cd();
/* 484 */     if (f()) localyv.c(41536);
/* 485 */     this.o.e(this);
/* 486 */     this.o.d(localyv);
/*     */     
/* 488 */     localyv.c(new rw(rv.k.H, 200, 0));
/* 489 */     this.o.a(null, 1017, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */   }
/*     */   
/*     */   protected int ce() {
/* 493 */     int i = 1;
/*     */     
/* 495 */     if (this.Z.nextFloat() < 0.01F) {
/* 496 */       int j = 0;
/*     */       
/* 498 */       for (int k = (int)this.s - 4; (k < (int)this.s + 4) && (j < 14); k++) {
/* 499 */         for (int m = (int)this.t - 4; (m < (int)this.t + 4) && (j < 14); m++) {
/* 500 */           for (int n = (int)this.u - 4; (n < (int)this.u + 4) && (j < 14); n++)
/*     */           {
/* 502 */             aji localaji = this.o.a(k, m, n);
/* 503 */             if ((localaji == ajn.aY) || (localaji == ajn.C)) {
/* 504 */               if (this.Z.nextFloat() < 0.3F) i++;
/* 505 */               j++;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 511 */     return i;
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
/*     */   public void k(boolean paramBoolean)
/*     */   {
/* 526 */     a(paramBoolean ? 0.5F : 1.0F);
/*     */   }
/*     */   
/* 529 */   private float bv = -1.0F;
/*     */   private float bw;
/*     */   
/*     */   protected final void a(float paramFloat1, float paramFloat2)
/*     */   {
/* 534 */     int i = (this.bv > 0.0F) && (this.bw > 0.0F) ? 1 : 0;
/*     */     
/* 536 */     this.bv = paramFloat1;
/* 537 */     this.bw = paramFloat2;
/*     */     
/* 539 */     if (i == 0) {
/* 540 */       a(1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected final void a(float paramFloat) {
/* 545 */     super.a(this.bv * paramFloat, this.bw * paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */