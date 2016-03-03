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
/*     */ public class akt
/*     */   extends ajc
/*     */ {
/*     */   public static boolean a;
/*     */   
/*     */   protected akt(awt paramawt)
/*     */   {
/*  18 */     super(paramawt);
/*  19 */     a(1.0F);
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  24 */     return new apo();
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  29 */     float f = 0.0625F;
/*  30 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  35 */     if (paramInt4 != 0) return false;
/*  36 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa) {}
/*     */   
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  55 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/*  60 */     if ((paramsa.m == null) && (paramsa.l == null) && 
/*  61 */       (!paramahb.E)) {
/*  62 */       paramsa.b(1);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  69 */     double d1 = paramInt1 + paramRandom.nextFloat();
/*  70 */     double d2 = paramInt2 + 0.8F;
/*  71 */     double d3 = paramInt3 + paramRandom.nextFloat();
/*  72 */     double d4 = 0.0D;
/*  73 */     double d5 = 0.0D;
/*  74 */     double d6 = 0.0D;
/*     */     
/*  76 */     paramahb.a("smoke", d1, d2, d3, d4, d5, d6);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  81 */     return -1;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  86 */     if (a) { return;
/*     */     }
/*  88 */     if (paramahb.t.i != 0) {
/*  89 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  95 */     return adb.d(0);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/* 101 */     this.L = paramrg.a("portal");
/*     */   }
/*     */   
/*     */   public awv f(int paramInt)
/*     */   {
/* 106 */     return awv.J;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */