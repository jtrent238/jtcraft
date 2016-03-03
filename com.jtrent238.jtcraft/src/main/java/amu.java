/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amu
/*    */   extends ajd
/*    */ {
/*    */   private amv a;
/*    */   
/*    */   protected amu(String paramString, awt paramawt, amv paramamv)
/*    */   {
/* 19 */     super(paramString, paramawt);
/* 20 */     this.a = paramamv;
/*    */   }
/*    */   
/*    */   protected int d(int paramInt)
/*    */   {
/* 25 */     return paramInt > 0 ? 1 : 0;
/*    */   }
/*    */   
/*    */   protected int c(int paramInt)
/*    */   {
/* 30 */     return paramInt == 1 ? 15 : 0;
/*    */   }
/*    */   
/*    */   protected int e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 35 */     List localList = null;
/*    */     
/* 37 */     if (this.a == amv.a) localList = paramahb.b(null, a(paramInt1, paramInt2, paramInt3));
/* 38 */     if (this.a == amv.b) localList = paramahb.a(sv.class, a(paramInt1, paramInt2, paramInt3));
/* 39 */     if (this.a == amv.c) { localList = paramahb.a(yz.class, a(paramInt1, paramInt2, paramInt3));
/*    */     }
/* 41 */     if ((localList != null) && (!localList.isEmpty())) {
/* 42 */       for (sa localsa : localList) {
/* 43 */         if (!localsa.az()) {
/* 44 */           return 15;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 49 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */