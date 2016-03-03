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
/*     */ public abstract class ajd
/*     */   extends aji
/*     */ {
/*     */   private String a;
/*     */   
/*     */   protected ajd(String paramString, awt paramawt)
/*     */   {
/*  18 */     super(paramawt);
/*  19 */     this.a = paramString;
/*  20 */     a(abt.d);
/*  21 */     a(true);
/*  22 */     b(d(15));
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   protected void b(int paramInt) {
/*  31 */     int i = c(paramInt) > 0 ? 1 : 0;
/*  32 */     float f = 0.0625F;
/*     */     
/*  34 */     if (i != 0) {
/*  35 */       a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
/*     */     } else {
/*  37 */       a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  43 */     return 20;
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  48 */     return null;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  53 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean d()
/*     */   {
/*  62 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  67 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  72 */     return (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (akz.a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3)));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  77 */     int i = 0;
/*     */     
/*  79 */     if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (!akz.a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3)))) { i = 1;
/*     */     }
/*  81 */     if (i != 0) {
/*  82 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*  83 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  89 */     if (paramahb.E) return;
/*  90 */     int i = c(paramahb.e(paramInt1, paramInt2, paramInt3));
/*  91 */     if (i > 0) a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/*  96 */     if (paramahb.E) return;
/*  97 */     int i = c(paramahb.e(paramInt1, paramInt2, paramInt3));
/*  98 */     if (i == 0) a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 102 */     int i = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 103 */     int j = paramInt4 > 0 ? 1 : 0;
/* 104 */     int k = i > 0 ? 1 : 0;
/*     */     
/* 106 */     if (paramInt4 != i) {
/* 107 */       paramahb.a(paramInt1, paramInt2, paramInt3, d(i), 2);
/* 108 */       a_(paramahb, paramInt1, paramInt2, paramInt3);
/* 109 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 112 */     if ((k == 0) && (j != 0)) {
/* 113 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/* 114 */     } else if ((k != 0) && (j == 0)) {
/* 115 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     }
/*     */     
/* 118 */     if (k != 0) {
/* 119 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */   }
/*     */   
/*     */   protected azt a(int paramInt1, int paramInt2, int paramInt3) {
/* 124 */     float f = 0.125F;
/* 125 */     return azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 0.25D, paramInt3 + 1 - f);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 130 */     if (c(paramInt4) > 0) {
/* 131 */       a_(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 134 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   protected void a_(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 138 */     paramahb.d(paramInt1, paramInt2, paramInt3, this);
/* 139 */     paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 144 */     return c(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 149 */     if (paramInt4 == 1) {
/* 150 */       return c(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */     }
/* 152 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean f()
/*     */   {
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/* 163 */     float f1 = 0.5F;
/* 164 */     float f2 = 0.125F;
/* 165 */     float f3 = 0.5F;
/* 166 */     a(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
/*     */   }
/*     */   
/*     */   public int h()
/*     */   {
/* 171 */     return 1;
/*     */   }
/*     */   
/*     */   protected abstract int e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   protected abstract int c(int paramInt);
/*     */   
/*     */   protected abstract int d(int paramInt);
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 182 */     this.L = paramrg.a(this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */