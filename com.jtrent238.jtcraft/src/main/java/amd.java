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
/*    */ public class amd
/*    */   extends aji
/*    */ {
/*    */   private rf a;
/*    */   private rf b;
/*    */   
/*    */   protected amd()
/*    */   {
/* 20 */     super(awt.b);
/* 21 */     a(true);
/* 22 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 27 */     if (paramInt1 == 1) return this.a;
/* 28 */     if (paramInt1 == 0) return ajn.d.h(paramInt1);
/* 29 */     return this.L;
/*    */   }
/*    */   
/*    */   public rf e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 34 */     if (paramInt4 == 1) return this.a;
/* 35 */     if (paramInt4 == 0) return ajn.d.h(paramInt4);
/* 36 */     awt localawt = paramahl.a(paramInt1, paramInt2 + 1, paramInt3).o();
/* 37 */     if ((localawt == awt.y) || (localawt == awt.z)) return this.b;
/* 38 */     return this.L;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 43 */     this.L = paramrg.a(N() + "_side");
/* 44 */     this.a = paramrg.a(N() + "_top");
/* 45 */     this.b = paramrg.a("grass_side_snowed");
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 50 */     if (paramahb.E) { return;
/*    */     }
/* 52 */     if ((paramahb.k(paramInt1, paramInt2 + 1, paramInt3) < 4) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).k() > 2)) {
/* 53 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.d);
/*    */     }
/* 55 */     else if (paramahb.k(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/* 56 */       for (int i = 0; i < 4; i++) {
/* 57 */         int j = paramInt1 + paramRandom.nextInt(3) - 1;
/* 58 */         int k = paramInt2 + paramRandom.nextInt(5) - 3;
/* 59 */         int m = paramInt3 + paramRandom.nextInt(3) - 1;
/* 60 */         aji localaji = paramahb.a(j, k + 1, m);
/* 61 */         if ((paramahb.a(j, k, m) == ajn.d) && (paramahb.e(j, k, m) == 0) && (paramahb.k(j, k + 1, m) >= 4) && (localaji.k() <= 2)) {
/* 62 */           paramahb.b(j, k, m, this);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 71 */     super.b(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/* 72 */     if (paramRandom.nextInt(10) == 0) paramahb.a("townaura", paramInt1 + paramRandom.nextFloat(), paramInt2 + 1.1F, paramInt3 + paramRandom.nextFloat(), 0.0D, 0.0D, 0.0D);
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 77 */     return ajn.d.a(0, paramRandom, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */