/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnj
/*    */   extends bno
/*    */ {
/*    */   public void a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 12 */     GL11.glPushMatrix();
/* 13 */     a(paramsa.C, paramDouble1 - paramsa.S, paramDouble2 - paramsa.T, paramDouble3 - paramsa.U);
/* 14 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(sa paramsa)
/*    */   {
/* 19 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */