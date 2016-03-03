/*    */ 
/*    */ public class agu
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   
/*    */   public agu(int paramInt1, int paramInt2)
/*    */   {
/*  9 */     this.a = paramInt1;
/* 10 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */   public static long a(int paramInt1, int paramInt2) {
/* 14 */     return paramInt1 & 0xFFFFFFFF | (paramInt2 & 0xFFFFFFFF) << 32;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int hashCode()
/*    */   {
/* 23 */     int i = 1664525 * this.a + 1013904223;
/* 24 */     int j = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
/* 25 */     return i ^ j;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject)
/*    */   {
/* 30 */     if (this == paramObject) {
/* 31 */       return true;
/*    */     }
/*    */     
/* 34 */     if ((paramObject instanceof agu)) {
/* 35 */       agu localagu = (agu)paramObject;
/*    */       
/* 37 */       return (this.a == localagu.a) && (this.b == localagu.b);
/*    */     }
/*    */     
/* 40 */     return false;
/*    */   }
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
/*    */   public int a()
/*    */   {
/* 54 */     return (this.a << 4) + 8;
/*    */   }
/*    */   
/*    */   public int b() {
/* 58 */     return (this.b << 4) + 8;
/*    */   }
/*    */   
/*    */   public agt a(int paramInt) {
/* 62 */     return new agt(a(), paramInt, b());
/*    */   }
/*    */   
/*    */   public String toString() {
/* 66 */     return "[" + this.a + ", " + this.b + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */