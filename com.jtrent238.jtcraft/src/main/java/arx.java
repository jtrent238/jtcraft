/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class arx
/*     */   extends arn
/*     */ {
/*     */   private aji a;
/*     */   
/*     */   public arx(aji paramaji)
/*     */   {
/*  15 */     this.a = paramaji;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     paramInt1 -= 8;
/*  21 */     paramInt3 -= 8;
/*  22 */     while ((paramInt2 > 5) && (paramahb.c(paramInt1, paramInt2, paramInt3)))
/*  23 */       paramInt2--;
/*  24 */     if (paramInt2 <= 4) {
/*  25 */       return false;
/*     */     }
/*     */     
/*  28 */     paramInt2 -= 4;
/*     */     
/*  30 */     boolean[] arrayOfBoolean = new boolean['ࠀ'];
/*     */     
/*  32 */     int i = paramRandom.nextInt(4) + 4;
/*  33 */     for (int j = 0; j < i; j++) {
/*  34 */       double d1 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*  35 */       double d2 = paramRandom.nextDouble() * 4.0D + 2.0D;
/*  36 */       double d3 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*     */       
/*  38 */       double d4 = paramRandom.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
/*  39 */       double d5 = paramRandom.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
/*  40 */       double d6 = paramRandom.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
/*     */       
/*  42 */       for (int i2 = 1; i2 < 15; i2++) {
/*  43 */         for (int i3 = 1; i3 < 15; i3++)
/*  44 */           for (int i4 = 1; i4 < 7; i4++) {
/*  45 */             double d7 = (i2 - d4) / (d1 / 2.0D);
/*  46 */             double d8 = (i4 - d5) / (d2 / 2.0D);
/*  47 */             double d9 = (i3 - d6) / (d3 / 2.0D);
/*  48 */             double d10 = d7 * d7 + d8 * d8 + d9 * d9;
/*  49 */             if (d10 < 1.0D) arrayOfBoolean[((i2 * 16 + i3) * 8 + i4)] = true;
/*     */           }
/*     */       }
/*     */     }
/*     */     int k;
/*     */     int m;
/*  55 */     for (j = 0; j < 16; j++) {
/*  56 */       for (k = 0; k < 16; k++) {
/*  57 */         for (m = 0; m < 8; m++) {
/*  58 */           int n = (arrayOfBoolean[((j * 16 + k) * 8 + m)] == 0) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)] != 0)) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)] != 0)) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)] != 0)) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)] != 0)) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))] != 0)) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))] != 0))) ? 1 : 0;
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */           if (n != 0) {
/*  66 */             awt localawt = paramahb.a(paramInt1 + j, paramInt2 + m, paramInt3 + k).o();
/*  67 */             if ((m >= 4) && (localawt.d())) return false;
/*  68 */             if ((m < 4) && (!localawt.a()) && (paramahb.a(paramInt1 + j, paramInt2 + m, paramInt3 + k) != this.a)) { return false;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  75 */     for (j = 0; j < 16; j++) {
/*  76 */       for (k = 0; k < 16; k++) {
/*  77 */         for (m = 0; m < 8; m++) {
/*  78 */           if (arrayOfBoolean[((j * 16 + k) * 8 + m)] != 0) {
/*  79 */             paramahb.d(paramInt1 + j, paramInt2 + m, paramInt3 + k, m >= 4 ? ajn.a : this.a, 0, 2);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  85 */     for (j = 0; j < 16; j++) {
/*  86 */       for (k = 0; k < 16; k++) {
/*  87 */         for (m = 4; m < 8; m++) {
/*  88 */           if ((arrayOfBoolean[((j * 16 + k) * 8 + m)] != 0) && 
/*  89 */             (paramahb.a(paramInt1 + j, paramInt2 + m - 1, paramInt3 + k) == ajn.d) && (paramahb.b(ahn.a, paramInt1 + j, paramInt2 + m, paramInt3 + k) > 0)) {
/*  90 */             ahu localahu = paramahb.a(paramInt1 + j, paramInt3 + k);
/*  91 */             if (localahu.ai == ajn.bh) paramahb.d(paramInt1 + j, paramInt2 + m - 1, paramInt3 + k, ajn.bh, 0, 2); else {
/*  92 */               paramahb.d(paramInt1 + j, paramInt2 + m - 1, paramInt3 + k, ajn.c, 0, 2);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  99 */     if (this.a.o() == awt.i) {
/* 100 */       for (j = 0; j < 16; j++) {
/* 101 */         for (k = 0; k < 16; k++) {
/* 102 */           for (m = 0; m < 8; m++) {
/* 103 */             int i1 = (arrayOfBoolean[((j * 16 + k) * 8 + m)] == 0) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)] != 0)) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)] != 0)) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)] != 0)) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)] != 0)) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))] != 0)) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))] != 0))) ? 1 : 0;
/*     */             
/*     */ 
/*     */ 
/*     */ 
/* 108 */             if ((i1 != 0) && 
/* 109 */               ((m < 4) || (paramRandom.nextInt(2) != 0)) && (paramahb.a(paramInt1 + j, paramInt2 + m, paramInt3 + k).o().a())) {
/* 110 */               paramahb.d(paramInt1 + j, paramInt2 + m, paramInt3 + k, ajn.b, 0, 2);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 118 */     if (this.a.o() == awt.h) {
/* 119 */       for (j = 0; j < 16; j++) {
/* 120 */         for (k = 0; k < 16; k++) {
/* 121 */           m = 4;
/* 122 */           if (paramahb.r(paramInt1 + j, paramInt2 + m, paramInt3 + k)) { paramahb.d(paramInt1 + j, paramInt2 + m, paramInt3 + k, ajn.aD, 0, 2);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 127 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */