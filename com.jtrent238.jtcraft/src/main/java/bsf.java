/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsf
/*    */   extends brt
/*    */ {
/*    */   public bse a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*    */   {
/* 19 */     JsonObject localJsonObject1 = paramJsonElement.getAsJsonObject();
/* 20 */     HashSet localHashSet = Sets.newHashSet();
/*    */     
/* 22 */     for (Map.Entry localEntry : localJsonObject1.entrySet()) {
/* 23 */       String str1 = (String)localEntry.getKey();
/* 24 */       JsonObject localJsonObject2 = pu.l((JsonElement)localEntry.getValue(), "language");
/* 25 */       String str2 = pu.h(localJsonObject2, "region");
/* 26 */       String str3 = pu.h(localJsonObject2, "name");
/* 27 */       boolean bool = pu.a(localJsonObject2, "bidirectional", false);
/*    */       
/* 29 */       if (str2.isEmpty()) {
/* 30 */         throw new JsonParseException("Invalid language->'" + str1 + "'->region: empty value");
/*    */       }
/*    */       
/* 33 */       if (str3.isEmpty()) {
/* 34 */         throw new JsonParseException("Invalid language->'" + str1 + "'->name: empty value");
/*    */       }
/*    */       
/* 37 */       if (!localHashSet.add(new brq(str1, str2, str3, bool))) {
/* 38 */         throw new JsonParseException("Duplicate language->'" + str1 + "' defined");
/*    */       }
/*    */     }
/*    */     
/* 42 */     return new bse(localHashSet);
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 47 */     return "language";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */