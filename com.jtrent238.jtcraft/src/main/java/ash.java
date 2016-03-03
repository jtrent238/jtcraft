/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ash
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 13 */     for (int i = 0; i < 20; i++) {
/* 14 */       int j = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 15 */       int k = paramInt2;
/* 16 */       int m = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 17 */       if ((paramahb.c(j, k, m)) && (
/* 18 */         (paramahb.a(j - 1, k - 1, m).o() == awt.h) || (paramahb.a(j + 1, k - 1, m).o() == awt.h) || (paramahb.a(j, k - 1, m - 1).o() == awt.h) || (paramahb.a(j, k - 1, m + 1).o() == awt.h)))
/*    */       {
/*    */ 
/* 21 */         int n = 2 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 22 */         for (int i1 = 0; i1 < n; i1++) {
/* 23 */           if (ajn.aH.j(paramahb, j, k + i1, m)) {
/* 24 */             paramahb.d(j, k + i1, m, ajn.aH, 0, 2);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ash.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */