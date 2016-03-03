/*     */ import java.util.List;
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
/*     */ public abstract class alj
/*     */   extends aji
/*     */ {
/*     */   protected final boolean a;
/*     */   
/*     */   public alj(boolean paramBoolean, awt paramawt)
/*     */   {
/*  20 */     super(paramawt);
/*  21 */     this.a = paramBoolean;
/*     */     
/*  23 */     if (paramBoolean) {
/*  24 */       this.q = true;
/*     */     } else {
/*  26 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     }
/*  28 */     g(255);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  33 */     if (this.a) {
/*  34 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  36 */       int i = (paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) != 0 ? 1 : 0;
/*  37 */       if (i != 0) {
/*  38 */         a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */       } else {
/*  40 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  47 */     if (this.a) {
/*  48 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  50 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  56 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  57 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  62 */     return this.a;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  67 */     if (this.a) { return paramInt5;
/*     */     }
/*  69 */     if ((paramInt4 == 0) || ((paramInt4 != 1) && (paramFloat2 > 0.5D))) {
/*  70 */       return paramInt5 | 0x8;
/*     */     }
/*  72 */     return paramInt5;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  77 */     if (this.a) {
/*  78 */       return 2;
/*     */     }
/*  80 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  85 */     return paramInt & 0x7;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  90 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  95 */     if (this.a) { return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*  97 */     if ((paramInt4 != 1) && (paramInt4 != 0) && (!super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4))) {
/*  98 */       return false;
/*     */     }
/*     */     
/* 101 */     int i = paramInt1;int j = paramInt2;int k = paramInt3;
/* 102 */     i += q.b[q.a[paramInt4]];
/* 103 */     j += q.c[q.a[paramInt4]];
/* 104 */     k += q.d[q.a[paramInt4]];
/*     */     
/* 106 */     int m = (paramahl.e(i, j, k) & 0x8) != 0 ? 1 : 0;
/* 107 */     if (m != 0) {
/* 108 */       if (paramInt4 == 0) return true;
/* 109 */       if ((paramInt4 == 1) && (super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4))) return true;
/* 110 */       return (!a(paramahl.a(paramInt1, paramInt2, paramInt3))) || ((paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) == 0);
/*     */     }
/* 112 */     if (paramInt4 == 1) return true;
/* 113 */     if ((paramInt4 == 0) && (super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4))) return true;
/* 114 */     return (!a(paramahl.a(paramInt1, paramInt2, paramInt3))) || ((paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) != 0);
/*     */   }
/*     */   
/*     */   private static boolean a(aji paramaji)
/*     */   {
/* 119 */     return (paramaji == ajn.U) || (paramaji == ajn.bx);
/*     */   }
/*     */   
/*     */   public abstract String b(int paramInt);
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 126 */     return super.k(paramahb, paramInt1, paramInt2, paramInt3) & 0x7;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 131 */     if (a(this)) {
/* 132 */       return adb.a(this);
/*     */     }
/* 134 */     if (this == ajn.T) {
/* 135 */       return adb.a(ajn.U);
/*     */     }
/* 137 */     if (this == ajn.bw) {
/* 138 */       return adb.a(ajn.bx);
/*     */     }
/* 140 */     return adb.a(ajn.U);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */