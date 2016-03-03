/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aec
/*    */   extends abe
/*    */ {
/*    */   public aec(aji paramaji1, aji paramaji2)
/*    */   {
/* 11 */     super(paramaji1, paramaji2);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 16 */     if (paramadd.b == 0) return false;
/* 17 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*    */     }
/* 19 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 20 */     if (localaji == ajn.aC) {
/* 21 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 22 */       int j = i & 0x7;
/*    */       
/* 24 */       if ((j <= 6) && 
/* 25 */         (paramahb.b(this.a.a(paramahb, paramInt1, paramInt2, paramInt3))) && (paramahb.a(paramInt1, paramInt2, paramInt3, j + 1 | i & 0xFFFFFFF8, 2))) {
/* 26 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
/* 27 */         paramadd.b -= 1;
/* 28 */         return true;
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 33 */     return super.a(paramadd, paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */