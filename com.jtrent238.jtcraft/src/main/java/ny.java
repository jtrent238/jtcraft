/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class ny extends nr
/*    */ {
/*    */   public ny(String paramString)
/*    */   {
/*  9 */     this(paramString, null, null, null, null);
/*    */   }
/*    */   
/*    */   public ny(String paramString1, Date paramDate1, String paramString2, Date paramDate2, String paramString3) {
/* 13 */     super(paramString1, paramDate1, paramString2, paramDate2, paramString3);
/*    */   }
/*    */   
/*    */   public ny(JsonObject paramJsonObject) {
/* 17 */     super(b(paramJsonObject), paramJsonObject);
/*    */   }
/*    */   
/*    */   private static String b(JsonObject paramJsonObject) {
/* 21 */     return paramJsonObject.has("ip") ? paramJsonObject.get("ip").getAsString() : null;
/*    */   }
/*    */   
/*    */   protected void a(JsonObject paramJsonObject)
/*    */   {
/* 26 */     if (f() == null) {
/* 27 */       return;
/*    */     }
/* 29 */     paramJsonObject.addProperty("ip", (String)f());
/* 30 */     super.a(paramJsonObject);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */