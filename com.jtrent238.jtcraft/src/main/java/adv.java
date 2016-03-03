/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adv
/*    */   extends acx
/*    */ {
/*    */   private aji b;
/*    */   private aji c;
/*    */   
/*    */   public adv(int paramInt, float paramFloat, aji paramaji1, aji paramaji2)
/*    */   {
/* 14 */     super(paramInt, paramFloat, false);
/*    */     
/* 16 */     this.b = paramaji1;
/* 17 */     this.c = paramaji2;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 22 */     if (paramInt4 != 1) { return false;
/*    */     }
/* 24 */     if ((!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) || (!paramyz.a(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramadd))) { return false;
/*    */     }
/* 26 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3) == this.c) && (paramahb.c(paramInt1, paramInt2 + 1, paramInt3))) {
/* 27 */       paramahb.b(paramInt1, paramInt2 + 1, paramInt3, this.b);
/* 28 */       paramadd.b -= 1;
/* 29 */       return true;
/*    */     }
/* 31 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */