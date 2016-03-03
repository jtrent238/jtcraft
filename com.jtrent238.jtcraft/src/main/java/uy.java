/*    */ 
/*    */ public class uy
/*    */   extends uc
/*    */ {
/*    */   boolean i;
/*    */   int j;
/*    */   
/*    */   public uy(sw paramsw, boolean paramBoolean)
/*    */   {
/* 10 */     super(paramsw);
/* 11 */     this.a = paramsw;
/* 12 */     this.i = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 17 */     return (this.i) && (this.j > 0) && (super.b());
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 22 */     this.j = 20;
/* 23 */     this.e.a(this.a.o, this.b, this.c, this.d, true);
/*    */   }
/*    */   
/*    */   public void d()
/*    */   {
/* 28 */     if (this.i) {
/* 29 */       this.e.a(this.a.o, this.b, this.c, this.d, false);
/*    */     }
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 35 */     this.j -= 1;
/* 36 */     super.e();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */