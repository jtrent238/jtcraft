/*    */ 
/*    */ 
/*    */ 
/*    */ public class vi
/*    */   extends ui
/*    */ {
/*    */   xz a;
/*    */   sv b;
/*    */   
/*    */   public vi(xz paramxz)
/*    */   {
/* 12 */     this.a = paramxz;
/* 13 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 18 */     sv localsv = this.a.o();
/* 19 */     return (this.a.cb() > 0) || ((localsv != null) && (this.a.f(localsv) < 9.0D));
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 24 */     this.a.m().h();
/* 25 */     this.b = this.a.o();
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 30 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 35 */     if (this.b == null) {
/* 36 */       this.a.a(-1);
/* 37 */       return;
/*    */     }
/*    */     
/* 40 */     if (this.a.f(this.b) > 49.0D) {
/* 41 */       this.a.a(-1);
/* 42 */       return;
/*    */     }
/*    */     
/* 45 */     if (!this.a.n().a(this.b)) {
/* 46 */       this.a.a(-1);
/* 47 */       return;
/*    */     }
/*    */     
/* 50 */     this.a.a(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */