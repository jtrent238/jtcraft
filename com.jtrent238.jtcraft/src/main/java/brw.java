/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class brw
/*    */ {
/* 13 */   private final cz a = new da();
/* 14 */   private final GsonBuilder b = new GsonBuilder();
/*    */   private Gson c;
/*    */   
/*    */   public brw() {
/* 18 */     this.b.registerTypeHierarchyAdapter(fj.class, new fk());
/* 19 */     this.b.registerTypeHierarchyAdapter(fn.class, new fp());
/* 20 */     this.b.registerTypeAdapterFactory(new qf());
/*    */   }
/*    */   
/*    */   public void a(brv parambrv, Class paramClass) {
/* 24 */     this.a.a(parambrv.a(), new bry(this, parambrv, paramClass, null));
/* 25 */     this.b.registerTypeAdapter(paramClass, parambrv);
/* 26 */     this.c = null;
/*    */   }
/*    */   
/*    */   public bru a(String paramString, JsonObject paramJsonObject) {
/* 30 */     if (paramString == null) {
/* 31 */       throw new IllegalArgumentException("Metadata section name cannot be null");
/*    */     }
/* 33 */     if (!paramJsonObject.has(paramString)) {
/* 34 */       return null;
/*    */     }
/* 36 */     if (!paramJsonObject.get(paramString).isJsonObject()) {
/* 37 */       throw new IllegalArgumentException("Invalid metadata for '" + paramString + "' - expected object, found " + paramJsonObject.get(paramString));
/*    */     }
/*    */     
/* 40 */     bry localbry = (bry)this.a.a(paramString);
/* 41 */     if (localbry == null) {
/* 42 */       throw new IllegalArgumentException("Don't know how to handle metadata section '" + paramString + "'");
/*    */     }
/*    */     
/* 45 */     return (bru)a().fromJson(paramJsonObject.getAsJsonObject(paramString), localbry.b);
/*    */   }
/*    */   
/*    */   private Gson a() {
/* 49 */     if (this.c == null) {
/* 50 */       this.c = this.b.create();
/*    */     }
/* 52 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */