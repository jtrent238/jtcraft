/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class als
/*     */   extends aji
/*     */ {
/*     */   protected als()
/*     */   {
/*  12 */     super(awt.q);
/*  13 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  18 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  19 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  24 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  25 */     return super.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  30 */     b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  34 */     int i = paramInt;
/*  35 */     float f = 0.125F;
/*     */     
/*  37 */     if (i == 2) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  38 */     if (i == 3) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  39 */     if (i == 4) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  40 */     if (i == 5) { a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  49 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  59 */     return 8;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  64 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())
/*  65 */       return true;
/*  66 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())
/*  67 */       return true;
/*  68 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())
/*  69 */       return true;
/*  70 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) {
/*  71 */       return true;
/*     */     }
/*  73 */     return false;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  78 */     int i = paramInt5;
/*     */     
/*  80 */     if (((i == 0) || (paramInt4 == 2)) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) i = 2;
/*  81 */     if (((i == 0) || (paramInt4 == 3)) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) i = 3;
/*  82 */     if (((i == 0) || (paramInt4 == 4)) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) i = 4;
/*  83 */     if (((i == 0) || (paramInt4 == 5)) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) { i = 5;
/*     */     }
/*  85 */     return i;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  90 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  91 */     int j = 0;
/*     */     
/*  93 */     if ((i == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) j = 1;
/*  94 */     if ((i == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) j = 1;
/*  95 */     if ((i == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) j = 1;
/*  96 */     if ((i == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) j = 1;
/*  97 */     if (j == 0) {
/*  98 */       b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*  99 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 102 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 107 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\als.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */