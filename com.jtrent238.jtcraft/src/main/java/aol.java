/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aol
/*    */   extends ajd
/*    */ {
/*    */   private final int a;
/*    */   
/*    */   protected aol(String paramString, awt paramawt, int paramInt)
/*    */   {
/* 14 */     super(paramString, paramawt);
/*    */     
/* 16 */     this.a = paramInt;
/*    */   }
/*    */   
/*    */   protected int e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 21 */     int i = Math.min(paramahb.a(sa.class, a(paramInt1, paramInt2, paramInt3)).size(), this.a);
/*    */     
/* 23 */     if (i <= 0) {
/* 24 */       return 0;
/*    */     }
/* 26 */     float f = Math.min(this.a, i) / this.a;
/* 27 */     return qh.f(f * 15.0F);
/*    */   }
/*    */   
/*    */ 
/*    */   protected int c(int paramInt)
/*    */   {
/* 33 */     return paramInt;
/*    */   }
/*    */   
/*    */   protected int d(int paramInt)
/*    */   {
/* 38 */     return paramInt;
/*    */   }
/*    */   
/*    */   public int a(ahb paramahb)
/*    */   {
/* 43 */     return 10;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */