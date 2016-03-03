/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class arz
/*     */   extends asb
/*     */ {
/*     */   public arz(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  13 */     super(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     int i = a(paramRandom);
/*  20 */     if (!a(paramahb, paramRandom, paramInt1, paramInt2, paramInt3, i)) { return false;
/*     */     }
/*  22 */     c(paramahb, paramInt1, paramInt3, paramInt2 + i, 2, paramRandom);
/*     */     
/*  24 */     int j = paramInt2 + i - 2 - paramRandom.nextInt(4);
/*  25 */     while (j > paramInt2 + i / 2) {
/*  26 */       float f = paramRandom.nextFloat() * 3.1415927F * 2.0F;
/*  27 */       int m = paramInt1 + (int)(0.5F + qh.b(f) * 4.0F);
/*  28 */       int n = paramInt3 + (int)(0.5F + qh.a(f) * 4.0F);
/*     */       
/*  30 */       for (int i1 = 0; i1 < 5; i1++) {
/*  31 */         m = paramInt1 + (int)(1.5F + qh.b(f) * i1);
/*  32 */         n = paramInt3 + (int)(1.5F + qh.a(f) * i1);
/*  33 */         a(paramahb, m, j - 3 + i1 / 2, n, ajn.r, this.b);
/*     */       }
/*  35 */       i1 = 1 + paramRandom.nextInt(2);
/*  36 */       int i2 = j;
/*  37 */       for (int i3 = i2 - i1; i3 <= i2; i3++) {
/*  38 */         int i4 = i3 - i2;
/*  39 */         b(paramahb, m, i3, n, 1 - i4, paramRandom);
/*     */       }
/*     */       
/*  42 */       j -= 2 + paramRandom.nextInt(4);
/*     */     }
/*     */     
/*  45 */     for (int k = 0; k < i; k++) {
/*  46 */       aji localaji = paramahb.a(paramInt1, paramInt2 + k, paramInt3);
/*  47 */       if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  48 */         a(paramahb, paramInt1, paramInt2 + k, paramInt3, ajn.r, this.b);
/*  49 */         if (k > 0) {
/*  50 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 - 1, paramInt2 + k, paramInt3))) {
/*  51 */             a(paramahb, paramInt1 - 1, paramInt2 + k, paramInt3, ajn.bd, 8);
/*     */           }
/*  53 */           if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1, paramInt2 + k, paramInt3 - 1))) {
/*  54 */             a(paramahb, paramInt1, paramInt2 + k, paramInt3 - 1, ajn.bd, 1);
/*     */           }
/*     */         }
/*     */       }
/*  58 */       if (k < i - 1) {
/*  59 */         localaji = paramahb.a(paramInt1 + 1, paramInt2 + k, paramInt3);
/*  60 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  61 */           a(paramahb, paramInt1 + 1, paramInt2 + k, paramInt3, ajn.r, this.b);
/*  62 */           if (k > 0) {
/*  63 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 + 2, paramInt2 + k, paramInt3))) {
/*  64 */               a(paramahb, paramInt1 + 2, paramInt2 + k, paramInt3, ajn.bd, 2);
/*     */             }
/*  66 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 + 1, paramInt2 + k, paramInt3 - 1))) {
/*  67 */               a(paramahb, paramInt1 + 1, paramInt2 + k, paramInt3 - 1, ajn.bd, 1);
/*     */             }
/*     */           }
/*     */         }
/*  71 */         localaji = paramahb.a(paramInt1 + 1, paramInt2 + k, paramInt3 + 1);
/*  72 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  73 */           a(paramahb, paramInt1 + 1, paramInt2 + k, paramInt3 + 1, ajn.r, this.b);
/*  74 */           if (k > 0) {
/*  75 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 + 2, paramInt2 + k, paramInt3 + 1))) {
/*  76 */               a(paramahb, paramInt1 + 2, paramInt2 + k, paramInt3 + 1, ajn.bd, 2);
/*     */             }
/*  78 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 + 1, paramInt2 + k, paramInt3 + 2))) {
/*  79 */               a(paramahb, paramInt1 + 1, paramInt2 + k, paramInt3 + 2, ajn.bd, 4);
/*     */             }
/*     */           }
/*     */         }
/*  83 */         localaji = paramahb.a(paramInt1, paramInt2 + k, paramInt3 + 1);
/*  84 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  85 */           a(paramahb, paramInt1, paramInt2 + k, paramInt3 + 1, ajn.r, this.b);
/*  86 */           if (k > 0) {
/*  87 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1 - 1, paramInt2 + k, paramInt3 + 1))) {
/*  88 */               a(paramahb, paramInt1 - 1, paramInt2 + k, paramInt3 + 1, ajn.bd, 8);
/*     */             }
/*  90 */             if ((paramRandom.nextInt(3) > 0) && (paramahb.c(paramInt1, paramInt2 + k, paramInt3 + 2))) {
/*  91 */               a(paramahb, paramInt1, paramInt2 + k, paramInt3 + 2, ajn.bd, 4);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  98 */     return true;
/*     */   }
/*     */   
/*     */   private void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
/* 102 */     int i = 2;
/* 103 */     for (int j = paramInt3 - i; j <= paramInt3; j++) {
/* 104 */       int k = j - paramInt3;
/* 105 */       a(paramahb, paramInt1, j, paramInt2, paramInt4 + 1 - k, paramRandom);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */