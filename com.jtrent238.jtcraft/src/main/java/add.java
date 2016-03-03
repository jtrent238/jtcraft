/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public final class add
/*     */ {
/*  25 */   public static final DecimalFormat a = new DecimalFormat("#.###");
/*     */   
/*     */ 
/*     */ 
/*     */   public int b;
/*     */   
/*     */ 
/*     */   public int c;
/*     */   
/*     */ 
/*     */   private adb e;
/*     */   
/*     */ 
/*     */   public dh d;
/*     */   
/*     */ 
/*     */   private int f;
/*     */   
/*     */ 
/*     */   private st g;
/*     */   
/*     */ 
/*     */ 
/*     */   public add(aji paramaji)
/*     */   {
/*  50 */     this(paramaji, 1);
/*     */   }
/*     */   
/*     */   public add(aji paramaji, int paramInt) {
/*  54 */     this(paramaji, paramInt, 0);
/*     */   }
/*     */   
/*     */   public add(aji paramaji, int paramInt1, int paramInt2) {
/*  58 */     this(adb.a(paramaji), paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public add(adb paramadb) {
/*  62 */     this(paramadb, 1);
/*     */   }
/*     */   
/*     */   public add(adb paramadb, int paramInt) {
/*  66 */     this(paramadb, paramInt, 0);
/*     */   }
/*     */   
/*     */   public add(adb paramadb, int paramInt1, int paramInt2) {
/*  70 */     this.e = paramadb;
/*  71 */     this.b = paramInt1;
/*  72 */     this.f = paramInt2;
/*  73 */     if (this.f < 0) {
/*  74 */       this.f = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public static add a(dh paramdh) {
/*  79 */     add localadd = new add();
/*  80 */     localadd.c(paramdh);
/*  81 */     return localadd.b() != null ? localadd : null;
/*     */   }
/*     */   
/*     */   private add() {}
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  88 */     add localadd = new add(this.e, paramInt, this.f);
/*  89 */     if (this.d != null) localadd.d = ((dh)this.d.b());
/*  90 */     this.b -= paramInt;
/*  91 */     return localadd;
/*     */   }
/*     */   
/*     */   public adb b() {
/*  95 */     return this.e;
/*     */   }
/*     */   
/*     */   public rf c() {
/*  99 */     return b().j(this);
/*     */   }
/*     */   
/*     */   public int d() {
/* 103 */     return b().d();
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 107 */     boolean bool = b().a(this, paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/* 108 */     if (bool) paramyz.a(pp.E[adb.b(this.e)], 1);
/* 109 */     return bool;
/*     */   }
/*     */   
/*     */   public float a(aji paramaji) {
/* 113 */     return b().a(this, paramaji);
/*     */   }
/*     */   
/*     */   public add a(ahb paramahb, yz paramyz) {
/* 117 */     return b().a(this, paramahb, paramyz);
/*     */   }
/*     */   
/*     */   public add b(ahb paramahb, yz paramyz) {
/* 121 */     return b().b(this, paramahb, paramyz);
/*     */   }
/*     */   
/*     */   public dh b(dh paramdh) {
/* 125 */     paramdh.a("id", (short)adb.b(this.e));
/* 126 */     paramdh.a("Count", (byte)this.b);
/* 127 */     paramdh.a("Damage", (short)this.f);
/* 128 */     if (this.d != null) paramdh.a("tag", this.d);
/* 129 */     return paramdh;
/*     */   }
/*     */   
/*     */   public void c(dh paramdh) {
/* 133 */     this.e = adb.d(paramdh.e("id"));
/* 134 */     this.b = paramdh.d("Count");
/* 135 */     this.f = paramdh.e("Damage");
/* 136 */     if (this.f < 0) {
/* 137 */       this.f = 0;
/*     */     }
/* 139 */     if (paramdh.b("tag", 10)) this.d = paramdh.m("tag");
/*     */   }
/*     */   
/*     */   public int e() {
/* 143 */     return b().m();
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 147 */     return (e() > 1) && ((!g()) || (!i()));
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 151 */     if (this.e.o() <= 0) {
/* 152 */       return false;
/*     */     }
/* 154 */     if ((p()) && (q().n("Unbreakable"))) {
/* 155 */       return false;
/*     */     }
/* 157 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean h()
/*     */   {
/* 167 */     return this.e.n();
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 171 */     return (g()) && (this.f > 0);
/*     */   }
/*     */   
/*     */   public int j() {
/* 175 */     return this.f;
/*     */   }
/*     */   
/*     */   public int k() {
/* 179 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 183 */     this.f = paramInt;
/* 184 */     if (this.f < 0) {
/* 185 */       this.f = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public int l() {
/* 190 */     return this.e.o();
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, Random paramRandom) {
/* 194 */     if (!g()) {
/* 195 */       return false;
/*     */     }
/*     */     
/* 198 */     if (paramInt > 0) {
/* 199 */       int i = afv.a(aft.t.B, this);
/*     */       
/* 201 */       int j = 0;
/* 202 */       for (int k = 0; (i > 0) && (k < paramInt); k++) {
/* 203 */         if (afr.a(this, i, paramRandom)) {
/* 204 */           j++;
/*     */         }
/*     */       }
/* 207 */       paramInt -= j;
/*     */       
/* 209 */       if (paramInt <= 0) { return false;
/*     */       }
/*     */     }
/* 212 */     this.f += paramInt;
/*     */     
/* 214 */     return this.f > l();
/*     */   }
/*     */   
/*     */   public void a(int paramInt, sv paramsv) {
/* 218 */     if (((paramsv instanceof yz)) && (((yz)paramsv).bE.d)) return;
/* 219 */     if (!g()) { return;
/*     */     }
/* 221 */     if (a(paramInt, paramsv.aI())) {
/* 222 */       paramsv.a(this);
/*     */       
/* 224 */       this.b -= 1;
/* 225 */       if ((paramsv instanceof yz)) {
/* 226 */         yz localyz = (yz)paramsv;
/* 227 */         localyz.a(pp.F[adb.b(this.e)], 1);
/* 228 */         if ((this.b == 0) && ((b() instanceof abm))) {
/* 229 */           localyz.bG();
/*     */         }
/*     */       }
/* 232 */       if (this.b < 0) this.b = 0;
/* 233 */       this.f = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, yz paramyz) {
/* 238 */     boolean bool = this.e.a(this, paramsv, paramyz);
/* 239 */     if (bool) {
/* 240 */       paramyz.a(pp.E[adb.b(this.e)], 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {
/* 245 */     boolean bool = this.e.a(this, paramahb, paramaji, paramInt1, paramInt2, paramInt3, paramyz);
/* 246 */     if (bool) {
/* 247 */       paramyz.a(pp.E[adb.b(this.e)], 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b(aji paramaji) {
/* 252 */     return this.e.b(paramaji);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, sv paramsv) {
/* 256 */     return this.e.a(this, paramyz, paramsv);
/*     */   }
/*     */   
/*     */   public add m() {
/* 260 */     add localadd = new add(this.e, this.b, this.f);
/* 261 */     if (this.d != null) {
/* 262 */       localadd.d = ((dh)this.d.b());
/*     */     }
/* 264 */     return localadd;
/*     */   }
/*     */   
/*     */   public static boolean a(add paramadd1, add paramadd2) {
/* 268 */     if ((paramadd1 == null) && (paramadd2 == null)) return true;
/* 269 */     if ((paramadd1 == null) || (paramadd2 == null)) { return false;
/*     */     }
/* 271 */     if ((paramadd1.d == null) && (paramadd2.d != null)) {
/* 272 */       return false;
/*     */     }
/* 274 */     if ((paramadd1.d != null) && (!paramadd1.d.equals(paramadd2.d))) {
/* 275 */       return false;
/*     */     }
/* 277 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(add paramadd1, add paramadd2) {
/* 281 */     if ((paramadd1 == null) && (paramadd2 == null)) return true;
/* 282 */     if ((paramadd1 == null) || (paramadd2 == null)) return false;
/* 283 */     return paramadd1.d(paramadd2);
/*     */   }
/*     */   
/*     */   private boolean d(add paramadd) {
/* 287 */     if (this.b != paramadd.b) return false;
/* 288 */     if (this.e != paramadd.e) return false;
/* 289 */     if (this.f != paramadd.f) return false;
/* 290 */     if ((this.d == null) && (paramadd.d != null)) {
/* 291 */       return false;
/*     */     }
/* 293 */     if ((this.d != null) && (!this.d.equals(paramadd.d))) {
/* 294 */       return false;
/*     */     }
/* 296 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(add paramadd)
/*     */   {
/* 307 */     return (this.e == paramadd.e) && (this.f == paramadd.f);
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/* 312 */     return this.e.a(this);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static add b(add paramadd)
/*     */   {
/* 321 */     return paramadd == null ? null : paramadd.m();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 326 */     return this.b + "x" + this.e.a() + "@" + this.f;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, sa paramsa, int paramInt, boolean paramBoolean) {
/* 330 */     if (this.c > 0) this.c -= 1;
/* 331 */     this.e.a(this, paramahb, paramsa, paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt) {
/* 335 */     paramyz.a(pp.D[adb.b(this.e)], paramInt);
/* 336 */     this.e.d(this, paramahb, paramyz);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int n()
/*     */   {
/* 344 */     return b().d_(this);
/*     */   }
/*     */   
/*     */   public aei o() {
/* 348 */     return b().d(this);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, yz paramyz, int paramInt) {
/* 352 */     b().a(this, paramahb, paramyz, paramInt);
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 356 */     return this.d != null;
/*     */   }
/*     */   
/*     */   public dh q() {
/* 360 */     return this.d;
/*     */   }
/*     */   
/*     */   public dq r() {
/* 364 */     if (this.d == null) {
/* 365 */       return null;
/*     */     }
/* 367 */     return this.d.c("ench", 10);
/*     */   }
/*     */   
/*     */   public void d(dh paramdh) {
/* 371 */     this.d = paramdh;
/*     */   }
/*     */   
/*     */   public String s() {
/* 375 */     String str = b().n(this);
/*     */     
/* 377 */     if ((this.d != null) && (this.d.b("display", 10))) {
/* 378 */       dh localdh = this.d.m("display");
/*     */       
/* 380 */       if (localdh.b("Name", 8)) {
/* 381 */         str = localdh.j("Name");
/*     */       }
/*     */     }
/*     */     
/* 385 */     return str;
/*     */   }
/*     */   
/*     */   public add c(String paramString) {
/* 389 */     if (this.d == null) this.d = new dh();
/* 390 */     if (!this.d.b("display", 10)) this.d.a("display", new dh());
/* 391 */     this.d.m("display").a("Name", paramString);
/* 392 */     return this;
/*     */   }
/*     */   
/*     */   public void t() {
/* 396 */     if (this.d == null) return;
/* 397 */     if (!this.d.b("display", 10)) return;
/* 398 */     dh localdh = this.d.m("display");
/* 399 */     localdh.o("Name");
/*     */     
/* 401 */     if (localdh.d()) {
/* 402 */       this.d.o("display");
/*     */       
/* 404 */       if (this.d.d()) {
/* 405 */         d(null);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 411 */     if (this.d == null) return false;
/* 412 */     if (!this.d.b("display", 10)) return false;
/* 413 */     return this.d.m("display").b("Name", 8);
/*     */   }
/*     */   
/*     */   public List a(yz paramyz, boolean paramBoolean) {
/* 417 */     ArrayList localArrayList = new ArrayList();
/* 418 */     String str = s();
/*     */     
/* 420 */     if (u()) {
/* 421 */       str = a.u + str + a.v;
/*     */     }
/*     */     int i;
/* 424 */     if (paramBoolean) {
/* 425 */       localObject1 = "";
/*     */       
/* 427 */       if (str.length() > 0) {
/* 428 */         str = str + " (";
/* 429 */         localObject1 = ")";
/*     */       }
/*     */       
/* 432 */       i = adb.b(this.e);
/* 433 */       if (h()) {
/* 434 */         str = str + String.format("#%04d/%d%s", new Object[] { Integer.valueOf(i), Integer.valueOf(this.f), localObject1 });
/*     */       } else {
/* 436 */         str = str + String.format("#%04d%s", new Object[] { Integer.valueOf(i), localObject1 });
/*     */       }
/* 438 */     } else if ((!u()) && 
/* 439 */       (this.e == ade.aY)) {
/* 440 */       str = str + " #" + this.f;
/*     */     }
/*     */     
/*     */ 
/* 444 */     localArrayList.add(str);
/* 445 */     this.e.a(this, paramyz, localArrayList, paramBoolean);
/*     */     Object localObject2;
/* 447 */     Object localObject3; if (p()) {
/* 448 */       localObject1 = r();
/* 449 */       int k; if (localObject1 != null) {
/* 450 */         for (i = 0; i < ((dq)localObject1).c(); i++) {
/* 451 */           int j = ((dq)localObject1).b(i).e("id");
/* 452 */           k = ((dq)localObject1).b(i).e("lvl");
/*     */           
/* 454 */           if (aft.b[j] != null) {
/* 455 */             localArrayList.add(aft.b[j].c(k));
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 460 */       if (this.d.b("display", 10)) {
/* 461 */         localObject2 = this.d.m("display");
/*     */         
/* 463 */         if (((dh)localObject2).b("color", 3)) {
/* 464 */           if (paramBoolean) {
/* 465 */             localArrayList.add("Color: #" + Integer.toHexString(((dh)localObject2).f("color")).toUpperCase());
/*     */           } else {
/* 467 */             localArrayList.add(a.u + dd.a("item.dyed"));
/*     */           }
/*     */         }
/*     */         
/* 471 */         if (((dh)localObject2).b("Lore") == 9) {
/* 472 */           localObject3 = ((dh)localObject2).c("Lore", 8);
/* 473 */           if (((dq)localObject3).c() > 0) {
/* 474 */             for (k = 0; k < ((dq)localObject3).c(); k++) {
/* 475 */               localArrayList.add(a.f + "" + a.u + ((dq)localObject3).f(k));
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 482 */     Object localObject1 = D();
/*     */     
/* 484 */     if (!((Multimap)localObject1).isEmpty()) {
/* 485 */       localArrayList.add("");
/* 486 */       for (localObject2 = ((Multimap)localObject1).entries().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (Map.Entry)((Iterator)localObject2).next();
/* 487 */         tj localtj = (tj)((Map.Entry)localObject3).getValue();
/* 488 */         double d1 = localtj.d();
/*     */         
/*     */ 
/* 491 */         if (localtj.a() == adb.f) {
/* 492 */           d1 += afv.a(this, sz.a);
/*     */         }
/*     */         double d2;
/* 495 */         if ((localtj.c() == 1) || (localtj.c() == 2)) {
/* 496 */           d2 = d1 * 100.0D;
/*     */         } else {
/* 498 */           d2 = d1;
/*     */         }
/*     */         
/* 501 */         if (d1 > 0.0D) {
/* 502 */           localArrayList.add(a.j + dd.a(new StringBuilder().append("attribute.modifier.plus.").append(localtj.c()).toString(), new Object[] { a.format(d2), dd.a("attribute.name." + (String)((Map.Entry)localObject3).getKey()) }));
/*     */         }
/* 504 */         else if (d1 < 0.0D) {
/* 505 */           d2 *= -1.0D;
/* 506 */           localArrayList.add(a.m + dd.a(new StringBuilder().append("attribute.modifier.take.").append(localtj.c()).toString(), new Object[] { a.format(d2), dd.a("attribute.name." + (String)((Map.Entry)localObject3).getKey()) }));
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 511 */     if ((p()) && (q().n("Unbreakable"))) {
/* 512 */       localArrayList.add(a.j + dd.a("item.unbreakable"));
/*     */     }
/*     */     
/* 515 */     if ((paramBoolean) && 
/* 516 */       (i())) {
/* 517 */       localArrayList.add("Durability: " + (l() - j()) + " / " + l());
/*     */     }
/*     */     
/*     */ 
/* 521 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 525 */     return b().e(this);
/*     */   }
/*     */   
/*     */   public adq w() {
/* 529 */     return b().f(this);
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 533 */     if (!b().e_(this)) return false;
/* 534 */     if (y()) return false;
/* 535 */     return true;
/*     */   }
/*     */   
/*     */   public void a(aft paramaft, int paramInt) {
/* 539 */     if (this.d == null) d(new dh());
/* 540 */     if (!this.d.b("ench", 9)) this.d.a("ench", new dq());
/* 541 */     dq localdq = this.d.c("ench", 10);
/* 542 */     dh localdh = new dh();
/* 543 */     localdh.a("id", (short)paramaft.B);
/* 544 */     localdh.a("lvl", (short)(byte)paramInt);
/* 545 */     localdq.a(localdh);
/*     */   }
/*     */   
/*     */   public boolean y() {
/* 549 */     if ((this.d != null) && (this.d.b("ench", 9))) return true;
/* 550 */     return false;
/*     */   }
/*     */   
/*     */   public void a(String paramString, dy paramdy) {
/* 554 */     if (this.d == null) {
/* 555 */       d(new dh());
/*     */     }
/* 557 */     this.d.a(paramString, paramdy);
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 561 */     return b().v();
/*     */   }
/*     */   
/*     */   public boolean A() {
/* 565 */     return this.g != null;
/*     */   }
/*     */   
/*     */   public void a(st paramst) {
/* 569 */     this.g = paramst;
/*     */   }
/*     */   
/*     */   public st B() {
/* 573 */     return this.g;
/*     */   }
/*     */   
/*     */   public int C() {
/* 577 */     if ((p()) && (this.d.b("RepairCost", 3))) {
/* 578 */       return this.d.f("RepairCost");
/*     */     }
/* 580 */     return 0;
/*     */   }
/*     */   
/*     */   public void c(int paramInt)
/*     */   {
/* 585 */     if (!p()) this.d = new dh();
/* 586 */     this.d.a("RepairCost", paramInt);
/*     */   }
/*     */   
/*     */   public Multimap D()
/*     */   {
/*     */     Object localObject;
/* 592 */     if ((p()) && (this.d.b("AttributeModifiers", 9))) {
/* 593 */       localObject = HashMultimap.create();
/* 594 */       dq localdq = this.d.c("AttributeModifiers", 10);
/*     */       
/* 596 */       for (int i = 0; i < localdq.c(); i++) {
/* 597 */         dh localdh = localdq.b(i);
/* 598 */         tj localtj = yj.a(localdh);
/*     */         
/* 600 */         if ((localtj.a().getLeastSignificantBits() != 0L) && (localtj.a().getMostSignificantBits() != 0L)) {
/* 601 */           ((Multimap)localObject).put(localdh.j("AttributeName"), localtj);
/*     */         }
/*     */       }
/*     */     } else {
/* 605 */       localObject = b().k();
/*     */     }
/*     */     
/* 608 */     return (Multimap)localObject;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(adb paramadb)
/*     */   {
/* 614 */     this.e = paramadb;
/*     */   }
/*     */   
/*     */   public fj E() {
/* 618 */     fj localfj = new fq("[").a(s()).a("]");
/*     */     
/* 620 */     if (this.e != null) {
/* 621 */       dh localdh = new dh();
/* 622 */       b(localdh);
/*     */       
/* 624 */       localfj.b().a(new fl(fm.c, new fq(localdh.toString())));
/* 625 */       localfj.b().a(w().e);
/*     */     }
/*     */     
/* 628 */     return localfj;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\add.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */