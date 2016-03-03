/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acz
/*    */   extends adb
/*    */ {
/*    */   private final Class a;
/*    */   
/*    */   public acz(Class paramClass)
/*    */   {
/* 13 */     this.a = paramClass;
/* 14 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 19 */     if (paramInt4 == 0) return false;
/* 20 */     if (paramInt4 == 1) { return false;
/*    */     }
/* 22 */     int i = p.e[paramInt4];
/*    */     
/* 24 */     ss localss = a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*    */     
/* 26 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) return false;
/* 27 */     if ((localss != null) && (localss.e())) {
/* 28 */       if (!paramahb.E) {
/* 29 */         paramahb.d(localss);
/*    */       }
/* 31 */       paramadd.b -= 1;
/*    */     }
/* 33 */     return true;
/*    */   }
/*    */   
/*    */   private ss a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 37 */     if (this.a == tb.class)
/* 38 */       return new tb(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/* 39 */     if (this.a == st.class) {
/* 40 */       return new st(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     }
/* 42 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */