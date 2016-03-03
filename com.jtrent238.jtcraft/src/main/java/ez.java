/*    */ import com.google.common.collect.BiMap;
/*    */ import io.netty.buffer.ByteBuf;
/*    */ import io.netty.channel.Channel;
/*    */ import io.netty.channel.ChannelHandlerContext;
/*    */ import io.netty.handler.codec.ByteToMessageDecoder;
/*    */ import io.netty.util.Attribute;
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.Marker;
/*    */ import org.apache.logging.log4j.MarkerManager;
/*    */ 
/*    */ public class ez extends ByteToMessageDecoder
/*    */ {
/* 16 */   private static final Logger a = ;
/* 17 */   private static final Marker b = MarkerManager.getMarker("PACKET_RECEIVED", ej.b);
/*    */   private final eu c;
/*    */   
/*    */   public ez(eu parameu)
/*    */   {
/* 22 */     this.c = parameu;
/*    */   }
/*    */   
/*    */   protected void decode(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf, List paramList)
/*    */   {
/* 27 */     int i = paramByteBuf.readableBytes();
/* 28 */     if (i == 0) {
/* 29 */       return;
/*    */     }
/*    */     
/* 32 */     et localet = new et(paramByteBuf);
/* 33 */     int j = localet.a();
/* 34 */     ft localft = ft.a((BiMap)paramChannelHandlerContext.channel().attr(ej.e).get(), j);
/*    */     
/* 36 */     if (localft == null) {
/* 37 */       throw new IOException("Bad packet id " + j);
/*    */     }
/*    */     
/* 40 */     localft.a(localet);
/* 41 */     if (localet.readableBytes() > 0) {
/* 42 */       throw new IOException("Packet was larger than I expected, found " + localet.readableBytes() + " bytes extra whilst reading packet " + j);
/*    */     }
/* 44 */     paramList.add(localft);
/*    */     
/* 46 */     this.c.a(j, i);
/*    */     
/*    */ 
/* 49 */     if (a.isDebugEnabled()) {
/* 50 */       a.debug(b, " IN: [{}:{}] {}[{}]", new Object[] { paramChannelHandlerContext.channel().attr(ej.d).get(), Integer.valueOf(j), localft.getClass().getName(), localft.b() });
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */