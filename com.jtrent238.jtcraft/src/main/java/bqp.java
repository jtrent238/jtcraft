/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import javax.imageio.ImageIO;
/*    */ 
/*    */ 
/*    */ public class bqp
/*    */   implements bra
/*    */ {
/* 15 */   public static final Set a = ImmutableSet.of("minecraft", "realms");
/*    */   private final Map b;
/*    */   
/*    */   public bqp(Map paramMap) {
/* 19 */     this.b = paramMap;
/*    */   }
/*    */   
/*    */   public InputStream a(bqx parambqx)
/*    */   {
/* 24 */     InputStream localInputStream1 = d(parambqx);
/* 25 */     if (localInputStream1 != null) {
/* 26 */       return localInputStream1;
/*    */     }
/*    */     
/*    */ 
/* 30 */     InputStream localInputStream2 = c(parambqx);
/* 31 */     if (localInputStream2 != null) {
/* 32 */       return localInputStream2;
/*    */     }
/*    */     
/* 35 */     throw new FileNotFoundException(parambqx.a());
/*    */   }
/*    */   
/*    */   public InputStream c(bqx parambqx) {
/* 39 */     File localFile = (File)this.b.get(parambqx.toString());
/*    */     
/* 41 */     return (localFile == null) || (!localFile.isFile()) ? null : new FileInputStream(localFile);
/*    */   }
/*    */   
/*    */   private InputStream d(bqx parambqx) {
/* 45 */     return bqp.class.getResourceAsStream("/assets/" + parambqx.b() + "/" + parambqx.a());
/*    */   }
/*    */   
/*    */   public boolean b(bqx parambqx)
/*    */   {
/* 50 */     return (d(parambqx) != null) || (this.b.containsKey(parambqx.toString()));
/*    */   }
/*    */   
/*    */   public Set c()
/*    */   {
/* 55 */     return a;
/*    */   }
/*    */   
/*    */   public bru a(brw parambrw, String paramString)
/*    */   {
/*    */     try {
/* 61 */       FileInputStream localFileInputStream = new FileInputStream((File)this.b.get("pack.mcmeta"));
/* 62 */       return bqn.a(parambrw, localFileInputStream, paramString);
/*    */     } catch (RuntimeException localRuntimeException) {
/* 64 */       return null;
/*    */     } catch (FileNotFoundException localFileNotFoundException) {}
/* 66 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public BufferedImage a()
/*    */   {
/* 72 */     return ImageIO.read(bqp.class.getResourceAsStream("/" + new bqx("pack.png").a()));
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 77 */     return "Default";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */