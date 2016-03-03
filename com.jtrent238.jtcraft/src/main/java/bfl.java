/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bfl
/*     */   extends bfo
/*     */ {
/*  38 */   private static final bqx u = new bqx("textures/gui/container/creative_inventory/tabs.png");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  47 */   private static rh v = new rh("tmp", true, 45);
/*  48 */   private static int w = abt.b.a();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private float x;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean y;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean z;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private bcd A;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private List B;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private aay C;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private bfk E;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bfl(yz paramyz)
/*     */   {
/* 138 */     super(new bfm(paramyz));
/* 139 */     paramyz.bo = this.h;
/* 140 */     this.p = true;
/* 141 */     this.g = 136;
/* 142 */     this.f = 195;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 147 */     if (!this.k.c.h()) {
/* 148 */       this.k.a(new bfu(this.k.h));
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(aay paramaay, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 154 */     this.D = true;
/* 155 */     int i = paramInt3 == 1 ? 1 : 0;
/* 156 */     paramInt3 = (paramInt1 == 64537) && (paramInt3 == 0) ? 4 : paramInt3;
/*     */     add localadd1;
/* 158 */     Object localObject2; if ((paramaay != null) || (w == abt.m.a()) || (paramInt3 == 5)) {
/* 159 */       if ((paramaay == this.C) && (i != 0)) {
/* 160 */         for (int j = 0; j < this.k.h.bn.a().size(); j++)
/* 161 */           this.k.c.a(null, j);
/*     */       } else { Object localObject1;
/* 163 */         if (w == abt.m.a())
/*     */         {
/* 165 */           if (paramaay == this.C) {
/* 166 */             this.k.h.bm.b(null);
/* 167 */           } else if ((paramInt3 == 4) && (paramaay != null) && (paramaay.e())) {
/* 168 */             localObject1 = paramaay.a(paramInt2 == 0 ? 1 : paramaay.d().e());
/* 169 */             this.k.h.a((add)localObject1, true);
/* 170 */             this.k.c.a((add)localObject1);
/* 171 */           } else if ((paramInt3 == 4) && (this.k.h.bm.o() != null)) {
/* 172 */             this.k.h.a(this.k.h.bm.o(), true);
/* 173 */             this.k.c.a(this.k.h.bm.o());
/* 174 */             this.k.h.bm.b(null);
/*     */           } else {
/* 176 */             this.k.h.bn.a(paramaay == null ? paramInt1 : bfn.a((bfn)paramaay).g, paramInt2, paramInt3, this.k.h);
/* 177 */             this.k.h.bn.b();
/*     */           }
/*     */         }
/* 180 */         else if ((paramInt3 != 5) && (paramaay.f == v))
/*     */         {
/* 182 */           localObject1 = this.k.h.bm;
/* 183 */           localadd1 = ((yx)localObject1).o();
/* 184 */           add localadd2 = paramaay.d();
/*     */           add localadd3;
/* 186 */           if (paramInt3 == 2) {
/* 187 */             if ((localadd2 != null) && (paramInt2 >= 0) && (paramInt2 < 9)) {
/* 188 */               localadd3 = localadd2.m();
/* 189 */               localadd3.b = localadd3.e();
/* 190 */               this.k.h.bm.a(paramInt2, localadd3);
/* 191 */               this.k.h.bn.b();
/*     */             }
/*     */             
/* 194 */             return; }
/* 195 */           if (paramInt3 == 3) {
/* 196 */             if ((((yx)localObject1).o() == null) && (paramaay.e())) {
/* 197 */               localadd3 = paramaay.d().m();
/* 198 */               localadd3.b = localadd3.e();
/* 199 */               ((yx)localObject1).b(localadd3);
/*     */             }
/*     */             
/* 202 */             return; }
/* 203 */           if (paramInt3 == 4) {
/* 204 */             if (localadd2 != null) {
/* 205 */               localadd3 = localadd2.m();
/* 206 */               localadd3.b = (paramInt2 == 0 ? 1 : localadd3.e());
/* 207 */               this.k.h.a(localadd3, true);
/* 208 */               this.k.c.a(localadd3);
/*     */             }
/*     */             
/* 211 */             return;
/*     */           }
/*     */           
/* 214 */           if ((localadd1 != null) && (localadd2 != null) && (localadd1.a(localadd2)))
/*     */           {
/* 216 */             if (paramInt2 == 0) {
/* 217 */               if (i != 0) {
/* 218 */                 localadd1.b = localadd1.e();
/*     */               }
/* 220 */               else if (localadd1.b < localadd1.e()) { localadd1.b += 1;
/*     */               }
/*     */             }
/* 223 */             else if (localadd1.b <= 1) {
/* 224 */               ((yx)localObject1).b(null);
/*     */             } else {
/* 226 */               localadd1.b -= 1;
/*     */             }
/*     */           }
/* 229 */           else if ((localadd2 == null) || (localadd1 != null))
/*     */           {
/* 231 */             ((yx)localObject1).b(null);
/*     */           }
/*     */           else {
/* 234 */             ((yx)localObject1).b(add.b(localadd2));
/* 235 */             localadd1 = ((yx)localObject1).o();
/* 236 */             if (i != 0) {
/* 237 */               localadd1.b = localadd1.e();
/*     */             }
/*     */           }
/*     */         } else {
/* 241 */           this.h.a(paramaay == null ? paramInt1 : paramaay.g, paramInt2, paramInt3, this.k.h);
/*     */           
/* 243 */           if (zs.c(paramInt2) == 2) {
/* 244 */             for (int k = 0; k < 9; k++) {
/* 245 */               this.k.c.a(this.h.a(45 + k).d(), 36 + k);
/*     */             }
/* 247 */           } else if (paramaay != null) {
/* 248 */             localObject2 = this.h.a(paramaay.g).d();
/* 249 */             this.k.c.a((add)localObject2, paramaay.g - this.h.c.size() + 9 + 36);
/*     */           }
/*     */         }
/*     */       }
/*     */     } else {
/* 254 */       localObject2 = this.k.h.bm;
/* 255 */       if (((yx)localObject2).o() != null) {
/* 256 */         if (paramInt2 == 0) {
/* 257 */           this.k.h.a(((yx)localObject2).o(), true);
/* 258 */           this.k.c.a(((yx)localObject2).o());
/* 259 */           ((yx)localObject2).b(null);
/*     */         }
/* 261 */         if (paramInt2 == 1) {
/* 262 */           localadd1 = ((yx)localObject2).o().a(1);
/* 263 */           this.k.h.a(localadd1, true);
/* 264 */           this.k.c.a(localadd1);
/* 265 */           if (((yx)localObject2).o().b == 0) ((yx)localObject2).b(null);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/* 273 */     if (this.k.c.h()) {
/* 274 */       super.b();
/* 275 */       this.n.clear();
/*     */       
/* 277 */       Keyboard.enableRepeatEvents(true);
/*     */       
/* 279 */       this.A = new bcd(this.q, this.i + 82, this.r + 6, 89, this.q.a);
/* 280 */       this.A.f(15);
/* 281 */       this.A.a(false);
/* 282 */       this.A.e(false);
/* 283 */       this.A.g(16777215);
/*     */       
/* 285 */       int i = w;
/* 286 */       w = -1;
/* 287 */       b(abt.a[i]);
/*     */       
/* 289 */       this.E = new bfk(this.k);
/* 290 */       this.k.h.bn.a(this.E);
/*     */     } else {
/* 292 */       this.k.a(new bfu(this.k.h));
/*     */     }
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/* 298 */     super.m();
/*     */     
/* 300 */     if ((this.k.h != null) && (this.k.h.bm != null)) {
/* 301 */       this.k.h.bn.b(this.E);
/*     */     }
/*     */     
/* 304 */     Keyboard.enableRepeatEvents(false);
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/* 309 */     if (w != abt.g.a()) {
/* 310 */       if (bbj.a(this.k.u.ag)) {
/* 311 */         b(abt.g);
/*     */       } else {
/* 313 */         super.a(paramChar, paramInt);
/*     */       }
/* 315 */       return;
/*     */     }
/*     */     
/* 318 */     if (this.D) {
/* 319 */       this.D = false;
/* 320 */       this.A.a("");
/*     */     }
/*     */     
/* 323 */     if (b(paramInt)) {
/* 324 */       return;
/*     */     }
/*     */     
/* 327 */     if (this.A.a(paramChar, paramInt)) {
/* 328 */       g();
/*     */     } else {
/* 330 */       super.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   private void g() {
/* 335 */     bfm localbfm = (bfm)this.h;
/* 336 */     localbfm.a.clear();
/*     */     
/* 338 */     for (Object localObject = adb.e.iterator(); ((Iterator)localObject).hasNext();) { adb localadb = (adb)((Iterator)localObject).next();
/* 339 */       if (localadb != null)
/*     */       {
/* 341 */         if (localadb.n_() != null) {
/* 342 */           localadb.a(localadb, null, localbfm.a);
/*     */         }
/*     */       }
/*     */     }
/* 346 */     for (aft localaft : aft.b) {
/* 347 */       if ((localaft != null) && (localaft.C != null))
/*     */       {
/* 349 */         ade.bR.a(localaft, localbfm.a);
/*     */       }
/*     */     }
/* 352 */     localObject = localbfm.a.iterator();
/* 353 */     String str1 = this.A.b().toLowerCase();
/*     */     
/* 355 */     while (((Iterator)localObject).hasNext()) {
/* 356 */       add localadd = (add)((Iterator)localObject).next();
/* 357 */       int k = 0;
/*     */       
/* 359 */       for (String str2 : localadd.a(this.k.h, this.k.u.v)) {
/* 360 */         if (str2.toLowerCase().contains(str1)) {
/* 361 */           k = 1;
/* 362 */           break;
/*     */         }
/*     */       }
/*     */       
/* 366 */       if (k == 0) { ((Iterator)localObject).remove();
/*     */       }
/*     */     }
/* 369 */     this.x = 0.0F;
/* 370 */     localbfm.a(0.0F);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2)
/*     */   {
/* 375 */     abt localabt = abt.a[w];
/*     */     
/* 377 */     if (localabt.h()) {
/* 378 */       GL11.glDisable(3042);
/* 379 */       this.q.b(brp.a(localabt.c(), new Object[0]), 8, 6, 4210752);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 385 */     if (paramInt3 == 0) {
/* 386 */       int i = paramInt1 - this.i;
/* 387 */       int j = paramInt2 - this.r;
/*     */       
/* 389 */       for (abt localabt : abt.a) {
/* 390 */         if (a(localabt, i, j)) {
/* 391 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 396 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 401 */     if (paramInt3 == 0) {
/* 402 */       int i = paramInt1 - this.i;
/* 403 */       int j = paramInt2 - this.r;
/*     */       
/* 405 */       for (abt localabt : abt.a) {
/* 406 */         if (a(localabt, i, j)) {
/* 407 */           b(localabt);
/* 408 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 413 */     super.b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 417 */     return (w != abt.m.a()) && (abt.a[w].j()) && (((bfm)this.h).e());
/*     */   }
/*     */   
/*     */   private void b(abt paramabt) {
/* 421 */     int i = w;
/* 422 */     w = paramabt.a();
/* 423 */     bfm localbfm = (bfm)this.h;
/*     */     
/* 425 */     this.s.clear();
/* 426 */     localbfm.a.clear();
/* 427 */     paramabt.a(localbfm.a);
/*     */     
/* 429 */     if (paramabt == abt.m) {
/* 430 */       zs localzs = this.k.h.bn;
/*     */       
/* 432 */       if (this.B == null) this.B = localbfm.c;
/* 433 */       localbfm.c = new ArrayList();
/* 434 */       for (int j = 0; j < localzs.c.size(); j++) {
/* 435 */         bfn localbfn = new bfn(this, (aay)localzs.c.get(j), j);
/* 436 */         localbfm.c.add(localbfn);
/*     */         int k;
/* 438 */         int m; int n; if ((j >= 5) && (j < 9)) {
/* 439 */           k = j - 5;
/* 440 */           m = k / 2;
/* 441 */           n = k % 2;
/*     */           
/* 443 */           localbfn.h = (9 + m * 54);
/* 444 */           localbfn.i = (6 + n * 27);
/* 445 */         } else if ((j >= 0) && (j < 5)) {
/* 446 */           localbfn.i = 63536;
/* 447 */           localbfn.h = 63536;
/* 448 */         } else if (j < localzs.c.size()) {
/* 449 */           k = j - 9;
/* 450 */           m = k % 9;
/* 451 */           n = k / 9;
/*     */           
/* 453 */           localbfn.h = (9 + m * 18);
/*     */           
/* 455 */           if (j >= 36) {
/* 456 */             localbfn.i = 112;
/*     */           } else {
/* 458 */             localbfn.i = (54 + n * 18);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 463 */       this.C = new aay(v, 0, 173, 112);
/* 464 */       localbfm.c.add(this.C);
/* 465 */     } else if (i == abt.m.a()) {
/* 466 */       localbfm.c = this.B;
/* 467 */       this.B = null;
/*     */     }
/*     */     
/* 470 */     if (this.A != null) {
/* 471 */       if (paramabt == abt.g) {
/* 472 */         this.A.e(true);
/* 473 */         this.A.d(false);
/* 474 */         this.A.b(true);
/* 475 */         this.A.a("");
/* 476 */         g();
/*     */       } else {
/* 478 */         this.A.e(false);
/* 479 */         this.A.d(true);
/* 480 */         this.A.b(false);
/*     */       }
/*     */     }
/*     */     
/* 484 */     this.x = 0.0F;
/* 485 */     localbfm.a(0.0F);
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 490 */     super.k();
/*     */     
/* 492 */     int i = Mouse.getEventDWheel();
/* 493 */     if ((i != 0) && (h())) {
/* 494 */       int j = ((bfm)this.h).a.size() / 9 - 5 + 1;
/* 495 */       if (i > 0) i = 1;
/* 496 */       if (i < 0) i = -1;
/* 497 */       this.x = ((float)(this.x - i / j));
/* 498 */       if (this.x < 0.0F) this.x = 0.0F;
/* 499 */       if (this.x > 1.0F) this.x = 1.0F;
/* 500 */       ((bfm)this.h).a(this.x);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 508 */     boolean bool = Mouse.isButtonDown(0);
/* 509 */     int i = this.i;
/* 510 */     int j = this.r;
/*     */     
/* 512 */     int k = i + 175;
/* 513 */     int m = j + 18;
/* 514 */     int n = k + 14;
/* 515 */     int i1 = m + 112;
/* 516 */     if ((!this.z) && (bool) && 
/* 517 */       (paramInt1 >= k) && (paramInt2 >= m) && (paramInt1 < n) && (paramInt2 < i1)) {
/* 518 */       this.y = h();
/*     */     }
/*     */     
/* 521 */     if (!bool) this.y = false;
/* 522 */     this.z = bool;
/*     */     
/* 524 */     if (this.y) {
/* 525 */       this.x = ((paramInt2 - m - 7.5F) / (i1 - m - 15.0F));
/* 526 */       if (this.x < 0.0F) this.x = 0.0F;
/* 527 */       if (this.x > 1.0F) this.x = 1.0F;
/* 528 */       ((bfm)this.h).a(this.x);
/*     */     }
/*     */     
/* 531 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */     
/* 533 */     for (abt localabt : abt.a) {
/* 534 */       if (b(localabt, paramInt1, paramInt2))
/*     */         break;
/*     */     }
/* 537 */     if ((this.C != null) && (w == abt.m.a()) && (c(this.C.h, this.C.i, 16, 16, paramInt1, paramInt2))) {
/* 538 */       a(brp.a("inventory.binSlot", new Object[0]), paramInt1, paramInt2);
/*     */     }
/*     */     
/* 541 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 542 */     GL11.glDisable(2896);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(add paramadd, int paramInt1, int paramInt2)
/*     */   {
/* 548 */     if (w == abt.g.a()) {
/* 549 */       List localList = paramadd.a(this.k.h, this.k.u.v);
/*     */       
/* 551 */       Object localObject = paramadd.b().n_();
/*     */       
/* 553 */       if ((localObject == null) && (paramadd.b() == ade.bR)) {
/* 554 */         Map localMap = afv.a(paramadd);
/*     */         
/* 556 */         if (localMap.size() == 1) {
/* 557 */           aft localaft = aft.b[((Integer)localMap.keySet().iterator().next()).intValue()];
/*     */           
/* 559 */           for (abt localabt : abt.a) {
/* 560 */             if (localabt.a(localaft.C)) {
/* 561 */               localObject = localabt;
/* 562 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 568 */       if (localObject != null) {
/* 569 */         localList.add(1, "" + a.r + a.j + brp.a(((abt)localObject).c(), new Object[0]));
/*     */       }
/*     */       
/* 572 */       for (int i = 0; i < localList.size(); i++) {
/* 573 */         if (i == 0) {
/* 574 */           localList.set(i, paramadd.w().e + (String)localList.get(i));
/*     */         } else {
/* 576 */           localList.set(i, a.h + (String)localList.get(i));
/*     */         }
/*     */       }
/*     */       
/* 580 */       a(localList, paramInt1, paramInt2);
/*     */     } else {
/* 582 */       super.a(paramadd, paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/*     */   {
/* 588 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 589 */     bam.c();
/* 590 */     abt localabt1 = abt.a[w];
/*     */     
/* 592 */     for (abt localabt2 : abt.a) {
/* 593 */       this.k.P().a(u);
/* 594 */       if (localabt2.a() != w) { a(localabt2);
/*     */       }
/*     */     }
/* 597 */     this.k.P().a(new bqx("textures/gui/container/creative_inventory/tab_" + localabt1.g()));
/* 598 */     b(this.i, this.r, 0, 0, this.f, this.g);
/*     */     
/* 600 */     this.A.f();
/* 601 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 603 */     int i = this.i + 175;
/* 604 */     ??? = this.r + 18;
/* 605 */     ??? = ??? + 112;
/* 606 */     this.k.P().a(u);
/*     */     
/* 608 */     if (localabt1.j()) {
/* 609 */       b(i, ??? + (int)((??? - ??? - 17) * this.x), 'è' + (h() ? 0 : 12), 0, 12, 15);
/*     */     }
/*     */     
/* 612 */     a(localabt1);
/*     */     
/* 614 */     if (localabt1 == abt.m) {
/* 615 */       bfu.a(this.i + 43, this.r + 45, 20, this.i + 43 - paramInt1, this.r + 45 - 30 - paramInt2, this.k.h);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(abt paramabt, int paramInt1, int paramInt2) {
/* 620 */     int i = paramabt.l();
/* 621 */     int j = 28 * i;
/* 622 */     int k = 0;
/*     */     
/* 624 */     if (i == 5) {
/* 625 */       j = this.f - 28 + 2;
/* 626 */     } else if (i > 0) {
/* 627 */       j += i;
/*     */     }
/*     */     
/* 630 */     if (paramabt.m()) {
/* 631 */       k -= 32;
/*     */     } else {
/* 633 */       k += this.g;
/*     */     }
/*     */     
/* 636 */     return (paramInt1 >= j) && (paramInt1 <= j + 28) && (paramInt2 >= k) && (paramInt2 <= k + 32);
/*     */   }
/*     */   
/*     */   protected boolean b(abt paramabt, int paramInt1, int paramInt2) {
/* 640 */     int i = paramabt.l();
/* 641 */     int j = 28 * i;
/* 642 */     int k = 0;
/*     */     
/* 644 */     if (i == 5) {
/* 645 */       j = this.f - 28 + 2;
/* 646 */     } else if (i > 0) {
/* 647 */       j += i;
/*     */     }
/*     */     
/* 650 */     if (paramabt.m()) {
/* 651 */       k -= 32;
/*     */     } else {
/* 653 */       k += this.g;
/*     */     }
/*     */     
/* 656 */     if (c(j + 3, k + 3, 23, 27, paramInt1, paramInt2)) {
/* 657 */       a(brp.a(paramabt.c(), new Object[0]), paramInt1, paramInt2);
/* 658 */       return true;
/*     */     }
/*     */     
/* 661 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(abt paramabt) {
/* 665 */     int i = paramabt.a() == w ? 1 : 0;
/* 666 */     boolean bool = paramabt.m();
/* 667 */     int j = paramabt.l();
/* 668 */     int k = j * 28;
/* 669 */     int m = 0;
/* 670 */     int n = this.i + 28 * j;
/* 671 */     int i1 = this.r;
/* 672 */     int i2 = 32;
/*     */     
/* 674 */     if (i != 0) {
/* 675 */       m += 32;
/*     */     }
/*     */     
/* 678 */     if (j == 5) {
/* 679 */       n = this.i + this.f - 28;
/* 680 */     } else if (j > 0) {
/* 681 */       n += j;
/*     */     }
/*     */     
/* 684 */     if (bool) {
/* 685 */       i1 -= 28;
/*     */     } else {
/* 687 */       m += 64;
/* 688 */       i1 += this.g - 4;
/*     */     }
/*     */     
/* 691 */     GL11.glDisable(2896);
/* 692 */     b(n, i1, k, m, 28, i2);
/*     */     
/* 694 */     this.e = 100.0F;
/* 695 */     j.f = 100.0F;
/* 696 */     n += 6;
/* 697 */     i1 += 8 + (bool ? 1 : -1);
/*     */     
/* 699 */     GL11.glEnable(2896);
/* 700 */     GL11.glEnable(32826);
/* 701 */     add localadd = paramabt.d();
/* 702 */     j.b(this.q, this.k.P(), localadd, n, i1);
/* 703 */     j.c(this.q, this.k.P(), localadd, n, i1);
/* 704 */     GL11.glDisable(2896);
/*     */     
/* 706 */     j.f = 0.0F;
/* 707 */     this.e = 0.0F;
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/* 712 */     if (parambcb.k == 0) {
/* 713 */       this.k.a(new bei(this, this.k.h.m()));
/*     */     }
/* 715 */     if (parambcb.k == 1) {
/* 716 */       this.k.a(new bej(this, this.k.h.m()));
/*     */     }
/*     */   }
/*     */   
/*     */   public int a() {
/* 721 */     return w;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */