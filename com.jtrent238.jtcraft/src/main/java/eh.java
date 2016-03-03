/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToMessageDecoder;
/*    */ import java.util.List;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ public class eh
/*    */   extends MessageToMessageDecoder
/*    */ {
/*    */   private final eg a;
/*    */   
/*    */   public eh(Cipher paramCipher)
/*    */   {
/* 14 */     this.a = new eg(paramCipher);
/*    */   }
/*    */   
/*    */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList)
/*    */   {
/* 19 */     paramList.add(this.a.a(paramChannelHandlerContext, paramByteBuf));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */