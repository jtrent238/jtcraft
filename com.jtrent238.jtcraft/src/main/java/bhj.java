/*    */ public class bhj extends bhr {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/*    */   public bix g;
/*    */   
/*    */   public bhj() {
/* 11 */     this(0.0F);
/*    */   }
/*    */   
/*    */   public bhj(float paramFloat) {
/* 15 */     int i = 4;
/*    */     
/* 17 */     this.a = new bix(this, 0, 0);
/* 18 */     this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat);
/* 19 */     this.a.a(0.0F, i, 0.0F);
/*    */     
/* 21 */     this.b = new bix(this, 32, 0);
/* 22 */     this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat + 0.5F);
/* 23 */     this.b.a(0.0F, i, 0.0F);
/*    */     
/* 25 */     this.c = new bix(this, 16, 16);
/* 26 */     this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat);
/* 27 */     this.c.a(0.0F, i, 0.0F);
/*    */     
/* 29 */     this.d = new bix(this, 0, 16);
/* 30 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 31 */     this.d.a(-2.0F, 12 + i, 4.0F);
/*    */     
/* 33 */     this.e = new bix(this, 0, 16);
/* 34 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 35 */     this.e.a(2.0F, 12 + i, 4.0F);
/*    */     
/* 37 */     this.f = new bix(this, 0, 16);
/* 38 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 39 */     this.f.a(-2.0F, 12 + i, -4.0F);
/*    */     
/* 41 */     this.g = new bix(this, 0, 16);
/* 42 */     this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, paramFloat);
/* 43 */     this.g.a(2.0F, 12 + i, -4.0F);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 48 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 50 */     this.a.a(paramFloat6);
/* 51 */     this.c.a(paramFloat6);
/* 52 */     this.d.a(paramFloat6);
/* 53 */     this.e.a(paramFloat6);
/* 54 */     this.f.a(paramFloat6);
/* 55 */     this.g.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 60 */     this.a.g = (paramFloat4 / 57.295776F);
/* 61 */     this.a.f = (paramFloat5 / 57.295776F);
/*    */     
/* 63 */     this.d.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 64 */     this.e.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 65 */     this.f.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 66 */     this.g.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */