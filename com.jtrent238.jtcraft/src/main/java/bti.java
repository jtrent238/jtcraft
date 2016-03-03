/*    */ 
/*    */ 
/*    */ public class bti
/*    */ {
/*    */   private final bqx a;
/*    */   private final boolean b;
/*    */   private double c;
/*    */   private double d;
/*    */   
/*    */   public bti(bqx parambqx, double paramDouble1, double paramDouble2, boolean paramBoolean)
/*    */   {
/* 12 */     this.a = parambqx;
/* 13 */     this.c = paramDouble1;
/* 14 */     this.d = paramDouble2;
/* 15 */     this.b = paramBoolean;
/*    */   }
/*    */   
/*    */   public bti(bti parambti) {
/* 19 */     this.a = parambti.a;
/* 20 */     this.c = parambti.c;
/* 21 */     this.d = parambti.d;
/* 22 */     this.b = parambti.b;
/*    */   }
/*    */   
/*    */   public bqx a() {
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public double b() {
/* 30 */     return this.c;
/*    */   }
/*    */   
/*    */   public void a(double paramDouble) {
/* 34 */     this.c = paramDouble;
/*    */   }
/*    */   
/*    */   public double c() {
/* 38 */     return this.d;
/*    */   }
/*    */   
/*    */   public void b(double paramDouble) {
/* 42 */     this.d = paramDouble;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */