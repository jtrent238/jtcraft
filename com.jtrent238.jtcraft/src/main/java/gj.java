/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gj
/*    */   extends ft
/*    */ {
/*    */   private fj a;
/* 11 */   private boolean b = true;
/*    */   
/*    */ 
/*    */   public gj() {}
/*    */   
/*    */   public gj(fj paramfj)
/*    */   {
/* 18 */     this(paramfj, true);
/*    */   }
/*    */   
/*    */   public gj(fj paramfj, boolean paramBoolean) {
/* 22 */     this.a = paramfj;
/* 23 */     this.b = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 28 */     this.a = fk.a(paramet.c(32767));
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 33 */     paramet.a(fk.a(this.a));
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 38 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 43 */     return String.format("message='%s'", new Object[] { this.a });
/*    */   }
/*    */   
/*    */   public fj c() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */