/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acw
/*    */   extends adb
/*    */ {
/*    */   public acw()
/*    */   {
/* 10 */     this.h = 1;
/* 11 */     f(64);
/* 12 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 17 */     if (paramInt4 == 0) paramInt2--;
/* 18 */     if (paramInt4 == 1) paramInt2++;
/* 19 */     if (paramInt4 == 2) paramInt3--;
/* 20 */     if (paramInt4 == 3) paramInt3++;
/* 21 */     if (paramInt4 == 4) paramInt1--;
/* 22 */     if (paramInt4 == 5) { paramInt1++;
/*    */     }
/* 24 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*    */     }
/* 26 */     if (paramahb.a(paramInt1, paramInt2, paramInt3).o() == awt.a) {
/* 27 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "fire.ignite", 1.0F, g.nextFloat() * 0.4F + 0.8F);
/* 28 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.ab);
/*    */     }
/*    */     
/* 31 */     paramadd.a(1, paramyz);
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */