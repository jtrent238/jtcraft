/*    */ public class bij
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/*    */   
/*    */   public bij()
/*    */   {
/* 13 */     this(0.0F);
/*    */   }
/*    */   
/*    */   public bij(float paramFloat) {
/* 17 */     this(paramFloat, -7.0F);
/*    */   }
/*    */   
/*    */   public bij(float paramFloat1, float paramFloat2) {
/* 21 */     int i = 128;
/* 22 */     int j = 128;
/*    */     
/* 24 */     this.a = new bix(this).b(i, j);
/* 25 */     this.a.a(0.0F, 0.0F + paramFloat2, -2.0F);
/* 26 */     this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, paramFloat1);
/* 27 */     this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, paramFloat1);
/*    */     
/* 29 */     this.b = new bix(this).b(i, j);
/* 30 */     this.b.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 31 */     this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, paramFloat1);
/* 32 */     this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, paramFloat1 + 0.5F);
/*    */     
/* 34 */     this.c = new bix(this).b(i, j);
/* 35 */     this.c.a(0.0F, -7.0F, 0.0F);
/* 36 */     this.c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
/*    */     
/* 38 */     this.d = new bix(this).b(i, j);
/* 39 */     this.d.a(0.0F, -7.0F, 0.0F);
/* 40 */     this.d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
/*    */     
/* 42 */     this.e = new bix(this, 0, 22).b(i, j);
/* 43 */     this.e.a(-4.0F, 18.0F + paramFloat2, 0.0F);
/* 44 */     this.e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
/*    */     
/* 46 */     this.f = new bix(this, 0, 22).b(i, j);
/* 47 */     this.f.i = true;
/* 48 */     this.f.a(60, 0).a(5.0F, 18.0F + paramFloat2, 0.0F);
/* 49 */     this.f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 54 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 56 */     this.a.a(paramFloat6);
/* 57 */     this.b.a(paramFloat6);
/* 58 */     this.e.a(paramFloat6);
/* 59 */     this.f.a(paramFloat6);
/* 60 */     this.c.a(paramFloat6);
/* 61 */     this.d.a(paramFloat6);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 66 */     this.a.g = (paramFloat4 / 57.295776F);
/* 67 */     this.a.f = (paramFloat5 / 57.295776F);
/*    */     
/* 69 */     this.e.f = (-1.5F * a(paramFloat1, 13.0F) * paramFloat2);
/* 70 */     this.f.f = (1.5F * a(paramFloat1, 13.0F) * paramFloat2);
/* 71 */     this.e.g = 0.0F;
/* 72 */     this.f.g = 0.0F;
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 77 */     wt localwt = (wt)paramsv;
/*    */     
/* 79 */     int i = localwt.ca();
/* 80 */     if (i > 0) {
/* 81 */       this.c.f = (-2.0F + 1.5F * a(i - paramFloat3, 10.0F));
/* 82 */       this.d.f = (-2.0F + 1.5F * a(i - paramFloat3, 10.0F));
/*    */     } else {
/* 84 */       int j = localwt.cb();
/* 85 */       if (j > 0) {
/* 86 */         this.c.f = (-0.8F + 0.025F * a(j, 70.0F));
/* 87 */         this.d.f = 0.0F;
/*    */       } else {
/* 89 */         this.c.f = ((-0.2F + 1.5F * a(paramFloat1, 13.0F)) * paramFloat2);
/* 90 */         this.d.f = ((-0.2F - 1.5F * a(paramFloat1, 13.0F)) * paramFloat2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private float a(float paramFloat1, float paramFloat2) {
/* 96 */     return (Math.abs(paramFloat1 % paramFloat2 - paramFloat2 * 0.5F) - paramFloat2 * 0.25F) / (paramFloat2 * 0.25F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */