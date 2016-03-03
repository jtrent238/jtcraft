/*    */ import com.google.common.base.Charsets;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.io.Files;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonParser;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import org.apache.commons.io.IOUtils;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bqo
/*    */ {
/* 21 */   private static final Logger a = ;
/*    */   
/* 23 */   private final Map b = Maps.newHashMap();
/*    */   
/*    */   public bqo(File paramFile, String paramString) {
/* 26 */     if (paramString == null) {
/* 27 */       return;
/*    */     }
/*    */     
/* 30 */     File localFile1 = new File(paramFile, "objects");
/*    */     
/* 32 */     File localFile2 = new File(paramFile, "indexes/" + paramString + ".json");
/* 33 */     BufferedReader localBufferedReader = null;
/*    */     try {
/* 35 */       localBufferedReader = Files.newReader(localFile2, Charsets.UTF_8);
/* 36 */       JsonObject localJsonObject1 = new JsonParser().parse(localBufferedReader).getAsJsonObject();
/* 37 */       JsonObject localJsonObject2 = pu.a(localJsonObject1, "objects", null);
/* 38 */       if (localJsonObject2 != null) {
/* 39 */         for (Map.Entry localEntry : localJsonObject2.entrySet()) {
/* 40 */           JsonObject localJsonObject3 = (JsonObject)localEntry.getValue();
/*    */           
/* 42 */           String str1 = (String)localEntry.getKey();
/* 43 */           String[] arrayOfString = str1.split("/", 2);
/* 44 */           String str2 = arrayOfString[0] + ":" + arrayOfString[1];
/*    */           
/* 46 */           String str3 = pu.h(localJsonObject3, "hash");
/* 47 */           File localFile3 = new File(localFile1, str3.substring(0, 2) + "/" + str3);
/*    */           
/* 49 */           this.b.put(str2, localFile3);
/*    */         }
/*    */       }
/*    */     } catch (JsonParseException localJsonParseException) {
/* 53 */       a.error("Unable to parse resource index file: " + localFile2);
/*    */     } catch (FileNotFoundException localFileNotFoundException) {
/* 55 */       a.error("Can't find the resource index file: " + localFile2);
/*    */     } finally {
/* 57 */       IOUtils.closeQuietly(localBufferedReader);
/*    */     }
/*    */   }
/*    */   
/*    */   public Map a() {
/* 62 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */