/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjy
/*    */   extends bkm
/*    */ {
/*    */   private awt a;
/*    */   private int aB;
/*    */   
/*    */   public bjy(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, awt paramawt)
/*    */   {
/* 14 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 15 */     this.v = (this.w = this.x = 0.0D);
/*    */     
/* 17 */     if (paramawt == awt.h) {
/* 18 */       this.at = 0.0F;
/* 19 */       this.au = 0.0F;
/* 20 */       this.av = 1.0F;
/*    */     } else {
/* 22 */       this.at = 1.0F;
/* 23 */       this.au = 0.0F;
/* 24 */       this.av = 0.0F;
/*    */     }
/* 26 */     k(113);
/* 27 */     a(0.01F, 0.01F);
/* 28 */     this.i = 0.06F;
/* 29 */     this.a = paramawt;
/* 30 */     this.aB = 40;
/*    */     
/* 32 */     this.g = ((int)(64.0D / (Math.random() * 0.8D + 0.2D)));
/* 33 */     this.v = (this.w = this.x = 0.0D);
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 38 */     if (this.a == awt.h) return super.c(paramFloat);
/* 39 */     return 257;
/*    */   }
/*    */   
/*    */   public float d(float paramFloat)
/*    */   {
/* 44 */     if (this.a == awt.h) return super.d(paramFloat);
/* 45 */     return 1.0F;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 50 */     this.p = this.s;
/* 51 */     this.q = this.t;
/* 52 */     this.r = this.u;
/*    */     
/* 54 */     if (this.a == awt.h) {
/* 55 */       this.at = 0.2F;
/* 56 */       this.au = 0.3F;
/* 57 */       this.av = 1.0F;
/*    */     } else {
/* 59 */       this.at = 1.0F;
/* 60 */       this.au = (16.0F / (40 - this.aB + 16));
/* 61 */       this.av = (4.0F / (40 - this.aB + 8));
/*    */     }
/*    */     
/* 64 */     this.w -= this.i;
/* 65 */     if (this.aB-- > 0) {
/* 66 */       this.v *= 0.02D;
/* 67 */       this.w *= 0.02D;
/* 68 */       this.x *= 0.02D;
/* 69 */       k(113);
/*    */     } else {
/* 71 */       k(112);
/*    */     }
/* 73 */     d(this.v, this.w, this.x);
/* 74 */     this.v *= 0.9800000190734863D;
/* 75 */     this.w *= 0.9800000190734863D;
/* 76 */     this.x *= 0.9800000190734863D;
/*    */     
/* 78 */     if (this.g-- <= 0) { B();
/*    */     }
/* 80 */     if (this.D) {
/* 81 */       if (this.a == awt.h) {
/* 82 */         B();
/* 83 */         this.o.a("splash", this.s, this.t, this.u, 0.0D, 0.0D, 0.0D);
/*    */       } else {
/* 85 */         k(114);
/*    */       }
/*    */       
/* 88 */       this.v *= 0.699999988079071D;
/* 89 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */     
/* 92 */     awt localawt = this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o();
/* 93 */     if ((localawt.d()) || (localawt.a())) {
/* 94 */       double d = qh.c(this.t) + 1 - alw.b(this.o.e(qh.c(this.s), qh.c(this.t), qh.c(this.u)));
/* 95 */       if (this.t < d) {
/* 96 */         B();
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */