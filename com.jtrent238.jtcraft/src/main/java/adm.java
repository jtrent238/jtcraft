/*    */ 
/*    */ 
/*    */ 
/*    */ public class adm
/*    */   extends adb
/*    */ {
/*    */   public adm()
/*    */   {
/*  9 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, sv paramsv)
/*    */   {
/* 14 */     if (!paramadd.u()) { return false;
/*    */     }
/* 16 */     if ((paramsv instanceof sw)) {
/* 17 */       sw localsw = (sw)paramsv;
/* 18 */       localsw.a(paramadd.s());
/* 19 */       localsw.bF();
/* 20 */       paramadd.b -= 1;
/* 21 */       return true;
/*    */     }
/*    */     
/* 24 */     return super.a(paramadd, paramyz, paramsv);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */