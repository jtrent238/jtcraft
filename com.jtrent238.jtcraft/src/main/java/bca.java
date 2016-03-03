/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bca
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private double c;
/*    */   private double d;
/*    */   private int e;
/*    */   
/*    */   public bca(bao parambao, int paramInt1, int paramInt2)
/*    */   {
/* 15 */     this.a = paramInt1;
/* 16 */     this.b = paramInt2;
/* 17 */     this.e = 1;
/*    */     
/* 19 */     boolean bool = parambao.b();
/* 20 */     int i = parambao.u.aI;
/* 21 */     if (i == 0) i = 1000;
/* 22 */     while ((this.e < i) && (this.a / (this.e + 1) >= 320) && (this.b / (this.e + 1) >= 240)) {
/* 23 */       this.e += 1;
/*    */     }
/* 25 */     if ((bool) && (this.e % 2 != 0) && (this.e != 1)) {
/* 26 */       this.e -= 1;
/*    */     }
/* 28 */     this.c = (this.a / this.e);
/* 29 */     this.d = (this.b / this.e);
/* 30 */     this.a = qh.f(this.c);
/* 31 */     this.b = qh.f(this.d);
/*    */   }
/*    */   
/*    */   public int a() {
/* 35 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 39 */     return this.b;
/*    */   }
/*    */   
/*    */   public double c() {
/* 43 */     return this.c;
/*    */   }
/*    */   
/*    */   public double d() {
/* 47 */     return this.d;
/*    */   }
/*    */   
/*    */   public int e() {
/* 51 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */