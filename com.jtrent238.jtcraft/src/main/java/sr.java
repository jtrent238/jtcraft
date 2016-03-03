/*    */ 
/*    */ 
/*    */ public abstract class sr
/*    */   extends sw
/*    */ {
/*    */   public sr(ahb paramahb)
/*    */   {
/*  8 */     super(paramahb);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected void b(float paramFloat) {}
/*    */   
/*    */ 
/*    */ 
/*    */   protected void a(double paramDouble, boolean paramBoolean) {}
/*    */   
/*    */ 
/*    */ 
/*    */   public void e(float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     if (M()) {
/* 24 */       a(paramFloat1, paramFloat2, 0.02F);
/* 25 */       d(this.v, this.w, this.x);
/*    */       
/* 27 */       this.v *= 0.800000011920929D;
/* 28 */       this.w *= 0.800000011920929D;
/* 29 */       this.x *= 0.800000011920929D;
/* 30 */     } else if (P()) {
/* 31 */       a(paramFloat1, paramFloat2, 0.02F);
/* 32 */       d(this.v, this.w, this.x);
/* 33 */       this.v *= 0.5D;
/* 34 */       this.w *= 0.5D;
/* 35 */       this.x *= 0.5D;
/*    */     } else {
/* 37 */       float f1 = 0.91F;
/* 38 */       if (this.D) {
/* 39 */         f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
/*    */       }
/*    */       
/* 42 */       float f2 = 0.16277136F / (f1 * f1 * f1);
/* 43 */       a(paramFloat1, paramFloat2, this.D ? 0.1F * f2 : 0.02F);
/*    */       
/* 45 */       f1 = 0.91F;
/* 46 */       if (this.D) {
/* 47 */         f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.91F;
/*    */       }
/*    */       
/* 50 */       d(this.v, this.w, this.x);
/*    */       
/* 52 */       this.v *= f1;
/* 53 */       this.w *= f1;
/* 54 */       this.x *= f1;
/*    */     }
/* 56 */     this.aE = this.aF;
/* 57 */     double d1 = this.s - this.p;
/* 58 */     double d2 = this.u - this.r;
/* 59 */     float f3 = qh.a(d1 * d1 + d2 * d2) * 4.0F;
/* 60 */     if (f3 > 1.0F) f3 = 1.0F;
/* 61 */     this.aF += (f3 - this.aF) * 0.4F;
/* 62 */     this.aG += this.aF;
/*    */   }
/*    */   
/*    */   public boolean h_()
/*    */   {
/* 67 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */