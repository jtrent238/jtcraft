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
/*     */ public class aqz
/*     */   implements apu
/*     */ {
/*     */   private Random i;
/*     */   private awk j;
/*     */   private awk k;
/*     */   private awk l;
/*     */   private awl m;
/*     */   public awk a;
/*     */   public awk b;
/*     */   public awk c;
/*     */   private ahb n;
/*     */   private final boolean o;
/*     */   private ahm p;
/*     */   private final double[] q;
/*     */   private final float[] r;
/*     */   
/*     */   public aqz(ahb paramahb, long paramLong, boolean paramBoolean)
/*     */   {
/*  54 */     this.n = paramahb;
/*  55 */     this.o = paramBoolean;
/*  56 */     this.p = paramahb.N().u();
/*     */     
/*  58 */     this.i = new Random(paramLong);
/*  59 */     this.j = new awk(this.i, 16);
/*  60 */     this.k = new awk(this.i, 16);
/*  61 */     this.l = new awk(this.i, 8);
/*  62 */     this.m = new awl(this.i, 4);
/*     */     
/*  64 */     this.a = new awk(this.i, 10);
/*  65 */     this.b = new awk(this.i, 16);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  72 */     this.c = new awk(this.i, 8);
/*     */     
/*  74 */     this.q = new double['̹'];
/*     */     
/*  76 */     this.r = new float[25];
/*  77 */     for (int i1 = -2; i1 <= 2; i1++) {
/*  78 */       for (int i2 = -2; i2 <= 2; i2++) {
/*  79 */         float f1 = 10.0F / qh.c(i1 * i1 + i2 * i2 + 0.2F);
/*  80 */         this.r[(i1 + 2 + (i2 + 2) * 5)] = f1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, aji[] paramArrayOfaji)
/*     */   {
/*  90 */     int i1 = 63;
/*     */     
/*  92 */     this.z = this.n.v().a(this.z, paramInt1 * 4 - 2, paramInt2 * 4 - 2, 10, 10);
/*  93 */     a(paramInt1 * 4, 0, paramInt2 * 4);
/*     */     
/*  95 */     for (int i2 = 0; i2 < 4; i2++) {
/*  96 */       int i3 = i2 * 5;
/*  97 */       int i4 = (i2 + 1) * 5;
/*  98 */       for (int i5 = 0; i5 < 4; i5++) {
/*  99 */         int i6 = (i3 + i5) * 33;
/* 100 */         int i7 = (i3 + i5 + 1) * 33;
/* 101 */         int i8 = (i4 + i5) * 33;
/* 102 */         int i9 = (i4 + i5 + 1) * 33;
/* 103 */         for (int i10 = 0; i10 < 32; i10++) {
/* 104 */           double d1 = 0.125D;
/* 105 */           double d2 = this.q[(i6 + i10)];
/* 106 */           double d3 = this.q[(i7 + i10)];
/* 107 */           double d4 = this.q[(i8 + i10)];
/* 108 */           double d5 = this.q[(i9 + i10)];
/*     */           
/* 110 */           double d6 = (this.q[(i6 + i10 + 1)] - d2) * d1;
/* 111 */           double d7 = (this.q[(i7 + i10 + 1)] - d3) * d1;
/* 112 */           double d8 = (this.q[(i8 + i10 + 1)] - d4) * d1;
/* 113 */           double d9 = (this.q[(i9 + i10 + 1)] - d5) * d1;
/*     */           
/* 115 */           for (int i11 = 0; i11 < 8; i11++) {
/* 116 */             double d10 = 0.25D;
/*     */             
/* 118 */             double d11 = d2;
/* 119 */             double d12 = d3;
/* 120 */             double d13 = (d4 - d2) * d10;
/* 121 */             double d14 = (d5 - d3) * d10;
/*     */             
/* 123 */             for (int i12 = 0; i12 < 4; i12++) {
/* 124 */               int i13 = i12 + i2 * 4 << 12 | 0 + i5 * 4 << 8 | i10 * 8 + i11;
/* 125 */               int i14 = 256;
/* 126 */               i13 -= i14;
/* 127 */               double d15 = 0.25D;
/*     */               
/* 129 */               double d16 = d11;
/* 130 */               double d17 = (d12 - d11) * d15;
/* 131 */               d16 -= d17;
/* 132 */               for (int i15 = 0; i15 < 4; i15++) {
/* 133 */                 if (d16 += d17 > 0.0D) {
/* 134 */                   paramArrayOfaji[(i13 += i14)] = ajn.b;
/* 135 */                 } else if (i10 * 8 + i11 < i1) {
/* 136 */                   paramArrayOfaji[(i13 += i14)] = ajn.j;
/*     */                 } else {
/* 138 */                   paramArrayOfaji[(i13 += i14)] = null;
/*     */                 }
/*     */               }
/* 141 */               d11 += d13;
/* 142 */               d12 += d14;
/*     */             }
/*     */             
/* 145 */             d2 += d6;
/* 146 */             d3 += d7;
/* 147 */             d4 += d8;
/* 148 */             d5 += d9;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 155 */   private double[] s = new double['Ā'];
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, aji[] paramArrayOfaji, byte[] paramArrayOfByte, ahu[] paramArrayOfahu)
/*     */   {
/* 159 */     double d1 = 0.03125D;
/* 160 */     this.s = this.m.a(this.s, paramInt1 * 16, paramInt2 * 16, 16, 16, d1 * 2.0D, d1 * 2.0D, 1.0D);
/*     */     
/* 162 */     for (int i1 = 0; i1 < 16; i1++) {
/* 163 */       for (int i2 = 0; i2 < 16; i2++) {
/* 164 */         ahu localahu = paramArrayOfahu[(i2 + i1 * 16)];
/* 165 */         localahu.a(this.n, this.i, paramArrayOfaji, paramArrayOfByte, paramInt1 * 16 + i1, paramInt2 * 16 + i2, this.s[(i2 + i1 * 16)]);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 170 */   private aqx t = new aqw();
/* 171 */   private aug u = new aug();
/* 172 */   private avn v = new avn();
/* 173 */   private asw w = new asw();
/* 174 */   private atx x = new atx();
/* 175 */   private aqx y = new aqs();
/*     */   private ahu[] z;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */   
/* 182 */   public apx c(int paramInt1, int paramInt2) { return d(paramInt1, paramInt2); }
/*     */   
/*     */ 
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/* 188 */     this.i.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/*     */     
/* 190 */     aji[] arrayOfaji = new aji[65536];
/* 191 */     byte[] arrayOfByte1 = new byte[65536];
/*     */     
/* 193 */     a(paramInt1, paramInt2, arrayOfaji);
/* 194 */     this.z = this.n.v().b(this.z, paramInt1 * 16, paramInt2 * 16, 16, 16);
/* 195 */     a(paramInt1, paramInt2, arrayOfaji, arrayOfByte1, this.z);
/*     */     
/* 197 */     this.t.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/* 198 */     this.y.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/* 199 */     if (this.o) {
/* 200 */       this.w.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/* 201 */       this.v.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/* 202 */       this.u.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/* 203 */       this.x.a(this, this.n, paramInt1, paramInt2, arrayOfaji);
/*     */     }
/*     */     
/* 206 */     apx localapx = new apx(this.n, arrayOfaji, arrayOfByte1, paramInt1, paramInt2);
/* 207 */     byte[] arrayOfByte2 = localapx.m();
/*     */     
/* 209 */     for (int i1 = 0; i1 < arrayOfByte2.length; i1++) {
/* 210 */       arrayOfByte2[i1] = ((byte)this.z[i1].ay);
/*     */     }
/*     */     
/* 213 */     localapx.b();
/*     */     
/* 215 */     return localapx;
/*     */   }
/*     */   
/*     */ 
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 221 */     double d1 = 684.412D;
/* 222 */     double d2 = 684.412D;
/* 223 */     double d3 = 512.0D;
/* 224 */     double d4 = 512.0D;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 231 */     this.g = this.b.a(this.g, paramInt1, paramInt3, 5, 5, 200.0D, 200.0D, 0.5D);
/*     */     
/* 233 */     this.d = this.l.a(this.d, paramInt1, paramInt2, paramInt3, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
/*     */     
/* 235 */     this.e = this.j.a(this.e, paramInt1, paramInt2, paramInt3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
/*     */     
/* 237 */     this.f = this.k.a(this.f, paramInt1, paramInt2, paramInt3, 5, 33, 5, 684.412D, 684.412D, 684.412D);
/*     */     
/* 239 */     paramInt1 = paramInt3 = 0;
/*     */     
/* 241 */     int i1 = 0;
/* 242 */     int i2 = 0;
/*     */     
/* 244 */     double d5 = 8.5D;
/*     */     
/* 246 */     for (int i3 = 0; i3 < 5; i3++) {
/* 247 */       for (int i4 = 0; i4 < 5; i4++) {
/* 248 */         float f1 = 0.0F;
/* 249 */         float f2 = 0.0F;
/* 250 */         float f3 = 0.0F;
/*     */         
/* 252 */         int i5 = 2;
/*     */         
/*     */ 
/*     */ 
/* 256 */         ahu localahu1 = this.z[(i3 + 2 + (i4 + 2) * 10)];
/* 257 */         for (int i6 = -i5; i6 <= i5; i6++) {
/* 258 */           for (int i7 = -i5; i7 <= i5; i7++) {
/* 259 */             ahu localahu2 = this.z[(i3 + i6 + 2 + (i4 + i7 + 2) * 10)];
/* 260 */             float f4 = localahu2.am;
/* 261 */             float f5 = localahu2.an;
/* 262 */             if ((this.p == ahm.e) && (f4 > 0.0F)) {
/* 263 */               f4 = 1.0F + f4 * 2.0F;
/* 264 */               f5 = 1.0F + f5 * 4.0F;
/*     */             }
/* 266 */             float f6 = this.r[(i6 + 2 + (i7 + 2) * 5)] / (f4 + 2.0F);
/* 267 */             if (localahu2.am > localahu1.am) {
/* 268 */               f6 /= 2.0F;
/*     */             }
/* 270 */             f1 += f5 * f6;
/* 271 */             f2 += f4 * f6;
/* 272 */             f3 += f6;
/*     */           }
/*     */         }
/* 275 */         f1 /= f3;
/* 276 */         f2 /= f3;
/*     */         
/* 278 */         f1 = f1 * 0.9F + 0.1F;
/* 279 */         f2 = (f2 * 4.0F - 1.0F) / 8.0F;
/*     */         
/* 281 */         double d6 = this.g[i2] / 8000.0D;
/* 282 */         if (d6 < 0.0D) d6 = -d6 * 0.3D;
/* 283 */         d6 = d6 * 3.0D - 2.0D;
/*     */         
/* 285 */         if (d6 < 0.0D) {
/* 286 */           d6 /= 2.0D;
/* 287 */           if (d6 < -1.0D) d6 = -1.0D;
/* 288 */           d6 /= 1.4D;
/* 289 */           d6 /= 2.0D;
/*     */         } else {
/* 291 */           if (d6 > 1.0D) d6 = 1.0D;
/* 292 */           d6 /= 8.0D;
/*     */         }
/*     */         
/*     */ 
/* 296 */         i2++;
/*     */         
/* 298 */         double d7 = f2;
/* 299 */         double d8 = f1;
/* 300 */         d7 += d6 * 0.2D;
/* 301 */         d7 = d7 * 8.5D / 8.0D;
/*     */         
/* 303 */         double d9 = 8.5D + d7 * 4.0D;
/*     */         
/*     */ 
/* 306 */         for (int i8 = 0; i8 < 33; i8++)
/*     */         {
/* 308 */           double d10 = (i8 - d9) * 12.0D * 128.0D / 256.0D / d8;
/*     */           
/* 310 */           if (d10 < 0.0D) { d10 *= 4.0D;
/*     */           }
/* 312 */           double d11 = this.e[i1] / 512.0D;
/* 313 */           double d12 = this.f[i1] / 512.0D;
/*     */           
/* 315 */           double d13 = (this.d[i1] / 10.0D + 1.0D) / 2.0D;
/* 316 */           double d14 = qh.b(d11, d12, d13) - d10;
/*     */           
/*     */ 
/*     */ 
/* 320 */           if (i8 > 29) {
/* 321 */             double d15 = (i8 - 29) / 3.0F;
/* 322 */             d14 = d14 * (1.0D - d15) + -10.0D * d15;
/*     */           }
/*     */           
/* 325 */           this.q[i1] = d14;
/* 326 */           i1++;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/* 334 */     return true;
/*     */   }
/*     */   
/* 337 */   int[][] h = new int[32][32];
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
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2)
/*     */   {
/* 386 */     akx.M = true;
/* 387 */     int i1 = paramInt1 * 16;
/* 388 */     int i2 = paramInt2 * 16;
/* 389 */     ahu localahu = this.n.a(i1 + 16, i2 + 16);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 395 */     this.i.setSeed(this.n.H());
/* 396 */     long l1 = this.i.nextLong() / 2L * 2L + 1L;
/* 397 */     long l2 = this.i.nextLong() / 2L * 2L + 1L;
/* 398 */     this.i.setSeed(paramInt1 * l1 + paramInt2 * l2 ^ this.n.H());
/*     */     
/* 400 */     boolean bool = false;
/*     */     
/* 402 */     if (this.o) {
/* 403 */       this.w.a(this.n, this.i, paramInt1, paramInt2);
/* 404 */       bool = this.v.a(this.n, this.i, paramInt1, paramInt2);
/* 405 */       this.u.a(this.n, this.i, paramInt1, paramInt2);
/* 406 */       this.x.a(this.n, this.i, paramInt1, paramInt2); }
/*     */     int i4;
/*     */     int i5;
/* 409 */     if ((localahu != ahu.q) && (localahu != ahu.F) && 
/* 410 */       (!bool) && (this.i.nextInt(4) == 0)) {
/* 411 */       i3 = i1 + this.i.nextInt(16) + 8;
/* 412 */       i4 = this.i.nextInt(256);
/* 413 */       i5 = i2 + this.i.nextInt(16) + 8;
/* 414 */       new arx(ajn.j).a(this.n, this.i, i3, i4, i5);
/*     */     }
/*     */     
/*     */ 
/* 418 */     if ((!bool) && (this.i.nextInt(8) == 0)) {
/* 419 */       i3 = i1 + this.i.nextInt(16) + 8;
/* 420 */       i4 = this.i.nextInt(this.i.nextInt(248) + 8);
/* 421 */       i5 = i2 + this.i.nextInt(16) + 8;
/* 422 */       if ((i4 < 63) || (this.i.nextInt(10) == 0)) { new arx(ajn.l).a(this.n, this.i, i3, i4, i5);
/*     */       }
/*     */     }
/* 425 */     for (int i3 = 0; i3 < 8; i3++) {
/* 426 */       i4 = i1 + this.i.nextInt(16) + 8;
/* 427 */       i5 = this.i.nextInt(256);
/* 428 */       int i6 = i2 + this.i.nextInt(16) + 8;
/* 429 */       new asd().a(this.n, this.i, i4, i5, i6);
/*     */     }
/*     */     
/* 432 */     localahu.a(this.n, this.i, i1, i2);
/*     */     
/* 434 */     aho.a(this.n, localahu, i1 + 8, i2 + 8, 16, 16, this.i);
/*     */     
/* 436 */     i1 += 8;
/* 437 */     i2 += 8;
/* 438 */     for (i3 = 0; i3 < 16; i3++) {
/* 439 */       for (i4 = 0; i4 < 16; i4++) {
/* 440 */         i5 = this.n.h(i1 + i3, i2 + i4);
/*     */         
/* 442 */         if (this.n.r(i3 + i1, i5 - 1, i4 + i2)) {
/* 443 */           this.n.d(i3 + i1, i5 - 1, i4 + i2, ajn.aD, 0, 2);
/*     */         }
/* 445 */         if (this.n.e(i3 + i1, i5, i4 + i2, true)) {
/* 446 */           this.n.d(i3 + i1, i5, i4 + i2, ajn.aC, 0, 2);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 451 */     akx.M = false;
/*     */   }
/*     */   
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/* 456 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void c() {}
/*     */   
/*     */ 
/*     */   public boolean d()
/*     */   {
/* 465 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/* 470 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 476 */     return "RandomLevelSource";
/*     */   }
/*     */   
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 481 */     ahu localahu = this.n.a(paramInt1, paramInt3);
/* 482 */     if ((paramsx == sx.a) && (this.x.a(paramInt1, paramInt2, paramInt3))) {
/* 483 */       return this.x.b();
/*     */     }
/* 485 */     return localahu.a(paramsx);
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 490 */     if (("Stronghold".equals(paramString)) && (this.u != null)) {
/* 491 */       return this.u.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/* 493 */     return null;
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 498 */     return 0;
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2)
/*     */   {
/* 503 */     if (this.o) {
/* 504 */       this.w.a(this, this.n, paramInt1, paramInt2, null);
/* 505 */       this.v.a(this, this.n, paramInt1, paramInt2, null);
/* 506 */       this.u.a(this, this.n, paramInt1, paramInt2, null);
/* 507 */       this.x.a(this, this.n, paramInt1, paramInt2, null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */