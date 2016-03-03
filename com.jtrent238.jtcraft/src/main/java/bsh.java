/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import com.google.gson.JsonSerializer;
/*    */ import java.lang.reflect.Type;
/*    */ 
/*    */ public class bsh
/*    */   extends brt implements JsonSerializer
/*    */ {
/*    */   public bsg a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 13 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/* 14 */     fj localfj = (fj)paramJsonDeserializationContext.deserialize(localJsonObject.get("description"), fj.class);
/* 15 */     int i = pu.m(localJsonObject, "pack_format");
/* 16 */     return new bsg(localfj, i);
/*    */   }
/*    */   
/*    */   public JsonElement a(bsg parambsg, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*    */   {
/* 21 */     JsonObject localJsonObject = new JsonObject();
/*    */     
/* 23 */     localJsonObject.addProperty("pack_format", Integer.valueOf(parambsg.b()));
/* 24 */     localJsonObject.add("description", paramJsonSerializationContext.serialize(parambsg.a()));
/*    */     
/* 26 */     return localJsonObject;
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 31 */     return "pack";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */