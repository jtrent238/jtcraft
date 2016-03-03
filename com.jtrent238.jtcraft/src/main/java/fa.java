/*    */ import com.google.common.collect.BiMap;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.Channel;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.MessageToByteEncoder;
/*    */ import io.netty.util.Attribute;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ public class fa extends MessageToByteEncoder
/*    */ {
/* 15 */   private static final Logger a = ;
/* 16 */   private static final Marker b = MarkerManager.getMarker("PACKET_SENT", ej.b);
/*    */   private final eu c;
/*    */   
/*    */   public fa(eu parameu) {
/* 20 */     this.c = parameu;
/*    */   }
/*    */   
/*    */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ft paramft, ByteBuf paramByteBuf)
/*    */   {
/* 25 */     Integer localInteger = (Integer)((BiMap)paramChannelHandlerContext.channel().attr(ej.f).get()).inverse().get(paramft.getClass());
/*    */     
/*    */ 
/* 28 */     if (a.isDebugEnabled()) {
/* 29 */       a.debug(b, "OUT: [{}:{}] {}[{}]", new Object[] { paramChannelHandlerContext.channel().attr(ej.d).get(), localInteger, paramft.getClass().getName(), paramft.b() });
/*    */     }
/*    */     
/* 32 */     if (localInteger == null) {
/* 33 */       throw new IOException("Can't serialize unregistered packet");
/*    */     }
/*    */     
/* 36 */     et localet = new et(paramByteBuf);
/* 37 */     localet.b(localInteger.intValue());
/* 38 */     paramft.b(localet);
/*    */     
/* 40 */     this.c.b(localInteger.intValue(), localet.readableBytes());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */