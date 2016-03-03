/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ur
/*    */   extends ui
/*    */ {
/* 14 */   private int d = -1; private int c = -1;
/*    */   private vy b;
/*    */   
/* 17 */   public ur(td paramtd) { this.a = paramtd;
/* 18 */     a(1);
/*    */   }
/*    */   
/*    */   private td a;
/*    */   public boolean a() {
/* 23 */     int i = qh.c(this.a.s);
/* 24 */     int j = qh.c(this.a.t);
/* 25 */     int k = qh.c(this.a.u);
/* 26 */     if (((this.a.o.w()) && (!this.a.o.Q()) && (this.a.o.a(i, k).e())) || (this.a.o.t.g)) return false;
/* 27 */     if (this.a.aI().nextInt(50) != 0) return false;
/* 28 */     if ((this.c != -1) && (this.a.e(this.c, this.a.t, this.d) < 4.0D)) return false;
/* 29 */     vz localvz = this.a.o.A.a(i, j, k, 14);
/* 30 */     if (localvz == null) return false;
/* 31 */     this.b = localvz.c(i, j, k);
/* 32 */     return this.b != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 37 */     return !this.a.m().g();
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 42 */     this.c = -1;
/* 43 */     if (this.a.e(this.b.a(), this.b.b, this.b.c()) > 256.0D) {
/* 44 */       azw localazw = vx.a(this.a, 14, 3, azw.a(this.b.a() + 0.5D, this.b.b(), this.b.c() + 0.5D));
/* 45 */       if (localazw != null) this.a.m().a(localazw.a, localazw.b, localazw.c, 1.0D);
/* 46 */     } else { this.a.m().a(this.b.a() + 0.5D, this.b.b(), this.b.c() + 0.5D, 1.0D);
/*    */     }
/*    */   }
/*    */   
/*    */   public void d() {
/* 51 */     this.c = this.b.a();
/* 52 */     this.d = this.b.c();
/* 53 */     this.b = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ur.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */