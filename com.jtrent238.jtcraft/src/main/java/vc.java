/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vc
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   
/*    */   public vc(td paramtd, double paramDouble)
/*    */   {
/* 16 */     this.a = paramtd;
/* 17 */     this.e = paramDouble;
/* 18 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 23 */     if (this.a.aN() >= 100) return false;
/* 24 */     if (this.a.aI().nextInt(120) != 0) { return false;
/*    */     }
/* 26 */     azw localazw = vx.a(this.a, 10, 7);
/* 27 */     if (localazw == null) return false;
/* 28 */     this.b = localazw.a;
/* 29 */     this.c = localazw.b;
/* 30 */     this.d = localazw.c;
/* 31 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 36 */     return !this.a.m().g();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 41 */     this.a.m().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */