/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.Date;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class oq extends nr
/*    */ {
/*    */   public oq(GameProfile paramGameProfile)
/*    */   {
/* 11 */     this(paramGameProfile, null, null, null, null);
/*    */   }
/*    */   
/*    */   public oq(GameProfile paramGameProfile, Date paramDate1, String paramString1, Date paramDate2, String paramString2) {
/* 15 */     super(paramGameProfile, paramDate2, paramString1, paramDate2, paramString2);
/*    */   }
/*    */   
/*    */   public oq(JsonObject paramJsonObject) {
/* 19 */     super(b(paramJsonObject), paramJsonObject);
/*    */   }
/*    */   
/*    */   protected void a(JsonObject paramJsonObject)
/*    */   {
/* 24 */     if (f() == null) {
/* 25 */       return;
/*    */     }
/* 27 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 28 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 29 */     super.a(paramJsonObject);
/*    */   }
/*    */   
/*    */   private static GameProfile b(JsonObject paramJsonObject) {
/* 33 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 34 */       return null;
/*    */     }
/* 36 */     String str = paramJsonObject.get("uuid").getAsString();
/*    */     UUID localUUID;
/*    */     try {
/* 39 */       localUUID = UUID.fromString(str);
/*    */     } catch (Throwable localThrowable) {
/* 41 */       return null;
/*    */     }
/* 43 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\oq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */