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
/*     */ public class asi
/*     */   extends arc
/*     */ {
/*     */   public asi(boolean paramBoolean)
/*     */   {
/*  16 */     super(paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     int i = paramRandom.nextInt(3) + paramRandom.nextInt(2) + 6;
/*     */     
/*  23 */     int j = 1;
/*  24 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) { return false;
/*     */     }
/*  26 */     for (int k = paramInt2; k <= paramInt2 + 1 + i; k++) {
/*  27 */       m = 1;
/*  28 */       if (k == paramInt2) m = 0;
/*  29 */       if (k >= paramInt2 + 1 + i - 2) m = 2;
/*  30 */       for (n = paramInt1 - m; (n <= paramInt1 + m) && (j != 0); n++) {
/*  31 */         for (i1 = paramInt3 - m; (i1 <= paramInt3 + m) && (j != 0); i1++) {
/*  32 */           if ((k >= 0) && (k < 256)) {
/*  33 */             aji localaji2 = paramahb.a(n, k, i1);
/*  34 */             if (!a(localaji2)) j = 0;
/*     */           } else {
/*  36 */             j = 0;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  42 */     if (j == 0) { return false;
/*     */     }
/*  44 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  45 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d)) || (paramInt2 >= 256 - i - 1)) { return false;
/*     */     }
/*  47 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*  48 */     a(paramahb, paramInt1 + 1, paramInt2 - 1, paramInt3, ajn.d);
/*  49 */     a(paramahb, paramInt1 + 1, paramInt2 - 1, paramInt3 + 1, ajn.d);
/*  50 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3 + 1, ajn.d);
/*     */     
/*  52 */     int m = paramRandom.nextInt(4);
/*  53 */     int n = i - paramRandom.nextInt(4);
/*  54 */     int i1 = 2 - paramRandom.nextInt(3);
/*     */     
/*  56 */     int i2 = paramInt1;int i3 = paramInt3;
/*  57 */     int i4 = 0;
/*  58 */     int i6; for (int i5 = 0; i5 < i; i5++) {
/*  59 */       i6 = paramInt2 + i5;
/*  60 */       if ((i5 >= n) && (i1 > 0)) {
/*  61 */         i2 += p.a[m];
/*  62 */         i3 += p.b[m];
/*  63 */         i1--;
/*     */       }
/*  65 */       aji localaji3 = paramahb.a(i2, i6, i3);
/*  66 */       if ((localaji3.o() == awt.a) || (localaji3.o() == awt.j)) {
/*  67 */         a(paramahb, i2, i6, i3, ajn.s, 1);
/*  68 */         a(paramahb, i2 + 1, i6, i3, ajn.s, 1);
/*  69 */         a(paramahb, i2, i6, i3 + 1, ajn.s, 1);
/*  70 */         a(paramahb, i2 + 1, i6, i3 + 1, ajn.s, 1);
/*  71 */         i4 = i6;
/*     */       }
/*     */     }
/*     */     int i7;
/*  75 */     for (i5 = -2; i5 <= 0; i5++)
/*  76 */       for (i6 = -2; i6 <= 0; i6++) {
/*  77 */         i7 = -1;
/*  78 */         a(paramahb, i2 + i5, i4 + i7, i3 + i6);
/*  79 */         a(paramahb, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  80 */         a(paramahb, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  81 */         a(paramahb, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*  82 */         if (((i5 > -2) || (i6 > -1)) && ((i5 != -1) || (i6 != -2)))
/*     */         {
/*     */ 
/*  85 */           i7 = 1;
/*  86 */           a(paramahb, i2 + i5, i4 + i7, i3 + i6);
/*  87 */           a(paramahb, 1 + i2 - i5, i4 + i7, i3 + i6);
/*  88 */           a(paramahb, i2 + i5, i4 + i7, 1 + i3 - i6);
/*  89 */           a(paramahb, 1 + i2 - i5, i4 + i7, 1 + i3 - i6);
/*     */         }
/*     */       }
/*  92 */     if (paramRandom.nextBoolean()) {
/*  93 */       a(paramahb, i2, i4 + 2, i3);
/*  94 */       a(paramahb, i2 + 1, i4 + 2, i3);
/*  95 */       a(paramahb, i2 + 1, i4 + 2, i3 + 1);
/*  96 */       a(paramahb, i2, i4 + 2, i3 + 1);
/*     */     }
/*  98 */     for (i5 = -3; i5 <= 4; i5++) {
/*  99 */       for (i6 = -3; i6 <= 4; i6++) {
/* 100 */         if (((i5 != -3) || (i6 != -3)) && ((i5 != -3) || (i6 != 4)) && ((i5 != 4) || (i6 != -3)) && ((i5 != 4) || (i6 != 4)))
/*     */         {
/*     */ 
/* 103 */           if ((Math.abs(i5) < 3) || (Math.abs(i6) < 3))
/*     */           {
/*     */ 
/* 106 */             a(paramahb, i2 + i5, i4, i3 + i6);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 111 */     for (i5 = -1; i5 <= 2; i5++) {
/* 112 */       for (i6 = -1; i6 <= 2; i6++) {
/* 113 */         if ((i5 < 0) || (i5 > 1) || (i6 < 0) || (i6 > 1))
/*     */         {
/*     */ 
/* 116 */           if (paramRandom.nextInt(3) <= 0)
/*     */           {
/*     */ 
/* 119 */             i7 = paramRandom.nextInt(3) + 2;
/* 120 */             for (int i8 = 0; i8 < i7; i8++)
/* 121 */               a(paramahb, paramInt1 + i5, i4 - i8 - 1, paramInt3 + i6, ajn.s, 1);
/*     */             int i9;
/* 123 */             for (i8 = -1; i8 <= 1; i8++) {
/* 124 */               for (i9 = -1; i9 <= 1; i9++) {
/* 125 */                 a(paramahb, i2 + i5 + i8, i4 - 0, i3 + i6 + i9);
/*     */               }
/*     */             }
/* 128 */             for (i8 = -2; i8 <= 2; i8++) {
/* 129 */               for (i9 = -2; i9 <= 2; i9++) {
/* 130 */                 if ((Math.abs(i8) != 2) || (Math.abs(i9) != 2))
/*     */                 {
/*     */ 
/* 133 */                   a(paramahb, i2 + i5 + i8, i4 - 1, i3 + i6 + i9);
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 145 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 146 */     if (localaji.o() == awt.a) a(paramahb, paramInt1, paramInt2, paramInt3, ajn.u, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */