/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class api
/*     */   extends aor
/*     */   implements aph
/*     */ {
/*  20 */   private add[] a = new add[5];
/*     */   private String i;
/*  22 */   private int j = -1;
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  26 */     super.a(paramdh);
/*     */     
/*     */ 
/*  29 */     dq localdq = paramdh.c("Items", 10);
/*  30 */     this.a = new add[a()];
/*  31 */     if (paramdh.b("CustomName", 8)) this.i = paramdh.j("CustomName");
/*  32 */     this.j = paramdh.f("TransferCooldown");
/*  33 */     for (int k = 0; k < localdq.c(); k++) {
/*  34 */       dh localdh = localdq.b(k);
/*  35 */       int m = localdh.d("Slot");
/*  36 */       if ((m >= 0) && (m < this.a.length)) this.a[m] = add.a(localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  42 */     super.b(paramdh);
/*  43 */     dq localdq = new dq();
/*     */     
/*  45 */     for (int k = 0; k < this.a.length; k++) {
/*  46 */       if (this.a[k] != null) {
/*  47 */         dh localdh = new dh();
/*  48 */         localdh.a("Slot", (byte)k);
/*  49 */         this.a[k].b(localdh);
/*  50 */         localdq.a(localdh);
/*     */       }
/*     */     }
/*  53 */     paramdh.a("Items", localdq);
/*  54 */     paramdh.a("TransferCooldown", this.j);
/*  55 */     if (k_()) paramdh.a("CustomName", this.i);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  60 */     super.e();
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  65 */     return this.a.length;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  70 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  75 */     if (this.a[paramInt1] != null) {
/*  76 */       if (this.a[paramInt1].b <= paramInt2) {
/*  77 */         localadd = this.a[paramInt1];
/*  78 */         this.a[paramInt1] = null;
/*  79 */         return localadd;
/*     */       }
/*  81 */       add localadd = this.a[paramInt1].a(paramInt2);
/*  82 */       if (this.a[paramInt1].b == 0) this.a[paramInt1] = null;
/*  83 */       return localadd;
/*     */     }
/*     */     
/*  86 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  91 */     if (this.a[paramInt] != null) {
/*  92 */       add localadd = this.a[paramInt];
/*  93 */       this.a[paramInt] = null;
/*  94 */       return localadd;
/*     */     }
/*  96 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/* 101 */     this.a[paramInt] = paramadd;
/* 102 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 107 */     return k_() ? this.i : "container.hopper";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/* 112 */     return (this.i != null) && (this.i.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 116 */     this.i = paramString;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 121 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 126 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 127 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 128 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void f() {}
/*     */   
/*     */ 
/*     */   public void l_() {}
/*     */   
/*     */ 
/*     */   public boolean b(int paramInt, add paramadd)
/*     */   {
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 146 */     if ((this.b == null) || (this.b.E)) { return;
/*     */     }
/* 148 */     this.j -= 1;
/*     */     
/* 150 */     if (!j()) {
/* 151 */       c(0);
/* 152 */       i();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 157 */     if ((this.b == null) || (this.b.E)) { return false;
/*     */     }
/* 159 */     if ((!j()) && (aln.c(p()))) {
/* 160 */       boolean bool = false;
/*     */       
/* 162 */       if (!k()) {
/* 163 */         bool = y();
/*     */       }
/* 165 */       if (!l()) {
/* 166 */         bool = (a(this)) || (bool);
/*     */       }
/*     */       
/* 169 */       if (bool) {
/* 170 */         c(8);
/* 171 */         e();
/* 172 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 176 */     return false;
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 180 */     for (add localadd : this.a) {
/* 181 */       if (localadd != null) {
/* 182 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 186 */     return true;
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 190 */     for (add localadd : this.a) {
/* 191 */       if ((localadd == null) || (localadd.b != localadd.e())) {
/* 192 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 196 */     return true;
/*     */   }
/*     */   
/*     */   private boolean y() {
/* 200 */     rb localrb = z();
/* 201 */     if (localrb == null) {
/* 202 */       return false;
/*     */     }
/*     */     
/* 205 */     int k = q.a[aln.b(p())];
/* 206 */     if (a(localrb, k)) {
/* 207 */       return false;
/*     */     }
/*     */     
/* 210 */     for (int m = 0; m < a(); m++) {
/* 211 */       if (a(m) != null)
/*     */       {
/* 213 */         add localadd1 = a(m).m();
/* 214 */         add localadd2 = a(localrb, a(m, 1), k);
/*     */         
/* 216 */         if ((localadd2 == null) || (localadd2.b == 0)) {
/* 217 */           localrb.e();
/* 218 */           return true;
/*     */         }
/* 220 */         a(m, localadd1);
/*     */       }
/*     */     }
/*     */     
/* 224 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(rb paramrb, int paramInt) {
/* 228 */     if (((paramrb instanceof rl)) && (paramInt > -1)) {
/* 229 */       rl localrl = (rl)paramrb;
/* 230 */       int[] arrayOfInt = localrl.c(paramInt);
/*     */       
/* 232 */       for (int n = 0; n < arrayOfInt.length; n++) {
/* 233 */         add localadd2 = localrl.a(arrayOfInt[n]);
/* 234 */         if ((localadd2 == null) || (localadd2.b != localadd2.e())) {
/* 235 */           return false;
/*     */         }
/*     */       }
/*     */     } else {
/* 239 */       int k = paramrb.a();
/* 240 */       for (int m = 0; m < k; m++) {
/* 241 */         add localadd1 = paramrb.a(m);
/* 242 */         if ((localadd1 == null) || (localadd1.b != localadd1.e())) {
/* 243 */           return false;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 248 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(rb paramrb, int paramInt)
/*     */   {
/* 253 */     if (((paramrb instanceof rl)) && (paramInt > -1)) {
/* 254 */       rl localrl = (rl)paramrb;
/* 255 */       int[] arrayOfInt = localrl.c(paramInt);
/*     */       
/* 257 */       for (int n = 0; n < arrayOfInt.length; n++) {
/* 258 */         if (localrl.a(arrayOfInt[n]) != null) {
/* 259 */           return false;
/*     */         }
/*     */       }
/*     */     } else {
/* 263 */       int k = paramrb.a();
/* 264 */       for (int m = 0; m < k; m++) {
/* 265 */         if (paramrb.a(m) != null) {
/* 266 */           return false;
/*     */         }
/*     */       }
/*     */     }
/* 270 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(aph paramaph) {
/* 274 */     rb localrb = b(paramaph);
/*     */     
/* 276 */     if (localrb != null) {
/* 277 */       int k = 0;
/* 278 */       if (b(localrb, k)) {
/* 279 */         return false;
/*     */       }
/*     */       
/* 282 */       if (((localrb instanceof rl)) && (k > -1)) {
/* 283 */         rl localrl = (rl)localrb;
/* 284 */         int[] arrayOfInt = localrl.c(k);
/*     */         
/* 286 */         for (int i1 = 0; i1 < arrayOfInt.length; i1++) {
/* 287 */           if (a(paramaph, localrb, arrayOfInt[i1], k)) return true;
/*     */         }
/*     */       } else {
/* 290 */         int m = localrb.a();
/* 291 */         for (int n = 0; n < m; n++) {
/* 292 */           if (a(paramaph, localrb, n, k)) return true;
/*     */         }
/*     */       }
/*     */     } else {
/* 296 */       xk localxk = a(paramaph.w(), paramaph.x(), paramaph.aD() + 1.0D, paramaph.aE());
/*     */       
/* 298 */       if (localxk != null) {
/* 299 */         return a(paramaph, localxk);
/*     */       }
/*     */     }
/*     */     
/* 303 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(aph paramaph, rb paramrb, int paramInt1, int paramInt2) {
/* 307 */     add localadd1 = paramrb.a(paramInt1);
/*     */     
/* 309 */     if ((localadd1 != null) && (b(paramrb, localadd1, paramInt1, paramInt2))) {
/* 310 */       add localadd2 = localadd1.m();
/* 311 */       add localadd3 = a(paramaph, paramrb.a(paramInt1, 1), -1);
/*     */       
/* 313 */       if ((localadd3 == null) || (localadd3.b == 0)) {
/* 314 */         paramrb.e();
/* 315 */         return true;
/*     */       }
/* 317 */       paramrb.a(paramInt1, localadd2);
/*     */     }
/*     */     
/*     */ 
/* 321 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(rb paramrb, xk paramxk) {
/* 325 */     boolean bool = false;
/* 326 */     if (paramxk == null) { return false;
/*     */     }
/* 328 */     add localadd1 = paramxk.f().m();
/* 329 */     add localadd2 = a(paramrb, localadd1, -1);
/*     */     
/* 331 */     if ((localadd2 == null) || (localadd2.b == 0)) {
/* 332 */       bool = true;
/*     */       
/* 334 */       paramxk.B();
/*     */     } else {
/* 336 */       paramxk.a(localadd2);
/*     */     }
/*     */     
/* 339 */     return bool;
/*     */   }
/*     */   
/*     */   public static add a(rb paramrb, add paramadd, int paramInt) {
/* 343 */     if (((paramrb instanceof rl)) && (paramInt > -1)) {
/* 344 */       rl localrl = (rl)paramrb;
/* 345 */       int[] arrayOfInt = localrl.c(paramInt);
/*     */       
/* 347 */       for (int n = 0; (n < arrayOfInt.length) && (paramadd != null) && (paramadd.b > 0); n++) {
/* 348 */         paramadd = c(paramrb, paramadd, arrayOfInt[n], paramInt);
/*     */       }
/*     */     } else {
/* 351 */       int k = paramrb.a();
/* 352 */       for (int m = 0; (m < k) && (paramadd != null) && (paramadd.b > 0); m++) {
/* 353 */         paramadd = c(paramrb, paramadd, m, paramInt);
/*     */       }
/*     */     }
/*     */     
/* 357 */     if ((paramadd != null) && (paramadd.b == 0)) {
/* 358 */       paramadd = null;
/*     */     }
/*     */     
/* 361 */     return paramadd;
/*     */   }
/*     */   
/*     */   private static boolean a(rb paramrb, add paramadd, int paramInt1, int paramInt2) {
/* 365 */     if (!paramrb.b(paramInt1, paramadd)) return false;
/* 366 */     if (((paramrb instanceof rl)) && (!((rl)paramrb).a(paramInt1, paramadd, paramInt2))) return false;
/* 367 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(rb paramrb, add paramadd, int paramInt1, int paramInt2) {
/* 371 */     if (((paramrb instanceof rl)) && (!((rl)paramrb).b(paramInt1, paramadd, paramInt2))) return false;
/* 372 */     return true;
/*     */   }
/*     */   
/*     */   private static add c(rb paramrb, add paramadd, int paramInt1, int paramInt2) {
/* 376 */     add localadd = paramrb.a(paramInt1);
/*     */     
/* 378 */     if (a(paramrb, paramadd, paramInt1, paramInt2)) {
/* 379 */       int k = 0;
/* 380 */       if (localadd == null) {
/* 381 */         paramrb.a(paramInt1, paramadd);
/* 382 */         paramadd = null;
/* 383 */         k = 1;
/* 384 */       } else if (a(localadd, paramadd)) {
/* 385 */         int m = paramadd.e() - localadd.b;
/* 386 */         int n = Math.min(paramadd.b, m);
/*     */         
/* 388 */         paramadd.b -= n;
/* 389 */         localadd.b += n;
/* 390 */         k = n > 0 ? 1 : 0;
/*     */       }
/* 392 */       if (k != 0) {
/* 393 */         if ((paramrb instanceof api)) {
/* 394 */           ((api)paramrb).c(8);
/* 395 */           paramrb.e();
/*     */         }
/* 397 */         paramrb.e();
/*     */       }
/*     */     }
/* 400 */     return paramadd;
/*     */   }
/*     */   
/*     */   private rb z() {
/* 404 */     int k = aln.b(p());
/* 405 */     return b(w(), this.c + q.b[k], this.d + q.c[k], this.e + q.d[k]);
/*     */   }
/*     */   
/*     */   public static rb b(aph paramaph) {
/* 409 */     return b(paramaph.w(), paramaph.x(), paramaph.aD() + 1.0D, paramaph.aE());
/*     */   }
/*     */   
/*     */   public static xk a(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 413 */     List localList = paramahb.a(xk.class, azt.a(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), sj.a);
/*     */     
/* 415 */     if (localList.size() > 0) {
/* 416 */       return (xk)localList.get(0);
/*     */     }
/* 418 */     return null;
/*     */   }
/*     */   
/*     */   public static rb b(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 423 */     rb localrb = null;
/* 424 */     int k = qh.c(paramDouble1);
/* 425 */     int m = qh.c(paramDouble2);
/* 426 */     int n = qh.c(paramDouble3);
/*     */     
/* 428 */     aor localaor = paramahb.o(k, m, n);
/*     */     Object localObject;
/* 430 */     if ((localaor != null) && ((localaor instanceof rb))) {
/* 431 */       localrb = (rb)localaor;
/*     */       
/* 433 */       if ((localrb instanceof aow)) {
/* 434 */         localObject = paramahb.a(k, m, n);
/*     */         
/* 436 */         if ((localObject instanceof ajx)) {
/* 437 */           localrb = ((ajx)localObject).m(paramahb, k, m, n);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 442 */     if (localrb == null) {
/* 443 */       localObject = paramahb.a(null, azt.a(paramDouble1, paramDouble2, paramDouble3, paramDouble1 + 1.0D, paramDouble2 + 1.0D, paramDouble3 + 1.0D), sj.c);
/*     */       
/* 445 */       if ((localObject != null) && (((List)localObject).size() > 0)) {
/* 446 */         localrb = (rb)((List)localObject).get(paramahb.s.nextInt(((List)localObject).size()));
/*     */       }
/*     */     }
/*     */     
/* 450 */     return localrb;
/*     */   }
/*     */   
/*     */   private static boolean a(add paramadd1, add paramadd2) {
/* 454 */     if (paramadd1.b() != paramadd2.b()) return false;
/* 455 */     if (paramadd1.k() != paramadd2.k()) return false;
/* 456 */     if (paramadd1.b > paramadd1.e()) return false;
/* 457 */     if (!add.a(paramadd1, paramadd2)) return false;
/* 458 */     return true;
/*     */   }
/*     */   
/*     */   public double x()
/*     */   {
/* 463 */     return this.c;
/*     */   }
/*     */   
/*     */   public double aD()
/*     */   {
/* 468 */     return this.d;
/*     */   }
/*     */   
/*     */   public double aE()
/*     */   {
/* 473 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 477 */     this.j = paramInt;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 481 */     return this.j > 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\api.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */