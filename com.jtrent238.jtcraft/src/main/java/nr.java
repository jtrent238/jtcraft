/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.text.ParseException;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ public abstract class nr
/*    */   extends ol
/*    */ {
/* 10 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*    */   
/*    */   protected final Date b;
/*    */   protected final String c;
/*    */   protected final Date d;
/*    */   protected final String e;
/*    */   
/*    */   public nr(Object paramObject, Date paramDate1, String paramString1, Date paramDate2, String paramString2)
/*    */   {
/* 19 */     super(paramObject);
/* 20 */     this.b = (paramDate1 == null ? new Date() : paramDate1);
/* 21 */     this.c = (paramString1 == null ? "(Unknown)" : paramString1);
/* 22 */     this.d = paramDate2;
/* 23 */     this.e = (paramString2 == null ? "Banned by an operator." : paramString2);
/*    */   }
/*    */   
/*    */   protected nr(Object paramObject, JsonObject paramJsonObject) {
/* 27 */     super(paramObject, paramJsonObject);
/*    */     Date localDate1;
/*    */     try {
/* 30 */       localDate1 = paramJsonObject.has("created") ? a.parse(paramJsonObject.get("created").getAsString()) : new Date();
/*    */     } catch (ParseException localParseException1) {
/* 32 */       localDate1 = new Date();
/*    */     }
/* 34 */     this.b = localDate1;
/* 35 */     this.c = (paramJsonObject.has("source") ? paramJsonObject.get("source").getAsString() : "(Unknown)");
/*    */     Date localDate2;
/*    */     try {
/* 38 */       localDate2 = paramJsonObject.has("expires") ? a.parse(paramJsonObject.get("expires").getAsString()) : null;
/*    */     } catch (ParseException localParseException2) {
/* 40 */       localDate2 = null;
/*    */     }
/* 42 */     this.d = localDate2;
/* 43 */     this.e = (paramJsonObject.has("reason") ? paramJsonObject.get("reason").getAsString() : "Banned by an operator.");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public Date c()
/*    */   {
/* 55 */     return this.d;
/*    */   }
/*    */   
/*    */   public String d() {
/* 59 */     return this.e;
/*    */   }
/*    */   
/*    */   boolean e()
/*    */   {
/* 64 */     if (this.d == null) {
/* 65 */       return false;
/*    */     }
/* 67 */     return this.d.before(new Date());
/*    */   }
/*    */   
/*    */   protected void a(JsonObject paramJsonObject)
/*    */   {
/* 72 */     paramJsonObject.addProperty("created", a.format(this.b));
/* 73 */     paramJsonObject.addProperty("source", this.c);
/* 74 */     paramJsonObject.addProperty("expires", this.d == null ? "forever" : a.format(this.d));
/* 75 */     paramJsonObject.addProperty("reason", this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */