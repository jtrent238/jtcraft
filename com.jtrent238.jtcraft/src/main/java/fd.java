/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fd
/*    */   extends MessageToByteEncoder
/*    */ {
/*    */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2)
/*    */   {
/* 16 */     int i = paramByteBuf1.readableBytes();
/* 17 */     int j = et.a(i);
/*    */     
/* 19 */     if (j > 3) {
/* 20 */       throw new IllegalArgumentException("unable to fit " + i + " into " + 3);
/*    */     }
/*    */     
/* 23 */     et localet = new et(paramByteBuf2);
/*    */     
/* 25 */     localet.ensureWritable(j + i);
/*    */     
/* 27 */     localet.b(i);
/* 28 */     localet.writeBytes(paramByteBuf1, paramByteBuf1.readerIndex(), i);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */