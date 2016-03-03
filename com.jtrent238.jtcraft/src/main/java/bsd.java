/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ public class bsd
/*    */   extends brt
/*    */ {
/*    */   public bsc a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 13 */     JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/* 14 */     float[] arrayOfFloat1 = new float['Ā'];
/* 15 */     float[] arrayOfFloat2 = new float['Ā'];
/* 16 */     float[] arrayOfFloat3 = new float['Ā'];
/* 17 */     float f1 = 1.0F;
/* 18 */     float f2 = 0.0F;
/* 19 */     float f3 = 0.0F;
/*    */     
/* 21 */     if (localJsonObject1.has("characters")) {
/* 22 */       if (!localJsonObject1.get("characters").isJsonObject()) {
/* 23 */         throw new JsonParseException("Invalid font->characters: expected object, was " + localJsonObject1.get("characters"));
/*    */       }
/*    */       
/* 26 */       JsonObject localJsonObject2 = localJsonObject1.getAsJsonObject("characters");
/*    */       
/* 28 */       if (localJsonObject2.has("default")) {
/* 29 */         if (!localJsonObject2.get("default").isJsonObject()) {
/* 30 */           throw new JsonParseException("Invalid font->characters->default: expected object, was " + localJsonObject2.get("default"));
/*    */         }
/* 32 */         JsonObject localJsonObject3 = localJsonObject2.getAsJsonObject("default");
/*    */         
/* 34 */         f1 = pu.a(localJsonObject3, "width", f1);
/* 35 */         Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f1), "Invalid default width", new Object[0]);
/* 36 */         f2 = pu.a(localJsonObject3, "spacing", f2);
/* 37 */         Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f2), "Invalid default spacing", new Object[0]);
/* 38 */         f3 = pu.a(localJsonObject3, "left", f2);
/* 39 */         Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f3), "Invalid default left", new Object[0]);
/*    */       }
/*    */       
/* 42 */       for (int i = 0; i < 256; i++) {
/* 43 */         JsonElement localJsonElement = localJsonObject2.get(Integer.toString(i));
/* 44 */         float f4 = f1;
/* 45 */         float f5 = f2;
/* 46 */         float f6 = f3;
/*    */         
/* 48 */         if (localJsonElement != null) {
/* 49 */           JsonObject localJsonObject4 = pu.l(localJsonElement, "characters[" + i + "]");
/* 50 */           f4 = pu.a(localJsonObject4, "width", f1);
/* 51 */           Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f4), "Invalid width", new Object[0]);
/* 52 */           f5 = pu.a(localJsonObject4, "spacing", f2);
/* 53 */           Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f5), "Invalid spacing", new Object[0]);
/* 54 */           f6 = pu.a(localJsonObject4, "left", f3);
/* 55 */           Validate.inclusiveBetween(Float.valueOf(0.0F), Float.valueOf(Float.MAX_VALUE), Float.valueOf(f6), "Invalid left", new Object[0]);
/*    */         }
/*    */         
/* 58 */         arrayOfFloat1[i] = f4;
/* 59 */         arrayOfFloat2[i] = f5;
/* 60 */         arrayOfFloat3[i] = f6;
/*    */       }
/*    */     }
/*    */     
/* 64 */     return new bsc(arrayOfFloat1, arrayOfFloat3, arrayOfFloat2);
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 69 */     return "font";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */