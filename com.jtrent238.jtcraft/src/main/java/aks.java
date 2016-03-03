/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aks
/*    */   extends ajc
/*    */ {
/*    */   private rf a;
/*    */   private rf b;
/*    */   
/*    */   protected aks()
/*    */   {
/* 25 */     super(awt.e);
/* 26 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 27 */     g(0);
/* 28 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public boolean d()
/*    */   {
/* 33 */     return false;
/*    */   }
/*    */   
/*    */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 38 */     super.b(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*    */     
/* 40 */     for (int i = paramInt1 - 2; i <= paramInt1 + 2; i++) {
/* 41 */       for (int j = paramInt3 - 2; j <= paramInt3 + 2; j++) {
/* 42 */         if ((i > paramInt1 - 2) && (i < paramInt1 + 2) && (j == paramInt3 - 1)) {
/* 43 */           j = paramInt3 + 2;
/*    */         }
/* 45 */         if (paramRandom.nextInt(16) == 0) {
/* 46 */           for (int k = paramInt2; k <= paramInt2 + 1; k++) {
/* 47 */             if (paramahb.a(i, k, j) == ajn.X) {
/* 48 */               if (!paramahb.c((i - paramInt1) / 2 + paramInt1, k, (j - paramInt3) / 2 + paramInt3))
/*    */                 break;
/* 50 */               paramahb.a("enchantmenttable", paramInt1 + 0.5D, paramInt2 + 2.0D, paramInt3 + 0.5D, i - paramInt1 + paramRandom.nextFloat() - 0.5D, k - paramInt2 - paramRandom.nextFloat() - 1.0F, j - paramInt3 + paramRandom.nextFloat() - 0.5D);
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 59 */     return false;
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 64 */     if (paramInt1 == 0) return this.b;
/* 65 */     if (paramInt1 == 1) return this.a;
/* 66 */     return this.L;
/*    */   }
/*    */   
/*    */   public aor a(ahb paramahb, int paramInt)
/*    */   {
/* 71 */     return new apd();
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 76 */     if (paramahb.E) {
/* 77 */       return true;
/*    */     }
/* 79 */     apd localapd = (apd)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 80 */     paramyz.a(paramInt1, paramInt2, paramInt3, localapd.b() ? localapd.a() : null);
/* 81 */     return true;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*    */   {
/* 86 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramsv, paramadd);
/* 87 */     if (paramadd.u()) {
/* 88 */       ((apd)paramahb.o(paramInt1, paramInt2, paramInt3)).a(paramadd.s());
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(rg paramrg) {
/* 93 */     this.L = paramrg.a(N() + "_" + "side");
/* 94 */     this.a = paramrg.a(N() + "_" + "top");
/* 95 */     this.b = paramrg.a(N() + "_" + "bottom");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */