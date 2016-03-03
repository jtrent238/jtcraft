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
/*    */ public class iz
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private int b;
/*    */   private byte[] c;
/*    */   
/*    */   public iz() {}
/*    */   
/*    */   public iz(String paramString, ByteBuf paramByteBuf)
/*    */   {
/* 27 */     this(paramString, paramByteBuf.array());
/*    */   }
/*    */   
/*    */   public iz(String paramString, byte[] paramArrayOfByte) {
/* 31 */     this.a = paramString;
/* 32 */     this.c = paramArrayOfByte;
/*    */     
/* 34 */     if (paramArrayOfByte != null) {
/* 35 */       this.b = paramArrayOfByte.length;
/*    */       
/* 37 */       if (this.b >= 32767) {
/* 38 */         throw new IllegalArgumentException("Payload may not be larger than 32k");
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 45 */     this.a = paramet.c(20);
/* 46 */     this.b = paramet.readShort();
/*    */     
/* 48 */     if ((this.b > 0) && (this.b < 32767)) {
/* 49 */       this.c = new byte[this.b];
/* 50 */       paramet.readBytes(this.c);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 56 */     paramet.a(this.a);
/* 57 */     paramet.writeShort((short)this.b);
/* 58 */     if (this.c != null) {
/* 59 */       paramet.writeBytes(this.c);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 65 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 69 */     return this.a;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public byte[] e()
/*    */   {
/* 77 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */