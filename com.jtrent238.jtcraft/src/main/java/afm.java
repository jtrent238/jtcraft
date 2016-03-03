/*    */ public class afm
/*    */   extends aft
/*    */ {
/*    */   public afm(int paramInt1, int paramInt2)
/*    */   {
/*  6 */     super(paramInt1, paramInt2, afu.k);
/*  7 */     b("arrowDamage");
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 12 */     return 1 + (paramInt - 1) * 10;
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 17 */     return a(paramInt) + 15;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 22 */     return 5;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */