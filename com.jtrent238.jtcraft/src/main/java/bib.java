/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bib
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   
/*    */   public bib()
/*    */   {
/* 12 */     this(0, 35, 64, 64);
/*    */   }
/*    */   
/*    */   public bib(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 16 */     this.t = paramInt3;
/* 17 */     this.u = paramInt4;
/* 18 */     this.a = new bix(this, paramInt1, paramInt2);
/* 19 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
/* 20 */     this.a.a(0.0F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 25 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 27 */     this.a.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 32 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 34 */     this.a.g = (paramFloat4 / 57.295776F);
/* 35 */     this.a.f = (paramFloat5 / 57.295776F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */