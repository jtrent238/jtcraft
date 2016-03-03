/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.io.File;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class oj extends om
/*    */ {
/*    */   public oj(File paramFile)
/*    */   {
/* 11 */     super(paramFile);
/*    */   }
/*    */   
/*    */   protected ol a(JsonObject paramJsonObject)
/*    */   {
/* 16 */     return new ok(paramJsonObject);
/*    */   }
/*    */   
/*    */   public String[] a()
/*    */   {
/* 21 */     String[] arrayOfString = new String[e().size()];
/* 22 */     int i = 0;
/* 23 */     for (ok localok : e().values()) {
/* 24 */       arrayOfString[(i++)] = ((GameProfile)localok.f()).getName();
/*    */     }
/* 26 */     return arrayOfString;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   protected String b(GameProfile paramGameProfile)
/*    */   {
/* 39 */     return paramGameProfile.getId().toString();
/*    */   }
/*    */   
/*    */   public GameProfile a(String paramString) {
/* 43 */     for (ok localok : e().values()) {
/* 44 */       if (paramString.equalsIgnoreCase(((GameProfile)localok.f()).getName())) {
/* 45 */         return (GameProfile)localok.f();
/*    */       }
/*    */     }
/* 48 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\oj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */