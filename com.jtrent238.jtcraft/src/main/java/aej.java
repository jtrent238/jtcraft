/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aej
/*    */   extends abr
/*    */ {
/*    */   public aej(aji paramaji)
/*    */   {
/* 13 */     super(paramaji, false);
/*    */   }
/*    */   
/*    */ 
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 19 */     azu localazu = a(paramahb, paramyz, true);
/* 20 */     if (localazu == null) { return paramadd;
/*    */     }
/* 22 */     if (localazu.a == azv.b) {
/* 23 */       int i = localazu.b;
/* 24 */       int j = localazu.c;
/* 25 */       int k = localazu.d;
/*    */       
/* 27 */       if (!paramahb.a(paramyz, i, j, k)) {
/* 28 */         return paramadd;
/*    */       }
/* 30 */       if (!paramyz.a(i, j, k, localazu.e, paramadd)) { return paramadd;
/*    */       }
/* 32 */       if ((paramahb.a(i, j, k).o() == awt.h) && (paramahb.e(i, j, k) == 0) && (paramahb.c(i, j + 1, k))) {
/* 33 */         paramahb.b(i, j + 1, k, ajn.bi);
/* 34 */         if (!paramyz.bE.d) {
/* 35 */           paramadd.b -= 1;
/*    */         }
/*    */       }
/*    */     }
/* 39 */     return paramadd;
/*    */   }
/*    */   
/*    */   public int a(add paramadd, int paramInt)
/*    */   {
/* 44 */     return ajn.bi.i(paramadd.k());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */