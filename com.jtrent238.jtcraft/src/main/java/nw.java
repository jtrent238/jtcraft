/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Type;
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class nw
/*     */   implements JsonDeserializer, JsonSerializer
/*     */ {
/*     */   private nw(ns paramns) {}
/*     */   
/*     */   public JsonElement a(nv paramnv, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 213 */     JsonObject localJsonObject = new JsonObject();
/* 214 */     localJsonObject.addProperty("name", paramnv.a().getName());
/* 215 */     UUID localUUID = paramnv.a().getId();
/* 216 */     localJsonObject.addProperty("uuid", localUUID == null ? "" : localUUID.toString());
/* 217 */     localJsonObject.addProperty("expiresOn", ns.a.format(paramnv.b()));
/* 218 */     return localJsonObject;
/*     */   }
/*     */   
/*     */   public nv a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*     */   {
/* 223 */     if (paramJsonElement.isJsonObject()) {
/* 224 */       JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 225 */       JsonElement localJsonElement1 = localJsonObject.get("name");
/* 226 */       JsonElement localJsonElement2 = localJsonObject.get("uuid");
/* 227 */       JsonElement localJsonElement3 = localJsonObject.get("expiresOn");
/* 228 */       if ((localJsonElement1 == null) || (localJsonElement2 == null)) {
/* 229 */         return null;
/*     */       }
/* 231 */       String str1 = localJsonElement2.getAsString();
/* 232 */       String str2 = localJsonElement1.getAsString();
/* 233 */       Date localDate = null;
/* 234 */       if (localJsonElement3 != null) {
/*     */         try {
/* 236 */           localDate = ns.a.parse(localJsonElement3.getAsString());
/*     */         } catch (ParseException localParseException) {
/* 238 */           localDate = null;
/*     */         }
/*     */       }
/* 241 */       if ((str2 == null) || (str1 == null)) {
/* 242 */         return null;
/*     */       }
/*     */       UUID localUUID;
/*     */       try {
/* 246 */         localUUID = UUID.fromString(str1);
/*     */       } catch (Throwable localThrowable) {
/* 248 */         return null;
/*     */       }
/* 250 */       nv localnv = new nv(this.a, new GameProfile(localUUID, str2), localDate, null);
/* 251 */       return localnv;
/*     */     }
/* 253 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */