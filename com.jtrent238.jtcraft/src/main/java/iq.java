/*    */ import org.apache.commons.lang3.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class iq
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   
/*    */   public iq() {}
/*    */   
/*    */   public iq(String paramString)
/*    */   {
/* 16 */     this.a = paramString;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 21 */     this.a = paramet.c(32767);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 26 */     paramet.a(StringUtils.substring(this.a, 0, 32767));
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 31 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 35 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 40 */     return String.format("message='%s'", new Object[] { this.a });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\iq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */