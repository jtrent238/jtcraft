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
/*    */ 
/*    */ public class hh
/*    */   extends hf
/*    */ {
/*    */   public hh()
/*    */   {
/* 22 */     this.g = true;
/*    */   }
/*    */   
/*    */   public hh(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5) {
/* 26 */     super(paramInt);
/* 27 */     this.b = paramByte1;
/* 28 */     this.c = paramByte2;
/* 29 */     this.d = paramByte3;
/* 30 */     this.e = paramByte4;
/* 31 */     this.f = paramByte5;
/* 32 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     super.a(paramet);
/* 38 */     this.b = paramet.readByte();
/* 39 */     this.c = paramet.readByte();
/* 40 */     this.d = paramet.readByte();
/* 41 */     this.e = paramet.readByte();
/* 42 */     this.f = paramet.readByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 47 */     super.b(paramet);
/* 48 */     paramet.writeByte(this.b);
/* 49 */     paramet.writeByte(this.c);
/* 50 */     paramet.writeByte(this.d);
/* 51 */     paramet.writeByte(this.e);
/* 52 */     paramet.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 57 */     return super.b() + String.format(", xa=%d, ya=%d, za=%d, yRot=%d, xRot=%d", new Object[] { Byte.valueOf(this.b), Byte.valueOf(this.c), Byte.valueOf(this.d), Byte.valueOf(this.e), Byte.valueOf(this.f) });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */