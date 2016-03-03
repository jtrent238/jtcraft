/*    */ public class bie
/*    */   extends bhr
/*    */ {
/*    */   bix a;
/*    */   bix b;
/*    */   bix c;
/*    */   bix d;
/*    */   
/*    */   public bie(int paramInt)
/*    */   {
/* 11 */     this.a = new bix(this, 0, paramInt);
/* 12 */     this.a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
/* 13 */     if (paramInt > 0) {
/* 14 */       this.a = new bix(this, 0, paramInt);
/* 15 */       this.a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
/*    */       
/* 17 */       this.b = new bix(this, 32, 0);
/* 18 */       this.b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
/*    */       
/* 20 */       this.c = new bix(this, 32, 4);
/* 21 */       this.c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
/*    */       
/* 23 */       this.d = new bix(this, 32, 8);
/* 24 */       this.d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 30 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 32 */     this.a.a(paramFloat6);
/* 33 */     if (this.b != null) {
/* 34 */       this.b.a(paramFloat6);
/* 35 */       this.c.a(paramFloat6);
/* 36 */       this.d.a(paramFloat6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */