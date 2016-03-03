/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum it
/*    */ {
/*    */   private final int d;
/*    */   private static final it[] e;
/*    */   
/*    */   private it(int paramInt1)
/*    */   {
/* 18 */     this.d = paramInt1;
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 15 */     e = new it[values().length];
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 22 */     for (it localit : values()) {
/* 23 */       e[localit.d] = localit;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\it.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */