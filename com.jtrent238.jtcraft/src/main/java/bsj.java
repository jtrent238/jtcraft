/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public class bsj extends brt
/*    */ {
/*    */   public bsi a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 14 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 15 */     boolean bool1 = pu.a(localJsonObject, "blur", false);
/* 16 */     boolean bool2 = pu.a(localJsonObject, "clamp", false);
/*    */     
/* 18 */     ArrayList localArrayList = Lists.newArrayList();
/* 19 */     if (localJsonObject.has("mipmaps")) {
/*    */       try {
/* 21 */         JsonArray localJsonArray = localJsonObject.getAsJsonArray("mipmaps");
/*    */         
/* 23 */         for (int i = 0; i < localJsonArray.size(); i++) {
/* 24 */           JsonElement localJsonElement = localJsonArray.get(i);
/*    */           
/* 26 */           if (localJsonElement.isJsonPrimitive()) {
/*    */             try {
/* 28 */               localArrayList.add(Integer.valueOf(localJsonElement.getAsInt()));
/*    */             } catch (NumberFormatException localNumberFormatException) {
/* 30 */               throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + localJsonElement, localNumberFormatException);
/*    */             }
/* 32 */           } else if (localJsonElement.isJsonObject()) {
/* 33 */             throw new JsonParseException("Invalid texture->mipmap->" + i + ": expected number, was " + localJsonElement);
/*    */           }
/*    */         }
/*    */       }
/*    */       catch (ClassCastException localClassCastException)
/*    */       {
/* 39 */         throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + localJsonObject.get("mipmaps"), localClassCastException);
/*    */       }
/*    */     }
/* 42 */     return new bsi(bool1, bool2, localArrayList);
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 47 */     return "texture";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */