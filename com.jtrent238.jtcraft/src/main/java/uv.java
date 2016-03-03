/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class uv
/*    */   extends ui
/*    */ {
/*    */   ahb a;
/*    */   sw b;
/*    */   sv c;
/*    */   int d;
/*    */   
/*    */   public uv(sw paramsw)
/*    */   {
/* 17 */     this.b = paramsw;
/* 18 */     this.a = paramsw.o;
/* 19 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 24 */     sv localsv = this.b.o();
/* 25 */     if (localsv == null) return false;
/* 26 */     this.c = localsv;
/* 27 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 32 */     if (!this.c.Z()) return false;
/* 33 */     if (this.b.f(this.c) > 225.0D) return false;
/* 34 */     return (!this.b.m().g()) || (a());
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 39 */     this.c = null;
/* 40 */     this.b.m().h();
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 45 */     this.b.j().a(this.c, 30.0F, 30.0F);
/*    */     
/* 47 */     double d1 = this.b.M * 2.0F * (this.b.M * 2.0F);
/* 48 */     double d2 = this.b.e(this.c.s, this.c.C.b, this.c.u);
/*    */     
/* 50 */     double d3 = 0.8D;
/* 51 */     if ((d2 > d1) && (d2 < 16.0D)) { d3 = 1.33D;
/* 52 */     } else if (d2 < 225.0D) { d3 = 0.6D;
/*    */     }
/* 54 */     this.b.m().a(this.c, d3);
/*    */     
/* 56 */     this.d = Math.max(this.d - 1, 0);
/*    */     
/* 58 */     if (d2 > d1) return;
/* 59 */     if (this.d > 0) return;
/* 60 */     this.d = 20;
/* 61 */     this.b.n(this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */