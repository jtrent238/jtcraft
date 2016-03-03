/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ir
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   
/*    */   public ir() {}
/*    */   
/*    */   public ir(String paramString)
/*    */   {
/* 18 */     if (paramString.length() > 100) {
/* 19 */       paramString = paramString.substring(0, 100);
/*    */     }
/*    */     
/* 22 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 27 */     this.a = paramet.c(100);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 32 */     paramet.a(this.a);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 37 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 42 */     return String.format("message='%s'", new Object[] { this.a });
/*    */   }
/*    */   
/*    */   public String c() {
/* 46 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */