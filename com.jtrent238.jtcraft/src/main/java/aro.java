/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aro
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   
/*    */   public aro(aji paramaji)
/*    */   {
/* 13 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public void a(aji paramaji, int paramInt) {
/* 17 */     this.a = paramaji;
/* 18 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 23 */     for (int i = 0; i < 64; i++) {
/* 24 */       int j = paramInt1 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 25 */       int k = paramInt2 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 26 */       int m = paramInt3 + paramRandom.nextInt(8) - paramRandom.nextInt(8);
/* 27 */       if ((paramahb.c(j, k, m)) && ((!paramahb.t.g) || (k < 255)) && 
/* 28 */         (this.a.j(paramahb, j, k, m))) {
/* 29 */         paramahb.d(j, k, m, this.a, this.b, 2);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 34 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */