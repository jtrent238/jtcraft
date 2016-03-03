/*    */ import com.google.common.base.Charsets;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.net.URI;
/*    */ import javax.imageio.ImageIO;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public abstract class bqn implements bra
/*    */ {
/* 19 */   private static final Logger b = ;
/*    */   protected final File a;
/*    */   
/*    */   public bqn(File paramFile)
/*    */   {
/* 24 */     this.a = paramFile;
/*    */   }
/*    */   
/*    */   private static String c(bqx parambqx) {
/* 28 */     return String.format("%s/%s/%s", new Object[] { "assets", parambqx.b(), parambqx.a() });
/*    */   }
/*    */   
/*    */   protected static String a(File paramFile1, File paramFile2) {
/* 32 */     return paramFile1.toURI().relativize(paramFile2.toURI()).getPath();
/*    */   }
/*    */   
/*    */   public InputStream a(bqx parambqx)
/*    */   {
/* 37 */     return a(c(parambqx));
/*    */   }
/*    */   
/*    */   public boolean b(bqx parambqx)
/*    */   {
/* 42 */     return b(c(parambqx));
/*    */   }
/*    */   
/*    */   protected abstract InputStream a(String paramString);
/*    */   
/*    */   protected abstract boolean b(String paramString);
/*    */   
/*    */   protected void c(String paramString) {
/* 50 */     b.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[] { paramString, this.a });
/*    */   }
/*    */   
/*    */   public bru a(brw parambrw, String paramString)
/*    */   {
/* 55 */     return a(parambrw, a("pack.mcmeta"), paramString);
/*    */   }
/*    */   
/*    */   static bru a(brw parambrw, InputStream paramInputStream, String paramString) {
/* 59 */     JsonObject localJsonObject = null;
/* 60 */     BufferedReader localBufferedReader = null;
/*    */     try {
/* 62 */       localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, Charsets.UTF_8));
/* 63 */       localJsonObject = new JsonParser().parse(localBufferedReader).getAsJsonObject();
/*    */     } catch (RuntimeException localRuntimeException) {
/* 65 */       throw new JsonParseException(localRuntimeException);
/*    */     } finally {
/* 67 */       IOUtils.closeQuietly(localBufferedReader);
/*    */     }
/*    */     
/* 70 */     return parambrw.a(paramString, localJsonObject);
/*    */   }
/*    */   
/*    */   public BufferedImage a()
/*    */   {
/* 75 */     return ImageIO.read(a("pack.png"));
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 80 */     return this.a.getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */