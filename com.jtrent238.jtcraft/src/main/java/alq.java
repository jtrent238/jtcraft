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
/*     */ public class alq
/*     */   extends ajc
/*     */ {
/*     */   private rf a;
/*     */   
/*     */   protected alq()
/*     */   {
/*  52 */     super(awt.d);
/*  53 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  58 */     if (paramInt1 == 1) {
/*  59 */       return this.a;
/*     */     }
/*  61 */     return this.L;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  66 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 0) return false;
/*  67 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, add paramadd) {
/*  72 */     if (paramahb.E) { return;
/*     */     }
/*  74 */     alr localalr = (alr)paramahb.o(paramInt1, paramInt2, paramInt3);
/*  75 */     if (localalr == null) { return;
/*     */     }
/*  77 */     localalr.a(paramadd.m());
/*     */     
/*  79 */     paramahb.a(paramInt1, paramInt2, paramInt3, 1, 2);
/*     */   }
/*     */   
/*     */   public void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  83 */     if (paramahb.E) { return;
/*     */     }
/*  85 */     alr localalr = (alr)paramahb.o(paramInt1, paramInt2, paramInt3);
/*  86 */     if (localalr == null) { return;
/*     */     }
/*  88 */     add localadd1 = localalr.a();
/*  89 */     if (localadd1 == null) { return;
/*     */     }
/*  91 */     paramahb.c(1005, paramInt1, paramInt2, paramInt3, 0);
/*  92 */     paramahb.a(null, paramInt1, paramInt2, paramInt3);
/*  93 */     localalr.a(null);
/*  94 */     paramahb.a(paramInt1, paramInt2, paramInt3, 0, 2);
/*     */     
/*  96 */     float f = 0.7F;
/*  97 */     double d1 = paramahb.s.nextFloat() * f + (1.0F - f) * 0.5D;
/*  98 */     double d2 = paramahb.s.nextFloat() * f + (1.0F - f) * 0.2D + 0.6D;
/*  99 */     double d3 = paramahb.s.nextFloat() * f + (1.0F - f) * 0.5D;
/*     */     
/* 101 */     add localadd2 = localadd1.m();
/*     */     
/* 103 */     xk localxk = new xk(paramahb, paramInt1 + d1, paramInt2 + d2, paramInt3 + d3, localadd2);
/* 104 */     localxk.b = 10;
/* 105 */     paramahb.d(localxk);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 110 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/* 111 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 116 */     if (paramahb.E) return;
/* 117 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0);
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 122 */     return new alr();
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 127 */     this.L = paramrg.a(N() + "_side");
/* 128 */     this.a = paramrg.a(N() + "_top");
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 138 */     add localadd = ((alr)paramahb.o(paramInt1, paramInt2, paramInt3)).a();
/*     */     
/* 140 */     return localadd == null ? 0 : adb.b(localadd.b()) + 1 - adb.b(ade.cd);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */