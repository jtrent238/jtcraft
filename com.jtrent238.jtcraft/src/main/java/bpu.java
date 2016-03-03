/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.InputStream;
/*    */ import javax.imageio.ImageIO;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpu
/*    */   extends bpp
/*    */ {
/* 16 */   private static final Logger c = ;
/*    */   protected final bqx b;
/*    */   
/*    */   public bpu(bqx parambqx) {
/* 20 */     this.b = parambqx;
/*    */   }
/*    */   
/*    */   public void a(bqy parambqy)
/*    */   {
/* 25 */     c();
/*    */     
/* 27 */     InputStream localInputStream = null;
/*    */     try {
/* 29 */       bqw localbqw = parambqy.a(this.b);
/* 30 */       localInputStream = localbqw.b();
/* 31 */       BufferedImage localBufferedImage = ImageIO.read(localInputStream);
/*    */       
/* 33 */       boolean bool1 = false;
/* 34 */       boolean bool2 = false;
/*    */       
/* 36 */       if (localbqw.c()) {
/*    */         try {
/* 38 */           bsi localbsi = (bsi)localbqw.a("texture");
/* 39 */           if (localbsi != null) {
/* 40 */             bool1 = localbsi.a();
/* 41 */             bool2 = localbsi.b();
/*    */           }
/*    */         } catch (RuntimeException localRuntimeException) {
/* 44 */           c.warn("Failed reading metadata of: " + this.b, localRuntimeException);
/*    */         }
/*    */       }
/*    */       
/* 48 */       bqi.a(b(), localBufferedImage, bool1, bool2);
/*    */     } finally {
/* 50 */       if (localInputStream != null) {
/* 51 */         localInputStream.close();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */