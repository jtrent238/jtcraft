/*    */ public abstract class bpp
/*    */   implements bqh
/*    */ {
/*  4 */   protected int a = -1;
/*    */   
/*    */   public int b()
/*    */   {
/*  8 */     if (this.a == -1) {
/*  9 */       this.a = bqi.a();
/*    */     }
/*    */     
/* 12 */     return this.a;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 17 */     if (this.a != -1) {
/* 18 */       bqi.a(this.a);
/* 19 */       this.a = -1;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */