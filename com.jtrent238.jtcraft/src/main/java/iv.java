/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class iv
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public iv() {}
/*    */   
/*    */   public iv(int paramInt, short paramShort, boolean paramBoolean)
/*    */   {
/* 17 */     this.a = paramInt;
/* 18 */     this.b = paramShort;
/* 19 */     this.c = paramBoolean;
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 24 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.readByte();
/* 30 */     this.b = paramet.readShort();
/* 31 */     this.c = (paramet.readByte() != 0);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 36 */     paramet.writeByte(this.a);
/* 37 */     paramet.writeShort(this.b);
/* 38 */     paramet.writeByte(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 43 */     return String.format("id=%d, uid=%d, accepted=%b", new Object[] { Integer.valueOf(this.a), Short.valueOf(this.b), Boolean.valueOf(this.c) });
/*    */   }
/*    */   
/*    */   public int c() {
/* 47 */     return this.a;
/*    */   }
/*    */   
/*    */   public short d() {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */