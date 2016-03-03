/*    */ 
/*    */ 
/*    */ 
/*    */ public class bks
/*    */   extends bkm
/*    */ {
/*    */   float a;
/*    */   
/*    */   public bks(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 11 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*    */     
/* 13 */     float f = 2.5F;
/* 14 */     this.v *= 0.10000000149011612D;
/* 15 */     this.w *= 0.10000000149011612D;
/* 16 */     this.x *= 0.10000000149011612D;
/* 17 */     this.v += paramDouble4;
/* 18 */     this.w += paramDouble5;
/* 19 */     this.x += paramDouble6;
/*    */     
/* 21 */     this.at = (this.au = this.av = 1.0F - (float)(Math.random() * 0.30000001192092896D));
/* 22 */     this.h *= 0.75F;
/* 23 */     this.h *= f;
/* 24 */     this.a = this.h;
/*    */     
/* 26 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.3D)));
/* 27 */     this.g = ((int)(this.g * f));
/* 28 */     this.X = false;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 33 */     float f = (this.f + paramFloat1) / this.g * 32.0F;
/* 34 */     if (f < 0.0F) f = 0.0F;
/* 35 */     if (f > 1.0F) { f = 1.0F;
/*    */     }
/* 37 */     this.h = (this.a * f);
/* 38 */     super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 43 */     this.p = this.s;
/* 44 */     this.q = this.t;
/* 45 */     this.r = this.u;
/*    */     
/* 47 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 49 */     k(7 - this.f * 8 / this.g);
/*    */     
/* 51 */     d(this.v, this.w, this.x);
/* 52 */     this.v *= 0.9599999785423279D;
/* 53 */     this.w *= 0.9599999785423279D;
/* 54 */     this.x *= 0.9599999785423279D;
/* 55 */     yz localyz = this.o.a(this, 2.0D);
/* 56 */     if ((localyz != null) && 
/* 57 */       (this.t > localyz.C.b)) {
/* 58 */       this.t += (localyz.C.b - this.t) * 0.2D;
/* 59 */       this.w += (localyz.w - this.w) * 0.2D;
/* 60 */       b(this.s, this.t, this.u);
/*    */     }
/*    */     
/*    */ 
/* 64 */     if (this.D) {
/* 65 */       this.v *= 0.699999988079071D;
/* 66 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */