/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class ok
/*    */   extends ol
/*    */ {
/*    */   private final int a;
/*    */   
/*    */   public ok(GameProfile paramGameProfile, int paramInt)
/*    */   {
/* 13 */     super(paramGameProfile);
/* 14 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   public ok(JsonObject paramJsonObject) {
/* 18 */     super(b(paramJsonObject), paramJsonObject);
/* 19 */     this.a = (paramJsonObject.has("level") ? paramJsonObject.get("level").getAsInt() : 0);
/*    */   }
/*    */   
/*    */   public int a() {
/* 23 */     return this.a;
/*    */   }
/*    */   
/*    */   protected void a(JsonObject paramJsonObject)
/*    */   {
/* 28 */     if (f() == null) {
/* 29 */       return;
/*    */     }
/* 31 */     paramJsonObject.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
/* 32 */     paramJsonObject.addProperty("name", ((GameProfile)f()).getName());
/* 33 */     super.a(paramJsonObject);
/* 34 */     paramJsonObject.addProperty("level", Integer.valueOf(this.a));
/*    */   }
/*    */   
/*    */   private static GameProfile b(JsonObject paramJsonObject) {
/* 38 */     if ((!paramJsonObject.has("uuid")) || (!paramJsonObject.has("name"))) {
/* 39 */       return null;
/*    */     }
/* 41 */     String str = paramJsonObject.get("uuid").getAsString();
/*    */     UUID localUUID;
/*    */     try {
/* 44 */       localUUID = UUID.fromString(str);
/*    */     } catch (Throwable localThrowable) {
/* 46 */       return null;
/*    */     }
/* 48 */     return new GameProfile(localUUID, paramJsonObject.get("name").getAsString());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */