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
/*    */ public class ic
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private String b;
/*    */   private int c;
/*    */   
/*    */   public ic() {}
/*    */   
/*    */   public ic(azx paramazx, int paramInt)
/*    */   {
/* 22 */     this.a = paramazx.b();
/* 23 */     this.b = paramazx.d();
/* 24 */     this.c = paramInt;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.c(16);
/* 30 */     this.b = paramet.c(32);
/* 31 */     this.c = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 36 */     paramet.a(this.a);
/* 37 */     paramet.a(this.b);
/* 38 */     paramet.writeByte(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 43 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public String d() {
/* 51 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 55 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */