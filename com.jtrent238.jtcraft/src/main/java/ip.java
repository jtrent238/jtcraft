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
/*    */ public class ip
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public ip() {}
/*    */   
/*    */   public ip(sa paramsa, int paramInt)
/*    */   {
/* 25 */     this.a = paramsa.y();
/* 26 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     this.a = paramet.readInt();
/* 32 */     this.b = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 37 */     paramet.writeInt(this.a);
/* 38 */     paramet.writeByte(this.b);
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 43 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 48 */     return String.format("id=%d, type=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b) });
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int d()
/*    */   {
/* 56 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */