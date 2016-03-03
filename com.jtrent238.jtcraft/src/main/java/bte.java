/*     */ import java.io.IOException;
/*     */ import java.net.DatagramPacket;
/*     */ import java.net.DatagramSocket;
/*     */ import java.net.InetAddress;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bte
/*     */   extends Thread
/*     */ {
/*  14 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  15 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */ 
/*     */   private final String c;
/*     */   
/*     */ 
/*     */   private final DatagramSocket d;
/*     */   
/*  23 */   private boolean e = true;
/*     */   private final String f;
/*     */   
/*     */   public bte(String paramString1, String paramString2) {
/*  27 */     super("LanServerPinger #" + a.incrementAndGet());
/*  28 */     this.c = paramString1;
/*  29 */     this.f = paramString2;
/*  30 */     setDaemon(true);
/*     */     
/*  32 */     this.d = new DatagramSocket();
/*     */   }
/*     */   
/*     */ 
/*     */   public void run()
/*     */   {
/*  38 */     String str = a(this.c, this.f);
/*  39 */     byte[] arrayOfByte = str.getBytes();
/*     */     
/*  41 */     while ((!isInterrupted()) && (this.e))
/*     */     {
/*     */       try {
/*  44 */         InetAddress localInetAddress = InetAddress.getByName("224.0.2.60");
/*     */         
/*  46 */         DatagramPacket localDatagramPacket = new DatagramPacket(arrayOfByte, arrayOfByte.length, localInetAddress, 4445);
/*  47 */         this.d.send(localDatagramPacket);
/*     */       } catch (IOException localIOException) {
/*  49 */         b.warn("LanServerPinger: " + localIOException.getMessage());
/*  50 */         break;
/*     */       }
/*     */       try
/*     */       {
/*  54 */         sleep(1500L);
/*     */       }
/*     */       catch (InterruptedException localInterruptedException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public void interrupt()
/*     */   {
/*  62 */     super.interrupt();
/*     */     
/*     */ 
/*  65 */     this.e = false;
/*     */   }
/*     */   
/*     */   public static String a(String paramString1, String paramString2) {
/*  69 */     return "[MOTD]" + paramString1 + "[/MOTD][AD]" + paramString2 + "[/AD]";
/*     */   }
/*     */   
/*     */   public static String a(String paramString) {
/*  73 */     int i = paramString.indexOf("[MOTD]");
/*  74 */     if (i < 0) {
/*  75 */       return "missing no";
/*     */     }
/*  77 */     int j = paramString.indexOf("[/MOTD]", i + "[MOTD]".length());
/*  78 */     if (j < i) {
/*  79 */       return "missing no";
/*     */     }
/*  81 */     return paramString.substring(i + "[MOTD]".length(), j);
/*     */   }
/*     */   
/*     */   public static String b(String paramString) {
/*  85 */     int i = paramString.indexOf("[/MOTD]");
/*  86 */     if (i < 0) {
/*  87 */       return null;
/*     */     }
/*     */     
/*  90 */     int j = paramString.indexOf("[/MOTD]", i + "[/MOTD]".length());
/*  91 */     if (j >= 0)
/*     */     {
/*  93 */       return null;
/*     */     }
/*     */     
/*  96 */     int k = paramString.indexOf("[AD]", i + "[/MOTD]".length());
/*  97 */     if (k < 0) {
/*  98 */       return null;
/*     */     }
/* 100 */     int m = paramString.indexOf("[/AD]", k + "[AD]".length());
/* 101 */     if (m < k) {
/* 102 */       return null;
/*     */     }
/* 104 */     return paramString.substring(k + "[AD]".length(), m);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */