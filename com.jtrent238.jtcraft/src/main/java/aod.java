/*    */ 
/*    */ 
/*    */ public class aod
/*    */   extends aji
/*    */ {
/*    */   protected boolean P;
/*    */   
/*    */   protected aod(awt paramawt, boolean paramBoolean)
/*    */   {
/* 10 */     super(paramawt);
/* 11 */     this.P = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean c()
/*    */   {
/* 16 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 21 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 22 */     if ((!this.P) && (localaji == this)) return false;
/* 23 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */