/*    */ 
/*    */ 
/*    */ public class bip
/*    */   extends bhm
/*    */ {
/*    */   public bip()
/*    */   {
/*  8 */     this(0.0F, false);
/*    */   }
/*    */   
/*    */   protected bip(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/* 12 */     super(paramFloat1, paramFloat2, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public bip(float paramFloat, boolean paramBoolean) {
/* 16 */     super(paramFloat, 0.0F, 64, paramBoolean ? 32 : 64);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 21 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 23 */     float f1 = qh.a(this.p * 3.1415927F);
/* 24 */     float f2 = qh.a((1.0F - (1.0F - this.p) * (1.0F - this.p)) * 3.1415927F);
/* 25 */     this.f.h = 0.0F;
/* 26 */     this.g.h = 0.0F;
/* 27 */     this.f.g = (-(0.1F - f1 * 0.6F));
/* 28 */     this.g.g = (0.1F - f1 * 0.6F);
/* 29 */     this.f.f = -1.5707964F;
/* 30 */     this.g.f = -1.5707964F;
/* 31 */     this.f.f -= f1 * 1.2F - f2 * 0.4F;
/* 32 */     this.g.f -= f1 * 1.2F - f2 * 0.4F;
/*    */     
/* 34 */     this.f.h += qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 35 */     this.g.h -= qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 36 */     this.f.f += qh.a(paramFloat3 * 0.067F) * 0.05F;
/* 37 */     this.g.f -= qh.a(paramFloat3 * 0.067F) * 0.05F;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */