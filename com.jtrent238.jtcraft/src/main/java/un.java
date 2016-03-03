/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class un
/*    */   extends ui
/*    */ {
/*    */   private sw b;
/*    */   protected sa a;
/*    */   private float c;
/*    */   private int d;
/*    */   private float e;
/*    */   private Class f;
/*    */   
/*    */   public un(sw paramsw, Class paramClass, float paramFloat)
/*    */   {
/* 17 */     this.b = paramsw;
/* 18 */     this.f = paramClass;
/* 19 */     this.c = paramFloat;
/* 20 */     this.e = 0.02F;
/* 21 */     a(2);
/*    */   }
/*    */   
/*    */   public un(sw paramsw, Class paramClass, float paramFloat1, float paramFloat2) {
/* 25 */     this.b = paramsw;
/* 26 */     this.f = paramClass;
/* 27 */     this.c = paramFloat1;
/* 28 */     this.e = paramFloat2;
/* 29 */     a(2);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 34 */     if (this.b.aI().nextFloat() >= this.e) { return false;
/*    */     }
/* 36 */     if (this.b.o() != null)
/* 37 */       this.a = this.b.o();
/* 38 */     if (this.f == yz.class) {
/* 39 */       this.a = this.b.o.a(this.b, this.c);
/*    */     } else {
/* 41 */       this.a = this.b.o.a(this.f, this.b.C.b(this.c, 3.0D, this.c), this.b);
/*    */     }
/*    */     
/* 44 */     return this.a != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 49 */     if (!this.a.Z()) return false;
/* 50 */     if (this.b.f(this.a) > this.c * this.c) return false;
/* 51 */     return this.d > 0;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 56 */     this.d = (40 + this.b.aI().nextInt(40));
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 61 */     this.a = null;
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 66 */     this.b.j().a(this.a.s, this.a.t + this.a.g(), this.a.u, 10.0F, this.b.x());
/* 67 */     this.d -= 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */