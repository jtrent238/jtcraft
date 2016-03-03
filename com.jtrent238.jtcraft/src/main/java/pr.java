/*    */ import com.google.common.collect.ForwardingSet;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonArray;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class pr
/*    */   extends ForwardingSet
/*    */   implements po
/*    */ {
/* 12 */   private final Set a = Sets.newHashSet();
/*    */   
/*    */   public void a(JsonElement paramJsonElement)
/*    */   {
/* 16 */     if (paramJsonElement.isJsonArray()) {
/* 17 */       for (JsonElement localJsonElement : paramJsonElement.getAsJsonArray()) {
/* 18 */         add(localJsonElement.getAsString());
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public JsonElement a()
/*    */   {
/* 25 */     JsonArray localJsonArray = new JsonArray();
/*    */     
/* 27 */     for (String str : this) {
/* 28 */       localJsonArray.add(new JsonPrimitive(str));
/*    */     }
/*    */     
/* 31 */     return localJsonArray;
/*    */   }
/*    */   
/*    */   protected Set delegate()
/*    */   {
/* 36 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */