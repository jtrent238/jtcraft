/*    */ import java.util.Random;
/*    */ 
/*    */ public class bjz extends bkm
/*    */ {
/*    */   private float a;
/*    */   private double aB;
/*    */   private double aC;
/*    */   private double aD;
/*    */   
/*    */   public bjz(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 11 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */     
/* 13 */     this.v = paramDouble4;
/* 14 */     this.w = paramDouble5;
/* 15 */     this.x = paramDouble6;
/* 16 */     this.aB = (this.s = paramDouble1);
/* 17 */     this.aC = (this.t = paramDouble2);
/* 18 */     this.aD = (this.u = paramDouble3);
/*    */     
/* 20 */     float f = this.Z.nextFloat() * 0.6F + 0.4F;
/* 21 */     this.a = (this.h = this.Z.nextFloat() * 0.5F + 0.2F);
/* 22 */     this.at = (this.au = this.av = 1.0F * f);
/* 23 */     this.au *= 0.9F;
/* 24 */     this.at *= 0.9F;
/*    */     
/* 26 */     this.g = ((int)(Math.random() * 10.0D) + 30);
/* 27 */     this.X = true;
/* 28 */     k((int)(Math.random() * 26.0D + 1.0D + 224.0D));
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 33 */     int i = super.c(paramFloat);
/*    */     
/* 35 */     float f = this.f / this.g;
/* 36 */     f *= f;
/* 37 */     f *= f;
/*    */     
/* 39 */     int j = i & 0xFF;
/* 40 */     int k = i >> 16 & 0xFF;
/* 41 */     k += (int)(f * 15.0F * 16.0F);
/* 42 */     if (k > 240) k = 240;
/* 43 */     return j | k << 16;
/*    */   }
/*    */   
/*    */   public float d(float paramFloat)
/*    */   {
/* 48 */     float f1 = super.d(paramFloat);
/* 49 */     float f2 = this.f / this.g;
/* 50 */     f2 *= f2;
/* 51 */     f2 *= f2;
/* 52 */     return f1 * (1.0F - f2) + f2;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 57 */     this.p = this.s;
/* 58 */     this.q = this.t;
/* 59 */     this.r = this.u;
/*    */     
/* 61 */     float f1 = this.f / this.g;
/* 62 */     f1 = 1.0F - f1;
/*    */     
/* 64 */     float f2 = 1.0F - f1;
/* 65 */     f2 *= f2;
/* 66 */     f2 *= f2;
/* 67 */     this.s = (this.aB + this.v * f1);
/* 68 */     this.t = (this.aC + this.w * f1 - f2 * 1.2F);
/* 69 */     this.u = (this.aD + this.x * f1);
/*    */     
/* 71 */     if (this.f++ >= this.g) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */