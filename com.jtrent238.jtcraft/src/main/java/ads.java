/*    */ 
/*    */ 
/*    */ 
/*    */ public class ads
/*    */   extends adb
/*    */ {
/*    */   public ads()
/*    */   {
/*  9 */     a(abt.d);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 14 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.aC) {
/* 15 */       if (paramInt4 == 0) paramInt2--;
/* 16 */       if (paramInt4 == 1) paramInt2++;
/* 17 */       if (paramInt4 == 2) paramInt3--;
/* 18 */       if (paramInt4 == 3) paramInt3++;
/* 19 */       if (paramInt4 == 4) paramInt1--;
/* 20 */       if (paramInt4 == 5) paramInt1++;
/* 21 */       if (!paramahb.c(paramInt1, paramInt2, paramInt3)) return false;
/*    */     }
/* 23 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) return false;
/* 24 */     if (ajn.af.c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 25 */       paramadd.b -= 1;
/* 26 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.af);
/*    */     }
/*    */     
/* 29 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ads.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */