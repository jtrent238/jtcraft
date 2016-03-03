/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ke
/*     */   implements JsonDeserializer, JsonSerializer
/*     */ {
/*     */   public kb a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*     */   {
/* 163 */     JsonObject localJsonObject = pu.l(paramJsonElement, "status");
/* 164 */     kb localkb = new kb();
/*     */     
/* 166 */     if (localJsonObject.has("description")) {
/* 167 */       localkb.a((fj)paramJsonDeserializationContext.deserialize(localJsonObject.get("description"), fj.class));
/*     */     }
/*     */     
/* 170 */     if (localJsonObject.has("players")) {
/* 171 */       localkb.a((kc)paramJsonDeserializationContext.deserialize(localJsonObject.get("players"), kc.class));
/*     */     }
/*     */     
/* 174 */     if (localJsonObject.has("version")) {
/* 175 */       localkb.a((kf)paramJsonDeserializationContext.deserialize(localJsonObject.get("version"), kf.class));
/*     */     }
/*     */     
/* 178 */     if (localJsonObject.has("favicon")) {
/* 179 */       localkb.a(pu.h(localJsonObject, "favicon"));
/*     */     }
/*     */     
/* 182 */     return localkb;
/*     */   }
/*     */   
/*     */   public JsonElement a(kb paramkb, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 187 */     JsonObject localJsonObject = new JsonObject();
/*     */     
/* 189 */     if (paramkb.a() != null) {
/* 190 */       localJsonObject.add("description", paramJsonSerializationContext.serialize(paramkb.a()));
/*     */     }
/*     */     
/* 193 */     if (paramkb.b() != null) {
/* 194 */       localJsonObject.add("players", paramJsonSerializationContext.serialize(paramkb.b()));
/*     */     }
/*     */     
/* 197 */     if (paramkb.c() != null) {
/* 198 */       localJsonObject.add("version", paramJsonSerializationContext.serialize(paramkb.c()));
/*     */     }
/*     */     
/* 201 */     if (paramkb.d() != null) {
/* 202 */       localJsonObject.addProperty("favicon", paramkb.d());
/*     */     }
/*     */     
/* 205 */     return localJsonObject;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */