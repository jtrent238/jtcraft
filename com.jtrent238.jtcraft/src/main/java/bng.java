/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bng
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/chicken.png");
/*    */   
/*    */   public bng(bhr parambhr, float paramFloat) {
/* 13 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(wg paramwg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 18 */     super.a(paramwg, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(wg paramwg)
/*    */   {
/* 23 */     return a;
/*    */   }
/*    */   
/*    */   protected float a(wg paramwg, float paramFloat)
/*    */   {
/* 28 */     float f1 = paramwg.bs + (paramwg.bp - paramwg.bs) * paramFloat;
/* 29 */     float f2 = paramwg.br + (paramwg.bq - paramwg.br) * paramFloat;
/*    */     
/* 31 */     return (qh.a(f1) + 1.0F) * f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */