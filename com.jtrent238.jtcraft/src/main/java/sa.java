/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import net.minecraft.server.MinecraftServer;
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
/*      */ public abstract class sa
/*      */ {
/*      */   private static int b;
/*   32 */   private int c = b++;
/*      */   
/*   34 */   public double j = 1.0D;
/*      */   public boolean k;
/*      */   public sa l;
/*      */   public sa m;
/*      */   public boolean n;
/*      */   public ahb o;
/*      */   public double p;
/*      */   public double q;
/*      */   public double r;
/*      */   public double s;
/*      */   public double t;
/*      */   public double u;
/*      */   public double v;
/*   47 */   public double w; public double x; public float y; public float z; public float A; public float B; public final azt C = azt.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*      */   public boolean D;
/*      */   public boolean E;
/*      */   public boolean F;
/*      */   public boolean G;
/*      */   public boolean H;
/*      */   protected boolean I;
/*   54 */   public boolean J = true;
/*      */   
/*      */   public boolean K;
/*      */   public float L;
/*   58 */   public float M = 0.6F;
/*   59 */   public float N = 1.8F;
/*      */   
/*      */   public float O;
/*      */   public float P;
/*      */   public float Q;
/*      */   public float R;
/*   65 */   private int d = 1;
/*      */   public double S;
/*      */   public double T;
/*      */   public double U;
/*      */   public float V;
/*      */   public float W;
/*      */   public boolean X;
/*   72 */   public float Y; protected Random Z = new Random();
/*      */   public int aa;
/*   74 */   public int ab = 1;
/*      */   
/*      */   private int e;
/*      */   
/*      */   protected boolean ac;
/*      */   
/*      */   public int ad;
/*   81 */   private boolean f = true;
/*      */   
/*      */   protected boolean ae;
/*      */   
/*      */   protected te af;
/*      */   
/*      */   private double g;
/*      */   
/*      */   private double h;
/*      */   
/*      */   public boolean ag;
/*      */   
/*      */   public int ah;
/*      */   
/*      */   public int ai;
/*      */   
/*      */   public int aj;
/*      */   
/*      */   public int bZ;
/*      */   public int ca;
/*      */   public int cb;
/*      */   public boolean ak;
/*      */   public boolean al;
/*      */   public int am;
/*      */   protected boolean an;
/*      */   protected int ao;
/*      */   public int ap;
/*      */   protected int aq;
/*      */   private boolean i;
/*  110 */   protected UUID ar = UUID.randomUUID();
/*      */   
/*      */   public int y() {
/*  113 */     return this.c;
/*      */   }
/*      */   
/*      */   public void d(int paramInt) {
/*  117 */     this.c = paramInt;
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
/*  173 */   public se as = se.b;
/*      */   
/*      */   public sa(ahb paramahb) {
/*  176 */     this.o = paramahb;
/*  177 */     b(0.0D, 0.0D, 0.0D);
/*      */     
/*  179 */     if (paramahb != null) {
/*  180 */       this.ap = paramahb.t.i;
/*      */     }
/*      */     
/*  183 */     this.af = new te(this);
/*  184 */     this.af.a(0, Byte.valueOf((byte)0));
/*  185 */     this.af.a(1, Short.valueOf((short)300));
/*  186 */     c();
/*      */   }
/*      */   
/*      */   protected abstract void c();
/*      */   
/*      */   public te z()
/*      */   {
/*  193 */     return this.af;
/*      */   }
/*      */   
/*      */   public boolean equals(Object paramObject)
/*      */   {
/*  198 */     if ((paramObject instanceof sa)) {
/*  199 */       return ((sa)paramObject).c == this.c;
/*      */     }
/*  201 */     return false;
/*      */   }
/*      */   
/*      */   public int hashCode()
/*      */   {
/*  206 */     return this.c;
/*      */   }
/*      */   
/*      */   protected void A() {
/*  210 */     if (this.o == null) return;
/*  211 */     while (this.t > 0.0D) {
/*  212 */       b(this.s, this.t, this.u);
/*  213 */       if (this.o.a(this, this.C).isEmpty()) break;
/*  214 */       this.t += 1.0D;
/*      */     }
/*      */     
/*  217 */     this.v = (this.w = this.x = 0.0D);
/*  218 */     this.z = 0.0F;
/*      */   }
/*      */   
/*      */   public void B() {
/*  222 */     this.K = true;
/*      */   }
/*      */   
/*      */   protected void a(float paramFloat1, float paramFloat2) {
/*  226 */     if ((paramFloat1 != this.M) || (paramFloat2 != this.N)) {
/*  227 */       f1 = this.M;
/*      */       
/*  229 */       this.M = paramFloat1;
/*  230 */       this.N = paramFloat2;
/*  231 */       this.C.d = (this.C.a + this.M);
/*  232 */       this.C.f = (this.C.c + this.M);
/*  233 */       this.C.e = (this.C.b + this.N);
/*      */       
/*  235 */       if ((this.M > f1) && (!this.f) && (!this.o.E)) {
/*  236 */         d(f1 - this.M, 0.0D, f1 - this.M);
/*      */       }
/*      */     }
/*  239 */     float f1 = paramFloat1 % 2.0F;
/*  240 */     if (f1 < 0.375D) {
/*  241 */       this.as = se.a;
/*  242 */     } else if (f1 < 0.75D) {
/*  243 */       this.as = se.b;
/*  244 */     } else if (f1 < 1.0D) {
/*  245 */       this.as = se.c;
/*  246 */     } else if (f1 < 1.375D) {
/*  247 */       this.as = se.d;
/*  248 */     } else if (f1 < 1.75D) {
/*  249 */       this.as = se.e;
/*      */     } else {
/*  251 */       this.as = se.f;
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
/*      */   protected void b(float paramFloat1, float paramFloat2)
/*      */   {
/*  264 */     this.y = (paramFloat1 % 360.0F);
/*  265 */     this.z = (paramFloat2 % 360.0F);
/*      */   }
/*      */   
/*      */   public void b(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  269 */     this.s = paramDouble1;
/*  270 */     this.t = paramDouble2;
/*  271 */     this.u = paramDouble3;
/*  272 */     float f1 = this.M / 2.0F;
/*  273 */     float f2 = this.N;
/*  274 */     this.C.b(paramDouble1 - f1, paramDouble2 - this.L + this.V, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 - this.L + this.V + f2, paramDouble3 + f1);
/*      */   }
/*      */   
/*      */   public void c(float paramFloat1, float paramFloat2) {
/*  278 */     float f1 = this.z;
/*  279 */     float f2 = this.y;
/*      */     
/*  281 */     this.y = ((float)(this.y + paramFloat1 * 0.15D));
/*  282 */     this.z = ((float)(this.z - paramFloat2 * 0.15D));
/*  283 */     if (this.z < -90.0F) this.z = -90.0F;
/*  284 */     if (this.z > 90.0F) { this.z = 90.0F;
/*      */     }
/*  286 */     this.B += this.z - f1;
/*  287 */     this.A += this.y - f2;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void h()
/*      */   {
/*  298 */     C();
/*      */   }
/*      */   
/*      */   public void C() {
/*  302 */     this.o.C.a("entityBaseTick");
/*      */     
/*  304 */     if ((this.m != null) && (this.m.K)) {
/*  305 */       this.m = null;
/*      */     }
/*      */     
/*  308 */     this.O = this.P;
/*  309 */     this.p = this.s;
/*  310 */     this.q = this.t;
/*  311 */     this.r = this.u;
/*  312 */     this.B = this.z;
/*  313 */     this.A = this.y;
/*      */     int i2;
/*  315 */     int i3; if ((!this.o.E) && ((this.o instanceof mt))) {
/*  316 */       this.o.C.a("portal");
/*  317 */       MinecraftServer localMinecraftServer = ((mt)this.o).q();
/*  318 */       i2 = D();
/*      */       
/*  320 */       if (this.an) {
/*  321 */         if (localMinecraftServer.w()) {
/*  322 */           if ((this.m == null) && 
/*  323 */             (this.ao++ >= i2)) {
/*  324 */             this.ao = i2;
/*  325 */             this.am = ai();
/*      */             
/*      */ 
/*      */ 
/*  329 */             if (this.o.t.i == -1) {
/*  330 */               i3 = 0;
/*      */             } else {
/*  332 */               i3 = -1;
/*      */             }
/*      */             
/*  335 */             b(i3);
/*      */           }
/*      */           
/*  338 */           this.an = false;
/*      */         }
/*      */       } else {
/*  341 */         if (this.ao > 0) this.ao -= 4;
/*  342 */         if (this.ao < 0) this.ao = 0;
/*      */       }
/*  344 */       if (this.am > 0) this.am -= 1;
/*  345 */       this.o.C.b();
/*      */     }
/*      */     
/*  348 */     if ((ao()) && (!M())) {
/*  349 */       int i1 = qh.c(this.s);
/*  350 */       i2 = qh.c(this.t - 0.20000000298023224D - this.L);
/*  351 */       i3 = qh.c(this.u);
/*  352 */       aji localaji = this.o.a(i1, i2, i3);
/*      */       
/*  354 */       if (localaji.o() != awt.a) {
/*  355 */         this.o.a("blockcrack_" + aji.b(localaji) + "_" + this.o.e(i1, i2, i3), this.s + (this.Z.nextFloat() - 0.5D) * this.M, this.C.b + 0.1D, this.u + (this.Z.nextFloat() - 0.5D) * this.M, -this.v * 4.0D, 1.5D, -this.x * 4.0D);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  360 */     N();
/*      */     
/*  362 */     if (this.o.E) {
/*  363 */       this.e = 0;
/*      */     }
/*  365 */     else if (this.e > 0) {
/*  366 */       if (this.ae) {
/*  367 */         this.e -= 4;
/*  368 */         if (this.e < 0) this.e = 0;
/*      */       } else {
/*  370 */         if (this.e % 20 == 0) {
/*  371 */           a(ro.b, 1.0F);
/*      */         }
/*  373 */         this.e -= 1;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  378 */     if (P()) {
/*  379 */       E();
/*  380 */       this.R *= 0.5F;
/*      */     }
/*      */     
/*  383 */     if (this.t < -64.0D) {
/*  384 */       G();
/*      */     }
/*      */     
/*  387 */     if (!this.o.E) {
/*  388 */       a(0, this.e > 0);
/*      */     }
/*      */     
/*  391 */     this.f = false;
/*      */     
/*  393 */     this.o.C.b();
/*      */   }
/*      */   
/*      */   public int D() {
/*  397 */     return 0;
/*      */   }
/*      */   
/*      */   protected void E() {
/*  401 */     if (!this.ae)
/*      */     {
/*  403 */       a(ro.c, 4.0F);
/*  404 */       e(15);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(int paramInt) {
/*  409 */     int i1 = paramInt * 20;
/*  410 */     i1 = agi.a(this, i1);
/*  411 */     if (this.e < i1) {
/*  412 */       this.e = i1;
/*      */     }
/*      */   }
/*      */   
/*      */   public void F() {
/*  417 */     this.e = 0;
/*      */   }
/*      */   
/*      */   protected void G() {
/*  421 */     B();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean c(double paramDouble1, double paramDouble2, double paramDouble3)
/*      */   {
/*  433 */     azt localazt = this.C.c(paramDouble1, paramDouble2, paramDouble3);
/*  434 */     List localList = this.o.a(this, localazt);
/*  435 */     if (!localList.isEmpty()) return false;
/*  436 */     if (this.o.d(localazt)) return false;
/*  437 */     return true;
/*      */   }
/*      */   
/*      */   public void d(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  441 */     if (this.X) {
/*  442 */       this.C.d(paramDouble1, paramDouble2, paramDouble3);
/*  443 */       this.s = ((this.C.a + this.C.d) / 2.0D);
/*  444 */       this.t = (this.C.b + this.L - this.V);
/*  445 */       this.u = ((this.C.c + this.C.f) / 2.0D);
/*  446 */       return;
/*      */     }
/*      */     
/*  449 */     this.o.C.a("move");
/*      */     
/*  451 */     this.V *= 0.4F;
/*      */     
/*  453 */     double d1 = this.s;
/*  454 */     double d2 = this.t;
/*  455 */     double d3 = this.u;
/*      */     
/*  457 */     if (this.I) {
/*  458 */       this.I = false;
/*      */       
/*  460 */       paramDouble1 *= 0.25D;
/*  461 */       paramDouble2 *= 0.05000000074505806D;
/*  462 */       paramDouble3 *= 0.25D;
/*  463 */       this.v = 0.0D;
/*  464 */       this.w = 0.0D;
/*  465 */       this.x = 0.0D;
/*      */     }
/*      */     
/*  468 */     double d4 = paramDouble1;
/*  469 */     double d5 = paramDouble2;
/*  470 */     double d6 = paramDouble3;
/*      */     
/*  472 */     azt localazt1 = this.C.b();
/*      */     
/*  474 */     int i1 = (this.D) && (an()) && ((this instanceof yz)) ? 1 : 0;
/*      */     
/*  476 */     if (i1 != 0) {
/*  477 */       double d7 = 0.05D;
/*  478 */       while ((paramDouble1 != 0.0D) && (this.o.a(this, this.C.c(paramDouble1, -1.0D, 0.0D)).isEmpty())) {
/*  479 */         if ((paramDouble1 < d7) && (paramDouble1 >= -d7)) { paramDouble1 = 0.0D;
/*  480 */         } else if (paramDouble1 > 0.0D) paramDouble1 -= d7; else
/*  481 */           paramDouble1 += d7;
/*  482 */         d4 = paramDouble1;
/*      */       }
/*  484 */       while ((paramDouble3 != 0.0D) && (this.o.a(this, this.C.c(0.0D, -1.0D, paramDouble3)).isEmpty())) {
/*  485 */         if ((paramDouble3 < d7) && (paramDouble3 >= -d7)) { paramDouble3 = 0.0D;
/*  486 */         } else if (paramDouble3 > 0.0D) paramDouble3 -= d7; else
/*  487 */           paramDouble3 += d7;
/*  488 */         d6 = paramDouble3;
/*      */       }
/*  490 */       while ((paramDouble1 != 0.0D) && (paramDouble3 != 0.0D) && (this.o.a(this, this.C.c(paramDouble1, -1.0D, paramDouble3)).isEmpty())) {
/*  491 */         if ((paramDouble1 < d7) && (paramDouble1 >= -d7)) { paramDouble1 = 0.0D;
/*  492 */         } else if (paramDouble1 > 0.0D) paramDouble1 -= d7; else
/*  493 */           paramDouble1 += d7;
/*  494 */         if ((paramDouble3 < d7) && (paramDouble3 >= -d7)) { paramDouble3 = 0.0D;
/*  495 */         } else if (paramDouble3 > 0.0D) paramDouble3 -= d7; else
/*  496 */           paramDouble3 += d7;
/*  497 */         d4 = paramDouble1;
/*  498 */         d6 = paramDouble3;
/*      */       }
/*      */     }
/*      */     
/*  502 */     List localList = this.o.a(this, this.C.a(paramDouble1, paramDouble2, paramDouble3));
/*      */     
/*      */ 
/*  505 */     for (int i2 = 0; i2 < localList.size(); i2++)
/*  506 */       paramDouble2 = ((azt)localList.get(i2)).b(this.C, paramDouble2);
/*  507 */     this.C.d(0.0D, paramDouble2, 0.0D);
/*      */     
/*  509 */     if ((!this.J) && (d5 != paramDouble2)) {
/*  510 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */     }
/*      */     
/*  513 */     i2 = (this.D) || ((d5 != paramDouble2) && (d5 < 0.0D)) ? 1 : 0;
/*      */     
/*  515 */     for (int i3 = 0; i3 < localList.size(); i3++) {
/*  516 */       paramDouble1 = ((azt)localList.get(i3)).a(this.C, paramDouble1);
/*      */     }
/*  518 */     this.C.d(paramDouble1, 0.0D, 0.0D);
/*      */     
/*  520 */     if ((!this.J) && (d4 != paramDouble1)) {
/*  521 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */     }
/*      */     
/*  524 */     for (i3 = 0; i3 < localList.size(); i3++)
/*  525 */       paramDouble3 = ((azt)localList.get(i3)).c(this.C, paramDouble3);
/*  526 */     this.C.d(0.0D, 0.0D, paramDouble3);
/*      */     
/*  528 */     if ((!this.J) && (d6 != paramDouble3)) {
/*  529 */       paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */     }
/*      */     int i5;
/*  532 */     if ((this.W > 0.0F) && (i2 != 0) && ((i1 != 0) || (this.V < 0.05F)) && ((d4 != paramDouble1) || (d6 != paramDouble3))) {
/*  533 */       d8 = paramDouble1;
/*  534 */       d9 = paramDouble2;
/*  535 */       d10 = paramDouble3;
/*      */       
/*  537 */       paramDouble1 = d4;
/*  538 */       paramDouble2 = this.W;
/*  539 */       paramDouble3 = d6;
/*      */       
/*  541 */       azt localazt2 = this.C.b();
/*  542 */       this.C.d(localazt1);
/*  543 */       localList = this.o.a(this, this.C.a(paramDouble1, paramDouble2, paramDouble3));
/*      */       
/*      */ 
/*  546 */       for (i5 = 0; i5 < localList.size(); i5++)
/*  547 */         paramDouble2 = ((azt)localList.get(i5)).b(this.C, paramDouble2);
/*  548 */       this.C.d(0.0D, paramDouble2, 0.0D);
/*      */       
/*  550 */       if ((!this.J) && (d5 != paramDouble2)) {
/*  551 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */       }
/*      */       
/*  554 */       for (i5 = 0; i5 < localList.size(); i5++)
/*  555 */         paramDouble1 = ((azt)localList.get(i5)).a(this.C, paramDouble1);
/*  556 */       this.C.d(paramDouble1, 0.0D, 0.0D);
/*      */       
/*  558 */       if ((!this.J) && (d4 != paramDouble1)) {
/*  559 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */       }
/*      */       
/*  562 */       for (i5 = 0; i5 < localList.size(); i5++)
/*  563 */         paramDouble3 = ((azt)localList.get(i5)).c(this.C, paramDouble3);
/*  564 */       this.C.d(0.0D, 0.0D, paramDouble3);
/*      */       
/*  566 */       if ((!this.J) && (d6 != paramDouble3)) {
/*  567 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */       }
/*      */       
/*  570 */       if ((!this.J) && (d5 != paramDouble2)) {
/*  571 */         paramDouble1 = paramDouble2 = paramDouble3 = 0.0D;
/*      */       } else {
/*  573 */         paramDouble2 = -this.W;
/*      */         
/*  575 */         for (i5 = 0; i5 < localList.size(); i5++)
/*  576 */           paramDouble2 = ((azt)localList.get(i5)).b(this.C, paramDouble2);
/*  577 */         this.C.d(0.0D, paramDouble2, 0.0D);
/*      */       }
/*      */       
/*  580 */       if (d8 * d8 + d10 * d10 >= paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3) {
/*  581 */         paramDouble1 = d8;
/*  582 */         paramDouble2 = d9;
/*  583 */         paramDouble3 = d10;
/*  584 */         this.C.d(localazt2);
/*      */       }
/*      */     }
/*  587 */     this.o.C.b();
/*  588 */     this.o.C.a("rest");
/*      */     
/*  590 */     this.s = ((this.C.a + this.C.d) / 2.0D);
/*  591 */     this.t = (this.C.b + this.L - this.V);
/*  592 */     this.u = ((this.C.c + this.C.f) / 2.0D);
/*      */     
/*  594 */     this.E = ((d4 != paramDouble1) || (d6 != paramDouble3));
/*  595 */     this.F = (d5 != paramDouble2);
/*  596 */     this.D = ((d5 != paramDouble2) && (d5 < 0.0D));
/*  597 */     this.G = ((this.E) || (this.F));
/*  598 */     a(paramDouble2, this.D);
/*      */     
/*  600 */     if (d4 != paramDouble1) this.v = 0.0D;
/*  601 */     if (d5 != paramDouble2) this.w = 0.0D;
/*  602 */     if (d6 != paramDouble3) { this.x = 0.0D;
/*      */     }
/*  604 */     double d8 = this.s - d1;
/*  605 */     double d9 = this.t - d2;
/*  606 */     double d10 = this.u - d3;
/*      */     
/*  608 */     if ((g_()) && (i1 == 0) && (this.m == null)) {
/*  609 */       int i4 = qh.c(this.s);
/*  610 */       i5 = qh.c(this.t - 0.20000000298023224D - this.L);
/*  611 */       int i6 = qh.c(this.u);
/*      */       
/*  613 */       aji localaji = this.o.a(i4, i5, i6);
/*  614 */       int i7 = this.o.a(i4, i5 - 1, i6).b();
/*  615 */       if ((i7 == 11) || (i7 == 32) || (i7 == 21)) {
/*  616 */         localaji = this.o.a(i4, i5 - 1, i6);
/*      */       }
/*  618 */       if (localaji != ajn.ap) {
/*  619 */         d9 = 0.0D;
/*      */       }
/*      */       
/*  622 */       this.P = ((float)(this.P + qh.a(d8 * d8 + d10 * d10) * 0.6D));
/*  623 */       this.Q = ((float)(this.Q + qh.a(d8 * d8 + d9 * d9 + d10 * d10) * 0.6D));
/*      */       
/*  625 */       if ((this.Q > this.d) && (localaji.o() != awt.a)) {
/*  626 */         this.d = ((int)this.Q + 1);
/*  627 */         if (M()) {
/*  628 */           float f1 = qh.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.35F;
/*  629 */           if (f1 > 1.0F) f1 = 1.0F;
/*  630 */           a(H(), f1, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
/*      */         }
/*  632 */         a(i4, i5, i6, localaji);
/*  633 */         localaji.b(this.o, i4, i5, i6, this);
/*      */       }
/*      */     }
/*      */     try
/*      */     {
/*  638 */       I();
/*      */     } catch (Throwable localThrowable) {
/*  640 */       b localb = b.a(localThrowable, "Checking entity block collision");
/*  641 */       k localk = localb.a("Entity being checked for collision");
/*      */       
/*  643 */       a(localk);
/*      */       
/*  645 */       throw new s(localb);
/*      */     }
/*      */     
/*  648 */     boolean bool = L();
/*  649 */     if (this.o.e(this.C.e(0.001D, 0.001D, 0.001D))) {
/*  650 */       f(1);
/*  651 */       if (!bool) {
/*  652 */         this.e += 1;
/*  653 */         if (this.e == 0) e(8);
/*      */       }
/*      */     }
/*  656 */     else if (this.e <= 0) {
/*  657 */       this.e = (-this.ab);
/*      */     }
/*      */     
/*      */ 
/*  661 */     if ((bool) && (this.e > 0)) {
/*  662 */       a("random.fizz", 0.7F, 1.6F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
/*  663 */       this.e = (-this.ab);
/*      */     }
/*      */     
/*  666 */     this.o.C.b();
/*      */   }
/*      */   
/*      */   protected String H() {
/*  670 */     return "game.neutral.swim";
/*      */   }
/*      */   
/*      */   protected void I() {
/*  674 */     int i1 = qh.c(this.C.a + 0.001D);
/*  675 */     int i2 = qh.c(this.C.b + 0.001D);
/*  676 */     int i3 = qh.c(this.C.c + 0.001D);
/*  677 */     int i4 = qh.c(this.C.d - 0.001D);
/*  678 */     int i5 = qh.c(this.C.e - 0.001D);
/*  679 */     int i6 = qh.c(this.C.f - 0.001D);
/*      */     
/*  681 */     if (this.o.b(i1, i2, i3, i4, i5, i6)) {
/*  682 */       for (int i7 = i1; i7 <= i4; i7++)
/*  683 */         for (int i8 = i2; i8 <= i5; i8++)
/*  684 */           for (int i9 = i3; i9 <= i6; i9++) {
/*  685 */             aji localaji = this.o.a(i7, i8, i9);
/*      */             try
/*      */             {
/*  688 */               localaji.a(this.o, i7, i8, i9, this);
/*      */             } catch (Throwable localThrowable) {
/*  690 */               b localb = b.a(localThrowable, "Colliding entity with block");
/*  691 */               k localk = localb.a("Block being collided with");
/*      */               
/*  693 */               k.a(localk, i7, i8, i9, localaji, this.o.e(i7, i8, i9));
/*      */               
/*  695 */               throw new s(localb);
/*      */             }
/*      */           }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  702 */     ajm localajm = paramaji.H;
/*  703 */     if (this.o.a(paramInt1, paramInt2 + 1, paramInt3) == ajn.aC) {
/*  704 */       localajm = ajn.aC.H;
/*  705 */       a(localajm.e(), localajm.c() * 0.15F, localajm.d());
/*  706 */     } else if (!paramaji.o().d()) {
/*  707 */       a(localajm.e(), localajm.c() * 0.15F, localajm.d());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, float paramFloat1, float paramFloat2) {
/*  712 */     this.o.a(this, paramString, paramFloat1, paramFloat2);
/*      */   }
/*      */   
/*      */   protected boolean g_() {
/*  716 */     return true;
/*      */   }
/*      */   
/*      */   protected void a(double paramDouble, boolean paramBoolean) {
/*  720 */     if (paramBoolean) {
/*  721 */       if (this.R > 0.0F) {
/*  722 */         b(this.R);
/*  723 */         this.R = 0.0F;
/*      */       }
/*      */     }
/*  726 */     else if (paramDouble < 0.0D) this.R = ((float)(this.R - paramDouble));
/*      */   }
/*      */   
/*      */   public azt J()
/*      */   {
/*  731 */     return null;
/*      */   }
/*      */   
/*      */   protected void f(int paramInt) {
/*  735 */     if (!this.ae) {
/*  736 */       a(ro.a, paramInt);
/*      */     }
/*      */   }
/*      */   
/*      */   public final boolean K() {
/*  741 */     return this.ae;
/*      */   }
/*      */   
/*      */   protected void b(float paramFloat) {
/*  745 */     if (this.l != null) this.l.b(paramFloat);
/*      */   }
/*      */   
/*      */   public boolean L() {
/*  749 */     return (this.ac) || (this.o.y(qh.c(this.s), qh.c(this.t), qh.c(this.u))) || (this.o.y(qh.c(this.s), qh.c(this.t + this.N), qh.c(this.u)));
/*      */   }
/*      */   
/*      */   public boolean M() {
/*  753 */     return this.ac;
/*      */   }
/*      */   
/*      */   public boolean N() {
/*  757 */     if (this.o.a(this.C.b(0.0D, -0.4000000059604645D, 0.0D).e(0.001D, 0.001D, 0.001D), awt.h, this)) {
/*  758 */       if ((!this.ac) && (!this.f)) {
/*  759 */         float f1 = qh.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.2F;
/*  760 */         if (f1 > 1.0F) f1 = 1.0F;
/*  761 */         a(O(), f1, 1.0F + (this.Z.nextFloat() - this.Z.nextFloat()) * 0.4F);
/*  762 */         float f2 = qh.c(this.C.b);
/*  763 */         float f3; float f4; for (int i1 = 0; i1 < 1.0F + this.M * 20.0F; i1++) {
/*  764 */           f3 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
/*  765 */           f4 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
/*  766 */           this.o.a("bubble", this.s + f3, f2 + 1.0F, this.u + f4, this.v, this.w - this.Z.nextFloat() * 0.2F, this.x);
/*      */         }
/*  768 */         for (i1 = 0; i1 < 1.0F + this.M * 20.0F; i1++) {
/*  769 */           f3 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
/*  770 */           f4 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M;
/*  771 */           this.o.a("splash", this.s + f3, f2 + 1.0F, this.u + f4, this.v, this.w, this.x);
/*      */         }
/*      */       }
/*  774 */       this.R = 0.0F;
/*  775 */       this.ac = true;
/*  776 */       this.e = 0;
/*      */     } else {
/*  778 */       this.ac = false;
/*      */     }
/*  780 */     return this.ac;
/*      */   }
/*      */   
/*      */   protected String O() {
/*  784 */     return "game.neutral.swim.splash";
/*      */   }
/*      */   
/*      */   public boolean a(awt paramawt) {
/*  788 */     double d1 = this.t + g();
/*  789 */     int i1 = qh.c(this.s);
/*  790 */     int i2 = qh.d(qh.c(d1));
/*  791 */     int i3 = qh.c(this.u);
/*  792 */     aji localaji = this.o.a(i1, i2, i3);
/*  793 */     if (localaji.o() == paramawt) {
/*  794 */       float f1 = alw.b(this.o.e(i1, i2, i3)) - 0.11111111F;
/*  795 */       float f2 = i2 + 1 - f1;
/*  796 */       return d1 < f2;
/*      */     }
/*  798 */     return false;
/*      */   }
/*      */   
/*      */   public float g() {
/*  802 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public boolean P() {
/*  806 */     return this.o.a(this.C.b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), awt.i);
/*      */   }
/*      */   
/*      */   public void a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  810 */     float f1 = paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2;
/*  811 */     if (f1 < 1.0E-4F) { return;
/*      */     }
/*  813 */     f1 = qh.c(f1);
/*  814 */     if (f1 < 1.0F) f1 = 1.0F;
/*  815 */     f1 = paramFloat3 / f1;
/*  816 */     paramFloat1 *= f1;
/*  817 */     paramFloat2 *= f1;
/*      */     
/*  819 */     float f2 = qh.a(this.y * 3.1415927F / 180.0F);
/*  820 */     float f3 = qh.b(this.y * 3.1415927F / 180.0F);
/*      */     
/*  822 */     this.v += paramFloat1 * f3 - paramFloat2 * f2;
/*  823 */     this.x += paramFloat2 * f3 + paramFloat1 * f2;
/*      */   }
/*      */   
/*      */   public int c(float paramFloat) {
/*  827 */     int i1 = qh.c(this.s);
/*  828 */     int i2 = qh.c(this.u);
/*      */     
/*  830 */     if (this.o.d(i1, 0, i2)) {
/*  831 */       double d1 = (this.C.e - this.C.b) * 0.66D;
/*  832 */       int i3 = qh.c(this.t - this.L + d1);
/*  833 */       return this.o.c(i1, i3, i2, 0);
/*      */     }
/*  835 */     return 0;
/*      */   }
/*      */   
/*      */   public float d(float paramFloat) {
/*  839 */     int i1 = qh.c(this.s);
/*  840 */     int i2 = qh.c(this.u);
/*  841 */     if (this.o.d(i1, 0, i2)) {
/*  842 */       double d1 = (this.C.e - this.C.b) * 0.66D;
/*  843 */       int i3 = qh.c(this.t - this.L + d1);
/*  844 */       return this.o.n(i1, i3, i2);
/*      */     }
/*  846 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public void a(ahb paramahb) {
/*  850 */     this.o = paramahb;
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  854 */     this.p = (this.s = paramDouble1);
/*  855 */     this.q = (this.t = paramDouble2);
/*  856 */     this.r = (this.u = paramDouble3);
/*  857 */     this.A = (this.y = paramFloat1);
/*  858 */     this.B = (this.z = paramFloat2);
/*  859 */     this.V = 0.0F;
/*      */     
/*  861 */     double d1 = this.A - paramFloat1;
/*  862 */     if (d1 < -180.0D) this.A += 360.0F;
/*  863 */     if (d1 >= 180.0D) this.A -= 360.0F;
/*  864 */     b(this.s, this.t, this.u);
/*  865 */     b(paramFloat1, paramFloat2);
/*      */   }
/*      */   
/*      */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/*  869 */     this.S = (this.p = this.s = paramDouble1);
/*  870 */     this.T = (this.q = this.t = paramDouble2 + this.L);
/*  871 */     this.U = (this.r = this.u = paramDouble3);
/*  872 */     this.y = paramFloat1;
/*  873 */     this.z = paramFloat2;
/*  874 */     b(this.s, this.t, this.u);
/*      */   }
/*      */   
/*      */   public float e(sa paramsa) {
/*  878 */     float f1 = (float)(this.s - paramsa.s);
/*  879 */     float f2 = (float)(this.t - paramsa.t);
/*  880 */     float f3 = (float)(this.u - paramsa.u);
/*  881 */     return qh.c(f1 * f1 + f2 * f2 + f3 * f3);
/*      */   }
/*      */   
/*      */   public double e(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  885 */     double d1 = this.s - paramDouble1;
/*  886 */     double d2 = this.t - paramDouble2;
/*  887 */     double d3 = this.u - paramDouble3;
/*  888 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*      */   }
/*      */   
/*      */   public double f(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  892 */     double d1 = this.s - paramDouble1;
/*  893 */     double d2 = this.t - paramDouble2;
/*  894 */     double d3 = this.u - paramDouble3;
/*  895 */     return qh.a(d1 * d1 + d2 * d2 + d3 * d3);
/*      */   }
/*      */   
/*      */   public double f(sa paramsa) {
/*  899 */     double d1 = this.s - paramsa.s;
/*  900 */     double d2 = this.t - paramsa.t;
/*  901 */     double d3 = this.u - paramsa.u;
/*  902 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*      */   }
/*      */   
/*      */   public void b_(yz paramyz) {}
/*      */   
/*      */   public void g(sa paramsa)
/*      */   {
/*  909 */     if ((paramsa.l == this) || (paramsa.m == this)) { return;
/*      */     }
/*  911 */     double d1 = paramsa.s - this.s;
/*  912 */     double d2 = paramsa.u - this.u;
/*      */     
/*  914 */     double d3 = qh.a(d1, d2);
/*      */     
/*  916 */     if (d3 >= 0.009999999776482582D) {
/*  917 */       d3 = qh.a(d3);
/*  918 */       d1 /= d3;
/*  919 */       d2 /= d3;
/*      */       
/*  921 */       double d4 = 1.0D / d3;
/*  922 */       if (d4 > 1.0D) d4 = 1.0D;
/*  923 */       d1 *= d4;
/*  924 */       d2 *= d4;
/*      */       
/*  926 */       d1 *= 0.05000000074505806D;
/*  927 */       d2 *= 0.05000000074505806D;
/*      */       
/*  929 */       d1 *= (1.0F - this.Y);
/*  930 */       d2 *= (1.0F - this.Y);
/*      */       
/*  932 */       g(-d1, 0.0D, -d2);
/*  933 */       paramsa.g(d1, 0.0D, d2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void g(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  938 */     this.v += paramDouble1;
/*  939 */     this.w += paramDouble2;
/*  940 */     this.x += paramDouble3;
/*  941 */     this.al = true;
/*      */   }
/*      */   
/*      */   protected void Q() {
/*  945 */     this.H = true;
/*      */   }
/*      */   
/*      */   public boolean a(ro paramro, float paramFloat) {
/*  949 */     if (aw()) return false;
/*  950 */     Q();
/*  951 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean R()
/*      */   {
/*  959 */     return false;
/*      */   }
/*      */   
/*      */   public boolean S() {
/*  963 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void b(sa paramsa, int paramInt) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean h(double paramDouble1, double paramDouble2, double paramDouble3)
/*      */   {
/*  982 */     double d1 = this.s - paramDouble1;
/*  983 */     double d2 = this.t - paramDouble2;
/*  984 */     double d3 = this.u - paramDouble3;
/*  985 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  986 */     return a(d4);
/*      */   }
/*      */   
/*      */   public boolean a(double paramDouble) {
/*  990 */     double d1 = this.C.a();
/*  991 */     d1 *= 64.0D * this.j;
/*  992 */     return paramDouble < d1 * d1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean c(dh paramdh)
/*      */   {
/* 1000 */     String str = W();
/* 1001 */     if ((this.K) || (str == null)) {
/* 1002 */       return false;
/*      */     }
/* 1004 */     paramdh.a("id", str);
/* 1005 */     e(paramdh);
/* 1006 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(dh paramdh) {
/* 1010 */     String str = W();
/* 1011 */     if ((this.K) || (str == null) || (this.l != null)) {
/* 1012 */       return false;
/*      */     }
/* 1014 */     paramdh.a("id", str);
/* 1015 */     e(paramdh);
/* 1016 */     return true;
/*      */   }
/*      */   
/*      */   public void e(dh paramdh) {
/*      */     try {
/* 1021 */       paramdh.a("Pos", a(new double[] { this.s, this.t + this.V, this.u }));
/* 1022 */       paramdh.a("Motion", a(new double[] { this.v, this.w, this.x }));
/* 1023 */       paramdh.a("Rotation", a(new float[] { this.y, this.z }));
/*      */       
/* 1025 */       paramdh.a("FallDistance", this.R);
/* 1026 */       paramdh.a("Fire", (short)this.e);
/* 1027 */       paramdh.a("Air", (short)ar());
/* 1028 */       paramdh.a("OnGround", this.D);
/* 1029 */       paramdh.a("Dimension", this.ap);
/* 1030 */       paramdh.a("Invulnerable", this.i);
/* 1031 */       paramdh.a("PortalCooldown", this.am);
/*      */       
/* 1033 */       paramdh.a("UUIDMost", aB().getMostSignificantBits());
/* 1034 */       paramdh.a("UUIDLeast", aB().getLeastSignificantBits());
/*      */       
/* 1036 */       b(paramdh);
/*      */       
/* 1038 */       if (this.m != null) {
/* 1039 */         dh localdh = new dh();
/* 1040 */         if (this.m.c(localdh)) {
/* 1041 */           paramdh.a("Riding", localdh);
/*      */         }
/*      */       }
/*      */     } catch (Throwable localThrowable) {
/* 1045 */       b localb = b.a(localThrowable, "Saving entity NBT");
/* 1046 */       k localk = localb.a("Entity being saved");
/* 1047 */       a(localk);
/* 1048 */       throw new s(localb);
/*      */     }
/*      */   }
/*      */   
/*      */   public void f(dh paramdh) {
/*      */     try {
/* 1054 */       dq localdq = paramdh.c("Pos", 6);
/* 1055 */       localObject1 = paramdh.c("Motion", 6);
/* 1056 */       localObject2 = paramdh.c("Rotation", 5);
/*      */       
/* 1058 */       this.v = ((dq)localObject1).d(0);
/* 1059 */       this.w = ((dq)localObject1).d(1);
/* 1060 */       this.x = ((dq)localObject1).d(2);
/*      */       
/* 1062 */       if (Math.abs(this.v) > 10.0D) {
/* 1063 */         this.v = 0.0D;
/*      */       }
/* 1065 */       if (Math.abs(this.w) > 10.0D) {
/* 1066 */         this.w = 0.0D;
/*      */       }
/* 1068 */       if (Math.abs(this.x) > 10.0D) {
/* 1069 */         this.x = 0.0D;
/*      */       }
/*      */       
/* 1072 */       this.p = (this.S = this.s = localdq.d(0));
/* 1073 */       this.q = (this.T = this.t = localdq.d(1));
/* 1074 */       this.r = (this.U = this.u = localdq.d(2));
/*      */       
/* 1076 */       this.A = (this.y = ((dq)localObject2).e(0));
/* 1077 */       this.B = (this.z = ((dq)localObject2).e(1));
/*      */       
/* 1079 */       this.R = paramdh.h("FallDistance");
/* 1080 */       this.e = paramdh.e("Fire");
/* 1081 */       h(paramdh.e("Air"));
/* 1082 */       this.D = paramdh.n("OnGround");
/* 1083 */       this.ap = paramdh.f("Dimension");
/* 1084 */       this.i = paramdh.n("Invulnerable");
/* 1085 */       this.am = paramdh.f("PortalCooldown");
/*      */       
/* 1087 */       if ((paramdh.b("UUIDMost", 4)) && (paramdh.b("UUIDLeast", 4))) {
/* 1088 */         this.ar = new UUID(paramdh.g("UUIDMost"), paramdh.g("UUIDLeast"));
/*      */       }
/*      */       
/* 1091 */       b(this.s, this.t, this.u);
/* 1092 */       b(this.y, this.z);
/*      */       
/* 1094 */       a(paramdh);
/*      */       
/* 1096 */       if (V()) b(this.s, this.t, this.u);
/*      */     } catch (Throwable localThrowable) {
/* 1098 */       Object localObject1 = b.a(localThrowable, "Loading entity NBT");
/* 1099 */       Object localObject2 = ((b)localObject1).a("Entity being loaded");
/* 1100 */       a((k)localObject2);
/* 1101 */       throw new s((b)localObject1);
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean V() {
/* 1106 */     return true;
/*      */   }
/*      */   
/*      */   protected final String W() {
/* 1110 */     return sg.b(this);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   protected abstract void a(dh paramdh);
/*      */   
/*      */ 
/*      */   protected abstract void b(dh paramdh);
/*      */   
/*      */ 
/*      */   public void X() {}
/*      */   
/*      */ 
/*      */   protected dq a(double... paramVarArgs)
/*      */   {
/* 1126 */     dq localdq = new dq();
/* 1127 */     for (double d1 : paramVarArgs)
/* 1128 */       localdq.a(new dk(d1));
/* 1129 */     return localdq;
/*      */   }
/*      */   
/*      */   protected dq a(float... paramVarArgs)
/*      */   {
/* 1134 */     dq localdq = new dq();
/* 1135 */     for (float f1 : paramVarArgs)
/* 1136 */       localdq.a(new dm(f1));
/* 1137 */     return localdq;
/*      */   }
/*      */   
/*      */   public float Y() {
/* 1141 */     return this.N / 2.0F;
/*      */   }
/*      */   
/*      */   public xk a(adb paramadb, int paramInt) {
/* 1145 */     return a(paramadb, paramInt, 0.0F);
/*      */   }
/*      */   
/*      */   public xk a(adb paramadb, int paramInt, float paramFloat) {
/* 1149 */     return a(new add(paramadb, paramInt, 0), paramFloat);
/*      */   }
/*      */   
/*      */   public xk a(add paramadd, float paramFloat) {
/* 1153 */     if ((paramadd.b == 0) || (paramadd.b() == null)) {
/* 1154 */       return null;
/*      */     }
/*      */     
/* 1157 */     xk localxk = new xk(this.o, this.s, this.t + paramFloat, this.u, paramadd);
/* 1158 */     localxk.b = 10;
/* 1159 */     this.o.d(localxk);
/* 1160 */     return localxk;
/*      */   }
/*      */   
/*      */   public boolean Z() {
/* 1164 */     return !this.K;
/*      */   }
/*      */   
/*      */   public boolean aa() {
/* 1168 */     for (int i1 = 0; i1 < 8; i1++) {
/* 1169 */       float f1 = ((i1 >> 0) % 2 - 0.5F) * this.M * 0.8F;
/* 1170 */       float f2 = ((i1 >> 1) % 2 - 0.5F) * 0.1F;
/* 1171 */       float f3 = ((i1 >> 2) % 2 - 0.5F) * this.M * 0.8F;
/* 1172 */       int i2 = qh.c(this.s + f1);
/* 1173 */       int i3 = qh.c(this.t + g() + f2);
/* 1174 */       int i4 = qh.c(this.u + f3);
/* 1175 */       if (this.o.a(i2, i3, i4).r()) {
/* 1176 */         return true;
/*      */       }
/*      */     }
/* 1179 */     return false;
/*      */   }
/*      */   
/*      */   public boolean c(yz paramyz) {
/* 1183 */     return false;
/*      */   }
/*      */   
/*      */   public azt h(sa paramsa) {
/* 1187 */     return null;
/*      */   }
/*      */   
/*      */   public void ab() {
/* 1191 */     if (this.m.K) {
/* 1192 */       this.m = null;
/* 1193 */       return;
/*      */     }
/* 1195 */     this.v = 0.0D;
/* 1196 */     this.w = 0.0D;
/* 1197 */     this.x = 0.0D;
/* 1198 */     h();
/* 1199 */     if (this.m == null) { return;
/*      */     }
/* 1201 */     this.m.ac();
/*      */     
/* 1203 */     this.h += this.m.y - this.m.A;
/* 1204 */     this.g += this.m.z - this.m.B;
/*      */     
/* 1206 */     while (this.h >= 180.0D)
/* 1207 */       this.h -= 360.0D;
/* 1208 */     while (this.h < -180.0D) {
/* 1209 */       this.h += 360.0D;
/*      */     }
/* 1211 */     while (this.g >= 180.0D)
/* 1212 */       this.g -= 360.0D;
/* 1213 */     while (this.g < -180.0D) {
/* 1214 */       this.g += 360.0D;
/*      */     }
/* 1216 */     double d1 = this.h * 0.5D;
/* 1217 */     double d2 = this.g * 0.5D;
/*      */     
/* 1219 */     float f1 = 10.0F;
/* 1220 */     if (d1 > f1) d1 = f1;
/* 1221 */     if (d1 < -f1) d1 = -f1;
/* 1222 */     if (d2 > f1) d2 = f1;
/* 1223 */     if (d2 < -f1) { d2 = -f1;
/*      */     }
/* 1225 */     this.h -= d1;
/* 1226 */     this.g -= d2;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void ac()
/*      */   {
/* 1235 */     if (this.l == null) {
/* 1236 */       return;
/*      */     }
/* 1238 */     this.l.b(this.s, this.t + ae() + this.l.ad(), this.u);
/*      */   }
/*      */   
/*      */   public double ad() {
/* 1242 */     return this.L;
/*      */   }
/*      */   
/*      */   public double ae() {
/* 1246 */     return this.N * 0.75D;
/*      */   }
/*      */   
/*      */   public void a(sa paramsa) {
/* 1250 */     this.g = 0.0D;
/* 1251 */     this.h = 0.0D;
/*      */     
/* 1253 */     if (paramsa == null) {
/* 1254 */       if (this.m != null) {
/* 1255 */         b(this.m.s, this.m.C.b + this.m.N, this.m.u, this.y, this.z);
/* 1256 */         this.m.l = null;
/*      */       }
/* 1258 */       this.m = null;
/* 1259 */       return;
/*      */     }
/* 1261 */     if (this.m != null) {
/* 1262 */       this.m.l = null;
/*      */     }
/*      */     
/*      */ 
/* 1266 */     if (paramsa != null) {
/* 1267 */       sa localsa = paramsa.m;
/* 1268 */       while (localsa != null) {
/* 1269 */         if (localsa == this)
/*      */         {
/* 1271 */           return;
/*      */         }
/* 1273 */         localsa = localsa.m;
/*      */       }
/*      */     }
/* 1276 */     this.m = paramsa;
/* 1277 */     paramsa.l = this;
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt) {
/* 1281 */     b(paramDouble1, paramDouble2, paramDouble3);
/* 1282 */     b(paramFloat1, paramFloat2);
/*      */     
/* 1284 */     List localList = this.o.a(this, this.C.e(0.03125D, 0.0D, 0.03125D));
/* 1285 */     if (!localList.isEmpty()) {
/* 1286 */       double d1 = 0.0D;
/* 1287 */       for (int i1 = 0; i1 < localList.size(); i1++) {
/* 1288 */         azt localazt = (azt)localList.get(i1);
/* 1289 */         if (localazt.e > d1) { d1 = localazt.e;
/*      */         }
/*      */       }
/* 1292 */       paramDouble2 += d1 - this.C.b;
/* 1293 */       b(paramDouble1, paramDouble2, paramDouble3);
/*      */     }
/*      */   }
/*      */   
/*      */   public float af() {
/* 1298 */     return 0.1F;
/*      */   }
/*      */   
/*      */   public azw ag() {
/* 1302 */     return null;
/*      */   }
/*      */   
/*      */   public void ah() {
/* 1306 */     if (this.am > 0) {
/* 1307 */       this.am = ai();
/* 1308 */       return;
/*      */     }
/*      */     
/* 1311 */     double d1 = this.p - this.s;
/* 1312 */     double d2 = this.r - this.u;
/*      */     
/* 1314 */     if ((!this.o.E) && (!this.an)) {
/* 1315 */       this.aq = p.a(d1, d2);
/*      */     }
/*      */     
/* 1318 */     this.an = true;
/*      */   }
/*      */   
/*      */   public int ai() {
/* 1322 */     return 300;
/*      */   }
/*      */   
/*      */   public void i(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 1326 */     this.v = paramDouble1;
/* 1327 */     this.w = paramDouble2;
/* 1328 */     this.x = paramDouble3;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(byte paramByte) {}
/*      */   
/*      */   public void aj() {}
/*      */   
/*      */   public add[] ak()
/*      */   {
/* 1338 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */   public void c(int paramInt, add paramadd) {}
/*      */   
/*      */   public boolean al()
/*      */   {
/* 1346 */     int i1 = (this.o != null) && (this.o.E) ? 1 : 0;
/*      */     
/* 1348 */     return (!this.ae) && ((this.e > 0) || ((i1 != 0) && (g(0))));
/*      */   }
/*      */   
/*      */   public boolean am() {
/* 1352 */     return this.m != null;
/*      */   }
/*      */   
/*      */   public boolean an() {
/* 1356 */     return g(1);
/*      */   }
/*      */   
/*      */   public void b(boolean paramBoolean) {
/* 1360 */     a(1, paramBoolean);
/*      */   }
/*      */   
/*      */   public boolean ao() {
/* 1364 */     return g(3);
/*      */   }
/*      */   
/*      */   public void c(boolean paramBoolean) {
/* 1368 */     a(3, paramBoolean);
/*      */   }
/*      */   
/*      */   public boolean ap() {
/* 1372 */     return g(5);
/*      */   }
/*      */   
/*      */   public boolean d(yz paramyz) {
/* 1376 */     return ap();
/*      */   }
/*      */   
/*      */   public void d(boolean paramBoolean) {
/* 1380 */     a(5, paramBoolean);
/*      */   }
/*      */   
/*      */   public boolean aq() {
/* 1384 */     return g(4);
/*      */   }
/*      */   
/*      */   public void e(boolean paramBoolean) {
/* 1388 */     a(4, paramBoolean);
/*      */   }
/*      */   
/*      */   protected boolean g(int paramInt) {
/* 1392 */     return (this.af.a(0) & 1 << paramInt) != 0;
/*      */   }
/*      */   
/*      */   protected void a(int paramInt, boolean paramBoolean) {
/* 1396 */     int i1 = this.af.a(0);
/* 1397 */     if (paramBoolean) {
/* 1398 */       this.af.b(0, Byte.valueOf((byte)(i1 | 1 << paramInt)));
/*      */     } else {
/* 1400 */       this.af.b(0, Byte.valueOf((byte)(i1 & (1 << paramInt ^ 0xFFFFFFFF))));
/*      */     }
/*      */   }
/*      */   
/*      */   public int ar() {
/* 1405 */     return this.af.b(1);
/*      */   }
/*      */   
/*      */   public void h(int paramInt) {
/* 1409 */     this.af.b(1, Short.valueOf((short)paramInt));
/*      */   }
/*      */   
/*      */   public void a(xh paramxh) {
/* 1413 */     f(5);
/* 1414 */     this.e += 1;
/* 1415 */     if (this.e == 0) e(8);
/*      */   }
/*      */   
/*      */   public void a(sv paramsv) {}
/*      */   
/*      */   protected boolean j(double paramDouble1, double paramDouble2, double paramDouble3)
/*      */   {
/* 1422 */     int i1 = qh.c(paramDouble1);
/* 1423 */     int i2 = qh.c(paramDouble2);
/* 1424 */     int i3 = qh.c(paramDouble3);
/*      */     
/* 1426 */     double d1 = paramDouble1 - i1;
/* 1427 */     double d2 = paramDouble2 - i2;
/* 1428 */     double d3 = paramDouble3 - i3;
/*      */     
/* 1430 */     List localList = this.o.a(this.C);
/*      */     
/* 1432 */     if ((!localList.isEmpty()) || (this.o.q(i1, i2, i3))) {
/* 1433 */       int i4 = !this.o.q(i1 - 1, i2, i3) ? 1 : 0;
/* 1434 */       int i5 = !this.o.q(i1 + 1, i2, i3) ? 1 : 0;
/* 1435 */       int i6 = !this.o.q(i1, i2 - 1, i3) ? 1 : 0;
/* 1436 */       int i7 = !this.o.q(i1, i2 + 1, i3) ? 1 : 0;
/* 1437 */       int i8 = !this.o.q(i1, i2, i3 - 1) ? 1 : 0;
/* 1438 */       int i9 = !this.o.q(i1, i2, i3 + 1) ? 1 : 0;
/*      */       
/* 1440 */       int i10 = 3;
/* 1441 */       double d4 = 9999.0D;
/* 1442 */       if ((i4 != 0) && (d1 < d4)) {
/* 1443 */         d4 = d1;
/* 1444 */         i10 = 0;
/*      */       }
/* 1446 */       if ((i5 != 0) && (1.0D - d1 < d4)) {
/* 1447 */         d4 = 1.0D - d1;
/* 1448 */         i10 = 1;
/*      */       }
/* 1450 */       if ((i7 != 0) && (1.0D - d2 < d4)) {
/* 1451 */         d4 = 1.0D - d2;
/* 1452 */         i10 = 3;
/*      */       }
/* 1454 */       if ((i8 != 0) && (d3 < d4)) {
/* 1455 */         d4 = d3;
/* 1456 */         i10 = 4;
/*      */       }
/* 1458 */       if ((i9 != 0) && (1.0D - d3 < d4)) {
/* 1459 */         d4 = 1.0D - d3;
/* 1460 */         i10 = 5;
/*      */       }
/*      */       
/* 1463 */       float f1 = this.Z.nextFloat() * 0.2F + 0.1F;
/* 1464 */       if (i10 == 0) this.v = (-f1);
/* 1465 */       if (i10 == 1) { this.v = f1;
/*      */       }
/* 1467 */       if (i10 == 2) {
/* 1468 */         this.w = (-f1);
/*      */       }
/* 1470 */       if (i10 == 3) { this.w = f1;
/*      */       }
/* 1472 */       if (i10 == 4) this.x = (-f1);
/* 1473 */       if (i10 == 5) this.x = f1;
/* 1474 */       return true;
/*      */     }
/*      */     
/* 1477 */     return false;
/*      */   }
/*      */   
/*      */   public void as() {
/* 1481 */     this.I = true;
/* 1482 */     this.R = 0.0F;
/*      */   }
/*      */   
/*      */   public String b_()
/*      */   {
/* 1487 */     String str = sg.b(this);
/* 1488 */     if (str == null) { str = "generic";
/*      */     }
/* 1490 */     return dd.a("entity." + str + ".name");
/*      */   }
/*      */   
/*      */   public sa[] at() {
/* 1494 */     return null;
/*      */   }
/*      */   
/*      */   public boolean i(sa paramsa)
/*      */   {
/* 1499 */     return this == paramsa;
/*      */   }
/*      */   
/*      */   public float au() {
/* 1503 */     return 0.0F;
/*      */   }
/*      */   
/*      */   public void e(float paramFloat) {}
/*      */   
/*      */   public boolean av()
/*      */   {
/* 1510 */     return true;
/*      */   }
/*      */   
/*      */   public boolean j(sa paramsa) {
/* 1514 */     return false;
/*      */   }
/*      */   
/*      */   public String toString()
/*      */   {
/* 1519 */     return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), b_(), Integer.valueOf(this.c), this.o == null ? "~NULL~" : this.o.N().k(), Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) });
/*      */   }
/*      */   
/*      */   public boolean aw() {
/* 1523 */     return this.i;
/*      */   }
/*      */   
/*      */   public void k(sa paramsa) {
/* 1527 */     b(paramsa.s, paramsa.t, paramsa.u, paramsa.y, paramsa.z);
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, boolean paramBoolean) {
/* 1531 */     dh localdh = new dh();
/* 1532 */     paramsa.e(localdh);
/* 1533 */     f(localdh);
/* 1534 */     this.am = paramsa.am;
/* 1535 */     this.aq = paramsa.aq;
/*      */   }
/*      */   
/*      */   public void b(int paramInt) {
/* 1539 */     if ((this.o.E) || (this.K)) return;
/* 1540 */     this.o.C.a("changeDimension");
/*      */     
/* 1542 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 1543 */     int i1 = this.ap;
/* 1544 */     mt localmt1 = localMinecraftServer.a(i1);
/* 1545 */     mt localmt2 = localMinecraftServer.a(paramInt);
/* 1546 */     this.ap = paramInt;
/*      */     
/* 1548 */     if ((i1 == 1) && (paramInt == 1)) {
/* 1549 */       localmt2 = localMinecraftServer.a(0);
/* 1550 */       this.ap = 0;
/*      */     }
/*      */     
/* 1553 */     this.o.e(this);
/* 1554 */     this.K = false;
/* 1555 */     this.o.C.a("reposition");
/* 1556 */     localMinecraftServer.ah().a(this, i1, localmt1, localmt2);
/* 1557 */     this.o.C.c("reloading");
/* 1558 */     sa localsa = sg.a(sg.b(this), localmt2);
/*      */     
/* 1560 */     if (localsa != null) {
/* 1561 */       localsa.a(this, true);
/*      */       
/* 1563 */       if ((i1 == 1) && (paramInt == 1)) {
/* 1564 */         r localr = localmt2.K();
/* 1565 */         localr.b = this.o.i(localr.a, localr.c);
/* 1566 */         localsa.b(localr.a, localr.b, localr.c, localsa.y, localsa.z);
/*      */       }
/*      */       
/* 1569 */       localmt2.d(localsa);
/*      */     }
/*      */     
/* 1572 */     this.K = true;
/* 1573 */     this.o.C.b();
/*      */     
/* 1575 */     localmt1.i();
/* 1576 */     localmt2.i();
/* 1577 */     this.o.C.b();
/*      */   }
/*      */   
/*      */   public float a(agw paramagw, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/* 1581 */     return paramaji.a(this);
/*      */   }
/*      */   
/*      */   public boolean a(agw paramagw, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, float paramFloat) {
/* 1585 */     return true;
/*      */   }
/*      */   
/*      */   public int ax() {
/* 1589 */     return 3;
/*      */   }
/*      */   
/*      */   public int ay() {
/* 1593 */     return this.aq;
/*      */   }
/*      */   
/*      */   public boolean az() {
/* 1597 */     return false;
/*      */   }
/*      */   
/*      */   public void a(k paramk) {
/* 1601 */     paramk.a("Entity Type", new sb(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1607 */     paramk.a("Entity ID", Integer.valueOf(this.c));
/* 1608 */     paramk.a("Entity Name", new sc(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1614 */     paramk.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) }));
/* 1615 */     paramk.a("Entity's Block location", k.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)));
/* 1616 */     paramk.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.v), Double.valueOf(this.w), Double.valueOf(this.x) }));
/*      */   }
/*      */   
/*      */   public boolean aA() {
/* 1620 */     return al();
/*      */   }
/*      */   
/*      */   public UUID aB()
/*      */   {
/* 1625 */     return this.ar;
/*      */   }
/*      */   
/*      */   public boolean aC() {
/* 1629 */     return true;
/*      */   }
/*      */   
/*      */   public fj c_()
/*      */   {
/* 1634 */     return new fq(b_());
/*      */   }
/*      */   
/*      */   public void i(int paramInt) {}
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */