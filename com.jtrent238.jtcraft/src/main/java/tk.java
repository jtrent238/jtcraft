/*    */ public abstract class tk implements th
/*    */ {
/*    */   private final String a;
/*    */   private final double b;
/*    */   private boolean c;
/*    */   
/*    */   protected tk(String paramString, double paramDouble)
/*    */   {
/*  9 */     this.a = paramString;
/* 10 */     this.b = paramDouble;
/*    */     
/* 12 */     if (paramString == null) throw new IllegalArgumentException("Name cannot be null!");
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public double b()
/*    */   {
/* 22 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean c()
/*    */   {
/* 27 */     return this.c;
/*    */   }
/*    */   
/*    */   public tk a(boolean paramBoolean) {
/* 31 */     this.c = paramBoolean;
/* 32 */     return this;
/*    */   }
/*    */   
/*    */   public int hashCode()
/*    */   {
/* 37 */     return this.a.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\tk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */