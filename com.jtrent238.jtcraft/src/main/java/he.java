/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class he
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private byte[] b;
/*    */   
/*    */   public he() {}
/*    */   
/*    */   public he(int paramInt, byte[] paramArrayOfByte)
/*    */   {
/* 18 */     this.a = paramInt;
/* 19 */     this.b = paramArrayOfByte;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 24 */     this.a = paramet.a();
/* 25 */     this.b = new byte[paramet.readUnsignedShort()];
/* 26 */     paramet.readBytes(this.b);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 31 */     paramet.b(this.a);
/* 32 */     paramet.writeShort(this.b.length);
/* 33 */     paramet.writeBytes(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 38 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 43 */     return String.format("id=%d, length=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b.length) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public byte[] d() {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */