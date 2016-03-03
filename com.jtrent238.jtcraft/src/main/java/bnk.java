/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnk
/*    */   extends bno
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/endercrystal/endercrystal.png");
/*    */   
/*    */   private bhr f;
/*    */   
/*    */   public bnk()
/*    */   {
/* 17 */     this.d = 0.5F;
/* 18 */     this.f = new bir(0.0F, true);
/*    */   }
/*    */   
/*    */   public void a(wz paramwz, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     float f1 = paramwz.a + paramFloat2;
/* 24 */     GL11.glPushMatrix();
/* 25 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 27 */     a(a);
/* 28 */     float f2 = qh.a(f1 * 0.2F) / 2.0F + 0.5F;
/* 29 */     f2 = f2 * f2 + f2;
/* 30 */     this.f.a(paramwz, 0.0F, f1 * 3.0F, f2 * 0.2F, 0.0F, 0.0F, 0.0625F);
/* 31 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(wz paramwz)
/*    */   {
/* 36 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */