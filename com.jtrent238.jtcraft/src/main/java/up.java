/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class up
/*    */   extends ui
/*    */ {
/*    */   private yv b;
/*    */   private yv c;
/*    */   private ahb d;
/*    */   private int e;
/*    */   vz a;
/*    */   
/*    */   public up(yv paramyv)
/*    */   {
/* 18 */     this.b = paramyv;
/* 19 */     this.d = paramyv.o;
/* 20 */     a(3);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 25 */     if (this.b.d() != 0) return false;
/* 26 */     if (this.b.aI().nextInt(500) != 0) { return false;
/*    */     }
/* 28 */     this.a = this.d.A.a(qh.c(this.b.s), qh.c(this.b.t), qh.c(this.b.u), 0);
/* 29 */     if (this.a == null) return false;
/* 30 */     if (!f()) { return false;
/*    */     }
/* 32 */     sa localsa = this.d.a(yv.class, this.b.C.b(8.0D, 3.0D, 8.0D), this.b);
/* 33 */     if (localsa == null) { return false;
/*    */     }
/* 35 */     this.c = ((yv)localsa);
/* 36 */     if (this.c.d() != 0) { return false;
/*    */     }
/* 38 */     return true;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 43 */     this.e = 300;
/* 44 */     this.b.i(true);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 49 */     this.a = null;
/* 50 */     this.c = null;
/* 51 */     this.b.i(false);
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 56 */     return (this.e >= 0) && (f()) && (this.b.d() == 0);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 61 */     this.e -= 1;
/* 62 */     this.b.j().a(this.c, 10.0F, 30.0F);
/*    */     
/* 64 */     if (this.b.f(this.c) > 2.25D) {
/* 65 */       this.b.m().a(this.c, 0.25D);
/*    */     }
/* 67 */     else if ((this.e == 0) && (this.c.ca())) { g();
/*    */     }
/*    */     
/* 70 */     if (this.b.aI().nextInt(35) == 0) this.d.a(this.b, (byte)12);
/*    */   }
/*    */   
/*    */   private boolean f()
/*    */   {
/* 75 */     if (!this.a.i()) {
/* 76 */       return false;
/*    */     }
/*    */     
/* 79 */     int i = (int)(this.a.c() * 0.35D);
/* 80 */     return this.a.e() < i;
/*    */   }
/*    */   
/*    */   private void g() {
/* 84 */     yv localyv = this.b.b(this.c);
/* 85 */     this.c.c(6000);
/* 86 */     this.b.c(6000);
/* 87 */     localyv.c(41536);
/* 88 */     localyv.b(this.b.s, this.b.t, this.b.u, 0.0F, 0.0F);
/* 89 */     this.d.d(localyv);
/* 90 */     this.d.a(localyv, (byte)12);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\up.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */