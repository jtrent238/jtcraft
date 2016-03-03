/*    */ import java.util.Random;
/*    */ 
/*    */ public class bka extends bkm
/*    */ {
/*    */   public bka(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  7 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  8 */     this.v = (paramDouble4 + (float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/*  9 */     this.w = (paramDouble5 + (float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/* 10 */     this.x = (paramDouble6 + (float)(Math.random() * 2.0D - 1.0D) * 0.05F);
/*    */     
/* 12 */     this.at = (this.au = this.av = this.Z.nextFloat() * 0.3F + 0.7F);
/* 13 */     this.h = (this.Z.nextFloat() * this.Z.nextFloat() * 6.0F + 1.0F);
/*    */     
/* 15 */     this.g = ((int)(16.0D / (this.Z.nextFloat() * 0.8D + 0.2D)) + 2);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 20 */     this.p = this.s;
/* 21 */     this.q = this.t;
/* 22 */     this.r = this.u;
/*    */     
/* 24 */     if (this.f++ >= this.g) { B();
/*    */     }
/* 26 */     k(7 - this.f * 8 / this.g);
/*    */     
/* 28 */     this.w += 0.004D;
/* 29 */     d(this.v, this.w, this.x);
/* 30 */     this.v *= 0.8999999761581421D;
/* 31 */     this.w *= 0.8999999761581421D;
/* 32 */     this.x *= 0.8999999761581421D;
/*    */     
/* 34 */     if (this.D) {
/* 35 */       this.v *= 0.699999988079071D;
/* 36 */       this.x *= 0.699999988079071D;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */