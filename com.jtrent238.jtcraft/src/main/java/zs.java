/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public abstract class zs
/*     */ {
/*  29 */   public List b = new ArrayList();
/*  30 */   public List c = new ArrayList();
/*     */   
/*     */   public int d;
/*     */   private short a;
/*  34 */   private int f = -1;
/*     */   private int g;
/*  36 */   private final Set h = new HashSet();
/*     */   
/*  38 */   protected List e = new ArrayList();
/*     */   
/*     */   protected aay a(aay paramaay) {
/*  41 */     paramaay.g = this.c.size();
/*  42 */     this.c.add(paramaay);
/*  43 */     this.b.add(null);
/*  44 */     return paramaay;
/*     */   }
/*     */   
/*     */   public void a(aac paramaac) {
/*  48 */     if (this.e.contains(paramaac)) {
/*  49 */       throw new IllegalArgumentException("Listener already listening");
/*     */     }
/*  51 */     this.e.add(paramaac);
/*     */     
/*  53 */     paramaac.a(this, a());
/*  54 */     b();
/*     */   }
/*     */   
/*     */   public void b(aac paramaac) {
/*  58 */     this.e.remove(paramaac);
/*     */   }
/*     */   
/*     */   public List a() {
/*  62 */     ArrayList localArrayList = new ArrayList();
/*  63 */     for (int j = 0; j < this.c.size(); j++) {
/*  64 */       localArrayList.add(((aay)this.c.get(j)).d());
/*     */     }
/*  66 */     return localArrayList;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b()
/*     */   {
/*  76 */     for (int j = 0; j < this.c.size(); j++) {
/*  77 */       add localadd1 = ((aay)this.c.get(j)).d();
/*  78 */       add localadd2 = (add)this.b.get(j);
/*  79 */       if (!add.b(localadd2, localadd1)) {
/*  80 */         localadd2 = localadd1 == null ? null : localadd1.m();
/*  81 */         this.b.set(j, localadd2);
/*  82 */         for (int k = 0; k < this.e.size(); k++) {
/*  83 */           ((aac)this.e.get(k)).a(this, j, localadd2);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, int paramInt) {
/*  90 */     return false;
/*     */   }
/*     */   
/*     */   public aay a(rb paramrb, int paramInt) {
/*  94 */     for (int j = 0; j < this.c.size(); j++) {
/*  95 */       aay localaay = (aay)this.c.get(j);
/*  96 */       if (localaay.a(paramrb, paramInt)) {
/*  97 */         return localaay;
/*     */       }
/*     */     }
/* 100 */     return null;
/*     */   }
/*     */   
/*     */   public aay a(int paramInt) {
/* 104 */     return (aay)this.c.get(paramInt);
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt) {
/* 108 */     aay localaay = (aay)this.c.get(paramInt);
/* 109 */     if (localaay != null) {
/* 110 */       return localaay.d();
/*     */     }
/* 112 */     return null;
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2, int paramInt3, yz paramyz) {
/* 116 */     add localadd1 = null;
/* 117 */     yx localyx = paramyz.bm;
/*     */     Object localObject1;
/* 119 */     Object localObject3; add localadd4; if (paramInt3 == 5) {
/* 120 */       int j = this.g;
/* 121 */       this.g = c(paramInt2);
/*     */       
/* 123 */       if (((j != 1) || (this.g != 2)) && (j != this.g)) {
/* 124 */         d();
/* 125 */       } else if (localyx.o() == null) {
/* 126 */         d();
/* 127 */       } else if (this.g == 0) {
/* 128 */         this.f = b(paramInt2);
/*     */         
/* 130 */         if (d(this.f)) {
/* 131 */           this.g = 1;
/* 132 */           this.h.clear();
/*     */         } else {
/* 134 */           d();
/*     */         }
/* 136 */       } else if (this.g == 1) {
/* 137 */         localObject1 = (aay)this.c.get(paramInt1);
/*     */         
/* 139 */         if ((localObject1 != null) && (a((aay)localObject1, localyx.o(), true)) && (((aay)localObject1).a(localyx.o())) && (localyx.o().b > this.h.size()) && (b((aay)localObject1))) {
/* 140 */           this.h.add(localObject1);
/*     */         }
/* 142 */       } else if (this.g == 2) {
/* 143 */         if (!this.h.isEmpty()) {
/* 144 */           localObject1 = localyx.o().m();
/* 145 */           int k = localyx.o().b;
/*     */           
/* 147 */           for (Iterator localIterator = this.h.iterator(); localIterator.hasNext();) { localObject3 = (aay)localIterator.next();
/* 148 */             if ((localObject3 != null) && (a((aay)localObject3, localyx.o(), true)) && (((aay)localObject3).a(localyx.o())) && (localyx.o().b >= this.h.size()) && (b((aay)localObject3))) {
/* 149 */               localadd4 = ((add)localObject1).m();
/* 150 */               int i1 = ((aay)localObject3).e() ? ((aay)localObject3).d().b : 0;
/* 151 */               a(this.h, this.f, localadd4, i1);
/*     */               
/* 153 */               if (localadd4.b > localadd4.e()) localadd4.b = localadd4.e();
/* 154 */               if (localadd4.b > ((aay)localObject3).a()) { localadd4.b = ((aay)localObject3).a();
/*     */               }
/* 156 */               k -= localadd4.b - i1;
/* 157 */               ((aay)localObject3).c(localadd4);
/*     */             }
/*     */           }
/*     */           
/* 161 */           ((add)localObject1).b = k;
/* 162 */           if (((add)localObject1).b <= 0) {
/* 163 */             localObject1 = null;
/*     */           }
/* 165 */           localyx.b((add)localObject1);
/*     */         }
/*     */         
/* 168 */         d();
/*     */       } else {
/* 170 */         d();
/*     */       }
/* 172 */     } else if (this.g != 0) {
/* 173 */       d(); } else { aay localaay1;
/* 174 */       add localadd3; if (((paramInt3 == 0) || (paramInt3 == 1)) && ((paramInt2 == 0) || (paramInt2 == 1))) {
/* 175 */         if (paramInt1 == 64537) {
/* 176 */           if ((localyx.o() != null) && 
/* 177 */             (paramInt1 == 64537)) {
/* 178 */             if (paramInt2 == 0) {
/* 179 */               paramyz.a(localyx.o(), true);
/* 180 */               localyx.b(null);
/*     */             }
/* 182 */             if (paramInt2 == 1) {
/* 183 */               paramyz.a(localyx.o().a(1), true);
/* 184 */               if (localyx.o().b == 0) localyx.b(null);
/*     */             }
/*     */           }
/*     */         } else {
/*     */           Object localObject2;
/* 189 */           if (paramInt3 == 1) {
/* 190 */             if (paramInt1 < 0) return null;
/* 191 */             localaay1 = (aay)this.c.get(paramInt1);
/* 192 */             if ((localaay1 != null) && (localaay1.a(paramyz))) {
/* 193 */               localObject1 = b(paramyz, paramInt1);
/* 194 */               if (localObject1 != null) {
/* 195 */                 localObject2 = ((add)localObject1).b();
/* 196 */                 localadd1 = ((add)localObject1).m();
/*     */                 
/* 198 */                 if ((localaay1.d() != null) && (localaay1.d().b() == localObject2)) {
/* 199 */                   a(paramInt1, paramInt2, true, paramyz);
/*     */                 }
/*     */               }
/*     */             }
/*     */           } else {
/* 204 */             if (paramInt1 < 0) { return null;
/*     */             }
/* 206 */             localaay1 = (aay)this.c.get(paramInt1);
/* 207 */             if (localaay1 != null) {
/* 208 */               localObject1 = localaay1.d();
/* 209 */               localObject2 = localyx.o();
/*     */               
/* 211 */               if (localObject1 != null) {
/* 212 */                 localadd1 = ((add)localObject1).m();
/*     */               }
/*     */               
/* 215 */               if (localObject1 == null) {
/* 216 */                 if ((localObject2 != null) && (localaay1.a((add)localObject2))) {
/* 217 */                   localadd3 = paramInt2 == 0 ? ((add)localObject2).b : 1;
/* 218 */                   if (localadd3 > localaay1.a()) {
/* 219 */                     localadd3 = localaay1.a();
/*     */                   }
/* 221 */                   if (((add)localObject2).b >= localadd3) {
/* 222 */                     localaay1.c(((add)localObject2).a(localadd3));
/*     */                   }
/* 224 */                   if (((add)localObject2).b == 0) {
/* 225 */                     localyx.b(null);
/*     */                   }
/*     */                 }
/* 228 */               } else if (localaay1.a(paramyz)) {
/* 229 */                 if (localObject2 == null)
/*     */                 {
/* 231 */                   localadd3 = paramInt2 == 0 ? ((add)localObject1).b : (((add)localObject1).b + 1) / 2;
/* 232 */                   localObject3 = localaay1.a(localadd3);
/*     */                   
/* 234 */                   localyx.b((add)localObject3);
/* 235 */                   if (((add)localObject1).b == 0) {
/* 236 */                     localaay1.c(null);
/*     */                   }
/* 238 */                   localaay1.a(paramyz, localyx.o());
/* 239 */                 } else if (localaay1.a((add)localObject2))
/*     */                 {
/* 241 */                   if ((((add)localObject1).b() != ((add)localObject2).b()) || (((add)localObject1).k() != ((add)localObject2).k()) || (!add.a((add)localObject1, (add)localObject2)))
/*     */                   {
/* 243 */                     if (((add)localObject2).b <= localaay1.a()) {
/* 244 */                       localaay1.c((add)localObject2);
/* 245 */                       localyx.b((add)localObject1);
/*     */                     }
/*     */                   }
/*     */                   else {
/* 249 */                     localadd3 = paramInt2 == 0 ? ((add)localObject2).b : 1;
/* 250 */                     if (localadd3 > localaay1.a() - ((add)localObject1).b) {
/* 251 */                       localadd3 = localaay1.a() - ((add)localObject1).b;
/*     */                     }
/* 253 */                     if (localadd3 > ((add)localObject2).e() - ((add)localObject1).b) {
/* 254 */                       localadd3 = ((add)localObject2).e() - ((add)localObject1).b;
/*     */                     }
/* 256 */                     ((add)localObject2).a(localadd3);
/* 257 */                     if (((add)localObject2).b == 0) {
/* 258 */                       localyx.b(null);
/*     */                     }
/* 260 */                     localObject1.b += localadd3;
/*     */                   }
/*     */                   
/*     */                 }
/* 264 */                 else if ((((add)localObject1).b() == ((add)localObject2).b()) && (((add)localObject2).e() > 1) && ((!((add)localObject1).h()) || (((add)localObject1).k() == ((add)localObject2).k())) && (add.a((add)localObject1, (add)localObject2)))
/*     */                 {
/* 266 */                   localadd3 = ((add)localObject1).b;
/* 267 */                   if ((localadd3 > 0) && (localadd3 + ((add)localObject2).b <= ((add)localObject2).e())) {
/* 268 */                     localObject2.b += localadd3;
/* 269 */                     localObject1 = localaay1.a(localadd3);
/* 270 */                     if (((add)localObject1).b == 0) localaay1.c(null);
/* 271 */                     localaay1.a(paramyz, localyx.o());
/*     */                   }
/*     */                 }
/*     */               }
/*     */               
/*     */ 
/* 277 */               localaay1.f();
/*     */             }
/*     */           } } } else { add localadd2;
/* 280 */         if ((paramInt3 == 2) && (paramInt2 >= 0) && (paramInt2 < 9)) {
/* 281 */           localaay1 = (aay)this.c.get(paramInt1);
/* 282 */           if (localaay1.a(paramyz)) {
/* 283 */             localObject1 = localyx.a(paramInt2);
/* 284 */             localadd2 = (localObject1 == null) || ((localaay1.f == localyx) && (localaay1.a((add)localObject1))) ? 1 : 0;
/* 285 */             localadd3 = -1;
/*     */             
/* 287 */             if (localadd2 == 0) {
/* 288 */               localadd3 = localyx.j();
/* 289 */               localadd2 |= (localadd3 > -1 ? 1 : 0);
/*     */             }
/*     */             
/* 292 */             if ((localaay1.e()) && (localadd2 != 0)) {
/* 293 */               localObject3 = localaay1.d();
/*     */               
/* 295 */               localyx.a(paramInt2, ((add)localObject3).m());
/*     */               
/* 297 */               if (((localaay1.f == localyx) && (localaay1.a((add)localObject1))) || (localObject1 == null)) {
/* 298 */                 localaay1.a(((add)localObject3).b);
/* 299 */                 localaay1.c((add)localObject1);
/* 300 */                 localaay1.a(paramyz, (add)localObject3);
/* 301 */               } else if (localadd3 > -1) {
/* 302 */                 localyx.a((add)localObject1);
/* 303 */                 localaay1.a(((add)localObject3).b);
/* 304 */                 localaay1.c(null);
/* 305 */                 localaay1.a(paramyz, (add)localObject3);
/*     */               }
/* 307 */             } else if ((!localaay1.e()) && (localObject1 != null) && (localaay1.a((add)localObject1))) {
/* 308 */               localyx.a(paramInt2, null);
/* 309 */               localaay1.c((add)localObject1);
/*     */             }
/*     */           }
/* 312 */         } else if ((paramInt3 == 3) && (paramyz.bE.d) && (localyx.o() == null) && (paramInt1 >= 0)) {
/* 313 */           localaay1 = (aay)this.c.get(paramInt1);
/* 314 */           if ((localaay1 != null) && (localaay1.e())) {
/* 315 */             localObject1 = localaay1.d().m();
/* 316 */             ((add)localObject1).b = ((add)localObject1).e();
/* 317 */             localyx.b((add)localObject1);
/*     */           }
/* 319 */         } else if ((paramInt3 == 4) && (localyx.o() == null) && (paramInt1 >= 0)) {
/* 320 */           localaay1 = (aay)this.c.get(paramInt1);
/* 321 */           if ((localaay1 != null) && (localaay1.e()) && (localaay1.a(paramyz))) {
/* 322 */             localObject1 = localaay1.a(paramInt2 == 0 ? 1 : localaay1.d().b);
/* 323 */             localaay1.a(paramyz, (add)localObject1);
/* 324 */             paramyz.a((add)localObject1, true);
/*     */           }
/* 326 */         } else if ((paramInt3 == 6) && (paramInt1 >= 0)) {
/* 327 */           localaay1 = (aay)this.c.get(paramInt1);
/* 328 */           localObject1 = localyx.o();
/*     */           
/* 330 */           if ((localObject1 != null) && ((localaay1 == null) || (!localaay1.e()) || (!localaay1.a(paramyz)))) {
/* 331 */             localadd2 = paramInt2 == 0 ? 0 : this.c.size() - 1;
/* 332 */             localadd3 = paramInt2 == 0 ? 1 : -1;
/*     */             
/* 334 */             for (int m = 0; m < 2; m++) {
/*     */               int n;
/* 336 */               for (localadd4 = localadd2; (localadd4 >= 0) && (localadd4 < this.c.size()) && (((add)localObject1).b < ((add)localObject1).e()); localadd4 += localadd3) {
/* 337 */                 aay localaay2 = (aay)this.c.get(localadd4);
/*     */                 
/* 339 */                 if ((localaay2.e()) && (a(localaay2, (add)localObject1, true)) && (localaay2.a(paramyz)) && (a((add)localObject1, localaay2)) && (
/* 340 */                   (m != 0) || (localaay2.d().b != localaay2.d().e()))) {
/* 341 */                   int i2 = Math.min(((add)localObject1).e() - ((add)localObject1).b, localaay2.d().b);
/* 342 */                   add localadd5 = localaay2.a(i2);
/* 343 */                   localObject1.b += i2;
/*     */                   
/* 345 */                   if (localadd5.b <= 0) {
/* 346 */                     localaay2.c(null);
/*     */                   }
/* 348 */                   localaay2.a(paramyz, localadd5);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */           
/* 354 */           b();
/*     */         }
/*     */       } }
/* 357 */     return localadd1;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, aay paramaay) {
/* 361 */     return true;
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, boolean paramBoolean, yz paramyz) {
/* 365 */     a(paramInt1, paramInt2, 1, paramyz);
/*     */   }
/*     */   
/*     */   public void b(yz paramyz) {
/* 369 */     yx localyx = paramyz.bm;
/* 370 */     if (localyx.o() != null) {
/* 371 */       paramyz.a(localyx.o(), false);
/* 372 */       localyx.b(null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rb paramrb) {
/* 377 */     b();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/* 385 */     a(paramInt).c(paramadd);
/*     */   }
/*     */   
/*     */   public void a(add[] paramArrayOfadd) {
/* 389 */     for (int j = 0; j < paramArrayOfadd.length; j++) {
/* 390 */       a(j).c(paramArrayOfadd[j]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {}
/*     */   
/*     */   public short a(yx paramyx)
/*     */   {
/* 398 */     this.a = ((short)(this.a + 1));
/* 399 */     return this.a;
/*     */   }
/*     */   
/* 402 */   private Set i = new HashSet();
/*     */   
/*     */   public boolean c(yz paramyz) {
/* 405 */     return !this.i.contains(paramyz);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, boolean paramBoolean) {
/* 409 */     if (paramBoolean) this.i.remove(paramyz); else
/* 410 */       this.i.add(paramyz);
/*     */   }
/*     */   
/*     */   public abstract boolean a(yz paramyz);
/*     */   
/*     */   protected boolean a(add paramadd, int paramInt1, int paramInt2, boolean paramBoolean) {
/* 416 */     boolean bool = false;
/*     */     
/* 418 */     int j = paramInt1;
/* 419 */     if (paramBoolean) {
/* 420 */       j = paramInt2 - 1;
/*     */     }
/*     */     aay localaay;
/*     */     add localadd;
/* 424 */     if (paramadd.f()) {
/* 425 */       while ((paramadd.b > 0) && (((!paramBoolean) && (j < paramInt2)) || ((paramBoolean) && (j >= paramInt1))))
/*     */       {
/* 427 */         localaay = (aay)this.c.get(j);
/* 428 */         localadd = localaay.d();
/* 429 */         if ((localadd != null) && (localadd.b() == paramadd.b()) && ((!paramadd.h()) || (paramadd.k() == localadd.k())) && (add.a(paramadd, localadd))) {
/* 430 */           int k = localadd.b + paramadd.b;
/* 431 */           if (k <= paramadd.e()) {
/* 432 */             paramadd.b = 0;
/* 433 */             localadd.b = k;
/* 434 */             localaay.f();
/* 435 */             bool = true;
/* 436 */           } else if (localadd.b < paramadd.e()) {
/* 437 */             paramadd.b -= paramadd.e() - localadd.b;
/* 438 */             localadd.b = paramadd.e();
/* 439 */             localaay.f();
/* 440 */             bool = true;
/*     */           }
/*     */         }
/*     */         
/* 444 */         if (paramBoolean) {
/* 445 */           j--;
/*     */         } else {
/* 447 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 453 */     if (paramadd.b > 0) {
/* 454 */       if (paramBoolean) {
/* 455 */         j = paramInt2 - 1;
/*     */       } else {
/* 457 */         j = paramInt1;
/*     */       }
/* 459 */       while (((!paramBoolean) && (j < paramInt2)) || ((paramBoolean) && (j >= paramInt1))) {
/* 460 */         localaay = (aay)this.c.get(j);
/* 461 */         localadd = localaay.d();
/*     */         
/* 463 */         if (localadd == null) {
/* 464 */           localaay.c(paramadd.m());
/* 465 */           localaay.f();
/* 466 */           paramadd.b = 0;
/* 467 */           bool = true;
/* 468 */           break;
/*     */         }
/*     */         
/* 471 */         if (paramBoolean) {
/* 472 */           j--;
/*     */         } else {
/* 474 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 479 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int b(int paramInt)
/*     */   {
/* 487 */     return paramInt >> 2 & 0x3;
/*     */   }
/*     */   
/*     */   public static int c(int paramInt) {
/* 491 */     return paramInt & 0x3;
/*     */   }
/*     */   
/*     */   public static int d(int paramInt1, int paramInt2) {
/* 495 */     return paramInt1 & 0x3 | (paramInt2 & 0x3) << 2;
/*     */   }
/*     */   
/*     */   public static boolean d(int paramInt) {
/* 499 */     return (paramInt == 0) || (paramInt == 1);
/*     */   }
/*     */   
/*     */   protected void d() {
/* 503 */     this.g = 0;
/* 504 */     this.h.clear();
/*     */   }
/*     */   
/*     */   public static boolean a(aay paramaay, add paramadd, boolean paramBoolean) {
/* 508 */     boolean bool = (paramaay == null) || (!paramaay.e());
/*     */     
/* 510 */     if ((paramaay != null) && (paramaay.e()) && (paramadd != null) && (paramadd.a(paramaay.d())) && (add.a(paramaay.d(), paramadd))) {
/* 511 */       bool |= paramaay.d().b + (paramBoolean ? 0 : paramadd.b) <= paramadd.e();
/*     */     }
/*     */     
/* 514 */     return bool;
/*     */   }
/*     */   
/*     */   public static void a(Set paramSet, int paramInt1, add paramadd, int paramInt2) {
/* 518 */     switch (paramInt1) {
/*     */     case 0: 
/* 520 */       paramadd.b = qh.d(paramadd.b / paramSet.size());
/* 521 */       break;
/*     */     case 1: 
/* 523 */       paramadd.b = 1;
/*     */     }
/*     */     
/*     */     
/* 527 */     paramadd.b += paramInt2;
/*     */   }
/*     */   
/*     */   public boolean b(aay paramaay) {
/* 531 */     return true;
/*     */   }
/*     */   
/*     */   public static int b(rb paramrb) {
/* 535 */     if (paramrb == null) return 0;
/* 536 */     int j = 0;
/* 537 */     float f1 = 0.0F;
/*     */     
/* 539 */     for (int k = 0; k < paramrb.a(); k++) {
/* 540 */       add localadd = paramrb.a(k);
/*     */       
/* 542 */       if (localadd != null) {
/* 543 */         f1 += localadd.b / Math.min(paramrb.d(), localadd.e());
/* 544 */         j++;
/*     */       }
/*     */     }
/*     */     
/* 548 */     f1 /= paramrb.a();
/* 549 */     return qh.d(f1 * 14.0F) + (j > 0 ? 1 : 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */