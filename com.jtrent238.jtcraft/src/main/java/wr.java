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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wr
/*    */   extends wl
/*    */   implements yi
/*    */ {
/*    */   public wr(ahb paramahb)
/*    */   {
/* 20 */     super(paramahb);
/* 21 */     a(0.4F, 1.8F);
/*    */     
/* 23 */     m().a(true);
/* 24 */     this.c.a(1, new vd(this, 1.25D, 20, 10.0F));
/* 25 */     this.c.a(2, new vc(this, 1.0D));
/* 26 */     this.c.a(3, new un(this, yz.class, 6.0F));
/* 27 */     this.c.a(4, new vb(this));
/*    */     
/* 29 */     this.d.a(1, new vo(this, sw.class, 0, true, false, yb.a));
/*    */   }
/*    */   
/*    */   public boolean bk()
/*    */   {
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   protected void aD()
/*    */   {
/* 39 */     super.aD();
/*    */     
/* 41 */     a(yj.a).a(4.0D);
/* 42 */     a(yj.d).a(0.20000000298023224D);
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 47 */     super.e();
/* 48 */     int i = qh.c(this.s);
/* 49 */     int j = qh.c(this.t);
/* 50 */     int k = qh.c(this.u);
/*    */     
/* 52 */     if (L()) {
/* 53 */       a(ro.e, 1.0F);
/*    */     }
/*    */     
/* 56 */     if (this.o.a(i, k).a(i, j, k) > 1.0F) {
/* 57 */       a(ro.b, 1.0F);
/*    */     }
/*    */     
/* 60 */     for (int m = 0; m < 4; m++) {
/* 61 */       i = qh.c(this.s + (m % 2 * 2 - 1) * 0.25F);
/* 62 */       j = qh.c(this.t);
/* 63 */       k = qh.c(this.u + (m / 2 % 2 * 2 - 1) * 0.25F);
/* 64 */       if ((this.o.a(i, j, k).o() == awt.a) && 
/* 65 */         (this.o.a(i, k).a(i, j, k) < 0.8F) && 
/* 66 */         (ajn.aC.c(this.o, i, j, k))) {
/* 67 */         this.o.b(i, j, k, ajn.aC);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   protected adb u()
/*    */   {
/* 76 */     return ade.ay;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void b(boolean paramBoolean, int paramInt)
/*    */   {
/* 82 */     int i = this.Z.nextInt(16);
/* 83 */     for (int j = 0; j < i; j++) {
/* 84 */       a(ade.ay, 1);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, float paramFloat)
/*    */   {
/* 90 */     zj localzj = new zj(this.o, this);
/* 91 */     double d1 = paramsv.s - this.s;
/* 92 */     double d2 = paramsv.t + paramsv.g() - 1.100000023841858D - localzj.t;
/* 93 */     double d3 = paramsv.u - this.u;
/* 94 */     float f = qh.a(d1 * d1 + d3 * d3) * 0.2F;
/* 95 */     localzj.c(d1, d2 + f, d3, 1.6F, 12.0F);
/*    */     
/* 97 */     a("random.bow", 1.0F, 1.0F / (aI().nextFloat() * 0.4F + 0.8F));
/* 98 */     this.o.d(localzj);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */