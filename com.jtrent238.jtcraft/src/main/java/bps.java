/*     */ import java.awt.image.BufferedImage;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.commons.io.FileUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bps
/*     */   extends Thread
/*     */ {
/* 100 */   bps(bpr parambpr, String paramString) { super(paramString); }
/*     */   
/*     */   public void run() {
/* 103 */     HttpURLConnection localHttpURLConnection = null;
/* 104 */     bpr.e().debug("Downloading http texture from {} to {}", new Object[] { bpr.a(this.a), bpr.b(this.a) });
/*     */     try {
/* 106 */       localHttpURLConnection = (HttpURLConnection)new URL(bpr.a(this.a)).openConnection(bao.B().O());
/* 107 */       localHttpURLConnection.setDoInput(true);
/* 108 */       localHttpURLConnection.setDoOutput(false);
/* 109 */       localHttpURLConnection.connect();
/*     */       
/* 111 */       if (localHttpURLConnection.getResponseCode() / 100 != 2) {
/*     */         return;
/*     */       }
/*     */       
/*     */       BufferedImage localBufferedImage;
/*     */       
/* 117 */       if (bpr.b(this.a) != null) {
/* 118 */         FileUtils.copyInputStreamToFile(localHttpURLConnection.getInputStream(), bpr.b(this.a));
/* 119 */         localBufferedImage = ImageIO.read(bpr.b(this.a));
/*     */       } else {
/* 121 */         localBufferedImage = ImageIO.read(localHttpURLConnection.getInputStream());
/*     */       }
/*     */       
/* 124 */       if (bpr.c(this.a) != null) {
/* 125 */         localBufferedImage = bpr.c(this.a).a(localBufferedImage);
/*     */       }
/*     */       
/* 128 */       this.a.a(localBufferedImage);
/*     */     } catch (Exception localException) {
/* 130 */       bpr.e().error("Couldn't download http texture", localException);
/*     */     } finally {
/* 132 */       if (localHttpURLConnection != null) {
/* 133 */         localHttpURLConnection.disconnect();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */