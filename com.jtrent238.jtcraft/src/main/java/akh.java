/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class akh
/*    */   extends ajr
/*    */ {
/*    */   protected akh()
/*    */   {
/* 13 */     super(awt.l);
/* 14 */     float f = 0.4F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
/*    */   }
/*    */   
/*    */   protected boolean a(aji paramaji)
/*    */   {
/* 20 */     return (paramaji == ajn.m) || (paramaji == ajn.ch) || (paramaji == ajn.ce) || (paramaji == ajn.d);
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 25 */     return null;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 30 */     if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/* 31 */       paramyz.a(pp.C[aji.b(this)], 1);
/*    */       
/*    */ 
/* 34 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ajn.I, 1, paramInt4));
/*    */     } else {
/* 36 */       super.a(paramahb, paramyz, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */