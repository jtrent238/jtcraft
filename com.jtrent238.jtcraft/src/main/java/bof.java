/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bof
/*    */   extends bno
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/lead_knot.png");
/*    */   
/* 12 */   private bhp f = new bhp();
/*    */   
/*    */ 
/*    */   public void a(su paramsu, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 17 */     GL11.glPushMatrix();
/* 18 */     GL11.glDisable(2884);
/*    */     
/* 20 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 22 */     float f1 = 0.0625F;
/* 23 */     GL11.glEnable(32826);
/* 24 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*    */     
/* 26 */     GL11.glEnable(3008);
/*    */     
/* 28 */     b(paramsu);
/* 29 */     this.f.a(paramsu, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, f1);
/*    */     
/* 31 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(su paramsu)
/*    */   {
/* 36 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */