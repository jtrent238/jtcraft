/*    */ public class bjx
/*    */   extends bkm
/*    */ {
/*    */   float a;
/*    */   
/*    */   public bjx(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  8 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, 1.0F);
/*    */   }
/*    */   
/*    */ 
/*    */   public bjx(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, float paramFloat)
/*    */   {
/* 14 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 15 */     this.v *= 0.10000000149011612D;
/* 16 */     this.w *= 0.10000000149011612D;
/* 17 */     this.x *= 0.10000000149011612D;
/* 18 */     this.v += paramDouble4 * 0.4D;
/* 19 */     this.w += paramDouble5 * 0.4D;
/* 20 */     this.x += paramDouble6 * 0.4D;
/*    */     
/* 22 */     this.at = (this.au = this.av = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D));
/* 23 */     this.h *= 0.75F;
/* 24 */     this.h *= paramFloat;
/* 25 */     this.a = this.h;
/*    */     
/* 27 */     this.g = ((int)(6.0D / (Math.random() * 0.8D + 0.6D)));
/* 28 */     this.g = ((int)(this.g * paramFloat));
/* 29 */     this.X = false;
/*    */     
/* 31 */     k(65);
/* 32 */     h();
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 37 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 38 */     if (f < 0.0F) f = 0.0F;
/* 39 */     if (f > 1.0F) { f = 1.0F;
/*    */     }
/* 41 */     this.h = (this.a * f);
/* 42 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 47 */     this.p = this.s;
/* 48 */     this.q = this.t;
/* 49 */     this.r = this.u;
/*    */     
/* 51 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 53 */     d(this.v, this.w, this.x);
/* 54 */     this.au = ((float)(this.au * 0.96D));
/* 55 */     this.av = ((float)(this.av * 0.9D));
/*    */     
/* 57 */     this.v *= 0.699999988079071D;
/* 58 */     this.w *= 0.699999988079071D;
/* 59 */     this.x *= 0.699999988079071D;
/* 60 */     this.w -= 0.019999999552965164D;
/*    */     
/* 62 */     if (this.D) {
/* 63 */       this.v *= 0.699999988079071D;
/* 64 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */