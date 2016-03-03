/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asp
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   
/*    */   public asp(aji paramaji, int paramInt)
/*    */   {
/* 15 */     this.a = paramaji;
/* 16 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     aji localaji;
/* 23 */     while ((((localaji = paramahb.a(paramInt1, paramInt2, paramInt3)).o() == awt.a) || (localaji.o() == awt.j)) && (paramInt2 > 0)) {
/* 24 */       paramInt2--;
/*    */     }
/* 26 */     for (int i = 0; i < 128; i++) {
/* 27 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 28 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 29 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 30 */       if ((paramahb.c(j, k, m)) && 
/* 31 */         (this.a.j(paramahb, j, k, m))) {
/* 32 */         paramahb.d(j, k, m, this.a, this.b, 2);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 37 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */