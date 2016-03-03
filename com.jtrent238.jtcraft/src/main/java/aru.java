/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aru
/*     */   extends arn
/*     */ {
/*  11 */   private int a = -1;
/*     */   
/*     */   public aru(int paramInt) {
/*  14 */     super(true);
/*  15 */     this.a = paramInt;
/*     */   }
/*     */   
/*     */   public aru() {
/*  19 */     super(false);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     int i = paramRandom.nextInt(2);
/*  25 */     if (this.a >= 0) { i = this.a;
/*     */     }
/*  27 */     int j = paramRandom.nextInt(3) + 4;
/*     */     
/*  29 */     int k = 1;
/*  30 */     if ((paramInt2 < 1) || (paramInt2 + j + 1 >= 256)) return false;
/*     */     int i2;
/*  32 */     for (int m = paramInt2; m <= paramInt2 + 1 + j; m++) {
/*  33 */       n = 3;
/*  34 */       if (m <= paramInt2 + 3) n = 0;
/*  35 */       for (i1 = paramInt1 - n; (i1 <= paramInt1 + n) && (k != 0); i1++) {
/*  36 */         for (i2 = paramInt3 - n; (i2 <= paramInt3 + n) && (k != 0); i2++) {
/*  37 */           if ((m >= 0) && (m < 256)) {
/*  38 */             aji localaji3 = paramahb.a(i1, m, i2);
/*  39 */             if ((localaji3.o() != awt.a) && (localaji3.o() != awt.j)) {
/*  40 */               k = 0;
/*     */             }
/*     */           } else {
/*  43 */             k = 0;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  49 */     if (k == 0) { return false;
/*     */     }
/*  51 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  52 */     if ((localaji1 != ajn.d) && (localaji1 != ajn.c) && (localaji1 != ajn.bh)) {
/*  53 */       return false;
/*     */     }
/*     */     
/*  56 */     int n = paramInt2 + j;
/*  57 */     if (i == 1) {
/*  58 */       n = paramInt2 + j - 3;
/*     */     }
/*  60 */     for (int i1 = n; i1 <= paramInt2 + j; i1++) {
/*  61 */       i2 = 1;
/*  62 */       if (i1 < paramInt2 + j) i2++;
/*  63 */       if (i == 0) i2 = 3;
/*  64 */       for (int i3 = paramInt1 - i2; i3 <= paramInt1 + i2; i3++) {
/*  65 */         for (int i4 = paramInt3 - i2; i4 <= paramInt3 + i2; i4++) {
/*  66 */           int i5 = 5;
/*  67 */           if (i3 == paramInt1 - i2) i5--;
/*  68 */           if (i3 == paramInt1 + i2) i5++;
/*  69 */           if (i4 == paramInt3 - i2) i5 -= 3;
/*  70 */           if (i4 == paramInt3 + i2) { i5 += 3;
/*     */           }
/*  72 */           if ((i == 0) || (i1 < paramInt2 + j)) {
/*  73 */             if (((i3 == paramInt1 - i2) || (i3 == paramInt1 + i2)) && ((i4 == paramInt3 - i2) || (i4 == paramInt3 + i2))) continue;
/*  74 */             if ((i3 == paramInt1 - (i2 - 1)) && (i4 == paramInt3 - i2)) i5 = 1;
/*  75 */             if ((i3 == paramInt1 - i2) && (i4 == paramInt3 - (i2 - 1))) { i5 = 1;
/*     */             }
/*  77 */             if ((i3 == paramInt1 + (i2 - 1)) && (i4 == paramInt3 - i2)) i5 = 3;
/*  78 */             if ((i3 == paramInt1 + i2) && (i4 == paramInt3 - (i2 - 1))) { i5 = 3;
/*     */             }
/*  80 */             if ((i3 == paramInt1 - (i2 - 1)) && (i4 == paramInt3 + i2)) i5 = 7;
/*  81 */             if ((i3 == paramInt1 - i2) && (i4 == paramInt3 + (i2 - 1))) { i5 = 7;
/*     */             }
/*  83 */             if ((i3 == paramInt1 + (i2 - 1)) && (i4 == paramInt3 + i2)) i5 = 9;
/*  84 */             if ((i3 == paramInt1 + i2) && (i4 == paramInt3 + (i2 - 1))) { i5 = 9;
/*     */             }
/*     */           }
/*  87 */           if ((i5 == 5) && (i1 < paramInt2 + j)) i5 = 0;
/*  88 */           if ((i5 != 0) || (paramInt2 >= paramInt2 + j - 1))
/*     */           {
/*  90 */             if (!paramahb.a(i3, i1, i4).j()) a(paramahb, i3, i1, i4, aji.e(aji.b(ajn.aW) + i), i5);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*  95 */     for (i1 = 0; i1 < j; i1++) {
/*  96 */       aji localaji2 = paramahb.a(paramInt1, paramInt2 + i1, paramInt3);
/*     */       
/*  98 */       if (!localaji2.j()) a(paramahb, paramInt1, paramInt2 + i1, paramInt3, aji.e(aji.b(ajn.aW) + i), 10);
/*     */     }
/* 100 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */