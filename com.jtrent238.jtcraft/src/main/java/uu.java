/*    */ 
/*    */ 
/*    */ 
/*    */ public class uu
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private sv b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private double f;
/*    */   private float g;
/*    */   
/*    */   public uu(td paramtd, double paramDouble, float paramFloat)
/*    */   {
/* 17 */     this.a = paramtd;
/* 18 */     this.f = paramDouble;
/* 19 */     this.g = paramFloat;
/* 20 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 25 */     this.b = this.a.o();
/* 26 */     if (this.b == null) return false;
/* 27 */     if (this.b.f(this.a) > this.g * this.g) return false;
/* 28 */     azw localazw = vx.a(this.a, 16, 7, azw.a(this.b.s, this.b.t, this.b.u));
/* 29 */     if (localazw == null) return false;
/* 30 */     this.c = localazw.a;
/* 31 */     this.d = localazw.b;
/* 32 */     this.e = localazw.c;
/* 33 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 38 */     return (!this.a.m().g()) && (this.b.Z()) && (this.b.f(this.a) < this.g * this.g);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 43 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 48 */     this.a.m().a(this.c, this.d, this.e, this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */