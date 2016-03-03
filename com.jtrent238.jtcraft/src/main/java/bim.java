/*    */ 
/*    */ 
/*    */ 
/*    */ public class bim
/*    */   extends bik
/*    */ {
/*    */   public boolean g;
/*    */   private bix h;
/*    */   private bix i;
/*    */   
/*    */   public bim(float paramFloat)
/*    */   {
/* 13 */     super(paramFloat, 0.0F, 64, 128);
/*    */     
/* 15 */     this.h = new bix(this).b(64, 128);
/* 16 */     this.h.a(0.0F, -2.0F, 0.0F);
/* 17 */     this.h.a(0, 0).a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
/* 18 */     this.f.a(this.h);
/*    */     
/* 20 */     this.i = new bix(this).b(64, 128);
/* 21 */     this.i.a(-5.0F, -10.03125F, -5.0F);
/* 22 */     this.i.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
/* 23 */     this.a.a(this.i);
/*    */     
/* 25 */     bix localbix1 = new bix(this).b(64, 128);
/* 26 */     localbix1.a(1.75F, -4.0F, 2.0F);
/* 27 */     localbix1.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
/* 28 */     localbix1.f = -0.05235988F;
/* 29 */     localbix1.h = 0.02617994F;
/* 30 */     this.i.a(localbix1);
/*    */     
/* 32 */     bix localbix2 = new bix(this).b(64, 128);
/* 33 */     localbix2.a(1.75F, -4.0F, 2.0F);
/* 34 */     localbix2.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
/* 35 */     localbix2.f = -0.10471976F;
/* 36 */     localbix2.h = 0.05235988F;
/* 37 */     localbix1.a(localbix2);
/*    */     
/* 39 */     bix localbix3 = new bix(this).b(64, 128);
/* 40 */     localbix3.a(1.75F, -2.0F, 2.0F);
/* 41 */     localbix3.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
/* 42 */     localbix3.f = -0.20943952F;
/* 43 */     localbix3.h = 0.10471976F;
/* 44 */     localbix2.a(localbix3);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 49 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 51 */     this.f.o = (this.f.p = this.f.q = 0.0F);
/*    */     
/* 53 */     float f = 0.01F * (paramsa.y() % 10);
/* 54 */     this.f.f = (qh.a(paramsa.aa * f) * 4.5F * 3.1415927F / 180.0F);
/* 55 */     this.f.g = 0.0F;
/* 56 */     this.f.h = (qh.b(paramsa.aa * f) * 2.5F * 3.1415927F / 180.0F);
/*    */     
/* 58 */     if (this.g) {
/* 59 */       this.f.f = -0.9F;
/* 60 */       this.f.q = -0.09375F;
/* 61 */       this.f.p = 0.1875F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */