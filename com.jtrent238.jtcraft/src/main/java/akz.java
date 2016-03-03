/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akz
/*     */   extends aji
/*     */ {
/*     */   private final String a;
/*     */   
/*     */   public akz(String paramString, awt paramawt)
/*     */   {
/*  17 */     super(paramawt);
/*  18 */     this.a = paramString;
/*  19 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  24 */     boolean bool1 = e(paramahb, paramInt1, paramInt2, paramInt3 - 1);
/*  25 */     boolean bool2 = e(paramahb, paramInt1, paramInt2, paramInt3 + 1);
/*  26 */     boolean bool3 = e(paramahb, paramInt1 - 1, paramInt2, paramInt3);
/*  27 */     boolean bool4 = e(paramahb, paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  29 */     float f1 = 0.375F;
/*  30 */     float f2 = 0.625F;
/*  31 */     float f3 = 0.375F;
/*  32 */     float f4 = 0.625F;
/*     */     
/*  34 */     if (bool1) {
/*  35 */       f3 = 0.0F;
/*     */     }
/*  37 */     if (bool2) {
/*  38 */       f4 = 1.0F;
/*     */     }
/*  40 */     if ((bool1) || (bool2)) {
/*  41 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  42 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*  44 */     f3 = 0.375F;
/*  45 */     f4 = 0.625F;
/*  46 */     if (bool3) {
/*  47 */       f1 = 0.0F;
/*     */     }
/*  49 */     if (bool4) {
/*  50 */       f2 = 1.0F;
/*     */     }
/*  52 */     if ((bool3) || (bool4) || ((!bool1) && (!bool2))) {
/*  53 */       a(f1, 0.0F, f3, f2, 1.5F, f4);
/*  54 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*     */     
/*  57 */     if (bool1) {
/*  58 */       f3 = 0.0F;
/*     */     }
/*  60 */     if (bool2) {
/*  61 */       f4 = 1.0F;
/*     */     }
/*     */     
/*  64 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  69 */     boolean bool1 = e(paramahl, paramInt1, paramInt2, paramInt3 - 1);
/*  70 */     boolean bool2 = e(paramahl, paramInt1, paramInt2, paramInt3 + 1);
/*  71 */     boolean bool3 = e(paramahl, paramInt1 - 1, paramInt2, paramInt3);
/*  72 */     boolean bool4 = e(paramahl, paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  74 */     float f1 = 0.375F;
/*  75 */     float f2 = 0.625F;
/*  76 */     float f3 = 0.375F;
/*  77 */     float f4 = 0.625F;
/*     */     
/*  79 */     if (bool1) {
/*  80 */       f3 = 0.0F;
/*     */     }
/*  82 */     if (bool2) {
/*  83 */       f4 = 1.0F;
/*     */     }
/*  85 */     if (bool3) {
/*  86 */       f1 = 0.0F;
/*     */     }
/*  88 */     if (bool4) {
/*  89 */       f2 = 1.0F;
/*     */     }
/*     */     
/*  92 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  97 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 107 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 112 */     return 11;
/*     */   }
/*     */   
/*     */   public boolean e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 116 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 117 */     if ((localaji == this) || (localaji == ajn.be)) {
/* 118 */       return true;
/*     */     }
/* 120 */     if ((localaji.J.k()) && (localaji.d())) {
/* 121 */       return localaji.J != awt.C;
/*     */     }
/* 123 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(aji paramaji) {
/* 127 */     return (paramaji == ajn.aJ) || (paramaji == ajn.bk);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 132 */     return true;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 137 */     this.L = paramrg.a(this.a);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 142 */     if (paramahb.E) return true;
/* 143 */     if (adf.a(paramyz, paramahb, paramInt1, paramInt2, paramInt3)) {
/* 144 */       return true;
/*     */     }
/* 146 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */