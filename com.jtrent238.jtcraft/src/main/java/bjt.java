/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Iterables;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bjt
/*     */   extends SimpleChannelInboundHandler
/*     */ {
/*     */   bjt(bjs parambjs) {}
/*     */   
/*     */   public void channelActive(ChannelHandlerContext paramChannelHandlerContext)
/*     */   {
/* 169 */     super.channelActive(paramChannelHandlerContext);
/* 170 */     ByteBuf localByteBuf = Unpooled.buffer();
/*     */     try {
/* 172 */       localByteBuf.writeByte(254);
/* 173 */       localByteBuf.writeByte(1);
/* 174 */       localByteBuf.writeByte(250);
/*     */       
/* 176 */       char[] arrayOfChar1 = "MC|PingHost".toCharArray();
/* 177 */       localByteBuf.writeShort(arrayOfChar1.length);
/* 178 */       int k; for (k : arrayOfChar1) {
/* 179 */         localByteBuf.writeChar(k);
/*     */       }
/* 181 */       localByteBuf.writeShort(7 + 2 * this.a.a.a().length());
/* 182 */       localByteBuf.writeByte(127);
/* 183 */       arrayOfChar1 = this.a.a.a().toCharArray();
/* 184 */       localByteBuf.writeShort(arrayOfChar1.length);
/* 185 */       for (k : arrayOfChar1) {
/* 186 */         localByteBuf.writeChar(k);
/*     */       }
/* 188 */       localByteBuf.writeInt(this.a.a.b());
/*     */       
/* 190 */       paramChannelHandlerContext.channel().writeAndFlush(localByteBuf).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
/*     */     } finally {
/* 192 */       localByteBuf.release();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ByteBuf paramByteBuf)
/*     */   {
/* 198 */     int i = paramByteBuf.readUnsignedByte();
/*     */     
/* 200 */     if (i == 255) {
/* 201 */       String str1 = new String(paramByteBuf.readBytes(paramByteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
/* 202 */       String[] arrayOfString = (String[])Iterables.toArray(bjq.d().split(str1), String.class);
/*     */       
/* 204 */       if ("§1".equals(arrayOfString[0])) {
/* 205 */         int j = qh.a(arrayOfString[1], 0);
/* 206 */         String str2 = arrayOfString[2];
/* 207 */         String str3 = arrayOfString[3];
/* 208 */         int k = qh.a(arrayOfString[4], -1);
/* 209 */         int m = qh.a(arrayOfString[5], -1);
/*     */         
/* 211 */         this.a.b.f = -1;
/* 212 */         this.a.b.g = str2;
/* 213 */         this.a.b.d = str3;
/* 214 */         this.a.b.c = (a.h + "" + k + "" + a.i + "/" + a.h + m);
/*     */       }
/*     */     }
/*     */     
/* 218 */     paramChannelHandlerContext.close();
/*     */   }
/*     */   
/*     */   public void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable)
/*     */   {
/* 223 */     paramChannelHandlerContext.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */