/*      */ import java.util.List;
/*      */ import java.util.Random;
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
/*      */ 
/*      */ 
/*      */ public class wi
/*      */   extends wf
/*      */   implements rc
/*      */ {
/*   33 */   private static final sj bu = new wj();
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   40 */   private static final th bv = new to("horse.jumpStrength", 0.7D, 0.0D, 2.0D).a("Jump Strength").a(true);
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
/*      */ 
/*      */ 
/*   66 */   private static final String[] bw = { null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png" };
/*      */   
/*      */ 
/*   69 */   private static final String[] bx = { "", "meo", "goo", "dio" };
/*      */   
/*      */ 
/*   72 */   private static final int[] by = { 0, 5, 7, 11 };
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
/*   90 */   private static final String[] bz = { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
/*      */   
/*      */ 
/*      */ 
/*   94 */   private static final String[] bA = { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  104 */   private static final String[] bB = { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
/*      */   
/*      */ 
/*  107 */   private static final String[] bC = { "", "wo_", "wmo", "wdo", "bdo" };
/*      */   private int bD;
/*      */   private int bE;
/*      */   private int bF;
/*      */   public int bp;
/*      */   public int bq;
/*      */   protected boolean br;
/*      */   private zt bG;
/*      */   private boolean bH;
/*      */   protected int bs;
/*      */   protected float bt;
/*      */   private boolean bI;
/*      */   private float bJ;
/*      */   private float bK;
/*      */   private float bL;
/*      */   private float bM;
/*      */   private float bN;
/*      */   private float bO;
/*      */   private int bP;
/*      */   private String bQ;
/*      */   
/*      */   public wi(ahb paramahb) {
/*  129 */     super(paramahb);
/*  130 */     a(1.4F, 1.6F);
/*  131 */     this.ae = false;
/*  132 */     l(false);
/*      */     
/*  134 */     m().a(true);
/*  135 */     this.c.a(0, new uf(this));
/*  136 */     this.c.a(1, new uz(this, 1.2D));
/*  137 */     this.c.a(1, new vg(this, 1.2D));
/*  138 */     this.c.a(2, new ua(this, 1.0D));
/*  139 */     this.c.a(4, new uh(this, 1.0D));
/*  140 */     this.c.a(6, new vc(this, 0.7D));
/*  141 */     this.c.a(7, new un(this, yz.class, 6.0F));
/*  142 */     this.c.a(8, new vb(this));
/*      */     
/*  144 */     cN();
/*      */   }
/*      */   
/*      */   protected void c()
/*      */   {
/*  149 */     super.c();
/*  150 */     this.af.a(16, Integer.valueOf(0));
/*  151 */     this.af.a(19, Byte.valueOf((byte)0));
/*  152 */     this.af.a(20, Integer.valueOf(0));
/*  153 */     this.af.a(21, String.valueOf(""));
/*  154 */     this.af.a(22, Integer.valueOf(0));
/*      */   }
/*      */   
/*      */   public void s(int paramInt) {
/*  158 */     this.af.b(19, Byte.valueOf((byte)paramInt));
/*  159 */     cP();
/*      */   }
/*      */   
/*      */   public int bZ() {
/*  163 */     return this.af.a(19);
/*      */   }
/*      */   
/*      */   public void t(int paramInt) {
/*  167 */     this.af.b(20, Integer.valueOf(paramInt));
/*  168 */     cP();
/*      */   }
/*      */   
/*      */   public int ca() {
/*  172 */     return this.af.c(20);
/*      */   }
/*      */   
/*      */ 
/*      */   public String b_()
/*      */   {
/*  178 */     if (bH()) return bG();
/*  179 */     int i = bZ();
/*  180 */     switch (i) {
/*      */     case 0: 
/*      */     default: 
/*  183 */       return dd.a("entity.horse.name");
/*      */     case 1: 
/*  185 */       return dd.a("entity.donkey.name");
/*      */     case 2: 
/*  187 */       return dd.a("entity.mule.name");
/*      */     case 4: 
/*  189 */       return dd.a("entity.skeletonhorse.name");
/*      */     }
/*  191 */     return dd.a("entity.zombiehorse.name");
/*      */   }
/*      */   
/*      */ 
/*      */   private boolean x(int paramInt)
/*      */   {
/*  197 */     return (this.af.c(16) & paramInt) != 0;
/*      */   }
/*      */   
/*      */   private void b(int paramInt, boolean paramBoolean) {
/*  201 */     int i = this.af.c(16);
/*  202 */     if (paramBoolean) {
/*  203 */       this.af.b(16, Integer.valueOf(i | paramInt));
/*      */     } else {
/*  205 */       this.af.b(16, Integer.valueOf(i & (paramInt ^ 0xFFFFFFFF)));
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean cb() {
/*  210 */     return !f();
/*      */   }
/*      */   
/*      */   public boolean cc() {
/*  214 */     return x(2);
/*      */   }
/*      */   
/*      */   public boolean cg() {
/*  218 */     return cb();
/*      */   }
/*      */   
/*      */   public String ch() {
/*  222 */     return this.af.e(21);
/*      */   }
/*      */   
/*      */   public void b(String paramString) {
/*  226 */     this.af.b(21, paramString);
/*      */   }
/*      */   
/*      */   public float ci() {
/*  230 */     int i = d();
/*  231 */     if (i >= 0) {
/*  232 */       return 1.0F;
/*      */     }
/*  234 */     return 0.5F + (41536 - i) / -24000.0F * 0.5F;
/*      */   }
/*      */   
/*      */   public void a(boolean paramBoolean)
/*      */   {
/*  239 */     if (paramBoolean) {
/*  240 */       a(ci());
/*      */     } else {
/*  242 */       a(1.0F);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean cj() {
/*  247 */     return this.br;
/*      */   }
/*      */   
/*      */   public void i(boolean paramBoolean) {
/*  251 */     b(2, paramBoolean);
/*      */   }
/*      */   
/*      */   public void j(boolean paramBoolean) {
/*  255 */     this.br = paramBoolean;
/*      */   }
/*      */   
/*      */   public boolean bM()
/*      */   {
/*  260 */     return (!cE()) && (super.bM());
/*      */   }
/*      */   
/*      */   protected void o(float paramFloat)
/*      */   {
/*  265 */     if ((paramFloat > 6.0F) && (cm())) {
/*  266 */       o(false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean ck() {
/*  271 */     return x(8);
/*      */   }
/*      */   
/*      */   public int cl() {
/*  275 */     return this.af.c(22);
/*      */   }
/*      */   
/*      */   private int e(add paramadd) {
/*  279 */     if (paramadd == null) {
/*  280 */       return 0;
/*      */     }
/*  282 */     adb localadb = paramadd.b();
/*  283 */     if (localadb == ade.bX)
/*  284 */       return 1;
/*  285 */     if (localadb == ade.bY)
/*  286 */       return 2;
/*  287 */     if (localadb == ade.bZ) {
/*  288 */       return 3;
/*      */     }
/*  290 */     return 0;
/*      */   }
/*      */   
/*      */   public boolean cm() {
/*  294 */     return x(32);
/*      */   }
/*      */   
/*      */   public boolean cn() {
/*  298 */     return x(64);
/*      */   }
/*      */   
/*      */   public boolean co() {
/*  302 */     return x(16);
/*      */   }
/*      */   
/*      */   public boolean cp() {
/*  306 */     return this.bH;
/*      */   }
/*      */   
/*      */   public void d(add paramadd) {
/*  310 */     this.af.b(22, Integer.valueOf(e(paramadd)));
/*  311 */     cP();
/*      */   }
/*      */   
/*      */   public void k(boolean paramBoolean) {
/*  315 */     b(16, paramBoolean);
/*      */   }
/*      */   
/*      */   public void l(boolean paramBoolean)
/*      */   {
/*  320 */     b(8, paramBoolean);
/*      */   }
/*      */   
/*      */   public void m(boolean paramBoolean) {
/*  324 */     this.bH = paramBoolean;
/*      */   }
/*      */   
/*      */   public void n(boolean paramBoolean) {
/*  328 */     b(4, paramBoolean);
/*      */   }
/*      */   
/*      */   public int cq() {
/*  332 */     return this.bs;
/*      */   }
/*      */   
/*      */   public void u(int paramInt) {
/*  336 */     this.bs = paramInt;
/*      */   }
/*      */   
/*      */   public int v(int paramInt) {
/*  340 */     int i = qh.a(cq() + paramInt, 0, cw());
/*      */     
/*  342 */     u(i);
/*  343 */     return i;
/*      */   }
/*      */   
/*      */   public boolean a(ro paramro, float paramFloat)
/*      */   {
/*  348 */     sa localsa = paramro.j();
/*  349 */     if ((this.l != null) && (this.l.equals(localsa))) {
/*  350 */       return false;
/*      */     }
/*      */     
/*  353 */     return super.a(paramro, paramFloat);
/*      */   }
/*      */   
/*      */   public int aV()
/*      */   {
/*  358 */     return by[cl()];
/*      */   }
/*      */   
/*      */   public boolean S()
/*      */   {
/*  363 */     return this.l == null;
/*      */   }
/*      */   
/*      */   public boolean cr()
/*      */   {
/*  368 */     int i = qh.c(this.s);
/*  369 */     int j = qh.c(this.u);
/*      */     
/*  371 */     this.o.a(i, j);
/*  372 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void cs()
/*      */   {
/*  379 */     if ((this.o.E) || (!ck())) {
/*  380 */       return;
/*      */     }
/*      */     
/*  383 */     a(adb.a(ajn.ae), 1);
/*  384 */     l(false);
/*      */   }
/*      */   
/*      */   private void cL() {
/*  388 */     cS();
/*  389 */     this.o.a(this, "eating", 1.0F, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected void b(float paramFloat)
/*      */   {
/*  398 */     if (paramFloat > 1.0F) {
/*  399 */       a("mob.horse.land", 0.4F, 1.0F);
/*      */     }
/*      */     
/*  402 */     int i = qh.f(paramFloat * 0.5F - 3.0F);
/*  403 */     if (i <= 0) { return;
/*      */     }
/*  405 */     a(ro.h, i);
/*      */     
/*  407 */     if (this.l != null) {
/*  408 */       this.l.a(ro.h, i);
/*      */     }
/*      */     
/*  411 */     aji localaji = this.o.a(qh.c(this.s), qh.c(this.t - 0.2D - this.A), qh.c(this.u));
/*  412 */     if (localaji.o() != awt.a) {
/*  413 */       ajm localajm = localaji.H;
/*  414 */       this.o.a(this, localajm.e(), localajm.c() * 0.5F, localajm.d() * 0.75F);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private int cM()
/*      */   {
/*  425 */     int i = bZ();
/*  426 */     if ((ck()) && ((i == 1) || (i == 2))) {
/*  427 */       return 17;
/*      */     }
/*  429 */     return 2;
/*      */   }
/*      */   
/*      */   private void cN()
/*      */   {
/*  434 */     zt localzt = this.bG;
/*  435 */     this.bG = new zt("HorseChest", cM());
/*  436 */     this.bG.a(b_());
/*  437 */     if (localzt != null) {
/*  438 */       localzt.b(this);
/*      */       
/*  440 */       int i = Math.min(localzt.a(), this.bG.a());
/*  441 */       for (int j = 0; j < i; j++) {
/*  442 */         add localadd = localzt.a(j);
/*  443 */         if (localadd != null) {
/*  444 */           this.bG.a(j, localadd.m());
/*      */         }
/*      */       }
/*  447 */       localzt = null;
/*      */     }
/*  449 */     this.bG.a(this);
/*  450 */     cO();
/*      */   }
/*      */   
/*      */   private void cO() {
/*  454 */     if (!this.o.E) {
/*  455 */       n(this.bG.a(0) != null);
/*  456 */       if (cB()) {
/*  457 */         d(this.bG.a(1));
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(rh paramrh)
/*      */   {
/*  464 */     int i = cl();
/*  465 */     boolean bool = cu();
/*  466 */     cO();
/*  467 */     if (this.aa > 20) {
/*  468 */       if ((i == 0) && (i != cl())) {
/*  469 */         a("mob.horse.armor", 0.5F, 1.0F);
/*  470 */       } else if (i != cl()) {
/*  471 */         a("mob.horse.armor", 0.5F, 1.0F);
/*      */       }
/*  473 */       if ((!bool) && (cu())) {
/*  474 */         a("mob.horse.leather", 0.5F, 1.0F);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public boolean by()
/*      */   {
/*  482 */     cr();
/*  483 */     return super.by();
/*      */   }
/*      */   
/*      */   protected wi a(sa paramsa, double paramDouble)
/*      */   {
/*  488 */     double d1 = Double.MAX_VALUE;
/*      */     
/*  490 */     Object localObject = null;
/*  491 */     List localList = this.o.a(paramsa, paramsa.C.a(paramDouble, paramDouble, paramDouble), bu);
/*      */     
/*  493 */     for (sa localsa : localList) {
/*  494 */       double d2 = localsa.e(paramsa.s, paramsa.t, paramsa.u);
/*      */       
/*  496 */       if (d2 < d1) {
/*  497 */         localObject = localsa;
/*  498 */         d1 = d2;
/*      */       }
/*      */     }
/*      */     
/*  502 */     return (wi)localObject;
/*      */   }
/*      */   
/*      */   public double ct() {
/*  506 */     return a(bv).e();
/*      */   }
/*      */   
/*      */   protected String aU()
/*      */   {
/*  511 */     cS();
/*  512 */     int i = bZ();
/*  513 */     if (i == 3) {
/*  514 */       return "mob.horse.zombie.death";
/*      */     }
/*  516 */     if (i == 4) {
/*  517 */       return "mob.horse.skeleton.death";
/*      */     }
/*  519 */     if ((i == 1) || (i == 2)) {
/*  520 */       return "mob.horse.donkey.death";
/*      */     }
/*  522 */     return "mob.horse.death";
/*      */   }
/*      */   
/*      */   protected adb u()
/*      */   {
/*  527 */     int i = this.Z.nextInt(4) == 0 ? 1 : 0;
/*      */     
/*  529 */     int j = bZ();
/*  530 */     if (j == 4) {
/*  531 */       return ade.aS;
/*      */     }
/*  533 */     if (j == 3) {
/*  534 */       if (i != 0) {
/*  535 */         return adb.d(0);
/*      */       }
/*  537 */       return ade.bh;
/*      */     }
/*      */     
/*  540 */     return ade.aA;
/*      */   }
/*      */   
/*      */   protected String aT()
/*      */   {
/*  545 */     cS();
/*      */     
/*  547 */     if (this.Z.nextInt(3) == 0) {
/*  548 */       cU();
/*      */     }
/*      */     
/*  551 */     int i = bZ();
/*  552 */     if (i == 3) {
/*  553 */       return "mob.horse.zombie.hit";
/*      */     }
/*  555 */     if (i == 4) {
/*  556 */       return "mob.horse.skeleton.hit";
/*      */     }
/*  558 */     if ((i == 1) || (i == 2)) {
/*  559 */       return "mob.horse.donkey.hit";
/*      */     }
/*  561 */     return "mob.horse.hit";
/*      */   }
/*      */   
/*      */   public boolean cu() {
/*  565 */     return x(4);
/*      */   }
/*      */   
/*      */   protected String t()
/*      */   {
/*  570 */     cS();
/*  571 */     if ((this.Z.nextInt(10) == 0) && (!bh())) {
/*  572 */       cU();
/*      */     }
/*  574 */     int i = bZ();
/*  575 */     if (i == 3) {
/*  576 */       return "mob.horse.zombie.idle";
/*      */     }
/*  578 */     if (i == 4) {
/*  579 */       return "mob.horse.skeleton.idle";
/*      */     }
/*  581 */     if ((i == 1) || (i == 2)) {
/*  582 */       return "mob.horse.donkey.idle";
/*      */     }
/*  584 */     return "mob.horse.idle";
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   protected String cv()
/*      */   {
/*  591 */     cS();
/*  592 */     cU();
/*  593 */     int i = bZ();
/*  594 */     if ((i == 3) || (i == 4)) {
/*  595 */       return null;
/*      */     }
/*  597 */     if ((i == 1) || (i == 2)) {
/*  598 */       return "mob.horse.donkey.angry";
/*      */     }
/*  600 */     return "mob.horse.angry";
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*      */   {
/*  607 */     ajm localajm = paramaji.H;
/*  608 */     if (this.o.a(paramInt1, paramInt2 + 1, paramInt3) == ajn.aC) {
/*  609 */       localajm = ajn.aC.H;
/*      */     }
/*  611 */     if (!paramaji.o().d()) {
/*  612 */       int i = bZ();
/*  613 */       if ((this.l != null) && (i != 1) && (i != 2)) {
/*  614 */         this.bP += 1;
/*  615 */         if ((this.bP > 5) && (this.bP % 3 == 0)) {
/*  616 */           a("mob.horse.gallop", localajm.c() * 0.15F, localajm.d());
/*  617 */           if ((i == 0) && (this.Z.nextInt(10) == 0)) {
/*  618 */             a("mob.horse.breathe", localajm.c() * 0.6F, localajm.d());
/*      */           }
/*  620 */         } else if (this.bP <= 5) {
/*  621 */           a("mob.horse.wood", localajm.c() * 0.15F, localajm.d());
/*      */         }
/*  623 */       } else if (localajm == aji.f) {
/*  624 */         a("mob.horse.wood", localajm.c() * 0.15F, localajm.d());
/*      */       } else {
/*  626 */         a("mob.horse.soft", localajm.c() * 0.15F, localajm.d());
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void aD()
/*      */   {
/*  633 */     super.aD();
/*      */     
/*  635 */     bc().b(bv);
/*      */     
/*  637 */     a(yj.a).a(53.0D);
/*  638 */     a(yj.d).a(0.22499999403953552D);
/*      */   }
/*      */   
/*      */   public int bB()
/*      */   {
/*  643 */     return 6;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public int cw()
/*      */   {
/*  651 */     return 100;
/*      */   }
/*      */   
/*      */   protected float bf()
/*      */   {
/*  656 */     return 0.8F;
/*      */   }
/*      */   
/*      */   public int q()
/*      */   {
/*  661 */     return 400;
/*      */   }
/*      */   
/*      */   public boolean cx() {
/*  665 */     return (bZ() == 0) || (cl() > 0);
/*      */   }
/*      */   
/*      */ 
/*  669 */   private String[] bR = new String[3];
/*      */   
/*      */   private void cP() {
/*  672 */     this.bQ = null;
/*      */   }
/*      */   
/*      */   private void cQ() {
/*  676 */     this.bQ = "horse/";
/*  677 */     this.bR[0] = null;
/*  678 */     this.bR[1] = null;
/*  679 */     this.bR[2] = null;
/*      */     
/*  681 */     int i = bZ();
/*  682 */     int j = ca();
/*      */     
/*  684 */     if (i == 0) {
/*  685 */       k = j & 0xFF;
/*  686 */       int m = (j & 0xFF00) >> 8;
/*  687 */       this.bR[0] = bz[k];
/*  688 */       this.bQ += bA[k];
/*  689 */       this.bR[1] = bB[m];
/*  690 */       this.bQ += bC[m];
/*      */     } else {
/*  692 */       this.bR[0] = "";
/*  693 */       this.bQ = (this.bQ + "_" + i + "_");
/*      */     }
/*      */     
/*  696 */     int k = cl();
/*  697 */     this.bR[2] = bw[k];
/*  698 */     this.bQ += bx[k];
/*      */   }
/*      */   
/*      */   public String cy() {
/*  702 */     if (this.bQ == null) {
/*  703 */       cQ();
/*      */     }
/*  705 */     return this.bQ;
/*      */   }
/*      */   
/*      */   public String[] cz() {
/*  709 */     if (this.bQ == null) {
/*  710 */       cQ();
/*      */     }
/*  712 */     return this.bR;
/*      */   }
/*      */   
/*      */   public void g(yz paramyz) {
/*  716 */     if ((!this.o.E) && ((this.l == null) || (this.l == paramyz)) && (cc())) {
/*  717 */       this.bG.a(b_());
/*  718 */       paramyz.a(this, this.bG);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(yz paramyz)
/*      */   {
/*  724 */     add localadd = paramyz.bm.h();
/*      */     
/*  726 */     if ((localadd != null) && (localadd.b() == ade.bx)) {
/*  727 */       return super.a(paramyz);
/*      */     }
/*      */     
/*  730 */     if ((!cc()) && 
/*  731 */       (cE())) {
/*  732 */       return false;
/*      */     }
/*      */     
/*      */ 
/*  736 */     if ((cc()) && (cb()) && (paramyz.an())) {
/*  737 */       g(paramyz);
/*  738 */       return true;
/*      */     }
/*      */     
/*  741 */     if ((cg()) && (this.l != null)) {
/*  742 */       return super.a(paramyz);
/*      */     }
/*      */     
/*      */ 
/*  746 */     if (localadd != null) {
/*  747 */       int i = 0;
/*      */       
/*  749 */       if (cB()) {
/*  750 */         int j = -1;
/*      */         
/*  752 */         if (localadd.b() == ade.bX) {
/*  753 */           j = 1;
/*  754 */         } else if (localadd.b() == ade.bY) {
/*  755 */           j = 2;
/*  756 */         } else if (localadd.b() == ade.bZ) {
/*  757 */           j = 3;
/*      */         }
/*      */         
/*  760 */         if (j >= 0) {
/*  761 */           if (!cc()) {
/*  762 */             cJ();
/*  763 */             return true;
/*      */           }
/*  765 */           g(paramyz);
/*  766 */           return true;
/*      */         }
/*      */       }
/*      */       
/*  770 */       if ((i == 0) && (!cE())) {
/*  771 */         float f = 0.0F;
/*  772 */         int k = 0;
/*  773 */         int m = 0;
/*      */         
/*  775 */         if (localadd.b() == ade.O) {
/*  776 */           f = 2.0F;
/*  777 */           k = 60;
/*  778 */           m = 3;
/*  779 */         } else if (localadd.b() == ade.aT) {
/*  780 */           f = 1.0F;
/*  781 */           k = 30;
/*  782 */           m = 3;
/*  783 */         } else if (localadd.b() == ade.P) {
/*  784 */           f = 7.0F;
/*  785 */           k = 180;
/*  786 */           m = 3;
/*  787 */         } else if (aji.a(localadd.b()) == ajn.cf) {
/*  788 */           f = 20.0F;
/*  789 */           k = 180;
/*  790 */         } else if (localadd.b() == ade.e) {
/*  791 */           f = 3.0F;
/*  792 */           k = 60;
/*  793 */           m = 3;
/*  794 */         } else if (localadd.b() == ade.bK) {
/*  795 */           f = 4.0F;
/*  796 */           k = 60;
/*  797 */           m = 5;
/*  798 */           if ((cc()) && (d() == 0)) {
/*  799 */             i = 1;
/*  800 */             f(paramyz);
/*      */           }
/*  802 */         } else if (localadd.b() == ade.ao) {
/*  803 */           f = 10.0F;
/*  804 */           k = 240;
/*  805 */           m = 10;
/*  806 */           if ((cc()) && (d() == 0)) {
/*  807 */             i = 1;
/*  808 */             f(paramyz);
/*      */           }
/*      */         }
/*  811 */         if ((aS() < aY()) && (f > 0.0F)) {
/*  812 */           f(f);
/*  813 */           i = 1;
/*      */         }
/*  815 */         if ((!cb()) && (k > 0)) {
/*  816 */           a(k);
/*  817 */           i = 1;
/*      */         }
/*  819 */         if ((m > 0) && ((i != 0) || (!cc())) && (m < cw())) {
/*  820 */           i = 1;
/*  821 */           v(m);
/*      */         }
/*  823 */         if (i != 0) {
/*  824 */           cL();
/*      */         }
/*      */       }
/*      */       
/*  828 */       if ((!cc()) && (i == 0)) {
/*  829 */         if ((localadd != null) && (localadd.a(paramyz, this))) {
/*  830 */           return true;
/*      */         }
/*  832 */         cJ();
/*  833 */         return true;
/*      */       }
/*      */       
/*  836 */       if ((i == 0) && (cC()) && (!ck()) && 
/*  837 */         (localadd.b() == adb.a(ajn.ae))) {
/*  838 */         l(true);
/*  839 */         a("mob.chickenplop", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*  840 */         i = 1;
/*  841 */         cN();
/*      */       }
/*      */       
/*      */ 
/*  845 */       if ((i == 0) && (cg()) && (!cu()) && 
/*  846 */         (localadd.b() == ade.av)) {
/*  847 */         g(paramyz);
/*  848 */         return true;
/*      */       }
/*      */       
/*      */ 
/*  852 */       if (i != 0) {
/*  853 */         if (!paramyz.bE.d) {
/*  854 */           if (--localadd.b == 0) {
/*  855 */             paramyz.bm.a(paramyz.bm.c, null);
/*      */           }
/*      */         }
/*  858 */         return true;
/*      */       }
/*      */     }
/*      */     
/*  862 */     if ((cg()) && (this.l == null))
/*      */     {
/*      */ 
/*  865 */       if ((localadd != null) && (localadd.a(paramyz, this))) {
/*  866 */         return true;
/*      */       }
/*  868 */       i(paramyz);
/*  869 */       return true;
/*      */     }
/*  871 */     return super.a(paramyz);
/*      */   }
/*      */   
/*      */   private void i(yz paramyz)
/*      */   {
/*  876 */     paramyz.y = this.y;
/*  877 */     paramyz.z = this.z;
/*  878 */     o(false);
/*  879 */     p(false);
/*  880 */     if (!this.o.E) {
/*  881 */       paramyz.a(this);
/*      */     }
/*      */   }
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
/*      */   public boolean cB()
/*      */   {
/*  896 */     return bZ() == 0;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean cC()
/*      */   {
/*  905 */     int i = bZ();
/*  906 */     return (i == 2) || (i == 1);
/*      */   }
/*      */   
/*      */   protected boolean bh()
/*      */   {
/*  911 */     if ((this.l != null) && (cu())) {
/*  912 */       return true;
/*      */     }
/*  914 */     return (cm()) || (cn());
/*      */   }
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
/*      */   public boolean cE()
/*      */   {
/*  931 */     int i = bZ();
/*  932 */     return (i == 3) || (i == 4);
/*      */   }
/*      */   
/*      */   public boolean cF() {
/*  936 */     return (cE()) || (bZ() == 2);
/*      */   }
/*      */   
/*      */ 
/*      */   public boolean c(add paramadd)
/*      */   {
/*  942 */     return false;
/*      */   }
/*      */   
/*      */   private void cR() {
/*  946 */     this.bp = 1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(ro paramro)
/*      */   {
/*  959 */     super.a(paramro);
/*  960 */     if (!this.o.E) {
/*  961 */       cK();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void e()
/*      */   {
/*  968 */     if (this.Z.nextInt(200) == 0) {
/*  969 */       cR();
/*      */     }
/*      */     
/*  972 */     super.e();
/*      */     
/*  974 */     if (!this.o.E) {
/*  975 */       if ((this.Z.nextInt(900) == 0) && (this.aA == 0)) {
/*  976 */         f(1.0F);
/*      */       }
/*      */       
/*  979 */       if ((!cm()) && (this.l == null) && (this.Z.nextInt(300) == 0) && 
/*  980 */         (this.o.a(qh.c(this.s), qh.c(this.t) - 1, qh.c(this.u)) == ajn.c)) {
/*  981 */         o(true);
/*      */       }
/*      */       
/*      */ 
/*  985 */       if ((cm()) && (++this.bD > 50)) {
/*  986 */         this.bD = 0;
/*  987 */         o(false);
/*      */       }
/*      */       
/*  990 */       if ((co()) && (!cb()) && (!cm())) {
/*  991 */         wi localwi = a(this, 16.0D);
/*  992 */         if ((localwi != null) && (f(localwi) > 4.0D)) {
/*  993 */           ayf localayf = this.o.a(this, localwi, 16.0F, true, false, false, true);
/*  994 */           a(localayf);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void h()
/*      */   {
/* 1003 */     super.h();
/*      */     
/*      */ 
/* 1006 */     if ((this.o.E) && (this.af.a())) {
/* 1007 */       this.af.e();
/* 1008 */       cP();
/*      */     }
/*      */     
/* 1011 */     if ((this.bE > 0) && (++this.bE > 30)) {
/* 1012 */       this.bE = 0;
/* 1013 */       b(128, false);
/*      */     }
/*      */     
/* 1016 */     if ((!this.o.E) && 
/* 1017 */       (this.bF > 0) && (++this.bF > 20)) {
/* 1018 */       this.bF = 0;
/* 1019 */       p(false);
/*      */     }
/*      */     
/*      */ 
/* 1023 */     if ((this.bp > 0) && (++this.bp > 8)) {
/* 1024 */       this.bp = 0;
/*      */     }
/*      */     
/* 1027 */     if (this.bq > 0) {
/* 1028 */       this.bq += 1;
/*      */       
/* 1030 */       if (this.bq > 300) {
/* 1031 */         this.bq = 0;
/*      */       }
/*      */     }
/*      */     
/* 1035 */     this.bK = this.bJ;
/* 1036 */     if (cm()) {
/* 1037 */       this.bJ += (1.0F - this.bJ) * 0.4F + 0.05F;
/* 1038 */       if (this.bJ > 1.0F) {
/* 1039 */         this.bJ = 1.0F;
/*      */       }
/*      */     } else {
/* 1042 */       this.bJ += (0.0F - this.bJ) * 0.4F - 0.05F;
/* 1043 */       if (this.bJ < 0.0F) {
/* 1044 */         this.bJ = 0.0F;
/*      */       }
/*      */     }
/* 1047 */     this.bM = this.bL;
/* 1048 */     if (cn())
/*      */     {
/* 1050 */       this.bK = (this.bJ = 0.0F);
/* 1051 */       this.bL += (1.0F - this.bL) * 0.4F + 0.05F;
/* 1052 */       if (this.bL > 1.0F) {
/* 1053 */         this.bL = 1.0F;
/*      */       }
/*      */     } else {
/* 1056 */       this.bI = false;
/*      */       
/* 1058 */       this.bL += (0.8F * this.bL * this.bL * this.bL - this.bL) * 0.6F - 0.05F;
/* 1059 */       if (this.bL < 0.0F) {
/* 1060 */         this.bL = 0.0F;
/*      */       }
/*      */     }
/* 1063 */     this.bO = this.bN;
/* 1064 */     if (x(128)) {
/* 1065 */       this.bN += (1.0F - this.bN) * 0.7F + 0.05F;
/* 1066 */       if (this.bN > 1.0F) {
/* 1067 */         this.bN = 1.0F;
/*      */       }
/*      */     } else {
/* 1070 */       this.bN += (0.0F - this.bN) * 0.7F - 0.05F;
/* 1071 */       if (this.bN < 0.0F) {
/* 1072 */         this.bN = 0.0F;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void cS() {
/* 1078 */     if (!this.o.E) {
/* 1079 */       this.bE = 1;
/* 1080 */       b(128, true);
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean cT() {
/* 1085 */     return (this.l == null) && (this.m == null) && (cc()) && (cb()) && (!cF()) && (aS() >= aY());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void e(boolean paramBoolean)
/*      */   {
/* 1098 */     b(32, paramBoolean);
/*      */   }
/*      */   
/*      */   public void o(boolean paramBoolean) {
/* 1102 */     e(paramBoolean);
/*      */   }
/*      */   
/*      */   public void p(boolean paramBoolean) {
/* 1106 */     if (paramBoolean) {
/* 1107 */       o(false);
/*      */     }
/* 1109 */     b(64, paramBoolean);
/*      */   }
/*      */   
/*      */   private void cU() {
/* 1113 */     if (!this.o.E) {
/* 1114 */       this.bF = 1;
/* 1115 */       p(true);
/*      */     }
/*      */   }
/*      */   
/*      */   public void cJ() {
/* 1120 */     cU();
/* 1121 */     String str = cv();
/* 1122 */     if (str != null) {
/* 1123 */       a(str, bf(), bg());
/*      */     }
/*      */   }
/*      */   
/*      */   public void cK() {
/* 1128 */     a(this, this.bG);
/* 1129 */     cs();
/*      */   }
/*      */   
/*      */   private void a(sa paramsa, zt paramzt) {
/* 1133 */     if ((paramzt == null) || (this.o.E)) { return;
/*      */     }
/* 1135 */     for (int i = 0; i < paramzt.a(); i++) {
/* 1136 */       add localadd = paramzt.a(i);
/* 1137 */       if (localadd != null)
/*      */       {
/*      */ 
/* 1140 */         a(localadd, 0.0F);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean h(yz paramyz) {
/* 1146 */     b(paramyz.aB().toString());
/* 1147 */     i(true);
/* 1148 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void e(float paramFloat1, float paramFloat2)
/*      */   {
/* 1159 */     if ((this.l == null) || (!(this.l instanceof sv)) || (!cu())) {
/* 1160 */       this.W = 0.5F;
/* 1161 */       this.aQ = 0.02F;
/* 1162 */       super.e(paramFloat1, paramFloat2);
/* 1163 */       return;
/*      */     }
/*      */     
/* 1166 */     this.A = (this.y = this.l.y);
/* 1167 */     this.z = (this.l.z * 0.5F);
/* 1168 */     b(this.y, this.z);
/* 1169 */     this.aO = (this.aM = this.y);
/*      */     
/* 1171 */     paramFloat1 = ((sv)this.l).bd * 0.5F;
/* 1172 */     paramFloat2 = ((sv)this.l).be;
/*      */     
/*      */ 
/* 1175 */     if (paramFloat2 <= 0.0F) {
/* 1176 */       paramFloat2 *= 0.25F;
/* 1177 */       this.bP = 0;
/*      */     }
/*      */     
/* 1180 */     if ((this.D) && (this.bt == 0.0F) && (cn()) && (!this.bI)) {
/* 1181 */       paramFloat1 = 0.0F;
/* 1182 */       paramFloat2 = 0.0F;
/*      */     }
/*      */     
/* 1185 */     if ((this.bt > 0.0F) && (!cj()) && (this.D)) {
/* 1186 */       this.w = (ct() * this.bt);
/* 1187 */       if (a(rv.j)) {
/* 1188 */         this.w += (b(rv.j).c() + 1) * 0.1F;
/*      */       }
/*      */       
/* 1191 */       j(true);
/* 1192 */       this.al = true;
/*      */       
/* 1194 */       if (paramFloat2 > 0.0F) {
/* 1195 */         float f1 = qh.a(this.y * 3.1415927F / 180.0F);
/* 1196 */         float f2 = qh.b(this.y * 3.1415927F / 180.0F);
/*      */         
/* 1198 */         this.v += -0.4F * f1 * this.bt;
/* 1199 */         this.x += 0.4F * f2 * this.bt;
/*      */         
/* 1201 */         a("mob.horse.jump", 0.4F, 1.0F);
/*      */       }
/* 1203 */       this.bt = 0.0F;
/*      */     }
/*      */     
/* 1206 */     this.W = 1.0F;
/* 1207 */     this.aQ = (bl() * 0.1F);
/* 1208 */     if (!this.o.E) {
/* 1209 */       i((float)a(yj.d).e());
/* 1210 */       super.e(paramFloat1, paramFloat2);
/*      */     }
/*      */     
/*      */ 
/* 1214 */     if (this.D)
/*      */     {
/* 1216 */       this.bt = 0.0F;
/* 1217 */       j(false);
/*      */     }
/* 1219 */     this.aE = this.aF;
/* 1220 */     double d1 = this.s - this.p;
/* 1221 */     double d2 = this.u - this.r;
/* 1222 */     float f3 = qh.a(d1 * d1 + d2 * d2) * 4.0F;
/* 1223 */     if (f3 > 1.0F) {
/* 1224 */       f3 = 1.0F;
/*      */     }
/*      */     
/* 1227 */     this.aF += (f3 - this.aF) * 0.4F;
/* 1228 */     this.aG += this.aF;
/*      */   }
/*      */   
/*      */ 
/*      */   public void b(dh paramdh)
/*      */   {
/* 1234 */     super.b(paramdh);
/*      */     
/* 1236 */     paramdh.a("EatingHaystack", cm());
/* 1237 */     paramdh.a("ChestedHorse", ck());
/* 1238 */     paramdh.a("HasReproduced", cp());
/* 1239 */     paramdh.a("Bred", co());
/* 1240 */     paramdh.a("Type", bZ());
/* 1241 */     paramdh.a("Variant", ca());
/* 1242 */     paramdh.a("Temper", cq());
/* 1243 */     paramdh.a("Tame", cc());
/* 1244 */     paramdh.a("OwnerUUID", ch());
/*      */     
/* 1246 */     if (ck()) {
/* 1247 */       dq localdq = new dq();
/*      */       
/* 1249 */       for (int i = 2; i < this.bG.a(); i++) {
/* 1250 */         add localadd = this.bG.a(i);
/*      */         
/* 1252 */         if (localadd != null) {
/* 1253 */           dh localdh = new dh();
/*      */           
/* 1255 */           localdh.a("Slot", (byte)i);
/*      */           
/* 1257 */           localadd.b(localdh);
/* 1258 */           localdq.a(localdh);
/*      */         }
/*      */       }
/* 1261 */       paramdh.a("Items", localdq);
/*      */     }
/*      */     
/* 1264 */     if (this.bG.a(1) != null) {
/* 1265 */       paramdh.a("ArmorItem", this.bG.a(1).b(new dh()));
/*      */     }
/* 1267 */     if (this.bG.a(0) != null) {
/* 1268 */       paramdh.a("SaddleItem", this.bG.a(0).b(new dh()));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(dh paramdh)
/*      */   {
/* 1274 */     super.a(paramdh);
/* 1275 */     o(paramdh.n("EatingHaystack"));
/* 1276 */     k(paramdh.n("Bred"));
/* 1277 */     l(paramdh.n("ChestedHorse"));
/* 1278 */     m(paramdh.n("HasReproduced"));
/* 1279 */     s(paramdh.f("Type"));
/* 1280 */     t(paramdh.f("Variant"));
/* 1281 */     u(paramdh.f("Temper"));
/* 1282 */     i(paramdh.n("Tame"));
/* 1283 */     if (paramdh.b("OwnerUUID", 8)) {
/* 1284 */       b(paramdh.j("OwnerUUID"));
/*      */     }
/*      */     
/* 1287 */     ti localti = bc().a("Speed");
/*      */     
/* 1289 */     if (localti != null) {
/* 1290 */       a(yj.d).a(localti.b() * 0.25D);
/*      */     }
/*      */     Object localObject;
/* 1293 */     if (ck()) {
/* 1294 */       localObject = paramdh.c("Items", 10);
/* 1295 */       cN();
/*      */       
/* 1297 */       for (int i = 0; i < ((dq)localObject).c(); i++) {
/* 1298 */         dh localdh = ((dq)localObject).b(i);
/* 1299 */         int j = localdh.d("Slot") & 0xFF;
/*      */         
/* 1301 */         if ((j >= 2) && (j < this.bG.a())) {
/* 1302 */           this.bG.a(j, add.a(localdh));
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1307 */     if (paramdh.b("ArmorItem", 10)) {
/* 1308 */       localObject = add.a(paramdh.m("ArmorItem"));
/* 1309 */       if ((localObject != null) && (a(((add)localObject).b()))) {
/* 1310 */         this.bG.a(1, (add)localObject);
/*      */       }
/*      */     }
/*      */     
/* 1314 */     if (paramdh.b("SaddleItem", 10)) {
/* 1315 */       localObject = add.a(paramdh.m("SaddleItem"));
/* 1316 */       if ((localObject != null) && (((add)localObject).b() == ade.av)) {
/* 1317 */         this.bG.a(0, (add)localObject);
/*      */       }
/* 1319 */     } else if (paramdh.n("Saddle")) {
/* 1320 */       this.bG.a(0, new add(ade.av));
/*      */     }
/* 1322 */     cO();
/*      */   }
/*      */   
/*      */   public boolean a(wf paramwf)
/*      */   {
/* 1327 */     if (paramwf == this) return false;
/* 1328 */     if (paramwf.getClass() != getClass()) { return false;
/*      */     }
/* 1330 */     wi localwi = (wi)paramwf;
/*      */     
/* 1332 */     if ((!cT()) || (!localwi.cT())) {
/* 1333 */       return false;
/*      */     }
/* 1335 */     int i = bZ();
/* 1336 */     int j = localwi.bZ();
/*      */     
/* 1338 */     return (i == j) || ((i == 0) && (j == 1)) || ((i == 1) && (j == 0));
/*      */   }
/*      */   
/*      */   public rx a(rx paramrx)
/*      */   {
/* 1343 */     wi localwi1 = (wi)paramrx;
/* 1344 */     wi localwi2 = new wi(this.o);
/*      */     
/* 1346 */     int i = bZ();
/* 1347 */     int j = localwi1.bZ();
/* 1348 */     int k = 0;
/*      */     
/* 1350 */     if (i == j) {
/* 1351 */       k = i;
/* 1352 */     } else if (((i == 0) && (j == 1)) || ((i == 1) && (j == 0))) {
/* 1353 */       k = 2;
/*      */     }
/*      */     
/*      */ 
/* 1357 */     if (k == 0)
/*      */     {
/* 1359 */       int n = this.Z.nextInt(9);
/* 1360 */       int m; if (n < 4) {
/* 1361 */         m = ca() & 0xFF;
/* 1362 */       } else if (n < 8) {
/* 1363 */         m = localwi1.ca() & 0xFF;
/*      */       } else {
/* 1365 */         m = this.Z.nextInt(7);
/*      */       }
/*      */       
/* 1368 */       int i1 = this.Z.nextInt(5);
/* 1369 */       if (i1 < 2) {
/* 1370 */         m |= ca() & 0xFF00;
/* 1371 */       } else if (i1 < 4) {
/* 1372 */         m |= localwi1.ca() & 0xFF00;
/*      */       } else {
/* 1374 */         m |= this.Z.nextInt(5) << 8 & 0xFF00;
/*      */       }
/* 1376 */       localwi2.t(m);
/*      */     }
/*      */     
/* 1379 */     localwi2.s(k);
/*      */     
/*      */ 
/* 1382 */     double d1 = a(yj.a).b() + paramrx.a(yj.a).b() + cV();
/* 1383 */     localwi2.a(yj.a).a(d1 / 3.0D);
/*      */     
/* 1385 */     double d2 = a(bv).b() + paramrx.a(bv).b() + cW();
/* 1386 */     localwi2.a(bv).a(d2 / 3.0D);
/*      */     
/* 1388 */     double d3 = a(yj.d).b() + paramrx.a(yj.d).b() + cX();
/* 1389 */     localwi2.a(yj.d).a(d3 / 3.0D);
/*      */     
/* 1391 */     return localwi2;
/*      */   }
/*      */   
/*      */   public sy a(sy paramsy)
/*      */   {
/* 1396 */     paramsy = super.a(paramsy);
/*      */     
/* 1398 */     int i = 0;
/* 1399 */     int j = 0;
/*      */     
/* 1401 */     if ((paramsy instanceof wk)) {
/* 1402 */       i = ((wk)paramsy).a;
/* 1403 */       j = ((wk)paramsy).b & 0xFF | this.Z.nextInt(5) << 8;
/*      */     } else {
/* 1405 */       if (this.Z.nextInt(10) == 0) {
/* 1406 */         i = 1;
/*      */       } else {
/* 1408 */         int k = this.Z.nextInt(7);
/* 1409 */         int m = this.Z.nextInt(5);
/* 1410 */         i = 0;
/* 1411 */         j = k | m << 8;
/*      */       }
/* 1413 */       paramsy = new wk(i, j);
/*      */     }
/*      */     
/* 1416 */     s(i);
/* 1417 */     t(j);
/*      */     
/* 1419 */     if (this.Z.nextInt(5) == 0) {
/* 1420 */       c(41536);
/*      */     }
/*      */     
/* 1423 */     if ((i == 4) || (i == 3)) {
/* 1424 */       a(yj.a).a(15.0D);
/* 1425 */       a(yj.d).a(0.20000000298023224D);
/*      */     } else {
/* 1427 */       a(yj.a).a(cV());
/* 1428 */       if (i == 0) {
/* 1429 */         a(yj.d).a(cX());
/*      */       } else {
/* 1431 */         a(yj.d).a(0.17499999701976776D);
/*      */       }
/*      */     }
/* 1434 */     if ((i == 2) || (i == 1)) {
/* 1435 */       a(bv).a(0.5D);
/*      */     } else {
/* 1437 */       a(bv).a(cW());
/*      */     }
/* 1439 */     g(aY());
/*      */     
/* 1441 */     return paramsy;
/*      */   }
/*      */   
/*      */   public float p(float paramFloat) {
/* 1445 */     return this.bK + (this.bJ - this.bK) * paramFloat;
/*      */   }
/*      */   
/*      */   public float q(float paramFloat) {
/* 1449 */     return this.bM + (this.bL - this.bM) * paramFloat;
/*      */   }
/*      */   
/*      */   public float r(float paramFloat) {
/* 1453 */     return this.bO + (this.bN - this.bO) * paramFloat;
/*      */   }
/*      */   
/*      */   protected boolean bk()
/*      */   {
/* 1458 */     return true;
/*      */   }
/*      */   
/*      */   public void w(int paramInt) {
/* 1462 */     if (cu()) {
/* 1463 */       if (paramInt < 0) {
/* 1464 */         paramInt = 0;
/*      */       } else {
/* 1466 */         this.bI = true;
/* 1467 */         cU();
/*      */       }
/*      */       
/* 1470 */       if (paramInt >= 90) {
/* 1471 */         this.bt = 1.0F;
/*      */       } else {
/* 1473 */         this.bt = (0.4F + 0.4F * paramInt / 90.0F);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void q(boolean paramBoolean) {
/* 1479 */     String str = paramBoolean ? "heart" : "smoke";
/*      */     
/* 1481 */     for (int i = 0; i < 7; i++) {
/* 1482 */       double d1 = this.Z.nextGaussian() * 0.02D;
/* 1483 */       double d2 = this.Z.nextGaussian() * 0.02D;
/* 1484 */       double d3 = this.Z.nextGaussian() * 0.02D;
/* 1485 */       this.o.a(str, this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(byte paramByte)
/*      */   {
/* 1491 */     if (paramByte == 7) {
/* 1492 */       q(true);
/* 1493 */     } else if (paramByte == 6) {
/* 1494 */       q(false);
/*      */     } else {
/* 1496 */       super.a(paramByte);
/*      */     }
/*      */   }
/*      */   
/*      */   public void ac()
/*      */   {
/* 1502 */     super.ac();
/*      */     
/* 1504 */     if (this.bM > 0.0F) {
/* 1505 */       float f1 = qh.a(this.aM * 3.1415927F / 180.0F);
/* 1506 */       float f2 = qh.b(this.aM * 3.1415927F / 180.0F);
/* 1507 */       float f3 = 0.7F * this.bM;
/* 1508 */       float f4 = 0.15F * this.bM;
/*      */       
/* 1510 */       this.l.b(this.s + f3 * f1, this.t + ae() + this.l.ad() + f4, this.u - f3 * f2);
/* 1511 */       if ((this.l instanceof sv)) {
/* 1512 */         ((sv)this.l).aM = this.aM;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private float cV()
/*      */   {
/* 1519 */     return 15.0F + this.Z.nextInt(8) + this.Z.nextInt(9);
/*      */   }
/*      */   
/*      */   private double cW() {
/* 1523 */     return 0.4000000059604645D + this.Z.nextDouble() * 0.2D + this.Z.nextDouble() * 0.2D + this.Z.nextDouble() * 0.2D;
/*      */   }
/*      */   
/*      */   private double cX() {
/* 1527 */     return (0.44999998807907104D + this.Z.nextDouble() * 0.3D + this.Z.nextDouble() * 0.3D + this.Z.nextDouble() * 0.3D) * 0.25D;
/*      */   }
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
/*      */   public static boolean a(adb paramadb)
/*      */   {
/* 1543 */     return (paramadb == ade.bX) || (paramadb == ade.bY) || (paramadb == ade.bZ);
/*      */   }
/*      */   
/*      */ 
/*      */   public boolean h_()
/*      */   {
/* 1549 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */