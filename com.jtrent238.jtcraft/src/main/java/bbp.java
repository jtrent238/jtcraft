/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.nio.IntBuffer;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.BufferUtils;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbp
/*     */ {
/*  31 */   private static final Logger a = ;
/*  32 */   private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
/*     */   private static IntBuffer c;
/*     */   private static int[] d;
/*     */   
/*     */   public static fj a(File paramFile, int paramInt1, int paramInt2, bmg parambmg) {
/*  37 */     return a(paramFile, null, paramInt1, paramInt2, parambmg);
/*     */   }
/*     */   
/*     */   public static fj a(File paramFile, String paramString, int paramInt1, int paramInt2, bmg parambmg) {
/*     */     try {
/*  42 */       File localFile1 = new File(paramFile, "screenshots");
/*  43 */       localFile1.mkdir();
/*     */       
/*  45 */       if (buu.g()) {
/*  46 */         paramInt1 = parambmg.a;
/*  47 */         paramInt2 = parambmg.b;
/*     */       }
/*  49 */       int i = paramInt1 * paramInt2;
/*  50 */       if ((c == null) || (c.capacity() < i)) {
/*  51 */         c = BufferUtils.createIntBuffer(i);
/*  52 */         d = new int[i];
/*     */       }
/*     */       
/*  55 */       GL11.glPixelStorei(3333, 1);
/*  56 */       GL11.glPixelStorei(3317, 1);
/*     */       
/*  58 */       c.clear();
/*  59 */       if (buu.g()) {
/*  60 */         GL11.glBindTexture(3553, parambmg.g);
/*  61 */         GL11.glGetTexImage(3553, 0, 32993, 33639, c);
/*     */       } else {
/*  63 */         GL11.glReadPixels(0, 0, paramInt1, paramInt2, 32993, 33639, c);
/*     */       }
/*     */       
/*  66 */       c.get(d);
/*     */       
/*  68 */       bqi.a(d, paramInt1, paramInt2);
/*     */       
/*     */ 
/*  71 */       BufferedImage localBufferedImage = null;
/*  72 */       if (buu.g()) {
/*  73 */         localBufferedImage = new BufferedImage(parambmg.c, parambmg.d, 1);
/*  74 */         int j = parambmg.b - parambmg.d;
/*  75 */         for (int k = j; k < parambmg.b; k++) {
/*  76 */           for (int m = 0; m < parambmg.c; m++) {
/*  77 */             localBufferedImage.setRGB(m, k - j, d[(k * parambmg.a + m)]);
/*     */           }
/*     */         }
/*     */       } else {
/*  81 */         localBufferedImage = new BufferedImage(paramInt1, paramInt2, 1);
/*  82 */         localBufferedImage.setRGB(0, 0, paramInt1, paramInt2, d, 0, paramInt1);
/*     */       }
/*     */       
/*     */       File localFile2;
/*  86 */       if (paramString == null) {
/*  87 */         localFile2 = a(localFile1);
/*     */       } else {
/*  89 */         localFile2 = new File(localFile1, paramString);
/*     */       }
/*     */       
/*  92 */       ImageIO.write(localBufferedImage, "png", localFile2);
/*     */       
/*  94 */       fq localfq = new fq(localFile2.getName());
/*  95 */       localfq.b().a(new fh(fi.b, localFile2.getAbsolutePath()));
/*  96 */       localfq.b().d(Boolean.valueOf(true));
/*  97 */       return new fr("screenshot.success", new Object[] { localfq });
/*     */     } catch (Exception localException) {
/*  99 */       a.warn("Couldn't save screenshot", localException); }
/* 100 */     return new fr("screenshot.failure", tmp431_428);
/*     */   }
/*     */   
/*     */ 
/*     */   private static File a(File paramFile)
/*     */   {
/* 106 */     String str = b.format(new Date()).toString();
/*     */     
/* 108 */     for (int i = 1;; i++) {
/* 109 */       File localFile = new File(paramFile, str + (i == 1 ? "" : new StringBuilder().append("_").append(i).toString()) + ".png");
/* 110 */       if (!localFile.exists()) {
/* 111 */         return localFile;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */