/*    */ 
/*    */ 
/*    */ public class bhk
/*    */   extends bhm
/*    */ {
/*    */   public boolean a;
/*    */   public boolean b;
/*    */   
/*    */   public bhk()
/*    */   {
/* 11 */     super(0.0F, -14.0F, 64, 32);
/* 12 */     float f1 = -14.0F;
/* 13 */     float f2 = 0.0F;
/*    */     
/* 15 */     this.d = new bix(this, 0, 16);
/* 16 */     this.d.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, f2 - 0.5F);
/* 17 */     this.d.a(0.0F, 0.0F + f1, 0.0F);
/*    */     
/* 19 */     this.e = new bix(this, 32, 16);
/* 20 */     this.e.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, f2);
/* 21 */     this.e.a(0.0F, 0.0F + f1, 0.0F);
/*    */     
/* 23 */     this.f = new bix(this, 56, 0);
/* 24 */     this.f.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, f2);
/* 25 */     this.f.a(-3.0F, 2.0F + f1, 0.0F);
/*    */     
/* 27 */     this.g = new bix(this, 56, 0);
/* 28 */     this.g.i = true;
/* 29 */     this.g.a(-1.0F, -2.0F, -1.0F, 2, 30, 2, f2);
/* 30 */     this.g.a(5.0F, 2.0F + f1, 0.0F);
/*    */     
/* 32 */     this.h = new bix(this, 56, 0);
/* 33 */     this.h.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, f2);
/* 34 */     this.h.a(-2.0F, 12.0F + f1, 0.0F);
/*    */     
/* 36 */     this.i = new bix(this, 56, 0);
/* 37 */     this.i.i = true;
/* 38 */     this.i.a(-1.0F, 0.0F, -1.0F, 2, 30, 2, f2);
/* 39 */     this.i.a(2.0F, 12.0F + f1, 0.0F);
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 44 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 46 */     this.c.j = true;
/*    */     
/* 48 */     float f1 = -14.0F;
/* 49 */     this.e.f = 0.0F;
/* 50 */     this.e.d = f1;
/* 51 */     this.e.e = -0.0F;
/*    */     
/* 53 */     this.h.f -= 0.0F;
/* 54 */     this.i.f -= 0.0F; bix 
/*    */     
/* 56 */       tmp83_80 = this.f;tmp83_80.f = ((float)(tmp83_80.f * 0.5D)); bix 
/* 57 */       tmp100_97 = this.g;tmp100_97.f = ((float)(tmp100_97.f * 0.5D)); bix 
/* 58 */       tmp117_114 = this.h;tmp117_114.f = ((float)(tmp117_114.f * 0.5D)); bix 
/* 59 */       tmp134_131 = this.i;tmp134_131.f = ((float)(tmp134_131.f * 0.5D));
/*    */     
/* 61 */     float f2 = 0.4F;
/* 62 */     if (this.f.f > f2) this.f.f = f2;
/* 63 */     if (this.g.f > f2) this.g.f = f2;
/* 64 */     if (this.f.f < -f2) this.f.f = (-f2);
/* 65 */     if (this.g.f < -f2) this.g.f = (-f2);
/* 66 */     if (this.h.f > f2) this.h.f = f2;
/* 67 */     if (this.i.f > f2) this.i.f = f2;
/* 68 */     if (this.h.f < -f2) this.h.f = (-f2);
/* 69 */     if (this.i.f < -f2) { this.i.f = (-f2);
/*    */     }
/* 71 */     if (this.a) {
/* 72 */       this.f.f = -0.5F;
/* 73 */       this.g.f = -0.5F;
/* 74 */       this.f.h = 0.05F;
/* 75 */       this.g.h = -0.05F;
/*    */     }
/*    */     
/* 78 */     this.f.e = 0.0F;
/* 79 */     this.g.e = 0.0F;
/* 80 */     this.h.e = 0.0F;
/* 81 */     this.i.e = 0.0F;
/*    */     
/* 83 */     this.h.d = (9.0F + f1);
/* 84 */     this.i.d = (9.0F + f1);
/*    */     
/* 86 */     this.c.e = -0.0F;
/* 87 */     this.c.d = (f1 + 1.0F);
/*    */     
/* 89 */     this.d.c = this.c.c;
/* 90 */     this.d.d = this.c.d;
/* 91 */     this.d.e = this.c.e;
/* 92 */     this.d.f = this.c.f;
/* 93 */     this.d.g = this.c.g;
/* 94 */     this.d.h = this.c.h;
/*    */     
/* 96 */     if (this.b) {
/* 97 */       float f3 = 1.0F;
/* 98 */       this.c.d -= f3 * 5.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */