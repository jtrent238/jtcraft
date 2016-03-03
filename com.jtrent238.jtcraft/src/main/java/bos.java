/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bos
/*    */   extends bnw
/*    */ {
/* 10 */   private static final bqx k = new bqx("textures/entity/skeleton/skeleton.png");
/* 11 */   private static final bqx l = new bqx("textures/entity/skeleton/wither_skeleton.png");
/*    */   
/*    */   public bos() {
/* 14 */     super(new bic(), 0.5F);
/*    */   }
/*    */   
/*    */   protected void a(yl paramyl, float paramFloat)
/*    */   {
/* 19 */     if (paramyl.cb() == 1) {
/* 20 */       GL11.glScalef(1.2F, 1.2F, 1.2F);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void e()
/*    */   {
/* 26 */     GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
/*    */   }
/*    */   
/*    */   protected bqx a(yl paramyl)
/*    */   {
/* 31 */     if (paramyl.cb() == 1) {
/* 32 */       return l;
/*    */     }
/* 34 */     return k;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */