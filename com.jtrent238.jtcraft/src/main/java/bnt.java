/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnt
/*    */   extends bok
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/ghast/ghast.png");
/* 12 */   private static final bqx f = new bqx("textures/entity/ghast/ghast_shooting.png");
/*    */   
/*    */   public bnt() {
/* 15 */     super(new bhl(), 0.5F);
/*    */   }
/*    */   
/*    */   protected bqx a(yd paramyd)
/*    */   {
/* 20 */     if (paramyd.bP()) {
/* 21 */       return f;
/*    */     }
/*    */     
/* 24 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(yd paramyd, float paramFloat)
/*    */   {
/* 29 */     yd localyd = paramyd;
/*    */     
/* 31 */     float f1 = (localyd.bo + (localyd.bp - localyd.bo) * paramFloat) / 20.0F;
/* 32 */     if (f1 < 0.0F) f1 = 0.0F;
/* 33 */     f1 = 1.0F / (f1 * f1 * f1 * f1 * f1 * 2.0F + 1.0F);
/* 34 */     float f2 = (8.0F + f1) / 2.0F;
/* 35 */     float f3 = (8.0F + 1.0F / f1) / 2.0F;
/* 36 */     GL11.glScalef(f3, f2, f3);
/* 37 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */