/*    */ 
/*    */ 
/*    */ 
/*    */ public class ve
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private vy b;
/*    */   
/*    */   public ve(td paramtd)
/*    */   {
/* 12 */     this.a = paramtd;
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 17 */     if (this.a.o.w()) return false;
/* 18 */     vz localvz = this.a.o.A.a(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u), 16);
/* 19 */     if (localvz == null) return false;
/* 20 */     this.b = localvz.b(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u));
/* 21 */     if (this.b == null) return false;
/* 22 */     return this.b.c(qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u)) < 2.25D;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 27 */     if (this.a.o.w()) return false;
/* 28 */     return (!this.b.g) && (this.b.a(qh.c(this.a.s), qh.c(this.a.u)));
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 33 */     this.a.m().b(false);
/* 34 */     this.a.m().c(false);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 39 */     this.a.m().b(true);
/* 40 */     this.a.m().c(true);
/* 41 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 46 */     this.b.e();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */