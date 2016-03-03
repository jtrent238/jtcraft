/*    */ 
/*    */ public class tu
/*    */ {
/*    */   private sw a;
/*    */   private float b;
/*    */   private float c;
/*    */   private boolean d;
/*    */   private double e;
/*    */   private double f;
/*    */   private double g;
/*    */   
/*    */   public tu(sw paramsw)
/*    */   {
/* 14 */     this.a = paramsw;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2) {
/* 18 */     this.e = paramsa.s;
/* 19 */     if ((paramsa instanceof sv)) this.f = (paramsa.t + paramsa.g()); else
/* 20 */       this.f = ((paramsa.C.b + paramsa.C.e) / 2.0D);
/* 21 */     this.g = paramsa.u;
/* 22 */     this.b = paramFloat1;
/* 23 */     this.c = paramFloat2;
/* 24 */     this.d = true;
/*    */   }
/*    */   
/*    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 28 */     this.e = paramDouble1;
/* 29 */     this.f = paramDouble2;
/* 30 */     this.g = paramDouble3;
/* 31 */     this.b = paramFloat1;
/* 32 */     this.c = paramFloat2;
/* 33 */     this.d = true;
/*    */   }
/*    */   
/*    */   public void a() {
/* 37 */     this.a.z = 0.0F;
/*    */     
/* 39 */     if (this.d) {
/* 40 */       this.d = false;
/*    */       
/* 42 */       double d1 = this.e - this.a.s;
/* 43 */       double d2 = this.f - (this.a.t + this.a.g());
/* 44 */       double d3 = this.g - this.a.u;
/* 45 */       double d4 = qh.a(d1 * d1 + d3 * d3);
/*    */       
/* 47 */       float f2 = (float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 48 */       float f3 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.1415927410125732D);
/* 49 */       this.a.z = a(this.a.z, f3, this.c);
/* 50 */       this.a.aO = a(this.a.aO, f2, this.b);
/*    */     } else {
/* 52 */       this.a.aO = a(this.a.aO, this.a.aM, 10.0F);
/*    */     }
/*    */     
/* 55 */     float f1 = qh.g(this.a.aO - this.a.aM);
/*    */     
/* 57 */     if (!this.a.m().g())
/*    */     {
/* 59 */       if (f1 < -75.0F) this.a.aO = (this.a.aM - 75.0F);
/* 60 */       if (f1 > 75.0F) this.a.aO = (this.a.aM + 75.0F);
/*    */     }
/*    */   }
/*    */   
/*    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 65 */     float f1 = qh.g(paramFloat2 - paramFloat1);
/* 66 */     if (f1 > paramFloat3) {
/* 67 */       f1 = paramFloat3;
/*    */     }
/* 69 */     if (f1 < -paramFloat3) {
/* 70 */       f1 = -paramFloat3;
/*    */     }
/* 72 */     return paramFloat1 + f1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */