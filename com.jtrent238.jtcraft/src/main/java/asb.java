/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class asb
/*     */   extends arc
/*     */ {
/*     */   protected final int a;
/*     */   protected final int b;
/*     */   protected final int c;
/*     */   protected int d;
/*     */   
/*     */   public asb(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  18 */     super(paramBoolean);
/*  19 */     this.a = paramInt1;
/*  20 */     this.d = paramInt2;
/*  21 */     this.b = paramInt3;
/*  22 */     this.c = paramInt4;
/*     */   }
/*     */   
/*     */   protected int a(Random paramRandom) {
/*  26 */     int i = paramRandom.nextInt(3) + this.a;
/*  27 */     if (this.d > 1) {
/*  28 */       i += paramRandom.nextInt(this.d);
/*     */     }
/*  30 */     return i;
/*     */   }
/*     */   
/*     */   private boolean b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  34 */     boolean bool = true;
/*  35 */     if ((paramInt2 < 1) || (paramInt2 + paramInt4 + 1 > 256)) { return false;
/*     */     }
/*  37 */     for (int i = paramInt2; i <= paramInt2 + 1 + paramInt4; i++) {
/*  38 */       int j = 2;
/*  39 */       if (i == paramInt2) j = 1;
/*  40 */       if (i >= paramInt2 + 1 + paramInt4 - 2) j = 2;
/*  41 */       for (int k = paramInt1 - j; (k <= paramInt1 + j) && (bool); k++) {
/*  42 */         for (int m = paramInt3 - j; (m <= paramInt3 + j) && (bool); m++) {
/*  43 */           if ((i >= 0) && (i < 256)) {
/*  44 */             aji localaji = paramahb.a(k, i, m);
/*  45 */             if (!a(localaji)) bool = false;
/*     */           } else {
/*  47 */             bool = false;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  53 */     return bool;
/*     */   }
/*     */   
/*     */   private boolean c(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/*  57 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  58 */     if (((localaji != ajn.c) && (localaji != ajn.d)) || (paramInt2 < 2)) { return false;
/*     */     }
/*  60 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3, ajn.d, 0, 2);
/*  61 */     paramahb.d(paramInt1 + 1, paramInt2 - 1, paramInt3, ajn.d, 0, 2);
/*  62 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3 + 1, ajn.d, 0, 2);
/*  63 */     paramahb.d(paramInt1 + 1, paramInt2 - 1, paramInt3 + 1, ajn.d, 0, 2);
/*     */     
/*  65 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  69 */     return (b(paramahb, paramRandom, paramInt1, paramInt2, paramInt3, paramInt4)) && (c(paramahb, paramRandom, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) {
/*  73 */     int i = paramInt4 * paramInt4;
/*     */     
/*  75 */     for (int j = paramInt1 - paramInt4; j <= paramInt1 + paramInt4 + 1; j++) {
/*  76 */       int k = j - paramInt1;
/*  77 */       for (int m = paramInt3 - paramInt4; m <= paramInt3 + paramInt4 + 1; m++) {
/*  78 */         int n = m - paramInt3;
/*  79 */         int i1 = k - 1;
/*  80 */         int i2 = n - 1;
/*  81 */         if ((k * k + n * n <= i) || (i1 * i1 + i2 * i2 <= i) || (k * k + i2 * i2 <= i) || (i1 * i1 + n * n <= i))
/*     */         {
/*     */ 
/*  84 */           aji localaji = paramahb.a(j, paramInt2, m);
/*  85 */           if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) a(paramahb, j, paramInt2, m, ajn.t, this.c);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*  91 */   protected void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom) { int i = paramInt4 * paramInt4;
/*     */     
/*  93 */     for (int j = paramInt1 - paramInt4; j <= paramInt1 + paramInt4; j++) {
/*  94 */       int k = j - paramInt1;
/*  95 */       for (int m = paramInt3 - paramInt4; m <= paramInt3 + paramInt4; m++) {
/*  96 */         int n = m - paramInt3;
/*  97 */         if (k * k + n * n <= i)
/*     */         {
/*     */ 
/* 100 */           aji localaji = paramahb.a(j, paramInt2, m);
/* 101 */           if ((localaji.o() == awt.a) || (localaji.o() == awt.j)) a(paramahb, j, paramInt2, m, ajn.t, this.c);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */