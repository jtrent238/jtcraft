/*    */ public class agf
/*    */   extends aft
/*    */ {
/*    */   protected agf(int paramInt1, int paramInt2)
/*    */   {
/*  6 */     super(paramInt1, paramInt2, afu.g);
/*    */     
/*  8 */     b("knockback");
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 13 */     return 5 + 20 * (paramInt - 1);
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 18 */     return super.a(paramInt) + 50;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 23 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */