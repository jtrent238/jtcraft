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
/*     */ public class ala
/*     */   extends akk
/*     */ {
/*     */   public ala()
/*     */   {
/*  17 */     super(awt.d);
/*  18 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     return ajn.f.h(paramInt1);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  28 */     if (!paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o().a()) return false;
/*  29 */     return super.c(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  34 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  35 */     if (b(i)) {
/*  36 */       return null;
/*     */     }
/*  38 */     if ((i == 2) || (i == 0)) {
/*  39 */       return azt.a(paramInt1, paramInt2, paramInt3 + 0.375F, paramInt1 + 1, paramInt2 + 1.5F, paramInt3 + 0.625F);
/*     */     }
/*  41 */     return azt.a(paramInt1 + 0.375F, paramInt2, paramInt3, paramInt1 + 0.625F, paramInt2 + 1.5F, paramInt3 + 1);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     int i = l(paramahl.e(paramInt1, paramInt2, paramInt3));
/*  47 */     if ((i == 2) || (i == 0)) {
/*  48 */       a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
/*     */     } else {
/*  50 */       a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  60 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  65 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     return b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  75 */     return 21;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  80 */     int i = (qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
/*  81 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  86 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  87 */     if (b(i)) {
/*  88 */       paramahb.a(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFB, 2);
/*     */     }
/*     */     else {
/*  91 */       int j = (qh.c(paramyz.y * 4.0F / 360.0F + 0.5D) & 0x3) % 4;
/*  92 */       int k = l(i);
/*  93 */       if (k == (j + 2) % 4) {
/*  94 */         i = j;
/*     */       }
/*  96 */       paramahb.a(paramInt1, paramInt2, paramInt3, i | 0x4, 2);
/*     */     }
/*  98 */     paramahb.a(paramyz, 1003, paramInt1, paramInt2, paramInt3, 0);
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 104 */     if (paramahb.E) { return;
/*     */     }
/* 106 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 108 */     boolean bool = paramahb.v(paramInt1, paramInt2, paramInt3);
/* 109 */     if ((bool) || (paramaji.f())) {
/* 110 */       if ((bool) && (!b(i))) {
/* 111 */         paramahb.a(paramInt1, paramInt2, paramInt3, i | 0x4, 2);
/* 112 */         paramahb.a(null, 1003, paramInt1, paramInt2, paramInt3, 0);
/* 113 */       } else if ((!bool) && (b(i))) {
/* 114 */         paramahb.a(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFB, 2);
/* 115 */         paramahb.a(null, 1003, paramInt1, paramInt2, paramInt3, 0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean b(int paramInt) {
/* 121 */     return (paramInt & 0x4) != 0;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 126 */     return true;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ala.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */