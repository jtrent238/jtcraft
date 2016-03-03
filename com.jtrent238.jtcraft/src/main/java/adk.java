/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class adk
/*    */   extends cm
/*    */ {
/* 12 */   private final cm b = new cm();
/*    */   
/*    */   public add b(ck paramck, add paramadd)
/*    */   {
/* 16 */     cr localcr = akm.b(paramck.h());
/* 17 */     ahb localahb = paramck.k();
/*    */     
/*    */ 
/*    */ 
/* 21 */     double d1 = paramck.a() + localcr.c() * 1.125F;
/* 22 */     double d2 = paramck.b() + localcr.d() * 1.125F;
/* 23 */     double d3 = paramck.c() + localcr.e() * 1.125F;
/*    */     
/* 25 */     int i = paramck.d() + localcr.c();
/* 26 */     int j = paramck.e() + localcr.d();
/* 27 */     int k = paramck.f() + localcr.e();
/* 28 */     aji localaji = localahb.a(i, j, k);
/*    */     
/*    */     double d4;
/* 31 */     if (aje.a(localaji)) {
/* 32 */       d4 = 0.0D;
/* 33 */     } else if ((localaji.o() == awt.a) && (aje.a(localahb.a(i, j - 1, k)))) {
/* 34 */       d4 = -1.0D;
/*    */     } else {
/* 36 */       return this.b.a(paramck, paramadd);
/*    */     }
/*    */     
/* 39 */     xl localxl = xl.a(localahb, d1, d2 + d4, d3, ((adj)paramadd.b()).a);
/* 40 */     if (paramadd.u()) {
/* 41 */       localxl.a(paramadd.s());
/*    */     }
/* 43 */     localahb.d(localxl);
/*    */     
/* 45 */     paramadd.a(1);
/* 46 */     return paramadd;
/*    */   }
/*    */   
/*    */   protected void a(ck paramck)
/*    */   {
/* 51 */     paramck.k().c(1000, paramck.d(), paramck.e(), paramck.f(), 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */