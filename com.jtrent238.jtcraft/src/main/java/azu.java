/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class azu
/*    */ {
/*    */   public azv a;
/*    */   public int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public int e;
/*    */   public azw f;
/*    */   public sa g;
/*    */   
/*    */   public azu(int paramInt1, int paramInt2, int paramInt3, int paramInt4, azw paramazw)
/*    */   {
/* 19 */     this(paramInt1, paramInt2, paramInt3, paramInt4, paramazw, true);
/*    */   }
/*    */   
/*    */   public azu(int paramInt1, int paramInt2, int paramInt3, int paramInt4, azw paramazw, boolean paramBoolean) {
/* 23 */     this.a = (paramBoolean ? azv.b : azv.a);
/* 24 */     this.b = paramInt1;
/* 25 */     this.c = paramInt2;
/* 26 */     this.d = paramInt3;
/* 27 */     this.e = paramInt4;
/* 28 */     this.f = azw.a(paramazw.a, paramazw.b, paramazw.c);
/*    */   }
/*    */   
/*    */   public azu(sa paramsa) {
/* 32 */     this(paramsa, azw.a(paramsa.s, paramsa.t, paramsa.u));
/*    */   }
/*    */   
/*    */   public azu(sa paramsa, azw paramazw) {
/* 36 */     this.a = azv.c;
/* 37 */     this.g = paramsa;
/* 38 */     this.f = paramazw;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public String toString()
/*    */   {
/* 50 */     return "HitResult{type=" + this.a + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + ", f=" + this.e + ", pos=" + this.f + ", entity=" + this.g + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */