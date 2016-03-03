/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoe
/*     */   extends aji
/*     */ {
/*     */   protected aoe(awt paramawt)
/*     */   {
/*  14 */     super(paramawt);
/*     */     
/*  16 */     float f1 = 0.5F;
/*  17 */     float f2 = 1.0F;
/*     */     
/*  19 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*  20 */     a(abt.d);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  29 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  34 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     return !d(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  44 */     return 0;
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  49 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  50 */     return super.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  56 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  61 */     b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  66 */     float f = 0.1875F;
/*  67 */     a(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/*  71 */     float f = 0.1875F;
/*     */     
/*  73 */     if ((paramInt & 0x8) != 0) {
/*  74 */       a(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  76 */       a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*     */     }
/*     */     
/*  79 */     if (d(paramInt)) {
/*  80 */       if ((paramInt & 0x3) == 0) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  81 */       if ((paramInt & 0x3) == 1) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  82 */       if ((paramInt & 0x3) == 2) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  83 */       if ((paramInt & 0x3) == 3) { a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {}
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  93 */     if (this.J == awt.f) { return true;
/*     */     }
/*  95 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  96 */     paramahb.a(paramInt1, paramInt2, paramInt3, i ^ 0x4, 2);
/*     */     
/*  98 */     paramahb.a(paramyz, 1003, paramInt1, paramInt2, paramInt3, 0);
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 103 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 105 */     boolean bool = (i & 0x4) > 0;
/* 106 */     if (bool == paramBoolean) { return;
/*     */     }
/* 108 */     paramahb.a(paramInt1, paramInt2, paramInt3, i ^ 0x4, 2);
/*     */     
/* 110 */     paramahb.a(null, 1003, paramInt1, paramInt2, paramInt3, 0);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 115 */     if (paramahb.E) { return;
/*     */     }
/* 117 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 118 */     int j = paramInt1;
/* 119 */     int k = paramInt3;
/* 120 */     if ((i & 0x3) == 0) k++;
/* 121 */     if ((i & 0x3) == 1) k--;
/* 122 */     if ((i & 0x3) == 2) j++;
/* 123 */     if ((i & 0x3) == 3) { j--;
/*     */     }
/* 125 */     if (!a(paramahb.a(j, paramInt2, k))) {
/* 126 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 127 */       b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*     */     }
/*     */     
/* 130 */     boolean bool = paramahb.v(paramInt1, paramInt2, paramInt3);
/* 131 */     if ((bool) || (paramaji.f())) {
/* 132 */       a(paramahb, paramInt1, paramInt2, paramInt3, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2)
/*     */   {
/* 138 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 139 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazw1, paramazw2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/* 152 */     int i = 0;
/* 153 */     if (paramInt4 == 2) i = 0;
/* 154 */     if (paramInt4 == 3) i = 1;
/* 155 */     if (paramInt4 == 4) i = 2;
/* 156 */     if (paramInt4 == 5) i = 3;
/* 157 */     if ((paramInt4 != 1) && (paramInt4 != 0) && (paramFloat2 > 0.5F)) i |= 0x8;
/* 158 */     return i;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 163 */     if (paramInt4 == 0) return false;
/* 164 */     if (paramInt4 == 1) return false;
/* 165 */     if (paramInt4 == 2) paramInt3++;
/* 166 */     if (paramInt4 == 3) paramInt3--;
/* 167 */     if (paramInt4 == 4) paramInt1++;
/* 168 */     if (paramInt4 == 5) { paramInt1--;
/*     */     }
/* 170 */     return a(paramahb.a(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public static boolean d(int paramInt) {
/* 174 */     return (paramInt & 0x4) != 0;
/*     */   }
/*     */   
/*     */   private static boolean a(aji paramaji) {
/* 178 */     return ((paramaji.J.k()) && (paramaji.d())) || (paramaji == ajn.aN) || ((paramaji instanceof alj)) || ((paramaji instanceof ans));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */