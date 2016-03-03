/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
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
/*     */ public class yv
/*     */   extends rx
/*     */   implements agm, yu
/*     */ {
/*     */   private int bq;
/*     */   private boolean br;
/*     */   private boolean bs;
/*     */   vz bp;
/*     */   private yz bt;
/*     */   private ago bu;
/*     */   private int bv;
/*     */   private boolean bw;
/*     */   private int bx;
/*     */   private String by;
/*     */   private boolean bz;
/*     */   private float bA;
/*     */   
/*     */   public yv(ahb paramahb)
/*     */   {
/*  50 */     this(paramahb, 0);
/*     */   }
/*     */   
/*     */   public yv(ahb paramahb, int paramInt) {
/*  54 */     super(paramahb);
/*  55 */     s(paramInt);
/*  56 */     a(0.6F, 1.8F);
/*     */     
/*  58 */     m().b(true);
/*  59 */     m().a(true);
/*     */     
/*  61 */     this.c.a(0, new uf(this));
/*  62 */     this.c.a(1, new tw(this, yq.class, 8.0F, 0.6D, 0.6D));
/*  63 */     this.c.a(1, new vl(this));
/*  64 */     this.c.a(1, new uo(this));
/*  65 */     this.c.a(2, new ur(this));
/*  66 */     this.c.a(3, new ve(this));
/*  67 */     this.c.a(4, new uy(this, true));
/*  68 */     this.c.a(5, new ut(this, 0.6D));
/*  69 */     this.c.a(6, new up(this));
/*  70 */     this.c.a(7, new vj(this));
/*  71 */     this.c.a(8, new va(this, 0.32D));
/*  72 */     this.c.a(9, new ul(this, yz.class, 3.0F, 1.0F));
/*  73 */     this.c.a(9, new ul(this, yv.class, 5.0F, 0.02F));
/*  74 */     this.c.a(9, new vc(this, 0.6D));
/*  75 */     this.c.a(10, new un(this, sw.class, 8.0F));
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  80 */     super.aD();
/*     */     
/*  82 */     a(yj.d).a(0.5D);
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  87 */     return true;
/*     */   }
/*     */   
/*     */   protected void bp() {
/*     */     Object localObject;
/*  92 */     if (--this.bq <= 0) {
/*  93 */       this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u));
/*  94 */       this.bq = (70 + this.Z.nextInt(50));
/*     */       
/*  96 */       this.bp = this.o.A.a(qh.c(this.s), qh.c(this.t), qh.c(this.u), 32);
/*  97 */       if (this.bp == null) { bX();
/*     */       } else {
/*  99 */         localObject = this.bp.a();
/* 100 */         a(((r)localObject).a, ((r)localObject).b, ((r)localObject).c, (int)(this.bp.b() * 0.6F));
/*     */         
/* 102 */         if (this.bz) {
/* 103 */           this.bz = false;
/* 104 */           this.bp.b(5);
/*     */         }
/*     */       }
/*     */     }
/* 108 */     if ((!cc()) && (this.bv > 0)) {
/* 109 */       this.bv -= 1;
/* 110 */       if (this.bv <= 0) {
/* 111 */         if (this.bw)
/*     */         {
/*     */ 
/* 114 */           if (this.bu.size() > 1) {
/* 115 */             for (localObject = this.bu.iterator(); ((Iterator)localObject).hasNext();) { agn localagn = (agn)((Iterator)localObject).next();
/* 116 */               if (localagn.g()) {
/* 117 */                 localagn.a(this.Z.nextInt(6) + this.Z.nextInt(6) + 2);
/*     */               }
/*     */             }
/*     */           }
/*     */           
/* 122 */           t(1);
/* 123 */           this.bw = false;
/*     */           
/* 125 */           if ((this.bp != null) && (this.by != null)) {
/* 126 */             this.o.a(this, (byte)14);
/* 127 */             this.bp.a(this.by, 1);
/*     */           }
/*     */         }
/* 130 */         c(new rw(rv.l.H, 200, 0));
/*     */       }
/*     */     }
/*     */     
/* 134 */     super.bp();
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 140 */     add localadd = paramyz.bm.h();
/* 141 */     int i = (localadd != null) && (localadd.b() == ade.bx) ? 1 : 0;
/*     */     
/* 143 */     if ((i == 0) && (Z()) && (!cc()) && (!f())) {
/* 144 */       if (!this.o.E)
/*     */       {
/* 146 */         a_(paramyz);
/* 147 */         paramyz.a(this, bG());
/*     */       }
/* 149 */       return true;
/*     */     }
/* 151 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/* 156 */     super.c();
/* 157 */     this.af.a(16, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 162 */     super.b(paramdh);
/* 163 */     paramdh.a("Profession", bZ());
/* 164 */     paramdh.a("Riches", this.bx);
/* 165 */     if (this.bu != null) {
/* 166 */       paramdh.a("Offers", this.bu.a());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 172 */     super.a(paramdh);
/* 173 */     s(paramdh.f("Profession"));
/* 174 */     this.bx = paramdh.f("Riches");
/* 175 */     if (paramdh.b("Offers", 10)) {
/* 176 */       dh localdh = paramdh.m("Offers");
/* 177 */       this.bu = new ago(localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/* 183 */     return false;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 188 */     if (cc()) {
/* 189 */       return "mob.villager.haggle";
/*     */     }
/* 191 */     return "mob.villager.idle";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 196 */     return "mob.villager.hit";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 201 */     return "mob.villager.death";
/*     */   }
/*     */   
/*     */   public void s(int paramInt) {
/* 205 */     this.af.b(16, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int bZ() {
/* 209 */     return this.af.c(16);
/*     */   }
/*     */   
/*     */   public boolean ca() {
/* 213 */     return this.br;
/*     */   }
/*     */   
/*     */   public void i(boolean paramBoolean) {
/* 217 */     this.br = paramBoolean;
/*     */   }
/*     */   
/*     */   public void j(boolean paramBoolean) {
/* 221 */     this.bs = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean cb() {
/* 225 */     return this.bs;
/*     */   }
/*     */   
/*     */   public void b(sv paramsv)
/*     */   {
/* 230 */     super.b(paramsv);
/* 231 */     if ((this.bp != null) && (paramsv != null)) {
/* 232 */       this.bp.a(paramsv);
/*     */       
/* 234 */       if ((paramsv instanceof yz)) {
/* 235 */         int i = -1;
/* 236 */         if (f()) {
/* 237 */           i = -3;
/*     */         }
/* 239 */         this.bp.a(paramsv.b_(), i);
/* 240 */         if (Z()) {
/* 241 */           this.o.a(this, (byte)13);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ro paramro)
/*     */   {
/* 250 */     if (this.bp != null) {
/* 251 */       sa localsa = paramro.j();
/* 252 */       if (localsa != null) {
/* 253 */         if ((localsa instanceof yz)) {
/* 254 */           this.bp.a(localsa.b_(), -2);
/* 255 */         } else if ((localsa instanceof yb)) {
/* 256 */           this.bp.h();
/*     */         }
/* 258 */       } else if (localsa == null)
/*     */       {
/*     */ 
/* 261 */         yz localyz = this.o.a(this, 16.0D);
/* 262 */         if (localyz != null) {
/* 263 */           this.bp.h();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 268 */     super.a(paramro);
/*     */   }
/*     */   
/*     */   public void a_(yz paramyz)
/*     */   {
/* 273 */     this.bt = paramyz;
/*     */   }
/*     */   
/*     */   public yz b()
/*     */   {
/* 278 */     return this.bt;
/*     */   }
/*     */   
/*     */   public boolean cc() {
/* 282 */     return this.bt != null;
/*     */   }
/*     */   
/*     */   public void a(agn paramagn)
/*     */   {
/* 287 */     paramagn.f();
/* 288 */     this.a_ = (-q());
/* 289 */     a("mob.villager.yes", bf(), bg());
/*     */     
/*     */ 
/* 292 */     if (paramagn.a((agn)this.bu.get(this.bu.size() - 1))) {
/* 293 */       this.bv = 40;
/* 294 */       this.bw = true;
/* 295 */       if (this.bt != null) {
/* 296 */         this.by = this.bt.b_();
/*     */       } else {
/* 298 */         this.by = null;
/*     */       }
/*     */     }
/* 301 */     if (paramagn.a().b() == ade.bC) {
/* 302 */       this.bx += paramagn.a().b;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a_(add paramadd)
/*     */   {
/* 308 */     if ((!this.o.E) && (this.a_ > -q() + 20)) {
/* 309 */       this.a_ = (-q());
/* 310 */       if (paramadd != null) {
/* 311 */         a("mob.villager.yes", bf(), bg());
/*     */       } else {
/* 313 */         a("mob.villager.no", bf(), bg());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public ago b(yz paramyz)
/*     */   {
/* 320 */     if (this.bu == null) {
/* 321 */       t(1);
/*     */     }
/* 323 */     return this.bu;
/*     */   }
/*     */   
/*     */ 
/*     */   private float p(float paramFloat)
/*     */   {
/* 329 */     float f = paramFloat + this.bA;
/* 330 */     if (f > 0.9F) {
/* 331 */       return 0.9F - (f - 0.9F);
/*     */     }
/* 333 */     return f;
/*     */   }
/*     */   
/*     */   private void t(int paramInt)
/*     */   {
/* 338 */     if (this.bu != null) {
/* 339 */       this.bA = (qh.c(this.bu.size()) * 0.2F);
/*     */     } else {
/* 341 */       this.bA = 0.0F;
/*     */     }
/*     */     
/* 344 */     ago localago = new ago();
/* 345 */     Object localObject1; int m; switch (bZ()) {
/*     */     case 0: 
/* 347 */       a(localago, ade.O, this.Z, p(0.9F));
/* 348 */       a(localago, adb.a(ajn.L), this.Z, p(0.5F));
/* 349 */       a(localago, ade.bf, this.Z, p(0.5F));
/* 350 */       a(localago, ade.aQ, this.Z, p(0.4F));
/* 351 */       b(localago, ade.P, this.Z, p(0.9F));
/* 352 */       b(localago, ade.ba, this.Z, p(0.3F));
/* 353 */       b(localago, ade.e, this.Z, p(0.3F));
/* 354 */       b(localago, ade.aX, this.Z, p(0.3F));
/* 355 */       b(localago, ade.aZ, this.Z, p(0.3F));
/* 356 */       b(localago, ade.d, this.Z, p(0.3F));
/* 357 */       b(localago, ade.bg, this.Z, p(0.3F));
/* 358 */       b(localago, ade.g, this.Z, p(0.5F));
/* 359 */       if (this.Z.nextFloat() < p(0.5F)) {
/* 360 */         localago.add(new agn(new add(ajn.n, 10), new add(ade.bC), new add(ade.ak, 4 + this.Z.nextInt(2), 0)));
/*     */       }
/*     */       break;
/*     */     case 4: 
/* 364 */       a(localago, ade.h, this.Z, p(0.7F));
/* 365 */       a(localago, ade.al, this.Z, p(0.5F));
/* 366 */       a(localago, ade.bd, this.Z, p(0.5F));
/* 367 */       b(localago, ade.av, this.Z, p(0.1F));
/* 368 */       b(localago, ade.R, this.Z, p(0.3F));
/* 369 */       b(localago, ade.T, this.Z, p(0.3F));
/* 370 */       b(localago, ade.Q, this.Z, p(0.3F));
/* 371 */       b(localago, ade.S, this.Z, p(0.3F));
/* 372 */       b(localago, ade.am, this.Z, p(0.3F));
/* 373 */       b(localago, ade.be, this.Z, p(0.3F));
/* 374 */       break;
/*     */     case 3: 
/* 376 */       a(localago, ade.h, this.Z, p(0.7F));
/* 377 */       a(localago, ade.j, this.Z, p(0.5F));
/* 378 */       a(localago, ade.k, this.Z, p(0.5F));
/* 379 */       a(localago, ade.i, this.Z, p(0.5F));
/*     */       
/* 381 */       b(localago, ade.l, this.Z, p(0.5F));
/* 382 */       b(localago, ade.u, this.Z, p(0.5F));
/* 383 */       b(localago, ade.c, this.Z, p(0.3F));
/* 384 */       b(localago, ade.x, this.Z, p(0.3F));
/* 385 */       b(localago, ade.b, this.Z, p(0.5F));
/* 386 */       b(localago, ade.w, this.Z, p(0.5F));
/* 387 */       b(localago, ade.a, this.Z, p(0.2F));
/* 388 */       b(localago, ade.v, this.Z, p(0.2F));
/* 389 */       b(localago, ade.K, this.Z, p(0.2F));
/* 390 */       b(localago, ade.L, this.Z, p(0.2F));
/* 391 */       b(localago, ade.ab, this.Z, p(0.2F));
/* 392 */       b(localago, ade.af, this.Z, p(0.2F));
/* 393 */       b(localago, ade.Y, this.Z, p(0.2F));
/* 394 */       b(localago, ade.ac, this.Z, p(0.2F));
/* 395 */       b(localago, ade.Z, this.Z, p(0.2F));
/* 396 */       b(localago, ade.ad, this.Z, p(0.2F));
/* 397 */       b(localago, ade.aa, this.Z, p(0.2F));
/* 398 */       b(localago, ade.ae, this.Z, p(0.2F));
/* 399 */       b(localago, ade.X, this.Z, p(0.1F));
/* 400 */       b(localago, ade.U, this.Z, p(0.1F));
/* 401 */       b(localago, ade.V, this.Z, p(0.1F));
/* 402 */       b(localago, ade.W, this.Z, p(0.1F));
/* 403 */       break;
/*     */     case 1: 
/* 405 */       a(localago, ade.aF, this.Z, p(0.8F));
/* 406 */       a(localago, ade.aG, this.Z, p(0.8F));
/* 407 */       a(localago, ade.bB, this.Z, p(0.3F));
/* 408 */       b(localago, adb.a(ajn.X), this.Z, p(0.8F));
/* 409 */       b(localago, adb.a(ajn.w), this.Z, p(0.2F));
/* 410 */       b(localago, ade.aL, this.Z, p(0.2F));
/* 411 */       b(localago, ade.aN, this.Z, p(0.2F));
/*     */       
/* 413 */       if (this.Z.nextFloat() < p(0.07F)) {
/* 414 */         localObject1 = aft.c[this.Z.nextInt(aft.c.length)];
/* 415 */         int j = qh.a(this.Z, ((aft)localObject1).d(), ((aft)localObject1).b());
/* 416 */         add localadd = ade.bR.a(new agc((aft)localObject1, j));
/* 417 */         m = 2 + this.Z.nextInt(5 + j * 10) + 3 * j;
/*     */         
/* 419 */         localago.add(new agn(new add(ade.aG), new add(ade.bC, m), localadd)); }
/* 420 */       break;
/*     */     
/*     */     case 2: 
/* 423 */       b(localago, ade.bv, this.Z, p(0.3F));
/* 424 */       b(localago, ade.by, this.Z, p(0.2F));
/* 425 */       b(localago, ade.ax, this.Z, p(0.4F));
/* 426 */       b(localago, adb.a(ajn.aN), this.Z, p(0.3F));
/*     */       
/* 428 */       localObject1 = new adb[] { ade.l, ade.u, ade.Z, ade.ad, ade.c, ade.x, ade.b, ade.w };
/*     */       
/* 430 */       for (adb localadb : localObject1) {
/* 431 */         if (this.Z.nextFloat() < p(0.05F)) {
/* 432 */           localago.add(new agn(new add(localadb, 1, 0), new add(ade.bC, 2 + this.Z.nextInt(3), 0), afv.a(this.Z, new add(localadb, 1, 0), 5 + this.Z.nextInt(15))));
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 439 */     if (localago.isEmpty()) {
/* 440 */       a(localago, ade.k, this.Z, 1.0F);
/*     */     }
/*     */     
/*     */ 
/* 444 */     Collections.shuffle(localago);
/*     */     
/* 446 */     if (this.bu == null) {
/* 447 */       this.bu = new ago();
/*     */     }
/* 449 */     for (int i = 0; (i < paramInt) && (i < localago.size()); i++) {
/* 450 */       this.bu.a((agn)localago.get(i));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 458 */   private static final Map bB = new HashMap();
/* 459 */   private static final Map bC = new HashMap();
/*     */   
/* 461 */   static { bB.put(ade.h, new qu(Integer.valueOf(16), Integer.valueOf(24)));
/* 462 */     bB.put(ade.j, new qu(Integer.valueOf(8), Integer.valueOf(10)));
/* 463 */     bB.put(ade.k, new qu(Integer.valueOf(8), Integer.valueOf(10)));
/* 464 */     bB.put(ade.i, new qu(Integer.valueOf(4), Integer.valueOf(6)));
/* 465 */     bB.put(ade.aF, new qu(Integer.valueOf(24), Integer.valueOf(36)));
/* 466 */     bB.put(ade.aG, new qu(Integer.valueOf(11), Integer.valueOf(13)));
/* 467 */     bB.put(ade.bB, new qu(Integer.valueOf(1), Integer.valueOf(1)));
/* 468 */     bB.put(ade.bi, new qu(Integer.valueOf(3), Integer.valueOf(4)));
/* 469 */     bB.put(ade.bv, new qu(Integer.valueOf(2), Integer.valueOf(3)));
/* 470 */     bB.put(ade.al, new qu(Integer.valueOf(14), Integer.valueOf(18)));
/* 471 */     bB.put(ade.bd, new qu(Integer.valueOf(14), Integer.valueOf(18)));
/* 472 */     bB.put(ade.bf, new qu(Integer.valueOf(14), Integer.valueOf(18)));
/* 473 */     bB.put(ade.aQ, new qu(Integer.valueOf(9), Integer.valueOf(13)));
/* 474 */     bB.put(ade.N, new qu(Integer.valueOf(34), Integer.valueOf(48)));
/* 475 */     bB.put(ade.bc, new qu(Integer.valueOf(30), Integer.valueOf(38)));
/* 476 */     bB.put(ade.bb, new qu(Integer.valueOf(30), Integer.valueOf(38)));
/* 477 */     bB.put(ade.O, new qu(Integer.valueOf(18), Integer.valueOf(22)));
/* 478 */     bB.put(adb.a(ajn.L), new qu(Integer.valueOf(14), Integer.valueOf(22)));
/* 479 */     bB.put(ade.bh, new qu(Integer.valueOf(36), Integer.valueOf(64)));
/*     */     
/* 481 */     bC.put(ade.d, new qu(Integer.valueOf(3), Integer.valueOf(4)));
/* 482 */     bC.put(ade.aZ, new qu(Integer.valueOf(3), Integer.valueOf(4)));
/* 483 */     bC.put(ade.l, new qu(Integer.valueOf(7), Integer.valueOf(11)));
/* 484 */     bC.put(ade.u, new qu(Integer.valueOf(12), Integer.valueOf(14)));
/* 485 */     bC.put(ade.c, new qu(Integer.valueOf(6), Integer.valueOf(8)));
/* 486 */     bC.put(ade.x, new qu(Integer.valueOf(9), Integer.valueOf(12)));
/* 487 */     bC.put(ade.b, new qu(Integer.valueOf(7), Integer.valueOf(9)));
/* 488 */     bC.put(ade.w, new qu(Integer.valueOf(10), Integer.valueOf(12)));
/* 489 */     bC.put(ade.a, new qu(Integer.valueOf(4), Integer.valueOf(6)));
/* 490 */     bC.put(ade.v, new qu(Integer.valueOf(7), Integer.valueOf(8)));
/* 491 */     bC.put(ade.K, new qu(Integer.valueOf(4), Integer.valueOf(6)));
/* 492 */     bC.put(ade.L, new qu(Integer.valueOf(7), Integer.valueOf(8)));
/* 493 */     bC.put(ade.ab, new qu(Integer.valueOf(4), Integer.valueOf(6)));
/* 494 */     bC.put(ade.af, new qu(Integer.valueOf(7), Integer.valueOf(8)));
/* 495 */     bC.put(ade.Y, new qu(Integer.valueOf(4), Integer.valueOf(6)));
/* 496 */     bC.put(ade.ac, new qu(Integer.valueOf(7), Integer.valueOf(8)));
/* 497 */     bC.put(ade.Z, new qu(Integer.valueOf(10), Integer.valueOf(14)));
/* 498 */     bC.put(ade.ad, new qu(Integer.valueOf(16), Integer.valueOf(19)));
/* 499 */     bC.put(ade.aa, new qu(Integer.valueOf(8), Integer.valueOf(10)));
/* 500 */     bC.put(ade.ae, new qu(Integer.valueOf(11), Integer.valueOf(14)));
/* 501 */     bC.put(ade.X, new qu(Integer.valueOf(5), Integer.valueOf(7)));
/* 502 */     bC.put(ade.U, new qu(Integer.valueOf(5), Integer.valueOf(7)));
/* 503 */     bC.put(ade.V, new qu(Integer.valueOf(11), Integer.valueOf(15)));
/* 504 */     bC.put(ade.W, new qu(Integer.valueOf(9), Integer.valueOf(11)));
/* 505 */     bC.put(ade.P, new qu(Integer.valueOf(-4), Integer.valueOf(-2)));
/* 506 */     bC.put(ade.ba, new qu(Integer.valueOf(-8), Integer.valueOf(-4)));
/* 507 */     bC.put(ade.e, new qu(Integer.valueOf(-8), Integer.valueOf(-4)));
/* 508 */     bC.put(ade.aX, new qu(Integer.valueOf(-10), Integer.valueOf(-7)));
/* 509 */     bC.put(adb.a(ajn.w), new qu(Integer.valueOf(-5), Integer.valueOf(-3)));
/* 510 */     bC.put(adb.a(ajn.X), new qu(Integer.valueOf(3), Integer.valueOf(4)));
/* 511 */     bC.put(ade.R, new qu(Integer.valueOf(4), Integer.valueOf(5)));
/* 512 */     bC.put(ade.T, new qu(Integer.valueOf(2), Integer.valueOf(4)));
/* 513 */     bC.put(ade.Q, new qu(Integer.valueOf(2), Integer.valueOf(4)));
/* 514 */     bC.put(ade.S, new qu(Integer.valueOf(2), Integer.valueOf(4)));
/* 515 */     bC.put(ade.av, new qu(Integer.valueOf(6), Integer.valueOf(8)));
/* 516 */     bC.put(ade.by, new qu(Integer.valueOf(-4), Integer.valueOf(-1)));
/* 517 */     bC.put(ade.ax, new qu(Integer.valueOf(-4), Integer.valueOf(-1)));
/* 518 */     bC.put(ade.aL, new qu(Integer.valueOf(10), Integer.valueOf(12)));
/* 519 */     bC.put(ade.aN, new qu(Integer.valueOf(10), Integer.valueOf(12)));
/* 520 */     bC.put(adb.a(ajn.aN), new qu(Integer.valueOf(-3), Integer.valueOf(-1)));
/* 521 */     bC.put(ade.am, new qu(Integer.valueOf(-7), Integer.valueOf(-5)));
/* 522 */     bC.put(ade.be, new qu(Integer.valueOf(-7), Integer.valueOf(-5)));
/* 523 */     bC.put(ade.bg, new qu(Integer.valueOf(-8), Integer.valueOf(-6)));
/* 524 */     bC.put(ade.bv, new qu(Integer.valueOf(7), Integer.valueOf(11)));
/* 525 */     bC.put(ade.g, new qu(Integer.valueOf(-12), Integer.valueOf(-8)));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static void a(ago paramago, adb paramadb, Random paramRandom, float paramFloat)
/*     */   {
/* 537 */     if (paramRandom.nextFloat() < paramFloat) {
/* 538 */       paramago.add(new agn(a(paramadb, paramRandom), ade.bC));
/*     */     }
/*     */   }
/*     */   
/*     */   private static add a(adb paramadb, Random paramRandom) {
/* 543 */     return new add(paramadb, b(paramadb, paramRandom), 0);
/*     */   }
/*     */   
/*     */   private static int b(adb paramadb, Random paramRandom) {
/* 547 */     qu localqu = (qu)bB.get(paramadb);
/* 548 */     if (localqu == null) {
/* 549 */       return 1;
/*     */     }
/* 551 */     if (((Integer)localqu.a()).intValue() >= ((Integer)localqu.b()).intValue()) {
/* 552 */       return ((Integer)localqu.a()).intValue();
/*     */     }
/* 554 */     return ((Integer)localqu.a()).intValue() + paramRandom.nextInt(((Integer)localqu.b()).intValue() - ((Integer)localqu.a()).intValue());
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
/*     */   private static void b(ago paramago, adb paramadb, Random paramRandom, float paramFloat)
/*     */   {
/* 567 */     if (paramRandom.nextFloat() < paramFloat) {
/* 568 */       int i = c(paramadb, paramRandom);
/*     */       add localadd1;
/*     */       add localadd2;
/* 571 */       if (i < 0) {
/* 572 */         localadd1 = new add(ade.bC, 1, 0);
/* 573 */         localadd2 = new add(paramadb, -i, 0);
/*     */       } else {
/* 575 */         localadd1 = new add(ade.bC, i, 0);
/* 576 */         localadd2 = new add(paramadb, 1, 0);
/*     */       }
/* 578 */       paramago.add(new agn(localadd1, localadd2));
/*     */     }
/*     */   }
/*     */   
/*     */   private static int c(adb paramadb, Random paramRandom) {
/* 583 */     qu localqu = (qu)bC.get(paramadb);
/* 584 */     if (localqu == null) {
/* 585 */       return 1;
/*     */     }
/* 587 */     if (((Integer)localqu.a()).intValue() >= ((Integer)localqu.b()).intValue()) {
/* 588 */       return ((Integer)localqu.a()).intValue();
/*     */     }
/* 590 */     return ((Integer)localqu.a()).intValue() + paramRandom.nextInt(((Integer)localqu.b()).intValue() - ((Integer)localqu.a()).intValue());
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 595 */     if (paramByte == 12) {
/* 596 */       b("heart");
/* 597 */     } else if (paramByte == 13) {
/* 598 */       b("angryVillager");
/* 599 */     } else if (paramByte == 14) {
/* 600 */       b("happyVillager");
/*     */     } else {
/* 602 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(String paramString) {
/* 607 */     for (int i = 0; i < 5; i++) {
/* 608 */       double d1 = this.Z.nextGaussian() * 0.02D;
/* 609 */       double d2 = this.Z.nextGaussian() * 0.02D;
/* 610 */       double d3 = this.Z.nextGaussian() * 0.02D;
/* 611 */       this.o.a(paramString, this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 1.0D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*     */     }
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 617 */     paramsy = super.a(paramsy);
/*     */     
/* 619 */     s(this.o.s.nextInt(5));
/*     */     
/* 621 */     return paramsy;
/*     */   }
/*     */   
/*     */   public void cd() {
/* 625 */     this.bz = true;
/*     */   }
/*     */   
/*     */   public yv b(rx paramrx)
/*     */   {
/* 630 */     yv localyv = new yv(this.o);
/* 631 */     localyv.a(null);
/* 632 */     return localyv;
/*     */   }
/*     */   
/*     */   public boolean bM()
/*     */   {
/* 637 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ago paramago) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */