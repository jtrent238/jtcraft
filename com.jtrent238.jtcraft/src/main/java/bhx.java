/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhx
/*    */   extends bhw
/*    */ {
/*    */   private float i;
/*    */   
/*    */   public bhx()
/*    */   {
/* 13 */     super(12, 0.0F);
/*    */     
/* 15 */     this.a = new bix(this, 0, 0);
/* 16 */     this.a.a(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
/* 17 */     this.a.a(0.0F, 6.0F, -8.0F);
/*    */     
/* 19 */     this.b = new bix(this, 28, 8);
/* 20 */     this.b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
/* 21 */     this.b.a(0.0F, 5.0F, 2.0F);
/*    */     
/* 23 */     float f = 0.5F;
/* 24 */     this.c = new bix(this, 0, 16);
/* 25 */     this.c.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 26 */     this.c.a(-3.0F, 12.0F, 7.0F);
/*    */     
/* 28 */     this.d = new bix(this, 0, 16);
/* 29 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 30 */     this.d.a(3.0F, 12.0F, 7.0F);
/*    */     
/* 32 */     this.e = new bix(this, 0, 16);
/* 33 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 34 */     this.e.a(-3.0F, 12.0F, -5.0F);
/*    */     
/* 36 */     this.f = new bix(this, 0, 16);
/* 37 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, f);
/* 38 */     this.f.a(3.0F, 12.0F, -5.0F);
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 43 */     super.a(paramsv, paramFloat1, paramFloat2, paramFloat3);
/*    */     
/* 45 */     this.a.d = (6.0F + ((wp)paramsv).p(paramFloat3) * 9.0F);
/* 46 */     this.i = ((wp)paramsv).q(paramFloat3);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 51 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 53 */     this.a.f = this.i;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */