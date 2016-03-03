/*    */ 
/*    */ 
/*    */ public class bcj
/*    */   extends bcb
/*    */ {
/*    */   private final bbm o;
/*    */   
/*    */   public bcj(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*    */   {
/* 10 */     this(paramInt1, paramInt2, paramInt3, null, paramString);
/*    */   }
/*    */   
/*    */   public bcj(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString) {
/* 14 */     super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/* 15 */     this.o = null;
/*    */   }
/*    */   
/*    */   public bcj(int paramInt1, int paramInt2, int paramInt3, bbm parambbm, String paramString) {
/* 19 */     super(paramInt1, paramInt2, paramInt3, 150, 20, paramString);
/* 20 */     this.o = parambbm;
/*    */   }
/*    */   
/*    */   public bbm d() {
/* 24 */     return this.o;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */