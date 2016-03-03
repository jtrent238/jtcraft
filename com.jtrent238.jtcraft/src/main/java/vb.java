/*    */ import java.util.Random;
/*    */ 
/*    */ public class vb
/*    */   extends ui
/*    */ {
/*    */   private sw a;
/*    */   private double b;
/*    */   private double c;
/*    */   private int d;
/*    */   
/*    */   public vb(sw paramsw)
/*    */   {
/* 13 */     this.a = paramsw;
/* 14 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 19 */     return this.a.aI().nextFloat() < 0.02F;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 24 */     return this.d >= 0;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 29 */     double d1 = 6.283185307179586D * this.a.aI().nextDouble();
/* 30 */     this.b = Math.cos(d1);
/* 31 */     this.c = Math.sin(d1);
/* 32 */     this.d = (20 + this.a.aI().nextInt(20));
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 37 */     this.d -= 1;
/* 38 */     this.a.j().a(this.a.s + this.b, this.a.t + this.a.g(), this.a.u + this.c, 10.0F, this.a.x());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */