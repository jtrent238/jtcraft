/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abg
/*    */   extends adb
/*    */ {
/*    */   public abg()
/*    */   {
/* 12 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 17 */     if (paramahb.E) { return true;
/*    */     }
/* 19 */     if (paramInt4 != 1) {
/* 20 */       return false;
/*    */     }
/*    */     
/*    */ 
/* 24 */     paramInt2++;
/*    */     
/* 26 */     ajh localajh = (ajh)ajn.C;
/*    */     
/* 28 */     int i = qh.c(paramyz.y * 4.0F / 360.0F + 0.5D) & 0x3;
/* 29 */     int j = 0;
/* 30 */     int k = 0;
/*    */     
/* 32 */     if (i == 0) k = 1;
/* 33 */     if (i == 1) j = -1;
/* 34 */     if (i == 2) k = -1;
/* 35 */     if (i == 3) { j = 1;
/*    */     }
/* 37 */     if ((!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) || (!paramyz.a(paramInt1 + j, paramInt2, paramInt3 + k, paramInt4, paramadd))) { return false;
/*    */     }
/* 39 */     if ((paramahb.c(paramInt1, paramInt2, paramInt3)) && (paramahb.c(paramInt1 + j, paramInt2, paramInt3 + k)) && (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (ahb.a(paramahb, paramInt1 + j, paramInt2 - 1, paramInt3 + k)))
/*    */     {
/* 41 */       paramahb.d(paramInt1, paramInt2, paramInt3, localajh, i, 3);
/*    */       
/* 43 */       if (paramahb.a(paramInt1, paramInt2, paramInt3) == localajh) {
/* 44 */         paramahb.d(paramInt1 + j, paramInt2, paramInt3 + k, localajh, i + 8, 3);
/*    */       }
/*    */       
/* 47 */       paramadd.b -= 1;
/* 48 */       return true;
/*    */     }
/*    */     
/* 51 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */