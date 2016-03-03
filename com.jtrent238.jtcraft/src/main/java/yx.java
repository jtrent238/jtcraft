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
/*     */ public class yx
/*     */   implements rb
/*     */ {
/*  17 */   public add[] a = new add[36];
/*  18 */   public add[] b = new add[4];
/*     */   public int c;
/*     */   private add f;
/*     */   public yz d;
/*     */   private add g;
/*     */   public boolean e;
/*     */   
/*     */   public yx(yz paramyz)
/*     */   {
/*  27 */     this.d = paramyz;
/*     */   }
/*     */   
/*     */   public add h()
/*     */   {
/*  32 */     if ((this.c < 9) && (this.c >= 0)) {
/*  33 */       return this.a[this.c];
/*     */     }
/*  35 */     return null;
/*     */   }
/*     */   
/*     */   public static int i() {
/*  39 */     return 9;
/*     */   }
/*     */   
/*     */   private int c(adb paramadb) {
/*  43 */     for (int i = 0; i < this.a.length; i++) {
/*  44 */       if ((this.a[i] != null) && (this.a[i].b() == paramadb)) return i;
/*     */     }
/*  46 */     return -1;
/*     */   }
/*     */   
/*     */   private int c(adb paramadb, int paramInt) {
/*  50 */     for (int i = 0; i < this.a.length; i++) {
/*  51 */       if ((this.a[i] != null) && (this.a[i].b() == paramadb) && (this.a[i].k() == paramInt)) return i;
/*     */     }
/*  53 */     return -1;
/*     */   }
/*     */   
/*     */   private int d(add paramadd) {
/*  57 */     for (int i = 0; i < this.a.length; i++) {
/*  58 */       if ((this.a[i] != null) && (this.a[i].b() == paramadd.b()) && (this.a[i].f()) && (this.a[i].b < this.a[i].e()) && (this.a[i].b < d()) && ((!this.a[i].h()) || (this.a[i].k() == paramadd.k())) && (add.a(this.a[i], paramadd)))
/*     */       {
/*  60 */         return i;
/*     */       }
/*     */     }
/*  63 */     return -1;
/*     */   }
/*     */   
/*     */   public int j() {
/*  67 */     for (int i = 0; i < this.a.length; i++) {
/*  68 */       if (this.a[i] == null) return i;
/*     */     }
/*  70 */     return -1;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
/*  74 */     int i = -1;
/*  75 */     this.f = h();
/*  76 */     if (paramBoolean1) {
/*  77 */       i = c(paramadb, paramInt);
/*     */     } else {
/*  79 */       i = c(paramadb);
/*     */     }
/*  81 */     if ((i >= 0) && (i < 9)) {
/*  82 */       this.c = i;
/*  83 */       return;
/*     */     }
/*     */     
/*  86 */     if ((paramBoolean2) && 
/*  87 */       (paramadb != null)) {
/*  88 */       int j = j();
/*  89 */       if ((j >= 0) && (j < 9)) {
/*  90 */         this.c = j;
/*     */       }
/*     */       
/*  93 */       b(paramadb, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(int paramInt)
/*     */   {
/*  99 */     if (paramInt > 0) paramInt = 1;
/* 100 */     if (paramInt < 0) { paramInt = -1;
/*     */     }
/* 102 */     this.c -= paramInt;
/*     */     
/* 104 */     while (this.c < 0)
/* 105 */       this.c += 9;
/* 106 */     while (this.c >= 9)
/* 107 */       this.c -= 9;
/*     */   }
/*     */   
/*     */   public int a(adb paramadb, int paramInt) {
/* 111 */     int i = 0;
/* 112 */     add localadd; for (int j = 0; j < this.a.length; j++) {
/* 113 */       localadd = this.a[j];
/* 114 */       if ((localadd != null) && 
/* 115 */         ((paramadb == null) || (localadd.b() == paramadb)) && (
/* 116 */         (paramInt <= -1) || (localadd.k() == paramInt)))
/*     */       {
/* 118 */         i += localadd.b;
/* 119 */         this.a[j] = null;
/*     */       } }
/* 121 */     for (j = 0; j < this.b.length; j++) {
/* 122 */       localadd = this.b[j];
/* 123 */       if ((localadd != null) && 
/* 124 */         ((paramadb == null) || (localadd.b() == paramadb)) && (
/* 125 */         (paramInt <= -1) || (localadd.k() == paramInt)))
/*     */       {
/* 127 */         i += localadd.b;
/* 128 */         this.b[j] = null;
/*     */       }
/*     */     }
/* 131 */     if (this.g != null) {
/* 132 */       if ((paramadb != null) && (this.g.b() != paramadb)) return i;
/* 133 */       if ((paramInt > -1) && (this.g.k() != paramInt)) { return i;
/*     */       }
/* 135 */       i += this.g.b;
/* 136 */       b(null);
/*     */     }
/*     */     
/* 139 */     return i;
/*     */   }
/*     */   
/*     */   public void b(adb paramadb, int paramInt) {
/* 143 */     if (paramadb != null)
/*     */     {
/* 145 */       if ((this.f != null) && (this.f.x()) && (c(this.f.b(), this.f.j()) == this.c)) {
/* 146 */         return;
/*     */       }
/*     */       
/* 149 */       int i = c(paramadb, paramInt);
/* 150 */       if (i >= 0) {
/* 151 */         int j = this.a[i].b;
/* 152 */         this.a[i] = this.a[this.c];
/* 153 */         this.a[this.c] = new add(paramadb, j, paramInt);
/*     */       } else {
/* 155 */         this.a[this.c] = new add(paramadb, 1, paramInt);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int e(add paramadd) {
/* 161 */     adb localadb = paramadd.b();
/* 162 */     int i = paramadd.b;
/*     */     
/* 164 */     if (paramadd.e() == 1) {
/* 165 */       j = j();
/* 166 */       if (j < 0) return i;
/* 167 */       if (this.a[j] == null) {
/* 168 */         this.a[j] = add.b(paramadd);
/*     */       }
/* 170 */       return 0;
/*     */     }
/*     */     
/* 173 */     int j = d(paramadd);
/* 174 */     if (j < 0) j = j();
/* 175 */     if (j < 0) return i;
/* 176 */     if (this.a[j] == null) {
/* 177 */       this.a[j] = new add(localadb, 0, paramadd.k());
/* 178 */       if (paramadd.p()) {
/* 179 */         this.a[j].d((dh)paramadd.q().b());
/*     */       }
/*     */     }
/*     */     
/* 183 */     int k = i;
/* 184 */     if (k > this.a[j].e() - this.a[j].b) {
/* 185 */       k = this.a[j].e() - this.a[j].b;
/*     */     }
/* 187 */     if (k > d() - this.a[j].b) {
/* 188 */       k = d() - this.a[j].b;
/*     */     }
/*     */     
/* 191 */     if (k == 0) { return i;
/*     */     }
/* 193 */     i -= k;
/* 194 */     this.a[j].b += k;
/* 195 */     this.a[j].c = 5;
/*     */     
/* 197 */     return i;
/*     */   }
/*     */   
/*     */   public void k() {
/* 201 */     for (int i = 0; i < this.a.length; i++) {
/* 202 */       if (this.a[i] != null) {
/* 203 */         this.a[i].a(this.d.o, this.d, i, this.c == i);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(adb paramadb) {
/* 209 */     int i = c(paramadb);
/* 210 */     if (i < 0) return false;
/* 211 */     if (--this.a[i].b <= 0) { this.a[i] = null;
/*     */     }
/* 213 */     return true;
/*     */   }
/*     */   
/*     */   public boolean b(adb paramadb) {
/* 217 */     int i = c(paramadb);
/* 218 */     if (i < 0) { return false;
/*     */     }
/* 220 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(add paramadd)
/*     */   {
/* 230 */     if ((paramadd == null) || (paramadd.b == 0) || (paramadd.b() == null)) return false;
/*     */     try
/*     */     {
/* 233 */       if (!paramadd.i())
/*     */       {
/*     */         do {
/* 236 */           i = paramadd.b;
/* 237 */           paramadd.b = e(paramadd);
/* 238 */         } while ((paramadd.b > 0) && (paramadd.b < i));
/* 239 */         if ((paramadd.b == i) && (this.d.bE.d))
/*     */         {
/* 241 */           paramadd.b = 0;
/* 242 */           return true;
/*     */         }
/* 244 */         return paramadd.b < i;
/*     */       }
/*     */       
/* 247 */       int i = j();
/* 248 */       if (i >= 0) {
/* 249 */         this.a[i] = add.b(paramadd);
/* 250 */         this.a[i].c = 5;
/* 251 */         paramadd.b = 0;
/* 252 */         return true; }
/* 253 */       if (this.d.bE.d)
/*     */       {
/* 255 */         paramadd.b = 0;
/* 256 */         return true;
/*     */       }
/* 258 */       return false;
/*     */     } catch (Throwable localThrowable) {
/* 260 */       b localb = b.a(localThrowable, "Adding item to inventory");
/* 261 */       k localk = localb.a("Item being added");
/*     */       
/* 263 */       localk.a("Item ID", Integer.valueOf(adb.b(paramadd.b())));
/* 264 */       localk.a("Item data", Integer.valueOf(paramadd.k()));
/* 265 */       localk.a("Item name", new yy(this, paramadd));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 272 */       throw new s(localb);
/*     */     }
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/* 278 */     add[] arrayOfadd = this.a;
/* 279 */     if (paramInt1 >= this.a.length) {
/* 280 */       arrayOfadd = this.b;
/* 281 */       paramInt1 -= this.a.length;
/*     */     }
/*     */     
/* 284 */     if (arrayOfadd[paramInt1] != null) {
/* 285 */       if (arrayOfadd[paramInt1].b <= paramInt2) {
/* 286 */         localadd = arrayOfadd[paramInt1];
/* 287 */         arrayOfadd[paramInt1] = null;
/* 288 */         return localadd;
/*     */       }
/* 290 */       add localadd = arrayOfadd[paramInt1].a(paramInt2);
/* 291 */       if (arrayOfadd[paramInt1].b == 0) arrayOfadd[paramInt1] = null;
/* 292 */       return localadd;
/*     */     }
/*     */     
/* 295 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/* 300 */     add[] arrayOfadd = this.a;
/* 301 */     if (paramInt >= this.a.length) {
/* 302 */       arrayOfadd = this.b;
/* 303 */       paramInt -= this.a.length;
/*     */     }
/*     */     
/* 306 */     if (arrayOfadd[paramInt] != null) {
/* 307 */       add localadd = arrayOfadd[paramInt];
/* 308 */       arrayOfadd[paramInt] = null;
/* 309 */       return localadd;
/*     */     }
/* 311 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/* 316 */     add[] arrayOfadd = this.a;
/* 317 */     if (paramInt >= arrayOfadd.length) {
/* 318 */       paramInt -= arrayOfadd.length;
/* 319 */       arrayOfadd = this.b;
/*     */     }
/*     */     
/* 322 */     arrayOfadd[paramInt] = paramadd;
/*     */   }
/*     */   
/*     */   public float a(aji paramaji) {
/* 326 */     float f1 = 1.0F;
/* 327 */     if (this.a[this.c] != null) f1 *= this.a[this.c].a(paramaji);
/* 328 */     return f1;
/*     */   }
/*     */   
/*     */   public dq a(dq paramdq) { dh localdh;
/* 332 */     for (int i = 0; i < this.a.length; i++) {
/* 333 */       if (this.a[i] != null) {
/* 334 */         localdh = new dh();
/* 335 */         localdh.a("Slot", (byte)i);
/* 336 */         this.a[i].b(localdh);
/* 337 */         paramdq.a(localdh);
/*     */       }
/*     */     }
/* 340 */     for (i = 0; i < this.b.length; i++) {
/* 341 */       if (this.b[i] != null) {
/* 342 */         localdh = new dh();
/* 343 */         localdh.a("Slot", (byte)(i + 100));
/* 344 */         this.b[i].b(localdh);
/* 345 */         paramdq.a(localdh);
/*     */       }
/*     */     }
/* 348 */     return paramdq;
/*     */   }
/*     */   
/*     */   public void b(dq paramdq) {
/* 352 */     this.a = new add[36];
/* 353 */     this.b = new add[4];
/* 354 */     for (int i = 0; i < paramdq.c(); i++) {
/* 355 */       dh localdh = paramdq.b(i);
/* 356 */       int j = localdh.d("Slot") & 0xFF;
/* 357 */       add localadd = add.a(localdh);
/* 358 */       if (localadd != null) {
/* 359 */         if ((j >= 0) && (j < this.a.length)) this.a[j] = localadd;
/* 360 */         if ((j >= 100) && (j < this.b.length + 100)) this.b[(j - 100)] = localadd;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/* 367 */     return this.a.length + 4;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/* 372 */     add[] arrayOfadd = this.a;
/* 373 */     if (paramInt >= arrayOfadd.length) {
/* 374 */       paramInt -= arrayOfadd.length;
/* 375 */       arrayOfadd = this.b;
/*     */     }
/*     */     
/* 378 */     return arrayOfadd[paramInt];
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 383 */     return "container.inventory";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/* 388 */     return false;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 393 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean b(aji paramaji) {
/* 397 */     if (paramaji.o().l()) { return true;
/*     */     }
/* 399 */     add localadd = a(this.c);
/* 400 */     if (localadd != null) return localadd.b(paramaji);
/* 401 */     return false;
/*     */   }
/*     */   
/*     */   public add d(int paramInt) {
/* 405 */     return this.b[paramInt];
/*     */   }
/*     */   
/*     */   public int l() {
/* 409 */     int i = 0;
/* 410 */     for (int j = 0; j < this.b.length; j++) {
/* 411 */       if ((this.b[j] != null) && ((this.b[j].b() instanceof abb))) {
/* 412 */         int k = ((abb)this.b[j].b()).c;
/* 413 */         i += k;
/*     */       }
/*     */     }
/* 416 */     return i;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 420 */     paramFloat /= 4.0F;
/* 421 */     if (paramFloat < 1.0F) {
/* 422 */       paramFloat = 1.0F;
/*     */     }
/* 424 */     for (int i = 0; i < this.b.length; i++) {
/* 425 */       if ((this.b[i] != null) && ((this.b[i].b() instanceof abb))) {
/* 426 */         this.b[i].a((int)paramFloat, this.d);
/* 427 */         if (this.b[i].b == 0) {
/* 428 */           this.b[i] = null;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void m() {
/* 435 */     for (int i = 0; i < this.a.length; i++) {
/* 436 */       if (this.a[i] != null) {
/* 437 */         this.d.a(this.a[i], true, false);
/* 438 */         this.a[i] = null;
/*     */       }
/*     */     }
/* 441 */     for (i = 0; i < this.b.length; i++) {
/* 442 */       if (this.b[i] != null) {
/* 443 */         this.d.a(this.b[i], true, false);
/* 444 */         this.b[i] = null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 451 */     this.e = true;
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
/*     */   public void b(add paramadd)
/*     */   {
/* 483 */     this.g = paramadd;
/*     */   }
/*     */   
/*     */   public add o() {
/* 487 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 492 */     if (this.d.K) return false;
/* 493 */     if (paramyz.f(this.d) > 64.0D) return false;
/* 494 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd) {
/* 498 */     for (int i = 0; i < this.b.length; i++) {
/* 499 */       if ((this.b[i] != null) && (this.b[i].a(paramadd))) return true;
/*     */     }
/* 501 */     for (i = 0; i < this.a.length; i++) {
/* 502 */       if ((this.a[i] != null) && (this.a[i].a(paramadd))) return true;
/*     */     }
/* 504 */     return false;
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
/* 517 */     return true;
/*     */   }
/*     */   
/*     */   public void b(yx paramyx) {
/* 521 */     for (int i = 0; i < this.a.length; i++) {
/* 522 */       this.a[i] = add.b(paramyx.a[i]);
/*     */     }
/* 524 */     for (i = 0; i < this.b.length; i++) {
/* 525 */       this.b[i] = add.b(paramyx.b[i]);
/*     */     }
/* 527 */     this.c = paramyx.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */