/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rp
/*    */   extends ro
/*    */ {
/*    */   protected sa p;
/*    */   
/*    */   public rp(String paramString, sa paramsa)
/*    */   {
/* 15 */     super(paramString);
/* 16 */     this.p = paramsa;
/*    */   }
/*    */   
/*    */   public sa j()
/*    */   {
/* 21 */     return this.p;
/*    */   }
/*    */   
/*    */   public fj b(sv paramsv)
/*    */   {
/* 26 */     Object localObject = (this.p instanceof sv) ? ((sv)this.p).be() : null;
/* 27 */     String str1 = "death.attack." + this.o;
/* 28 */     String str2 = str1 + ".item";
/*    */     
/* 30 */     if ((localObject != null) && (((add)localObject).u()) && (dd.c(str2))) {
/* 31 */       return new fr(str2, new Object[] { paramsv.c_(), this.p.c_(), ((add)localObject).E() });
/*    */     }
/* 33 */     return new fr(str1, new Object[] { paramsv.c_(), this.p.c_() });
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean r()
/*    */   {
/* 39 */     return (this.p != null) && ((this.p instanceof sv)) && (!(this.p instanceof yz));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */