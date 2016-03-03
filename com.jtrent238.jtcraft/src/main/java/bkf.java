/*    */ import java.util.Random;
/*    */ 
/*    */ public class bkf
/*    */   extends bkm
/*    */ {
/*    */   private float a;
/*    */   
/*    */   public bkf(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 10 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 11 */     this.v = (this.v * 0.009999999776482582D + paramDouble4);
/* 12 */     this.w = (this.w * 0.009999999776482582D + paramDouble5);
/* 13 */     this.x = (this.x * 0.009999999776482582D + paramDouble6);
/* 14 */     paramDouble1 += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.05F;
/* 15 */     paramDouble2 += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.05F;
/* 16 */     paramDouble3 += (this.Z.nextFloat() - this.Z.nextFloat()) * 0.05F;
/*    */     
/* 18 */     this.a = this.h;
/* 19 */     this.at = (this.au = this.av = 1.0F);
/*    */     
/* 21 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4);
/* 22 */     this.X = true;
/* 23 */     k(48);
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 28 */     float f = (this.f + paramFloat1) / this.g;
/* 29 */     this.h = (this.a * (1.0F - f * f * 0.5F));
/* 30 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 35 */     float f = (this.f + paramFloat) / this.g;
/* 36 */     if (f < 0.0F) f = 0.0F;
/* 37 */     if (f > 1.0F) f = 1.0F;
/* 38 */     int i = super.c(paramFloat);
/*    */     
/* 40 */     int j = i & 0xFF;
/* 41 */     int k = i >> 16 & 0xFF;
/* 42 */     j += (int)(f * 15.0F * 16.0F);
/* 43 */     if (j > 240) j = 240;
/* 44 */     return j | k << 16;
/*    */   }
/*    */   
/*    */   public float d(float paramFloat)
/*    */   {
/* 49 */     float f1 = (this.f + paramFloat) / this.g;
/* 50 */     if (f1 < 0.0F) f1 = 0.0F;
/* 51 */     if (f1 > 1.0F) f1 = 1.0F;
/* 52 */     float f2 = super.d(paramFloat);
/*    */     
/* 54 */     return f2 * f1 + (1.0F - f1);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 59 */     this.p = this.s;
/* 60 */     this.q = this.t;
/* 61 */     this.r = this.u;
/*    */     
/* 63 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 65 */     d(this.v, this.w, this.x);
/* 66 */     this.v *= 0.9599999785423279D;
/* 67 */     this.w *= 0.9599999785423279D;
/* 68 */     this.x *= 0.9599999785423279D;
/*    */     
/* 70 */     if (this.D) {
/* 71 */       this.v *= 0.699999988079071D;
/* 72 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */