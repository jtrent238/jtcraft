/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class ei
/*    */   extends MessageToByteEncoder
/*    */ {
/*    */   private final eg a;
/*    */   
/*    */   public ei(Cipher paramCipher)
/*    */   {
/* 13 */     this.a = new eg(paramCipher);
/*    */   }
/*    */   
/*    */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf1, ByteBuf paramByteBuf2)
/*    */   {
/* 18 */     this.a.a(paramByteBuf1, paramByteBuf2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */