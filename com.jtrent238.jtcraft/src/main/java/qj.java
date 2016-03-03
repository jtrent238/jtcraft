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
/*    */ public final class qj
/*    */   implements Comparable
/*    */ {
/*    */   public double a;
/*    */   public double b;
/*    */   public String c;
/*    */   
/*    */   public qj(String paramString, double paramDouble1, double paramDouble2)
/*    */   {
/* 22 */     this.c = paramString;
/* 23 */     this.a = paramDouble1;
/* 24 */     this.b = paramDouble2;
/*    */   }
/*    */   
/*    */   public int a(qj paramqj)
/*    */   {
/* 29 */     if (paramqj.a < this.a) return -1;
/* 30 */     if (paramqj.a > this.a) return 1;
/* 31 */     return paramqj.c.compareTo(this.c);
/*    */   }
/*    */   
/*    */   public int a() {
/* 35 */     return (this.c.hashCode() & 0xAAAAAA) + 4473924;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */