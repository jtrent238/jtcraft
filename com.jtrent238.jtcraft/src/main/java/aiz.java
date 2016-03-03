/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aiz
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 14 */     for (int i = 0; i < 10; i++) {
/* 15 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 16 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 17 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 18 */       if ((paramahb.c(j, k, m)) && 
/* 19 */         (ajn.bi.c(paramahb, j, k, m))) {
/* 20 */         paramahb.d(j, k, m, ajn.bi, 0, 2);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */