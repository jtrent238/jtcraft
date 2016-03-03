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
/*     */ public class mx
/*     */ {
/*     */   public ahb a;
/*     */   public mw b;
/*  16 */   private ahk c = ahk.a;
/*     */   private boolean d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private boolean j;
/*     */   private int k;
/*     */   private int l;
/*  26 */   private int m; private int n; private int o = -1;
/*     */   
/*     */   public mx(ahb paramahb) {
/*  29 */     this.a = paramahb;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk) {
/*  33 */     this.c = paramahk;
/*     */     
/*  35 */     paramahk.a(this.b.bE);
/*     */     
/*  37 */     this.b.q();
/*     */   }
/*     */   
/*     */   public ahk b() {
/*  41 */     return this.c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean d()
/*     */   {
/*  49 */     return this.c.d();
/*     */   }
/*     */   
/*     */   public void b(ahk paramahk) {
/*  53 */     if (this.c == ahk.a) {
/*  54 */       this.c = paramahk;
/*     */     }
/*  56 */     a(this.c);
/*     */   }
/*     */   
/*     */   public void a() {
/*  60 */     this.i += 1;
/*     */     float f1;
/*  62 */     int i3; if (this.j) {
/*  63 */       int i1 = this.i - this.n;
/*  64 */       aji localaji2 = this.a.a(this.k, this.l, this.m);
/*  65 */       if (localaji2.o() == awt.a) {
/*  66 */         this.j = false;
/*     */       } else {
/*  68 */         f1 = localaji2.a(this.b, this.b.o, this.k, this.l, this.m) * (i1 + 1);
/*  69 */         i3 = (int)(f1 * 10.0F);
/*     */         
/*  71 */         if (i3 != this.o) {
/*  72 */           this.a.d(this.b.y(), this.k, this.l, this.m, i3);
/*  73 */           this.o = i3;
/*     */         }
/*     */         
/*  76 */         if (f1 >= 1.0F) {
/*  77 */           this.j = false;
/*  78 */           b(this.k, this.l, this.m);
/*     */         }
/*     */       }
/*  81 */     } else if (this.d) {
/*  82 */       aji localaji1 = this.a.a(this.f, this.g, this.h);
/*     */       
/*  84 */       if (localaji1.o() == awt.a) {
/*  85 */         this.a.d(this.b.y(), this.f, this.g, this.h, -1);
/*  86 */         this.o = -1;
/*  87 */         this.d = false;
/*     */       } else {
/*  89 */         int i2 = this.i - this.e;
/*  90 */         f1 = localaji1.a(this.b, this.b.o, this.f, this.g, this.h) * (i2 + 1);
/*  91 */         i3 = (int)(f1 * 10.0F);
/*     */         
/*  93 */         if (i3 != this.o) {
/*  94 */           this.a.d(this.b.y(), this.f, this.g, this.h, i3);
/*  95 */           this.o = i3;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 102 */     if ((this.c.c()) && 
/* 103 */       (!this.b.d(paramInt1, paramInt2, paramInt3))) {
/* 104 */       return;
/*     */     }
/*     */     
/*     */ 
/* 108 */     if (d()) {
/* 109 */       if (!this.a.a(null, paramInt1, paramInt2, paramInt3, paramInt4)) {
/* 110 */         b(paramInt1, paramInt2, paramInt3);
/*     */       }
/* 112 */       return;
/*     */     }
/*     */     
/* 115 */     this.a.a(null, paramInt1, paramInt2, paramInt3, paramInt4);
/* 116 */     this.e = this.i;
/* 117 */     float f1 = 1.0F;
/* 118 */     aji localaji = this.a.a(paramInt1, paramInt2, paramInt3);
/* 119 */     if (localaji.o() != awt.a) {
/* 120 */       localaji.a(this.a, paramInt1, paramInt2, paramInt3, this.b);
/* 121 */       f1 = localaji.a(this.b, this.b.o, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 124 */     if ((localaji.o() != awt.a) && (f1 >= 1.0F)) {
/* 125 */       b(paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 127 */       this.d = true;
/* 128 */       this.f = paramInt1;
/* 129 */       this.g = paramInt2;
/* 130 */       this.h = paramInt3;
/*     */       
/* 132 */       int i1 = (int)(f1 * 10.0F);
/* 133 */       this.a.d(this.b.y(), paramInt1, paramInt2, paramInt3, i1);
/* 134 */       this.o = i1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 139 */     if ((paramInt1 == this.f) && (paramInt2 == this.g) && (paramInt3 == this.h)) {
/* 140 */       int i1 = this.i - this.e;
/*     */       
/* 142 */       aji localaji = this.a.a(paramInt1, paramInt2, paramInt3);
/* 143 */       if (localaji.o() != awt.a) {
/* 144 */         float f1 = localaji.a(this.b, this.b.o, paramInt1, paramInt2, paramInt3) * (i1 + 1);
/* 145 */         if (f1 >= 0.7F) {
/* 146 */           this.d = false;
/* 147 */           this.a.d(this.b.y(), paramInt1, paramInt2, paramInt3, -1);
/* 148 */           b(paramInt1, paramInt2, paramInt3);
/* 149 */         } else if (!this.j) {
/* 150 */           this.d = false;
/* 151 */           this.j = true;
/* 152 */           this.k = paramInt1;
/* 153 */           this.l = paramInt2;
/* 154 */           this.m = paramInt3;
/* 155 */           this.n = this.e;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3) {
/* 162 */     this.d = false;
/*     */     
/* 164 */     this.a.d(this.b.y(), this.f, this.g, this.h, -1);
/*     */   }
/*     */   
/*     */   private boolean d(int paramInt1, int paramInt2, int paramInt3) {
/* 168 */     aji localaji = this.a.a(paramInt1, paramInt2, paramInt3);
/* 169 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 171 */     localaji.a(this.a, paramInt1, paramInt2, paramInt3, i1, this.b);
/*     */     
/* 173 */     boolean bool = this.a.f(paramInt1, paramInt2, paramInt3);
/* 174 */     if (bool) {
/* 175 */       localaji.b(this.a, paramInt1, paramInt2, paramInt3, i1);
/*     */     }
/* 177 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3) {
/* 181 */     if ((this.c.c()) && 
/* 182 */       (!this.b.d(paramInt1, paramInt2, paramInt3))) {
/* 183 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 187 */     if ((this.c.d()) && 
/* 188 */       (this.b.be() != null) && ((this.b.be().b() instanceof aeh))) {
/* 189 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 193 */     aji localaji = this.a.a(paramInt1, paramInt2, paramInt3);
/* 194 */     int i1 = this.a.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 196 */     this.a.a(this.b, 2001, paramInt1, paramInt2, paramInt3, aji.b(localaji) + (this.a.e(paramInt1, paramInt2, paramInt3) << 12));
/*     */     
/* 198 */     boolean bool1 = d(paramInt1, paramInt2, paramInt3);
/*     */     
/* 200 */     if (d()) {
/* 201 */       this.b.a.a(new gh(paramInt1, paramInt2, paramInt3, this.a));
/*     */     } else {
/* 203 */       add localadd = this.b.bF();
/* 204 */       boolean bool2 = this.b.a(localaji);
/* 205 */       if (localadd != null) {
/* 206 */         localadd.a(this.a, localaji, paramInt1, paramInt2, paramInt3, this.b);
/* 207 */         if (localadd.b == 0) {
/* 208 */           this.b.bG();
/*     */         }
/*     */       }
/* 211 */       if ((bool1) && (bool2)) {
/* 212 */         localaji.a(this.a, this.b, paramInt1, paramInt2, paramInt3, i1);
/*     */       }
/*     */     }
/* 215 */     return bool1;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd) {
/* 219 */     int i1 = paramadd.b;
/* 220 */     int i2 = paramadd.k();
/* 221 */     add localadd = paramadd.a(paramahb, paramyz);
/* 222 */     if ((localadd != paramadd) || ((localadd != null) && ((localadd.b != i1) || (localadd.n() > 0) || (localadd.k() != i2)))) {
/* 223 */       paramyz.bm.a[paramyz.bm.c] = localadd;
/* 224 */       if (d()) {
/* 225 */         localadd.b = i1;
/* 226 */         if (localadd.g()) localadd.b(i2);
/*     */       }
/* 228 */       if (localadd.b == 0) {
/* 229 */         paramyz.bm.a[paramyz.bm.c] = null;
/*     */       }
/* 231 */       if (!paramyz.by()) {
/* 232 */         ((mw)paramyz).a(paramyz.bn);
/*     */       }
/* 234 */       return true;
/*     */     }
/* 236 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz, ahb paramahb, add paramadd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 240 */     if (((!paramyz.an()) || (paramyz.be() == null)) && 
/* 241 */       (paramahb.a(paramInt1, paramInt2, paramInt3).a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramInt4, paramFloat1, paramFloat2, paramFloat3))) { return true;
/*     */     }
/*     */     
/* 244 */     if (paramadd == null) return false;
/* 245 */     if (d()) {
/* 246 */       int i1 = paramadd.k();
/* 247 */       int i2 = paramadd.b;
/* 248 */       boolean bool = paramadd.a(paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/* 249 */       paramadd.b(i1);
/* 250 */       paramadd.b = i2;
/* 251 */       return bool;
/*     */     }
/* 253 */     return paramadd.a(paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */   public void a(mt parammt)
/*     */   {
/* 258 */     this.a = parammt;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */