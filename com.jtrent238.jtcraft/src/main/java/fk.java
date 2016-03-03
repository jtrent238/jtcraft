/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map.Entry;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fk
/*     */   implements JsonDeserializer, JsonSerializer
/*     */ {
/*     */   private static final Gson a;
/*     */   
/*     */   static
/*     */   {
/*  33 */     GsonBuilder localGsonBuilder = new GsonBuilder();
/*  34 */     localGsonBuilder.registerTypeHierarchyAdapter(fj.class, new fk());
/*  35 */     localGsonBuilder.registerTypeHierarchyAdapter(fn.class, new fp());
/*  36 */     localGsonBuilder.registerTypeAdapterFactory(new qf());
/*  37 */     a = localGsonBuilder.create();
/*     */   }
/*     */   
/*     */   public fj a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*     */   {
/*  42 */     if (paramJsonElement.isJsonPrimitive())
/*     */     {
/*  44 */       return new fq(paramJsonElement.getAsString()); }
/*  45 */     Object localObject1; Object localObject2; Object localObject3; Object localObject4; if (paramJsonElement.isJsonObject()) {
/*  46 */       localObject1 = paramJsonElement.getAsJsonObject();
/*     */       
/*     */ 
/*  49 */       if (((JsonObject)localObject1).has("text")) {
/*  50 */         localObject2 = new fq(((JsonObject)localObject1).get("text").getAsString());
/*  51 */       } else if (((JsonObject)localObject1).has("translate")) {
/*  52 */         localObject3 = ((JsonObject)localObject1).get("translate").getAsString();
/*     */         
/*  54 */         if (((JsonObject)localObject1).has("with")) {
/*  55 */           JsonArray localJsonArray = ((JsonObject)localObject1).getAsJsonArray("with");
/*  56 */           localObject4 = new Object[localJsonArray.size()];
/*     */           
/*  58 */           for (int j = 0; j < localObject4.length; j++) {
/*  59 */             localObject4[j] = a(localJsonArray.get(j), paramType, paramJsonDeserializationContext);
/*     */             
/*  61 */             if ((localObject4[j] instanceof fq)) {
/*  62 */               fq localfq = (fq)localObject4[j];
/*  63 */               if ((localfq.b().g()) && (localfq.a().isEmpty())) {
/*  64 */                 localObject4[j] = localfq.g();
/*     */               }
/*     */             }
/*     */           }
/*     */           
/*  69 */           localObject2 = new fr((String)localObject3, (Object[])localObject4);
/*     */         } else {
/*  71 */           localObject2 = new fr((String)localObject3, new Object[0]);
/*     */         }
/*     */       } else {
/*  74 */         throw new JsonParseException("Don't know how to turn " + paramJsonElement.toString() + " into a Component");
/*     */       }
/*     */       
/*  77 */       if (((JsonObject)localObject1).has("extra")) {
/*  78 */         localObject3 = ((JsonObject)localObject1).getAsJsonArray("extra");
/*     */         
/*  80 */         if (((JsonArray)localObject3).size() > 0) {
/*  81 */           for (int i = 0; i < ((JsonArray)localObject3).size(); i++) {
/*  82 */             ((fj)localObject2).a(a(((JsonArray)localObject3).get(i), paramType, paramJsonDeserializationContext));
/*     */           }
/*     */         } else {
/*  85 */           throw new JsonParseException("Unexpected empty array of components");
/*     */         }
/*     */       }
/*     */       
/*  89 */       ((fj)localObject2).a((fn)paramJsonDeserializationContext.deserialize(paramJsonElement, fn.class));
/*     */       
/*  91 */       return (fj)localObject2; }
/*  92 */     if (paramJsonElement.isJsonArray())
/*     */     {
/*  94 */       localObject1 = paramJsonElement.getAsJsonArray();
/*  95 */       localObject2 = null;
/*     */       
/*  97 */       for (localObject3 = ((JsonArray)localObject1).iterator(); ((Iterator)localObject3).hasNext();) { JsonElement localJsonElement = (JsonElement)((Iterator)localObject3).next();
/*  98 */         localObject4 = a(localJsonElement, localJsonElement.getClass(), paramJsonDeserializationContext);
/*  99 */         if (localObject2 == null) {
/* 100 */           localObject2 = localObject4;
/*     */         } else {
/* 102 */           ((fj)localObject2).a((fj)localObject4);
/*     */         }
/*     */       }
/*     */       
/* 106 */       return (fj)localObject2;
/*     */     }
/* 108 */     throw new JsonParseException("Don't know how to turn " + paramJsonElement.toString() + " into a Component");
/*     */   }
/*     */   
/*     */   private void a(fn paramfn, JsonObject paramJsonObject, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 113 */     JsonElement localJsonElement = paramJsonSerializationContext.serialize(paramfn);
/*     */     
/* 115 */     if (localJsonElement.isJsonObject()) {
/* 116 */       JsonObject localJsonObject = (JsonObject)localJsonElement;
/* 117 */       for (Map.Entry localEntry : localJsonObject.entrySet()) {
/* 118 */         paramJsonObject.add((String)localEntry.getKey(), (JsonElement)localEntry.getValue());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public JsonElement a(fj paramfj, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*     */   {
/* 125 */     if (((paramfj instanceof fq)) && (paramfj.b().g()) && (paramfj.a().isEmpty())) {
/* 126 */       return new JsonPrimitive(((fq)paramfj).g());
/*     */     }
/*     */     
/* 129 */     JsonObject localJsonObject = new JsonObject();
/*     */     
/* 131 */     if (!paramfj.b().g())
/* 132 */       a(paramfj.b(), localJsonObject, paramJsonSerializationContext);
/*     */     Object localObject1;
/*     */     Object localObject2;
/* 135 */     Object localObject3; if (!paramfj.a().isEmpty()) {
/* 136 */       localObject1 = new JsonArray();
/*     */       
/* 138 */       for (localObject2 = paramfj.a().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (fj)((Iterator)localObject2).next();
/* 139 */         ((JsonArray)localObject1).add(a((fj)localObject3, localObject3.getClass(), paramJsonSerializationContext));
/*     */       }
/*     */       
/* 142 */       localJsonObject.add("extra", (JsonElement)localObject1);
/*     */     }
/*     */     
/* 145 */     if ((paramfj instanceof fq)) {
/* 146 */       localJsonObject.addProperty("text", ((fq)paramfj).g());
/* 147 */     } else if ((paramfj instanceof fr)) {
/* 148 */       localObject1 = (fr)paramfj;
/* 149 */       localJsonObject.addProperty("translate", ((fr)localObject1).i());
/*     */       
/* 151 */       if ((((fr)localObject1).j() != null) && (((fr)localObject1).j().length > 0)) {
/* 152 */         localObject2 = new JsonArray();
/*     */         
/* 154 */         for (Object localObject4 : ((fr)localObject1).j()) {
/* 155 */           if ((localObject4 instanceof fj)) {
/* 156 */             ((JsonArray)localObject2).add(a((fj)localObject4, localObject4.getClass(), paramJsonSerializationContext));
/*     */           } else {
/* 158 */             ((JsonArray)localObject2).add(new JsonPrimitive(String.valueOf(localObject4)));
/*     */           }
/*     */         }
/*     */         
/* 162 */         localJsonObject.add("with", (JsonElement)localObject2);
/*     */       }
/*     */     } else {
/* 165 */       throw new IllegalArgumentException("Don't know how to serialize " + paramfj + " as a Component");
/*     */     }
/*     */     
/* 168 */     return localJsonObject;
/*     */   }
/*     */   
/*     */   public static String a(fj paramfj) {
/* 172 */     return a.toJson(paramfj);
/*     */   }
/*     */   
/*     */   public static fj a(String paramString) {
/* 176 */     return (fj)a.fromJson(paramString, fj.class);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */