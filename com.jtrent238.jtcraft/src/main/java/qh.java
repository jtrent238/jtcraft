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
/*     */ public class qh
/*     */ {
/*  18 */   private static float[] a = new float[65536];
/*  19 */   static { for (int i = 0; i < 65536; i++) {
/*  20 */       a[i] = ((float)Math.sin(i * 3.141592653589793D * 2.0D / 65536.0D));
/*     */     }
/*     */   }
/*     */   
/*     */   public static final float a(float paramFloat) {
/*  25 */     return a[((int)(paramFloat * 10430.378F) & 0xFFFF)];
/*     */   }
/*     */   
/*     */   public static final float b(float paramFloat) {
/*  29 */     return a[((int)(paramFloat * 10430.378F + 16384.0F) & 0xFFFF)];
/*     */   }
/*     */   
/*     */   public static final float c(float paramFloat) {
/*  33 */     return (float)Math.sqrt(paramFloat);
/*     */   }
/*     */   
/*     */   public static final float a(double paramDouble) {
/*  37 */     return (float)Math.sqrt(paramDouble);
/*     */   }
/*     */   
/*     */   public static int d(float paramFloat) {
/*  41 */     int i = (int)paramFloat;
/*  42 */     return paramFloat < i ? i - 1 : i;
/*     */   }
/*     */   
/*     */   public static int b(double paramDouble) {
/*  46 */     return (int)(paramDouble + 1024.0D) - 1024;
/*     */   }
/*     */   
/*     */   public static int c(double paramDouble) {
/*  50 */     int i = (int)paramDouble;
/*  51 */     return paramDouble < i ? i - 1 : i;
/*     */   }
/*     */   
/*     */   public static long d(double paramDouble) {
/*  55 */     long l = paramDouble;
/*  56 */     return paramDouble < l ? l - 1L : l;
/*     */   }
/*     */   
/*     */   public static int e(double paramDouble) {
/*  60 */     return (int)(paramDouble >= 0.0D ? paramDouble : -paramDouble + 1.0D);
/*     */   }
/*     */   
/*     */   public static float e(float paramFloat) {
/*  64 */     return paramFloat >= 0.0F ? paramFloat : -paramFloat;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt) {
/*  68 */     return paramInt >= 0 ? paramInt : -paramInt;
/*     */   }
/*     */   
/*     */   public static int f(float paramFloat) {
/*  72 */     int i = (int)paramFloat;
/*  73 */     return paramFloat > i ? i + 1 : i;
/*     */   }
/*     */   
/*     */   public static int f(double paramDouble) {
/*  77 */     int i = (int)paramDouble;
/*  78 */     return paramDouble > i ? i + 1 : i;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, int paramInt2, int paramInt3) {
/*  82 */     if (paramInt1 < paramInt2) {
/*  83 */       return paramInt2;
/*     */     }
/*  85 */     if (paramInt1 > paramInt3) {
/*  86 */       return paramInt3;
/*     */     }
/*  88 */     return paramInt1;
/*     */   }
/*     */   
/*     */   public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  92 */     if (paramFloat1 < paramFloat2) {
/*  93 */       return paramFloat2;
/*     */     }
/*  95 */     if (paramFloat1 > paramFloat3) {
/*  96 */       return paramFloat3;
/*     */     }
/*  98 */     return paramFloat1;
/*     */   }
/*     */   
/*     */   public static double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 102 */     if (paramDouble1 < paramDouble2) {
/* 103 */       return paramDouble2;
/*     */     }
/* 105 */     if (paramDouble1 > paramDouble3) {
/* 106 */       return paramDouble3;
/*     */     }
/* 108 */     return paramDouble1;
/*     */   }
/*     */   
/*     */   public static double b(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 112 */     if (paramDouble3 < 0.0D) {
/* 113 */       return paramDouble1;
/*     */     }
/* 115 */     if (paramDouble3 > 1.0D) {
/* 116 */       return paramDouble2;
/*     */     }
/* 118 */     return paramDouble1 + (paramDouble2 - paramDouble1) * paramDouble3;
/*     */   }
/*     */   
/*     */   public static double a(double paramDouble1, double paramDouble2) {
/* 122 */     if (paramDouble1 < 0.0D) paramDouble1 = -paramDouble1;
/* 123 */     if (paramDouble2 < 0.0D) paramDouble2 = -paramDouble2;
/* 124 */     return paramDouble1 > paramDouble2 ? paramDouble1 : paramDouble2;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt1, int paramInt2) {
/* 128 */     if (paramInt1 < 0) return -((-paramInt1 - 1) / paramInt2) - 1;
/* 129 */     return paramInt1 / paramInt2;
/*     */   }
/*     */   
/*     */   public static boolean a(String paramString) {
/* 133 */     return (paramString == null) || (paramString.length() == 0);
/*     */   }
/*     */   
/*     */   public static int a(Random paramRandom, int paramInt1, int paramInt2) {
/* 137 */     if (paramInt1 >= paramInt2) {
/* 138 */       return paramInt1;
/*     */     }
/* 140 */     return paramRandom.nextInt(paramInt2 - paramInt1 + 1) + paramInt1;
/*     */   }
/*     */   
/*     */   public static float a(Random paramRandom, float paramFloat1, float paramFloat2) {
/* 144 */     if (paramFloat1 >= paramFloat2) return paramFloat1;
/* 145 */     return paramRandom.nextFloat() * (paramFloat2 - paramFloat1) + paramFloat1;
/*     */   }
/*     */   
/*     */   public static double a(Random paramRandom, double paramDouble1, double paramDouble2) {
/* 149 */     if (paramDouble1 >= paramDouble2) return paramDouble1;
/* 150 */     return paramRandom.nextDouble() * (paramDouble2 - paramDouble1) + paramDouble1;
/*     */   }
/*     */   
/*     */   public static double a(long[] paramArrayOfLong) {
/* 154 */     long l1 = 0L;
/*     */     
/* 156 */     for (long l2 : paramArrayOfLong) {
/* 157 */       l1 += l2;
/*     */     }
/*     */     
/* 160 */     return l1 / paramArrayOfLong.length;
/*     */   }
/*     */   
/*     */   public static float g(float paramFloat) {
/* 164 */     paramFloat %= 360.0F;
/* 165 */     if (paramFloat >= 180.0F) paramFloat -= 360.0F;
/* 166 */     if (paramFloat < -180.0F) paramFloat += 360.0F;
/* 167 */     return paramFloat;
/*     */   }
/*     */   
/*     */   public static double g(double paramDouble) {
/* 171 */     paramDouble %= 360.0D;
/* 172 */     if (paramDouble >= 180.0D) paramDouble -= 360.0D;
/* 173 */     if (paramDouble < -180.0D) paramDouble += 360.0D;
/* 174 */     return paramDouble;
/*     */   }
/*     */   
/*     */   public static int a(String paramString, int paramInt) {
/* 178 */     int i = paramInt;
/*     */     try
/*     */     {
/* 181 */       i = Integer.parseInt(paramString);
/*     */     }
/*     */     catch (Throwable localThrowable) {}
/*     */     
/* 185 */     return i;
/*     */   }
/*     */   
/*     */   public static int a(String paramString, int paramInt1, int paramInt2) {
/* 189 */     int i = paramInt1;
/*     */     try
/*     */     {
/* 192 */       i = Integer.parseInt(paramString);
/*     */     }
/*     */     catch (Throwable localThrowable) {}
/*     */     
/* 196 */     if (i < paramInt2) i = paramInt2;
/* 197 */     return i;
/*     */   }
/*     */   
/*     */   public static double a(String paramString, double paramDouble) {
/* 201 */     double d = paramDouble;
/*     */     try
/*     */     {
/* 204 */       d = Double.parseDouble(paramString);
/*     */     }
/*     */     catch (Throwable localThrowable) {}
/*     */     
/* 208 */     return d;
/*     */   }
/*     */   
/*     */   public static double a(String paramString, double paramDouble1, double paramDouble2) {
/* 212 */     double d = paramDouble1;
/*     */     try
/*     */     {
/* 215 */       d = Double.parseDouble(paramString);
/*     */     }
/*     */     catch (Throwable localThrowable) {}
/*     */     
/* 219 */     if (d < paramDouble2) d = paramDouble2;
/* 220 */     return d;
/*     */   }
/*     */   
/*     */   public static int b(int paramInt)
/*     */   {
/* 225 */     int i = paramInt - 1;
/* 226 */     i |= i >> 1;
/* 227 */     i |= i >> 2;
/* 228 */     i |= i >> 4;
/* 229 */     i |= i >> 8;
/* 230 */     i |= i >> 16;
/* 231 */     return i + 1;
/*     */   }
/*     */   
/*     */   private static boolean d(int paramInt)
/*     */   {
/* 236 */     return (paramInt != 0) && ((paramInt & paramInt - 1) == 0);
/*     */   }
/*     */   
/*     */ 
/* 240 */   private static final int[] b = { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
/*     */   
/*     */ 
/*     */ 
/*     */   private static int e(int paramInt)
/*     */   {
/* 246 */     paramInt = d(paramInt) ? paramInt : b(paramInt);
/* 247 */     return b[((int)(paramInt * 125613361L >> 27) & 0x1F)];
/*     */   }
/*     */   
/*     */   public static int c(int paramInt) {
/* 251 */     return e(paramInt) - (d(paramInt) ? 0 : 1);
/*     */   }
/*     */   
/*     */   public static int b(int paramInt1, int paramInt2) {
/* 255 */     if (paramInt2 == 0) { return 0;
/*     */     }
/* 257 */     if (paramInt1 < 0) {
/* 258 */       paramInt2 *= -1;
/*     */     }
/*     */     
/* 261 */     int i = paramInt1 % paramInt2;
/* 262 */     if (i == 0) {
/* 263 */       return paramInt1;
/*     */     }
/* 265 */     return paramInt1 + paramInt2 - i;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */