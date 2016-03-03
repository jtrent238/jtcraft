/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ahp
/*     */ {
/*     */   private final mt a;
/*     */   private final Random b;
/*  15 */   private final qd c = new qd();
/*  16 */   private final List d = new ArrayList();
/*     */   
/*     */   public ahp(mt parammt) {
/*  19 */     this.a = parammt;
/*  20 */     this.b = new Random(parammt.H());
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  24 */     if (this.a.t.i == 1) {
/*  25 */       int i = qh.c(paramsa.s);
/*  26 */       int j = qh.c(paramsa.t) - 1;
/*  27 */       int k = qh.c(paramsa.u);
/*     */       
/*  29 */       int m = 1;
/*  30 */       int n = 0;
/*  31 */       for (int i1 = -2; i1 <= 2; i1++) {
/*  32 */         for (int i2 = -2; i2 <= 2; i2++) {
/*  33 */           for (int i3 = -1; i3 < 3; i3++) {
/*  34 */             int i4 = i + i2 * m + i1 * n;
/*  35 */             int i5 = j + i3;
/*  36 */             int i6 = k + i2 * n - i1 * m;
/*     */             
/*  38 */             int i7 = i3 < 0 ? 1 : 0;
/*     */             
/*  40 */             this.a.b(i4, i5, i6, i7 != 0 ? ajn.Z : ajn.a);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  45 */       paramsa.b(i, j, k, paramsa.y, 0.0F);
/*  46 */       paramsa.v = (paramsa.w = paramsa.x = 0.0D);
/*     */       
/*  48 */       return;
/*     */     }
/*  50 */     if (b(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat)) {
/*  51 */       return;
/*     */     }
/*     */     
/*  54 */     a(paramsa);
/*  55 */     b(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean b(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  59 */     int i = 128;
/*  60 */     double d1 = -1.0D;
/*  61 */     int j = 0;
/*  62 */     double d2 = 0;
/*  63 */     int k = 0;
/*     */     
/*  65 */     int m = qh.c(paramsa.s);
/*  66 */     int n = qh.c(paramsa.u);
/*  67 */     long l = agu.a(m, n);
/*  68 */     int i1 = 1;
/*     */     int i2;
/*  70 */     double d3; double d8; if (this.c.b(l)) {
/*  71 */       ahq localahq = (ahq)this.c.a(l);
/*     */       
/*  73 */       d1 = 0.0D;
/*  74 */       j = localahq.a;
/*  75 */       d2 = localahq.b;
/*  76 */       k = localahq.c;
/*  77 */       localahq.d = this.a.I();
/*  78 */       i1 = 0;
/*     */     } else {
/*  80 */       for (i2 = m - i; i2 <= m + i; i2++) {
/*  81 */         d3 = i2 + 0.5D - paramsa.s;
/*  82 */         for (int i4 = n - i; i4 <= n + i; i4++) {
/*  83 */           double d5 = i4 + 0.5D - paramsa.u;
/*  84 */           for (double d7 = this.a.S() - 1; d7 >= 0; d7--) {
/*  85 */             if (this.a.a(i2, d7, i4) == ajn.aO) {
/*  86 */               while (this.a.a(i2, d7 - 1, i4) == ajn.aO) {
/*  87 */                 d7--;
/*     */               }
/*     */               
/*  90 */               d8 = d7 + 0.5D - paramsa.t;
/*  91 */               double d9 = d3 * d3 + d8 * d8 + d5 * d5;
/*  92 */               if ((d1 < 0.0D) || (d9 < d1)) {
/*  93 */                 d1 = d9;
/*  94 */                 j = i2;
/*  95 */                 d2 = d7;
/*  96 */                 k = i4;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 104 */     if (d1 >= 0.0D) {
/* 105 */       i2 = j;
/* 106 */       d3 = d2;
/* 107 */       int i3 = k;
/*     */       
/* 109 */       if (i1 != 0) {
/* 110 */         this.c.a(l, new ahq(this, i2, d3, i3, this.a.I()));
/* 111 */         this.d.add(Long.valueOf(l));
/*     */       }
/*     */       
/* 114 */       double d4 = i2 + 0.5D;
/* 115 */       double d6 = d3 + 0.5D;
/* 116 */       d8 = i3 + 0.5D;
/* 117 */       int i5 = -1;
/*     */       
/* 119 */       if (this.a.a(i2 - 1, d3, i3) == ajn.aO) i5 = 2;
/* 120 */       if (this.a.a(i2 + 1, d3, i3) == ajn.aO) i5 = 0;
/* 121 */       if (this.a.a(i2, d3, i3 - 1) == ajn.aO) i5 = 3;
/* 122 */       if (this.a.a(i2, d3, i3 + 1) == ajn.aO) { i5 = 1;
/*     */       }
/* 124 */       int i6 = paramsa.ay();
/*     */       
/* 126 */       if (i5 > -1) {
/* 127 */         int i7 = p.h[i5];
/* 128 */         int i8 = p.a[i5];
/* 129 */         int i9 = p.b[i5];
/* 130 */         int i10 = p.a[i7];
/* 131 */         int i11 = p.b[i7];
/*     */         
/* 133 */         int i12 = (!this.a.c(i2 + i8 + i10, d3, i3 + i9 + i11)) || (!this.a.c(i2 + i8 + i10, d3 + 1, i3 + i9 + i11)) ? 1 : 0;
/* 134 */         int i13 = (!this.a.c(i2 + i8, d3, i3 + i9)) || (!this.a.c(i2 + i8, d3 + 1, i3 + i9)) ? 1 : 0;
/*     */         
/* 136 */         if ((i12 != 0) && (i13 != 0)) {
/* 137 */           i5 = p.f[i5];
/* 138 */           i7 = p.f[i7];
/* 139 */           i8 = p.a[i5];
/* 140 */           i9 = p.b[i5];
/* 141 */           i10 = p.a[i7];
/* 142 */           i11 = p.b[i7];
/*     */           
/* 144 */           i2 -= i10;
/* 145 */           d4 -= i10;
/* 146 */           i3 -= i11;
/* 147 */           d8 -= i11;
/* 148 */           i12 = (!this.a.c(i2 + i8 + i10, d3, i3 + i9 + i11)) || (!this.a.c(i2 + i8 + i10, d3 + 1, i3 + i9 + i11)) ? 1 : 0;
/* 149 */           i13 = (!this.a.c(i2 + i8, d3, i3 + i9)) || (!this.a.c(i2 + i8, d3 + 1, i3 + i9)) ? 1 : 0;
/*     */         }
/*     */         
/* 152 */         float f1 = 0.5F;
/* 153 */         float f2 = 0.5F;
/*     */         
/* 155 */         if ((i12 == 0) && (i13 != 0)) {
/* 156 */           f1 = 1.0F;
/* 157 */         } else if ((i12 != 0) && (i13 == 0)) {
/* 158 */           f1 = 0.0F;
/* 159 */         } else if ((i12 != 0) && (i13 != 0)) {
/* 160 */           f2 = 0.0F;
/*     */         }
/*     */         
/*     */ 
/* 164 */         d4 += i10 * f1 + f2 * i8;
/* 165 */         d8 += i11 * f1 + f2 * i9;
/*     */         
/* 167 */         float f3 = 0.0F;
/* 168 */         float f4 = 0.0F;
/* 169 */         float f5 = 0.0F;
/* 170 */         float f6 = 0.0F;
/*     */         
/* 172 */         if (i5 == i6) {
/* 173 */           f3 = 1.0F;
/* 174 */           f4 = 1.0F;
/* 175 */         } else if (i5 == p.f[i6]) {
/* 176 */           f3 = -1.0F;
/* 177 */           f4 = -1.0F;
/* 178 */         } else if (i5 == p.g[i6]) {
/* 179 */           f5 = 1.0F;
/* 180 */           f6 = -1.0F;
/*     */         } else {
/* 182 */           f5 = -1.0F;
/* 183 */           f6 = 1.0F;
/*     */         }
/*     */         
/* 186 */         double d10 = paramsa.v;
/* 187 */         double d11 = paramsa.x;
/* 188 */         paramsa.v = (d10 * f3 + d11 * f6);
/* 189 */         paramsa.x = (d10 * f5 + d11 * f4);
/* 190 */         paramsa.y = (paramFloat - i6 * 90 + i5 * 90);
/*     */       } else {
/* 192 */         paramsa.v = (paramsa.w = paramsa.x = 0.0D);
/*     */       }
/*     */       
/* 195 */       paramsa.b(d4, d6, d8, paramsa.y, paramsa.z);
/* 196 */       return true;
/*     */     }
/*     */     
/* 199 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(sa paramsa) {
/* 203 */     int i = 16;
/* 204 */     double d1 = -1.0D;
/*     */     
/* 206 */     double d2 = qh.c(paramsa.s);
/* 207 */     int j = qh.c(paramsa.t);
/* 208 */     int k = qh.c(paramsa.u);
/*     */     
/* 210 */     double d3 = d2;
/* 211 */     int m = j;
/* 212 */     int n = k;
/* 213 */     double d4 = 0;
/*     */     
/* 215 */     int i1 = this.b.nextInt(4);
/*     */     double d7;
/* 217 */     int i7; int i8; int i9; int i13; int i17; int i18; for (double d5 = d2 - i; d5 <= d2 + i; d5++) {
/* 218 */       d6 = d5 + 0.5D - paramsa.s;
/* 219 */       for (i3 = k - i; i3 <= k + i; i3++) {
/* 220 */         d7 = i3 + 0.5D - paramsa.u;
/* 221 */         label436: for (i6 = this.a.S() - 1; i6 >= 0; i6--) {
/* 222 */           if (this.a.c(d5, i6, i3)) {
/* 223 */             while ((i6 > 0) && (this.a.c(d5, i6 - 1, i3))) {
/* 224 */               i6--;
/*     */             }
/*     */             
/* 227 */             for (i7 = i1; i7 < i1 + 4; i7++) {
/* 228 */               i8 = i7 % 2;
/* 229 */               i9 = 1 - i8;
/*     */               
/* 231 */               if (i7 % 4 >= 2) {
/* 232 */                 i8 = -i8;
/* 233 */                 i9 = -i9;
/*     */               }
/*     */               
/* 236 */               for (int i10 = 0; i10 < 3; i10++) {
/* 237 */                 for (i13 = 0; i13 < 4; i13++) {
/* 238 */                   for (int i14 = -1; i14 < 4; i14++) {
/* 239 */                     i17 = d5 + (i13 - 1) * i8 + i10 * i9;
/* 240 */                     i18 = i6 + i14;
/* 241 */                     int i19 = i3 + (i13 - 1) * i9 - i10 * i8;
/*     */                     
/* 243 */                     if (((i14 < 0) && (!this.a.a(i17, i18, i19).o().a())) || (
/* 244 */                       (i14 >= 0) && (!this.a.c(i17, i18, i19))))
/*     */                       break label436;
/*     */                   }
/*     */                 }
/*     */               }
/* 249 */               double d8 = i6 + 0.5D - paramsa.t;
/* 250 */               double d10 = d6 * d6 + d8 * d8 + d7 * d7;
/* 251 */               if ((d1 < 0.0D) || (d10 < d1)) {
/* 252 */                 d1 = d10;
/* 253 */                 d3 = d5;
/* 254 */                 m = i6;
/* 255 */                 n = i3;
/* 256 */                 d4 = i7 % 4;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 263 */     if (d1 < 0.0D) {
/* 264 */       for (d5 = d2 - i; d5 <= d2 + i; d5++) {
/* 265 */         d6 = d5 + 0.5D - paramsa.s;
/* 266 */         for (i3 = k - i; i3 <= k + i; i3++) {
/* 267 */           d7 = i3 + 0.5D - paramsa.u;
/* 268 */           label792: for (i6 = this.a.S() - 1; i6 >= 0; i6--) {
/* 269 */             if (this.a.c(d5, i6, i3)) {
/* 270 */               while ((i6 > 0) && (this.a.c(d5, i6 - 1, i3))) {
/* 271 */                 i6--;
/*     */               }
/*     */               
/* 274 */               for (i7 = i1; i7 < i1 + 2; i7++) {
/* 275 */                 i8 = i7 % 2;
/* 276 */                 i9 = 1 - i8;
/* 277 */                 for (int i11 = 0; i11 < 4; i11++) {
/* 278 */                   for (i13 = -1; i13 < 4; i13++) {
/* 279 */                     int i15 = d5 + (i11 - 1) * i8;
/* 280 */                     i17 = i6 + i13;
/* 281 */                     i18 = i3 + (i11 - 1) * i9;
/*     */                     
/* 283 */                     if (((i13 < 0) && (!this.a.a(i15, i17, i18).o().a())) || (
/* 284 */                       (i13 >= 0) && (!this.a.c(i15, i17, i18))))
/*     */                       break label792;
/*     */                   }
/*     */                 }
/* 288 */                 double d9 = i6 + 0.5D - paramsa.t;
/* 289 */                 double d11 = d6 * d6 + d9 * d9 + d7 * d7;
/* 290 */                 if ((d1 < 0.0D) || (d11 < d1)) {
/* 291 */                   d1 = d11;
/* 292 */                   d3 = d5;
/* 293 */                   m = i6;
/* 294 */                   n = i3;
/* 295 */                   d4 = i7 % 2;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 304 */     d5 = d4;
/*     */     
/* 306 */     double d6 = d3;
/* 307 */     int i2 = m;
/* 308 */     int i3 = n;
/*     */     
/* 310 */     int i4 = d5 % 2;
/* 311 */     int i5 = 1 - i4;
/*     */     
/* 313 */     if (d5 % 4 >= 2) {
/* 314 */       i4 = -i4;
/* 315 */       i5 = -i5; }
/*     */     int i12;
/*     */     int i16;
/* 318 */     if (d1 < 0.0D) {
/* 319 */       if (m < 70) m = 70;
/* 320 */       if (m > this.a.S() - 10) m = this.a.S() - 10;
/* 321 */       i2 = m;
/*     */       
/* 323 */       for (i6 = -1; i6 <= 1; i6++) {
/* 324 */         for (i7 = 1; i7 < 3; i7++) {
/* 325 */           for (i8 = -1; i8 < 3; i8++) {
/* 326 */             i9 = d6 + (i7 - 1) * i4 + i6 * i5;
/* 327 */             i12 = i2 + i8;
/* 328 */             i13 = i3 + (i7 - 1) * i5 - i6 * i4;
/*     */             
/* 330 */             i16 = i8 < 0 ? 1 : 0;
/*     */             
/* 332 */             this.a.b(i9, i12, i13, i16 != 0 ? ajn.Z : ajn.a);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 338 */     for (int i6 = 0; i6 < 4; i6++) {
/* 339 */       for (i7 = 0; i7 < 4; i7++) {
/* 340 */         for (i8 = -1; i8 < 4; i8++) {
/* 341 */           i9 = d6 + (i7 - 1) * i4;
/* 342 */           i12 = i2 + i8;
/* 343 */           i13 = i3 + (i7 - 1) * i5;
/*     */           
/* 345 */           i16 = (i7 == 0) || (i7 == 3) || (i8 == -1) || (i8 == 3) ? 1 : 0;
/* 346 */           this.a.d(i9, i12, i13, i16 != 0 ? ajn.Z : ajn.aO, 0, 2);
/*     */         }
/*     */       }
/*     */       
/* 350 */       for (i7 = 0; i7 < 4; i7++) {
/* 351 */         for (i8 = -1; i8 < 4; i8++) {
/* 352 */           i9 = d6 + (i7 - 1) * i4;
/* 353 */           i12 = i2 + i8;
/* 354 */           i13 = i3 + (i7 - 1) * i5;
/*     */           
/* 356 */           this.a.d(i9, i12, i13, this.a.a(i9, i12, i13));
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 361 */     return true;
/*     */   }
/*     */   
/*     */   public void a(long paramLong) {
/* 365 */     if (paramLong % 100L == 0L) {
/* 366 */       Iterator localIterator = this.d.iterator();
/* 367 */       long l = paramLong - 600L;
/*     */       
/* 369 */       while (localIterator.hasNext()) {
/* 370 */         Long localLong = (Long)localIterator.next();
/* 371 */         ahq localahq = (ahq)this.c.a(localLong.longValue());
/*     */         
/* 373 */         if ((localahq == null) || (localahq.d < l)) {
/* 374 */           localIterator.remove();
/* 375 */           this.c.d(localLong.longValue());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */