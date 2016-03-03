/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ael
/*    */   extends adb
/*    */ {
/*    */   public ael()
/*    */   {
/* 10 */     e(1);
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 15 */     paramyz.b(paramadd);
/* 16 */     return paramadd;
/*    */   }
/*    */   
/*    */   public boolean s()
/*    */   {
/* 21 */     return true;
/*    */   }
/*    */   
/*    */   public static boolean a(dh paramdh)
/*    */   {
/* 26 */     if (paramdh == null) {
/* 27 */       return false;
/*    */     }
/* 29 */     if (!paramdh.b("pages", 9)) {
/* 30 */       return false;
/*    */     }
/*    */     
/* 33 */     dq localdq = paramdh.c("pages", 8);
/* 34 */     for (int i = 0; i < localdq.c(); i++) {
/* 35 */       String str = localdq.f(i);
/*    */       
/* 37 */       if (str == null) {
/* 38 */         return false;
/*    */       }
/* 40 */       if (str.length() > 256) {
/* 41 */         return false;
/*    */       }
/*    */     }
/*    */     
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ael.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */