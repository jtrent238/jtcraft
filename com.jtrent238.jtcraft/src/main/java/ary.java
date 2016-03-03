/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ary
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 13 */     if (!paramahb.c(paramInt1, paramInt2, paramInt3)) return false;
/* 14 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) != ajn.aL) return false;
/* 15 */     paramahb.d(paramInt1, paramInt2, paramInt3, ajn.aN, 0, 2);
/*    */     
/* 17 */     for (int i = 0; i < 1500; i++) {
/* 18 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 19 */       int k = paramInt2 - paramRandom.nextInt(12);
/* 20 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 21 */       if (paramahb.a(j, k, m).o() == awt.a)
/*    */       {
/* 23 */         int n = 0;
/* 24 */         for (int i1 = 0; i1 < 6; i1++) {
/* 25 */           aji localaji = null;
/* 26 */           if (i1 == 0) localaji = paramahb.a(j - 1, k, m);
/* 27 */           if (i1 == 1) localaji = paramahb.a(j + 1, k, m);
/* 28 */           if (i1 == 2) localaji = paramahb.a(j, k - 1, m);
/* 29 */           if (i1 == 3) localaji = paramahb.a(j, k + 1, m);
/* 30 */           if (i1 == 4) localaji = paramahb.a(j, k, m - 1);
/* 31 */           if (i1 == 5) { localaji = paramahb.a(j, k, m + 1);
/*    */           }
/* 33 */           if (localaji == ajn.aN) { n++;
/*    */           }
/*    */         }
/* 36 */         if (n == 1) paramahb.d(j, k, m, ajn.aN, 0, 2);
/*    */       }
/*    */     }
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */