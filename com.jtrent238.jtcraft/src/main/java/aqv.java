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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqv
/*     */   implements apu
/*     */ {
/*     */   private Random i;
/*     */   private awk j;
/*     */   private awk k;
/*     */   private awk l;
/*     */   private awk m;
/*     */   private awk n;
/*     */   public awk a;
/*     */   public awk b;
/*     */   private ahb o;
/*     */   private double[] p;
/*     */   
/*     */   public aqv(ahb paramahb, long paramLong)
/*     */   {
/*  36 */     this.o = paramahb;
/*     */     
/*  38 */     this.i = new Random(paramLong);
/*  39 */     this.j = new awk(this.i, 16);
/*  40 */     this.k = new awk(this.i, 16);
/*  41 */     this.l = new awk(this.i, 8);
/*  42 */     this.m = new awk(this.i, 4);
/*  43 */     this.n = new awk(this.i, 4);
/*     */     
/*  45 */     this.a = new awk(this.i, 10);
/*  46 */     this.b = new awk(this.i, 16);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  55 */   public atd c = new atd();
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, aji[] paramArrayOfaji) {
/*  58 */     int i1 = 4;
/*  59 */     int i2 = 32;
/*     */     
/*  61 */     int i3 = i1 + 1;
/*  62 */     int i4 = 17;
/*  63 */     int i5 = i1 + 1;
/*  64 */     this.p = a(this.p, paramInt1 * i1, 0, paramInt2 * i1, i3, i4, i5);
/*     */     
/*  66 */     for (int i6 = 0; i6 < i1; i6++) {
/*  67 */       for (int i7 = 0; i7 < i1; i7++) {
/*  68 */         for (int i8 = 0; i8 < 16; i8++) {
/*  69 */           double d1 = 0.125D;
/*  70 */           double d2 = this.p[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
/*  71 */           double d3 = this.p[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
/*  72 */           double d4 = this.p[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 0))];
/*  73 */           double d5 = this.p[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 0))];
/*     */           
/*  75 */           double d6 = (this.p[(((i6 + 0) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d2) * d1;
/*  76 */           double d7 = (this.p[(((i6 + 0) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d3) * d1;
/*  77 */           double d8 = (this.p[(((i6 + 1) * i5 + (i7 + 0)) * i4 + (i8 + 1))] - d4) * d1;
/*  78 */           double d9 = (this.p[(((i6 + 1) * i5 + (i7 + 1)) * i4 + (i8 + 1))] - d5) * d1;
/*     */           
/*  80 */           for (int i9 = 0; i9 < 8; i9++) {
/*  81 */             double d10 = 0.25D;
/*     */             
/*  83 */             double d11 = d2;
/*  84 */             double d12 = d3;
/*  85 */             double d13 = (d4 - d2) * d10;
/*  86 */             double d14 = (d5 - d3) * d10;
/*     */             
/*  88 */             for (int i10 = 0; i10 < 4; i10++) {
/*  89 */               int i11 = i10 + i6 * 4 << 11 | 0 + i7 * 4 << 7 | i8 * 8 + i9;
/*  90 */               int i12 = 128;
/*  91 */               double d15 = 0.25D;
/*     */               
/*  93 */               double d16 = d11;
/*  94 */               double d17 = (d12 - d11) * d15;
/*  95 */               for (int i13 = 0; i13 < 4; i13++) {
/*  96 */                 aji localaji = null;
/*  97 */                 if (i8 * 8 + i9 < i2) {
/*  98 */                   localaji = ajn.l;
/*     */                 }
/* 100 */                 if (d16 > 0.0D) {
/* 101 */                   localaji = ajn.aL;
/*     */                 }
/*     */                 
/* 104 */                 paramArrayOfaji[i11] = localaji;
/* 105 */                 i11 += i12;
/* 106 */                 d16 += d17;
/*     */               }
/* 108 */               d11 += d13;
/* 109 */               d12 += d14;
/*     */             }
/*     */             
/* 112 */             d2 += d6;
/* 113 */             d3 += d7;
/* 114 */             d4 += d8;
/* 115 */             d5 += d9;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 122 */   private double[] q = new double['Ā'];
/* 123 */   private double[] r = new double['Ā'];
/* 124 */   private double[] s = new double['Ā'];
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, aji[] paramArrayOfaji) {
/* 127 */     int i1 = 64;
/*     */     
/* 129 */     double d1 = 0.03125D;
/* 130 */     this.q = this.m.a(this.q, paramInt1 * 16, paramInt2 * 16, 0, 16, 16, 1, d1, d1, 1.0D);
/* 131 */     this.r = this.m.a(this.r, paramInt1 * 16, 109, paramInt2 * 16, 16, 1, 16, d1, 1.0D, d1);
/* 132 */     this.s = this.n.a(this.s, paramInt1 * 16, paramInt2 * 16, 0, 16, 16, 1, d1 * 2.0D, d1 * 2.0D, d1 * 2.0D);
/*     */     
/* 134 */     for (int i2 = 0; i2 < 16; i2++) {
/* 135 */       for (int i3 = 0; i3 < 16; i3++) {
/* 136 */         int i4 = this.q[(i2 + i3 * 16)] + this.i.nextDouble() * 0.2D > 0.0D ? 1 : 0;
/* 137 */         int i5 = this.r[(i2 + i3 * 16)] + this.i.nextDouble() * 0.2D > 0.0D ? 1 : 0;
/* 138 */         int i6 = (int)(this.s[(i2 + i3 * 16)] / 3.0D + 3.0D + this.i.nextDouble() * 0.25D);
/*     */         
/* 140 */         int i7 = -1;
/*     */         
/* 142 */         aji localaji1 = ajn.aL;
/* 143 */         aji localaji2 = ajn.aL;
/*     */         
/* 145 */         for (int i8 = 127; i8 >= 0; i8--) {
/* 146 */           int i9 = (i3 * 16 + i2) * 128 + i8;
/*     */           
/* 148 */           if ((i8 >= 127 - this.i.nextInt(5)) || (i8 <= 0 + this.i.nextInt(5))) {
/* 149 */             paramArrayOfaji[i9] = ajn.h;
/*     */           } else {
/* 151 */             aji localaji3 = paramArrayOfaji[i9];
/* 152 */             if ((localaji3 == null) || (localaji3.o() == awt.a)) {
/* 153 */               i7 = -1;
/* 154 */             } else if (localaji3 == ajn.aL) {
/* 155 */               if (i7 == -1) {
/* 156 */                 if (i6 <= 0) {
/* 157 */                   localaji1 = null;
/* 158 */                   localaji2 = ajn.aL;
/* 159 */                 } else if ((i8 >= i1 - 4) && (i8 <= i1 + 1)) {
/* 160 */                   localaji1 = ajn.aL;
/* 161 */                   localaji2 = ajn.aL;
/* 162 */                   if (i5 != 0) {
/* 163 */                     localaji1 = ajn.n;
/* 164 */                     localaji2 = ajn.aL;
/*     */                   }
/* 166 */                   if (i4 != 0) {
/* 167 */                     localaji1 = ajn.aM;
/* 168 */                     localaji2 = ajn.aM;
/*     */                   }
/*     */                 }
/*     */                 
/* 172 */                 if ((i8 < i1) && ((localaji1 == null) || (localaji1.o() == awt.a))) { localaji1 = ajn.l;
/*     */                 }
/* 174 */                 i7 = i6;
/* 175 */                 if (i8 >= i1 - 1) paramArrayOfaji[i9] = localaji1; else
/* 176 */                   paramArrayOfaji[i9] = localaji2;
/* 177 */               } else if (i7 > 0) {
/* 178 */                 i7--;
/* 179 */                 paramArrayOfaji[i9] = localaji2;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 188 */   private aqx t = new aqy();
/*     */   double[] d;
/*     */   double[] e;
/*     */   
/*     */   public apx c(int paramInt1, int paramInt2) {
/* 193 */     return d(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/* 199 */     this.i.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/*     */     
/* 201 */     aji[] arrayOfaji = new aji[32768];
/*     */     
/* 203 */     a(paramInt1, paramInt2, arrayOfaji);
/* 204 */     b(paramInt1, paramInt2, arrayOfaji);
/*     */     
/* 206 */     this.t.a(this, this.o, paramInt1, paramInt2, arrayOfaji);
/* 207 */     this.c.a(this, this.o, paramInt1, paramInt2, arrayOfaji);
/*     */     
/* 209 */     apx localapx = new apx(this.o, arrayOfaji, paramInt1, paramInt2);
/* 210 */     ahu[] arrayOfahu = this.o.v().b(null, paramInt1 * 16, paramInt2 * 16, 16, 16);
/* 211 */     byte[] arrayOfByte = localapx.m();
/*     */     
/* 213 */     for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/* 214 */       arrayOfByte[i1] = ((byte)arrayOfahu[i1].ay);
/*     */     }
/*     */     
/* 217 */     localapx.n();
/*     */     
/* 219 */     return localapx;
/*     */   }
/*     */   
/*     */ 
/*     */   private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 225 */     if (paramArrayOfDouble == null) {
/* 226 */       paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
/*     */     }
/*     */     
/* 229 */     double d1 = 684.412D;
/* 230 */     double d2 = 2053.236D;
/*     */     
/* 232 */     this.g = this.a.a(this.g, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 1.0D, 0.0D, 1.0D);
/* 233 */     this.h = this.b.a(this.h, paramInt1, paramInt2, paramInt3, paramInt4, 1, paramInt6, 100.0D, 0.0D, 100.0D);
/*     */     
/* 235 */     this.d = this.l.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 60.0D, d1 / 80.0D);
/* 236 */     this.e = this.j.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 237 */     this.f = this.k.a(this.f, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/*     */     
/* 239 */     int i1 = 0;
/* 240 */     int i2 = 0;
/* 241 */     double[] arrayOfDouble = new double[paramInt5];
/* 242 */     for (int i3 = 0; i3 < paramInt5; i3++) {
/* 243 */       arrayOfDouble[i3] = (Math.cos(i3 * 3.141592653589793D * 6.0D / paramInt5) * 2.0D);
/*     */       
/* 245 */       double d3 = i3;
/* 246 */       if (i3 > paramInt5 / 2) {
/* 247 */         d3 = paramInt5 - 1 - i3;
/*     */       }
/* 249 */       if (d3 < 4.0D) {
/* 250 */         d3 = 4.0D - d3;
/* 251 */         arrayOfDouble[i3] -= d3 * d3 * d3 * 10.0D;
/*     */       }
/*     */     }
/*     */     
/* 255 */     for (i3 = 0; i3 < paramInt4; i3++)
/*     */     {
/* 257 */       for (int i4 = 0; i4 < paramInt6; i4++)
/*     */       {
/* 259 */         double d4 = (this.g[i2] + 256.0D) / 512.0D;
/* 260 */         if (d4 > 1.0D) { d4 = 1.0D;
/*     */         }
/* 262 */         double d5 = 0.0D;
/*     */         
/* 264 */         double d6 = this.h[i2] / 8000.0D;
/* 265 */         if (d6 < 0.0D) d6 = -d6;
/* 266 */         d6 = d6 * 3.0D - 3.0D;
/*     */         
/* 268 */         if (d6 < 0.0D) {
/* 269 */           d6 /= 2.0D;
/* 270 */           if (d6 < -1.0D) d6 = -1.0D;
/* 271 */           d6 /= 1.4D;
/* 272 */           d6 /= 2.0D;
/* 273 */           d4 = 0.0D;
/*     */         } else {
/* 275 */           if (d6 > 1.0D) d6 = 1.0D;
/* 276 */           d6 /= 6.0D;
/*     */         }
/* 278 */         d4 += 0.5D;
/* 279 */         d6 = d6 * paramInt5 / 16.0D;
/* 280 */         i2++;
/*     */         
/* 282 */         for (int i5 = 0; i5 < paramInt5; i5++) {
/* 283 */           double d7 = 0.0D;
/*     */           
/* 285 */           double d8 = arrayOfDouble[i5];
/*     */           
/* 287 */           double d9 = this.e[i1] / 512.0D;
/* 288 */           double d10 = this.f[i1] / 512.0D;
/*     */           
/* 290 */           double d11 = (this.d[i1] / 10.0D + 1.0D) / 2.0D;
/* 291 */           if (d11 < 0.0D) { d7 = d9;
/* 292 */           } else if (d11 > 1.0D) d7 = d10; else
/* 293 */             d7 = d9 + (d10 - d9) * d11;
/* 294 */           d7 -= d8;
/*     */           double d12;
/* 296 */           if (i5 > paramInt5 - 4) {
/* 297 */             d12 = (i5 - (paramInt5 - 4)) / 3.0F;
/* 298 */             d7 = d7 * (1.0D - d12) + -10.0D * d12;
/*     */           }
/*     */           
/* 301 */           if (i5 < d5) {
/* 302 */             d12 = (d5 - i5) / 4.0D;
/* 303 */             if (d12 < 0.0D) d12 = 0.0D;
/* 304 */             if (d12 > 1.0D) d12 = 1.0D;
/* 305 */             d7 = d7 * (1.0D - d12) + -10.0D * d12;
/*     */           }
/*     */           
/* 308 */           paramArrayOfDouble[i1] = d7;
/* 309 */           i1++;
/*     */         }
/*     */       }
/*     */     }
/* 313 */     return paramArrayOfDouble;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/* 318 */     return true;
/*     */   }
/*     */   
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2)
/*     */   {
/* 323 */     akx.M = true;
/* 324 */     int i1 = paramInt1 * 16;
/* 325 */     int i2 = paramInt2 * 16;
/*     */     
/* 327 */     this.c.a(this.o, this.i, paramInt1, paramInt2);
/*     */     int i6;
/* 329 */     for (int i3 = 0; i3 < 8; i3++) {
/* 330 */       i4 = i1 + this.i.nextInt(16) + 8;
/* 331 */       i5 = this.i.nextInt(120) + 4;
/* 332 */       i6 = i2 + this.i.nextInt(16) + 8;
/* 333 */       new ars(ajn.k, false).a(this.o, this.i, i4, i5, i6);
/*     */     }
/*     */     
/* 336 */     i3 = this.i.nextInt(this.i.nextInt(10) + 1) + 1;
/*     */     int i7;
/* 338 */     for (int i4 = 0; i4 < i3; i4++) {
/* 339 */       i5 = i1 + this.i.nextInt(16) + 8;
/* 340 */       i6 = this.i.nextInt(120) + 4;
/* 341 */       i7 = i2 + this.i.nextInt(16) + 8;
/* 342 */       new arq().a(this.o, this.i, i5, i6, i7);
/*     */     }
/*     */     
/* 345 */     i3 = this.i.nextInt(this.i.nextInt(10) + 1);
/* 346 */     for (i4 = 0; i4 < i3; i4++) {
/* 347 */       i5 = i1 + this.i.nextInt(16) + 8;
/* 348 */       i6 = this.i.nextInt(120) + 4;
/* 349 */       i7 = i2 + this.i.nextInt(16) + 8;
/* 350 */       new ary().a(this.o, this.i, i5, i6, i7);
/*     */     }
/*     */     
/* 353 */     for (i4 = 0; i4 < 10; i4++) {
/* 354 */       i5 = i1 + this.i.nextInt(16) + 8;
/* 355 */       i6 = this.i.nextInt(128);
/* 356 */       i7 = i2 + this.i.nextInt(16) + 8;
/* 357 */       new arr().a(this.o, this.i, i5, i6, i7);
/*     */     }
/*     */     
/* 360 */     if (this.i.nextInt(1) == 0) {
/* 361 */       i4 = i1 + this.i.nextInt(16) + 8;
/* 362 */       i5 = this.i.nextInt(128);
/* 363 */       i6 = i2 + this.i.nextInt(16) + 8;
/* 364 */       new aro(ajn.P).a(this.o, this.i, i4, i5, i6);
/*     */     }
/*     */     
/* 367 */     if (this.i.nextInt(1) == 0) {
/* 368 */       i4 = i1 + this.i.nextInt(16) + 8;
/* 369 */       i5 = this.i.nextInt(128);
/* 370 */       i6 = i2 + this.i.nextInt(16) + 8;
/* 371 */       new aro(ajn.Q).a(this.o, this.i, i4, i5, i6);
/*     */     }
/*     */     
/* 374 */     ase localase = new ase(ajn.bY, 13, ajn.aL);
/* 375 */     int i8; for (int i5 = 0; i5 < 16; i5++) {
/* 376 */       i6 = i1 + this.i.nextInt(16);
/* 377 */       i7 = this.i.nextInt(108) + 10;
/* 378 */       i8 = i2 + this.i.nextInt(16);
/* 379 */       localase.a(this.o, this.i, i6, i7, i8);
/*     */     }
/*     */     
/* 382 */     for (i5 = 0; i5 < 16; i5++) {
/* 383 */       i6 = i1 + this.i.nextInt(16);
/* 384 */       i7 = this.i.nextInt(108) + 10;
/* 385 */       i8 = i2 + this.i.nextInt(16);
/* 386 */       new ars(ajn.k, true).a(this.o, this.i, i6, i7, i8);
/*     */     }
/*     */     
/*     */ 
/* 390 */     akx.M = false;
/*     */   }
/*     */   
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/* 395 */     return true;
/*     */   }
/*     */   
/*     */   double[] f;
/*     */   double[] g;
/*     */   double[] h;
/*     */   public void c() {}
/*     */   
/*     */   public boolean d()
/*     */   {
/* 405 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/* 410 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 416 */     return "HellRandomLevelSource";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 423 */     if (paramsx == sx.a) {
/* 424 */       if (this.c.b(paramInt1, paramInt2, paramInt3)) {
/* 425 */         return this.c.b();
/*     */       }
/* 427 */       if ((this.c.d(paramInt1, paramInt2, paramInt3)) && (this.o.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.bj)) {
/* 428 */         return this.c.b();
/*     */       }
/*     */     }
/*     */     
/* 432 */     ahu localahu = this.o.a(paramInt1, paramInt3);
/* 433 */     return localahu.a(paramsx);
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 438 */     return null;
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 443 */     return 0;
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2)
/*     */   {
/* 448 */     this.c.a(this, this.o, paramInt1, paramInt2, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */