/*    */ 
/*    */ 
/*    */ 
/*    */ public class ast
/*    */ {
/*    */   private aji a;
/*  7 */   private int b = 1;
/*    */   private int c;
/*    */   private int d;
/*    */   
/*    */   public ast(int paramInt, aji paramaji) {
/* 12 */     this.b = paramInt;
/* 13 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public ast(int paramInt1, aji paramaji, int paramInt2) {
/* 17 */     this(paramInt1, paramaji);
/* 18 */     this.c = paramInt2;
/*    */   }
/*    */   
/*    */   public int a() {
/* 22 */     return this.b;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public aji b()
/*    */   {
/* 30 */     return this.a;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int c()
/*    */   {
/* 38 */     return this.c;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public int d()
/*    */   {
/* 46 */     return this.d;
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 50 */     this.d = paramInt;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 55 */     String str = Integer.toString(aji.b(this.a));
/*    */     
/* 57 */     if (this.b > 1) {
/* 58 */       str = this.b + "x" + str;
/*    */     }
/* 60 */     if (this.c > 0) {
/* 61 */       str = str + ":" + this.c;
/*    */     }
/*    */     
/* 64 */     return str;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */