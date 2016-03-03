/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bkx
/*    */   extends bkm
/*    */ {
/*  8 */   private int a = 128;
/*    */   
/*    */   public bkx(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 11 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 12 */     this.w *= 0.20000000298023224D;
/* 13 */     if ((paramDouble4 == 0.0D) && (paramDouble6 == 0.0D)) {
/* 14 */       this.v *= 0.10000000149011612D;
/* 15 */       this.x *= 0.10000000149011612D;
/*    */     }
/*    */     
/* 18 */     this.h *= 0.75F;
/*    */     
/* 20 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/* 21 */     this.X = false;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 26 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 27 */     if (f < 0.0F) f = 0.0F;
/* 28 */     if (f > 1.0F) { f = 1.0F;
/*    */     }
/* 30 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 35 */     this.p = this.s;
/* 36 */     this.q = this.t;
/* 37 */     this.r = this.u;
/*    */     
/* 39 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 41 */     k(this.a + (7 - this.f * 8 / this.g));
/*    */     
/* 43 */     this.w += 0.004D;
/* 44 */     d(this.v, this.w, this.x);
/* 45 */     if (this.t == this.q) {
/* 46 */       this.v *= 1.1D;
/* 47 */       this.x *= 1.1D;
/*    */     }
/* 49 */     this.v *= 0.9599999785423279D;
/* 50 */     this.w *= 0.9599999785423279D;
/* 51 */     this.x *= 0.9599999785423279D;
/*    */     
/* 53 */     if (this.D) {
/* 54 */       this.v *= 0.699999988079071D;
/* 55 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(int paramInt) {
/* 60 */     this.a = paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */