/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asq
/*     */   extends arc
/*     */ {
/*     */   private final int a;
/*     */   private final boolean b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public asq(boolean paramBoolean)
/*     */   {
/*  17 */     this(paramBoolean, 4, 0, 0, false);
/*     */   }
/*     */   
/*     */   public asq(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean2) {
/*  21 */     super(paramBoolean1);
/*  22 */     this.a = paramInt1;
/*  23 */     this.c = paramInt2;
/*  24 */     this.d = paramInt3;
/*  25 */     this.b = paramBoolean2;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     int i = paramRandom.nextInt(3) + this.a;
/*     */     
/*  32 */     int j = 1;
/*  33 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) { return false;
/*     */     }
/*  35 */     for (int k = paramInt2; k <= paramInt2 + 1 + i; k++) {
/*  36 */       m = 1;
/*  37 */       if (k == paramInt2) m = 0;
/*  38 */       if (k >= paramInt2 + 1 + i - 2) m = 2;
/*  39 */       for (n = paramInt1 - m; (n <= paramInt1 + m) && (j != 0); n++) {
/*  40 */         for (i1 = paramInt3 - m; (i1 <= paramInt3 + m) && (j != 0); i1++) {
/*  41 */           if ((k >= 0) && (k < 256)) {
/*  42 */             aji localaji2 = paramahb.a(n, k, i1);
/*  43 */             if (!a(localaji2)) j = 0;
/*     */           } else {
/*  45 */             j = 0;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  51 */     if (j == 0) { return false;
/*     */     }
/*  53 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  54 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d) && (localaji1 != ajn.ak)) || (paramInt2 >= 256 - i - 1)) { return false;
/*     */     }
/*  56 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*     */     
/*  58 */     int m = 3;
/*  59 */     int n = 0;
/*  60 */     int i4; int i5; int i6; for (int i1 = paramInt2 - m + i; i1 <= paramInt2 + i; i1++) {
/*  61 */       int i2 = i1 - (paramInt2 + i);
/*  62 */       i4 = n + 1 - i2 / 2;
/*  63 */       for (i5 = paramInt1 - i4; i5 <= paramInt1 + i4; i5++) {
/*  64 */         i6 = i5 - paramInt1;
/*  65 */         for (int i7 = paramInt3 - i4; i7 <= paramInt3 + i4; i7++) {
/*  66 */           int i8 = i7 - paramInt3;
/*  67 */           if ((Math.abs(i6) != i4) || (Math.abs(i8) != i4) || ((paramRandom.nextInt(2) != 0) && (i2 != 0))) {
/*  68 */             aji localaji4 = paramahb.a(i5, i1, i7);
/*  69 */             if ((localaji4.o() == awt.a) || (localaji4.o() == awt.j)) a(paramahb, i5, i1, i7, ajn.t, this.d);
/*     */           }
/*     */         }
/*     */       } }
/*  73 */     for (i1 = 0; i1 < i; i1++) {
/*  74 */       aji localaji3 = paramahb.a(paramInt1, paramInt2 + i1, paramInt3);
/*  75 */       if ((localaji3.o() == awt.a) || (localaji3.o() == awt.j)) {
/*  76 */         a(paramahb, paramInt1, paramInt2 + i1, paramInt3, ajn.r, this.c);
/*  77 */         if ((this.b) && (i1 > 0)) {
/*  78 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 - 1, paramInt2 + i1, paramInt3))) {
/*  79 */             a(paramahb, paramInt1 - 1, paramInt2 + i1, paramInt3, ajn.bd, 8);
/*     */           }
/*  81 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 + 1, paramInt2 + i1, paramInt3))) {
/*  82 */             a(paramahb, paramInt1 + 1, paramInt2 + i1, paramInt3, ajn.bd, 2);
/*     */           }
/*  84 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1, paramInt2 + i1, paramInt3 - 1))) {
/*  85 */             a(paramahb, paramInt1, paramInt2 + i1, paramInt3 - 1, ajn.bd, 1);
/*     */           }
/*  87 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1, paramInt2 + i1, paramInt3 + 1))) {
/*  88 */             a(paramahb, paramInt1, paramInt2 + i1, paramInt3 + 1, ajn.bd, 4);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  94 */     if (this.b) { int i3;
/*  95 */       for (i1 = paramInt2 - 3 + i; i1 <= paramInt2 + i; i1++) {
/*  96 */         i3 = i1 - (paramInt2 + i);
/*  97 */         i4 = 2 - i3 / 2;
/*  98 */         for (i5 = paramInt1 - i4; i5 <= paramInt1 + i4; i5++) {
/*  99 */           for (i6 = paramInt3 - i4; i6 <= paramInt3 + i4; i6++) {
/* 100 */             if (paramahb.a(i5, i1, i6).o() == awt.j) {
/* 101 */               if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i5 - 1, i1, i6).o() == awt.a)) {
/* 102 */                 a(paramahb, i5 - 1, i1, i6, 8);
/*     */               }
/* 104 */               if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i5 + 1, i1, i6).o() == awt.a)) {
/* 105 */                 a(paramahb, i5 + 1, i1, i6, 2);
/*     */               }
/* 107 */               if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i5, i1, i6 - 1).o() == awt.a)) {
/* 108 */                 a(paramahb, i5, i1, i6 - 1, 1);
/*     */               }
/* 110 */               if ((paramRandom.nextInt(4) == 0) && (paramahb.a(i5, i1, i6 + 1).o() == awt.a)) {
/* 111 */                 a(paramahb, i5, i1, i6 + 1, 4);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 119 */       if ((paramRandom.nextInt(5) == 0) && (i > 5)) {
/* 120 */         for (i1 = 0; i1 < 2; i1++) {
/* 121 */           for (i3 = 0; i3 < 4; i3++) {
/* 122 */             if (paramRandom.nextInt(4 - i1) == 0) {
/* 123 */               i4 = paramRandom.nextInt(3);
/* 124 */               a(paramahb, paramInt1 + p.a[p.f[i3]], paramInt2 + i - 5 + i1, paramInt3 + p.b[p.f[i3]], ajn.by, i4 << 2 | i3);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 130 */     return true;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 134 */     a(paramahb, paramInt1, paramInt2, paramInt3, ajn.bd, paramInt4);
/* 135 */     int i = 4;
/* 136 */     while ((paramahb.a(paramInt1, --paramInt2, paramInt3).o() == awt.a) && (i > 0)) {
/* 137 */       a(paramahb, paramInt1, paramInt2, paramInt3, ajn.bd, paramInt4);
/* 138 */       i--;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */