/*    */ public class cd extends RuntimeException
/*    */ {
/*    */   private Object[] a;
/*    */   
/*    */   public cd(String paramString, Object... paramVarArgs)
/*    */   {
/*  7 */     super(paramString);
/*    */     
/*  9 */     this.a = paramVarArgs;
/*    */   }
/*    */   
/*    */   public Object[] a() {
/* 13 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */