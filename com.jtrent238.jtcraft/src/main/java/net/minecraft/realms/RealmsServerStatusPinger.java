/*     */ package net.minecraft.realms;
/*     */ 
/*     */ import but;
/*     */ import ej;
/*     */ import eo;
/*     */ import fb;
/*     */ import fq;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.net.InetAddress;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import jp;
/*     */ import kj;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class RealmsServerStatusPinger
/*     */ {
/*  21 */   private static final Logger LOGGER = ;
/*     */   
/*  23 */   private final List connections = Collections.synchronizedList(new ArrayList());
/*     */   
/*     */   public void pingServer(String paramString, ServerPing paramServerPing) {
/*  26 */     if ((paramString == null) || (paramString.startsWith("0.0.0.0")) || (paramString.isEmpty())) { return;
/*     */     }
/*  28 */     RealmsServerAddress localRealmsServerAddress = RealmsServerAddress.parseString(paramString);
/*  29 */     ej localej = ej.a(InetAddress.getByName(localRealmsServerAddress.getHost()), localRealmsServerAddress.getPort());
/*     */     
/*  31 */     this.connections.add(localej);
/*     */     
/*  33 */     localej.a(new but(this, paramServerPing, localej, paramString));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  78 */       localej.a(new jp(RealmsSharedConstants.NETWORK_PROTOCOL_VERSION, localRealmsServerAddress.getHost(), localRealmsServerAddress.getPort(), eo.c), new GenericFutureListener[0]);
/*  79 */       localej.a(new kj(), new GenericFutureListener[0]);
/*     */     } catch (Throwable localThrowable) {
/*  81 */       LOGGER.error(localThrowable);
/*     */     }
/*     */   }
/*     */   
/*     */   public void tick() {
/*  86 */     synchronized (this.connections) {
/*  87 */       Iterator localIterator = this.connections.iterator();
/*  88 */       while (localIterator.hasNext()) {
/*  89 */         ej localej = (ej)localIterator.next();
/*     */         
/*  91 */         if (localej.d()) {
/*  92 */           localej.a();
/*     */         } else {
/*  94 */           localIterator.remove();
/*  95 */           if (localej.f() != null) {
/*  96 */             localej.e().a(localej.f());
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void removeAll() {
/* 104 */     synchronized (this.connections) {
/* 105 */       Iterator localIterator = this.connections.iterator();
/* 106 */       while (localIterator.hasNext()) {
/* 107 */         ej localej = (ej)localIterator.next();
/*     */         
/* 109 */         if (localej.d()) {
/* 110 */           localIterator.remove();
/* 111 */           localej.a(new fq("Cancelled"));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\realms\RealmsServerStatusPinger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */