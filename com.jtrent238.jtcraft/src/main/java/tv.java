/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tv
/*    */ {
/*    */   private sw a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private boolean f;
/*    */   
/*    */   public tv(sw paramsw)
/*    */   {
/* 22 */     this.a = paramsw;
/* 23 */     this.b = paramsw.s;
/* 24 */     this.c = paramsw.t;
/* 25 */     this.d = paramsw.u;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 29 */     return this.f;
/*    */   }
/*    */   
/*    */   public double b() {
/* 33 */     return this.e;
/*    */   }
/*    */   
/*    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 37 */     this.b = paramDouble1;
/* 38 */     this.c = paramDouble2;
/* 39 */     this.d = paramDouble3;
/* 40 */     this.e = paramDouble4;
/* 41 */     this.f = true;
/*    */   }
/*    */   
/*    */   public void c() {
/* 45 */     this.a.n(0.0F);
/* 46 */     if (!this.f) return;
/* 47 */     this.f = false;
/*    */     
/* 49 */     int i = qh.c(this.a.C.b + 0.5D);
/*    */     
/* 51 */     double d1 = this.b - this.a.s;
/* 52 */     double d2 = this.d - this.a.u;
/* 53 */     double d3 = this.c - i;
/* 54 */     double d4 = d1 * d1 + d3 * d3 + d2 * d2;
/* 55 */     if (d4 < 2.500000277905201E-7D) { return;
/*    */     }
/* 57 */     float f1 = (float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F;
/*    */     
/* 59 */     this.a.y = a(this.a.y, f1, 30.0F);
/* 60 */     this.a.i((float)(this.e * this.a.a(yj.d).e()));
/*    */     
/* 62 */     if ((d3 > 0.0D) && (d1 * d1 + d2 * d2 < 1.0D)) this.a.l().a();
/*    */   }
/*    */   
/*    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 66 */     float f1 = qh.g(paramFloat2 - paramFloat1);
/* 67 */     if (f1 > paramFloat3) {
/* 68 */       f1 = paramFloat3;
/*    */     }
/* 70 */     if (f1 < -paramFloat3) {
/* 71 */       f1 = -paramFloat3;
/*    */     }
/* 73 */     return paramFloat1 + f1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */