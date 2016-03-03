/*    */ public class bhf
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/*    */   public bix g;
/*    */   
/*    */   public bhf()
/*    */   {
/* 14 */     this.a = new bix(this).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
/* 15 */     this.b = new bix(this).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
/*    */     
/* 17 */     this.g = new bix(this).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);
/*    */     
/* 19 */     this.c = new bix(this).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
/* 20 */     this.d = new bix(this).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
/*    */     
/* 22 */     this.e = new bix(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
/* 23 */     this.f = new bix(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
/*    */     
/* 25 */     this.a.a(0.0F, 0.0F, -1.0F);
/* 26 */     this.b.a(0.0F, 0.0F, 1.0F);
/*    */     
/* 28 */     this.g.g = 1.5707964F;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 33 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 35 */     this.a.a(paramFloat6);
/* 36 */     this.b.a(paramFloat6);
/* 37 */     this.g.a(paramFloat6);
/*    */     
/* 39 */     this.c.a(paramFloat6);
/* 40 */     this.d.a(paramFloat6);
/*    */     
/* 42 */     this.e.a(paramFloat6);
/* 43 */     this.f.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 48 */     float f1 = (qh.a(paramFloat1 * 0.02F) * 0.1F + 1.25F) * paramFloat4;
/*    */     
/* 50 */     this.a.g = (3.1415927F + f1);
/* 51 */     this.b.g = (-f1);
/* 52 */     this.c.g = f1;
/* 53 */     this.d.g = (-f1);
/*    */     
/* 55 */     this.e.g = (f1 - f1 * 2.0F * paramFloat2);
/* 56 */     this.f.g = (f1 - f1 * 2.0F * paramFloat3);
/*    */     
/* 58 */     this.c.c = qh.a(f1);
/* 59 */     this.d.c = qh.a(f1);
/* 60 */     this.e.c = qh.a(f1);
/* 61 */     this.f.c = qh.a(f1);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */