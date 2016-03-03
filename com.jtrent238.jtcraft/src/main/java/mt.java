/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class mt
/*     */   extends ahb
/*     */ {
/*  36 */   private static final Logger a = ;
/*     */   
/*     */   private final MinecraftServer J;
/*     */   
/*     */   private final mn K;
/*     */   private final mq L;
/*     */   private Set M;
/*     */   private TreeSet N;
/*     */   public ms b;
/*     */   public boolean c;
/*     */   private boolean O;
/*     */   private int P;
/*     */   private final ahp Q;
/*  49 */   private final aho R = new aho();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */   private mv[] S = { new mv(null), new mv(null) };
/*     */   
/*     */ 
/*     */   private int T;
/*     */   
/*     */ 
/*  61 */   private static final qx[] U = { new qx(ade.y, 0, 1, 3, 10), new qx(adb.a(ajn.f), 0, 1, 3, 10), new qx(adb.a(ajn.r), 0, 1, 3, 10), new qx(ade.t, 0, 1, 1, 3), new qx(ade.p, 0, 1, 1, 5), new qx(ade.s, 0, 1, 1, 3), new qx(ade.o, 0, 1, 1, 5), new qx(ade.e, 0, 2, 3, 5), new qx(ade.P, 0, 2, 3, 3), new qx(adb.a(ajn.s), 0, 1, 3, 10) };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public mt(MinecraftServer paramMinecraftServer, azc paramazc, String paramString, int paramInt, ahj paramahj, qi paramqi)
/*     */   {
/*  69 */     super(paramazc, paramString, paramahj, aqo.a(paramInt), paramqi);
/*  70 */     this.J = paramMinecraftServer;
/*  71 */     this.K = new mn(this);
/*  72 */     this.L = new mq(this);
/*     */     
/*  74 */     if (this.W == null) {
/*  75 */       this.W = new pz();
/*     */     }
/*  77 */     if (this.M == null) {
/*  78 */       this.M = new HashSet();
/*     */     }
/*  80 */     if (this.N == null) {
/*  81 */       this.N = new TreeSet();
/*     */     }
/*     */     
/*  84 */     this.Q = new ahp(this);
/*  85 */     this.D = new lp(paramMinecraftServer);
/*     */     
/*  87 */     bad localbad = (bad)this.z.a(bad.class, "scoreboard");
/*  88 */     if (localbad == null) {
/*  89 */       localbad = new bad();
/*  90 */       this.z.a("scoreboard", localbad);
/*     */     }
/*  92 */     localbad.a(this.D);
/*  93 */     ((lp)this.D).a(localbad);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  98 */     super.b();
/*  99 */     if ((N().t()) && (this.r != rd.d)) {
/* 100 */       this.r = rd.d;
/*     */     }
/* 102 */     this.t.e.b();
/*     */     
/* 104 */     if (e()) {
/* 105 */       if (O().b("doDaylightCycle"))
/*     */       {
/* 107 */         long l = this.x.g() + 24000L;
/* 108 */         this.x.c(l - l % 24000L);
/*     */       }
/*     */       
/* 111 */       d();
/*     */     }
/*     */     
/* 114 */     this.C.a("mobSpawner");
/* 115 */     if (O().b("doMobSpawning"))
/*     */     {
/* 117 */       this.R.a(this, this.G, this.H, this.x.f() % 400L == 0L);
/*     */     }
/* 119 */     this.C.c("chunkSource");
/* 120 */     this.v.d();
/* 121 */     int i = a(1.0F);
/*     */     
/* 123 */     if (i != this.j) {
/* 124 */       this.j = i;
/*     */     }
/*     */     
/*     */ 
/* 128 */     this.x.b(this.x.f() + 1L);
/* 129 */     if (O().b("doDaylightCycle")) {
/* 130 */       this.x.c(this.x.g() + 1L);
/*     */     }
/*     */     
/* 133 */     this.C.c("tickPending");
/* 134 */     a(false);
/*     */     
/* 136 */     this.C.c("tickBlocks");
/* 137 */     g();
/*     */     
/* 139 */     this.C.c("chunkMap");
/* 140 */     this.L.b();
/*     */     
/* 142 */     this.C.c("village");
/* 143 */     this.A.a();
/* 144 */     this.B.a();
/*     */     
/* 146 */     this.C.c("portalForcer");
/* 147 */     this.Q.a(I());
/*     */     
/* 149 */     this.C.b();
/*     */     
/*     */ 
/* 152 */     Z();
/*     */   }
/*     */   
/*     */   public ahx a(sx paramsx, int paramInt1, int paramInt2, int paramInt3) {
/* 156 */     List localList = L().a(paramsx, paramInt1, paramInt2, paramInt3);
/* 157 */     if ((localList == null) || (localList.isEmpty())) { return null;
/*     */     }
/* 159 */     return (ahx)qv.a(this.s, localList);
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/* 164 */     this.O = (!this.h.isEmpty());
/*     */     
/* 166 */     for (yz localyz : this.h) {
/* 167 */       if (!localyz.bm()) {
/* 168 */         this.O = false;
/* 169 */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void d() {
/* 175 */     this.O = false;
/*     */     
/* 177 */     for (yz localyz : this.h) {
/* 178 */       if (localyz.bm()) {
/* 179 */         localyz.a(false, false, true);
/*     */       }
/*     */     }
/*     */     
/* 183 */     Y();
/*     */   }
/*     */   
/*     */   private void Y() {
/* 187 */     this.x.g(0);
/* 188 */     this.x.b(false);
/* 189 */     this.x.f(0);
/* 190 */     this.x.a(false);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 194 */     if ((this.O) && (!this.E))
/*     */     {
/* 196 */       for (yz localyz : this.h) {
/* 197 */         if (!localyz.bL()) {
/* 198 */           return false;
/*     */         }
/*     */       }
/* 201 */       return true;
/*     */     }
/* 203 */     return false;
/*     */   }
/*     */   
/*     */   public void f()
/*     */   {
/* 208 */     if (this.x.d() <= 0) {
/* 209 */       this.x.b(64);
/*     */     }
/* 211 */     int i = this.x.c();
/* 212 */     int j = this.x.e();
/* 213 */     int k = 0;
/* 214 */     while (b(i, j).o() == awt.a) {
/* 215 */       i += this.s.nextInt(8) - this.s.nextInt(8);
/* 216 */       j += this.s.nextInt(8) - this.s.nextInt(8);
/* 217 */       k++; if (k == 10000) break;
/*     */     }
/* 219 */     this.x.a(i);
/* 220 */     this.x.c(j);
/*     */   }
/*     */   
/*     */   protected void g()
/*     */   {
/* 225 */     super.g();
/*     */     
/* 227 */     int i = 0;
/* 228 */     int j = 0;
/* 229 */     for (agu localagu : this.F) {
/* 230 */       int k = localagu.a * 16;
/* 231 */       int m = localagu.b * 16;
/*     */       
/* 233 */       this.C.a("getChunk");
/* 234 */       apx localapx = e(localagu.a, localagu.b);
/*     */       
/* 236 */       a(k, m, localapx);
/*     */       
/* 238 */       this.C.c("tickChunk");
/* 239 */       localapx.b(false);
/*     */       
/* 241 */       this.C.c("thunder");
/* 242 */       int n; int i1; int i2; int i3; if ((this.s.nextInt(100000) == 0) && (Q()) && (P())) {
/* 243 */         this.k = (this.k * 3 + 1013904223);
/* 244 */         n = this.k >> 2;
/* 245 */         i1 = k + (n & 0xF);
/* 246 */         i2 = m + (n >> 8 & 0xF);
/* 247 */         i3 = h(i1, i2);
/*     */         
/* 249 */         if (y(i1, i3, i2)) {
/* 250 */           c(new xh(this, i1, i3, i2));
/*     */         }
/*     */       }
/*     */       
/* 254 */       this.C.c("iceandsnow");
/* 255 */       if (this.s.nextInt(16) == 0) {
/* 256 */         this.k = (this.k * 3 + 1013904223);
/* 257 */         n = this.k >> 2;
/* 258 */         i1 = n & 0xF;
/* 259 */         i2 = n >> 8 & 0xF;
/* 260 */         i3 = h(i1 + k, i2 + m);
/* 261 */         if (s(i1 + k, i3 - 1, i2 + m)) {
/* 262 */           b(i1 + k, i3 - 1, i2 + m, ajn.aD);
/*     */         }
/* 264 */         if ((Q()) && (e(i1 + k, i3, i2 + m, true))) {
/* 265 */           b(i1 + k, i3, i2 + m, ajn.aC);
/*     */         }
/* 267 */         if (Q()) {
/* 268 */           ahu localahu = a(i1 + k, i2 + m);
/* 269 */           if (localahu.e()) {
/* 270 */             a(i1 + k, i3 - 1, i2 + m).l(this, i1 + k, i3 - 1, i2 + m);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 275 */       this.C.c("tickBlocks");
/* 276 */       for (apz localapz : localapx.i()) {
/* 277 */         if ((localapz != null) && (localapz.b())) {
/* 278 */           for (int i4 = 0; i4 < 3; i4++) {
/* 279 */             this.k = (this.k * 3 + 1013904223);
/* 280 */             int i5 = this.k >> 2;
/* 281 */             int i6 = i5 & 0xF;
/* 282 */             int i7 = i5 >> 8 & 0xF;
/* 283 */             int i8 = i5 >> 16 & 0xF;
/*     */             
/* 285 */             j++;
/* 286 */             aji localaji = localapz.a(i6, i8, i7);
/* 287 */             if (localaji.t()) {
/* 288 */               i++;
/* 289 */               localaji.a(this, i6 + k, i8 + localapz.d(), i7 + m, this.s);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 294 */       this.C.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 300 */     ahs localahs = new ahs(paramInt1, paramInt2, paramInt3, paramaji);
/* 301 */     return this.V.contains(localahs);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 306 */     a(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, 0);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5)
/*     */   {
/* 311 */     ahs localahs = new ahs(paramInt1, paramInt2, paramInt3, paramaji);
/* 312 */     int i = 0;
/* 313 */     if ((this.d) && (paramaji.o() != awt.a)) {
/* 314 */       if (paramaji.L()) {
/* 315 */         i = 8;
/* 316 */         if (b(localahs.a - i, localahs.b - i, localahs.c - i, localahs.a + i, localahs.b + i, localahs.c + i)) {
/* 317 */           aji localaji = a(localahs.a, localahs.b, localahs.c);
/*     */           
/* 319 */           if ((localaji.o() != awt.a) && (localaji == localahs.a())) {
/* 320 */             localaji.a(this, localahs.a, localahs.b, localahs.c, this.s);
/*     */           }
/*     */         }
/* 323 */         return;
/*     */       }
/* 325 */       paramInt4 = 1;
/*     */     }
/*     */     
/*     */ 
/* 329 */     if (b(paramInt1 - i, paramInt2 - i, paramInt3 - i, paramInt1 + i, paramInt2 + i, paramInt3 + i)) {
/* 330 */       if (paramaji.o() != awt.a) {
/* 331 */         localahs.a(paramInt4 + this.x.f());
/* 332 */         localahs.a(paramInt5);
/*     */       }
/* 334 */       if (!this.M.contains(localahs)) {
/* 335 */         this.M.add(localahs);
/* 336 */         this.N.add(localahs);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5)
/*     */   {
/* 343 */     ahs localahs = new ahs(paramInt1, paramInt2, paramInt3, paramaji);
/* 344 */     localahs.a(paramInt5);
/*     */     
/* 346 */     if (paramaji.o() != awt.a) {
/* 347 */       localahs.a(paramInt4 + this.x.f());
/*     */     }
/* 349 */     if (!this.M.contains(localahs)) {
/* 350 */       this.M.add(localahs);
/* 351 */       this.N.add(localahs);
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 357 */     if (this.h.isEmpty()) {
/* 358 */       if (this.P++ < 1200) {}
/*     */ 
/*     */     }
/*     */     else {
/* 362 */       i();
/*     */     }
/*     */     
/* 365 */     super.h();
/*     */   }
/*     */   
/*     */   public void i() {
/* 369 */     this.P = 0;
/*     */   }
/*     */   
/* 372 */   private List V = new ArrayList();
/*     */   private pz W;
/*     */   
/*     */   public boolean a(boolean paramBoolean) {
/* 376 */     int i = this.N.size();
/* 377 */     if (i != this.M.size()) {
/* 378 */       throw new IllegalStateException("TickNextTick list out of synch");
/*     */     }
/* 380 */     if (i > 1000) { i = 1000;
/*     */     }
/* 382 */     this.C.a("cleaning");
/* 383 */     ahs localahs; for (int j = 0; j < i; j++) {
/* 384 */       localahs = (ahs)this.N.first();
/* 385 */       if ((!paramBoolean) && (localahs.d > this.x.f()))
/*     */         break;
/* 387 */       this.N.remove(localahs);
/* 388 */       this.M.remove(localahs);
/* 389 */       this.V.add(localahs);
/*     */     }
/* 391 */     this.C.b();
/*     */     
/* 393 */     this.C.a("ticking");
/* 394 */     Iterator localIterator = this.V.iterator();
/* 395 */     while (localIterator.hasNext()) {
/* 396 */       localahs = (ahs)localIterator.next();
/* 397 */       localIterator.remove();
/*     */       
/* 399 */       int k = 0;
/*     */       
/* 401 */       if (b(localahs.a - k, localahs.b - k, localahs.c - k, localahs.a + k, localahs.b + k, localahs.c + k)) {
/* 402 */         aji localaji = a(localahs.a, localahs.b, localahs.c);
/* 403 */         if ((localaji.o() != awt.a) && (aji.a(localaji, localahs.a()))) {
/*     */           try {
/* 405 */             localaji.a(this, localahs.a, localahs.b, localahs.c, this.s);
/*     */           } catch (Throwable localThrowable1) {
/* 407 */             b localb = b.a(localThrowable1, "Exception while ticking a block");
/* 408 */             k localk = localb.a("Block being ticked");
/*     */             int m;
/*     */             try
/*     */             {
/* 412 */               m = e(localahs.a, localahs.b, localahs.c);
/*     */             } catch (Throwable localThrowable2) {
/* 414 */               m = -1;
/*     */             }
/*     */             
/* 417 */             k.a(localk, localahs.a, localahs.b, localahs.c, localaji, m);
/*     */             
/* 419 */             throw new s(localb);
/*     */           }
/*     */         }
/*     */       } else {
/* 423 */         a(localahs.a, localahs.b, localahs.c, localahs.a(), 0);
/*     */       }
/*     */     }
/* 426 */     this.C.b();
/*     */     
/* 428 */     this.V.clear();
/*     */     
/* 430 */     return !this.N.isEmpty();
/*     */   }
/*     */   
/*     */   public List a(apx paramapx, boolean paramBoolean)
/*     */   {
/* 435 */     ArrayList localArrayList = null;
/*     */     
/* 437 */     agu localagu = paramapx.l();
/* 438 */     int i = (localagu.a << 4) - 2;
/* 439 */     int j = i + 16 + 2;
/* 440 */     int k = (localagu.b << 4) - 2;
/* 441 */     int m = k + 16 + 2;
/*     */     
/* 443 */     for (int n = 0; n < 2; n++) {
/*     */       Iterator localIterator;
/* 445 */       if (n == 0) {
/* 446 */         localIterator = this.N.iterator();
/*     */       } else {
/* 448 */         localIterator = this.V.iterator();
/* 449 */         if (!this.V.isEmpty()) {
/* 450 */           a.debug("toBeTicked = " + this.V.size());
/*     */         }
/*     */       }
/*     */       
/* 454 */       while (localIterator.hasNext()) {
/* 455 */         ahs localahs = (ahs)localIterator.next();
/* 456 */         if ((localahs.a >= i) && (localahs.a < j) && (localahs.c >= k) && (localahs.c < m)) {
/* 457 */           if (paramBoolean) {
/* 458 */             this.M.remove(localahs);
/* 459 */             localIterator.remove();
/*     */           }
/* 461 */           if (localArrayList == null) {
/* 462 */             localArrayList = new ArrayList();
/*     */           }
/* 464 */           localArrayList.add(localahs);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 469 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, boolean paramBoolean)
/*     */   {
/* 474 */     if ((!this.J.Z()) && (((paramsa instanceof wf)) || ((paramsa instanceof wu)))) {
/* 475 */       paramsa.B();
/*     */     }
/* 477 */     if ((!this.J.aa()) && ((paramsa instanceof yu))) {
/* 478 */       paramsa.B();
/*     */     }
/* 480 */     super.a(paramsa, paramBoolean);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected apu j()
/*     */   {
/* 499 */     aqc localaqc = this.w.a(this.t);
/* 500 */     this.b = new ms(this, localaqc, this.t.c());
/* 501 */     return this.b;
/*     */   }
/*     */   
/*     */   public List a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 505 */     ArrayList localArrayList = new ArrayList();
/* 506 */     for (int i = 0; i < this.g.size(); i++) {
/* 507 */       aor localaor = (aor)this.g.get(i);
/* 508 */       if ((localaor.c >= paramInt1) && (localaor.d >= paramInt2) && (localaor.e >= paramInt3) && (localaor.c < paramInt4) && (localaor.d < paramInt5) && (localaor.e < paramInt6)) {
/* 509 */         localArrayList.add(localaor);
/*     */       }
/*     */     }
/* 512 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 517 */     return !this.J.a(this, paramInt1, paramInt2, paramInt3, paramyz);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void a(ahj paramahj)
/*     */   {
/* 524 */     if (this.W == null) {
/* 525 */       this.W = new pz();
/*     */     }
/* 527 */     if (this.M == null) {
/* 528 */       this.M = new HashSet();
/*     */     }
/* 530 */     if (this.N == null) {
/* 531 */       this.N = new TreeSet();
/*     */     }
/*     */     
/* 534 */     b(paramahj);
/*     */     
/* 536 */     super.a(paramahj);
/*     */   }
/*     */   
/*     */   protected void b(ahj paramahj) {
/* 540 */     if (!this.t.e()) {
/* 541 */       this.x.a(0, this.t.i(), 0);
/* 542 */       return;
/*     */     }
/*     */     
/* 545 */     this.y = true;
/*     */     
/* 547 */     aib localaib = this.t.e;
/* 548 */     List localList = localaib.a();
/* 549 */     Random localRandom = new Random(H());
/*     */     
/* 551 */     agt localagt = localaib.a(0, 0, 256, localList, localRandom);
/*     */     
/* 553 */     int i = 0;
/* 554 */     int j = this.t.i();
/* 555 */     int k = 0;
/*     */     
/* 557 */     if (localagt != null) {
/* 558 */       i = localagt.a;
/* 559 */       k = localagt.c;
/*     */     } else {
/* 561 */       a.warn("Unable to find spawn biome");
/*     */     }
/*     */     
/* 564 */     int m = 0;
/* 565 */     while (!this.t.a(i, k)) {
/* 566 */       i += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 567 */       k += localRandom.nextInt(64) - localRandom.nextInt(64);
/* 568 */       m++; if (m == 1000) break;
/*     */     }
/* 570 */     this.x.a(i, j, k);
/* 571 */     this.y = false;
/*     */     
/* 573 */     if (paramahj.c()) {
/* 574 */       k();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void k()
/*     */   {
/* 581 */     arg localarg = new arg(U, 10);
/* 582 */     for (int i = 0; i < 10; i++) {
/* 583 */       int j = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6);
/* 584 */       int k = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6);
/* 585 */       int m = i(j, k) + 1;
/*     */       
/* 587 */       if (localarg.a(this, this.s, j, m, k)) {
/*     */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public r l() {
/* 594 */     return this.t.h();
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, qk paramqk) {
/* 598 */     if (!this.v.e()) { return;
/*     */     }
/* 600 */     if (paramqk != null) paramqk.a("Saving level");
/* 601 */     a();
/*     */     
/* 603 */     if (paramqk != null) paramqk.c("Saving chunks");
/* 604 */     this.v.a(paramBoolean, paramqk);
/*     */     
/*     */ 
/*     */ 
/* 608 */     ArrayList localArrayList = Lists.newArrayList(this.b.a());
/* 609 */     for (apx localapx : localArrayList) {
/* 610 */       if (localapx != null)
/*     */       {
/*     */ 
/* 613 */         if (!this.L.a(localapx.g, localapx.h))
/* 614 */           this.b.b(localapx.g, localapx.h);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void m() {
/* 620 */     if (!this.v.e()) return;
/* 621 */     this.v.c();
/*     */   }
/*     */   
/*     */   protected void a() {
/* 625 */     G();
/*     */     
/* 627 */     this.w.a(this.x, this.J.ah().t());
/* 628 */     this.z.a();
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa)
/*     */   {
/* 633 */     super.a(paramsa);
/* 634 */     this.W.a(paramsa.y(), paramsa);
/* 635 */     sa[] arrayOfsa = paramsa.at();
/* 636 */     if (arrayOfsa != null) {
/* 637 */       for (int i = 0; i < arrayOfsa.length; i++) {
/* 638 */         this.W.a(arrayOfsa[i].y(), arrayOfsa[i]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(sa paramsa)
/*     */   {
/* 645 */     super.b(paramsa);
/* 646 */     this.W.d(paramsa.y());
/* 647 */     sa[] arrayOfsa = paramsa.at();
/* 648 */     if (arrayOfsa != null) {
/* 649 */       for (int i = 0; i < arrayOfsa.length; i++) {
/* 650 */         this.W.d(arrayOfsa[i].y());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public sa a(int paramInt)
/*     */   {
/* 657 */     return (sa)this.W.a(paramInt);
/*     */   }
/*     */   
/*     */   public boolean c(sa paramsa)
/*     */   {
/* 662 */     if (super.c(paramsa)) {
/* 663 */       this.J.ah().a(paramsa.s, paramsa.t, paramsa.u, 512.0D, this.t.i, new fy(paramsa));
/* 664 */       return true;
/*     */     }
/* 666 */     return false;
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, byte paramByte)
/*     */   {
/* 671 */     r().b(paramsa, new gt(paramsa, paramByte));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public agw a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/* 678 */     agw localagw = new agw(this, paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/* 679 */     localagw.a = paramBoolean1;
/* 680 */     localagw.b = paramBoolean2;
/* 681 */     localagw.a();
/* 682 */     localagw.a(false);
/*     */     
/* 684 */     if (!paramBoolean2) {
/* 685 */       localagw.h.clear();
/*     */     }
/*     */     
/* 688 */     for (yz localyz : this.h) {
/* 689 */       if (localyz.e(paramDouble1, paramDouble2, paramDouble3) < 4096.0D) {
/* 690 */         ((mw)localyz).a.a(new gu(paramDouble1, paramDouble2, paramDouble3, paramFloat, localagw.h, (azw)localagw.b().get(localyz)));
/*     */       }
/*     */     }
/*     */     
/* 694 */     return localagw;
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4, int paramInt5)
/*     */   {
/* 699 */     ags localags1 = new ags(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, paramInt5);
/* 700 */     for (ags localags2 : this.S[this.T]) {
/* 701 */       if (localags2.equals(localags1)) {
/* 702 */         return;
/*     */       }
/*     */     }
/* 705 */     this.S[this.T].add(localags1);
/*     */   }
/*     */   
/*     */   private void Z()
/*     */   {
/* 710 */     while (!this.S[this.T].isEmpty()) {
/* 711 */       int i = this.T;
/* 712 */       this.T ^= 0x1;
/*     */       
/* 714 */       for (ags localags : this.S[i]) {
/* 715 */         if (a(localags)) {
/* 716 */           this.J.ah().a(localags.a(), localags.b(), localags.c(), 64.0D, this.t.i, new gg(localags.a(), localags.b(), localags.c(), localags.f(), localags.d(), localags.e()));
/*     */         }
/*     */       }
/*     */       
/* 720 */       this.S[i].clear();
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(ags paramags) {
/* 725 */     aji localaji = a(paramags.a(), paramags.b(), paramags.c());
/* 726 */     if (localaji == paramags.f()) {
/* 727 */       return localaji.a(this, paramags.a(), paramags.b(), paramags.c(), paramags.d(), paramags.e());
/*     */     }
/* 729 */     return false;
/*     */   }
/*     */   
/*     */   public void n() {
/* 733 */     this.w.a();
/*     */   }
/*     */   
/*     */   protected void o()
/*     */   {
/* 738 */     boolean bool = Q();
/* 739 */     super.o();
/*     */     
/* 741 */     if (this.m != this.n) {
/* 742 */       this.J.ah().a(new gv(7, this.n), this.t.i);
/*     */     }
/* 744 */     if (this.o != this.p) {
/* 745 */       this.J.ah().a(new gv(8, this.p), this.t.i);
/*     */     }
/*     */     
/* 748 */     if (bool != Q()) {
/* 749 */       if (bool) {
/* 750 */         this.J.ah().a(new gv(2, 0.0F));
/*     */       } else {
/* 752 */         this.J.ah().a(new gv(1, 0.0F));
/*     */       }
/* 754 */       this.J.ah().a(new gv(7, this.n));
/* 755 */       this.J.ah().a(new gv(8, this.p));
/*     */     }
/*     */   }
/*     */   
/*     */   protected int p()
/*     */   {
/* 761 */     return this.J.ah().s();
/*     */   }
/*     */   
/*     */   public MinecraftServer q() {
/* 765 */     return this.J;
/*     */   }
/*     */   
/*     */   public mn r() {
/* 769 */     return this.K;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public mq t()
/*     */   {
/* 781 */     return this.L;
/*     */   }
/*     */   
/*     */   public ahp u() {
/* 785 */     return this.Q;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
/*     */   {
/* 793 */     hb localhb = new hb(paramString, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4, (float)paramDouble5, (float)paramDouble6, (float)paramDouble7, paramInt);
/*     */     
/* 795 */     for (int i = 0; i < this.h.size(); i++) {
/* 796 */       mw localmw = (mw)this.h.get(i);
/* 797 */       r localr = localmw.f_();
/* 798 */       double d1 = paramDouble1 - localr.a;
/* 799 */       double d2 = paramDouble2 - localr.b;
/* 800 */       double d3 = paramDouble3 - localr.c;
/* 801 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */       
/* 803 */       if (d4 <= 256.0D) {
/* 804 */         localmw.a.a(localhb);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */