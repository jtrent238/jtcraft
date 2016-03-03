/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ import javax.imageio.ImageIO;
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
/*     */ public class bpr
/*     */   extends bpu
/*     */ {
/*  24 */   private static final Logger c = ;
/*  25 */   private static final AtomicInteger d = new AtomicInteger(0);
/*     */   
/*     */   private final File e;
/*     */   private final String f;
/*     */   private final blx g;
/*     */   private BufferedImage h;
/*     */   private Thread i;
/*     */   private boolean j;
/*     */   
/*     */   public bpr(File paramFile, String paramString, bqx parambqx, blx paramblx)
/*     */   {
/*  36 */     super(parambqx);
/*  37 */     this.e = paramFile;
/*  38 */     this.f = paramString;
/*  39 */     this.g = paramblx;
/*     */   }
/*     */   
/*     */   private void f() {
/*  43 */     if (this.j) {
/*  44 */       return;
/*     */     }
/*     */     
/*     */ 
/*  48 */     if (this.h != null)
/*     */     {
/*  50 */       if (this.b != null) {
/*  51 */         c();
/*     */       }
/*     */       
/*  54 */       bqi.a(super.b(), this.h);
/*  55 */       this.j = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  61 */     f();
/*     */     
/*  63 */     return super.b();
/*     */   }
/*     */   
/*     */   public void a(BufferedImage paramBufferedImage) {
/*  67 */     this.h = paramBufferedImage;
/*  68 */     if (this.g != null) {
/*  69 */       this.g.a();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(bqy parambqy)
/*     */   {
/*  76 */     if ((this.h == null) && (this.b != null)) {
/*  77 */       super.a(parambqy);
/*     */     }
/*     */     
/*     */ 
/*  81 */     if (this.i == null) {
/*  82 */       if ((this.e != null) && (this.e.isFile())) {
/*  83 */         c.debug("Loading http texture from local cache ({})", new Object[] { this.e });
/*     */         try {
/*  85 */           this.h = ImageIO.read(this.e);
/*  86 */           if (this.g != null) {
/*  87 */             a(this.g.a(this.h));
/*     */           }
/*     */         } catch (IOException localIOException) {
/*  90 */           c.error("Couldn't load skin " + this.e, localIOException);
/*  91 */           a();
/*     */         }
/*     */       } else {
/*  94 */         a();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a() {
/* 100 */     this.i = new bps(this, "Texture Downloader #" + d.incrementAndGet());
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 138 */     this.i.setDaemon(true);
/* 139 */     this.i.start();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */