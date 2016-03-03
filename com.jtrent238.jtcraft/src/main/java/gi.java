/*    */ import org.apache.commons.lang3.ArrayUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gi
/*    */   extends ft
/*    */ {
/*    */   private String[] a;
/*    */   
/*    */   public gi() {}
/*    */   
/*    */   public gi(String[] paramArrayOfString)
/*    */   {
/* 18 */     this.a = paramArrayOfString;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 23 */     this.a = new String[paramet.a()];
/*    */     
/* 25 */     for (int i = 0; i < this.a.length; i++) {
/* 26 */       this.a[i] = paramet.c(32767);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 32 */     paramet.b(this.a.length);
/*    */     
/* 34 */     for (String str : this.a) {
/* 35 */       paramet.a(str);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 41 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String[] c() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 50 */     return String.format("candidates='%s'", new Object[] { ArrayUtils.toString(this.a) });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */