/*    */ 
/*    */ public class s
/*    */   extends RuntimeException
/*    */ {
/*    */   private final b a;
/*    */   
/*    */   public s(b paramb)
/*    */   {
/*  9 */     this.a = paramb;
/*    */   }
/*    */   
/*    */   public b a() {
/* 13 */     return this.a;
/*    */   }
/*    */   
/*    */   public Throwable getCause()
/*    */   {
/* 18 */     return this.a.b();
/*    */   }
/*    */   
/*    */   public String getMessage()
/*    */   {
/* 23 */     return this.a.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */