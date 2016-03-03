/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class asa
/*     */   extends asb
/*     */ {
/*     */   private boolean e;
/*     */   
/*     */   public asa(boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/*  15 */     super(paramBoolean1, 13, 15, 1, 1);
/*  16 */     this.e = paramBoolean2;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     int i = a(paramRandom);
/*  23 */     if (!a(paramahb, paramRandom, paramInt1, paramInt2, paramInt3, i)) { return false;
/*     */     }
/*  25 */     c(paramahb, paramInt1, paramInt3, paramInt2 + i, 0, paramRandom);
/*     */     
/*  27 */     for (int j = 0; j < i; j++) {
/*  28 */       aji localaji = paramahb.a(paramInt1, paramInt2 + j, paramInt3);
/*  29 */       if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  30 */         a(paramahb, paramInt1, paramInt2 + j, paramInt3, ajn.r, this.b);
/*     */       }
/*  32 */       if (j < i - 1) {
/*  33 */         localaji = paramahb.a(paramInt1 + 1, paramInt2 + j, paramInt3);
/*  34 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  35 */           a(paramahb, paramInt1 + 1, paramInt2 + j, paramInt3, ajn.r, this.b);
/*     */         }
/*  37 */         localaji = paramahb.a(paramInt1 + 1, paramInt2 + j, paramInt3 + 1);
/*  38 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  39 */           a(paramahb, paramInt1 + 1, paramInt2 + j, paramInt3 + 1, ajn.r, this.b);
/*     */         }
/*  41 */         localaji = paramahb.a(paramInt1, paramInt2 + j, paramInt3 + 1);
/*  42 */         if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) {
/*  43 */           a(paramahb, paramInt1, paramInt2 + j, paramInt3 + 1, ajn.r, this.b);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  48 */     return true;
/*     */   }
/*     */   
/*     */   private void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
/*  52 */     int i = paramRandom.nextInt(5);
/*  53 */     if (this.e) {
/*  54 */       i += this.a;
/*     */     } else {
/*  56 */       i += 3;
/*     */     }
/*  58 */     int j = 0;
/*  59 */     for (int k = paramInt3 - i; k <= paramInt3; k++) {
/*  60 */       int m = paramInt3 - k;
/*  61 */       int n = paramInt4 + qh.d(m / i * 3.5F);
/*  62 */       a(paramahb, paramInt1, k, paramInt2, n + ((m > 0) && (n == j) && ((k & 0x1) == 0) ? 1 : 0), paramRandom);
/*  63 */       j = n;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  69 */     c(paramahb, paramRandom, paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  70 */     c(paramahb, paramRandom, paramInt1 + 2, paramInt2, paramInt3 - 1);
/*  71 */     c(paramahb, paramRandom, paramInt1 - 1, paramInt2, paramInt3 + 2);
/*  72 */     c(paramahb, paramRandom, paramInt1 + 2, paramInt2, paramInt3 + 2);
/*     */     
/*  74 */     for (int i = 0; i < 5; i++) {
/*  75 */       int j = paramRandom.nextInt(64);
/*  76 */       int k = j % 8;
/*  77 */       int m = j / 8;
/*  78 */       if ((k == 0) || (k == 7) || (m == 0) || (m == 7)) {
/*  79 */         c(paramahb, paramRandom, paramInt1 - 3 + k, paramInt2, paramInt3 - 3 + m);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  86 */     for (int i = -2; i <= 2; i++) {
/*  87 */       for (int j = -2; j <= 2; j++) {
/*  88 */         if ((Math.abs(i) != 2) || (Math.abs(j) != 2)) {
/*  89 */           a(paramahb, paramInt1 + i, paramInt2, paramInt3 + j);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  97 */     for (int i = paramInt2 + 2; i >= paramInt2 - 3; i--) {
/*  98 */       aji localaji = paramahb.a(paramInt1, i, paramInt3);
/*  99 */       if ((localaji == ajn.c) || (localaji == ajn.d)) {
/* 100 */         a(paramahb, paramInt1, i, paramInt3, ajn.d, 2);
/*     */       } else {
/* 102 */         if ((localaji.o() != awt.a) && (i < paramInt2)) {
/*     */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */