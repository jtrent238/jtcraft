/*    */ 
/*    */ 
/*    */ public class bku
/*    */   extends bkm
/*    */ {
/*    */   float a;
/*    */   
/*    */   public bku(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 10 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, 1.0F, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public bku(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 14 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 15 */     this.v *= 0.10000000149011612D;
/* 16 */     this.w *= 0.10000000149011612D;
/* 17 */     this.x *= 0.10000000149011612D;
/*    */     
/* 19 */     if (paramFloat2 == 0.0F) {
/* 20 */       paramFloat2 = 1.0F;
/*    */     }
/* 22 */     float f = (float)Math.random() * 0.4F + 0.6F;
/* 23 */     this.at = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat2 * f);
/* 24 */     this.au = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat3 * f);
/* 25 */     this.av = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * paramFloat4 * f);
/* 26 */     this.h *= 0.75F;
/* 27 */     this.h *= paramFloat1;
/* 28 */     this.a = this.h;
/*    */     
/* 30 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 31 */     this.g = ((int)(this.g * paramFloat1));
/* 32 */     this.X = false;
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
/* 53 */     k(7 - this.f * 8 / this.g);
/*    */     
/* 55 */     d(this.v, this.w, this.x);
/* 56 */     if (this.t == this.q) {
/* 57 */       this.v *= 1.1D;
/* 58 */       this.x *= 1.1D;
/*    */     }
/* 60 */     this.v *= 0.9599999785423279D;
/* 61 */     this.w *= 0.9599999785423279D;
/* 62 */     this.x *= 0.9599999785423279D;
/*    */     
/* 64 */     if (this.D) {
/* 65 */       this.v *= 0.699999988079071D;
/* 66 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */