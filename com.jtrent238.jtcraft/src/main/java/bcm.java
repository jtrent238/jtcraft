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
/*     */ public abstract class bcm
/*     */ {
/*     */   private final bao k;
/*     */   protected int a;
/*     */   private int l;
/*     */   protected int b;
/*     */   protected int c;
/*     */   protected int d;
/*     */   protected int e;
/*     */   protected final int f;
/*     */   private int m;
/*     */   private int n;
/*     */   protected int g;
/*     */   protected int h;
/*  26 */   protected boolean i = true;
/*     */   
/*  28 */   private float o = -2.0F;
/*     */   
/*     */   private float p;
/*     */   private float q;
/*  32 */   private int r = -1;
/*     */   
/*     */   private long s;
/*  35 */   private boolean t = true;
/*     */   private boolean u;
/*     */   protected int j;
/*  38 */   private boolean v = true;
/*     */   
/*     */   public bcm(bao parambao, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  41 */     this.k = parambao;
/*  42 */     this.a = paramInt1;
/*  43 */     this.l = paramInt2;
/*  44 */     this.b = paramInt3;
/*  45 */     this.c = paramInt4;
/*  46 */     this.f = paramInt5;
/*  47 */     this.e = 0;
/*  48 */     this.d = paramInt1;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  52 */     this.a = paramInt1;
/*  53 */     this.l = paramInt2;
/*  54 */     this.b = paramInt3;
/*  55 */     this.c = paramInt4;
/*  56 */     this.e = 0;
/*  57 */     this.d = paramInt1;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  61 */     this.t = paramBoolean;
/*     */   }
/*     */   
/*     */   protected void a(boolean paramBoolean, int paramInt) {
/*  65 */     this.u = paramBoolean;
/*  66 */     this.j = paramInt;
/*     */     
/*  68 */     if (!paramBoolean) {
/*  69 */       this.j = 0;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected abstract int b();
/*     */   
/*     */ 
/*     */   protected abstract void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3);
/*     */   
/*     */ 
/*     */   protected abstract boolean a(int paramInt);
/*     */   
/*     */   protected int e()
/*     */   {
/*  84 */     return b() * this.f + this.j;
/*     */   }
/*     */   
/*     */ 
/*     */   protected abstract void a();
/*     */   
/*     */ 
/*     */   protected abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6);
/*     */   
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, bmh parambmh) {}
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2) {}
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2) {}
/*     */   
/*     */   public int c(int paramInt1, int paramInt2)
/*     */   {
/* 102 */     int i1 = this.e + this.a / 2 - c() / 2;
/* 103 */     int i2 = this.e + this.a / 2 + c() / 2;
/*     */     
/* 105 */     int i3 = paramInt2 - this.b - this.j + (int)this.q - 4;
/* 106 */     int i4 = i3 / this.f;
/* 107 */     if ((paramInt1 < d()) && (paramInt1 >= i1) && (paramInt1 <= i2) && (i4 >= 0) && (i3 >= 0) && (i4 < b())) {
/* 108 */       return i4;
/*     */     }
/* 110 */     return -1;
/*     */   }
/*     */   
/*     */   public void d(int paramInt1, int paramInt2) {
/* 114 */     this.m = paramInt1;
/* 115 */     this.n = paramInt2;
/*     */   }
/*     */   
/*     */   private void k() {
/* 119 */     int i1 = f();
/* 120 */     if (i1 < 0) i1 /= 2;
/* 121 */     if ((!this.i) && (i1 < 0)) i1 = 0;
/* 122 */     if (this.q < 0.0F) this.q = 0.0F;
/* 123 */     if (this.q > i1) this.q = i1;
/*     */   }
/*     */   
/*     */   public int f() {
/* 127 */     return e() - (this.c - this.b - 4);
/*     */   }
/*     */   
/*     */   public int g() {
/* 131 */     return (int)this.q;
/*     */   }
/*     */   
/*     */   public boolean e(int paramInt) {
/* 135 */     return (paramInt >= this.b) && (paramInt <= this.c);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void f(int paramInt)
/*     */   {
/* 143 */     this.q += paramInt;
/* 144 */     k();
/* 145 */     this.o = -2.0F;
/*     */   }
/*     */   
/*     */   public void a(bcb parambcb) {
/* 149 */     if (!parambcb.l) { return;
/*     */     }
/* 151 */     if (parambcb.k == this.m) {
/* 152 */       this.q -= this.f * 2 / 3;
/* 153 */       this.o = -2.0F;
/* 154 */       k();
/* 155 */     } else if (parambcb.k == this.n) {
/* 156 */       this.q += this.f * 2 / 3;
/* 157 */       this.o = -2.0F;
/* 158 */       k();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat) {
/* 163 */     this.g = paramInt1;
/* 164 */     this.h = paramInt2;
/* 165 */     a();
/*     */     
/* 167 */     int i1 = b();
/*     */     
/* 169 */     int i2 = d();
/* 170 */     int i3 = i2 + 6;
/*     */     int i10;
/* 172 */     if ((paramInt1 > this.e) && (paramInt1 < this.d) && (paramInt2 > this.b) && (paramInt2 < this.c)) { int i4;
/* 173 */       if ((Mouse.isButtonDown(0)) && (i())) {
/* 174 */         if (this.o == -1.0F) {
/* 175 */           i4 = 1;
/* 176 */           if ((paramInt2 >= this.b) && (paramInt2 <= this.c)) {
/* 177 */             int i5 = this.a / 2 - c() / 2;
/* 178 */             i6 = this.a / 2 + c() / 2;
/*     */             
/* 180 */             i7 = paramInt2 - this.b - this.j + (int)this.q - 4;
/* 181 */             i8 = i7 / this.f;
/* 182 */             if ((paramInt1 >= i5) && (paramInt1 <= i6) && (i8 >= 0) && (i7 >= 0) && (i8 < i1))
/*     */             {
/* 184 */               boolean bool = (i8 == this.r) && (bao.K() - this.s < 250L);
/*     */               
/* 186 */               a(i8, bool, paramInt1, paramInt2);
/* 187 */               this.r = i8;
/* 188 */               this.s = bao.K();
/* 189 */             } else if ((paramInt1 >= i5) && (paramInt1 <= i6) && (i7 < 0)) {
/* 190 */               a(paramInt1 - i5, paramInt2 - this.b + (int)this.q - 4);
/* 191 */               i4 = 0;
/*     */             }
/* 193 */             if ((paramInt1 >= i2) && (paramInt1 <= i3)) {
/* 194 */               this.p = -1.0F;
/*     */               
/* 196 */               i9 = f();
/* 197 */               if (i9 < 1) i9 = 1;
/* 198 */               i10 = (int)((this.c - this.b) * (this.c - this.b) / e());
/* 199 */               if (i10 < 32) i10 = 32;
/* 200 */               if (i10 > this.c - this.b - 8) { i10 = this.c - this.b - 8;
/*     */               }
/* 202 */               this.p /= (this.c - this.b - i10) / i9;
/*     */             }
/*     */             else {
/* 205 */               this.p = 1.0F;
/*     */             }
/* 207 */             if (i4 != 0) {
/* 208 */               this.o = paramInt2;
/*     */             } else {
/* 210 */               this.o = -2.0F;
/*     */             }
/*     */           } else {
/* 213 */             this.o = -2.0F;
/*     */           }
/* 215 */         } else if (this.o >= 0.0F) {
/* 216 */           this.q -= (paramInt2 - this.o) * this.p;
/* 217 */           this.o = paramInt2;
/*     */         }
/*     */       } else {
/* 220 */         while ((!this.k.u.y) && (Mouse.next())) {
/* 221 */           i4 = Mouse.getEventDWheel();
/* 222 */           if (i4 != 0) {
/* 223 */             if (i4 > 0) { i4 = -1;
/* 224 */             } else if (i4 < 0) i4 = 1;
/* 225 */             this.q += i4 * this.f / 2;
/*     */           }
/*     */           
/* 228 */           this.k.n.k();
/*     */         }
/*     */         
/* 231 */         this.o = -1.0F;
/*     */       }
/*     */     }
/*     */     
/* 235 */     k();
/*     */     
/* 237 */     GL11.glDisable(2896);
/* 238 */     GL11.glDisable(2912);
/* 239 */     bmh localbmh = bmh.a;
/*     */     
/* 241 */     this.k.P().a(bbw.b);
/* 242 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 243 */     float f1 = 32.0F;
/* 244 */     localbmh.b();
/* 245 */     localbmh.c(2105376);
/* 246 */     localbmh.a(this.e, this.c, 0.0D, this.e / f1, (this.c + (int)this.q) / f1);
/* 247 */     localbmh.a(this.d, this.c, 0.0D, this.d / f1, (this.c + (int)this.q) / f1);
/* 248 */     localbmh.a(this.d, this.b, 0.0D, this.d / f1, (this.b + (int)this.q) / f1);
/* 249 */     localbmh.a(this.e, this.b, 0.0D, this.e / f1, (this.b + (int)this.q) / f1);
/* 250 */     localbmh.a();
/*     */     
/* 252 */     int i6 = this.e + (this.a / 2 - c() / 2 + 2);
/* 253 */     int i7 = this.b + 4 - (int)this.q;
/*     */     
/* 255 */     if (this.u) {
/* 256 */       a(i6, i7, localbmh);
/*     */     }
/*     */     
/* 259 */     b(i6, i7, paramInt1, paramInt2);
/*     */     
/* 261 */     GL11.glDisable(2929);
/*     */     
/* 263 */     int i8 = 4;
/*     */     
/* 265 */     c(0, this.b, 255, 255);
/* 266 */     c(this.c, this.l, 255, 255);
/*     */     
/* 268 */     GL11.glEnable(3042);
/* 269 */     buu.c(770, 771, 0, 1);
/* 270 */     GL11.glDisable(3008);
/* 271 */     GL11.glShadeModel(7425);
/*     */     
/* 273 */     GL11.glDisable(3553);
/*     */     
/* 275 */     localbmh.b();
/* 276 */     localbmh.a(0, 0);
/* 277 */     localbmh.a(this.e, this.b + i8, 0.0D, 0.0D, 1.0D);
/* 278 */     localbmh.a(this.d, this.b + i8, 0.0D, 1.0D, 1.0D);
/* 279 */     localbmh.a(0, 255);
/* 280 */     localbmh.a(this.d, this.b, 0.0D, 1.0D, 0.0D);
/* 281 */     localbmh.a(this.e, this.b, 0.0D, 0.0D, 0.0D);
/* 282 */     localbmh.a();
/*     */     
/* 284 */     localbmh.b();
/* 285 */     localbmh.a(0, 255);
/* 286 */     localbmh.a(this.e, this.c, 0.0D, 0.0D, 1.0D);
/* 287 */     localbmh.a(this.d, this.c, 0.0D, 1.0D, 1.0D);
/* 288 */     localbmh.a(0, 0);
/* 289 */     localbmh.a(this.d, this.c - i8, 0.0D, 1.0D, 0.0D);
/* 290 */     localbmh.a(this.e, this.c - i8, 0.0D, 0.0D, 0.0D);
/* 291 */     localbmh.a();
/*     */     
/* 293 */     int i9 = f();
/* 294 */     if (i9 > 0) {
/* 295 */       i10 = (this.c - this.b) * (this.c - this.b) / e();
/* 296 */       if (i10 < 32) i10 = 32;
/* 297 */       if (i10 > this.c - this.b - 8) { i10 = this.c - this.b - 8;
/*     */       }
/* 299 */       int i11 = (int)this.q * (this.c - this.b - i10) / i9 + this.b;
/* 300 */       if (i11 < this.b) { i11 = this.b;
/*     */       }
/* 302 */       localbmh.b();
/* 303 */       localbmh.a(0, 255);
/* 304 */       localbmh.a(i2, this.c, 0.0D, 0.0D, 1.0D);
/* 305 */       localbmh.a(i3, this.c, 0.0D, 1.0D, 1.0D);
/* 306 */       localbmh.a(i3, this.b, 0.0D, 1.0D, 0.0D);
/* 307 */       localbmh.a(i2, this.b, 0.0D, 0.0D, 0.0D);
/* 308 */       localbmh.a();
/*     */       
/* 310 */       localbmh.b();
/* 311 */       localbmh.a(8421504, 255);
/* 312 */       localbmh.a(i2, i11 + i10, 0.0D, 0.0D, 1.0D);
/* 313 */       localbmh.a(i3, i11 + i10, 0.0D, 1.0D, 1.0D);
/* 314 */       localbmh.a(i3, i11, 0.0D, 1.0D, 0.0D);
/* 315 */       localbmh.a(i2, i11, 0.0D, 0.0D, 0.0D);
/* 316 */       localbmh.a();
/*     */       
/* 318 */       localbmh.b();
/* 319 */       localbmh.a(12632256, 255);
/* 320 */       localbmh.a(i2, i11 + i10 - 1, 0.0D, 0.0D, 1.0D);
/* 321 */       localbmh.a(i3 - 1, i11 + i10 - 1, 0.0D, 1.0D, 1.0D);
/* 322 */       localbmh.a(i3 - 1, i11, 0.0D, 1.0D, 0.0D);
/* 323 */       localbmh.a(i2, i11, 0.0D, 0.0D, 0.0D);
/* 324 */       localbmh.a();
/*     */     }
/*     */     
/* 327 */     b(paramInt1, paramInt2);
/*     */     
/* 329 */     GL11.glEnable(3553);
/*     */     
/* 331 */     GL11.glShadeModel(7424);
/* 332 */     GL11.glEnable(3008);
/* 333 */     GL11.glDisable(3042);
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 337 */     this.v = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 341 */     return this.v;
/*     */   }
/*     */   
/*     */   public int c() {
/* 345 */     return 220;
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 349 */     int i1 = b();
/* 350 */     bmh localbmh = bmh.a;
/*     */     
/* 352 */     for (int i2 = 0; i2 < i1; i2++) {
/* 353 */       int i3 = paramInt2 + i2 * this.f + this.j;
/* 354 */       int i4 = this.f - 4;
/*     */       
/* 356 */       if ((i3 <= this.c) && (i3 + i4 >= this.b))
/*     */       {
/*     */ 
/*     */ 
/* 360 */         if ((this.t) && (a(i2))) {
/* 361 */           int i5 = this.e + (this.a / 2 - c() / 2);
/* 362 */           int i6 = this.e + (this.a / 2 + c() / 2);
/* 363 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 364 */           GL11.glDisable(3553);
/* 365 */           localbmh.b();
/* 366 */           localbmh.c(8421504);
/* 367 */           localbmh.a(i5, i3 + i4 + 2, 0.0D, 0.0D, 1.0D);
/* 368 */           localbmh.a(i6, i3 + i4 + 2, 0.0D, 1.0D, 1.0D);
/* 369 */           localbmh.a(i6, i3 - 2, 0.0D, 1.0D, 0.0D);
/* 370 */           localbmh.a(i5, i3 - 2, 0.0D, 0.0D, 0.0D);
/*     */           
/* 372 */           localbmh.c(0);
/* 373 */           localbmh.a(i5 + 1, i3 + i4 + 1, 0.0D, 0.0D, 1.0D);
/* 374 */           localbmh.a(i6 - 1, i3 + i4 + 1, 0.0D, 1.0D, 1.0D);
/* 375 */           localbmh.a(i6 - 1, i3 - 1, 0.0D, 1.0D, 0.0D);
/* 376 */           localbmh.a(i5 + 1, i3 - 1, 0.0D, 0.0D, 0.0D);
/*     */           
/* 378 */           localbmh.a();
/* 379 */           GL11.glEnable(3553);
/*     */         }
/*     */         
/* 382 */         a(i2, paramInt1, i3, i4, localbmh, paramInt3, paramInt4);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 387 */   protected int d() { return this.a / 2 + 124; }
/*     */   
/*     */   private void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 391 */     bmh localbmh = bmh.a;
/* 392 */     this.k.P().a(bbw.b);
/* 393 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 394 */     float f1 = 32.0F;
/* 395 */     localbmh.b();
/* 396 */     localbmh.a(4210752, paramInt4);
/* 397 */     localbmh.a(this.e, paramInt2, 0.0D, 0.0D, paramInt2 / f1);
/* 398 */     localbmh.a(this.e + this.a, paramInt2, 0.0D, this.a / f1, paramInt2 / f1);
/* 399 */     localbmh.a(4210752, paramInt3);
/* 400 */     localbmh.a(this.e + this.a, paramInt1, 0.0D, this.a / f1, paramInt1 / f1);
/* 401 */     localbmh.a(this.e, paramInt1, 0.0D, 0.0D, paramInt1 / f1);
/* 402 */     localbmh.a();
/*     */   }
/*     */   
/*     */   public void g(int paramInt) {
/* 406 */     this.e = paramInt;
/* 407 */     this.d = (paramInt + this.a);
/*     */   }
/*     */   
/*     */   public int j() {
/* 411 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */