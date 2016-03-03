/*    */ import java.util.Random;
/*    */ 
/*    */ public class bla extends bkm
/*    */ {
/*    */   public bla(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  7 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */     
/*  9 */     float f = this.Z.nextFloat() * 0.1F + 0.2F;
/* 10 */     this.at = f;
/* 11 */     this.au = f;
/* 12 */     this.av = f;
/* 13 */     k(0);
/* 14 */     a(0.02F, 0.02F);
/*    */     
/* 16 */     this.h *= (this.Z.nextFloat() * 0.6F + 0.5F);
/*    */     
/* 18 */     this.v *= 0.019999999552965164D;
/* 19 */     this.w *= 0.019999999552965164D;
/* 20 */     this.x *= 0.019999999552965164D;
/*    */     
/* 22 */     this.g = ((int)(20.0D / (Math.random() * 0.8D + 0.2D)));
/* 23 */     this.X = true;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 28 */     this.p = this.s;
/* 29 */     this.q = this.t;
/* 30 */     this.r = this.u;
/*    */     
/* 32 */     d(this.v, this.w, this.x);
/* 33 */     this.v *= 0.99D;
/* 34 */     this.w *= 0.99D;
/* 35 */     this.x *= 0.99D;
/*    */     
/* 37 */     if (this.g-- <= 0) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */