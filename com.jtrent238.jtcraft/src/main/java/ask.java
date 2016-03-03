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
/*     */ public class ask
/*     */   extends arc
/*     */ {
/*     */   public ask(boolean paramBoolean)
/*     */   {
/*  16 */     super(paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  21 */     int i = paramRandom.nextInt(3) + paramRandom.nextInt(3) + 5;
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
/*     */     
/*  49 */     int m = paramRandom.nextInt(4);
/*  50 */     int n = i - paramRandom.nextInt(4) - 1;
/*  51 */     int i1 = 3 - paramRandom.nextInt(3);
/*     */     
/*  53 */     int i2 = paramInt1;int i3 = paramInt3;
/*  54 */     int i4 = 0;
/*  55 */     int i6; for (int i5 = 0; i5 < i; i5++) {
/*  56 */       i6 = paramInt2 + i5;
/*  57 */       if ((i5 >= n) && (i1 > 0)) {
/*  58 */         i2 += p.a[m];
/*  59 */         i3 += p.b[m];
/*  60 */         i1--;
/*     */       }
/*  62 */       aji localaji3 = paramahb.a(i2, i6, i3);
/*  63 */       if ((localaji3.o() == awt.a) || (localaji3.o() == awt.j)) {
/*  64 */         a(paramahb, i2, i6, i3, ajn.s, 0);
/*  65 */         i4 = i6;
/*     */       }
/*     */     }
/*     */     
/*  69 */     for (i5 = -1; i5 <= 1; i5++) {
/*  70 */       for (i6 = -1; i6 <= 1; i6++) {
/*  71 */         a(paramahb, i2 + i5, i4 + 1, i3 + i6);
/*     */       }
/*     */     }
/*  74 */     a(paramahb, i2 + 2, i4 + 1, i3);
/*  75 */     a(paramahb, i2 - 2, i4 + 1, i3);
/*  76 */     a(paramahb, i2, i4 + 1, i3 + 2);
/*  77 */     a(paramahb, i2, i4 + 1, i3 - 2);
/*  78 */     for (i5 = -3; i5 <= 3; i5++) {
/*  79 */       for (i6 = -3; i6 <= 3; i6++) {
/*  80 */         if ((Math.abs(i5) != 3) || (Math.abs(i6) != 3))
/*     */         {
/*     */ 
/*  83 */           a(paramahb, i2 + i5, i4, i3 + i6);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  89 */     i2 = paramInt1;
/*  90 */     i3 = paramInt3;
/*  91 */     i5 = paramRandom.nextInt(4);
/*  92 */     if (i5 != m) {
/*  93 */       i6 = n - paramRandom.nextInt(2) - 1;
/*  94 */       int i7 = 1 + paramRandom.nextInt(3);
/*     */       
/*  96 */       i4 = 0;
/*  97 */       int i9; for (int i8 = i6; (i8 < i) && (i7 > 0); i7--) {
/*  98 */         if (i8 >= 1)
/*     */         {
/*     */ 
/* 101 */           i9 = paramInt2 + i8;
/* 102 */           i2 += p.a[i5];
/* 103 */           i3 += p.b[i5];
/* 104 */           aji localaji4 = paramahb.a(i2, i9, i3);
/* 105 */           if ((localaji4.o() == awt.a) || (localaji4.o() == awt.j)) {
/* 106 */             a(paramahb, i2, i9, i3, ajn.s, 0);
/* 107 */             i4 = i9;
/*     */           }
/*     */         }
/*  97 */         i8++;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 110 */       if (i4 > 0) {
/* 111 */         for (i8 = -1; i8 <= 1; i8++) {
/* 112 */           for (i9 = -1; i9 <= 1; i9++) {
/* 113 */             a(paramahb, i2 + i8, i4 + 1, i3 + i9);
/*     */           }
/*     */         }
/* 116 */         for (i8 = -2; i8 <= 2; i8++) {
/* 117 */           for (i9 = -2; i9 <= 2; i9++) {
/* 118 */             if ((Math.abs(i8) != 2) || (Math.abs(i9) != 2))
/*     */             {
/*     */ 
/* 121 */               a(paramahb, i2 + i8, i4, i3 + i9);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 127 */     return true;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 131 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 132 */     if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) a(paramahb, paramInt1, paramInt2, paramInt3, ajn.u, 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */