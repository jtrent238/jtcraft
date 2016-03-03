/*    */ import java.util.Random;
/*    */ 
/*    */ public class bkt extends bkm
/*    */ {
/*    */   private float a;
/*    */   private double aB;
/*    */   private double aC;
/*    */   private double aD;
/*    */   
/*    */   public bkt(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
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
/* 21 */     this.a = (this.h = this.Z.nextFloat() * 0.2F + 0.5F);
/* 22 */     this.at = (this.au = this.av = 1.0F * f);
/* 23 */     this.au *= 0.3F;
/* 24 */     this.at *= 0.9F;
/*    */     
/* 26 */     this.g = ((int)(Math.random() * 10.0D) + 40);
/* 27 */     this.X = true;
/* 28 */     k((int)(Math.random() * 8.0D));
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 33 */     float f = (this.f + paramFloat1) / this.g;
/* 34 */     f = 1.0F - f;
/* 35 */     f *= f;
/* 36 */     f = 1.0F - f;
/* 37 */     this.h = (this.a * f);
/* 38 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 43 */     int i = super.c(paramFloat);
/*    */     
/* 45 */     float f = this.f / this.g;
/* 46 */     f *= f;
/* 47 */     f *= f;
/*    */     
/* 49 */     int j = i & 0xFF;
/* 50 */     int k = i >> 16 & 0xFF;
/* 51 */     k += (int)(f * 15.0F * 16.0F);
/* 52 */     if (k > 240) k = 240;
/* 53 */     return j | k << 16;
/*    */   }
/*    */   
/*    */   public float d(float paramFloat)
/*    */   {
/* 58 */     float f1 = super.d(paramFloat);
/* 59 */     float f2 = this.f / this.g;
/* 60 */     f2 = f2 * f2 * f2 * f2;
/* 61 */     return f1 * (1.0F - f2) + f2;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 66 */     this.p = this.s;
/* 67 */     this.q = this.t;
/* 68 */     this.r = this.u;
/*    */     
/* 70 */     float f1 = this.f / this.g;
/* 71 */     float f2 = f1;
/* 72 */     f1 = -f1 + f1 * f1 * 2.0F;
/* 73 */     f1 = 1.0F - f1;
/*    */     
/* 75 */     this.s = (this.aB + this.v * f1);
/* 76 */     this.t = (this.aC + this.w * f1 + (1.0F - f2));
/* 77 */     this.u = (this.aD + this.x * f1);
/*    */     
/* 79 */     if (this.f++ >= this.g) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */