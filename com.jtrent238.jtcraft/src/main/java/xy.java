/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xy
/*    */   extends yn
/*    */ {
/*    */   public xy(ahb paramahb)
/*    */   {
/* 11 */     super(paramahb);
/* 12 */     a(0.7F, 0.5F);
/*    */   }
/*    */   
/*    */   protected void aD()
/*    */   {
/* 17 */     super.aD();
/*    */     
/* 19 */     a(yj.a).a(12.0D);
/*    */   }
/*    */   
/*    */   public boolean n(sa paramsa)
/*    */   {
/* 24 */     if (super.n(paramsa))
/*    */     {
/* 26 */       if ((paramsa instanceof sv)) {
/* 27 */         int i = 0;
/* 28 */         if (this.o.r == rd.c) {
/* 29 */           i = 7;
/* 30 */         } else if (this.o.r == rd.d) {
/* 31 */           i = 15;
/*    */         }
/*    */         
/* 34 */         if (i > 0) {
/* 35 */           ((sv)paramsa).c(new rw(rv.u.H, i * 20, 0));
/*    */         }
/*    */       }
/*    */       
/* 39 */       return true;
/*    */     }
/* 41 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public sy a(sy paramsy)
/*    */   {
/* 47 */     return paramsy;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */