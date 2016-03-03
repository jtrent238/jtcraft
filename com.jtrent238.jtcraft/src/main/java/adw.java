/*    */ 
/*    */ 
/*    */ 
/*    */ public class adw
/*    */   extends adb
/*    */ {
/*    */   private aji a;
/*    */   private aji b;
/*    */   
/*    */   public adw(aji paramaji1, aji paramaji2)
/*    */   {
/* 12 */     this.a = paramaji1;
/* 13 */     this.b = paramaji2;
/* 14 */     a(abt.l);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 19 */     if (paramInt4 != 1) { return false;
/*    */     }
/* 21 */     if ((!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) || (!paramyz.a(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramadd))) { return false;
/*    */     }
/* 23 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3) == this.b) && (paramahb.c(paramInt1, paramInt2 + 1, paramInt3))) {
/* 24 */       paramahb.b(paramInt1, paramInt2 + 1, paramInt3, this.a);
/* 25 */       paramadd.b -= 1;
/* 26 */       return true;
/*    */     }
/* 28 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */