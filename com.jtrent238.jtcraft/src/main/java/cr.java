/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cr
/*    */ {
/*    */   private final int g;
/*    */   private final int h;
/*    */   private final int i;
/*    */   private final int j;
/*    */   private final int k;
/*    */   private static final cr[] l;
/*    */   
/*    */   static
/*    */   {
/* 17 */     l = new cr[6];
/*    */     
/* 19 */     for (cr localcr : values()) {
/* 20 */       l[localcr.g] = localcr;
/*    */     }
/*    */   }
/*    */   
/*    */   private cr(int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 25 */     this.g = paramInt2;
/* 26 */     this.h = paramInt3;
/* 27 */     this.i = paramInt4;
/* 28 */     this.j = paramInt5;
/* 29 */     this.k = paramInt6;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int c()
/*    */   {
/* 41 */     return this.i;
/*    */   }
/*    */   
/*    */   public int d() {
/* 45 */     return this.j;
/*    */   }
/*    */   
/*    */   public int e() {
/* 49 */     return this.k;
/*    */   }
/*    */   
/*    */   public static cr a(int paramInt) {
/* 53 */     return l[(paramInt % l.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */