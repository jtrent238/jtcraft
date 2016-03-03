/*    */ public class agd
/*    */   extends aft
/*    */ {
/*    */   protected agd(int paramInt1, int paramInt2)
/*    */   {
/*  6 */     super(paramInt1, paramInt2, afu.g);
/*    */     
/*  8 */     b("fire");
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 13 */     return 10 + 20 * (paramInt - 1);
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


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */