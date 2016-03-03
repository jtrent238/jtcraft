/*    */ import io.netty.channel.Channel;
/*    */ import io.netty.channel.ChannelConfig;
/*    */ import io.netty.channel.ChannelException;
/*    */ import io.netty.channel.ChannelInitializer;
/*    */ import io.netty.channel.ChannelOption;
/*    */ import io.netty.channel.ChannelPipeline;
/*    */ import io.netty.handler.timeout.ReadTimeoutHandler;
/*    */ import java.util.List;
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
/*    */ 
/*    */ class nd
/*    */   extends ChannelInitializer
/*    */ {
/*    */   nd(nc paramnc) {}
/*    */   
/*    */   protected void initChannel(Channel paramChannel)
/*    */   {
/*    */     try
/*    */     {
/* 51 */       paramChannel.config().setOption(ChannelOption.IP_TOS, Integer.valueOf(24));
/*    */     }
/*    */     catch (ChannelException localChannelException1) {}
/*    */     try
/*    */     {
/* 56 */       paramChannel.config().setOption(ChannelOption.TCP_NODELAY, Boolean.valueOf(false));
/*    */     }
/*    */     catch (ChannelException localChannelException2) {}
/*    */     
/* 60 */     paramChannel.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("legacy_query", new mz(this.a)).addLast("splitter", new fc()).addLast("decoder", new ez(ej.h)).addLast("prepender", new fd()).addLast("encoder", new fa(ej.h));
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
/* 71 */     ej localej = new ej(false);
/* 72 */     nc.a(this.a).add(localej);
/* 73 */     paramChannel.pipeline().addLast("packet_handler", localej);
/* 74 */     localej.a(new nl(nc.b(this.a), localej));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */