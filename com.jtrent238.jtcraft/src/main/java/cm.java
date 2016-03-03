/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cm
/*    */   implements cp
/*    */ {
/*    */   public final add a(ck paramck, add paramadd)
/*    */   {
/* 12 */     add localadd = b(paramck, paramadd);
/*    */     
/* 14 */     a(paramck);
/* 15 */     a(paramck, akm.b(paramck.h()));
/*    */     
/* 17 */     return localadd;
/*    */   }
/*    */   
/*    */   protected add b(ck paramck, add paramadd) {
/* 21 */     cr localcr = akm.b(paramck.h());
/* 22 */     cx localcx = akm.a(paramck);
/*    */     
/* 24 */     add localadd = paramadd.a(1);
/*    */     
/* 26 */     a(paramck.k(), localadd, 6, localcr, localcx);
/*    */     
/* 28 */     return paramadd;
/*    */   }
/*    */   
/*    */   public static void a(ahb paramahb, add paramadd, int paramInt, cr paramcr, cx paramcx) {
/* 32 */     double d1 = paramcx.a();
/* 33 */     double d2 = paramcx.b();
/* 34 */     double d3 = paramcx.c();
/*    */     
/* 36 */     xk localxk = new xk(paramahb, d1, d2 - 0.3D, d3, paramadd);
/*    */     
/* 38 */     double d4 = paramahb.s.nextDouble() * 0.1D + 0.2D;
/* 39 */     localxk.v = (paramcr.c() * d4);
/* 40 */     localxk.w = 0.20000000298023224D;
/* 41 */     localxk.x = (paramcr.e() * d4);
/*    */     
/* 43 */     localxk.v += paramahb.s.nextGaussian() * 0.007499999832361937D * paramInt;
/* 44 */     localxk.w += paramahb.s.nextGaussian() * 0.007499999832361937D * paramInt;
/* 45 */     localxk.x += paramahb.s.nextGaussian() * 0.007499999832361937D * paramInt;
/*    */     
/* 47 */     paramahb.d(localxk);
/*    */   }
/*    */   
/*    */   protected void a(ck paramck) {
/* 51 */     paramck.k().c(1000, paramck.d(), paramck.e(), paramck.f(), 0);
/*    */   }
/*    */   
/*    */   protected void a(ck paramck, cr paramcr) {
/* 55 */     paramck.k().c(2000, paramck.d(), paramck.e(), paramck.f(), a(paramcr));
/*    */   }
/*    */   
/*    */   private int a(cr paramcr) {
/* 59 */     return paramcr.c() + 1 + (paramcr.e() + 1) * 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */