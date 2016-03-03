/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bic
/*    */   extends bip
/*    */ {
/*    */   public bic()
/*    */   {
/* 10 */     this(0.0F);
/*    */   }
/*    */   
/*    */   public bic(float paramFloat) {
/* 14 */     super(paramFloat, 0.0F, 64, 32);
/* 15 */     this.f = new bix(this, 40, 16);
/* 16 */     this.f.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/* 17 */     this.f.a(-5.0F, 2.0F, 0.0F);
/*    */     
/* 19 */     this.g = new bix(this, 40, 16);
/* 20 */     this.g.i = true;
/* 21 */     this.g.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/* 22 */     this.g.a(5.0F, 2.0F, 0.0F);
/*    */     
/* 24 */     this.h = new bix(this, 0, 16);
/* 25 */     this.h.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
/* 26 */     this.h.a(-2.0F, 12.0F, 0.0F);
/*    */     
/* 28 */     this.i = new bix(this, 0, 16);
/* 29 */     this.i.i = true;
/* 30 */     this.i.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
/* 31 */     this.i.a(2.0F, 12.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 36 */     this.o = (((yl)paramsv).cb() == 1);
/* 37 */     super.a(paramsv, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 42 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */