/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhe
/*    */   extends bhr
/*    */ {
/*  8 */   public bix[] a = new bix[5];
/*    */   
/*    */   public bhe() {
/* 11 */     this.a[0] = new bix(this, 0, 8);
/* 12 */     this.a[1] = new bix(this, 0, 0);
/* 13 */     this.a[2] = new bix(this, 0, 0);
/* 14 */     this.a[3] = new bix(this, 0, 0);
/* 15 */     this.a[4] = new bix(this, 0, 0);
/*    */     
/* 17 */     int i = 24;
/* 18 */     int j = 6;
/* 19 */     int k = 20;
/* 20 */     int m = 4;
/*    */     
/* 22 */     this.a[0].a(-i / 2, -k / 2 + 2, -3.0F, i, k - 4, 4, 0.0F);
/* 23 */     this.a[0].a(0.0F, m, 0.0F);
/*    */     
/* 25 */     this.a[1].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 26 */     this.a[1].a(-i / 2 + 1, m, 0.0F);
/*    */     
/* 28 */     this.a[2].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 29 */     this.a[2].a(i / 2 - 1, m, 0.0F);
/*    */     
/* 31 */     this.a[3].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 32 */     this.a[3].a(0.0F, m, -k / 2 + 1);
/*    */     
/* 34 */     this.a[4].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 35 */     this.a[4].a(0.0F, m, k / 2 - 1);
/*    */     
/* 37 */     this.a[0].f = 1.5707964F;
/* 38 */     this.a[1].g = 4.712389F;
/* 39 */     this.a[2].g = 1.5707964F;
/* 40 */     this.a[3].g = 3.1415927F;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 45 */     for (int i = 0; i < 5; i++) {
/* 46 */       this.a[i].a(paramFloat6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */