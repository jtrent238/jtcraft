/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adz
/*    */   extends adb
/*    */ {
/*    */   public adz()
/*    */   {
/* 12 */     this.h = 16;
/* 13 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 18 */     if (paramInt4 == 0) return false;
/* 19 */     if (!paramahb.a(paramInt1, paramInt2, paramInt3).o().a()) { return false;
/*    */     }
/* 21 */     if (paramInt4 == 1) { paramInt2++;
/*    */     }
/* 23 */     if (paramInt4 == 2) paramInt3--;
/* 24 */     if (paramInt4 == 3) paramInt3++;
/* 25 */     if (paramInt4 == 4) paramInt1--;
/* 26 */     if (paramInt4 == 5) { paramInt1++;
/*    */     }
/* 28 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) return false;
/* 29 */     if (!ajn.an.c(paramahb, paramInt1, paramInt2, paramInt3)) { return false;
/*    */     }
/* 31 */     if (paramahb.E) {
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     if (paramInt4 == 1) {
/* 36 */       int i = qh.c((paramyz.y + 180.0F) * 16.0F / 360.0F + 0.5D) & 0xF;
/* 37 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.an, i, 3);
/*    */     } else {
/* 39 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.as, paramInt4, 3);
/*    */     }
/*    */     
/* 42 */     paramadd.b -= 1;
/* 43 */     apm localapm = (apm)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 44 */     if (localapm != null) paramyz.a(localapm);
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */