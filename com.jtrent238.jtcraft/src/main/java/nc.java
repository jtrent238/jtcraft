/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import io.netty.bootstrap.ServerBootstrap;
/*     */ import io.netty.channel.Channel;
/*     */ import io.netty.channel.ChannelFuture;
/*     */ import io.netty.channel.local.LocalAddress;
/*     */ import io.netty.channel.local.LocalServerChannel;
/*     */ import io.netty.channel.nio.NioEventLoopGroup;
/*     */ import io.netty.channel.socket.nio.NioServerSocketChannel;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.net.SocketAddress;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class nc
/*     */ {
/*  30 */   private static final Logger b = ;
/*  31 */   private static final NioEventLoopGroup c = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty IO #%d").setDaemon(true).build());
/*     */   
/*     */   private final MinecraftServer d;
/*     */   public volatile boolean a;
/*  35 */   private final List e = Collections.synchronizedList(new ArrayList());
/*  36 */   private final List f = Collections.synchronizedList(new ArrayList());
/*     */   
/*     */   public nc(MinecraftServer paramMinecraftServer) {
/*  39 */     this.d = paramMinecraftServer;
/*  40 */     this.a = true;
/*     */   }
/*     */   
/*     */   public void a(InetAddress paramInetAddress, int paramInt) {
/*  44 */     synchronized (this.e) {
/*  45 */       this.e.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(NioServerSocketChannel.class)).childHandler(new nd(this)).group(c).localAddress(paramInetAddress, paramInt)).bind().syncUninterruptibly());
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
/*     */   public SocketAddress a()
/*     */   {
/*     */     ChannelFuture localChannelFuture;
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
/*  87 */     synchronized (this.e) {
/*  88 */       localChannelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler(new ne(this)).group(c).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
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
/* 103 */       this.e.add(localChannelFuture);
/*     */     }
/*     */     
/* 106 */     return localChannelFuture.channel().localAddress();
/*     */   }
/*     */   
/*     */   public void b() {
/* 110 */     this.a = false;
/*     */     
/* 112 */     for (ChannelFuture localChannelFuture : this.e) {
/* 113 */       localChannelFuture.channel().close().syncUninterruptibly();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 118 */     synchronized (this.f) {
/* 119 */       Iterator localIterator = this.f.iterator();
/*     */       
/* 121 */       while (localIterator.hasNext()) {
/* 122 */         ej localej = (ej)localIterator.next();
/*     */         
/* 124 */         if (!localej.d()) {
/* 125 */           localIterator.remove();
/*     */           
/* 127 */           if (localej.f() != null) {
/* 128 */             localej.e().a(localej.f());
/* 129 */           } else if (localej.e() != null) {
/* 130 */             localej.e().a(new fq("Disconnected"));
/*     */           }
/*     */         } else {
/*     */           try {
/* 134 */             localej.a();
/*     */           } catch (Exception localException) {
/* 136 */             if (localej.c()) {
/* 137 */               localObject1 = b.a(localException, "Ticking memory connection");
/* 138 */               k localk = ((b)localObject1).a("Ticking connection");
/*     */               
/* 140 */               localk.a("Connection", new nf(this, localej));
/*     */               
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 147 */               throw new s((b)localObject1);
/*     */             }
/* 149 */             b.warn("Failed to handle packet for " + localej.b(), localException);
/* 150 */             Object localObject1 = new fq("Internal server error");
/* 151 */             localej.a(new gs((fj)localObject1), new GenericFutureListener[] { new ng(this, localej, (fq)localObject1) });
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */             localej.g();
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public MinecraftServer d()
/*     */   {
/* 166 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */