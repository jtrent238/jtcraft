/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhq
/*    */   extends bhr
/*    */ {
/*  8 */   public bix[] a = new bix[7];
/*    */   
/*    */   public bhq() {
/* 11 */     this.a[0] = new bix(this, 0, 10);
/* 12 */     this.a[1] = new bix(this, 0, 0);
/* 13 */     this.a[2] = new bix(this, 0, 0);
/* 14 */     this.a[3] = new bix(this, 0, 0);
/* 15 */     this.a[4] = new bix(this, 0, 0);
/* 16 */     this.a[5] = new bix(this, 44, 10);
/*    */     
/* 18 */     int i = 20;
/* 19 */     int j = 8;
/* 20 */     int k = 16;
/* 21 */     int m = 4;
/*    */     
/* 23 */     this.a[0].a(-i / 2, -k / 2, -1.0F, i, k, 2, 0.0F);
/* 24 */     this.a[0].a(0.0F, m, 0.0F);
/*    */     
/* 26 */     this.a[5].a(-i / 2 + 1, -k / 2 + 1, -1.0F, i - 2, k - 2, 1, 0.0F);
/* 27 */     this.a[5].a(0.0F, m, 0.0F);
/*    */     
/* 29 */     this.a[1].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 30 */     this.a[1].a(-i / 2 + 1, m, 0.0F);
/*    */     
/* 32 */     this.a[2].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 33 */     this.a[2].a(i / 2 - 1, m, 0.0F);
/*    */     
/* 35 */     this.a[3].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 36 */     this.a[3].a(0.0F, m, -k / 2 + 1);
/*    */     
/* 38 */     this.a[4].a(-i / 2 + 2, -j - 1, -1.0F, i - 4, j, 2, 0.0F);
/* 39 */     this.a[4].a(0.0F, m, k / 2 - 1);
/*    */     
/* 41 */     this.a[0].f = 1.5707964F;
/* 42 */     this.a[1].g = 4.712389F;
/* 43 */     this.a[2].g = 1.5707964F;
/* 44 */     this.a[3].g = 3.1415927F;
/* 45 */     this.a[5].f = -1.5707964F;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 50 */     this.a[5].d = (4.0F - paramFloat3);
/* 51 */     for (int i = 0; i < 6; i++) {
/* 52 */       this.a[i].a(paramFloat6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */