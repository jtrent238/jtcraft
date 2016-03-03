/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class bkz
/*    */   extends bkm
/*    */ {
/*    */   public bkz(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/*  9 */     super(paramahb, paramDouble1, paramDouble2 - 0.125D, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */     
/* 11 */     this.at = 0.4F;
/* 12 */     this.au = 0.4F;
/* 13 */     this.av = 0.7F;
/* 14 */     k(0);
/* 15 */     a(0.01F, 0.01F);
/*    */     
/* 17 */     this.h *= (this.Z.nextFloat() * 0.6F + 0.2F);
/*    */     
/* 19 */     this.v = (paramDouble4 * 0.0D);
/* 20 */     this.w = (paramDouble5 * 0.0D);
/* 21 */     this.x = (paramDouble6 * 0.0D);
/*    */     
/* 23 */     this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 28 */     this.p = this.s;
/* 29 */     this.q = this.t;
/* 30 */     this.r = this.u;
/*    */     
/* 32 */     d(this.v, this.w, this.x);
/*    */     
/* 34 */     if (this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() != awt.h) { B();
/*    */     }
/* 36 */     if (this.g-- <= 0) B();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */