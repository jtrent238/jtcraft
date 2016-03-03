/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blf
/*    */   extends bkm
/*    */ {
/*    */   public blf(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 11 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 12 */     this.v *= 0.30000001192092896D;
/* 13 */     this.w = ((float)Math.random() * 0.2F + 0.1F);
/* 14 */     this.x *= 0.30000001192092896D;
/*    */     
/* 16 */     this.at = 1.0F;
/* 17 */     this.au = 1.0F;
/* 18 */     this.av = 1.0F;
/* 19 */     k(19 + this.Z.nextInt(4));
/* 20 */     a(0.01F, 0.01F);
/* 21 */     this.i = 0.06F;
/*    */     
/* 23 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 28 */     this.p = this.s;
/* 29 */     this.q = this.t;
/* 30 */     this.r = this.u;
/*    */     
/* 32 */     this.w -= this.i;
/* 33 */     d(this.v, this.w, this.x);
/* 34 */     this.v *= 0.9800000190734863D;
/* 35 */     this.w *= 0.9800000190734863D;
/* 36 */     this.x *= 0.9800000190734863D;
/*    */     
/* 38 */     if (this.g-- <= 0) { B();
/*    */     }
/* 40 */     if (this.D) {
/* 41 */       if (Math.random() < 0.5D) B();
/* 42 */       this.v *= 0.699999988079071D;
/* 43 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */     
/* 46 */     awt localawt = this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o();
/* 47 */     if ((localawt.d()) || (localawt.a())) {
/* 48 */       double d = qh.c(this.t) + 1 - alw.b(this.o.e(qh.c(this.s), qh.c(this.t), qh.c(this.u)));
/* 49 */       if (this.t < d) {
/* 50 */         B();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */