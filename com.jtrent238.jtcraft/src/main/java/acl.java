/*    */ 
/*    */ 
/*    */ 
/*    */ public class acl
/*    */   extends abs
/*    */ {
/*    */   protected acl()
/*    */   {
/*  9 */     a(abt.f);
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 14 */     add localadd = new add(ade.aY, 1, paramahb.b("map"));
/*    */     
/* 16 */     String str = "map_" + localadd.k();
/* 17 */     ayi localayi = new ayi(str);
/* 18 */     paramahb.a(str, localayi);
/*    */     
/* 20 */     localayi.d = 0;
/* 21 */     int i = 128 * (1 << localayi.d);
/* 22 */     localayi.a = ((int)(Math.round(paramyz.s / i) * i));
/* 23 */     localayi.b = ((int)(Math.round(paramyz.u / i) * i));
/* 24 */     localayi.c = ((byte)paramahb.t.i);
/*    */     
/* 26 */     localayi.c();
/*    */     
/* 28 */     paramadd.b -= 1;
/* 29 */     if (paramadd.b <= 0) {
/* 30 */       return localadd;
/*    */     }
/* 32 */     if (!paramyz.bm.a(localadd.m())) {
/* 33 */       paramyz.a(localadd, false);
/*    */     }
/*    */     
/*    */ 
/* 37 */     return paramadd;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */