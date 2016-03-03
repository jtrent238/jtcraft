/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aso
/*     */   extends arc
/*     */ {
/*     */   public aso()
/*     */   {
/*  12 */     super(false);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  17 */     int i = paramRandom.nextInt(4) + 5;
/*  18 */     while (paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o() == awt.h) {
/*  19 */       paramInt2--;
/*     */     }
/*  21 */     int j = 1;
/*  22 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) return false;
/*     */     int n;
/*  24 */     int i2; for (int k = paramInt2; k <= paramInt2 + 1 + i; k++) {
/*  25 */       m = 1;
/*  26 */       if (k == paramInt2) m = 0;
/*  27 */       if (k >= paramInt2 + 1 + i - 2) m = 3;
/*  28 */       for (n = paramInt1 - m; (n <= paramInt1 + m) && (j != 0); n++) {
/*  29 */         for (i2 = paramInt3 - m; (i2 <= paramInt3 + m) && (j != 0); i2++) {
/*  30 */           if ((k >= 0) && (k < 256)) {
/*  31 */             aji localaji3 = paramahb.a(n, k, i2);
/*  32 */             if ((localaji3.o() != awt.a) && (localaji3.o() != awt.j)) {
/*  33 */               if ((localaji3 == ajn.j) || (localaji3 == ajn.i)) {
/*  34 */                 if (k > paramInt2) j = 0;
/*     */               } else {
/*  36 */                 j = 0;
/*     */               }
/*     */             }
/*     */           } else {
/*  40 */             j = 0;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  46 */     if (j == 0) { return false;
/*     */     }
/*  48 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  49 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d)) || (paramInt2 >= 256 - i - 1)) {
/*  50 */       return false;
/*     */     }
/*  52 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*     */     int i3;
/*  54 */     int i4; for (int m = paramInt2 - 3 + i; m <= paramInt2 + i; m++) {
/*  55 */       n = m - (paramInt2 + i);
/*  56 */       i2 = 2 - n / 2;
/*  57 */       for (i3 = paramInt1 - i2; i3 <= paramInt1 + i2; i3++) {
/*  58 */         i4 = i3 - paramInt1;
/*  59 */         for (int i5 = paramInt3 - i2; i5 <= paramInt3 + i2; i5++) {
/*  60 */           int i6 = i5 - paramInt3;
/*  61 */           if (((Math.abs(i4) != i2) || (Math.abs(i6) != i2) || ((paramRandom.nextInt(2) != 0) && (n != 0))) && 
/*  62 */             (!paramahb.a(i3, m, i5).j())) { a(paramahb, i3, m, i5, ajn.t);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  67 */     for (m = 0; m < i; m++) {
/*  68 */       aji localaji2 = paramahb.a(paramInt1, paramInt2 + m, paramInt3);
/*  69 */       if ((localaji2.o() == awt.a) || (localaji2.o() == awt.j) || (localaji2 == ajn.i) || (localaji2 == ajn.j)) {
/*  70 */         a(paramahb, paramInt1, paramInt2 + m, paramInt3, ajn.r);
/*     */       }
/*     */     }
/*  73 */     for (m = paramInt2 - 3 + i; m <= paramInt2 + i; m++) {
/*  74 */       int i1 = m - (paramInt2 + i);
/*  75 */       i2 = 2 - i1 / 2;
/*  76 */       for (i3 = paramInt1 - i2; i3 <= paramInt1 + i2; i3++) {
/*  77 */         for (i4 = paramInt3 - i2; i4 <= paramInt3 + i2; i4++) {
/*  78 */           if (paramahb.a(i3, m, i4).o() == awt.j) {
/*  79 */             if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i3 - 1, m, i4).o() == awt.a)) {
/*  80 */               a(paramahb, i3 - 1, m, i4, 8);
/*     */             }
/*  82 */             if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i3 + 1, m, i4).o() == awt.a)) {
/*  83 */               a(paramahb, i3 + 1, m, i4, 2);
/*     */             }
/*  85 */             if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i3, m, i4 - 1).o() == awt.a)) {
/*  86 */               a(paramahb, i3, m, i4 - 1, 1);
/*     */             }
/*  88 */             if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i3, m, i4 + 1).o() == awt.a)) {
/*  89 */               a(paramahb, i3, m, i4 + 1, 4);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  95 */     return true;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  99 */     a(paramahb, paramInt1, paramInt2, paramInt3, ajn.bd, paramInt4);
/* 100 */     int i = 4;
/* 101 */     while ((paramahb.a(paramInt1, --paramInt2, paramInt3).o() == awt.a) && (i > 0)) {
/* 102 */       a(paramahb, paramInt1, paramInt2, paramInt3, ajn.bd, paramInt4);
/* 103 */       i--;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */