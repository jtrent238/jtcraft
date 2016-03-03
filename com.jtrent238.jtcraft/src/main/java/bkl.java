/*    */ 
/*    */ 
/*    */ 
/*    */ public class bkl
/*    */   extends bkm
/*    */ {
/*    */   float a;
/*    */   
/*    */   public bkl(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 11 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 2.0F);
/*    */   }
/*    */   
/*    */   public bkl(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat) {
/* 15 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 16 */     this.v *= 0.009999999776482582D;
/* 17 */     this.w *= 0.009999999776482582D;
/* 18 */     this.x *= 0.009999999776482582D;
/* 19 */     this.w += 0.2D;
/*    */     
/* 21 */     this.at = (qh.a(((float)paramDouble4 + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
/* 22 */     this.au = (qh.a(((float)paramDouble4 + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
/* 23 */     this.av = (qh.a(((float)paramDouble4 + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
/*    */     
/* 25 */     this.h *= 0.75F;
/* 26 */     this.h *= paramFloat;
/* 27 */     this.a = this.h;
/*    */     
/* 29 */     this.g = 6;
/* 30 */     this.X = false;
/*    */     
/* 32 */     k(64);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 38 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 39 */     if (f < 0.0F) f = 0.0F;
/* 40 */     if (f > 1.0F) { f = 1.0F;
/*    */     }
/* 42 */     this.h = (this.a * f);
/* 43 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 48 */     this.p = this.s;
/* 49 */     this.q = this.t;
/* 50 */     this.r = this.u;
/*    */     
/* 52 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 54 */     d(this.v, this.w, this.x);
/* 55 */     if (this.t == this.q) {
/* 56 */       this.v *= 1.1D;
/* 57 */       this.x *= 1.1D;
/*    */     }
/* 59 */     this.v *= 0.6600000262260437D;
/* 60 */     this.w *= 0.6600000262260437D;
/* 61 */     this.x *= 0.6600000262260437D;
/*    */     
/* 63 */     if (this.D) {
/* 64 */       this.v *= 0.699999988079071D;
/* 65 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */