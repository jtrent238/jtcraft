/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arm
/*    */   extends arn
/*    */ {
/*    */   private int a;
/*    */   
/*    */   public void a(int paramInt)
/*    */   {
/* 15 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     boolean bool = false;
/*    */     
/* 22 */     for (int i = 0; i < 64; i++) {
/* 23 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 24 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 25 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 26 */       if ((paramahb.c(j, k, m)) && ((!paramahb.t.g) || (k < 254)) && 
/* 27 */         (ajn.cm.c(paramahb, j, k, m))) {
/* 28 */         ajn.cm.c(paramahb, j, k, m, this.a, 2);
/* 29 */         bool = true;
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 34 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */