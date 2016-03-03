/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class os
/*    */   extends ol
/*    */ {
/*    */   public os(GameProfile paramGameProfile)
/*    */   {
/* 11 */     super(paramGameProfile);
/*    */   }
/*    */   
/*    */   public os(JsonObject paramJsonObject) {
/* 15 */     super(b(paramJsonObject), paramJsonObject);
/*    */   }
/*    */   
/*    */   protected void a(JsonObject paramJsonObject)
/*    */   {
/* 20 */     if (f() == null) {
/* 21 */       return;
/*    */     }
/* 23 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 24 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 25 */     super.a(paramJsonObject);
/*    */   }
/*    */   
/*    */   private static GameProfile b(JsonObject paramJsonObject) {
/* 29 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 30 */       return null;
/*    */     }
/* 32 */     String str = paramJsonObject.get("uuid").getAsString();
/*    */     UUID localUUID;
/*    */     try {
/* 35 */       localUUID = UUID.fromString(str);
/*    */     } catch (Throwable localThrowable) {
/* 37 */       return null;
/*    */     }
/* 39 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\os.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */