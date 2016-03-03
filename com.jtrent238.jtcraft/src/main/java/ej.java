/*     */ import com.google.common.collect.Queues;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.bootstrap.Bootstrap;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelConfig;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.ChannelFutureListener;
/*     */ import io.netty.channel.ChannelHandlerContext;
/*     */ import io.netty.channel.ChannelPipeline;
/*     */ import io.netty.channel.EventLoop;
/*     */ import io.netty.channel.SimpleChannelInboundHandler;
/*     */ import io.netty.channel.local.LocalChannel;
/*     */ import io.netty.channel.local.LocalServerChannel;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.channel.socket.nio.NioSocketChannel;
/*     */ import io.netty.handler.timeout.TimeoutException;
/*     */ import io.netty.util.Attribute;
/*     */ import io.netty.util.AttributeKey;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.Queue;
/*     */ import javax.crypto.SecretKey;
/*     */ import org.apache.commons.lang3.Validate;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
/*     */ 
/*     */ 
/*     */ public class ej
/*     */   extends SimpleChannelInboundHandler
/*     */ {
/*  34 */   private static final Logger i = ;
/*     */   
/*  36 */   public static final Marker a = MarkerManager.getMarker("NETWORK");
/*     */   
/*  38 */   public static final Marker b = MarkerManager.getMarker("NETWORK_PACKETS", a);
/*  39 */   public static final Marker c = MarkerManager.getMarker("NETWORK_STAT", a);
/*  40 */   public static final AttributeKey d = new AttributeKey("protocol");
/*  41 */   public static final AttributeKey e = new AttributeKey("receivable_packets");
/*  42 */   public static final AttributeKey f = new AttributeKey("sendable_packets");
/*  43 */   public static final NioEventLoopGroup g = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
/*  44 */   public static final eu h = new eu();
/*     */   
/*     */ 
/*     */   private final boolean j;
/*     */   
/*  49 */   private final Queue k = Queues.newConcurrentLinkedQueue();
/*  50 */   private final Queue l = Queues.newConcurrentLinkedQueue();
/*     */   private Channel m;
/*     */   private SocketAddress n;
/*     */   private fb o;
/*     */   private eo p;
/*     */   private fj q;
/*     */   private boolean r;
/*     */   
/*     */   public ej(boolean paramBoolean) {
/*  59 */     this.j = paramBoolean;
/*     */   }
/*     */   
/*     */   public void channelActive(ChannelHandlerContext paramChannelHandlerContext)
/*     */   {
/*  64 */     super.channelActive(paramChannelHandlerContext);
/*  65 */     this.m = paramChannelHandlerContext.channel();
/*  66 */     this.n = this.m.remoteAddress();
/*  67 */     a(eo.a);
/*     */   }
/*     */   
/*     */   public void a(eo parameo) {
/*  71 */     this.p = ((eo)this.m.attr(d).getAndSet(parameo));
/*  72 */     this.m.attr(e).set(parameo.a(this.j));
/*  73 */     this.m.attr(f).set(parameo.b(this.j));
/*  74 */     this.m.config().setAutoRead(true);
/*  75 */     i.debug("Enabled auto read");
/*     */   }
/*     */   
/*     */   public void channelInactive(ChannelHandlerContext paramChannelHandlerContext)
/*     */   {
/*  80 */     a(new fr("disconnect.endOfStream", new Object[0]));
/*     */   }
/*     */   
/*     */   public void exceptionCaught(ChannelHandlerContext paramChannelHandlerContext, Throwable paramThrowable)
/*     */   {
/*     */     fr localfr;
/*  86 */     if ((paramThrowable instanceof TimeoutException)) {
/*  87 */       localfr = new fr("disconnect.timeout", new Object[0]);
/*     */     } else {
/*  89 */       localfr = new fr("disconnect.genericReason", new Object[] { "Internal Exception: " + paramThrowable });
/*     */     }
/*     */     
/*  92 */     a(localfr);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(ChannelHandlerContext paramChannelHandlerContext, ft paramft)
/*     */   {
/*  98 */     if (this.m.isOpen()) {
/*  99 */       if (paramft.a()) {
/* 100 */         paramft.a(this.o);
/*     */       } else {
/* 102 */         this.k.add(paramft);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fb paramfb) {
/* 108 */     Validate.notNull(paramfb, "packetListener", new Object[0]);
/* 109 */     i.debug("Set listener of {} to {}", new Object[] { this, paramfb });
/* 110 */     this.o = paramfb;
/*     */   }
/*     */   
/*     */   public void a(ft paramft, GenericFutureListener... paramVarArgs) {
/* 114 */     if ((this.m != null) && (this.m.isOpen())) {
/* 115 */       i();
/* 116 */       b(paramft, paramVarArgs);
/*     */     } else {
/* 118 */       this.l.add(new en(paramft, paramVarArgs));
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(ft paramft, GenericFutureListener[] paramArrayOfGenericFutureListener) {
/* 123 */     eo localeo1 = eo.a(paramft);
/* 124 */     eo localeo2 = (eo)this.m.attr(d).get();
/*     */     
/* 126 */     if (localeo2 != localeo1) {
/* 127 */       i.debug("Disabled auto read");
/* 128 */       this.m.config().setAutoRead(false);
/*     */     }
/*     */     
/* 131 */     if (this.m.eventLoop().inEventLoop()) {
/* 132 */       if (localeo1 != localeo2) {
/* 133 */         a(localeo1);
/*     */       }
/* 135 */       this.m.writeAndFlush(paramft).addListeners(paramArrayOfGenericFutureListener).addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
/*     */     } else {
/* 137 */       this.m.eventLoop().execute(new ek(this, localeo1, localeo2, paramft, paramArrayOfGenericFutureListener));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void i()
/*     */   {
/* 150 */     if ((this.m == null) || (!this.m.isOpen())) {
/* 151 */       return;
/*     */     }
/*     */     
/* 154 */     while (!this.l.isEmpty()) {
/* 155 */       en localen = (en)this.l.poll();
/* 156 */       b(en.a(localen), en.b(localen));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/* 162 */     i();
/*     */     
/* 164 */     eo localeo = (eo)this.m.attr(d).get();
/*     */     
/* 166 */     if (this.p != localeo) {
/* 167 */       if (this.p != null) this.o.a(this.p, localeo);
/* 168 */       this.p = localeo;
/*     */     }
/*     */     
/* 171 */     if (this.o != null) {
/* 172 */       for (int i1 = 1000; (!this.k.isEmpty()) && (i1 >= 0); i1--) {
/* 173 */         ft localft = (ft)this.k.poll();
/* 174 */         localft.a(this.o);
/*     */       }
/* 176 */       this.o.a();
/*     */     }
/*     */     
/* 179 */     this.m.flush();
/*     */   }
/*     */   
/*     */   public SocketAddress b() {
/* 183 */     return this.n;
/*     */   }
/*     */   
/*     */   public void a(fj paramfj) {
/* 187 */     if (this.m.isOpen()) {
/* 188 */       this.m.close();
/*     */       
/* 190 */       this.q = paramfj;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 195 */     return ((this.m instanceof LocalChannel)) || ((this.m instanceof LocalServerChannel));
/*     */   }
/*     */   
/*     */   public static ej a(InetAddress paramInetAddress, int paramInt) {
/* 199 */     ej localej = new ej(true);
/*     */     
/* 201 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(g)).handler(new el(localej))).channel(NioSocketChannel.class)).connect(paramInetAddress, paramInt).syncUninterruptibly();
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
/* 232 */     return localej;
/*     */   }
/*     */   
/*     */   public static ej a(SocketAddress paramSocketAddress) {
/* 236 */     ej localej = new ej(true);
/*     */     
/* 238 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(g)).handler(new em(localej))).channel(LocalChannel.class)).connect(paramSocketAddress).syncUninterruptibly();
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
/* 250 */     return localej;
/*     */   }
/*     */   
/*     */   public void a(SecretKey paramSecretKey) {
/* 254 */     this.m.pipeline().addBefore("splitter", "decrypt", new eh(pt.a(2, paramSecretKey)));
/* 255 */     this.m.pipeline().addBefore("prepender", "encrypt", new ei(pt.a(1, paramSecretKey)));
/* 256 */     this.r = true;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 260 */     return (this.m != null) && (this.m.isOpen());
/*     */   }
/*     */   
/*     */   public fb e() {
/* 264 */     return this.o;
/*     */   }
/*     */   
/*     */   public fj f() {
/* 268 */     return this.q;
/*     */   }
/*     */   
/*     */   public void g() {
/* 272 */     this.m.config().setAutoRead(false);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */