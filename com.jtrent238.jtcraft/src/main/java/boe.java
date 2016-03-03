/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class boe
/*    */   extends bok
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/slime/magmacube.png");
/*    */   
/*    */   public boe() {
/* 14 */     super(new bho(), 0.25F);
/*    */   }
/*    */   
/*    */   protected bqx a(yf paramyf)
/*    */   {
/* 19 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(yf paramyf, float paramFloat)
/*    */   {
/* 24 */     int i = paramyf.bX();
/* 25 */     float f1 = (paramyf.bm + (paramyf.i - paramyf.bm) * paramFloat) / (i * 0.5F + 1.0F);
/* 26 */     float f2 = 1.0F / (f1 + 1.0F);
/* 27 */     float f3 = i;
/* 28 */     GL11.glScalef(f2 * f3, 1.0F / f2 * f3, f2 * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */