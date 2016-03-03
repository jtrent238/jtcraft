/*    */ 
/*    */ public class ble
/*    */   extends bkm
/*    */ {
/*    */   public ble(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  7 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  8 */     this.v *= 0.30000001192092896D;
/*  9 */     this.w = ((float)Math.random() * 0.2F + 0.1F);
/* 10 */     this.x *= 0.30000001192092896D;
/*    */     
/* 12 */     this.at = 1.0F;
/* 13 */     this.au = 1.0F;
/* 14 */     this.av = 1.0F;
/* 15 */     k(19);
/* 16 */     a(0.01F, 0.01F);
/*    */     
/* 18 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/*    */     
/* 20 */     this.i = 0.0F;
/* 21 */     this.v = paramDouble4;
/* 22 */     this.w = paramDouble5;
/* 23 */     this.x = paramDouble6;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 28 */     this.p = this.s;
/* 29 */     this.q = this.t;
/* 30 */     this.r = this.u;
/*    */     
/* 32 */     this.w -= this.i;
/* 33 */     d(this.v, this.w, this.x);
/* 34 */     this.v *= 0.9800000190734863D;
/* 35 */     this.w *= 0.9800000190734863D;
/* 36 */     this.x *= 0.9800000190734863D;
/*    */     
/* 38 */     int i = 60 - this.g;
/* 39 */     float f = i * 0.001F;
/* 40 */     a(f, f);
/* 41 */     k(19 + i % 4);
/*    */     
/* 43 */     if (this.g-- <= 0) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ble.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */