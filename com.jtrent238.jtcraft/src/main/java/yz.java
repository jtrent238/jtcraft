/*      */ import com.google.common.base.Charsets;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class yz
/*      */   extends sv
/*      */   implements ac
/*      */ {
/*   92 */   public yx bm = new yx(this);
/*   93 */   private aav a = new aav();
/*      */   
/*      */   public zs bn;
/*      */   public zs bo;
/*   97 */   protected zr bp = new zr();
/*      */   
/*      */   protected int bq;
/*      */   
/*      */   public float br;
/*      */   public float bs;
/*      */   public int bt;
/*      */   public double bu;
/*      */   public double bv;
/*      */   public double bw;
/*      */   public double bx;
/*      */   public double by;
/*      */   public double bz;
/*      */   protected boolean bA;
/*      */   public r bB;
/*      */   private int b;
/*      */   public float bC;
/*      */   public float cc;
/*      */   public float bD;
/*      */   private r c;
/*      */   private boolean d;
/*      */   private r e;
/*  119 */   public yw bE = new yw();
/*      */   public int bF;
/*      */   public int bG;
/*      */   public float bH;
/*      */   private add f;
/*      */   private int g;
/*  125 */   protected float bI = 0.1F;
/*  126 */   protected float bJ = 0.02F;
/*      */   private int h;
/*      */   private final GameProfile i;
/*      */   public xe bK;
/*      */   
/*  131 */   public yz(ahb paramahb, GameProfile paramGameProfile) { super(paramahb);
/*  132 */     this.ar = a(paramGameProfile);
/*      */     
/*  134 */     this.i = paramGameProfile;
/*      */     
/*  136 */     this.bn = new aap(this.bm, !paramahb.E, this);
/*  137 */     this.bo = this.bn;
/*      */     
/*  139 */     this.L = 1.62F;
/*  140 */     r localr = paramahb.K();
/*  141 */     b(localr.a + 0.5D, localr.b + 1, localr.c + 0.5D, 0.0F, 0.0F);
/*      */     
/*  143 */     this.aZ = 180.0F;
/*  144 */     this.ab = 20;
/*      */   }
/*      */   
/*      */   protected void aD()
/*      */   {
/*  149 */     super.aD();
/*      */     
/*  151 */     bc().b(yj.e).a(1.0D);
/*      */   }
/*      */   
/*      */   protected void c()
/*      */   {
/*  156 */     super.c();
/*      */     
/*  158 */     this.af.a(16, Byte.valueOf((byte)0));
/*  159 */     this.af.a(17, Float.valueOf(0.0F));
/*  160 */     this.af.a(18, Integer.valueOf(0));
/*      */   }
/*      */   
/*      */   public add bw() {
/*  164 */     return this.f;
/*      */   }
/*      */   
/*      */   public int bx() {
/*  168 */     return this.g;
/*      */   }
/*      */   
/*      */   public boolean by() {
/*  172 */     return this.f != null;
/*      */   }
/*      */   
/*      */   public int bz() {
/*  176 */     if (by()) {
/*  177 */       return this.f.n() - this.g;
/*      */     }
/*  179 */     return 0;
/*      */   }
/*      */   
/*      */   public void bA() {
/*  183 */     if (this.f != null) {
/*  184 */       this.f.b(this.o, this, this.g);
/*      */     }
/*  186 */     bB();
/*      */   }
/*      */   
/*      */   public void bB() {
/*  190 */     this.f = null;
/*  191 */     this.g = 0;
/*  192 */     if (!this.o.E) {
/*  193 */       e(false);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean bC() {
/*  198 */     return (by()) && (this.f.b().d(this.f) == aei.d);
/*      */   }
/*      */   
/*      */   public void h()
/*      */   {
/*  203 */     if (this.f != null) {
/*  204 */       add localadd = this.bm.h();
/*  205 */       if (localadd == this.f) {
/*  206 */         if ((this.g <= 25) && (this.g % 4 == 0)) {
/*  207 */           c(localadd, 5);
/*      */         }
/*  209 */         if ((--this.g == 0) && 
/*  210 */           (!this.o.E)) {
/*  211 */           p();
/*      */         }
/*      */       }
/*      */       else {
/*  215 */         bB();
/*      */       }
/*      */     }
/*      */     
/*  219 */     if (this.bt > 0) this.bt -= 1;
/*  220 */     if (bm()) {
/*  221 */       this.b += 1;
/*  222 */       if (this.b > 100) {
/*  223 */         this.b = 100;
/*      */       }
/*      */       
/*  226 */       if (!this.o.E) {
/*  227 */         if (!j()) {
/*  228 */           a(true, true, false);
/*  229 */         } else if (this.o.w()) {
/*  230 */           a(false, true, true);
/*      */         }
/*      */       }
/*  233 */     } else if (this.b > 0) {
/*  234 */       this.b += 1;
/*  235 */       if (this.b >= 110) {
/*  236 */         this.b = 0;
/*      */       }
/*      */     }
/*      */     
/*  240 */     super.h();
/*      */     
/*  242 */     if ((!this.o.E) && 
/*  243 */       (this.bo != null) && (!this.bo.a(this))) {
/*  244 */       k();
/*  245 */       this.bo = this.bn;
/*      */     }
/*      */     
/*      */ 
/*  249 */     if ((al()) && (this.bE.a)) {
/*  250 */       F();
/*      */     }
/*      */     
/*  253 */     this.bu = this.bx;
/*  254 */     this.bv = this.by;
/*  255 */     this.bw = this.bz;
/*      */     
/*  257 */     double d1 = this.s - this.bx;
/*  258 */     double d2 = this.t - this.by;
/*  259 */     double d3 = this.u - this.bz;
/*      */     
/*  261 */     double d4 = 10.0D;
/*  262 */     if (d1 > d4) this.bu = (this.bx = this.s);
/*  263 */     if (d3 > d4) this.bw = (this.bz = this.u);
/*  264 */     if (d2 > d4) this.bv = (this.by = this.t);
/*  265 */     if (d1 < -d4) this.bu = (this.bx = this.s);
/*  266 */     if (d3 < -d4) this.bw = (this.bz = this.u);
/*  267 */     if (d2 < -d4) { this.bv = (this.by = this.t);
/*      */     }
/*  269 */     this.bx += d1 * 0.25D;
/*  270 */     this.bz += d3 * 0.25D;
/*  271 */     this.by += d2 * 0.25D;
/*      */     
/*      */ 
/*  274 */     if (this.m == null) {
/*  275 */       this.e = null;
/*      */     }
/*      */     
/*  278 */     if (!this.o.E) {
/*  279 */       this.bp.a(this);
/*  280 */       a(pp.g, 1);
/*      */     }
/*      */   }
/*      */   
/*      */   public int D()
/*      */   {
/*  286 */     return this.bE.a ? 0 : 80;
/*      */   }
/*      */   
/*      */   protected String H()
/*      */   {
/*  291 */     return "game.player.swim";
/*      */   }
/*      */   
/*      */   protected String O()
/*      */   {
/*  296 */     return "game.player.swim.splash";
/*      */   }
/*      */   
/*      */   public int ai()
/*      */   {
/*  301 */     return 10;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2)
/*      */   {
/*  308 */     this.o.a(this, paramString, paramFloat1, paramFloat2);
/*      */   }
/*      */   
/*      */   protected void c(add paramadd, int paramInt) {
/*  312 */     if (paramadd.o() == aei.c) {
/*  313 */       a("random.drink", 0.5F, this.o.s.nextFloat() * 0.1F + 0.9F);
/*      */     }
/*  315 */     if (paramadd.o() == aei.b) {
/*  316 */       for (int j = 0; j < paramInt; j++) {
/*  317 */         azw localazw1 = azw.a((this.Z.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
/*  318 */         localazw1.a(-this.z * 3.1415927F / 180.0F);
/*  319 */         localazw1.b(-this.y * 3.1415927F / 180.0F);
/*      */         
/*  321 */         azw localazw2 = azw.a((this.Z.nextFloat() - 0.5D) * 0.3D, -this.Z.nextFloat() * 0.6D - 0.3D, 0.6D);
/*  322 */         localazw2.a(-this.z * 3.1415927F / 180.0F);
/*  323 */         localazw2.b(-this.y * 3.1415927F / 180.0F);
/*  324 */         localazw2 = localazw2.c(this.s, this.t + g(), this.u);
/*  325 */         String str = "iconcrack_" + adb.b(paramadd.b());
/*  326 */         if (paramadd.h()) {
/*  327 */           str = str + "_" + paramadd.k();
/*      */         }
/*  329 */         this.o.a(str, localazw2.a, localazw2.b, localazw2.c, localazw1.a, localazw1.b + 0.05D, localazw1.c);
/*      */       }
/*  331 */       a("random.eat", 0.5F + 0.5F * this.Z.nextInt(2), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void p() {
/*  336 */     if (this.f != null) {
/*  337 */       c(this.f, 16);
/*      */       
/*  339 */       int j = this.f.b;
/*  340 */       add localadd = this.f.b(this.o, this);
/*  341 */       if ((localadd != this.f) || ((localadd != null) && (localadd.b != j))) {
/*  342 */         this.bm.a[this.bm.c] = localadd;
/*  343 */         if (localadd.b == 0) {
/*  344 */           this.bm.a[this.bm.c] = null;
/*      */         }
/*      */       }
/*  347 */       bB();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(byte paramByte)
/*      */   {
/*  353 */     if (paramByte == 9) {
/*  354 */       p();
/*      */     } else {
/*  356 */       super.a(paramByte);
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean bh()
/*      */   {
/*  362 */     return (aS() <= 0.0F) || (bm());
/*      */   }
/*      */   
/*      */   protected void k() {
/*  366 */     this.bo = this.bn;
/*      */   }
/*      */   
/*      */   public void a(sa paramsa)
/*      */   {
/*  371 */     if ((this.m != null) && (paramsa == null)) {
/*  372 */       if (!this.o.E) { m(this.m);
/*      */       }
/*  374 */       if (this.m != null) {
/*  375 */         this.m.l = null;
/*      */       }
/*  377 */       this.m = null;
/*      */       
/*  379 */       return;
/*      */     }
/*  381 */     super.a(paramsa);
/*      */   }
/*      */   
/*      */   public void ab()
/*      */   {
/*  386 */     if ((!this.o.E) && (an())) {
/*  387 */       a(null);
/*  388 */       b(false);
/*  389 */       return;
/*      */     }
/*      */     
/*  392 */     double d1 = this.s;double d2 = this.t;double d3 = this.u;
/*  393 */     float f1 = this.y;float f2 = this.z;
/*      */     
/*  395 */     super.ab();
/*  396 */     this.br = this.bs;
/*  397 */     this.bs = 0.0F;
/*      */     
/*  399 */     l(this.s - d1, this.t - d2, this.u - d3);
/*      */     
/*  401 */     if ((this.m instanceof wo)) {
/*  402 */       this.z = f2;
/*  403 */       this.y = f1;
/*  404 */       this.aM = ((wo)this.m).aM;
/*      */     }
/*      */   }
/*      */   
/*      */   public void A()
/*      */   {
/*  410 */     this.L = 1.62F;
/*  411 */     a(0.6F, 1.8F);
/*  412 */     super.A();
/*  413 */     g(aY());
/*  414 */     this.aA = 0;
/*      */   }
/*      */   
/*      */   protected void bq()
/*      */   {
/*  419 */     super.bq();
/*  420 */     bb();
/*      */   }
/*      */   
/*      */   public void e()
/*      */   {
/*  425 */     if (this.bq > 0) { this.bq -= 1;
/*      */     }
/*  427 */     if ((this.o.r == rd.a) && (aS() < aY()) && (this.o.O().b("naturalRegeneration")) && 
/*  428 */       (this.aa % 20 * 12 == 0)) { f(1.0F);
/*      */     }
/*  430 */     this.bm.k();
/*  431 */     this.br = this.bs;
/*      */     
/*  433 */     super.e();
/*      */     
/*  435 */     ti localti = a(yj.d);
/*  436 */     if (!this.o.E) localti.a(this.bE.b());
/*  437 */     this.aQ = this.bJ;
/*  438 */     if (ao()) {
/*  439 */       this.aQ = ((float)(this.aQ + this.bJ * 0.3D));
/*      */     }
/*      */     
/*  442 */     i((float)localti.e());
/*      */     
/*  444 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/*  445 */     float f2 = (float)Math.atan(-this.w * 0.20000000298023224D) * 15.0F;
/*  446 */     if (f1 > 0.1F) f1 = 0.1F;
/*  447 */     if ((!this.D) || (aS() <= 0.0F)) f1 = 0.0F;
/*  448 */     if ((this.D) || (aS() <= 0.0F)) f2 = 0.0F;
/*  449 */     this.bs += (f1 - this.bs) * 0.4F;
/*  450 */     this.aJ += (f2 - this.aJ) * 0.8F;
/*      */     
/*  452 */     if (aS() > 0.0F) {
/*  453 */       azt localazt = null;
/*  454 */       if ((this.m != null) && (!this.m.K))
/*      */       {
/*      */ 
/*  457 */         localazt = this.C.a(this.m.C).b(1.0D, 0.0D, 1.0D);
/*      */       } else {
/*  459 */         localazt = this.C.b(1.0D, 0.5D, 1.0D);
/*      */       }
/*      */       
/*  462 */       List localList = this.o.b(this, localazt);
/*  463 */       if (localList != null) {
/*  464 */         for (int j = 0; j < localList.size(); j++) {
/*  465 */           sa localsa = (sa)localList.get(j);
/*  466 */           if (!localsa.K) {
/*  467 */             d(localsa);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void d(sa paramsa) {
/*  475 */     paramsa.b_(this);
/*      */   }
/*      */   
/*      */   public int bD() {
/*  479 */     return this.af.c(18);
/*      */   }
/*      */   
/*      */   public void c(int paramInt) {
/*  483 */     this.af.b(18, Integer.valueOf(paramInt));
/*      */   }
/*      */   
/*      */   public void s(int paramInt) {
/*  487 */     int j = bD();
/*  488 */     this.af.b(18, Integer.valueOf(j + paramInt));
/*      */   }
/*      */   
/*      */   public void a(ro paramro)
/*      */   {
/*  493 */     super.a(paramro);
/*  494 */     a(0.2F, 0.2F);
/*  495 */     b(this.s, this.t, this.u);
/*  496 */     this.w = 0.10000000149011612D;
/*      */     
/*  498 */     if (b_().equals("Notch")) {
/*  499 */       a(new add(ade.e, 1), true, false);
/*      */     }
/*  501 */     if (!this.o.O().b("keepInventory")) {
/*  502 */       this.bm.m();
/*      */     }
/*      */     
/*  505 */     if (paramro != null) {
/*  506 */       this.v = (-qh.b((this.az + this.y) * 3.1415927F / 180.0F) * 0.1F);
/*  507 */       this.x = (-qh.a((this.az + this.y) * 3.1415927F / 180.0F) * 0.1F);
/*      */     } else {
/*  509 */       this.v = (this.x = 0.0D);
/*      */     }
/*  511 */     this.L = 0.1F;
/*      */     
/*  513 */     a(pp.v, 1);
/*      */   }
/*      */   
/*      */   protected String aT()
/*      */   {
/*  518 */     return "game.player.hurt";
/*      */   }
/*      */   
/*      */   protected String aU()
/*      */   {
/*  523 */     return "game.player.die";
/*      */   }
/*      */   
/*      */   public void b(sa paramsa, int paramInt)
/*      */   {
/*  528 */     s(paramInt);
/*  529 */     Collection localCollection = bU().a(bah.e);
/*      */     
/*  531 */     if ((paramsa instanceof yz)) {
/*  532 */       a(pp.y, 1);
/*  533 */       localCollection.addAll(bU().a(bah.d));
/*      */     } else {
/*  535 */       a(pp.w, 1);
/*      */     }
/*      */     
/*  538 */     for (azx localazx : localCollection) {
/*  539 */       azz localazz = bU().a(b_(), localazx);
/*  540 */       localazz.a();
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
/*      */   public xk a(boolean paramBoolean)
/*      */   {
/*  554 */     return a(this.bm.a(this.bm.c, (paramBoolean) && (this.bm.h() != null) ? this.bm.h().b : 1), false, true);
/*      */   }
/*      */   
/*      */   public xk a(add paramadd, boolean paramBoolean) {
/*  558 */     return a(paramadd, false, false);
/*      */   }
/*      */   
/*      */   public xk a(add paramadd, boolean paramBoolean1, boolean paramBoolean2) {
/*  562 */     if (paramadd == null) return null;
/*  563 */     if (paramadd.b == 0) { return null;
/*      */     }
/*  565 */     xk localxk = new xk(this.o, this.s, this.t - 0.30000001192092896D + g(), this.u, paramadd);
/*  566 */     localxk.b = 40;
/*      */     
/*  568 */     if (paramBoolean2) {
/*  569 */       localxk.b(b_());
/*      */     }
/*      */     
/*  572 */     float f1 = 0.1F;
/*  573 */     float f2; if (paramBoolean1) {
/*  574 */       f2 = this.Z.nextFloat() * 0.5F;
/*  575 */       float f3 = this.Z.nextFloat() * 3.1415927F * 2.0F;
/*  576 */       localxk.v = (-qh.a(f3) * f2);
/*  577 */       localxk.x = (qh.b(f3) * f2);
/*  578 */       localxk.w = 0.20000000298023224D;
/*      */     }
/*      */     else {
/*  581 */       f1 = 0.3F;
/*  582 */       localxk.v = (-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/*  583 */       localxk.x = (qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/*  584 */       localxk.w = (-qh.a(this.z / 180.0F * 3.1415927F) * f1 + 0.1F);
/*  585 */       f1 = 0.02F;
/*      */       
/*  587 */       f2 = this.Z.nextFloat() * 3.1415927F * 2.0F;
/*  588 */       f1 *= this.Z.nextFloat();
/*  589 */       localxk.v += Math.cos(f2) * f1;
/*  590 */       localxk.w += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.1F;
/*  591 */       localxk.x += Math.sin(f2) * f1;
/*      */     }
/*      */     
/*  594 */     a(localxk);
/*  595 */     a(pp.s, 1);
/*      */     
/*  597 */     return localxk;
/*      */   }
/*      */   
/*      */   protected void a(xk paramxk) {
/*  601 */     this.o.d(paramxk);
/*      */   }
/*      */   
/*      */   public float a(aji paramaji, boolean paramBoolean) {
/*  605 */     float f1 = this.bm.a(paramaji);
/*  606 */     if (f1 > 1.0F) {
/*  607 */       int j = afv.c(this);
/*  608 */       add localadd = this.bm.h();
/*      */       
/*  610 */       if ((j > 0) && (localadd != null)) {
/*  611 */         float f2 = j * j + 1;
/*      */         
/*  613 */         if ((localadd.b(paramaji)) || (f1 > 1.0F)) {
/*  614 */           f1 += f2;
/*      */         } else {
/*  616 */           f1 += f2 * 0.08F;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  621 */     if (a(rv.e)) {
/*  622 */       f1 *= (1.0F + (b(rv.e).c() + 1) * 0.2F);
/*      */     }
/*  624 */     if (a(rv.f)) {
/*  625 */       f1 *= (1.0F - (b(rv.f).c() + 1) * 0.2F);
/*      */     }
/*      */     
/*  628 */     if ((a(awt.h)) && (!afv.j(this))) f1 /= 5.0F;
/*  629 */     if (!this.D) { f1 /= 5.0F;
/*      */     }
/*  631 */     return f1;
/*      */   }
/*      */   
/*      */   public boolean a(aji paramaji) {
/*  635 */     return this.bm.b(paramaji);
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(dh paramdh)
/*      */   {
/*  641 */     super.a(paramdh);
/*  642 */     this.ar = a(this.i);
/*  643 */     dq localdq1 = paramdh.c("Inventory", 10);
/*  644 */     this.bm.b(localdq1);
/*  645 */     this.bm.c = paramdh.f("SelectedItemSlot");
/*  646 */     this.bA = paramdh.n("Sleeping");
/*  647 */     this.b = paramdh.e("SleepTimer");
/*      */     
/*  649 */     this.bH = paramdh.h("XpP");
/*  650 */     this.bF = paramdh.f("XpLevel");
/*  651 */     this.bG = paramdh.f("XpTotal");
/*  652 */     c(paramdh.f("Score"));
/*      */     
/*  654 */     if (this.bA) {
/*  655 */       this.bB = new r(qh.c(this.s), qh.c(this.t), qh.c(this.u));
/*  656 */       a(true, true, false);
/*      */     }
/*      */     
/*  659 */     if ((paramdh.b("SpawnX", 99)) && (paramdh.b("SpawnY", 99)) && (paramdh.b("SpawnZ", 99))) {
/*  660 */       this.c = new r(paramdh.f("SpawnX"), paramdh.f("SpawnY"), paramdh.f("SpawnZ"));
/*  661 */       this.d = paramdh.n("SpawnForced");
/*      */     }
/*      */     
/*  664 */     this.bp.a(paramdh);
/*  665 */     this.bE.b(paramdh);
/*      */     
/*  667 */     if (paramdh.b("EnderItems", 9)) {
/*  668 */       dq localdq2 = paramdh.c("EnderItems", 10);
/*  669 */       this.a.a(localdq2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(dh paramdh)
/*      */   {
/*  675 */     super.b(paramdh);
/*  676 */     paramdh.a("Inventory", this.bm.a(new dq()));
/*  677 */     paramdh.a("SelectedItemSlot", this.bm.c);
/*  678 */     paramdh.a("Sleeping", this.bA);
/*  679 */     paramdh.a("SleepTimer", (short)this.b);
/*  680 */     paramdh.a("XpP", this.bH);
/*  681 */     paramdh.a("XpLevel", this.bF);
/*  682 */     paramdh.a("XpTotal", this.bG);
/*  683 */     paramdh.a("Score", bD());
/*      */     
/*  685 */     if (this.c != null) {
/*  686 */       paramdh.a("SpawnX", this.c.a);
/*  687 */       paramdh.a("SpawnY", this.c.b);
/*  688 */       paramdh.a("SpawnZ", this.c.c);
/*  689 */       paramdh.a("SpawnForced", this.d);
/*      */     }
/*      */     
/*  692 */     this.bp.b(paramdh);
/*  693 */     this.bE.a(paramdh);
/*  694 */     paramdh.a("EnderItems", this.a.h());
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(rb paramrb) {}
/*      */   
/*      */ 
/*      */   public void a(api paramapi) {}
/*      */   
/*      */ 
/*      */   public void a(xr paramxr) {}
/*      */   
/*      */ 
/*      */   public void a(wi paramwi, rb paramrb) {}
/*      */   
/*      */ 
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, String paramString) {}
/*      */   
/*      */ 
/*      */   public void c(int paramInt1, int paramInt2, int paramInt3) {}
/*      */   
/*      */ 
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3) {}
/*      */   
/*      */   public float g()
/*      */   {
/*  720 */     return 0.12F;
/*      */   }
/*      */   
/*      */   protected void e_() {
/*  724 */     this.L = 1.62F;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public boolean a(ro paramro, float paramFloat)
/*      */   {
/*  731 */     if (aw()) return false;
/*  732 */     if ((this.bE.a) && (!paramro.g())) { return false;
/*      */     }
/*  734 */     this.aU = 0;
/*  735 */     if (aS() <= 0.0F) { return false;
/*      */     }
/*  737 */     if ((bm()) && (!this.o.E)) {
/*  738 */       a(true, true, false);
/*      */     }
/*      */     
/*  741 */     if (paramro.r()) {
/*  742 */       if (this.o.r == rd.a) paramFloat = 0.0F;
/*  743 */       if (this.o.r == rd.b) paramFloat = paramFloat / 2.0F + 1.0F;
/*  744 */       if (this.o.r == rd.d) { paramFloat = paramFloat * 3.0F / 2.0F;
/*      */       }
/*      */     }
/*  747 */     if (paramFloat == 0.0F) { return false;
/*      */     }
/*  749 */     sa localsa = paramro.j();
/*  750 */     if (((localsa instanceof zc)) && 
/*  751 */       (((zc)localsa).c != null)) {
/*  752 */       localsa = ((zc)localsa).c;
/*      */     }
/*      */     
/*      */ 
/*  756 */     a(pp.u, Math.round(paramFloat * 10.0F));
/*      */     
/*  758 */     return super.a(paramro, paramFloat);
/*      */   }
/*      */   
/*      */   public boolean a(yz paramyz) {
/*  762 */     bae localbae1 = bt();
/*  763 */     bae localbae2 = paramyz.bt();
/*      */     
/*  765 */     if (localbae1 == null) {
/*  766 */       return true;
/*      */     }
/*  768 */     if (!localbae1.a(localbae2)) {
/*  769 */       return true;
/*      */     }
/*  771 */     return localbae1.g();
/*      */   }
/*      */   
/*      */   protected void h(float paramFloat)
/*      */   {
/*  776 */     this.bm.a(paramFloat);
/*      */   }
/*      */   
/*      */   public int aV()
/*      */   {
/*  781 */     return this.bm.l();
/*      */   }
/*      */   
/*      */   public float bE() {
/*  785 */     int j = 0;
/*  786 */     for (add localadd : this.bm.b) {
/*  787 */       if (localadd != null) {
/*  788 */         j++;
/*      */       }
/*      */     }
/*  791 */     return j / this.bm.b.length;
/*      */   }
/*      */   
/*      */   protected void d(ro paramro, float paramFloat)
/*      */   {
/*  796 */     if (aw()) return;
/*  797 */     if ((!paramro.e()) && (bC()) && (paramFloat > 0.0F)) {
/*  798 */       paramFloat = (1.0F + paramFloat) * 0.5F;
/*      */     }
/*  800 */     paramFloat = b(paramro, paramFloat);
/*  801 */     paramFloat = c(paramro, paramFloat);
/*      */     
/*  803 */     float f1 = paramFloat;
/*  804 */     paramFloat = Math.max(paramFloat - bs(), 0.0F);
/*  805 */     m(bs() - (f1 - paramFloat));
/*  806 */     if (paramFloat == 0.0F) { return;
/*      */     }
/*  808 */     a(paramro.f());
/*  809 */     float f2 = aS();
/*  810 */     g(aS() - paramFloat);
/*  811 */     aW().a(paramro, f2, paramFloat);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(apg paramapg) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(apb paramapb) {}
/*      */   
/*      */ 
/*      */ 
/*      */   public void a(aor paramaor) {}
/*      */   
/*      */ 
/*      */   public void a(agp paramagp) {}
/*      */   
/*      */ 
/*      */   public void a(aov paramaov) {}
/*      */   
/*      */ 
/*      */   public void a(aoq paramaoq) {}
/*      */   
/*      */ 
/*      */   public void a(agm paramagm, String paramString) {}
/*      */   
/*      */ 
/*      */   public void b(add paramadd) {}
/*      */   
/*      */ 
/*      */   public boolean q(sa paramsa)
/*      */   {
/*  844 */     Object localObject1 = bF();
/*  845 */     Object localObject2 = localObject1 != null ? ((add)localObject1).m() : null;
/*  846 */     if (paramsa.c(this))
/*      */     {
/*      */ 
/*      */ 
/*  850 */       if ((localObject1 != null) && (localObject1 == bF())) {
/*  851 */         if ((((add)localObject1).b <= 0) && (!this.bE.d)) {
/*  852 */           bG();
/*  853 */         } else if ((((add)localObject1).b < ((add)localObject2).b) && (this.bE.d)) {
/*  854 */           ((add)localObject1).b = ((add)localObject2).b;
/*      */         }
/*      */       }
/*  857 */       return true;
/*      */     }
/*      */     
/*  860 */     if ((localObject1 != null) && ((paramsa instanceof sv)))
/*      */     {
/*      */ 
/*  863 */       if (this.bE.d) localObject1 = localObject2;
/*  864 */       if (((add)localObject1).a(this, (sv)paramsa))
/*      */       {
/*      */ 
/*  867 */         if ((((add)localObject1).b <= 0) && (!this.bE.d)) {
/*  868 */           bG();
/*      */         }
/*  870 */         return true;
/*      */       }
/*      */     }
/*  873 */     return false;
/*      */   }
/*      */   
/*      */   public add bF() {
/*  877 */     return this.bm.h();
/*      */   }
/*      */   
/*      */   public void bG() {
/*  881 */     this.bm.a(this.bm.c, null);
/*      */   }
/*      */   
/*      */   public double ad()
/*      */   {
/*  886 */     return this.L - 0.5F;
/*      */   }
/*      */   
/*      */   public void r(sa paramsa) {
/*  890 */     if (!paramsa.av()) {
/*  891 */       return;
/*      */     }
/*  893 */     if (paramsa.j(this)) {
/*  894 */       return;
/*      */     }
/*      */     
/*  897 */     float f1 = (float)a(yj.e).e();
/*      */     
/*  899 */     int j = 0;
/*  900 */     float f2 = 0.0F;
/*  901 */     if ((paramsa instanceof sv)) {
/*  902 */       f2 = afv.a(this, (sv)paramsa);
/*  903 */       j += afv.b(this, (sv)paramsa);
/*      */     }
/*  905 */     if (ao()) {
/*  906 */       j++;
/*      */     }
/*      */     
/*  909 */     if ((f1 > 0.0F) || (f2 > 0.0F))
/*      */     {
/*  911 */       int k = (this.R > 0.0F) && (!this.D) && (!h_()) && (!M()) && (!a(rv.q)) && (this.m == null) && ((paramsa instanceof sv)) ? 1 : 0;
/*  912 */       if ((k != 0) && (f1 > 0.0F)) {
/*  913 */         f1 *= 1.5F;
/*      */       }
/*  915 */       f1 += f2;
/*      */       
/*      */ 
/*      */ 
/*  919 */       int m = 0;
/*  920 */       int n = afv.a(this);
/*  921 */       if (((paramsa instanceof sv)) && (n > 0) && (!paramsa.al())) {
/*  922 */         m = 1;
/*  923 */         paramsa.e(1);
/*      */       }
/*      */       
/*  926 */       boolean bool = paramsa.a(ro.a(this), f1);
/*  927 */       if (bool) {
/*  928 */         if (j > 0) {
/*  929 */           paramsa.g(-qh.a(this.y * 3.1415927F / 180.0F) * j * 0.5F, 0.1D, qh.b(this.y * 3.1415927F / 180.0F) * j * 0.5F);
/*  930 */           this.v *= 0.6D;
/*  931 */           this.x *= 0.6D;
/*  932 */           c(false);
/*      */         }
/*      */         
/*  935 */         if (k != 0) {
/*  936 */           b(paramsa);
/*      */         }
/*  938 */         if (f2 > 0.0F) {
/*  939 */           c(paramsa);
/*      */         }
/*      */         
/*  942 */         if (f1 >= 18.0F) {
/*  943 */           a(pc.F);
/*      */         }
/*  945 */         l(paramsa);
/*      */         
/*  947 */         if ((paramsa instanceof sv)) afv.a((sv)paramsa, this);
/*  948 */         afv.b(this, paramsa);
/*      */         
/*  950 */         add localadd = bF();
/*  951 */         Object localObject = paramsa;
/*  952 */         if ((paramsa instanceof wy)) {
/*  953 */           wx localwx = ((wy)paramsa).a;
/*  954 */           if ((localwx != null) && ((localwx instanceof sv))) {
/*  955 */             localObject = (sv)localwx;
/*      */           }
/*      */         }
/*  958 */         if ((localadd != null) && ((localObject instanceof sv))) {
/*  959 */           localadd.a((sv)localObject, this);
/*  960 */           if (localadd.b <= 0) {
/*  961 */             bG();
/*      */           }
/*      */         }
/*  964 */         if ((paramsa instanceof sv)) {
/*  965 */           a(pp.t, Math.round(f1 * 10.0F));
/*      */           
/*  967 */           if (n > 0) {
/*  968 */             paramsa.e(n * 4);
/*      */           }
/*      */         }
/*      */         
/*  972 */         a(0.3F);
/*      */ 
/*      */ 
/*      */ 
/*      */       }
/*  977 */       else if (m != 0) {
/*  978 */         paramsa.F();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void b(sa paramsa) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void c(sa paramsa) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void bH() {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void B()
/*      */   {
/* 1010 */     super.B();
/* 1011 */     this.bn.b(this);
/* 1012 */     if (this.bo != null) {
/* 1013 */       this.bo.b(this);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean aa()
/*      */   {
/* 1019 */     return (!this.bA) && (super.aa());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public GameProfile bJ()
/*      */   {
/* 1027 */     return this.i;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public za a(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1035 */     if (!this.o.E) {
/* 1036 */       if ((bm()) || (!Z())) {
/* 1037 */         return za.e;
/*      */       }
/*      */       
/* 1040 */       if (!this.o.t.d())
/*      */       {
/* 1042 */         return za.b;
/*      */       }
/* 1044 */       if (this.o.w())
/*      */       {
/* 1046 */         return za.c;
/*      */       }
/* 1048 */       if ((Math.abs(this.s - paramInt1) > 3.0D) || (Math.abs(this.t - paramInt2) > 2.0D) || (Math.abs(this.u - paramInt3) > 3.0D))
/*      */       {
/* 1050 */         return za.d;
/*      */       }
/*      */       
/* 1053 */       double d1 = 8.0D;
/* 1054 */       double d2 = 5.0D;
/* 1055 */       List localList = this.o.a(yg.class, azt.a(paramInt1 - d1, paramInt2 - d2, paramInt3 - d1, paramInt1 + d1, paramInt2 + d2, paramInt3 + d1));
/* 1056 */       if (!localList.isEmpty()) {
/* 1057 */         return za.f;
/*      */       }
/*      */     }
/*      */     
/* 1061 */     if (am()) {
/* 1062 */       a(null);
/*      */     }
/*      */     
/* 1065 */     a(0.2F, 0.2F);
/* 1066 */     this.L = 0.2F;
/* 1067 */     if (this.o.d(paramInt1, paramInt2, paramInt3))
/*      */     {
/* 1069 */       int j = this.o.e(paramInt1, paramInt2, paramInt3);
/* 1070 */       int k = ajh.l(j);
/* 1071 */       float f1 = 0.5F;float f2 = 0.5F;
/*      */       
/* 1073 */       switch (k) {
/*      */       case 0: 
/* 1075 */         f2 = 0.9F;
/* 1076 */         break;
/*      */       case 2: 
/* 1078 */         f2 = 0.1F;
/* 1079 */         break;
/*      */       case 1: 
/* 1081 */         f1 = 0.1F;
/* 1082 */         break;
/*      */       case 3: 
/* 1084 */         f1 = 0.9F;
/*      */       }
/*      */       
/* 1087 */       w(k);
/* 1088 */       b(paramInt1 + f1, paramInt2 + 0.9375F, paramInt3 + f2);
/*      */     } else {
/* 1090 */       b(paramInt1 + 0.5F, paramInt2 + 0.9375F, paramInt3 + 0.5F);
/*      */     }
/* 1092 */     this.bA = true;
/* 1093 */     this.b = 0;
/* 1094 */     this.bB = new r(paramInt1, paramInt2, paramInt3);
/* 1095 */     this.v = (this.x = this.w = 0.0D);
/*      */     
/* 1097 */     if (!this.o.E) {
/* 1098 */       this.o.c();
/*      */     }
/*      */     
/* 1101 */     return za.a;
/*      */   }
/*      */   
/*      */   private void w(int paramInt)
/*      */   {
/* 1106 */     this.bC = 0.0F;
/* 1107 */     this.bD = 0.0F;
/*      */     
/* 1109 */     switch (paramInt) {
/*      */     case 0: 
/* 1111 */       this.bD = -1.8F;
/* 1112 */       break;
/*      */     case 2: 
/* 1114 */       this.bD = 1.8F;
/* 1115 */       break;
/*      */     case 1: 
/* 1117 */       this.bC = 1.8F;
/* 1118 */       break;
/*      */     case 3: 
/* 1120 */       this.bC = -1.8F;
/*      */     }
/*      */     
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
/*      */   public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*      */   {
/* 1138 */     a(0.6F, 1.8F);
/* 1139 */     e_();
/*      */     
/* 1141 */     r localr1 = this.bB;
/* 1142 */     r localr2 = this.bB;
/* 1143 */     if ((localr1 != null) && (this.o.a(localr1.a, localr1.b, localr1.c) == ajn.C)) {
/* 1144 */       ajh.a(this.o, localr1.a, localr1.b, localr1.c, false);
/*      */       
/* 1146 */       localr2 = ajh.a(this.o, localr1.a, localr1.b, localr1.c, 0);
/* 1147 */       if (localr2 == null) {
/* 1148 */         localr2 = new r(localr1.a, localr1.b + 1, localr1.c);
/*      */       }
/* 1150 */       b(localr2.a + 0.5F, localr2.b + this.L + 0.1F, localr2.c + 0.5F);
/*      */     }
/*      */     
/* 1153 */     this.bA = false;
/* 1154 */     if ((!this.o.E) && (paramBoolean2)) {
/* 1155 */       this.o.c();
/*      */     }
/* 1157 */     if (paramBoolean1) {
/* 1158 */       this.b = 0;
/*      */     } else {
/* 1160 */       this.b = 100;
/*      */     }
/* 1162 */     if (paramBoolean3) {
/* 1163 */       a(this.bB, false);
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean j() {
/* 1168 */     return this.o.a(this.bB.a, this.bB.b, this.bB.c) == ajn.C;
/*      */   }
/*      */   
/*      */   public static r a(ahb paramahb, r paramr, boolean paramBoolean)
/*      */   {
/* 1173 */     apu localapu = paramahb.L();
/* 1174 */     localapu.c(paramr.a - 3 >> 4, paramr.c - 3 >> 4);
/* 1175 */     localapu.c(paramr.a + 3 >> 4, paramr.c - 3 >> 4);
/* 1176 */     localapu.c(paramr.a - 3 >> 4, paramr.c + 3 >> 4);
/* 1177 */     localapu.c(paramr.a + 3 >> 4, paramr.c + 3 >> 4);
/*      */     
/*      */ 
/* 1180 */     if (paramahb.a(paramr.a, paramr.b, paramr.c) != ajn.C) {
/* 1181 */       localObject = paramahb.a(paramr.a, paramr.b, paramr.c).o();
/* 1182 */       awt localawt = paramahb.a(paramr.a, paramr.b + 1, paramr.c).o();
/* 1183 */       int j = (!((awt)localObject).a()) && (!((awt)localObject).d()) ? 1 : 0;
/* 1184 */       int k = (!localawt.a()) && (!localawt.d()) ? 1 : 0;
/*      */       
/* 1186 */       if ((paramBoolean) && (j != 0) && (k != 0)) {
/* 1187 */         return paramr;
/*      */       }
/*      */       
/* 1190 */       return null;
/*      */     }
/*      */     
/*      */ 
/* 1194 */     Object localObject = ajh.a(paramahb, paramr.a, paramr.b, paramr.c, 0);
/* 1195 */     return (r)localObject;
/*      */   }
/*      */   
/*      */   public float bK() {
/* 1199 */     if (this.bB != null) {
/* 1200 */       int j = this.o.e(this.bB.a, this.bB.b, this.bB.c);
/* 1201 */       int k = ajh.l(j);
/*      */       
/* 1203 */       switch (k) {
/*      */       case 0: 
/* 1205 */         return 90.0F;
/*      */       case 1: 
/* 1207 */         return 0.0F;
/*      */       case 2: 
/* 1209 */         return 270.0F;
/*      */       case 3: 
/* 1211 */         return 180.0F;
/*      */       }
/*      */     }
/* 1214 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public boolean bm()
/*      */   {
/* 1219 */     return this.bA;
/*      */   }
/*      */   
/*      */   public boolean bL() {
/* 1223 */     return (this.bA) && (this.b >= 100);
/*      */   }
/*      */   
/*      */   public int bM() {
/* 1227 */     return this.b;
/*      */   }
/*      */   
/*      */   protected boolean u(int paramInt) {
/* 1231 */     return (this.af.a(16) & 1 << paramInt) != 0;
/*      */   }
/*      */   
/*      */   protected void b(int paramInt, boolean paramBoolean) {
/* 1235 */     int j = this.af.a(16);
/* 1236 */     if (paramBoolean) {
/* 1237 */       this.af.b(16, Byte.valueOf((byte)(j | 1 << paramInt)));
/*      */     } else {
/* 1239 */       this.af.b(16, Byte.valueOf((byte)(j & (1 << paramInt ^ 0xFFFFFFFF))));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void b(fj paramfj) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public r bN()
/*      */   {
/* 1254 */     return this.c;
/*      */   }
/*      */   
/*      */   public boolean bO() {
/* 1258 */     return this.d;
/*      */   }
/*      */   
/*      */   public void a(r paramr, boolean paramBoolean) {
/* 1262 */     if (paramr != null) {
/* 1263 */       this.c = new r(paramr);
/* 1264 */       this.d = paramBoolean;
/*      */     } else {
/* 1266 */       this.c = null;
/* 1267 */       this.d = false;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ph paramph) {
/* 1272 */     a(paramph, 1);
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(ph paramph, int paramInt) {}
/*      */   
/*      */   public void bj()
/*      */   {
/* 1280 */     super.bj();
/*      */     
/* 1282 */     a(pp.r, 1);
/* 1283 */     if (ao()) {
/* 1284 */       a(0.8F);
/*      */     } else {
/* 1286 */       a(0.2F);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(float paramFloat1, float paramFloat2)
/*      */   {
/* 1292 */     double d1 = this.s;double d2 = this.t;double d3 = this.u;
/*      */     
/* 1294 */     if ((this.bE.b) && (this.m == null)) {
/* 1295 */       double d4 = this.w;
/* 1296 */       float f1 = this.aQ;
/* 1297 */       this.aQ = this.bE.a();
/* 1298 */       super.e(paramFloat1, paramFloat2);
/* 1299 */       this.w = (d4 * 0.6D);
/* 1300 */       this.aQ = f1;
/*      */     } else {
/* 1302 */       super.e(paramFloat1, paramFloat2);
/*      */     }
/*      */     
/* 1305 */     k(this.s - d1, this.t - d2, this.u - d3);
/*      */   }
/*      */   
/*      */   public float bl()
/*      */   {
/* 1310 */     return (float)a(yj.d).e();
/*      */   }
/*      */   
/*      */   public void k(double paramDouble1, double paramDouble2, double paramDouble3)
/*      */   {
/* 1315 */     if (this.m != null)
/*      */       return;
/*      */     int j;
/* 1318 */     if (a(awt.h)) {
/* 1319 */       j = Math.round(qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
/* 1320 */       if (j > 0) {
/* 1321 */         a(pp.m, j);
/* 1322 */         a(0.015F * j * 0.01F);
/*      */       }
/* 1324 */     } else if (M()) {
/* 1325 */       j = Math.round(qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1326 */       if (j > 0) {
/* 1327 */         a(pp.i, j);
/* 1328 */         a(0.015F * j * 0.01F);
/*      */       }
/* 1330 */     } else if (h_()) {
/* 1331 */       if (paramDouble2 > 0.0D) {
/* 1332 */         a(pp.k, (int)Math.round(paramDouble2 * 100.0D));
/*      */       }
/* 1334 */     } else if (this.D) {
/* 1335 */       j = Math.round(qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1336 */       if (j > 0) {
/* 1337 */         a(pp.h, j);
/* 1338 */         if (ao()) {
/* 1339 */           a(0.099999994F * j * 0.01F);
/*      */         } else {
/* 1341 */           a(0.01F * j * 0.01F);
/*      */         }
/*      */       }
/*      */     } else {
/* 1345 */       j = Math.round(qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) * 100.0F);
/* 1346 */       if (j > 25) {
/* 1347 */         a(pp.l, j);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void l(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 1353 */     if (this.m != null) {
/* 1354 */       int j = Math.round(qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3) * 100.0F);
/* 1355 */       if (j > 0) {
/* 1356 */         if ((this.m instanceof xl)) {
/* 1357 */           a(pp.n, j);
/*      */           
/* 1359 */           if (this.e == null) {
/* 1360 */             this.e = new r(qh.c(this.s), qh.c(this.t), qh.c(this.u));
/* 1361 */           } else if (this.e.e(qh.c(this.s), qh.c(this.t), qh.c(this.u)) >= 1000000.0D) {
/* 1362 */             a(pc.q, 1);
/*      */           }
/*      */         }
/* 1365 */         else if ((this.m instanceof xi)) {
/* 1366 */           a(pp.o, j);
/* 1367 */         } else if ((this.m instanceof wo)) {
/* 1368 */           a(pp.p, j);
/* 1369 */         } else if ((this.m instanceof wi)) {
/* 1370 */           a(pp.q, j);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void b(float paramFloat)
/*      */   {
/* 1378 */     if (this.bE.c) { return;
/*      */     }
/* 1380 */     if (paramFloat >= 2.0F) {
/* 1381 */       a(pp.j, (int)Math.round(paramFloat * 100.0D));
/*      */     }
/* 1383 */     super.b(paramFloat);
/*      */   }
/*      */   
/*      */   protected String o(int paramInt)
/*      */   {
/* 1388 */     if (paramInt > 4) {
/* 1389 */       return "game.player.hurt.fall.big";
/*      */     }
/* 1391 */     return "game.player.hurt.fall.small";
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(sv paramsv)
/*      */   {
/* 1397 */     if ((paramsv instanceof yb)) {
/* 1398 */       a(pc.s);
/*      */     }
/*      */     
/* 1401 */     int j = sg.a(paramsv);
/* 1402 */     sh localsh = (sh)sg.a.get(Integer.valueOf(j));
/* 1403 */     if (localsh != null) {
/* 1404 */       a(localsh.d, 1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void as()
/*      */   {
/* 1410 */     if (!this.bE.b) super.as();
/*      */   }
/*      */   
/*      */   public rf b(add paramadd, int paramInt)
/*      */   {
/* 1415 */     rf localrf = super.b(paramadd, paramInt);
/* 1416 */     if ((paramadd.b() == ade.aM) && (this.bK != null)) {
/* 1417 */       localrf = ade.aM.i();
/* 1418 */     } else { if (paramadd.b().b())
/* 1419 */         return paramadd.b().a(paramadd.k(), paramInt);
/* 1420 */       if ((this.f != null) && (paramadd.b() == ade.f)) {
/* 1421 */         int j = paramadd.n() - this.g;
/* 1422 */         if (j >= 18) {
/* 1423 */           return ade.f.c(2);
/*      */         }
/* 1425 */         if (j > 13) {
/* 1426 */           return ade.f.c(1);
/*      */         }
/* 1428 */         if (j > 0)
/* 1429 */           return ade.f.c(0);
/*      */       }
/*      */     }
/* 1432 */     return localrf;
/*      */   }
/*      */   
/*      */   public add r(int paramInt)
/*      */   {
/* 1437 */     return this.bm.d(paramInt);
/*      */   }
/*      */   
/*      */   public void v(int paramInt) {
/* 1441 */     s(paramInt);
/* 1442 */     int j = Integer.MAX_VALUE - this.bG;
/* 1443 */     if (paramInt > j) {
/* 1444 */       paramInt = j;
/*      */     }
/*      */     
/* 1447 */     this.bH += paramInt / bP();
/* 1448 */     this.bG += paramInt;
/* 1449 */     while (this.bH >= 1.0F) {
/* 1450 */       this.bH = ((this.bH - 1.0F) * bP());
/* 1451 */       a(1);
/* 1452 */       this.bH /= bP();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int paramInt) {
/* 1457 */     this.bF += paramInt;
/* 1458 */     if (this.bF < 0) {
/* 1459 */       this.bF = 0;
/* 1460 */       this.bH = 0.0F;
/* 1461 */       this.bG = 0;
/*      */     }
/*      */     
/* 1464 */     if ((paramInt > 0) && (this.bF % 5 == 0) && (this.h < this.aa - 100.0F)) {
/* 1465 */       float f1 = this.bF > 30 ? 1.0F : this.bF / 30.0F;
/* 1466 */       this.o.a(this, "random.levelup", f1 * 0.75F, 1.0F);
/* 1467 */       this.h = this.aa;
/*      */     }
/*      */   }
/*      */   
/*      */   public int bP() {
/* 1472 */     if (this.bF >= 30) {
/* 1473 */       return 62 + (this.bF - 30) * 7;
/*      */     }
/* 1475 */     if (this.bF >= 15) {
/* 1476 */       return 17 + (this.bF - 15) * 3;
/*      */     }
/* 1478 */     return 17;
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
/*      */   public void a(float paramFloat)
/*      */   {
/* 1491 */     if (this.bE.a) { return;
/*      */     }
/* 1493 */     if (!this.o.E) {
/* 1494 */       this.bp.a(paramFloat);
/*      */     }
/*      */   }
/*      */   
/*      */   public zr bQ() {
/* 1499 */     return this.bp;
/*      */   }
/*      */   
/*      */   public boolean g(boolean paramBoolean) {
/* 1503 */     return ((paramBoolean) || (this.bp.c())) && (!this.bE.a);
/*      */   }
/*      */   
/*      */   public boolean bR() {
/* 1507 */     return (aS() > 0.0F) && (aS() < aY());
/*      */   }
/*      */   
/*      */   public void a(add paramadd, int paramInt) {
/* 1511 */     if (paramadd == this.f) return;
/* 1512 */     this.f = paramadd;
/* 1513 */     this.g = paramInt;
/* 1514 */     if (!this.o.E) {
/* 1515 */       e(true);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3) {
/* 1520 */     if (this.bE.e) {
/* 1521 */       return true;
/*      */     }
/* 1523 */     aji localaji = this.o.a(paramInt1, paramInt2, paramInt3);
/* 1524 */     if (localaji.o() != awt.a) {
/* 1525 */       if (localaji.o().q())
/* 1526 */         return true;
/* 1527 */       if (bF() != null) {
/* 1528 */         add localadd = bF();
/*      */         
/* 1530 */         if ((localadd.b(localaji)) || (localadd.a(localaji) > 1.0F)) {
/* 1531 */           return true;
/*      */         }
/*      */       }
/*      */     }
/* 1535 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, add paramadd) {
/* 1539 */     if (this.bE.e) {
/* 1540 */       return true;
/*      */     }
/* 1542 */     if (paramadd != null) {
/* 1543 */       return paramadd.z();
/*      */     }
/* 1545 */     return false;
/*      */   }
/*      */   
/*      */   protected int e(yz paramyz)
/*      */   {
/* 1550 */     if (this.o.O().b("keepInventory")) { return 0;
/*      */     }
/* 1552 */     int j = this.bF * 7;
/* 1553 */     if (j > 100) {
/* 1554 */       return 100;
/*      */     }
/* 1556 */     return j;
/*      */   }
/*      */   
/*      */ 
/*      */   protected boolean aH()
/*      */   {
/* 1562 */     return true;
/*      */   }
/*      */   
/*      */   public boolean bi()
/*      */   {
/* 1567 */     return true;
/*      */   }
/*      */   
/*      */   public void a(yz paramyz, boolean paramBoolean) {
/* 1571 */     if (paramBoolean) {
/* 1572 */       this.bm.b(paramyz.bm);
/*      */       
/* 1574 */       g(paramyz.aS());
/* 1575 */       this.bp = paramyz.bp;
/*      */       
/* 1577 */       this.bF = paramyz.bF;
/* 1578 */       this.bG = paramyz.bG;
/* 1579 */       this.bH = paramyz.bH;
/*      */       
/* 1581 */       c(paramyz.bD());
/* 1582 */       this.aq = paramyz.aq;
/* 1583 */     } else if (this.o.O().b("keepInventory")) {
/* 1584 */       this.bm.b(paramyz.bm);
/*      */       
/* 1586 */       this.bF = paramyz.bF;
/* 1587 */       this.bG = paramyz.bG;
/* 1588 */       this.bH = paramyz.bH;
/* 1589 */       c(paramyz.bD());
/*      */     }
/* 1591 */     this.a = paramyz.a;
/*      */   }
/*      */   
/*      */   protected boolean g_()
/*      */   {
/* 1596 */     return !this.bE.b;
/*      */   }
/*      */   
/*      */ 
/*      */   public void q() {}
/*      */   
/*      */ 
/*      */   public void a(ahk paramahk) {}
/*      */   
/*      */ 
/*      */   public String b_()
/*      */   {
/* 1608 */     return this.i.getName();
/*      */   }
/*      */   
/*      */   public ahb d()
/*      */   {
/* 1613 */     return this.o;
/*      */   }
/*      */   
/*      */   public aav bS() {
/* 1617 */     return this.a;
/*      */   }
/*      */   
/*      */   public add q(int paramInt)
/*      */   {
/* 1622 */     if (paramInt == 0) return this.bm.h();
/* 1623 */     return this.bm.b[(paramInt - 1)];
/*      */   }
/*      */   
/*      */   public add be()
/*      */   {
/* 1628 */     return this.bm.h();
/*      */   }
/*      */   
/*      */   public void c(int paramInt, add paramadd)
/*      */   {
/* 1633 */     this.bm.b[paramInt] = paramadd;
/*      */   }
/*      */   
/*      */   public boolean d(yz paramyz)
/*      */   {
/* 1638 */     if (!ap()) return false;
/* 1639 */     bae localbae = bt();
/*      */     
/* 1641 */     if ((localbae != null) && (paramyz != null) && (paramyz.bt() == localbae) && (localbae.h())) { return false;
/*      */     }
/* 1643 */     return true;
/*      */   }
/*      */   
/*      */   public add[] ak()
/*      */   {
/* 1648 */     return this.bm.b;
/*      */   }
/*      */   
/*      */   public boolean bT() {
/* 1652 */     return u(1);
/*      */   }
/*      */   
/*      */   public boolean aC()
/*      */   {
/* 1657 */     return !this.bE.b;
/*      */   }
/*      */   
/*      */   public bac bU()
/*      */   {
/* 1662 */     return this.o.W();
/*      */   }
/*      */   
/*      */   public bae bt()
/*      */   {
/* 1667 */     return bU().i(b_());
/*      */   }
/*      */   
/*      */ 
/*      */   public fj c_()
/*      */   {
/* 1673 */     fq localfq = new fq(azy.a(bt(), b_()));
/* 1674 */     localfq.b().a(new fh(fi.e, "/msg " + b_() + " "));
/* 1675 */     return localfq;
/*      */   }
/*      */   
/*      */   public void m(float paramFloat)
/*      */   {
/* 1680 */     if (paramFloat < 0.0F) paramFloat = 0.0F;
/* 1681 */     z().b(17, Float.valueOf(paramFloat));
/*      */   }
/*      */   
/*      */   public float bs()
/*      */   {
/* 1686 */     return z().d(17);
/*      */   }
/*      */   
/*      */   public static UUID a(GameProfile paramGameProfile) {
/* 1690 */     UUID localUUID = paramGameProfile.getId();
/* 1691 */     if (localUUID == null) {
/* 1692 */       localUUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + paramGameProfile.getName()).getBytes(Charsets.UTF_8));
/*      */     }
/* 1694 */     return localUUID;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */