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
/*     */ public class vv
/*     */ {
/*     */   private sw a;
/*     */   private ahb b;
/*     */   private ayf c;
/*     */   private double d;
/*     */   private ti e;
/*     */   private boolean f;
/*     */   private int g;
/*     */   private int h;
/*  26 */   private azw i = azw.a(0.0D, 0.0D, 0.0D);
/*     */   
/*  28 */   private boolean j = true;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private boolean m;
/*     */   
/*     */   public vv(sw paramsw, ahb paramahb) {
/*  34 */     this.a = paramsw;
/*  35 */     this.b = paramahb;
/*  36 */     this.e = paramsw.a(yj.b);
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  40 */     this.l = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  44 */     return this.l;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/*  48 */     this.k = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void c(boolean paramBoolean)
/*     */   {
/*  56 */     this.j = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  60 */     return this.k;
/*     */   }
/*     */   
/*     */   public void d(boolean paramBoolean) {
/*  64 */     this.f = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble) {
/*  68 */     this.d = paramDouble;
/*     */   }
/*     */   
/*     */   public void e(boolean paramBoolean) {
/*  72 */     this.m = paramBoolean;
/*     */   }
/*     */   
/*     */   public float d() {
/*  76 */     return (float)this.e.e();
/*     */   }
/*     */   
/*     */   public ayf a(double paramDouble1, double paramDouble2, double paramDouble3) {
/*  80 */     if (!l()) return null;
/*  81 */     return this.b.a(this.a, qh.c(paramDouble1), (int)paramDouble2, qh.c(paramDouble3), d(), this.j, this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/*  85 */     ayf localayf = a(qh.c(paramDouble1), (int)paramDouble2, qh.c(paramDouble3));
/*  86 */     return a(localayf, paramDouble4);
/*     */   }
/*     */   
/*     */   public ayf a(sa paramsa) {
/*  90 */     if (!l()) return null;
/*  91 */     return this.b.a(this.a, paramsa, d(), this.j, this.k, this.l, this.m);
/*     */   }
/*     */   
/*     */   public boolean a(sa paramsa, double paramDouble) {
/*  95 */     ayf localayf = a(paramsa);
/*  96 */     if (localayf != null) return a(localayf, paramDouble);
/*  97 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ayf paramayf, double paramDouble)
/*     */   {
/* 102 */     if (paramayf == null) {
/* 103 */       this.c = null;
/* 104 */       return false;
/*     */     }
/* 106 */     if (!paramayf.a(this.c)) this.c = paramayf;
/* 107 */     if (this.f) n();
/* 108 */     if (this.c.d() == 0) { return false;
/*     */     }
/* 110 */     this.d = paramDouble;
/* 111 */     azw localazw = j();
/* 112 */     this.h = this.g;
/* 113 */     this.i.a = localazw.a;
/* 114 */     this.i.b = localazw.b;
/* 115 */     this.i.c = localazw.c;
/* 116 */     return true;
/*     */   }
/*     */   
/*     */   public ayf e() {
/* 120 */     return this.c;
/*     */   }
/*     */   
/*     */   public void f() {
/* 124 */     this.g += 1;
/* 125 */     if (g()) { return;
/*     */     }
/* 127 */     if (l()) { i();
/*     */     }
/* 129 */     if (g()) return;
/* 130 */     azw localazw = this.c.a(this.a);
/* 131 */     if (localazw == null) { return;
/*     */     }
/* 133 */     this.a.k().a(localazw.a, localazw.b, localazw.c, this.d);
/*     */   }
/*     */   
/*     */   private void i() {
/* 137 */     azw localazw = j();
/*     */     
/*     */ 
/* 140 */     int n = this.c.d();
/* 141 */     for (int i1 = this.c.e(); i1 < this.c.d(); i1++) {
/* 142 */       if (this.c.a(i1).b != (int)localazw.b) {
/* 143 */         n = i1;
/* 144 */         break;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 149 */     float f1 = this.a.M * this.a.M;
/* 150 */     for (int i2 = this.c.e(); i2 < n; i2++) {
/* 151 */       if (localazw.e(this.c.a(this.a, i2)) < f1) {
/* 152 */         this.c.c(i2 + 1);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 157 */     i2 = qh.f(this.a.M);
/* 158 */     int i3 = (int)this.a.N + 1;
/* 159 */     int i4 = i2;
/* 160 */     for (int i5 = n - 1; i5 >= this.c.e(); i5--) {
/* 161 */       if (a(localazw, this.c.a(this.a, i5), i2, i3, i4)) {
/* 162 */         this.c.c(i5);
/* 163 */         break;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 168 */     if (this.g - this.h > 100) {
/* 169 */       if (localazw.e(this.i) < 2.25D) h();
/* 170 */       this.h = this.g;
/* 171 */       this.i.a = localazw.a;
/* 172 */       this.i.b = localazw.b;
/* 173 */       this.i.c = localazw.c;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 178 */     return (this.c == null) || (this.c.b());
/*     */   }
/*     */   
/*     */   public void h() {
/* 182 */     this.c = null;
/*     */   }
/*     */   
/*     */   private azw j() {
/* 186 */     return azw.a(this.a.s, k(), this.a.u);
/*     */   }
/*     */   
/*     */   private int k() {
/* 190 */     if ((!this.a.M()) || (!this.m)) { return (int)(this.a.C.b + 0.5D);
/*     */     }
/* 192 */     int n = (int)this.a.C.b;
/* 193 */     aji localaji = this.b.a(qh.c(this.a.s), n, qh.c(this.a.u));
/* 194 */     int i1 = 0;
/* 195 */     while ((localaji == ajn.i) || (localaji == ajn.j)) {
/* 196 */       n++;
/* 197 */       localaji = this.b.a(qh.c(this.a.s), n, qh.c(this.a.u));
/* 198 */       i1++; if (i1 > 16) return (int)this.a.C.b;
/*     */     }
/* 200 */     return n;
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 204 */     return (this.a.D) || ((this.m) && (m())) || ((this.a.am()) && ((this.a instanceof yq)) && ((this.a.m instanceof wg)));
/*     */   }
/*     */   
/*     */   private boolean m() {
/* 208 */     return (this.a.M()) || (this.a.P());
/*     */   }
/*     */   
/*     */   private void n() {
/* 212 */     if (this.b.i(qh.c(this.a.s), (int)(this.a.C.b + 0.5D), qh.c(this.a.u))) { return;
/*     */     }
/* 214 */     for (int n = 0; n < this.c.d(); n++) {
/* 215 */       aye localaye = this.c.a(n);
/* 216 */       if (this.b.i(localaye.a, localaye.b, localaye.c)) {
/* 217 */         this.c.b(n - 1);
/* 218 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(azw paramazw1, azw paramazw2, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 225 */     int n = qh.c(paramazw1.a);
/* 226 */     int i1 = qh.c(paramazw1.c);
/*     */     
/* 228 */     double d1 = paramazw2.a - paramazw1.a;
/* 229 */     double d2 = paramazw2.c - paramazw1.c;
/* 230 */     double d3 = d1 * d1 + d2 * d2;
/* 231 */     if (d3 < 1.0E-8D) { return false;
/*     */     }
/* 233 */     double d4 = 1.0D / Math.sqrt(d3);
/* 234 */     d1 *= d4;
/* 235 */     d2 *= d4;
/*     */     
/* 237 */     paramInt1 += 2;
/* 238 */     paramInt3 += 2;
/* 239 */     if (!a(n, (int)paramazw1.b, i1, paramInt1, paramInt2, paramInt3, paramazw1, d1, d2)) return false;
/* 240 */     paramInt1 -= 2;
/* 241 */     paramInt3 -= 2;
/*     */     
/* 243 */     double d5 = 1.0D / Math.abs(d1);
/* 244 */     double d6 = 1.0D / Math.abs(d2);
/*     */     
/* 246 */     double d7 = n * 1 - paramazw1.a;
/* 247 */     double d8 = i1 * 1 - paramazw1.c;
/* 248 */     if (d1 >= 0.0D) d7 += 1.0D;
/* 249 */     if (d2 >= 0.0D) d8 += 1.0D;
/* 250 */     d7 /= d1;
/* 251 */     d8 /= d2;
/*     */     
/* 253 */     int i2 = d1 < 0.0D ? -1 : 1;
/* 254 */     int i3 = d2 < 0.0D ? -1 : 1;
/* 255 */     int i4 = qh.c(paramazw2.a);
/* 256 */     int i5 = qh.c(paramazw2.c);
/* 257 */     int i6 = i4 - n;
/* 258 */     int i7 = i5 - i1;
/* 259 */     while ((i6 * i2 > 0) || (i7 * i3 > 0)) {
/* 260 */       if (d7 < d8) {
/* 261 */         d7 += d5;
/* 262 */         n += i2;
/* 263 */         i6 = i4 - n;
/*     */       } else {
/* 265 */         d8 += d6;
/* 266 */         i1 += i3;
/* 267 */         i7 = i5 - i1;
/*     */       }
/*     */       
/* 270 */       if (!a(n, (int)paramazw1.b, i1, paramInt1, paramInt2, paramInt3, paramazw1, d1, d2)) return false;
/*     */     }
/* 272 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, azw paramazw, double paramDouble1, double paramDouble2)
/*     */   {
/* 277 */     int n = paramInt1 - paramInt4 / 2;
/* 278 */     int i1 = paramInt3 - paramInt6 / 2;
/*     */     
/* 280 */     if (!b(n, paramInt2, i1, paramInt4, paramInt5, paramInt6, paramazw, paramDouble1, paramDouble2)) { return false;
/*     */     }
/*     */     
/* 283 */     for (int i2 = n; i2 < n + paramInt4; i2++) {
/* 284 */       for (int i3 = i1; i3 < i1 + paramInt6; i3++) {
/* 285 */         double d1 = i2 + 0.5D - paramazw.a;
/* 286 */         double d2 = i3 + 0.5D - paramazw.c;
/* 287 */         if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D) {
/* 288 */           aji localaji = this.b.a(i2, paramInt2 - 1, i3);
/* 289 */           awt localawt = localaji.o();
/* 290 */           if (localawt == awt.a) return false;
/* 291 */           if ((localawt == awt.h) && (!this.a.M())) return false;
/* 292 */           if (localawt == awt.i) return false;
/*     */         }
/*     */       }
/*     */     }
/* 296 */     return true;
/*     */   }
/*     */   
/*     */   private boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, azw paramazw, double paramDouble1, double paramDouble2)
/*     */   {
/* 301 */     for (int n = paramInt1; n < paramInt1 + paramInt4; n++) {
/* 302 */       for (int i1 = paramInt2; i1 < paramInt2 + paramInt5; i1++)
/* 303 */         for (int i2 = paramInt3; i2 < paramInt3 + paramInt6; i2++)
/*     */         {
/* 305 */           double d1 = n + 0.5D - paramazw.a;
/* 306 */           double d2 = i2 + 0.5D - paramazw.c;
/* 307 */           if (d1 * paramDouble1 + d2 * paramDouble2 >= 0.0D) {
/* 308 */             aji localaji = this.b.a(n, i1, i2);
/* 309 */             if (!localaji.b(this.b, n, i1, i2)) return false;
/*     */           }
/*     */         }
/*     */     }
/* 313 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */