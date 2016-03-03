/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ark
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   
/*    */   public ark(aji paramaji)
/*    */   {
/* 14 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     aji localaji;
/* 20 */     while ((((localaji = paramahb.a(paramInt1, paramInt2, paramInt3)).o() == awt.a) || (localaji.o() == awt.j)) && (paramInt2 > 0)) {
/* 21 */       paramInt2--;
/*    */     }
/* 23 */     for (int i = 0; i < 4; i++) {
/* 24 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 25 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 26 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 27 */       if ((paramahb.c(j, k, m)) && 
/* 28 */         (this.a.j(paramahb, j, k, m))) {
/* 29 */         paramahb.d(j, k, m, this.a, 0, 2);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 34 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ark.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */