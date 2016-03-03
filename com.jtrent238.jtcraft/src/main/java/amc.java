/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class amc
/*    */   extends ajr
/*    */   implements ajo
/*    */ {
/*    */   protected amc()
/*    */   {
/* 10 */     float f = 0.2F;
/* 11 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/* 12 */     a(true);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 17 */     if (paramRandom.nextInt(25) == 0) {
/* 18 */       int i = 4;
/* 19 */       int j = 5;
/* 20 */       for (int k = paramInt1 - i; k <= paramInt1 + i; k++) {
/* 21 */         for (m = paramInt3 - i; m <= paramInt3 + i; m++)
/* 22 */           for (n = paramInt2 - 1; n <= paramInt2 + 1; n++)
/* 23 */             if (paramahb.a(k, n, m) == this) { j--; if (j <= 0) return;
/*    */             }
/*    */       }
/* 26 */       k = paramInt1 + paramRandom.nextInt(3) - 1;
/* 27 */       int m = paramInt2 + paramRandom.nextInt(2) - paramRandom.nextInt(2);
/* 28 */       int n = paramInt3 + paramRandom.nextInt(3) - 1;
/* 29 */       for (int i1 = 0; i1 < 4; i1++) {
/* 30 */         if ((paramahb.c(k, m, n)) && (j(paramahb, k, m, n))) {
/* 31 */           paramInt1 = k;
/* 32 */           paramInt2 = m;
/* 33 */           paramInt3 = n;
/*    */         }
/* 35 */         k = paramInt1 + paramRandom.nextInt(3) - 1;
/* 36 */         m = paramInt2 + paramRandom.nextInt(2) - paramRandom.nextInt(2);
/* 37 */         n = paramInt3 + paramRandom.nextInt(3) - 1;
/*    */       }
/*    */       
/* 40 */       if ((paramahb.c(k, m, n)) && (j(paramahb, k, m, n))) {
/* 41 */         paramahb.d(k, m, n, this, 0, 2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 48 */     return (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (j(paramahb, paramInt1, paramInt2, paramInt3));
/*    */   }
/*    */   
/*    */   protected boolean a(aji paramaji)
/*    */   {
/* 53 */     return paramaji.j();
/*    */   }
/*    */   
/*    */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 58 */     if ((paramInt2 < 0) || (paramInt2 >= 256)) { return false;
/*    */     }
/* 60 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*    */     
/* 62 */     return (localaji == ajn.bh) || ((localaji == ajn.d) && (paramahb.e(paramInt1, paramInt2 - 1, paramInt3) == 2)) || ((paramahb.j(paramInt1, paramInt2, paramInt3) < 13) && (a(localaji)));
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 68 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*    */     
/* 70 */     paramahb.f(paramInt1, paramInt2, paramInt3);
/* 71 */     aru localaru = null;
/*    */     
/* 73 */     if (this == ajn.P) {
/* 74 */       localaru = new aru(0);
/* 75 */     } else if (this == ajn.Q) {
/* 76 */       localaru = new aru(1);
/*    */     }
/*    */     
/* 79 */     if ((localaru == null) || (!localaru.a(paramahb, paramRandom, paramInt1, paramInt2, paramInt3))) {
/* 80 */       paramahb.d(paramInt1, paramInt2, paramInt3, this, i, 3);
/* 81 */       return false;
/*    */     }
/* 83 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*    */   {
/* 88 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 93 */     return paramRandom.nextFloat() < 0.4D;
/*    */   }
/*    */   
/*    */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 98 */     c(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */