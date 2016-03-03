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
/*     */ public class aju
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   private rf M;
/*     */   
/*     */   protected aju()
/*     */   {
/*  22 */     super(awt.F);
/*  23 */     a(true);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  29 */     float f1 = 0.0625F;
/*  30 */     float f2 = (1 + i * 2) / 16.0F;
/*  31 */     float f3 = 0.5F;
/*  32 */     a(f2, 0.0F, f1, 1.0F - f1, f3, 1.0F - f1);
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  37 */     float f1 = 0.0625F;
/*  38 */     float f2 = 0.5F;
/*  39 */     a(f1, 0.0F, f1, 1.0F - f1, f2, 1.0F - f1);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  44 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  45 */     float f1 = 0.0625F;
/*  46 */     float f2 = (1 + i * 2) / 16.0F;
/*  47 */     float f3 = 0.5F;
/*  48 */     return azt.a(paramInt1 + f2, paramInt2, paramInt3 + f1, paramInt1 + 1 - f1, paramInt2 + f3 - f1, paramInt3 + 1 - f1);
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  54 */     float f1 = 0.0625F;
/*  55 */     float f2 = (1 + i * 2) / 16.0F;
/*  56 */     float f3 = 0.5F;
/*  57 */     return azt.a(paramInt1 + f2, paramInt2, paramInt3 + f1, paramInt1 + 1 - f1, paramInt2 + f3, paramInt3 + 1 - f1);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  62 */     if (paramInt1 == 1) return this.a;
/*  63 */     if (paramInt1 == 0) return this.b;
/*  64 */     if ((paramInt2 > 0) && (paramInt1 == 4)) return this.M;
/*  65 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  70 */     this.L = paramrg.a(N() + "_side");
/*  71 */     this.M = paramrg.a(N() + "_inner");
/*  72 */     this.a = paramrg.a(N() + "_top");
/*  73 */     this.b = paramrg.a(N() + "_bottom");
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  78 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  83 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  88 */     b(paramahb, paramInt1, paramInt2, paramInt3, paramyz);
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*     */   {
/*  94 */     b(paramahb, paramInt1, paramInt2, paramInt3, paramyz);
/*     */   }
/*     */   
/*     */   private void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {
/*  98 */     if (paramyz.g(false)) {
/*  99 */       paramyz.bQ().a(2, 0.1F);
/*     */       
/* 101 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3) + 1;
/* 102 */       if (i >= 6) {
/* 103 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       } else {
/* 105 */         paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 112 */     if (!super.c(paramahb, paramInt1, paramInt2, paramInt3)) { return false;
/*     */     }
/* 114 */     return j(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 119 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 120 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 126 */     return paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o().a();
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 131 */     return 0;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 136 */     return null;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 141 */     return ade.aU;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */