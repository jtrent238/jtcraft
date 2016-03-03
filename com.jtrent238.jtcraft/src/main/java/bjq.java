/*     */ import com.google.common.base.Splitter;
/*     */ import io.netty.bootstrap.Bootstrap;
/*     */ import io.netty.channel.socket.nio.NioSocketChannel;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class bjq
/*     */ {
/*  34 */   private static final Splitter a = Splitter.on('\000').limit(6);
/*  35 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  37 */   private final List c = Collections.synchronizedList(new ArrayList());
/*     */   
/*     */   public void a(bjn parambjn) {
/*  40 */     bjm localbjm = bjm.a(parambjn.b);
/*  41 */     ej localej = ej.a(InetAddress.getByName(localbjm.a()), localbjm.b());
/*     */     
/*  43 */     this.c.add(localej);
/*     */     
/*  45 */     parambjn.d = "Pinging...";
/*  46 */     parambjn.e = -1L;
/*  47 */     parambjn.i = null;
/*     */     
/*  49 */     localej.a(new bjr(this, parambjn, localej));
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
/*     */     try
/*     */     {
/* 142 */       localej.a(new jp(5, localbjm.a(), localbjm.b(), eo.c), new GenericFutureListener[0]);
/* 143 */       localej.a(new kj(), new GenericFutureListener[0]);
/*     */     } catch (Throwable localThrowable) {
/* 145 */       b.error(localThrowable);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(bjn parambjn) {
/* 150 */     bjm localbjm = bjm.a(parambjn.b);
/* 151 */     ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(ej.g)).handler(new bjs(this, localbjm, parambjn))).channel(NioSocketChannel.class)).connect(localbjm.a(), localbjm.b());
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
/*     */   public void a()
/*     */   {
/* 239 */     synchronized (this.c) {
/* 240 */       Iterator localIterator = this.c.iterator();
/* 241 */       while (localIterator.hasNext()) {
/* 242 */         ej localej = (ej)localIterator.next();
/*     */         
/* 244 */         if (localej.d()) {
/* 245 */           localej.a();
/*     */         } else {
/* 247 */           localIterator.remove();
/* 248 */           if (localej.f() != null) {
/* 249 */             localej.e().a(localej.f());
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 257 */     synchronized (this.c) {
/* 258 */       Iterator localIterator = this.c.iterator();
/* 259 */       while (localIterator.hasNext()) {
/* 260 */         ej localej = (ej)localIterator.next();
/*     */         
/* 262 */         if (localej.d()) {
/* 263 */           localIterator.remove();
/* 264 */           localej.a(new fq("Cancelled"));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */