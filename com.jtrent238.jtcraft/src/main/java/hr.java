/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hr
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public hr() {}
/*    */   
/*    */   public hr(int paramInt, rw paramrw)
/*    */   {
/* 18 */     this.a = paramInt;
/* 19 */     this.b = paramrw.a();
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = paramet.readInt();
/* 25 */     this.b = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 30 */     paramet.writeInt(this.a);
/* 31 */     paramet.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 36 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 44 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */