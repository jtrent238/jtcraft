/*    */ 
/*    */ public class vs
/*    */   extends vu
/*    */ {
/*    */   tg a;
/*    */   sv b;
/*    */   private int e;
/*    */   
/*    */   public vs(tg paramtg)
/*    */   {
/* 11 */     super(paramtg, false);
/* 12 */     this.a = paramtg;
/* 13 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 18 */     if (!this.a.bZ()) return false;
/* 19 */     sv localsv = this.a.cb();
/* 20 */     if (localsv == null) return false;
/* 21 */     this.b = localsv.aJ();
/* 22 */     int i = localsv.aK();
/* 23 */     return (i != this.e) && (a(this.b, false)) && (this.a.a(this.b, localsv));
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 28 */     this.c.d(this.b);
/*    */     
/* 30 */     sv localsv = this.a.cb();
/* 31 */     if (localsv != null) {
/* 32 */       this.e = localsv.aK();
/*    */     }
/*    */     
/* 35 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */