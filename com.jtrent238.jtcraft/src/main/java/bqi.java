/*     */ import java.awt.image.BufferedImage;
/*     */ import java.nio.Buffer;
/*     */ import java.nio.IntBuffer;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bqi
/*     */ {
/*  25 */   private static final Logger c = ;
/*     */   
/*  27 */   private static final IntBuffer d = ban.f(4194304);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  32 */   public static final bpq a = new bpq(16, 16);
/*  33 */   public static final int[] b = a.d();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  39 */   private static int e = -1;
/*  40 */   private static int f = -1;
/*  41 */   private static float g = -1.0F;
/*     */   
/*     */   static {
/*  44 */     int i = -16777216;
/*  45 */     int j = -524040;
/*  46 */     int[] arrayOfInt1 = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
/*  47 */     int[] arrayOfInt2 = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
/*  48 */     int k = arrayOfInt1.length;
/*  49 */     for (int m = 0; m < 16; m++) {
/*  50 */       System.arraycopy(m < k ? arrayOfInt1 : arrayOfInt2, 0, b, 16 * m, k);
/*  51 */       System.arraycopy(m < k ? arrayOfInt2 : arrayOfInt1, 0, b, 16 * m + k, k);
/*     */     }
/*  53 */     a.a();
/*     */   }
/*     */   
/*     */   public static int a() {
/*  57 */     return GL11.glGenTextures();
/*     */   }
/*     */   
/*     */   public static void a(int paramInt) {
/*  61 */     GL11.glDeleteTextures(paramInt);
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, BufferedImage paramBufferedImage) {
/*  65 */     return a(paramInt, paramBufferedImage, false, false);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3) {
/*  69 */     b(paramInt1);
/*     */     
/*  71 */     a(0, paramArrayOfInt, paramInt2, paramInt3, 0, 0, false, false, false);
/*     */   }
/*     */   
/*     */   public static int[][] a(int paramInt1, int paramInt2, int[][] paramArrayOfInt) {
/*  75 */     int[][] arrayOfInt = new int[paramInt1 + 1][];
/*  76 */     arrayOfInt[0] = paramArrayOfInt[0];
/*     */     
/*  78 */     if (paramInt1 > 0)
/*     */     {
/*  80 */       boolean bool = false;
/*  81 */       for (int i = 0; i < paramArrayOfInt.length; i++) {
/*  82 */         if (paramArrayOfInt[0][i] >> 24 == 0) {
/*  83 */           bool = true;
/*  84 */           break;
/*     */         }
/*     */       }
/*     */       
/*  88 */       for (i = 1; i <= paramInt1; i++)
/*     */       {
/*  90 */         if (paramArrayOfInt[i] != null) {
/*  91 */           arrayOfInt[i] = paramArrayOfInt[i];
/*     */         }
/*     */         else
/*     */         {
/*  95 */           int[] arrayOfInt1 = arrayOfInt[(i - 1)];
/*  96 */           int[] arrayOfInt2 = new int[arrayOfInt1.length >> 2];
/*     */           
/*  98 */           int j = paramInt2 >> i;
/*  99 */           int k = arrayOfInt2.length / j;
/* 100 */           int m = j << 1;
/*     */           
/* 102 */           for (int n = 0; n < j; n++) {
/* 103 */             for (int i1 = 0; i1 < k; i1++) {
/* 104 */               int i2 = 2 * (n + i1 * m);
/* 105 */               arrayOfInt2[(n + i1 * j)] = a(arrayOfInt1[(i2 + 0)], arrayOfInt1[(i2 + 1)], arrayOfInt1[(i2 + 0 + m)], arrayOfInt1[(i2 + 1 + m)], bool);
/*     */             }
/*     */           }
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 115 */           arrayOfInt[i] = arrayOfInt2;
/*     */         }
/*     */       }
/*     */     }
/* 119 */     return arrayOfInt;
/*     */   }
/*     */   
/* 122 */   private static final int[] h = new int[4];
/*     */   
/* 124 */   private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) { if (!paramBoolean) {
/* 125 */       int i = a(paramInt1, paramInt2, paramInt3, paramInt4, 24);
/* 126 */       int j = a(paramInt1, paramInt2, paramInt3, paramInt4, 16);
/* 127 */       int k = a(paramInt1, paramInt2, paramInt3, paramInt4, 8);
/* 128 */       int m = a(paramInt1, paramInt2, paramInt3, paramInt4, 0);
/*     */       
/* 130 */       return i << 24 | j << 16 | k << 8 | m;
/*     */     }
/* 132 */     h[0] = paramInt1;
/* 133 */     h[1] = paramInt2;
/* 134 */     h[2] = paramInt3;
/* 135 */     h[3] = paramInt4;
/*     */     
/* 137 */     float f1 = 0.0F;
/* 138 */     float f2 = 0.0F;
/* 139 */     float f3 = 0.0F;
/* 140 */     float f4 = 0.0F;
/*     */     
/* 142 */     for (int n = 0; n < 4; n++) {
/* 143 */       if (h[n] >> 24 != 0) {
/* 144 */         f1 += (float)Math.pow((h[n] >> 24 & 0xFF) / 255.0F, 2.2D);
/* 145 */         f2 += (float)Math.pow((h[n] >> 16 & 0xFF) / 255.0F, 2.2D);
/* 146 */         f3 += (float)Math.pow((h[n] >> 8 & 0xFF) / 255.0F, 2.2D);
/* 147 */         f4 += (float)Math.pow((h[n] >> 0 & 0xFF) / 255.0F, 2.2D);
/*     */       }
/*     */     }
/*     */     
/* 151 */     f1 /= 4.0F;
/* 152 */     f2 /= 4.0F;
/* 153 */     f3 /= 4.0F;
/* 154 */     f4 /= 4.0F;
/*     */     
/* 156 */     n = (int)(Math.pow(f1, 0.45454545454545453D) * 255.0D);
/* 157 */     int i1 = (int)(Math.pow(f2, 0.45454545454545453D) * 255.0D);
/* 158 */     int i2 = (int)(Math.pow(f3, 0.45454545454545453D) * 255.0D);
/* 159 */     int i3 = (int)(Math.pow(f4, 0.45454545454545453D) * 255.0D);
/*     */     
/* 161 */     if (n < 96) {
/* 162 */       n = 0;
/*     */     }
/* 164 */     return n << 24 | i1 << 16 | i2 << 8 | i3;
/*     */   }
/*     */   
/*     */   private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 169 */     float f1 = (float)Math.pow((paramInt1 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 170 */     float f2 = (float)Math.pow((paramInt2 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 171 */     float f3 = (float)Math.pow((paramInt3 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 172 */     float f4 = (float)Math.pow((paramInt4 >> paramInt5 & 0xFF) / 255.0F, 2.2D);
/* 173 */     float f5 = (float)Math.pow((f1 + f2 + f3 + f4) * 0.25D, 0.45454545454545453D);
/*     */     
/* 175 */     return (int)(f5 * 255.0D);
/*     */   }
/*     */   
/*     */   public static void a(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2) {
/* 179 */     for (int i = 0; i < paramArrayOfInt.length; i++) {
/* 180 */       int[] arrayOfInt = paramArrayOfInt[i];
/*     */       
/* 182 */       a(i, arrayOfInt, paramInt1 >> i, paramInt2 >> i, paramInt3 >> i, paramInt4 >> i, paramBoolean1, paramBoolean2, paramArrayOfInt.length > 1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/* 187 */     int i = 4194304 / paramInt2;
/*     */     
/* 189 */     a(paramBoolean1, paramBoolean3);
/* 190 */     a(paramBoolean2);
/*     */     
/* 192 */     int j = 0;
/* 193 */     while (j < paramInt2 * paramInt3) {
/* 194 */       int k = j / paramInt2;
/* 195 */       int m = Math.min(i, paramInt3 - k);
/* 196 */       int n = paramInt2 * m;
/*     */       
/* 198 */       b(paramArrayOfInt, j, n);
/*     */       
/* 200 */       GL11.glTexSubImage2D(3553, paramInt1, paramInt4, paramInt5 + k, paramInt2, m, 32993, 33639, d);
/*     */       
/* 202 */       j += paramInt2 * m;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, BufferedImage paramBufferedImage, boolean paramBoolean1, boolean paramBoolean2) {
/* 207 */     a(paramInt, paramBufferedImage.getWidth(), paramBufferedImage.getHeight());
/*     */     
/* 209 */     return a(paramInt, paramBufferedImage, 0, 0, paramBoolean1, paramBoolean2);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3) {
/* 213 */     a(paramInt1, 0, paramInt2, paramInt3, 1.0F);
/*     */   }
/*     */   
/*     */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
/*     */   {
/* 218 */     a(paramInt1);
/*     */     
/* 220 */     b(paramInt1);
/*     */     
/* 222 */     if (buu.s) {
/* 223 */       GL11.glTexParameterf(3553, 34046, paramFloat);
/*     */     }
/*     */     
/* 226 */     if (paramInt2 > 0) {
/* 227 */       GL11.glTexParameteri(3553, 33085, paramInt2);
/* 228 */       GL11.glTexParameterf(3553, 33082, 0.0F);
/* 229 */       GL11.glTexParameterf(3553, 33083, paramInt2);
/* 230 */       GL11.glTexParameterf(3553, 34049, 0.0F);
/*     */     }
/*     */     
/* 233 */     for (int i = 0; i <= paramInt2; i++) {
/* 234 */       GL11.glTexImage2D(3553, i, 6408, paramInt3 >> i, paramInt4 >> i, 0, 32993, 33639, (IntBuffer)null);
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
/*     */   public static int a(int paramInt1, BufferedImage paramBufferedImage, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/* 277 */     b(paramInt1);
/*     */     
/* 279 */     a(paramBufferedImage, paramInt2, paramInt3, paramBoolean1, paramBoolean2);
/*     */     
/* 281 */     return paramInt1;
/*     */   }
/*     */   
/*     */   private static void a(BufferedImage paramBufferedImage, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/* 285 */     int i = paramBufferedImage.getWidth();
/* 286 */     int j = paramBufferedImage.getHeight();
/*     */     
/* 288 */     int k = 4194304 / i;
/* 289 */     int[] arrayOfInt = new int[k * i];
/*     */     
/* 291 */     b(paramBoolean1);
/* 292 */     a(paramBoolean2);
/*     */     
/* 294 */     int m = 0;
/* 295 */     while (m < i * j) {
/* 296 */       int n = m / i;
/* 297 */       int i1 = Math.min(k, j - n);
/* 298 */       int i2 = i * i1;
/*     */       
/* 300 */       paramBufferedImage.getRGB(0, n, i, i1, arrayOfInt, 0, i);
/*     */       
/* 302 */       a(arrayOfInt, i2);
/*     */       
/* 304 */       GL11.glTexSubImage2D(3553, 0, paramInt1, paramInt2 + n, i, i1, 32993, 33639, d);
/*     */       
/* 306 */       m += i * k;
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(boolean paramBoolean) {
/* 311 */     if (paramBoolean) {
/* 312 */       GL11.glTexParameteri(3553, 10242, 10496);
/* 313 */       GL11.glTexParameteri(3553, 10243, 10496);
/*     */     } else {
/* 315 */       GL11.glTexParameteri(3553, 10242, 10497);
/* 316 */       GL11.glTexParameteri(3553, 10243, 10497);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void b(boolean paramBoolean) {
/* 321 */     a(paramBoolean, false);
/*     */   }
/*     */   
/*     */   public static void a(boolean paramBoolean1, boolean paramBoolean2, float paramFloat) {
/* 325 */     e = GL11.glGetTexParameteri(3553, 10241);
/* 326 */     f = GL11.glGetTexParameteri(3553, 10240);
/* 327 */     g = GL11.glGetTexParameterf(3553, 34046);
/* 328 */     a(paramBoolean1, paramBoolean2);
/* 329 */     a(paramFloat);
/*     */   }
/*     */   
/*     */   public static void b() {
/* 333 */     if ((e < 0) || (f < 0) || (g < 0.0F)) {
/* 334 */       return;
/*     */     }
/* 336 */     b(e, f);
/* 337 */     a(g);
/* 338 */     g = -1.0F;
/* 339 */     e = -1;
/* 340 */     f = -1;
/*     */   }
/*     */   
/*     */   private static void b(int paramInt1, int paramInt2) {
/* 344 */     GL11.glTexParameteri(3553, 10241, paramInt1);
/* 345 */     GL11.glTexParameteri(3553, 10240, paramInt2);
/*     */   }
/*     */   
/*     */   private static void a(float paramFloat) {
/* 349 */     GL11.glTexParameterf(3553, 34046, paramFloat);
/*     */   }
/*     */   
/*     */   private static void a(boolean paramBoolean1, boolean paramBoolean2) {
/* 353 */     if (paramBoolean1) {
/* 354 */       GL11.glTexParameteri(3553, 10241, paramBoolean2 ? 9987 : 9729);
/* 355 */       GL11.glTexParameteri(3553, 10240, 9729);
/*     */     } else {
/* 357 */       GL11.glTexParameteri(3553, 10241, paramBoolean2 ? 9986 : 9728);
/* 358 */       GL11.glTexParameteri(3553, 10240, 9728);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(int[] paramArrayOfInt, int paramInt) {
/* 363 */     b(paramArrayOfInt, 0, paramInt);
/*     */   }
/*     */   
/*     */   private static void b(int[] paramArrayOfInt, int paramInt1, int paramInt2) {
/* 367 */     int[] arrayOfInt = paramArrayOfInt;
/*     */     
/* 369 */     if (bao.B().u.e) {
/* 370 */       arrayOfInt = a(paramArrayOfInt);
/*     */     }
/*     */     
/* 373 */     d.clear();
/* 374 */     d.put(arrayOfInt, paramInt1, paramInt2);
/* 375 */     d.position(0).limit(paramInt2);
/*     */   }
/*     */   
/*     */   static void b(int paramInt) {
/* 379 */     GL11.glBindTexture(3553, paramInt);
/*     */   }
/*     */   
/*     */   public static int[] a(bqy parambqy, bqx parambqx) {
/* 383 */     BufferedImage localBufferedImage = ImageIO.read(parambqy.a(parambqx).b());
/*     */     
/* 385 */     int i = localBufferedImage.getWidth();
/* 386 */     int j = localBufferedImage.getHeight();
/*     */     
/* 388 */     int[] arrayOfInt = new int[i * j];
/* 389 */     localBufferedImage.getRGB(0, 0, i, j, arrayOfInt, 0, i);
/*     */     
/* 391 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   public static int[] a(int[] paramArrayOfInt) {
/* 395 */     int[] arrayOfInt = new int[paramArrayOfInt.length];
/* 396 */     for (int i = 0; i < paramArrayOfInt.length; i++) {
/* 397 */       int j = paramArrayOfInt[i] >> 24 & 0xFF;
/* 398 */       int k = paramArrayOfInt[i] >> 16 & 0xFF;
/* 399 */       int m = paramArrayOfInt[i] >> 8 & 0xFF;
/* 400 */       int n = paramArrayOfInt[i] & 0xFF;
/*     */       
/* 402 */       int i1 = (k * 30 + m * 59 + n * 11) / 100;
/* 403 */       int i2 = (k * 30 + m * 70) / 100;
/* 404 */       int i3 = (k * 30 + n * 70) / 100;
/*     */       
/* 406 */       arrayOfInt[i] = (j << 24 | i1 << 16 | i2 << 8 | i3);
/*     */     }
/*     */     
/* 409 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   public static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3) {
/* 413 */     int i = paramInt1 + 2 * paramInt3;
/*     */     int k;
/* 415 */     for (int j = paramInt2 - 1; j >= 0; j--) {
/* 416 */       k = j * paramInt1;
/* 417 */       int m = paramInt3 + (j + paramInt3) * i;
/*     */       
/*     */ 
/* 420 */       for (int n = 0; n < paramInt3; n += paramInt1) {
/* 421 */         int i1 = Math.min(paramInt1, paramInt3 - n);
/*     */         
/* 423 */         System.arraycopy(paramArrayOfInt, k + paramInt1 - i1, paramArrayOfInt, m - n - i1, i1);
/*     */       }
/*     */       
/* 426 */       System.arraycopy(paramArrayOfInt, k, paramArrayOfInt, m, paramInt1);
/*     */       
/*     */ 
/* 429 */       for (n = 0; n < paramInt3; n += paramInt1) {
/* 430 */         System.arraycopy(paramArrayOfInt, k, paramArrayOfInt, m + paramInt1 + n, Math.min(paramInt1, paramInt3 - n));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 435 */     for (j = 0; j < paramInt3; j += paramInt2) {
/* 436 */       k = Math.min(paramInt2, paramInt3 - j);
/* 437 */       System.arraycopy(paramArrayOfInt, (paramInt3 + paramInt2 - k) * i, paramArrayOfInt, (paramInt3 - j - k) * i, i * k);
/*     */     }
/*     */     
/*     */ 
/* 441 */     for (j = 0; j < paramInt3; j += paramInt2) {
/* 442 */       k = Math.min(paramInt2, paramInt3 - j);
/* 443 */       System.arraycopy(paramArrayOfInt, paramInt3 * i, paramArrayOfInt, (paramInt2 + paramInt3 + j) * i, i * k);
/*     */     }
/*     */     
/* 446 */     return paramArrayOfInt;
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
/*     */   public static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
/*     */   {
/* 481 */     int[] arrayOfInt = new int[paramInt1];
/* 482 */     int i = paramInt2 / 2;
/* 483 */     for (int j = 0; j < i; j++) {
/* 484 */       System.arraycopy(paramArrayOfInt, j * paramInt1, arrayOfInt, 0, paramInt1);
/* 485 */       System.arraycopy(paramArrayOfInt, (paramInt2 - 1 - j) * paramInt1, paramArrayOfInt, j * paramInt1, paramInt1);
/* 486 */       System.arraycopy(arrayOfInt, 0, paramArrayOfInt, (paramInt2 - 1 - j) * paramInt1, paramInt1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */