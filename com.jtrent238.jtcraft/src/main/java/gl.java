/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gl
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public gl() {}
/*    */   
/*    */   public gl(int paramInt, short paramShort, boolean paramBoolean)
/*    */   {
/* 19 */     this.a = paramInt;
/* 20 */     this.b = paramShort;
/* 21 */     this.c = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 26 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 31 */     this.a = paramet.readUnsignedByte();
/* 32 */     this.b = paramet.readShort();
/* 33 */     this.c = paramet.readBoolean();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 38 */     paramet.writeByte(this.a);
/* 39 */     paramet.writeShort(this.b);
/* 40 */     paramet.writeBoolean(this.c);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 45 */     return String.format("id=%d, uid=%d, accepted=%b", new Object[] { Integer.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 49 */     return this.a;
/*    */   }
/*    */   
/*    */   public short d() {
/* 53 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 57 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */