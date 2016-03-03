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
/*      */ public class blm
/*      */ {
/*      */   public ahl a;
/*      */   private rf d;
/*      */   private boolean e;
/*      */   private boolean f;
/*      */   private boolean g;
/*   27 */   public static boolean b = true;
/*   28 */   public boolean c = true;
/*   29 */   private boolean h = false;
/*      */   private double i;
/*      */   private double j;
/*      */   private double k;
/*      */   private double l;
/*      */   private double m;
/*      */   private double n;
/*      */   private boolean o;
/*      */   private boolean p;
/*      */   private final bao q;
/*      */   
/*      */   public blm(ahl paramahl)
/*      */   {
/*   42 */     this.a = paramahl;
/*   43 */     this.f = false;
/*   44 */     this.e = false;
/*   45 */     this.q = bao.B();
/*      */   }
/*      */   
/*      */   public blm() {
/*   49 */     this.q = bao.B();
/*      */   }
/*      */   
/*      */   public void a(rf paramrf) {
/*   53 */     this.d = paramrf;
/*      */   }
/*      */   
/*      */   public void a() {
/*   57 */     this.d = null;
/*      */   }
/*      */   
/*      */   public boolean b() {
/*   61 */     return this.d != null;
/*      */   }
/*      */   
/*      */   public void a(boolean paramBoolean) {
/*   65 */     this.h = paramBoolean;
/*      */   }
/*      */   
/*      */   public void b(boolean paramBoolean) {
/*   69 */     this.g = paramBoolean;
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*   73 */     if (!this.o) {
/*   74 */       this.i = paramDouble1;
/*   75 */       this.j = paramDouble4;
/*   76 */       this.k = paramDouble2;
/*   77 */       this.l = paramDouble5;
/*   78 */       this.m = paramDouble3;
/*   79 */       this.n = paramDouble6;
/*   80 */       this.p = ((this.q.u.j >= 2) && ((this.i > 0.0D) || (this.j < 1.0D) || (this.k > 0.0D) || (this.l < 1.0D) || (this.m > 0.0D) || (this.n < 1.0D)));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aji paramaji) {
/*   85 */     if (!this.o) {
/*   86 */       this.i = paramaji.x();
/*   87 */       this.j = paramaji.y();
/*   88 */       this.k = paramaji.z();
/*   89 */       this.l = paramaji.A();
/*   90 */       this.m = paramaji.B();
/*   91 */       this.n = paramaji.C();
/*   92 */       this.p = ((this.q.u.j >= 2) && ((this.i > 0.0D) || (this.j < 1.0D) || (this.k > 0.0D) || (this.l < 1.0D) || (this.m > 0.0D) || (this.n < 1.0D)));
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*   97 */     this.i = paramDouble1;
/*   98 */     this.j = paramDouble4;
/*   99 */     this.k = paramDouble2;
/*  100 */     this.l = paramDouble5;
/*  101 */     this.m = paramDouble3;
/*  102 */     this.n = paramDouble6;
/*  103 */     this.o = true;
/*      */     
/*  105 */     this.p = ((this.q.u.j >= 2) && ((this.i > 0.0D) || (this.j < 1.0D) || (this.k > 0.0D) || (this.l < 1.0D) || (this.m > 0.0D) || (this.n < 1.0D)));
/*      */   }
/*      */   
/*      */   public void c() {
/*  109 */     this.o = false;
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, int paramInt1, int paramInt2, int paramInt3, rf paramrf) {
/*  113 */     a(paramrf);
/*  114 */     b(paramaji, paramInt1, paramInt2, paramInt3);
/*  115 */     a();
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/*  119 */     this.g = true;
/*  120 */     b(paramaji, paramInt1, paramInt2, paramInt3);
/*  121 */     this.g = false;
/*      */   }
/*      */   
/*      */   public boolean b(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/*  125 */     int i1 = paramaji.b();
/*      */     
/*  127 */     if (i1 == -1) {
/*  128 */       return false;
/*      */     }
/*      */     
/*  131 */     paramaji.a(this.a, paramInt1, paramInt2, paramInt3);
/*  132 */     a(paramaji);
/*  133 */     if (i1 == 0)
/*  134 */       return q(paramaji, paramInt1, paramInt2, paramInt3);
/*  135 */     if (i1 == 4)
/*  136 */       return p(paramaji, paramInt1, paramInt2, paramInt3);
/*  137 */     if (i1 == 31)
/*  138 */       return r(paramaji, paramInt1, paramInt2, paramInt3);
/*  139 */     if (i1 == 1)
/*  140 */       return l(paramaji, paramInt1, paramInt2, paramInt3);
/*  141 */     if (i1 == 40)
/*  142 */       return a((ako)paramaji, paramInt1, paramInt2, paramInt3);
/*  143 */     if (i1 == 2)
/*  144 */       return c(paramaji, paramInt1, paramInt2, paramInt3);
/*  145 */     if (i1 == 20)
/*  146 */       return j(paramaji, paramInt1, paramInt2, paramInt3);
/*  147 */     if (i1 == 11)
/*  148 */       return a((akz)paramaji, paramInt1, paramInt2, paramInt3);
/*  149 */     if (i1 == 39)
/*  150 */       return s(paramaji, paramInt1, paramInt2, paramInt3);
/*  151 */     if (i1 == 5)
/*  152 */       return h(paramaji, paramInt1, paramInt2, paramInt3);
/*  153 */     if (i1 == 13)
/*  154 */       return t(paramaji, paramInt1, paramInt2, paramInt3);
/*  155 */     if (i1 == 9)
/*  156 */       return a((aje)paramaji, paramInt1, paramInt2, paramInt3);
/*  157 */     if (i1 == 19)
/*  158 */       return m(paramaji, paramInt1, paramInt2, paramInt3);
/*  159 */     if (i1 == 23)
/*  160 */       return o(paramaji, paramInt1, paramInt2, paramInt3);
/*  161 */     if (i1 == 6)
/*  162 */       return n(paramaji, paramInt1, paramInt2, paramInt3);
/*  163 */     if (i1 == 3)
/*  164 */       return a((alb)paramaji, paramInt1, paramInt2, paramInt3);
/*  165 */     if (i1 == 8)
/*  166 */       return i(paramaji, paramInt1, paramInt2, paramInt3);
/*  167 */     if (i1 == 7)
/*  168 */       return u(paramaji, paramInt1, paramInt2, paramInt3);
/*  169 */     if (i1 == 10)
/*  170 */       return a((ans)paramaji, paramInt1, paramInt2, paramInt3);
/*  171 */     if (i1 == 27)
/*  172 */       return a((akp)paramaji, paramInt1, paramInt2, paramInt3);
/*  173 */     if (i1 == 32)
/*  174 */       return a((aoi)paramaji, paramInt1, paramInt2, paramInt3);
/*  175 */     if (i1 == 12)
/*  176 */       return e(paramaji, paramInt1, paramInt2, paramInt3);
/*  177 */     if (i1 == 29)
/*  178 */       return f(paramaji, paramInt1, paramInt2, paramInt3);
/*  179 */     if (i1 == 30)
/*  180 */       return g(paramaji, paramInt1, paramInt2, paramInt3);
/*  181 */     if (i1 == 14)
/*  182 */       return v(paramaji, paramInt1, paramInt2, paramInt3);
/*  183 */     if (i1 == 15)
/*  184 */       return a((anf)paramaji, paramInt1, paramInt2, paramInt3);
/*  185 */     if (i1 == 36)
/*  186 */       return a((akj)paramaji, paramInt1, paramInt2, paramInt3);
/*  187 */     if (i1 == 37)
/*  188 */       return a((akc)paramaji, paramInt1, paramInt2, paramInt3);
/*  189 */     if (i1 == 16)
/*  190 */       return b(paramaji, paramInt1, paramInt2, paramInt3, false);
/*  191 */     if (i1 == 17)
/*  192 */       return c(paramaji, paramInt1, paramInt2, paramInt3, true);
/*  193 */     if (i1 == 18)
/*  194 */       return a((aoa)paramaji, paramInt1, paramInt2, paramInt3);
/*  195 */     if (i1 == 41)
/*  196 */       return k(paramaji, paramInt1, paramInt2, paramInt3);
/*  197 */     if (i1 == 21)
/*  198 */       return a((ala)paramaji, paramInt1, paramInt2, paramInt3);
/*  199 */     if (i1 == 24)
/*  200 */       return a((ajw)paramaji, paramInt1, paramInt2, paramInt3);
/*  201 */     if (i1 == 33)
/*  202 */       return a((ald)paramaji, paramInt1, paramInt2, paramInt3);
/*  203 */     if (i1 == 35)
/*  204 */       return a((ajb)paramaji, paramInt1, paramInt2, paramInt3);
/*  205 */     if (i1 == 25)
/*  206 */       return a((ajq)paramaji, paramInt1, paramInt2, paramInt3);
/*  207 */     if (i1 == 26)
/*  208 */       return a((aku)paramaji, paramInt1, paramInt2, paramInt3);
/*  209 */     if (i1 == 28)
/*  210 */       return a((ajz)paramaji, paramInt1, paramInt2, paramInt3);
/*  211 */     if (i1 == 34)
/*  212 */       return a((ajg)paramaji, paramInt1, paramInt2, paramInt3);
/*  213 */     if (i1 == 38) {
/*  214 */       return a((aln)paramaji, paramInt1, paramInt2, paramInt3);
/*      */     }
/*  216 */     return false;
/*      */   }
/*      */   
/*      */   private boolean a(aku paramaku, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  221 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  223 */     int i2 = i1 & 0x3;
/*  224 */     if (i2 == 0) {
/*  225 */       this.v = 3;
/*  226 */     } else if (i2 == 3) {
/*  227 */       this.v = 1;
/*  228 */     } else if (i2 == 1) {
/*  229 */       this.v = 2;
/*      */     }
/*      */     
/*  232 */     if (!aku.b(i1)) {
/*  233 */       a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
/*  234 */       q(paramaku, paramInt1, paramInt2, paramInt3);
/*      */       
/*  236 */       this.v = 0;
/*  237 */       return true;
/*      */     }
/*      */     
/*  240 */     this.g = true;
/*  241 */     a(0.0D, 0.0D, 0.0D, 1.0D, 0.8125D, 1.0D);
/*  242 */     q(paramaku, paramInt1, paramInt2, paramInt3);
/*  243 */     a(paramaku.e());
/*  244 */     a(0.25D, 0.8125D, 0.25D, 0.75D, 1.0D, 0.75D);
/*  245 */     q(paramaku, paramInt1, paramInt2, paramInt3);
/*  246 */     this.g = false;
/*  247 */     a();
/*      */     
/*  249 */     this.v = 0;
/*  250 */     return true;
/*      */   }
/*      */   
/*      */   private boolean v(aji paramaji, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  255 */     bmh localbmh = bmh.a;
/*      */     
/*  257 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  258 */     int i2 = ajh.l(i1);
/*  259 */     boolean bool = ajh.b(i1);
/*      */     
/*  261 */     float f1 = 0.5F;
/*  262 */     float f2 = 1.0F;
/*  263 */     float f3 = 0.8F;
/*  264 */     float f4 = 0.6F;
/*      */     
/*  266 */     float f5 = f2;
/*  267 */     float f6 = f2;
/*  268 */     float f7 = f2;
/*      */     
/*  270 */     float f8 = f1;
/*  271 */     float f9 = f3;
/*  272 */     float f10 = f4;
/*      */     
/*  274 */     float f11 = f1;
/*  275 */     float f12 = f3;
/*  276 */     float f13 = f4;
/*      */     
/*  278 */     float f14 = f1;
/*  279 */     float f15 = f3;
/*  280 */     float f16 = f4;
/*      */     
/*      */ 
/*  283 */     int i3 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/*      */ 
/*      */ 
/*  287 */     localbmh.b(i3);
/*  288 */     localbmh.b(f8, f11, f14);
/*      */     
/*  290 */     rf localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0);
/*  291 */     double d1 = localrf.c();
/*  292 */     double d2 = localrf.d();
/*  293 */     double d3 = localrf.e();
/*  294 */     double d4 = localrf.f();
/*      */     
/*  296 */     double d5 = paramInt1 + this.i;
/*  297 */     double d6 = paramInt1 + this.j;
/*  298 */     double d7 = paramInt2 + this.k + 0.1875D;
/*  299 */     double d8 = paramInt3 + this.m;
/*  300 */     double d9 = paramInt3 + this.n;
/*      */     
/*  302 */     localbmh.a(d5, d7, d9, d1, d4);
/*  303 */     localbmh.a(d5, d7, d8, d1, d3);
/*  304 */     localbmh.a(d6, d7, d8, d2, d3);
/*  305 */     localbmh.a(d6, d7, d9, d2, d4);
/*      */     
/*      */ 
/*      */ 
/*  309 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3));
/*  310 */     localbmh.b(f5, f6, f7);
/*      */     
/*  312 */     localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1);
/*  313 */     d1 = localrf.c();
/*  314 */     d2 = localrf.d();
/*  315 */     d3 = localrf.e();
/*  316 */     d4 = localrf.f();
/*      */     
/*  318 */     d5 = d1;
/*  319 */     d6 = d2;
/*  320 */     d7 = d3;
/*  321 */     d8 = d3;
/*  322 */     d9 = d1;
/*  323 */     double d10 = d2;
/*  324 */     double d11 = d4;
/*  325 */     double d12 = d4;
/*      */     
/*  327 */     if (i2 == 0)
/*      */     {
/*  329 */       d6 = d1;
/*  330 */       d7 = d4;
/*  331 */       d9 = d2;
/*  332 */       d12 = d3;
/*  333 */     } else if (i2 == 2)
/*      */     {
/*  335 */       d5 = d2;
/*  336 */       d8 = d4;
/*  337 */       d10 = d1;
/*  338 */       d11 = d3;
/*  339 */     } else if (i2 == 3)
/*      */     {
/*  341 */       d5 = d2;
/*  342 */       d8 = d4;
/*  343 */       d10 = d1;
/*  344 */       d11 = d3;
/*  345 */       d6 = d1;
/*  346 */       d7 = d4;
/*  347 */       d9 = d2;
/*  348 */       d12 = d3;
/*      */     }
/*      */     
/*  351 */     double d13 = paramInt1 + this.i;
/*  352 */     double d14 = paramInt1 + this.j;
/*  353 */     double d15 = paramInt2 + this.l;
/*  354 */     double d16 = paramInt3 + this.m;
/*  355 */     double d17 = paramInt3 + this.n;
/*      */     
/*  357 */     localbmh.a(d14, d15, d17, d9, d11);
/*  358 */     localbmh.a(d14, d15, d16, d5, d7);
/*  359 */     localbmh.a(d13, d15, d16, d6, d8);
/*  360 */     localbmh.a(d13, d15, d17, d10, d12);
/*      */     
/*      */ 
/*  363 */     int i4 = p.d[i2];
/*  364 */     if (bool) {
/*  365 */       i4 = p.d[p.f[i2]];
/*      */     }
/*      */     
/*  368 */     int i5 = 4;
/*  369 */     switch (i2) {
/*      */     case 2: 
/*      */       break;
/*      */     case 0: 
/*  373 */       i5 = 5;
/*  374 */       break;
/*      */     case 3: 
/*  376 */       i5 = 2;
/*  377 */       break;
/*      */     case 1: 
/*  379 */       i5 = 3;
/*      */     }
/*      */     
/*      */     
/*  383 */     if ((i4 != 2) && ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 - 1, 2)))) {
/*  384 */       localbmh.b(this.m > 0.0D ? i3 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1));
/*  385 */       localbmh.b(f9, f12, f15);
/*  386 */       this.e = (i5 == 2);
/*  387 */       c(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2));
/*      */     }
/*      */     
/*  390 */     if ((i4 != 3) && ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 + 1, 3)))) {
/*  391 */       localbmh.b(this.n < 1.0D ? i3 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1));
/*  392 */       localbmh.b(f9, f12, f15);
/*  393 */       this.e = (i5 == 3);
/*  394 */       d(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3));
/*      */     }
/*      */     
/*  397 */     if ((i4 != 4) && ((this.g) || (paramaji.a(this.a, paramInt1 - 1, paramInt2, paramInt3, 4)))) {
/*  398 */       localbmh.b(this.m > 0.0D ? i3 : paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3));
/*  399 */       localbmh.b(f10, f13, f16);
/*  400 */       this.e = (i5 == 4);
/*  401 */       e(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4));
/*      */     }
/*      */     
/*  404 */     if ((i4 != 5) && ((this.g) || (paramaji.a(this.a, paramInt1 + 1, paramInt2, paramInt3, 5)))) {
/*  405 */       localbmh.b(this.n < 1.0D ? i3 : paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3));
/*  406 */       localbmh.b(f10, f13, f16);
/*  407 */       this.e = (i5 == 5);
/*  408 */       f(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5));
/*      */     }
/*  410 */     this.e = false;
/*  411 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */   private boolean a(ajq paramajq, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  417 */     a(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.875D, 0.5625D);
/*  418 */     q(paramajq, paramInt1, paramInt2, paramInt3);
/*      */     
/*  420 */     a(paramajq.e());
/*      */     
/*      */ 
/*  423 */     this.g = true;
/*  424 */     a(0.5625D, 0.0D, 0.3125D, 0.9375D, 0.125D, 0.6875D);
/*  425 */     q(paramajq, paramInt1, paramInt2, paramInt3);
/*  426 */     a(0.125D, 0.0D, 0.0625D, 0.5D, 0.125D, 0.4375D);
/*  427 */     q(paramajq, paramInt1, paramInt2, paramInt3);
/*  428 */     a(0.125D, 0.0D, 0.5625D, 0.5D, 0.125D, 0.9375D);
/*  429 */     q(paramajq, paramInt1, paramInt2, paramInt3);
/*  430 */     this.g = false;
/*      */     
/*  432 */     a();
/*      */     
/*  434 */     bmh localbmh = bmh.a;
/*      */     
/*  436 */     localbmh.b(paramajq.c(this.a, paramInt1, paramInt2, paramInt3));
/*  437 */     int i1 = paramajq.d(this.a, paramInt1, paramInt2, paramInt3);
/*  438 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/*  439 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/*  440 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/*  442 */     if (blt.a) {
/*  443 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  444 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  445 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/*  447 */       f1 = f4;
/*  448 */       f2 = f5;
/*  449 */       f3 = f6;
/*      */     }
/*  451 */     localbmh.b(f1, f2, f3);
/*      */     
/*  453 */     rf localrf = a(paramajq, 0, 0);
/*      */     
/*  455 */     if (b()) localrf = this.d;
/*  456 */     double d1 = localrf.e();
/*  457 */     double d2 = localrf.f();
/*      */     
/*  459 */     int i2 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  461 */     for (int i3 = 0; i3 < 3; i3++)
/*      */     {
/*  463 */       double d3 = i3 * 3.141592653589793D * 2.0D / 3.0D + 1.5707963267948966D;
/*      */       
/*  465 */       double d4 = localrf.a(8.0D);
/*  466 */       double d5 = localrf.d();
/*  467 */       if ((i2 & 1 << i3) != 0) {
/*  468 */         d5 = localrf.c();
/*      */       }
/*      */       
/*  471 */       double d6 = paramInt1 + 0.5D;
/*  472 */       double d7 = paramInt1 + 0.5D + Math.sin(d3) * 8.0D / 16.0D;
/*  473 */       double d8 = paramInt3 + 0.5D;
/*  474 */       double d9 = paramInt3 + 0.5D + Math.cos(d3) * 8.0D / 16.0D;
/*      */       
/*  476 */       localbmh.a(d6, paramInt2 + 1, d8, d4, d1);
/*  477 */       localbmh.a(d6, paramInt2 + 0, d8, d4, d2);
/*  478 */       localbmh.a(d7, paramInt2 + 0, d9, d5, d2);
/*  479 */       localbmh.a(d7, paramInt2 + 1, d9, d5, d1);
/*      */       
/*  481 */       localbmh.a(d7, paramInt2 + 1, d9, d5, d1);
/*  482 */       localbmh.a(d7, paramInt2 + 0, d9, d5, d2);
/*  483 */       localbmh.a(d6, paramInt2 + 0, d8, d4, d2);
/*  484 */       localbmh.a(d6, paramInt2 + 1, d8, d4, d1);
/*      */     }
/*      */     
/*  487 */     paramajq.g();
/*      */     
/*  489 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(ajw paramajw, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  494 */     q(paramajw, paramInt1, paramInt2, paramInt3);
/*      */     
/*  496 */     bmh localbmh = bmh.a;
/*      */     
/*  498 */     localbmh.b(paramajw.c(this.a, paramInt1, paramInt2, paramInt3));
/*  499 */     int i1 = paramajw.d(this.a, paramInt1, paramInt2, paramInt3);
/*  500 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/*  501 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/*  502 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/*  504 */     if (blt.a) {
/*  505 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  506 */       f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  507 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/*  509 */       f1 = f4;
/*  510 */       f2 = f5;
/*  511 */       f3 = f6;
/*      */     }
/*  513 */     localbmh.b(f1, f2, f3);
/*      */     
/*      */ 
/*  516 */     rf localrf1 = paramajw.h(2);
/*  517 */     float f5 = 0.125F;
/*  518 */     f(paramajw, paramInt1 - 1.0F + f5, paramInt2, paramInt3, localrf1);
/*  519 */     e(paramajw, paramInt1 + 1.0F - f5, paramInt2, paramInt3, localrf1);
/*  520 */     d(paramajw, paramInt1, paramInt2, paramInt3 - 1.0F + f5, localrf1);
/*  521 */     c(paramajw, paramInt1, paramInt2, paramInt3 + 1.0F - f5, localrf1);
/*      */     
/*  523 */     rf localrf2 = ajw.e("inner");
/*  524 */     b(paramajw, paramInt1, paramInt2 - 1.0F + 0.25F, paramInt3, localrf2);
/*  525 */     a(paramajw, paramInt1, paramInt2 + 1.0F - 0.75F, paramInt3, localrf2);
/*      */     
/*  527 */     int i2 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  528 */     if (i2 > 0) {
/*  529 */       rf localrf3 = alw.e("water_still");
/*      */       
/*  531 */       b(paramajw, paramInt1, paramInt2 - 1.0F + ajw.c(i2), paramInt3, localrf3);
/*      */     }
/*      */     
/*  534 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(ald paramald, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  539 */     q(paramald, paramInt1, paramInt2, paramInt3);
/*      */     
/*  541 */     bmh localbmh = bmh.a;
/*      */     
/*  543 */     localbmh.b(paramald.c(this.a, paramInt1, paramInt2, paramInt3));
/*  544 */     int i1 = paramald.d(this.a, paramInt1, paramInt2, paramInt3);
/*  545 */     rf localrf = a(paramald, 0);
/*  546 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/*  547 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/*  548 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/*  550 */     if (blt.a) {
/*  551 */       f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  552 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  553 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/*  555 */       f1 = f4;
/*  556 */       f2 = f5;
/*  557 */       f3 = f6;
/*      */     }
/*  559 */     localbmh.b(f1, f2, f3);
/*      */     
/*      */ 
/*      */ 
/*  563 */     float f4 = 0.1865F;
/*  564 */     f(paramald, paramInt1 - 0.5F + f4, paramInt2, paramInt3, localrf);
/*  565 */     e(paramald, paramInt1 + 0.5F - f4, paramInt2, paramInt3, localrf);
/*  566 */     d(paramald, paramInt1, paramInt2, paramInt3 - 0.5F + f4, localrf);
/*  567 */     c(paramald, paramInt1, paramInt2, paramInt3 + 0.5F - f4, localrf);
/*      */     
/*  569 */     b(paramald, paramInt1, paramInt2 - 0.5F + f4 + 0.1875F, paramInt3, b(ajn.d));
/*      */     
/*  571 */     aor localaor = this.a.o(paramInt1, paramInt2, paramInt3);
/*  572 */     if ((localaor != null) && ((localaor instanceof apf))) {
/*  573 */       adb localadb = ((apf)localaor).a();
/*  574 */       int i2 = ((apf)localaor).b();
/*      */       
/*  576 */       if ((localadb instanceof abh)) {
/*  577 */         aji localaji = aji.a(localadb);
/*  578 */         int i3 = localaji.b();
/*      */         
/*  580 */         float f7 = 0.0F;
/*  581 */         float f8 = 4.0F;
/*  582 */         float f9 = 0.0F;
/*      */         
/*  584 */         localbmh.d(f7 / 16.0F, f8 / 16.0F, f9 / 16.0F);
/*      */         
/*  586 */         i1 = localaji.d(this.a, paramInt1, paramInt2, paramInt3);
/*  587 */         if (i1 != 16777215) {
/*  588 */           f1 = (i1 >> 16 & 0xFF) / 255.0F;
/*  589 */           f2 = (i1 >> 8 & 0xFF) / 255.0F;
/*  590 */           f3 = (i1 & 0xFF) / 255.0F;
/*  591 */           localbmh.b(f1, f2, f3);
/*      */         }
/*      */         
/*  594 */         if (i3 == 1) {
/*  595 */           a(a(localaji, 0, i2), paramInt1, paramInt2, paramInt3, 0.75F);
/*  596 */         } else if (i3 == 13)
/*      */         {
/*  598 */           this.g = true;
/*      */           
/*  600 */           float f10 = 0.125F;
/*  601 */           a(0.5F - f10, 0.0D, 0.5F - f10, 0.5F + f10, 0.25D, 0.5F + f10);
/*  602 */           q(localaji, paramInt1, paramInt2, paramInt3);
/*  603 */           a(0.5F - f10, 0.25D, 0.5F - f10, 0.5F + f10, 0.5D, 0.5F + f10);
/*  604 */           q(localaji, paramInt1, paramInt2, paramInt3);
/*  605 */           a(0.5F - f10, 0.5D, 0.5F - f10, 0.5F + f10, 0.75D, 0.5F + f10);
/*  606 */           q(localaji, paramInt1, paramInt2, paramInt3);
/*  607 */           this.g = false;
/*      */           
/*  609 */           a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*      */         }
/*      */         
/*  612 */         localbmh.d(-f7 / 16.0F, -f8 / 16.0F, -f9 / 16.0F);
/*      */       }
/*      */     }
/*      */     
/*  616 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(ajb paramajb, int paramInt1, int paramInt2, int paramInt3) {
/*  620 */     return a(paramajb, paramInt1, paramInt2, paramInt3, this.a.e(paramInt1, paramInt2, paramInt3));
/*      */   }
/*      */   
/*      */   public boolean a(ajb paramajb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  625 */     bmh localbmh = bmh.a;
/*      */     
/*  627 */     localbmh.b(paramajb.c(this.a, paramInt1, paramInt2, paramInt3));
/*  628 */     int i1 = paramajb.d(this.a, paramInt1, paramInt2, paramInt3);
/*  629 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/*  630 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/*  631 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/*  633 */     if (blt.a) {
/*  634 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/*  635 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/*  636 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/*  638 */       f1 = f4;
/*  639 */       f2 = f5;
/*  640 */       f3 = f6;
/*      */     }
/*  642 */     localbmh.b(f1, f2, f3);
/*      */     
/*  644 */     return a(paramajb, paramInt1, paramInt2, paramInt3, paramInt4, false);
/*      */   }
/*      */   
/*      */   private boolean a(ajb paramajb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*  648 */     int i1 = paramBoolean ? 0 : paramInt4 & 0x3;
/*  649 */     boolean bool = false;
/*  650 */     float f1 = 0.0F;
/*      */     
/*  652 */     switch (i1) {
/*      */     case 2: 
/*  654 */       this.t = 1;
/*  655 */       this.u = 2;
/*  656 */       break;
/*      */     case 0: 
/*  658 */       this.t = 2;
/*  659 */       this.u = 1;
/*  660 */       this.v = 3;
/*  661 */       this.w = 3;
/*  662 */       break;
/*      */     case 1: 
/*  664 */       this.r = 1;
/*  665 */       this.s = 2;
/*  666 */       this.v = 2;
/*  667 */       this.w = 1;
/*  668 */       bool = true;
/*  669 */       break;
/*      */     case 3: 
/*  671 */       this.r = 2;
/*  672 */       this.s = 1;
/*  673 */       this.v = 1;
/*  674 */       this.w = 2;
/*  675 */       bool = true;
/*      */     }
/*      */     
/*      */     
/*  679 */     f1 = a(paramajb, paramInt1, paramInt2, paramInt3, 0, f1, 0.75F, 0.25F, 0.75F, bool, paramBoolean, paramInt4);
/*  680 */     f1 = a(paramajb, paramInt1, paramInt2, paramInt3, 1, f1, 0.5F, 0.0625F, 0.625F, bool, paramBoolean, paramInt4);
/*  681 */     f1 = a(paramajb, paramInt1, paramInt2, paramInt3, 2, f1, 0.25F, 0.3125F, 0.5F, bool, paramBoolean, paramInt4);
/*  682 */     f1 = a(paramajb, paramInt1, paramInt2, paramInt3, 3, f1, 0.625F, 0.375F, 1.0F, bool, paramBoolean, paramInt4);
/*      */     
/*  684 */     a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*  685 */     this.r = 0;
/*  686 */     this.s = 0;
/*  687 */     this.t = 0;
/*  688 */     this.u = 0;
/*  689 */     this.v = 0;
/*  690 */     this.w = 0;
/*      */     
/*  692 */     return true;
/*      */   }
/*      */   
/*      */   private float a(ajb paramajb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean1, boolean paramBoolean2, int paramInt5) {
/*  696 */     if (paramBoolean1) {
/*  697 */       float f1 = paramFloat2;
/*  698 */       paramFloat2 = paramFloat4;
/*  699 */       paramFloat4 = f1;
/*      */     }
/*      */     
/*  702 */     paramFloat2 /= 2.0F;
/*  703 */     paramFloat4 /= 2.0F;
/*      */     
/*  705 */     paramajb.b = paramInt4;
/*  706 */     a(0.5F - paramFloat2, paramFloat1, 0.5F - paramFloat4, 0.5F + paramFloat2, paramFloat1 + paramFloat3, 0.5F + paramFloat4);
/*      */     
/*  708 */     if (paramBoolean2) {
/*  709 */       bmh localbmh = bmh.a;
/*  710 */       localbmh.b();
/*  711 */       localbmh.c(0.0F, -1.0F, 0.0F);
/*  712 */       a(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 0, paramInt5));
/*  713 */       localbmh.a();
/*      */       
/*  715 */       localbmh.b();
/*  716 */       localbmh.c(0.0F, 1.0F, 0.0F);
/*  717 */       b(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 1, paramInt5));
/*  718 */       localbmh.a();
/*      */       
/*  720 */       localbmh.b();
/*  721 */       localbmh.c(0.0F, 0.0F, -1.0F);
/*  722 */       c(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 2, paramInt5));
/*  723 */       localbmh.a();
/*      */       
/*  725 */       localbmh.b();
/*  726 */       localbmh.c(0.0F, 0.0F, 1.0F);
/*  727 */       d(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 3, paramInt5));
/*  728 */       localbmh.a();
/*      */       
/*  730 */       localbmh.b();
/*  731 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/*  732 */       e(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 4, paramInt5));
/*  733 */       localbmh.a();
/*      */       
/*  735 */       localbmh.b();
/*  736 */       localbmh.c(1.0F, 0.0F, 0.0F);
/*  737 */       f(paramajb, 0.0D, 0.0D, 0.0D, a(paramajb, 5, paramInt5));
/*  738 */       localbmh.a();
/*      */     } else {
/*  740 */       q(paramajb, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/*  743 */     return paramFloat1 + paramFloat3;
/*      */   }
/*      */   
/*      */   public boolean c(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/*  747 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/*  749 */     bmh localbmh = bmh.a;
/*      */     
/*  751 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/*  752 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/*  754 */     double d1 = 0.4000000059604645D;
/*  755 */     double d2 = 0.5D - d1;
/*  756 */     double d3 = 0.20000000298023224D;
/*  757 */     if (i1 == 1) {
/*  758 */       a(paramaji, paramInt1 - d2, paramInt2 + d3, paramInt3, -d1, 0.0D, 0);
/*  759 */     } else if (i1 == 2) {
/*  760 */       a(paramaji, paramInt1 + d2, paramInt2 + d3, paramInt3, d1, 0.0D, 0);
/*  761 */     } else if (i1 == 3) {
/*  762 */       a(paramaji, paramInt1, paramInt2 + d3, paramInt3 - d2, 0.0D, -d1, 0);
/*  763 */     } else if (i1 == 4) {
/*  764 */       a(paramaji, paramInt1, paramInt2 + d3, paramInt3 + d2, 0.0D, d1, 0);
/*      */     } else {
/*  766 */       a(paramaji, paramInt1, paramInt2, paramInt3, 0.0D, 0.0D, 0);
/*      */     }
/*  768 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(anf paramanf, int paramInt1, int paramInt2, int paramInt3) {
/*  772 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  773 */     int i2 = i1 & 0x3;
/*  774 */     int i3 = (i1 & 0xC) >> 2;
/*      */     
/*  776 */     bmh localbmh = bmh.a;
/*      */     
/*  778 */     localbmh.b(paramanf.c(this.a, paramInt1, paramInt2, paramInt3));
/*  779 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/*  781 */     double d1 = -0.1875D;
/*  782 */     boolean bool = paramanf.g(this.a, paramInt1, paramInt2, paramInt3, i1);
/*  783 */     double d2 = 0.0D;
/*  784 */     double d3 = 0.0D;
/*  785 */     double d4 = 0.0D;
/*  786 */     double d5 = 0.0D;
/*      */     
/*  788 */     switch (i2) {
/*      */     case 0: 
/*  790 */       d5 = -0.3125D;
/*  791 */       d3 = anf.b[i3];
/*  792 */       break;
/*      */     case 2: 
/*  794 */       d5 = 0.3125D;
/*  795 */       d3 = -anf.b[i3];
/*  796 */       break;
/*      */     case 3: 
/*  798 */       d4 = -0.3125D;
/*  799 */       d2 = anf.b[i3];
/*  800 */       break;
/*      */     case 1: 
/*  802 */       d4 = 0.3125D;
/*  803 */       d2 = -anf.b[i3];
/*      */     }
/*      */     
/*      */     
/*      */ 
/*  808 */     if (!bool) {
/*  809 */       a(paramanf, paramInt1 + d2, paramInt2 + d1, paramInt3 + d3, 0.0D, 0.0D, 0);
/*      */     } else {
/*  811 */       rf localrf = b(ajn.h);
/*  812 */       a(localrf);
/*      */       
/*  814 */       float f1 = 2.0F;
/*  815 */       float f2 = 14.0F;
/*  816 */       float f3 = 7.0F;
/*  817 */       float f4 = 9.0F;
/*      */       
/*  819 */       switch (i2) {
/*      */       case 0: 
/*      */       case 2: 
/*      */         break;
/*      */       case 1: 
/*      */       case 3: 
/*  825 */         f1 = 7.0F;
/*  826 */         f2 = 9.0F;
/*  827 */         f3 = 2.0F;
/*  828 */         f4 = 14.0F;
/*      */       }
/*      */       
/*  831 */       a(f1 / 16.0F + (float)d2, 0.125D, f3 / 16.0F + (float)d3, f2 / 16.0F + (float)d2, 0.25D, f4 / 16.0F + (float)d3);
/*  832 */       double d6 = localrf.a(f1);
/*  833 */       double d7 = localrf.b(f3);
/*  834 */       double d8 = localrf.a(f2);
/*  835 */       double d9 = localrf.b(f4);
/*  836 */       localbmh.a(paramInt1 + f1 / 16.0F + d2, paramInt2 + 0.25F, paramInt3 + f3 / 16.0F + d3, d6, d7);
/*  837 */       localbmh.a(paramInt1 + f1 / 16.0F + d2, paramInt2 + 0.25F, paramInt3 + f4 / 16.0F + d3, d6, d9);
/*  838 */       localbmh.a(paramInt1 + f2 / 16.0F + d2, paramInt2 + 0.25F, paramInt3 + f4 / 16.0F + d3, d8, d9);
/*  839 */       localbmh.a(paramInt1 + f2 / 16.0F + d2, paramInt2 + 0.25F, paramInt3 + f3 / 16.0F + d3, d8, d7);
/*  840 */       q(paramanf, paramInt1, paramInt2, paramInt3);
/*  841 */       a(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);
/*  842 */       a();
/*      */     }
/*      */     
/*  845 */     localbmh.b(paramanf.c(this.a, paramInt1, paramInt2, paramInt3));
/*  846 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/*      */ 
/*  849 */     a(paramanf, paramInt1 + d4, paramInt2 + d1, paramInt3 + d5, 0.0D, 0.0D, 0);
/*      */     
/*      */ 
/*  852 */     a(paramanf, paramInt1, paramInt2, paramInt3);
/*      */     
/*  854 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(akc paramakc, int paramInt1, int paramInt2, int paramInt3) {
/*  858 */     bmh localbmh = bmh.a;
/*      */     
/*  860 */     localbmh.b(paramakc.c(this.a, paramInt1, paramInt2, paramInt3));
/*  861 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/*  863 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  864 */     int i2 = i1 & 0x3;
/*  865 */     double d1 = 0.0D;
/*  866 */     double d2 = -0.1875D;
/*  867 */     double d3 = 0.0D;
/*  868 */     double d4 = 0.0D;
/*  869 */     double d5 = 0.0D;
/*      */     
/*      */     rf localrf;
/*  872 */     if (paramakc.d(i1)) {
/*  873 */       localrf = ajn.aA.h(0);
/*      */     } else {
/*  875 */       d2 -= 0.1875D;
/*  876 */       localrf = ajn.az.h(0);
/*      */     }
/*      */     
/*  879 */     switch (i2) {
/*      */     case 0: 
/*  881 */       d3 = -0.3125D;
/*  882 */       d5 = 1.0D;
/*  883 */       break;
/*      */     case 2: 
/*  885 */       d3 = 0.3125D;
/*  886 */       d5 = -1.0D;
/*  887 */       break;
/*      */     case 3: 
/*  889 */       d1 = -0.3125D;
/*  890 */       d4 = 1.0D;
/*  891 */       break;
/*      */     case 1: 
/*  893 */       d1 = 0.3125D;
/*  894 */       d4 = -1.0D;
/*      */     }
/*      */     
/*      */     
/*      */ 
/*  899 */     a(paramakc, paramInt1 + 0.25D * d4 + 0.1875D * d5, paramInt2 - 0.1875F, paramInt3 + 0.25D * d5 + 0.1875D * d4, 0.0D, 0.0D, i1);
/*  900 */     a(paramakc, paramInt1 + 0.25D * d4 + -0.1875D * d5, paramInt2 - 0.1875F, paramInt3 + 0.25D * d5 + -0.1875D * d4, 0.0D, 0.0D, i1);
/*      */     
/*  902 */     a(localrf);
/*  903 */     a(paramakc, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, 0.0D, 0.0D, i1);
/*  904 */     a();
/*      */     
/*  906 */     a(paramakc, paramInt1, paramInt2, paramInt3, i2);
/*      */     
/*  908 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(akj paramakj, int paramInt1, int paramInt2, int paramInt3) {
/*  912 */     bmh localbmh = bmh.a;
/*      */     
/*  914 */     a(paramakj, paramInt1, paramInt2, paramInt3, this.a.e(paramInt1, paramInt2, paramInt3) & 0x3);
/*      */     
/*  916 */     return true;
/*      */   }
/*      */   
/*      */   private void a(akj paramakj, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  921 */     q(paramakj, paramInt1, paramInt2, paramInt3);
/*      */     
/*  923 */     bmh localbmh = bmh.a;
/*      */     
/*  925 */     localbmh.b(paramakj.c(this.a, paramInt1, paramInt2, paramInt3));
/*  926 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*  927 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  928 */     rf localrf = a(paramakj, 1, i1);
/*  929 */     double d1 = localrf.c();
/*  930 */     double d2 = localrf.d();
/*  931 */     double d3 = localrf.e();
/*  932 */     double d4 = localrf.f();
/*      */     
/*  934 */     double d5 = 0.125D;
/*      */     
/*  936 */     double d6 = paramInt1 + 1;
/*  937 */     double d7 = paramInt1 + 1;
/*  938 */     double d8 = paramInt1 + 0;
/*  939 */     double d9 = paramInt1 + 0;
/*      */     
/*  941 */     double d10 = paramInt3 + 0;
/*  942 */     double d11 = paramInt3 + 1;
/*  943 */     double d12 = paramInt3 + 1;
/*  944 */     double d13 = paramInt3 + 0;
/*      */     
/*  946 */     double d14 = paramInt2 + d5;
/*      */     
/*  948 */     if (paramInt4 == 2)
/*      */     {
/*  950 */       d6 = d7 = paramInt1 + 0;
/*  951 */       d8 = d9 = paramInt1 + 1;
/*  952 */       d10 = d13 = paramInt3 + 1;
/*  953 */       d11 = d12 = paramInt3 + 0;
/*  954 */     } else if (paramInt4 == 3)
/*      */     {
/*  956 */       d6 = d9 = paramInt1 + 0;
/*  957 */       d7 = d8 = paramInt1 + 1;
/*  958 */       d10 = d11 = paramInt3 + 0;
/*  959 */       d12 = d13 = paramInt3 + 1;
/*  960 */     } else if (paramInt4 == 1)
/*      */     {
/*  962 */       d6 = d9 = paramInt1 + 1;
/*  963 */       d7 = d8 = paramInt1 + 0;
/*  964 */       d10 = d11 = paramInt3 + 1;
/*  965 */       d12 = d13 = paramInt3 + 0;
/*      */     }
/*      */     
/*      */ 
/*  969 */     localbmh.a(d9, d14, d13, d1, d3);
/*  970 */     localbmh.a(d8, d14, d12, d1, d4);
/*  971 */     localbmh.a(d7, d14, d11, d2, d4);
/*  972 */     localbmh.a(d6, d14, d10, d2, d3);
/*      */   }
/*      */   
/*      */   private int r;
/*      */   private int s;
/*      */   private int t;
/*      */   private int u;
/*      */   private int v;
/*      */   private int w;
/*      */   private boolean x;
/*      */   private float y;
/*      */   private float z;
/*      */   public void d(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/*  985 */     this.g = true;
/*  986 */     b(paramaji, paramInt1, paramInt2, paramInt3, true);
/*  987 */     this.g = false;
/*      */   }
/*      */   
/*      */   private boolean b(aji paramaji, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/*  992 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*  993 */     int i2 = (paramBoolean) || ((i1 & 0x8) != 0) ? 1 : 0;
/*  994 */     int i3 = app.b(i1);
/*      */     
/*  996 */     float f1 = 0.25F;
/*      */     
/*  998 */     if (i2 != 0) {
/*  999 */       switch (i3) {
/*      */       case 0: 
/* 1001 */         this.r = 3;
/* 1002 */         this.s = 3;
/* 1003 */         this.t = 3;
/* 1004 */         this.u = 3;
/* 1005 */         a(0.0D, 0.25D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1006 */         break;
/*      */       case 1: 
/* 1008 */         a(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D);
/* 1009 */         break;
/*      */       case 2: 
/* 1011 */         this.t = 1;
/* 1012 */         this.u = 2;
/* 1013 */         a(0.0D, 0.0D, 0.25D, 1.0D, 1.0D, 1.0D);
/* 1014 */         break;
/*      */       case 3: 
/* 1016 */         this.t = 2;
/* 1017 */         this.u = 1;
/* 1018 */         this.v = 3;
/* 1019 */         this.w = 3;
/* 1020 */         a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.75D);
/* 1021 */         break;
/*      */       case 4: 
/* 1023 */         this.r = 1;
/* 1024 */         this.s = 2;
/* 1025 */         this.v = 2;
/* 1026 */         this.w = 1;
/* 1027 */         a(0.25D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1028 */         break;
/*      */       case 5: 
/* 1030 */         this.r = 2;
/* 1031 */         this.s = 1;
/* 1032 */         this.v = 1;
/* 1033 */         this.w = 2;
/* 1034 */         a(0.0D, 0.0D, 0.0D, 0.75D, 1.0D, 1.0D);
/*      */       }
/*      */       
/*      */       
/* 1038 */       ((app)paramaji).b((float)this.i, (float)this.k, (float)this.m, (float)this.j, (float)this.l, (float)this.n);
/* 1039 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/* 1040 */       this.r = 0;
/* 1041 */       this.s = 0;
/* 1042 */       this.t = 0;
/* 1043 */       this.u = 0;
/* 1044 */       this.v = 0;
/* 1045 */       this.w = 0;
/* 1046 */       a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1047 */       ((app)paramaji).b((float)this.i, (float)this.k, (float)this.m, (float)this.j, (float)this.l, (float)this.n);
/*      */     } else {
/* 1049 */       switch (i3) {
/*      */       case 0: 
/* 1051 */         this.r = 3;
/* 1052 */         this.s = 3;
/* 1053 */         this.t = 3;
/* 1054 */         this.u = 3;
/* 1055 */         break;
/*      */       case 1: 
/*      */         break;
/*      */       case 2: 
/* 1059 */         this.t = 1;
/* 1060 */         this.u = 2;
/* 1061 */         break;
/*      */       case 3: 
/* 1063 */         this.t = 2;
/* 1064 */         this.u = 1;
/* 1065 */         this.v = 3;
/* 1066 */         this.w = 3;
/* 1067 */         break;
/*      */       case 4: 
/* 1069 */         this.r = 1;
/* 1070 */         this.s = 2;
/* 1071 */         this.v = 2;
/* 1072 */         this.w = 1;
/* 1073 */         break;
/*      */       case 5: 
/* 1075 */         this.r = 2;
/* 1076 */         this.s = 1;
/* 1077 */         this.v = 1;
/* 1078 */         this.w = 2;
/*      */       }
/*      */       
/* 1081 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/* 1082 */       this.r = 0;
/* 1083 */       this.s = 0;
/* 1084 */       this.t = 0;
/* 1085 */       this.u = 0;
/* 1086 */       this.v = 0;
/* 1087 */       this.w = 0;
/*      */     }
/*      */     
/* 1090 */     return true;
/*      */   }
/*      */   
/*      */   private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat, double paramDouble7) {
/* 1094 */     rf localrf = app.e("piston_side");
/* 1095 */     if (b()) { localrf = this.d;
/*      */     }
/* 1097 */     bmh localbmh = bmh.a;
/*      */     
/*      */ 
/* 1100 */     double d1 = localrf.c();
/* 1101 */     double d2 = localrf.e();
/* 1102 */     double d3 = localrf.a(paramDouble7);
/* 1103 */     double d4 = localrf.b(4.0D);
/*      */     
/* 1105 */     localbmh.b(paramFloat, paramFloat, paramFloat);
/*      */     
/* 1107 */     localbmh.a(paramDouble1, paramDouble4, paramDouble5, d3, d2);
/* 1108 */     localbmh.a(paramDouble1, paramDouble3, paramDouble5, d1, d2);
/* 1109 */     localbmh.a(paramDouble2, paramDouble3, paramDouble6, d1, d4);
/* 1110 */     localbmh.a(paramDouble2, paramDouble4, paramDouble6, d3, d4);
/*      */   }
/*      */   
/*      */   private void b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat, double paramDouble7) {
/* 1114 */     rf localrf = app.e("piston_side");
/* 1115 */     if (b()) { localrf = this.d;
/*      */     }
/* 1117 */     bmh localbmh = bmh.a;
/*      */     
/*      */ 
/* 1120 */     double d1 = localrf.c();
/* 1121 */     double d2 = localrf.e();
/* 1122 */     double d3 = localrf.a(paramDouble7);
/* 1123 */     double d4 = localrf.b(4.0D);
/*      */     
/* 1125 */     localbmh.b(paramFloat, paramFloat, paramFloat);
/*      */     
/* 1127 */     localbmh.a(paramDouble1, paramDouble3, paramDouble6, d3, d2);
/* 1128 */     localbmh.a(paramDouble1, paramDouble3, paramDouble5, d1, d2);
/* 1129 */     localbmh.a(paramDouble2, paramDouble4, paramDouble5, d1, d4);
/* 1130 */     localbmh.a(paramDouble2, paramDouble4, paramDouble6, d3, d4);
/*      */   }
/*      */   
/*      */   private void c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat, double paramDouble7) {
/* 1134 */     rf localrf = app.e("piston_side");
/* 1135 */     if (b()) { localrf = this.d;
/*      */     }
/* 1137 */     bmh localbmh = bmh.a;
/*      */     
/*      */ 
/* 1140 */     double d1 = localrf.c();
/* 1141 */     double d2 = localrf.e();
/* 1142 */     double d3 = localrf.a(paramDouble7);
/* 1143 */     double d4 = localrf.b(4.0D);
/*      */     
/* 1145 */     localbmh.b(paramFloat, paramFloat, paramFloat);
/*      */     
/* 1147 */     localbmh.a(paramDouble2, paramDouble3, paramDouble5, d3, d2);
/* 1148 */     localbmh.a(paramDouble1, paramDouble3, paramDouble5, d1, d2);
/* 1149 */     localbmh.a(paramDouble1, paramDouble4, paramDouble6, d1, d4);
/* 1150 */     localbmh.a(paramDouble2, paramDouble4, paramDouble6, d3, d4);
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 1154 */     this.g = true;
/* 1155 */     c(paramaji, paramInt1, paramInt2, paramInt3, paramBoolean);
/* 1156 */     this.g = false;
/*      */   }
/*      */   
/*      */   private boolean c(aji paramaji, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/* 1161 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 1162 */     int i2 = apq.b(i1);
/*      */     
/* 1164 */     float f1 = 0.25F;
/* 1165 */     float f2 = 0.375F;
/* 1166 */     float f3 = 0.625F;
/* 1167 */     float f4 = paramBoolean ? 1.0F : 0.5F;
/* 1168 */     double d1 = paramBoolean ? 16.0D : 8.0D;
/*      */     
/* 1170 */     switch (i2) {
/*      */     case 0: 
/* 1172 */       this.r = 3;
/* 1173 */       this.s = 3;
/* 1174 */       this.t = 3;
/* 1175 */       this.u = 3;
/* 1176 */       a(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D);
/* 1177 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1179 */       a(paramInt1 + 0.375F, paramInt1 + 0.625F, paramInt2 + 0.25F, paramInt2 + 0.25F + f4, paramInt3 + 0.625F, paramInt3 + 0.625F, 0.8F, d1);
/* 1180 */       a(paramInt1 + 0.625F, paramInt1 + 0.375F, paramInt2 + 0.25F, paramInt2 + 0.25F + f4, paramInt3 + 0.375F, paramInt3 + 0.375F, 0.8F, d1);
/* 1181 */       a(paramInt1 + 0.375F, paramInt1 + 0.375F, paramInt2 + 0.25F, paramInt2 + 0.25F + f4, paramInt3 + 0.375F, paramInt3 + 0.625F, 0.6F, d1);
/* 1182 */       a(paramInt1 + 0.625F, paramInt1 + 0.625F, paramInt2 + 0.25F, paramInt2 + 0.25F + f4, paramInt3 + 0.625F, paramInt3 + 0.375F, 0.6F, d1);
/*      */       
/* 1184 */       break;
/*      */     case 1: 
/* 1186 */       a(0.0D, 0.75D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1187 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1189 */       a(paramInt1 + 0.375F, paramInt1 + 0.625F, paramInt2 - 0.25F + 1.0F - f4, paramInt2 - 0.25F + 1.0F, paramInt3 + 0.625F, paramInt3 + 0.625F, 0.8F, d1);
/* 1190 */       a(paramInt1 + 0.625F, paramInt1 + 0.375F, paramInt2 - 0.25F + 1.0F - f4, paramInt2 - 0.25F + 1.0F, paramInt3 + 0.375F, paramInt3 + 0.375F, 0.8F, d1);
/* 1191 */       a(paramInt1 + 0.375F, paramInt1 + 0.375F, paramInt2 - 0.25F + 1.0F - f4, paramInt2 - 0.25F + 1.0F, paramInt3 + 0.375F, paramInt3 + 0.625F, 0.6F, d1);
/* 1192 */       a(paramInt1 + 0.625F, paramInt1 + 0.625F, paramInt2 - 0.25F + 1.0F - f4, paramInt2 - 0.25F + 1.0F, paramInt3 + 0.625F, paramInt3 + 0.375F, 0.6F, d1);
/* 1193 */       break;
/*      */     case 2: 
/* 1195 */       this.t = 1;
/* 1196 */       this.u = 2;
/* 1197 */       a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.25D);
/* 1198 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1200 */       b(paramInt1 + 0.375F, paramInt1 + 0.375F, paramInt2 + 0.625F, paramInt2 + 0.375F, paramInt3 + 0.25F, paramInt3 + 0.25F + f4, 0.6F, d1);
/* 1201 */       b(paramInt1 + 0.625F, paramInt1 + 0.625F, paramInt2 + 0.375F, paramInt2 + 0.625F, paramInt3 + 0.25F, paramInt3 + 0.25F + f4, 0.6F, d1);
/* 1202 */       b(paramInt1 + 0.375F, paramInt1 + 0.625F, paramInt2 + 0.375F, paramInt2 + 0.375F, paramInt3 + 0.25F, paramInt3 + 0.25F + f4, 0.5F, d1);
/* 1203 */       b(paramInt1 + 0.625F, paramInt1 + 0.375F, paramInt2 + 0.625F, paramInt2 + 0.625F, paramInt3 + 0.25F, paramInt3 + 0.25F + f4, 1.0F, d1);
/* 1204 */       break;
/*      */     case 3: 
/* 1206 */       this.t = 2;
/* 1207 */       this.u = 1;
/* 1208 */       this.v = 3;
/* 1209 */       this.w = 3;
/* 1210 */       a(0.0D, 0.0D, 0.75D, 1.0D, 1.0D, 1.0D);
/* 1211 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1213 */       b(paramInt1 + 0.375F, paramInt1 + 0.375F, paramInt2 + 0.625F, paramInt2 + 0.375F, paramInt3 - 0.25F + 1.0F - f4, paramInt3 - 0.25F + 1.0F, 0.6F, d1);
/* 1214 */       b(paramInt1 + 0.625F, paramInt1 + 0.625F, paramInt2 + 0.375F, paramInt2 + 0.625F, paramInt3 - 0.25F + 1.0F - f4, paramInt3 - 0.25F + 1.0F, 0.6F, d1);
/* 1215 */       b(paramInt1 + 0.375F, paramInt1 + 0.625F, paramInt2 + 0.375F, paramInt2 + 0.375F, paramInt3 - 0.25F + 1.0F - f4, paramInt3 - 0.25F + 1.0F, 0.5F, d1);
/* 1216 */       b(paramInt1 + 0.625F, paramInt1 + 0.375F, paramInt2 + 0.625F, paramInt2 + 0.625F, paramInt3 - 0.25F + 1.0F - f4, paramInt3 - 0.25F + 1.0F, 1.0F, d1);
/* 1217 */       break;
/*      */     case 4: 
/* 1219 */       this.r = 1;
/* 1220 */       this.s = 2;
/* 1221 */       this.v = 2;
/* 1222 */       this.w = 1;
/* 1223 */       a(0.0D, 0.0D, 0.0D, 0.25D, 1.0D, 1.0D);
/* 1224 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1226 */       c(paramInt1 + 0.25F, paramInt1 + 0.25F + f4, paramInt2 + 0.375F, paramInt2 + 0.375F, paramInt3 + 0.625F, paramInt3 + 0.375F, 0.5F, d1);
/* 1227 */       c(paramInt1 + 0.25F, paramInt1 + 0.25F + f4, paramInt2 + 0.625F, paramInt2 + 0.625F, paramInt3 + 0.375F, paramInt3 + 0.625F, 1.0F, d1);
/* 1228 */       c(paramInt1 + 0.25F, paramInt1 + 0.25F + f4, paramInt2 + 0.375F, paramInt2 + 0.625F, paramInt3 + 0.375F, paramInt3 + 0.375F, 0.6F, d1);
/* 1229 */       c(paramInt1 + 0.25F, paramInt1 + 0.25F + f4, paramInt2 + 0.625F, paramInt2 + 0.375F, paramInt3 + 0.625F, paramInt3 + 0.625F, 0.6F, d1);
/* 1230 */       break;
/*      */     case 5: 
/* 1232 */       this.r = 2;
/* 1233 */       this.s = 1;
/* 1234 */       this.v = 1;
/* 1235 */       this.w = 2;
/* 1236 */       a(0.75D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 1237 */       q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */       
/* 1239 */       c(paramInt1 - 0.25F + 1.0F - f4, paramInt1 - 0.25F + 1.0F, paramInt2 + 0.375F, paramInt2 + 0.375F, paramInt3 + 0.625F, paramInt3 + 0.375F, 0.5F, d1);
/* 1240 */       c(paramInt1 - 0.25F + 1.0F - f4, paramInt1 - 0.25F + 1.0F, paramInt2 + 0.625F, paramInt2 + 0.625F, paramInt3 + 0.375F, paramInt3 + 0.625F, 1.0F, d1);
/* 1241 */       c(paramInt1 - 0.25F + 1.0F - f4, paramInt1 - 0.25F + 1.0F, paramInt2 + 0.375F, paramInt2 + 0.625F, paramInt3 + 0.375F, paramInt3 + 0.375F, 0.6F, d1);
/* 1242 */       c(paramInt1 - 0.25F + 1.0F - f4, paramInt1 - 0.25F + 1.0F, paramInt2 + 0.625F, paramInt2 + 0.375F, paramInt3 + 0.625F, paramInt3 + 0.625F, 0.6F, d1);
/*      */     }
/*      */     
/* 1245 */     this.r = 0;
/* 1246 */     this.s = 0;
/* 1247 */     this.t = 0;
/* 1248 */     this.u = 0;
/* 1249 */     this.v = 0;
/* 1250 */     this.w = 0;
/* 1251 */     a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/*      */     
/* 1253 */     return true;
/*      */   }
/*      */   
/*      */   public boolean e(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 1257 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 1259 */     int i2 = i1 & 0x7;
/* 1260 */     int i3 = (i1 & 0x8) > 0 ? 1 : 0;
/*      */     
/* 1262 */     bmh localbmh = bmh.a;
/*      */     
/* 1264 */     boolean bool = b();
/* 1265 */     if (!bool) a(b(ajn.e));
/* 1266 */     float f1 = 0.25F;
/* 1267 */     float f2 = 0.1875F;
/* 1268 */     float f3 = 0.1875F;
/* 1269 */     if (i2 == 5) {
/* 1270 */       a(0.5F - f2, 0.0D, 0.5F - f1, 0.5F + f2, f3, 0.5F + f1);
/* 1271 */     } else if (i2 == 6) {
/* 1272 */       a(0.5F - f1, 0.0D, 0.5F - f2, 0.5F + f1, f3, 0.5F + f2);
/* 1273 */     } else if (i2 == 4) {
/* 1274 */       a(0.5F - f2, 0.5F - f1, 1.0F - f3, 0.5F + f2, 0.5F + f1, 1.0D);
/* 1275 */     } else if (i2 == 3) {
/* 1276 */       a(0.5F - f2, 0.5F - f1, 0.0D, 0.5F + f2, 0.5F + f1, f3);
/* 1277 */     } else if (i2 == 2) {
/* 1278 */       a(1.0F - f3, 0.5F - f1, 0.5F - f2, 1.0D, 0.5F + f1, 0.5F + f2);
/* 1279 */     } else if (i2 == 1) {
/* 1280 */       a(0.0D, 0.5F - f1, 0.5F - f2, f3, 0.5F + f1, 0.5F + f2);
/* 1281 */     } else if (i2 == 0) {
/* 1282 */       a(0.5F - f1, 1.0F - f3, 0.5F - f2, 0.5F + f1, 1.0D, 0.5F + f2);
/* 1283 */     } else if (i2 == 7) {
/* 1284 */       a(0.5F - f2, 1.0F - f3, 0.5F - f1, 0.5F + f2, 1.0D, 0.5F + f1);
/*      */     }
/* 1286 */     q(paramaji, paramInt1, paramInt2, paramInt3);
/* 1287 */     if (!bool) { a();
/*      */     }
/* 1289 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 1290 */     localbmh.b(1.0F, 1.0F, 1.0F);
/* 1291 */     rf localrf = a(paramaji, 0);
/*      */     
/* 1293 */     if (b()) localrf = this.d;
/* 1294 */     double d1 = localrf.c();
/* 1295 */     double d2 = localrf.e();
/* 1296 */     double d3 = localrf.d();
/* 1297 */     double d4 = localrf.f();
/*      */     
/* 1299 */     azw[] arrayOfazw = new azw[8];
/* 1300 */     float f4 = 0.0625F;
/* 1301 */     float f5 = 0.0625F;
/* 1302 */     float f6 = 0.625F;
/* 1303 */     arrayOfazw[0] = azw.a(-f4, 0.0D, -f5);
/* 1304 */     arrayOfazw[1] = azw.a(f4, 0.0D, -f5);
/* 1305 */     arrayOfazw[2] = azw.a(f4, 0.0D, f5);
/* 1306 */     arrayOfazw[3] = azw.a(-f4, 0.0D, f5);
/* 1307 */     arrayOfazw[4] = azw.a(-f4, f6, -f5);
/* 1308 */     arrayOfazw[5] = azw.a(f4, f6, -f5);
/* 1309 */     arrayOfazw[6] = azw.a(f4, f6, f5);
/* 1310 */     arrayOfazw[7] = azw.a(-f4, f6, f5);
/*      */     
/* 1312 */     for (int i4 = 0; i4 < 8; i4++) {
/* 1313 */       if (i3 != 0) {
/* 1314 */         arrayOfazw[i4].c -= 0.0625D;
/* 1315 */         arrayOfazw[i4].a(0.69813174F);
/*      */       } else {
/* 1317 */         arrayOfazw[i4].c += 0.0625D;
/* 1318 */         arrayOfazw[i4].a(-0.69813174F);
/*      */       }
/* 1320 */       if ((i2 == 0) || (i2 == 7)) {
/* 1321 */         arrayOfazw[i4].c(3.1415927F);
/*      */       }
/* 1323 */       if ((i2 == 6) || (i2 == 0)) {
/* 1324 */         arrayOfazw[i4].b(1.5707964F);
/*      */       }
/*      */       
/* 1327 */       if ((i2 > 0) && (i2 < 5)) {
/* 1328 */         arrayOfazw[i4].b -= 0.375D;
/* 1329 */         arrayOfazw[i4].a(1.5707964F);
/*      */         
/* 1331 */         if (i2 == 4) arrayOfazw[i4].b(0.0F);
/* 1332 */         if (i2 == 3) arrayOfazw[i4].b(3.1415927F);
/* 1333 */         if (i2 == 2) arrayOfazw[i4].b(1.5707964F);
/* 1334 */         if (i2 == 1) { arrayOfazw[i4].b(-1.5707964F);
/*      */         }
/* 1336 */         arrayOfazw[i4].a += paramInt1 + 0.5D;
/* 1337 */         arrayOfazw[i4].b += paramInt2 + 0.5F;
/* 1338 */         arrayOfazw[i4].c += paramInt3 + 0.5D;
/* 1339 */       } else if ((i2 == 0) || (i2 == 7)) {
/* 1340 */         arrayOfazw[i4].a += paramInt1 + 0.5D;
/* 1341 */         arrayOfazw[i4].b += paramInt2 + 0.875F;
/* 1342 */         arrayOfazw[i4].c += paramInt3 + 0.5D;
/*      */       } else {
/* 1344 */         arrayOfazw[i4].a += paramInt1 + 0.5D;
/* 1345 */         arrayOfazw[i4].b += paramInt2 + 0.125F;
/* 1346 */         arrayOfazw[i4].c += paramInt3 + 0.5D;
/*      */       }
/*      */     }
/*      */     
/* 1350 */     azw localazw1 = null;azw localazw2 = null;azw localazw3 = null;azw localazw4 = null;
/* 1351 */     for (int i5 = 0; i5 < 6; i5++) {
/* 1352 */       if (i5 == 0) {
/* 1353 */         d1 = localrf.a(7.0D);
/* 1354 */         d2 = localrf.b(6.0D);
/* 1355 */         d3 = localrf.a(9.0D);
/* 1356 */         d4 = localrf.b(8.0D);
/* 1357 */       } else if (i5 == 2) {
/* 1358 */         d1 = localrf.a(7.0D);
/* 1359 */         d2 = localrf.b(6.0D);
/* 1360 */         d3 = localrf.a(9.0D);
/* 1361 */         d4 = localrf.f();
/*      */       }
/* 1363 */       if (i5 == 0) {
/* 1364 */         localazw1 = arrayOfazw[0];
/* 1365 */         localazw2 = arrayOfazw[1];
/* 1366 */         localazw3 = arrayOfazw[2];
/* 1367 */         localazw4 = arrayOfazw[3];
/* 1368 */       } else if (i5 == 1) {
/* 1369 */         localazw1 = arrayOfazw[7];
/* 1370 */         localazw2 = arrayOfazw[6];
/* 1371 */         localazw3 = arrayOfazw[5];
/* 1372 */         localazw4 = arrayOfazw[4];
/* 1373 */       } else if (i5 == 2) {
/* 1374 */         localazw1 = arrayOfazw[1];
/* 1375 */         localazw2 = arrayOfazw[0];
/* 1376 */         localazw3 = arrayOfazw[4];
/* 1377 */         localazw4 = arrayOfazw[5];
/* 1378 */       } else if (i5 == 3) {
/* 1379 */         localazw1 = arrayOfazw[2];
/* 1380 */         localazw2 = arrayOfazw[1];
/* 1381 */         localazw3 = arrayOfazw[5];
/* 1382 */         localazw4 = arrayOfazw[6];
/* 1383 */       } else if (i5 == 4) {
/* 1384 */         localazw1 = arrayOfazw[3];
/* 1385 */         localazw2 = arrayOfazw[2];
/* 1386 */         localazw3 = arrayOfazw[6];
/* 1387 */         localazw4 = arrayOfazw[7];
/* 1388 */       } else if (i5 == 5) {
/* 1389 */         localazw1 = arrayOfazw[0];
/* 1390 */         localazw2 = arrayOfazw[3];
/* 1391 */         localazw3 = arrayOfazw[7];
/* 1392 */         localazw4 = arrayOfazw[4];
/*      */       }
/* 1394 */       localbmh.a(localazw1.a, localazw1.b, localazw1.c, d1, d4);
/* 1395 */       localbmh.a(localazw2.a, localazw2.b, localazw2.c, d3, d4);
/* 1396 */       localbmh.a(localazw3.a, localazw3.b, localazw3.c, d3, d2);
/* 1397 */       localbmh.a(localazw4.a, localazw4.b, localazw4.c, d1, d2);
/*      */     }
/* 1399 */     return true;
/*      */   }
/*      */   
/*      */   public boolean f(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 1403 */     bmh localbmh = bmh.a;
/* 1404 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 1405 */     int i2 = i1 & 0x3;
/* 1406 */     int i3 = (i1 & 0x4) == 4 ? 1 : 0;
/* 1407 */     int i4 = (i1 & 0x8) == 8 ? 1 : 0;
/* 1408 */     int i5 = !ahb.a(this.a, paramInt1, paramInt2 - 1, paramInt3) ? 1 : 0;
/*      */     
/* 1410 */     boolean bool = b();
/* 1411 */     if (!bool) { a(b(ajn.f));
/*      */     }
/* 1413 */     float f1 = 0.25F;
/* 1414 */     float f2 = 0.125F;
/* 1415 */     float f3 = 0.125F;
/*      */     
/* 1417 */     float f4 = 0.3F - f1;
/* 1418 */     float f5 = 0.3F + f1;
/* 1419 */     if (i2 == 2) {
/* 1420 */       a(0.5F - f2, f4, 1.0F - f3, 0.5F + f2, f5, 1.0D);
/* 1421 */     } else if (i2 == 0) {
/* 1422 */       a(0.5F - f2, f4, 0.0D, 0.5F + f2, f5, f3);
/* 1423 */     } else if (i2 == 1) {
/* 1424 */       a(1.0F - f3, f4, 0.5F - f2, 1.0D, f5, 0.5F + f2);
/* 1425 */     } else if (i2 == 3) {
/* 1426 */       a(0.0D, f4, 0.5F - f2, f3, f5, 0.5F + f2);
/*      */     }
/*      */     
/* 1429 */     q(paramaji, paramInt1, paramInt2, paramInt3);
/* 1430 */     if (!bool) { a();
/*      */     }
/* 1432 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 1433 */     localbmh.b(1.0F, 1.0F, 1.0F);
/* 1434 */     rf localrf = a(paramaji, 0);
/*      */     
/* 1436 */     if (b()) localrf = this.d;
/* 1437 */     double d1 = localrf.c();
/* 1438 */     double d2 = localrf.e();
/* 1439 */     double d3 = localrf.d();
/* 1440 */     double d4 = localrf.f();
/*      */     
/* 1442 */     azw[] arrayOfazw = new azw[8];
/* 1443 */     float f6 = 0.046875F;
/* 1444 */     float f7 = 0.046875F;
/* 1445 */     float f8 = 0.3125F;
/* 1446 */     arrayOfazw[0] = azw.a(-f6, 0.0D, -f7);
/* 1447 */     arrayOfazw[1] = azw.a(f6, 0.0D, -f7);
/* 1448 */     arrayOfazw[2] = azw.a(f6, 0.0D, f7);
/* 1449 */     arrayOfazw[3] = azw.a(-f6, 0.0D, f7);
/* 1450 */     arrayOfazw[4] = azw.a(-f6, f8, -f7);
/* 1451 */     arrayOfazw[5] = azw.a(f6, f8, -f7);
/* 1452 */     arrayOfazw[6] = azw.a(f6, f8, f7);
/* 1453 */     arrayOfazw[7] = azw.a(-f6, f8, f7);
/*      */     
/* 1455 */     for (int i6 = 0; i6 < 8; i6++) {
/* 1456 */       arrayOfazw[i6].c += 0.0625D;
/*      */       
/* 1458 */       if (i4 != 0) {
/* 1459 */         arrayOfazw[i6].a(0.5235988F);
/* 1460 */         arrayOfazw[i6].b -= 0.4375D;
/* 1461 */       } else if (i3 != 0) {
/* 1462 */         arrayOfazw[i6].a(0.08726647F);
/* 1463 */         arrayOfazw[i6].b -= 0.4375D;
/*      */       } else {
/* 1465 */         arrayOfazw[i6].a(-0.69813174F);
/* 1466 */         arrayOfazw[i6].b -= 0.375D;
/*      */       }
/*      */       
/* 1469 */       arrayOfazw[i6].a(1.5707964F);
/*      */       
/* 1471 */       if (i2 == 2) arrayOfazw[i6].b(0.0F);
/* 1472 */       if (i2 == 0) arrayOfazw[i6].b(3.1415927F);
/* 1473 */       if (i2 == 1) arrayOfazw[i6].b(1.5707964F);
/* 1474 */       if (i2 == 3) { arrayOfazw[i6].b(-1.5707964F);
/*      */       }
/* 1476 */       arrayOfazw[i6].a += paramInt1 + 0.5D;
/* 1477 */       arrayOfazw[i6].b += paramInt2 + 0.3125F;
/* 1478 */       arrayOfazw[i6].c += paramInt3 + 0.5D;
/*      */     }
/*      */     
/* 1481 */     azw localazw1 = null;azw localazw2 = null;azw localazw3 = null;azw localazw4 = null;
/* 1482 */     int i7 = 7;
/* 1483 */     int i8 = 9;
/* 1484 */     int i9 = 9;
/* 1485 */     int i10 = 16;
/*      */     
/* 1487 */     for (int i11 = 0; i11 < 6; i11++) {
/* 1488 */       if (i11 == 0) {
/* 1489 */         localazw1 = arrayOfazw[0];
/* 1490 */         localazw2 = arrayOfazw[1];
/* 1491 */         localazw3 = arrayOfazw[2];
/* 1492 */         localazw4 = arrayOfazw[3];
/* 1493 */         d1 = localrf.a(i7);
/* 1494 */         d2 = localrf.b(i9);
/* 1495 */         d3 = localrf.a(i8);
/* 1496 */         d4 = localrf.b(i9 + 2);
/* 1497 */       } else if (i11 == 1) {
/* 1498 */         localazw1 = arrayOfazw[7];
/* 1499 */         localazw2 = arrayOfazw[6];
/* 1500 */         localazw3 = arrayOfazw[5];
/* 1501 */         localazw4 = arrayOfazw[4];
/* 1502 */       } else if (i11 == 2) {
/* 1503 */         localazw1 = arrayOfazw[1];
/* 1504 */         localazw2 = arrayOfazw[0];
/* 1505 */         localazw3 = arrayOfazw[4];
/* 1506 */         localazw4 = arrayOfazw[5];
/* 1507 */         d1 = localrf.a(i7);
/* 1508 */         d2 = localrf.b(i9);
/* 1509 */         d3 = localrf.a(i8);
/* 1510 */         d4 = localrf.b(i10);
/* 1511 */       } else if (i11 == 3) {
/* 1512 */         localazw1 = arrayOfazw[2];
/* 1513 */         localazw2 = arrayOfazw[1];
/* 1514 */         localazw3 = arrayOfazw[5];
/* 1515 */         localazw4 = arrayOfazw[6];
/* 1516 */       } else if (i11 == 4) {
/* 1517 */         localazw1 = arrayOfazw[3];
/* 1518 */         localazw2 = arrayOfazw[2];
/* 1519 */         localazw3 = arrayOfazw[6];
/* 1520 */         localazw4 = arrayOfazw[7];
/* 1521 */       } else if (i11 == 5) {
/* 1522 */         localazw1 = arrayOfazw[0];
/* 1523 */         localazw2 = arrayOfazw[3];
/* 1524 */         localazw3 = arrayOfazw[7];
/* 1525 */         localazw4 = arrayOfazw[4];
/*      */       }
/* 1527 */       localbmh.a(localazw1.a, localazw1.b, localazw1.c, d1, d4);
/* 1528 */       localbmh.a(localazw2.a, localazw2.b, localazw2.c, d3, d4);
/* 1529 */       localbmh.a(localazw3.a, localazw3.b, localazw3.c, d3, d2);
/* 1530 */       localbmh.a(localazw4.a, localazw4.b, localazw4.c, d1, d2);
/*      */     }
/*      */     
/*      */ 
/* 1534 */     float f9 = 0.09375F;
/* 1535 */     float f10 = 0.09375F;
/* 1536 */     float f11 = 0.03125F;
/* 1537 */     arrayOfazw[0] = azw.a(-f9, 0.0D, -f10);
/* 1538 */     arrayOfazw[1] = azw.a(f9, 0.0D, -f10);
/* 1539 */     arrayOfazw[2] = azw.a(f9, 0.0D, f10);
/* 1540 */     arrayOfazw[3] = azw.a(-f9, 0.0D, f10);
/* 1541 */     arrayOfazw[4] = azw.a(-f9, f11, -f10);
/* 1542 */     arrayOfazw[5] = azw.a(f9, f11, -f10);
/* 1543 */     arrayOfazw[6] = azw.a(f9, f11, f10);
/* 1544 */     arrayOfazw[7] = azw.a(-f9, f11, f10);
/*      */     
/* 1546 */     for (int i12 = 0; i12 < 8; i12++) {
/* 1547 */       arrayOfazw[i12].c += 0.21875D;
/*      */       
/* 1549 */       if (i4 != 0) {
/* 1550 */         arrayOfazw[i12].b -= 0.09375D;
/* 1551 */         arrayOfazw[i12].c -= 0.1625D;
/* 1552 */         arrayOfazw[i12].a(0.0F);
/* 1553 */       } else if (i3 != 0) {
/* 1554 */         arrayOfazw[i12].b += 0.015625D;
/* 1555 */         arrayOfazw[i12].c -= 0.171875D;
/* 1556 */         arrayOfazw[i12].a(0.17453294F);
/*      */       } else {
/* 1558 */         arrayOfazw[i12].a(0.87266463F);
/*      */       }
/*      */       
/* 1561 */       if (i2 == 2) arrayOfazw[i12].b(0.0F);
/* 1562 */       if (i2 == 0) arrayOfazw[i12].b(3.1415927F);
/* 1563 */       if (i2 == 1) arrayOfazw[i12].b(1.5707964F);
/* 1564 */       if (i2 == 3) { arrayOfazw[i12].b(-1.5707964F);
/*      */       }
/* 1566 */       arrayOfazw[i12].a += paramInt1 + 0.5D;
/* 1567 */       arrayOfazw[i12].b += paramInt2 + 0.3125F;
/* 1568 */       arrayOfazw[i12].c += paramInt3 + 0.5D;
/*      */     }
/*      */     
/* 1571 */     i12 = 5;
/* 1572 */     int i13 = 11;
/* 1573 */     int i14 = 3;
/* 1574 */     int i15 = 9;
/*      */     
/* 1576 */     for (int i16 = 0; i16 < 6; i16++) {
/* 1577 */       if (i16 == 0) {
/* 1578 */         localazw1 = arrayOfazw[0];
/* 1579 */         localazw2 = arrayOfazw[1];
/* 1580 */         localazw3 = arrayOfazw[2];
/* 1581 */         localazw4 = arrayOfazw[3];
/* 1582 */         d1 = localrf.a(i12);
/* 1583 */         d2 = localrf.b(i14);
/* 1584 */         d3 = localrf.a(i13);
/* 1585 */         d4 = localrf.b(i15);
/* 1586 */       } else if (i16 == 1) {
/* 1587 */         localazw1 = arrayOfazw[7];
/* 1588 */         localazw2 = arrayOfazw[6];
/* 1589 */         localazw3 = arrayOfazw[5];
/* 1590 */         localazw4 = arrayOfazw[4];
/* 1591 */       } else if (i16 == 2) {
/* 1592 */         localazw1 = arrayOfazw[1];
/* 1593 */         localazw2 = arrayOfazw[0];
/* 1594 */         localazw3 = arrayOfazw[4];
/* 1595 */         localazw4 = arrayOfazw[5];
/* 1596 */         d1 = localrf.a(i12);
/* 1597 */         d2 = localrf.b(i14);
/* 1598 */         d3 = localrf.a(i13);
/* 1599 */         d4 = localrf.b(i14 + 2);
/* 1600 */       } else if (i16 == 3) {
/* 1601 */         localazw1 = arrayOfazw[2];
/* 1602 */         localazw2 = arrayOfazw[1];
/* 1603 */         localazw3 = arrayOfazw[5];
/* 1604 */         localazw4 = arrayOfazw[6];
/* 1605 */       } else if (i16 == 4) {
/* 1606 */         localazw1 = arrayOfazw[3];
/* 1607 */         localazw2 = arrayOfazw[2];
/* 1608 */         localazw3 = arrayOfazw[6];
/* 1609 */         localazw4 = arrayOfazw[7];
/* 1610 */       } else if (i16 == 5) {
/* 1611 */         localazw1 = arrayOfazw[0];
/* 1612 */         localazw2 = arrayOfazw[3];
/* 1613 */         localazw3 = arrayOfazw[7];
/* 1614 */         localazw4 = arrayOfazw[4];
/*      */       }
/* 1616 */       localbmh.a(localazw1.a, localazw1.b, localazw1.c, d1, d4);
/* 1617 */       localbmh.a(localazw2.a, localazw2.b, localazw2.c, d3, d4);
/* 1618 */       localbmh.a(localazw3.a, localazw3.b, localazw3.c, d3, d2);
/* 1619 */       localbmh.a(localazw4.a, localazw4.b, localazw4.c, d1, d2);
/*      */     }
/*      */     
/* 1622 */     if (i3 != 0) {
/* 1623 */       double d5 = arrayOfazw[0].b;
/* 1624 */       float f12 = 0.03125F;
/* 1625 */       float f13 = 0.5F - f12 / 2.0F;
/* 1626 */       float f14 = f13 + f12;
/* 1627 */       double d6 = localrf.c();
/* 1628 */       double d7 = localrf.b(i3 != 0 ? 2.0D : 0.0D);
/* 1629 */       double d8 = localrf.d();
/* 1630 */       double d9 = localrf.b(i3 != 0 ? 4.0D : 2.0D);
/* 1631 */       double d10 = (i5 != 0 ? 3.5F : 1.5F) / 16.0D;
/*      */       
/* 1633 */       localbmh.b(0.75F, 0.75F, 0.75F);
/*      */       
/* 1635 */       if (i2 == 2) {
/* 1636 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3 + 0.25D, d6, d7);
/* 1637 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3 + 0.25D, d6, d9);
/* 1638 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3, d8, d9);
/* 1639 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3, d8, d7);
/*      */         
/* 1641 */         localbmh.a(paramInt1 + f13, d5, paramInt3 + 0.5D, d6, d7);
/* 1642 */         localbmh.a(paramInt1 + f14, d5, paramInt3 + 0.5D, d6, d9);
/* 1643 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3 + 0.25D, d8, d9);
/* 1644 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3 + 0.25D, d8, d7);
/* 1645 */       } else if (i2 == 0) {
/* 1646 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3 + 0.75D, d6, d7);
/* 1647 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3 + 0.75D, d6, d9);
/* 1648 */         localbmh.a(paramInt1 + f14, d5, paramInt3 + 0.5D, d8, d9);
/* 1649 */         localbmh.a(paramInt1 + f13, d5, paramInt3 + 0.5D, d8, d7);
/*      */         
/* 1651 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3 + 1, d6, d7);
/* 1652 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3 + 1, d6, d9);
/* 1653 */         localbmh.a(paramInt1 + f14, paramInt2 + d10, paramInt3 + 0.75D, d8, d9);
/* 1654 */         localbmh.a(paramInt1 + f13, paramInt2 + d10, paramInt3 + 0.75D, d8, d7);
/* 1655 */       } else if (i2 == 1) {
/* 1656 */         localbmh.a(paramInt1, paramInt2 + d10, paramInt3 + f14, d6, d9);
/* 1657 */         localbmh.a(paramInt1 + 0.25D, paramInt2 + d10, paramInt3 + f14, d8, d9);
/* 1658 */         localbmh.a(paramInt1 + 0.25D, paramInt2 + d10, paramInt3 + f13, d8, d7);
/* 1659 */         localbmh.a(paramInt1, paramInt2 + d10, paramInt3 + f13, d6, d7);
/*      */         
/* 1661 */         localbmh.a(paramInt1 + 0.25D, paramInt2 + d10, paramInt3 + f14, d6, d9);
/* 1662 */         localbmh.a(paramInt1 + 0.5D, d5, paramInt3 + f14, d8, d9);
/* 1663 */         localbmh.a(paramInt1 + 0.5D, d5, paramInt3 + f13, d8, d7);
/* 1664 */         localbmh.a(paramInt1 + 0.25D, paramInt2 + d10, paramInt3 + f13, d6, d7);
/*      */       } else {
/* 1666 */         localbmh.a(paramInt1 + 0.5D, d5, paramInt3 + f14, d6, d9);
/* 1667 */         localbmh.a(paramInt1 + 0.75D, paramInt2 + d10, paramInt3 + f14, d8, d9);
/* 1668 */         localbmh.a(paramInt1 + 0.75D, paramInt2 + d10, paramInt3 + f13, d8, d7);
/* 1669 */         localbmh.a(paramInt1 + 0.5D, d5, paramInt3 + f13, d6, d7);
/*      */         
/* 1671 */         localbmh.a(paramInt1 + 0.75D, paramInt2 + d10, paramInt3 + f14, d6, d9);
/* 1672 */         localbmh.a(paramInt1 + 1, paramInt2 + d10, paramInt3 + f14, d8, d9);
/* 1673 */         localbmh.a(paramInt1 + 1, paramInt2 + d10, paramInt3 + f13, d8, d7);
/* 1674 */         localbmh.a(paramInt1 + 0.75D, paramInt2 + d10, paramInt3 + f13, d6, d7);
/*      */       }
/*      */     }
/*      */     
/* 1678 */     return true;
/*      */   }
/*      */   
/*      */   public boolean g(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 1682 */     bmh localbmh = bmh.a;
/* 1683 */     rf localrf = a(paramaji, 0);
/* 1684 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 1685 */     int i2 = (i1 & 0x4) == 4 ? 1 : 0;
/* 1686 */     int i3 = (i1 & 0x2) == 2 ? 1 : 0;
/*      */     
/* 1688 */     if (b()) { localrf = this.d;
/*      */     }
/* 1690 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 1691 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/* 1693 */     double d1 = localrf.c();
/* 1694 */     double d2 = localrf.b(i2 != 0 ? 2.0D : 0.0D);
/* 1695 */     double d3 = localrf.d();
/* 1696 */     double d4 = localrf.b(i2 != 0 ? 4.0D : 2.0D);
/* 1697 */     double d5 = (i3 != 0 ? 3.5F : 1.5F) / 16.0D;
/*      */     
/* 1699 */     boolean bool1 = aof.a(this.a, paramInt1, paramInt2, paramInt3, i1, 1);
/* 1700 */     boolean bool2 = aof.a(this.a, paramInt1, paramInt2, paramInt3, i1, 3);
/* 1701 */     boolean bool3 = aof.a(this.a, paramInt1, paramInt2, paramInt3, i1, 2);
/* 1702 */     boolean bool4 = aof.a(this.a, paramInt1, paramInt2, paramInt3, i1, 0);
/*      */     
/* 1704 */     float f1 = 0.03125F;
/* 1705 */     float f2 = 0.5F - f1 / 2.0F;
/* 1706 */     float f3 = f2 + f1;
/*      */     
/* 1708 */     if ((!bool3) && (!bool2) && (!bool4) && (!bool1)) {
/* 1709 */       bool3 = true;
/* 1710 */       bool4 = true;
/*      */     }
/*      */     
/* 1713 */     if (bool3) {
/* 1714 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.25D, d1, d2);
/* 1715 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.25D, d1, d4);
/* 1716 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3, d3, d4);
/* 1717 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3, d3, d2);
/*      */       
/* 1719 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3, d3, d2);
/* 1720 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3, d3, d4);
/* 1721 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.25D, d1, d4);
/* 1722 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.25D, d1, d2);
/*      */     }
/* 1724 */     if ((bool3) || ((bool4) && (!bool2) && (!bool1))) {
/* 1725 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.5D, d1, d2);
/* 1726 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.5D, d1, d4);
/* 1727 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.25D, d3, d4);
/* 1728 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.25D, d3, d2);
/*      */       
/* 1730 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.25D, d3, d2);
/* 1731 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.25D, d3, d4);
/* 1732 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.5D, d1, d4);
/* 1733 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.5D, d1, d2);
/*      */     }
/* 1735 */     if ((bool4) || ((bool3) && (!bool2) && (!bool1))) {
/* 1736 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.75D, d1, d2);
/* 1737 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.75D, d1, d4);
/* 1738 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.5D, d3, d4);
/* 1739 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.5D, d3, d2);
/*      */       
/* 1741 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.5D, d3, d2);
/* 1742 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.5D, d3, d4);
/* 1743 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.75D, d1, d4);
/* 1744 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.75D, d1, d2);
/*      */     }
/* 1746 */     if (bool4) {
/* 1747 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 1, d1, d2);
/* 1748 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 1, d1, d4);
/* 1749 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.75D, d3, d4);
/* 1750 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.75D, d3, d2);
/*      */       
/* 1752 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 0.75D, d3, d2);
/* 1753 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 0.75D, d3, d4);
/* 1754 */       localbmh.a(paramInt1 + f3, paramInt2 + d5, paramInt3 + 1, d1, d4);
/* 1755 */       localbmh.a(paramInt1 + f2, paramInt2 + d5, paramInt3 + 1, d1, d2);
/*      */     }
/*      */     
/* 1758 */     if (bool1) {
/* 1759 */       localbmh.a(paramInt1, paramInt2 + d5, paramInt3 + f3, d1, d4);
/* 1760 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1761 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1762 */       localbmh.a(paramInt1, paramInt2 + d5, paramInt3 + f2, d1, d2);
/*      */       
/* 1764 */       localbmh.a(paramInt1, paramInt2 + d5, paramInt3 + f2, d1, d2);
/* 1765 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1766 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1767 */       localbmh.a(paramInt1, paramInt2 + d5, paramInt3 + f3, d1, d4);
/*      */     }
/* 1769 */     if ((bool1) || ((bool2) && (!bool3) && (!bool4))) {
/* 1770 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/* 1771 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1772 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1773 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/*      */       
/* 1775 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/* 1776 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1777 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1778 */       localbmh.a(paramInt1 + 0.25D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/*      */     }
/* 1780 */     if ((bool2) || ((bool1) && (!bool3) && (!bool4))) {
/* 1781 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/* 1782 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1783 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1784 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/*      */       
/* 1786 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/* 1787 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1788 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1789 */       localbmh.a(paramInt1 + 0.5D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/*      */     }
/* 1791 */     if (bool2) {
/* 1792 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/* 1793 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1794 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1795 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/*      */       
/* 1797 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f2, d1, d2);
/* 1798 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + f2, d3, d2);
/* 1799 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + f3, d3, d4);
/* 1800 */       localbmh.a(paramInt1 + 0.75D, paramInt2 + d5, paramInt3 + f3, d1, d4);
/*      */     }
/*      */     
/* 1803 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(alb paramalb, int paramInt1, int paramInt2, int paramInt3) {
/* 1807 */     bmh localbmh = bmh.a;
/* 1808 */     rf localrf1 = paramalb.c(0);
/* 1809 */     rf localrf2 = paramalb.c(1);
/* 1810 */     rf localrf3 = localrf1;
/*      */     
/* 1812 */     if (b()) { localrf3 = this.d;
/*      */     }
/* 1814 */     localbmh.b(1.0F, 1.0F, 1.0F);
/* 1815 */     localbmh.b(paramalb.c(this.a, paramInt1, paramInt2, paramInt3));
/*      */     
/* 1817 */     double d1 = localrf3.c();
/* 1818 */     double d2 = localrf3.e();
/* 1819 */     double d3 = localrf3.d();
/* 1820 */     double d4 = localrf3.f();
/* 1821 */     float f1 = 1.4F;
/*      */     double d6;
/*      */     double d7;
/* 1824 */     double d8; double d9; double d10; double d11; double d12; if ((ahb.a(this.a, paramInt1, paramInt2 - 1, paramInt3)) || (ajn.ab.e(this.a, paramInt1, paramInt2 - 1, paramInt3))) {
/* 1825 */       double d5 = paramInt1 + 0.5D + 0.2D;
/* 1826 */       d6 = paramInt1 + 0.5D - 0.2D;
/* 1827 */       d7 = paramInt3 + 0.5D + 0.2D;
/* 1828 */       d8 = paramInt3 + 0.5D - 0.2D;
/*      */       
/* 1830 */       d9 = paramInt1 + 0.5D - 0.3D;
/* 1831 */       d10 = paramInt1 + 0.5D + 0.3D;
/* 1832 */       d11 = paramInt3 + 0.5D - 0.3D;
/* 1833 */       d12 = paramInt3 + 0.5D + 0.3D;
/*      */       
/* 1835 */       localbmh.a(d9, paramInt2 + f1, paramInt3 + 1, d3, d2);
/* 1836 */       localbmh.a(d5, paramInt2 + 0, paramInt3 + 1, d3, d4);
/* 1837 */       localbmh.a(d5, paramInt2 + 0, paramInt3 + 0, d1, d4);
/* 1838 */       localbmh.a(d9, paramInt2 + f1, paramInt3 + 0, d1, d2);
/*      */       
/* 1840 */       localbmh.a(d10, paramInt2 + f1, paramInt3 + 0, d3, d2);
/* 1841 */       localbmh.a(d6, paramInt2 + 0, paramInt3 + 0, d3, d4);
/* 1842 */       localbmh.a(d6, paramInt2 + 0, paramInt3 + 1, d1, d4);
/* 1843 */       localbmh.a(d10, paramInt2 + f1, paramInt3 + 1, d1, d2);
/*      */       
/* 1845 */       localrf3 = localrf2;
/* 1846 */       d1 = localrf3.c();
/* 1847 */       d2 = localrf3.e();
/* 1848 */       d3 = localrf3.d();
/* 1849 */       d4 = localrf3.f();
/*      */       
/* 1851 */       localbmh.a(paramInt1 + 1, paramInt2 + f1, d12, d3, d2);
/* 1852 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, d8, d3, d4);
/* 1853 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, d8, d1, d4);
/* 1854 */       localbmh.a(paramInt1 + 0, paramInt2 + f1, d12, d1, d2);
/*      */       
/* 1856 */       localbmh.a(paramInt1 + 0, paramInt2 + f1, d11, d3, d2);
/* 1857 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, d7, d3, d4);
/* 1858 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, d7, d1, d4);
/* 1859 */       localbmh.a(paramInt1 + 1, paramInt2 + f1, d11, d1, d2);
/*      */       
/* 1861 */       d5 = paramInt1 + 0.5D - 0.5D;
/* 1862 */       d6 = paramInt1 + 0.5D + 0.5D;
/* 1863 */       d7 = paramInt3 + 0.5D - 0.5D;
/* 1864 */       d8 = paramInt3 + 0.5D + 0.5D;
/*      */       
/* 1866 */       d9 = paramInt1 + 0.5D - 0.4D;
/* 1867 */       d10 = paramInt1 + 0.5D + 0.4D;
/* 1868 */       d11 = paramInt3 + 0.5D - 0.4D;
/* 1869 */       d12 = paramInt3 + 0.5D + 0.4D;
/*      */       
/* 1871 */       localbmh.a(d9, paramInt2 + f1, paramInt3 + 0, d1, d2);
/* 1872 */       localbmh.a(d5, paramInt2 + 0, paramInt3 + 0, d1, d4);
/* 1873 */       localbmh.a(d5, paramInt2 + 0, paramInt3 + 1, d3, d4);
/* 1874 */       localbmh.a(d9, paramInt2 + f1, paramInt3 + 1, d3, d2);
/*      */       
/* 1876 */       localbmh.a(d10, paramInt2 + f1, paramInt3 + 1, d1, d2);
/* 1877 */       localbmh.a(d6, paramInt2 + 0, paramInt3 + 1, d1, d4);
/* 1878 */       localbmh.a(d6, paramInt2 + 0, paramInt3 + 0, d3, d4);
/* 1879 */       localbmh.a(d10, paramInt2 + f1, paramInt3 + 0, d3, d2);
/*      */       
/* 1881 */       localrf3 = localrf1;
/* 1882 */       d1 = localrf3.c();
/* 1883 */       d2 = localrf3.e();
/* 1884 */       d3 = localrf3.d();
/* 1885 */       d4 = localrf3.f();
/*      */       
/* 1887 */       localbmh.a(paramInt1 + 0, paramInt2 + f1, d12, d1, d2);
/* 1888 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, d8, d1, d4);
/* 1889 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, d8, d3, d4);
/* 1890 */       localbmh.a(paramInt1 + 1, paramInt2 + f1, d12, d3, d2);
/*      */       
/* 1892 */       localbmh.a(paramInt1 + 1, paramInt2 + f1, d11, d1, d2);
/* 1893 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, d7, d1, d4);
/* 1894 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, d7, d3, d4);
/* 1895 */       localbmh.a(paramInt1 + 0, paramInt2 + f1, d11, d3, d2);
/*      */     } else {
/* 1897 */       float f2 = 0.2F;
/* 1898 */       float f3 = 0.0625F;
/* 1899 */       if ((paramInt1 + paramInt2 + paramInt3 & 0x1) == 1) {
/* 1900 */         localrf3 = localrf2;
/* 1901 */         d1 = localrf3.c();
/* 1902 */         d2 = localrf3.e();
/* 1903 */         d3 = localrf3.d();
/* 1904 */         d4 = localrf3.f();
/*      */       }
/* 1906 */       if ((paramInt1 / 2 + paramInt2 / 2 + paramInt3 / 2 & 0x1) == 1) {
/* 1907 */         d6 = d3;
/* 1908 */         d3 = d1;
/* 1909 */         d1 = d6;
/*      */       }
/* 1911 */       if (ajn.ab.e(this.a, paramInt1 - 1, paramInt2, paramInt3)) {
/* 1912 */         localbmh.a(paramInt1 + f2, paramInt2 + f1 + f3, paramInt3 + 1, d3, d2);
/* 1913 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 1, d3, d4);
/* 1914 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1915 */         localbmh.a(paramInt1 + f2, paramInt2 + f1 + f3, paramInt3 + 0, d1, d2);
/*      */         
/* 1917 */         localbmh.a(paramInt1 + f2, paramInt2 + f1 + f3, paramInt3 + 0, d1, d2);
/* 1918 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1919 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 1, d3, d4);
/* 1920 */         localbmh.a(paramInt1 + f2, paramInt2 + f1 + f3, paramInt3 + 1, d3, d2);
/*      */       }
/* 1922 */       if (ajn.ab.e(this.a, paramInt1 + 1, paramInt2, paramInt3)) {
/* 1923 */         localbmh.a(paramInt1 + 1 - f2, paramInt2 + f1 + f3, paramInt3 + 0, d1, d2);
/* 1924 */         localbmh.a(paramInt1 + 1 - 0, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1925 */         localbmh.a(paramInt1 + 1 - 0, paramInt2 + 0 + f3, paramInt3 + 1, d3, d4);
/* 1926 */         localbmh.a(paramInt1 + 1 - f2, paramInt2 + f1 + f3, paramInt3 + 1, d3, d2);
/*      */         
/* 1928 */         localbmh.a(paramInt1 + 1 - f2, paramInt2 + f1 + f3, paramInt3 + 1, d3, d2);
/* 1929 */         localbmh.a(paramInt1 + 1 - 0, paramInt2 + 0 + f3, paramInt3 + 1, d3, d4);
/* 1930 */         localbmh.a(paramInt1 + 1 - 0, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1931 */         localbmh.a(paramInt1 + 1 - f2, paramInt2 + f1 + f3, paramInt3 + 0, d1, d2);
/*      */       }
/* 1933 */       if (ajn.ab.e(this.a, paramInt1, paramInt2, paramInt3 - 1)) {
/* 1934 */         localbmh.a(paramInt1 + 0, paramInt2 + f1 + f3, paramInt3 + f2, d3, d2);
/* 1935 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 0, d3, d4);
/* 1936 */         localbmh.a(paramInt1 + 1, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1937 */         localbmh.a(paramInt1 + 1, paramInt2 + f1 + f3, paramInt3 + f2, d1, d2);
/*      */         
/* 1939 */         localbmh.a(paramInt1 + 1, paramInt2 + f1 + f3, paramInt3 + f2, d1, d2);
/* 1940 */         localbmh.a(paramInt1 + 1, paramInt2 + 0 + f3, paramInt3 + 0, d1, d4);
/* 1941 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 0, d3, d4);
/* 1942 */         localbmh.a(paramInt1 + 0, paramInt2 + f1 + f3, paramInt3 + f2, d3, d2);
/*      */       }
/* 1944 */       if (ajn.ab.e(this.a, paramInt1, paramInt2, paramInt3 + 1)) {
/* 1945 */         localbmh.a(paramInt1 + 1, paramInt2 + f1 + f3, paramInt3 + 1 - f2, d1, d2);
/* 1946 */         localbmh.a(paramInt1 + 1, paramInt2 + 0 + f3, paramInt3 + 1 - 0, d1, d4);
/* 1947 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 1 - 0, d3, d4);
/* 1948 */         localbmh.a(paramInt1 + 0, paramInt2 + f1 + f3, paramInt3 + 1 - f2, d3, d2);
/*      */         
/* 1950 */         localbmh.a(paramInt1 + 0, paramInt2 + f1 + f3, paramInt3 + 1 - f2, d3, d2);
/* 1951 */         localbmh.a(paramInt1 + 0, paramInt2 + 0 + f3, paramInt3 + 1 - 0, d3, d4);
/* 1952 */         localbmh.a(paramInt1 + 1, paramInt2 + 0 + f3, paramInt3 + 1 - 0, d1, d4);
/* 1953 */         localbmh.a(paramInt1 + 1, paramInt2 + f1 + f3, paramInt3 + 1 - f2, d1, d2);
/*      */       }
/* 1955 */       if (ajn.ab.e(this.a, paramInt1, paramInt2 + 1, paramInt3)) {
/* 1956 */         d6 = paramInt1 + 0.5D + 0.5D;
/* 1957 */         d7 = paramInt1 + 0.5D - 0.5D;
/* 1958 */         d8 = paramInt3 + 0.5D + 0.5D;
/* 1959 */         d9 = paramInt3 + 0.5D - 0.5D;
/*      */         
/* 1961 */         d10 = paramInt1 + 0.5D - 0.5D;
/* 1962 */         d11 = paramInt1 + 0.5D + 0.5D;
/* 1963 */         d12 = paramInt3 + 0.5D - 0.5D;
/* 1964 */         double d13 = paramInt3 + 0.5D + 0.5D;
/*      */         
/* 1966 */         localrf3 = localrf1;
/* 1967 */         d1 = localrf3.c();
/* 1968 */         d2 = localrf3.e();
/* 1969 */         d3 = localrf3.d();
/* 1970 */         d4 = localrf3.f();
/*      */         
/* 1972 */         paramInt2++;
/* 1973 */         f1 = -0.2F;
/*      */         
/* 1975 */         if ((paramInt1 + paramInt2 + paramInt3 & 0x1) == 0)
/*      */         {
/* 1977 */           localbmh.a(d10, paramInt2 + f1, paramInt3 + 0, d3, d2);
/* 1978 */           localbmh.a(d6, paramInt2 + 0, paramInt3 + 0, d3, d4);
/* 1979 */           localbmh.a(d6, paramInt2 + 0, paramInt3 + 1, d1, d4);
/* 1980 */           localbmh.a(d10, paramInt2 + f1, paramInt3 + 1, d1, d2);
/*      */           
/* 1982 */           localrf3 = localrf2;
/* 1983 */           d1 = localrf3.c();
/* 1984 */           d2 = localrf3.e();
/* 1985 */           d3 = localrf3.d();
/* 1986 */           d4 = localrf3.f();
/*      */           
/* 1988 */           localbmh.a(d11, paramInt2 + f1, paramInt3 + 1, d3, d2);
/* 1989 */           localbmh.a(d7, paramInt2 + 0, paramInt3 + 1, d3, d4);
/* 1990 */           localbmh.a(d7, paramInt2 + 0, paramInt3 + 0, d1, d4);
/* 1991 */           localbmh.a(d11, paramInt2 + f1, paramInt3 + 0, d1, d2);
/*      */         }
/*      */         else
/*      */         {
/* 1995 */           localbmh.a(paramInt1 + 0, paramInt2 + f1, d13, d3, d2);
/* 1996 */           localbmh.a(paramInt1 + 0, paramInt2 + 0, d9, d3, d4);
/* 1997 */           localbmh.a(paramInt1 + 1, paramInt2 + 0, d9, d1, d4);
/* 1998 */           localbmh.a(paramInt1 + 1, paramInt2 + f1, d13, d1, d2);
/*      */           
/* 2000 */           localrf3 = localrf2;
/* 2001 */           d1 = localrf3.c();
/* 2002 */           d2 = localrf3.e();
/* 2003 */           d3 = localrf3.d();
/* 2004 */           d4 = localrf3.f();
/*      */           
/* 2006 */           localbmh.a(paramInt1 + 1, paramInt2 + f1, d12, d3, d2);
/* 2007 */           localbmh.a(paramInt1 + 1, paramInt2 + 0, d8, d3, d4);
/* 2008 */           localbmh.a(paramInt1 + 0, paramInt2 + 0, d8, d1, d4);
/* 2009 */           localbmh.a(paramInt1 + 0, paramInt2 + f1, d12, d1, d2);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 2014 */     return true;
/*      */   }
/*      */   
/*      */   public boolean h(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 2018 */     bmh localbmh = bmh.a;
/*      */     
/* 2020 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 2021 */     rf localrf1 = ana.e("cross");
/* 2022 */     rf localrf2 = ana.e("line");
/* 2023 */     rf localrf3 = ana.e("cross_overlay");
/* 2024 */     rf localrf4 = ana.e("line_overlay");
/*      */     
/* 2026 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/*      */     
/* 2028 */     float f1 = i1 / 15.0F;
/* 2029 */     float f2 = f1 * 0.6F + 0.4F;
/* 2030 */     if (i1 == 0) { f2 = 0.3F;
/*      */     }
/* 2032 */     float f3 = f1 * f1 * 0.7F - 0.5F;
/* 2033 */     float f4 = f1 * f1 * 0.6F - 0.7F;
/* 2034 */     if (f3 < 0.0F) f3 = 0.0F;
/* 2035 */     if (f4 < 0.0F) { f4 = 0.0F;
/*      */     }
/* 2037 */     localbmh.b(f2, f3, f4);
/*      */     
/* 2039 */     double d1 = 0.015625D;
/* 2040 */     double d2 = 0.015625D;
/*      */     
/* 2042 */     int i2 = (ana.f(this.a, paramInt1 - 1, paramInt2, paramInt3, 1)) || ((!this.a.a(paramInt1 - 1, paramInt2, paramInt3).q()) && (ana.f(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3, -1))) ? 1 : 0;
/*      */     
/* 2044 */     int i3 = (ana.f(this.a, paramInt1 + 1, paramInt2, paramInt3, 3)) || ((!this.a.a(paramInt1 + 1, paramInt2, paramInt3).q()) && (ana.f(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3, -1))) ? 1 : 0;
/*      */     
/* 2046 */     int i4 = (ana.f(this.a, paramInt1, paramInt2, paramInt3 - 1, 2)) || ((!this.a.a(paramInt1, paramInt2, paramInt3 - 1).q()) && (ana.f(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1, -1))) ? 1 : 0;
/*      */     
/* 2048 */     int i5 = (ana.f(this.a, paramInt1, paramInt2, paramInt3 + 1, 0)) || ((!this.a.a(paramInt1, paramInt2, paramInt3 + 1).q()) && (ana.f(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1, -1))) ? 1 : 0;
/*      */     
/* 2050 */     if (!this.a.a(paramInt1, paramInt2 + 1, paramInt3).q()) {
/* 2051 */       if ((this.a.a(paramInt1 - 1, paramInt2, paramInt3).q()) && (ana.f(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3, -1))) i2 = 1;
/* 2052 */       if ((this.a.a(paramInt1 + 1, paramInt2, paramInt3).q()) && (ana.f(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3, -1))) i3 = 1;
/* 2053 */       if ((this.a.a(paramInt1, paramInt2, paramInt3 - 1).q()) && (ana.f(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1, -1))) i4 = 1;
/* 2054 */       if ((this.a.a(paramInt1, paramInt2, paramInt3 + 1).q()) && (ana.f(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1, -1))) { i5 = 1;
/*      */       }
/*      */     }
/* 2057 */     float f5 = paramInt1 + 0;
/* 2058 */     float f6 = paramInt1 + 1;
/* 2059 */     float f7 = paramInt3 + 0;
/* 2060 */     float f8 = paramInt3 + 1;
/*      */     
/* 2062 */     int i6 = 0;
/* 2063 */     if (((i2 != 0) || (i3 != 0)) && (i4 == 0) && (i5 == 0)) i6 = 1;
/* 2064 */     if (((i4 != 0) || (i5 != 0)) && (i3 == 0) && (i2 == 0)) { i6 = 2;
/*      */     }
/* 2066 */     if (i6 == 0)
/*      */     {
/* 2068 */       int i7 = 0;
/* 2069 */       int i8 = 0;
/* 2070 */       int i9 = 16;
/* 2071 */       int i10 = 16;
/*      */       
/* 2073 */       int i11 = 5;
/* 2074 */       if (i2 == 0) f5 += 0.3125F;
/* 2075 */       if (i2 == 0) i7 += 5;
/* 2076 */       if (i3 == 0) f6 -= 0.3125F;
/* 2077 */       if (i3 == 0) i9 -= 5;
/* 2078 */       if (i4 == 0) f7 += 0.3125F;
/* 2079 */       if (i4 == 0) i8 += 5;
/* 2080 */       if (i5 == 0) f8 -= 0.3125F;
/* 2081 */       if (i5 == 0) { i10 -= 5;
/*      */       }
/* 2083 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf1.a(i9), localrf1.b(i10));
/* 2084 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf1.a(i9), localrf1.b(i8));
/* 2085 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf1.a(i7), localrf1.b(i8));
/* 2086 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf1.a(i7), localrf1.b(i10));
/*      */       
/* 2088 */       localbmh.b(1.0F, 1.0F, 1.0F);
/* 2089 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf3.a(i9), localrf3.b(i10));
/* 2090 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf3.a(i9), localrf3.b(i8));
/* 2091 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf3.a(i7), localrf3.b(i8));
/* 2092 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf3.a(i7), localrf3.b(i10));
/* 2093 */     } else if (i6 == 1) {
/* 2094 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf2.d(), localrf2.f());
/* 2095 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf2.d(), localrf2.e());
/* 2096 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf2.c(), localrf2.e());
/* 2097 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf2.c(), localrf2.f());
/*      */       
/* 2099 */       localbmh.b(1.0F, 1.0F, 1.0F);
/* 2100 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf4.d(), localrf4.f());
/* 2101 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf4.d(), localrf4.e());
/* 2102 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf4.c(), localrf4.e());
/* 2103 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf4.c(), localrf4.f());
/*      */     } else {
/* 2105 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf2.d(), localrf2.f());
/* 2106 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf2.c(), localrf2.f());
/* 2107 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf2.c(), localrf2.e());
/* 2108 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf2.d(), localrf2.e());
/*      */       
/* 2110 */       localbmh.b(1.0F, 1.0F, 1.0F);
/* 2111 */       localbmh.a(f6, paramInt2 + 0.015625D, f8, localrf4.d(), localrf4.f());
/* 2112 */       localbmh.a(f6, paramInt2 + 0.015625D, f7, localrf4.c(), localrf4.f());
/* 2113 */       localbmh.a(f5, paramInt2 + 0.015625D, f7, localrf4.c(), localrf4.e());
/* 2114 */       localbmh.a(f5, paramInt2 + 0.015625D, f8, localrf4.d(), localrf4.e());
/*      */     }
/*      */     
/* 2117 */     if (!this.a.a(paramInt1, paramInt2 + 1, paramInt3).q()) {
/* 2118 */       float f9 = 0.021875F;
/*      */       
/* 2120 */       if ((this.a.a(paramInt1 - 1, paramInt2, paramInt3).q()) && (this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3) == ajn.af)) {
/* 2121 */         localbmh.b(f2, f3, f4);
/* 2122 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 1, localrf2.d(), localrf2.e());
/* 2123 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 0, paramInt3 + 1, localrf2.c(), localrf2.e());
/* 2124 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 0, paramInt3 + 0, localrf2.c(), localrf2.f());
/* 2125 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 0, localrf2.d(), localrf2.f());
/*      */         
/* 2127 */         localbmh.b(1.0F, 1.0F, 1.0F);
/* 2128 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 1, localrf4.d(), localrf4.e());
/* 2129 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 0, paramInt3 + 1, localrf4.c(), localrf4.e());
/* 2130 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 0, paramInt3 + 0, localrf4.c(), localrf4.f());
/* 2131 */         localbmh.a(paramInt1 + 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 0, localrf4.d(), localrf4.f());
/*      */       }
/* 2133 */       if ((this.a.a(paramInt1 + 1, paramInt2, paramInt3).q()) && (this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3) == ajn.af)) {
/* 2134 */         localbmh.b(f2, f3, f4);
/* 2135 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 0, paramInt3 + 1, localrf2.c(), localrf2.f());
/* 2136 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 1, localrf2.d(), localrf2.f());
/* 2137 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 0, localrf2.d(), localrf2.e());
/* 2138 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 0, paramInt3 + 0, localrf2.c(), localrf2.e());
/*      */         
/* 2140 */         localbmh.b(1.0F, 1.0F, 1.0F);
/* 2141 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 0, paramInt3 + 1, localrf4.c(), localrf4.f());
/* 2142 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 1, localrf4.d(), localrf4.f());
/* 2143 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 1 + 0.021875F, paramInt3 + 0, localrf4.d(), localrf4.e());
/* 2144 */         localbmh.a(paramInt1 + 1 - 0.015625D, paramInt2 + 0, paramInt3 + 0, localrf4.c(), localrf4.e());
/*      */       }
/* 2146 */       if ((this.a.a(paramInt1, paramInt2, paramInt3 - 1).q()) && (this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1) == ajn.af)) {
/* 2147 */         localbmh.b(f2, f3, f4);
/* 2148 */         localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 0.015625D, localrf2.c(), localrf2.f());
/* 2149 */         localbmh.a(paramInt1 + 1, paramInt2 + 1 + 0.021875F, paramInt3 + 0.015625D, localrf2.d(), localrf2.f());
/* 2150 */         localbmh.a(paramInt1 + 0, paramInt2 + 1 + 0.021875F, paramInt3 + 0.015625D, localrf2.d(), localrf2.e());
/* 2151 */         localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 0.015625D, localrf2.c(), localrf2.e());
/*      */         
/* 2153 */         localbmh.b(1.0F, 1.0F, 1.0F);
/* 2154 */         localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 0.015625D, localrf4.c(), localrf4.f());
/* 2155 */         localbmh.a(paramInt1 + 1, paramInt2 + 1 + 0.021875F, paramInt3 + 0.015625D, localrf4.d(), localrf4.f());
/* 2156 */         localbmh.a(paramInt1 + 0, paramInt2 + 1 + 0.021875F, paramInt3 + 0.015625D, localrf4.d(), localrf4.e());
/* 2157 */         localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 0.015625D, localrf4.c(), localrf4.e());
/*      */       }
/* 2159 */       if ((this.a.a(paramInt1, paramInt2, paramInt3 + 1).q()) && (this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1) == ajn.af)) {
/* 2160 */         localbmh.b(f2, f3, f4);
/* 2161 */         localbmh.a(paramInt1 + 1, paramInt2 + 1 + 0.021875F, paramInt3 + 1 - 0.015625D, localrf2.d(), localrf2.e());
/* 2162 */         localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 1 - 0.015625D, localrf2.c(), localrf2.e());
/* 2163 */         localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 1 - 0.015625D, localrf2.c(), localrf2.f());
/* 2164 */         localbmh.a(paramInt1 + 0, paramInt2 + 1 + 0.021875F, paramInt3 + 1 - 0.015625D, localrf2.d(), localrf2.f());
/*      */         
/* 2166 */         localbmh.b(1.0F, 1.0F, 1.0F);
/* 2167 */         localbmh.a(paramInt1 + 1, paramInt2 + 1 + 0.021875F, paramInt3 + 1 - 0.015625D, localrf4.d(), localrf4.e());
/* 2168 */         localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 1 - 0.015625D, localrf4.c(), localrf4.e());
/* 2169 */         localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 1 - 0.015625D, localrf4.c(), localrf4.f());
/* 2170 */         localbmh.a(paramInt1 + 0, paramInt2 + 1 + 0.021875F, paramInt3 + 1 - 0.015625D, localrf4.d(), localrf4.f());
/*      */       }
/*      */     }
/*      */     
/* 2174 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(aje paramaje, int paramInt1, int paramInt2, int paramInt3) {
/* 2178 */     bmh localbmh = bmh.a;
/* 2179 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 2181 */     rf localrf = a(paramaje, 0, i1);
/* 2182 */     if (b()) { localrf = this.d;
/*      */     }
/* 2184 */     if (paramaje.e()) {
/* 2185 */       i1 &= 0x7;
/*      */     }
/*      */     
/* 2188 */     localbmh.b(paramaje.c(this.a, paramInt1, paramInt2, paramInt3));
/* 2189 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/* 2191 */     double d1 = localrf.c();
/* 2192 */     double d2 = localrf.e();
/* 2193 */     double d3 = localrf.d();
/* 2194 */     double d4 = localrf.f();
/*      */     
/* 2196 */     double d5 = 0.0625D;
/*      */     
/* 2198 */     double d6 = paramInt1 + 1;
/* 2199 */     double d7 = paramInt1 + 1;
/* 2200 */     double d8 = paramInt1 + 0;
/* 2201 */     double d9 = paramInt1 + 0;
/*      */     
/* 2203 */     double d10 = paramInt3 + 0;
/* 2204 */     double d11 = paramInt3 + 1;
/* 2205 */     double d12 = paramInt3 + 1;
/* 2206 */     double d13 = paramInt3 + 0;
/*      */     
/* 2208 */     double d14 = paramInt2 + d5;
/* 2209 */     double d15 = paramInt2 + d5;
/* 2210 */     double d16 = paramInt2 + d5;
/* 2211 */     double d17 = paramInt2 + d5;
/*      */     
/* 2213 */     if ((i1 == 1) || (i1 == 2) || (i1 == 3) || (i1 == 7)) {
/* 2214 */       d6 = d9 = paramInt1 + 1;
/* 2215 */       d7 = d8 = paramInt1 + 0;
/* 2216 */       d10 = d11 = paramInt3 + 1;
/* 2217 */       d12 = d13 = paramInt3 + 0;
/* 2218 */     } else if (i1 == 8) {
/* 2219 */       d6 = d7 = paramInt1 + 0;
/* 2220 */       d8 = d9 = paramInt1 + 1;
/* 2221 */       d10 = d13 = paramInt3 + 1;
/* 2222 */       d11 = d12 = paramInt3 + 0;
/* 2223 */     } else if (i1 == 9) {
/* 2224 */       d6 = d9 = paramInt1 + 0;
/* 2225 */       d7 = d8 = paramInt1 + 1;
/* 2226 */       d10 = d11 = paramInt3 + 0;
/* 2227 */       d12 = d13 = paramInt3 + 1;
/*      */     }
/*      */     
/* 2230 */     if ((i1 == 2) || (i1 == 4)) {
/* 2231 */       d14 += 1.0D;
/* 2232 */       d17 += 1.0D;
/* 2233 */     } else if ((i1 == 3) || (i1 == 5)) {
/* 2234 */       d15 += 1.0D;
/* 2235 */       d16 += 1.0D;
/*      */     }
/*      */     
/* 2238 */     localbmh.a(d6, d14, d10, d3, d2);
/* 2239 */     localbmh.a(d7, d15, d11, d3, d4);
/* 2240 */     localbmh.a(d8, d16, d12, d1, d4);
/* 2241 */     localbmh.a(d9, d17, d13, d1, d2);
/*      */     
/* 2243 */     localbmh.a(d9, d17, d13, d1, d2);
/* 2244 */     localbmh.a(d8, d16, d12, d1, d4);
/* 2245 */     localbmh.a(d7, d15, d11, d3, d4);
/* 2246 */     localbmh.a(d6, d14, d10, d3, d2);
/*      */     
/* 2248 */     return true;
/*      */   }
/*      */   
/*      */   public boolean i(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 2252 */     bmh localbmh = bmh.a;
/*      */     
/* 2254 */     rf localrf = a(paramaji, 0);
/*      */     
/* 2256 */     if (b()) { localrf = this.d;
/*      */     }
/*      */     
/* 2259 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 2260 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/*      */ 
/* 2263 */     double d1 = localrf.c();
/* 2264 */     double d2 = localrf.e();
/* 2265 */     double d3 = localrf.d();
/* 2266 */     double d4 = localrf.f();
/*      */     
/* 2268 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 2270 */     double d5 = 0.0D;
/* 2271 */     double d6 = 0.05000000074505806D;
/* 2272 */     if (i1 == 5) {
/* 2273 */       localbmh.a(paramInt1 + d6, paramInt2 + 1 + d5, paramInt3 + 1 + d5, d1, d2);
/* 2274 */       localbmh.a(paramInt1 + d6, paramInt2 + 0 - d5, paramInt3 + 1 + d5, d1, d4);
/* 2275 */       localbmh.a(paramInt1 + d6, paramInt2 + 0 - d5, paramInt3 + 0 - d5, d3, d4);
/* 2276 */       localbmh.a(paramInt1 + d6, paramInt2 + 1 + d5, paramInt3 + 0 - d5, d3, d2);
/*      */     }
/* 2278 */     if (i1 == 4) {
/* 2279 */       localbmh.a(paramInt1 + 1 - d6, paramInt2 + 0 - d5, paramInt3 + 1 + d5, d3, d4);
/* 2280 */       localbmh.a(paramInt1 + 1 - d6, paramInt2 + 1 + d5, paramInt3 + 1 + d5, d3, d2);
/* 2281 */       localbmh.a(paramInt1 + 1 - d6, paramInt2 + 1 + d5, paramInt3 + 0 - d5, d1, d2);
/* 2282 */       localbmh.a(paramInt1 + 1 - d6, paramInt2 + 0 - d5, paramInt3 + 0 - d5, d1, d4);
/*      */     }
/* 2284 */     if (i1 == 3) {
/* 2285 */       localbmh.a(paramInt1 + 1 + d5, paramInt2 + 0 - d5, paramInt3 + d6, d3, d4);
/* 2286 */       localbmh.a(paramInt1 + 1 + d5, paramInt2 + 1 + d5, paramInt3 + d6, d3, d2);
/* 2287 */       localbmh.a(paramInt1 + 0 - d5, paramInt2 + 1 + d5, paramInt3 + d6, d1, d2);
/* 2288 */       localbmh.a(paramInt1 + 0 - d5, paramInt2 + 0 - d5, paramInt3 + d6, d1, d4);
/*      */     }
/* 2290 */     if (i1 == 2) {
/* 2291 */       localbmh.a(paramInt1 + 1 + d5, paramInt2 + 1 + d5, paramInt3 + 1 - d6, d1, d2);
/* 2292 */       localbmh.a(paramInt1 + 1 + d5, paramInt2 + 0 - d5, paramInt3 + 1 - d6, d1, d4);
/* 2293 */       localbmh.a(paramInt1 + 0 - d5, paramInt2 + 0 - d5, paramInt3 + 1 - d6, d3, d4);
/* 2294 */       localbmh.a(paramInt1 + 0 - d5, paramInt2 + 1 + d5, paramInt3 + 1 - d6, d3, d2);
/*      */     }
/*      */     
/* 2297 */     return true;
/*      */   }
/*      */   
/*      */   public boolean j(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 2301 */     bmh localbmh = bmh.a;
/*      */     
/* 2303 */     rf localrf = a(paramaji, 0);
/*      */     
/* 2305 */     if (b()) { localrf = this.d;
/*      */     }
/* 2307 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/*      */     
/* 2309 */     int i1 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 2310 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 2311 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 2312 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 2314 */     localbmh.b(f1, f2, f3);
/*      */     
/*      */ 
/* 2317 */     double d1 = localrf.c();
/* 2318 */     double d2 = localrf.e();
/* 2319 */     double d3 = localrf.d();
/* 2320 */     double d4 = localrf.f();
/*      */     
/* 2322 */     double d5 = 0.05000000074505806D;
/* 2323 */     int i2 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 2325 */     if ((i2 & 0x2) != 0) {
/* 2326 */       localbmh.a(paramInt1 + d5, paramInt2 + 1, paramInt3 + 1, d1, d2);
/* 2327 */       localbmh.a(paramInt1 + d5, paramInt2 + 0, paramInt3 + 1, d1, d4);
/* 2328 */       localbmh.a(paramInt1 + d5, paramInt2 + 0, paramInt3 + 0, d3, d4);
/* 2329 */       localbmh.a(paramInt1 + d5, paramInt2 + 1, paramInt3 + 0, d3, d2);
/*      */       
/* 2331 */       localbmh.a(paramInt1 + d5, paramInt2 + 1, paramInt3 + 0, d3, d2);
/* 2332 */       localbmh.a(paramInt1 + d5, paramInt2 + 0, paramInt3 + 0, d3, d4);
/* 2333 */       localbmh.a(paramInt1 + d5, paramInt2 + 0, paramInt3 + 1, d1, d4);
/* 2334 */       localbmh.a(paramInt1 + d5, paramInt2 + 1, paramInt3 + 1, d1, d2);
/*      */     }
/* 2336 */     if ((i2 & 0x8) != 0) {
/* 2337 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 0, paramInt3 + 1, d3, d4);
/* 2338 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 1, paramInt3 + 1, d3, d2);
/* 2339 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 1, paramInt3 + 0, d1, d2);
/* 2340 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 0, paramInt3 + 0, d1, d4);
/*      */       
/* 2342 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 0, paramInt3 + 0, d1, d4);
/* 2343 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 1, paramInt3 + 0, d1, d2);
/* 2344 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 1, paramInt3 + 1, d3, d2);
/* 2345 */       localbmh.a(paramInt1 + 1 - d5, paramInt2 + 0, paramInt3 + 1, d3, d4);
/*      */     }
/* 2347 */     if ((i2 & 0x4) != 0) {
/* 2348 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + d5, d3, d4);
/* 2349 */       localbmh.a(paramInt1 + 1, paramInt2 + 1, paramInt3 + d5, d3, d2);
/* 2350 */       localbmh.a(paramInt1 + 0, paramInt2 + 1, paramInt3 + d5, d1, d2);
/* 2351 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + d5, d1, d4);
/*      */       
/* 2353 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + d5, d1, d4);
/* 2354 */       localbmh.a(paramInt1 + 0, paramInt2 + 1, paramInt3 + d5, d1, d2);
/* 2355 */       localbmh.a(paramInt1 + 1, paramInt2 + 1, paramInt3 + d5, d3, d2);
/* 2356 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + d5, d3, d4);
/*      */     }
/* 2358 */     if ((i2 & 0x1) != 0) {
/* 2359 */       localbmh.a(paramInt1 + 1, paramInt2 + 1, paramInt3 + 1 - d5, d1, d2);
/* 2360 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 1 - d5, d1, d4);
/* 2361 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 1 - d5, d3, d4);
/* 2362 */       localbmh.a(paramInt1 + 0, paramInt2 + 1, paramInt3 + 1 - d5, d3, d2);
/*      */       
/* 2364 */       localbmh.a(paramInt1 + 0, paramInt2 + 1, paramInt3 + 1 - d5, d3, d2);
/* 2365 */       localbmh.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 1 - d5, d3, d4);
/* 2366 */       localbmh.a(paramInt1 + 1, paramInt2 + 0, paramInt3 + 1 - d5, d1, d4);
/* 2367 */       localbmh.a(paramInt1 + 1, paramInt2 + 1, paramInt3 + 1 - d5, d1, d2);
/*      */     }
/* 2369 */     if (this.a.a(paramInt1, paramInt2 + 1, paramInt3).q()) {
/* 2370 */       localbmh.a(paramInt1 + 1, paramInt2 + 1 - d5, paramInt3 + 0, d1, d2);
/* 2371 */       localbmh.a(paramInt1 + 1, paramInt2 + 1 - d5, paramInt3 + 1, d1, d4);
/* 2372 */       localbmh.a(paramInt1 + 0, paramInt2 + 1 - d5, paramInt3 + 1, d3, d4);
/* 2373 */       localbmh.a(paramInt1 + 0, paramInt2 + 1 - d5, paramInt3 + 0, d3, d2);
/*      */     }
/*      */     
/* 2376 */     return true;
/*      */   }
/*      */   
/*      */   public boolean k(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 2380 */     int i1 = this.a.R();
/* 2381 */     bmh localbmh = bmh.a;
/*      */     
/* 2383 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 2384 */     int i2 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 2385 */     float f1 = (i2 >> 16 & 0xFF) / 255.0F;
/* 2386 */     float f2 = (i2 >> 8 & 0xFF) / 255.0F;
/* 2387 */     float f3 = (i2 & 0xFF) / 255.0F;
/*      */     
/* 2389 */     if (blt.a) {
/* 2390 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 2391 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 2392 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 2394 */       f1 = f4;
/* 2395 */       f2 = f5;
/* 2396 */       f3 = f6;
/*      */     }
/* 2398 */     localbmh.b(f1, f2, f3);
/*      */     
/*      */ 
/*      */ 
/*      */ 
/* 2403 */     boolean bool1 = paramaji instanceof anr;
/* 2404 */     rf localrf1; rf localrf2; if (b()) {
/* 2405 */       localrf1 = this.d;
/* 2406 */       localrf2 = this.d;
/*      */     } else {
/* 2408 */       int i3 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 2409 */       localrf1 = a(paramaji, 0, i3);
/* 2410 */       localrf2 = bool1 ? ((anr)paramaji).b(i3) : ((aoa)paramaji).e();
/*      */     }
/*      */     
/* 2413 */     double d1 = localrf1.c();
/* 2414 */     double d2 = localrf1.a(7.0D);
/* 2415 */     double d3 = localrf1.a(9.0D);
/* 2416 */     double d4 = localrf1.d();
/* 2417 */     double d5 = localrf1.e();
/* 2418 */     double d6 = localrf1.f();
/*      */     
/* 2420 */     double d7 = localrf2.a(7.0D);
/* 2421 */     double d8 = localrf2.a(9.0D);
/* 2422 */     double d9 = localrf2.e();
/* 2423 */     double d10 = localrf2.f();
/* 2424 */     double d11 = localrf2.b(7.0D);
/* 2425 */     double d12 = localrf2.b(9.0D);
/*      */     
/* 2427 */     double d13 = paramInt1;
/* 2428 */     double d14 = paramInt1 + 1;
/* 2429 */     double d15 = paramInt3;
/* 2430 */     double d16 = paramInt3 + 1;
/* 2431 */     double d17 = paramInt1 + 0.5D - 0.0625D;
/* 2432 */     double d18 = paramInt1 + 0.5D + 0.0625D;
/* 2433 */     double d19 = paramInt3 + 0.5D - 0.0625D;
/* 2434 */     double d20 = paramInt3 + 0.5D + 0.0625D;
/*      */     
/* 2436 */     boolean bool2 = bool1 ? ((anr)paramaji).a(this.a.a(paramInt1, paramInt2, paramInt3 - 1)) : ((aoa)paramaji).a(this.a.a(paramInt1, paramInt2, paramInt3 - 1));
/* 2437 */     boolean bool3 = bool1 ? ((anr)paramaji).a(this.a.a(paramInt1, paramInt2, paramInt3 + 1)) : ((aoa)paramaji).a(this.a.a(paramInt1, paramInt2, paramInt3 + 1));
/* 2438 */     boolean bool4 = bool1 ? ((anr)paramaji).a(this.a.a(paramInt1 - 1, paramInt2, paramInt3)) : ((aoa)paramaji).a(this.a.a(paramInt1 - 1, paramInt2, paramInt3));
/* 2439 */     boolean bool5 = bool1 ? ((anr)paramaji).a(this.a.a(paramInt1 + 1, paramInt2, paramInt3)) : ((aoa)paramaji).a(this.a.a(paramInt1 + 1, paramInt2, paramInt3));
/*      */     
/* 2441 */     double d21 = 0.001D;
/* 2442 */     double d22 = 0.999D;
/* 2443 */     double d23 = 0.001D;
/*      */     
/* 2445 */     int i4 = (!bool2) && (!bool3) && (!bool4) && (!bool5) ? 1 : 0;
/*      */     
/* 2447 */     if ((bool4) || (i4 != 0)) {
/* 2448 */       if ((bool4) && (bool5)) {
/* 2449 */         if (!bool2) {
/* 2450 */           localbmh.a(d14, paramInt2 + 0.999D, d19, d4, d5);
/* 2451 */           localbmh.a(d14, paramInt2 + 0.001D, d19, d4, d6);
/* 2452 */           localbmh.a(d13, paramInt2 + 0.001D, d19, d1, d6);
/* 2453 */           localbmh.a(d13, paramInt2 + 0.999D, d19, d1, d5);
/*      */         } else {
/* 2455 */           localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/* 2456 */           localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2457 */           localbmh.a(d13, paramInt2 + 0.001D, d19, d1, d6);
/* 2458 */           localbmh.a(d13, paramInt2 + 0.999D, d19, d1, d5);
/*      */           
/* 2460 */           localbmh.a(d14, paramInt2 + 0.999D, d19, d4, d5);
/* 2461 */           localbmh.a(d14, paramInt2 + 0.001D, d19, d4, d6);
/* 2462 */           localbmh.a(d18, paramInt2 + 0.001D, d19, d3, d6);
/* 2463 */           localbmh.a(d18, paramInt2 + 0.999D, d19, d3, d5);
/*      */         }
/* 2465 */         if (!bool3) {
/* 2466 */           localbmh.a(d13, paramInt2 + 0.999D, d20, d1, d5);
/* 2467 */           localbmh.a(d13, paramInt2 + 0.001D, d20, d1, d6);
/* 2468 */           localbmh.a(d14, paramInt2 + 0.001D, d20, d4, d6);
/* 2469 */           localbmh.a(d14, paramInt2 + 0.999D, d20, d4, d5);
/*      */         } else {
/* 2471 */           localbmh.a(d13, paramInt2 + 0.999D, d20, d1, d5);
/* 2472 */           localbmh.a(d13, paramInt2 + 0.001D, d20, d1, d6);
/* 2473 */           localbmh.a(d17, paramInt2 + 0.001D, d20, d2, d6);
/* 2474 */           localbmh.a(d17, paramInt2 + 0.999D, d20, d2, d5);
/*      */           
/* 2476 */           localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/* 2477 */           localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2478 */           localbmh.a(d14, paramInt2 + 0.001D, d20, d4, d6);
/* 2479 */           localbmh.a(d14, paramInt2 + 0.999D, d20, d4, d5);
/*      */         }
/*      */         
/* 2482 */         localbmh.a(d13, paramInt2 + 0.999D, d20, d8, d9);
/* 2483 */         localbmh.a(d14, paramInt2 + 0.999D, d20, d8, d10);
/* 2484 */         localbmh.a(d14, paramInt2 + 0.999D, d19, d7, d10);
/* 2485 */         localbmh.a(d13, paramInt2 + 0.999D, d19, d7, d9);
/*      */         
/* 2487 */         localbmh.a(d14, paramInt2 + 0.001D, d20, d7, d10);
/* 2488 */         localbmh.a(d13, paramInt2 + 0.001D, d20, d7, d9);
/* 2489 */         localbmh.a(d13, paramInt2 + 0.001D, d19, d8, d9);
/* 2490 */         localbmh.a(d14, paramInt2 + 0.001D, d19, d8, d10);
/*      */       } else {
/* 2492 */         if ((!bool2) && (i4 == 0)) {
/* 2493 */           localbmh.a(d18, paramInt2 + 0.999D, d19, d3, d5);
/* 2494 */           localbmh.a(d18, paramInt2 + 0.001D, d19, d3, d6);
/* 2495 */           localbmh.a(d13, paramInt2 + 0.001D, d19, d1, d6);
/* 2496 */           localbmh.a(d13, paramInt2 + 0.999D, d19, d1, d5);
/*      */         } else {
/* 2498 */           localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/* 2499 */           localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2500 */           localbmh.a(d13, paramInt2 + 0.001D, d19, d1, d6);
/* 2501 */           localbmh.a(d13, paramInt2 + 0.999D, d19, d1, d5);
/*      */         }
/* 2503 */         if ((!bool3) && (i4 == 0)) {
/* 2504 */           localbmh.a(d13, paramInt2 + 0.999D, d20, d1, d5);
/* 2505 */           localbmh.a(d13, paramInt2 + 0.001D, d20, d1, d6);
/* 2506 */           localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2507 */           localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/*      */         } else {
/* 2509 */           localbmh.a(d13, paramInt2 + 0.999D, d20, d1, d5);
/* 2510 */           localbmh.a(d13, paramInt2 + 0.001D, d20, d1, d6);
/* 2511 */           localbmh.a(d17, paramInt2 + 0.001D, d20, d2, d6);
/* 2512 */           localbmh.a(d17, paramInt2 + 0.999D, d20, d2, d5);
/*      */         }
/*      */         
/* 2515 */         localbmh.a(d13, paramInt2 + 0.999D, d20, d8, d9);
/* 2516 */         localbmh.a(d17, paramInt2 + 0.999D, d20, d8, d11);
/* 2517 */         localbmh.a(d17, paramInt2 + 0.999D, d19, d7, d11);
/* 2518 */         localbmh.a(d13, paramInt2 + 0.999D, d19, d7, d9);
/*      */         
/* 2520 */         localbmh.a(d17, paramInt2 + 0.001D, d20, d7, d11);
/* 2521 */         localbmh.a(d13, paramInt2 + 0.001D, d20, d7, d9);
/* 2522 */         localbmh.a(d13, paramInt2 + 0.001D, d19, d8, d9);
/* 2523 */         localbmh.a(d17, paramInt2 + 0.001D, d19, d8, d11);
/*      */       }
/* 2525 */     } else if ((!bool2) && (!bool3)) {
/* 2526 */       localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/* 2527 */       localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2528 */       localbmh.a(d17, paramInt2 + 0.001D, d20, d3, d6);
/* 2529 */       localbmh.a(d17, paramInt2 + 0.999D, d20, d3, d5);
/*      */     }
/*      */     
/* 2532 */     if (((bool5) || (i4 != 0)) && (!bool4)) {
/* 2533 */       if ((!bool3) && (i4 == 0)) {
/* 2534 */         localbmh.a(d17, paramInt2 + 0.999D, d20, d2, d5);
/* 2535 */         localbmh.a(d17, paramInt2 + 0.001D, d20, d2, d6);
/* 2536 */         localbmh.a(d14, paramInt2 + 0.001D, d20, d4, d6);
/* 2537 */         localbmh.a(d14, paramInt2 + 0.999D, d20, d4, d5);
/*      */       } else {
/* 2539 */         localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/* 2540 */         localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2541 */         localbmh.a(d14, paramInt2 + 0.001D, d20, d4, d6);
/* 2542 */         localbmh.a(d14, paramInt2 + 0.999D, d20, d4, d5);
/*      */       }
/* 2544 */       if ((!bool2) && (i4 == 0)) {
/* 2545 */         localbmh.a(d14, paramInt2 + 0.999D, d19, d4, d5);
/* 2546 */         localbmh.a(d14, paramInt2 + 0.001D, d19, d4, d6);
/* 2547 */         localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2548 */         localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/*      */       } else {
/* 2550 */         localbmh.a(d14, paramInt2 + 0.999D, d19, d4, d5);
/* 2551 */         localbmh.a(d14, paramInt2 + 0.001D, d19, d4, d6);
/* 2552 */         localbmh.a(d18, paramInt2 + 0.001D, d19, d3, d6);
/* 2553 */         localbmh.a(d18, paramInt2 + 0.999D, d19, d3, d5);
/*      */       }
/*      */       
/* 2556 */       localbmh.a(d18, paramInt2 + 0.999D, d20, d8, d12);
/* 2557 */       localbmh.a(d14, paramInt2 + 0.999D, d20, d8, d9);
/* 2558 */       localbmh.a(d14, paramInt2 + 0.999D, d19, d7, d9);
/* 2559 */       localbmh.a(d18, paramInt2 + 0.999D, d19, d7, d12);
/*      */       
/* 2561 */       localbmh.a(d14, paramInt2 + 0.001D, d20, d7, d10);
/* 2562 */       localbmh.a(d18, paramInt2 + 0.001D, d20, d7, d12);
/* 2563 */       localbmh.a(d18, paramInt2 + 0.001D, d19, d8, d12);
/* 2564 */       localbmh.a(d14, paramInt2 + 0.001D, d19, d8, d10);
/* 2565 */     } else if ((!bool5) && (!bool2) && (!bool3)) {
/* 2566 */       localbmh.a(d18, paramInt2 + 0.999D, d20, d2, d5);
/* 2567 */       localbmh.a(d18, paramInt2 + 0.001D, d20, d2, d6);
/* 2568 */       localbmh.a(d18, paramInt2 + 0.001D, d19, d3, d6);
/* 2569 */       localbmh.a(d18, paramInt2 + 0.999D, d19, d3, d5);
/*      */     }
/*      */     
/* 2572 */     if ((bool2) || (i4 != 0)) {
/* 2573 */       if ((bool2) && (bool3)) {
/* 2574 */         if (!bool4) {
/* 2575 */           localbmh.a(d17, paramInt2 + 0.999D, d15, d1, d5);
/* 2576 */           localbmh.a(d17, paramInt2 + 0.001D, d15, d1, d6);
/* 2577 */           localbmh.a(d17, paramInt2 + 0.001D, d16, d4, d6);
/* 2578 */           localbmh.a(d17, paramInt2 + 0.999D, d16, d4, d5);
/*      */         } else {
/* 2580 */           localbmh.a(d17, paramInt2 + 0.999D, d15, d1, d5);
/* 2581 */           localbmh.a(d17, paramInt2 + 0.001D, d15, d1, d6);
/* 2582 */           localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2583 */           localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/*      */           
/* 2585 */           localbmh.a(d17, paramInt2 + 0.999D, d20, d3, d5);
/* 2586 */           localbmh.a(d17, paramInt2 + 0.001D, d20, d3, d6);
/* 2587 */           localbmh.a(d17, paramInt2 + 0.001D, d16, d4, d6);
/* 2588 */           localbmh.a(d17, paramInt2 + 0.999D, d16, d4, d5);
/*      */         }
/* 2590 */         if (!bool5) {
/* 2591 */           localbmh.a(d18, paramInt2 + 0.999D, d16, d4, d5);
/* 2592 */           localbmh.a(d18, paramInt2 + 0.001D, d16, d4, d6);
/* 2593 */           localbmh.a(d18, paramInt2 + 0.001D, d15, d1, d6);
/* 2594 */           localbmh.a(d18, paramInt2 + 0.999D, d15, d1, d5);
/*      */         } else {
/* 2596 */           localbmh.a(d18, paramInt2 + 0.999D, d19, d2, d5);
/* 2597 */           localbmh.a(d18, paramInt2 + 0.001D, d19, d2, d6);
/* 2598 */           localbmh.a(d18, paramInt2 + 0.001D, d15, d1, d6);
/* 2599 */           localbmh.a(d18, paramInt2 + 0.999D, d15, d1, d5);
/*      */           
/* 2601 */           localbmh.a(d18, paramInt2 + 0.999D, d16, d4, d5);
/* 2602 */           localbmh.a(d18, paramInt2 + 0.001D, d16, d4, d6);
/* 2603 */           localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2604 */           localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/*      */         }
/*      */         
/* 2607 */         localbmh.a(d18, paramInt2 + 0.999D, d15, d8, d9);
/* 2608 */         localbmh.a(d17, paramInt2 + 0.999D, d15, d7, d9);
/* 2609 */         localbmh.a(d17, paramInt2 + 0.999D, d16, d7, d10);
/* 2610 */         localbmh.a(d18, paramInt2 + 0.999D, d16, d8, d10);
/*      */         
/* 2612 */         localbmh.a(d17, paramInt2 + 0.001D, d15, d7, d9);
/* 2613 */         localbmh.a(d18, paramInt2 + 0.001D, d15, d8, d9);
/* 2614 */         localbmh.a(d18, paramInt2 + 0.001D, d16, d8, d10);
/* 2615 */         localbmh.a(d17, paramInt2 + 0.001D, d16, d7, d10);
/*      */       } else {
/* 2617 */         if ((!bool4) && (i4 == 0)) {
/* 2618 */           localbmh.a(d17, paramInt2 + 0.999D, d15, d1, d5);
/* 2619 */           localbmh.a(d17, paramInt2 + 0.001D, d15, d1, d6);
/* 2620 */           localbmh.a(d17, paramInt2 + 0.001D, d20, d3, d6);
/* 2621 */           localbmh.a(d17, paramInt2 + 0.999D, d20, d3, d5);
/*      */         } else {
/* 2623 */           localbmh.a(d17, paramInt2 + 0.999D, d15, d1, d5);
/* 2624 */           localbmh.a(d17, paramInt2 + 0.001D, d15, d1, d6);
/* 2625 */           localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2626 */           localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/*      */         }
/* 2628 */         if ((!bool5) && (i4 == 0)) {
/* 2629 */           localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/* 2630 */           localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2631 */           localbmh.a(d18, paramInt2 + 0.001D, d15, d1, d6);
/* 2632 */           localbmh.a(d18, paramInt2 + 0.999D, d15, d1, d5);
/*      */         } else {
/* 2634 */           localbmh.a(d18, paramInt2 + 0.999D, d19, d2, d5);
/* 2635 */           localbmh.a(d18, paramInt2 + 0.001D, d19, d2, d6);
/* 2636 */           localbmh.a(d18, paramInt2 + 0.001D, d15, d1, d6);
/* 2637 */           localbmh.a(d18, paramInt2 + 0.999D, d15, d1, d5);
/*      */         }
/*      */         
/* 2640 */         localbmh.a(d18, paramInt2 + 0.999D, d15, d8, d9);
/* 2641 */         localbmh.a(d17, paramInt2 + 0.999D, d15, d7, d9);
/* 2642 */         localbmh.a(d17, paramInt2 + 0.999D, d19, d7, d11);
/* 2643 */         localbmh.a(d18, paramInt2 + 0.999D, d19, d8, d11);
/*      */         
/* 2645 */         localbmh.a(d17, paramInt2 + 0.001D, d15, d7, d9);
/* 2646 */         localbmh.a(d18, paramInt2 + 0.001D, d15, d8, d9);
/* 2647 */         localbmh.a(d18, paramInt2 + 0.001D, d19, d8, d11);
/* 2648 */         localbmh.a(d17, paramInt2 + 0.001D, d19, d7, d11);
/*      */       }
/* 2650 */     } else if ((!bool5) && (!bool4)) {
/* 2651 */       localbmh.a(d18, paramInt2 + 0.999D, d19, d3, d5);
/* 2652 */       localbmh.a(d18, paramInt2 + 0.001D, d19, d3, d6);
/* 2653 */       localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2654 */       localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/*      */     }
/*      */     
/* 2657 */     if (((bool3) || (i4 != 0)) && (!bool2)) {
/* 2658 */       if ((!bool4) && (i4 == 0)) {
/* 2659 */         localbmh.a(d17, paramInt2 + 0.999D, d19, d2, d5);
/* 2660 */         localbmh.a(d17, paramInt2 + 0.001D, d19, d2, d6);
/* 2661 */         localbmh.a(d17, paramInt2 + 0.001D, d16, d4, d6);
/* 2662 */         localbmh.a(d17, paramInt2 + 0.999D, d16, d4, d5);
/*      */       } else {
/* 2664 */         localbmh.a(d17, paramInt2 + 0.999D, d20, d3, d5);
/* 2665 */         localbmh.a(d17, paramInt2 + 0.001D, d20, d3, d6);
/* 2666 */         localbmh.a(d17, paramInt2 + 0.001D, d16, d4, d6);
/* 2667 */         localbmh.a(d17, paramInt2 + 0.999D, d16, d4, d5);
/*      */       }
/* 2669 */       if ((!bool5) && (i4 == 0)) {
/* 2670 */         localbmh.a(d18, paramInt2 + 0.999D, d16, d4, d5);
/* 2671 */         localbmh.a(d18, paramInt2 + 0.001D, d16, d4, d6);
/* 2672 */         localbmh.a(d18, paramInt2 + 0.001D, d19, d2, d6);
/* 2673 */         localbmh.a(d18, paramInt2 + 0.999D, d19, d2, d5);
/*      */       } else {
/* 2675 */         localbmh.a(d18, paramInt2 + 0.999D, d16, d4, d5);
/* 2676 */         localbmh.a(d18, paramInt2 + 0.001D, d16, d4, d6);
/* 2677 */         localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2678 */         localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/*      */       }
/*      */       
/* 2681 */       localbmh.a(d18, paramInt2 + 0.999D, d20, d8, d12);
/* 2682 */       localbmh.a(d17, paramInt2 + 0.999D, d20, d7, d12);
/* 2683 */       localbmh.a(d17, paramInt2 + 0.999D, d16, d7, d10);
/* 2684 */       localbmh.a(d18, paramInt2 + 0.999D, d16, d8, d10);
/*      */       
/* 2686 */       localbmh.a(d17, paramInt2 + 0.001D, d20, d7, d12);
/* 2687 */       localbmh.a(d18, paramInt2 + 0.001D, d20, d8, d12);
/* 2688 */       localbmh.a(d18, paramInt2 + 0.001D, d16, d8, d10);
/* 2689 */       localbmh.a(d17, paramInt2 + 0.001D, d16, d7, d10);
/* 2690 */     } else if ((!bool3) && (!bool5) && (!bool4)) {
/* 2691 */       localbmh.a(d17, paramInt2 + 0.999D, d20, d2, d5);
/* 2692 */       localbmh.a(d17, paramInt2 + 0.001D, d20, d2, d6);
/* 2693 */       localbmh.a(d18, paramInt2 + 0.001D, d20, d3, d6);
/* 2694 */       localbmh.a(d18, paramInt2 + 0.999D, d20, d3, d5);
/*      */     }
/*      */     
/* 2697 */     localbmh.a(d18, paramInt2 + 0.999D, d19, d8, d11);
/* 2698 */     localbmh.a(d17, paramInt2 + 0.999D, d19, d7, d11);
/* 2699 */     localbmh.a(d17, paramInt2 + 0.999D, d20, d7, d12);
/* 2700 */     localbmh.a(d18, paramInt2 + 0.999D, d20, d8, d12);
/*      */     
/* 2702 */     localbmh.a(d17, paramInt2 + 0.001D, d19, d7, d11);
/* 2703 */     localbmh.a(d18, paramInt2 + 0.001D, d19, d8, d11);
/* 2704 */     localbmh.a(d18, paramInt2 + 0.001D, d20, d8, d12);
/* 2705 */     localbmh.a(d17, paramInt2 + 0.001D, d20, d7, d12);
/*      */     
/* 2707 */     if (i4 != 0) {
/* 2708 */       localbmh.a(d13, paramInt2 + 0.999D, d19, d2, d5);
/* 2709 */       localbmh.a(d13, paramInt2 + 0.001D, d19, d2, d6);
/* 2710 */       localbmh.a(d13, paramInt2 + 0.001D, d20, d3, d6);
/* 2711 */       localbmh.a(d13, paramInt2 + 0.999D, d20, d3, d5);
/*      */       
/* 2713 */       localbmh.a(d14, paramInt2 + 0.999D, d20, d2, d5);
/* 2714 */       localbmh.a(d14, paramInt2 + 0.001D, d20, d2, d6);
/* 2715 */       localbmh.a(d14, paramInt2 + 0.001D, d19, d3, d6);
/* 2716 */       localbmh.a(d14, paramInt2 + 0.999D, d19, d3, d5);
/*      */       
/* 2718 */       localbmh.a(d18, paramInt2 + 0.999D, d15, d3, d5);
/* 2719 */       localbmh.a(d18, paramInt2 + 0.001D, d15, d3, d6);
/* 2720 */       localbmh.a(d17, paramInt2 + 0.001D, d15, d2, d6);
/* 2721 */       localbmh.a(d17, paramInt2 + 0.999D, d15, d2, d5);
/*      */       
/* 2723 */       localbmh.a(d17, paramInt2 + 0.999D, d16, d2, d5);
/* 2724 */       localbmh.a(d17, paramInt2 + 0.001D, d16, d2, d6);
/* 2725 */       localbmh.a(d18, paramInt2 + 0.001D, d16, d3, d6);
/* 2726 */       localbmh.a(d18, paramInt2 + 0.999D, d16, d3, d5);
/*      */     }
/* 2728 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(aoa paramaoa, int paramInt1, int paramInt2, int paramInt3) {
/* 2732 */     int i1 = this.a.R();
/* 2733 */     bmh localbmh = bmh.a;
/*      */     
/* 2735 */     localbmh.b(paramaoa.c(this.a, paramInt1, paramInt2, paramInt3));
/* 2736 */     int i2 = paramaoa.d(this.a, paramInt1, paramInt2, paramInt3);
/* 2737 */     float f1 = (i2 >> 16 & 0xFF) / 255.0F;
/* 2738 */     float f2 = (i2 >> 8 & 0xFF) / 255.0F;
/* 2739 */     float f3 = (i2 & 0xFF) / 255.0F;
/*      */     
/* 2741 */     if (blt.a) {
/* 2742 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 2743 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 2744 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 2746 */       f1 = f4;
/* 2747 */       f2 = f5;
/* 2748 */       f3 = f6;
/*      */     }
/* 2750 */     localbmh.b(f1, f2, f3);
/*      */     
/*      */     rf localrf1;
/*      */     
/*      */     rf localrf2;
/* 2755 */     if (b()) {
/* 2756 */       localrf1 = this.d;
/* 2757 */       localrf2 = this.d;
/*      */     } else {
/* 2759 */       int i3 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 2760 */       localrf1 = a(paramaoa, 0, i3);
/* 2761 */       localrf2 = paramaoa.e();
/*      */     }
/*      */     
/* 2764 */     double d1 = localrf1.c();
/* 2765 */     double d2 = localrf1.a(8.0D);
/* 2766 */     double d3 = localrf1.d();
/* 2767 */     double d4 = localrf1.e();
/* 2768 */     double d5 = localrf1.f();
/*      */     
/* 2770 */     double d6 = localrf2.a(7.0D);
/* 2771 */     double d7 = localrf2.a(9.0D);
/* 2772 */     double d8 = localrf2.e();
/* 2773 */     double d9 = localrf2.b(8.0D);
/* 2774 */     double d10 = localrf2.f();
/*      */     
/* 2776 */     double d11 = paramInt1;
/* 2777 */     double d12 = paramInt1 + 0.5D;
/* 2778 */     double d13 = paramInt1 + 1;
/* 2779 */     double d14 = paramInt3;
/* 2780 */     double d15 = paramInt3 + 0.5D;
/* 2781 */     double d16 = paramInt3 + 1;
/* 2782 */     double d17 = paramInt1 + 0.5D - 0.0625D;
/* 2783 */     double d18 = paramInt1 + 0.5D + 0.0625D;
/* 2784 */     double d19 = paramInt3 + 0.5D - 0.0625D;
/* 2785 */     double d20 = paramInt3 + 0.5D + 0.0625D;
/*      */     
/* 2787 */     boolean bool1 = paramaoa.a(this.a.a(paramInt1, paramInt2, paramInt3 - 1));
/* 2788 */     boolean bool2 = paramaoa.a(this.a.a(paramInt1, paramInt2, paramInt3 + 1));
/* 2789 */     boolean bool3 = paramaoa.a(this.a.a(paramInt1 - 1, paramInt2, paramInt3));
/* 2790 */     boolean bool4 = paramaoa.a(this.a.a(paramInt1 + 1, paramInt2, paramInt3));
/*      */     
/* 2792 */     boolean bool5 = paramaoa.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1);
/* 2793 */     boolean bool6 = paramaoa.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0);
/*      */     
/* 2795 */     double d21 = 0.01D;
/* 2796 */     double d22 = 0.005D;
/*      */     
/* 2798 */     if (((bool3) && (bool4)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2))) {
/* 2799 */       localbmh.a(d11, paramInt2 + 1, d15, d1, d4);
/* 2800 */       localbmh.a(d11, paramInt2 + 0, d15, d1, d5);
/* 2801 */       localbmh.a(d13, paramInt2 + 0, d15, d3, d5);
/* 2802 */       localbmh.a(d13, paramInt2 + 1, d15, d3, d4);
/*      */       
/* 2804 */       localbmh.a(d13, paramInt2 + 1, d15, d1, d4);
/* 2805 */       localbmh.a(d13, paramInt2 + 0, d15, d1, d5);
/* 2806 */       localbmh.a(d11, paramInt2 + 0, d15, d3, d5);
/* 2807 */       localbmh.a(d11, paramInt2 + 1, d15, d3, d4);
/*      */       
/* 2809 */       if (bool5)
/*      */       {
/* 2811 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2812 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2813 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d8);
/* 2814 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d10);
/*      */         
/* 2816 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2817 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2818 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d8);
/* 2819 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d10);
/*      */       } else {
/* 2821 */         if ((paramInt2 < i1 - 1) && (this.a.c(paramInt1 - 1, paramInt2 + 1, paramInt3))) {
/* 2822 */           localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2823 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2824 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d10);
/* 2825 */           localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d9);
/*      */           
/* 2827 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2828 */           localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2829 */           localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d10);
/* 2830 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d9);
/*      */         }
/* 2832 */         if ((paramInt2 < i1 - 1) && (this.a.c(paramInt1 + 1, paramInt2 + 1, paramInt3))) {
/* 2833 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2834 */           localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2835 */           localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d9);
/* 2836 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d8);
/*      */           
/* 2838 */           localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2839 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2840 */           localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d9);
/* 2841 */           localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d8);
/*      */         }
/*      */       }
/* 2844 */       if (bool6)
/*      */       {
/* 2846 */         localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d10);
/* 2847 */         localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d8);
/* 2848 */         localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d8);
/* 2849 */         localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d10);
/*      */         
/* 2851 */         localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d10);
/* 2852 */         localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d8);
/* 2853 */         localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d8);
/* 2854 */         localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d10);
/*      */       } else {
/* 2856 */         if ((paramInt2 > 1) && (this.a.c(paramInt1 - 1, paramInt2 - 1, paramInt3))) {
/* 2857 */           localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d9);
/* 2858 */           localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d10);
/* 2859 */           localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d10);
/* 2860 */           localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d9);
/*      */           
/* 2862 */           localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d9);
/* 2863 */           localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d10);
/* 2864 */           localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d10);
/* 2865 */           localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d9);
/*      */         }
/* 2867 */         if ((paramInt2 > 1) && (this.a.c(paramInt1 + 1, paramInt2 - 1, paramInt3))) {
/* 2868 */           localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d8);
/* 2869 */           localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d9);
/* 2870 */           localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d9);
/* 2871 */           localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d8);
/*      */           
/* 2873 */           localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d8);
/* 2874 */           localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d9);
/* 2875 */           localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d9);
/* 2876 */           localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d8);
/*      */         }
/*      */       }
/*      */     }
/* 2880 */     else if ((bool3) && (!bool4))
/*      */     {
/* 2882 */       localbmh.a(d11, paramInt2 + 1, d15, d1, d4);
/* 2883 */       localbmh.a(d11, paramInt2 + 0, d15, d1, d5);
/* 2884 */       localbmh.a(d12, paramInt2 + 0, d15, d2, d5);
/* 2885 */       localbmh.a(d12, paramInt2 + 1, d15, d2, d4);
/*      */       
/* 2887 */       localbmh.a(d12, paramInt2 + 1, d15, d1, d4);
/* 2888 */       localbmh.a(d12, paramInt2 + 0, d15, d1, d5);
/* 2889 */       localbmh.a(d11, paramInt2 + 0, d15, d2, d5);
/* 2890 */       localbmh.a(d11, paramInt2 + 1, d15, d2, d4);
/*      */       
/*      */ 
/* 2893 */       if ((!bool2) && (!bool1)) {
/* 2894 */         localbmh.a(d12, paramInt2 + 1, d20, d6, d8);
/* 2895 */         localbmh.a(d12, paramInt2 + 0, d20, d6, d10);
/* 2896 */         localbmh.a(d12, paramInt2 + 0, d19, d7, d10);
/* 2897 */         localbmh.a(d12, paramInt2 + 1, d19, d7, d8);
/*      */         
/* 2899 */         localbmh.a(d12, paramInt2 + 1, d19, d6, d8);
/* 2900 */         localbmh.a(d12, paramInt2 + 0, d19, d6, d10);
/* 2901 */         localbmh.a(d12, paramInt2 + 0, d20, d7, d10);
/* 2902 */         localbmh.a(d12, paramInt2 + 1, d20, d7, d8);
/*      */       }
/*      */       
/* 2905 */       if ((bool5) || ((paramInt2 < i1 - 1) && (this.a.c(paramInt1 - 1, paramInt2 + 1, paramInt3))))
/*      */       {
/* 2907 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2908 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2909 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d10);
/* 2910 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d9);
/*      */         
/* 2912 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2913 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d20, d7, d10);
/* 2914 */         localbmh.a(d11, paramInt2 + 1 + 0.01D, d19, d6, d10);
/* 2915 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d9);
/*      */       }
/* 2917 */       if ((bool6) || ((paramInt2 > 1) && (this.a.c(paramInt1 - 1, paramInt2 - 1, paramInt3))))
/*      */       {
/* 2919 */         localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d9);
/* 2920 */         localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d10);
/* 2921 */         localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d10);
/* 2922 */         localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d9);
/*      */         
/* 2924 */         localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d9);
/* 2925 */         localbmh.a(d11, paramInt2 - 0.01D, d20, d7, d10);
/* 2926 */         localbmh.a(d11, paramInt2 - 0.01D, d19, d6, d10);
/* 2927 */         localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d9);
/*      */       }
/*      */     }
/* 2930 */     else if ((!bool3) && (bool4))
/*      */     {
/* 2932 */       localbmh.a(d12, paramInt2 + 1, d15, d2, d4);
/* 2933 */       localbmh.a(d12, paramInt2 + 0, d15, d2, d5);
/* 2934 */       localbmh.a(d13, paramInt2 + 0, d15, d3, d5);
/* 2935 */       localbmh.a(d13, paramInt2 + 1, d15, d3, d4);
/*      */       
/* 2937 */       localbmh.a(d13, paramInt2 + 1, d15, d2, d4);
/* 2938 */       localbmh.a(d13, paramInt2 + 0, d15, d2, d5);
/* 2939 */       localbmh.a(d12, paramInt2 + 0, d15, d3, d5);
/* 2940 */       localbmh.a(d12, paramInt2 + 1, d15, d3, d4);
/*      */       
/*      */ 
/* 2943 */       if ((!bool2) && (!bool1)) {
/* 2944 */         localbmh.a(d12, paramInt2 + 1, d19, d6, d8);
/* 2945 */         localbmh.a(d12, paramInt2 + 0, d19, d6, d10);
/* 2946 */         localbmh.a(d12, paramInt2 + 0, d20, d7, d10);
/* 2947 */         localbmh.a(d12, paramInt2 + 1, d20, d7, d8);
/*      */         
/* 2949 */         localbmh.a(d12, paramInt2 + 1, d20, d6, d8);
/* 2950 */         localbmh.a(d12, paramInt2 + 0, d20, d6, d10);
/* 2951 */         localbmh.a(d12, paramInt2 + 0, d19, d7, d10);
/* 2952 */         localbmh.a(d12, paramInt2 + 1, d19, d7, d8);
/*      */       }
/*      */       
/* 2955 */       if ((bool5) || ((paramInt2 < i1 - 1) && (this.a.c(paramInt1 + 1, paramInt2 + 1, paramInt3))))
/*      */       {
/* 2957 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2958 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2959 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d9);
/* 2960 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d8);
/*      */         
/* 2962 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d20, d7, d8);
/* 2963 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d20, d7, d9);
/* 2964 */         localbmh.a(d12, paramInt2 + 1 + 0.01D, d19, d6, d9);
/* 2965 */         localbmh.a(d13, paramInt2 + 1 + 0.01D, d19, d6, d8);
/*      */       }
/* 2967 */       if ((bool6) || ((paramInt2 > 1) && (this.a.c(paramInt1 + 1, paramInt2 - 1, paramInt3))))
/*      */       {
/* 2969 */         localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d8);
/* 2970 */         localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d9);
/* 2971 */         localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d9);
/* 2972 */         localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d8);
/*      */         
/* 2974 */         localbmh.a(d13, paramInt2 - 0.01D, d20, d7, d8);
/* 2975 */         localbmh.a(d12, paramInt2 - 0.01D, d20, d7, d9);
/* 2976 */         localbmh.a(d12, paramInt2 - 0.01D, d19, d6, d9);
/* 2977 */         localbmh.a(d13, paramInt2 - 0.01D, d19, d6, d8);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 2982 */     if (((bool1) && (bool2)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2)))
/*      */     {
/* 2984 */       localbmh.a(d12, paramInt2 + 1, d16, d1, d4);
/* 2985 */       localbmh.a(d12, paramInt2 + 0, d16, d1, d5);
/* 2986 */       localbmh.a(d12, paramInt2 + 0, d14, d3, d5);
/* 2987 */       localbmh.a(d12, paramInt2 + 1, d14, d3, d4);
/*      */       
/* 2989 */       localbmh.a(d12, paramInt2 + 1, d14, d1, d4);
/* 2990 */       localbmh.a(d12, paramInt2 + 0, d14, d1, d5);
/* 2991 */       localbmh.a(d12, paramInt2 + 0, d16, d3, d5);
/* 2992 */       localbmh.a(d12, paramInt2 + 1, d16, d3, d4);
/*      */       
/* 2994 */       if (bool5)
/*      */       {
/* 2996 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d10);
/* 2997 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d7, d8);
/* 2998 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d6, d8);
/* 2999 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d10);
/*      */         
/* 3001 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d7, d10);
/* 3002 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d8);
/* 3003 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d8);
/* 3004 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d6, d10);
/*      */       } else {
/* 3006 */         if ((paramInt2 < i1 - 1) && (this.a.c(paramInt1, paramInt2 + 1, paramInt3 - 1))) {
/* 3007 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d7, d8);
/* 3008 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d7, d9);
/* 3009 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d6, d9);
/* 3010 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d6, d8);
/*      */           
/* 3012 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d7, d8);
/* 3013 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d7, d9);
/* 3014 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d6, d9);
/* 3015 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d6, d8);
/*      */         }
/* 3017 */         if ((paramInt2 < i1 - 1) && (this.a.c(paramInt1, paramInt2 + 1, paramInt3 + 1))) {
/* 3018 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d6, d9);
/* 3019 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d10);
/* 3020 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d10);
/* 3021 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d7, d9);
/*      */           
/* 3023 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d9);
/* 3024 */           localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d6, d10);
/* 3025 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d7, d10);
/* 3026 */           localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d9);
/*      */         }
/*      */       }
/* 3029 */       if (bool6)
/*      */       {
/* 3031 */         localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d10);
/* 3032 */         localbmh.a(d18, paramInt2 - 0.005D, d14, d7, d8);
/* 3033 */         localbmh.a(d17, paramInt2 - 0.005D, d14, d6, d8);
/* 3034 */         localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d10);
/*      */         
/* 3036 */         localbmh.a(d18, paramInt2 - 0.005D, d14, d7, d10);
/* 3037 */         localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d8);
/* 3038 */         localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d8);
/* 3039 */         localbmh.a(d17, paramInt2 - 0.005D, d14, d6, d10);
/*      */       } else {
/* 3041 */         if ((paramInt2 > 1) && (this.a.c(paramInt1, paramInt2 - 1, paramInt3 - 1)))
/*      */         {
/* 3043 */           localbmh.a(d17, paramInt2 - 0.005D, d14, d7, d8);
/* 3044 */           localbmh.a(d17, paramInt2 - 0.005D, d15, d7, d9);
/* 3045 */           localbmh.a(d18, paramInt2 - 0.005D, d15, d6, d9);
/* 3046 */           localbmh.a(d18, paramInt2 - 0.005D, d14, d6, d8);
/*      */           
/* 3048 */           localbmh.a(d17, paramInt2 - 0.005D, d15, d7, d8);
/* 3049 */           localbmh.a(d17, paramInt2 - 0.005D, d14, d7, d9);
/* 3050 */           localbmh.a(d18, paramInt2 - 0.005D, d14, d6, d9);
/* 3051 */           localbmh.a(d18, paramInt2 - 0.005D, d15, d6, d8);
/*      */         }
/* 3053 */         if ((paramInt2 > 1) && (this.a.c(paramInt1, paramInt2 - 1, paramInt3 + 1)))
/*      */         {
/* 3055 */           localbmh.a(d17, paramInt2 - 0.005D, d15, d6, d9);
/* 3056 */           localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d10);
/* 3057 */           localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d10);
/* 3058 */           localbmh.a(d18, paramInt2 - 0.005D, d15, d7, d9);
/*      */           
/* 3060 */           localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d9);
/* 3061 */           localbmh.a(d17, paramInt2 - 0.005D, d15, d6, d10);
/* 3062 */           localbmh.a(d18, paramInt2 - 0.005D, d15, d7, d10);
/* 3063 */           localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d9);
/*      */         }
/*      */       }
/*      */     }
/* 3067 */     else if ((bool1) && (!bool2))
/*      */     {
/* 3069 */       localbmh.a(d12, paramInt2 + 1, d14, d1, d4);
/* 3070 */       localbmh.a(d12, paramInt2 + 0, d14, d1, d5);
/* 3071 */       localbmh.a(d12, paramInt2 + 0, d15, d2, d5);
/* 3072 */       localbmh.a(d12, paramInt2 + 1, d15, d2, d4);
/*      */       
/* 3074 */       localbmh.a(d12, paramInt2 + 1, d15, d1, d4);
/* 3075 */       localbmh.a(d12, paramInt2 + 0, d15, d1, d5);
/* 3076 */       localbmh.a(d12, paramInt2 + 0, d14, d2, d5);
/* 3077 */       localbmh.a(d12, paramInt2 + 1, d14, d2, d4);
/*      */       
/*      */ 
/* 3080 */       if ((!bool4) && (!bool3)) {
/* 3081 */         localbmh.a(d17, paramInt2 + 1, d15, d6, d8);
/* 3082 */         localbmh.a(d17, paramInt2 + 0, d15, d6, d10);
/* 3083 */         localbmh.a(d18, paramInt2 + 0, d15, d7, d10);
/* 3084 */         localbmh.a(d18, paramInt2 + 1, d15, d7, d8);
/*      */         
/* 3086 */         localbmh.a(d18, paramInt2 + 1, d15, d6, d8);
/* 3087 */         localbmh.a(d18, paramInt2 + 0, d15, d6, d10);
/* 3088 */         localbmh.a(d17, paramInt2 + 0, d15, d7, d10);
/* 3089 */         localbmh.a(d17, paramInt2 + 1, d15, d7, d8);
/*      */       }
/*      */       
/* 3092 */       if ((bool5) || ((paramInt2 < i1 - 1) && (this.a.c(paramInt1, paramInt2 + 1, paramInt3 - 1))))
/*      */       {
/* 3094 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d7, d8);
/* 3095 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d7, d9);
/* 3096 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d6, d9);
/* 3097 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d6, d8);
/*      */         
/* 3099 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d7, d8);
/* 3100 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d14, d7, d9);
/* 3101 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d14, d6, d9);
/* 3102 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d6, d8);
/*      */       }
/*      */       
/* 3105 */       if ((bool6) || ((paramInt2 > 1) && (this.a.c(paramInt1, paramInt2 - 1, paramInt3 - 1))))
/*      */       {
/* 3107 */         localbmh.a(d17, paramInt2 - 0.005D, d14, d7, d8);
/* 3108 */         localbmh.a(d17, paramInt2 - 0.005D, d15, d7, d9);
/* 3109 */         localbmh.a(d18, paramInt2 - 0.005D, d15, d6, d9);
/* 3110 */         localbmh.a(d18, paramInt2 - 0.005D, d14, d6, d8);
/*      */         
/* 3112 */         localbmh.a(d17, paramInt2 - 0.005D, d15, d7, d8);
/* 3113 */         localbmh.a(d17, paramInt2 - 0.005D, d14, d7, d9);
/* 3114 */         localbmh.a(d18, paramInt2 - 0.005D, d14, d6, d9);
/* 3115 */         localbmh.a(d18, paramInt2 - 0.005D, d15, d6, d8);
/*      */       }
/*      */     }
/* 3118 */     else if ((!bool1) && (bool2))
/*      */     {
/* 3120 */       localbmh.a(d12, paramInt2 + 1, d15, d2, d4);
/* 3121 */       localbmh.a(d12, paramInt2 + 0, d15, d2, d5);
/* 3122 */       localbmh.a(d12, paramInt2 + 0, d16, d3, d5);
/* 3123 */       localbmh.a(d12, paramInt2 + 1, d16, d3, d4);
/*      */       
/* 3125 */       localbmh.a(d12, paramInt2 + 1, d16, d2, d4);
/* 3126 */       localbmh.a(d12, paramInt2 + 0, d16, d2, d5);
/* 3127 */       localbmh.a(d12, paramInt2 + 0, d15, d3, d5);
/* 3128 */       localbmh.a(d12, paramInt2 + 1, d15, d3, d4);
/*      */       
/*      */ 
/* 3131 */       if ((!bool4) && (!bool3)) {
/* 3132 */         localbmh.a(d18, paramInt2 + 1, d15, d6, d8);
/* 3133 */         localbmh.a(d18, paramInt2 + 0, d15, d6, d10);
/* 3134 */         localbmh.a(d17, paramInt2 + 0, d15, d7, d10);
/* 3135 */         localbmh.a(d17, paramInt2 + 1, d15, d7, d8);
/*      */         
/* 3137 */         localbmh.a(d17, paramInt2 + 1, d15, d6, d8);
/* 3138 */         localbmh.a(d17, paramInt2 + 0, d15, d6, d10);
/* 3139 */         localbmh.a(d18, paramInt2 + 0, d15, d7, d10);
/* 3140 */         localbmh.a(d18, paramInt2 + 1, d15, d7, d8);
/*      */       }
/*      */       
/* 3143 */       if ((bool5) || ((paramInt2 < i1 - 1) && (this.a.c(paramInt1, paramInt2 + 1, paramInt3 + 1))))
/*      */       {
/* 3145 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d6, d9);
/* 3146 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d10);
/* 3147 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d10);
/* 3148 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d7, d9);
/*      */         
/* 3150 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d16, d6, d9);
/* 3151 */         localbmh.a(d17, paramInt2 + 1 + 0.005D, d15, d6, d10);
/* 3152 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d15, d7, d10);
/* 3153 */         localbmh.a(d18, paramInt2 + 1 + 0.005D, d16, d7, d9);
/*      */       }
/* 3155 */       if ((bool6) || ((paramInt2 > 1) && (this.a.c(paramInt1, paramInt2 - 1, paramInt3 + 1))))
/*      */       {
/* 3157 */         localbmh.a(d17, paramInt2 - 0.005D, d15, d6, d9);
/* 3158 */         localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d10);
/* 3159 */         localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d10);
/* 3160 */         localbmh.a(d18, paramInt2 - 0.005D, d15, d7, d9);
/*      */         
/* 3162 */         localbmh.a(d17, paramInt2 - 0.005D, d16, d6, d9);
/* 3163 */         localbmh.a(d17, paramInt2 - 0.005D, d15, d6, d10);
/* 3164 */         localbmh.a(d18, paramInt2 - 0.005D, d15, d7, d10);
/* 3165 */         localbmh.a(d18, paramInt2 - 0.005D, d16, d7, d9);
/*      */       }
/*      */     }
/*      */     
/* 3169 */     return true;
/*      */   }
/*      */   
/*      */   public boolean l(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3173 */     bmh localbmh = bmh.a;
/*      */     
/* 3175 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 3176 */     int i1 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 3177 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 3178 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 3179 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 3181 */     if (blt.a) {
/* 3182 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 3183 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 3184 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 3186 */       f1 = f4;
/* 3187 */       f2 = f5;
/* 3188 */       f3 = f6;
/*      */     }
/* 3190 */     localbmh.b(f1, f2, f3);
/*      */     
/* 3192 */     double d1 = paramInt1;
/* 3193 */     double d2 = paramInt2;
/* 3194 */     double d3 = paramInt3;
/*      */     long l1;
/* 3196 */     if (paramaji == ajn.H) {
/* 3197 */       l1 = paramInt1 * 3129871 ^ paramInt3 * 116129781L ^ paramInt2;
/* 3198 */       l1 = l1 * l1 * 42317861L + l1 * 11L;
/*      */       
/* 3200 */       d1 += ((float)(l1 >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 3201 */       d2 += ((float)(l1 >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
/* 3202 */       d3 += ((float)(l1 >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
/* 3203 */     } else if ((paramaji == ajn.O) || (paramaji == ajn.N)) {
/* 3204 */       l1 = paramInt1 * 3129871 ^ paramInt3 * 116129781L ^ paramInt2;
/* 3205 */       l1 = l1 * l1 * 42317861L + l1 * 11L;
/*      */       
/* 3207 */       d1 += ((float)(l1 >> 16 & 0xF) / 15.0F - 0.5D) * 0.3D;
/* 3208 */       d3 += ((float)(l1 >> 24 & 0xF) / 15.0F - 0.5D) * 0.3D;
/*      */     }
/*      */     
/* 3211 */     rf localrf = a(paramaji, 0, this.a.e(paramInt1, paramInt2, paramInt3));
/* 3212 */     a(localrf, d1, d2, d3, 1.0F);
/* 3213 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(ako paramako, int paramInt1, int paramInt2, int paramInt3) {
/* 3217 */     bmh localbmh = bmh.a;
/*      */     
/* 3219 */     localbmh.b(paramako.c(this.a, paramInt1, paramInt2, paramInt3));
/* 3220 */     int i1 = paramako.d(this.a, paramInt1, paramInt2, paramInt3);
/* 3221 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 3222 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 3223 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 3225 */     if (blt.a) {
/* 3226 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 3227 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 3228 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 3230 */       f1 = f4;
/* 3231 */       f2 = f5;
/* 3232 */       f3 = f6;
/*      */     }
/* 3234 */     localbmh.b(f1, f2, f3);
/*      */     
/* 3236 */     long l1 = paramInt1 * 3129871 ^ paramInt3 * 116129781L;
/* 3237 */     l1 = l1 * l1 * 42317861L + l1 * 11L;
/*      */     
/* 3239 */     double d1 = paramInt1;
/* 3240 */     double d2 = paramInt2;
/* 3241 */     double d3 = paramInt3;
/*      */     
/* 3243 */     d1 += ((float)(l1 >> 16 & 0xF) / 15.0F - 0.5D) * 0.3D;
/* 3244 */     d3 += ((float)(l1 >> 24 & 0xF) / 15.0F - 0.5D) * 0.3D;
/*      */     
/*      */ 
/* 3247 */     int i2 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 3248 */     int i3 = 0;
/* 3249 */     boolean bool = ako.c(i2);
/* 3250 */     if (bool) {
/* 3251 */       if (this.a.a(paramInt1, paramInt2 - 1, paramInt3) != paramako) {
/* 3252 */         return false;
/*      */       }
/* 3254 */       i3 = ako.d(this.a.e(paramInt1, paramInt2 - 1, paramInt3));
/*      */     } else {
/* 3256 */       i3 = ako.d(i2);
/*      */     }
/* 3258 */     rf localrf1 = paramako.a(bool, i3);
/*      */     
/* 3260 */     a(localrf1, d1, d2, d3, 1.0F);
/*      */     
/* 3262 */     if ((bool) && (i3 == 0))
/*      */     {
/* 3264 */       rf localrf2 = paramako.b[0];
/*      */       
/* 3266 */       double d4 = Math.cos(l1 * 0.8D) * 3.141592653589793D * 0.1D;
/* 3267 */       double d5 = Math.cos(d4);
/* 3268 */       double d6 = Math.sin(d4);
/*      */       
/* 3270 */       double d7 = localrf2.c();
/* 3271 */       double d8 = localrf2.e();
/* 3272 */       double d9 = localrf2.d();
/* 3273 */       double d10 = localrf2.f();
/*      */       
/*      */ 
/* 3276 */       double d11 = 0.3D;
/* 3277 */       double d12 = -0.05D;
/* 3278 */       double d13 = 0.5D + 0.3D * d5 - 0.5D * d6;
/* 3279 */       double d14 = 0.5D + 0.5D * d5 + 0.3D * d6;
/* 3280 */       double d15 = 0.5D + 0.3D * d5 + 0.5D * d6;
/* 3281 */       double d16 = 0.5D + -0.5D * d5 + 0.3D * d6;
/* 3282 */       double d17 = 0.5D + -0.05D * d5 + 0.5D * d6;
/* 3283 */       double d18 = 0.5D + -0.5D * d5 + -0.05D * d6;
/* 3284 */       double d19 = 0.5D + -0.05D * d5 - 0.5D * d6;
/* 3285 */       double d20 = 0.5D + 0.5D * d5 + -0.05D * d6;
/*      */       
/*      */ 
/*      */ 
/* 3289 */       localbmh.a(d1 + d17, d2 + 1.0D, d3 + d18, d7, d10);
/* 3290 */       localbmh.a(d1 + d19, d2 + 1.0D, d3 + d20, d9, d10);
/* 3291 */       localbmh.a(d1 + d13, d2 + 0.0D, d3 + d14, d9, d8);
/* 3292 */       localbmh.a(d1 + d15, d2 + 0.0D, d3 + d16, d7, d8);
/*      */       
/* 3294 */       rf localrf3 = paramako.b[1];
/*      */       
/* 3296 */       d7 = localrf3.c();
/* 3297 */       d8 = localrf3.e();
/* 3298 */       d9 = localrf3.d();
/* 3299 */       d10 = localrf3.f();
/*      */       
/* 3301 */       localbmh.a(d1 + d19, d2 + 1.0D, d3 + d20, d7, d10);
/* 3302 */       localbmh.a(d1 + d17, d2 + 1.0D, d3 + d18, d9, d10);
/* 3303 */       localbmh.a(d1 + d15, d2 + 0.0D, d3 + d16, d9, d8);
/* 3304 */       localbmh.a(d1 + d13, d2 + 0.0D, d3 + d14, d7, d8);
/*      */     }
/*      */     
/* 3307 */     return true;
/*      */   }
/*      */   
/*      */   public boolean m(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3311 */     anu localanu = (anu)paramaji;
/* 3312 */     bmh localbmh = bmh.a;
/*      */     
/* 3314 */     localbmh.b(localanu.c(this.a, paramInt1, paramInt2, paramInt3));
/* 3315 */     int i1 = localanu.d(this.a, paramInt1, paramInt2, paramInt3);
/* 3316 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 3317 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 3318 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 3320 */     if (blt.a) {
/* 3321 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 3322 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 3323 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 3325 */       f1 = f4;
/* 3326 */       f2 = f5;
/* 3327 */       f3 = f6;
/*      */     }
/* 3329 */     localbmh.b(f1, f2, f3);
/*      */     
/* 3331 */     localanu.a(this.a, paramInt1, paramInt2, paramInt3);
/* 3332 */     int i2 = localanu.e(this.a, paramInt1, paramInt2, paramInt3);
/* 3333 */     if (i2 < 0) {
/* 3334 */       a(localanu, this.a.e(paramInt1, paramInt2, paramInt3), this.l, paramInt1, paramInt2 - 0.0625F, paramInt3);
/*      */     } else {
/* 3336 */       a(localanu, this.a.e(paramInt1, paramInt2, paramInt3), 0.5D, paramInt1, paramInt2 - 0.0625F, paramInt3);
/* 3337 */       a(localanu, this.a.e(paramInt1, paramInt2, paramInt3), i2, this.l, paramInt1, paramInt2 - 0.0625F, paramInt3);
/*      */     }
/* 3339 */     return true;
/*      */   }
/*      */   
/*      */   public boolean n(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3343 */     bmh localbmh = bmh.a;
/*      */     
/* 3345 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 3346 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/* 3348 */     a(paramaji, this.a.e(paramInt1, paramInt2, paramInt3), paramInt1, paramInt2 - 0.0625F, paramInt3);
/* 3349 */     return true;
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, int paramInt) {
/* 3353 */     bmh localbmh = bmh.a;
/* 3354 */     rf localrf = a(paramaji, 0, paramInt);
/*      */     
/* 3356 */     if (b()) localrf = this.d;
/* 3357 */     double d1 = localrf.c();
/* 3358 */     double d2 = localrf.e();
/* 3359 */     double d3 = localrf.d();
/* 3360 */     double d4 = localrf.f();
/*      */     
/* 3362 */     double d5 = localrf.a(7.0D);
/* 3363 */     double d6 = localrf.b(6.0D);
/* 3364 */     double d7 = localrf.a(9.0D);
/* 3365 */     double d8 = localrf.b(8.0D);
/*      */     
/* 3367 */     double d9 = localrf.a(7.0D);
/* 3368 */     double d10 = localrf.b(13.0D);
/* 3369 */     double d11 = localrf.a(9.0D);
/* 3370 */     double d12 = localrf.b(15.0D);
/*      */     
/* 3372 */     paramDouble1 += 0.5D;
/* 3373 */     paramDouble3 += 0.5D;
/*      */     
/* 3375 */     double d13 = paramDouble1 - 0.5D;
/* 3376 */     double d14 = paramDouble1 + 0.5D;
/* 3377 */     double d15 = paramDouble3 - 0.5D;
/* 3378 */     double d16 = paramDouble3 + 0.5D;
/* 3379 */     double d17 = 0.0625D;
/*      */     
/* 3381 */     double d18 = 0.625D;
/* 3382 */     localbmh.a(paramDouble1 + paramDouble4 * (1.0D - d18) - d17, paramDouble2 + d18, paramDouble3 + paramDouble5 * (1.0D - d18) - d17, d5, d6);
/* 3383 */     localbmh.a(paramDouble1 + paramDouble4 * (1.0D - d18) - d17, paramDouble2 + d18, paramDouble3 + paramDouble5 * (1.0D - d18) + d17, d5, d8);
/* 3384 */     localbmh.a(paramDouble1 + paramDouble4 * (1.0D - d18) + d17, paramDouble2 + d18, paramDouble3 + paramDouble5 * (1.0D - d18) + d17, d7, d8);
/* 3385 */     localbmh.a(paramDouble1 + paramDouble4 * (1.0D - d18) + d17, paramDouble2 + d18, paramDouble3 + paramDouble5 * (1.0D - d18) - d17, d7, d6);
/*      */     
/* 3387 */     localbmh.a(paramDouble1 + d17 + paramDouble4, paramDouble2, paramDouble3 - d17 + paramDouble5, d11, d10);
/* 3388 */     localbmh.a(paramDouble1 + d17 + paramDouble4, paramDouble2, paramDouble3 + d17 + paramDouble5, d11, d12);
/* 3389 */     localbmh.a(paramDouble1 - d17 + paramDouble4, paramDouble2, paramDouble3 + d17 + paramDouble5, d9, d12);
/* 3390 */     localbmh.a(paramDouble1 - d17 + paramDouble4, paramDouble2, paramDouble3 - d17 + paramDouble5, d9, d10);
/*      */     
/* 3392 */     localbmh.a(paramDouble1 - d17, paramDouble2 + 1.0D, d15, d1, d2);
/* 3393 */     localbmh.a(paramDouble1 - d17 + paramDouble4, paramDouble2 + 0.0D, d15 + paramDouble5, d1, d4);
/* 3394 */     localbmh.a(paramDouble1 - d17 + paramDouble4, paramDouble2 + 0.0D, d16 + paramDouble5, d3, d4);
/* 3395 */     localbmh.a(paramDouble1 - d17, paramDouble2 + 1.0D, d16, d3, d2);
/*      */     
/* 3397 */     localbmh.a(paramDouble1 + d17, paramDouble2 + 1.0D, d16, d1, d2);
/* 3398 */     localbmh.a(paramDouble1 + paramDouble4 + d17, paramDouble2 + 0.0D, d16 + paramDouble5, d1, d4);
/* 3399 */     localbmh.a(paramDouble1 + paramDouble4 + d17, paramDouble2 + 0.0D, d15 + paramDouble5, d3, d4);
/* 3400 */     localbmh.a(paramDouble1 + d17, paramDouble2 + 1.0D, d15, d3, d2);
/*      */     
/* 3402 */     localbmh.a(d13, paramDouble2 + 1.0D, paramDouble3 + d17, d1, d2);
/* 3403 */     localbmh.a(d13 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 + d17 + paramDouble5, d1, d4);
/* 3404 */     localbmh.a(d14 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 + d17 + paramDouble5, d3, d4);
/* 3405 */     localbmh.a(d14, paramDouble2 + 1.0D, paramDouble3 + d17, d3, d2);
/*      */     
/* 3407 */     localbmh.a(d14, paramDouble2 + 1.0D, paramDouble3 - d17, d1, d2);
/* 3408 */     localbmh.a(d14 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 - d17 + paramDouble5, d1, d4);
/* 3409 */     localbmh.a(d13 + paramDouble4, paramDouble2 + 0.0D, paramDouble3 - d17 + paramDouble5, d3, d4);
/* 3410 */     localbmh.a(d13, paramDouble2 + 1.0D, paramDouble3 - d17, d3, d2);
/*      */   }
/*      */   
/*      */   public void a(rf paramrf, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 3414 */     bmh localbmh = bmh.a;
/*      */     
/* 3416 */     if (b()) paramrf = this.d;
/* 3417 */     double d1 = paramrf.c();
/* 3418 */     double d2 = paramrf.e();
/* 3419 */     double d3 = paramrf.d();
/* 3420 */     double d4 = paramrf.f();
/*      */     
/* 3422 */     double d5 = 0.45D * paramFloat;
/* 3423 */     double d6 = paramDouble1 + 0.5D - d5;
/* 3424 */     double d7 = paramDouble1 + 0.5D + d5;
/* 3425 */     double d8 = paramDouble3 + 0.5D - d5;
/* 3426 */     double d9 = paramDouble3 + 0.5D + d5;
/*      */     
/* 3428 */     localbmh.a(d6, paramDouble2 + paramFloat, d8, d1, d2);
/* 3429 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/* 3430 */     localbmh.a(d7, paramDouble2 + 0.0D, d9, d3, d4);
/* 3431 */     localbmh.a(d7, paramDouble2 + paramFloat, d9, d3, d2);
/*      */     
/* 3433 */     localbmh.a(d7, paramDouble2 + paramFloat, d9, d1, d2);
/* 3434 */     localbmh.a(d7, paramDouble2 + 0.0D, d9, d1, d4);
/* 3435 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d3, d4);
/* 3436 */     localbmh.a(d6, paramDouble2 + paramFloat, d8, d3, d2);
/*      */     
/* 3438 */     localbmh.a(d6, paramDouble2 + paramFloat, d9, d1, d2);
/* 3439 */     localbmh.a(d6, paramDouble2 + 0.0D, d9, d1, d4);
/* 3440 */     localbmh.a(d7, paramDouble2 + 0.0D, d8, d3, d4);
/* 3441 */     localbmh.a(d7, paramDouble2 + paramFloat, d8, d3, d2);
/*      */     
/* 3443 */     localbmh.a(d7, paramDouble2 + paramFloat, d8, d1, d2);
/* 3444 */     localbmh.a(d7, paramDouble2 + 0.0D, d8, d1, d4);
/* 3445 */     localbmh.a(d6, paramDouble2 + 0.0D, d9, d3, d4);
/* 3446 */     localbmh.a(d6, paramDouble2 + paramFloat, d9, d3, d2);
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 3450 */     bmh localbmh = bmh.a;
/*      */     
/* 3452 */     rf localrf = a(paramaji, 0, paramInt);
/*      */     
/* 3454 */     if (b()) localrf = this.d;
/* 3455 */     double d1 = localrf.c();
/* 3456 */     double d2 = localrf.e();
/* 3457 */     double d3 = localrf.d();
/* 3458 */     double d4 = localrf.b(paramDouble1 * 16.0D);
/*      */     
/* 3460 */     double d5 = paramDouble2 + 0.5D - 0.44999998807907104D;
/* 3461 */     double d6 = paramDouble2 + 0.5D + 0.44999998807907104D;
/* 3462 */     double d7 = paramDouble4 + 0.5D - 0.44999998807907104D;
/* 3463 */     double d8 = paramDouble4 + 0.5D + 0.44999998807907104D;
/*      */     
/* 3465 */     localbmh.a(d5, paramDouble3 + paramDouble1, d7, d1, d2);
/* 3466 */     localbmh.a(d5, paramDouble3 + 0.0D, d7, d1, d4);
/* 3467 */     localbmh.a(d6, paramDouble3 + 0.0D, d8, d3, d4);
/* 3468 */     localbmh.a(d6, paramDouble3 + paramDouble1, d8, d3, d2);
/*      */     
/* 3470 */     localbmh.a(d6, paramDouble3 + paramDouble1, d8, d3, d2);
/* 3471 */     localbmh.a(d6, paramDouble3 + 0.0D, d8, d3, d4);
/* 3472 */     localbmh.a(d5, paramDouble3 + 0.0D, d7, d1, d4);
/* 3473 */     localbmh.a(d5, paramDouble3 + paramDouble1, d7, d1, d2);
/*      */     
/* 3475 */     localbmh.a(d5, paramDouble3 + paramDouble1, d8, d1, d2);
/* 3476 */     localbmh.a(d5, paramDouble3 + 0.0D, d8, d1, d4);
/* 3477 */     localbmh.a(d6, paramDouble3 + 0.0D, d7, d3, d4);
/* 3478 */     localbmh.a(d6, paramDouble3 + paramDouble1, d7, d3, d2);
/*      */     
/* 3480 */     localbmh.a(d6, paramDouble3 + paramDouble1, d7, d3, d2);
/* 3481 */     localbmh.a(d6, paramDouble3 + 0.0D, d7, d3, d4);
/* 3482 */     localbmh.a(d5, paramDouble3 + 0.0D, d8, d1, d4);
/* 3483 */     localbmh.a(d5, paramDouble3 + paramDouble1, d8, d1, d2);
/*      */   }
/*      */   
/*      */   public boolean o(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3487 */     bmh localbmh = bmh.a;
/*      */     
/* 3489 */     rf localrf = a(paramaji, 1);
/*      */     
/* 3491 */     if (b()) localrf = this.d;
/* 3492 */     float f1 = 0.015625F;
/*      */     
/* 3494 */     double d1 = localrf.c();
/* 3495 */     double d2 = localrf.e();
/* 3496 */     double d3 = localrf.d();
/* 3497 */     double d4 = localrf.f();
/*      */     
/* 3499 */     long l1 = paramInt1 * 3129871 ^ paramInt3 * 116129781L ^ paramInt2;
/* 3500 */     l1 = l1 * l1 * 42317861L + l1 * 11L;
/*      */     
/* 3502 */     int i1 = (int)(l1 >> 16 & 0x3);
/*      */     
/* 3504 */     localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/*      */     
/* 3506 */     float f2 = paramInt1 + 0.5F;
/* 3507 */     float f3 = paramInt3 + 0.5F;
/* 3508 */     float f4 = (i1 & 0x1) * 0.5F * (1 - i1 / 2 % 2 * 2);
/* 3509 */     float f5 = (i1 + 1 & 0x1) * 0.5F * (1 - (i1 + 1) / 2 % 2 * 2);
/*      */     
/* 3511 */     localbmh.c(paramaji.D());
/* 3512 */     localbmh.a(f2 + f4 - f5, paramInt2 + f1, f3 + f4 + f5, d1, d2);
/* 3513 */     localbmh.a(f2 + f4 + f5, paramInt2 + f1, f3 - f4 + f5, d3, d2);
/* 3514 */     localbmh.a(f2 - f4 + f5, paramInt2 + f1, f3 - f4 - f5, d3, d4);
/* 3515 */     localbmh.a(f2 - f4 - f5, paramInt2 + f1, f3 + f4 - f5, d1, d4);
/*      */     
/* 3517 */     localbmh.c((paramaji.D() & 0xFEFEFE) >> 1);
/* 3518 */     localbmh.a(f2 - f4 - f5, paramInt2 + f1, f3 + f4 - f5, d1, d4);
/* 3519 */     localbmh.a(f2 - f4 + f5, paramInt2 + f1, f3 - f4 - f5, d3, d4);
/* 3520 */     localbmh.a(f2 + f4 + f5, paramInt2 + f1, f3 - f4 + f5, d3, d2);
/* 3521 */     localbmh.a(f2 + f4 - f5, paramInt2 + f1, f3 + f4 + f5, d1, d2);
/*      */     
/* 3523 */     return true;
/*      */   }
/*      */   
/*      */   public void a(anu paramanu, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 3527 */     bmh localbmh = bmh.a;
/*      */     
/* 3529 */     rf localrf = paramanu.i();
/*      */     
/* 3531 */     if (b()) localrf = this.d;
/* 3532 */     double d1 = localrf.c();
/* 3533 */     double d2 = localrf.e();
/* 3534 */     double d3 = localrf.d();
/* 3535 */     double d4 = localrf.f();
/*      */     
/* 3537 */     double d5 = paramDouble2 + 0.5D - 0.5D;
/* 3538 */     double d6 = paramDouble2 + 0.5D + 0.5D;
/* 3539 */     double d7 = paramDouble4 + 0.5D - 0.5D;
/* 3540 */     double d8 = paramDouble4 + 0.5D + 0.5D;
/*      */     
/* 3542 */     double d9 = paramDouble2 + 0.5D;
/* 3543 */     double d10 = paramDouble4 + 0.5D;
/*      */     
/* 3545 */     if ((paramInt2 + 1) / 2 % 2 == 1) {
/* 3546 */       double d11 = d3;
/* 3547 */       d3 = d1;
/* 3548 */       d1 = d11;
/*      */     }
/*      */     
/* 3551 */     if (paramInt2 < 2) {
/* 3552 */       localbmh.a(d5, paramDouble3 + paramDouble1, d10, d1, d2);
/* 3553 */       localbmh.a(d5, paramDouble3 + 0.0D, d10, d1, d4);
/* 3554 */       localbmh.a(d6, paramDouble3 + 0.0D, d10, d3, d4);
/* 3555 */       localbmh.a(d6, paramDouble3 + paramDouble1, d10, d3, d2);
/*      */       
/* 3557 */       localbmh.a(d6, paramDouble3 + paramDouble1, d10, d3, d2);
/* 3558 */       localbmh.a(d6, paramDouble3 + 0.0D, d10, d3, d4);
/* 3559 */       localbmh.a(d5, paramDouble3 + 0.0D, d10, d1, d4);
/* 3560 */       localbmh.a(d5, paramDouble3 + paramDouble1, d10, d1, d2);
/*      */     }
/*      */     else {
/* 3563 */       localbmh.a(d9, paramDouble3 + paramDouble1, d8, d1, d2);
/* 3564 */       localbmh.a(d9, paramDouble3 + 0.0D, d8, d1, d4);
/* 3565 */       localbmh.a(d9, paramDouble3 + 0.0D, d7, d3, d4);
/* 3566 */       localbmh.a(d9, paramDouble3 + paramDouble1, d7, d3, d2);
/*      */       
/* 3568 */       localbmh.a(d9, paramDouble3 + paramDouble1, d7, d3, d2);
/* 3569 */       localbmh.a(d9, paramDouble3 + 0.0D, d7, d3, d4);
/* 3570 */       localbmh.a(d9, paramDouble3 + 0.0D, d8, d1, d4);
/* 3571 */       localbmh.a(d9, paramDouble3 + paramDouble1, d8, d1, d2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 3576 */     bmh localbmh = bmh.a;
/*      */     
/* 3578 */     rf localrf = a(paramaji, 0, paramInt);
/*      */     
/* 3580 */     if (b()) localrf = this.d;
/* 3581 */     double d1 = localrf.c();
/* 3582 */     double d2 = localrf.e();
/* 3583 */     double d3 = localrf.d();
/* 3584 */     double d4 = localrf.f();
/*      */     
/* 3586 */     double d5 = paramDouble1 + 0.5D - 0.25D;
/* 3587 */     double d6 = paramDouble1 + 0.5D + 0.25D;
/* 3588 */     double d7 = paramDouble3 + 0.5D - 0.5D;
/* 3589 */     double d8 = paramDouble3 + 0.5D + 0.5D;
/*      */     
/* 3591 */     localbmh.a(d5, paramDouble2 + 1.0D, d7, d1, d2);
/* 3592 */     localbmh.a(d5, paramDouble2 + 0.0D, d7, d1, d4);
/* 3593 */     localbmh.a(d5, paramDouble2 + 0.0D, d8, d3, d4);
/* 3594 */     localbmh.a(d5, paramDouble2 + 1.0D, d8, d3, d2);
/*      */     
/* 3596 */     localbmh.a(d5, paramDouble2 + 1.0D, d8, d1, d2);
/* 3597 */     localbmh.a(d5, paramDouble2 + 0.0D, d8, d1, d4);
/* 3598 */     localbmh.a(d5, paramDouble2 + 0.0D, d7, d3, d4);
/* 3599 */     localbmh.a(d5, paramDouble2 + 1.0D, d7, d3, d2);
/*      */     
/* 3601 */     localbmh.a(d6, paramDouble2 + 1.0D, d8, d1, d2);
/* 3602 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/* 3603 */     localbmh.a(d6, paramDouble2 + 0.0D, d7, d3, d4);
/* 3604 */     localbmh.a(d6, paramDouble2 + 1.0D, d7, d3, d2);
/*      */     
/* 3606 */     localbmh.a(d6, paramDouble2 + 1.0D, d7, d1, d2);
/* 3607 */     localbmh.a(d6, paramDouble2 + 0.0D, d7, d1, d4);
/* 3608 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d3, d4);
/* 3609 */     localbmh.a(d6, paramDouble2 + 1.0D, d8, d3, d2);
/*      */     
/* 3611 */     d5 = paramDouble1 + 0.5D - 0.5D;
/* 3612 */     d6 = paramDouble1 + 0.5D + 0.5D;
/* 3613 */     d7 = paramDouble3 + 0.5D - 0.25D;
/* 3614 */     d8 = paramDouble3 + 0.5D + 0.25D;
/*      */     
/* 3616 */     localbmh.a(d5, paramDouble2 + 1.0D, d7, d1, d2);
/* 3617 */     localbmh.a(d5, paramDouble2 + 0.0D, d7, d1, d4);
/* 3618 */     localbmh.a(d6, paramDouble2 + 0.0D, d7, d3, d4);
/* 3619 */     localbmh.a(d6, paramDouble2 + 1.0D, d7, d3, d2);
/*      */     
/* 3621 */     localbmh.a(d6, paramDouble2 + 1.0D, d7, d1, d2);
/* 3622 */     localbmh.a(d6, paramDouble2 + 0.0D, d7, d1, d4);
/* 3623 */     localbmh.a(d5, paramDouble2 + 0.0D, d7, d3, d4);
/* 3624 */     localbmh.a(d5, paramDouble2 + 1.0D, d7, d3, d2);
/*      */     
/* 3626 */     localbmh.a(d6, paramDouble2 + 1.0D, d8, d1, d2);
/* 3627 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d1, d4);
/* 3628 */     localbmh.a(d5, paramDouble2 + 0.0D, d8, d3, d4);
/* 3629 */     localbmh.a(d5, paramDouble2 + 1.0D, d8, d3, d2);
/*      */     
/* 3631 */     localbmh.a(d5, paramDouble2 + 1.0D, d8, d1, d2);
/* 3632 */     localbmh.a(d5, paramDouble2 + 0.0D, d8, d1, d4);
/* 3633 */     localbmh.a(d6, paramDouble2 + 0.0D, d8, d3, d4);
/* 3634 */     localbmh.a(d6, paramDouble2 + 1.0D, d8, d3, d2);
/*      */   }
/*      */   
/*      */   public boolean p(aji paramaji, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 3639 */     bmh localbmh = bmh.a;
/*      */     
/* 3641 */     int i1 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 3642 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 3643 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 3644 */     float f3 = (i1 & 0xFF) / 255.0F;
/* 3645 */     boolean bool1 = paramaji.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1);
/* 3646 */     boolean bool2 = paramaji.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0);
/* 3647 */     boolean[] arrayOfBoolean = new boolean[4];
/* 3648 */     arrayOfBoolean[0] = paramaji.a(this.a, paramInt1, paramInt2, paramInt3 - 1, 2);
/* 3649 */     arrayOfBoolean[1] = paramaji.a(this.a, paramInt1, paramInt2, paramInt3 + 1, 3);
/* 3650 */     arrayOfBoolean[2] = paramaji.a(this.a, paramInt1 - 1, paramInt2, paramInt3, 4);
/* 3651 */     arrayOfBoolean[3] = paramaji.a(this.a, paramInt1 + 1, paramInt2, paramInt3, 5);
/*      */     
/* 3653 */     if ((!bool1) && (!bool2) && (arrayOfBoolean[0] == 0) && (arrayOfBoolean[1] == 0) && (arrayOfBoolean[2] == 0) && (arrayOfBoolean[3] == 0)) { return false;
/*      */     }
/* 3655 */     boolean bool3 = false;
/* 3656 */     float f4 = 0.5F;
/* 3657 */     float f5 = 1.0F;
/* 3658 */     float f6 = 0.8F;
/* 3659 */     float f7 = 0.6F;
/*      */     
/* 3661 */     double d1 = 0.0D;
/* 3662 */     double d2 = 1.0D;
/*      */     
/* 3664 */     awt localawt = paramaji.o();
/* 3665 */     int i2 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 3667 */     double d3 = a(paramInt1, paramInt2, paramInt3, localawt);
/* 3668 */     double d4 = a(paramInt1, paramInt2, paramInt3 + 1, localawt);
/* 3669 */     double d5 = a(paramInt1 + 1, paramInt2, paramInt3 + 1, localawt);
/* 3670 */     double d6 = a(paramInt1 + 1, paramInt2, paramInt3, localawt);
/*      */     
/* 3672 */     double d7 = 0.0010000000474974513D;
/* 3673 */     float f10; float f11; float f12; if ((this.g) || (bool1)) {
/* 3674 */       bool3 = true;
/* 3675 */       rf localrf1 = a(paramaji, 1, i2);
/* 3676 */       float f8 = (float)alw.a(this.a, paramInt1, paramInt2, paramInt3, localawt);
/* 3677 */       if (f8 > -999.0F) {
/* 3678 */         localrf1 = a(paramaji, 2, i2);
/*      */       }
/*      */       
/* 3681 */       d3 -= d7;
/* 3682 */       d4 -= d7;
/* 3683 */       d5 -= d7;
/* 3684 */       d6 -= d7;
/*      */       double d8;
/*      */       double d15;
/*      */       double d9;
/*      */       double d17;
/* 3689 */       double d11; double d19; double d13; double d21; if (f8 < -999.0F) {
/* 3690 */         d8 = localrf1.a(0.0D);
/* 3691 */         d15 = localrf1.b(0.0D);
/* 3692 */         d9 = d8;
/* 3693 */         d17 = localrf1.b(16.0D);
/* 3694 */         d11 = localrf1.a(16.0D);
/* 3695 */         d19 = d17;
/* 3696 */         d13 = d11;
/* 3697 */         d21 = d15;
/*      */       } else {
/* 3699 */         f10 = qh.a(f8) * 0.25F;
/* 3700 */         f11 = qh.b(f8) * 0.25F;
/* 3701 */         f12 = 8.0F;
/* 3702 */         d8 = localrf1.a(8.0F + (-f11 - f10) * 16.0F);
/* 3703 */         d15 = localrf1.b(8.0F + (-f11 + f10) * 16.0F);
/* 3704 */         d9 = localrf1.a(8.0F + (-f11 + f10) * 16.0F);
/* 3705 */         d17 = localrf1.b(8.0F + (f11 + f10) * 16.0F);
/* 3706 */         d11 = localrf1.a(8.0F + (f11 + f10) * 16.0F);
/* 3707 */         d19 = localrf1.b(8.0F + (f11 - f10) * 16.0F);
/* 3708 */         d13 = localrf1.a(8.0F + (f11 - f10) * 16.0F);
/* 3709 */         d21 = localrf1.b(8.0F + (-f11 - f10) * 16.0F);
/*      */       }
/*      */       
/* 3712 */       localbmh.b(paramaji.c(this.a, paramInt1, paramInt2, paramInt3));
/* 3713 */       localbmh.b(f5 * f1, f5 * f2, f5 * f3);
/* 3714 */       localbmh.a(paramInt1 + 0, paramInt2 + d3, paramInt3 + 0, d8, d15);
/* 3715 */       localbmh.a(paramInt1 + 0, paramInt2 + d4, paramInt3 + 1, d9, d17);
/* 3716 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + 1, d11, d19);
/* 3717 */       localbmh.a(paramInt1 + 1, paramInt2 + d6, paramInt3 + 0, d13, d21);
/*      */       
/*      */ 
/*      */ 
/* 3721 */       localbmh.a(paramInt1 + 0, paramInt2 + d3, paramInt3 + 0, d8, d15);
/* 3722 */       localbmh.a(paramInt1 + 1, paramInt2 + d6, paramInt3 + 0, d13, d21);
/* 3723 */       localbmh.a(paramInt1 + 1, paramInt2 + d5, paramInt3 + 1, d11, d19);
/* 3724 */       localbmh.a(paramInt1 + 0, paramInt2 + d4, paramInt3 + 1, d9, d17);
/*      */     }
/*      */     
/* 3727 */     if ((this.g) || (bool2)) {
/* 3728 */       localbmh.b(paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3));
/* 3729 */       localbmh.b(f4, f4, f4);
/* 3730 */       a(paramaji, paramInt1, paramInt2 + d7, paramInt3, a(paramaji, 0));
/* 3731 */       bool3 = true;
/*      */     }
/*      */     
/* 3734 */     for (int i3 = 0; i3 < 4; i3++) {
/* 3735 */       int i4 = paramInt1;
/* 3736 */       int i5 = paramInt2;
/* 3737 */       int i6 = paramInt3;
/*      */       
/* 3739 */       if (i3 == 0) i6--;
/* 3740 */       if (i3 == 1) i6++;
/* 3741 */       if (i3 == 2) i4--;
/* 3742 */       if (i3 == 3) { i4++;
/*      */       }
/* 3744 */       rf localrf2 = a(paramaji, i3 + 2, i2);
/*      */       
/* 3746 */       if ((this.g) || (arrayOfBoolean[i3] != 0)) { double d10;
/*      */         double d12;
/*      */         double d14;
/*      */         double d18;
/* 3750 */         double d16; double d20; if (i3 == 0) {
/* 3751 */           d10 = d3;
/* 3752 */           d12 = d6;
/* 3753 */           d14 = paramInt1;
/* 3754 */           d18 = paramInt1 + 1;
/* 3755 */           d16 = paramInt3 + d7;
/* 3756 */           d20 = paramInt3 + d7;
/* 3757 */         } else if (i3 == 1) {
/* 3758 */           d10 = d5;
/* 3759 */           d12 = d4;
/* 3760 */           d14 = paramInt1 + 1;
/* 3761 */           d18 = paramInt1;
/* 3762 */           d16 = paramInt3 + 1 - d7;
/* 3763 */           d20 = paramInt3 + 1 - d7;
/* 3764 */         } else if (i3 == 2) {
/* 3765 */           d10 = d4;
/* 3766 */           d12 = d3;
/* 3767 */           d14 = paramInt1 + d7;
/* 3768 */           d18 = paramInt1 + d7;
/* 3769 */           d16 = paramInt3 + 1;
/* 3770 */           d20 = paramInt3;
/*      */         } else {
/* 3772 */           d10 = d6;
/* 3773 */           d12 = d5;
/* 3774 */           d14 = paramInt1 + 1 - d7;
/* 3775 */           d18 = paramInt1 + 1 - d7;
/* 3776 */           d16 = paramInt3;
/* 3777 */           d20 = paramInt3 + 1;
/*      */         }
/*      */         
/* 3780 */         bool3 = true;
/* 3781 */         float f9 = localrf2.a(0.0D);
/* 3782 */         f10 = localrf2.a(8.0D);
/*      */         
/* 3784 */         f11 = localrf2.b((1.0D - d10) * 16.0D * 0.5D);
/* 3785 */         f12 = localrf2.b((1.0D - d12) * 16.0D * 0.5D);
/* 3786 */         float f13 = localrf2.b(8.0D);
/*      */         
/* 3788 */         localbmh.b(paramaji.c(this.a, i4, i5, i6));
/*      */         
/* 3790 */         float f14 = 1.0F;
/* 3791 */         f14 *= (i3 < 2 ? f6 : f7);
/*      */         
/* 3793 */         localbmh.b(f5 * f14 * f1, f5 * f14 * f2, f5 * f14 * f3);
/* 3794 */         localbmh.a(d14, paramInt2 + d10, d16, f9, f11);
/* 3795 */         localbmh.a(d18, paramInt2 + d12, d20, f10, f12);
/* 3796 */         localbmh.a(d18, paramInt2 + 0, d20, f10, f13);
/* 3797 */         localbmh.a(d14, paramInt2 + 0, d16, f9, f13);
/*      */         
/* 3799 */         localbmh.a(d14, paramInt2 + 0, d16, f9, f13);
/* 3800 */         localbmh.a(d18, paramInt2 + 0, d20, f10, f13);
/* 3801 */         localbmh.a(d18, paramInt2 + d12, d20, f10, f12);
/* 3802 */         localbmh.a(d14, paramInt2 + d10, d16, f9, f11);
/*      */       }
/*      */     }
/*      */     
/* 3806 */     this.k = d1;
/* 3807 */     this.l = d2;
/*      */     
/* 3809 */     return bool3;
/*      */   }
/*      */   
/*      */   private float a(int paramInt1, int paramInt2, int paramInt3, awt paramawt) {
/* 3813 */     int i1 = 0;
/* 3814 */     float f1 = 0.0F;
/* 3815 */     for (int i2 = 0; i2 < 4; i2++) {
/* 3816 */       int i3 = paramInt1 - (i2 & 0x1);
/* 3817 */       int i4 = paramInt2;
/* 3818 */       int i5 = paramInt3 - (i2 >> 1 & 0x1);
/* 3819 */       if (this.a.a(i3, i4 + 1, i5).o() == paramawt) {
/* 3820 */         return 1.0F;
/*      */       }
/* 3822 */       awt localawt = this.a.a(i3, i4, i5).o();
/* 3823 */       if (localawt == paramawt) {
/* 3824 */         int i6 = this.a.e(i3, i4, i5);
/* 3825 */         if ((i6 >= 8) || (i6 == 0)) {
/* 3826 */           f1 += alw.b(i6) * 10.0F;
/* 3827 */           i1 += 10;
/*      */         }
/* 3829 */         f1 += alw.b(i6);
/* 3830 */         i1++;
/* 3831 */       } else if (!localawt.a()) {
/* 3832 */         f1 += 1.0F;
/* 3833 */         i1++;
/*      */       }
/*      */     }
/* 3836 */     return 1.0F - f1 / i1;
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 3840 */     float f1 = 0.5F;
/* 3841 */     float f2 = 1.0F;
/* 3842 */     float f3 = 0.8F;
/* 3843 */     float f4 = 0.6F;
/*      */     
/* 3845 */     bmh localbmh = bmh.a;
/* 3846 */     localbmh.b();
/*      */     
/* 3848 */     localbmh.b(paramaji.c(paramahb, paramInt1, paramInt2, paramInt3));
/*      */     
/* 3850 */     localbmh.b(f1, f1, f1);
/* 3851 */     a(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 0, paramInt4));
/*      */     
/* 3853 */     localbmh.b(f2, f2, f2);
/* 3854 */     b(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 1, paramInt4));
/*      */     
/* 3856 */     localbmh.b(f3, f3, f3);
/* 3857 */     c(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 2, paramInt4));
/*      */     
/* 3859 */     localbmh.b(f3, f3, f3);
/* 3860 */     d(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 3, paramInt4));
/*      */     
/* 3862 */     localbmh.b(f4, f4, f4);
/* 3863 */     e(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 4, paramInt4));
/*      */     
/* 3865 */     localbmh.b(f4, f4, f4);
/* 3866 */     f(paramaji, -0.5D, -0.5D, -0.5D, a(paramaji, 5, paramInt4));
/* 3867 */     localbmh.a();
/*      */   }
/*      */   
/*      */   public boolean q(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3871 */     int i1 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 3872 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 3873 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 3874 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 3876 */     if (blt.a) {
/* 3877 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 3878 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 3879 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 3881 */       f1 = f4;
/* 3882 */       f2 = f5;
/* 3883 */       f3 = f6;
/*      */     }
/*      */     
/* 3886 */     if ((bao.y()) && (paramaji.m() == 0)) {
/* 3887 */       if (this.p) {
/* 3888 */         return b(paramaji, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */       }
/* 3890 */       return a(paramaji, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */     }
/*      */     
/* 3893 */     return d(paramaji, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public boolean r(aji paramaji, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 3898 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 3899 */     int i2 = i1 & 0xC;
/*      */     
/* 3901 */     if (i2 == 4) {
/* 3902 */       this.r = 1;
/* 3903 */       this.s = 1;
/* 3904 */       this.v = 1;
/* 3905 */       this.w = 1;
/* 3906 */     } else if (i2 == 8) {
/* 3907 */       this.t = 1;
/* 3908 */       this.u = 1;
/*      */     }
/*      */     
/* 3911 */     boolean bool = q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */     
/* 3913 */     this.t = 0;
/* 3914 */     this.r = 0;
/* 3915 */     this.s = 0;
/* 3916 */     this.u = 0;
/* 3917 */     this.v = 0;
/* 3918 */     this.w = 0;
/*      */     
/* 3920 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean s(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 3924 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*      */     
/* 3926 */     if (i1 == 3) {
/* 3927 */       this.r = 1;
/* 3928 */       this.s = 1;
/* 3929 */       this.v = 1;
/* 3930 */       this.w = 1;
/* 3931 */     } else if (i1 == 4) {
/* 3932 */       this.t = 1;
/* 3933 */       this.u = 1;
/*      */     }
/*      */     
/* 3936 */     boolean bool = q(paramaji, paramInt1, paramInt2, paramInt3);
/*      */     
/* 3938 */     this.t = 0;
/* 3939 */     this.r = 0;
/* 3940 */     this.s = 0;
/* 3941 */     this.u = 0;
/* 3942 */     this.v = 0;
/* 3943 */     this.w = 0;
/*      */     
/* 3945 */     return bool;
/*      */   }
/*      */   
/*      */ 
/*      */   private float A;
/*      */   
/*      */   private float B;
/*      */   
/*      */   private float C;
/*      */   private float D;
/*      */   private float E;
/*      */   private float F;
/*      */   private float G;
/*      */   private float H;
/*      */   private float I;
/*      */   
/*      */   public boolean a(aji paramaji, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3)
/*      */   {
/* 3963 */     this.x = true;
/* 3964 */     boolean bool1 = false;
/* 3965 */     float f1 = 0.0F;
/* 3966 */     float f2 = 0.0F;
/* 3967 */     float f3 = 0.0F;
/* 3968 */     float f4 = 0.0F;
/*      */     
/* 3970 */     int i1 = 1;
/*      */     
/* 3972 */     int i2 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 3974 */     bmh localbmh = bmh.a;
/* 3975 */     localbmh.b(983055);
/*      */     
/* 3977 */     if (b(paramaji).g().equals("grass_top")) { i1 = 0;
/* 3978 */     } else if (b()) i1 = 0;
/*      */     boolean bool2;
/* 3980 */     boolean bool3; boolean bool4; boolean bool5; int i3; float f5; if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0))) {
/* 3981 */       if (this.k <= 0.0D) { paramInt2--;
/*      */       }
/* 3983 */       this.T = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 3984 */       this.V = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 3985 */       this.W = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 3986 */       this.Y = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/*      */       
/* 3988 */       this.z = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 3989 */       this.B = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 3990 */       this.C = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 3991 */       this.E = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/* 3993 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).l();
/* 3994 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).l();
/* 3995 */       bool4 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).l();
/* 3996 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).l();
/*      */       
/* 3998 */       if ((bool5) || (bool3)) {
/* 3999 */         this.y = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).I();
/* 4000 */         this.S = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4002 */         this.y = this.z;
/* 4003 */         this.S = this.T;
/*      */       }
/* 4005 */       if ((bool4) || (bool3)) {
/* 4006 */         this.A = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).I();
/* 4007 */         this.U = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4009 */         this.A = this.z;
/* 4010 */         this.U = this.T;
/*      */       }
/* 4012 */       if ((bool5) || (bool2)) {
/* 4013 */         this.D = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).I();
/* 4014 */         this.X = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4016 */         this.D = this.E;
/* 4017 */         this.X = this.Y;
/*      */       }
/* 4019 */       if ((bool4) || (bool2)) {
/* 4020 */         this.F = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).I();
/* 4021 */         this.Z = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4023 */         this.F = this.E;
/* 4024 */         this.Z = this.Y;
/*      */       }
/* 4026 */       if (this.k <= 0.0D) { paramInt2++;
/*      */       }
/* 4028 */       i3 = i2;
/* 4029 */       if ((this.k <= 0.0D) || (!this.a.a(paramInt1, paramInt2 - 1, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4030 */       f5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/*      */       
/* 4032 */       f1 = (this.A + this.z + this.C + f5) / 4.0F;
/* 4033 */       f4 = (this.C + f5 + this.F + this.E) / 4.0F;
/* 4034 */       f3 = (f5 + this.B + this.E + this.D) / 4.0F;
/* 4035 */       f2 = (this.z + this.y + f5 + this.B) / 4.0F;
/*      */       
/* 4037 */       this.am = a(this.U, this.T, this.W, i3);
/* 4038 */       this.ap = a(this.W, this.Z, this.Y, i3);
/* 4039 */       this.ao = a(this.V, this.Y, this.X, i3);
/* 4040 */       this.an = a(this.T, this.S, this.V, i3);
/*      */       
/* 4042 */       if (i1 != 0) {
/* 4043 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.5F);
/* 4044 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.5F);
/* 4045 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.5F);
/*      */       } else {
/* 4047 */         this.aq = (this.ar = this.as = this.at = 0.5F);
/* 4048 */         this.au = (this.av = this.aw = this.ax = 0.5F);
/* 4049 */         this.ay = (this.az = this.aA = this.aB = 0.5F);
/*      */       }
/* 4051 */       this.aq *= f1;
/* 4052 */       this.au *= f1;
/* 4053 */       this.ay *= f1;
/* 4054 */       this.ar *= f2;
/* 4055 */       this.av *= f2;
/* 4056 */       this.az *= f2;
/* 4057 */       this.as *= f3;
/* 4058 */       this.aw *= f3;
/* 4059 */       this.aA *= f3;
/* 4060 */       this.at *= f4;
/* 4061 */       this.ax *= f4;
/* 4062 */       this.aB *= f4;
/*      */       
/* 4064 */       a(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0));
/* 4065 */       bool1 = true;
/*      */     }
/* 4067 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1))) {
/* 4068 */       if (this.l >= 1.0D) { paramInt2++;
/*      */       }
/* 4070 */       this.ab = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4071 */       this.af = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 4072 */       this.ad = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4073 */       this.ag = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/*      */       
/* 4075 */       this.H = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4076 */       this.L = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/* 4077 */       this.J = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4078 */       this.M = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/*      */       
/* 4080 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).l();
/* 4081 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).l();
/* 4082 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).l();
/* 4083 */       bool5 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).l();
/*      */       
/*      */ 
/* 4086 */       if ((bool5) || (bool3)) {
/* 4087 */         this.G = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).I();
/* 4088 */         this.aa = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4090 */         this.G = this.H;
/* 4091 */         this.aa = this.ab;
/*      */       }
/* 4093 */       if ((bool5) || (bool2)) {
/* 4094 */         this.K = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).I();
/* 4095 */         this.ae = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4097 */         this.K = this.L;
/* 4098 */         this.ae = this.af;
/*      */       }
/* 4100 */       if ((bool4) || (bool3)) {
/* 4101 */         this.I = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).I();
/* 4102 */         this.ac = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4104 */         this.I = this.H;
/* 4105 */         this.ac = this.ab;
/*      */       }
/* 4107 */       if ((bool4) || (bool2)) {
/* 4108 */         this.N = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).I();
/* 4109 */         this.ah = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4111 */         this.N = this.L;
/* 4112 */         this.ah = this.af;
/*      */       }
/* 4114 */       if (this.l >= 1.0D) { paramInt2--;
/*      */       }
/* 4116 */       i3 = i2;
/* 4117 */       if ((this.l >= 1.0D) || (!this.a.a(paramInt1, paramInt2 + 1, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 4118 */       f5 = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4120 */       f4 = (this.I + this.H + this.M + f5) / 4.0F;
/* 4121 */       f1 = (this.M + f5 + this.N + this.L) / 4.0F;
/* 4122 */       f2 = (f5 + this.J + this.L + this.K) / 4.0F;
/* 4123 */       f3 = (this.H + this.G + f5 + this.J) / 4.0F;
/*      */       
/*      */ 
/* 4126 */       this.ap = a(this.ac, this.ab, this.ag, i3);
/* 4127 */       this.am = a(this.ag, this.ah, this.af, i3);
/* 4128 */       this.an = a(this.ad, this.af, this.ae, i3);
/* 4129 */       this.ao = a(this.ab, this.aa, this.ad, i3);
/*      */       
/* 4131 */       this.aq = (this.ar = this.as = this.at = paramFloat1);
/* 4132 */       this.au = (this.av = this.aw = this.ax = paramFloat2);
/* 4133 */       this.ay = (this.az = this.aA = this.aB = paramFloat3);
/* 4134 */       this.aq *= f1;
/* 4135 */       this.au *= f1;
/* 4136 */       this.ay *= f1;
/* 4137 */       this.ar *= f2;
/* 4138 */       this.av *= f2;
/* 4139 */       this.az *= f2;
/* 4140 */       this.as *= f3;
/* 4141 */       this.aw *= f3;
/* 4142 */       this.aA *= f3;
/* 4143 */       this.at *= f4;
/* 4144 */       this.ax *= f4;
/* 4145 */       this.aB *= f4;
/* 4146 */       b(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1));
/* 4147 */       bool1 = true;
/*      */     }
/*      */     rf localrf;
/* 4150 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 - 1, 2))) {
/* 4151 */       if (this.m <= 0.0D) paramInt3--;
/* 4152 */       this.O = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4153 */       this.B = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4154 */       this.J = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/* 4155 */       this.P = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/* 4157 */       this.ai = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4158 */       this.V = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4159 */       this.ad = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 4160 */       this.aj = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/*      */       
/* 4162 */       bool2 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).l();
/* 4163 */       bool3 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).l();
/* 4164 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).l();
/* 4165 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).l();
/*      */       
/* 4167 */       if ((bool3) || (bool5)) {
/* 4168 */         this.y = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).I();
/* 4169 */         this.S = paramaji.c(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4171 */         this.y = this.O;
/* 4172 */         this.S = this.ai;
/*      */       }
/* 4174 */       if ((bool3) || (bool4)) {
/* 4175 */         this.G = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).I();
/* 4176 */         this.aa = paramaji.c(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4178 */         this.G = this.O;
/* 4179 */         this.aa = this.ai;
/*      */       }
/* 4181 */       if ((bool2) || (bool5)) {
/* 4182 */         this.D = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).I();
/* 4183 */         this.X = paramaji.c(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4185 */         this.D = this.P;
/* 4186 */         this.X = this.aj;
/*      */       }
/* 4188 */       if ((bool2) || (bool4)) {
/* 4189 */         this.K = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).I();
/* 4190 */         this.ae = paramaji.c(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4192 */         this.K = this.P;
/* 4193 */         this.ae = this.aj;
/*      */       }
/* 4195 */       if (this.m <= 0.0D) paramInt3++;
/* 4196 */       i3 = i2;
/* 4197 */       if ((this.m <= 0.0D) || (!this.a.a(paramInt1, paramInt2, paramInt3 - 1).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4198 */       f5 = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/*      */       
/*      */ 
/* 4201 */       f1 = (this.O + this.G + f5 + this.J) / 4.0F;
/* 4202 */       f2 = (f5 + this.J + this.P + this.K) / 4.0F;
/* 4203 */       f3 = (this.B + f5 + this.D + this.P) / 4.0F;
/* 4204 */       f4 = (this.y + this.O + this.B + f5) / 4.0F;
/*      */       
/* 4206 */       this.am = a(this.ai, this.aa, this.ad, i3);
/* 4207 */       this.an = a(this.ad, this.aj, this.ae, i3);
/* 4208 */       this.ao = a(this.V, this.X, this.aj, i3);
/* 4209 */       this.ap = a(this.S, this.ai, this.V, i3);
/*      */       
/*      */ 
/* 4212 */       if (i1 != 0) {
/* 4213 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.8F);
/* 4214 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.8F);
/* 4215 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.8F);
/*      */       } else {
/* 4217 */         this.aq = (this.ar = this.as = this.at = 0.8F);
/* 4218 */         this.au = (this.av = this.aw = this.ax = 0.8F);
/* 4219 */         this.ay = (this.az = this.aA = this.aB = 0.8F);
/*      */       }
/* 4221 */       this.aq *= f1;
/* 4222 */       this.au *= f1;
/* 4223 */       this.ay *= f1;
/* 4224 */       this.ar *= f2;
/* 4225 */       this.av *= f2;
/* 4226 */       this.az *= f2;
/* 4227 */       this.as *= f3;
/* 4228 */       this.aw *= f3;
/* 4229 */       this.aA *= f3;
/* 4230 */       this.at *= f4;
/* 4231 */       this.ax *= f4;
/* 4232 */       this.aB *= f4;
/*      */       
/* 4234 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2);
/* 4235 */       c(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/*      */       
/* 4237 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 4238 */         this.aq *= paramFloat1;
/* 4239 */         this.ar *= paramFloat1;
/* 4240 */         this.as *= paramFloat1;
/* 4241 */         this.at *= paramFloat1;
/* 4242 */         this.au *= paramFloat2;
/* 4243 */         this.av *= paramFloat2;
/* 4244 */         this.aw *= paramFloat2;
/* 4245 */         this.ax *= paramFloat2;
/* 4246 */         this.ay *= paramFloat3;
/* 4247 */         this.az *= paramFloat3;
/* 4248 */         this.aA *= paramFloat3;
/* 4249 */         this.aB *= paramFloat3;
/* 4250 */         c(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/*      */       
/* 4253 */       bool1 = true;
/*      */     }
/* 4255 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 + 1, 3))) {
/* 4256 */       if (this.n >= 1.0D) { paramInt3++;
/*      */       }
/* 4258 */       this.Q = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4259 */       this.R = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/* 4260 */       this.C = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4261 */       this.M = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4263 */       this.ak = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4264 */       this.al = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 4265 */       this.W = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4266 */       this.ag = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 4268 */       bool2 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).l();
/* 4269 */       bool3 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).l();
/* 4270 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).l();
/* 4271 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).l();
/*      */       
/* 4273 */       if ((bool3) || (bool5)) {
/* 4274 */         this.A = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).I();
/* 4275 */         this.U = paramaji.c(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4277 */         this.A = this.Q;
/* 4278 */         this.U = this.ak;
/*      */       }
/* 4280 */       if ((bool3) || (bool4)) {
/* 4281 */         this.I = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).I();
/* 4282 */         this.ac = paramaji.c(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4284 */         this.I = this.Q;
/* 4285 */         this.ac = this.ak;
/*      */       }
/* 4287 */       if ((bool2) || (bool5)) {
/* 4288 */         this.F = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).I();
/* 4289 */         this.Z = paramaji.c(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4291 */         this.F = this.R;
/* 4292 */         this.Z = this.al;
/*      */       }
/* 4294 */       if ((bool2) || (bool4)) {
/* 4295 */         this.N = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).I();
/* 4296 */         this.ah = paramaji.c(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4298 */         this.N = this.R;
/* 4299 */         this.ah = this.al;
/*      */       }
/* 4301 */       if (this.n >= 1.0D) paramInt3--;
/* 4302 */       i3 = i2;
/* 4303 */       if ((this.n >= 1.0D) || (!this.a.a(paramInt1, paramInt2, paramInt3 + 1).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4304 */       f5 = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/*      */       
/*      */ 
/* 4307 */       f1 = (this.Q + this.I + f5 + this.M) / 4.0F;
/* 4308 */       f4 = (f5 + this.M + this.R + this.N) / 4.0F;
/* 4309 */       f3 = (this.C + f5 + this.F + this.R) / 4.0F;
/* 4310 */       f2 = (this.A + this.Q + this.C + f5) / 4.0F;
/*      */       
/* 4312 */       this.am = a(this.ak, this.ac, this.ag, i3);
/* 4313 */       this.ap = a(this.ag, this.al, this.ah, i3);
/* 4314 */       this.ao = a(this.W, this.Z, this.al, i3);
/* 4315 */       this.an = a(this.U, this.ak, this.W, i3);
/*      */       
/* 4317 */       if (i1 != 0) {
/* 4318 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.8F);
/* 4319 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.8F);
/* 4320 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.8F);
/*      */       } else {
/* 4322 */         this.aq = (this.ar = this.as = this.at = 0.8F);
/* 4323 */         this.au = (this.av = this.aw = this.ax = 0.8F);
/* 4324 */         this.ay = (this.az = this.aA = this.aB = 0.8F);
/*      */       }
/* 4326 */       this.aq *= f1;
/* 4327 */       this.au *= f1;
/* 4328 */       this.ay *= f1;
/* 4329 */       this.ar *= f2;
/* 4330 */       this.av *= f2;
/* 4331 */       this.az *= f2;
/* 4332 */       this.as *= f3;
/* 4333 */       this.aw *= f3;
/* 4334 */       this.aA *= f3;
/* 4335 */       this.at *= f4;
/* 4336 */       this.ax *= f4;
/* 4337 */       this.aB *= f4;
/* 4338 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3);
/* 4339 */       d(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3));
/* 4340 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 4341 */         this.aq *= paramFloat1;
/* 4342 */         this.ar *= paramFloat1;
/* 4343 */         this.as *= paramFloat1;
/* 4344 */         this.at *= paramFloat1;
/* 4345 */         this.au *= paramFloat2;
/* 4346 */         this.av *= paramFloat2;
/* 4347 */         this.aw *= paramFloat2;
/* 4348 */         this.ax *= paramFloat2;
/* 4349 */         this.ay *= paramFloat3;
/* 4350 */         this.az *= paramFloat3;
/* 4351 */         this.aA *= paramFloat3;
/* 4352 */         this.aB *= paramFloat3;
/* 4353 */         d(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 4355 */       bool1 = true;
/*      */     }
/* 4357 */     if ((this.g) || (paramaji.a(this.a, paramInt1 - 1, paramInt2, paramInt3, 4))) {
/* 4358 */       if (this.i <= 0.0D) paramInt1--;
/* 4359 */       this.z = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4360 */       this.O = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4361 */       this.Q = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 4362 */       this.H = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4364 */       this.T = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4365 */       this.ai = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4366 */       this.ak = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4367 */       this.ab = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 4369 */       bool2 = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).l();
/* 4370 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).l();
/* 4371 */       bool4 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).l();
/* 4372 */       bool5 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).l();
/*      */       
/* 4374 */       if ((bool4) || (bool3)) {
/* 4375 */         this.y = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).I();
/* 4376 */         this.S = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*      */       } else {
/* 4378 */         this.y = this.O;
/* 4379 */         this.S = this.ai;
/*      */       }
/* 4381 */       if ((bool5) || (bool3)) {
/* 4382 */         this.A = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).I();
/* 4383 */         this.U = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*      */       } else {
/* 4385 */         this.A = this.Q;
/* 4386 */         this.U = this.ak;
/*      */       }
/* 4388 */       if ((bool4) || (bool2)) {
/* 4389 */         this.G = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).I();
/* 4390 */         this.aa = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*      */       } else {
/* 4392 */         this.G = this.O;
/* 4393 */         this.aa = this.ai;
/*      */       }
/* 4395 */       if ((bool5) || (bool2)) {
/* 4396 */         this.I = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).I();
/* 4397 */         this.ac = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*      */       } else {
/* 4399 */         this.I = this.Q;
/* 4400 */         this.ac = this.ak;
/*      */       }
/* 4402 */       if (this.i <= 0.0D) paramInt1++;
/* 4403 */       i3 = i2;
/* 4404 */       if ((this.i <= 0.0D) || (!this.a.a(paramInt1 - 1, paramInt2, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4405 */       f5 = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/*      */       
/*      */ 
/* 4408 */       f4 = (this.z + this.A + f5 + this.Q) / 4.0F;
/* 4409 */       f1 = (f5 + this.Q + this.H + this.I) / 4.0F;
/* 4410 */       f2 = (this.O + f5 + this.G + this.H) / 4.0F;
/* 4411 */       f3 = (this.y + this.z + this.O + f5) / 4.0F;
/*      */       
/* 4413 */       this.ap = a(this.T, this.U, this.ak, i3);
/* 4414 */       this.am = a(this.ak, this.ab, this.ac, i3);
/* 4415 */       this.an = a(this.ai, this.aa, this.ab, i3);
/* 4416 */       this.ao = a(this.S, this.T, this.ai, i3);
/*      */       
/*      */ 
/* 4419 */       if (i1 != 0) {
/* 4420 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.6F);
/* 4421 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.6F);
/* 4422 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.6F);
/*      */       } else {
/* 4424 */         this.aq = (this.ar = this.as = this.at = 0.6F);
/* 4425 */         this.au = (this.av = this.aw = this.ax = 0.6F);
/* 4426 */         this.ay = (this.az = this.aA = this.aB = 0.6F);
/*      */       }
/* 4428 */       this.aq *= f1;
/* 4429 */       this.au *= f1;
/* 4430 */       this.ay *= f1;
/* 4431 */       this.ar *= f2;
/* 4432 */       this.av *= f2;
/* 4433 */       this.az *= f2;
/* 4434 */       this.as *= f3;
/* 4435 */       this.aw *= f3;
/* 4436 */       this.aA *= f3;
/* 4437 */       this.at *= f4;
/* 4438 */       this.ax *= f4;
/* 4439 */       this.aB *= f4;
/* 4440 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4);
/* 4441 */       e(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 4442 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 4443 */         this.aq *= paramFloat1;
/* 4444 */         this.ar *= paramFloat1;
/* 4445 */         this.as *= paramFloat1;
/* 4446 */         this.at *= paramFloat1;
/* 4447 */         this.au *= paramFloat2;
/* 4448 */         this.av *= paramFloat2;
/* 4449 */         this.aw *= paramFloat2;
/* 4450 */         this.ax *= paramFloat2;
/* 4451 */         this.ay *= paramFloat3;
/* 4452 */         this.az *= paramFloat3;
/* 4453 */         this.aA *= paramFloat3;
/* 4454 */         this.aB *= paramFloat3;
/* 4455 */         e(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 4457 */       bool1 = true;
/*      */     }
/* 4459 */     if ((this.g) || (paramaji.a(this.a, paramInt1 + 1, paramInt2, paramInt3, 5))) {
/* 4460 */       if (this.j >= 1.0D) paramInt1++;
/* 4461 */       this.E = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4462 */       this.P = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4463 */       this.R = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 4464 */       this.L = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4466 */       this.Y = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4467 */       this.aj = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4468 */       this.al = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4469 */       this.af = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 4471 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).l();
/* 4472 */       bool3 = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).l();
/* 4473 */       bool4 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).l();
/* 4474 */       bool5 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).l();
/*      */       
/*      */ 
/* 4477 */       if ((bool3) || (bool5)) {
/* 4478 */         this.D = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).I();
/* 4479 */         this.X = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*      */       } else {
/* 4481 */         this.D = this.P;
/* 4482 */         this.X = this.aj;
/*      */       }
/* 4484 */       if ((bool3) || (bool4)) {
/* 4485 */         this.F = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).I();
/* 4486 */         this.Z = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*      */       } else {
/* 4488 */         this.F = this.R;
/* 4489 */         this.Z = this.al;
/*      */       }
/* 4491 */       if ((bool2) || (bool5)) {
/* 4492 */         this.K = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).I();
/* 4493 */         this.ae = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*      */       } else {
/* 4495 */         this.K = this.P;
/* 4496 */         this.ae = this.aj;
/*      */       }
/* 4498 */       if ((bool2) || (bool4)) {
/* 4499 */         this.N = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).I();
/* 4500 */         this.ah = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*      */       } else {
/* 4502 */         this.N = this.R;
/* 4503 */         this.ah = this.al;
/*      */       }
/* 4505 */       if (this.j >= 1.0D) paramInt1--;
/* 4506 */       i3 = i2;
/* 4507 */       if ((this.j >= 1.0D) || (!this.a.a(paramInt1 + 1, paramInt2, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 4508 */       f5 = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/*      */ 
/* 4511 */       f1 = (this.E + this.F + f5 + this.R) / 4.0F;
/* 4512 */       f2 = (this.D + this.E + this.P + f5) / 4.0F;
/* 4513 */       f3 = (this.P + f5 + this.K + this.L) / 4.0F;
/* 4514 */       f4 = (f5 + this.R + this.L + this.N) / 4.0F;
/*      */       
/* 4516 */       this.am = a(this.Y, this.Z, this.al, i3);
/* 4517 */       this.ap = a(this.al, this.af, this.ah, i3);
/* 4518 */       this.ao = a(this.aj, this.ae, this.af, i3);
/* 4519 */       this.an = a(this.X, this.Y, this.aj, i3);
/*      */       
/* 4521 */       if (i1 != 0) {
/* 4522 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.6F);
/* 4523 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.6F);
/* 4524 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.6F);
/*      */       } else {
/* 4526 */         this.aq = (this.ar = this.as = this.at = 0.6F);
/* 4527 */         this.au = (this.av = this.aw = this.ax = 0.6F);
/* 4528 */         this.ay = (this.az = this.aA = this.aB = 0.6F);
/*      */       }
/* 4530 */       this.aq *= f1;
/* 4531 */       this.au *= f1;
/* 4532 */       this.ay *= f1;
/* 4533 */       this.ar *= f2;
/* 4534 */       this.av *= f2;
/* 4535 */       this.az *= f2;
/* 4536 */       this.as *= f3;
/* 4537 */       this.aw *= f3;
/* 4538 */       this.aA *= f3;
/* 4539 */       this.at *= f4;
/* 4540 */       this.ax *= f4;
/* 4541 */       this.aB *= f4;
/*      */       
/* 4543 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5);
/* 4544 */       f(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 4545 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 4546 */         this.aq *= paramFloat1;
/* 4547 */         this.ar *= paramFloat1;
/* 4548 */         this.as *= paramFloat1;
/* 4549 */         this.at *= paramFloat1;
/* 4550 */         this.au *= paramFloat2;
/* 4551 */         this.av *= paramFloat2;
/* 4552 */         this.aw *= paramFloat2;
/* 4553 */         this.ax *= paramFloat2;
/* 4554 */         this.ay *= paramFloat3;
/* 4555 */         this.az *= paramFloat3;
/* 4556 */         this.aA *= paramFloat3;
/* 4557 */         this.aB *= paramFloat3;
/* 4558 */         f(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 4560 */       bool1 = true;
/*      */     }
/* 4562 */     this.x = false;
/* 4563 */     return bool1;
/*      */   }
/*      */   
/*      */   public boolean b(aji paramaji, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 4567 */     this.x = true;
/* 4568 */     boolean bool1 = false;
/* 4569 */     float f1 = 0.0F;
/* 4570 */     float f2 = 0.0F;
/* 4571 */     float f3 = 0.0F;
/* 4572 */     float f4 = 0.0F;
/*      */     
/* 4574 */     int i1 = 1;
/*      */     
/* 4576 */     int i2 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 4578 */     bmh localbmh = bmh.a;
/* 4579 */     localbmh.b(983055);
/*      */     
/* 4581 */     if (b(paramaji).g().equals("grass_top")) { i1 = 0;
/* 4582 */     } else if (b()) i1 = 0;
/*      */     boolean bool2;
/* 4584 */     boolean bool3; boolean bool4; boolean bool5; int i3; float f5; if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0))) {
/* 4585 */       if (this.k <= 0.0D) { paramInt2--;
/*      */       }
/* 4587 */       this.T = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4588 */       this.V = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4589 */       this.W = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4590 */       this.Y = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/*      */       
/* 4592 */       this.z = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4593 */       this.B = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4594 */       this.C = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 4595 */       this.E = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/* 4597 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).l();
/* 4598 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).l();
/* 4599 */       bool4 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).l();
/* 4600 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).l();
/*      */       
/* 4602 */       if ((bool5) || (bool3)) {
/* 4603 */         this.y = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).I();
/* 4604 */         this.S = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4606 */         this.y = this.z;
/* 4607 */         this.S = this.T;
/*      */       }
/* 4609 */       if ((bool4) || (bool3)) {
/* 4610 */         this.A = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).I();
/* 4611 */         this.U = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4613 */         this.A = this.z;
/* 4614 */         this.U = this.T;
/*      */       }
/* 4616 */       if ((bool5) || (bool2)) {
/* 4617 */         this.D = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).I();
/* 4618 */         this.X = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4620 */         this.D = this.E;
/* 4621 */         this.X = this.Y;
/*      */       }
/* 4623 */       if ((bool4) || (bool2)) {
/* 4624 */         this.F = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).I();
/* 4625 */         this.Z = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4627 */         this.F = this.E;
/* 4628 */         this.Z = this.Y;
/*      */       }
/* 4630 */       if (this.k <= 0.0D) { paramInt2++;
/*      */       }
/* 4632 */       i3 = i2;
/* 4633 */       if ((this.k <= 0.0D) || (!this.a.a(paramInt1, paramInt2 - 1, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4634 */       f5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/*      */       
/* 4636 */       f1 = (this.A + this.z + this.C + f5) / 4.0F;
/* 4637 */       f4 = (this.C + f5 + this.F + this.E) / 4.0F;
/* 4638 */       f3 = (f5 + this.B + this.E + this.D) / 4.0F;
/* 4639 */       f2 = (this.z + this.y + f5 + this.B) / 4.0F;
/*      */       
/* 4641 */       this.am = a(this.U, this.T, this.W, i3);
/* 4642 */       this.ap = a(this.W, this.Z, this.Y, i3);
/* 4643 */       this.ao = a(this.V, this.Y, this.X, i3);
/* 4644 */       this.an = a(this.T, this.S, this.V, i3);
/*      */       
/* 4646 */       if (i1 != 0) {
/* 4647 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.5F);
/* 4648 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.5F);
/* 4649 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.5F);
/*      */       } else {
/* 4651 */         this.aq = (this.ar = this.as = this.at = 0.5F);
/* 4652 */         this.au = (this.av = this.aw = this.ax = 0.5F);
/* 4653 */         this.ay = (this.az = this.aA = this.aB = 0.5F);
/*      */       }
/* 4655 */       this.aq *= f1;
/* 4656 */       this.au *= f1;
/* 4657 */       this.ay *= f1;
/* 4658 */       this.ar *= f2;
/* 4659 */       this.av *= f2;
/* 4660 */       this.az *= f2;
/* 4661 */       this.as *= f3;
/* 4662 */       this.aw *= f3;
/* 4663 */       this.aA *= f3;
/* 4664 */       this.at *= f4;
/* 4665 */       this.ax *= f4;
/* 4666 */       this.aB *= f4;
/*      */       
/* 4668 */       a(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0));
/* 4669 */       bool1 = true;
/*      */     }
/* 4671 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1))) {
/* 4672 */       if (this.l >= 1.0D) { paramInt2++;
/*      */       }
/* 4674 */       this.ab = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4675 */       this.af = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 4676 */       this.ad = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4677 */       this.ag = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/*      */       
/* 4679 */       this.H = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4680 */       this.L = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/* 4681 */       this.J = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4682 */       this.M = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/*      */       
/* 4684 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).l();
/* 4685 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).l();
/* 4686 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).l();
/* 4687 */       bool5 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).l();
/*      */       
/*      */ 
/* 4690 */       if ((bool5) || (bool3)) {
/* 4691 */         this.G = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).I();
/* 4692 */         this.aa = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4694 */         this.G = this.H;
/* 4695 */         this.aa = this.ab;
/*      */       }
/* 4697 */       if ((bool5) || (bool2)) {
/* 4698 */         this.K = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).I();
/* 4699 */         this.ae = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 - 1);
/*      */       } else {
/* 4701 */         this.K = this.L;
/* 4702 */         this.ae = this.af;
/*      */       }
/* 4704 */       if ((bool4) || (bool3)) {
/* 4705 */         this.I = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).I();
/* 4706 */         this.ac = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4708 */         this.I = this.H;
/* 4709 */         this.ac = this.ab;
/*      */       }
/* 4711 */       if ((bool4) || (bool2)) {
/* 4712 */         this.N = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).I();
/* 4713 */         this.ah = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3 + 1);
/*      */       } else {
/* 4715 */         this.N = this.L;
/* 4716 */         this.ah = this.af;
/*      */       }
/* 4718 */       if (this.l >= 1.0D) { paramInt2--;
/*      */       }
/* 4720 */       i3 = i2;
/* 4721 */       if ((this.l >= 1.0D) || (!this.a.a(paramInt1, paramInt2 + 1, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 4722 */       f5 = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4724 */       f4 = (this.I + this.H + this.M + f5) / 4.0F;
/* 4725 */       f1 = (this.M + f5 + this.N + this.L) / 4.0F;
/* 4726 */       f2 = (f5 + this.J + this.L + this.K) / 4.0F;
/* 4727 */       f3 = (this.H + this.G + f5 + this.J) / 4.0F;
/*      */       
/*      */ 
/* 4730 */       this.ap = a(this.ac, this.ab, this.ag, i3);
/* 4731 */       this.am = a(this.ag, this.ah, this.af, i3);
/* 4732 */       this.an = a(this.ad, this.af, this.ae, i3);
/* 4733 */       this.ao = a(this.ab, this.aa, this.ad, i3);
/*      */       
/* 4735 */       this.aq = (this.ar = this.as = this.at = paramFloat1);
/* 4736 */       this.au = (this.av = this.aw = this.ax = paramFloat2);
/* 4737 */       this.ay = (this.az = this.aA = this.aB = paramFloat3);
/* 4738 */       this.aq *= f1;
/* 4739 */       this.au *= f1;
/* 4740 */       this.ay *= f1;
/* 4741 */       this.ar *= f2;
/* 4742 */       this.av *= f2;
/* 4743 */       this.az *= f2;
/* 4744 */       this.as *= f3;
/* 4745 */       this.aw *= f3;
/* 4746 */       this.aA *= f3;
/* 4747 */       this.at *= f4;
/* 4748 */       this.ax *= f4;
/* 4749 */       this.aB *= f4;
/* 4750 */       b(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1));
/* 4751 */       bool1 = true; }
/*      */     float f10;
/*      */     float f11;
/* 4754 */     float f12; int i4; int i5; int i6; int i7; if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 - 1, 2))) {
/* 4755 */       if (this.m <= 0.0D) paramInt3--;
/* 4756 */       this.O = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4757 */       this.B = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4758 */       this.J = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/* 4759 */       this.P = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/* 4761 */       this.ai = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4762 */       this.V = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4763 */       this.ad = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/* 4764 */       this.aj = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/*      */       
/* 4766 */       bool2 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).l();
/* 4767 */       bool3 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).l();
/* 4768 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).l();
/* 4769 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).l();
/*      */       
/* 4771 */       if ((bool3) || (bool5)) {
/* 4772 */         this.y = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).I();
/* 4773 */         this.S = paramaji.c(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4775 */         this.y = this.O;
/* 4776 */         this.S = this.ai;
/*      */       }
/* 4778 */       if ((bool3) || (bool4)) {
/* 4779 */         this.G = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).I();
/* 4780 */         this.aa = paramaji.c(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4782 */         this.G = this.O;
/* 4783 */         this.aa = this.ai;
/*      */       }
/* 4785 */       if ((bool2) || (bool5)) {
/* 4786 */         this.D = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).I();
/* 4787 */         this.X = paramaji.c(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4789 */         this.D = this.P;
/* 4790 */         this.X = this.aj;
/*      */       }
/* 4792 */       if ((bool2) || (bool4)) {
/* 4793 */         this.K = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).I();
/* 4794 */         this.ae = paramaji.c(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4796 */         this.K = this.P;
/* 4797 */         this.ae = this.aj;
/*      */       }
/* 4799 */       if (this.m <= 0.0D) paramInt3++;
/* 4800 */       i3 = i2;
/* 4801 */       if ((this.m <= 0.0D) || (!this.a.a(paramInt1, paramInt2, paramInt3 - 1).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4802 */       f5 = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/*      */       
/*      */ 
/* 4805 */       float f6 = (this.O + this.G + f5 + this.J) / 4.0F;
/* 4806 */       f10 = (f5 + this.J + this.P + this.K) / 4.0F;
/* 4807 */       f11 = (this.B + f5 + this.D + this.P) / 4.0F;
/* 4808 */       f12 = (this.y + this.O + this.B + f5) / 4.0F;
/* 4809 */       f1 = (float)(f6 * this.l * (1.0D - this.i) + f10 * this.l * this.i + f11 * (1.0D - this.l) * this.i + f12 * (1.0D - this.l) * (1.0D - this.i));
/*      */       
/* 4811 */       f2 = (float)(f6 * this.l * (1.0D - this.j) + f10 * this.l * this.j + f11 * (1.0D - this.l) * this.j + f12 * (1.0D - this.l) * (1.0D - this.j));
/*      */       
/* 4813 */       f3 = (float)(f6 * this.k * (1.0D - this.j) + f10 * this.k * this.j + f11 * (1.0D - this.k) * this.j + f12 * (1.0D - this.k) * (1.0D - this.j));
/*      */       
/* 4815 */       f4 = (float)(f6 * this.k * (1.0D - this.i) + f10 * this.k * this.i + f11 * (1.0D - this.k) * this.i + f12 * (1.0D - this.k) * (1.0D - this.i));
/*      */       
/*      */ 
/* 4818 */       i4 = a(this.ai, this.aa, this.ad, i3);
/* 4819 */       i5 = a(this.ad, this.aj, this.ae, i3);
/* 4820 */       i6 = a(this.V, this.X, this.aj, i3);
/* 4821 */       i7 = a(this.S, this.ai, this.V, i3);
/* 4822 */       this.am = a(i4, i5, i6, i7, this.l * (1.0D - this.i), this.l * this.i, (1.0D - this.l) * this.i, (1.0D - this.l) * (1.0D - this.i));
/* 4823 */       this.an = a(i4, i5, i6, i7, this.l * (1.0D - this.j), this.l * this.j, (1.0D - this.l) * this.j, (1.0D - this.l) * (1.0D - this.j));
/* 4824 */       this.ao = a(i4, i5, i6, i7, this.k * (1.0D - this.j), this.k * this.j, (1.0D - this.k) * this.j, (1.0D - this.k) * (1.0D - this.j));
/* 4825 */       this.ap = a(i4, i5, i6, i7, this.k * (1.0D - this.i), this.k * this.i, (1.0D - this.k) * this.i, (1.0D - this.k) * (1.0D - this.i));
/*      */       
/*      */ 
/* 4828 */       if (i1 != 0) {
/* 4829 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.8F);
/* 4830 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.8F);
/* 4831 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.8F);
/*      */       } else {
/* 4833 */         this.aq = (this.ar = this.as = this.at = 0.8F);
/* 4834 */         this.au = (this.av = this.aw = this.ax = 0.8F);
/* 4835 */         this.ay = (this.az = this.aA = this.aB = 0.8F);
/*      */       }
/* 4837 */       this.aq *= f1;
/* 4838 */       this.au *= f1;
/* 4839 */       this.ay *= f1;
/* 4840 */       this.ar *= f2;
/* 4841 */       this.av *= f2;
/* 4842 */       this.az *= f2;
/* 4843 */       this.as *= f3;
/* 4844 */       this.aw *= f3;
/* 4845 */       this.aA *= f3;
/* 4846 */       this.at *= f4;
/* 4847 */       this.ax *= f4;
/* 4848 */       this.aB *= f4;
/*      */       
/* 4850 */       rf localrf1 = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2);
/* 4851 */       c(paramaji, paramInt1, paramInt2, paramInt3, localrf1);
/*      */       
/* 4853 */       if ((b) && (localrf1.g().equals("grass_side")) && (!b())) {
/* 4854 */         this.aq *= paramFloat1;
/* 4855 */         this.ar *= paramFloat1;
/* 4856 */         this.as *= paramFloat1;
/* 4857 */         this.at *= paramFloat1;
/* 4858 */         this.au *= paramFloat2;
/* 4859 */         this.av *= paramFloat2;
/* 4860 */         this.aw *= paramFloat2;
/* 4861 */         this.ax *= paramFloat2;
/* 4862 */         this.ay *= paramFloat3;
/* 4863 */         this.az *= paramFloat3;
/* 4864 */         this.aA *= paramFloat3;
/* 4865 */         this.aB *= paramFloat3;
/* 4866 */         c(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/*      */       
/* 4869 */       bool1 = true;
/*      */     }
/* 4871 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 + 1, 3))) {
/* 4872 */       if (this.n >= 1.0D) { paramInt3++;
/*      */       }
/* 4874 */       this.Q = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/* 4875 */       this.R = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/* 4876 */       this.C = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4877 */       this.M = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4879 */       this.ak = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 4880 */       this.al = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 4881 */       this.W = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4882 */       this.ag = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 4884 */       bool2 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).l();
/* 4885 */       bool3 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).l();
/* 4886 */       bool4 = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).l();
/* 4887 */       bool5 = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).l();
/*      */       
/* 4889 */       if ((bool3) || (bool5)) {
/* 4890 */         this.A = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).I();
/* 4891 */         this.U = paramaji.c(this.a, paramInt1 - 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4893 */         this.A = this.Q;
/* 4894 */         this.U = this.ak;
/*      */       }
/* 4896 */       if ((bool3) || (bool4)) {
/* 4897 */         this.I = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).I();
/* 4898 */         this.ac = paramaji.c(this.a, paramInt1 - 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4900 */         this.I = this.Q;
/* 4901 */         this.ac = this.ak;
/*      */       }
/* 4903 */       if ((bool2) || (bool5)) {
/* 4904 */         this.F = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).I();
/* 4905 */         this.Z = paramaji.c(this.a, paramInt1 + 1, paramInt2 - 1, paramInt3);
/*      */       } else {
/* 4907 */         this.F = this.R;
/* 4908 */         this.Z = this.al;
/*      */       }
/* 4910 */       if ((bool2) || (bool4)) {
/* 4911 */         this.N = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).I();
/* 4912 */         this.ah = paramaji.c(this.a, paramInt1 + 1, paramInt2 + 1, paramInt3);
/*      */       } else {
/* 4914 */         this.N = this.R;
/* 4915 */         this.ah = this.al;
/*      */       }
/* 4917 */       if (this.n >= 1.0D) paramInt3--;
/* 4918 */       i3 = i2;
/* 4919 */       if ((this.n >= 1.0D) || (!this.a.a(paramInt1, paramInt2, paramInt3 + 1).c())) i3 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4920 */       f5 = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/*      */       
/*      */ 
/* 4923 */       float f7 = (this.Q + this.I + f5 + this.M) / 4.0F;
/* 4924 */       f10 = (f5 + this.M + this.R + this.N) / 4.0F;
/* 4925 */       f11 = (this.C + f5 + this.F + this.R) / 4.0F;
/* 4926 */       f12 = (this.A + this.Q + this.C + f5) / 4.0F;
/* 4927 */       f1 = (float)(f7 * this.l * (1.0D - this.i) + f10 * this.l * this.i + f11 * (1.0D - this.l) * this.i + f12 * (1.0D - this.l) * (1.0D - this.i));
/*      */       
/* 4929 */       f2 = (float)(f7 * this.k * (1.0D - this.i) + f10 * this.k * this.i + f11 * (1.0D - this.k) * this.i + f12 * (1.0D - this.k) * (1.0D - this.i));
/*      */       
/* 4931 */       f3 = (float)(f7 * this.k * (1.0D - this.j) + f10 * this.k * this.j + f11 * (1.0D - this.k) * this.j + f12 * (1.0D - this.k) * (1.0D - this.j));
/*      */       
/* 4933 */       f4 = (float)(f7 * this.l * (1.0D - this.j) + f10 * this.l * this.j + f11 * (1.0D - this.l) * this.j + f12 * (1.0D - this.l) * (1.0D - this.j));
/*      */       
/*      */ 
/* 4936 */       i4 = a(this.ak, this.ac, this.ag, i3);
/* 4937 */       i5 = a(this.ag, this.al, this.ah, i3);
/* 4938 */       i6 = a(this.W, this.Z, this.al, i3);
/* 4939 */       i7 = a(this.U, this.ak, this.W, i3);
/* 4940 */       this.am = a(i4, i7, i6, i5, this.l * (1.0D - this.i), (1.0D - this.l) * (1.0D - this.i), (1.0D - this.l) * this.i, this.l * this.i);
/* 4941 */       this.an = a(i4, i7, i6, i5, this.k * (1.0D - this.i), (1.0D - this.k) * (1.0D - this.i), (1.0D - this.k) * this.i, this.k * this.i);
/* 4942 */       this.ao = a(i4, i7, i6, i5, this.k * (1.0D - this.j), (1.0D - this.k) * (1.0D - this.j), (1.0D - this.k) * this.j, this.k * this.j);
/* 4943 */       this.ap = a(i4, i7, i6, i5, this.l * (1.0D - this.j), (1.0D - this.l) * (1.0D - this.j), (1.0D - this.l) * this.j, this.l * this.j);
/*      */       
/* 4945 */       if (i1 != 0) {
/* 4946 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.8F);
/* 4947 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.8F);
/* 4948 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.8F);
/*      */       } else {
/* 4950 */         this.aq = (this.ar = this.as = this.at = 0.8F);
/* 4951 */         this.au = (this.av = this.aw = this.ax = 0.8F);
/* 4952 */         this.ay = (this.az = this.aA = this.aB = 0.8F);
/*      */       }
/* 4954 */       this.aq *= f1;
/* 4955 */       this.au *= f1;
/* 4956 */       this.ay *= f1;
/* 4957 */       this.ar *= f2;
/* 4958 */       this.av *= f2;
/* 4959 */       this.az *= f2;
/* 4960 */       this.as *= f3;
/* 4961 */       this.aw *= f3;
/* 4962 */       this.aA *= f3;
/* 4963 */       this.at *= f4;
/* 4964 */       this.ax *= f4;
/* 4965 */       this.aB *= f4;
/* 4966 */       rf localrf2 = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3);
/* 4967 */       d(paramaji, paramInt1, paramInt2, paramInt3, localrf2);
/* 4968 */       if ((b) && (localrf2.g().equals("grass_side")) && (!b())) {
/* 4969 */         this.aq *= paramFloat1;
/* 4970 */         this.ar *= paramFloat1;
/* 4971 */         this.as *= paramFloat1;
/* 4972 */         this.at *= paramFloat1;
/* 4973 */         this.au *= paramFloat2;
/* 4974 */         this.av *= paramFloat2;
/* 4975 */         this.aw *= paramFloat2;
/* 4976 */         this.ax *= paramFloat2;
/* 4977 */         this.ay *= paramFloat3;
/* 4978 */         this.az *= paramFloat3;
/* 4979 */         this.aA *= paramFloat3;
/* 4980 */         this.aB *= paramFloat3;
/* 4981 */         d(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 4983 */       bool1 = true;
/*      */     }
/* 4985 */     if ((this.g) || (paramaji.a(this.a, paramInt1 - 1, paramInt2, paramInt3, 4))) {
/* 4986 */       if (this.i <= 0.0D) paramInt1--;
/* 4987 */       this.z = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 4988 */       this.O = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 4989 */       this.Q = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 4990 */       this.H = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 4992 */       this.T = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 4993 */       this.ai = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 4994 */       this.ak = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 4995 */       this.ab = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 4997 */       bool2 = this.a.a(paramInt1 - 1, paramInt2 + 1, paramInt3).l();
/* 4998 */       bool3 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3).l();
/* 4999 */       bool4 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 - 1).l();
/* 5000 */       bool5 = this.a.a(paramInt1 - 1, paramInt2, paramInt3 + 1).l();
/*      */       
/* 5002 */       if ((bool4) || (bool3)) {
/* 5003 */         this.y = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).I();
/* 5004 */         this.S = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*      */       } else {
/* 5006 */         this.y = this.O;
/* 5007 */         this.S = this.ai;
/*      */       }
/* 5009 */       if ((bool5) || (bool3)) {
/* 5010 */         this.A = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).I();
/* 5011 */         this.U = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*      */       } else {
/* 5013 */         this.A = this.Q;
/* 5014 */         this.U = this.ak;
/*      */       }
/* 5016 */       if ((bool4) || (bool2)) {
/* 5017 */         this.G = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).I();
/* 5018 */         this.aa = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*      */       } else {
/* 5020 */         this.G = this.O;
/* 5021 */         this.aa = this.ai;
/*      */       }
/* 5023 */       if ((bool5) || (bool2)) {
/* 5024 */         this.I = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).I();
/* 5025 */         this.ac = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*      */       } else {
/* 5027 */         this.I = this.Q;
/* 5028 */         this.ac = this.ak;
/*      */       }
/* 5030 */       if (this.i <= 0.0D) paramInt1++;
/* 5031 */       i3 = i2;
/* 5032 */       if ((this.i <= 0.0D) || (!this.a.a(paramInt1 - 1, paramInt2, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 5033 */       f5 = this.a.a(paramInt1 - 1, paramInt2, paramInt3).I();
/*      */       
/*      */ 
/* 5036 */       float f8 = (this.z + this.A + f5 + this.Q) / 4.0F;
/* 5037 */       f10 = (f5 + this.Q + this.H + this.I) / 4.0F;
/* 5038 */       f11 = (this.O + f5 + this.G + this.H) / 4.0F;
/* 5039 */       f12 = (this.y + this.z + this.O + f5) / 4.0F;
/* 5040 */       f1 = (float)(f10 * this.l * this.n + f11 * this.l * (1.0D - this.n) + f12 * (1.0D - this.l) * (1.0D - this.n) + f8 * (1.0D - this.l) * this.n);
/*      */       
/*      */ 
/* 5043 */       f2 = (float)(f10 * this.l * this.m + f11 * this.l * (1.0D - this.m) + f12 * (1.0D - this.l) * (1.0D - this.m) + f8 * (1.0D - this.l) * this.m);
/*      */       
/*      */ 
/* 5046 */       f3 = (float)(f10 * this.k * this.m + f11 * this.k * (1.0D - this.m) + f12 * (1.0D - this.k) * (1.0D - this.m) + f8 * (1.0D - this.k) * this.m);
/*      */       
/*      */ 
/* 5049 */       f4 = (float)(f10 * this.k * this.n + f11 * this.k * (1.0D - this.n) + f12 * (1.0D - this.k) * (1.0D - this.n) + f8 * (1.0D - this.k) * this.n);
/*      */       
/*      */ 
/*      */ 
/* 5053 */       i4 = a(this.T, this.U, this.ak, i3);
/* 5054 */       i5 = a(this.ak, this.ab, this.ac, i3);
/* 5055 */       i6 = a(this.ai, this.aa, this.ab, i3);
/* 5056 */       i7 = a(this.S, this.T, this.ai, i3);
/* 5057 */       this.am = a(i5, i6, i7, i4, this.l * this.n, this.l * (1.0D - this.n), (1.0D - this.l) * (1.0D - this.n), (1.0D - this.l) * this.n);
/* 5058 */       this.an = a(i5, i6, i7, i4, this.l * this.m, this.l * (1.0D - this.m), (1.0D - this.l) * (1.0D - this.m), (1.0D - this.l) * this.m);
/* 5059 */       this.ao = a(i5, i6, i7, i4, this.k * this.m, this.k * (1.0D - this.m), (1.0D - this.k) * (1.0D - this.m), (1.0D - this.k) * this.m);
/* 5060 */       this.ap = a(i5, i6, i7, i4, this.k * this.n, this.k * (1.0D - this.n), (1.0D - this.k) * (1.0D - this.n), (1.0D - this.k) * this.n);
/*      */       
/*      */ 
/* 5063 */       if (i1 != 0) {
/* 5064 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.6F);
/* 5065 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.6F);
/* 5066 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.6F);
/*      */       } else {
/* 5068 */         this.aq = (this.ar = this.as = this.at = 0.6F);
/* 5069 */         this.au = (this.av = this.aw = this.ax = 0.6F);
/* 5070 */         this.ay = (this.az = this.aA = this.aB = 0.6F);
/*      */       }
/* 5072 */       this.aq *= f1;
/* 5073 */       this.au *= f1;
/* 5074 */       this.ay *= f1;
/* 5075 */       this.ar *= f2;
/* 5076 */       this.av *= f2;
/* 5077 */       this.az *= f2;
/* 5078 */       this.as *= f3;
/* 5079 */       this.aw *= f3;
/* 5080 */       this.aA *= f3;
/* 5081 */       this.at *= f4;
/* 5082 */       this.ax *= f4;
/* 5083 */       this.aB *= f4;
/* 5084 */       rf localrf3 = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4);
/* 5085 */       e(paramaji, paramInt1, paramInt2, paramInt3, localrf3);
/* 5086 */       if ((b) && (localrf3.g().equals("grass_side")) && (!b())) {
/* 5087 */         this.aq *= paramFloat1;
/* 5088 */         this.ar *= paramFloat1;
/* 5089 */         this.as *= paramFloat1;
/* 5090 */         this.at *= paramFloat1;
/* 5091 */         this.au *= paramFloat2;
/* 5092 */         this.av *= paramFloat2;
/* 5093 */         this.aw *= paramFloat2;
/* 5094 */         this.ax *= paramFloat2;
/* 5095 */         this.ay *= paramFloat3;
/* 5096 */         this.az *= paramFloat3;
/* 5097 */         this.aA *= paramFloat3;
/* 5098 */         this.aB *= paramFloat3;
/* 5099 */         e(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5101 */       bool1 = true;
/*      */     }
/* 5103 */     if ((this.g) || (paramaji.a(this.a, paramInt1 + 1, paramInt2, paramInt3, 5))) {
/* 5104 */       if (this.j >= 1.0D) paramInt1++;
/* 5105 */       this.E = this.a.a(paramInt1, paramInt2 - 1, paramInt3).I();
/* 5106 */       this.P = this.a.a(paramInt1, paramInt2, paramInt3 - 1).I();
/* 5107 */       this.R = this.a.a(paramInt1, paramInt2, paramInt3 + 1).I();
/* 5108 */       this.L = this.a.a(paramInt1, paramInt2 + 1, paramInt3).I();
/*      */       
/* 5110 */       this.Y = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3);
/* 5111 */       this.aj = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 5112 */       this.al = paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1);
/* 5113 */       this.af = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3);
/*      */       
/* 5115 */       bool2 = this.a.a(paramInt1 + 1, paramInt2 + 1, paramInt3).l();
/* 5116 */       bool3 = this.a.a(paramInt1 + 1, paramInt2 - 1, paramInt3).l();
/* 5117 */       bool4 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 + 1).l();
/* 5118 */       bool5 = this.a.a(paramInt1 + 1, paramInt2, paramInt3 - 1).l();
/*      */       
/*      */ 
/* 5121 */       if ((bool3) || (bool5)) {
/* 5122 */         this.D = this.a.a(paramInt1, paramInt2 - 1, paramInt3 - 1).I();
/* 5123 */         this.X = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 - 1);
/*      */       } else {
/* 5125 */         this.D = this.P;
/* 5126 */         this.X = this.aj;
/*      */       }
/* 5128 */       if ((bool3) || (bool4)) {
/* 5129 */         this.F = this.a.a(paramInt1, paramInt2 - 1, paramInt3 + 1).I();
/* 5130 */         this.Z = paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3 + 1);
/*      */       } else {
/* 5132 */         this.F = this.R;
/* 5133 */         this.Z = this.al;
/*      */       }
/* 5135 */       if ((bool2) || (bool5)) {
/* 5136 */         this.K = this.a.a(paramInt1, paramInt2 + 1, paramInt3 - 1).I();
/* 5137 */         this.ae = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 - 1);
/*      */       } else {
/* 5139 */         this.K = this.P;
/* 5140 */         this.ae = this.aj;
/*      */       }
/* 5142 */       if ((bool2) || (bool4)) {
/* 5143 */         this.N = this.a.a(paramInt1, paramInt2 + 1, paramInt3 + 1).I();
/* 5144 */         this.ah = paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3 + 1);
/*      */       } else {
/* 5146 */         this.N = this.R;
/* 5147 */         this.ah = this.al;
/*      */       }
/* 5149 */       if (this.j >= 1.0D) paramInt1--;
/* 5150 */       i3 = i2;
/* 5151 */       if ((this.j >= 1.0D) || (!this.a.a(paramInt1 + 1, paramInt2, paramInt3).c())) i3 = paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 5152 */       f5 = this.a.a(paramInt1 + 1, paramInt2, paramInt3).I();
/*      */       
/*      */ 
/* 5155 */       float f9 = (this.E + this.F + f5 + this.R) / 4.0F;
/* 5156 */       f10 = (this.D + this.E + this.P + f5) / 4.0F;
/* 5157 */       f11 = (this.P + f5 + this.K + this.L) / 4.0F;
/* 5158 */       f12 = (f5 + this.R + this.L + this.N) / 4.0F;
/* 5159 */       f1 = (float)(f9 * (1.0D - this.k) * this.n + f10 * (1.0D - this.k) * (1.0D - this.n) + f11 * this.k * (1.0D - this.n) + f12 * this.k * this.n);
/*      */       
/*      */ 
/* 5162 */       f2 = (float)(f9 * (1.0D - this.k) * this.m + f10 * (1.0D - this.k) * (1.0D - this.m) + f11 * this.k * (1.0D - this.m) + f12 * this.k * this.m);
/*      */       
/*      */ 
/* 5165 */       f3 = (float)(f9 * (1.0D - this.l) * this.m + f10 * (1.0D - this.l) * (1.0D - this.m) + f11 * this.l * (1.0D - this.m) + f12 * this.l * this.m);
/*      */       
/*      */ 
/* 5168 */       f4 = (float)(f9 * (1.0D - this.l) * this.n + f10 * (1.0D - this.l) * (1.0D - this.n) + f11 * this.l * (1.0D - this.n) + f12 * this.l * this.n);
/*      */       
/*      */ 
/*      */ 
/* 5172 */       i4 = a(this.Y, this.Z, this.al, i3);
/* 5173 */       i5 = a(this.al, this.af, this.ah, i3);
/* 5174 */       i6 = a(this.aj, this.ae, this.af, i3);
/* 5175 */       i7 = a(this.X, this.Y, this.aj, i3);
/* 5176 */       this.am = a(i4, i7, i6, i5, (1.0D - this.k) * this.n, (1.0D - this.k) * (1.0D - this.n), this.k * (1.0D - this.n), this.k * this.n);
/* 5177 */       this.an = a(i4, i7, i6, i5, (1.0D - this.k) * this.m, (1.0D - this.k) * (1.0D - this.m), this.k * (1.0D - this.m), this.k * this.m);
/* 5178 */       this.ao = a(i4, i7, i6, i5, (1.0D - this.l) * this.m, (1.0D - this.l) * (1.0D - this.m), this.l * (1.0D - this.m), this.l * this.m);
/* 5179 */       this.ap = a(i4, i7, i6, i5, (1.0D - this.l) * this.n, (1.0D - this.l) * (1.0D - this.n), this.l * (1.0D - this.n), this.l * this.n);
/*      */       
/* 5181 */       if (i1 != 0) {
/* 5182 */         this.aq = (this.ar = this.as = this.at = paramFloat1 * 0.6F);
/* 5183 */         this.au = (this.av = this.aw = this.ax = paramFloat2 * 0.6F);
/* 5184 */         this.ay = (this.az = this.aA = this.aB = paramFloat3 * 0.6F);
/*      */       } else {
/* 5186 */         this.aq = (this.ar = this.as = this.at = 0.6F);
/* 5187 */         this.au = (this.av = this.aw = this.ax = 0.6F);
/* 5188 */         this.ay = (this.az = this.aA = this.aB = 0.6F);
/*      */       }
/* 5190 */       this.aq *= f1;
/* 5191 */       this.au *= f1;
/* 5192 */       this.ay *= f1;
/* 5193 */       this.ar *= f2;
/* 5194 */       this.av *= f2;
/* 5195 */       this.az *= f2;
/* 5196 */       this.as *= f3;
/* 5197 */       this.aw *= f3;
/* 5198 */       this.aA *= f3;
/* 5199 */       this.at *= f4;
/* 5200 */       this.ax *= f4;
/* 5201 */       this.aB *= f4;
/*      */       
/* 5203 */       rf localrf4 = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5);
/* 5204 */       f(paramaji, paramInt1, paramInt2, paramInt3, localrf4);
/* 5205 */       if ((b) && (localrf4.g().equals("grass_side")) && (!b())) {
/* 5206 */         this.aq *= paramFloat1;
/* 5207 */         this.ar *= paramFloat1;
/* 5208 */         this.as *= paramFloat1;
/* 5209 */         this.at *= paramFloat1;
/* 5210 */         this.au *= paramFloat2;
/* 5211 */         this.av *= paramFloat2;
/* 5212 */         this.aw *= paramFloat2;
/* 5213 */         this.ax *= paramFloat2;
/* 5214 */         this.ay *= paramFloat3;
/* 5215 */         this.az *= paramFloat3;
/* 5216 */         this.aA *= paramFloat3;
/* 5217 */         this.aB *= paramFloat3;
/* 5218 */         f(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5220 */       bool1 = true;
/*      */     }
/* 5222 */     this.x = false;
/* 5223 */     return bool1;
/*      */   }
/*      */   
/*      */   private float J;
/*      */   private float K;
/*      */   private float L;
/*      */   private float M;
/*      */   
/* 5231 */   private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (paramInt1 == 0) paramInt1 = paramInt4;
/* 5232 */     if (paramInt2 == 0) paramInt2 = paramInt4;
/* 5233 */     if (paramInt3 == 0) paramInt3 = paramInt4;
/* 5234 */     return paramInt1 + paramInt2 + paramInt3 + paramInt4 >> 2 & 0xFF00FF;
/*      */   }
/*      */   
/*      */   private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*      */   {
/* 5239 */     int i1 = (int)((paramInt1 >> 16 & 0xFF) * paramDouble1 + (paramInt2 >> 16 & 0xFF) * paramDouble2 + (paramInt3 >> 16 & 0xFF) * paramDouble3 + (paramInt4 >> 16 & 0xFF) * paramDouble4) & 0xFF;
/* 5240 */     int i2 = (int)((paramInt1 & 0xFF) * paramDouble1 + (paramInt2 & 0xFF) * paramDouble2 + (paramInt3 & 0xFF) * paramDouble3 + (paramInt4 & 0xFF) * paramDouble4) & 0xFF;
/* 5241 */     return i1 << 16 | i2;
/*      */   }
/*      */   
/*      */   public boolean d(aji paramaji, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 5245 */     this.x = false;
/*      */     
/* 5247 */     bmh localbmh = bmh.a;
/*      */     
/* 5249 */     boolean bool = false;
/* 5250 */     float f1 = 0.5F;
/* 5251 */     float f2 = 1.0F;
/* 5252 */     float f3 = 0.8F;
/* 5253 */     float f4 = 0.6F;
/*      */     
/* 5255 */     float f5 = f2 * paramFloat1;
/* 5256 */     float f6 = f2 * paramFloat2;
/* 5257 */     float f7 = f2 * paramFloat3;
/*      */     
/* 5259 */     float f8 = f1;
/* 5260 */     float f9 = f3;
/* 5261 */     float f10 = f4;
/*      */     
/* 5263 */     float f11 = f1;
/* 5264 */     float f12 = f3;
/* 5265 */     float f13 = f4;
/*      */     
/* 5267 */     float f14 = f1;
/* 5268 */     float f15 = f3;
/* 5269 */     float f16 = f4;
/*      */     
/* 5271 */     if (paramaji != ajn.c) {
/* 5272 */       f8 *= paramFloat1;
/* 5273 */       f9 *= paramFloat1;
/* 5274 */       f10 *= paramFloat1;
/*      */       
/* 5276 */       f11 *= paramFloat2;
/* 5277 */       f12 *= paramFloat2;
/* 5278 */       f13 *= paramFloat2;
/*      */       
/* 5280 */       f14 *= paramFloat3;
/* 5281 */       f15 *= paramFloat3;
/* 5282 */       f16 *= paramFloat3;
/*      */     }
/*      */     
/*      */ 
/* 5286 */     int i1 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 5288 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0))) {
/* 5289 */       localbmh.b(this.k > 0.0D ? i1 : paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3));
/* 5290 */       localbmh.b(f8, f11, f14);
/*      */       
/* 5292 */       a(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0));
/* 5293 */       bool = true;
/*      */     }
/*      */     
/* 5296 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1))) {
/* 5297 */       localbmh.b(this.l < 1.0D ? i1 : paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3));
/* 5298 */       localbmh.b(f5, f6, f7);
/*      */       
/* 5300 */       b(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1));
/* 5301 */       bool = true;
/*      */     }
/*      */     rf localrf;
/* 5304 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 - 1, 2))) {
/* 5305 */       localbmh.b(this.m > 0.0D ? i1 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1));
/* 5306 */       localbmh.b(f9, f12, f15);
/*      */       
/* 5308 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2);
/* 5309 */       c(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 5310 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 5311 */         localbmh.b(f9 * paramFloat1, f12 * paramFloat2, f15 * paramFloat3);
/* 5312 */         c(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5314 */       bool = true;
/*      */     }
/*      */     
/* 5317 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2, paramInt3 + 1, 3))) {
/* 5318 */       localbmh.b(this.n < 1.0D ? i1 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1));
/* 5319 */       localbmh.b(f9, f12, f15);
/*      */       
/* 5321 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3);
/* 5322 */       d(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 5323 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 5324 */         localbmh.b(f9 * paramFloat1, f12 * paramFloat2, f15 * paramFloat3);
/* 5325 */         d(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5327 */       bool = true;
/*      */     }
/*      */     
/* 5330 */     if ((this.g) || (paramaji.a(this.a, paramInt1 - 1, paramInt2, paramInt3, 4))) {
/* 5331 */       localbmh.b(this.i > 0.0D ? i1 : paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3));
/* 5332 */       localbmh.b(f10, f13, f16);
/*      */       
/* 5334 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4);
/* 5335 */       e(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 5336 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 5337 */         localbmh.b(f10 * paramFloat1, f13 * paramFloat2, f16 * paramFloat3);
/* 5338 */         e(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5340 */       bool = true;
/*      */     }
/*      */     
/* 5343 */     if ((this.g) || (paramaji.a(this.a, paramInt1 + 1, paramInt2, paramInt3, 5))) {
/* 5344 */       localbmh.b(this.j < 1.0D ? i1 : paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3));
/* 5345 */       localbmh.b(f10, f13, f16);
/*      */       
/* 5347 */       localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5);
/* 5348 */       f(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 5349 */       if ((b) && (localrf.g().equals("grass_side")) && (!b())) {
/* 5350 */         localbmh.b(f10 * paramFloat1, f13 * paramFloat2, f16 * paramFloat3);
/* 5351 */         f(paramaji, paramInt1, paramInt2, paramInt3, alh.e());
/*      */       }
/* 5353 */       bool = true;
/*      */     }
/*      */     
/* 5356 */     return bool;
/*      */   }
/*      */   
/*      */   private boolean a(ajz paramajz, int paramInt1, int paramInt2, int paramInt3) {
/* 5360 */     bmh localbmh = bmh.a;
/*      */     
/* 5362 */     localbmh.b(paramajz.c(this.a, paramInt1, paramInt2, paramInt3));
/* 5363 */     localbmh.b(1.0F, 1.0F, 1.0F);
/*      */     
/* 5365 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 5366 */     int i2 = akk.l(i1);
/* 5367 */     int i3 = ajz.c(i1);
/* 5368 */     rf localrf = paramajz.b(i3);
/*      */     
/* 5370 */     int i4 = 4 + i3 * 2;
/* 5371 */     int i5 = 5 + i3 * 2;
/*      */     
/* 5373 */     double d1 = 15.0D - i4;
/* 5374 */     double d2 = 15.0D;
/* 5375 */     double d3 = 4.0D;
/* 5376 */     double d4 = 4.0D + i5;
/* 5377 */     double d5 = localrf.a(d1);
/* 5378 */     double d6 = localrf.a(d2);
/* 5379 */     double d7 = localrf.b(d3);
/* 5380 */     double d8 = localrf.b(d4);
/*      */     
/*      */ 
/* 5383 */     double d9 = 0.0D;
/* 5384 */     double d10 = 0.0D;
/*      */     
/* 5386 */     switch (i2) {
/*      */     case 2: 
/* 5388 */       d9 = 8.0D - i4 / 2;
/* 5389 */       d10 = 1.0D;
/* 5390 */       break;
/*      */     case 0: 
/* 5392 */       d9 = 8.0D - i4 / 2;
/* 5393 */       d10 = 15.0D - i4;
/* 5394 */       break;
/*      */     case 3: 
/* 5396 */       d9 = 15.0D - i4;
/* 5397 */       d10 = 8.0D - i4 / 2;
/* 5398 */       break;
/*      */     case 1: 
/* 5400 */       d9 = 1.0D;
/* 5401 */       d10 = 8.0D - i4 / 2;
/*      */     }
/*      */     
/*      */     
/* 5405 */     double d11 = paramInt1 + d9 / 16.0D;
/* 5406 */     double d12 = paramInt1 + (d9 + i4) / 16.0D;
/* 5407 */     double d13 = paramInt2 + (12.0D - i5) / 16.0D;
/* 5408 */     double d14 = paramInt2 + 0.75D;
/* 5409 */     double d15 = paramInt3 + d10 / 16.0D;
/* 5410 */     double d16 = paramInt3 + (d10 + i4) / 16.0D;
/*      */     
/*      */ 
/*      */ 
/* 5414 */     localbmh.a(d11, d13, d15, d5, d8);
/* 5415 */     localbmh.a(d11, d13, d16, d6, d8);
/* 5416 */     localbmh.a(d11, d14, d16, d6, d7);
/* 5417 */     localbmh.a(d11, d14, d15, d5, d7);
/*      */     
/*      */ 
/*      */ 
/* 5421 */     localbmh.a(d12, d13, d16, d5, d8);
/* 5422 */     localbmh.a(d12, d13, d15, d6, d8);
/* 5423 */     localbmh.a(d12, d14, d15, d6, d7);
/* 5424 */     localbmh.a(d12, d14, d16, d5, d7);
/*      */     
/*      */ 
/*      */ 
/* 5428 */     localbmh.a(d12, d13, d15, d5, d8);
/* 5429 */     localbmh.a(d11, d13, d15, d6, d8);
/* 5430 */     localbmh.a(d11, d14, d15, d6, d7);
/* 5431 */     localbmh.a(d12, d14, d15, d5, d7);
/*      */     
/*      */ 
/*      */ 
/* 5435 */     localbmh.a(d11, d13, d16, d5, d8);
/* 5436 */     localbmh.a(d12, d13, d16, d6, d8);
/* 5437 */     localbmh.a(d12, d14, d16, d6, d7);
/* 5438 */     localbmh.a(d11, d14, d16, d5, d7);
/*      */     
/*      */ 
/* 5441 */     int i6 = i4;
/* 5442 */     if (i3 >= 2)
/*      */     {
/* 5444 */       i6--;
/*      */     }
/*      */     
/* 5447 */     d5 = localrf.c();
/* 5448 */     d6 = localrf.a(i6);
/* 5449 */     d7 = localrf.e();
/* 5450 */     d8 = localrf.b(i6);
/*      */     
/*      */ 
/*      */ 
/* 5454 */     localbmh.a(d11, d14, d16, d5, d8);
/* 5455 */     localbmh.a(d12, d14, d16, d6, d8);
/* 5456 */     localbmh.a(d12, d14, d15, d6, d7);
/* 5457 */     localbmh.a(d11, d14, d15, d5, d7);
/*      */     
/*      */ 
/*      */ 
/* 5461 */     localbmh.a(d11, d13, d15, d5, d7);
/* 5462 */     localbmh.a(d12, d13, d15, d6, d7);
/* 5463 */     localbmh.a(d12, d13, d16, d6, d8);
/* 5464 */     localbmh.a(d11, d13, d16, d5, d8);
/*      */     
/*      */ 
/*      */ 
/* 5468 */     d5 = localrf.a(12.0D);
/* 5469 */     d6 = localrf.d();
/* 5470 */     d7 = localrf.e();
/* 5471 */     d8 = localrf.b(4.0D);
/*      */     
/* 5473 */     d9 = 8.0D;
/* 5474 */     d10 = 0.0D;
/*      */     double d17;
/* 5476 */     switch (i2) {
/*      */     case 2: 
/* 5478 */       d9 = 8.0D;
/* 5479 */       d10 = 0.0D;
/* 5480 */       break;
/*      */     case 0: 
/* 5482 */       d9 = 8.0D;
/* 5483 */       d10 = 12.0D;
/*      */       
/* 5485 */       d17 = d5;
/* 5486 */       d5 = d6;
/* 5487 */       d6 = d17;
/*      */       
/* 5489 */       break;
/*      */     case 3: 
/* 5491 */       d9 = 12.0D;
/* 5492 */       d10 = 8.0D;
/*      */       
/* 5494 */       d17 = d5;
/* 5495 */       d5 = d6;
/* 5496 */       d6 = d17;
/*      */       
/* 5498 */       break;
/*      */     case 1: 
/* 5500 */       d9 = 0.0D;
/* 5501 */       d10 = 8.0D;
/*      */     }
/*      */     
/*      */     
/* 5505 */     d11 = paramInt1 + d9 / 16.0D;
/* 5506 */     d12 = paramInt1 + (d9 + 4.0D) / 16.0D;
/* 5507 */     d13 = paramInt2 + 0.75D;
/* 5508 */     d14 = paramInt2 + 1.0D;
/* 5509 */     d15 = paramInt3 + d10 / 16.0D;
/* 5510 */     d16 = paramInt3 + (d10 + 4.0D) / 16.0D;
/* 5511 */     if ((i2 == 2) || (i2 == 0))
/*      */     {
/*      */ 
/* 5514 */       localbmh.a(d11, d13, d15, d6, d8);
/* 5515 */       localbmh.a(d11, d13, d16, d5, d8);
/* 5516 */       localbmh.a(d11, d14, d16, d5, d7);
/* 5517 */       localbmh.a(d11, d14, d15, d6, d7);
/*      */       
/*      */ 
/*      */ 
/* 5521 */       localbmh.a(d11, d13, d16, d5, d8);
/* 5522 */       localbmh.a(d11, d13, d15, d6, d8);
/* 5523 */       localbmh.a(d11, d14, d15, d6, d7);
/* 5524 */       localbmh.a(d11, d14, d16, d5, d7);
/*      */     }
/* 5526 */     else if ((i2 == 1) || (i2 == 3))
/*      */     {
/*      */ 
/* 5529 */       localbmh.a(d12, d13, d15, d5, d8);
/* 5530 */       localbmh.a(d11, d13, d15, d6, d8);
/* 5531 */       localbmh.a(d11, d14, d15, d6, d7);
/* 5532 */       localbmh.a(d12, d14, d15, d5, d7);
/*      */       
/*      */ 
/*      */ 
/* 5536 */       localbmh.a(d11, d13, d15, d6, d8);
/* 5537 */       localbmh.a(d12, d13, d15, d5, d8);
/* 5538 */       localbmh.a(d12, d14, d15, d5, d7);
/* 5539 */       localbmh.a(d11, d14, d15, d6, d7);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 5544 */     return true;
/*      */   }
/*      */   
/*      */   private boolean a(ajg paramajg, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 5549 */     float f1 = 0.1875F;
/*      */     
/* 5551 */     a(b(ajn.w));
/* 5552 */     a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 5553 */     q(paramajg, paramInt1, paramInt2, paramInt3);
/*      */     
/*      */ 
/* 5556 */     this.g = true;
/* 5557 */     a(b(ajn.Z));
/* 5558 */     a(0.125D, 0.0062500000931322575D, 0.125D, 0.875D, f1, 0.875D);
/* 5559 */     q(paramajg, paramInt1, paramInt2, paramInt3);
/*      */     
/* 5561 */     a(b(ajn.bJ));
/* 5562 */     a(0.1875D, f1, 0.1875D, 0.8125D, 0.875D, 0.8125D);
/* 5563 */     q(paramajg, paramInt1, paramInt2, paramInt3);
/* 5564 */     this.g = false;
/*      */     
/* 5566 */     a();
/*      */     
/* 5568 */     return true;
/*      */   }
/*      */   
/*      */   public boolean t(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 5572 */     int i1 = paramaji.d(this.a, paramInt1, paramInt2, paramInt3);
/* 5573 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 5574 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 5575 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 5577 */     if (blt.a) {
/* 5578 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 5579 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 5580 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 5582 */       f1 = f4;
/* 5583 */       f2 = f5;
/* 5584 */       f3 = f6;
/*      */     }
/*      */     
/* 5587 */     return e(paramaji, paramInt1, paramInt2, paramInt3, f1, f2, f3);
/*      */   }
/*      */   
/*      */   public boolean e(aji paramaji, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 5591 */     bmh localbmh = bmh.a;
/*      */     
/* 5593 */     int i1 = 0;
/* 5594 */     float f1 = 0.5F;
/* 5595 */     float f2 = 1.0F;
/* 5596 */     float f3 = 0.8F;
/* 5597 */     float f4 = 0.6F;
/*      */     
/* 5599 */     float f5 = f1 * paramFloat1;
/* 5600 */     float f6 = f2 * paramFloat1;
/* 5601 */     float f7 = f3 * paramFloat1;
/* 5602 */     float f8 = f4 * paramFloat1;
/*      */     
/* 5604 */     float f9 = f1 * paramFloat2;
/* 5605 */     float f10 = f2 * paramFloat2;
/* 5606 */     float f11 = f3 * paramFloat2;
/* 5607 */     float f12 = f4 * paramFloat2;
/*      */     
/* 5609 */     float f13 = f1 * paramFloat3;
/* 5610 */     float f14 = f2 * paramFloat3;
/* 5611 */     float f15 = f3 * paramFloat3;
/* 5612 */     float f16 = f4 * paramFloat3;
/*      */     
/* 5614 */     float f17 = 0.0625F;
/*      */     
/* 5616 */     int i2 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 5618 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 - 1, paramInt3, 0))) {
/* 5619 */       localbmh.b(this.k > 0.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3));
/* 5620 */       localbmh.b(f5, f9, f13);
/* 5621 */       a(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0));
/*      */     }
/*      */     
/* 5624 */     if ((this.g) || (paramaji.a(this.a, paramInt1, paramInt2 + 1, paramInt3, 1))) {
/* 5625 */       localbmh.b(this.l < 1.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3));
/* 5626 */       localbmh.b(f6, f10, f14);
/* 5627 */       b(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1));
/*      */     }
/*      */     
/*      */ 
/* 5631 */     localbmh.b(i2);
/* 5632 */     localbmh.b(f7, f11, f15);
/* 5633 */     localbmh.d(0.0F, 0.0F, f17);
/* 5634 */     c(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2));
/* 5635 */     localbmh.d(0.0F, 0.0F, -f17);
/*      */     
/* 5637 */     localbmh.d(0.0F, 0.0F, -f17);
/* 5638 */     d(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3));
/* 5639 */     localbmh.d(0.0F, 0.0F, f17);
/*      */     
/*      */ 
/* 5642 */     localbmh.b(f8, f12, f16);
/* 5643 */     localbmh.d(f17, 0.0F, 0.0F);
/* 5644 */     e(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4));
/* 5645 */     localbmh.d(-f17, 0.0F, 0.0F);
/*      */     
/* 5647 */     localbmh.d(-f17, 0.0F, 0.0F);
/* 5648 */     f(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5));
/* 5649 */     localbmh.d(f17, 0.0F, 0.0F);
/*      */     
/* 5651 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(akz paramakz, int paramInt1, int paramInt2, int paramInt3) {
/* 5655 */     boolean bool1 = false;
/*      */     
/* 5657 */     float f1 = 0.375F;
/* 5658 */     float f2 = 0.625F;
/* 5659 */     a(f1, 0.0D, f1, f2, 1.0D, f2);
/* 5660 */     q(paramakz, paramInt1, paramInt2, paramInt3);
/* 5661 */     bool1 = true;
/*      */     
/* 5663 */     int i1 = 0;
/* 5664 */     int i2 = 0;
/*      */     
/* 5666 */     if ((paramakz.e(this.a, paramInt1 - 1, paramInt2, paramInt3)) || (paramakz.e(this.a, paramInt1 + 1, paramInt2, paramInt3))) i1 = 1;
/* 5667 */     if ((paramakz.e(this.a, paramInt1, paramInt2, paramInt3 - 1)) || (paramakz.e(this.a, paramInt1, paramInt2, paramInt3 + 1))) { i2 = 1;
/*      */     }
/* 5669 */     boolean bool2 = paramakz.e(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 5670 */     boolean bool3 = paramakz.e(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 5671 */     boolean bool4 = paramakz.e(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 5672 */     boolean bool5 = paramakz.e(this.a, paramInt1, paramInt2, paramInt3 + 1);
/*      */     
/* 5674 */     if ((i1 == 0) && (i2 == 0)) { i1 = 1;
/*      */     }
/* 5676 */     f1 = 0.4375F;
/* 5677 */     f2 = 0.5625F;
/* 5678 */     float f3 = 0.75F;
/* 5679 */     float f4 = 0.9375F;
/*      */     
/* 5681 */     float f5 = bool2 ? 0.0F : f1;
/* 5682 */     float f6 = bool3 ? 1.0F : f2;
/* 5683 */     float f7 = bool4 ? 0.0F : f1;
/* 5684 */     float f8 = bool5 ? 1.0F : f2;
/* 5685 */     this.f = true;
/* 5686 */     if (i1 != 0) {
/* 5687 */       a(f5, f3, f1, f6, f4, f2);
/* 5688 */       q(paramakz, paramInt1, paramInt2, paramInt3);
/* 5689 */       bool1 = true;
/*      */     }
/* 5691 */     if (i2 != 0) {
/* 5692 */       a(f1, f3, f7, f2, f4, f8);
/* 5693 */       q(paramakz, paramInt1, paramInt2, paramInt3);
/* 5694 */       bool1 = true;
/*      */     }
/*      */     
/* 5697 */     f3 = 0.375F;
/* 5698 */     f4 = 0.5625F;
/* 5699 */     if (i1 != 0) {
/* 5700 */       a(f5, f3, f1, f6, f4, f2);
/* 5701 */       q(paramakz, paramInt1, paramInt2, paramInt3);
/* 5702 */       bool1 = true;
/*      */     }
/* 5704 */     if (i2 != 0) {
/* 5705 */       a(f1, f3, f7, f2, f4, f8);
/* 5706 */       q(paramakz, paramInt1, paramInt2, paramInt3);
/* 5707 */       bool1 = true;
/*      */     }
/* 5709 */     this.f = false;
/*      */     
/* 5711 */     paramakz.a(this.a, paramInt1, paramInt2, paramInt3);
/* 5712 */     return bool1;
/*      */   }
/*      */   
/*      */   public boolean a(aoi paramaoi, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 5717 */     boolean bool1 = paramaoi.e(this.a, paramInt1 - 1, paramInt2, paramInt3);
/* 5718 */     boolean bool2 = paramaoi.e(this.a, paramInt1 + 1, paramInt2, paramInt3);
/* 5719 */     boolean bool3 = paramaoi.e(this.a, paramInt1, paramInt2, paramInt3 - 1);
/* 5720 */     boolean bool4 = paramaoi.e(this.a, paramInt1, paramInt2, paramInt3 + 1);
/*      */     
/* 5722 */     int i1 = (bool3) && (bool4) && (!bool1) && (!bool2) ? 1 : 0;
/* 5723 */     int i2 = (!bool3) && (!bool4) && (bool1) && (bool2) ? 1 : 0;
/* 5724 */     boolean bool5 = this.a.c(paramInt1, paramInt2 + 1, paramInt3);
/*      */     
/* 5726 */     if (((i1 == 0) && (i2 == 0)) || (!bool5))
/*      */     {
/* 5728 */       a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
/* 5729 */       q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */       
/* 5731 */       if (bool1) {
/* 5732 */         a(0.0D, 0.0D, 0.3125D, 0.25D, 0.8125D, 0.6875D);
/* 5733 */         q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */       }
/* 5735 */       if (bool2) {
/* 5736 */         a(0.75D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
/* 5737 */         q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */       }
/* 5739 */       if (bool3) {
/* 5740 */         a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 0.25D);
/* 5741 */         q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */       }
/* 5743 */       if (bool4) {
/* 5744 */         a(0.3125D, 0.0D, 0.75D, 0.6875D, 0.8125D, 1.0D);
/* 5745 */         q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */       }
/* 5747 */     } else if (i1 != 0)
/*      */     {
/* 5749 */       a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.8125D, 1.0D);
/* 5750 */       q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     else {
/* 5753 */       a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
/* 5754 */       q(paramaoi, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/* 5757 */     paramaoi.a(this.a, paramInt1, paramInt2, paramInt3);
/* 5758 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(akp paramakp, int paramInt1, int paramInt2, int paramInt3) {
/* 5762 */     boolean bool = false;
/*      */     
/* 5764 */     int i1 = 0;
/* 5765 */     for (int i2 = 0; i2 < 8; i2++) {
/* 5766 */       int i3 = 0;
/* 5767 */       int i4 = 1;
/* 5768 */       if (i2 == 0) i3 = 2;
/* 5769 */       if (i2 == 1) i3 = 3;
/* 5770 */       if (i2 == 2) i3 = 4;
/* 5771 */       if (i2 == 3) {
/* 5772 */         i3 = 5;
/* 5773 */         i4 = 2;
/*      */       }
/* 5775 */       if (i2 == 4) {
/* 5776 */         i3 = 6;
/* 5777 */         i4 = 3;
/*      */       }
/* 5779 */       if (i2 == 5) {
/* 5780 */         i3 = 7;
/* 5781 */         i4 = 5;
/*      */       }
/* 5783 */       if (i2 == 6) {
/* 5784 */         i3 = 6;
/* 5785 */         i4 = 2;
/*      */       }
/* 5787 */       if (i2 == 7) i3 = 3;
/* 5788 */       float f1 = i3 / 16.0F;
/* 5789 */       float f2 = 1.0F - i1 / 16.0F;
/* 5790 */       float f3 = 1.0F - (i1 + i4) / 16.0F;
/* 5791 */       i1 += i4;
/* 5792 */       a(0.5F - f1, f3, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/* 5793 */       q(paramakp, paramInt1, paramInt2, paramInt3);
/*      */     }
/* 5795 */     bool = true;
/*      */     
/* 5797 */     a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 5798 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean a(ala paramala, int paramInt1, int paramInt2, int paramInt3) {
/* 5802 */     boolean bool1 = true;
/*      */     
/* 5804 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 5805 */     boolean bool2 = ala.b(i1);
/* 5806 */     int i2 = akk.l(i1);
/*      */     
/* 5808 */     float f1 = 0.375F;
/* 5809 */     float f2 = 0.5625F;
/* 5810 */     float f3 = 0.75F;
/* 5811 */     float f4 = 0.9375F;
/* 5812 */     float f5 = 0.3125F;
/* 5813 */     float f6 = 1.0F;
/*      */     
/* 5815 */     if (((i2 != 2) && (i2 != 0)) || (((this.a.a(paramInt1 - 1, paramInt2, paramInt3) == ajn.bK) && (this.a.a(paramInt1 + 1, paramInt2, paramInt3) == ajn.bK)) || (((i2 == 3) || (i2 == 1)) && (this.a.a(paramInt1, paramInt2, paramInt3 - 1) == ajn.bK) && (this.a.a(paramInt1, paramInt2, paramInt3 + 1) == ajn.bK))))
/*      */     {
/* 5817 */       f1 -= 0.1875F;
/* 5818 */       f2 -= 0.1875F;
/* 5819 */       f3 -= 0.1875F;
/* 5820 */       f4 -= 0.1875F;
/* 5821 */       f5 -= 0.1875F;
/* 5822 */       f6 -= 0.1875F;
/*      */     }
/*      */     
/* 5825 */     this.g = true;
/*      */     float f7;
/* 5827 */     float f8; float f9; float f10; if ((i2 == 3) || (i2 == 1)) {
/* 5828 */       this.v = 1;
/* 5829 */       f7 = 0.4375F;
/* 5830 */       f8 = 0.5625F;
/* 5831 */       f9 = 0.0F;
/* 5832 */       f10 = 0.125F;
/* 5833 */       a(f7, f5, f9, f8, f6, f10);
/* 5834 */       q(paramala, paramInt1, paramInt2, paramInt3);
/*      */       
/* 5836 */       f9 = 0.875F;
/* 5837 */       f10 = 1.0F;
/* 5838 */       a(f7, f5, f9, f8, f6, f10);
/* 5839 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5840 */       this.v = 0;
/*      */     } else {
/* 5842 */       f7 = 0.0F;
/* 5843 */       f8 = 0.125F;
/* 5844 */       f9 = 0.4375F;
/* 5845 */       f10 = 0.5625F;
/* 5846 */       a(f7, f5, f9, f8, f6, f10);
/* 5847 */       q(paramala, paramInt1, paramInt2, paramInt3);
/*      */       
/* 5849 */       f7 = 0.875F;
/* 5850 */       f8 = 1.0F;
/* 5851 */       a(f7, f5, f9, f8, f6, f10);
/* 5852 */       q(paramala, paramInt1, paramInt2, paramInt3);
/*      */     }
/* 5854 */     if (bool2) {
/* 5855 */       if ((i2 == 2) || (i2 == 0))
/* 5856 */         this.v = 1;
/*      */       float f11;
/*      */       float f12;
/* 5859 */       float f13; if (i2 == 3) {
/* 5860 */         f7 = 0.0F;
/* 5861 */         f8 = 0.125F;
/* 5862 */         f9 = 0.875F;
/* 5863 */         f10 = 1.0F;
/*      */         
/* 5865 */         f11 = 0.5625F;
/* 5866 */         f12 = 0.8125F;
/* 5867 */         f13 = 0.9375F;
/*      */         
/* 5869 */         a(0.8125D, f1, 0.0D, 0.9375D, f4, 0.125D);
/* 5870 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5871 */         a(0.8125D, f1, 0.875D, 0.9375D, f4, 1.0D);
/* 5872 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5874 */         a(0.5625D, f1, 0.0D, 0.8125D, f2, 0.125D);
/* 5875 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5876 */         a(0.5625D, f1, 0.875D, 0.8125D, f2, 1.0D);
/* 5877 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5879 */         a(0.5625D, f3, 0.0D, 0.8125D, f4, 0.125D);
/* 5880 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5881 */         a(0.5625D, f3, 0.875D, 0.8125D, f4, 1.0D);
/* 5882 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5883 */       } else if (i2 == 1) {
/* 5884 */         f7 = 0.0F;
/* 5885 */         f8 = 0.125F;
/* 5886 */         f9 = 0.875F;
/* 5887 */         f10 = 1.0F;
/*      */         
/* 5889 */         f11 = 0.0625F;
/* 5890 */         f12 = 0.1875F;
/* 5891 */         f13 = 0.4375F;
/*      */         
/* 5893 */         a(0.0625D, f1, 0.0D, 0.1875D, f4, 0.125D);
/* 5894 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5895 */         a(0.0625D, f1, 0.875D, 0.1875D, f4, 1.0D);
/* 5896 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5898 */         a(0.1875D, f1, 0.0D, 0.4375D, f2, 0.125D);
/* 5899 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5900 */         a(0.1875D, f1, 0.875D, 0.4375D, f2, 1.0D);
/* 5901 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5903 */         a(0.1875D, f3, 0.0D, 0.4375D, f4, 0.125D);
/* 5904 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5905 */         a(0.1875D, f3, 0.875D, 0.4375D, f4, 1.0D);
/* 5906 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5907 */       } else if (i2 == 0)
/*      */       {
/* 5909 */         f7 = 0.0F;
/* 5910 */         f8 = 0.125F;
/* 5911 */         f9 = 0.875F;
/* 5912 */         f10 = 1.0F;
/*      */         
/* 5914 */         f11 = 0.5625F;
/* 5915 */         f12 = 0.8125F;
/* 5916 */         f13 = 0.9375F;
/*      */         
/* 5918 */         a(0.0D, f1, 0.8125D, 0.125D, f4, 0.9375D);
/* 5919 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5920 */         a(0.875D, f1, 0.8125D, 1.0D, f4, 0.9375D);
/* 5921 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5923 */         a(0.0D, f1, 0.5625D, 0.125D, f2, 0.8125D);
/* 5924 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5925 */         a(0.875D, f1, 0.5625D, 1.0D, f2, 0.8125D);
/* 5926 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5928 */         a(0.0D, f3, 0.5625D, 0.125D, f4, 0.8125D);
/* 5929 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5930 */         a(0.875D, f3, 0.5625D, 1.0D, f4, 0.8125D);
/* 5931 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5932 */       } else if (i2 == 2) {
/* 5933 */         f7 = 0.0F;
/* 5934 */         f8 = 0.125F;
/* 5935 */         f9 = 0.875F;
/* 5936 */         f10 = 1.0F;
/*      */         
/* 5938 */         f11 = 0.0625F;
/* 5939 */         f12 = 0.1875F;
/* 5940 */         f13 = 0.4375F;
/*      */         
/* 5942 */         a(0.0D, f1, 0.0625D, 0.125D, f4, 0.1875D);
/* 5943 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5944 */         a(0.875D, f1, 0.0625D, 1.0D, f4, 0.1875D);
/* 5945 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5947 */         a(0.0D, f1, 0.1875D, 0.125D, f2, 0.4375D);
/* 5948 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5949 */         a(0.875D, f1, 0.1875D, 1.0D, f2, 0.4375D);
/* 5950 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */         
/* 5952 */         a(0.0D, f3, 0.1875D, 0.125D, f4, 0.4375D);
/* 5953 */         q(paramala, paramInt1, paramInt2, paramInt3);
/* 5954 */         a(0.875D, f3, 0.1875D, 1.0D, f4, 0.4375D);
/* 5955 */         q(paramala, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */     }
/* 5958 */     else if ((i2 == 3) || (i2 == 1)) {
/* 5959 */       this.v = 1;
/* 5960 */       f7 = 0.4375F;
/* 5961 */       f8 = 0.5625F;
/* 5962 */       f9 = 0.375F;
/* 5963 */       f10 = 0.5F;
/* 5964 */       a(f7, f1, f9, f8, f4, f10);
/* 5965 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5966 */       f9 = 0.5F;
/* 5967 */       f10 = 0.625F;
/* 5968 */       a(f7, f1, f9, f8, f4, f10);
/* 5969 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5970 */       f9 = 0.625F;
/* 5971 */       f10 = 0.875F;
/* 5972 */       a(f7, f1, f9, f8, f2, f10);
/* 5973 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5974 */       a(f7, f3, f9, f8, f4, f10);
/* 5975 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5976 */       f9 = 0.125F;
/* 5977 */       f10 = 0.375F;
/* 5978 */       a(f7, f1, f9, f8, f2, f10);
/* 5979 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5980 */       a(f7, f3, f9, f8, f4, f10);
/* 5981 */       q(paramala, paramInt1, paramInt2, paramInt3);
/*      */     } else {
/* 5983 */       f7 = 0.375F;
/* 5984 */       f8 = 0.5F;
/* 5985 */       f9 = 0.4375F;
/* 5986 */       f10 = 0.5625F;
/* 5987 */       a(f7, f1, f9, f8, f4, f10);
/* 5988 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5989 */       f7 = 0.5F;
/* 5990 */       f8 = 0.625F;
/* 5991 */       a(f7, f1, f9, f8, f4, f10);
/* 5992 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5993 */       f7 = 0.625F;
/* 5994 */       f8 = 0.875F;
/* 5995 */       a(f7, f1, f9, f8, f2, f10);
/* 5996 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5997 */       a(f7, f3, f9, f8, f4, f10);
/* 5998 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 5999 */       f7 = 0.125F;
/* 6000 */       f8 = 0.375F;
/* 6001 */       a(f7, f1, f9, f8, f2, f10);
/* 6002 */       q(paramala, paramInt1, paramInt2, paramInt3);
/* 6003 */       a(f7, f3, f9, f8, f4, f10);
/* 6004 */       q(paramala, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/*      */ 
/* 6008 */     this.g = false;
/* 6009 */     this.v = 0;
/*      */     
/* 6011 */     a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 6012 */     return bool1;
/*      */   }
/*      */   
/*      */   private boolean a(aln paramaln, int paramInt1, int paramInt2, int paramInt3) {
/* 6016 */     bmh localbmh = bmh.a;
/*      */     
/* 6018 */     localbmh.b(paramaln.c(this.a, paramInt1, paramInt2, paramInt3));
/* 6019 */     int i1 = paramaln.d(this.a, paramInt1, paramInt2, paramInt3);
/* 6020 */     float f1 = (i1 >> 16 & 0xFF) / 255.0F;
/* 6021 */     float f2 = (i1 >> 8 & 0xFF) / 255.0F;
/* 6022 */     float f3 = (i1 & 0xFF) / 255.0F;
/*      */     
/* 6024 */     if (blt.a) {
/* 6025 */       float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 6026 */       float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 6027 */       float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */       
/* 6029 */       f1 = f4;
/* 6030 */       f2 = f5;
/* 6031 */       f3 = f6;
/*      */     }
/* 6033 */     localbmh.b(f1, f2, f3);
/*      */     
/* 6035 */     return a(paramaln, paramInt1, paramInt2, paramInt3, this.a.e(paramInt1, paramInt2, paramInt3), false);
/*      */   }
/*      */   
/*      */   private boolean a(aln paramaln, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/* 6039 */     bmh localbmh = bmh.a;
/* 6040 */     int i1 = aln.b(paramInt4);
/*      */     
/*      */ 
/* 6043 */     double d1 = 0.625D;
/* 6044 */     a(0.0D, d1, 0.0D, 1.0D, 1.0D, 1.0D);
/*      */     
/* 6046 */     if (paramBoolean) {
/* 6047 */       localbmh.b();
/* 6048 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 6049 */       a(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 0, paramInt4));
/* 6050 */       localbmh.a();
/*      */       
/* 6052 */       localbmh.b();
/* 6053 */       localbmh.c(0.0F, 1.0F, 0.0F);
/* 6054 */       b(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 1, paramInt4));
/* 6055 */       localbmh.a();
/*      */       
/* 6057 */       localbmh.b();
/* 6058 */       localbmh.c(0.0F, 0.0F, -1.0F);
/* 6059 */       c(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 2, paramInt4));
/* 6060 */       localbmh.a();
/*      */       
/* 6062 */       localbmh.b();
/* 6063 */       localbmh.c(0.0F, 0.0F, 1.0F);
/* 6064 */       d(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 3, paramInt4));
/* 6065 */       localbmh.a();
/*      */       
/* 6067 */       localbmh.b();
/* 6068 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/* 6069 */       e(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 4, paramInt4));
/* 6070 */       localbmh.a();
/*      */       
/* 6072 */       localbmh.b();
/* 6073 */       localbmh.c(1.0F, 0.0F, 0.0F);
/* 6074 */       f(paramaln, 0.0D, 0.0D, 0.0D, a(paramaln, 5, paramInt4));
/* 6075 */       localbmh.a();
/*      */     } else {
/* 6077 */       q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/* 6080 */     if (!paramBoolean) {
/* 6081 */       localbmh.b(paramaln.c(this.a, paramInt1, paramInt2, paramInt3));
/* 6082 */       int i2 = paramaln.d(this.a, paramInt1, paramInt2, paramInt3);
/* 6083 */       float f1 = (i2 >> 16 & 0xFF) / 255.0F;
/* 6084 */       f2 = (i2 >> 8 & 0xFF) / 255.0F;
/* 6085 */       float f3 = (i2 & 0xFF) / 255.0F;
/*      */       
/* 6087 */       if (blt.a) {
/* 6088 */         float f4 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
/* 6089 */         float f5 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
/* 6090 */         float f6 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
/*      */         
/* 6092 */         f1 = f4;
/* 6093 */         f2 = f5;
/* 6094 */         f3 = f6;
/*      */       }
/* 6096 */       localbmh.b(f1, f2, f3);
/*      */     }
/*      */     
/*      */ 
/* 6100 */     rf localrf1 = aln.e("hopper_outside");
/* 6101 */     rf localrf2 = aln.e("hopper_inside");
/* 6102 */     float f2 = 0.125F;
/*      */     
/* 6104 */     if (paramBoolean) {
/* 6105 */       localbmh.b();
/* 6106 */       localbmh.c(1.0F, 0.0F, 0.0F);
/* 6107 */       f(paramaln, -1.0F + f2, 0.0D, 0.0D, localrf1);
/* 6108 */       localbmh.a();
/*      */       
/* 6110 */       localbmh.b();
/* 6111 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/* 6112 */       e(paramaln, 1.0F - f2, 0.0D, 0.0D, localrf1);
/* 6113 */       localbmh.a();
/*      */       
/* 6115 */       localbmh.b();
/* 6116 */       localbmh.c(0.0F, 0.0F, 1.0F);
/* 6117 */       d(paramaln, 0.0D, 0.0D, -1.0F + f2, localrf1);
/* 6118 */       localbmh.a();
/*      */       
/* 6120 */       localbmh.b();
/* 6121 */       localbmh.c(0.0F, 0.0F, -1.0F);
/* 6122 */       c(paramaln, 0.0D, 0.0D, 1.0F - f2, localrf1);
/* 6123 */       localbmh.a();
/*      */       
/* 6125 */       localbmh.b();
/* 6126 */       localbmh.c(0.0F, 1.0F, 0.0F);
/* 6127 */       b(paramaln, 0.0D, -1.0D + d1, 0.0D, localrf2);
/* 6128 */       localbmh.a();
/*      */     } else {
/* 6130 */       f(paramaln, paramInt1 - 1.0F + f2, paramInt2, paramInt3, localrf1);
/* 6131 */       e(paramaln, paramInt1 + 1.0F - f2, paramInt2, paramInt3, localrf1);
/* 6132 */       d(paramaln, paramInt1, paramInt2, paramInt3 - 1.0F + f2, localrf1);
/* 6133 */       c(paramaln, paramInt1, paramInt2, paramInt3 + 1.0F - f2, localrf1);
/* 6134 */       b(paramaln, paramInt1, paramInt2 - 1.0F + d1, paramInt3, localrf2);
/*      */     }
/*      */     
/*      */ 
/* 6138 */     a(localrf1);
/* 6139 */     double d2 = 0.25D;
/* 6140 */     double d3 = 0.25D;
/* 6141 */     double d4 = d1;
/* 6142 */     a(d2, d3, d2, 1.0D - d2, d4 - 0.002D, 1.0D - d2);
/*      */     
/* 6144 */     if (paramBoolean) {
/* 6145 */       localbmh.b();
/* 6146 */       localbmh.c(1.0F, 0.0F, 0.0F);
/* 6147 */       f(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6148 */       localbmh.a();
/*      */       
/* 6150 */       localbmh.b();
/* 6151 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/* 6152 */       e(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6153 */       localbmh.a();
/*      */       
/* 6155 */       localbmh.b();
/* 6156 */       localbmh.c(0.0F, 0.0F, 1.0F);
/* 6157 */       d(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6158 */       localbmh.a();
/*      */       
/* 6160 */       localbmh.b();
/* 6161 */       localbmh.c(0.0F, 0.0F, -1.0F);
/* 6162 */       c(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6163 */       localbmh.a();
/*      */       
/* 6165 */       localbmh.b();
/* 6166 */       localbmh.c(0.0F, 1.0F, 0.0F);
/* 6167 */       b(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6168 */       localbmh.a();
/*      */       
/* 6170 */       localbmh.b();
/* 6171 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 6172 */       a(paramaln, 0.0D, 0.0D, 0.0D, localrf1);
/* 6173 */       localbmh.a();
/*      */     } else {
/* 6175 */       q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/* 6178 */     if (!paramBoolean)
/*      */     {
/* 6180 */       double d5 = 0.375D;
/* 6181 */       double d6 = 0.25D;
/* 6182 */       a(localrf1);
/*      */       
/*      */ 
/* 6185 */       if (i1 == 0) {
/* 6186 */         a(d5, 0.0D, d5, 1.0D - d5, 0.25D, 1.0D - d5);
/* 6187 */         q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */       
/* 6190 */       if (i1 == 2) {
/* 6191 */         a(d5, d3, 0.0D, 1.0D - d5, d3 + d6, d2);
/* 6192 */         q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */       
/* 6195 */       if (i1 == 3) {
/* 6196 */         a(d5, d3, 1.0D - d2, 1.0D - d5, d3 + d6, 1.0D);
/* 6197 */         q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */       
/* 6200 */       if (i1 == 4) {
/* 6201 */         a(0.0D, d3, d5, d2, d3 + d6, 1.0D - d5);
/* 6202 */         q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */       
/* 6205 */       if (i1 == 5) {
/* 6206 */         a(1.0D - d2, d3, d5, 1.0D, d3 + d6, 1.0D - d5);
/* 6207 */         q(paramaln, paramInt1, paramInt2, paramInt3);
/*      */       }
/*      */     }
/*      */     
/* 6211 */     a();
/*      */     
/* 6213 */     return true; }
/*      */   
/*      */   private float N;
/*      */   private float O;
/*      */   private float P;
/*      */   private float Q;
/*      */   private float R;
/* 6220 */   public boolean a(ans paramans, int paramInt1, int paramInt2, int paramInt3) { paramans.e(this.a, paramInt1, paramInt2, paramInt3);
/* 6221 */     a(paramans);
/* 6222 */     q(paramans, paramInt1, paramInt2, paramInt3);
/*      */     
/* 6224 */     this.f = true;
/*      */     
/* 6226 */     boolean bool = paramans.f(this.a, paramInt1, paramInt2, paramInt3);
/* 6227 */     a(paramans);
/* 6228 */     q(paramans, paramInt1, paramInt2, paramInt3);
/*      */     
/* 6230 */     if ((bool) && 
/* 6231 */       (paramans.g(this.a, paramInt1, paramInt2, paramInt3))) {
/* 6232 */       a(paramans);
/* 6233 */       q(paramans, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */     
/*      */ 
/* 6237 */     this.f = false;
/*      */     
/* 6239 */     return true;
/*      */   }
/*      */   
/*      */   public boolean u(aji paramaji, int paramInt1, int paramInt2, int paramInt3) {
/* 6243 */     bmh localbmh = bmh.a;
/*      */     
/*      */ 
/* 6246 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/* 6247 */     if ((i1 & 0x8) != 0) {
/* 6248 */       if (this.a.a(paramInt1, paramInt2 - 1, paramInt3) != paramaji) {
/* 6249 */         return false;
/*      */       }
/*      */     }
/* 6252 */     else if (this.a.a(paramInt1, paramInt2 + 1, paramInt3) != paramaji) {
/* 6253 */       return false;
/*      */     }
/*      */     
/*      */ 
/* 6257 */     boolean bool = false;
/* 6258 */     float f1 = 0.5F;
/* 6259 */     float f2 = 1.0F;
/* 6260 */     float f3 = 0.8F;
/* 6261 */     float f4 = 0.6F;
/*      */     
/*      */ 
/*      */ 
/* 6265 */     int i2 = paramaji.c(this.a, paramInt1, paramInt2, paramInt3);
/*      */     
/* 6267 */     localbmh.b(this.k > 0.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2 - 1, paramInt3));
/* 6268 */     localbmh.b(f1, f1, f1);
/* 6269 */     a(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 0));
/* 6270 */     bool = true;
/*      */     
/* 6272 */     localbmh.b(this.l < 1.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2 + 1, paramInt3));
/* 6273 */     localbmh.b(f2, f2, f2);
/* 6274 */     b(paramaji, paramInt1, paramInt2, paramInt3, a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 1));
/* 6275 */     bool = true;
/*      */     
/*      */ 
/* 6278 */     localbmh.b(this.m > 0.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 - 1));
/* 6279 */     localbmh.b(f3, f3, f3);
/* 6280 */     rf localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 2);
/* 6281 */     c(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 6282 */     bool = true;
/* 6283 */     this.e = false;
/*      */     
/*      */ 
/*      */ 
/* 6287 */     localbmh.b(this.n < 1.0D ? i2 : paramaji.c(this.a, paramInt1, paramInt2, paramInt3 + 1));
/* 6288 */     localbmh.b(f3, f3, f3);
/* 6289 */     localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 3);
/* 6290 */     d(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 6291 */     bool = true;
/* 6292 */     this.e = false;
/*      */     
/*      */ 
/*      */ 
/* 6296 */     localbmh.b(this.i > 0.0D ? i2 : paramaji.c(this.a, paramInt1 - 1, paramInt2, paramInt3));
/* 6297 */     localbmh.b(f4, f4, f4);
/* 6298 */     localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 4);
/* 6299 */     e(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 6300 */     bool = true;
/* 6301 */     this.e = false;
/*      */     
/*      */ 
/* 6304 */     localbmh.b(this.j < 1.0D ? i2 : paramaji.c(this.a, paramInt1 + 1, paramInt2, paramInt3));
/* 6305 */     localbmh.b(f4, f4, f4);
/* 6306 */     localrf = a(paramaji, this.a, paramInt1, paramInt2, paramInt3, 5);
/* 6307 */     f(paramaji, paramInt1, paramInt2, paramInt3, localrf);
/* 6308 */     bool = true;
/* 6309 */     this.e = false;
/*      */     
/* 6311 */     return bool;
/*      */   }
/*      */   
/*      */   public void a(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6315 */     bmh localbmh = bmh.a;
/*      */     
/* 6317 */     if (b()) paramrf = this.d;
/* 6318 */     double d1 = paramrf.a(this.i * 16.0D);
/* 6319 */     double d2 = paramrf.a(this.j * 16.0D);
/* 6320 */     double d3 = paramrf.b(this.m * 16.0D);
/* 6321 */     double d4 = paramrf.b(this.n * 16.0D);
/*      */     
/* 6323 */     if ((this.i < 0.0D) || (this.j > 1.0D)) {
/* 6324 */       d1 = paramrf.c();
/* 6325 */       d2 = paramrf.d();
/*      */     }
/* 6327 */     if ((this.m < 0.0D) || (this.n > 1.0D)) {
/* 6328 */       d3 = paramrf.e();
/* 6329 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6332 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6334 */     if (this.w == 2) {
/* 6335 */       d1 = paramrf.a(this.m * 16.0D);
/* 6336 */       d3 = paramrf.b(16.0D - this.j * 16.0D);
/* 6337 */       d2 = paramrf.a(this.n * 16.0D);
/* 6338 */       d4 = paramrf.b(16.0D - this.i * 16.0D);
/*      */       
/* 6340 */       d5 = d2;
/* 6341 */       d6 = d1;
/* 6342 */       d7 = d3;
/* 6343 */       d8 = d4;
/* 6344 */       d5 = d1;
/* 6345 */       d6 = d2;
/* 6346 */       d3 = d4;
/* 6347 */       d4 = d7;
/* 6348 */     } else if (this.w == 1)
/*      */     {
/* 6350 */       d1 = paramrf.a(16.0D - this.n * 16.0D);
/* 6351 */       d3 = paramrf.b(this.i * 16.0D);
/* 6352 */       d2 = paramrf.a(16.0D - this.m * 16.0D);
/* 6353 */       d4 = paramrf.b(this.j * 16.0D);
/*      */       
/*      */ 
/* 6356 */       d5 = d2;
/* 6357 */       d6 = d1;
/* 6358 */       d7 = d3;
/* 6359 */       d8 = d4;
/* 6360 */       d1 = d5;
/* 6361 */       d2 = d6;
/* 6362 */       d7 = d4;
/* 6363 */       d8 = d3;
/* 6364 */     } else if (this.w == 3) {
/* 6365 */       d1 = paramrf.a(16.0D - this.i * 16.0D);
/* 6366 */       d2 = paramrf.a(16.0D - this.j * 16.0D);
/* 6367 */       d3 = paramrf.b(16.0D - this.m * 16.0D);
/* 6368 */       d4 = paramrf.b(16.0D - this.n * 16.0D);
/*      */       
/* 6370 */       d5 = d2;
/* 6371 */       d6 = d1;
/* 6372 */       d7 = d3;
/* 6373 */       d8 = d4;
/*      */     }
/*      */     
/* 6376 */     double d9 = paramDouble1 + this.i;
/* 6377 */     double d10 = paramDouble1 + this.j;
/* 6378 */     double d11 = paramDouble2 + this.k;
/* 6379 */     double d12 = paramDouble3 + this.m;
/* 6380 */     double d13 = paramDouble3 + this.n;
/*      */     
/* 6382 */     if (this.h) {
/* 6383 */       d9 = paramDouble1 + this.j;
/* 6384 */       d10 = paramDouble1 + this.i;
/*      */     }
/*      */     
/* 6387 */     if (this.x) {
/* 6388 */       localbmh.b(this.aq, this.au, this.ay);
/* 6389 */       localbmh.b(this.am);
/* 6390 */       localbmh.a(d9, d11, d13, d6, d8);
/*      */       
/* 6392 */       localbmh.b(this.ar, this.av, this.az);
/* 6393 */       localbmh.b(this.an);
/* 6394 */       localbmh.a(d9, d11, d12, d1, d3);
/*      */       
/* 6396 */       localbmh.b(this.as, this.aw, this.aA);
/* 6397 */       localbmh.b(this.ao);
/* 6398 */       localbmh.a(d10, d11, d12, d5, d7);
/*      */       
/* 6400 */       localbmh.b(this.at, this.ax, this.aB);
/* 6401 */       localbmh.b(this.ap);
/* 6402 */       localbmh.a(d10, d11, d13, d2, d4);
/*      */     } else {
/* 6404 */       localbmh.a(d9, d11, d13, d6, d8);
/* 6405 */       localbmh.a(d9, d11, d12, d1, d3);
/* 6406 */       localbmh.a(d10, d11, d12, d5, d7);
/* 6407 */       localbmh.a(d10, d11, d13, d2, d4);
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6412 */     bmh localbmh = bmh.a;
/*      */     
/* 6414 */     if (b()) paramrf = this.d;
/* 6415 */     double d1 = paramrf.a(this.i * 16.0D);
/* 6416 */     double d2 = paramrf.a(this.j * 16.0D);
/* 6417 */     double d3 = paramrf.b(this.m * 16.0D);
/* 6418 */     double d4 = paramrf.b(this.n * 16.0D);
/*      */     
/* 6420 */     if ((this.i < 0.0D) || (this.j > 1.0D)) {
/* 6421 */       d1 = paramrf.c();
/* 6422 */       d2 = paramrf.d();
/*      */     }
/* 6424 */     if ((this.m < 0.0D) || (this.n > 1.0D)) {
/* 6425 */       d3 = paramrf.e();
/* 6426 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6429 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6431 */     if (this.v == 1) {
/* 6432 */       d1 = paramrf.a(this.m * 16.0D);
/* 6433 */       d3 = paramrf.b(16.0D - this.j * 16.0D);
/* 6434 */       d2 = paramrf.a(this.n * 16.0D);
/* 6435 */       d4 = paramrf.b(16.0D - this.i * 16.0D);
/*      */       
/* 6437 */       d5 = d2;
/* 6438 */       d6 = d1;
/* 6439 */       d7 = d3;
/* 6440 */       d8 = d4;
/* 6441 */       d5 = d1;
/* 6442 */       d6 = d2;
/* 6443 */       d3 = d4;
/* 6444 */       d4 = d7;
/* 6445 */     } else if (this.v == 2)
/*      */     {
/* 6447 */       d1 = paramrf.a(16.0D - this.n * 16.0D);
/* 6448 */       d3 = paramrf.b(this.i * 16.0D);
/* 6449 */       d2 = paramrf.a(16.0D - this.m * 16.0D);
/* 6450 */       d4 = paramrf.b(this.j * 16.0D);
/*      */       
/*      */ 
/* 6453 */       d5 = d2;
/* 6454 */       d6 = d1;
/* 6455 */       d7 = d3;
/* 6456 */       d8 = d4;
/* 6457 */       d1 = d5;
/* 6458 */       d2 = d6;
/* 6459 */       d7 = d4;
/* 6460 */       d8 = d3;
/* 6461 */     } else if (this.v == 3) {
/* 6462 */       d1 = paramrf.a(16.0D - this.i * 16.0D);
/* 6463 */       d2 = paramrf.a(16.0D - this.j * 16.0D);
/* 6464 */       d3 = paramrf.b(16.0D - this.m * 16.0D);
/* 6465 */       d4 = paramrf.b(16.0D - this.n * 16.0D);
/*      */       
/* 6467 */       d5 = d2;
/* 6468 */       d6 = d1;
/* 6469 */       d7 = d3;
/* 6470 */       d8 = d4;
/*      */     }
/*      */     
/* 6473 */     double d9 = paramDouble1 + this.i;
/* 6474 */     double d10 = paramDouble1 + this.j;
/* 6475 */     double d11 = paramDouble2 + this.l;
/* 6476 */     double d12 = paramDouble3 + this.m;
/* 6477 */     double d13 = paramDouble3 + this.n;
/*      */     
/* 6479 */     if (this.h) {
/* 6480 */       d9 = paramDouble1 + this.j;
/* 6481 */       d10 = paramDouble1 + this.i;
/*      */     }
/*      */     
/* 6484 */     if (this.x) {
/* 6485 */       localbmh.b(this.aq, this.au, this.ay);
/* 6486 */       localbmh.b(this.am);
/* 6487 */       localbmh.a(d10, d11, d13, d2, d4);
/*      */       
/* 6489 */       localbmh.b(this.ar, this.av, this.az);
/* 6490 */       localbmh.b(this.an);
/* 6491 */       localbmh.a(d10, d11, d12, d5, d7);
/*      */       
/* 6493 */       localbmh.b(this.as, this.aw, this.aA);
/* 6494 */       localbmh.b(this.ao);
/* 6495 */       localbmh.a(d9, d11, d12, d1, d3);
/*      */       
/* 6497 */       localbmh.b(this.at, this.ax, this.aB);
/* 6498 */       localbmh.b(this.ap);
/* 6499 */       localbmh.a(d9, d11, d13, d6, d8);
/*      */     } else {
/* 6501 */       localbmh.a(d10, d11, d13, d2, d4);
/* 6502 */       localbmh.a(d10, d11, d12, d5, d7);
/* 6503 */       localbmh.a(d9, d11, d12, d1, d3);
/* 6504 */       localbmh.a(d9, d11, d13, d6, d8);
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6509 */     bmh localbmh = bmh.a;
/*      */     
/* 6511 */     if (b()) paramrf = this.d;
/* 6512 */     double d1 = paramrf.a(this.i * 16.0D);
/* 6513 */     double d2 = paramrf.a(this.j * 16.0D);
/* 6514 */     if (this.f) {
/* 6515 */       d2 = paramrf.a((1.0D - this.i) * 16.0D);
/* 6516 */       d1 = paramrf.a((1.0D - this.j) * 16.0D);
/*      */     }
/* 6518 */     double d3 = paramrf.b(16.0D - this.l * 16.0D);
/* 6519 */     double d4 = paramrf.b(16.0D - this.k * 16.0D);
/*      */     
/* 6521 */     if (this.e) {
/* 6522 */       d5 = d1;
/* 6523 */       d1 = d2;
/* 6524 */       d2 = d5;
/*      */     }
/*      */     
/* 6527 */     if ((this.i < 0.0D) || (this.j > 1.0D)) {
/* 6528 */       d1 = paramrf.c();
/* 6529 */       d2 = paramrf.d();
/*      */     }
/* 6531 */     if ((this.k < 0.0D) || (this.l > 1.0D)) {
/* 6532 */       d3 = paramrf.e();
/* 6533 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6536 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6538 */     if (this.r == 2) {
/* 6539 */       d1 = paramrf.a(this.k * 16.0D);
/* 6540 */       d2 = paramrf.a(this.l * 16.0D);
/* 6541 */       d3 = paramrf.b(16.0D - this.i * 16.0D);
/* 6542 */       d4 = paramrf.b(16.0D - this.j * 16.0D);
/*      */       
/* 6544 */       d5 = d2;
/* 6545 */       d6 = d1;
/* 6546 */       d7 = d3;
/* 6547 */       d8 = d4;
/* 6548 */       d5 = d1;
/* 6549 */       d6 = d2;
/* 6550 */       d3 = d4;
/* 6551 */       d4 = d7;
/* 6552 */     } else if (this.r == 1)
/*      */     {
/* 6554 */       d1 = paramrf.a(16.0D - this.l * 16.0D);
/* 6555 */       d2 = paramrf.a(16.0D - this.k * 16.0D);
/* 6556 */       d3 = paramrf.b(this.j * 16.0D);
/* 6557 */       d4 = paramrf.b(this.i * 16.0D);
/*      */       
/*      */ 
/* 6560 */       d5 = d2;
/* 6561 */       d6 = d1;
/* 6562 */       d7 = d3;
/* 6563 */       d8 = d4;
/* 6564 */       d1 = d5;
/* 6565 */       d2 = d6;
/* 6566 */       d7 = d4;
/* 6567 */       d8 = d3;
/* 6568 */     } else if (this.r == 3) {
/* 6569 */       d1 = paramrf.a(16.0D - this.i * 16.0D);
/* 6570 */       d2 = paramrf.a(16.0D - this.j * 16.0D);
/* 6571 */       d3 = paramrf.b(this.l * 16.0D);
/* 6572 */       d4 = paramrf.b(this.k * 16.0D);
/*      */       
/* 6574 */       d5 = d2;
/* 6575 */       d6 = d1;
/* 6576 */       d7 = d3;
/* 6577 */       d8 = d4;
/*      */     }
/*      */     
/* 6580 */     double d9 = paramDouble1 + this.i;
/* 6581 */     double d10 = paramDouble1 + this.j;
/* 6582 */     double d11 = paramDouble2 + this.k;
/* 6583 */     double d12 = paramDouble2 + this.l;
/* 6584 */     double d13 = paramDouble3 + this.m;
/*      */     
/* 6586 */     if (this.h) {
/* 6587 */       d9 = paramDouble1 + this.j;
/* 6588 */       d10 = paramDouble1 + this.i;
/*      */     }
/*      */     
/* 6591 */     if (this.x) {
/* 6592 */       localbmh.b(this.aq, this.au, this.ay);
/* 6593 */       localbmh.b(this.am);
/* 6594 */       localbmh.a(d9, d12, d13, d5, d7);
/*      */       
/* 6596 */       localbmh.b(this.ar, this.av, this.az);
/* 6597 */       localbmh.b(this.an);
/* 6598 */       localbmh.a(d10, d12, d13, d1, d3);
/*      */       
/* 6600 */       localbmh.b(this.as, this.aw, this.aA);
/* 6601 */       localbmh.b(this.ao);
/* 6602 */       localbmh.a(d10, d11, d13, d6, d8);
/*      */       
/* 6604 */       localbmh.b(this.at, this.ax, this.aB);
/* 6605 */       localbmh.b(this.ap);
/* 6606 */       localbmh.a(d9, d11, d13, d2, d4);
/*      */     } else {
/* 6608 */       localbmh.a(d9, d12, d13, d5, d7);
/* 6609 */       localbmh.a(d10, d12, d13, d1, d3);
/* 6610 */       localbmh.a(d10, d11, d13, d6, d8);
/* 6611 */       localbmh.a(d9, d11, d13, d2, d4);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6616 */     bmh localbmh = bmh.a;
/*      */     
/* 6618 */     if (b()) paramrf = this.d;
/* 6619 */     double d1 = paramrf.a(this.i * 16.0D);
/* 6620 */     double d2 = paramrf.a(this.j * 16.0D);
/* 6621 */     double d3 = paramrf.b(16.0D - this.l * 16.0D);
/* 6622 */     double d4 = paramrf.b(16.0D - this.k * 16.0D);
/*      */     
/* 6624 */     if (this.e) {
/* 6625 */       d5 = d1;
/* 6626 */       d1 = d2;
/* 6627 */       d2 = d5;
/*      */     }
/*      */     
/* 6630 */     if ((this.i < 0.0D) || (this.j > 1.0D)) {
/* 6631 */       d1 = paramrf.c();
/* 6632 */       d2 = paramrf.d();
/*      */     }
/* 6634 */     if ((this.k < 0.0D) || (this.l > 1.0D)) {
/* 6635 */       d3 = paramrf.e();
/* 6636 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6639 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6641 */     if (this.s == 1) {
/* 6642 */       d1 = paramrf.a(this.k * 16.0D);
/* 6643 */       d4 = paramrf.b(16.0D - this.i * 16.0D);
/* 6644 */       d2 = paramrf.a(this.l * 16.0D);
/* 6645 */       d3 = paramrf.b(16.0D - this.j * 16.0D);
/*      */       
/* 6647 */       d5 = d2;
/* 6648 */       d6 = d1;
/* 6649 */       d7 = d3;
/* 6650 */       d8 = d4;
/* 6651 */       d5 = d1;
/* 6652 */       d6 = d2;
/* 6653 */       d3 = d4;
/* 6654 */       d4 = d7;
/* 6655 */     } else if (this.s == 2)
/*      */     {
/* 6657 */       d1 = paramrf.a(16.0D - this.l * 16.0D);
/* 6658 */       d3 = paramrf.b(this.i * 16.0D);
/* 6659 */       d2 = paramrf.a(16.0D - this.k * 16.0D);
/* 6660 */       d4 = paramrf.b(this.j * 16.0D);
/*      */       
/*      */ 
/* 6663 */       d5 = d2;
/* 6664 */       d6 = d1;
/* 6665 */       d7 = d3;
/* 6666 */       d8 = d4;
/* 6667 */       d1 = d5;
/* 6668 */       d2 = d6;
/* 6669 */       d7 = d4;
/* 6670 */       d8 = d3;
/* 6671 */     } else if (this.s == 3) {
/* 6672 */       d1 = paramrf.a(16.0D - this.i * 16.0D);
/* 6673 */       d2 = paramrf.a(16.0D - this.j * 16.0D);
/* 6674 */       d3 = paramrf.b(this.l * 16.0D);
/* 6675 */       d4 = paramrf.b(this.k * 16.0D);
/*      */       
/* 6677 */       d5 = d2;
/* 6678 */       d6 = d1;
/* 6679 */       d7 = d3;
/* 6680 */       d8 = d4;
/*      */     }
/*      */     
/* 6683 */     double d9 = paramDouble1 + this.i;
/* 6684 */     double d10 = paramDouble1 + this.j;
/* 6685 */     double d11 = paramDouble2 + this.k;
/* 6686 */     double d12 = paramDouble2 + this.l;
/* 6687 */     double d13 = paramDouble3 + this.n;
/*      */     
/* 6689 */     if (this.h) {
/* 6690 */       d9 = paramDouble1 + this.j;
/* 6691 */       d10 = paramDouble1 + this.i;
/*      */     }
/*      */     
/* 6694 */     if (this.x) {
/* 6695 */       localbmh.b(this.aq, this.au, this.ay);
/* 6696 */       localbmh.b(this.am);
/* 6697 */       localbmh.a(d9, d12, d13, d1, d3);
/*      */       
/* 6699 */       localbmh.b(this.ar, this.av, this.az);
/* 6700 */       localbmh.b(this.an);
/* 6701 */       localbmh.a(d9, d11, d13, d6, d8);
/*      */       
/* 6703 */       localbmh.b(this.as, this.aw, this.aA);
/* 6704 */       localbmh.b(this.ao);
/* 6705 */       localbmh.a(d10, d11, d13, d2, d4);
/*      */       
/* 6707 */       localbmh.b(this.at, this.ax, this.aB);
/* 6708 */       localbmh.b(this.ap);
/* 6709 */       localbmh.a(d10, d12, d13, d5, d7);
/*      */     } else {
/* 6711 */       localbmh.a(d9, d12, d13, d1, d3);
/* 6712 */       localbmh.a(d9, d11, d13, d6, d8);
/* 6713 */       localbmh.a(d10, d11, d13, d2, d4);
/* 6714 */       localbmh.a(d10, d12, d13, d5, d7);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6719 */     bmh localbmh = bmh.a;
/*      */     
/* 6721 */     if (b()) paramrf = this.d;
/* 6722 */     double d1 = paramrf.a(this.m * 16.0D);
/* 6723 */     double d2 = paramrf.a(this.n * 16.0D);
/* 6724 */     double d3 = paramrf.b(16.0D - this.l * 16.0D);
/* 6725 */     double d4 = paramrf.b(16.0D - this.k * 16.0D);
/*      */     
/* 6727 */     if (this.e) {
/* 6728 */       d5 = d1;
/* 6729 */       d1 = d2;
/* 6730 */       d2 = d5;
/*      */     }
/*      */     
/* 6733 */     if ((this.m < 0.0D) || (this.n > 1.0D)) {
/* 6734 */       d1 = paramrf.c();
/* 6735 */       d2 = paramrf.d();
/*      */     }
/* 6737 */     if ((this.k < 0.0D) || (this.l > 1.0D)) {
/* 6738 */       d3 = paramrf.e();
/* 6739 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6742 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6744 */     if (this.u == 1) {
/* 6745 */       d1 = paramrf.a(this.k * 16.0D);
/* 6746 */       d3 = paramrf.b(16.0D - this.n * 16.0D);
/* 6747 */       d2 = paramrf.a(this.l * 16.0D);
/* 6748 */       d4 = paramrf.b(16.0D - this.m * 16.0D);
/*      */       
/* 6750 */       d5 = d2;
/* 6751 */       d6 = d1;
/* 6752 */       d7 = d3;
/* 6753 */       d8 = d4;
/* 6754 */       d5 = d1;
/* 6755 */       d6 = d2;
/* 6756 */       d3 = d4;
/* 6757 */       d4 = d7;
/* 6758 */     } else if (this.u == 2)
/*      */     {
/* 6760 */       d1 = paramrf.a(16.0D - this.l * 16.0D);
/* 6761 */       d3 = paramrf.b(this.m * 16.0D);
/* 6762 */       d2 = paramrf.a(16.0D - this.k * 16.0D);
/* 6763 */       d4 = paramrf.b(this.n * 16.0D);
/*      */       
/*      */ 
/* 6766 */       d5 = d2;
/* 6767 */       d6 = d1;
/* 6768 */       d7 = d3;
/* 6769 */       d8 = d4;
/* 6770 */       d1 = d5;
/* 6771 */       d2 = d6;
/* 6772 */       d7 = d4;
/* 6773 */       d8 = d3;
/* 6774 */     } else if (this.u == 3) {
/* 6775 */       d1 = paramrf.a(16.0D - this.m * 16.0D);
/* 6776 */       d2 = paramrf.a(16.0D - this.n * 16.0D);
/* 6777 */       d3 = paramrf.b(this.l * 16.0D);
/* 6778 */       d4 = paramrf.b(this.k * 16.0D);
/*      */       
/* 6780 */       d5 = d2;
/* 6781 */       d6 = d1;
/* 6782 */       d7 = d3;
/* 6783 */       d8 = d4;
/*      */     }
/*      */     
/* 6786 */     double d9 = paramDouble1 + this.i;
/* 6787 */     double d10 = paramDouble2 + this.k;
/* 6788 */     double d11 = paramDouble2 + this.l;
/* 6789 */     double d12 = paramDouble3 + this.m;
/* 6790 */     double d13 = paramDouble3 + this.n;
/*      */     
/* 6792 */     if (this.h) {
/* 6793 */       d12 = paramDouble3 + this.n;
/* 6794 */       d13 = paramDouble3 + this.m;
/*      */     }
/*      */     
/* 6797 */     if (this.x) {
/* 6798 */       localbmh.b(this.aq, this.au, this.ay);
/* 6799 */       localbmh.b(this.am);
/* 6800 */       localbmh.a(d9, d11, d13, d5, d7);
/*      */       
/* 6802 */       localbmh.b(this.ar, this.av, this.az);
/* 6803 */       localbmh.b(this.an);
/* 6804 */       localbmh.a(d9, d11, d12, d1, d3);
/*      */       
/* 6806 */       localbmh.b(this.as, this.aw, this.aA);
/* 6807 */       localbmh.b(this.ao);
/* 6808 */       localbmh.a(d9, d10, d12, d6, d8);
/*      */       
/* 6810 */       localbmh.b(this.at, this.ax, this.aB);
/* 6811 */       localbmh.b(this.ap);
/* 6812 */       localbmh.a(d9, d10, d13, d2, d4);
/*      */     } else {
/* 6814 */       localbmh.a(d9, d11, d13, d5, d7);
/* 6815 */       localbmh.a(d9, d11, d12, d1, d3);
/* 6816 */       localbmh.a(d9, d10, d12, d6, d8);
/* 6817 */       localbmh.a(d9, d10, d13, d2, d4);
/*      */     }
/*      */   }
/*      */   
/*      */   public void f(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, rf paramrf) {
/* 6822 */     bmh localbmh = bmh.a;
/*      */     
/* 6824 */     if (b()) paramrf = this.d;
/* 6825 */     double d1 = paramrf.a(this.m * 16.0D);
/* 6826 */     double d2 = paramrf.a(this.n * 16.0D);
/* 6827 */     if (this.f) {
/* 6828 */       d2 = paramrf.a((1.0D - this.m) * 16.0D);
/* 6829 */       d1 = paramrf.a((1.0D - this.n) * 16.0D);
/*      */     }
/* 6831 */     double d3 = paramrf.b(16.0D - this.l * 16.0D);
/* 6832 */     double d4 = paramrf.b(16.0D - this.k * 16.0D);
/*      */     
/* 6834 */     if (this.e) {
/* 6835 */       d5 = d1;
/* 6836 */       d1 = d2;
/* 6837 */       d2 = d5;
/*      */     }
/*      */     
/* 6840 */     if ((this.m < 0.0D) || (this.n > 1.0D)) {
/* 6841 */       d1 = paramrf.c();
/* 6842 */       d2 = paramrf.d();
/*      */     }
/* 6844 */     if ((this.k < 0.0D) || (this.l > 1.0D)) {
/* 6845 */       d3 = paramrf.e();
/* 6846 */       d4 = paramrf.f();
/*      */     }
/*      */     
/* 6849 */     double d5 = d2;double d6 = d1;double d7 = d3;double d8 = d4;
/*      */     
/* 6851 */     if (this.t == 2) {
/* 6852 */       d1 = paramrf.a(this.k * 16.0D);
/* 6853 */       d3 = paramrf.b(16.0D - this.m * 16.0D);
/* 6854 */       d2 = paramrf.a(this.l * 16.0D);
/* 6855 */       d4 = paramrf.b(16.0D - this.n * 16.0D);
/*      */       
/* 6857 */       d5 = d2;
/* 6858 */       d6 = d1;
/* 6859 */       d7 = d3;
/* 6860 */       d8 = d4;
/* 6861 */       d5 = d1;
/* 6862 */       d6 = d2;
/* 6863 */       d3 = d4;
/* 6864 */       d4 = d7;
/* 6865 */     } else if (this.t == 1)
/*      */     {
/* 6867 */       d1 = paramrf.a(16.0D - this.l * 16.0D);
/* 6868 */       d3 = paramrf.b(this.n * 16.0D);
/* 6869 */       d2 = paramrf.a(16.0D - this.k * 16.0D);
/* 6870 */       d4 = paramrf.b(this.m * 16.0D);
/*      */       
/*      */ 
/* 6873 */       d5 = d2;
/* 6874 */       d6 = d1;
/* 6875 */       d7 = d3;
/* 6876 */       d8 = d4;
/* 6877 */       d1 = d5;
/* 6878 */       d2 = d6;
/* 6879 */       d7 = d4;
/* 6880 */       d8 = d3;
/* 6881 */     } else if (this.t == 3) {
/* 6882 */       d1 = paramrf.a(16.0D - this.m * 16.0D);
/* 6883 */       d2 = paramrf.a(16.0D - this.n * 16.0D);
/* 6884 */       d3 = paramrf.b(this.l * 16.0D);
/* 6885 */       d4 = paramrf.b(this.k * 16.0D);
/*      */       
/* 6887 */       d5 = d2;
/* 6888 */       d6 = d1;
/* 6889 */       d7 = d3;
/* 6890 */       d8 = d4;
/*      */     }
/*      */     
/* 6893 */     double d9 = paramDouble1 + this.j;
/* 6894 */     double d10 = paramDouble2 + this.k;
/* 6895 */     double d11 = paramDouble2 + this.l;
/* 6896 */     double d12 = paramDouble3 + this.m;
/* 6897 */     double d13 = paramDouble3 + this.n;
/*      */     
/* 6899 */     if (this.h) {
/* 6900 */       d12 = paramDouble3 + this.n;
/* 6901 */       d13 = paramDouble3 + this.m;
/*      */     }
/*      */     
/* 6904 */     if (this.x) {
/* 6905 */       localbmh.b(this.aq, this.au, this.ay);
/* 6906 */       localbmh.b(this.am);
/* 6907 */       localbmh.a(d9, d10, d13, d6, d8);
/*      */       
/* 6909 */       localbmh.b(this.ar, this.av, this.az);
/* 6910 */       localbmh.b(this.an);
/* 6911 */       localbmh.a(d9, d10, d12, d2, d4);
/*      */       
/* 6913 */       localbmh.b(this.as, this.aw, this.aA);
/* 6914 */       localbmh.b(this.ao);
/* 6915 */       localbmh.a(d9, d11, d12, d5, d7);
/*      */       
/* 6917 */       localbmh.b(this.at, this.ax, this.aB);
/* 6918 */       localbmh.b(this.ap);
/* 6919 */       localbmh.a(d9, d11, d13, d1, d3);
/*      */     } else {
/* 6921 */       localbmh.a(d9, d10, d13, d6, d8);
/* 6922 */       localbmh.a(d9, d10, d12, d2, d4);
/* 6923 */       localbmh.a(d9, d11, d12, d5, d7);
/* 6924 */       localbmh.a(d9, d11, d13, d1, d3);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   private int S;
/*      */   
/*      */   private int T;
/*      */   
/*      */   private int U;
/*      */   
/*      */   private int V;
/*      */   
/*      */   private int W;
/*      */   private int X;
/*      */   private int Y;
/*      */   private int Z;
/*      */   private int aa;
/*      */   private int ab;
/*      */   private int ac;
/*      */   private int ad;
/*      */   private int ae;
/*      */   private int af;
/*      */   private int ag;
/*      */   private int ah;
/*      */   private int ai;
/*      */   private int aj;
/*      */   private int ak;
/*      */   private int al;
/*      */   private int am;
/*      */   private int an;
/*      */   private int ao;
/*      */   private int ap;
/*      */   
/*      */   public void a(aji paramaji, int paramInt, float paramFloat)
/*      */   {
/* 6960 */     bmh localbmh = bmh.a;
/*      */     
/* 6962 */     int i1 = paramaji == ajn.c ? 1 : 0;
/*      */     
/* 6964 */     if ((paramaji == ajn.z) || (paramaji == ajn.cd) || (paramaji == ajn.al))
/* 6965 */       paramInt = 3;
/*      */     float f3;
/*      */     float f5;
/* 6968 */     if (this.c) {
/* 6969 */       i2 = paramaji.i(paramInt);
/* 6970 */       if (i1 != 0) {
/* 6971 */         i2 = 16777215;
/*      */       }
/* 6973 */       float f1 = (i2 >> 16 & 0xFF) / 255.0F;
/* 6974 */       f3 = (i2 >> 8 & 0xFF) / 255.0F;
/* 6975 */       f5 = (i2 & 0xFF) / 255.0F;
/*      */       
/* 6977 */       GL11.glColor4f(f1 * paramFloat, f3 * paramFloat, f5 * paramFloat, 1.0F);
/*      */     }
/*      */     
/* 6980 */     int i2 = paramaji.b();
/* 6981 */     a(paramaji);
/*      */     
/* 6983 */     if ((i2 == 0) || (i2 == 31) || (i2 == 39) || (i2 == 16) || (i2 == 26)) {
/* 6984 */       if (i2 == 16) {
/* 6985 */         paramInt = 1;
/*      */       }
/* 6987 */       paramaji.g();
/* 6988 */       a(paramaji);
/* 6989 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 6990 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 6991 */       localbmh.b();
/* 6992 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 6993 */       a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0, paramInt));
/* 6994 */       localbmh.a();
/*      */       
/* 6996 */       if ((i1 != 0) && (this.c)) {
/* 6997 */         int i3 = paramaji.i(paramInt);
/* 6998 */         f3 = (i3 >> 16 & 0xFF) / 255.0F;
/* 6999 */         f5 = (i3 >> 8 & 0xFF) / 255.0F;
/* 7000 */         float f6 = (i3 & 0xFF) / 255.0F;
/*      */         
/* 7002 */         GL11.glColor4f(f3 * paramFloat, f5 * paramFloat, f6 * paramFloat, 1.0F);
/*      */       }
/*      */       
/* 7005 */       localbmh.b();
/* 7006 */       localbmh.c(0.0F, 1.0F, 0.0F);
/* 7007 */       b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1, paramInt));
/* 7008 */       localbmh.a();
/*      */       
/* 7010 */       if ((i1 != 0) && (this.c)) {
/* 7011 */         GL11.glColor4f(paramFloat, paramFloat, paramFloat, 1.0F);
/*      */       }
/*      */       
/* 7014 */       localbmh.b();
/* 7015 */       localbmh.c(0.0F, 0.0F, -1.0F);
/* 7016 */       c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2, paramInt));
/* 7017 */       localbmh.a();
/*      */       
/* 7019 */       localbmh.b();
/* 7020 */       localbmh.c(0.0F, 0.0F, 1.0F);
/* 7021 */       d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3, paramInt));
/* 7022 */       localbmh.a();
/*      */       
/* 7024 */       localbmh.b();
/* 7025 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7026 */       e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4, paramInt));
/* 7027 */       localbmh.a();
/*      */       
/* 7029 */       localbmh.b();
/* 7030 */       localbmh.c(1.0F, 0.0F, 0.0F);
/* 7031 */       f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5, paramInt));
/* 7032 */       localbmh.a();
/*      */       
/* 7034 */       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 7035 */     } else if (i2 == 1) {
/* 7036 */       localbmh.b();
/* 7037 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7038 */       rf localrf = a(paramaji, 0, paramInt);
/* 7039 */       a(localrf, -0.5D, -0.5D, -0.5D, 1.0F);
/* 7040 */       localbmh.a();
/* 7041 */     } else if (i2 == 19) {
/* 7042 */       localbmh.b();
/* 7043 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7044 */       paramaji.g();
/* 7045 */       a(paramaji, paramInt, this.l, -0.5D, -0.5D, -0.5D);
/* 7046 */       localbmh.a();
/* 7047 */     } else if (i2 == 23) {
/* 7048 */       localbmh.b();
/* 7049 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7050 */       paramaji.g();
/* 7051 */       localbmh.a();
/* 7052 */     } else if (i2 == 13) {
/* 7053 */       paramaji.g();
/* 7054 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7055 */       float f2 = 0.0625F;
/* 7056 */       localbmh.b();
/* 7057 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7058 */       a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0));
/* 7059 */       localbmh.a();
/*      */       
/* 7061 */       localbmh.b();
/* 7062 */       localbmh.c(0.0F, 1.0F, 0.0F);
/* 7063 */       b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1));
/* 7064 */       localbmh.a();
/*      */       
/* 7066 */       localbmh.b();
/* 7067 */       localbmh.c(0.0F, 0.0F, -1.0F);
/* 7068 */       localbmh.d(0.0F, 0.0F, f2);
/* 7069 */       c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2));
/* 7070 */       localbmh.d(0.0F, 0.0F, -f2);
/* 7071 */       localbmh.a();
/*      */       
/* 7073 */       localbmh.b();
/* 7074 */       localbmh.c(0.0F, 0.0F, 1.0F);
/* 7075 */       localbmh.d(0.0F, 0.0F, -f2);
/* 7076 */       d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3));
/* 7077 */       localbmh.d(0.0F, 0.0F, f2);
/* 7078 */       localbmh.a();
/*      */       
/* 7080 */       localbmh.b();
/* 7081 */       localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7082 */       localbmh.d(f2, 0.0F, 0.0F);
/* 7083 */       e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4));
/* 7084 */       localbmh.d(-f2, 0.0F, 0.0F);
/* 7085 */       localbmh.a();
/*      */       
/* 7087 */       localbmh.b();
/* 7088 */       localbmh.c(1.0F, 0.0F, 0.0F);
/* 7089 */       localbmh.d(-f2, 0.0F, 0.0F);
/* 7090 */       f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5));
/* 7091 */       localbmh.d(f2, 0.0F, 0.0F);
/* 7092 */       localbmh.a();
/*      */       
/* 7094 */       GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 7095 */     } else if (i2 == 22) {
/* 7096 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 7097 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7098 */       bls.a.a(paramaji, paramInt, paramFloat);
/* 7099 */       GL11.glEnable(32826);
/* 7100 */     } else if (i2 == 6) {
/* 7101 */       localbmh.b();
/* 7102 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7103 */       a(paramaji, paramInt, -0.5D, -0.5D, -0.5D);
/* 7104 */       localbmh.a();
/* 7105 */     } else if (i2 == 2) {
/* 7106 */       localbmh.b();
/* 7107 */       localbmh.c(0.0F, -1.0F, 0.0F);
/* 7108 */       a(paramaji, -0.5D, -0.5D, -0.5D, 0.0D, 0.0D, 0);
/* 7109 */       localbmh.a(); } else { int i4;
/* 7110 */       if (i2 == 10) {
/* 7111 */         for (i4 = 0; i4 < 2; i4++) {
/* 7112 */           if (i4 == 0) a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.5D);
/* 7113 */           if (i4 == 1) { a(0.0D, 0.0D, 0.5D, 1.0D, 0.5D, 1.0D);
/*      */           }
/* 7115 */           GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7116 */           localbmh.b();
/* 7117 */           localbmh.c(0.0F, -1.0F, 0.0F);
/* 7118 */           a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0));
/* 7119 */           localbmh.a();
/*      */           
/* 7121 */           localbmh.b();
/* 7122 */           localbmh.c(0.0F, 1.0F, 0.0F);
/* 7123 */           b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1));
/* 7124 */           localbmh.a();
/*      */           
/* 7126 */           localbmh.b();
/* 7127 */           localbmh.c(0.0F, 0.0F, -1.0F);
/* 7128 */           c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2));
/* 7129 */           localbmh.a();
/*      */           
/* 7131 */           localbmh.b();
/* 7132 */           localbmh.c(0.0F, 0.0F, 1.0F);
/* 7133 */           d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3));
/* 7134 */           localbmh.a();
/*      */           
/* 7136 */           localbmh.b();
/* 7137 */           localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7138 */           e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4));
/* 7139 */           localbmh.a();
/*      */           
/* 7141 */           localbmh.b();
/* 7142 */           localbmh.c(1.0F, 0.0F, 0.0F);
/* 7143 */           f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5));
/* 7144 */           localbmh.a();
/*      */           
/* 7146 */           GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */         }
/* 7148 */       } else if (i2 == 27) {
/* 7149 */         i4 = 0;
/* 7150 */         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7151 */         localbmh.b();
/* 7152 */         for (int i5 = 0; i5 < 8; i5++) {
/* 7153 */           int i6 = 0;
/* 7154 */           int i7 = 1;
/* 7155 */           if (i5 == 0) i6 = 2;
/* 7156 */           if (i5 == 1) i6 = 3;
/* 7157 */           if (i5 == 2) i6 = 4;
/* 7158 */           if (i5 == 3) {
/* 7159 */             i6 = 5;
/* 7160 */             i7 = 2;
/*      */           }
/* 7162 */           if (i5 == 4) {
/* 7163 */             i6 = 6;
/* 7164 */             i7 = 3;
/*      */           }
/* 7166 */           if (i5 == 5) {
/* 7167 */             i6 = 7;
/* 7168 */             i7 = 5;
/*      */           }
/* 7170 */           if (i5 == 6) {
/* 7171 */             i6 = 6;
/* 7172 */             i7 = 2;
/*      */           }
/* 7174 */           if (i5 == 7) i6 = 3;
/* 7175 */           float f7 = i6 / 16.0F;
/* 7176 */           float f8 = 1.0F - i4 / 16.0F;
/* 7177 */           float f9 = 1.0F - (i4 + i7) / 16.0F;
/* 7178 */           i4 += i7;
/* 7179 */           a(0.5F - f7, f9, 0.5F - f7, 0.5F + f7, f8, 0.5F + f7);
/* 7180 */           localbmh.c(0.0F, -1.0F, 0.0F);
/* 7181 */           a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0));
/* 7182 */           localbmh.c(0.0F, 1.0F, 0.0F);
/* 7183 */           b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1));
/* 7184 */           localbmh.c(0.0F, 0.0F, -1.0F);
/* 7185 */           c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2));
/* 7186 */           localbmh.c(0.0F, 0.0F, 1.0F);
/* 7187 */           d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3));
/* 7188 */           localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7189 */           e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4));
/* 7190 */           localbmh.c(1.0F, 0.0F, 0.0F);
/* 7191 */           f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5));
/*      */         }
/* 7193 */         localbmh.a();
/* 7194 */         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 7195 */         a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D); } else { float f4;
/* 7196 */         if (i2 == 11) {
/* 7197 */           for (i4 = 0; i4 < 4; i4++) {
/* 7198 */             f4 = 0.125F;
/* 7199 */             if (i4 == 0) a(0.5F - f4, 0.0D, 0.0D, 0.5F + f4, 1.0D, f4 * 2.0F);
/* 7200 */             if (i4 == 1) a(0.5F - f4, 0.0D, 1.0F - f4 * 2.0F, 0.5F + f4, 1.0D, 1.0D);
/* 7201 */             f4 = 0.0625F;
/* 7202 */             if (i4 == 2) a(0.5F - f4, 1.0F - f4 * 3.0F, -f4 * 2.0F, 0.5F + f4, 1.0F - f4, 1.0F + f4 * 2.0F);
/* 7203 */             if (i4 == 3) { a(0.5F - f4, 0.5F - f4 * 3.0F, -f4 * 2.0F, 0.5F + f4, 0.5F - f4, 1.0F + f4 * 2.0F);
/*      */             }
/* 7205 */             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7206 */             localbmh.b();
/* 7207 */             localbmh.c(0.0F, -1.0F, 0.0F);
/* 7208 */             a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0));
/* 7209 */             localbmh.a();
/*      */             
/* 7211 */             localbmh.b();
/* 7212 */             localbmh.c(0.0F, 1.0F, 0.0F);
/* 7213 */             b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1));
/* 7214 */             localbmh.a();
/*      */             
/* 7216 */             localbmh.b();
/* 7217 */             localbmh.c(0.0F, 0.0F, -1.0F);
/* 7218 */             c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2));
/* 7219 */             localbmh.a();
/*      */             
/* 7221 */             localbmh.b();
/* 7222 */             localbmh.c(0.0F, 0.0F, 1.0F);
/* 7223 */             d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3));
/* 7224 */             localbmh.a();
/*      */             
/* 7226 */             localbmh.b();
/* 7227 */             localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7228 */             e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4));
/* 7229 */             localbmh.a();
/*      */             
/* 7231 */             localbmh.b();
/* 7232 */             localbmh.c(1.0F, 0.0F, 0.0F);
/* 7233 */             f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5));
/* 7234 */             localbmh.a();
/*      */             
/* 7236 */             GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */           }
/* 7238 */           a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 7239 */         } else if (i2 == 21) {
/* 7240 */           for (i4 = 0; i4 < 3; i4++) {
/* 7241 */             f4 = 0.0625F;
/* 7242 */             if (i4 == 0) a(0.5F - f4, 0.30000001192092896D, 0.0D, 0.5F + f4, 1.0D, f4 * 2.0F);
/* 7243 */             if (i4 == 1) a(0.5F - f4, 0.30000001192092896D, 1.0F - f4 * 2.0F, 0.5F + f4, 1.0D, 1.0D);
/* 7244 */             f4 = 0.0625F;
/* 7245 */             if (i4 == 2) { a(0.5F - f4, 0.5D, 0.0D, 0.5F + f4, 1.0F - f4, 1.0D);
/*      */             }
/* 7247 */             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7248 */             localbmh.b();
/* 7249 */             localbmh.c(0.0F, -1.0F, 0.0F);
/* 7250 */             a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0));
/* 7251 */             localbmh.a();
/*      */             
/* 7253 */             localbmh.b();
/* 7254 */             localbmh.c(0.0F, 1.0F, 0.0F);
/* 7255 */             b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1));
/* 7256 */             localbmh.a();
/*      */             
/* 7258 */             localbmh.b();
/* 7259 */             localbmh.c(0.0F, 0.0F, -1.0F);
/* 7260 */             c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2));
/* 7261 */             localbmh.a();
/*      */             
/* 7263 */             localbmh.b();
/* 7264 */             localbmh.c(0.0F, 0.0F, 1.0F);
/* 7265 */             d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3));
/* 7266 */             localbmh.a();
/*      */             
/* 7268 */             localbmh.b();
/* 7269 */             localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7270 */             e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4));
/* 7271 */             localbmh.a();
/*      */             
/* 7273 */             localbmh.b();
/* 7274 */             localbmh.c(1.0F, 0.0F, 0.0F);
/* 7275 */             f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5));
/* 7276 */             localbmh.a();
/*      */             
/* 7278 */             GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */           }
/* 7280 */         } else if (i2 == 32) {
/* 7281 */           for (i4 = 0; i4 < 2; i4++) {
/* 7282 */             if (i4 == 0) a(0.0D, 0.0D, 0.3125D, 1.0D, 0.8125D, 0.6875D);
/* 7283 */             if (i4 == 1) { a(0.25D, 0.0D, 0.25D, 0.75D, 1.0D, 0.75D);
/*      */             }
/* 7285 */             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7286 */             localbmh.b();
/* 7287 */             localbmh.c(0.0F, -1.0F, 0.0F);
/* 7288 */             a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0, paramInt));
/* 7289 */             localbmh.a();
/*      */             
/* 7291 */             localbmh.b();
/* 7292 */             localbmh.c(0.0F, 1.0F, 0.0F);
/* 7293 */             b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1, paramInt));
/* 7294 */             localbmh.a();
/*      */             
/* 7296 */             localbmh.b();
/* 7297 */             localbmh.c(0.0F, 0.0F, -1.0F);
/* 7298 */             c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2, paramInt));
/* 7299 */             localbmh.a();
/*      */             
/* 7301 */             localbmh.b();
/* 7302 */             localbmh.c(0.0F, 0.0F, 1.0F);
/* 7303 */             d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3, paramInt));
/* 7304 */             localbmh.a();
/*      */             
/* 7306 */             localbmh.b();
/* 7307 */             localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7308 */             e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4, paramInt));
/* 7309 */             localbmh.a();
/*      */             
/* 7311 */             localbmh.b();
/* 7312 */             localbmh.c(1.0F, 0.0F, 0.0F);
/* 7313 */             f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5, paramInt));
/* 7314 */             localbmh.a();
/*      */             
/* 7316 */             GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */           }
/* 7318 */           a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 7319 */         } else if (i2 == 35) {
/* 7320 */           GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7321 */           a((ajb)paramaji, 0, 0, 0, paramInt << 2, true);
/* 7322 */           GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 7323 */         } else if (i2 == 34) {
/* 7324 */           for (i4 = 0; i4 < 3; i4++) {
/* 7325 */             if (i4 == 0) {
/* 7326 */               a(0.125D, 0.0D, 0.125D, 0.875D, 0.1875D, 0.875D);
/* 7327 */               a(b(ajn.Z));
/* 7328 */             } else if (i4 == 1) {
/* 7329 */               a(0.1875D, 0.1875D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
/* 7330 */               a(b(ajn.bJ));
/* 7331 */             } else if (i4 == 2) {
/* 7332 */               a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 7333 */               a(b(ajn.w));
/*      */             }
/*      */             
/* 7336 */             GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7337 */             localbmh.b();
/* 7338 */             localbmh.c(0.0F, -1.0F, 0.0F);
/* 7339 */             a(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 0, paramInt));
/* 7340 */             localbmh.a();
/*      */             
/* 7342 */             localbmh.b();
/* 7343 */             localbmh.c(0.0F, 1.0F, 0.0F);
/* 7344 */             b(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 1, paramInt));
/* 7345 */             localbmh.a();
/*      */             
/* 7347 */             localbmh.b();
/* 7348 */             localbmh.c(0.0F, 0.0F, -1.0F);
/* 7349 */             c(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 2, paramInt));
/* 7350 */             localbmh.a();
/*      */             
/* 7352 */             localbmh.b();
/* 7353 */             localbmh.c(0.0F, 0.0F, 1.0F);
/* 7354 */             d(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 3, paramInt));
/* 7355 */             localbmh.a();
/*      */             
/* 7357 */             localbmh.b();
/* 7358 */             localbmh.c(-1.0F, 0.0F, 0.0F);
/* 7359 */             e(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 4, paramInt));
/* 7360 */             localbmh.a();
/*      */             
/* 7362 */             localbmh.b();
/* 7363 */             localbmh.c(1.0F, 0.0F, 0.0F);
/* 7364 */             f(paramaji, 0.0D, 0.0D, 0.0D, a(paramaji, 5, paramInt));
/* 7365 */             localbmh.a();
/*      */             
/* 7367 */             GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */           }
/* 7369 */           a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 7370 */           a();
/* 7371 */         } else if (i2 == 38) {
/* 7372 */           GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 7373 */           a((aln)paramaji, 0, 0, 0, 0, true);
/* 7374 */           GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/*      */         } } } }
/*      */   
/*      */   private float aq;
/*      */   private float ar;
/*      */   
/* 7380 */   public static boolean a(int paramInt) { if (paramInt == 0) return true;
/* 7381 */     if (paramInt == 31) return true;
/* 7382 */     if (paramInt == 39) return true;
/* 7383 */     if (paramInt == 13) return true;
/* 7384 */     if (paramInt == 10) return true;
/* 7385 */     if (paramInt == 11) return true;
/* 7386 */     if (paramInt == 27) return true;
/* 7387 */     if (paramInt == 22) return true;
/* 7388 */     if (paramInt == 21) return true;
/* 7389 */     if (paramInt == 16) return true;
/* 7390 */     if (paramInt == 26) return true;
/* 7391 */     if (paramInt == 32) return true;
/* 7392 */     if (paramInt == 34) return true;
/* 7393 */     if (paramInt == 35) return true;
/* 7394 */     if (paramInt == -1) return false;
/* 7395 */     return false; }
/*      */   
/*      */   private float as;
/*      */   
/* 7399 */   public rf a(aji paramaji, ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return b(paramaji.e(paramahl, paramInt1, paramInt2, paramInt3, paramInt4)); }
/*      */   
/*      */   private float at;
/*      */   
/* 7403 */   public rf a(aji paramaji, int paramInt1, int paramInt2) { return b(paramaji.a(paramInt1, paramInt2)); }
/*      */   
/*      */   private float au;
/*      */   
/* 7407 */   public rf a(aji paramaji, int paramInt) { return b(paramaji.h(paramInt)); }
/*      */   
/*      */   private float av;
/*      */   
/* 7411 */   public rf b(aji paramaji) { return b(paramaji.h(1)); }
/*      */   
/*      */   private float aw;
/*      */   
/* 7415 */   public rf b(rf paramrf) { if (paramrf == null) {
/* 7416 */       paramrf = ((bpz)bao.B().P().b(bpz.b)).b("missingno");
/*      */     }
/* 7418 */     return paramrf;
/*      */   }
/*      */   
/*      */   private float ax;
/*      */   private float ay;
/*      */   private float az;
/*      */   private float aA;
/*      */   private float aB;
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */