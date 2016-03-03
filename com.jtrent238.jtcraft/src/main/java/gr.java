/*    */ import io.netty.buffer.ByteBuf;
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
/*    */ public class gr
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private byte[] b;
/*    */   
/*    */   public gr() {}
/*    */   
/*    */   public gr(String paramString, ByteBuf paramByteBuf)
/*    */   {
/* 27 */     this(paramString, paramByteBuf.array());
/*    */   }
/*    */   
/*    */   public gr(String paramString, byte[] paramArrayOfByte) {
/* 31 */     this.a = paramString;
/* 32 */     this.b = paramArrayOfByte;
/*    */     
/* 34 */     if (paramArrayOfByte.length >= 1048576) {
/* 35 */       throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 41 */     this.a = paramet.c(20);
/*    */     
/* 43 */     this.b = new byte[paramet.readUnsignedShort()];
/* 44 */     paramet.readBytes(this.b);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 49 */     paramet.a(this.a);
/* 50 */     paramet.writeShort(this.b.length);
/* 51 */     paramet.writeBytes(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 56 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   public byte[] d() {
/* 64 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */