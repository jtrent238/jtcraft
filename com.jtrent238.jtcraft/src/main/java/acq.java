/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acq
/*    */   extends adb
/*    */ {
/*    */   public acq()
/*    */   {
/* 10 */     a(abt.f);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 15 */     if (paramahb.E) {
/* 16 */       return true;
/*    */     }
/*    */     
/* 19 */     if (paramInt4 == 0) paramInt2--;
/* 20 */     if (paramInt4 == 1) paramInt2++;
/* 21 */     if (paramInt4 == 2) paramInt3--;
/* 22 */     if (paramInt4 == 3) paramInt3++;
/* 23 */     if (paramInt4 == 4) paramInt1--;
/* 24 */     if (paramInt4 == 5) { paramInt1++;
/*    */     }
/* 26 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*    */     }
/* 28 */     if (paramahb.a(paramInt1, paramInt2, paramInt3).o() == awt.a) {
/* 29 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "fire.ignite", 1.0F, g.nextFloat() * 0.4F + 0.8F);
/* 30 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.ab);
/*    */     }
/* 32 */     if (!paramyz.bE.d) {
/* 33 */       paramadd.b -= 1;
/*    */     }
/* 35 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */