/*      */ import com.google.common.collect.Maps;
/*      */ import java.nio.IntBuffer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.opengl.ARBOcclusionQuery;
/*      */ import org.lwjgl.opengl.GL11;
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
/*      */ public class bma
/*      */   implements ahh
/*      */ {
/*   40 */   private static final Logger m = ;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   49 */   private static final bqx n = new bqx("textures/environment/moon_phases.png");
/*   50 */   private static final bqx o = new bqx("textures/environment/sun.png");
/*   51 */   private static final bqx p = new bqx("textures/environment/clouds.png");
/*   52 */   private static final bqx q = new bqx("textures/environment/end_sky.png");
/*      */   
/*      */ 
/*      */ 
/*   56 */   public List a = new ArrayList();
/*      */   
/*      */   private bjf r;
/*      */   
/*      */   private final bqf s;
/*   61 */   private List t = new ArrayList();
/*      */   private blo[] u;
/*      */   private blo[] v;
/*      */   private int w;
/*      */   private int x;
/*      */   private int y;
/*      */   private int z;
/*      */   private bao A;
/*      */   private blm B;
/*      */   private IntBuffer C;
/*      */   private boolean D;
/*      */   private int E;
/*      */   private int F;
/*      */   private int G;
/*   75 */   private int H; private int I; private int J; private int K; private int L; private int M; private int N; private final Map O = new HashMap();
/*   76 */   private final Map P = Maps.newHashMap();
/*      */   private rf[] Q;
/*      */   private boolean R;
/*      */   private int S;
/*      */   
/*      */   public bma(bao parambao)
/*      */   {
/*   83 */     this.A = parambao;
/*   84 */     this.s = parambao.P();
/*   85 */     int i1 = 34;
/*   86 */     int i2 = 16;
/*   87 */     this.z = ban.a(i1 * i1 * i2 * 3);
/*      */     
/*   89 */     this.R = false;
/*   90 */     this.S = ban.a(1);
/*      */     
/*   92 */     this.D = bbh.a();
/*   93 */     if (this.D) {
/*   94 */       this.b.clear();
/*   95 */       this.C = ban.f(i1 * i1 * i2);
/*   96 */       this.C.clear();
/*   97 */       this.C.position(0);
/*   98 */       this.C.limit(i1 * i1 * i2);
/*   99 */       ARBOcclusionQuery.glGenQueriesARB(this.C);
/*      */     }
/*      */     
/*  102 */     this.F = ban.a(3);
/*      */     
/*  104 */     GL11.glPushMatrix();
/*  105 */     GL11.glNewList(this.F, 4864);
/*  106 */     i();
/*  107 */     GL11.glEndList();
/*  108 */     GL11.glPopMatrix();
/*      */     
/*  110 */     bmh localbmh = bmh.a;
/*  111 */     this.G = (this.F + 1);
/*  112 */     GL11.glNewList(this.G, 4864);
/*      */     
/*  114 */     int i3 = 64;
/*  115 */     int i4 = 256 / i3 + 2;
/*  116 */     float f1 = 16.0F;
/*  117 */     int i6; for (int i5 = -i3 * i4; i5 <= i3 * i4; i5 += i3) {
/*  118 */       for (i6 = -i3 * i4; i6 <= i3 * i4; i6 += i3) {
/*  119 */         localbmh.b();
/*  120 */         localbmh.a(i5 + 0, f1, i6 + 0);
/*  121 */         localbmh.a(i5 + i3, f1, i6 + 0);
/*  122 */         localbmh.a(i5 + i3, f1, i6 + i3);
/*  123 */         localbmh.a(i5 + 0, f1, i6 + i3);
/*  124 */         localbmh.a();
/*      */       }
/*      */     }
/*  127 */     GL11.glEndList();
/*      */     
/*  129 */     this.H = (this.F + 2);
/*  130 */     GL11.glNewList(this.H, 4864);
/*  131 */     f1 = -16.0F;
/*  132 */     localbmh.b();
/*  133 */     for (i5 = -i3 * i4; i5 <= i3 * i4; i5 += i3) {
/*  134 */       for (i6 = -i3 * i4; i6 <= i3 * i4; i6 += i3) {
/*  135 */         localbmh.a(i5 + i3, f1, i6 + 0);
/*  136 */         localbmh.a(i5 + 0, f1, i6 + 0);
/*  137 */         localbmh.a(i5 + 0, f1, i6 + i3);
/*  138 */         localbmh.a(i5 + i3, f1, i6 + i3);
/*      */       }
/*      */     }
/*  141 */     localbmh.a();
/*  142 */     GL11.glEndList();
/*      */   }
/*      */   
/*      */   private void i() {
/*  146 */     Random localRandom = new Random(10842L);
/*  147 */     bmh localbmh = bmh.a;
/*  148 */     localbmh.b();
/*  149 */     for (int i1 = 0; i1 < 1500; i1++) {
/*  150 */       double d1 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  151 */       double d2 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  152 */       double d3 = localRandom.nextFloat() * 2.0F - 1.0F;
/*  153 */       double d4 = 0.15F + localRandom.nextFloat() * 0.1F;
/*  154 */       double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*  155 */       if ((d5 < 1.0D) && (d5 > 0.01D)) {
/*  156 */         d5 = 1.0D / Math.sqrt(d5);
/*  157 */         d1 *= d5;
/*  158 */         d2 *= d5;
/*  159 */         d3 *= d5;
/*  160 */         double d6 = d1 * 100.0D;
/*  161 */         double d7 = d2 * 100.0D;
/*  162 */         double d8 = d3 * 100.0D;
/*      */         
/*  164 */         double d9 = Math.atan2(d1, d3);
/*  165 */         double d10 = Math.sin(d9);
/*  166 */         double d11 = Math.cos(d9);
/*      */         
/*  168 */         double d12 = Math.atan2(Math.sqrt(d1 * d1 + d3 * d3), d2);
/*  169 */         double d13 = Math.sin(d12);
/*  170 */         double d14 = Math.cos(d12);
/*      */         
/*  172 */         double d15 = localRandom.nextDouble() * 3.141592653589793D * 2.0D;
/*  173 */         double d16 = Math.sin(d15);
/*  174 */         double d17 = Math.cos(d15);
/*      */         
/*  176 */         for (int i2 = 0; i2 < 4; i2++) {
/*  177 */           double d18 = 0.0D;
/*  178 */           double d19 = ((i2 & 0x2) - 1) * d4;
/*  179 */           double d20 = ((i2 + 1 & 0x2) - 1) * d4;
/*      */           
/*  181 */           double d21 = d18;
/*  182 */           double d22 = d19 * d17 - d20 * d16;
/*  183 */           double d23 = d20 * d17 + d19 * d16;
/*      */           
/*  185 */           double d24 = d23;
/*  186 */           double d25 = d22 * d13 + d21 * d14;
/*  187 */           double d26 = d21 * d13 - d22 * d14;
/*      */           
/*  189 */           double d27 = d26 * d10 - d24 * d11;
/*  190 */           double d28 = d25;
/*  191 */           double d29 = d24 * d10 + d26 * d11;
/*      */           
/*  193 */           localbmh.a(d6 + d27, d7 + d28, d8 + d29);
/*      */         }
/*      */       }
/*      */     }
/*  197 */     localbmh.a();
/*      */   }
/*      */   
/*      */   public void a(bjf parambjf) {
/*  201 */     if (this.r != null) {
/*  202 */       this.r.b(this);
/*      */     }
/*      */     
/*  205 */     this.c = -9999.0D;
/*  206 */     this.d = -9999.0D;
/*  207 */     this.e = -9999.0D;
/*  208 */     this.f = -9999.0D;
/*  209 */     this.g = -9999.0D;
/*  210 */     this.h = -9999.0D;
/*  211 */     this.i = 55537;
/*  212 */     this.j = 55537;
/*  213 */     this.k = 55537;
/*      */     
/*  215 */     bnn.a.a(parambjf);
/*  216 */     this.r = parambjf;
/*  217 */     this.B = new blm(parambjf);
/*  218 */     if (parambjf != null) {
/*  219 */       parambjf.a(this);
/*  220 */       a();
/*      */     }
/*      */   }
/*      */   
/*  224 */   private int T = -1;
/*      */   
/*      */   public void a()
/*      */   {
/*  228 */     if (this.r == null) {
/*  229 */       return;
/*      */     }
/*      */     
/*  232 */     ajn.t.b(this.A.u.i);
/*  233 */     ajn.u.b(this.A.u.i);
/*      */     
/*  235 */     this.T = this.A.u.c;
/*  236 */     if (this.v != null) {
/*  237 */       for (i1 = 0; i1 < this.v.length; i1++) {
/*  238 */         this.v[i1].b();
/*      */       }
/*      */     }
/*      */     
/*  242 */     int i1 = this.T * 2 + 1;
/*  243 */     this.w = i1;
/*  244 */     this.x = 16;
/*  245 */     this.y = i1;
/*      */     
/*  247 */     this.v = new blo[this.w * this.x * this.y];
/*  248 */     this.u = new blo[this.w * this.x * this.y];
/*  249 */     int i2 = 0;
/*  250 */     int i3 = 0;
/*      */     
/*  252 */     this.I = 0;
/*  253 */     this.J = 0;
/*  254 */     this.K = 0;
/*  255 */     this.L = this.w;
/*  256 */     this.M = this.x;
/*  257 */     this.N = this.y;
/*  258 */     for (int i4 = 0; i4 < this.t.size(); i4++) {
/*  259 */       ((blo)this.t.get(i4)).q = false;
/*      */     }
/*  261 */     this.t.clear();
/*      */     
/*  263 */     this.a.clear();
/*  264 */     b();
/*      */     
/*  266 */     for (i4 = 0; i4 < this.w; i4++) {
/*  267 */       for (int i5 = 0; i5 < this.x; i5++) {
/*  268 */         for (int i6 = 0; i6 < this.y; i6++) {
/*  269 */           this.v[((i6 * this.x + i5) * this.w + i4)] = new blo(this.r, this.a, i4 * 16, i5 * 16, i6 * 16, this.z + i2);
/*  270 */           if (this.D) {
/*  271 */             this.v[((i6 * this.x + i5) * this.w + i4)].v = this.C.get(i3);
/*      */           }
/*  273 */           this.v[((i6 * this.x + i5) * this.w + i4)].u = false;
/*  274 */           this.v[((i6 * this.x + i5) * this.w + i4)].t = true;
/*  275 */           this.v[((i6 * this.x + i5) * this.w + i4)].l = true;
/*  276 */           this.v[((i6 * this.x + i5) * this.w + i4)].s = (i3++);
/*  277 */           this.v[((i6 * this.x + i5) * this.w + i4)].e();
/*  278 */           this.u[((i6 * this.x + i5) * this.w + i4)] = this.v[((i6 * this.x + i5) * this.w + i4)];
/*  279 */           this.t.add(this.v[((i6 * this.x + i5) * this.w + i4)]);
/*      */           
/*  281 */           i2 += 3;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  286 */     if (this.r != null) {
/*  287 */       sv localsv = this.A.i;
/*  288 */       if (localsv != null) {
/*  289 */         c(qh.c(localsv.s), qh.c(localsv.t), qh.c(localsv.u));
/*  290 */         Arrays.sort(this.u, new blq(localsv));
/*      */       }
/*      */     }
/*  293 */     this.U = 2;
/*      */   }
/*      */   
/*  296 */   private int U = 2;
/*      */   private int V;
/*      */   private int W;
/*      */   private int X;
/*      */   
/*      */   public void a(sv paramsv, bmv parambmv, float paramFloat) {
/*  302 */     if (this.U > 0) {
/*  303 */       this.U -= 1;
/*  304 */       return;
/*      */     }
/*      */     
/*  307 */     double d1 = paramsv.p + (paramsv.s - paramsv.p) * paramFloat;
/*  308 */     double d2 = paramsv.q + (paramsv.t - paramsv.q) * paramFloat;
/*  309 */     double d3 = paramsv.r + (paramsv.u - paramsv.r) * paramFloat;
/*      */     
/*  311 */     this.r.C.a("prepare");
/*  312 */     bmk.a.a(this.r, this.A.P(), this.A.l, this.A.i, paramFloat);
/*  313 */     bnn.a.a(this.r, this.A.P(), this.A.l, this.A.i, this.A.j, this.A.u, paramFloat);
/*      */     
/*  315 */     this.V = 0;
/*  316 */     this.W = 0;
/*  317 */     this.X = 0;
/*      */     
/*  319 */     sv localsv = this.A.i;
/*  320 */     double d4 = localsv.S + (localsv.s - localsv.S) * paramFloat;
/*  321 */     double d5 = localsv.T + (localsv.t - localsv.T) * paramFloat;
/*  322 */     double d6 = localsv.U + (localsv.u - localsv.U) * paramFloat;
/*  323 */     bmk.b = d4;
/*  324 */     bmk.c = d5;
/*  325 */     bmk.d = d6;
/*      */     
/*  327 */     this.r.C.c("staticentities");
/*  328 */     if (this.R) {
/*  329 */       bnn.b = 0.0D;
/*  330 */       bnn.c = 0.0D;
/*  331 */       bnn.d = 0.0D;
/*  332 */       f();
/*      */     }
/*  334 */     GL11.glMatrixMode(5888);
/*  335 */     GL11.glPushMatrix();
/*  336 */     GL11.glTranslated(-d4, -d5, -d6);
/*  337 */     GL11.glCallList(this.S);
/*  338 */     GL11.glPopMatrix();
/*      */     
/*  340 */     bnn.b = d4;
/*  341 */     bnn.c = d5;
/*  342 */     bnn.d = d6;
/*      */     
/*  344 */     this.A.p.b(paramFloat);
/*      */     
/*  346 */     this.r.C.c("global");
/*  347 */     List localList = this.r.D();
/*  348 */     this.V = localList.size();
/*  349 */     sa localsa1; for (int i1 = 0; i1 < this.r.i.size(); i1++) {
/*  350 */       localsa1 = (sa)this.r.i.get(i1);
/*  351 */       this.W += 1;
/*  352 */       if (localsa1.h(d1, d2, d3)) { bnn.a.a(localsa1, paramFloat);
/*      */       }
/*      */     }
/*  355 */     this.r.C.c("entities");
/*  356 */     for (i1 = 0; i1 < localList.size(); i1++) {
/*  357 */       localsa1 = (sa)localList.get(i1);
/*      */       
/*  359 */       boolean bool = (localsa1.h(d1, d2, d3)) && ((localsa1.ak) || (parambmv.a(localsa1.C)) || (localsa1.l == this.A.h));
/*      */       
/*      */ 
/*  362 */       if ((!bool) && ((localsa1 instanceof sw))) {
/*  363 */         sw localsw = (sw)localsa1;
/*  364 */         if ((localsw.bN()) && (localsw.bO() != null)) {
/*  365 */           sa localsa2 = localsw.bO();
/*  366 */           bool = parambmv.a(localsa2.C);
/*      */         }
/*      */       }
/*      */       
/*  370 */       if ((bool) && 
/*  371 */         ((localsa1 != this.A.i) || (this.A.u.aw != 0) || (this.A.i.bm())) && 
/*  372 */         (this.r.d(qh.c(localsa1.s), 0, qh.c(localsa1.u))))
/*      */       {
/*      */ 
/*  375 */         this.W += 1;
/*  376 */         bnn.a.a(localsa1, paramFloat);
/*      */       }
/*      */     }
/*      */     
/*  380 */     this.r.C.c("blockentities");
/*  381 */     bam.b();
/*  382 */     for (i1 = 0; i1 < this.a.size(); i1++) {
/*  383 */       bmk.a.a((aor)this.a.get(i1), paramFloat);
/*      */     }
/*      */     
/*  386 */     this.A.p.a(paramFloat);
/*      */     
/*  388 */     this.r.C.b();
/*      */   }
/*      */   
/*      */   public String d() {
/*  392 */     return "C: " + this.ab + "/" + this.Y + ". F: " + this.Z + ", O: " + this.aa + ", E: " + this.ac;
/*      */   }
/*      */   
/*      */   public String e() {
/*  396 */     return "E: " + this.W + "/" + this.V + ". B: " + this.X + ", I: " + (this.V - this.X - this.W);
/*      */   }
/*      */   
/*  399 */   IntBuffer b = ban.f(64);
/*      */   
/*      */   private int Y;
/*      */   private int Z;
/*      */   private int aa;
/*      */   
/*      */   public void b()
/*      */   {
/*  407 */     this.R = true;
/*      */   }
/*      */   
/*      */   public void f() {
/*  411 */     this.r.C.a("staticentityrebuild");
/*  412 */     GL11.glPushMatrix();
/*  413 */     GL11.glNewList(this.S, 4864);
/*  414 */     List localList = this.r.D();
/*  415 */     this.R = false;
/*  416 */     for (int i1 = 0; i1 < localList.size(); i1++) {
/*  417 */       sa localsa = (sa)localList.get(i1);
/*  418 */       if (bnn.a.a(localsa).a()) {
/*  419 */         this.R = ((this.R) || (!bnn.a.a(localsa, 0.0F, true)));
/*      */       }
/*      */     }
/*  422 */     GL11.glEndList();
/*  423 */     GL11.glPopMatrix();
/*  424 */     this.r.C.b();
/*      */   }
/*      */   
/*      */   private void c(int paramInt1, int paramInt2, int paramInt3) {
/*  428 */     paramInt1 -= 8;
/*  429 */     paramInt2 -= 8;
/*  430 */     paramInt3 -= 8;
/*  431 */     this.I = Integer.MAX_VALUE;
/*  432 */     this.J = Integer.MAX_VALUE;
/*  433 */     this.K = Integer.MAX_VALUE;
/*  434 */     this.L = Integer.MIN_VALUE;
/*  435 */     this.M = Integer.MIN_VALUE;
/*  436 */     this.N = Integer.MIN_VALUE;
/*      */     
/*  438 */     int i1 = this.w * 16;
/*  439 */     int i2 = i1 / 2;
/*      */     
/*  441 */     for (int i3 = 0; i3 < this.w; i3++) {
/*  442 */       int i4 = i3 * 16;
/*      */       
/*  444 */       int i5 = i4 + i2 - paramInt1;
/*  445 */       if (i5 < 0) i5 -= i1 - 1;
/*  446 */       i5 /= i1;
/*  447 */       i4 -= i5 * i1;
/*  448 */       if (i4 < this.I) this.I = i4;
/*  449 */       if (i4 > this.L) { this.L = i4;
/*      */       }
/*  451 */       for (int i6 = 0; i6 < this.y; i6++) {
/*  452 */         int i7 = i6 * 16;
/*  453 */         int i8 = i7 + i2 - paramInt3;
/*  454 */         if (i8 < 0) i8 -= i1 - 1;
/*  455 */         i8 /= i1;
/*  456 */         i7 -= i8 * i1;
/*  457 */         if (i7 < this.K) this.K = i7;
/*  458 */         if (i7 > this.N) { this.N = i7;
/*      */         }
/*  460 */         for (int i9 = 0; i9 < this.x; i9++) {
/*  461 */           int i10 = i9 * 16;
/*  462 */           if (i10 < this.J) this.J = i10;
/*  463 */           if (i10 > this.M) { this.M = i10;
/*      */           }
/*  465 */           blo localblo = this.v[((i6 * this.x + i9) * this.w + i3)];
/*  466 */           boolean bool = localblo.q;
/*  467 */           localblo.a(i4, i10, i7);
/*  468 */           if ((!bool) && (localblo.q))
/*  469 */             this.t.add(localblo);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private int ab;
/*      */   private int ac;
/*      */   private int ad;
/*      */   private int ae;
/*  479 */   public int a(sv paramsv, int paramInt, double paramDouble) { this.r.C.a("sortchunks");
/*  480 */     for (int i1 = 0; i1 < 10; i1++) {
/*  481 */       this.ae = ((this.ae + 1) % this.v.length);
/*  482 */       blo localblo1 = this.v[this.ae];
/*  483 */       if ((localblo1.q) && (!this.t.contains(localblo1))) {
/*  484 */         this.t.add(localblo1);
/*      */       }
/*      */     }
/*      */     
/*  488 */     if (this.A.u.c != this.T) {
/*  489 */       a();
/*      */     }
/*  491 */     if (paramInt == 0) {
/*  492 */       this.Y = 0;
/*  493 */       this.ad = 0;
/*  494 */       this.Z = 0;
/*  495 */       this.aa = 0;
/*  496 */       this.ab = 0;
/*  497 */       this.ac = 0;
/*      */     }
/*      */     
/*  500 */     double d1 = paramsv.S + (paramsv.s - paramsv.S) * paramDouble;
/*  501 */     double d2 = paramsv.T + (paramsv.t - paramsv.T) * paramDouble;
/*  502 */     double d3 = paramsv.U + (paramsv.u - paramsv.U) * paramDouble;
/*      */     
/*  504 */     double d4 = paramsv.s - this.c;
/*  505 */     double d5 = paramsv.t - this.d;
/*  506 */     double d6 = paramsv.u - this.e;
/*  507 */     if ((this.i != paramsv.ah) || (this.j != paramsv.ai) || (this.k != paramsv.aj) || (d4 * d4 + d5 * d5 + d6 * d6 > 16.0D)) {
/*  508 */       this.c = paramsv.s;
/*  509 */       this.d = paramsv.t;
/*  510 */       this.e = paramsv.u;
/*  511 */       this.i = paramsv.ah;
/*  512 */       this.j = paramsv.ai;
/*  513 */       this.k = paramsv.aj;
/*      */       
/*  515 */       c(qh.c(paramsv.s), qh.c(paramsv.t), qh.c(paramsv.u));
/*  516 */       Arrays.sort(this.u, new blq(paramsv));
/*      */     }
/*      */     
/*  519 */     double d7 = paramsv.s - this.f;
/*  520 */     double d8 = paramsv.t - this.g;
/*  521 */     double d9 = paramsv.u - this.h;
/*  522 */     if (d7 * d7 + d8 * d8 + d9 * d9 > 1.0D) {
/*  523 */       this.f = paramsv.s;
/*  524 */       this.g = paramsv.t;
/*  525 */       this.h = paramsv.u;
/*      */       
/*  527 */       for (i2 = 0; i2 < 27; i2++) {
/*  528 */         this.u[i2].b(paramsv);
/*      */       }
/*      */     }
/*      */     
/*  532 */     bam.a();
/*      */     
/*  534 */     int i2 = 0;
/*  535 */     if ((this.D) && (this.A.u.f) && (!this.A.u.e) && (paramInt == 0)) {
/*  536 */       int i3 = 0;
/*  537 */       int i4 = 16;
/*  538 */       a(i3, i4);
/*  539 */       for (int i5 = i3; i5 < i4; i5++) {
/*  540 */         this.u[i5].t = true;
/*      */       }
/*      */       
/*  543 */       this.r.C.c("render");
/*  544 */       i2 += a(i3, i4, paramInt, paramDouble);
/*      */       do
/*      */       {
/*  547 */         this.r.C.c("occ");
/*  548 */         i3 = i4;
/*  549 */         i4 *= 2;
/*  550 */         if (i4 > this.u.length) { i4 = this.u.length;
/*      */         }
/*  552 */         GL11.glDisable(3553);
/*  553 */         GL11.glDisable(2896);
/*  554 */         GL11.glDisable(3008);
/*  555 */         GL11.glDisable(2912);
/*  556 */         GL11.glColorMask(false, false, false, false);
/*  557 */         GL11.glDepthMask(false);
/*      */         
/*  559 */         this.r.C.a("check");
/*  560 */         a(i3, i4);
/*  561 */         this.r.C.b();
/*  562 */         GL11.glPushMatrix();
/*  563 */         float f1 = 0.0F;
/*  564 */         float f2 = 0.0F;
/*  565 */         float f3 = 0.0F;
/*  566 */         for (int i6 = i3; i6 < i4; i6++)
/*  567 */           if (this.u[i6].d()) {
/*  568 */             this.u[i6].l = false;
/*      */           }
/*      */           else {
/*  571 */             if (!this.u[i6].l) {
/*  572 */               this.u[i6].t = true;
/*      */             }
/*      */             
/*  575 */             if ((this.u[i6].l) && (!this.u[i6].u)) {
/*  576 */               float f4 = qh.c(this.u[i6].a(paramsv));
/*      */               
/*  578 */               int i7 = (int)(1.0F + f4 / 128.0F);
/*      */               
/*  580 */               if (this.E % i7 == i6 % i7) {
/*  581 */                 blo localblo2 = this.u[i6];
/*  582 */                 float f5 = (float)(localblo2.f - d1);
/*  583 */                 float f6 = (float)(localblo2.g - d2);
/*  584 */                 float f7 = (float)(localblo2.h - d3);
/*  585 */                 float f8 = f5 - f1;
/*  586 */                 float f9 = f6 - f2;
/*  587 */                 float f10 = f7 - f3;
/*      */                 
/*  589 */                 if ((f8 != 0.0F) || (f9 != 0.0F) || (f10 != 0.0F)) {
/*  590 */                   GL11.glTranslatef(f8, f9, f10);
/*  591 */                   f1 += f8;
/*  592 */                   f2 += f9;
/*  593 */                   f3 += f10;
/*      */                 }
/*      */                 
/*  596 */                 this.r.C.a("bb");
/*  597 */                 ARBOcclusionQuery.glBeginQueryARB(35092, this.u[i6].v);
/*  598 */                 this.u[i6].c();
/*  599 */                 ARBOcclusionQuery.glEndQueryARB(35092);
/*  600 */                 this.r.C.b();
/*  601 */                 this.u[i6].u = true;
/*      */               }
/*      */             }
/*      */           }
/*  605 */         GL11.glPopMatrix();
/*      */         
/*  607 */         if (this.A.u.e) {
/*  608 */           if (blt.b == 0) GL11.glColorMask(false, true, true, true); else
/*  609 */             GL11.glColorMask(true, false, false, true);
/*      */         } else {
/*  611 */           GL11.glColorMask(true, true, true, true);
/*      */         }
/*  613 */         GL11.glDepthMask(true);
/*  614 */         GL11.glEnable(3553);
/*  615 */         GL11.glEnable(3008);
/*  616 */         GL11.glEnable(2912);
/*      */         
/*  618 */         this.r.C.c("render");
/*  619 */         i2 += a(i3, i4, paramInt, paramDouble);
/*      */       }
/*  621 */       while (i4 < this.u.length);
/*      */     }
/*      */     else {
/*  624 */       this.r.C.c("render");
/*  625 */       i2 += a(0, this.u.length, paramInt, paramDouble);
/*      */     }
/*      */     
/*  628 */     this.r.C.b();
/*  629 */     return i2;
/*      */   }
/*      */   
/*      */   private void a(int paramInt1, int paramInt2) {
/*  633 */     for (int i1 = paramInt1; i1 < paramInt2; i1++) {
/*  634 */       if (this.u[i1].u) {
/*  635 */         this.b.clear();
/*  636 */         ARBOcclusionQuery.glGetQueryObjectuARB(this.u[i1].v, 34919, this.b);
/*      */         
/*  638 */         if (this.b.get(0) != 0) {
/*  639 */           this.u[i1].u = false;
/*  640 */           this.b.clear();
/*  641 */           ARBOcclusionQuery.glGetQueryObjectuARB(this.u[i1].v, 34918, this.b);
/*  642 */           this.u[i1].t = (this.b.get(0) != 0);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*  648 */   private List af = new ArrayList();
/*      */   
/*      */   private int a(int paramInt1, int paramInt2, int paramInt3, double paramDouble) {
/*  651 */     this.af.clear();
/*  652 */     int i1 = 0;
/*  653 */     int i2 = paramInt1;
/*  654 */     int i3 = paramInt2;
/*  655 */     int i4 = 1;
/*      */     
/*  657 */     if (paramInt3 == 1)
/*      */     {
/*  659 */       i2 = this.u.length - 1 - paramInt1;
/*  660 */       i3 = this.u.length - 1 - paramInt2;
/*  661 */       i4 = -1;
/*      */     }
/*      */     
/*  664 */     for (int i5 = i2; i5 != i3; i5 += i4) {
/*  665 */       if (paramInt3 == 0) {
/*  666 */         this.Y += 1;
/*  667 */         if (this.u[i5].m[paramInt3] != 0) { this.ac += 1;
/*  668 */         } else if (!this.u[i5].l) { this.Z += 1;
/*  669 */         } else if ((this.D) && (!this.u[i5].t)) this.aa += 1; else {
/*  670 */           this.ab += 1;
/*      */         }
/*      */       }
/*  673 */       if ((this.u[i5].m[paramInt3] == 0) && (this.u[i5].l) && ((!this.D) || (this.u[i5].t))) {
/*  674 */         int i6 = this.u[i5].a(paramInt3);
/*  675 */         if (i6 >= 0) {
/*  676 */           this.af.add(this.u[i5]);
/*  677 */           i1++;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/*  682 */     sv localsv = this.A.i;
/*  683 */     double d1 = localsv.S + (localsv.s - localsv.S) * paramDouble;
/*  684 */     double d2 = localsv.T + (localsv.t - localsv.T) * paramDouble;
/*  685 */     double d3 = localsv.U + (localsv.u - localsv.U) * paramDouble;
/*      */     
/*  687 */     int i7 = 0;
/*  688 */     for (int i8 = 0; i8 < this.ag.length; i8++) {
/*  689 */       this.ag[i8].b();
/*      */     }
/*  691 */     for (i8 = 0; i8 < this.af.size(); i8++) {
/*  692 */       blo localblo = (blo)this.af.get(i8);
/*  693 */       i10 = -1;
/*  694 */       for (i11 = 0; i11 < i7; i11++) {
/*  695 */         if (this.ag[i11].a(localblo.f, localblo.g, localblo.h)) {
/*  696 */           i10 = i11;
/*      */         }
/*      */       }
/*  699 */       if (i10 < 0) {
/*  700 */         i10 = i7++;
/*  701 */         this.ag[i10].a(localblo.f, localblo.g, localblo.h, d1, d2, d3);
/*      */       }
/*      */       
/*  704 */       this.ag[i10].a(localblo.a(paramInt3));
/*      */     }
/*      */     
/*  707 */     i8 = qh.c(d1);
/*  708 */     int i9 = qh.c(d3);
/*  709 */     int i10 = i8 - (i8 & 0x3FF);
/*  710 */     int i11 = i9 - (i9 & 0x3FF);
/*  711 */     Arrays.sort(this.ag, new blr(i10, i11));
/*      */     
/*  713 */     a(paramInt3, paramDouble);
/*      */     
/*  715 */     return i1;
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
/*  736 */   private bmd[] ag = { new bmd(), new bmd(), new bmd(), new bmd() };
/*      */   
/*      */ 
/*      */   public void a(int paramInt, double paramDouble)
/*      */   {
/*  741 */     this.A.p.b(paramDouble);
/*      */     
/*  743 */     for (int i1 = 0; i1 < this.ag.length; i1++) {
/*  744 */       this.ag[i1].a();
/*      */     }
/*      */     
/*  747 */     this.A.p.a(paramDouble);
/*      */   }
/*      */   
/*      */   public void g() {
/*  751 */     this.E += 1;
/*      */     
/*  753 */     if (this.E % 20 == 0) {
/*  754 */       Iterator localIterator = this.O.values().iterator();
/*  755 */       while (localIterator.hasNext()) {
/*  756 */         mj localmj = (mj)localIterator.next();
/*      */         
/*  758 */         int i1 = localmj.f();
/*      */         
/*  760 */         if (this.E - i1 > 400) {
/*  761 */           localIterator.remove();
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(float paramFloat)
/*      */   {
/*  769 */     if (this.A.f.t.i == 1) {
/*  770 */       GL11.glDisable(2912);
/*  771 */       GL11.glDisable(3008);
/*  772 */       GL11.glEnable(3042);
/*  773 */       buu.c(770, 771, 1, 0);
/*  774 */       bam.a();
/*      */       
/*  776 */       GL11.glDepthMask(false);
/*  777 */       this.s.a(q);
/*  778 */       localObject = bmh.a;
/*  779 */       for (int i1 = 0; i1 < 6; i1++) {
/*  780 */         GL11.glPushMatrix();
/*  781 */         if (i1 == 1) GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*  782 */         if (i1 == 2) GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*  783 */         if (i1 == 3) GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
/*  784 */         if (i1 == 4) GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/*  785 */         if (i1 == 5) GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
/*  786 */         ((bmh)localObject).b();
/*  787 */         ((bmh)localObject).c(2631720);
/*  788 */         ((bmh)localObject).a(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
/*  789 */         ((bmh)localObject).a(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
/*  790 */         ((bmh)localObject).a(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
/*  791 */         ((bmh)localObject).a(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
/*  792 */         ((bmh)localObject).a();
/*  793 */         GL11.glPopMatrix();
/*      */       }
/*  795 */       GL11.glDepthMask(true);
/*  796 */       GL11.glEnable(3553);
/*  797 */       GL11.glEnable(3008);
/*      */       
/*  799 */       return;
/*      */     }
/*  801 */     if (!this.A.f.t.d()) { return;
/*      */     }
/*  803 */     GL11.glDisable(3553);
/*      */     
/*  805 */     Object localObject = this.r.a(this.A.i, paramFloat);
/*  806 */     float f1 = (float)((azw)localObject).a;
/*  807 */     float f2 = (float)((azw)localObject).b;
/*  808 */     float f3 = (float)((azw)localObject).c;
/*      */     
/*  810 */     if (this.A.u.e) {
/*  811 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  812 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  813 */       f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/*  815 */       f1 = f4;
/*  816 */       f2 = f5;
/*  817 */       f3 = f6;
/*      */     }
/*  819 */     GL11.glColor3f(f1, f2, f3);
/*      */     
/*  821 */     bmh localbmh = bmh.a;
/*      */     
/*  823 */     GL11.glDepthMask(false);
/*      */     
/*  825 */     GL11.glEnable(2912);
/*  826 */     GL11.glColor3f(f1, f2, f3);
/*  827 */     GL11.glCallList(this.G);
/*      */     
/*  829 */     GL11.glDisable(2912);
/*  830 */     GL11.glDisable(3008);
/*  831 */     GL11.glEnable(3042);
/*  832 */     buu.c(770, 771, 1, 0);
/*  833 */     bam.a();
/*      */     
/*  835 */     float[] arrayOfFloat = this.r.t.a(this.r.c(paramFloat), paramFloat);
/*  836 */     if (arrayOfFloat != null) {
/*  837 */       GL11.glDisable(3553);
/*  838 */       GL11.glShadeModel(7425);
/*      */       
/*  840 */       GL11.glPushMatrix();
/*      */       
/*  842 */       GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*  843 */       GL11.glRotatef(qh.a(this.r.d(paramFloat)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
/*  844 */       GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
/*      */       
/*  846 */       f6 = arrayOfFloat[0];
/*  847 */       f7 = arrayOfFloat[1];
/*  848 */       f8 = arrayOfFloat[2];
/*  849 */       float f13; if (this.A.u.e) {
/*  850 */         float f9 = (f6 * 30.0F + f7 * 59.0F + f8 * 11.0F) / 100.0F;
/*  851 */         float f11 = (f6 * 30.0F + f7 * 70.0F) / 100.0F;
/*  852 */         f13 = (f6 * 30.0F + f8 * 70.0F) / 100.0F;
/*      */         
/*  854 */         f6 = f9;
/*  855 */         f7 = f11;
/*  856 */         f8 = f13;
/*      */       }
/*      */       
/*  859 */       localbmh.a(6);
/*  860 */       localbmh.a(f6, f7, f8, arrayOfFloat[3]);
/*      */       
/*  862 */       localbmh.a(0.0D, 100.0D, 0.0D);
/*  863 */       int i2 = 16;
/*  864 */       localbmh.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 0.0F);
/*  865 */       for (int i3 = 0; i3 <= i2; i3++) {
/*  866 */         f13 = i3 * 3.1415927F * 2.0F / i2;
/*  867 */         float f15 = qh.a(f13);
/*  868 */         float f16 = qh.b(f13);
/*  869 */         localbmh.a(f15 * 120.0F, f16 * 120.0F, -f16 * 40.0F * arrayOfFloat[3]);
/*      */       }
/*  871 */       localbmh.a();
/*      */       
/*  873 */       GL11.glPopMatrix();
/*  874 */       GL11.glShadeModel(7424);
/*      */     }
/*      */     
/*  877 */     GL11.glEnable(3553);
/*  878 */     buu.c(770, 1, 1, 0);
/*  879 */     GL11.glPushMatrix();
/*      */     
/*  881 */     float f6 = 1.0F - this.r.j(paramFloat);
/*  882 */     float f7 = 0.0F;
/*  883 */     float f8 = 0.0F;
/*  884 */     float f10 = 0.0F;
/*  885 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, f6);
/*  886 */     GL11.glTranslatef(f7, f8, f10);
/*  887 */     GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*  888 */     GL11.glRotatef(this.r.c(paramFloat) * 360.0F, 1.0F, 0.0F, 0.0F);
/*  889 */     float f12 = 30.0F;
/*      */     
/*  891 */     this.s.a(o);
/*  892 */     localbmh.b();
/*  893 */     localbmh.a(-f12, 100.0D, -f12, 0.0D, 0.0D);
/*  894 */     localbmh.a(f12, 100.0D, -f12, 1.0D, 0.0D);
/*  895 */     localbmh.a(f12, 100.0D, f12, 1.0D, 1.0D);
/*  896 */     localbmh.a(-f12, 100.0D, f12, 0.0D, 1.0D);
/*  897 */     localbmh.a();
/*  898 */     f12 = 20.0F;
/*  899 */     this.s.a(n);
/*  900 */     int i4 = this.r.x();
/*  901 */     int i5 = i4 % 4;
/*  902 */     int i6 = i4 / 4 % 2;
/*  903 */     float f17 = (i5 + 0) / 4.0F;
/*  904 */     float f18 = (i6 + 0) / 2.0F;
/*  905 */     float f19 = (i5 + 1) / 4.0F;
/*  906 */     float f20 = (i6 + 1) / 2.0F;
/*  907 */     localbmh.b();
/*  908 */     localbmh.a(-f12, -100.0D, f12, f19, f20);
/*  909 */     localbmh.a(f12, -100.0D, f12, f17, f20);
/*  910 */     localbmh.a(f12, -100.0D, -f12, f17, f18);
/*  911 */     localbmh.a(-f12, -100.0D, -f12, f19, f18);
/*  912 */     localbmh.a();
/*      */     
/*  914 */     GL11.glDisable(3553);
/*  915 */     float f21 = this.r.g(paramFloat) * f6;
/*  916 */     if (f21 > 0.0F) {
/*  917 */       GL11.glColor4f(f21, f21, f21, f21);
/*  918 */       GL11.glCallList(this.F);
/*      */     }
/*  920 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/*  922 */     GL11.glDisable(3042);
/*  923 */     GL11.glEnable(3008);
/*  924 */     GL11.glEnable(2912);
/*      */     
/*  926 */     GL11.glPopMatrix();
/*  927 */     GL11.glDisable(3553);
/*  928 */     GL11.glColor3f(0.0F, 0.0F, 0.0F);
/*      */     
/*  930 */     double d1 = this.A.h.l(paramFloat).b - this.r.U();
/*  931 */     if (d1 < 0.0D) {
/*  932 */       GL11.glPushMatrix();
/*  933 */       GL11.glTranslatef(0.0F, 12.0F, 0.0F);
/*  934 */       GL11.glCallList(this.H);
/*  935 */       GL11.glPopMatrix();
/*      */       
/*  937 */       f8 = 1.0F;
/*  938 */       f10 = -(float)(d1 + 65.0D);
/*  939 */       f12 = -f8;
/*  940 */       float f14 = f10;
/*      */       
/*  942 */       localbmh.b();
/*  943 */       localbmh.a(0, 255);
/*  944 */       localbmh.a(-f8, f14, f8);
/*  945 */       localbmh.a(f8, f14, f8);
/*  946 */       localbmh.a(f8, f12, f8);
/*  947 */       localbmh.a(-f8, f12, f8);
/*      */       
/*  949 */       localbmh.a(-f8, f12, -f8);
/*  950 */       localbmh.a(f8, f12, -f8);
/*  951 */       localbmh.a(f8, f14, -f8);
/*  952 */       localbmh.a(-f8, f14, -f8);
/*      */       
/*  954 */       localbmh.a(f8, f12, -f8);
/*  955 */       localbmh.a(f8, f12, f8);
/*  956 */       localbmh.a(f8, f14, f8);
/*  957 */       localbmh.a(f8, f14, -f8);
/*      */       
/*  959 */       localbmh.a(-f8, f14, -f8);
/*  960 */       localbmh.a(-f8, f14, f8);
/*  961 */       localbmh.a(-f8, f12, f8);
/*  962 */       localbmh.a(-f8, f12, -f8);
/*      */       
/*  964 */       localbmh.a(-f8, f12, -f8);
/*  965 */       localbmh.a(-f8, f12, f8);
/*  966 */       localbmh.a(f8, f12, f8);
/*  967 */       localbmh.a(f8, f12, -f8);
/*  968 */       localbmh.a();
/*      */     }
/*      */     
/*  971 */     if (this.r.t.g()) {
/*  972 */       GL11.glColor3f(f1 * 0.2F + 0.04F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
/*      */     } else {
/*  974 */       GL11.glColor3f(f1, f2, f3);
/*      */     }
/*  976 */     GL11.glPushMatrix();
/*  977 */     GL11.glTranslatef(0.0F, -(float)(d1 - 16.0D), 0.0F);
/*  978 */     GL11.glCallList(this.H);
/*  979 */     GL11.glPopMatrix();
/*  980 */     GL11.glEnable(3553);
/*      */     
/*  982 */     GL11.glDepthMask(true);
/*      */   }
/*      */   
/*      */   public void b(float paramFloat) {
/*  986 */     if (!this.A.f.t.d()) { return;
/*      */     }
/*  988 */     if (this.A.u.i) {
/*  989 */       c(paramFloat);
/*  990 */       return;
/*      */     }
/*  992 */     GL11.glDisable(2884);
/*  993 */     float f1 = (float)(this.A.i.T + (this.A.i.t - this.A.i.T) * paramFloat);
/*  994 */     int i1 = 32;
/*  995 */     int i2 = 256 / i1;
/*  996 */     bmh localbmh = bmh.a;
/*      */     
/*  998 */     this.s.a(p);
/*  999 */     GL11.glEnable(3042);
/* 1000 */     buu.c(770, 771, 1, 0);
/*      */     
/* 1002 */     azw localazw = this.r.e(paramFloat);
/* 1003 */     float f2 = (float)localazw.a;
/* 1004 */     float f3 = (float)localazw.b;
/* 1005 */     float f4 = (float)localazw.c;
/*      */     
/* 1007 */     if (this.A.u.e) {
/* 1008 */       f5 = (f2 * 30.0F + f3 * 59.0F + f4 * 11.0F) / 100.0F;
/* 1009 */       float f6 = (f2 * 30.0F + f3 * 70.0F) / 100.0F;
/* 1010 */       float f7 = (f2 * 30.0F + f4 * 70.0F) / 100.0F;
/*      */       
/* 1012 */       f2 = f5;
/* 1013 */       f3 = f6;
/* 1014 */       f4 = f7;
/*      */     }
/*      */     
/* 1017 */     float f5 = 4.8828125E-4F;
/*      */     
/* 1019 */     double d1 = this.E + paramFloat;
/* 1020 */     double d2 = this.A.i.p + (this.A.i.s - this.A.i.p) * paramFloat + d1 * 0.029999999329447746D;
/* 1021 */     double d3 = this.A.i.r + (this.A.i.u - this.A.i.r) * paramFloat;
/* 1022 */     int i3 = qh.c(d2 / 2048.0D);
/* 1023 */     int i4 = qh.c(d3 / 2048.0D);
/* 1024 */     d2 -= i3 * 2048;
/* 1025 */     d3 -= i4 * 2048;
/*      */     
/* 1027 */     float f8 = this.r.t.f() - f1 + 0.33F;
/* 1028 */     float f9 = (float)(d2 * f5);
/* 1029 */     float f10 = (float)(d3 * f5);
/* 1030 */     localbmh.b();
/*      */     
/* 1032 */     localbmh.a(f2, f3, f4, 0.8F);
/* 1033 */     for (int i5 = -i1 * i2; i5 < i1 * i2; i5 += i1) {
/* 1034 */       for (int i6 = -i1 * i2; i6 < i1 * i2; i6 += i1) {
/* 1035 */         localbmh.a(i5 + 0, f8, i6 + i1, (i5 + 0) * f5 + f9, (i6 + i1) * f5 + f10);
/* 1036 */         localbmh.a(i5 + i1, f8, i6 + i1, (i5 + i1) * f5 + f9, (i6 + i1) * f5 + f10);
/* 1037 */         localbmh.a(i5 + i1, f8, i6 + 0, (i5 + i1) * f5 + f9, (i6 + 0) * f5 + f10);
/* 1038 */         localbmh.a(i5 + 0, f8, i6 + 0, (i5 + 0) * f5 + f9, (i6 + 0) * f5 + f10);
/*      */       }
/*      */     }
/* 1041 */     localbmh.a();
/* 1042 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1043 */     GL11.glDisable(3042);
/* 1044 */     GL11.glEnable(2884);
/*      */   }
/*      */   
/*      */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 1048 */     return false;
/*      */   }
/*      */   
/*      */   public void c(float paramFloat) {
/* 1052 */     GL11.glDisable(2884);
/* 1053 */     float f1 = (float)(this.A.i.T + (this.A.i.t - this.A.i.T) * paramFloat);
/* 1054 */     bmh localbmh = bmh.a;
/*      */     
/* 1056 */     float f2 = 12.0F;
/* 1057 */     float f3 = 4.0F;
/*      */     
/* 1059 */     double d1 = this.E + paramFloat;
/* 1060 */     double d2 = (this.A.i.p + (this.A.i.s - this.A.i.p) * paramFloat + d1 * 0.029999999329447746D) / f2;
/* 1061 */     double d3 = (this.A.i.r + (this.A.i.u - this.A.i.r) * paramFloat) / f2 + 0.33000001311302185D;
/* 1062 */     float f4 = this.r.t.f() - f1 + 0.33F;
/* 1063 */     int i1 = qh.c(d2 / 2048.0D);
/* 1064 */     int i2 = qh.c(d3 / 2048.0D);
/* 1065 */     d2 -= i1 * 2048;
/* 1066 */     d3 -= i2 * 2048;
/*      */     
/* 1068 */     this.s.a(p);
/* 1069 */     GL11.glEnable(3042);
/* 1070 */     buu.c(770, 771, 1, 0);
/*      */     
/* 1072 */     azw localazw = this.r.e(paramFloat);
/* 1073 */     float f5 = (float)localazw.a;
/* 1074 */     float f6 = (float)localazw.b;
/* 1075 */     float f7 = (float)localazw.c;
/*      */     
/* 1077 */     if (this.A.u.e) {
/* 1078 */       f8 = (f5 * 30.0F + f6 * 59.0F + f7 * 11.0F) / 100.0F;
/* 1079 */       f9 = (f5 * 30.0F + f6 * 70.0F) / 100.0F;
/* 1080 */       f10 = (f5 * 30.0F + f7 * 70.0F) / 100.0F;
/*      */       
/* 1082 */       f5 = f8;
/* 1083 */       f6 = f9;
/* 1084 */       f7 = f10;
/*      */     }
/*      */     
/* 1087 */     float f8 = (float)(d2 * 0.0D);
/* 1088 */     float f9 = (float)(d3 * 0.0D);
/*      */     
/* 1090 */     float f10 = 0.00390625F;
/*      */     
/* 1092 */     f8 = qh.c(d2) * f10;
/* 1093 */     f9 = qh.c(d3) * f10;
/* 1094 */     float f11 = (float)(d2 - qh.c(d2));
/* 1095 */     float f12 = (float)(d3 - qh.c(d3));
/*      */     
/* 1097 */     int i3 = 8;
/*      */     
/* 1099 */     int i4 = 4;
/* 1100 */     float f13 = 9.765625E-4F;
/* 1101 */     GL11.glScalef(f2, 1.0F, f2);
/* 1102 */     for (int i5 = 0; i5 < 2; i5++) {
/* 1103 */       if (i5 == 0) {
/* 1104 */         GL11.glColorMask(false, false, false, false);
/*      */       }
/* 1106 */       else if (this.A.u.e) {
/* 1107 */         if (blt.b == 0) GL11.glColorMask(false, true, true, true); else
/* 1108 */           GL11.glColorMask(true, false, false, true);
/*      */       } else {
/* 1110 */         GL11.glColorMask(true, true, true, true);
/*      */       }
/*      */       
/* 1113 */       for (int i6 = -i4 + 1; i6 <= i4; i6++) {
/* 1114 */         for (int i7 = -i4 + 1; i7 <= i4; i7++) {
/* 1115 */           localbmh.b();
/*      */           
/* 1117 */           float f14 = i6 * i3;
/* 1118 */           float f15 = i7 * i3;
/* 1119 */           float f16 = f14 - f11;
/* 1120 */           float f17 = f15 - f12;
/*      */           
/* 1122 */           if (f4 > -f3 - 1.0F) {
/* 1123 */             localbmh.a(f5 * 0.7F, f6 * 0.7F, f7 * 0.7F, 0.8F);
/* 1124 */             localbmh.c(0.0F, -1.0F, 0.0F);
/* 1125 */             localbmh.a(f16 + 0.0F, f4 + 0.0F, f17 + i3, (f14 + 0.0F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1126 */             localbmh.a(f16 + i3, f4 + 0.0F, f17 + i3, (f14 + i3) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1127 */             localbmh.a(f16 + i3, f4 + 0.0F, f17 + 0.0F, (f14 + i3) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/* 1128 */             localbmh.a(f16 + 0.0F, f4 + 0.0F, f17 + 0.0F, (f14 + 0.0F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/*      */           }
/*      */           
/* 1131 */           if (f4 <= f3 + 1.0F) {
/* 1132 */             localbmh.a(f5, f6, f7, 0.8F);
/* 1133 */             localbmh.c(0.0F, 1.0F, 0.0F);
/* 1134 */             localbmh.a(f16 + 0.0F, f4 + f3 - f13, f17 + i3, (f14 + 0.0F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1135 */             localbmh.a(f16 + i3, f4 + f3 - f13, f17 + i3, (f14 + i3) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1136 */             localbmh.a(f16 + i3, f4 + f3 - f13, f17 + 0.0F, (f14 + i3) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/* 1137 */             localbmh.a(f16 + 0.0F, f4 + f3 - f13, f17 + 0.0F, (f14 + 0.0F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/*      */           }
/*      */           
/* 1140 */           localbmh.a(f5 * 0.9F, f6 * 0.9F, f7 * 0.9F, 0.8F);
/* 1141 */           int i8; if (i6 > -1) {
/* 1142 */             localbmh.c(-1.0F, 0.0F, 0.0F);
/* 1143 */             for (i8 = 0; i8 < i3; i8++) {
/* 1144 */               localbmh.a(f16 + i8 + 0.0F, f4 + 0.0F, f17 + i3, (f14 + i8 + 0.5F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1145 */               localbmh.a(f16 + i8 + 0.0F, f4 + f3, f17 + i3, (f14 + i8 + 0.5F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1146 */               localbmh.a(f16 + i8 + 0.0F, f4 + f3, f17 + 0.0F, (f14 + i8 + 0.5F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/* 1147 */               localbmh.a(f16 + i8 + 0.0F, f4 + 0.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/*      */             }
/*      */           }
/*      */           
/* 1151 */           if (i6 <= 1) {
/* 1152 */             localbmh.c(1.0F, 0.0F, 0.0F);
/* 1153 */             for (i8 = 0; i8 < i3; i8++) {
/* 1154 */               localbmh.a(f16 + i8 + 1.0F - f13, f4 + 0.0F, f17 + i3, (f14 + i8 + 0.5F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1155 */               localbmh.a(f16 + i8 + 1.0F - f13, f4 + f3, f17 + i3, (f14 + i8 + 0.5F) * f10 + f8, (f15 + i3) * f10 + f9);
/* 1156 */               localbmh.a(f16 + i8 + 1.0F - f13, f4 + f3, f17 + 0.0F, (f14 + i8 + 0.5F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/* 1157 */               localbmh.a(f16 + i8 + 1.0F - f13, f4 + 0.0F, f17 + 0.0F, (f14 + i8 + 0.5F) * f10 + f8, (f15 + 0.0F) * f10 + f9);
/*      */             }
/*      */           }
/*      */           
/* 1161 */           localbmh.a(f5 * 0.8F, f6 * 0.8F, f7 * 0.8F, 0.8F);
/* 1162 */           if (i7 > -1) {
/* 1163 */             localbmh.c(0.0F, 0.0F, -1.0F);
/* 1164 */             for (i8 = 0; i8 < i3; i8++) {
/* 1165 */               localbmh.a(f16 + 0.0F, f4 + f3, f17 + i8 + 0.0F, (f14 + 0.0F) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1166 */               localbmh.a(f16 + i3, f4 + f3, f17 + i8 + 0.0F, (f14 + i3) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1167 */               localbmh.a(f16 + i3, f4 + 0.0F, f17 + i8 + 0.0F, (f14 + i3) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1168 */               localbmh.a(f16 + 0.0F, f4 + 0.0F, f17 + i8 + 0.0F, (f14 + 0.0F) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/*      */             }
/*      */           }
/*      */           
/* 1172 */           if (i7 <= 1) {
/* 1173 */             localbmh.c(0.0F, 0.0F, 1.0F);
/* 1174 */             for (i8 = 0; i8 < i3; i8++) {
/* 1175 */               localbmh.a(f16 + 0.0F, f4 + f3, f17 + i8 + 1.0F - f13, (f14 + 0.0F) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1176 */               localbmh.a(f16 + i3, f4 + f3, f17 + i8 + 1.0F - f13, (f14 + i3) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1177 */               localbmh.a(f16 + i3, f4 + 0.0F, f17 + i8 + 1.0F - f13, (f14 + i3) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/* 1178 */               localbmh.a(f16 + 0.0F, f4 + 0.0F, f17 + i8 + 1.0F - f13, (f14 + 0.0F) * f10 + f8, (f15 + i8 + 0.5F) * f10 + f9);
/*      */             }
/*      */           }
/* 1181 */           localbmh.a();
/*      */         }
/*      */       }
/*      */     }
/* 1185 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1186 */     GL11.glDisable(3042);
/* 1187 */     GL11.glEnable(2884);
/*      */   }
/*      */   
/* 1190 */   double c = -9999.0D;
/* 1191 */   double d = -9999.0D;
/* 1192 */   double e = -9999.0D;
/*      */   
/* 1194 */   double f = -9999.0D;
/* 1195 */   double g = -9999.0D;
/* 1196 */   double h = -9999.0D;
/*      */   
/* 1198 */   int i = 64537;
/* 1199 */   int j = 64537;
/* 1200 */   int k = 64537;
/*      */   int l;
/*      */   
/* 1203 */   public boolean a(sv paramsv, boolean paramBoolean) { int i1 = 2;
/*      */     
/* 1205 */     blp localblp = new blp(paramsv);
/* 1206 */     blo[] arrayOfblo = new blo[i1];
/* 1207 */     ArrayList localArrayList = null;
/*      */     
/* 1209 */     int i2 = this.t.size();
/* 1210 */     int i3 = 0;
/*      */     
/* 1212 */     this.r.C.a("nearChunksSearch");
/* 1213 */     blo localblo1; for (int i4 = 0; i4 < i2; i4++) {
/* 1214 */       localblo1 = (blo)this.t.get(i4);
/* 1215 */       if (localblo1 != null)
/*      */       {
/* 1217 */         if (!paramBoolean) {
/* 1218 */           if (localblo1.a(paramsv) > 272.0F)
/*      */           {
/*      */ 
/*      */ 
/* 1222 */             for (int i6 = 0; i6 < i1; i6++) {
/* 1223 */               if ((arrayOfblo[i6] != null) && (localblp.a(arrayOfblo[i6], localblo1) > 0)) {
/*      */                 break;
/*      */               }
/*      */             }
/*      */             
/* 1228 */             i6--;
/*      */             
/* 1230 */             if (i6 <= 0) continue;
/* 1231 */             i8 = i6;
/* 1232 */             for (;;) { i8--; if (i8 == 0) break;
/* 1233 */               arrayOfblo[(i8 - 1)] = arrayOfblo[i8];
/*      */             }
/* 1235 */             arrayOfblo[i6] = localblo1;
/* 1236 */             continue;
/*      */           }
/*      */         }
/*      */         else {
/* 1240 */           if (!localblo1.l) {
/*      */             continue;
/*      */           }
/*      */         }
/*      */         
/*      */ 
/* 1246 */         if (localArrayList == null) {
/* 1247 */           localArrayList = new ArrayList();
/*      */         }
/*      */         
/* 1250 */         i3++;
/* 1251 */         localArrayList.add(localblo1);
/* 1252 */         this.t.set(i4, null);
/*      */       } }
/* 1254 */     this.r.C.b();
/*      */     
/*      */ 
/* 1257 */     this.r.C.a("sort");
/* 1258 */     if (localArrayList != null) {
/* 1259 */       if (localArrayList.size() > 1) { Collections.sort(localArrayList, localblp);
/*      */       }
/* 1261 */       for (i4 = localArrayList.size() - 1; i4 >= 0; i4--) {
/* 1262 */         localblo1 = (blo)localArrayList.get(i4);
/* 1263 */         localblo1.a(paramsv);
/* 1264 */         localblo1.q = false;
/*      */       }
/*      */     }
/* 1267 */     this.r.C.b();
/*      */     
/*      */ 
/* 1270 */     i4 = 0;
/*      */     
/* 1272 */     this.r.C.a("rebuild");
/* 1273 */     for (int i5 = i1 - 1; i5 >= 0; i5--) {
/* 1274 */       blo localblo2 = arrayOfblo[i5];
/* 1275 */       if (localblo2 != null)
/*      */       {
/* 1277 */         if ((!localblo2.l) && (i5 != i1 - 1)) {
/* 1278 */           arrayOfblo[i5] = null;
/* 1279 */           arrayOfblo[0] = null;
/* 1280 */           break;
/*      */         }
/* 1282 */         arrayOfblo[i5].a(paramsv);
/* 1283 */         arrayOfblo[i5].q = false;
/* 1284 */         i4++;
/*      */       }
/*      */     }
/* 1287 */     this.r.C.b();
/*      */     
/* 1289 */     this.r.C.a("cleanup");
/*      */     
/* 1291 */     i5 = 0;
/* 1292 */     int i7 = 0;
/* 1293 */     int i8 = this.t.size();
/* 1294 */     while (i5 != i8) {
/* 1295 */       blo localblo3 = (blo)this.t.get(i5);
/* 1296 */       if (localblo3 != null) {
/* 1297 */         int i9 = 0;
/* 1298 */         for (int i10 = 0; (i10 < i1) && (i9 == 0); i10++) {
/* 1299 */           if (localblo3 == arrayOfblo[i10]) {
/* 1300 */             i9 = 1;
/*      */           }
/*      */         }
/* 1303 */         if (i9 == 0) {
/* 1304 */           if (i7 != i5) {
/* 1305 */             this.t.set(i7, localblo3);
/*      */           }
/* 1307 */           i7++;
/*      */         }
/*      */       }
/* 1310 */       i5++;
/*      */     }
/* 1312 */     this.r.C.b();
/*      */     
/* 1314 */     this.r.C.a("trim");
/*      */     for (;;) {
/* 1316 */       i5--; if (i5 < i7) break;
/* 1317 */       this.t.remove(i5);
/*      */     }
/* 1319 */     this.r.C.b();
/*      */     
/* 1321 */     return i2 == i3 + i4;
/*      */   }
/*      */   
/*      */   public void a(bmh parambmh, yz paramyz, float paramFloat) {
/* 1325 */     double d1 = paramyz.S + (paramyz.s - paramyz.S) * paramFloat;
/* 1326 */     double d2 = paramyz.T + (paramyz.t - paramyz.T) * paramFloat;
/* 1327 */     double d3 = paramyz.U + (paramyz.u - paramyz.U) * paramFloat;
/*      */     
/* 1329 */     if (!this.O.isEmpty()) {
/* 1330 */       buu.c(774, 768, 1, 0);
/*      */       
/* 1332 */       this.s.a(bpz.b);
/* 1333 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
/* 1334 */       GL11.glPushMatrix();
/* 1335 */       GL11.glPolygonOffset(-3.0F, -3.0F);
/* 1336 */       GL11.glEnable(32823);
/* 1337 */       GL11.glAlphaFunc(516, 0.1F);
/* 1338 */       GL11.glEnable(3008);
/* 1339 */       parambmh.b();
/* 1340 */       parambmh.b(-d1, -d2, -d3);
/* 1341 */       parambmh.c();
/*      */       
/* 1343 */       Iterator localIterator = this.O.values().iterator();
/* 1344 */       while (localIterator.hasNext()) {
/* 1345 */         mj localmj = (mj)localIterator.next();
/* 1346 */         double d4 = localmj.b() - d1;
/* 1347 */         double d5 = localmj.c() - d2;
/* 1348 */         double d6 = localmj.d() - d3;
/*      */         
/* 1350 */         if (d4 * d4 + d5 * d5 + d6 * d6 > 1024.0D) {
/* 1351 */           localIterator.remove();
/*      */         } else {
/* 1353 */           aji localaji = this.r.a(localmj.b(), localmj.c(), localmj.d());
/* 1354 */           if (localaji.o() != awt.a)
/*      */           {
/* 1356 */             this.B.a(localaji, localmj.b(), localmj.c(), localmj.d(), this.Q[localmj.e()]);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/* 1361 */       parambmh.a();
/* 1362 */       parambmh.b(0.0D, 0.0D, 0.0D);
/* 1363 */       GL11.glDisable(3008);
/* 1364 */       GL11.glPolygonOffset(0.0F, 0.0F);
/* 1365 */       GL11.glDisable(32823);
/* 1366 */       GL11.glEnable(3008);
/*      */       
/* 1368 */       GL11.glDepthMask(true);
/* 1369 */       GL11.glPopMatrix();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(yz paramyz, azu paramazu, int paramInt, float paramFloat) {
/* 1374 */     if ((paramInt == 0) && (paramazu.a == azv.b)) {
/* 1375 */       GL11.glEnable(3042);
/* 1376 */       buu.c(770, 771, 1, 0);
/* 1377 */       GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
/* 1378 */       GL11.glLineWidth(2.0F);
/* 1379 */       GL11.glDisable(3553);
/* 1380 */       GL11.glDepthMask(false);
/* 1381 */       float f1 = 0.002F;
/*      */       
/* 1383 */       aji localaji = this.r.a(paramazu.b, paramazu.c, paramazu.d);
/* 1384 */       if (localaji.o() != awt.a) {
/* 1385 */         localaji.a(this.r, paramazu.b, paramazu.c, paramazu.d);
/* 1386 */         double d1 = paramyz.S + (paramyz.s - paramyz.S) * paramFloat;
/* 1387 */         double d2 = paramyz.T + (paramyz.t - paramyz.T) * paramFloat;
/* 1388 */         double d3 = paramyz.U + (paramyz.u - paramyz.U) * paramFloat;
/* 1389 */         a(localaji.g(this.r, paramazu.b, paramazu.c, paramazu.d).b(f1, f1, f1).c(-d1, -d2, -d3), -1);
/*      */       }
/* 1391 */       GL11.glDepthMask(true);
/* 1392 */       GL11.glEnable(3553);
/* 1393 */       GL11.glDisable(3042);
/*      */     }
/*      */   }
/*      */   
/*      */   public static void a(azt paramazt, int paramInt) {
/* 1398 */     bmh localbmh = bmh.a;
/*      */     
/* 1400 */     localbmh.a(3);
/* 1401 */     if (paramInt != -1) {
/* 1402 */       localbmh.c(paramInt);
/*      */     }
/* 1404 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 1405 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 1406 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 1407 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 1408 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 1409 */     localbmh.a();
/*      */     
/* 1411 */     localbmh.a(3);
/* 1412 */     if (paramInt != -1) {
/* 1413 */       localbmh.c(paramInt);
/*      */     }
/* 1415 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 1416 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 1417 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 1418 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 1419 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 1420 */     localbmh.a();
/*      */     
/* 1422 */     localbmh.a(1);
/* 1423 */     if (paramInt != -1) {
/* 1424 */       localbmh.c(paramInt);
/*      */     }
/* 1426 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 1427 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 1428 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 1429 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 1430 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 1431 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 1432 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 1433 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 1434 */     localbmh.a();
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 1438 */     int i1 = qh.a(paramInt1, 16);
/* 1439 */     int i2 = qh.a(paramInt2, 16);
/* 1440 */     int i3 = qh.a(paramInt3, 16);
/* 1441 */     int i4 = qh.a(paramInt4, 16);
/* 1442 */     int i5 = qh.a(paramInt5, 16);
/* 1443 */     int i6 = qh.a(paramInt6, 16);
/*      */     
/* 1445 */     for (int i7 = i1; i7 <= i4; i7++) {
/* 1446 */       int i8 = i7 % this.w;
/* 1447 */       if (i8 < 0) i8 += this.w;
/* 1448 */       for (int i9 = i2; i9 <= i5; i9++) {
/* 1449 */         int i10 = i9 % this.x;
/* 1450 */         if (i10 < 0) i10 += this.x;
/* 1451 */         for (int i11 = i3; i11 <= i6; i11++) {
/* 1452 */           int i12 = i11 % this.y;
/* 1453 */           if (i12 < 0) { i12 += this.y;
/*      */           }
/* 1455 */           int i13 = (i12 * this.x + i10) * this.w + i8;
/* 1456 */           blo localblo = this.v[i13];
/* 1457 */           if ((localblo != null) && (!localblo.q)) {
/* 1458 */             this.t.add(localblo);
/* 1459 */             localblo.e();
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1468 */     b(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1473 */     b(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/* 1478 */     b(paramInt1 - 1, paramInt2 - 1, paramInt3 - 1, paramInt4 + 1, paramInt5 + 1, paramInt6 + 1);
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(bmv parambmv, float paramFloat)
/*      */   {
/* 1484 */     for (int i1 = 0; i1 < this.v.length; i1++) {
/* 1485 */       if ((!this.v[i1].d()) && (
/* 1486 */         (!this.v[i1].l) || ((i1 + this.l & 0xF) == 0))) {
/* 1487 */         this.v[i1].a(parambmv);
/*      */       }
/*      */     }
/*      */     
/* 1491 */     this.l += 1;
/*      */   }
/*      */   
/*      */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1496 */     r localr = new r(paramInt1, paramInt2, paramInt3);
/* 1497 */     Object localObject = (bst)this.P.get(localr);
/*      */     
/* 1499 */     if (localObject != null) {
/* 1500 */       this.A.X().b((bst)localObject);
/* 1501 */       this.P.remove(localr);
/*      */     }
/*      */     
/* 1504 */     if (paramString != null) {
/* 1505 */       adr localadr = adr.b(paramString);
/* 1506 */       if (localadr != null) {
/* 1507 */         this.A.r.a(localadr.i());
/*      */       }
/* 1509 */       localObject = bso.a(new bqx(paramString), paramInt1, paramInt2, paramInt3);
/* 1510 */       this.P.put(localr, localObject);
/* 1511 */       this.A.X().a((bst)localObject);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
/*      */   
/*      */ 
/*      */   public void a(yz paramyz, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {}
/*      */   
/*      */ 
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*      */   {
/*      */     try
/*      */     {
/* 1526 */       b(paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*      */     } catch (Throwable localThrowable) {
/* 1528 */       b localb = b.a(localThrowable, "Exception while adding particle");
/* 1529 */       k localk = localb.a("Particle being added");
/*      */       
/* 1531 */       localk.a("Name", paramString);
/* 1532 */       localk.a("Position", new bmb(this, paramDouble1, paramDouble2, paramDouble3));
/*      */       
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1539 */       throw new s(localb);
/*      */     }
/*      */   }
/*      */   
/*      */   public bkm b(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 1544 */     if ((this.A == null) || (this.A.i == null) || (this.A.k == null)) {
/* 1545 */       return null;
/*      */     }
/*      */     
/* 1548 */     int i1 = this.A.u.aJ;
/*      */     
/* 1550 */     if (i1 == 1)
/*      */     {
/* 1552 */       if (this.r.s.nextInt(3) == 0) {
/* 1553 */         i1 = 2;
/*      */       }
/*      */     }
/*      */     
/* 1557 */     double d1 = this.A.i.s - paramDouble1;
/* 1558 */     double d2 = this.A.i.t - paramDouble2;
/* 1559 */     double d3 = this.A.i.u - paramDouble3;
/*      */     
/* 1561 */     Object localObject = null;
/* 1562 */     if (paramString.equals("hugeexplosion")) { this.A.k.a(localObject = new bkj(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/* 1563 */     } else if (paramString.equals("largeexplode")) { this.A.k.a(localObject = new bki(this.s, this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6));
/* 1564 */     } else if (paramString.equals("fireworksSpark")) {
/* 1565 */       this.A.k.a(localObject = new bkd(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, this.A.k));
/*      */     }
/*      */     
/* 1568 */     if (localObject != null) {
/* 1569 */       return (bkm)localObject;
/*      */     }
/*      */     
/* 1572 */     double d4 = 16.0D;
/* 1573 */     if (d1 * d1 + d2 * d2 + d3 * d3 > d4 * d4) {
/* 1574 */       return null;
/*      */     }
/*      */     
/* 1577 */     if (i1 > 1)
/*      */     {
/* 1579 */       return null;
/*      */     }
/*      */     
/* 1582 */     if (paramString.equals("bubble")) { localObject = new bjv(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1583 */     } else if (paramString.equals("suspended")) { localObject = new bkz(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1584 */     } else if (paramString.equals("depthsuspend")) { localObject = new bla(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1585 */     } else if (paramString.equals("townaura")) { localObject = new bla(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1586 */     } else if (paramString.equals("crit")) { localObject = new bjx(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1587 */     } else if (paramString.equals("magicCrit")) {
/* 1588 */       localObject = new bjx(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1589 */       ((bkm)localObject).b(((bkm)localObject).b() * 0.3F, ((bkm)localObject).d() * 0.8F, ((bkm)localObject).e());
/* 1590 */       ((bkm)localObject).i();
/* 1591 */     } else if (paramString.equals("smoke")) { localObject = new bkv(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1592 */     } else if (paramString.equals("mobSpell")) {
/* 1593 */       localObject = new bkx(this.r, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 1594 */       ((bkm)localObject).b((float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
/* 1595 */     } else if (paramString.equals("mobSpellAmbient")) {
/* 1596 */       localObject = new bkx(this.r, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 1597 */       ((bkm)localObject).g(0.15F);
/* 1598 */       ((bkm)localObject).b((float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
/* 1599 */     } else if (paramString.equals("spell")) { localObject = new bkx(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1600 */     } else if (paramString.equals("instantSpell")) {
/* 1601 */       localObject = new bkx(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1602 */       ((bkx)localObject).a(144);
/* 1603 */     } else if (paramString.equals("witchMagic")) {
/* 1604 */       localObject = new bkx(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1605 */       ((bkx)localObject).a(144);
/* 1606 */       float f1 = this.r.s.nextFloat() * 0.5F + 0.35F;
/* 1607 */       ((bkm)localObject).b(1.0F * f1, 0.0F * f1, 1.0F * f1);
/* 1608 */     } else if (paramString.equals("note")) { localObject = new bkl(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1609 */     } else if (paramString.equals("portal")) { localObject = new bkt(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1610 */     } else if (paramString.equals("enchantmenttable")) { localObject = new bjz(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1611 */     } else if (paramString.equals("explode")) { localObject = new bka(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1612 */     } else if (paramString.equals("flame")) { localObject = new bkf(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1613 */     } else if (paramString.equals("lava")) { localObject = new bkk(this.r, paramDouble1, paramDouble2, paramDouble3);
/* 1614 */     } else if (paramString.equals("footstep")) { localObject = new bkg(this.s, this.r, paramDouble1, paramDouble2, paramDouble3);
/* 1615 */     } else if (paramString.equals("splash")) { localObject = new bky(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1616 */     } else if (paramString.equals("wake")) { localObject = new ble(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1617 */     } else if (paramString.equals("largesmoke")) { localObject = new bkv(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.5F);
/* 1618 */     } else if (paramString.equals("cloud")) { localObject = new bks(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1619 */     } else if (paramString.equals("reddust")) { localObject = new bku(this.r, paramDouble1, paramDouble2, paramDouble3, (float)paramDouble4, (float)paramDouble5, (float)paramDouble6);
/* 1620 */     } else if (paramString.equals("snowballpoof")) { localObject = new bju(this.r, paramDouble1, paramDouble2, paramDouble3, ade.ay);
/* 1621 */     } else if (paramString.equals("dripWater")) { localObject = new bjy(this.r, paramDouble1, paramDouble2, paramDouble3, awt.h);
/* 1622 */     } else if (paramString.equals("dripLava")) { localObject = new bjy(this.r, paramDouble1, paramDouble2, paramDouble3, awt.i);
/* 1623 */     } else if (paramString.equals("snowshovel")) { localObject = new bkw(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1624 */     } else if (paramString.equals("slime")) { localObject = new bju(this.r, paramDouble1, paramDouble2, paramDouble3, ade.aH);
/* 1625 */     } else if (paramString.equals("heart")) { localObject = new bkh(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1626 */     } else if (paramString.equals("angryVillager")) {
/* 1627 */       localObject = new bkh(this.r, paramDouble1, paramDouble2 + 0.5D, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1628 */       ((bkm)localObject).k(81);
/* 1629 */       ((bkm)localObject).b(1.0F, 1.0F, 1.0F);
/* 1630 */     } else if (paramString.equals("happyVillager")) {
/* 1631 */       localObject = new bla(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 1632 */       ((bkm)localObject).k(82);
/* 1633 */       ((bkm)localObject).b(1.0F, 1.0F, 1.0F); } else { String[] arrayOfString;
/* 1634 */       int i3; if (paramString.startsWith("iconcrack_")) {
/* 1635 */         arrayOfString = paramString.split("_", 3);
/* 1636 */         int i2 = Integer.parseInt(arrayOfString[1]);
/* 1637 */         if (arrayOfString.length > 2) {
/* 1638 */           i3 = Integer.parseInt(arrayOfString[2]);
/* 1639 */           localObject = new bju(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, adb.d(i2), i3);
/*      */         } else {
/* 1641 */           localObject = new bju(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, adb.d(i2), 0);
/*      */         } } else { aji localaji;
/* 1643 */         if (paramString.startsWith("blockcrack_")) {
/* 1644 */           arrayOfString = paramString.split("_", 3);
/* 1645 */           localaji = aji.e(Integer.parseInt(arrayOfString[1]));
/* 1646 */           i3 = Integer.parseInt(arrayOfString[2]);
/* 1647 */           localObject = new bld(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, localaji, i3).a(i3);
/* 1648 */         } else if (paramString.startsWith("blockdust_")) {
/* 1649 */           arrayOfString = paramString.split("_", 3);
/* 1650 */           localaji = aji.e(Integer.parseInt(arrayOfString[1]));
/* 1651 */           i3 = Integer.parseInt(arrayOfString[2]);
/* 1652 */           localObject = new blc(this.r, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, localaji, i3).a(i3);
/*      */         }
/*      */       } }
/* 1655 */     if (localObject != null) {
/* 1656 */       this.A.k.a((bkm)localObject);
/*      */     }
/*      */     
/* 1659 */     return (bkm)localObject;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(sa paramsa) {}
/*      */   
/*      */ 
/*      */   public void b(sa paramsa) {}
/*      */   
/*      */ 
/*      */   public void h()
/*      */   {
/* 1671 */     ban.b(this.z);
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1676 */     Random localRandom = this.r.s;
/*      */     
/* 1678 */     switch (paramInt1) {
/*      */     case 1013: 
/*      */     case 1018: 
/* 1681 */       if (this.A.i != null)
/*      */       {
/* 1683 */         double d1 = paramInt2 - this.A.i.s;
/* 1684 */         double d2 = paramInt3 - this.A.i.t;
/* 1685 */         double d3 = paramInt4 - this.A.i.u;
/*      */         
/* 1687 */         double d4 = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/* 1688 */         double d5 = this.A.i.s;
/* 1689 */         double d6 = this.A.i.t;
/* 1690 */         double d7 = this.A.i.u;
/*      */         
/* 1692 */         if (d4 > 0.0D) {
/* 1693 */           d5 += d1 / d4 * 2.0D;
/* 1694 */           d6 += d2 / d4 * 2.0D;
/* 1695 */           d7 += d3 / d4 * 2.0D;
/*      */         }
/* 1697 */         if (paramInt1 == 1013) {
/* 1698 */           this.r.a(d5, d6, d7, "mob.wither.spawn", 1.0F, 1.0F, false);
/* 1699 */         } else if (paramInt1 == 1018) {
/* 1700 */           this.r.a(d5, d6, d7, "mob.enderdragon.end", 5.0F, 1.0F, false);
/*      */         }
/*      */       }
/*      */       break;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1709 */     Random localRandom = this.r.s;
/* 1710 */     aji localaji = null;
/* 1711 */     double d2; double d3; double d9; double d10; double d11; double d12; double d13; double d1; String str1; int i6; switch (paramInt1) {
/*      */     case 1001: 
/* 1713 */       this.r.a(paramInt2, paramInt3, paramInt4, "random.click", 1.0F, 1.2F, false);
/* 1714 */       break;
/*      */     case 1000: 
/* 1716 */       this.r.a(paramInt2, paramInt3, paramInt4, "random.click", 1.0F, 1.0F, false);
/* 1717 */       break;
/*      */     case 1002: 
/* 1719 */       this.r.a(paramInt2, paramInt3, paramInt4, "random.bow", 1.0F, 1.2F, false);
/* 1720 */       break;
/*      */     case 2000: 
/* 1722 */       int i1 = paramInt5 % 3 - 1;
/* 1723 */       int i2 = paramInt5 / 3 % 3 - 1;
/* 1724 */       d2 = paramInt2 + i1 * 0.6D + 0.5D;
/* 1725 */       d3 = paramInt3 + 0.5D;
/* 1726 */       double d4 = paramInt4 + i2 * 0.6D + 0.5D;
/* 1727 */       for (int i5 = 0; i5 < 10; i5++) {
/* 1728 */         double d6 = localRandom.nextDouble() * 0.2D + 0.01D;
/* 1729 */         double d7 = d2 + i1 * 0.01D + (localRandom.nextDouble() - 0.5D) * i2 * 0.5D;
/* 1730 */         d9 = d3 + (localRandom.nextDouble() - 0.5D) * 0.5D;
/* 1731 */         d10 = d4 + i2 * 0.01D + (localRandom.nextDouble() - 0.5D) * i1 * 0.5D;
/* 1732 */         d11 = i1 * d6 + localRandom.nextGaussian() * 0.01D;
/* 1733 */         d12 = -0.03D + localRandom.nextGaussian() * 0.01D;
/* 1734 */         d13 = i2 * d6 + localRandom.nextGaussian() * 0.01D;
/* 1735 */         a("smoke", d7, d9, d10, d11, d12, d13);
/*      */       }
/*      */       
/* 1738 */       break;
/*      */     
/*      */     case 2003: 
/* 1741 */       d1 = paramInt2 + 0.5D;
/* 1742 */       d2 = paramInt3;
/* 1743 */       d3 = paramInt4 + 0.5D;
/*      */       
/* 1745 */       str1 = "iconcrack_" + adb.b(ade.bv);
/* 1746 */       for (int i3 = 0; i3 < 8; i3++) {
/* 1747 */         a(str1, d1, d2, d3, localRandom.nextGaussian() * 0.15D, localRandom.nextDouble() * 0.2D, localRandom.nextGaussian() * 0.15D);
/*      */       }
/* 1749 */       for (double d5 = 0.0D; d5 < 6.283185307179586D; d5 += 0.15707963267948966D) {
/* 1750 */         a("portal", d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -5.0D, 0.0D, Math.sin(d5) * -5.0D);
/* 1751 */         a("portal", d1 + Math.cos(d5) * 5.0D, d2 - 0.4D, d3 + Math.sin(d5) * 5.0D, Math.cos(d5) * -7.0D, 0.0D, Math.sin(d5) * -7.0D);
/*      */       }
/*      */       
/*      */ 
/* 1755 */       break;
/*      */     case 2002: 
/* 1757 */       d1 = paramInt2;
/* 1758 */       d2 = paramInt3;
/* 1759 */       d3 = paramInt4;
/*      */       
/* 1761 */       str1 = "iconcrack_" + adb.b(ade.bn) + "_" + paramInt5;
/* 1762 */       for (int i4 = 0; i4 < 8; i4++) {
/* 1763 */         a(str1, d1, d2, d3, localRandom.nextGaussian() * 0.15D, localRandom.nextDouble() * 0.2D, localRandom.nextGaussian() * 0.15D);
/*      */       }
/*      */       
/* 1766 */       i4 = ade.bn.h(paramInt5);
/*      */       
/* 1768 */       float f1 = (i4 >> 16 & 0xFF) / 255.0F;
/* 1769 */       float f2 = (i4 >> 8 & 0xFF) / 255.0F;
/* 1770 */       float f3 = (i4 >> 0 & 0xFF) / 255.0F;
/*      */       
/* 1772 */       String str2 = "spell";
/* 1773 */       if (ade.bn.i(paramInt5)) {
/* 1774 */         str2 = "instantSpell";
/*      */       }
/*      */       
/* 1777 */       for (i6 = 0; i6 < 100; i6++) {
/* 1778 */         d9 = localRandom.nextDouble() * 4.0D;
/* 1779 */         d10 = localRandom.nextDouble() * 3.141592653589793D * 2.0D;
/* 1780 */         d11 = Math.cos(d10) * d9;
/* 1781 */         d12 = 0.01D + localRandom.nextDouble() * 0.5D;
/* 1782 */         d13 = Math.sin(d10) * d9;
/*      */         
/* 1784 */         bkm localbkm = b(str2, d1 + d11 * 0.1D, d2 + 0.3D, d3 + d13 * 0.1D, d11, d12, d13);
/* 1785 */         if (localbkm != null) {
/* 1786 */           float f5 = 0.75F + localRandom.nextFloat() * 0.25F;
/* 1787 */           localbkm.b(f1 * f5, f2 * f5, f3 * f5);
/* 1788 */           localbkm.a((float)d9);
/*      */         }
/*      */       }
/* 1791 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "game.potion.smash", 1.0F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/* 1792 */       break;
/*      */     case 2001: 
/* 1794 */       localaji = aji.e(paramInt5 & 0xFFF);
/* 1795 */       if (localaji.o() != awt.a) {
/* 1796 */         this.A.X().a(new bso(new bqx(localaji.H.a()), (localaji.H.c() + 1.0F) / 2.0F, localaji.H.d() * 0.8F, paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F));
/*      */       }
/* 1798 */       this.A.k.a(paramInt2, paramInt3, paramInt4, localaji, paramInt5 >> 12 & 0xFF);
/* 1799 */       break;
/*      */     case 2004: 
/* 1801 */       for (i6 = 0; i6 < 20; i6++) {
/* 1802 */         d9 = paramInt2 + 0.5D + (this.r.s.nextFloat() - 0.5D) * 2.0D;
/* 1803 */         d10 = paramInt3 + 0.5D + (this.r.s.nextFloat() - 0.5D) * 2.0D;
/* 1804 */         d11 = paramInt4 + 0.5D + (this.r.s.nextFloat() - 0.5D) * 2.0D;
/*      */         
/* 1806 */         this.r.a("smoke", d9, d10, d11, 0.0D, 0.0D, 0.0D);
/* 1807 */         this.r.a("flame", d9, d10, d11, 0.0D, 0.0D, 0.0D);
/*      */       }
/* 1809 */       break;
/*      */     case 2005: 
/* 1811 */       acj.a(this.r, paramInt2, paramInt3, paramInt4, paramInt5);
/* 1812 */       break;
/*      */     case 2006: 
/* 1814 */       localaji = this.r.a(paramInt2, paramInt3, paramInt4);
/* 1815 */       if (localaji.o() != awt.a) {
/* 1816 */         double d8 = Math.min(0.2F + paramInt5 / 15.0F, 10.0F);
/* 1817 */         if (d8 > 2.5D) {
/* 1818 */           d8 = 2.5D;
/*      */         }
/* 1820 */         int i7 = (int)(150.0D * d8);
/* 1821 */         for (int i8 = 0; i8 < i7; i8++) {
/* 1822 */           float f4 = qh.a(localRandom, 0.0F, 6.2831855F);
/* 1823 */           d11 = qh.a(localRandom, 0.75F, 1.0F);
/* 1824 */           d12 = 0.20000000298023224D + d8 / 100.0D;
/* 1825 */           d13 = qh.b(f4) * 0.2F * d11 * d11 * (d8 + 0.2D);
/* 1826 */           double d14 = qh.a(f4) * 0.2F * d11 * d11 * (d8 + 0.2D);
/* 1827 */           this.r.a("blockdust_" + aji.b(localaji) + "_" + this.r.e(paramInt2, paramInt3, paramInt4), paramInt2 + 0.5F, paramInt3 + 1.0F, paramInt4 + 0.5F, d13, d12, d14);
/*      */         } }
/* 1829 */       break;
/*      */     
/*      */     case 1003: 
/* 1832 */       if (Math.random() < 0.5D) {
/* 1833 */         this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "random.door_open", 1.0F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/*      */       } else {
/* 1835 */         this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "random.door_close", 1.0F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/*      */       }
/* 1837 */       break;
/*      */     case 1004: 
/* 1839 */       this.r.a(paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F, "random.fizz", 0.5F, 2.6F + (localRandom.nextFloat() - localRandom.nextFloat()) * 0.8F, false);
/* 1840 */       break;
/*      */     case 1020: 
/* 1842 */       this.r.a(paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F, "random.anvil_break", 1.0F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/* 1843 */       break;
/*      */     case 1021: 
/* 1845 */       this.r.a(paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F, "random.anvil_use", 1.0F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/* 1846 */       break;
/*      */     case 1022: 
/* 1848 */       this.r.a(paramInt2 + 0.5F, paramInt3 + 0.5F, paramInt4 + 0.5F, "random.anvil_land", 0.3F, this.r.s.nextFloat() * 0.1F + 0.9F, false);
/* 1849 */       break;
/*      */     case 1005: 
/* 1851 */       if ((adb.d(paramInt5) instanceof adr)) {
/* 1852 */         this.r.a("records." + ((adr)adb.d(paramInt5)).a, paramInt2, paramInt3, paramInt4);
/*      */       } else {
/* 1854 */         this.r.a(null, paramInt2, paramInt3, paramInt4);
/*      */       }
/* 1856 */       break;
/*      */     case 1007: 
/* 1858 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.charge", 10.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1859 */       break;
/*      */     case 1008: 
/* 1861 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.fireball", 10.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1862 */       break;
/*      */     case 1010: 
/* 1864 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.wood", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1865 */       break;
/*      */     case 1012: 
/* 1867 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.woodbreak", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1868 */       break;
/*      */     case 1011: 
/* 1870 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.metal", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1871 */       break;
/*      */     case 1009: 
/* 1873 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.ghast.fireball", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1874 */       break;
/*      */     case 1014: 
/* 1876 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.wither.shoot", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1877 */       break;
/*      */     case 1016: 
/* 1879 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.infect", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1880 */       break;
/*      */     case 1017: 
/* 1882 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.zombie.unfect", 2.0F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
/* 1883 */       break;
/*      */     case 1015: 
/* 1885 */       this.r.a(paramInt2 + 0.5D, paramInt3 + 0.5D, paramInt4 + 0.5D, "mob.bat.takeoff", 0.05F, (localRandom.nextFloat() - localRandom.nextFloat()) * 0.2F + 1.0F, false);
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
/*      */ 
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*      */   {
/* 1904 */     if ((paramInt5 < 0) || (paramInt5 >= 10)) {
/* 1905 */       this.O.remove(Integer.valueOf(paramInt1));
/*      */     } else {
/* 1907 */       mj localmj = (mj)this.O.get(Integer.valueOf(paramInt1));
/*      */       
/* 1909 */       if ((localmj == null) || (localmj.b() != paramInt2) || (localmj.c() != paramInt3) || (localmj.d() != paramInt4)) {
/* 1910 */         localmj = new mj(paramInt1, paramInt2, paramInt3, paramInt4);
/* 1911 */         this.O.put(Integer.valueOf(paramInt1), localmj);
/*      */       }
/*      */       
/* 1914 */       localmj.a(paramInt5);
/* 1915 */       localmj.b(this.E);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(rg paramrg) {
/* 1920 */     this.Q = new rf[10];
/*      */     
/* 1922 */     for (int i1 = 0; i1 < this.Q.length; i1++) {
/* 1923 */       this.Q[i1] = paramrg.a("destroy_stage_" + i1);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */