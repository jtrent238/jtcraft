/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alk
/*    */   extends aji
/*    */ {
/*    */   private boolean a;
/*    */   private String b;
/*    */   
/*    */   protected alk(String paramString, awt paramawt, boolean paramBoolean)
/*    */   {
/* 13 */     super(paramawt);
/* 14 */     this.a = paramBoolean;
/* 15 */     this.b = paramString;
/*    */   }
/*    */   
/*    */   public boolean c()
/*    */   {
/* 20 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 25 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 26 */     if ((this == ajn.w) || (this == ajn.cn)) {
/* 27 */       if (paramahl.e(paramInt1, paramInt2, paramInt3) != paramahl.e(paramInt1 - q.b[paramInt4], paramInt2 - q.c[paramInt4], paramInt3 - q.d[paramInt4])) {
/* 28 */         return true;
/*    */       }
/* 30 */       if (localaji == this) {
/* 31 */         return false;
/*    */       }
/*    */     }
/* 34 */     if ((!this.a) && (localaji == this)) return false;
/* 35 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(rg paramrg)
/*    */   {
/* 44 */     this.L = paramrg.a(this.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */