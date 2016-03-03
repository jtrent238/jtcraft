/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ty
/*    */   extends ui
/*    */ {
/*    */   private wv a;
/*    */   private yz b;
/*    */   private ahb c;
/*    */   private float d;
/*    */   private int e;
/*    */   
/*    */   public ty(wv paramwv, float paramFloat)
/*    */   {
/* 18 */     this.a = paramwv;
/* 19 */     this.c = paramwv.o;
/* 20 */     this.d = paramFloat;
/* 21 */     a(2);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 26 */     this.b = this.c.a(this.a, this.d);
/* 27 */     if (this.b == null) return false;
/* 28 */     return a(this.b);
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 33 */     if (!this.b.Z()) return false;
/* 34 */     if (this.a.f(this.b) > this.d * this.d) return false;
/* 35 */     return (this.e > 0) && (a(this.b));
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 40 */     this.a.m(true);
/* 41 */     this.e = (40 + this.a.aI().nextInt(40));
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 46 */     this.a.m(false);
/* 47 */     this.b = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 52 */     this.a.j().a(this.b.s, this.b.t + this.b.g(), this.b.u, 10.0F, this.a.x());
/* 53 */     this.e -= 1;
/*    */   }
/*    */   
/*    */   private boolean a(yz paramyz) {
/* 57 */     add localadd = paramyz.bm.h();
/* 58 */     if (localadd == null) return false;
/* 59 */     if ((!this.a.bZ()) && (localadd.b() == ade.aS)) return true;
/* 60 */     return this.a.c(localadd);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */