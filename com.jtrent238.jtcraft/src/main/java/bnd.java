/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnd
/*    */   extends bok
/*    */ {
/*  8 */   private static final bqx a = new bqx("textures/entity/blaze.png");
/*    */   private int f;
/*    */   
/*    */   public bnd() {
/* 12 */     super(new bhd(), 0.5F);
/* 13 */     this.f = ((bhd)this.i).a();
/*    */   }
/*    */   
/*    */   public void a(xx paramxx, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 18 */     int i = ((bhd)this.i).a();
/* 19 */     if (i != this.f) {
/* 20 */       this.f = i;
/* 21 */       this.i = new bhd();
/*    */     }
/* 23 */     super.a(paramxx, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(xx paramxx)
/*    */   {
/* 28 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */