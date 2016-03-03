/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ 
/*     */ public class pu
/*     */ {
/*     */   public static boolean a(JsonObject paramJsonObject, String paramString)
/*     */   {
/*  11 */     if (!f(paramJsonObject, paramString)) {
/*  12 */       return false;
/*     */     }
/*  14 */     return paramJsonObject.getAsJsonPrimitive(paramString).isString();
/*     */   }
/*     */   
/*     */   public static boolean a(JsonElement paramJsonElement) {
/*  18 */     if (!paramJsonElement.isJsonPrimitive()) {
/*  19 */       return false;
/*     */     }
/*  21 */     return paramJsonElement.getAsJsonPrimitive().isString();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean d(JsonObject paramJsonObject, String paramString)
/*     */   {
/*  53 */     if (!g(paramJsonObject, paramString)) {
/*  54 */       return false;
/*     */     }
/*  56 */     if (!paramJsonObject.get(paramString).isJsonArray()) {
/*  57 */       return false;
/*     */     }
/*  59 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean f(JsonObject paramJsonObject, String paramString)
/*     */   {
/*  73 */     if (!g(paramJsonObject, paramString)) {
/*  74 */       return false;
/*     */     }
/*  76 */     if (!paramJsonObject.get(paramString).isJsonPrimitive()) {
/*  77 */       return false;
/*     */     }
/*  79 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean g(JsonObject paramJsonObject, String paramString) {
/*  83 */     if (paramJsonObject == null) {
/*  84 */       return false;
/*     */     }
/*  86 */     if (paramJsonObject.get(paramString) == null) {
/*  87 */       return false;
/*     */     }
/*  89 */     return true;
/*     */   }
/*     */   
/*     */   public static String a(JsonElement paramJsonElement, String paramString) {
/*  93 */     if (paramJsonElement.isJsonPrimitive()) {
/*  94 */       return paramJsonElement.getAsString();
/*     */     }
/*  96 */     throw new JsonSyntaxException("Expected " + paramString + " to be a string, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static String h(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 101 */     if (paramJsonObject.has(paramString)) {
/* 102 */       return a(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 104 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a string");
/*     */   }
/*     */   
/*     */   public static String a(JsonObject paramJsonObject, String paramString1, String paramString2)
/*     */   {
/* 109 */     if (paramJsonObject.has(paramString1)) {
/* 110 */       return a(paramJsonObject.get(paramString1), paramString1);
/*     */     }
/* 112 */     return paramString2;
/*     */   }
/*     */   
/*     */   public static boolean b(JsonElement paramJsonElement, String paramString)
/*     */   {
/* 117 */     if (paramJsonElement.isJsonPrimitive()) {
/* 118 */       return paramJsonElement.getAsBoolean();
/*     */     }
/* 120 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Boolean, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static boolean i(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 125 */     if (paramJsonObject.has(paramString)) {
/* 126 */       return b(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 128 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Boolean");
/*     */   }
/*     */   
/*     */   public static boolean a(JsonObject paramJsonObject, String paramString, boolean paramBoolean)
/*     */   {
/* 133 */     if (paramJsonObject.has(paramString)) {
/* 134 */       return b(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 136 */     return paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static float d(JsonElement paramJsonElement, String paramString)
/*     */   {
/* 165 */     if ((paramJsonElement.isJsonPrimitive()) && (paramJsonElement.getAsJsonPrimitive().isNumber())) {
/* 166 */       return paramJsonElement.getAsFloat();
/*     */     }
/* 168 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Float, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static float k(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 173 */     if (paramJsonObject.has(paramString)) {
/* 174 */       return d(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 176 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Float");
/*     */   }
/*     */   
/*     */   public static float a(JsonObject paramJsonObject, String paramString, float paramFloat)
/*     */   {
/* 181 */     if (paramJsonObject.has(paramString)) {
/* 182 */       return d(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 184 */     return paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int f(JsonElement paramJsonElement, String paramString)
/*     */   {
/* 213 */     if ((paramJsonElement.isJsonPrimitive()) && (paramJsonElement.getAsJsonPrimitive().isNumber())) {
/* 214 */       return paramJsonElement.getAsInt();
/*     */     }
/* 216 */     throw new JsonSyntaxException("Expected " + paramString + " to be a Int, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static int m(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 221 */     if (paramJsonObject.has(paramString)) {
/* 222 */       return f(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 224 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a Int");
/*     */   }
/*     */   
/*     */   public static int a(JsonObject paramJsonObject, String paramString, int paramInt)
/*     */   {
/* 229 */     if (paramJsonObject.has(paramString)) {
/* 230 */       return f(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 232 */     return paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static JsonObject l(JsonElement paramJsonElement, String paramString)
/*     */   {
/* 357 */     if (paramJsonElement.isJsonObject()) {
/* 358 */       return paramJsonElement.getAsJsonObject();
/*     */     }
/* 360 */     throw new JsonSyntaxException("Expected " + paramString + " to be a JsonObject, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static JsonObject s(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 365 */     if (paramJsonObject.has(paramString)) {
/* 366 */       return l(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 368 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a JsonObject");
/*     */   }
/*     */   
/*     */   public static JsonObject a(JsonObject paramJsonObject1, String paramString, JsonObject paramJsonObject2)
/*     */   {
/* 373 */     if (paramJsonObject1.has(paramString)) {
/* 374 */       return l(paramJsonObject1.get(paramString), paramString);
/*     */     }
/* 376 */     return paramJsonObject2;
/*     */   }
/*     */   
/*     */   public static JsonArray m(JsonElement paramJsonElement, String paramString)
/*     */   {
/* 381 */     if (paramJsonElement.isJsonArray()) {
/* 382 */       return paramJsonElement.getAsJsonArray();
/*     */     }
/* 384 */     throw new JsonSyntaxException("Expected " + paramString + " to be a JsonArray, was " + d(paramJsonElement));
/*     */   }
/*     */   
/*     */   public static JsonArray t(JsonObject paramJsonObject, String paramString)
/*     */   {
/* 389 */     if (paramJsonObject.has(paramString)) {
/* 390 */       return m(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 392 */     throw new JsonSyntaxException("Missing " + paramString + ", expected to find a JsonArray");
/*     */   }
/*     */   
/*     */   public static JsonArray a(JsonObject paramJsonObject, String paramString, JsonArray paramJsonArray)
/*     */   {
/* 397 */     if (paramJsonObject.has(paramString)) {
/* 398 */       return m(paramJsonObject.get(paramString), paramString);
/*     */     }
/* 400 */     return paramJsonArray;
/*     */   }
/*     */   
/*     */   public static String d(JsonElement paramJsonElement)
/*     */   {
/* 405 */     String str = org.apache.commons.lang3.StringUtils.abbreviateMiddle(String.valueOf(paramJsonElement), "...", 10);
/* 406 */     if (paramJsonElement == null) return "null (missing)";
/* 407 */     if (paramJsonElement.isJsonNull()) return "null (json)";
/* 408 */     if (paramJsonElement.isJsonArray()) return "an array (" + str + ")";
/* 409 */     if (paramJsonElement.isJsonObject()) return "an object (" + str + ")";
/* 410 */     if (paramJsonElement.isJsonPrimitive()) {
/* 411 */       JsonPrimitive localJsonPrimitive = paramJsonElement.getAsJsonPrimitive();
/* 412 */       if (localJsonPrimitive.isNumber()) return "a number (" + str + ")";
/* 413 */       if (localJsonPrimitive.isBoolean()) return "a boolean (" + str + ")";
/*     */     }
/* 415 */     return str;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */