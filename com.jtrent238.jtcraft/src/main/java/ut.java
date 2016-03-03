/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ut
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public ut(td paramtd, double paramDouble)
/*    */   {
/* 16 */     this.a = paramtd;
/* 17 */     this.e = paramDouble;
/* 18 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 23 */     if (this.a.bU()) return false;
/* 24 */     r localr = this.a.bV();
/* 25 */     azw localazw = vx.a(this.a, 16, 7, azw.a(localr.a, localr.b, localr.c));
/* 26 */     if (localazw == null) return false;
/* 27 */     this.b = localazw.a;
/* 28 */     this.c = localazw.b;
/* 29 */     this.d = localazw.c;
/* 30 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 35 */     return !this.a.m().g();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 40 */     this.a.m().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */