/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class sv
/*      */   extends sa
/*      */ {
/*   34 */   private static final UUID b = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
/*   35 */   private static final tj c = new tj(b, "Sprinting speed boost", 0.30000001192092896D, 2).a(false);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private tl d;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   54 */   private final rn e = new rn(this);
/*   55 */   private final HashMap f = new HashMap();
/*   56 */   private final add[] g = new add[5];
/*      */   public boolean at;
/*      */   public int au;
/*      */   public int av;
/*      */   public float aw;
/*      */   public int ax;
/*      */   public int ay;
/*      */   public float az;
/*      */   public int aA;
/*      */   public int aB;
/*      */   public float aC;
/*      */   public float aD;
/*      */   public float aE;
/*      */   public float aF;
/*   70 */   public float aG; public int aH = 20;
/*      */   public float aI;
/*      */   public float aJ;
/*      */   public float aK;
/*      */   public float aL;
/*      */   public float aM;
/*   76 */   public float aN; public float aO; public float aP; public float aQ = 0.02F;
/*      */   protected yz aR;
/*      */   protected int aS;
/*      */   protected boolean aT;
/*      */   protected int aU;
/*      */   protected float aV;
/*      */   protected float aW;
/*      */   protected float aX;
/*      */   protected float aY;
/*      */   protected float aZ;
/*      */   protected int ba;
/*      */   protected float bb;
/*      */   protected boolean bc;
/*      */   public float bd;
/*      */   public float be;
/*      */   protected float bf;
/*   92 */   protected int bg; protected double bh; protected double bi; protected double bj; protected double bk; protected double bl; private boolean h = true;
/*      */   private sv i;
/*      */   private int bm;
/*      */   private sv bn;
/*      */   private int bo;
/*      */   private float bp;
/*      */   private int bq;
/*      */   private float br;
/*      */   
/*      */   public sv(ahb paramahb) {
/*  102 */     super(paramahb);
/*      */     
/*  104 */     aD();
/*  105 */     g(aY());
/*      */     
/*  107 */     this.k = true;
/*  108 */     this.aL = ((float)(Math.random() + 1.0D) * 0.01F);
/*  109 */     b(this.s, this.t, this.u);
/*  110 */     this.aK = ((float)Math.random() * 12398.0F);
/*  111 */     this.y = ((float)(Math.random() * 3.1415927410125732D * 2.0D));
/*  112 */     this.aO = this.y;
/*  113 */     this.W = 0.5F;
/*      */   }
/*      */   
/*      */   protected void c()
/*      */   {
/*  118 */     this.af.a(7, Integer.valueOf(0));
/*  119 */     this.af.a(8, Byte.valueOf((byte)0));
/*  120 */     this.af.a(9, Byte.valueOf((byte)0));
/*  121 */     this.af.a(6, Float.valueOf(1.0F));
/*      */   }
/*      */   
/*      */   protected void aD() {
/*  125 */     bc().b(yj.a);
/*  126 */     bc().b(yj.c);
/*  127 */     bc().b(yj.d);
/*      */     
/*  129 */     if (!bk()) {
/*  130 */       a(yj.d).a(0.10000000149011612D);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(double paramDouble, boolean paramBoolean)
/*      */   {
/*  136 */     if (!M())
/*      */     {
/*  138 */       N();
/*      */     }
/*      */     
/*  141 */     if ((paramBoolean) && (this.R > 0.0F)) {
/*  142 */       int j = qh.c(this.s);
/*  143 */       int k = qh.c(this.t - 0.20000000298023224D - this.L);
/*  144 */       int m = qh.c(this.u);
/*  145 */       aji localaji = this.o.a(j, k, m);
/*  146 */       if (localaji.o() == awt.a) {
/*  147 */         int n = this.o.a(j, k - 1, m).b();
/*  148 */         if ((n == 11) || (n == 32) || (n == 21)) {
/*  149 */           localaji = this.o.a(j, k - 1, m);
/*      */         }
/*  151 */       } else if ((!this.o.E) && (this.R > 3.0F)) {
/*  152 */         this.o.c(2006, j, k, m, qh.f(this.R - 3.0F));
/*      */       }
/*      */       
/*  155 */       localaji.a(this.o, j, k, m, this, this.R);
/*      */     }
/*      */     
/*  158 */     super.a(paramDouble, paramBoolean);
/*      */   }
/*      */   
/*      */   public boolean aE() {
/*  162 */     return false;
/*      */   }
/*      */   
/*      */   public void C()
/*      */   {
/*  167 */     this.aC = this.aD;
/*  168 */     super.C();
/*      */     
/*  170 */     this.o.C.a("livingEntityBaseTick");
/*      */     
/*  172 */     if ((Z()) && (aa())) {
/*  173 */       a(ro.d, 1.0F);
/*      */     }
/*      */     
/*  176 */     if ((K()) || (this.o.E)) F();
/*  177 */     int j = ((this instanceof yz)) && (((yz)this).bE.a) ? 1 : 0;
/*      */     
/*  179 */     if ((Z()) && (a(awt.h))) {
/*  180 */       if ((!aE()) && (!k(rv.o.H)) && (j == 0)) {
/*  181 */         h(j(ar()));
/*  182 */         if (ar() == -20) {
/*  183 */           h(0);
/*  184 */           for (int k = 0; k < 8; k++) {
/*  185 */             float f1 = this.Z.nextFloat() - this.Z.nextFloat();
/*  186 */             float f2 = this.Z.nextFloat() - this.Z.nextFloat();
/*  187 */             float f3 = this.Z.nextFloat() - this.Z.nextFloat();
/*  188 */             this.o.a("bubble", this.s + f1, this.t + f2, this.u + f3, this.v, this.w, this.x);
/*      */           }
/*  190 */           a(ro.e, 2.0F);
/*      */         }
/*      */       }
/*      */       
/*  194 */       if ((!this.o.E) && (am()) && ((this.m instanceof sv))) {
/*  195 */         a(null);
/*      */       }
/*      */     } else {
/*  198 */       h(300);
/*      */     }
/*      */     
/*  201 */     if ((Z()) && (L())) { F();
/*      */     }
/*  203 */     this.aI = this.aJ;
/*      */     
/*  205 */     if (this.aB > 0) this.aB -= 1;
/*  206 */     if (this.ax > 0) this.ax -= 1;
/*  207 */     if ((this.ad > 0) && (!(this instanceof mw))) this.ad -= 1;
/*  208 */     if (aS() <= 0.0F) {
/*  209 */       aF();
/*      */     }
/*  211 */     if (this.aS > 0) this.aS -= 1; else
/*  212 */       this.aR = null;
/*  213 */     if ((this.bn != null) && (!this.bn.Z())) { this.bn = null;
/*      */     }
/*  215 */     if (this.i != null) {
/*  216 */       if (!this.i.Z()) {
/*  217 */         b(null);
/*  218 */       } else if (this.aa - this.bm > 100) {
/*  219 */         b(null);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  224 */     aO();
/*      */     
/*  226 */     this.aY = this.aX;
/*      */     
/*  228 */     this.aN = this.aM;
/*  229 */     this.aP = this.aO;
/*  230 */     this.A = this.y;
/*  231 */     this.B = this.z;
/*      */     
/*  233 */     this.o.C.b();
/*      */   }
/*      */   
/*      */   public boolean f() {
/*  237 */     return false;
/*      */   }
/*      */   
/*      */   protected void aF() {
/*  241 */     this.aA += 1;
/*  242 */     if (this.aA == 20) {
/*  243 */       if ((!this.o.E) && ((this.aS > 0) || (aH())) && 
/*  244 */         (aG()) && (this.o.O().b("doMobLoot"))) {
/*  245 */         j = e(this.aR);
/*  246 */         while (j > 0) {
/*  247 */           int k = sq.a(j);
/*  248 */           j -= k;
/*  249 */           this.o.d(new sq(this.o, this.s, this.t, this.u, k));
/*      */         }
/*      */       }
/*      */       
/*      */ 
/*  254 */       B();
/*  255 */       for (int j = 0; j < 20; j++) {
/*  256 */         double d1 = this.Z.nextGaussian() * 0.02D;
/*  257 */         double d2 = this.Z.nextGaussian() * 0.02D;
/*  258 */         double d3 = this.Z.nextGaussian() * 0.02D;
/*  259 */         this.o.a("explode", this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean aG() {
/*  265 */     return !f();
/*      */   }
/*      */   
/*      */   protected int j(int paramInt) {
/*  269 */     int j = afv.b(this);
/*  270 */     if ((j > 0) && 
/*  271 */       (this.Z.nextInt(j + 1) > 0))
/*      */     {
/*  273 */       return paramInt;
/*      */     }
/*      */     
/*  276 */     return paramInt - 1;
/*      */   }
/*      */   
/*      */   protected int e(yz paramyz) {
/*  280 */     return 0;
/*      */   }
/*      */   
/*      */   protected boolean aH() {
/*  284 */     return false;
/*      */   }
/*      */   
/*      */   public Random aI() {
/*  288 */     return this.Z;
/*      */   }
/*      */   
/*      */   public sv aJ() {
/*  292 */     return this.i;
/*      */   }
/*      */   
/*      */   public int aK() {
/*  296 */     return this.bm;
/*      */   }
/*      */   
/*      */   public void b(sv paramsv) {
/*  300 */     this.i = paramsv;
/*  301 */     this.bm = this.aa;
/*      */   }
/*      */   
/*      */   public sv aL() {
/*  305 */     return this.bn;
/*      */   }
/*      */   
/*      */   public int aM() {
/*  309 */     return this.bo;
/*      */   }
/*      */   
/*      */   public void l(sa paramsa) {
/*  313 */     if ((paramsa instanceof sv)) {
/*  314 */       this.bn = ((sv)paramsa);
/*      */     } else {
/*  316 */       this.bn = null;
/*      */     }
/*  318 */     this.bo = this.aa;
/*      */   }
/*      */   
/*      */   public int aN() {
/*  322 */     return this.aU;
/*      */   }
/*      */   
/*      */   public void b(dh paramdh)
/*      */   {
/*  327 */     paramdh.a("HealF", aS());
/*  328 */     paramdh.a("Health", (short)(int)Math.ceil(aS()));
/*  329 */     paramdh.a("HurtTime", (short)this.ax);
/*  330 */     paramdh.a("DeathTime", (short)this.aA);
/*  331 */     paramdh.a("AttackTime", (short)this.aB);
/*  332 */     paramdh.a("AbsorptionAmount", bs());
/*      */     Object localObject2;
/*  334 */     for (localObject2 : ak()) {
/*  335 */       if (localObject2 != null) { this.d.a(((add)localObject2).D());
/*      */       }
/*      */     }
/*  338 */     paramdh.a("Attributes", yj.a(bc()));
/*      */     
/*  340 */     for (localObject2 : ak()) {
/*  341 */       if (localObject2 != null) { this.d.b(((add)localObject2).D());
/*      */       }
/*      */     }
/*  344 */     if (!this.f.isEmpty()) {
/*  345 */       ??? = new dq();
/*      */       
/*  347 */       for (rw localrw : this.f.values()) {
/*  348 */         ((dq)???).a(localrw.a(new dh()));
/*      */       }
/*  350 */       paramdh.a("ActiveEffects", (dy)???);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(dh paramdh)
/*      */   {
/*  357 */     m(paramdh.h("AbsorptionAmount"));
/*      */     
/*  359 */     if ((paramdh.b("Attributes", 9)) && (this.o != null) && (!this.o.E)) {
/*  360 */       yj.a(bc(), paramdh.c("Attributes", 10));
/*      */     }
/*      */     Object localObject;
/*  363 */     if (paramdh.b("ActiveEffects", 9)) {
/*  364 */       localObject = paramdh.c("ActiveEffects", 10);
/*  365 */       for (int j = 0; j < ((dq)localObject).c(); j++) {
/*  366 */         dh localdh = ((dq)localObject).b(j);
/*  367 */         rw localrw = rw.b(localdh);
/*  368 */         if (localrw != null) {
/*  369 */           this.f.put(Integer.valueOf(localrw.a()), localrw);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  374 */     if (paramdh.b("HealF", 99)) {
/*  375 */       g(paramdh.h("HealF"));
/*      */     } else {
/*  377 */       localObject = paramdh.a("Health");
/*  378 */       if (localObject == null) {
/*  379 */         g(aY());
/*  380 */       } else if (((dy)localObject).a() == 5) {
/*  381 */         g(((dm)localObject).h());
/*  382 */       } else if (((dy)localObject).a() == 2)
/*      */       {
/*  384 */         g(((dw)localObject).e());
/*      */       }
/*      */     }
/*      */     
/*  388 */     this.ax = paramdh.e("HurtTime");
/*  389 */     this.aA = paramdh.e("DeathTime");
/*  390 */     this.aB = paramdh.e("AttackTime");
/*      */   }
/*      */   
/*      */   protected void aO() {
/*  394 */     Iterator localIterator = this.f.keySet().iterator();
/*  395 */     while (localIterator.hasNext()) {
/*  396 */       Integer localInteger = (Integer)localIterator.next();
/*  397 */       rw localrw = (rw)this.f.get(localInteger);
/*      */       
/*  399 */       if (!localrw.a(this)) {
/*  400 */         if (!this.o.E) {
/*  401 */           localIterator.remove();
/*  402 */           b(localrw);
/*      */         }
/*  404 */       } else if (localrw.b() % 600 == 0)
/*      */       {
/*      */ 
/*  407 */         a(localrw, false);
/*      */       }
/*      */     }
/*      */     
/*  411 */     if (this.h) {
/*  412 */       if (!this.o.E) {
/*  413 */         if (this.f.isEmpty()) {
/*  414 */           this.af.b(8, Byte.valueOf((byte)0));
/*  415 */           this.af.b(7, Integer.valueOf(0));
/*  416 */           d(false);
/*      */         } else {
/*  418 */           j = aen.a(this.f.values());
/*  419 */           this.af.b(8, Byte.valueOf((byte)(aen.b(this.f.values()) ? 1 : 0)));
/*  420 */           this.af.b(7, Integer.valueOf(j));
/*  421 */           d(k(rv.p.H));
/*      */         }
/*      */       }
/*  424 */       this.h = false;
/*      */     }
/*  426 */     int j = this.af.c(7);
/*  427 */     int k = this.af.a(8) > 0 ? 1 : 0;
/*      */     
/*  429 */     if (j > 0) {
/*  430 */       boolean bool = false;
/*      */       
/*  432 */       if (!ap()) {
/*  433 */         bool = this.Z.nextBoolean();
/*      */       }
/*      */       else {
/*  436 */         bool = this.Z.nextInt(15) == 0;
/*      */       }
/*      */       
/*  439 */       if (k != 0) { bool &= this.Z.nextInt(5) == 0;
/*      */       }
/*  441 */       if ((bool) && 
/*  442 */         (j > 0)) {
/*  443 */         double d1 = (j >> 16 & 0xFF) / 255.0D;
/*  444 */         double d2 = (j >> 8 & 0xFF) / 255.0D;
/*  445 */         double d3 = (j >> 0 & 0xFF) / 255.0D;
/*      */         
/*  447 */         this.o.a(k != 0 ? "mobSpellAmbient" : "mobSpell", this.s + (this.Z.nextDouble() - 0.5D) * this.M, this.t + this.Z.nextDouble() * this.N - this.L, this.u + (this.Z.nextDouble() - 0.5D) * this.M, d1, d2, d3);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void aP()
/*      */   {
/*  455 */     Iterator localIterator = this.f.keySet().iterator();
/*  456 */     while (localIterator.hasNext()) {
/*  457 */       Integer localInteger = (Integer)localIterator.next();
/*  458 */       rw localrw = (rw)this.f.get(localInteger);
/*      */       
/*  460 */       if (!this.o.E) {
/*  461 */         localIterator.remove();
/*  462 */         b(localrw);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public Collection aQ() {
/*  468 */     return this.f.values();
/*      */   }
/*      */   
/*      */   public boolean k(int paramInt) {
/*  472 */     return this.f.containsKey(Integer.valueOf(paramInt));
/*      */   }
/*      */   
/*      */   public boolean a(rv paramrv) {
/*  476 */     return this.f.containsKey(Integer.valueOf(paramrv.H));
/*      */   }
/*      */   
/*      */   public rw b(rv paramrv) {
/*  480 */     return (rw)this.f.get(Integer.valueOf(paramrv.H));
/*      */   }
/*      */   
/*      */   public void c(rw paramrw)
/*      */   {
/*  485 */     if (!d(paramrw)) {
/*  486 */       return;
/*      */     }
/*      */     
/*  489 */     if (this.f.containsKey(Integer.valueOf(paramrw.a())))
/*      */     {
/*  491 */       ((rw)this.f.get(Integer.valueOf(paramrw.a()))).a(paramrw);
/*  492 */       a((rw)this.f.get(Integer.valueOf(paramrw.a())), true);
/*      */     } else {
/*  494 */       this.f.put(Integer.valueOf(paramrw.a()), paramrw);
/*  495 */       a(paramrw);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean d(rw paramrw) {
/*  500 */     if (bd() == sz.b) {
/*  501 */       int j = paramrw.a();
/*  502 */       if ((j == rv.l.H) || (j == rv.u.H)) {
/*  503 */         return false;
/*      */       }
/*      */     }
/*      */     
/*  507 */     return true;
/*      */   }
/*      */   
/*      */   public boolean aR() {
/*  511 */     return bd() == sz.b;
/*      */   }
/*      */   
/*      */   public void l(int paramInt) {
/*  515 */     this.f.remove(Integer.valueOf(paramInt));
/*      */   }
/*      */   
/*      */   public void m(int paramInt) {
/*  519 */     rw localrw = (rw)this.f.remove(Integer.valueOf(paramInt));
/*  520 */     if (localrw != null) b(localrw);
/*      */   }
/*      */   
/*      */   protected void a(rw paramrw) {
/*  524 */     this.h = true;
/*  525 */     if (!this.o.E) rv.a[paramrw.a()].b(this, bc(), paramrw.c());
/*      */   }
/*      */   
/*      */   protected void a(rw paramrw, boolean paramBoolean) {
/*  529 */     this.h = true;
/*  530 */     if ((paramBoolean) && (!this.o.E)) {
/*  531 */       rv.a[paramrw.a()].a(this, bc(), paramrw.c());
/*  532 */       rv.a[paramrw.a()].b(this, bc(), paramrw.c());
/*      */     }
/*      */   }
/*      */   
/*      */   protected void b(rw paramrw) {
/*  537 */     this.h = true;
/*  538 */     if (!this.o.E) rv.a[paramrw.a()].a(this, bc(), paramrw.c());
/*      */   }
/*      */   
/*      */   public void f(float paramFloat) {
/*  542 */     float f1 = aS();
/*  543 */     if (f1 > 0.0F) {
/*  544 */       g(f1 + paramFloat);
/*      */     }
/*      */   }
/*      */   
/*      */   public final float aS() {
/*  549 */     return this.af.d(6);
/*      */   }
/*      */   
/*      */   public void g(float paramFloat) {
/*  553 */     this.af.b(6, Float.valueOf(qh.a(paramFloat, 0.0F, aY())));
/*      */   }
/*      */   
/*      */   public boolean a(ro paramro, float paramFloat)
/*      */   {
/*  558 */     if (aw()) return false;
/*  559 */     if (this.o.E) return false;
/*  560 */     this.aU = 0;
/*  561 */     if (aS() <= 0.0F) { return false;
/*      */     }
/*  563 */     if ((paramro.o()) && (a(rv.n))) {
/*  564 */       return false;
/*      */     }
/*      */     
/*  567 */     if (((paramro == ro.m) || (paramro == ro.n)) && (q(4) != null)) {
/*  568 */       q(4).a((int)(paramFloat * 4.0F + this.Z.nextFloat() * paramFloat * 2.0F), this);
/*  569 */       paramFloat *= 0.75F;
/*      */     }
/*      */     
/*  572 */     this.aF = 1.5F;
/*      */     
/*  574 */     int j = 1;
/*  575 */     if (this.ad > this.aH / 2.0F) {
/*  576 */       if (paramFloat <= this.bb) return false;
/*  577 */       d(paramro, paramFloat - this.bb);
/*  578 */       this.bb = paramFloat;
/*  579 */       j = 0;
/*      */     } else {
/*  581 */       this.bb = paramFloat;
/*  582 */       this.aw = aS();
/*  583 */       this.ad = this.aH;
/*  584 */       d(paramro, paramFloat);
/*  585 */       this.ax = (this.ay = 10);
/*      */     }
/*      */     
/*  588 */     this.az = 0.0F;
/*      */     
/*  590 */     sa localsa = paramro.j();
/*  591 */     if (localsa != null) {
/*  592 */       if ((localsa instanceof sv)) {
/*  593 */         b((sv)localsa);
/*      */       }
/*      */       
/*  596 */       if ((localsa instanceof yz)) {
/*  597 */         this.aS = 100;
/*  598 */         this.aR = ((yz)localsa);
/*  599 */       } else if ((localsa instanceof wv)) {
/*  600 */         wv localwv = (wv)localsa;
/*  601 */         if (localwv.bZ()) {
/*  602 */           this.aS = 100;
/*  603 */           this.aR = null;
/*      */         }
/*      */       }
/*      */     }
/*  607 */     if (j != 0) {
/*  608 */       this.o.a(this, (byte)2);
/*  609 */       if (paramro != ro.e) Q();
/*  610 */       if (localsa != null) {
/*  611 */         double d1 = localsa.s - this.s;
/*  612 */         double d2 = localsa.u - this.u;
/*  613 */         while (d1 * d1 + d2 * d2 < 1.0E-4D) {
/*  614 */           d1 = (Math.random() - Math.random()) * 0.01D;
/*  615 */           d2 = (Math.random() - Math.random()) * 0.01D;
/*      */         }
/*  617 */         this.az = ((float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - this.y);
/*  618 */         a(localsa, paramFloat, d1, d2);
/*      */       } else {
/*  620 */         this.az = ((int)(Math.random() * 2.0D) * 180);
/*      */       }
/*      */     }
/*      */     String str;
/*  624 */     if (aS() <= 0.0F) {
/*  625 */       str = aU();
/*  626 */       if ((j != 0) && (str != null)) {
/*  627 */         a(str, bf(), bg());
/*      */       }
/*  629 */       a(paramro);
/*      */     } else {
/*  631 */       str = aT();
/*  632 */       if ((j != 0) && (str != null)) {
/*  633 */         a(str, bf(), bg());
/*      */       }
/*      */     }
/*      */     
/*  637 */     return true;
/*      */   }
/*      */   
/*      */   public void a(add paramadd) {
/*  641 */     a("random.break", 0.8F, 0.8F + this.o.s.nextFloat() * 0.4F);
/*      */     
/*  643 */     for (int j = 0; j < 5; j++) {
/*  644 */       azw localazw1 = azw.a((this.Z.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/*  645 */       localazw1.a(-this.z * 3.1415927F / 180.0F);
/*  646 */       localazw1.b(-this.y * 3.1415927F / 180.0F);
/*      */       
/*  648 */       azw localazw2 = azw.a((this.Z.nextFloat() - 0.5D) * 0.3D, -this.Z.nextFloat() * 0.6D - 0.3D, 0.6D);
/*  649 */       localazw2.a(-this.z * 3.1415927F / 180.0F);
/*  650 */       localazw2.b(-this.y * 3.1415927F / 180.0F);
/*  651 */       localazw2 = localazw2.c(this.s, this.t + g(), this.u);
/*  652 */       this.o.a("iconcrack_" + adb.b(paramadd.b()), localazw2.a, localazw2.b, localazw2.c, localazw1.a, localazw1.b + 0.05D, localazw1.c);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ro paramro) {
/*  657 */     sa localsa = paramro.j();
/*  658 */     sv localsv = aX();
/*  659 */     if ((this.ba >= 0) && (localsv != null)) { localsv.b(this, this.ba);
/*      */     }
/*  661 */     if (localsa != null) { localsa.a(this);
/*      */     }
/*  663 */     this.aT = true;
/*  664 */     aW().g();
/*      */     
/*  666 */     if (!this.o.E) {
/*  667 */       int j = 0;
/*  668 */       if ((localsa instanceof yz)) {
/*  669 */         j = afv.i((sv)localsa);
/*      */       }
/*  671 */       if ((aG()) && (this.o.O().b("doMobLoot"))) {
/*  672 */         b(this.aS > 0, j);
/*  673 */         a(this.aS > 0, j);
/*  674 */         if (this.aS > 0) {
/*  675 */           int k = this.Z.nextInt(200) - j;
/*  676 */           if (k < 5) {
/*  677 */             n(k <= 0 ? 1 : 0);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  683 */     this.o.a(this, (byte)3);
/*      */   }
/*      */   
/*      */   protected void a(boolean paramBoolean, int paramInt) {}
/*      */   
/*      */   public void a(sa paramsa, float paramFloat, double paramDouble1, double paramDouble2)
/*      */   {
/*  690 */     if (this.Z.nextDouble() < a(yj.c).e()) {
/*  691 */       return;
/*      */     }
/*      */     
/*  694 */     this.al = true;
/*  695 */     float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2);
/*  696 */     float f2 = 0.4F;
/*      */     
/*  698 */     this.v /= 2.0D;
/*  699 */     this.w /= 2.0D;
/*  700 */     this.x /= 2.0D;
/*      */     
/*  702 */     this.v -= paramDouble1 / f1 * f2;
/*  703 */     this.w += f2;
/*  704 */     this.x -= paramDouble2 / f1 * f2;
/*      */     
/*  706 */     if (this.w > 0.4000000059604645D) this.w = 0.4000000059604645D;
/*      */   }
/*      */   
/*      */   protected String aT() {
/*  710 */     return "game.neutral.hurt";
/*      */   }
/*      */   
/*      */   protected String aU() {
/*  714 */     return "game.neutral.die";
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void n(int paramInt) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void b(boolean paramBoolean, int paramInt) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public boolean h_()
/*      */   {
/*  731 */     int j = qh.c(this.s);
/*  732 */     int k = qh.c(this.C.b);
/*  733 */     int m = qh.c(this.u);
/*  734 */     aji localaji = this.o.a(j, k, m);
/*  735 */     return (localaji == ajn.ap) || (localaji == ajn.bd);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean Z()
/*      */   {
/*  745 */     return (!this.K) && (aS() > 0.0F);
/*      */   }
/*      */   
/*      */   protected void b(float paramFloat)
/*      */   {
/*  750 */     super.b(paramFloat);
/*  751 */     rw localrw = b(rv.j);
/*  752 */     float f1 = localrw != null ? localrw.c() + 1 : 0.0F;
/*      */     
/*  754 */     int j = qh.f(paramFloat - 3.0F - f1);
/*      */     
/*  756 */     if (j > 0) {
/*  757 */       a(o(j), 1.0F, 1.0F);
/*  758 */       a(ro.h, j);
/*      */       
/*  760 */       int k = qh.c(this.s);
/*  761 */       int m = qh.c(this.t - 0.20000000298023224D - this.L);
/*  762 */       int n = qh.c(this.u);
/*      */       
/*  764 */       aji localaji = this.o.a(k, m, n);
/*  765 */       if (localaji.o() != awt.a) {
/*  766 */         ajm localajm = localaji.H;
/*  767 */         a(localajm.e(), localajm.c() * 0.5F, localajm.d() * 0.75F);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected String o(int paramInt) {
/*  773 */     if (paramInt > 4) {
/*  774 */       return "game.neutral.hurt.fall.big";
/*      */     }
/*  776 */     return "game.neutral.hurt.fall.small";
/*      */   }
/*      */   
/*      */ 
/*      */   public void aj()
/*      */   {
/*  782 */     this.ax = (this.ay = 10);
/*  783 */     this.az = 0.0F;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int aV()
/*      */   {
/*  792 */     int j = 0;
/*  793 */     for (add localadd : ak()) {
/*  794 */       if ((localadd != null) && ((localadd.b() instanceof abb))) {
/*  795 */         int n = ((abb)localadd.b()).c;
/*  796 */         j += n;
/*      */       }
/*      */     }
/*  799 */     return j;
/*      */   }
/*      */   
/*      */   protected void h(float paramFloat) {}
/*      */   
/*      */   protected float b(ro paramro, float paramFloat)
/*      */   {
/*  806 */     if (!paramro.e()) {
/*  807 */       int j = 25 - aV();
/*  808 */       float f1 = paramFloat * j;
/*  809 */       h(paramFloat);
/*  810 */       paramFloat = f1 / 25.0F;
/*      */     }
/*  812 */     return paramFloat;
/*      */   }
/*      */   
/*      */   protected float c(ro paramro, float paramFloat) {
/*  816 */     if (paramro.h()) { return paramFloat;
/*      */     }
/*      */     
/*  819 */     if ((this instanceof yq))
/*  820 */       paramFloat = paramFloat;
/*      */     int k;
/*  822 */     float f1; if ((a(rv.m)) && (paramro != ro.i)) {
/*  823 */       j = (b(rv.m).c() + 1) * 5;
/*  824 */       k = 25 - j;
/*  825 */       f1 = paramFloat * k;
/*  826 */       paramFloat = f1 / 25.0F;
/*      */     }
/*      */     
/*  829 */     if (paramFloat <= 0.0F) { return 0.0F;
/*      */     }
/*  831 */     int j = afv.a(ak(), paramro);
/*  832 */     if (j > 20) {
/*  833 */       j = 20;
/*      */     }
/*  835 */     if ((j > 0) && (j <= 20)) {
/*  836 */       k = 25 - j;
/*  837 */       f1 = paramFloat * k;
/*  838 */       paramFloat = f1 / 25.0F;
/*      */     }
/*      */     
/*  841 */     return paramFloat;
/*      */   }
/*      */   
/*      */   protected void d(ro paramro, float paramFloat) {
/*  845 */     if (aw()) return;
/*  846 */     paramFloat = b(paramro, paramFloat);
/*  847 */     paramFloat = c(paramro, paramFloat);
/*      */     
/*  849 */     float f1 = paramFloat;
/*  850 */     paramFloat = Math.max(paramFloat - bs(), 0.0F);
/*  851 */     m(bs() - (f1 - paramFloat));
/*  852 */     if (paramFloat == 0.0F) { return;
/*      */     }
/*  854 */     float f2 = aS();
/*  855 */     g(f2 - paramFloat);
/*  856 */     aW().a(paramro, f2, paramFloat);
/*  857 */     m(bs() - paramFloat);
/*      */   }
/*      */   
/*      */   public rn aW() {
/*  861 */     return this.e;
/*      */   }
/*      */   
/*      */   public sv aX() {
/*  865 */     if (this.e.c() != null) return this.e.c();
/*  866 */     if (this.aR != null) return this.aR;
/*  867 */     if (this.i != null) return this.i;
/*  868 */     return null;
/*      */   }
/*      */   
/*      */   public final float aY() {
/*  872 */     return (float)a(yj.a).e();
/*      */   }
/*      */   
/*      */   public final int aZ() {
/*  876 */     return this.af.a(9);
/*      */   }
/*      */   
/*      */   public final void p(int paramInt) {
/*  880 */     this.af.b(9, Byte.valueOf((byte)paramInt));
/*      */   }
/*      */   
/*      */   private int j() {
/*  884 */     if (a(rv.e)) {
/*  885 */       return 6 - (1 + b(rv.e).c()) * 1;
/*      */     }
/*  887 */     if (a(rv.f)) {
/*  888 */       return 6 + (1 + b(rv.f).c()) * 2;
/*      */     }
/*  890 */     return 6;
/*      */   }
/*      */   
/*      */   public void ba() {
/*  894 */     if ((!this.at) || (this.au >= j() / 2) || (this.au < 0)) {
/*  895 */       this.au = -1;
/*  896 */       this.at = true;
/*      */       
/*  898 */       if ((this.o instanceof mt)) {
/*  899 */         ((mt)this.o).r().a(this, new gc(this, 0));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(byte paramByte)
/*      */   {
/*  906 */     if (paramByte == 2) {
/*  907 */       this.aF = 1.5F;
/*      */       
/*  909 */       this.ad = this.aH;
/*  910 */       this.ax = (this.ay = 10);
/*  911 */       this.az = 0.0F;
/*      */       
/*  913 */       a(aT(), bf(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*  914 */       a(ro.j, 0.0F);
/*      */     }
/*  916 */     else if (paramByte == 3) {
/*  917 */       a(aU(), bf(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*  918 */       g(0.0F);
/*  919 */       a(ro.j);
/*      */     } else {
/*  921 */       super.a(paramByte);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void G()
/*      */   {
/*  927 */     a(ro.i, 4.0F);
/*      */   }
/*      */   
/*      */   protected void bb() {
/*  931 */     int j = j();
/*  932 */     if (this.at) {
/*  933 */       this.au += 1;
/*  934 */       if (this.au >= j) {
/*  935 */         this.au = 0;
/*  936 */         this.at = false;
/*      */       }
/*      */     } else {
/*  939 */       this.au = 0;
/*      */     }
/*      */     
/*  942 */     this.aD = (this.au / j);
/*      */   }
/*      */   
/*      */   public ti a(th paramth) {
/*  946 */     return bc().a(paramth);
/*      */   }
/*      */   
/*      */   public tl bc() {
/*  950 */     if (this.d == null) {
/*  951 */       this.d = new tq();
/*      */     }
/*      */     
/*  954 */     return this.d;
/*      */   }
/*      */   
/*      */   public sz bd() {
/*  958 */     return sz.a;
/*      */   }
/*      */   
/*      */ 
/*      */   public abstract add be();
/*      */   
/*      */ 
/*      */   public abstract add q(int paramInt);
/*      */   
/*      */ 
/*      */   public abstract void c(int paramInt, add paramadd);
/*      */   
/*      */   public void c(boolean paramBoolean)
/*      */   {
/*  972 */     super.c(paramBoolean);
/*      */     
/*  974 */     ti localti = a(yj.d);
/*  975 */     if (localti.a(b) != null) {
/*  976 */       localti.b(c);
/*      */     }
/*  978 */     if (paramBoolean) {
/*  979 */       localti.a(c);
/*      */     }
/*      */   }
/*      */   
/*      */   public abstract add[] ak();
/*      */   
/*      */   protected float bf()
/*      */   {
/*  987 */     return 1.0F;
/*      */   }
/*      */   
/*      */   protected float bg() {
/*  991 */     if (f()) {
/*  992 */       return (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.5F;
/*      */     }
/*      */     
/*  995 */     return (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F;
/*      */   }
/*      */   
/*      */   protected boolean bh() {
/*  999 */     return aS() <= 0.0F;
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 1003 */     b(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
/*      */   }
/*      */   
/*      */   public void m(sa paramsa)
/*      */   {
/* 1008 */     double d1 = paramsa.s;
/* 1009 */     double d2 = paramsa.C.b + paramsa.N;
/* 1010 */     double d3 = paramsa.u;
/* 1011 */     int j = 1;
/*      */     
/* 1013 */     for (int k = -j; k <= j; k++) {
/* 1014 */       for (int m = -j; m < j; m++) {
/* 1015 */         if ((k != 0) || (m != 0))
/*      */         {
/*      */ 
/*      */ 
/* 1019 */           int n = (int)(this.s + k);
/* 1020 */           int i1 = (int)(this.u + m);
/* 1021 */           azt localazt = this.C.c(k, 1.0D, m);
/*      */           
/* 1023 */           if (this.o.a(localazt).isEmpty()) {
/* 1024 */             if (ahb.a(this.o, n, (int)this.t, i1)) {
/* 1025 */               a(this.s + k, this.t + 1.0D, this.u + m);
/* 1026 */               return; }
/* 1027 */             if ((ahb.a(this.o, n, (int)this.t - 1, i1)) || (this.o.a(n, (int)this.t - 1, i1).o() == awt.h)) {
/* 1028 */               d1 = this.s + k;
/* 1029 */               d2 = this.t + 1.0D;
/* 1030 */               d3 = this.u + m;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1036 */     a(d1, d2, d3);
/*      */   }
/*      */   
/*      */   public boolean bi() {
/* 1040 */     return false;
/*      */   }
/*      */   
/*      */   public rf b(add paramadd, int paramInt) {
/* 1044 */     if (paramadd.b().b()) {
/* 1045 */       return paramadd.b().a(paramadd.k(), paramInt);
/*      */     }
/* 1047 */     return paramadd.c();
/*      */   }
/*      */   
/*      */   protected void bj()
/*      */   {
/* 1052 */     this.w = 0.41999998688697815D;
/* 1053 */     if (a(rv.j)) {
/* 1054 */       this.w += (b(rv.j).c() + 1) * 0.1F;
/*      */     }
/* 1056 */     if (ao()) {
/* 1057 */       float f1 = this.y * 0.017453292F;
/*      */       
/* 1059 */       this.v -= qh.a(f1) * 0.2F;
/* 1060 */       this.x += qh.b(f1) * 0.2F;
/*      */     }
/* 1062 */     this.al = true;
/*      */   }
/*      */   
/*      */   public void e(float paramFloat1, float paramFloat2) { double d1;
/* 1066 */     if ((M()) && ((!(this instanceof yz)) || (!((yz)this).bE.b))) {
/* 1067 */       d1 = this.t;
/*      */       
/* 1069 */       a(paramFloat1, paramFloat2, bk() ? 0.04F : 0.02F);
/* 1070 */       d(this.v, this.w, this.x);
/*      */       
/* 1072 */       this.v *= 0.800000011920929D;
/* 1073 */       this.w *= 0.800000011920929D;
/* 1074 */       this.x *= 0.800000011920929D;
/* 1075 */       this.w -= 0.02D;
/*      */       
/* 1077 */       if ((this.E) && (c(this.v, this.w + 0.6000000238418579D - this.t + d1, this.x))) {
/* 1078 */         this.w = 0.30000001192092896D;
/*      */       }
/* 1080 */     } else if ((P()) && ((!(this instanceof yz)) || (!((yz)this).bE.b))) {
/* 1081 */       d1 = this.t;
/* 1082 */       a(paramFloat1, paramFloat2, 0.02F);
/* 1083 */       d(this.v, this.w, this.x);
/* 1084 */       this.v *= 0.5D;
/* 1085 */       this.w *= 0.5D;
/* 1086 */       this.x *= 0.5D;
/* 1087 */       this.w -= 0.02D;
/*      */       
/* 1089 */       if ((this.E) && (c(this.v, this.w + 0.6000000238418579D - this.t + d1, this.x))) {
/* 1090 */         this.w = 0.30000001192092896D;
/*      */       }
/*      */     } else {
/* 1093 */       float f1 = 0.91F;
/* 1094 */       if (this.D) {
/* 1095 */         f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
/*      */       }
/*      */       
/* 1098 */       float f2 = 0.16277136F / (f1 * f1 * f1);
/*      */       
/*      */       float f3;
/* 1101 */       if (this.D) {
/* 1102 */         f3 = bl() * f2;
/*      */       } else {
/* 1104 */         f3 = this.aQ;
/*      */       }
/*      */       
/*      */ 
/* 1108 */       a(paramFloat1, paramFloat2, f3);
/*      */       
/* 1110 */       f1 = 0.91F;
/* 1111 */       if (this.D) {
/* 1112 */         f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
/*      */       }
/* 1114 */       if (h_()) {
/* 1115 */         float f4 = 0.15F;
/* 1116 */         if (this.v < -f4) this.v = (-f4);
/* 1117 */         if (this.v > f4) this.v = f4;
/* 1118 */         if (this.x < -f4) this.x = (-f4);
/* 1119 */         if (this.x > f4) this.x = f4;
/* 1120 */         this.R = 0.0F;
/* 1121 */         if (this.w < -0.15D) this.w = -0.15D;
/* 1122 */         int j = (an()) && ((this instanceof yz)) ? 1 : 0;
/* 1123 */         if ((j != 0) && (this.w < 0.0D)) { this.w = 0.0D;
/*      */         }
/*      */       }
/* 1126 */       d(this.v, this.w, this.x);
/*      */       
/* 1128 */       if ((this.E) && (h_())) {
/* 1129 */         this.w = 0.2D;
/*      */       }
/*      */       
/* 1132 */       if ((!this.o.E) || ((this.o.d((int)this.s, 0, (int)this.u)) && (this.o.d((int)this.s, (int)this.u).d))) {
/* 1133 */         this.w -= 0.08D;
/* 1134 */       } else if (this.t > 0.0D) {
/* 1135 */         this.w = -0.1D;
/*      */       } else {
/* 1137 */         this.w = 0.0D;
/*      */       }
/* 1139 */       this.w *= 0.9800000190734863D;
/* 1140 */       this.v *= f1;
/* 1141 */       this.x *= f1;
/*      */     }
/* 1143 */     this.aE = this.aF;
/* 1144 */     double d2 = this.s - this.p;
/* 1145 */     double d3 = this.u - this.r;
/* 1146 */     float f5 = qh.a(d2 * d2 + d3 * d3) * 4.0F;
/* 1147 */     if (f5 > 1.0F) f5 = 1.0F;
/* 1148 */     this.aF += (f5 - this.aF) * 0.4F;
/* 1149 */     this.aG += this.aF;
/*      */   }
/*      */   
/*      */   protected boolean bk() {
/* 1153 */     return false;
/*      */   }
/*      */   
/*      */   public float bl() {
/* 1157 */     if (bk()) {
/* 1158 */       return this.bp;
/*      */     }
/* 1160 */     return 0.1F;
/*      */   }
/*      */   
/*      */   public void i(float paramFloat)
/*      */   {
/* 1165 */     this.bp = paramFloat;
/*      */   }
/*      */   
/*      */   public boolean n(sa paramsa) {
/* 1169 */     l(paramsa);
/* 1170 */     return false;
/*      */   }
/*      */   
/*      */   public boolean bm() {
/* 1174 */     return false;
/*      */   }
/*      */   
/*      */   public void h()
/*      */   {
/* 1179 */     super.h();
/*      */     
/* 1181 */     if (!this.o.E) {
/* 1182 */       int j = aZ();
/* 1183 */       if (j > 0) {
/* 1184 */         if (this.av <= 0) {
/* 1185 */           this.av = (20 * (30 - j));
/*      */         }
/* 1187 */         this.av -= 1;
/* 1188 */         if (this.av <= 0) {
/* 1189 */           p(j - 1);
/*      */         }
/*      */       }
/*      */       
/* 1193 */       for (int k = 0; k < 5; k++) {
/* 1194 */         add localadd1 = this.g[k];
/* 1195 */         add localadd2 = q(k);
/*      */         
/* 1197 */         if (!add.b(localadd2, localadd1)) {
/* 1198 */           ((mt)this.o).r().a(this, new hz(y(), k, localadd2));
/* 1199 */           if (localadd1 != null) this.d.a(localadd1.D());
/* 1200 */           if (localadd2 != null) this.d.b(localadd2.D());
/* 1201 */           this.g[k] = (localadd2 == null ? null : localadd2.m());
/*      */         }
/*      */       }
/*      */       
/* 1205 */       if (this.aa % 20 == 0) { aW().g();
/*      */       }
/*      */     }
/* 1208 */     e();
/*      */     
/* 1210 */     double d1 = this.s - this.p;
/* 1211 */     double d2 = this.u - this.r;
/*      */     
/* 1213 */     float f1 = (float)(d1 * d1 + d2 * d2);
/*      */     
/* 1215 */     float f2 = this.aM;
/*      */     
/* 1217 */     float f3 = 0.0F;
/* 1218 */     this.aV = this.aW;
/* 1219 */     float f4 = 0.0F;
/* 1220 */     if (f1 > 0.0025000002F) {
/* 1221 */       f4 = 1.0F;
/* 1222 */       f3 = (float)Math.sqrt(f1) * 3.0F;
/* 1223 */       f2 = (float)Math.atan2(d2, d1) * 180.0F / 3.1415927F - 90.0F;
/*      */     }
/* 1225 */     if (this.aD > 0.0F) {
/* 1226 */       f2 = this.y;
/*      */     }
/* 1228 */     if (!this.D) {
/* 1229 */       f4 = 0.0F;
/*      */     }
/* 1231 */     this.aW += (f4 - this.aW) * 0.3F;
/*      */     
/* 1233 */     this.o.C.a("headTurn");
/*      */     
/* 1235 */     f3 = f(f2, f3);
/*      */     
/* 1237 */     this.o.C.b();
/*      */     
/* 1239 */     this.o.C.a("rangeChecks");
/* 1240 */     while (this.y - this.A < -180.0F)
/* 1241 */       this.A -= 360.0F;
/* 1242 */     while (this.y - this.A >= 180.0F) {
/* 1243 */       this.A += 360.0F;
/*      */     }
/* 1245 */     while (this.aM - this.aN < -180.0F)
/* 1246 */       this.aN -= 360.0F;
/* 1247 */     while (this.aM - this.aN >= 180.0F) {
/* 1248 */       this.aN += 360.0F;
/*      */     }
/* 1250 */     while (this.z - this.B < -180.0F)
/* 1251 */       this.B -= 360.0F;
/* 1252 */     while (this.z - this.B >= 180.0F) {
/* 1253 */       this.B += 360.0F;
/*      */     }
/* 1255 */     while (this.aO - this.aP < -180.0F)
/* 1256 */       this.aP -= 360.0F;
/* 1257 */     while (this.aO - this.aP >= 180.0F)
/* 1258 */       this.aP += 360.0F;
/* 1259 */     this.o.C.b();
/*      */     
/* 1261 */     this.aX += f3;
/*      */   }
/*      */   
/*      */   protected float f(float paramFloat1, float paramFloat2) {
/* 1265 */     float f1 = qh.g(paramFloat1 - this.aM);
/* 1266 */     this.aM += f1 * 0.3F;
/*      */     
/* 1268 */     float f2 = qh.g(this.y - this.aM);
/* 1269 */     int j = (f2 < -90.0F) || (f2 >= 90.0F) ? 1 : 0;
/* 1270 */     if (f2 < -75.0F) f2 = -75.0F;
/* 1271 */     if (f2 >= 75.0F) f2 = 75.0F;
/* 1272 */     this.aM = (this.y - f2);
/* 1273 */     if (f2 * f2 > 2500.0F) {
/* 1274 */       this.aM += f2 * 0.2F;
/*      */     }
/*      */     
/* 1277 */     if (j != 0) {
/* 1278 */       paramFloat2 *= -1.0F;
/*      */     }
/*      */     
/* 1281 */     return paramFloat2;
/*      */   }
/*      */   
/*      */   public void e() {
/* 1285 */     if (this.bq > 0) this.bq -= 1;
/* 1286 */     if (this.bg > 0) {
/* 1287 */       double d1 = this.s + (this.bh - this.s) / this.bg;
/* 1288 */       double d2 = this.t + (this.bi - this.t) / this.bg;
/* 1289 */       double d3 = this.u + (this.bj - this.u) / this.bg;
/*      */       
/* 1291 */       double d4 = qh.g(this.bk - this.y);
/*      */       
/* 1293 */       this.y = ((float)(this.y + d4 / this.bg));
/* 1294 */       this.z = ((float)(this.z + (this.bl - this.z) / this.bg));
/*      */       
/* 1296 */       this.bg -= 1;
/* 1297 */       b(d1, d2, d3);
/* 1298 */       b(this.y, this.z);
/* 1299 */     } else if (!br())
/*      */     {
/*      */ 
/* 1302 */       this.v *= 0.98D;
/* 1303 */       this.w *= 0.98D;
/* 1304 */       this.x *= 0.98D;
/*      */     }
/*      */     
/* 1307 */     if (Math.abs(this.v) < 0.005D) this.v = 0.0D;
/* 1308 */     if (Math.abs(this.w) < 0.005D) this.w = 0.0D;
/* 1309 */     if (Math.abs(this.x) < 0.005D) { this.x = 0.0D;
/*      */     }
/* 1311 */     this.o.C.a("ai");
/* 1312 */     if (bh()) {
/* 1313 */       this.bc = false;
/* 1314 */       this.bd = 0.0F;
/* 1315 */       this.be = 0.0F;
/* 1316 */       this.bf = 0.0F;
/*      */     }
/* 1318 */     else if (br()) {
/* 1319 */       if (bk()) {
/* 1320 */         this.o.C.a("newAi");
/* 1321 */         bn();
/* 1322 */         this.o.C.b();
/*      */       } else {
/* 1324 */         this.o.C.a("oldAi");
/* 1325 */         bq();
/* 1326 */         this.o.C.b();
/* 1327 */         this.aO = this.y;
/*      */       }
/*      */     }
/*      */     
/* 1331 */     this.o.C.b();
/*      */     
/* 1333 */     this.o.C.a("jump");
/* 1334 */     if (this.bc) {
/* 1335 */       if ((M()) || (P())) {
/* 1336 */         this.w += 0.03999999910593033D;
/* 1337 */       } else if ((this.D) && 
/* 1338 */         (this.bq == 0)) {
/* 1339 */         bj();
/* 1340 */         this.bq = 10;
/*      */       }
/*      */     }
/*      */     else {
/* 1344 */       this.bq = 0;
/*      */     }
/* 1346 */     this.o.C.b();
/*      */     
/* 1348 */     this.o.C.a("travel");
/* 1349 */     this.bd *= 0.98F;
/* 1350 */     this.be *= 0.98F;
/* 1351 */     this.bf *= 0.9F;
/*      */     
/* 1353 */     e(this.bd, this.be);
/* 1354 */     this.o.C.b();
/*      */     
/* 1356 */     this.o.C.a("push");
/* 1357 */     if (!this.o.E) {
/* 1358 */       bo();
/*      */     }
/* 1360 */     this.o.C.b();
/*      */   }
/*      */   
/*      */   protected void bn() {}
/*      */   
/*      */   protected void bo()
/*      */   {
/* 1367 */     List localList = this.o.b(this, this.C.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
/* 1368 */     if ((localList != null) && (!localList.isEmpty())) {
/* 1369 */       for (int j = 0; j < localList.size(); j++) {
/* 1370 */         sa localsa = (sa)localList.get(j);
/* 1371 */         if (localsa.S()) o(localsa);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void o(sa paramsa) {
/* 1377 */     paramsa.g(this);
/*      */   }
/*      */   
/*      */   public void ab()
/*      */   {
/* 1382 */     super.ab();
/* 1383 */     this.aV = this.aW;
/* 1384 */     this.aW = 0.0F;
/* 1385 */     this.R = 0.0F;
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt)
/*      */   {
/* 1390 */     this.L = 0.0F;
/* 1391 */     this.bh = paramDouble1;
/* 1392 */     this.bi = paramDouble2;
/* 1393 */     this.bj = paramDouble3;
/* 1394 */     this.bk = paramFloat1;
/* 1395 */     this.bl = paramFloat2;
/*      */     
/* 1397 */     this.bg = paramInt;
/*      */   }
/*      */   
/*      */   protected void bp() {}
/*      */   
/*      */   protected void bq()
/*      */   {
/* 1404 */     this.aU += 1;
/*      */   }
/*      */   
/*      */   public void f(boolean paramBoolean) {
/* 1408 */     this.bc = paramBoolean;
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, int paramInt) {
/* 1412 */     if ((!paramsa.K) && (!this.o.E)) {
/* 1413 */       mn localmn = ((mt)this.o).r();
/* 1414 */       if ((paramsa instanceof xk)) {
/* 1415 */         localmn.a(paramsa, new ij(paramsa.y(), y()));
/*      */       }
/* 1417 */       if ((paramsa instanceof zc)) {
/* 1418 */         localmn.a(paramsa, new ij(paramsa.y(), y()));
/*      */       }
/* 1420 */       if ((paramsa instanceof sq)) {
/* 1421 */         localmn.a(paramsa, new ij(paramsa.y(), y()));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean p(sa paramsa) {
/* 1427 */     return this.o.a(azw.a(this.s, this.t + g(), this.u), azw.a(paramsa.s, paramsa.t + paramsa.g(), paramsa.u)) == null;
/*      */   }
/*      */   
/*      */   public azw ag()
/*      */   {
/* 1432 */     return j(1.0F);
/*      */   }
/*      */   
/*      */   public azw j(float paramFloat) {
/* 1436 */     if (paramFloat == 1.0F) {
/* 1437 */       f1 = qh.b(-this.y * 0.017453292F - 3.1415927F);
/* 1438 */       f2 = qh.a(-this.y * 0.017453292F - 3.1415927F);
/* 1439 */       f3 = -qh.b(-this.z * 0.017453292F);
/* 1440 */       f4 = qh.a(-this.z * 0.017453292F);
/*      */       
/* 1442 */       return azw.a(f2 * f3, f4, f1 * f3);
/*      */     }
/* 1444 */     float f1 = this.B + (this.z - this.B) * paramFloat;
/* 1445 */     float f2 = this.A + (this.y - this.A) * paramFloat;
/*      */     
/* 1447 */     float f3 = qh.b(-f2 * 0.017453292F - 3.1415927F);
/* 1448 */     float f4 = qh.a(-f2 * 0.017453292F - 3.1415927F);
/* 1449 */     float f5 = -qh.b(-f1 * 0.017453292F);
/* 1450 */     float f6 = qh.a(-f1 * 0.017453292F);
/*      */     
/* 1452 */     return azw.a(f4 * f5, f6, f3 * f5);
/*      */   }
/*      */   
/*      */   public float k(float paramFloat) {
/* 1456 */     float f1 = this.aD - this.aC;
/* 1457 */     if (f1 < 0.0F) f1 += 1.0F;
/* 1458 */     return this.aC + f1 * paramFloat;
/*      */   }
/*      */   
/*      */   public azw l(float paramFloat) {
/* 1462 */     if (paramFloat == 1.0F) {
/* 1463 */       return azw.a(this.s, this.t, this.u);
/*      */     }
/* 1465 */     double d1 = this.p + (this.s - this.p) * paramFloat;
/* 1466 */     double d2 = this.q + (this.t - this.q) * paramFloat;
/* 1467 */     double d3 = this.r + (this.u - this.r) * paramFloat;
/*      */     
/* 1469 */     return azw.a(d1, d2, d3);
/*      */   }
/*      */   
/*      */   public azu a(double paramDouble, float paramFloat) {
/* 1473 */     azw localazw1 = l(paramFloat);
/* 1474 */     azw localazw2 = j(paramFloat);
/* 1475 */     azw localazw3 = localazw1.c(localazw2.a * paramDouble, localazw2.b * paramDouble, localazw2.c * paramDouble);
/* 1476 */     return this.o.a(localazw1, localazw3, false, false, true);
/*      */   }
/*      */   
/*      */   public boolean br() {
/* 1480 */     return !this.o.E;
/*      */   }
/*      */   
/*      */   public boolean R()
/*      */   {
/* 1485 */     return !this.K;
/*      */   }
/*      */   
/*      */   public boolean S()
/*      */   {
/* 1490 */     return !this.K;
/*      */   }
/*      */   
/*      */   public float g()
/*      */   {
/* 1495 */     return this.N * 0.85F;
/*      */   }
/*      */   
/*      */   protected void Q()
/*      */   {
/* 1500 */     this.H = (this.Z.nextDouble() >= a(yj.c).e());
/*      */   }
/*      */   
/*      */   public float au()
/*      */   {
/* 1505 */     return this.aO;
/*      */   }
/*      */   
/*      */   public void e(float paramFloat)
/*      */   {
/* 1510 */     this.aO = paramFloat;
/*      */   }
/*      */   
/*      */   public float bs() {
/* 1514 */     return this.br;
/*      */   }
/*      */   
/*      */   public void m(float paramFloat) {
/* 1518 */     if (paramFloat < 0.0F) paramFloat = 0.0F;
/* 1519 */     this.br = paramFloat;
/*      */   }
/*      */   
/*      */   public bae bt() {
/* 1523 */     return null;
/*      */   }
/*      */   
/*      */   public boolean c(sv paramsv) {
/* 1527 */     return a(paramsv.bt());
/*      */   }
/*      */   
/*      */   public boolean a(bae parambae) {
/* 1531 */     if (bt() != null) {
/* 1532 */       return bt().a(parambae);
/*      */     }
/* 1534 */     return false;
/*      */   }
/*      */   
/*      */   public void bu() {}
/*      */   
/*      */   public void bv() {}
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */