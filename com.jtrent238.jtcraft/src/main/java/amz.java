/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amz
/*     */   extends aji
/*     */ {
/*     */   private boolean a;
/*     */   
/*     */   public amz(boolean paramBoolean)
/*     */   {
/*  15 */     super(awt.e);
/*  16 */     if (paramBoolean) {
/*  17 */       a(true);
/*     */     }
/*  19 */     this.a = paramBoolean;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  24 */     return 30;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*     */   {
/*  29 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*  30 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/*  35 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*  36 */     super.b(paramahb, paramInt1, paramInt2, paramInt3, paramsa);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  41 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*  42 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  46 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*  47 */     if (this == ajn.ax) {
/*  48 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.ay);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  54 */     if (this == ajn.ay) {
/*  55 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.ax);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  61 */     return ade.ax;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom)
/*     */   {
/*  66 */     return a(paramRandom) + paramRandom.nextInt(paramInt + 1);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  71 */     return 4 + paramRandom.nextInt(2);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/*  76 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
/*     */     
/*     */ 
/*  79 */     if (a(paramInt4, paramahb.s, paramInt5) != adb.a(this)) {
/*  80 */       int i = 1 + paramahb.s.nextInt(5);
/*  81 */       c(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  87 */     if (this.a) {
/*  88 */       m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   private void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     Random localRandom = paramahb.s;
/*  94 */     double d1 = 0.0625D;
/*  95 */     for (int i = 0; i < 6; i++) {
/*  96 */       double d2 = paramInt1 + localRandom.nextFloat();
/*  97 */       double d3 = paramInt2 + localRandom.nextFloat();
/*  98 */       double d4 = paramInt3 + localRandom.nextFloat();
/*  99 */       if ((i == 0) && (!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).c())) d3 = paramInt2 + 1 + d1;
/* 100 */       if ((i == 1) && (!paramahb.a(paramInt1, paramInt2 - 1, paramInt3).c())) d3 = paramInt2 + 0 - d1;
/* 101 */       if ((i == 2) && (!paramahb.a(paramInt1, paramInt2, paramInt3 + 1).c())) d4 = paramInt3 + 1 + d1;
/* 102 */       if ((i == 3) && (!paramahb.a(paramInt1, paramInt2, paramInt3 - 1).c())) d4 = paramInt3 + 0 - d1;
/* 103 */       if ((i == 4) && (!paramahb.a(paramInt1 + 1, paramInt2, paramInt3).c())) d2 = paramInt1 + 1 + d1;
/* 104 */       if ((i == 5) && (!paramahb.a(paramInt1 - 1, paramInt2, paramInt3).c())) d2 = paramInt1 + 0 - d1;
/* 105 */       if ((d2 < paramInt1) || (d2 > paramInt1 + 1) || (d3 < 0.0D) || (d3 > paramInt2 + 1) || (d4 < paramInt3) || (d4 > paramInt3 + 1)) {
/* 106 */         paramahb.a("reddust", d2, d3, d4, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected add j(int paramInt)
/*     */   {
/* 113 */     return new add(ajn.ax);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */