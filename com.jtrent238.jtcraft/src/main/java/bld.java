/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bld
/*    */   extends bkm
/*    */ {
/*    */   private aji a;
/*    */   
/*    */   public bld(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, aji paramaji, int paramInt)
/*    */   {
/* 13 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 14 */     this.a = paramaji;
/* 15 */     a(paramaji.a(0, paramInt));
/* 16 */     this.i = paramaji.I;
/* 17 */     this.at = (this.au = this.av = 0.6F);
/* 18 */     this.h /= 2.0F;
/*    */   }
/*    */   
/*    */   public bld a(int paramInt1, int paramInt2, int paramInt3) {
/* 22 */     if (this.a == ajn.c) return this;
/* 23 */     int i = this.a.d(this.o, paramInt1, paramInt2, paramInt3);
/* 24 */     this.at *= (i >> 16 & 0xFF) / 255.0F;
/* 25 */     this.au *= (i >> 8 & 0xFF) / 255.0F;
/* 26 */     this.av *= (i & 0xFF) / 255.0F;
/* 27 */     return this;
/*    */   }
/*    */   
/*    */   public bld a(int paramInt) {
/* 31 */     if (this.a == ajn.c) return this;
/* 32 */     int i = this.a.i(paramInt);
/* 33 */     this.at *= (i >> 16 & 0xFF) / 255.0F;
/* 34 */     this.au *= (i >> 8 & 0xFF) / 255.0F;
/* 35 */     this.av *= (i & 0xFF) / 255.0F;
/* 36 */     return this;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 41 */     return 1;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 46 */     float f1 = (this.b + this.d / 4.0F) / 16.0F;
/* 47 */     float f2 = f1 + 0.015609375F;
/* 48 */     float f3 = (this.c + this.e / 4.0F) / 16.0F;
/* 49 */     float f4 = f3 + 0.015609375F;
/* 50 */     float f5 = 0.1F * this.h;
/*    */     
/* 52 */     if (this.ax != null) {
/* 53 */       f1 = this.ax.a(this.d / 4.0F * 16.0F);
/* 54 */       f2 = this.ax.a((this.d + 1.0F) / 4.0F * 16.0F);
/* 55 */       f3 = this.ax.b(this.e / 4.0F * 16.0F);
/* 56 */       f4 = this.ax.b((this.e + 1.0F) / 4.0F * 16.0F);
/*    */     }
/*    */     
/* 59 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - ay);
/* 60 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - az);
/* 61 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aA);
/* 62 */     parambmh.b(this.at, this.au, this.av);
/*    */     
/* 64 */     parambmh.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 65 */     parambmh.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 66 */     parambmh.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 67 */     parambmh.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */