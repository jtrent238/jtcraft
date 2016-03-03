/*    */ 
/*    */ public class vk
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private double f;
/*    */   private double g;
/*    */   private yz h;
/*    */   private int i;
/*    */   private boolean j;
/*    */   private adb k;
/*    */   private boolean l;
/*    */   private boolean m;
/*    */   
/*    */   public vk(td paramtd, double paramDouble, adb paramadb, boolean paramBoolean)
/*    */   {
/* 21 */     this.a = paramtd;
/* 22 */     this.b = paramDouble;
/* 23 */     this.k = paramadb;
/* 24 */     this.l = paramBoolean;
/* 25 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 30 */     if (this.i > 0) {
/* 31 */       this.i -= 1;
/* 32 */       return false;
/*    */     }
/* 34 */     this.h = this.a.o.a(this.a, 10.0D);
/* 35 */     if (this.h == null) return false;
/* 36 */     add localadd = this.h.bF();
/* 37 */     if (localadd == null) return false;
/* 38 */     if (localadd.b() != this.k) return false;
/* 39 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 44 */     if (this.l) {
/* 45 */       if (this.a.f(this.h) < 36.0D) {
/* 46 */         if (this.h.e(this.c, this.d, this.e) > 0.010000000000000002D) return false;
/* 47 */         if ((Math.abs(this.h.z - this.f) > 5.0D) || (Math.abs(this.h.y - this.g) > 5.0D)) return false;
/*    */       } else {
/* 49 */         this.c = this.h.s;
/* 50 */         this.d = this.h.t;
/* 51 */         this.e = this.h.u;
/*    */       }
/* 53 */       this.f = this.h.z;
/* 54 */       this.g = this.h.y;
/*    */     }
/* 56 */     return a();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 61 */     this.c = this.h.s;
/* 62 */     this.d = this.h.t;
/* 63 */     this.e = this.h.u;
/* 64 */     this.j = true;
/* 65 */     this.m = this.a.m().a();
/* 66 */     this.a.m().a(false);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 71 */     this.h = null;
/* 72 */     this.a.m().h();
/* 73 */     this.i = 100;
/* 74 */     this.j = false;
/* 75 */     this.a.m().a(this.m);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 80 */     this.a.j().a(this.h, 30.0F, this.a.x());
/* 81 */     if (this.a.f(this.h) < 6.25D) this.a.m().h(); else
/* 82 */       this.a.m().a(this.h, this.b);
/*    */   }
/*    */   
/*    */   public boolean f() {
/* 86 */     return this.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */