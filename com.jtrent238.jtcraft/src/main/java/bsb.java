/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.ArrayList;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ public class bsb extends brt implements com.google.gson.JsonSerializer
/*    */ {
/*    */   public bsa a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 15 */     ArrayList localArrayList = com.google.common.collect.Lists.newArrayList();
/* 16 */     JsonObject localJsonObject = pu.l(paramJsonElement, "metadata section");
/* 17 */     int i = pu.a(localJsonObject, "frametime", 1);
/* 18 */     if (i != 1) {
/* 19 */       Validate.inclusiveBetween(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(i), "Invalid default frame time", new Object[0]);
/*    */     }
/*    */     
/* 22 */     if (localJsonObject.has("frames")) {
/*    */       try {
/* 24 */         JsonArray localJsonArray = pu.t(localJsonObject, "frames");
/*    */         
/* 26 */         for (k = 0; k < localJsonArray.size(); k++) {
/* 27 */           JsonElement localJsonElement = localJsonArray.get(k);
/*    */           
/* 29 */           brz localbrz = a(k, localJsonElement);
/* 30 */           if (localbrz != null) localArrayList.add(localbrz);
/*    */         }
/*    */       } catch (ClassCastException localClassCastException) {
/* 33 */         throw new com.google.gson.JsonParseException("Invalid animation->frames: expected array, was " + localJsonObject.get("frames"), localClassCastException);
/*    */       }
/*    */     }
/*    */     
/* 37 */     int j = pu.a(localJsonObject, "width", -1);
/* 38 */     int k = pu.a(localJsonObject, "height", -1);
/*    */     
/* 40 */     if (j != -1) {
/* 41 */       Validate.inclusiveBetween(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(j), "Invalid width", new Object[0]);
/*    */     }
/* 43 */     if (k != -1) {
/* 44 */       Validate.inclusiveBetween(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(k), "Invalid height", new Object[0]);
/*    */     }
/*    */     
/* 47 */     return new bsa(localArrayList, j, k, i);
/*    */   }
/*    */   
/*    */   private brz a(int paramInt, JsonElement paramJsonElement) {
/* 51 */     if (paramJsonElement.isJsonPrimitive())
/* 52 */       return new brz(pu.f(paramJsonElement, "frames[" + paramInt + "]"));
/* 53 */     if (paramJsonElement.isJsonObject()) {
/* 54 */       JsonObject localJsonObject = pu.l(paramJsonElement, "frames[" + paramInt + "]");
/* 55 */       int i = pu.a(localJsonObject, "time", -1);
/* 56 */       if (localJsonObject.has("time")) {
/* 57 */         Validate.inclusiveBetween(Integer.valueOf(1), Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(i), "Invalid frame time", new Object[0]);
/*    */       }
/* 59 */       int j = pu.m(localJsonObject, "index");
/* 60 */       Validate.inclusiveBetween(Integer.valueOf(0), Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(j), "Invalid frame index", new Object[0]);
/* 61 */       return new brz(j, i);
/*    */     }
/*    */     
/* 64 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */   public JsonElement a(bsa parambsa, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*    */   {
/* 70 */     JsonObject localJsonObject1 = new JsonObject();
/*    */     
/* 72 */     localJsonObject1.addProperty("frametime", Integer.valueOf(parambsa.d()));
/* 73 */     if (parambsa.b() != -1) localJsonObject1.addProperty("width", Integer.valueOf(parambsa.b()));
/* 74 */     if (parambsa.a() != -1) { localJsonObject1.addProperty("height", Integer.valueOf(parambsa.a()));
/*    */     }
/* 76 */     if (parambsa.c() > 0) {
/* 77 */       JsonArray localJsonArray = new JsonArray();
/* 78 */       for (int i = 0; i < parambsa.c(); i++) {
/* 79 */         if (parambsa.b(i)) {
/* 80 */           JsonObject localJsonObject2 = new JsonObject();
/*    */           
/* 82 */           localJsonObject2.addProperty("index", Integer.valueOf(parambsa.c(i)));
/* 83 */           localJsonObject2.addProperty("time", Integer.valueOf(parambsa.a(i)));
/*    */           
/* 85 */           localJsonArray.add(localJsonObject2);
/*    */         } else {
/* 87 */           localJsonArray.add(new JsonPrimitive(Integer.valueOf(parambsa.c(i))));
/*    */         }
/*    */       }
/* 90 */       localJsonObject1.add("frames", localJsonArray);
/*    */     }
/*    */     
/* 93 */     return localJsonObject1;
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 98 */     return "animation";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */