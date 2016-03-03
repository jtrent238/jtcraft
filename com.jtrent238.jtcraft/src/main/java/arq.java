/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arq
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 12 */     for (int i = 0; i < 64; i++) {
/* 13 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 14 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 15 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 16 */       if ((paramahb.c(j, k, m)) && 
/* 17 */         (paramahb.a(j, k - 1, m) == ajn.aL)) {
/* 18 */         paramahb.d(j, k, m, ajn.ab, 0, 2);
/*    */       }
/*    */     }
/* 21 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */