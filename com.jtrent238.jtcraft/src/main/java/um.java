/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class um
/*    */   extends ui
/*    */ {
/*    */   sw a;
/*    */   sv b;
/*    */   float c;
/*    */   
/*    */   public um(sw paramsw, float paramFloat)
/*    */   {
/* 13 */     this.a = paramsw;
/* 14 */     this.c = paramFloat;
/* 15 */     a(5);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 20 */     this.b = this.a.o();
/* 21 */     if (this.b == null) return false;
/* 22 */     double d = this.a.f(this.b);
/* 23 */     if ((d < 4.0D) || (d > 16.0D)) return false;
/* 24 */     if (!this.a.D) return false;
/* 25 */     if (this.a.aI().nextInt(5) != 0) return false;
/* 26 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 31 */     return !this.a.D;
/*    */   }
/*    */   
/*    */ 
/*    */   public void c()
/*    */   {
/* 37 */     double d1 = this.b.s - this.a.s;
/* 38 */     double d2 = this.b.u - this.a.u;
/* 39 */     float f = qh.a(d1 * d1 + d2 * d2);
/* 40 */     this.a.v += d1 / f * 0.5D * 0.800000011920929D + this.a.v * 0.20000000298023224D;
/* 41 */     this.a.x += d2 / f * 0.5D * 0.800000011920929D + this.a.x * 0.20000000298023224D;
/* 42 */     this.a.w = this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\um.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */