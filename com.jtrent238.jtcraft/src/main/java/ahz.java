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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ahz
/*    */ {
/* 18 */   public float[] a = new float['Ā'];
/* 19 */   public ahu[] b = new ahu['Ā'];
/*    */   public int c;
/*    */   public int d;
/*    */   public long e;
/*    */   
/* 24 */   public ahz(ahy paramahy, int paramInt1, int paramInt2) { this.c = paramInt1;
/* 25 */     this.d = paramInt2;
/* 26 */     ahy.a(paramahy).a(this.a, paramInt1 << 4, paramInt2 << 4, 16, 16);
/* 27 */     ahy.a(paramahy).a(this.b, paramInt1 << 4, paramInt2 << 4, 16, 16, false);
/*    */   }
/*    */   
/*    */   public ahu a(int paramInt1, int paramInt2) {
/* 31 */     return this.b[(paramInt1 & 0xF | (paramInt2 & 0xF) << 4)];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */