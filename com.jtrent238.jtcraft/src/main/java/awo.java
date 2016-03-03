/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ public class awo
/*     */ {
/*   6 */   private static int[][] e = { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
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
/*  33 */   public static final double a = Math.sqrt(3.0D);
/*     */   
/*  35 */   private int[] f = new int['Ȁ'];
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   public awo() {
/*  41 */     this(new Random());
/*     */   }
/*     */   
/*     */   public awo(Random paramRandom) {
/*  45 */     this.b = (paramRandom.nextDouble() * 256.0D);
/*  46 */     this.c = (paramRandom.nextDouble() * 256.0D);
/*  47 */     this.d = (paramRandom.nextDouble() * 256.0D);
/*  48 */     for (int i = 0; i < 256; i++) {
/*  49 */       this.f[i] = i;
/*     */     }
/*     */     
/*  52 */     for (i = 0; i < 256; i++) {
/*  53 */       int j = paramRandom.nextInt(256 - i) + i;
/*  54 */       int k = this.f[i];
/*  55 */       this.f[i] = this.f[j];
/*  56 */       this.f[j] = k;
/*     */       
/*  58 */       this.f[(i + 256)] = this.f[i];
/*     */     }
/*     */   }
/*     */   
/*     */   private static int a(double paramDouble)
/*     */   {
/*  64 */     return paramDouble > 0.0D ? (int)paramDouble : (int)paramDouble - 1;
/*     */   }
/*     */   
/*     */   private static double a(int[] paramArrayOfInt, double paramDouble1, double paramDouble2) {
/*  68 */     return paramArrayOfInt[0] * paramDouble1 + paramArrayOfInt[1] * paramDouble2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public double a(double paramDouble1, double paramDouble2)
/*     */   {
/*  79 */     double d4 = 0.5D * (a - 1.0D);
/*  80 */     double d5 = (paramDouble1 + paramDouble2) * d4;
/*  81 */     int i = a(paramDouble1 + d5);
/*  82 */     int j = a(paramDouble2 + d5);
/*  83 */     double d6 = (3.0D - a) / 6.0D;
/*  84 */     double d7 = (i + j) * d6;
/*  85 */     double d8 = i - d7;
/*  86 */     double d9 = j - d7;
/*  87 */     double d10 = paramDouble1 - d8;
/*  88 */     double d11 = paramDouble2 - d9;
/*     */     
/*     */     int k;
/*     */     int m;
/*  92 */     if (d10 > d11) {
/*  93 */       k = 1;
/*  94 */       m = 0;
/*     */     }
/*     */     else {
/*  97 */       k = 0;
/*  98 */       m = 1;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 103 */     double d12 = d10 - k + d6;
/* 104 */     double d13 = d11 - m + d6;
/* 105 */     double d14 = d10 - 1.0D + 2.0D * d6;
/* 106 */     double d15 = d11 - 1.0D + 2.0D * d6;
/*     */     
/* 108 */     int n = i & 0xFF;
/* 109 */     int i1 = j & 0xFF;
/* 110 */     int i2 = this.f[(n + this.f[i1])] % 12;
/* 111 */     int i3 = this.f[(n + k + this.f[(i1 + m)])] % 12;
/* 112 */     int i4 = this.f[(n + 1 + this.f[(i1 + 1)])] % 12;
/*     */     
/* 114 */     double d16 = 0.5D - d10 * d10 - d11 * d11;
/* 115 */     double d1; if (d16 < 0.0D) { d1 = 0.0D;
/*     */     } else {
/* 117 */       d16 *= d16;
/* 118 */       d1 = d16 * d16 * a(e[i2], d10, d11);
/*     */     }
/* 120 */     double d17 = 0.5D - d12 * d12 - d13 * d13;
/* 121 */     double d2; if (d17 < 0.0D) { d2 = 0.0D;
/*     */     } else {
/* 123 */       d17 *= d17;
/* 124 */       d2 = d17 * d17 * a(e[i3], d12, d13);
/*     */     }
/* 126 */     double d18 = 0.5D - d14 * d14 - d15 * d15;
/* 127 */     double d3; if (d18 < 0.0D) { d3 = 0.0D;
/*     */     } else {
/* 129 */       d18 *= d18;
/* 130 */       d3 = d18 * d18 * a(e[i4], d14, d15);
/*     */     }
/*     */     
/*     */ 
/* 134 */     return 70.0D * (d1 + d2 + d3);
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
/*     */ 
/*     */ 
/* 258 */   private static final double g = 0.5D * (a - 1.0D);
/* 259 */   private static final double h = (3.0D - a) / 6.0D;
/*     */   
/*     */   public void a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5) {
/* 262 */     int i = 0;
/* 263 */     for (int j = 0; j < paramInt2; j++) {
/* 264 */       double d1 = (paramDouble2 + j) * paramDouble4 + this.c;
/* 265 */       for (int k = 0; k < paramInt1; k++) {
/* 266 */         double d2 = (paramDouble1 + k) * paramDouble3 + this.b;
/*     */         
/*     */ 
/* 269 */         double d6 = (d2 + d1) * g;
/* 270 */         int m = a(d2 + d6);
/* 271 */         int n = a(d1 + d6);
/* 272 */         double d7 = (m + n) * h;
/* 273 */         double d8 = m - d7;
/* 274 */         double d9 = n - d7;
/* 275 */         double d10 = d2 - d8;
/* 276 */         double d11 = d1 - d9;
/*     */         
/*     */         int i1;
/*     */         int i2;
/* 280 */         if (d10 > d11) {
/* 281 */           i1 = 1;
/* 282 */           i2 = 0;
/*     */         }
/*     */         else {
/* 285 */           i1 = 0;
/* 286 */           i2 = 1;
/*     */         }
/*     */         
/*     */ 
/*     */ 
/* 291 */         double d12 = d10 - i1 + h;
/* 292 */         double d13 = d11 - i2 + h;
/* 293 */         double d14 = d10 - 1.0D + 2.0D * h;
/* 294 */         double d15 = d11 - 1.0D + 2.0D * h;
/*     */         
/* 296 */         int i3 = m & 0xFF;
/* 297 */         int i4 = n & 0xFF;
/* 298 */         int i5 = this.f[(i3 + this.f[i4])] % 12;
/* 299 */         int i6 = this.f[(i3 + i1 + this.f[(i4 + i2)])] % 12;
/* 300 */         int i7 = this.f[(i3 + 1 + this.f[(i4 + 1)])] % 12;
/*     */         
/* 302 */         double d16 = 0.5D - d10 * d10 - d11 * d11;
/* 303 */         double d3; if (d16 < 0.0D) { d3 = 0.0D;
/*     */         } else {
/* 305 */           d16 *= d16;
/* 306 */           d3 = d16 * d16 * a(e[i5], d10, d11);
/*     */         }
/* 308 */         double d17 = 0.5D - d12 * d12 - d13 * d13;
/* 309 */         double d4; if (d17 < 0.0D) { d4 = 0.0D;
/*     */         } else {
/* 311 */           d17 *= d17;
/* 312 */           d4 = d17 * d17 * a(e[i6], d12, d13);
/*     */         }
/* 314 */         double d18 = 0.5D - d14 * d14 - d15 * d15;
/* 315 */         double d5; if (d18 < 0.0D) { d5 = 0.0D;
/*     */         } else {
/* 317 */           d18 *= d18;
/* 318 */           d5 = d18 * d18 * a(e[i7], d14, d15);
/*     */         }
/*     */         
/*     */ 
/* 322 */         paramArrayOfDouble[(i++)] += 70.0D * (d3 + d4 + d5) * paramDouble5;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */