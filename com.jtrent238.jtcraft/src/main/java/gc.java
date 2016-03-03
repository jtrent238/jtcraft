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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gc
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public gc() {}
/*    */   
/*    */   public gc(sa paramsa, int paramInt)
/*    */   {
/* 26 */     this.a = paramsa.y();
/* 27 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.a();
/* 33 */     this.b = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 38 */     paramet.b(this.a);
/* 39 */     paramet.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 44 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 49 */     return String.format("id=%d, type=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 53 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 57 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */