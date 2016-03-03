/*    */ 
/*    */ 
/*    */ 
/*    */ public class bil
/*    */   extends bhm
/*    */ {
/*    */   public bil()
/*    */   {
/*  9 */     this(0.0F, 0.0F, false);
/*    */   }
/*    */   
/*    */   public bil(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/* 13 */     super(paramFloat1, 0.0F, 64, paramBoolean ? 32 : 64);
/*    */     
/* 15 */     if (paramBoolean) {
/* 16 */       this.c = new bix(this, 0, 0);
/* 17 */       this.c.a(-4.0F, -10.0F, -4.0F, 8, 6, 8, paramFloat1);
/* 18 */       this.c.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*    */     } else {
/* 20 */       this.c = new bix(this);
/* 21 */       this.c.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 22 */       this.c.a(0, 32).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, paramFloat1);
/* 23 */       this.c.a(24, 32).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, paramFloat1);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 29 */     return 10;
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 34 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 36 */     float f1 = qh.a(this.p * 3.1415927F);
/* 37 */     float f2 = qh.a((1.0F - (1.0F - this.p) * (1.0F - this.p)) * 3.1415927F);
/* 38 */     this.f.h = 0.0F;
/* 39 */     this.g.h = 0.0F;
/* 40 */     this.f.g = (-(0.1F - f1 * 0.6F));
/* 41 */     this.g.g = (0.1F - f1 * 0.6F);
/* 42 */     this.f.f = -1.5707964F;
/* 43 */     this.g.f = -1.5707964F;
/* 44 */     this.f.f -= f1 * 1.2F - f2 * 0.4F;
/* 45 */     this.g.f -= f1 * 1.2F - f2 * 0.4F;
/*    */     
/* 47 */     this.f.h += qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 48 */     this.g.h -= qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 49 */     this.f.f += qh.a(paramFloat3 * 0.067F) * 0.05F;
/* 50 */     this.g.f -= qh.a(paramFloat3 * 0.067F) * 0.05F;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */