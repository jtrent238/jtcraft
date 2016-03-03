/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adx
/*    */   extends adb
/*    */ {
/*    */   public adx()
/*    */   {
/* 12 */     e(1);
/* 13 */     f(238);
/* 14 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, sv paramsv)
/*    */   {
/* 19 */     if ((paramaji.o() == awt.j) || (paramaji == ajn.G) || (paramaji == ajn.H) || (paramaji == ajn.bd) || (paramaji == ajn.bD)) {
/* 20 */       paramadd.a(1, paramsv);
/* 21 */       return true;
/*    */     }
/* 23 */     return super.a(paramadd, paramahb, paramaji, paramInt1, paramInt2, paramInt3, paramsv);
/*    */   }
/*    */   
/*    */   public boolean b(aji paramaji)
/*    */   {
/* 28 */     return (paramaji == ajn.G) || (paramaji == ajn.af) || (paramaji == ajn.bD);
/*    */   }
/*    */   
/*    */   public float a(add paramadd, aji paramaji)
/*    */   {
/* 33 */     if ((paramaji == ajn.G) || (paramaji.o() == awt.j)) {
/* 34 */       return 15.0F;
/*    */     }
/* 36 */     if (paramaji == ajn.L) {
/* 37 */       return 5.0F;
/*    */     }
/* 39 */     return super.a(paramadd, paramaji);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */