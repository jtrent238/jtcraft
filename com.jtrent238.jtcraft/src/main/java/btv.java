/*    */ public class btv implements btu
/*    */ {
/*    */   private final bti a;
/*    */   private final int b;
/*    */   
/*    */   btv(bti parambti, int paramInt)
/*    */   {
/*  8 */     this.a = parambti;
/*  9 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 14 */     return this.b;
/*    */   }
/*    */   
/*    */   public bti b()
/*    */   {
/* 19 */     return new bti(this.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */