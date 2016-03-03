/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ue
/*    */   extends ui
/*    */ {
/*    */   private td a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private ahb f;
/*    */   
/*    */   public ue(td paramtd, double paramDouble)
/*    */   {
/* 19 */     this.a = paramtd;
/* 20 */     this.e = paramDouble;
/* 21 */     this.f = paramtd.o;
/* 22 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 27 */     if (!this.f.w()) return false;
/* 28 */     if (!this.a.al()) return false;
/* 29 */     if (!this.f.i(qh.c(this.a.s), (int)this.a.C.b, qh.c(this.a.u))) { return false;
/*    */     }
/* 31 */     azw localazw = f();
/* 32 */     if (localazw == null) return false;
/* 33 */     this.b = localazw.a;
/* 34 */     this.c = localazw.b;
/* 35 */     this.d = localazw.c;
/* 36 */     return true;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 41 */     return !this.a.m().g();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 46 */     this.a.m().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */   
/*    */   private azw f() {
/* 50 */     Random localRandom = this.a.aI();
/* 51 */     for (int i = 0; i < 10; i++) {
/* 52 */       int j = qh.c(this.a.s + localRandom.nextInt(20) - 10.0D);
/* 53 */       int k = qh.c(this.a.C.b + localRandom.nextInt(6) - 3.0D);
/* 54 */       int m = qh.c(this.a.u + localRandom.nextInt(20) - 10.0D);
/* 55 */       if ((!this.f.i(j, k, m)) && (this.a.a(j, k, m) < 0.0F)) return azw.a(j, k, m);
/*    */     }
/* 57 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */