/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ka
/*    */   extends ft
/*    */ {
/* 13 */   private static final Gson a = new GsonBuilder().registerTypeAdapter(kf.class, new kg()).registerTypeAdapter(kc.class, new kd()).registerTypeAdapter(kb.class, new ke()).registerTypeHierarchyAdapter(fj.class, new fk()).registerTypeHierarchyAdapter(fn.class, new fp()).registerTypeAdapterFactory(new qf()).create();
/*    */   
/*    */ 
/*    */ 
/*    */   private kb b;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ka() {}
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public ka(kb paramkb)
/*    */   {
/* 29 */     this.b = paramkb;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 34 */     this.b = ((kb)a.fromJson(paramet.c(32767), kb.class));
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 39 */     paramet.a(a.toJson(this.b));
/*    */   }
/*    */   
/*    */   public void a(jy paramjy)
/*    */   {
/* 44 */     paramjy.a(this);
/*    */   }
/*    */   
/*    */   public kb c() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 53 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */