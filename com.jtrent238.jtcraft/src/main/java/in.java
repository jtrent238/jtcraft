/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class in
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private byte b;
/*    */   private byte c;
/*    */   private short d;
/*    */   
/*    */   public in() {}
/*    */   
/*    */   public in(int paramInt, rw paramrw)
/*    */   {
/* 22 */     this.a = paramInt;
/* 23 */     this.b = ((byte)(paramrw.a() & 0xFF));
/* 24 */     this.c = ((byte)(paramrw.c() & 0xFF));
/* 25 */     if (paramrw.b() > 32767) {
/* 26 */       this.d = Short.MAX_VALUE;
/*    */     }
/*    */     else {
/* 29 */       this.d = ((short)paramrw.b());
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 35 */     this.a = paramet.readInt();
/* 36 */     this.b = paramet.readByte();
/* 37 */     this.c = paramet.readByte();
/* 38 */     this.d = paramet.readShort();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 43 */     paramet.writeInt(this.a);
/* 44 */     paramet.writeByte(this.b);
/* 45 */     paramet.writeByte(this.c);
/* 46 */     paramet.writeShort(this.d);
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 50 */     return this.d == Short.MAX_VALUE;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 55 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public int d() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public byte e() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public byte f() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public short g() {
/* 71 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\in.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */