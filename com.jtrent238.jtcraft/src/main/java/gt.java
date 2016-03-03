/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gt
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   
/*    */   public gt() {}
/*    */   
/*    */   public gt(sa paramsa, byte paramByte)
/*    */   {
/* 20 */     this.a = paramsa.y();
/* 21 */     this.b = paramByte;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 26 */     this.a = paramet.readInt();
/* 27 */     this.b = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 32 */     paramet.writeInt(this.a);
/* 33 */     paramet.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 38 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public sa a(ahb paramahb) {
/* 42 */     return paramahb.a(this.a);
/*    */   }
/*    */   
/*    */   public byte c() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */