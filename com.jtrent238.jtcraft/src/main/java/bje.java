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
/*     */ public class bje
/*     */ {
/*     */   private final bao a;
/*     */   private final bjb b;
/*  23 */   private int c = -1;
/*  24 */   private int d = -1;
/*  25 */   private int e = -1;
/*     */   private add f;
/*     */   private float g;
/*     */   private float h;
/*     */   private int i;
/*     */   private boolean j;
/*  31 */   private ahk k = ahk.b;
/*     */   private int l;
/*     */   
/*  34 */   public bje(bao parambao, bjb parambjb) { this.a = parambao;
/*  35 */     this.b = parambjb;
/*     */   }
/*     */   
/*     */   public static void a(bao parambao, bje parambje, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  39 */     if (!parambao.f.a(parambao.h, paramInt1, paramInt2, paramInt3, paramInt4)) {
/*  40 */       parambje.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(yz paramyz) {
/*  45 */     this.k.a(paramyz.bE);
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  49 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk) {
/*  53 */     this.k = paramahk;
/*  54 */     this.k.a(this.a.h.bE);
/*     */   }
/*     */   
/*     */   public void b(yz paramyz) {
/*  58 */     paramyz.y = -180.0F;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  62 */     return this.k.e();
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  66 */     if ((this.k.c()) && 
/*  67 */       (!this.a.h.d(paramInt1, paramInt2, paramInt3))) {
/*  68 */       return false;
/*     */     }
/*     */     
/*     */ 
/*  72 */     if ((this.k.d()) && 
/*  73 */       (this.a.h.be() != null) && ((this.a.h.be().b() instanceof aeh))) {
/*  74 */       return false;
/*     */     }
/*     */     
/*     */ 
/*  78 */     bjf localbjf = this.a.f;
/*  79 */     aji localaji = localbjf.a(paramInt1, paramInt2, paramInt3);
/*     */     
/*     */ 
/*  82 */     if (localaji.o() == awt.a) { return false;
/*     */     }
/*  84 */     localbjf.c(2001, paramInt1, paramInt2, paramInt3, aji.b(localaji) + (localbjf.e(paramInt1, paramInt2, paramInt3) << 12));
/*     */     
/*  86 */     int m = localbjf.e(paramInt1, paramInt2, paramInt3);
/*  87 */     boolean bool = localbjf.f(paramInt1, paramInt2, paramInt3);
/*  88 */     if (bool) {
/*  89 */       localaji.b(localbjf, paramInt1, paramInt2, paramInt3, m);
/*     */     }
/*  91 */     this.d = -1;
/*     */     
/*  93 */     if (!this.k.d()) {
/*  94 */       add localadd = this.a.h.bF();
/*  95 */       if (localadd != null) {
/*  96 */         localadd.a(localbjf, localaji, paramInt1, paramInt2, paramInt3, this.a.h);
/*  97 */         if (localadd.b == 0) {
/*  98 */           this.a.h.bG();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 103 */     return bool;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 107 */     if ((this.k.c()) && 
/* 108 */       (!this.a.h.d(paramInt1, paramInt2, paramInt3))) {
/* 109 */       return;
/*     */     }
/*     */     
/*     */ 
/* 113 */     if (this.k.d()) {
/* 114 */       this.b.a(new ji(0, paramInt1, paramInt2, paramInt3, paramInt4));
/* 115 */       a(this.a, this, paramInt1, paramInt2, paramInt3, paramInt4);
/* 116 */       this.i = 5;
/* 117 */     } else if ((!this.j) || (!a(paramInt1, paramInt2, paramInt3))) {
/* 118 */       if (this.j) {
/* 119 */         this.b.a(new ji(1, this.c, this.d, this.e, paramInt4));
/*     */       }
/* 121 */       this.b.a(new ji(0, paramInt1, paramInt2, paramInt3, paramInt4));
/*     */       
/* 123 */       aji localaji = this.a.f.a(paramInt1, paramInt2, paramInt3);
/* 124 */       int m = localaji.o() != awt.a ? 1 : 0;
/* 125 */       if ((m != 0) && (this.g == 0.0F)) {
/* 126 */         localaji.a(this.a.f, paramInt1, paramInt2, paramInt3, this.a.h);
/*     */       }
/* 128 */       if ((m != 0) && (localaji.a(this.a.h, this.a.h.o, paramInt1, paramInt2, paramInt3) >= 1.0F)) {
/* 129 */         a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */       } else {
/* 131 */         this.j = true;
/* 132 */         this.c = paramInt1;
/* 133 */         this.d = paramInt2;
/* 134 */         this.e = paramInt3;
/* 135 */         this.f = this.a.h.be();
/* 136 */         this.g = 0.0F;
/* 137 */         this.h = 0.0F;
/* 138 */         this.a.f.d(this.a.h.y(), this.c, this.d, this.e, (int)(this.g * 10.0F) - 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 144 */     if (this.j) {
/* 145 */       this.b.a(new ji(1, this.c, this.d, this.e, -1));
/*     */     }
/*     */     
/* 148 */     this.j = false;
/* 149 */     this.g = 0.0F;
/* 150 */     this.a.f.d(this.a.h.y(), this.c, this.d, this.e, -1);
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 154 */     k();
/*     */     
/* 156 */     if (this.i > 0) {
/* 157 */       this.i -= 1;
/* 158 */       return;
/*     */     }
/*     */     
/* 161 */     if (this.k.d()) {
/* 162 */       this.i = 5;
/* 163 */       this.b.a(new ji(0, paramInt1, paramInt2, paramInt3, paramInt4));
/* 164 */       a(this.a, this, paramInt1, paramInt2, paramInt3, paramInt4);
/* 165 */       return;
/*     */     }
/*     */     
/* 168 */     if (a(paramInt1, paramInt2, paramInt3)) {
/* 169 */       aji localaji = this.a.f.a(paramInt1, paramInt2, paramInt3);
/*     */       
/* 171 */       if (localaji.o() == awt.a) {
/* 172 */         this.j = false;
/* 173 */         return;
/*     */       }
/*     */       
/* 176 */       this.g += localaji.a(this.a.h, this.a.h.o, paramInt1, paramInt2, paramInt3);
/*     */       
/* 178 */       if (this.h % 4.0F == 0.0F) {
/* 179 */         this.a.X().a(new bso(new bqx(localaji.H.e()), (localaji.H.c() + 1.0F) / 8.0F, localaji.H.d() * 0.5F, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F));
/*     */       }
/*     */       
/* 182 */       this.h += 1.0F;
/*     */       
/* 184 */       if (this.g >= 1.0F) {
/* 185 */         this.j = false;
/* 186 */         this.b.a(new ji(2, paramInt1, paramInt2, paramInt3, paramInt4));
/* 187 */         a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 188 */         this.g = 0.0F;
/* 189 */         this.h = 0.0F;
/* 190 */         this.i = 5;
/*     */       }
/*     */       
/* 193 */       this.a.f.d(this.a.h.y(), this.c, this.d, this.e, (int)(this.g * 10.0F) - 1);
/*     */     } else {
/* 195 */       b(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public float d() {
/* 200 */     if (this.k.d()) {
/* 201 */       return 5.0F;
/*     */     }
/* 203 */     return 4.5F;
/*     */   }
/*     */   
/*     */   public void e() {
/* 207 */     k();
/*     */     
/*     */ 
/*     */ 
/* 211 */     if (this.b.b().d()) {
/* 212 */       this.b.b().a();
/* 213 */     } else if (this.b.b().f() != null) {
/* 214 */       this.b.b().e().a(this.b.b().f());
/*     */     } else {
/* 216 */       this.b.b().e().a(new fq("Disconnected from server"));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 223 */     add localadd = this.a.h.be();
/* 224 */     int m = (this.f == null) && (localadd == null) ? 1 : 0;
/* 225 */     if ((this.f != null) && (localadd != null)) {
/* 226 */       m = (localadd.b() == this.f.b()) && (add.a(localadd, this.f)) && ((localadd.g()) || (localadd.k() == this.f.k())) ? 1 : 0;
/*     */     }
/* 228 */     return (paramInt1 == this.c) && (paramInt2 == this.d) && (paramInt3 == this.e) && (m != 0);
/*     */   }
/*     */   
/*     */   private void k() {
/* 232 */     int m = this.a.h.bm.c;
/* 233 */     if (m != this.l) {
/* 234 */       this.l = m;
/* 235 */       this.b.a(new jl(this.l));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, azw paramazw) {
/* 240 */     k();
/* 241 */     float f1 = (float)paramazw.a - paramInt1;
/* 242 */     float f2 = (float)paramazw.b - paramInt2;
/* 243 */     float f3 = (float)paramazw.c - paramInt3;
/* 244 */     int m = 0;
/*     */     
/* 246 */     if (((!paramyz.an()) || (paramyz.be() == null)) && 
/* 247 */       (paramahb.a(paramInt1, paramInt2, paramInt3).a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramInt4, f1, f2, f3))) { m = 1;
/*     */     }
/*     */     
/* 250 */     if ((m == 0) && (paramadd != null) && ((paramadd.b() instanceof abh))) {
/* 251 */       abh localabh = (abh)paramadd.b();
/* 252 */       if (!localabh.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz, paramadd)) { return false;
/*     */       }
/*     */     }
/* 255 */     this.b.a(new jo(paramInt1, paramInt2, paramInt3, paramInt4, paramyz.bm.h(), f1, f2, f3));
/* 256 */     if (m != 0) return true;
/* 257 */     if (paramadd == null) { return false;
/*     */     }
/* 259 */     if (this.k.d()) {
/* 260 */       int n = paramadd.k();
/* 261 */       int i1 = paramadd.b;
/* 262 */       boolean bool = paramadd.a(paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, f1, f2, f3);
/* 263 */       paramadd.b(n);
/* 264 */       paramadd.b = i1;
/* 265 */       return bool;
/*     */     }
/* 267 */     return paramadd.a(paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, f1, f2, f3);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd)
/*     */   {
/* 272 */     k();
/* 273 */     this.b.a(new jo(-1, -1, -1, 255, paramyz.bm.h(), 0.0F, 0.0F, 0.0F));
/* 274 */     int m = paramadd.b;
/* 275 */     add localadd = paramadd.a(paramahb, paramyz);
/*     */     
/* 277 */     if ((localadd != paramadd) || ((localadd != null) && (localadd.b != m))) {
/* 278 */       paramyz.bm.a[paramyz.bm.c] = localadd;
/*     */       
/* 280 */       if (localadd.b == 0) {
/* 281 */         paramyz.bm.a[paramyz.bm.c] = null;
/*     */       }
/* 283 */       return true;
/*     */     }
/*     */     
/* 286 */     return false;
/*     */   }
/*     */   
/*     */   public bjk a(ahb paramahb, pq parampq) {
/* 290 */     return new bjk(this.a, paramahb, this.a.M(), this.b, parampq);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, sa paramsa) {
/* 294 */     k();
/* 295 */     this.b.a(new ja(paramsa, jb.b));
/* 296 */     paramyz.r(paramsa);
/*     */   }
/*     */   
/*     */   public boolean b(yz paramyz, sa paramsa) {
/* 300 */     k();
/* 301 */     this.b.a(new ja(paramsa, jb.a));
/* 302 */     return paramyz.q(paramsa);
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz) {
/* 306 */     short s = paramyz.bo.a(paramyz.bm);
/*     */     
/* 308 */     add localadd = paramyz.bo.a(paramInt2, paramInt3, paramInt4, paramyz);
/* 309 */     this.b.a(new ix(paramInt1, paramInt2, paramInt3, paramInt4, localadd, s));
/*     */     
/* 311 */     return localadd;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/* 315 */     this.b.a(new iw(paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public void a(add paramadd, int paramInt) {
/* 319 */     if (this.k.d()) {
/* 320 */       this.b.a(new jm(paramInt, paramadd));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(add paramadd) {
/* 325 */     if ((this.k.d()) && (paramadd != null)) {
/* 326 */       this.b.a(new jm(-1, paramadd));
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(yz paramyz) {
/* 331 */     k();
/* 332 */     this.b.a(new ji(5, 0, 0, 0, 255));
/* 333 */     paramyz.bA();
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 337 */     return this.k.e();
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 341 */     return !this.k.d();
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 345 */     return this.k.d();
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 349 */     return this.k.d();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean j()
/*     */   {
/* 359 */     return (this.a.h.am()) && ((this.a.h.m instanceof wi));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */