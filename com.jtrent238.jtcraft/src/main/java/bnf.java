/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnf
/*    */   extends bov
/*    */ {
/*  8 */   private static final bqx a = new bqx("textures/entity/spider/cave_spider.png");
/*    */   
/*    */   public bnf()
/*    */   {
/* 12 */     this.d *= 0.7F;
/*    */   }
/*    */   
/*    */   protected void a(xy paramxy, float paramFloat)
/*    */   {
/* 17 */     GL11.glScalef(0.7F, 0.7F, 0.7F);
/*    */   }
/*    */   
/*    */   protected bqx a(xy paramxy)
/*    */   {
/* 22 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */