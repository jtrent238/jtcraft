/*    */ import java.util.Random;
/*    */ 
/*    */ public class bkj
/*    */   extends bkm
/*    */ {
/*    */   private int a;
/*    */   private int aB;
/*    */   
/*    */   public bkj(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 11 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12 */     this.aB = 8;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*    */   
/*    */ 
/*    */   public void h()
/*    */   {
/* 22 */     for (int i = 0; i < 6; i++) {
/* 23 */       double d1 = this.s + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0D;
/* 24 */       double d2 = this.t + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0D;
/* 25 */       double d3 = this.u + (this.Z.nextDouble() - this.Z.nextDouble()) * 4.0D;
/* 26 */       this.o.a("largeexplode", d1, d2, d3, this.a / this.aB, 0.0D, 0.0D);
/*    */     }
/* 28 */     this.a += 1;
/* 29 */     if (this.a == this.aB) B();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 34 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */