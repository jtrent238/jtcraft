/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arh
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 12 */     for (int i = 0; i < 10; i++) {
/* 13 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 14 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 15 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 16 */       if (paramahb.c(j, k, m)) {
/* 17 */         int n = 1 + paramRandom.nextInt(paramRandom.nextInt(3) + 1);
/* 18 */         for (int i1 = 0; i1 < n; i1++) {
/* 19 */           if (ajn.aF.j(paramahb, j, k + i1, m)) {
/* 20 */             paramahb.d(j, k + i1, m, ajn.aF, 0, 2);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 26 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */