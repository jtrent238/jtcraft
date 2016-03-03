/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bho
/*    */   extends bhr
/*    */ {
/*  9 */   bix[] a = new bix[8];
/*    */   bix b;
/*    */   
/*    */   public bho()
/*    */   {
/* 14 */     for (int i = 0; i < this.a.length; i++) {
/* 15 */       int j = 0;
/* 16 */       int k = i;
/* 17 */       if (i == 2) {
/* 18 */         j = 24;
/* 19 */         k = 10;
/* 20 */       } else if (i == 3) {
/* 21 */         j = 24;
/* 22 */         k = 19;
/*    */       }
/* 24 */       this.a[i] = new bix(this, j, k);
/* 25 */       this.a[i].a(-4.0F, 16 + i, -4.0F, 8, 1, 8);
/*    */     }
/*    */     
/* 28 */     this.b = new bix(this, 0, 16);
/* 29 */     this.b.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 38 */     yf localyf = (yf)paramsv;
/*    */     
/* 40 */     float f = localyf.bm + (localyf.i - localyf.bm) * paramFloat3;
/* 41 */     if (f < 0.0F) {
/* 42 */       f = 0.0F;
/*    */     }
/*    */     
/* 45 */     for (int i = 0; i < this.a.length; i++) {
/* 46 */       this.a[i].d = (-(4 - i) * f * 1.7F);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 52 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 54 */     this.b.a(paramFloat6);
/* 55 */     for (int i = 0; i < this.a.length; i++) {
/* 56 */       this.a[i].a(paramFloat6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */