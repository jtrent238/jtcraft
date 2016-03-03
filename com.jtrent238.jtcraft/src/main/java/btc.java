/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.InetAddress;
/*     */ import java.net.MulticastSocket;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class btc
/*     */   extends Thread
/*     */ {
/*     */   private final btd a;
/*     */   private final InetAddress b;
/*     */   private final MulticastSocket c;
/*     */   
/*     */   public btc(btd parambtd)
/*     */   {
/*  93 */     super("LanServerDetector #" + bta.a().incrementAndGet());
/*  94 */     this.a = parambtd;
/*  95 */     setDaemon(true);
/*     */     
/*  97 */     this.c = new MulticastSocket(4445);
/*  98 */     this.b = InetAddress.getByName("224.0.2.60");
/*  99 */     this.c.setSoTimeout(5000);
/* 100 */     this.c.joinGroup(this.b);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void run()
/*     */   {
/* 107 */     byte[] arrayOfByte = new byte['Ѐ'];
/*     */     
/* 109 */     while (!isInterrupted())
/*     */     {
/* 111 */       DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length);
/*     */       try {
/* 113 */         this.c.receive(localDatagramPacket);
/*     */       } catch (SocketTimeoutException localSocketTimeoutException) {
/*     */         continue;
/*     */       } catch (IOException localIOException1) {
/* 117 */         bta.b().error("Couldn't ping server", localIOException1);
/* 118 */         break;
/*     */       }
/*     */       
/* 121 */       String str = new String(localDatagramPacket.getData(), localDatagramPacket.getOffset(), localDatagramPacket.getLength());
/* 122 */       bta.b().debug(localDatagramPacket.getAddress() + ": " + str);
/* 123 */       this.a.a(str, localDatagramPacket.getAddress());
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 128 */       this.c.leaveGroup(this.b);
/*     */     }
/*     */     catch (IOException localIOException2) {}
/* 131 */     this.c.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */