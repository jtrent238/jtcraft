/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adf
/*    */   extends adb
/*    */ {
/*    */   public adf()
/*    */   {
/* 14 */     a(abt.i);
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 20 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 21 */     if (localaji.b() == 11) {
/* 22 */       if (paramahb.E) {
/* 23 */         return true;
/*    */       }
/*    */       
/* 26 */       a(paramyz, paramahb, paramInt1, paramInt2, paramInt3);
/* 27 */       return true;
/*    */     }
/* 29 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public static boolean a(yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 35 */     su localsu = su.b(paramahb, paramInt1, paramInt2, paramInt3);
/*    */     
/*    */ 
/* 38 */     boolean bool = false;
/* 39 */     double d = 7.0D;
/* 40 */     List localList = paramahb.a(sw.class, azt.a(paramInt1 - d, paramInt2 - d, paramInt3 - d, paramInt1 + d, paramInt2 + d, paramInt3 + d));
/* 41 */     if (localList != null) {
/* 42 */       for (sw localsw : localList) {
/* 43 */         if ((localsw.bN()) && (localsw.bO() == paramyz)) {
/* 44 */           if (localsu == null) {
/* 45 */             localsu = su.a(paramahb, paramInt1, paramInt2, paramInt3);
/*    */           }
/* 47 */           localsw.b(localsu, true);
/* 48 */           bool = true;
/*    */         }
/*    */       }
/*    */     }
/* 52 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */