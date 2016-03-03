/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bin
/*    */   extends bhr
/*    */ {
/*    */   private bix[] a;
/*    */   private bix[] b;
/*    */   
/*    */   public bin()
/*    */   {
/* 14 */     this.t = 64;
/* 15 */     this.u = 64;
/*    */     
/* 17 */     this.a = new bix[3];
/*    */     
/* 19 */     this.a[0] = new bix(this, 0, 16);
/* 20 */     this.a[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3);
/*    */     
/* 22 */     this.a[1] = new bix(this).b(this.t, this.u);
/* 23 */     this.a[1].a(-2.0F, 6.9F, -0.5F);
/* 24 */     this.a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3);
/* 25 */     this.a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2);
/* 26 */     this.a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2);
/* 27 */     this.a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2);
/*    */     
/* 29 */     this.a[2] = new bix(this, 12, 22);
/* 30 */     this.a[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3);
/*    */     
/* 32 */     this.b = new bix[3];
/* 33 */     this.b[0] = new bix(this, 0, 0);
/* 34 */     this.b[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/* 35 */     this.b[1] = new bix(this, 32, 0);
/* 36 */     this.b[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
/* 37 */     this.b[1].c = -8.0F;
/* 38 */     this.b[1].d = 4.0F;
/* 39 */     this.b[2] = new bix(this, 32, 0);
/* 40 */     this.b[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6);
/* 41 */     this.b[2].c = 10.0F;
/* 42 */     this.b[2].d = 4.0F;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 47 */     return 32;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 52 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     bix localbix;
/* 54 */     for (localbix : this.b) {
/* 55 */       localbix.a(paramFloat6);
/*    */     }
/* 57 */     for (localbix : this.a) {
/* 58 */       localbix.a(paramFloat6);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 65 */     float f = qh.b(paramFloat3 * 0.1F);
/* 66 */     this.a[1].f = ((0.065F + 0.05F * f) * 3.1415927F);
/*    */     
/* 68 */     this.a[2].a(-2.0F, 6.9F + qh.b(this.a[1].f) * 10.0F, -0.5F + qh.a(this.a[1].f) * 10.0F);
/* 69 */     this.a[2].f = ((0.265F + 0.1F * f) * 3.1415927F);
/*    */     
/* 71 */     this.b[0].g = (paramFloat4 / 57.295776F);
/* 72 */     this.b[0].f = (paramFloat5 / 57.295776F);
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 77 */     xc localxc = (xc)paramsv;
/*    */     
/* 79 */     for (int i = 1; i < 3; i++) {
/* 80 */       this.b[i].g = ((localxc.a(i - 1) - paramsv.aM) / 57.295776F);
/* 81 */       this.b[i].f = (localxc.c(i - 1) / 57.295776F);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */