/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.lang.reflect.Type;
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
/*     */ public class kd
/*     */   implements JsonDeserializer, JsonSerializer
/*     */ {
/*     */   public kc a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*     */   {
/*  81 */     JsonObject localJsonObject1 = pu.l(paramJsonElement, "players");
/*  82 */     kc localkc = new kc(pu.m(localJsonObject1, "max"), pu.m(localJsonObject1, "online"));
/*     */     
/*  84 */     if (pu.d(localJsonObject1, "sample")) {
/*  85 */       JsonArray localJsonArray = pu.t(localJsonObject1, "sample");
/*  86 */       if (localJsonArray.size() > 0) {
/*  87 */         GameProfile[] arrayOfGameProfile = new GameProfile[localJsonArray.size()];
/*  88 */         for (int i = 0; i < arrayOfGameProfile.length; i++) {
/*  89 */           JsonObject localJsonObject2 = pu.l(localJsonArray.get(i), "player[" + i + "]");
/*  90 */           String str = pu.h(localJsonObject2, "id");
/*  91 */           arrayOfGameProfile[i] = new GameProfile(UUID.fromString(str), pu.h(localJsonObject2, "name"));
/*     */         }
/*  93 */         localkc.a(arrayOfGameProfile);
/*     */       }
/*     */     }
/*     */     
/*  97 */     return localkc;
/*     */   }
/*     */   
/*     */   public JsonElement a(kc paramkc, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 102 */     JsonObject localJsonObject1 = new JsonObject();
/*     */     
/* 104 */     localJsonObject1.addProperty("max", Integer.valueOf(paramkc.a()));
/* 105 */     localJsonObject1.addProperty("online", Integer.valueOf(paramkc.b()));
/*     */     
/* 107 */     if ((paramkc.c() != null) && (paramkc.c().length > 0)) {
/* 108 */       JsonArray localJsonArray = new JsonArray();
/*     */       
/* 110 */       for (int i = 0; i < paramkc.c().length; i++) {
/* 111 */         JsonObject localJsonObject2 = new JsonObject();
/* 112 */         UUID localUUID = paramkc.c()[i].getId();
/* 113 */         localJsonObject2.addProperty("id", localUUID == null ? "" : localUUID.toString());
/* 114 */         localJsonObject2.addProperty("name", paramkc.c()[i].getName());
/* 115 */         localJsonArray.add(localJsonObject2);
/*     */       }
/*     */       
/* 118 */       localJsonObject1.add("sample", localJsonArray);
/*     */     }
/*     */     
/* 121 */     return localJsonObject1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */