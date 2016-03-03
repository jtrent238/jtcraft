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
/*     */ 
/*     */ 
/*     */ public class anf
/*     */   extends akj
/*     */ {
/*  16 */   public static final double[] b = { -0.0625D, 0.0625D, 0.1875D, 0.3125D };
/*     */   
/*     */ 
/*     */ 
/*  20 */   private static final int[] M = { 1, 2, 3, 4 };
/*     */   
/*     */ 
/*     */   protected anf(boolean paramBoolean)
/*     */   {
/*  25 */     super(paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  30 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  31 */     int j = (i & 0xC) >> 2;
/*  32 */     j = j + 1 << 2 & 0xC;
/*     */     
/*  34 */     paramahb.a(paramInt1, paramInt2, paramInt3, j | i & 0x3, 3);
/*  35 */     return true;
/*     */   }
/*     */   
/*     */   protected int b(int paramInt)
/*     */   {
/*  40 */     return M[((paramInt & 0xC) >> 2)] * 2;
/*     */   }
/*     */   
/*     */   protected akj e()
/*     */   {
/*  45 */     return ajn.aS;
/*     */   }
/*     */   
/*     */   protected akj i()
/*     */   {
/*  50 */     return ajn.aR;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  55 */     return ade.aW;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  60 */     return ade.aW;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  65 */     return 15;
/*     */   }
/*     */   
/*     */   public boolean g(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  70 */     return h(paramahl, paramInt1, paramInt2, paramInt3, paramInt4) > 0;
/*     */   }
/*     */   
/*     */   protected boolean a(aji paramaji)
/*     */   {
/*  75 */     return d(paramaji);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  80 */     if (!this.a) return;
/*  81 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  82 */     int j = l(i);
/*     */     
/*  84 */     double d1 = paramInt1 + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  85 */     double d2 = paramInt2 + 0.4F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*  86 */     double d3 = paramInt3 + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/*     */     
/*  88 */     double d4 = 0.0D;
/*  89 */     double d5 = 0.0D;
/*     */     
/*  91 */     if (paramRandom.nextInt(2) == 0)
/*     */     {
/*  93 */       switch (j) {
/*     */       case 0: 
/*  95 */         d5 = -0.3125D;
/*  96 */         break;
/*     */       case 2: 
/*  98 */         d5 = 0.3125D;
/*  99 */         break;
/*     */       case 3: 
/* 101 */         d4 = -0.3125D;
/* 102 */         break;
/*     */       case 1: 
/* 104 */         d4 = 0.3125D;
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 109 */       int k = (i & 0xC) >> 2;
/* 110 */       switch (j) {
/*     */       case 0: 
/* 112 */         d5 = b[k];
/* 113 */         break;
/*     */       case 2: 
/* 115 */         d5 = -b[k];
/* 116 */         break;
/*     */       case 3: 
/* 118 */         d4 = b[k];
/* 119 */         break;
/*     */       case 1: 
/* 121 */         d4 = -b[k];
/*     */       }
/*     */       
/*     */     }
/*     */     
/* 126 */     paramahb.a("reddust", d1 + d4, d2, d3 + d5, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 131 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/* 132 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */