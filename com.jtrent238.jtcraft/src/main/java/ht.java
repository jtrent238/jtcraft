/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ht
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   
/*    */   public ht() {}
/*    */   
/*    */   public ht(sa paramsa, byte paramByte)
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
/*    */   public String b()
/*    */   {
/* 43 */     return String.format("id=%d, rot=%d", new Object[] { Integer.valueOf(this.a), Byte.valueOf(this.b) });
/*    */   }
/*    */   
/*    */   public sa a(ahb paramahb) {
/* 47 */     return paramahb.a(this.a);
/*    */   }
/*    */   
/*    */   public byte c() {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */