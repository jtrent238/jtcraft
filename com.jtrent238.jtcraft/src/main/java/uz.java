/*    */ 
/*    */ 
/*    */ public class uz
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public uz(td paramtd, double paramDouble)
/*    */   {
/* 14 */     this.a = paramtd;
/* 15 */     this.b = paramDouble;
/* 16 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 21 */     if ((this.a.aJ() == null) && (!this.a.al())) return false;
/* 22 */     azw localazw = vx.a(this.a, 5, 4);
/* 23 */     if (localazw == null) return false;
/* 24 */     this.c = localazw.a;
/* 25 */     this.d = localazw.b;
/* 26 */     this.e = localazw.c;
/* 27 */     return true;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 32 */     this.a.m().a(this.c, this.d, this.e, this.b);
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 37 */     return !this.a.m().g();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */