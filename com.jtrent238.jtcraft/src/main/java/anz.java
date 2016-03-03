/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anz
/*     */   extends ajr
/*     */   implements ajo
/*     */ {
/*  13 */   private static final String[] a = { "deadbush", "tallgrass", "fern" };
/*     */   
/*     */ 
/*     */ 
/*     */   private rf[] b;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected anz()
/*     */   {
/*  24 */     super(awt.l);
/*  25 */     float f = 0.4F;
/*  26 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  31 */     if (paramInt2 >= this.b.length) paramInt2 = 0;
/*  32 */     return this.b[paramInt2];
/*     */   }
/*     */   
/*     */   public int D()
/*     */   {
/*  37 */     double d1 = 0.5D;
/*  38 */     double d2 = 1.0D;
/*     */     
/*  40 */     return aha.a(d1, d2);
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     return a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3));
/*     */   }
/*     */   
/*     */   public int i(int paramInt)
/*     */   {
/*  50 */     if (paramInt == 0) { return 16777215;
/*     */     }
/*  52 */     return aha.a(0.5D, 1.0D);
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  57 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  58 */     if (i == 0) { return 16777215;
/*     */     }
/*  60 */     return paramahl.a(paramInt1, paramInt3).b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  65 */     if (paramRandom.nextInt(8) == 0) {
/*  66 */       return ade.N;
/*     */     }
/*     */     
/*  69 */     return null;
/*     */   }
/*     */   
/*     */   public int a(int paramInt, Random paramRandom)
/*     */   {
/*  74 */     return 1 + paramRandom.nextInt(paramInt * 2 + 1);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  79 */     if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/*  80 */       paramyz.a(pp.C[aji.b(this)], 1);
/*     */       
/*     */ 
/*  83 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ajn.H, 1, paramInt4));
/*     */     } else {
/*  85 */       super.a(paramahb, paramyz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  91 */     return paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/*  96 */     for (int i = 1; i < 3; i++) {
/*  97 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 103 */     this.b = new rf[a.length];
/*     */     
/* 105 */     for (int i = 0; i < this.b.length; i++) {
/* 106 */       this.b[i] = paramrg.a(a[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 112 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 113 */     if (i == 0) {
/* 114 */       return false;
/*     */     }
/* 116 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 121 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 126 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 127 */     int j = 2;
/* 128 */     if (i == 2) {
/* 129 */       j = 3;
/*     */     }
/* 131 */     if (ajn.cm.c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 132 */       ajn.cm.c(paramahb, paramInt1, paramInt2, paramInt3, j, 2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */