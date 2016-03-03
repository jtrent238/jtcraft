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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class att
/*    */ {
/*    */   public Class a;
/*    */   public final int b;
/*    */   public int c;
/*    */   public int d;
/*    */   public boolean e;
/*    */   
/*    */   public att(Class paramClass, int paramInt1, int paramInt2, boolean paramBoolean)
/*    */   {
/* 46 */     this.a = paramClass;
/* 47 */     this.b = paramInt1;
/* 48 */     this.d = paramInt2;
/* 49 */     this.e = paramBoolean;
/*    */   }
/*    */   
/*    */   public att(Class paramClass, int paramInt1, int paramInt2) {
/* 53 */     this(paramClass, paramInt1, paramInt2, false);
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt) {
/* 57 */     return (this.d == 0) || (this.c < this.d);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 61 */     return (this.d == 0) || (this.c < this.d);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\att.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */