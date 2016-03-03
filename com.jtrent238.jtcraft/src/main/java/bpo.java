/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import javax.vecmath.Matrix4f;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.BufferUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bpo
/*     */ {
/*  16 */   private static final Logger a = ;
/*     */   
/*     */ 
/*     */ 
/*     */   private int b;
/*     */   
/*     */ 
/*     */   private final int c;
/*     */   
/*     */ 
/*     */   private final int d;
/*     */   
/*     */ 
/*     */   private final IntBuffer e;
/*     */   
/*     */ 
/*     */   private final FloatBuffer f;
/*     */   
/*     */ 
/*     */   private final String g;
/*     */   
/*     */ 
/*     */   private boolean h;
/*     */   
/*     */ 
/*     */   private final bpi i;
/*     */   
/*     */ 
/*     */ 
/*     */   public bpo(String paramString, int paramInt1, int paramInt2, bpi parambpi)
/*     */   {
/*  47 */     this.g = paramString;
/*  48 */     this.c = paramInt2;
/*  49 */     this.d = paramInt1;
/*  50 */     this.i = parambpi;
/*  51 */     if (paramInt1 <= 3) {
/*  52 */       this.e = BufferUtils.createIntBuffer(paramInt2);
/*  53 */       this.f = null;
/*     */     } else {
/*  55 */       this.e = null;
/*  56 */       this.f = BufferUtils.createFloatBuffer(paramInt2);
/*     */     }
/*  58 */     this.b = -1;
/*  59 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*  63 */     this.h = true;
/*  64 */     if (this.i != null) {
/*  65 */       this.i.d();
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(String paramString) {
/*  70 */     int j = -1;
/*     */     
/*  72 */     if (paramString.equals("int")) {
/*  73 */       j = 0;
/*  74 */     } else if (paramString.equals("float")) {
/*  75 */       j = 4;
/*  76 */     } else if (paramString.startsWith("matrix")) {
/*  77 */       if (paramString.endsWith("2x2")) {
/*  78 */         j = 8;
/*  79 */       } else if (paramString.endsWith("3x3")) {
/*  80 */         j = 9;
/*  81 */       } else if (paramString.endsWith("4x4")) {
/*  82 */         j = 10;
/*     */       }
/*     */     }
/*     */     
/*  86 */     return j;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  90 */     this.b = paramInt;
/*     */   }
/*     */   
/*     */   public String a() {
/*  94 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*  98 */     this.f.position(0);
/*  99 */     this.f.put(0, paramFloat);
/* 100 */     h();
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 104 */     this.f.position(0);
/* 105 */     this.f.put(0, paramFloat1);
/* 106 */     this.f.put(1, paramFloat2);
/* 107 */     h();
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
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 124 */     this.f.position(0);
/* 125 */     this.f.put(0, paramFloat1);
/* 126 */     this.f.put(1, paramFloat2);
/* 127 */     this.f.put(2, paramFloat3);
/* 128 */     h();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/*     */   {
/* 140 */     this.f.position(0);
/* 141 */     this.f.put(paramFloat1);
/* 142 */     this.f.put(paramFloat2);
/* 143 */     this.f.put(paramFloat3);
/* 144 */     this.f.put(paramFloat4);
/* 145 */     this.f.flip();
/* 146 */     h();
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
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/*     */   {
/* 159 */     this.f.position(0);
/* 160 */     if (this.d >= 4) {
/* 161 */       this.f.put(0, paramFloat1);
/*     */     }
/* 163 */     if (this.d >= 5) {
/* 164 */       this.f.put(1, paramFloat2);
/*     */     }
/* 166 */     if (this.d >= 6) {
/* 167 */       this.f.put(2, paramFloat3);
/*     */     }
/* 169 */     if (this.d >= 7) {
/* 170 */       this.f.put(3, paramFloat4);
/*     */     }
/* 172 */     h();
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 176 */     this.e.position(0);
/* 177 */     if (this.d >= 0) {
/* 178 */       this.e.put(0, paramInt1);
/*     */     }
/* 180 */     if (this.d >= 1) {
/* 181 */       this.e.put(1, paramInt2);
/*     */     }
/* 183 */     if (this.d >= 2) {
/* 184 */       this.e.put(2, paramInt3);
/*     */     }
/* 186 */     if (this.d >= 3) {
/* 187 */       this.e.put(3, paramInt4);
/*     */     }
/* 189 */     h();
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
/*     */   public void a(float[] paramArrayOfFloat)
/*     */   {
/* 223 */     if (paramArrayOfFloat.length < this.c) {
/* 224 */       a.warn("Uniform.set called with a too-small value array (expected " + this.c + ", got " + paramArrayOfFloat.length + "). Ignoring.");
/*     */       
/* 226 */       return;
/*     */     }
/*     */     
/* 229 */     this.f.position(0);
/* 230 */     this.f.put(paramArrayOfFloat);
/* 231 */     this.f.position(0);
/* 232 */     h();
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
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
/*     */   {
/* 358 */     this.f.position(0);
/* 359 */     this.f.put(0, paramFloat1);
/* 360 */     this.f.put(1, paramFloat2);
/* 361 */     this.f.put(2, paramFloat3);
/* 362 */     this.f.put(3, paramFloat4);
/* 363 */     this.f.put(4, paramFloat5);
/* 364 */     this.f.put(5, paramFloat6);
/* 365 */     this.f.put(6, paramFloat7);
/* 366 */     this.f.put(7, paramFloat8);
/* 367 */     this.f.put(8, paramFloat9);
/* 368 */     this.f.put(9, paramFloat10);
/* 369 */     this.f.put(10, paramFloat11);
/* 370 */     this.f.put(11, paramFloat12);
/* 371 */     this.f.put(12, paramFloat13);
/* 372 */     this.f.put(13, paramFloat14);
/* 373 */     this.f.put(14, paramFloat15);
/* 374 */     this.f.put(15, paramFloat16);
/* 375 */     h();
/*     */   }
/*     */   
/*     */   public void a(Matrix4f paramMatrix4f) {
/* 379 */     a(paramMatrix4f.m00, paramMatrix4f.m01, paramMatrix4f.m02, paramMatrix4f.m03, paramMatrix4f.m10, paramMatrix4f.m11, paramMatrix4f.m12, paramMatrix4f.m13, paramMatrix4f.m20, paramMatrix4f.m21, paramMatrix4f.m22, paramMatrix4f.m23, paramMatrix4f.m30, paramMatrix4f.m31, paramMatrix4f.m32, paramMatrix4f.m33);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void b()
/*     */   {
/* 386 */     if (!this.h) {}
/*     */     
/*     */ 
/*     */ 
/* 390 */     this.h = false;
/*     */     
/* 392 */     if (this.d <= 3) {
/* 393 */       i();
/* 394 */     } else if (this.d <= 7) {
/* 395 */       j();
/* 396 */     } else if (this.d <= 10) {
/* 397 */       k();
/*     */     } else {
/* 399 */       a.warn("Uniform.upload called, but type value (" + this.d + ") is not " + "a valid type. Ignoring.");
/* 400 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   private void i() {
/* 405 */     switch (this.d) {
/*     */     case 0: 
/* 407 */       buu.a(this.b, this.e);
/* 408 */       break;
/*     */     case 1: 
/* 410 */       buu.b(this.b, this.e);
/* 411 */       break;
/*     */     case 2: 
/* 413 */       buu.c(this.b, this.e);
/* 414 */       break;
/*     */     case 3: 
/* 416 */       buu.d(this.b, this.e);
/* 417 */       break;
/*     */     default: 
/* 419 */       a.warn("Uniform.upload called, but count value (" + this.c + ") is " + " not in the range of 1 to 4. Ignoring.");
/*     */     }
/*     */   }
/*     */   
/*     */   private void j()
/*     */   {
/* 425 */     switch (this.d) {
/*     */     case 4: 
/* 427 */       buu.a(this.b, this.f);
/* 428 */       break;
/*     */     case 5: 
/* 430 */       buu.b(this.b, this.f);
/* 431 */       break;
/*     */     case 6: 
/* 433 */       buu.c(this.b, this.f);
/* 434 */       break;
/*     */     case 7: 
/* 436 */       buu.d(this.b, this.f);
/* 437 */       break;
/*     */     default: 
/* 439 */       a.warn("Uniform.upload called, but count value (" + this.c + ") is " + "not in the range of 1 to 4. Ignoring.");
/*     */     }
/*     */   }
/*     */   
/*     */   private void k()
/*     */   {
/* 445 */     switch (this.d) {
/*     */     case 8: 
/* 447 */       buu.a(this.b, true, this.f);
/* 448 */       break;
/*     */     case 9: 
/* 450 */       buu.b(this.b, true, this.f);
/* 451 */       break;
/*     */     case 10: 
/* 453 */       buu.c(this.b, true, this.f);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */