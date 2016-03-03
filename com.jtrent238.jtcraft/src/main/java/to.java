/*    */ public class to extends tk
/*    */ {
/*    */   private final double a;
/*    */   private final double b;
/*    */   private String c;
/*    */   
/*    */   public to(String paramString, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/*  9 */     super(paramString, paramDouble1);
/* 10 */     this.a = paramDouble2;
/* 11 */     this.b = paramDouble3;
/*    */     
/* 13 */     if (paramDouble2 > paramDouble3) throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
/* 14 */     if (paramDouble1 < paramDouble2) throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
/* 15 */     if (paramDouble1 > paramDouble3) { throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public to a(String paramString)
/*    */   {
/* 27 */     this.c = paramString;
/* 28 */     return this;
/*    */   }
/*    */   
/*    */   public String f() {
/* 32 */     return this.c;
/*    */   }
/*    */   
/*    */   public double a(double paramDouble)
/*    */   {
/* 37 */     if (paramDouble < this.a) paramDouble = this.a;
/* 38 */     if (paramDouble > this.b) { paramDouble = this.b;
/*    */     }
/* 40 */     return paramDouble;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */