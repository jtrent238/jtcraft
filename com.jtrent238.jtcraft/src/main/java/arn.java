/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class arn
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public arn()
/*    */   {
/* 12 */     this.a = false;
/*    */   }
/*    */   
/*    */   public arn(boolean paramBoolean) {
/* 16 */     this.a = paramBoolean;
/*    */   }
/*    */   
/*    */ 
/*    */   public abstract boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */ 
/*    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3) {}
/*    */   
/*    */ 
/*    */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 28 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, 0);
/*    */   }
/*    */   
/*    */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/* 32 */     if (this.a) {
/* 33 */       paramahb.d(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, 3);
/*    */     } else {
/* 35 */       paramahb.d(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, 2);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */