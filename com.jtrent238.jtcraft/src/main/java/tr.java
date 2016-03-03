/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tr
/*    */ {
/*    */   private sv a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public tr(sv paramsv)
/*    */   {
/* 14 */     this.a = paramsv;
/*    */   }
/*    */   
/*    */   public void a() {
/* 18 */     double d1 = this.a.s - this.a.p;
/* 19 */     double d2 = this.a.u - this.a.r;
/*    */     
/* 21 */     if (d1 * d1 + d2 * d2 > 2.500000277905201E-7D)
/*    */     {
/* 23 */       this.a.aM = this.a.y;
/* 24 */       this.a.aO = a(this.a.aM, this.a.aO, 75.0F);
/* 25 */       this.c = this.a.aO;
/* 26 */       this.b = 0;
/* 27 */       return;
/*    */     }
/*    */     
/*    */ 
/* 31 */     float f = 75.0F;
/* 32 */     if (Math.abs(this.a.aO - this.c) > 15.0F) {
/* 33 */       this.b = 0;
/* 34 */       this.c = this.a.aO;
/*    */     } else {
/* 36 */       this.b += 1;
/* 37 */       int i = 10;
/* 38 */       if (this.b > 10) { f = Math.max(1.0F - (this.b - 10) / 10.0F, 0.0F) * 75.0F;
/*    */       }
/*    */     }
/* 41 */     this.a.aM = a(this.a.aO, this.a.aM, f);
/*    */   }
/*    */   
/*    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 45 */     float f = qh.g(paramFloat1 - paramFloat2);
/* 46 */     if (f < -paramFloat3) f = -paramFloat3;
/* 47 */     if (f >= paramFloat3) f = paramFloat3;
/* 48 */     return paramFloat1 - f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */