/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abl
/*    */   extends adb
/*    */ {
/*    */   public abl()
/*    */   {
/* 12 */     a(abt.k);
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 17 */     return ade.bn.b_(0);
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 22 */     azu localazu = a(paramahb, paramyz, true);
/* 23 */     if (localazu == null) { return paramadd;
/*    */     }
/* 25 */     if (localazu.a == azv.b) {
/* 26 */       int i = localazu.b;
/* 27 */       int j = localazu.c;
/* 28 */       int k = localazu.d;
/*    */       
/* 30 */       if (!paramahb.a(paramyz, i, j, k)) {
/* 31 */         return paramadd;
/*    */       }
/* 33 */       if (!paramyz.a(i, j, k, localazu.e, paramadd)) {
/* 34 */         return paramadd;
/*    */       }
/* 36 */       if (paramahb.a(i, j, k).o() == awt.h)
/*    */       {
/* 38 */         paramadd.b -= 1;
/* 39 */         if (paramadd.b <= 0) {
/* 40 */           return new add(ade.bn);
/*    */         }
/* 42 */         if (!paramyz.bm.a(new add(ade.bn))) {
/* 43 */           paramyz.a(new add(ade.bn, 1, 0), false);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 49 */     return paramadd;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */