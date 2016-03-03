/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rq
/*    */   extends rp
/*    */ {
/*    */   private sa q;
/*    */   
/*    */   public rq(String paramString, sa paramsa1, sa paramsa2)
/*    */   {
/* 14 */     super(paramString, paramsa1);
/* 15 */     this.q = paramsa2;
/*    */   }
/*    */   
/*    */   public sa i()
/*    */   {
/* 20 */     return this.p;
/*    */   }
/*    */   
/*    */   public sa j()
/*    */   {
/* 25 */     return this.q;
/*    */   }
/*    */   
/*    */   public fj b(sv paramsv)
/*    */   {
/* 30 */     fj localfj = this.q == null ? this.p.c_() : this.q.c_();
/* 31 */     Object localObject = (this.q instanceof sv) ? ((sv)this.q).be() : null;
/* 32 */     String str1 = "death.attack." + this.o;
/* 33 */     String str2 = str1 + ".item";
/*    */     
/* 35 */     if ((localObject != null) && (((add)localObject).u()) && (dd.c(str2))) {
/* 36 */       return new fr(str2, new Object[] { paramsv.c_(), localfj, ((add)localObject).E() });
/*    */     }
/* 38 */     return new fr(str1, new Object[] { paramsv.c_(), localfj });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */