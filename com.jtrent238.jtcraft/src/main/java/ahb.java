/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Collection;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
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
/*      */ public abstract class ahb
/*      */   implements ahl
/*      */ {
/*      */   public boolean d;
/*   57 */   public List e = new ArrayList();
/*   58 */   protected List f = new ArrayList();
/*   59 */   public List g = new ArrayList();
/*   60 */   private List a = new ArrayList();
/*   61 */   private List b = new ArrayList();
/*   62 */   public List h = new ArrayList();
/*   63 */   public List i = new ArrayList();
/*      */   
/*   65 */   private long c = 16777215L;
/*      */   
/*      */   public int j;
/*      */   
/*   69 */   protected int k = new Random().nextInt();
/*   70 */   protected final int l = 1013904223;
/*      */   protected float m;
/*      */   protected float n;
/*      */   protected float o;
/*      */   protected float p;
/*      */   public int q;
/*   76 */   public rd r; public Random s = new Random();
/*      */   
/*      */   public final aqo t;
/*   79 */   protected List u = new ArrayList();
/*      */   
/*      */   protected apu v;
/*      */   
/*      */   protected final azc w;
/*      */   
/*      */   protected ays x;
/*      */   
/*      */   public boolean y;
/*      */   
/*      */   public azq z;
/*      */   public final wc A;
/*   91 */   protected final wb B = new wb(this);
/*      */   public final qi C;
/*   93 */   private final Calendar J = Calendar.getInstance();
/*   94 */   protected bac D = new bac();
/*      */   
/*      */   public boolean E;
/*   97 */   protected Set F = new HashSet();
/*   98 */   private int K = this.s.nextInt(12000);
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*  103 */   protected boolean G = true;
/*  104 */   protected boolean H = true;
/*      */   
/*  106 */   private ArrayList L = new ArrayList();
/*      */   
/*      */   private boolean M;
/*      */   
/*      */   public ahu a(int paramInt1, int paramInt2)
/*      */   {
/*  112 */     if (d(paramInt1, 0, paramInt2)) {
/*  113 */       apx localapx = d(paramInt1, paramInt2);
/*      */       try {
/*  115 */         return localapx.a(paramInt1 & 0xF, paramInt2 & 0xF, this.t.e);
/*      */       } catch (Throwable localThrowable) {
/*  117 */         b localb = b.a(localThrowable, "Getting biome");
/*  118 */         k localk = localb.a("Coordinates of biome request");
/*      */         
/*  120 */         localk.a("Location", new ahc(this, paramInt1, paramInt2));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  127 */         throw new s(localb);
/*      */       }
/*      */     }
/*  130 */     return this.t.e.a(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */ 
/*      */   public aib v()
/*      */   {
/*  136 */     return this.t.e;
/*      */   }
/*      */   
/*      */   public ahb(azc paramazc, String paramString, aqo paramaqo, ahj paramahj, qi paramqi) {
/*  140 */     this.w = paramazc;
/*  141 */     this.C = paramqi;
/*  142 */     this.x = new ays(paramahj, paramString);
/*  143 */     this.t = paramaqo;
/*  144 */     this.z = new azq(paramazc);
/*      */     
/*  146 */     wc localwc = (wc)this.z.a(wc.class, "villages");
/*  147 */     if (localwc == null) {
/*  148 */       this.A = new wc(this);
/*  149 */       this.z.a("villages", this.A);
/*      */     } else {
/*  151 */       this.A = localwc;
/*  152 */       this.A.a(this);
/*      */     }
/*      */     
/*  155 */     paramaqo.a(this);
/*  156 */     this.v = j();
/*      */     
/*  158 */     B();
/*  159 */     a();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public ahb(azc paramazc, String paramString, ahj paramahj, aqo paramaqo, qi paramqi)
/*      */   {
/*  167 */     this.w = paramazc;
/*  168 */     this.C = paramqi;
/*  169 */     this.z = new azq(paramazc);
/*      */     
/*  171 */     this.x = paramazc.d();
/*      */     
/*  173 */     if (paramaqo != null) {
/*  174 */       this.t = paramaqo;
/*  175 */     } else if ((this.x != null) && (this.x.j() != 0)) {
/*  176 */       this.t = aqo.a(this.x.j());
/*      */     } else {
/*  178 */       this.t = aqo.a(0);
/*      */     }
/*      */     
/*  181 */     if (this.x == null) {
/*  182 */       this.x = new ays(paramahj, paramString);
/*      */     } else {
/*  184 */       this.x.a(paramString);
/*      */     }
/*      */     
/*  187 */     this.t.a(this);
/*  188 */     this.v = j();
/*      */     
/*  190 */     if (!this.x.w()) {
/*      */       try {
/*  192 */         a(paramahj);
/*      */       } catch (Throwable localThrowable1) {
/*  194 */         b localb = b.a(localThrowable1, "Exception initializing level");
/*      */         try
/*      */         {
/*  197 */           a(localb);
/*      */         }
/*      */         catch (Throwable localThrowable2) {}
/*      */         
/*  201 */         throw new s(localb);
/*      */       }
/*  203 */       this.x.d(true);
/*      */     }
/*      */     
/*  206 */     wc localwc = (wc)this.z.a(wc.class, "villages");
/*  207 */     if (localwc == null) {
/*  208 */       this.A = new wc(this);
/*  209 */       this.z.a("villages", this.A);
/*      */     } else {
/*  211 */       this.A = localwc;
/*  212 */       this.A.a(this);
/*      */     }
/*      */     
/*  215 */     B();
/*  216 */     a();
/*      */   }
/*      */   
/*      */   protected abstract apu j();
/*      */   
/*      */   protected void a(ahj paramahj)
/*      */   {
/*  223 */     this.x.d(true);
/*      */   }
/*      */   
/*      */   public void f() {
/*  227 */     x(8, 64, 8);
/*      */   }
/*      */   
/*      */   public aji b(int paramInt1, int paramInt2)
/*      */   {
/*  232 */     int i1 = 63;
/*  233 */     while (!c(paramInt1, i1 + 1, paramInt2)) {
/*  234 */       i1++;
/*      */     }
/*  236 */     return a(paramInt1, i1, paramInt2);
/*      */   }
/*      */   
/*      */ 
/*      */   public aji a(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  242 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000) || (paramInt2 < 0) || (paramInt2 >= 256)) {
/*  243 */       return ajn.a;
/*      */     }
/*  245 */     apx localapx = null;
/*      */     try
/*      */     {
/*  248 */       localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  249 */       return localapx.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */     } catch (Throwable localThrowable) {
/*  251 */       b localb = b.a(localThrowable, "Exception getting block type in world");
/*  252 */       k localk = localb.a("Requested block coordinates");
/*      */       
/*  254 */       localk.a("Found chunk", Boolean.valueOf(localapx == null));
/*  255 */       localk.a("Location", k.a(paramInt1, paramInt2, paramInt3));
/*      */       
/*  257 */       throw new s(localb);
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
/*      */   public boolean c(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  272 */     return a(paramInt1, paramInt2, paramInt3).o() == awt.a;
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3) {
/*  276 */     if ((paramInt2 < 0) || (paramInt2 >= 256)) return false;
/*  277 */     return c(paramInt1 >> 4, paramInt3 >> 4);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  281 */     return b(paramInt1 - paramInt4, paramInt2 - paramInt4, paramInt3 - paramInt4, paramInt1 + paramInt4, paramInt2 + paramInt4, paramInt3 + paramInt4);
/*      */   }
/*      */   
/*      */   public boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  285 */     if ((paramInt5 < 0) || (paramInt2 >= 256)) { return false;
/*      */     }
/*  287 */     paramInt1 >>= 4;
/*  288 */     paramInt3 >>= 4;
/*  289 */     paramInt4 >>= 4;
/*  290 */     paramInt6 >>= 4;
/*      */     
/*  292 */     for (int i1 = paramInt1; i1 <= paramInt4; i1++) {
/*  293 */       for (int i2 = paramInt3; i2 <= paramInt6; i2++)
/*  294 */         if (!c(i1, i2)) return false;
/*      */     }
/*  296 */     return true;
/*      */   }
/*      */   
/*      */   protected boolean c(int paramInt1, int paramInt2) {
/*  300 */     return this.v.a(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public apx d(int paramInt1, int paramInt2)
/*      */   {
/*  305 */     return e(paramInt1 >> 4, paramInt2 >> 4);
/*      */   }
/*      */   
/*      */   public apx e(int paramInt1, int paramInt2)
/*      */   {
/*  310 */     return this.v.d(paramInt1, paramInt2);
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5) {
/*  314 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  315 */       return false;
/*      */     }
/*  317 */     if (paramInt2 < 0) return false;
/*  318 */     if (paramInt2 >= 256) { return false;
/*      */     }
/*  320 */     apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  321 */     aji localaji = null;
/*  322 */     if ((paramInt5 & 0x1) != 0) {
/*  323 */       localaji = localapx.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */     }
/*      */     
/*  326 */     boolean bool = localapx.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramaji, paramInt4);
/*  327 */     this.C.a("checkLight");
/*  328 */     t(paramInt1, paramInt2, paramInt3);
/*  329 */     this.C.b();
/*      */     
/*  331 */     if (bool) {
/*  332 */       if (((paramInt5 & 0x2) != 0) && ((!this.E) || ((paramInt5 & 0x4) == 0)) && (localapx.k())) {
/*  333 */         g(paramInt1, paramInt2, paramInt3);
/*      */       }
/*  335 */       if ((!this.E) && ((paramInt5 & 0x1) != 0)) {
/*  336 */         c(paramInt1, paramInt2, paramInt3, localaji);
/*  337 */         if (paramaji.M()) f(paramInt1, paramInt2, paramInt3, paramaji);
/*      */       }
/*      */     }
/*  340 */     return bool;
/*      */   }
/*      */   
/*      */   public int e(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  345 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  346 */       return 0;
/*      */     }
/*  348 */     if (paramInt2 < 0) return 0;
/*  349 */     if (paramInt2 >= 256) return 0;
/*  350 */     apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  351 */     paramInt1 &= 0xF;
/*  352 */     paramInt3 &= 0xF;
/*  353 */     return localapx.c(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  357 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  358 */       return false;
/*      */     }
/*  360 */     if (paramInt2 < 0) return false;
/*  361 */     if (paramInt2 >= 256) return false;
/*  362 */     apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  363 */     int i1 = paramInt1 & 0xF;
/*  364 */     int i2 = paramInt3 & 0xF;
/*  365 */     boolean bool = localapx.a(i1, paramInt2, i2, paramInt4);
/*      */     
/*  367 */     if (bool) {
/*  368 */       aji localaji = localapx.a(i1, paramInt2, i2);
/*  369 */       if (((paramInt5 & 0x2) != 0) && ((!this.E) || ((paramInt5 & 0x4) == 0)) && (localapx.k())) {
/*  370 */         g(paramInt1, paramInt2, paramInt3);
/*      */       }
/*  372 */       if ((!this.E) && ((paramInt5 & 0x1) != 0)) {
/*  373 */         c(paramInt1, paramInt2, paramInt3, localaji);
/*  374 */         if (localaji.M()) f(paramInt1, paramInt2, paramInt3, localaji);
/*      */       }
/*      */     }
/*  377 */     return bool;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean f(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  389 */     return d(paramInt1, paramInt2, paramInt3, ajn.a, 0, 3);
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
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/*  403 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/*  404 */     if (localaji.o() == awt.a) {
/*  405 */       return false;
/*      */     }
/*      */     
/*  408 */     int i1 = e(paramInt1, paramInt2, paramInt3);
/*  409 */     c(2001, paramInt1, paramInt2, paramInt3, aji.b(localaji) + (i1 << 12));
/*  410 */     if (paramBoolean) {
/*  411 */       localaji.b(this, paramInt1, paramInt2, paramInt3, i1, 0);
/*      */     }
/*  413 */     return d(paramInt1, paramInt2, paramInt3, ajn.a, 0, 3);
/*      */   }
/*      */   
/*      */   public boolean b(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  417 */     return d(paramInt1, paramInt2, paramInt3, paramaji, 0, 3);
/*      */   }
/*      */   
/*      */   public void g(int paramInt1, int paramInt2, int paramInt3) {
/*  421 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  422 */       ((ahh)this.u.get(i1)).a(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*  427 */   public void c(int paramInt1, int paramInt2, int paramInt3, aji paramaji) { d(paramInt1, paramInt2, paramInt3, paramaji); }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*      */     int i1;
/*  431 */     if (paramInt3 > paramInt4) {
/*  432 */       i1 = paramInt4;
/*  433 */       paramInt4 = paramInt3;
/*  434 */       paramInt3 = i1;
/*      */     }
/*  436 */     if (!this.t.g) {
/*  437 */       for (i1 = paramInt3; i1 <= paramInt4; i1++) {
/*  438 */         c(ahn.a, paramInt1, i1, paramInt2);
/*      */       }
/*      */     }
/*  441 */     c(paramInt1, paramInt3, paramInt2, paramInt1, paramInt4, paramInt2);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*      */   {
/*  451 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  452 */       ((ahh)this.u.get(i1)).a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*      */     }
/*      */   }
/*      */   
/*      */   public void d(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  457 */     e(paramInt1 - 1, paramInt2, paramInt3, paramaji);
/*  458 */     e(paramInt1 + 1, paramInt2, paramInt3, paramaji);
/*  459 */     e(paramInt1, paramInt2 - 1, paramInt3, paramaji);
/*  460 */     e(paramInt1, paramInt2 + 1, paramInt3, paramaji);
/*  461 */     e(paramInt1, paramInt2, paramInt3 - 1, paramaji);
/*  462 */     e(paramInt1, paramInt2, paramInt3 + 1, paramaji);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/*  466 */     if (paramInt4 != 4) e(paramInt1 - 1, paramInt2, paramInt3, paramaji);
/*  467 */     if (paramInt4 != 5) e(paramInt1 + 1, paramInt2, paramInt3, paramaji);
/*  468 */     if (paramInt4 != 0) e(paramInt1, paramInt2 - 1, paramInt3, paramaji);
/*  469 */     if (paramInt4 != 1) e(paramInt1, paramInt2 + 1, paramInt3, paramaji);
/*  470 */     if (paramInt4 != 2) e(paramInt1, paramInt2, paramInt3 - 1, paramaji);
/*  471 */     if (paramInt4 != 3) e(paramInt1, paramInt2, paramInt3 + 1, paramaji);
/*      */   }
/*      */   
/*      */   public void e(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  475 */     if (this.E) return;
/*  476 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/*      */     try
/*      */     {
/*  479 */       localaji.a(this, paramInt1, paramInt2, paramInt3, paramaji);
/*      */     } catch (Throwable localThrowable1) {
/*  481 */       b localb = b.a(localThrowable1, "Exception while updating neighbours");
/*  482 */       k localk = localb.a("Block being updated");
/*      */       int i1;
/*      */       try
/*      */       {
/*  486 */         i1 = e(paramInt1, paramInt2, paramInt3);
/*      */       } catch (Throwable localThrowable2) {
/*  488 */         i1 = -1;
/*      */       }
/*      */       
/*  491 */       localk.a("Source block type", new ahd(this, paramaji));
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
/*  502 */       k.a(localk, paramInt1, paramInt2, paramInt3, localaji, i1);
/*      */       
/*  504 */       throw new s(localb);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/*  509 */     return false;
/*      */   }
/*      */   
/*      */   public boolean i(int paramInt1, int paramInt2, int paramInt3) {
/*  513 */     return e(paramInt1 >> 4, paramInt3 >> 4).d(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public int j(int paramInt1, int paramInt2, int paramInt3) {
/*  517 */     if (paramInt2 < 0) return 0;
/*  518 */     if (paramInt2 >= 256) paramInt2 = 255;
/*  519 */     return e(paramInt1 >> 4, paramInt3 >> 4).b(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, 0);
/*      */   }
/*      */   
/*      */   public int k(int paramInt1, int paramInt2, int paramInt3) {
/*  523 */     return b(paramInt1, paramInt2, paramInt3, true);
/*      */   }
/*      */   
/*      */   public int b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  527 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  528 */       return 15;
/*      */     }
/*      */     
/*  531 */     if ((paramBoolean) && 
/*  532 */       (a(paramInt1, paramInt2, paramInt3).n())) {
/*  533 */       int i1 = b(paramInt1, paramInt2 + 1, paramInt3, false);
/*  534 */       int i2 = b(paramInt1 + 1, paramInt2, paramInt3, false);
/*  535 */       int i3 = b(paramInt1 - 1, paramInt2, paramInt3, false);
/*  536 */       int i4 = b(paramInt1, paramInt2, paramInt3 + 1, false);
/*  537 */       int i5 = b(paramInt1, paramInt2, paramInt3 - 1, false);
/*  538 */       if (i2 > i1) i1 = i2;
/*  539 */       if (i3 > i1) i1 = i3;
/*  540 */       if (i4 > i1) i1 = i4;
/*  541 */       if (i5 > i1) i1 = i5;
/*  542 */       return i1;
/*      */     }
/*      */     
/*      */ 
/*  546 */     if (paramInt2 < 0) return 0;
/*  547 */     if (paramInt2 >= 256) { paramInt2 = 255;
/*      */     }
/*  549 */     apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  550 */     paramInt1 &= 0xF;
/*  551 */     paramInt3 &= 0xF;
/*  552 */     return localapx.b(paramInt1, paramInt2, paramInt3, this.j);
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
/*      */   public int f(int paramInt1, int paramInt2)
/*      */   {
/*  571 */     if ((paramInt1 < -30000000) || (paramInt2 < -30000000) || (paramInt1 >= 30000000) || (paramInt2 >= 30000000)) {
/*  572 */       return 64;
/*      */     }
/*  574 */     if (!c(paramInt1 >> 4, paramInt2 >> 4)) { return 0;
/*      */     }
/*  576 */     apx localapx = e(paramInt1 >> 4, paramInt2 >> 4);
/*  577 */     return localapx.b(paramInt1 & 0xF, paramInt2 & 0xF);
/*      */   }
/*      */   
/*      */   public int g(int paramInt1, int paramInt2) {
/*  581 */     if ((paramInt1 < -30000000) || (paramInt2 < -30000000) || (paramInt1 >= 30000000) || (paramInt2 >= 30000000)) {
/*  582 */       return 64;
/*      */     }
/*  584 */     if (!c(paramInt1 >> 4, paramInt2 >> 4)) { return 0;
/*      */     }
/*  586 */     apx localapx = e(paramInt1 >> 4, paramInt2 >> 4);
/*  587 */     return localapx.r;
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
/*      */   public int a(ahn paramahn, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  608 */     if ((this.t.g) && (paramahn == ahn.a)) { return 0;
/*      */     }
/*  610 */     if (paramInt2 < 0) paramInt2 = 0;
/*  611 */     if (paramInt2 >= 256) {
/*  612 */       return paramahn.c;
/*      */     }
/*  614 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  615 */       return paramahn.c;
/*      */     }
/*  617 */     int i1 = paramInt1 >> 4;
/*  618 */     int i2 = paramInt3 >> 4;
/*  619 */     if (!c(i1, i2)) { return paramahn.c;
/*      */     }
/*  621 */     if (a(paramInt1, paramInt2, paramInt3).n()) {
/*  622 */       int i3 = b(paramahn, paramInt1, paramInt2 + 1, paramInt3);
/*  623 */       int i4 = b(paramahn, paramInt1 + 1, paramInt2, paramInt3);
/*  624 */       int i5 = b(paramahn, paramInt1 - 1, paramInt2, paramInt3);
/*  625 */       int i6 = b(paramahn, paramInt1, paramInt2, paramInt3 + 1);
/*  626 */       int i7 = b(paramahn, paramInt1, paramInt2, paramInt3 - 1);
/*  627 */       if (i4 > i3) i3 = i4;
/*  628 */       if (i5 > i3) i3 = i5;
/*  629 */       if (i6 > i3) i3 = i6;
/*  630 */       if (i7 > i3) i3 = i7;
/*  631 */       return i3;
/*      */     }
/*      */     
/*  634 */     apx localapx = e(i1, i2);
/*  635 */     return localapx.a(paramahn, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public int b(ahn paramahn, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  640 */     if (paramInt2 < 0) paramInt2 = 0;
/*  641 */     if (paramInt2 >= 256) paramInt2 = 255;
/*  642 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  643 */       return paramahn.c;
/*      */     }
/*  645 */     int i1 = paramInt1 >> 4;
/*  646 */     int i2 = paramInt3 >> 4;
/*  647 */     if (!c(i1, i2)) return paramahn.c;
/*  648 */     apx localapx = e(i1, i2);
/*  649 */     return localapx.a(paramahn, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */   }
/*      */   
/*      */   public void b(ahn paramahn, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  653 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/*  654 */       return;
/*      */     }
/*  656 */     if (paramInt2 < 0) return;
/*  657 */     if (paramInt2 >= 256) return;
/*  658 */     if (!c(paramInt1 >> 4, paramInt3 >> 4)) return;
/*  659 */     apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/*  660 */     localapx.a(paramahn, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramInt4);
/*  661 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  662 */       ((ahh)this.u.get(i1)).b(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public void m(int paramInt1, int paramInt2, int paramInt3) {
/*  667 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  668 */       ((ahh)this.u.get(i1)).b(paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/*  674 */     int i1 = a(ahn.a, paramInt1, paramInt2, paramInt3);
/*  675 */     int i2 = a(ahn.b, paramInt1, paramInt2, paramInt3);
/*  676 */     if (i2 < paramInt4) i2 = paramInt4;
/*  677 */     return i1 << 20 | i2 << 4;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public float n(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  689 */     return this.t.h[k(paramInt1, paramInt2, paramInt3)];
/*      */   }
/*      */   
/*      */   public boolean w() {
/*  693 */     return this.j < 4;
/*      */   }
/*      */   
/*      */   public azu a(azw paramazw1, azw paramazw2) {
/*  697 */     return a(paramazw1, paramazw2, false, false, false);
/*      */   }
/*      */   
/*      */   public azu a(azw paramazw1, azw paramazw2, boolean paramBoolean) {
/*  701 */     return a(paramazw1, paramazw2, paramBoolean, false, false);
/*      */   }
/*      */   
/*      */   public azu a(azw paramazw1, azw paramazw2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*  705 */     if ((Double.isNaN(paramazw1.a)) || (Double.isNaN(paramazw1.b)) || (Double.isNaN(paramazw1.c))) return null;
/*  706 */     if ((Double.isNaN(paramazw2.a)) || (Double.isNaN(paramazw2.b)) || (Double.isNaN(paramazw2.c))) { return null;
/*      */     }
/*  708 */     int i1 = qh.c(paramazw2.a);
/*  709 */     int i2 = qh.c(paramazw2.b);
/*  710 */     int i3 = qh.c(paramazw2.c);
/*      */     
/*  712 */     int i4 = qh.c(paramazw1.a);
/*  713 */     int i5 = qh.c(paramazw1.b);
/*  714 */     int i6 = qh.c(paramazw1.c);
/*      */     
/*      */ 
/*  717 */     Object localObject = a(i4, i5, i6);
/*  718 */     int i7 = e(i4, i5, i6);
/*  719 */     if ((!paramBoolean2) || (((aji)localObject).a(this, i4, i5, i6) != null))
/*      */     {
/*  721 */       if (((aji)localObject).a(i7, paramBoolean1)) {
/*  722 */         azu localazu1 = ((aji)localObject).a(this, i4, i5, i6, paramazw1, paramazw2);
/*  723 */         if (localazu1 != null) { return localazu1;
/*      */         }
/*      */       }
/*      */     }
/*  727 */     localObject = null;
/*      */     
/*  729 */     i7 = 200;
/*  730 */     while (i7-- >= 0) {
/*  731 */       if ((Double.isNaN(paramazw1.a)) || (Double.isNaN(paramazw1.b)) || (Double.isNaN(paramazw1.c))) return null;
/*  732 */       if ((i4 == i1) && (i5 == i2) && (i6 == i3)) {
/*  733 */         return (azu)(paramBoolean3 ? localObject : null);
/*      */       }
/*      */       
/*  736 */       int i8 = 1;
/*  737 */       int i9 = 1;
/*  738 */       int i10 = 1;
/*      */       
/*  740 */       double d1 = 999.0D;
/*  741 */       double d2 = 999.0D;
/*  742 */       double d3 = 999.0D;
/*      */       
/*  744 */       if (i1 > i4) { d1 = i4 + 1.0D;
/*  745 */       } else if (i1 < i4) d1 = i4 + 0.0D; else {
/*  746 */         i8 = 0;
/*      */       }
/*  748 */       if (i2 > i5) { d2 = i5 + 1.0D;
/*  749 */       } else if (i2 < i5) d2 = i5 + 0.0D; else {
/*  750 */         i9 = 0;
/*      */       }
/*  752 */       if (i3 > i6) { d3 = i6 + 1.0D;
/*  753 */       } else if (i3 < i6) d3 = i6 + 0.0D; else {
/*  754 */         i10 = 0;
/*      */       }
/*  756 */       double d4 = 999.0D;
/*  757 */       double d5 = 999.0D;
/*  758 */       double d6 = 999.0D;
/*      */       
/*  760 */       double d7 = paramazw2.a - paramazw1.a;
/*  761 */       double d8 = paramazw2.b - paramazw1.b;
/*  762 */       double d9 = paramazw2.c - paramazw1.c;
/*      */       
/*  764 */       if (i8 != 0) d4 = (d1 - paramazw1.a) / d7;
/*  765 */       if (i9 != 0) d5 = (d2 - paramazw1.b) / d8;
/*  766 */       if (i10 != 0) { d6 = (d3 - paramazw1.c) / d9;
/*      */       }
/*  768 */       int i11 = 0;
/*  769 */       if ((d4 < d5) && (d4 < d6)) {
/*  770 */         if (i1 > i4) i11 = 4; else {
/*  771 */           i11 = 5;
/*      */         }
/*  773 */         paramazw1.a = d1;
/*  774 */         paramazw1.b += d8 * d4;
/*  775 */         paramazw1.c += d9 * d4;
/*  776 */       } else if (d5 < d6) {
/*  777 */         if (i2 > i5) i11 = 0; else {
/*  778 */           i11 = 1;
/*      */         }
/*  780 */         paramazw1.a += d7 * d5;
/*  781 */         paramazw1.b = d2;
/*  782 */         paramazw1.c += d9 * d5;
/*      */       } else {
/*  784 */         if (i3 > i6) i11 = 2; else {
/*  785 */           i11 = 3;
/*      */         }
/*  787 */         paramazw1.a += d7 * d6;
/*  788 */         paramazw1.b += d8 * d6;
/*  789 */         paramazw1.c = d3;
/*      */       }
/*      */       
/*  792 */       azw localazw = azw.a(paramazw1.a, paramazw1.b, paramazw1.c);
/*  793 */       i4 = (int)(localazw.a = qh.c(paramazw1.a));
/*  794 */       if (i11 == 5) {
/*  795 */         i4--;
/*  796 */         localazw.a += 1.0D;
/*      */       }
/*  798 */       i5 = (int)(localazw.b = qh.c(paramazw1.b));
/*  799 */       if (i11 == 1) {
/*  800 */         i5--;
/*  801 */         localazw.b += 1.0D;
/*      */       }
/*  803 */       i6 = (int)(localazw.c = qh.c(paramazw1.c));
/*  804 */       if (i11 == 3) {
/*  805 */         i6--;
/*  806 */         localazw.c += 1.0D;
/*      */       }
/*      */       
/*  809 */       aji localaji = a(i4, i5, i6);
/*  810 */       int i12 = e(i4, i5, i6);
/*  811 */       if ((!paramBoolean2) || (localaji.a(this, i4, i5, i6) != null))
/*      */       {
/*  813 */         if (localaji.a(i12, paramBoolean1)) {
/*  814 */           azu localazu2 = localaji.a(this, i4, i5, i6, paramazw1, paramazw2);
/*  815 */           if (localazu2 != null) return localazu2;
/*      */         } else {
/*  817 */           localObject = new azu(i4, i5, i6, i11, paramazw1, false);
/*      */         } }
/*      */     }
/*  820 */     return (azu)(paramBoolean3 ? localObject : null);
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, String paramString, float paramFloat1, float paramFloat2) {
/*  824 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  825 */       ((ahh)this.u.get(i1)).a(paramString, paramsa.s, paramsa.t - paramsa.L, paramsa.u, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(yz paramyz, String paramString, float paramFloat1, float paramFloat2) {
/*  830 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  831 */       ((ahh)this.u.get(i1)).a(paramyz, paramString, paramyz.s, paramyz.t - paramyz.L, paramyz.u, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2) {
/*  836 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  837 */       ((ahh)this.u.get(i1)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean) {}
/*      */   
/*      */   public void a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/*  845 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  846 */       ((ahh)this.u.get(i1)).a(paramString, paramInt1, paramInt2, paramInt3);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  851 */     for (int i1 = 0; i1 < this.u.size(); i1++)
/*  852 */       ((ahh)this.u.get(i1)).a(paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*      */   }
/*      */   
/*      */   public boolean c(sa paramsa) {
/*  856 */     this.i.add(paramsa);
/*  857 */     return true;
/*      */   }
/*      */   
/*      */   public boolean d(sa paramsa) {
/*  861 */     int i1 = qh.c(paramsa.s / 16.0D);
/*  862 */     int i2 = qh.c(paramsa.u / 16.0D);
/*      */     
/*  864 */     boolean bool = paramsa.n;
/*  865 */     if ((paramsa instanceof yz)) {
/*  866 */       bool = true;
/*      */     }
/*      */     
/*  869 */     if ((bool) || (c(i1, i2))) {
/*  870 */       if ((paramsa instanceof yz)) {
/*  871 */         yz localyz = (yz)paramsa;
/*  872 */         this.h.add(localyz);
/*  873 */         c();
/*      */       }
/*  875 */       e(i1, i2).a(paramsa);
/*  876 */       this.e.add(paramsa);
/*  877 */       a(paramsa);
/*  878 */       return true;
/*      */     }
/*  880 */     return false;
/*      */   }
/*      */   
/*      */   protected void a(sa paramsa) {
/*  884 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  885 */       ((ahh)this.u.get(i1)).a(paramsa);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void b(sa paramsa) {
/*  890 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/*  891 */       ((ahh)this.u.get(i1)).b(paramsa);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e(sa paramsa) {
/*  896 */     if (paramsa.l != null) {
/*  897 */       paramsa.l.a(null);
/*      */     }
/*  899 */     if (paramsa.m != null) {
/*  900 */       paramsa.a(null);
/*      */     }
/*  902 */     paramsa.B();
/*  903 */     if ((paramsa instanceof yz)) {
/*  904 */       this.h.remove(paramsa);
/*  905 */       c();
/*  906 */       b(paramsa);
/*      */     }
/*      */   }
/*      */   
/*      */   public void f(sa paramsa) {
/*  911 */     paramsa.B();
/*      */     
/*  913 */     if ((paramsa instanceof yz)) {
/*  914 */       this.h.remove(paramsa);
/*  915 */       c();
/*      */     }
/*      */     
/*  918 */     int i1 = paramsa.ah;
/*  919 */     int i2 = paramsa.aj;
/*  920 */     if ((paramsa.ag) && (c(i1, i2))) {
/*  921 */       e(i1, i2).b(paramsa);
/*      */     }
/*      */     
/*  924 */     this.e.remove(paramsa);
/*  925 */     b(paramsa);
/*      */   }
/*      */   
/*      */   public void a(ahh paramahh) {
/*  929 */     this.u.add(paramahh);
/*      */   }
/*      */   
/*      */   public void b(ahh paramahh) {
/*  933 */     this.u.remove(paramahh);
/*      */   }
/*      */   
/*      */   public List a(sa paramsa, azt paramazt)
/*      */   {
/*  938 */     this.L.clear();
/*  939 */     int i1 = qh.c(paramazt.a);
/*  940 */     int i2 = qh.c(paramazt.d + 1.0D);
/*  941 */     int i3 = qh.c(paramazt.b);
/*  942 */     int i4 = qh.c(paramazt.e + 1.0D);
/*  943 */     int i5 = qh.c(paramazt.c);
/*  944 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/*  946 */     for (int i7 = i1; i7 < i2; i7++) {
/*  947 */       for (int i8 = i5; i8 < i6; i8++) {
/*  948 */         if (d(i7, 64, i8)) {
/*  949 */           for (int i9 = i3 - 1; i9 < i4; i9++)
/*      */           {
/*      */             aji localaji;
/*      */             
/*  953 */             if ((i7 < -30000000) || (i7 >= 30000000) || (i8 < -30000000) || (i8 >= 30000000)) {
/*  954 */               localaji = ajn.b;
/*      */             } else {
/*  956 */               localaji = a(i7, i9, i8);
/*      */             }
/*  958 */             localaji.a(this, i7, i9, i8, paramazt, this.L, paramsa);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*  963 */     double d1 = 0.25D;
/*  964 */     List localList = b(paramsa, paramazt.b(d1, d1, d1));
/*  965 */     for (int i10 = 0; i10 < localList.size(); i10++) {
/*  966 */       azt localazt = ((sa)localList.get(i10)).J();
/*  967 */       if ((localazt != null) && (localazt.b(paramazt))) {
/*  968 */         this.L.add(localazt);
/*      */       }
/*      */       
/*  971 */       localazt = paramsa.h((sa)localList.get(i10));
/*  972 */       if ((localazt != null) && (localazt.b(paramazt))) {
/*  973 */         this.L.add(localazt);
/*      */       }
/*      */     }
/*      */     
/*  977 */     return this.L;
/*      */   }
/*      */   
/*      */   public List a(azt paramazt)
/*      */   {
/*  982 */     this.L.clear();
/*  983 */     int i1 = qh.c(paramazt.a);
/*  984 */     int i2 = qh.c(paramazt.d + 1.0D);
/*  985 */     int i3 = qh.c(paramazt.b);
/*  986 */     int i4 = qh.c(paramazt.e + 1.0D);
/*  987 */     int i5 = qh.c(paramazt.c);
/*  988 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/*  990 */     for (int i7 = i1; i7 < i2; i7++) {
/*  991 */       for (int i8 = i5; i8 < i6; i8++) {
/*  992 */         if (d(i7, 64, i8)) {
/*  993 */           for (int i9 = i3 - 1; i9 < i4; i9++) {
/*      */             aji localaji;
/*  995 */             if ((i7 < -30000000) || (i7 >= 30000000) || (i8 < -30000000) || (i8 >= 30000000)) {
/*  996 */               localaji = ajn.h;
/*      */             } else {
/*  998 */               localaji = a(i7, i9, i8);
/*      */             }
/* 1000 */             localaji.a(this, i7, i9, i8, paramazt, this.L, null);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1006 */     return this.L;
/*      */   }
/*      */   
/*      */   public int a(float paramFloat) {
/* 1010 */     float f1 = c(paramFloat);
/* 1011 */     float f2 = 1.0F - (qh.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
/* 1012 */     if (f2 < 0.0F) f2 = 0.0F;
/* 1013 */     if (f2 > 1.0F) f2 = 1.0F;
/* 1014 */     f2 = 1.0F - f2;
/* 1015 */     f2 = (float)(f2 * (1.0D - j(paramFloat) * 5.0F / 16.0D));
/* 1016 */     f2 = (float)(f2 * (1.0D - h(paramFloat) * 5.0F / 16.0D));
/* 1017 */     f2 = 1.0F - f2;
/* 1018 */     return (int)(f2 * 11.0F);
/*      */   }
/*      */   
/*      */   public float b(float paramFloat) {
/* 1022 */     float f1 = c(paramFloat);
/*      */     
/* 1024 */     float f2 = 1.0F - (qh.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
/* 1025 */     if (f2 < 0.0F) f2 = 0.0F;
/* 1026 */     if (f2 > 1.0F) { f2 = 1.0F;
/*      */     }
/* 1028 */     f2 = 1.0F - f2;
/*      */     
/* 1030 */     f2 = (float)(f2 * (1.0D - j(paramFloat) * 5.0F / 16.0D));
/* 1031 */     f2 = (float)(f2 * (1.0D - h(paramFloat) * 5.0F / 16.0D));
/*      */     
/* 1033 */     return f2 * 0.8F + 0.2F;
/*      */   }
/*      */   
/*      */   public azw a(sa paramsa, float paramFloat)
/*      */   {
/* 1038 */     float f1 = c(paramFloat);
/*      */     
/* 1040 */     float f2 = qh.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 1041 */     if (f2 < 0.0F) f2 = 0.0F;
/* 1042 */     if (f2 > 1.0F) { f2 = 1.0F;
/*      */     }
/* 1044 */     int i1 = qh.c(paramsa.s);
/* 1045 */     int i2 = qh.c(paramsa.t);
/* 1046 */     int i3 = qh.c(paramsa.u);
/* 1047 */     ahu localahu = a(i1, i3);
/* 1048 */     float f3 = localahu.a(i1, i2, i3);
/* 1049 */     int i4 = localahu.a(f3);
/*      */     
/* 1051 */     float f4 = (i4 >> 16 & 0xFF) / 255.0F;
/* 1052 */     float f5 = (i4 >> 8 & 0xFF) / 255.0F;
/* 1053 */     float f6 = (i4 & 0xFF) / 255.0F;
/* 1054 */     f4 *= f2;
/* 1055 */     f5 *= f2;
/* 1056 */     f6 *= f2;
/*      */     
/* 1058 */     float f7 = j(paramFloat);
/* 1059 */     float f9; if (f7 > 0.0F) {
/* 1060 */       f8 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.6F;
/*      */       
/* 1062 */       f9 = 1.0F - f7 * 0.75F;
/* 1063 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1064 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/* 1065 */       f6 = f6 * f9 + f8 * (1.0F - f9);
/*      */     }
/* 1067 */     float f8 = h(paramFloat);
/* 1068 */     if (f8 > 0.0F) {
/* 1069 */       f9 = (f4 * 0.3F + f5 * 0.59F + f6 * 0.11F) * 0.2F;
/*      */       
/* 1071 */       float f10 = 1.0F - f8 * 0.75F;
/* 1072 */       f4 = f4 * f10 + f9 * (1.0F - f10);
/* 1073 */       f5 = f5 * f10 + f9 * (1.0F - f10);
/* 1074 */       f6 = f6 * f10 + f9 * (1.0F - f10);
/*      */     }
/*      */     
/* 1077 */     if (this.q > 0) {
/* 1078 */       f9 = this.q - paramFloat;
/* 1079 */       if (f9 > 1.0F) f9 = 1.0F;
/* 1080 */       f9 *= 0.45F;
/* 1081 */       f4 = f4 * (1.0F - f9) + 0.8F * f9;
/* 1082 */       f5 = f5 * (1.0F - f9) + 0.8F * f9;
/* 1083 */       f6 = f6 * (1.0F - f9) + 1.0F * f9;
/*      */     }
/*      */     
/* 1086 */     return azw.a(f4, f5, f6);
/*      */   }
/*      */   
/*      */   public float c(float paramFloat) {
/* 1090 */     return this.t.a(this.x.g(), paramFloat);
/*      */   }
/*      */   
/*      */   public int x() {
/* 1094 */     return this.t.a(this.x.g());
/*      */   }
/*      */   
/*      */   public float y() {
/* 1098 */     return aqo.a[this.t.a(this.x.g())];
/*      */   }
/*      */   
/*      */   public float d(float paramFloat) {
/* 1102 */     float f1 = c(paramFloat);
/* 1103 */     return f1 * 3.1415927F * 2.0F;
/*      */   }
/*      */   
/*      */   public azw e(float paramFloat)
/*      */   {
/* 1108 */     float f1 = c(paramFloat);
/*      */     
/* 1110 */     float f2 = qh.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 1111 */     if (f2 < 0.0F) f2 = 0.0F;
/* 1112 */     if (f2 > 1.0F) { f2 = 1.0F;
/*      */     }
/* 1114 */     float f3 = (float)(this.c >> 16 & 0xFF) / 255.0F;
/* 1115 */     float f4 = (float)(this.c >> 8 & 0xFF) / 255.0F;
/* 1116 */     float f5 = (float)(this.c & 0xFF) / 255.0F;
/*      */     
/* 1118 */     float f6 = j(paramFloat);
/* 1119 */     float f8; if (f6 > 0.0F) {
/* 1120 */       f7 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.6F;
/*      */       
/* 1122 */       f8 = 1.0F - f6 * 0.95F;
/* 1123 */       f3 = f3 * f8 + f7 * (1.0F - f8);
/* 1124 */       f4 = f4 * f8 + f7 * (1.0F - f8);
/* 1125 */       f5 = f5 * f8 + f7 * (1.0F - f8);
/*      */     }
/*      */     
/* 1128 */     f3 *= (f2 * 0.9F + 0.1F);
/* 1129 */     f4 *= (f2 * 0.9F + 0.1F);
/* 1130 */     f5 *= (f2 * 0.85F + 0.15F);
/*      */     
/* 1132 */     float f7 = h(paramFloat);
/* 1133 */     if (f7 > 0.0F) {
/* 1134 */       f8 = (f3 * 0.3F + f4 * 0.59F + f5 * 0.11F) * 0.2F;
/*      */       
/* 1136 */       float f9 = 1.0F - f7 * 0.95F;
/* 1137 */       f3 = f3 * f9 + f8 * (1.0F - f9);
/* 1138 */       f4 = f4 * f9 + f8 * (1.0F - f9);
/* 1139 */       f5 = f5 * f9 + f8 * (1.0F - f9);
/*      */     }
/*      */     
/* 1142 */     return azw.a(f3, f4, f5);
/*      */   }
/*      */   
/*      */   public azw f(float paramFloat)
/*      */   {
/* 1147 */     float f1 = c(paramFloat);
/* 1148 */     return this.t.b(f1, paramFloat);
/*      */   }
/*      */   
/*      */   public int h(int paramInt1, int paramInt2) {
/* 1152 */     return d(paramInt1, paramInt2).d(paramInt1 & 0xF, paramInt2 & 0xF);
/*      */   }
/*      */   
/*      */   public int i(int paramInt1, int paramInt2) {
/* 1156 */     apx localapx = d(paramInt1, paramInt2);
/*      */     
/* 1158 */     int i1 = localapx.h() + 15;
/*      */     
/* 1160 */     paramInt1 &= 0xF;
/* 1161 */     paramInt2 &= 0xF;
/*      */     
/* 1163 */     while (i1 > 0) {
/* 1164 */       aji localaji = localapx.a(paramInt1, i1, paramInt2);
/* 1165 */       if ((!localaji.o().c()) || (localaji.o() == awt.j)) {
/* 1166 */         i1--;
/*      */       } else {
/* 1168 */         return i1 + 1;
/*      */       }
/*      */     }
/* 1171 */     return -1;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public float g(float paramFloat)
/*      */   {
/* 1179 */     float f1 = c(paramFloat);
/*      */     
/* 1181 */     float f2 = 1.0F - (qh.b(f1 * 3.1415927F * 2.0F) * 2.0F + 0.25F);
/* 1182 */     if (f2 < 0.0F) f2 = 0.0F;
/* 1183 */     if (f2 > 1.0F) { f2 = 1.0F;
/*      */     }
/* 1185 */     return f2 * f2 * 0.5F;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {}
/*      */   
/*      */ 
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5) {}
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5) {}
/*      */   
/*      */   public void h()
/*      */   {
/* 1198 */     this.C.a("entities");
/* 1199 */     this.C.a("global");
/*      */     Object localObject1;
/* 1201 */     k localk; for (int i1 = 0; i1 < this.i.size(); i1++) {
/* 1202 */       localObject1 = (sa)this.i.get(i1);
/*      */       try {
/* 1204 */         localObject1.aa += 1;
/* 1205 */         ((sa)localObject1).h();
/*      */       } catch (Throwable localThrowable1) {
/* 1207 */         b localb1 = b.a(localThrowable1, "Ticking entity");
/* 1208 */         localk = localb1.a("Entity being ticked");
/*      */         
/* 1210 */         if (localObject1 == null) {
/* 1211 */           localk.a("Entity", "~~NULL~~");
/*      */         } else {
/* 1213 */           ((sa)localObject1).a(localk);
/*      */         }
/*      */         
/* 1216 */         throw new s(localb1);
/*      */       }
/*      */       
/* 1219 */       if (((sa)localObject1).K) {
/* 1220 */         this.i.remove(i1--);
/*      */       }
/*      */     }
/*      */     
/* 1224 */     this.C.c("remove");
/* 1225 */     this.e.removeAll(this.f);
/* 1226 */     for (i1 = 0; i1 < this.f.size(); i1++) {
/* 1227 */       localObject1 = (sa)this.f.get(i1);
/* 1228 */       int i3 = ((sa)localObject1).ah;
/* 1229 */       int i5 = ((sa)localObject1).aj;
/* 1230 */       if ((((sa)localObject1).ag) && (c(i3, i5))) {
/* 1231 */         e(i3, i5).b((sa)localObject1);
/*      */       }
/*      */     }
/* 1234 */     for (i1 = 0; i1 < this.f.size(); i1++) {
/* 1235 */       b((sa)this.f.get(i1));
/*      */     }
/* 1237 */     this.f.clear();
/*      */     
/* 1239 */     this.C.c("regular");
/* 1240 */     for (i1 = 0; i1 < this.e.size(); i1++) {
/* 1241 */       localObject1 = (sa)this.e.get(i1);
/*      */       
/* 1243 */       if (((sa)localObject1).m != null) {
/* 1244 */         if ((((sa)localObject1).m.K) || (((sa)localObject1).m.l != localObject1)) {
/* 1245 */           ((sa)localObject1).m.l = null;
/* 1246 */           ((sa)localObject1).m = null;
/*      */         }
/*      */       }
/*      */       else {
/* 1250 */         this.C.a("tick");
/* 1251 */         if (!((sa)localObject1).K) {
/*      */           try {
/* 1253 */             g((sa)localObject1);
/*      */           } catch (Throwable localThrowable2) {
/* 1255 */             b localb2 = b.a(localThrowable2, "Ticking entity");
/* 1256 */             localk = localb2.a("Entity being ticked");
/*      */             
/* 1258 */             ((sa)localObject1).a(localk);
/*      */             
/* 1260 */             throw new s(localb2);
/*      */           }
/*      */         }
/* 1263 */         this.C.b();
/*      */         
/* 1265 */         this.C.a("remove");
/* 1266 */         if (((sa)localObject1).K) {
/* 1267 */           int i4 = ((sa)localObject1).ah;
/* 1268 */           int i6 = ((sa)localObject1).aj;
/* 1269 */           if ((((sa)localObject1).ag) && (c(i4, i6))) {
/* 1270 */             e(i4, i6).b((sa)localObject1);
/*      */           }
/* 1272 */           this.e.remove(i1--);
/* 1273 */           b((sa)localObject1);
/*      */         }
/* 1275 */         this.C.b();
/*      */       }
/*      */     }
/* 1278 */     this.C.c("blockEntities");
/* 1279 */     this.M = true;
/* 1280 */     Iterator localIterator = this.g.iterator();
/* 1281 */     Object localObject3; Object localObject2; while (localIterator.hasNext()) {
/* 1282 */       localObject1 = (aor)localIterator.next();
/* 1283 */       if ((!((aor)localObject1).r()) && (((aor)localObject1).o()) && 
/* 1284 */         (d(((aor)localObject1).c, ((aor)localObject1).d, ((aor)localObject1).e))) {
/*      */         try {
/* 1286 */           ((aor)localObject1).h();
/*      */         } catch (Throwable localThrowable3) {
/* 1288 */           localObject3 = b.a(localThrowable3, "Ticking block entity");
/* 1289 */           localk = ((b)localObject3).a("Block entity being ticked");
/*      */           
/* 1291 */           ((aor)localObject1).a(localk);
/*      */           
/* 1293 */           throw new s((b)localObject3);
/*      */         }
/*      */       }
/*      */       
/*      */ 
/* 1298 */       if (((aor)localObject1).r()) {
/* 1299 */         localIterator.remove();
/*      */         
/* 1301 */         if (c(((aor)localObject1).c >> 4, ((aor)localObject1).e >> 4)) {
/* 1302 */           localObject2 = e(((aor)localObject1).c >> 4, ((aor)localObject1).e >> 4);
/* 1303 */           if (localObject2 != null) ((apx)localObject2).f(((aor)localObject1).c & 0xF, ((aor)localObject1).d, ((aor)localObject1).e & 0xF);
/*      */         }
/*      */       }
/*      */     }
/* 1307 */     this.M = false;
/*      */     
/* 1309 */     if (!this.b.isEmpty()) {
/* 1310 */       this.g.removeAll(this.b);
/* 1311 */       this.b.clear();
/*      */     }
/*      */     
/* 1314 */     this.C.c("pendingBlockEntities");
/* 1315 */     if (!this.a.isEmpty()) {
/* 1316 */       for (int i2 = 0; i2 < this.a.size(); i2++) {
/* 1317 */         localObject2 = (aor)this.a.get(i2);
/* 1318 */         if (!((aor)localObject2).r()) {
/* 1319 */           if (!this.g.contains(localObject2)) {
/* 1320 */             this.g.add(localObject2);
/*      */           }
/*      */           
/* 1323 */           if (c(((aor)localObject2).c >> 4, ((aor)localObject2).e >> 4)) {
/* 1324 */             localObject3 = e(((aor)localObject2).c >> 4, ((aor)localObject2).e >> 4);
/* 1325 */             if (localObject3 != null) { ((apx)localObject3).a(((aor)localObject2).c & 0xF, ((aor)localObject2).d, ((aor)localObject2).e & 0xF, (aor)localObject2);
/*      */             }
/*      */           }
/* 1328 */           g(((aor)localObject2).c, ((aor)localObject2).d, ((aor)localObject2).e);
/*      */         }
/*      */       }
/* 1331 */       this.a.clear();
/*      */     }
/* 1333 */     this.C.b();
/* 1334 */     this.C.b();
/*      */   }
/*      */   
/*      */   public void a(Collection paramCollection) {
/* 1338 */     if (this.M) {
/* 1339 */       this.a.addAll(paramCollection);
/*      */     } else {
/* 1341 */       this.g.addAll(paramCollection);
/*      */     }
/*      */   }
/*      */   
/*      */   public void g(sa paramsa) {
/* 1346 */     a(paramsa, true);
/*      */   }
/*      */   
/*      */   public void a(sa paramsa, boolean paramBoolean) {
/* 1350 */     int i1 = qh.c(paramsa.s);
/* 1351 */     int i2 = qh.c(paramsa.u);
/* 1352 */     int i3 = 32;
/* 1353 */     if ((paramBoolean) && (!b(i1 - i3, 0, i2 - i3, i1 + i3, 0, i2 + i3))) {
/* 1354 */       return;
/*      */     }
/*      */     
/* 1357 */     paramsa.S = paramsa.s;
/* 1358 */     paramsa.T = paramsa.t;
/* 1359 */     paramsa.U = paramsa.u;
/* 1360 */     paramsa.A = paramsa.y;
/* 1361 */     paramsa.B = paramsa.z;
/*      */     
/* 1363 */     if ((paramBoolean) && (paramsa.ag)) {
/* 1364 */       paramsa.aa += 1;
/* 1365 */       if (paramsa.m != null) {
/* 1366 */         paramsa.ab();
/*      */       } else {
/* 1368 */         paramsa.h();
/*      */       }
/*      */     }
/*      */     
/* 1372 */     this.C.a("chunkCheck");
/*      */     
/* 1374 */     if ((Double.isNaN(paramsa.s)) || (Double.isInfinite(paramsa.s))) paramsa.s = paramsa.S;
/* 1375 */     if ((Double.isNaN(paramsa.t)) || (Double.isInfinite(paramsa.t))) paramsa.t = paramsa.T;
/* 1376 */     if ((Double.isNaN(paramsa.u)) || (Double.isInfinite(paramsa.u))) paramsa.u = paramsa.U;
/* 1377 */     if ((Double.isNaN(paramsa.z)) || (Double.isInfinite(paramsa.z))) paramsa.z = paramsa.B;
/* 1378 */     if ((Double.isNaN(paramsa.y)) || (Double.isInfinite(paramsa.y))) { paramsa.y = paramsa.A;
/*      */     }
/* 1380 */     int i4 = qh.c(paramsa.s / 16.0D);
/* 1381 */     int i5 = qh.c(paramsa.t / 16.0D);
/* 1382 */     int i6 = qh.c(paramsa.u / 16.0D);
/*      */     
/* 1384 */     if ((!paramsa.ag) || (paramsa.ah != i4) || (paramsa.ai != i5) || (paramsa.aj != i6)) {
/* 1385 */       if ((paramsa.ag) && (c(paramsa.ah, paramsa.aj))) {
/* 1386 */         e(paramsa.ah, paramsa.aj).a(paramsa, paramsa.ai);
/*      */       }
/*      */       
/* 1389 */       if (c(i4, i6))
/*      */       {
/* 1391 */         paramsa.ag = true;
/* 1392 */         e(i4, i6).a(paramsa);
/*      */       } else {
/* 1394 */         paramsa.ag = false;
/*      */       }
/*      */     }
/* 1397 */     this.C.b();
/*      */     
/* 1399 */     if ((paramBoolean) && (paramsa.ag) && 
/* 1400 */       (paramsa.l != null)) {
/* 1401 */       if ((paramsa.l.K) || (paramsa.l.m != paramsa)) {
/* 1402 */         paramsa.l.m = null;
/* 1403 */         paramsa.l = null;
/*      */       } else {
/* 1405 */         g(paramsa.l);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean b(azt paramazt)
/*      */   {
/* 1412 */     return a(paramazt, null);
/*      */   }
/*      */   
/*      */   public boolean a(azt paramazt, sa paramsa) {
/* 1416 */     List localList = b(null, paramazt);
/* 1417 */     for (int i1 = 0; i1 < localList.size(); i1++) {
/* 1418 */       sa localsa = (sa)localList.get(i1);
/* 1419 */       if ((!localsa.K) && (localsa.k) && (localsa != paramsa)) return false;
/*      */     }
/* 1421 */     return true;
/*      */   }
/*      */   
/*      */   public boolean c(azt paramazt) {
/* 1425 */     int i1 = qh.c(paramazt.a);
/* 1426 */     int i2 = qh.c(paramazt.d + 1.0D);
/* 1427 */     int i3 = qh.c(paramazt.b);
/* 1428 */     int i4 = qh.c(paramazt.e + 1.0D);
/* 1429 */     int i5 = qh.c(paramazt.c);
/* 1430 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1432 */     if (paramazt.a < 0.0D) i1--;
/* 1433 */     if (paramazt.b < 0.0D) i3--;
/* 1434 */     if (paramazt.c < 0.0D) { i5--;
/*      */     }
/* 1436 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1437 */       for (int i8 = i3; i8 < i4; i8++)
/* 1438 */         for (int i9 = i5; i9 < i6; i9++) {
/* 1439 */           aji localaji = a(i7, i8, i9);
/* 1440 */           if (localaji.o() != awt.a)
/* 1441 */             return true;
/*      */         }
/*      */     }
/* 1444 */     return false;
/*      */   }
/*      */   
/*      */   public boolean d(azt paramazt) {
/* 1448 */     int i1 = qh.c(paramazt.a);
/* 1449 */     int i2 = qh.c(paramazt.d + 1.0D);
/* 1450 */     int i3 = qh.c(paramazt.b);
/* 1451 */     int i4 = qh.c(paramazt.e + 1.0D);
/* 1452 */     int i5 = qh.c(paramazt.c);
/* 1453 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1455 */     if (paramazt.a < 0.0D) i1--;
/* 1456 */     if (paramazt.b < 0.0D) i3--;
/* 1457 */     if (paramazt.c < 0.0D) { i5--;
/*      */     }
/* 1459 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1460 */       for (int i8 = i3; i8 < i4; i8++)
/* 1461 */         for (int i9 = i5; i9 < i6; i9++) {
/* 1462 */           aji localaji = a(i7, i8, i9);
/* 1463 */           if (localaji.o().d())
/* 1464 */             return true;
/*      */         }
/*      */     }
/* 1467 */     return false;
/*      */   }
/*      */   
/*      */   public boolean e(azt paramazt) {
/* 1471 */     int i1 = qh.c(paramazt.a);
/* 1472 */     int i2 = qh.c(paramazt.d + 1.0D);
/* 1473 */     int i3 = qh.c(paramazt.b);
/* 1474 */     int i4 = qh.c(paramazt.e + 1.0D);
/* 1475 */     int i5 = qh.c(paramazt.c);
/* 1476 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1478 */     if (b(i1, i3, i5, i2, i4, i6)) {
/* 1479 */       for (int i7 = i1; i7 < i2; i7++)
/* 1480 */         for (int i8 = i3; i8 < i4; i8++)
/* 1481 */           for (int i9 = i5; i9 < i6; i9++) {
/* 1482 */             aji localaji = a(i7, i8, i9);
/* 1483 */             if ((localaji == ajn.ab) || (localaji == ajn.k) || (localaji == ajn.l)) return true;
/*      */           }
/*      */     }
/* 1486 */     return false;
/*      */   }
/*      */   
/*      */   public boolean a(azt paramazt, awt paramawt, sa paramsa) {
/* 1490 */     int i1 = qh.c(paramazt.a);
/* 1491 */     int i2 = qh.c(paramazt.d + 1.0D);
/*      */     
/* 1493 */     int i3 = qh.c(paramazt.b);
/* 1494 */     int i4 = qh.c(paramazt.e + 1.0D);
/*      */     
/* 1496 */     int i5 = qh.c(paramazt.c);
/* 1497 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1499 */     if (!b(i1, i3, i5, i2, i4, i6)) {
/* 1500 */       return false;
/*      */     }
/*      */     
/* 1503 */     boolean bool = false;
/* 1504 */     azw localazw = azw.a(0.0D, 0.0D, 0.0D);
/* 1505 */     for (int i7 = i1; i7 < i2; i7++)
/* 1506 */       for (int i8 = i3; i8 < i4; i8++)
/* 1507 */         for (int i9 = i5; i9 < i6; i9++) {
/* 1508 */           aji localaji = a(i7, i8, i9);
/* 1509 */           if (localaji.o() == paramawt) {
/* 1510 */             double d2 = i8 + 1 - alw.b(e(i7, i8, i9));
/* 1511 */             if (i4 >= d2) {
/* 1512 */               bool = true;
/* 1513 */               localaji.a(this, i7, i8, i9, paramsa, localazw);
/*      */             }
/*      */           }
/*      */         }
/* 1517 */     if ((localazw.b() > 0.0D) && (paramsa.aC())) {
/* 1518 */       localazw = localazw.a();
/* 1519 */       double d1 = 0.014D;
/* 1520 */       paramsa.v += localazw.a * d1;
/* 1521 */       paramsa.w += localazw.b * d1;
/* 1522 */       paramsa.x += localazw.c * d1;
/*      */     }
/* 1524 */     return bool;
/*      */   }
/*      */   
/*      */   public boolean a(azt paramazt, awt paramawt) {
/* 1528 */     int i1 = qh.c(paramazt.a);
/* 1529 */     int i2 = qh.c(paramazt.d + 1.0D);
/* 1530 */     int i3 = qh.c(paramazt.b);
/* 1531 */     int i4 = qh.c(paramazt.e + 1.0D);
/* 1532 */     int i5 = qh.c(paramazt.c);
/* 1533 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1535 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1536 */       for (int i8 = i3; i8 < i4; i8++) {
/* 1537 */         for (int i9 = i5; i9 < i6; i9++)
/* 1538 */           if (a(i7, i8, i9).o() == paramawt)
/* 1539 */             return true;
/*      */       }
/*      */     }
/* 1542 */     return false;
/*      */   }
/*      */   
/*      */   public boolean b(azt paramazt, awt paramawt) {
/* 1546 */     int i1 = qh.c(paramazt.a);
/* 1547 */     int i2 = qh.c(paramazt.d + 1.0D);
/* 1548 */     int i3 = qh.c(paramazt.b);
/* 1549 */     int i4 = qh.c(paramazt.e + 1.0D);
/* 1550 */     int i5 = qh.c(paramazt.c);
/* 1551 */     int i6 = qh.c(paramazt.f + 1.0D);
/*      */     
/* 1553 */     for (int i7 = i1; i7 < i2; i7++) {
/* 1554 */       for (int i8 = i3; i8 < i4; i8++)
/* 1555 */         for (int i9 = i5; i9 < i6; i9++) {
/* 1556 */           aji localaji = a(i7, i8, i9);
/* 1557 */           if (localaji.o() == paramawt) {
/* 1558 */             int i10 = e(i7, i8, i9);
/* 1559 */             double d1 = i8 + 1;
/* 1560 */             if (i10 < 8) {
/* 1561 */               d1 = i8 + 1 - i10 / 8.0D;
/*      */             }
/* 1563 */             if (d1 >= paramazt.b)
/* 1564 */               return true;
/*      */           }
/*      */         }
/*      */     }
/* 1568 */     return false;
/*      */   }
/*      */   
/*      */   public agw a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean) {
/* 1572 */     return a(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat, false, paramBoolean);
/*      */   }
/*      */   
/*      */   public agw a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
/* 1576 */     agw localagw = new agw(this, paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/* 1577 */     localagw.a = paramBoolean1;
/* 1578 */     localagw.b = paramBoolean2;
/* 1579 */     localagw.a();
/* 1580 */     localagw.a(true);
/* 1581 */     return localagw;
/*      */   }
/*      */   
/*      */   public float a(azw paramazw, azt paramazt) {
/* 1585 */     double d1 = 1.0D / ((paramazt.d - paramazt.a) * 2.0D + 1.0D);
/* 1586 */     double d2 = 1.0D / ((paramazt.e - paramazt.b) * 2.0D + 1.0D);
/* 1587 */     double d3 = 1.0D / ((paramazt.f - paramazt.c) * 2.0D + 1.0D);
/* 1588 */     if ((d1 < 0.0D) || (d2 < 0.0D) || (d3 < 0.0D)) {
/* 1589 */       return 0.0F;
/*      */     }
/* 1591 */     int i1 = 0;
/* 1592 */     int i2 = 0;
/* 1593 */     for (float f1 = 0.0F; f1 <= 1.0F; f1 = (float)(f1 + d1)) {
/* 1594 */       for (float f2 = 0.0F; f2 <= 1.0F; f2 = (float)(f2 + d2))
/* 1595 */         for (float f3 = 0.0F; f3 <= 1.0F; f3 = (float)(f3 + d3)) {
/* 1596 */           double d4 = paramazt.a + (paramazt.d - paramazt.a) * f1;
/* 1597 */           double d5 = paramazt.b + (paramazt.e - paramazt.b) * f2;
/* 1598 */           double d6 = paramazt.c + (paramazt.f - paramazt.c) * f3;
/* 1599 */           if (a(azw.a(d4, d5, d6), paramazw) == null) i1++;
/* 1600 */           i2++;
/*      */         }
/*      */     }
/* 1603 */     return i1 / i2;
/*      */   }
/*      */   
/*      */   public boolean a(yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 1607 */     if (paramInt4 == 0) paramInt2--;
/* 1608 */     if (paramInt4 == 1) paramInt2++;
/* 1609 */     if (paramInt4 == 2) paramInt3--;
/* 1610 */     if (paramInt4 == 3) paramInt3++;
/* 1611 */     if (paramInt4 == 4) paramInt1--;
/* 1612 */     if (paramInt4 == 5) { paramInt1++;
/*      */     }
/* 1614 */     if (a(paramInt1, paramInt2, paramInt3) == ajn.ab) {
/* 1615 */       a(paramyz, 1004, paramInt1, paramInt2, paramInt3, 0);
/* 1616 */       f(paramInt1, paramInt2, paramInt3);
/* 1617 */       return true;
/*      */     }
/* 1619 */     return false;
/*      */   }
/*      */   
/*      */   public String z()
/*      */   {
/* 1624 */     return "All: " + this.e.size();
/*      */   }
/*      */   
/*      */   public String A()
/*      */   {
/* 1629 */     return this.v.f();
/*      */   }
/*      */   
/*      */   public aor o(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1634 */     if ((paramInt2 < 0) || (paramInt2 >= 256)) {
/* 1635 */       return null;
/*      */     }
/* 1637 */     Object localObject = null;
/*      */     aor localaor;
/* 1639 */     if (this.M) {
/* 1640 */       for (int i1 = 0; i1 < this.a.size(); i1++) {
/* 1641 */         localaor = (aor)this.a.get(i1);
/* 1642 */         if ((!localaor.r()) && (localaor.c == paramInt1) && (localaor.d == paramInt2) && (localaor.e == paramInt3)) {
/* 1643 */           localObject = localaor;
/* 1644 */           break;
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1649 */     if (localObject == null) {
/* 1650 */       apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/* 1651 */       if (localapx != null) {
/* 1652 */         localObject = localapx.e(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */       }
/*      */     }
/*      */     
/* 1656 */     if (localObject == null) {
/* 1657 */       for (int i2 = 0; i2 < this.a.size(); i2++) {
/* 1658 */         localaor = (aor)this.a.get(i2);
/* 1659 */         if ((!localaor.r()) && (localaor.c == paramInt1) && (localaor.d == paramInt2) && (localaor.e == paramInt3)) {
/* 1660 */           localObject = localaor;
/* 1661 */           break;
/*      */         }
/*      */       }
/*      */     }
/* 1665 */     return (aor)localObject;
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, aor paramaor) {
/* 1669 */     if ((paramaor != null) && (!paramaor.r())) { Object localObject;
/* 1670 */       if (this.M) {
/* 1671 */         paramaor.c = paramInt1;
/* 1672 */         paramaor.d = paramInt2;
/* 1673 */         paramaor.e = paramInt3;
/*      */         
/*      */ 
/* 1676 */         localObject = this.a.iterator();
/* 1677 */         while (((Iterator)localObject).hasNext()) {
/* 1678 */           aor localaor = (aor)((Iterator)localObject).next();
/* 1679 */           if ((localaor.c == paramInt1) && (localaor.d == paramInt2) && (localaor.e == paramInt3)) {
/* 1680 */             localaor.s();
/* 1681 */             ((Iterator)localObject).remove();
/*      */           }
/*      */         }
/*      */         
/* 1685 */         this.a.add(paramaor);
/*      */       } else {
/* 1687 */         this.g.add(paramaor);
/*      */         
/* 1689 */         localObject = e(paramInt1 >> 4, paramInt3 >> 4);
/* 1690 */         if (localObject != null) ((apx)localObject).a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF, paramaor);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void p(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1697 */     aor localaor = o(paramInt1, paramInt2, paramInt3);
/* 1698 */     if ((localaor != null) && (this.M)) {
/* 1699 */       localaor.s();
/* 1700 */       this.a.remove(localaor);
/*      */     } else {
/* 1702 */       if (localaor != null) {
/* 1703 */         this.a.remove(localaor);
/* 1704 */         this.g.remove(localaor);
/*      */       }
/*      */       
/* 1707 */       apx localapx = e(paramInt1 >> 4, paramInt3 >> 4);
/* 1708 */       if (localapx != null) localapx.f(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(aor paramaor) {
/* 1713 */     this.b.add(paramaor);
/*      */   }
/*      */   
/*      */   public boolean q(int paramInt1, int paramInt2, int paramInt3) {
/* 1717 */     azt localazt = a(paramInt1, paramInt2, paramInt3).a(this, paramInt1, paramInt2, paramInt3);
/* 1718 */     return (localazt != null) && (localazt.a() >= 1.0D);
/*      */   }
/*      */   
/*      */   public static boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 1723 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 1724 */     int i1 = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 1725 */     if ((localaji.o().k()) && (localaji.d())) return true;
/* 1726 */     if ((localaji instanceof ans)) return (i1 & 0x4) == 4;
/* 1727 */     if ((localaji instanceof alj)) return (i1 & 0x8) == 8;
/* 1728 */     if ((localaji instanceof aln)) return true;
/* 1729 */     if ((localaji instanceof ann)) return (i1 & 0x7) == 7;
/* 1730 */     return false;
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
/*      */   public boolean c(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*      */   {
/* 1748 */     if ((paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 >= 30000000)) {
/* 1749 */       return paramBoolean;
/*      */     }
/* 1751 */     apx localapx = this.v.d(paramInt1 >> 4, paramInt3 >> 4);
/* 1752 */     if ((localapx == null) || (localapx.g())) {
/* 1753 */       return paramBoolean;
/*      */     }
/*      */     
/* 1756 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/* 1757 */     return (localaji.o().k()) && (localaji.d());
/*      */   }
/*      */   
/*      */   public void B() {
/* 1761 */     int i1 = a(1.0F);
/* 1762 */     if (i1 != this.j) {
/* 1763 */       this.j = i1;
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(boolean paramBoolean1, boolean paramBoolean2) {
/* 1768 */     this.G = paramBoolean1;
/* 1769 */     this.H = paramBoolean2;
/*      */   }
/*      */   
/*      */   public void b() {
/* 1773 */     o();
/*      */   }
/*      */   
/*      */   private void a() {
/* 1777 */     if (this.x.p()) {
/* 1778 */       this.n = 1.0F;
/* 1779 */       if (this.x.n()) {
/* 1780 */         this.p = 1.0F;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected void o() {
/* 1786 */     if (this.t.g) return;
/* 1787 */     if (this.E) { return;
/*      */     }
/*      */     
/* 1790 */     int i1 = this.x.o();
/* 1791 */     if (i1 <= 0) {
/* 1792 */       if (this.x.n()) {
/* 1793 */         this.x.f(this.s.nextInt(12000) + 3600);
/*      */       } else {
/* 1795 */         this.x.f(this.s.nextInt(168000) + 12000);
/*      */       }
/*      */     } else {
/* 1798 */       i1--;
/* 1799 */       this.x.f(i1);
/* 1800 */       if (i1 <= 0) {
/* 1801 */         this.x.a(!this.x.n());
/*      */       }
/*      */     }
/*      */     
/* 1805 */     this.o = this.p;
/* 1806 */     if (this.x.n()) {
/* 1807 */       this.p = ((float)(this.p + 0.01D));
/*      */     } else {
/* 1809 */       this.p = ((float)(this.p - 0.01D));
/*      */     }
/* 1811 */     this.p = qh.a(this.p, 0.0F, 1.0F);
/*      */     
/*      */ 
/* 1814 */     int i2 = this.x.q();
/* 1815 */     if (i2 <= 0) {
/* 1816 */       if (this.x.p()) {
/* 1817 */         this.x.g(this.s.nextInt(12000) + 12000);
/*      */       } else {
/* 1819 */         this.x.g(this.s.nextInt(168000) + 12000);
/*      */       }
/*      */     } else {
/* 1822 */       i2--;
/* 1823 */       this.x.g(i2);
/* 1824 */       if (i2 <= 0) {
/* 1825 */         this.x.b(!this.x.p());
/*      */       }
/*      */     }
/*      */     
/* 1829 */     this.m = this.n;
/* 1830 */     if (this.x.p()) {
/* 1831 */       this.n = ((float)(this.n + 0.01D));
/*      */     } else {
/* 1833 */       this.n = ((float)(this.n - 0.01D));
/*      */     }
/* 1835 */     this.n = qh.a(this.n, 0.0F, 1.0F);
/*      */   }
/*      */   
/*      */   protected void C() {
/* 1839 */     this.F.clear();
/*      */     
/* 1841 */     this.C.a("buildList");
/* 1842 */     yz localyz; int i2; int i3; int i4; for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 1843 */       localyz = (yz)this.h.get(i1);
/* 1844 */       i2 = qh.c(localyz.s / 16.0D);
/* 1845 */       i3 = qh.c(localyz.u / 16.0D);
/*      */       
/* 1847 */       i4 = p();
/* 1848 */       for (int i5 = -i4; i5 <= i4; i5++) {
/* 1849 */         for (int i6 = -i4; i6 <= i4; i6++) {
/* 1850 */           this.F.add(new agu(i5 + i2, i6 + i3));
/*      */         }
/*      */       }
/*      */     }
/* 1854 */     this.C.b();
/*      */     
/* 1856 */     if (this.K > 0) { this.K -= 1;
/*      */     }
/* 1858 */     this.C.a("playerCheckLight");
/*      */     
/* 1860 */     if (!this.h.isEmpty()) {
/* 1861 */       i1 = this.s.nextInt(this.h.size());
/* 1862 */       localyz = (yz)this.h.get(i1);
/* 1863 */       i2 = qh.c(localyz.s) + this.s.nextInt(11) - 5;
/* 1864 */       i3 = qh.c(localyz.t) + this.s.nextInt(11) - 5;
/* 1865 */       i4 = qh.c(localyz.u) + this.s.nextInt(11) - 5;
/* 1866 */       t(i2, i3, i4);
/*      */     }
/* 1868 */     this.C.b();
/*      */   }
/*      */   
/*      */   protected abstract int p();
/*      */   
/*      */   protected void a(int paramInt1, int paramInt2, apx paramapx)
/*      */   {
/* 1875 */     this.C.c("moodSound");
/* 1876 */     if ((this.K == 0) && (!this.E)) {
/* 1877 */       this.k = (this.k * 3 + 1013904223);
/* 1878 */       int i1 = this.k >> 2;
/* 1879 */       int i2 = i1 & 0xF;
/* 1880 */       int i3 = i1 >> 8 & 0xF;
/* 1881 */       int i4 = i1 >> 16 & 0xFF;
/*      */       
/* 1883 */       aji localaji = paramapx.a(i2, i4, i3);
/* 1884 */       i2 += paramInt1;
/* 1885 */       i3 += paramInt2;
/* 1886 */       if ((localaji.o() == awt.a) && (j(i2, i4, i3) <= this.s.nextInt(8)) && (b(ahn.a, i2, i4, i3) <= 0)) {
/* 1887 */         yz localyz = a(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D, 8.0D);
/* 1888 */         if ((localyz != null) && (localyz.e(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D) > 4.0D)) {
/* 1889 */           a(i2 + 0.5D, i4 + 0.5D, i3 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.s.nextFloat() * 0.2F);
/* 1890 */           this.K = (this.s.nextInt(12000) + 6000);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1895 */     this.C.c("checkLight");
/* 1896 */     paramapx.o();
/*      */   }
/*      */   
/*      */   protected void g() {
/* 1900 */     C();
/*      */   }
/*      */   
/*      */   public boolean r(int paramInt1, int paramInt2, int paramInt3) {
/* 1904 */     return d(paramInt1, paramInt2, paramInt3, false);
/*      */   }
/*      */   
/*      */   public boolean s(int paramInt1, int paramInt2, int paramInt3) {
/* 1908 */     return d(paramInt1, paramInt2, paramInt3, true);
/*      */   }
/*      */   
/*      */   public boolean d(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 1912 */     ahu localahu = a(paramInt1, paramInt3);
/* 1913 */     float f1 = localahu.a(paramInt1, paramInt2, paramInt3);
/* 1914 */     if (f1 > 0.15F) { return false;
/*      */     }
/* 1916 */     if ((paramInt2 >= 0) && (paramInt2 < 256) && (b(ahn.b, paramInt1, paramInt2, paramInt3) < 10)) {
/* 1917 */       aji localaji = a(paramInt1, paramInt2, paramInt3);
/* 1918 */       if (((localaji == ajn.j) || (localaji == ajn.i)) && (e(paramInt1, paramInt2, paramInt3) == 0)) {
/* 1919 */         if (!paramBoolean) { return true;
/*      */         }
/* 1921 */         int i1 = 1;
/* 1922 */         if ((i1 != 0) && (a(paramInt1 - 1, paramInt2, paramInt3).o() != awt.h)) i1 = 0;
/* 1923 */         if ((i1 != 0) && (a(paramInt1 + 1, paramInt2, paramInt3).o() != awt.h)) i1 = 0;
/* 1924 */         if ((i1 != 0) && (a(paramInt1, paramInt2, paramInt3 - 1).o() != awt.h)) i1 = 0;
/* 1925 */         if ((i1 != 0) && (a(paramInt1, paramInt2, paramInt3 + 1).o() != awt.h)) i1 = 0;
/* 1926 */         if (i1 == 0) return true;
/*      */       }
/*      */     }
/* 1929 */     return false;
/*      */   }
/*      */   
/*      */   public boolean e(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 1933 */     ahu localahu = a(paramInt1, paramInt3);
/* 1934 */     float f1 = localahu.a(paramInt1, paramInt2, paramInt3);
/* 1935 */     if (f1 > 0.15F) return false;
/* 1936 */     if (!paramBoolean) { return true;
/*      */     }
/* 1938 */     if ((paramInt2 >= 0) && (paramInt2 < 256) && (b(ahn.b, paramInt1, paramInt2, paramInt3) < 10)) {
/* 1939 */       aji localaji = a(paramInt1, paramInt2, paramInt3);
/*      */       
/*      */ 
/* 1942 */       if ((localaji.o() == awt.a) && (ajn.aC.c(this, paramInt1, paramInt2, paramInt3))) {
/* 1943 */         return true;
/*      */       }
/*      */     }
/*      */     
/* 1947 */     return false;
/*      */   }
/*      */   
/*      */   public boolean t(int paramInt1, int paramInt2, int paramInt3) {
/* 1951 */     boolean bool = false;
/* 1952 */     if (!this.t.g) bool |= c(ahn.a, paramInt1, paramInt2, paramInt3);
/* 1953 */     bool |= c(ahn.b, paramInt1, paramInt2, paramInt3);
/* 1954 */     return bool;
/*      */   }
/*      */   
/* 1957 */   int[] I = new int[32768];
/*      */   
/*      */   private int a(int paramInt1, int paramInt2, int paramInt3, ahn paramahn) {
/* 1960 */     if ((paramahn == ahn.a) && (i(paramInt1, paramInt2, paramInt3))) return 15;
/* 1961 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/* 1962 */     int i1 = paramahn == ahn.a ? 0 : localaji.m();
/* 1963 */     int i2 = localaji.k();
/* 1964 */     if ((i2 >= 15) && (localaji.m() > 0)) i2 = 1;
/* 1965 */     if (i2 < 1) i2 = 1;
/* 1966 */     if (i2 >= 15) { return 0;
/*      */     }
/* 1968 */     if (i1 >= 14) { return i1;
/*      */     }
/* 1970 */     for (int i3 = 0; i3 < 6; i3++) {
/* 1971 */       int i4 = paramInt1 + q.b[i3];
/* 1972 */       int i5 = paramInt2 + q.c[i3];
/* 1973 */       int i6 = paramInt3 + q.d[i3];
/* 1974 */       int i7 = b(paramahn, i4, i5, i6) - i2;
/*      */       
/* 1976 */       if (i7 > i1) i1 = i7;
/* 1977 */       if (i1 >= 14) { return i1;
/*      */       }
/*      */     }
/* 1980 */     return i1;
/*      */   }
/*      */   
/*      */   public boolean c(ahn paramahn, int paramInt1, int paramInt2, int paramInt3) {
/* 1984 */     if (!a(paramInt1, paramInt2, paramInt3, 17)) { return false;
/*      */     }
/* 1986 */     int i1 = 0;
/* 1987 */     int i2 = 0;
/*      */     
/* 1989 */     this.C.a("getBrightness");
/* 1990 */     int i3 = b(paramahn, paramInt1, paramInt2, paramInt3);
/* 1991 */     int i4 = a(paramInt1, paramInt2, paramInt3, paramahn);
/*      */     int i5;
/* 1993 */     int i6; int i7; int i8; int i9; int i10; int i11; int i12; int i13; int i14; if (i4 > i3) {
/* 1994 */       this.I[(i2++)] = 133152;
/* 1995 */     } else if (i4 < i3) {
/* 1996 */       this.I[(i2++)] = (0x20820 | i3 << 18);
/*      */       
/*      */ 
/* 1999 */       while (i1 < i2) {
/* 2000 */         i5 = this.I[(i1++)];
/* 2001 */         i6 = (i5 & 0x3F) - 32 + paramInt1;
/* 2002 */         i7 = (i5 >> 6 & 0x3F) - 32 + paramInt2;
/* 2003 */         i8 = (i5 >> 12 & 0x3F) - 32 + paramInt3;
/* 2004 */         i9 = i5 >> 18 & 0xF;
/* 2005 */         i10 = b(paramahn, i6, i7, i8);
/*      */         
/* 2007 */         if (i10 == i9) {
/* 2008 */           b(paramahn, i6, i7, i8, 0);
/*      */           
/* 2010 */           if (i9 > 0) {
/* 2011 */             i11 = qh.a(i6 - paramInt1);
/* 2012 */             i12 = qh.a(i7 - paramInt2);
/* 2013 */             i13 = qh.a(i8 - paramInt3);
/*      */             
/* 2015 */             if (i11 + i12 + i13 < 17) {
/* 2016 */               for (i14 = 0; i14 < 6; i14++) {
/* 2017 */                 int i15 = i6 + q.b[i14];
/* 2018 */                 int i16 = i7 + q.c[i14];
/* 2019 */                 int i17 = i8 + q.d[i14];
/* 2020 */                 int i18 = Math.max(1, a(i15, i16, i17).k());
/*      */                 
/* 2022 */                 i10 = b(paramahn, i15, i16, i17);
/*      */                 
/* 2024 */                 if ((i10 == i9 - i18) && (i2 < this.I.length)) {
/* 2025 */                   this.I[(i2++)] = (i15 - paramInt1 + 32 | i16 - paramInt2 + 32 << 6 | i17 - paramInt3 + 32 << 12 | i9 - i18 << 18);
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/* 2032 */       i1 = 0;
/*      */     }
/* 2034 */     this.C.b();
/*      */     
/* 2036 */     this.C.a("checkedPosition < toCheckCount");
/* 2037 */     while (i1 < i2) {
/* 2038 */       i5 = this.I[(i1++)];
/* 2039 */       i6 = (i5 & 0x3F) - 32 + paramInt1;
/* 2040 */       i7 = (i5 >> 6 & 0x3F) - 32 + paramInt2;
/* 2041 */       i8 = (i5 >> 12 & 0x3F) - 32 + paramInt3;
/*      */       
/* 2043 */       i9 = b(paramahn, i6, i7, i8);
/* 2044 */       i10 = a(i6, i7, i8, paramahn);
/*      */       
/* 2046 */       if (i10 != i9) {
/* 2047 */         b(paramahn, i6, i7, i8, i10);
/*      */         
/* 2049 */         if (i10 > i9) {
/* 2050 */           i11 = Math.abs(i6 - paramInt1);
/* 2051 */           i12 = Math.abs(i7 - paramInt2);
/* 2052 */           i13 = Math.abs(i8 - paramInt3);
/* 2053 */           i14 = i2 < this.I.length - 6 ? 1 : 0;
/*      */           
/* 2055 */           if ((i11 + i12 + i13 < 17) && (i14 != 0)) {
/* 2056 */             if (b(paramahn, i6 - 1, i7, i8) < i10) this.I[(i2++)] = (i6 - 1 - paramInt1 + 32 + (i7 - paramInt2 + 32 << 6) + (i8 - paramInt3 + 32 << 12));
/* 2057 */             if (b(paramahn, i6 + 1, i7, i8) < i10) this.I[(i2++)] = (i6 + 1 - paramInt1 + 32 + (i7 - paramInt2 + 32 << 6) + (i8 - paramInt3 + 32 << 12));
/* 2058 */             if (b(paramahn, i6, i7 - 1, i8) < i10) this.I[(i2++)] = (i6 - paramInt1 + 32 + (i7 - 1 - paramInt2 + 32 << 6) + (i8 - paramInt3 + 32 << 12));
/* 2059 */             if (b(paramahn, i6, i7 + 1, i8) < i10) this.I[(i2++)] = (i6 - paramInt1 + 32 + (i7 + 1 - paramInt2 + 32 << 6) + (i8 - paramInt3 + 32 << 12));
/* 2060 */             if (b(paramahn, i6, i7, i8 - 1) < i10) this.I[(i2++)] = (i6 - paramInt1 + 32 + (i7 - paramInt2 + 32 << 6) + (i8 - 1 - paramInt3 + 32 << 12));
/* 2061 */             if (b(paramahn, i6, i7, i8 + 1) < i10) this.I[(i2++)] = (i6 - paramInt1 + 32 + (i7 - paramInt2 + 32 << 6) + (i8 + 1 - paramInt3 + 32 << 12));
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 2066 */     this.C.b();
/*      */     
/* 2068 */     return true;
/*      */   }
/*      */   
/*      */   public boolean a(boolean paramBoolean) {
/* 2072 */     return false;
/*      */   }
/*      */   
/*      */   public List a(apx paramapx, boolean paramBoolean) {
/* 2076 */     return null;
/*      */   }
/*      */   
/*      */   public List b(sa paramsa, azt paramazt) {
/* 2080 */     return a(paramsa, paramazt, null);
/*      */   }
/*      */   
/*      */   public List a(sa paramsa, azt paramazt, sj paramsj) {
/* 2084 */     ArrayList localArrayList = new ArrayList();
/* 2085 */     int i1 = qh.c((paramazt.a - 2.0D) / 16.0D);
/* 2086 */     int i2 = qh.c((paramazt.d + 2.0D) / 16.0D);
/* 2087 */     int i3 = qh.c((paramazt.c - 2.0D) / 16.0D);
/* 2088 */     int i4 = qh.c((paramazt.f + 2.0D) / 16.0D);
/* 2089 */     for (int i5 = i1; i5 <= i2; i5++) {
/* 2090 */       for (int i6 = i3; i6 <= i4; i6++) {
/* 2091 */         if (c(i5, i6))
/* 2092 */           e(i5, i6).a(paramsa, paramazt, localArrayList, paramsj);
/*      */       }
/*      */     }
/* 2095 */     return localArrayList;
/*      */   }
/*      */   
/*      */   public List a(Class paramClass, azt paramazt) {
/* 2099 */     return a(paramClass, paramazt, null);
/*      */   }
/*      */   
/*      */   public List a(Class paramClass, azt paramazt, sj paramsj) {
/* 2103 */     int i1 = qh.c((paramazt.a - 2.0D) / 16.0D);
/* 2104 */     int i2 = qh.c((paramazt.d + 2.0D) / 16.0D);
/* 2105 */     int i3 = qh.c((paramazt.c - 2.0D) / 16.0D);
/* 2106 */     int i4 = qh.c((paramazt.f + 2.0D) / 16.0D);
/* 2107 */     ArrayList localArrayList = new ArrayList();
/*      */     
/* 2109 */     for (int i5 = i1; i5 <= i2; i5++) {
/* 2110 */       for (int i6 = i3; i6 <= i4; i6++) {
/* 2111 */         if (c(i5, i6)) {
/* 2112 */           e(i5, i6).a(paramClass, paramazt, localArrayList, paramsj);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 2117 */     return localArrayList;
/*      */   }
/*      */   
/*      */   public sa a(Class paramClass, azt paramazt, sa paramsa) {
/* 2121 */     List localList = a(paramClass, paramazt);
/* 2122 */     Object localObject = null;
/* 2123 */     double d1 = Double.MAX_VALUE;
/* 2124 */     for (int i1 = 0; i1 < localList.size(); i1++) {
/* 2125 */       sa localsa = (sa)localList.get(i1);
/* 2126 */       if (localsa != paramsa) {
/* 2127 */         double d2 = paramsa.f(localsa);
/* 2128 */         if (d2 <= d1) {
/* 2129 */           localObject = localsa;
/* 2130 */           d1 = d2;
/*      */         } } }
/* 2132 */     return (sa)localObject;
/*      */   }
/*      */   
/*      */   public abstract sa a(int paramInt);
/*      */   
/*      */   public List D()
/*      */   {
/* 2139 */     return this.e;
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, aor paramaor) {
/* 2143 */     if (d(paramInt1, paramInt2, paramInt3)) {
/* 2144 */       d(paramInt1, paramInt3).e();
/*      */     }
/*      */   }
/*      */   
/*      */   public int a(Class paramClass) {
/* 2149 */     int i1 = 0;
/* 2150 */     for (int i2 = 0; i2 < this.e.size(); i2++) {
/* 2151 */       sa localsa = (sa)this.e.get(i2);
/* 2152 */       if (((!(localsa instanceof sw)) || (!((sw)localsa).bK())) && 
/* 2153 */         (paramClass.isAssignableFrom(localsa.getClass()))) i1++;
/*      */     }
/* 2155 */     return i1;
/*      */   }
/*      */   
/*      */   public void a(List paramList) {
/* 2159 */     this.e.addAll(paramList);
/* 2160 */     for (int i1 = 0; i1 < paramList.size(); i1++) {
/* 2161 */       a((sa)paramList.get(i1));
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(List paramList) {
/* 2166 */     this.f.addAll(paramList);
/*      */   }
/*      */   
/*      */   public boolean a(aji paramaji, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, sa paramsa, add paramadd) {
/* 2170 */     aji localaji = a(paramInt1, paramInt2, paramInt3);
/*      */     
/* 2172 */     azt localazt = paramBoolean ? null : paramaji.a(this, paramInt1, paramInt2, paramInt3);
/* 2173 */     if ((localazt != null) && (!a(localazt, paramsa))) { return false;
/*      */     }
/*      */     
/* 2176 */     if ((localaji.o() == awt.q) && (paramaji == ajn.bQ)) { return true;
/*      */     }
/* 2178 */     return (localaji.o().j()) && (paramaji.a(this, paramInt1, paramInt2, paramInt3, paramInt4, paramadd));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public ayf a(sa paramsa1, sa paramsa2, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
/*      */   {
/* 2187 */     this.C.a("pathfind");
/* 2188 */     int i1 = qh.c(paramsa1.s);
/* 2189 */     int i2 = qh.c(paramsa1.t + 1.0D);
/* 2190 */     int i3 = qh.c(paramsa1.u);
/*      */     
/* 2192 */     int i4 = (int)(paramFloat + 16.0F);
/* 2193 */     int i5 = i1 - i4;
/* 2194 */     int i6 = i2 - i4;
/* 2195 */     int i7 = i3 - i4;
/* 2196 */     int i8 = i1 + i4;
/* 2197 */     int i9 = i2 + i4;
/* 2198 */     int i10 = i3 + i4;
/* 2199 */     ahr localahr = new ahr(this, i5, i6, i7, i8, i9, i10, 0);
/* 2200 */     ayf localayf = new ayg(localahr, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4).a(paramsa1, paramsa2, paramFloat);
/* 2201 */     this.C.b();
/* 2202 */     return localayf;
/*      */   }
/*      */   
/*      */   public ayf a(sa paramsa, int paramInt1, int paramInt2, int paramInt3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
/* 2206 */     this.C.a("pathfind");
/* 2207 */     int i1 = qh.c(paramsa.s);
/* 2208 */     int i2 = qh.c(paramsa.t);
/* 2209 */     int i3 = qh.c(paramsa.u);
/*      */     
/* 2211 */     int i4 = (int)(paramFloat + 8.0F);
/* 2212 */     int i5 = i1 - i4;
/* 2213 */     int i6 = i2 - i4;
/* 2214 */     int i7 = i3 - i4;
/* 2215 */     int i8 = i1 + i4;
/* 2216 */     int i9 = i2 + i4;
/* 2217 */     int i10 = i3 + i4;
/* 2218 */     ahr localahr = new ahr(this, i5, i6, i7, i8, i9, i10, 0);
/* 2219 */     ayf localayf = new ayg(localahr, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4).a(paramsa, paramInt1, paramInt2, paramInt3, paramFloat);
/* 2220 */     this.C.b();
/* 2221 */     return localayf;
/*      */   }
/*      */   
/*      */   public int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*      */   {
/* 2226 */     return a(paramInt1, paramInt2, paramInt3).c(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public int u(int paramInt1, int paramInt2, int paramInt3) {
/* 2230 */     int i1 = 0;
/* 2231 */     i1 = Math.max(i1, e(paramInt1, paramInt2 - 1, paramInt3, 0));
/* 2232 */     if (i1 >= 15) return i1;
/* 2233 */     i1 = Math.max(i1, e(paramInt1, paramInt2 + 1, paramInt3, 1));
/* 2234 */     if (i1 >= 15) return i1;
/* 2235 */     i1 = Math.max(i1, e(paramInt1, paramInt2, paramInt3 - 1, 2));
/* 2236 */     if (i1 >= 15) return i1;
/* 2237 */     i1 = Math.max(i1, e(paramInt1, paramInt2, paramInt3 + 1, 3));
/* 2238 */     if (i1 >= 15) return i1;
/* 2239 */     i1 = Math.max(i1, e(paramInt1 - 1, paramInt2, paramInt3, 4));
/* 2240 */     if (i1 >= 15) return i1;
/* 2241 */     i1 = Math.max(i1, e(paramInt1 + 1, paramInt2, paramInt3, 5));
/* 2242 */     if (i1 >= 15) return i1;
/* 2243 */     return i1;
/*      */   }
/*      */   
/*      */   public boolean f(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 2247 */     return g(paramInt1, paramInt2, paramInt3, paramInt4) > 0;
/*      */   }
/*      */   
/*      */   public int g(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 2251 */     if (a(paramInt1, paramInt2, paramInt3).r()) {
/* 2252 */       return u(paramInt1, paramInt2, paramInt3);
/*      */     }
/* 2254 */     return a(paramInt1, paramInt2, paramInt3).b(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*      */   }
/*      */   
/*      */   public boolean v(int paramInt1, int paramInt2, int paramInt3) {
/* 2258 */     if (g(paramInt1, paramInt2 - 1, paramInt3, 0) > 0) return true;
/* 2259 */     if (g(paramInt1, paramInt2 + 1, paramInt3, 1) > 0) return true;
/* 2260 */     if (g(paramInt1, paramInt2, paramInt3 - 1, 2) > 0) return true;
/* 2261 */     if (g(paramInt1, paramInt2, paramInt3 + 1, 3) > 0) return true;
/* 2262 */     if (g(paramInt1 - 1, paramInt2, paramInt3, 4) > 0) return true;
/* 2263 */     if (g(paramInt1 + 1, paramInt2, paramInt3, 5) > 0) return true;
/* 2264 */     return false;
/*      */   }
/*      */   
/*      */   public int w(int paramInt1, int paramInt2, int paramInt3) {
/* 2268 */     int i1 = 0;
/*      */     
/* 2270 */     for (int i2 = 0; i2 < 6; i2++) {
/* 2271 */       int i3 = g(paramInt1 + q.b[i2], paramInt2 + q.c[i2], paramInt3 + q.d[i2], i2);
/*      */       
/* 2273 */       if (i3 >= 15) return 15;
/* 2274 */       if (i3 > i1) { i1 = i3;
/*      */       }
/*      */     }
/* 2277 */     return i1;
/*      */   }
/*      */   
/*      */   public yz a(sa paramsa, double paramDouble) {
/* 2281 */     return a(paramsa.s, paramsa.t, paramsa.u, paramDouble);
/*      */   }
/*      */   
/*      */   public yz a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 2285 */     double d1 = -1.0D;
/* 2286 */     Object localObject = null;
/* 2287 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 2288 */       yz localyz = (yz)this.h.get(i1);
/* 2289 */       double d2 = localyz.e(paramDouble1, paramDouble2, paramDouble3);
/* 2290 */       if (((paramDouble4 < 0.0D) || (d2 < paramDouble4 * paramDouble4)) && ((d1 == -1.0D) || (d2 < d1))) {
/* 2291 */         d1 = d2;
/* 2292 */         localObject = localyz;
/*      */       }
/*      */     }
/* 2295 */     return (yz)localObject;
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
/*      */   public yz b(sa paramsa, double paramDouble)
/*      */   {
/* 2313 */     return b(paramsa.s, paramsa.t, paramsa.u, paramDouble);
/*      */   }
/*      */   
/*      */   public yz b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 2317 */     double d1 = -1.0D;
/* 2318 */     Object localObject = null;
/* 2319 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 2320 */       yz localyz = (yz)this.h.get(i1);
/* 2321 */       if ((!localyz.bE.a) && (localyz.Z()))
/*      */       {
/*      */ 
/* 2324 */         double d2 = localyz.e(paramDouble1, paramDouble2, paramDouble3);
/* 2325 */         double d3 = paramDouble4;
/*      */         
/* 2327 */         if (localyz.an()) {
/* 2328 */           d3 *= 0.800000011920929D;
/*      */         }
/* 2330 */         if (localyz.ap()) {
/* 2331 */           float f1 = localyz.bE();
/* 2332 */           if (f1 < 0.1F) {
/* 2333 */             f1 = 0.1F;
/*      */           }
/* 2335 */           d3 *= 0.7F * f1;
/*      */         }
/* 2337 */         if (((paramDouble4 < 0.0D) || (d2 < d3 * d3)) && ((d1 == -1.0D) || (d2 < d1))) {
/* 2338 */           d1 = d2;
/* 2339 */           localObject = localyz;
/*      */         }
/*      */       } }
/* 2342 */     return (yz)localObject;
/*      */   }
/*      */   
/*      */   public yz a(String paramString) {
/* 2346 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 2347 */       yz localyz = (yz)this.h.get(i1);
/* 2348 */       if (paramString.equals(localyz.b_())) {
/* 2349 */         return localyz;
/*      */       }
/*      */     }
/* 2352 */     return null;
/*      */   }
/*      */   
/*      */   public yz a(UUID paramUUID)
/*      */   {
/* 2357 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 2358 */       yz localyz = (yz)this.h.get(i1);
/* 2359 */       if (paramUUID.equals(localyz.aB())) {
/* 2360 */         return localyz;
/*      */       }
/*      */     }
/* 2363 */     return null;
/*      */   }
/*      */   
/*      */   public void F() {}
/*      */   
/*      */   public void G()
/*      */   {
/* 2370 */     this.w.c();
/*      */   }
/*      */   
/*      */   public void a(long paramLong) {
/* 2374 */     this.x.b(paramLong);
/*      */   }
/*      */   
/*      */   public long H() {
/* 2378 */     return this.x.b();
/*      */   }
/*      */   
/*      */   public long I() {
/* 2382 */     return this.x.f();
/*      */   }
/*      */   
/*      */   public long J() {
/* 2386 */     return this.x.g();
/*      */   }
/*      */   
/*      */   public void b(long paramLong) {
/* 2390 */     this.x.c(paramLong);
/*      */   }
/*      */   
/*      */   public r K()
/*      */   {
/* 2395 */     return new r(this.x.c(), this.x.d(), this.x.e());
/*      */   }
/*      */   
/*      */   public void x(int paramInt1, int paramInt2, int paramInt3) {
/* 2399 */     this.x.a(paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void h(sa paramsa)
/*      */   {
/* 2407 */     int i1 = qh.c(paramsa.s / 16.0D);
/* 2408 */     int i2 = qh.c(paramsa.u / 16.0D);
/* 2409 */     int i3 = 2;
/* 2410 */     for (int i4 = i1 - i3; i4 <= i1 + i3; i4++) {
/* 2411 */       for (int i5 = i2 - i3; i5 <= i2 + i3; i5++) {
/* 2412 */         e(i4, i5);
/*      */       }
/*      */     }
/*      */     
/* 2416 */     if (!this.e.contains(paramsa)) {
/* 2417 */       this.e.add(paramsa);
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean a(yz paramyz, int paramInt1, int paramInt2, int paramInt3) {
/* 2422 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(sa paramsa, byte paramByte) {}
/*      */   
/*      */   public apu L()
/*      */   {
/* 2430 */     return this.v;
/*      */   }
/*      */   
/*      */   public void c(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5) {
/* 2434 */     paramaji.a(this, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */   }
/*      */   
/*      */   public azc M()
/*      */   {
/* 2439 */     return this.w;
/*      */   }
/*      */   
/*      */   public ays N()
/*      */   {
/* 2444 */     return this.x;
/*      */   }
/*      */   
/*      */   public agy O()
/*      */   {
/* 2449 */     return this.x.x();
/*      */   }
/*      */   
/*      */   public void c() {}
/*      */   
/*      */   public float h(float paramFloat)
/*      */   {
/* 2456 */     return (this.o + (this.p - this.o) * paramFloat) * j(paramFloat);
/*      */   }
/*      */   
/*      */   public void i(float paramFloat) {
/* 2460 */     this.o = paramFloat;
/* 2461 */     this.p = paramFloat;
/*      */   }
/*      */   
/*      */   public float j(float paramFloat) {
/* 2465 */     return this.m + (this.n - this.m) * paramFloat;
/*      */   }
/*      */   
/*      */   public void k(float paramFloat) {
/* 2469 */     this.m = paramFloat;
/* 2470 */     this.n = paramFloat;
/*      */   }
/*      */   
/*      */   public boolean P() {
/* 2474 */     return h(1.0F) > 0.9D;
/*      */   }
/*      */   
/*      */   public boolean Q() {
/* 2478 */     return j(1.0F) > 0.2D;
/*      */   }
/*      */   
/*      */   public boolean y(int paramInt1, int paramInt2, int paramInt3) {
/* 2482 */     if (!Q()) return false;
/* 2483 */     if (!i(paramInt1, paramInt2, paramInt3)) return false;
/* 2484 */     if (h(paramInt1, paramInt3) > paramInt2) { return false;
/*      */     }
/* 2486 */     ahu localahu = a(paramInt1, paramInt3);
/* 2487 */     if (localahu.d()) return false;
/* 2488 */     if (e(paramInt1, paramInt2, paramInt3, false)) return false;
/* 2489 */     return localahu.e();
/*      */   }
/*      */   
/*      */   public boolean z(int paramInt1, int paramInt2, int paramInt3) {
/* 2493 */     ahu localahu = a(paramInt1, paramInt3);
/* 2494 */     return localahu.f();
/*      */   }
/*      */   
/*      */   public void a(String paramString, ayl paramayl) {
/* 2498 */     this.z.a(paramString, paramayl);
/*      */   }
/*      */   
/*      */   public ayl a(Class paramClass, String paramString) {
/* 2502 */     return this.z.a(paramClass, paramString);
/*      */   }
/*      */   
/*      */   public int b(String paramString) {
/* 2506 */     return this.z.a(paramString);
/*      */   }
/*      */   
/*      */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 2510 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/* 2511 */       ((ahh)this.u.get(i1)).a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 2516 */     a(null, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */   }
/*      */   
/*      */   public void a(yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*      */     try {
/* 2521 */       for (int i1 = 0; i1 < this.u.size(); i1++) {
/* 2522 */         ((ahh)this.u.get(i1)).a(paramyz, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */       }
/*      */     } catch (Throwable localThrowable) {
/* 2525 */       b localb = b.a(localThrowable, "Playing level event");
/* 2526 */       k localk = localb.a("Level event being played");
/*      */       
/* 2528 */       localk.a("Block coordinates", k.a(paramInt2, paramInt3, paramInt4));
/* 2529 */       localk.a("Event source", paramyz);
/* 2530 */       localk.a("Event type", Integer.valueOf(paramInt1));
/* 2531 */       localk.a("Event data", Integer.valueOf(paramInt5));
/*      */       
/* 2533 */       throw new s(localb);
/*      */     }
/*      */   }
/*      */   
/*      */   public int R()
/*      */   {
/* 2539 */     return 256;
/*      */   }
/*      */   
/*      */   public int S() {
/* 2543 */     return this.t.g ? 128 : 256;
/*      */   }
/*      */   
/*      */   public Random A(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 2548 */     long l1 = paramInt1 * 341873128712L + paramInt2 * 132897987541L + N().b() + paramInt3;
/* 2549 */     this.s.setSeed(l1);
/* 2550 */     return this.s;
/*      */   }
/*      */   
/*      */   public agt b(String paramString, int paramInt1, int paramInt2, int paramInt3) {
/* 2554 */     return L().a(this, paramString, paramInt1, paramInt2, paramInt3);
/*      */   }
/*      */   
/*      */   public boolean T()
/*      */   {
/* 2559 */     return false;
/*      */   }
/*      */   
/*      */   public double U() {
/* 2563 */     if (this.x.u() == ahm.c) {
/* 2564 */       return 0.0D;
/*      */     }
/* 2566 */     return 63.0D;
/*      */   }
/*      */   
/*      */   public k a(b paramb)
/*      */   {
/* 2571 */     k localk = paramb.a("Affected level", 1);
/*      */     
/* 2573 */     localk.a("Level name", this.x == null ? "????" : this.x.k());
/*      */     
/* 2575 */     localk.a("All players", new ahe(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 2582 */     localk.a("Chunk stats", new ahf(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     try
/*      */     {
/* 2590 */       this.x.a(localk);
/*      */     } catch (Throwable localThrowable) {
/* 2592 */       localk.a("Level Data Unobtainable", localThrowable);
/*      */     }
/*      */     
/* 2595 */     return localk;
/*      */   }
/*      */   
/*      */   public void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 2599 */     for (int i1 = 0; i1 < this.u.size(); i1++) {
/* 2600 */       ahh localahh = (ahh)this.u.get(i1);
/* 2601 */       localahh.b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*      */     }
/*      */   }
/*      */   
/*      */   public Calendar V()
/*      */   {
/* 2607 */     if (I() % 600L == 0L) {
/* 2608 */       this.J.setTimeInMillis(MinecraftServer.ar());
/*      */     }
/* 2610 */     return this.J;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, dh paramdh) {}
/*      */   
/*      */ 
/*      */   public bac W()
/*      */   {
/* 2619 */     return this.D;
/*      */   }
/*      */   
/*      */   public void f(int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/* 2623 */     for (int i1 = 0; i1 < 4; i1++) {
/* 2624 */       int i2 = paramInt1 + p.a[i1];
/* 2625 */       int i3 = paramInt3 + p.b[i1];
/*      */       
/* 2627 */       aji localaji1 = a(i2, paramInt2, i3);
/*      */       
/* 2629 */       if (ajn.bU.e(localaji1)) {
/* 2630 */         localaji1.a(this, i2, paramInt2, i3, paramaji);
/* 2631 */       } else if (localaji1.r()) {
/* 2632 */         i2 += p.a[i1];
/* 2633 */         i3 += p.b[i1];
/*      */         
/* 2635 */         aji localaji2 = a(i2, paramInt2, i3);
/* 2636 */         if (ajn.bU.e(localaji2)) {
/* 2637 */           localaji2.a(this, i2, paramInt2, i3, paramaji);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public float b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 2644 */     return B(qh.c(paramDouble1), qh.c(paramDouble2), qh.c(paramDouble3));
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public float B(int paramInt1, int paramInt2, int paramInt3)
/*      */   {
/* 2652 */     float f1 = 0.0F;
/* 2653 */     int i1 = this.r == rd.d ? 1 : 0;
/*      */     
/* 2655 */     if (d(paramInt1, paramInt2, paramInt3)) {
/* 2656 */       float f2 = y();
/*      */       
/* 2658 */       f1 += qh.a((float)d(paramInt1, paramInt3).s / 3600000.0F, 0.0F, 1.0F) * (i1 != 0 ? 1.0F : 0.75F);
/* 2659 */       f1 += f2 * 0.25F;
/*      */     }
/*      */     
/* 2662 */     if ((this.r == rd.b) || (this.r == rd.a)) {
/* 2663 */       f1 *= this.r.a() / 2.0F;
/*      */     }
/*      */     
/* 2666 */     return qh.a(f1, 0.0F, i1 != 0 ? 1.5F : 1.0F);
/*      */   }
/*      */   
/*      */   public void X() {
/* 2670 */     for (ahh localahh : this.u) {
/* 2671 */       localahh.b();
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */