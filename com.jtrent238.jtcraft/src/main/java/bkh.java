/*    */ 
/*    */ 
/*    */ public class bkh
/*    */   extends bkm
/*    */ {
/*    */   float a;
/*    */   
/*    */   public bkh(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 10 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.0F);
/*    */   }
/*    */   
/*    */   public bkh(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat) {
/* 14 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 15 */     this.v *= 0.009999999776482582D;
/* 16 */     this.w *= 0.009999999776482582D;
/* 17 */     this.x *= 0.009999999776482582D;
/* 18 */     this.w += 0.1D;
/*    */     
/* 20 */     this.h *= 0.75F;
/* 21 */     this.h *= paramFloat;
/* 22 */     this.a = this.h;
/*    */     
/* 24 */     this.g = 16;
/* 25 */     this.X = false;
/*    */     
/* 27 */     k(80);
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 32 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 33 */     if (f < 0.0F) f = 0.0F;
/* 34 */     if (f > 1.0F) { f = 1.0F;
/*    */     }
/* 36 */     this.h = (this.a * f);
/* 37 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 42 */     this.p = this.s;
/* 43 */     this.q = this.t;
/* 44 */     this.r = this.u;
/*    */     
/* 46 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 48 */     d(this.v, this.w, this.x);
/* 49 */     if (this.t == this.q) {
/* 50 */       this.v *= 1.1D;
/* 51 */       this.x *= 1.1D;
/*    */     }
/* 53 */     this.v *= 0.8600000143051147D;
/* 54 */     this.w *= 0.8600000143051147D;
/* 55 */     this.x *= 0.8600000143051147D;
/*    */     
/* 57 */     if (this.D) {
/* 58 */       this.v *= 0.699999988079071D;
/* 59 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */