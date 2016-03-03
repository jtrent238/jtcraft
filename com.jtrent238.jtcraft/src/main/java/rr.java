/*    */ 
/*    */ 
/*    */ public class rr
/*    */   extends rv
/*    */ {
/*    */   protected rr(int paramInt1, boolean paramBoolean, int paramInt2)
/*    */   {
/*  8 */     super(paramInt1, paramBoolean, paramInt2);
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, tl paramtl, int paramInt)
/*    */   {
/* 13 */     paramsv.m(paramsv.bs() - 4 * (paramInt + 1));
/* 14 */     super.a(paramsv, paramtl, paramInt);
/*    */   }
/*    */   
/*    */   public void b(sv paramsv, tl paramtl, int paramInt)
/*    */   {
/* 19 */     paramsv.m(paramsv.bs() + 4 * (paramInt + 1));
/* 20 */     super.b(paramsv, paramtl, paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */