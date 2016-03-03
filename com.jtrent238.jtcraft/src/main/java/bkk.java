/*    */ import java.util.Random;
/*    */ 
/*    */ public class bkk
/*    */   extends bkm
/*    */ {
/*    */   private float a;
/*    */   
/*    */   public bkk(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 10 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 11 */     this.v *= 0.800000011920929D;
/* 12 */     this.w *= 0.800000011920929D;
/* 13 */     this.x *= 0.800000011920929D;
/* 14 */     this.w = (this.Z.nextFloat() * 0.4F + 0.05F);
/*    */     
/* 16 */     this.at = (this.au = this.av = 1.0F);
/* 17 */     this.h *= (this.Z.nextFloat() * 2.0F + 0.2F);
/* 18 */     this.a = this.h;
/*    */     
/* 20 */     this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/* 21 */     this.X = false;
/* 22 */     k(49);
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 27 */     float f = (this.f + paramFloat) / this.g;
/* 28 */     if (f < 0.0F) f = 0.0F;
/* 29 */     if (f > 1.0F) f = 1.0F;
/* 30 */     int i = super.c(paramFloat);
/*    */     
/* 32 */     int j = 240;
/* 33 */     int k = i >> 16 & 0xFF;
/* 34 */     return j | k << 16;
/*    */   }
/*    */   
/*    */   public float d(float paramFloat)
/*    */   {
/* 39 */     return 1.0F;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 44 */     float f = (this.f + paramFloat1) / this.g;
/* 45 */     this.h = (this.a * (1.0F - f * f));
/* 46 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 51 */     this.p = this.s;
/* 52 */     this.q = this.t;
/* 53 */     this.r = this.u;
/*    */     
/* 55 */     if (this.f++ >= this.g) B();
/* 56 */     float f = this.f / this.g;
/* 57 */     if (this.Z.nextFloat() > f) { this.o.a("smoke", this.s, this.t, this.u, this.v, this.w, this.x);
/*    */     }
/* 59 */     this.w -= 0.03D;
/* 60 */     d(this.v, this.w, this.x);
/* 61 */     this.v *= 0.9990000128746033D;
/* 62 */     this.w *= 0.9990000128746033D;
/* 63 */     this.x *= 0.9990000128746033D;
/*    */     
/* 65 */     if (this.D) {
/* 66 */       this.v *= 0.699999988079071D;
/* 67 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */