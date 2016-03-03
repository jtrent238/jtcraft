/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fp
/*     */   implements JsonDeserializer, JsonSerializer
/*     */ {
/*     */   public fn a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*     */   {
/* 250 */     if (paramJsonElement.isJsonObject()) {
/* 251 */       fn localfn = new fn();
/* 252 */       JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/* 253 */       if (localJsonObject1 == null) {
/* 254 */         return null;
/*     */       }
/*     */       
/* 257 */       if (localJsonObject1.has("bold")) fn.a(localfn, Boolean.valueOf(localJsonObject1.get("bold").getAsBoolean()));
/* 258 */       if (localJsonObject1.has("italic")) fn.b(localfn, Boolean.valueOf(localJsonObject1.get("italic").getAsBoolean()));
/* 259 */       if (localJsonObject1.has("underlined")) fn.c(localfn, Boolean.valueOf(localJsonObject1.get("underlined").getAsBoolean()));
/* 260 */       if (localJsonObject1.has("strikethrough")) fn.d(localfn, Boolean.valueOf(localJsonObject1.get("strikethrough").getAsBoolean()));
/* 261 */       if (localJsonObject1.has("obfuscated")) fn.e(localfn, Boolean.valueOf(localJsonObject1.get("obfuscated").getAsBoolean()));
/* 262 */       if (localJsonObject1.has("color")) fn.a(localfn, (a)paramJsonDeserializationContext.deserialize(localJsonObject1.get("color"), a.class));
/*     */       JsonObject localJsonObject2;
/* 264 */       JsonPrimitive localJsonPrimitive; Object localObject1; Object localObject2; if (localJsonObject1.has("clickEvent")) {
/* 265 */         localJsonObject2 = localJsonObject1.getAsJsonObject("clickEvent");
/* 266 */         if (localJsonObject2 != null) {
/* 267 */           localJsonPrimitive = localJsonObject2.getAsJsonPrimitive("action");
/* 268 */           localObject1 = localJsonPrimitive == null ? null : fi.a(localJsonPrimitive.getAsString());
/*     */           
/* 270 */           localObject2 = localJsonObject2.getAsJsonPrimitive("value");
/* 271 */           String str = localObject2 == null ? null : ((JsonPrimitive)localObject2).getAsString();
/*     */           
/* 273 */           if ((localObject1 != null) && (str != null) && (((fi)localObject1).a())) {
/* 274 */             fn.a(localfn, new fh((fi)localObject1, str));
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 279 */       if (localJsonObject1.has("hoverEvent")) {
/* 280 */         localJsonObject2 = localJsonObject1.getAsJsonObject("hoverEvent");
/* 281 */         if (localJsonObject2 != null) {
/* 282 */           localJsonPrimitive = localJsonObject2.getAsJsonPrimitive("action");
/* 283 */           localObject1 = localJsonPrimitive == null ? null : fm.a(localJsonPrimitive.getAsString());
/*     */           
/* 285 */           localObject2 = (fj)paramJsonDeserializationContext.deserialize(localJsonObject2.get("value"), fj.class);
/*     */           
/* 287 */           if ((localObject1 != null) && (localObject2 != null) && (((fm)localObject1).a())) {
/* 288 */             fn.a(localfn, new fl((fm)localObject1, (fj)localObject2));
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 293 */       return localfn;
/*     */     }
/*     */     
/* 296 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public JsonElement a(fn paramfn, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 302 */     if (paramfn.g()) return null;
/* 303 */     JsonObject localJsonObject1 = new JsonObject();
/*     */     
/* 305 */     if (fn.b(paramfn) != null) localJsonObject1.addProperty("bold", fn.b(paramfn));
/* 306 */     if (fn.c(paramfn) != null) localJsonObject1.addProperty("italic", fn.c(paramfn));
/* 307 */     if (fn.d(paramfn) != null) localJsonObject1.addProperty("underlined", fn.d(paramfn));
/* 308 */     if (fn.e(paramfn) != null) localJsonObject1.addProperty("strikethrough", fn.e(paramfn));
/* 309 */     if (fn.f(paramfn) != null) localJsonObject1.addProperty("obfuscated", fn.f(paramfn));
/* 310 */     if (fn.g(paramfn) != null) localJsonObject1.add("color", paramJsonSerializationContext.serialize(fn.g(paramfn)));
/*     */     JsonObject localJsonObject2;
/* 312 */     if (fn.h(paramfn) != null) {
/* 313 */       localJsonObject2 = new JsonObject();
/* 314 */       localJsonObject2.addProperty("action", fn.h(paramfn).a().b());
/* 315 */       localJsonObject2.addProperty("value", fn.h(paramfn).b());
/* 316 */       localJsonObject1.add("clickEvent", localJsonObject2);
/*     */     }
/*     */     
/* 319 */     if (fn.i(paramfn) != null) {
/* 320 */       localJsonObject2 = new JsonObject();
/* 321 */       localJsonObject2.addProperty("action", fn.i(paramfn).a().b());
/* 322 */       localJsonObject2.add("value", paramJsonSerializationContext.serialize(fn.i(paramfn).b()));
/* 323 */       localJsonObject1.add("hoverEvent", localJsonObject2);
/*     */     }
/*     */     
/* 326 */     return localJsonObject1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */