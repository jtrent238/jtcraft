/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class bjv
/*    */   extends bkm
/*    */ {
/*    */   public bjv(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  9 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */     
/* 11 */     this.at = 1.0F;
/* 12 */     this.au = 1.0F;
/* 13 */     this.av = 1.0F;
/* 14 */     k(32);
/* 15 */     a(0.02F, 0.02F);
/*    */     
/* 17 */     this.h *= (this.Z.nextFloat() * 0.6F + 0.2F);
/*    */     
/* 19 */     this.v = (paramDouble4 * 0.20000000298023224D + (float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/* 20 */     this.w = (paramDouble5 * 0.20000000298023224D + (float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/* 21 */     this.x = (paramDouble6 * 0.20000000298023224D + (float)(Math.random() * 2.0D - 1.0D) * 0.02F);
/*    */     
/* 23 */     this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 28 */     this.p = this.s;
/* 29 */     this.q = this.t;
/* 30 */     this.r = this.u;
/*    */     
/* 32 */     this.w += 0.002D;
/* 33 */     d(this.v, this.w, this.x);
/* 34 */     this.v *= 0.8500000238418579D;
/* 35 */     this.w *= 0.8500000238418579D;
/* 36 */     this.x *= 0.8500000238418579D;
/*    */     
/* 38 */     if (this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() != awt.h) { B();
/*    */     }
/* 40 */     if (this.g-- <= 0) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */