/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hv
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private String b;
/*    */   
/*    */   public hv() {}
/*    */   
/*    */   public hv(int paramInt, azx paramazx)
/*    */   {
/* 17 */     this.a = paramInt;
/*    */     
/* 19 */     if (paramazx == null) {
/* 20 */       this.b = "";
/*    */     } else {
/* 22 */       this.b = paramazx.b();
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 28 */     this.a = paramet.readByte();
/* 29 */     this.b = paramet.c(16);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 34 */     paramet.writeByte(this.a);
/* 35 */     paramet.a(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 40 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 44 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 48 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */