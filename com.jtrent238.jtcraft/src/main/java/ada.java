/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ada
/*    */   extends adb
/*    */ {
/*    */   protected adc a;
/*    */   
/*    */   public ada(adc paramadc)
/*    */   {
/* 13 */     this.a = paramadc;
/* 14 */     this.h = 1;
/* 15 */     f(paramadc.a());
/* 16 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 21 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*    */     }
/* 23 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 24 */     if ((paramInt4 != 0) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).o() == awt.a) && ((localaji1 == ajn.c) || (localaji1 == ajn.d))) {
/* 25 */       aji localaji2 = ajn.ak;
/* 26 */       paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, localaji2.H.e(), (localaji2.H.c() + 1.0F) / 2.0F, localaji2.H.d() * 0.8F);
/*    */       
/* 28 */       if (paramahb.E) return true;
/* 29 */       paramahb.b(paramInt1, paramInt2, paramInt3, localaji2);
/* 30 */       paramadd.a(1, paramyz);
/*    */       
/* 32 */       return true;
/*    */     }
/*    */     
/* 35 */     return false;
/*    */   }
/*    */   
/*    */   public boolean f()
/*    */   {
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   public String i() {
/* 44 */     return this.a.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */