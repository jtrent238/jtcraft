/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abi
/*    */   extends adb
/*    */ {
/*    */   private aji a;
/*    */   
/*    */   public abi(aji paramaji)
/*    */   {
/* 14 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 19 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 20 */     if ((localaji == ajn.aC) && ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7) < 1)) {
/* 21 */       paramInt4 = 1;
/* 22 */     } else if ((localaji != ajn.bd) && (localaji != ajn.H) && (localaji != ajn.I))
/*    */     {
/* 24 */       if (paramInt4 == 0) paramInt2--;
/* 25 */       if (paramInt4 == 1) paramInt2++;
/* 26 */       if (paramInt4 == 2) paramInt3--;
/* 27 */       if (paramInt4 == 3) paramInt3++;
/* 28 */       if (paramInt4 == 4) paramInt1--;
/* 29 */       if (paramInt4 == 5) { paramInt1++;
/*    */       }
/*    */     }
/* 32 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) return false;
/* 33 */     if (paramadd.b == 0) { return false;
/*    */     }
/* 35 */     if (paramahb.a(this.a, paramInt1, paramInt2, paramInt3, false, paramInt4, null, paramadd)) {
/* 36 */       int i = this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, 0);
/* 37 */       if (paramahb.d(paramInt1, paramInt2, paramInt3, this.a, i, 3))
/*    */       {
/*    */ 
/*    */ 
/* 41 */         if (paramahb.a(paramInt1, paramInt2, paramInt3) == this.a) {
/* 42 */           this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramadd);
/* 43 */           this.a.e(paramahb, paramInt1, paramInt2, paramInt3, i);
/*    */         }
/* 45 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
/* 46 */         paramadd.b -= 1;
/*    */       }
/*    */     }
/* 49 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */