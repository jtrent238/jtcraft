/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bju
/*    */   extends bkm
/*    */ {
/*    */   public bju(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, adb paramadb)
/*    */   {
/* 11 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramadb, 0);
/*    */   }
/*    */   
/*    */   public bju(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, adb paramadb, int paramInt) {
/* 15 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 16 */     a(paramadb.b_(paramInt));
/* 17 */     this.at = (this.au = this.av = 1.0F);
/* 18 */     this.i = ajn.aE.I;
/* 19 */     this.h /= 2.0F;
/*    */   }
/*    */   
/*    */   public bju(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, adb paramadb, int paramInt) {
/* 23 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramadb, paramInt);
/* 24 */     this.v *= 0.10000000149011612D;
/* 25 */     this.w *= 0.10000000149011612D;
/* 26 */     this.x *= 0.10000000149011612D;
/* 27 */     this.v += paramDouble4;
/* 28 */     this.w += paramDouble5;
/* 29 */     this.x += paramDouble6;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 34 */     return 2;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 39 */     float f1 = (this.b + this.d / 4.0F) / 16.0F;
/* 40 */     float f2 = f1 + 0.015609375F;
/* 41 */     float f3 = (this.c + this.e / 4.0F) / 16.0F;
/* 42 */     float f4 = f3 + 0.015609375F;
/* 43 */     float f5 = 0.1F * this.h;
/*    */     
/* 45 */     if (this.ax != null) {
/* 46 */       f1 = this.ax.a(this.d / 4.0F * 16.0F);
/* 47 */       f2 = this.ax.a((this.d + 1.0F) / 4.0F * 16.0F);
/* 48 */       f3 = this.ax.b(this.e / 4.0F * 16.0F);
/* 49 */       f4 = this.ax.b((this.e + 1.0F) / 4.0F * 16.0F);
/*    */     }
/*    */     
/* 52 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - ay);
/* 53 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - az);
/* 54 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aA);
/* 55 */     parambmh.b(this.at, this.au, this.av);
/*    */     
/* 57 */     parambmh.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 58 */     parambmh.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 59 */     parambmh.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 60 */     parambmh.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */