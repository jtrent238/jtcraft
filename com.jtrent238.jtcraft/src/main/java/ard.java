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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ard
/*     */   extends arc
/*     */ {
/*  31 */   static final byte[] a = { 2, 0, 0, 1, 2, 1 };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  36 */   Random b = new Random();
/*     */   
/*     */ 
/*     */   ahb c;
/*     */   
/*     */ 
/*  42 */   int[] d = { 0, 0, 0 };
/*     */   
/*     */ 
/*     */   int e;
/*     */   
/*     */   int f;
/*     */   
/*  49 */   double g = 0.618D;
/*  50 */   double h = 1.0D;
/*  51 */   double i = 0.381D;
/*  52 */   double j = 1.0D;
/*  53 */   double k = 1.0D;
/*  54 */   int l = 1;
/*  55 */   int m = 12;
/*  56 */   int n = 4;
/*     */   int[][] o;
/*     */   
/*     */   public ard(boolean paramBoolean)
/*     */   {
/*  61 */     super(paramBoolean);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void a()
/*     */   {
/*  69 */     this.f = ((int)(this.e * this.g));
/*  70 */     if (this.f >= this.e) this.f = (this.e - 1);
/*  71 */     int i1 = (int)(1.382D + Math.pow(this.k * this.e / 13.0D, 2.0D));
/*  72 */     if (i1 < 1) { i1 = 1;
/*     */     }
/*     */     
/*  75 */     int[][] arrayOfInt = new int[i1 * this.e][4];
/*  76 */     int i2 = this.d[1] + this.e - this.n;
/*  77 */     int i3 = 1;
/*  78 */     int i4 = this.d[1] + this.f;
/*  79 */     int i5 = i2 - this.d[1];
/*  80 */     arrayOfInt[0][0] = this.d[0];
/*  81 */     arrayOfInt[0][1] = i2;
/*  82 */     arrayOfInt[0][2] = this.d[2];
/*  83 */     arrayOfInt[0][3] = i4;
/*  84 */     i2--;
/*     */     
/*  86 */     while (i5 >= 0) {
/*  87 */       int i6 = 0;
/*     */       
/*  89 */       float f1 = a(i5);
/*  90 */       if (f1 < 0.0F) {
/*  91 */         i2--;
/*  92 */         i5--;
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*  97 */         double d1 = 0.5D;
/*  98 */         while (i6 < i1) {
/*  99 */           double d2 = this.j * (f1 * (this.b.nextFloat() + 0.328D));
/* 100 */           double d3 = this.b.nextFloat() * 2.0D * 3.14159D;
/* 101 */           int i7 = qh.c(d2 * Math.sin(d3) + this.d[0] + d1);
/* 102 */           int i8 = qh.c(d2 * Math.cos(d3) + this.d[2] + d1);
/* 103 */           int[] arrayOfInt1 = { i7, i2, i8 };
/*     */           
/*     */ 
/* 106 */           int[] arrayOfInt2 = { i7, i2 + this.n, i8 };
/*     */           
/*     */ 
/*     */ 
/* 110 */           if (a(arrayOfInt1, arrayOfInt2) == -1)
/*     */           {
/*     */ 
/* 113 */             int[] arrayOfInt3 = { this.d[0], this.d[1], this.d[2] };
/*     */             
/*     */ 
/* 116 */             double d4 = Math.sqrt(Math.pow(Math.abs(this.d[0] - arrayOfInt1[0]), 2.0D) + Math.pow(Math.abs(this.d[2] - arrayOfInt1[2]), 2.0D));
/* 117 */             double d5 = d4 * this.i;
/* 118 */             if (arrayOfInt1[1] - d5 > i4) {
/* 119 */               arrayOfInt3[1] = i4;
/*     */             }
/*     */             else {
/* 122 */               arrayOfInt3[1] = ((int)(arrayOfInt1[1] - d5));
/*     */             }
/*     */             
/* 125 */             if (a(arrayOfInt3, arrayOfInt1) == -1)
/*     */             {
/*     */ 
/* 128 */               arrayOfInt[i3][0] = i7;
/* 129 */               arrayOfInt[i3][1] = i2;
/* 130 */               arrayOfInt[i3][2] = i8;
/* 131 */               arrayOfInt[i3][3] = arrayOfInt3[1];
/* 132 */               i3++;
/*     */             }
/*     */           }
/* 135 */           i6++;
/*     */         }
/* 137 */         i2--;
/* 138 */         i5--;
/*     */       } }
/* 140 */     this.o = new int[i3][4];
/* 141 */     System.arraycopy(arrayOfInt, 0, this.o, 0, i3);
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
/*     */   void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat, byte paramByte, aji paramaji)
/*     */   {
/* 156 */     int i1 = (int)(paramFloat + 0.618D);
/* 157 */     int i2 = a[paramByte];
/* 158 */     int i3 = a[(paramByte + 3)];
/* 159 */     int[] arrayOfInt1 = { paramInt1, paramInt2, paramInt3 };
/*     */     
/*     */ 
/* 162 */     int[] arrayOfInt2 = { 0, 0, 0 };
/*     */     
/*     */ 
/* 165 */     int i4 = -i1;
/* 166 */     int i5 = -i1;
/*     */     
/* 168 */     arrayOfInt2[paramByte] = arrayOfInt1[paramByte];
/* 169 */     while (i4 <= i1) {
/* 170 */       arrayOfInt1[i2] += i4;
/* 171 */       i5 = -i1;
/* 172 */       while (i5 <= i1) {
/* 173 */         double d1 = Math.pow(Math.abs(i4) + 0.5D, 2.0D) + Math.pow(Math.abs(i5) + 0.5D, 2.0D);
/* 174 */         if (d1 > paramFloat * paramFloat) {
/* 175 */           i5++;
/*     */         }
/*     */         else {
/* 178 */           arrayOfInt1[i3] += i5;
/* 179 */           aji localaji = this.c.a(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2]);
/* 180 */           if ((localaji.o() != awt.a) && (localaji.o() != awt.j))
/*     */           {
/*     */ 
/* 183 */             i5++;
/*     */           }
/*     */           else {
/* 186 */             a(this.c, arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], paramaji, 0);
/* 187 */             i5++;
/*     */           } } }
/* 189 */       i4++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   float a(int paramInt)
/*     */   {
/* 201 */     if (paramInt < this.e * 0.3D) return -1.618F;
/* 202 */     float f1 = this.e / 2.0F;
/* 203 */     float f2 = this.e / 2.0F - paramInt;
/*     */     float f3;
/* 205 */     if (f2 == 0.0F) { f3 = f1;
/* 206 */     } else if (Math.abs(f2) >= f1) f3 = 0.0F; else {
/* 207 */       f3 = (float)Math.sqrt(Math.pow(Math.abs(f1), 2.0D) - Math.pow(Math.abs(f2), 2.0D));
/*     */     }
/* 209 */     f3 *= 0.5F;
/* 210 */     return f3;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   float b(int paramInt)
/*     */   {
/* 219 */     if ((paramInt < 0) || (paramInt >= this.n)) return -1.0F;
/* 220 */     if ((paramInt == 0) || (paramInt == this.n - 1)) return 2.0F;
/* 221 */     return 3.0F;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 228 */     int i1 = paramInt2;
/* 229 */     int i2 = paramInt2 + this.n;
/*     */     
/* 231 */     while (i1 < i2) {
/* 232 */       float f1 = b(i1 - paramInt2);
/* 233 */       a(paramInt1, i1, paramInt3, f1, (byte)1, ajn.t);
/* 234 */       i1++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, aji paramaji)
/*     */   {
/* 245 */     int[] arrayOfInt1 = { 0, 0, 0 };
/*     */     
/*     */ 
/* 248 */     int i1 = 0;
/* 249 */     int i2 = 0;
/* 250 */     while (i1 < 3) {
/* 251 */       paramArrayOfInt2[i1] -= paramArrayOfInt1[i1];
/* 252 */       if (Math.abs(arrayOfInt1[i1]) > Math.abs(arrayOfInt1[i2])) {
/* 253 */         i2 = i1;
/*     */       }
/* 255 */       i1 = (byte)(i1 + 1);
/*     */     }
/*     */     
/* 258 */     if (arrayOfInt1[i2] == 0) { return;
/*     */     }
/* 260 */     int i3 = a[i2];
/* 261 */     int i4 = a[(i2 + 3)];
/*     */     
/*     */     int i5;
/*     */     
/* 265 */     if (arrayOfInt1[i2] > 0) i5 = 1; else {
/* 266 */       i5 = -1;
/*     */     }
/* 268 */     double d1 = arrayOfInt1[i3] / arrayOfInt1[i2];
/* 269 */     double d2 = arrayOfInt1[i4] / arrayOfInt1[i2];
/*     */     
/* 271 */     int[] arrayOfInt2 = { 0, 0, 0 };
/*     */     
/*     */ 
/*     */ 
/* 275 */     int i6 = 0;
/* 276 */     int i7 = arrayOfInt1[i2] + i5;
/* 277 */     while (i6 != i7) {
/* 278 */       arrayOfInt2[i2] = qh.c(paramArrayOfInt1[i2] + i6 + 0.5D);
/* 279 */       arrayOfInt2[i3] = qh.c(paramArrayOfInt1[i3] + i6 * d1 + 0.5D);
/* 280 */       arrayOfInt2[i4] = qh.c(paramArrayOfInt1[i4] + i6 * d2 + 0.5D);
/*     */       
/* 282 */       int i8 = 0;
/* 283 */       int i9 = Math.abs(arrayOfInt2[0] - paramArrayOfInt1[0]);
/* 284 */       int i10 = Math.abs(arrayOfInt2[2] - paramArrayOfInt1[2]);
/* 285 */       int i11 = Math.max(i9, i10);
/*     */       
/* 287 */       if (i11 > 0) {
/* 288 */         if (i9 == i11) {
/* 289 */           i8 = 4;
/* 290 */         } else if (i10 == i11) {
/* 291 */           i8 = 8;
/*     */         }
/*     */       }
/*     */       
/* 295 */       a(this.c, arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2], paramaji, i8);
/* 296 */       i6 += i5;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void b()
/*     */   {
/* 304 */     int i1 = 0;
/* 305 */     int i2 = this.o.length;
/* 306 */     while (i1 < i2) {
/* 307 */       int i3 = this.o[i1][0];
/* 308 */       int i4 = this.o[i1][1];
/* 309 */       int i5 = this.o[i1][2];
/* 310 */       a(i3, i4, i5);
/* 311 */       i1++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   boolean c(int paramInt)
/*     */   {
/* 323 */     if (paramInt < this.e * 0.2D) return false;
/* 324 */     return true;
/*     */   }
/*     */   
/*     */   void c()
/*     */   {
/* 329 */     int i1 = this.d[0];
/* 330 */     int i2 = this.d[1];
/* 331 */     int i3 = this.d[1] + this.f;
/* 332 */     int i4 = this.d[2];
/* 333 */     int[] arrayOfInt1 = { i1, i2, i4 };
/*     */     
/*     */ 
/* 336 */     int[] arrayOfInt2 = { i1, i3, i4 };
/*     */     
/*     */ 
/* 339 */     a(arrayOfInt1, arrayOfInt2, ajn.r);
/* 340 */     if (this.l == 2) {
/* 341 */       arrayOfInt1[0] += 1;
/* 342 */       arrayOfInt2[0] += 1;
/* 343 */       a(arrayOfInt1, arrayOfInt2, ajn.r);
/* 344 */       arrayOfInt1[2] += 1;
/* 345 */       arrayOfInt2[2] += 1;
/* 346 */       a(arrayOfInt1, arrayOfInt2, ajn.r);
/* 347 */       arrayOfInt1[0] += -1;
/* 348 */       arrayOfInt2[0] += -1;
/* 349 */       a(arrayOfInt1, arrayOfInt2, ajn.r);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   void d()
/*     */   {
/* 357 */     int i1 = 0;
/* 358 */     int i2 = this.o.length;
/* 359 */     int[] arrayOfInt1 = { this.d[0], this.d[1], this.d[2] };
/*     */     
/*     */ 
/* 362 */     while (i1 < i2) {
/* 363 */       int[] arrayOfInt2 = this.o[i1];
/* 364 */       int[] arrayOfInt3 = { arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2] };
/*     */       
/*     */ 
/* 367 */       arrayOfInt1[1] = arrayOfInt2[3];
/* 368 */       int i3 = arrayOfInt1[1] - this.d[1];
/* 369 */       if (c(i3)) {
/* 370 */         a(arrayOfInt1, arrayOfInt3, ajn.r);
/*     */       }
/* 372 */       i1++;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   int a(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
/*     */   {
/* 385 */     int[] arrayOfInt1 = { 0, 0, 0 };
/*     */     
/*     */ 
/* 388 */     int i1 = 0;
/* 389 */     int i2 = 0;
/* 390 */     while (i1 < 3) {
/* 391 */       paramArrayOfInt2[i1] -= paramArrayOfInt1[i1];
/* 392 */       if (Math.abs(arrayOfInt1[i1]) > Math.abs(arrayOfInt1[i2])) {
/* 393 */         i2 = i1;
/*     */       }
/* 395 */       i1 = (byte)(i1 + 1);
/*     */     }
/*     */     
/* 398 */     if (arrayOfInt1[i2] == 0) { return -1;
/*     */     }
/* 400 */     int i3 = a[i2];
/* 401 */     int i4 = a[(i2 + 3)];
/*     */     
/*     */     int i5;
/*     */     
/* 405 */     if (arrayOfInt1[i2] > 0) i5 = 1; else {
/* 406 */       i5 = -1;
/*     */     }
/* 408 */     double d1 = arrayOfInt1[i3] / arrayOfInt1[i2];
/* 409 */     double d2 = arrayOfInt1[i4] / arrayOfInt1[i2];
/*     */     
/* 411 */     int[] arrayOfInt2 = { 0, 0, 0 };
/*     */     
/*     */ 
/*     */ 
/* 415 */     int i6 = 0;
/* 416 */     int i7 = arrayOfInt1[i2] + i5;
/*     */     
/* 418 */     while (i6 != i7) {
/* 419 */       paramArrayOfInt1[i2] += i6;
/* 420 */       arrayOfInt2[i3] = qh.c(paramArrayOfInt1[i3] + i6 * d1);
/* 421 */       arrayOfInt2[i4] = qh.c(paramArrayOfInt1[i4] + i6 * d2);
/* 422 */       aji localaji = this.c.a(arrayOfInt2[0], arrayOfInt2[1], arrayOfInt2[2]);
/* 423 */       if (!a(localaji)) {
/*     */         break;
/*     */       }
/*     */       
/*     */ 
/* 428 */       i6 += i5;
/*     */     }
/*     */     
/* 431 */     if (i6 == i7) {
/* 432 */       return -1;
/*     */     }
/*     */     
/*     */ 
/* 436 */     return Math.abs(i6);
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
/*     */   boolean e()
/*     */   {
/* 449 */     int[] arrayOfInt1 = { this.d[0], this.d[1], this.d[2] };
/*     */     
/*     */ 
/* 452 */     int[] arrayOfInt2 = { this.d[0], this.d[1] + this.e - 1, this.d[2] };
/*     */     
/*     */ 
/*     */ 
/* 456 */     aji localaji = this.c.a(this.d[0], this.d[1] - 1, this.d[2]);
/* 457 */     if ((localaji != ajn.d) && (localaji != ajn.c) && (localaji != ajn.ak)) {
/* 458 */       return false;
/*     */     }
/* 460 */     int i1 = a(arrayOfInt1, arrayOfInt2);
/*     */     
/* 462 */     if (i1 == -1) {
/* 463 */       return true;
/*     */     }
/*     */     
/* 466 */     if (i1 < 6) {
/* 467 */       return false;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 472 */     this.e = i1;
/* 473 */     return true;
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
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 487 */     this.m = ((int)(paramDouble1 * 12.0D));
/* 488 */     if (paramDouble1 > 0.5D) this.n = 5;
/* 489 */     this.j = paramDouble2;
/* 490 */     this.k = paramDouble3;
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
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 504 */     this.c = paramahb;
/* 505 */     long l1 = paramRandom.nextLong();
/* 506 */     this.b.setSeed(l1);
/*     */     
/* 508 */     this.d[0] = paramInt1;
/* 509 */     this.d[1] = paramInt2;
/* 510 */     this.d[2] = paramInt3;
/*     */     
/* 512 */     if (this.e == 0) {
/* 513 */       this.e = (5 + this.b.nextInt(this.m));
/*     */     }
/* 515 */     if (!e()) {
/* 516 */       return false;
/*     */     }
/* 518 */     a();
/* 519 */     b();
/* 520 */     c();
/* 521 */     d();
/* 522 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ard.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */