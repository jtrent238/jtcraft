/*    */ public class bik extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/*    */   
/*    */   public bik(float paramFloat) {
/* 11 */     this(paramFloat, 0.0F, 64, 64);
/*    */   }
/*    */   
/*    */   public bik(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/* 15 */     this.a = new bix(this).b(paramInt1, paramInt2);
/* 16 */     this.a.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 17 */     this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, paramFloat1);
/*    */     
/* 19 */     this.f = new bix(this).b(paramInt1, paramInt2);
/* 20 */     this.f.a(0.0F, paramFloat2 - 2.0F, 0.0F);
/* 21 */     this.f.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, paramFloat1);
/* 22 */     this.a.a(this.f);
/*    */     
/* 24 */     this.b = new bix(this).b(paramInt1, paramInt2);
/* 25 */     this.b.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 26 */     this.b.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, paramFloat1);
/* 27 */     this.b.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, paramFloat1 + 0.5F);
/*    */     
/* 29 */     this.c = new bix(this).b(paramInt1, paramInt2);
/* 30 */     this.c.a(0.0F, 0.0F + paramFloat2 + 2.0F, 0.0F);
/* 31 */     this.c.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, paramFloat1);
/* 32 */     this.c.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, paramFloat1);
/* 33 */     this.c.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, paramFloat1);
/*    */     
/* 35 */     this.d = new bix(this, 0, 22).b(paramInt1, paramInt2);
/* 36 */     this.d.a(-2.0F, 12.0F + paramFloat2, 0.0F);
/* 37 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*    */     
/* 39 */     this.e = new bix(this, 0, 22).b(paramInt1, paramInt2);
/* 40 */     this.e.i = true;
/* 41 */     this.e.a(2.0F, 12.0F + paramFloat2, 0.0F);
/* 42 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 47 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 49 */     this.a.a(paramFloat6);
/* 50 */     this.b.a(paramFloat6);
/* 51 */     this.d.a(paramFloat6);
/* 52 */     this.e.a(paramFloat6);
/* 53 */     this.c.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 58 */     this.a.g = (paramFloat4 / 57.295776F);
/* 59 */     this.a.f = (paramFloat5 / 57.295776F);
/*    */     
/* 61 */     this.c.d = 3.0F;
/* 62 */     this.c.e = -1.0F;
/* 63 */     this.c.f = -0.75F;
/*    */     
/* 65 */     this.d.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2 * 0.5F);
/* 66 */     this.e.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2 * 0.5F);
/* 67 */     this.d.g = 0.0F;
/* 68 */     this.e.g = 0.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */