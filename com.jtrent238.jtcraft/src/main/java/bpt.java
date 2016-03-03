/*    */ import com.google.common.collect.Lists;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.List;
/*    */ import javax.imageio.ImageIO;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpt
/*    */   extends bpp
/*    */ {
/* 16 */   private static final Logger c = ;
/*    */   public final List b;
/*    */   
/*    */   public bpt(String... paramVarArgs)
/*    */   {
/* 21 */     this.b = Lists.newArrayList(paramVarArgs);
/*    */   }
/*    */   
/*    */   public void a(bqy parambqy)
/*    */   {
/* 26 */     c();
/*    */     
/* 28 */     BufferedImage localBufferedImage1 = null;
/*    */     try
/*    */     {
/* 31 */       for (String str : this.b)
/* 32 */         if (str != null)
/*    */         {
/*    */ 
/* 35 */           InputStream localInputStream = parambqy.a(new bqx(str)).b();
/* 36 */           BufferedImage localBufferedImage2 = ImageIO.read(localInputStream);
/*    */           
/*    */ 
/* 39 */           if (localBufferedImage1 == null) {
/* 40 */             localBufferedImage1 = new BufferedImage(localBufferedImage2.getWidth(), localBufferedImage2.getHeight(), 2);
/*    */           }
/* 42 */           localBufferedImage1.getGraphics().drawImage(localBufferedImage2, 0, 0, null);
/*    */         }
/*    */     } catch (IOException localIOException) {
/* 45 */       c.error("Couldn't load layered image", localIOException);
/* 46 */       return;
/*    */     }
/*    */     
/* 49 */     bqi.a(b(), localBufferedImage1);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */