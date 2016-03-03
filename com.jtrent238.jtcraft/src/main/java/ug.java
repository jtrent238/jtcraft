/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ug
/*    */   extends ui
/*    */ {
/*    */   private tg d;
/*    */   private sv e;
/*    */   ahb a;
/*    */   private double f;
/*    */   private vv g;
/*    */   private int h;
/*    */   float b;
/*    */   float c;
/*    */   private boolean i;
/*    */   
/*    */   public ug(tg paramtg, double paramDouble, float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     this.d = paramtg;
/* 24 */     this.a = paramtg.o;
/* 25 */     this.f = paramDouble;
/* 26 */     this.g = paramtg.m();
/* 27 */     this.c = paramFloat1;
/* 28 */     this.b = paramFloat2;
/* 29 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 34 */     sv localsv = this.d.cb();
/* 35 */     if (localsv == null) return false;
/* 36 */     if (this.d.ca()) return false;
/* 37 */     if (this.d.f(localsv) < this.c * this.c) return false;
/* 38 */     this.e = localsv;
/* 39 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 44 */     return (!this.g.g()) && (this.d.f(this.e) > this.b * this.b) && (!this.d.ca());
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 49 */     this.h = 0;
/* 50 */     this.i = this.d.m().a();
/* 51 */     this.d.m().a(false);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 56 */     this.e = null;
/* 57 */     this.g.h();
/* 58 */     this.d.m().a(this.i);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 63 */     this.d.j().a(this.e, 10.0F, this.d.x());
/* 64 */     if (this.d.ca()) { return;
/*    */     }
/* 66 */     if (--this.h > 0) return;
/* 67 */     this.h = 10;
/*    */     
/* 69 */     if (this.g.a(this.e, this.f)) return;
/* 70 */     if (this.d.bN()) return;
/* 71 */     if (this.d.f(this.e) < 144.0D) { return;
/*    */     }
/*    */     
/* 74 */     int j = qh.c(this.e.s) - 2;
/* 75 */     int k = qh.c(this.e.u) - 2;
/* 76 */     int m = qh.c(this.e.C.b);
/* 77 */     for (int n = 0; n <= 4; n++) {
/* 78 */       for (int i1 = 0; i1 <= 4; i1++) {
/* 79 */         if ((n < 1) || (i1 < 1) || (n > 3) || (i1 > 3))
/*    */         {
/*    */ 
/* 82 */           if ((ahb.a(this.a, j + n, m - 1, k + i1)) && (!this.a.a(j + n, m, k + i1).r()) && (!this.a.a(j + n, m + 1, k + i1).r())) {
/* 83 */             this.d.b(j + n + 0.5F, m, k + i1 + 0.5F, this.d.y, this.d.z);
/* 84 */             this.g.h();
/* 85 */             return;
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */