/*    */ public class bif
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   
/*    */   public bif()
/*    */   {
/* 12 */     float f1 = 4.0F;
/* 13 */     float f2 = 0.0F;
/*    */     
/* 15 */     this.c = new bix(this, 0, 0).b(64, 64);
/* 16 */     this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f2 - 0.5F);
/* 17 */     this.c.a(0.0F, 0.0F + f1, 0.0F);
/*    */     
/* 19 */     this.d = new bix(this, 32, 0).b(64, 64);
/* 20 */     this.d.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
/* 21 */     this.d.a(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
/*    */     
/* 23 */     this.e = new bix(this, 32, 0).b(64, 64);
/* 24 */     this.e.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, f2 - 0.5F);
/* 25 */     this.e.a(0.0F, 0.0F + f1 + 9.0F - 7.0F, 0.0F);
/*    */     
/* 27 */     this.a = new bix(this, 0, 16).b(64, 64);
/* 28 */     this.a.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, f2 - 0.5F);
/* 29 */     this.a.a(0.0F, 0.0F + f1 + 9.0F, 0.0F);
/*    */     
/* 31 */     this.b = new bix(this, 0, 36).b(64, 64);
/* 32 */     this.b.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, f2 - 0.5F);
/* 33 */     this.b.a(0.0F, 0.0F + f1 + 20.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 38 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/* 39 */     this.c.g = (paramFloat4 / 57.295776F);
/* 40 */     this.c.f = (paramFloat5 / 57.295776F);
/* 41 */     this.a.g = (paramFloat4 / 57.295776F * 0.25F);
/*    */     
/* 43 */     float f1 = qh.a(this.a.g);
/* 44 */     float f2 = qh.b(this.a.g);
/*    */     
/* 46 */     this.d.h = 1.0F;
/* 47 */     this.e.h = -1.0F;
/* 48 */     this.d.g = (0.0F + this.a.g);
/* 49 */     this.e.g = (3.1415927F + this.a.g);
/*    */     
/* 51 */     this.d.c = (f2 * 5.0F);
/* 52 */     this.d.e = (-f1 * 5.0F);
/*    */     
/* 54 */     this.e.c = (-f2 * 5.0F);
/* 55 */     this.e.e = (f1 * 5.0F);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 60 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 62 */     this.a.a(paramFloat6);
/* 63 */     this.b.a(paramFloat6);
/* 64 */     this.c.a(paramFloat6);
/* 65 */     this.d.a(paramFloat6);
/* 66 */     this.e.a(paramFloat6);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */