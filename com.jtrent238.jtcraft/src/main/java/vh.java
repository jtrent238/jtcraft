/*    */ 
/*    */ 
/*    */ 
/*    */ public class vh
/*    */   extends ui
/*    */ {
/*    */   private tg a;
/*    */   private boolean b;
/*    */   
/*    */   public vh(tg paramtg)
/*    */   {
/* 12 */     this.a = paramtg;
/* 13 */     a(5);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 18 */     if (!this.a.bZ()) return false;
/* 19 */     if (this.a.M()) return false;
/* 20 */     if (!this.a.D) { return false;
/*    */     }
/* 22 */     sv localsv = this.a.cb();
/* 23 */     if (localsv == null) { return true;
/*    */     }
/* 25 */     if ((this.a.f(localsv) < 144.0D) && (localsv.aJ() != null)) {
/* 26 */       return false;
/*    */     }
/* 28 */     return this.b;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 33 */     this.a.m().h();
/* 34 */     this.a.k(true);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 39 */     this.a.k(false);
/*    */   }
/*    */   
/*    */   public void a(boolean paramBoolean) {
/* 43 */     this.b = paramBoolean;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */