/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoi
/*     */   extends aji
/*     */ {
/*  22 */   public static final String[] a = { "normal", "mossy" };
/*     */   
/*     */ 
/*     */   public aoi(aji paramaji)
/*     */   {
/*  27 */     super(paramaji.J);
/*     */     
/*  29 */     c(paramaji.v);
/*  30 */     b(paramaji.w / 3.0F);
/*  31 */     a(paramaji.H);
/*  32 */     a(abt.b);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  37 */     if (paramInt2 == 1) {
/*  38 */       return ajn.Y.h(paramInt1);
/*     */     }
/*  40 */     return ajn.e.h(paramInt1);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  45 */     return 32;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  60 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  65 */     boolean bool1 = e(paramahl, paramInt1, paramInt2, paramInt3 - 1);
/*  66 */     boolean bool2 = e(paramahl, paramInt1, paramInt2, paramInt3 + 1);
/*  67 */     boolean bool3 = e(paramahl, paramInt1 - 1, paramInt2, paramInt3);
/*  68 */     boolean bool4 = e(paramahl, paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  70 */     float f1 = 0.25F;
/*  71 */     float f2 = 0.75F;
/*  72 */     float f3 = 0.25F;
/*  73 */     float f4 = 0.75F;
/*  74 */     float f5 = 1.0F;
/*     */     
/*  76 */     if (bool1) {
/*  77 */       f3 = 0.0F;
/*     */     }
/*  79 */     if (bool2) {
/*  80 */       f4 = 1.0F;
/*     */     }
/*  82 */     if (bool3) {
/*  83 */       f1 = 0.0F;
/*     */     }
/*  85 */     if (bool4) {
/*  86 */       f2 = 1.0F;
/*     */     }
/*     */     
/*  89 */     if ((bool1) && (bool2) && (!bool3) && (!bool4)) {
/*  90 */       f5 = 0.8125F;
/*  91 */       f1 = 0.3125F;
/*  92 */       f2 = 0.6875F;
/*  93 */     } else if ((!bool1) && (!bool2) && (bool3) && (bool4)) {
/*  94 */       f5 = 0.8125F;
/*  95 */       f3 = 0.3125F;
/*  96 */       f4 = 0.6875F;
/*     */     }
/*     */     
/*  99 */     a(f1, 0.0F, f3, f2, f5, f4);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 104 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 105 */     this.F = 1.5D;
/* 106 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 111 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 112 */     if ((localaji == this) || (localaji == ajn.be)) {
/* 113 */       return true;
/*     */     }
/* 115 */     if ((localaji.J.k()) && (localaji.d())) {
/* 116 */       return localaji.J != awt.C;
/*     */     }
/* 118 */     return false;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 123 */     paramList.add(new add(paramadb, 1, 0));
/* 124 */     paramList.add(new add(paramadb, 1, 1));
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 129 */     return paramInt;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 134 */     if (paramInt4 == 0) {
/* 135 */       return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/* 137 */     return true;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */