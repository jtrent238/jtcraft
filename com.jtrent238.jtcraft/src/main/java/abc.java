/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class abc
/*    */   extends cm
/*    */ {
/*    */   protected add b(ck paramck, add paramadd)
/*    */   {
/* 37 */     cr localcr = akm.b(paramck.h());
/* 38 */     int i = paramck.d() + localcr.c();
/* 39 */     int j = paramck.e() + localcr.d();
/* 40 */     int k = paramck.f() + localcr.e();
/* 41 */     azt localazt = azt.a(i, j, k, i + 1, j + 1, k + 1);
/* 42 */     List localList = paramck.k().a(sv.class, localazt, new sp(paramadd));
/*    */     
/* 44 */     if (localList.size() > 0) {
/* 45 */       sv localsv = (sv)localList.get(0);
/* 46 */       int m = (localsv instanceof yz) ? 1 : 0;
/* 47 */       int n = sw.b(paramadd);
/* 48 */       add localadd = paramadd.m();
/* 49 */       localadd.b = 1;
/* 50 */       localsv.c(n - m, localadd);
/* 51 */       if ((localsv instanceof sw)) ((sw)localsv).a(n, 2.0F);
/* 52 */       paramadd.b -= 1;
/* 53 */       return paramadd;
/*    */     }
/* 55 */     return super.b(paramck, paramadd);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */