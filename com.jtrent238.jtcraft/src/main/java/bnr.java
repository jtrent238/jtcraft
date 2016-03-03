/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnr
/*    */   extends bno
/*    */ {
/*    */   private float a;
/*    */   
/*    */   public bnr(float paramFloat)
/*    */   {
/* 18 */     this.a = paramFloat;
/*    */   }
/*    */   
/*    */   public void a(ze paramze, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     GL11.glPushMatrix();
/*    */     
/* 25 */     b(paramze);
/*    */     
/* 27 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 28 */     GL11.glEnable(32826);
/* 29 */     float f1 = this.a;
/* 30 */     GL11.glScalef(f1 / 1.0F, f1 / 1.0F, f1 / 1.0F);
/* 31 */     rf localrf = ade.bz.b_(0);
/* 32 */     bmh localbmh = bmh.a;
/*    */     
/* 34 */     float f2 = localrf.c();
/* 35 */     float f3 = localrf.d();
/* 36 */     float f4 = localrf.e();
/* 37 */     float f5 = localrf.f();
/*    */     
/* 39 */     float f6 = 1.0F;
/* 40 */     float f7 = 0.5F;
/* 41 */     float f8 = 0.25F;
/*    */     
/* 43 */     GL11.glRotatef(180.0F - this.b.j, 0.0F, 1.0F, 0.0F);
/* 44 */     GL11.glRotatef(-this.b.k, 1.0F, 0.0F, 0.0F);
/* 45 */     localbmh.b();
/* 46 */     localbmh.c(0.0F, 1.0F, 0.0F);
/* 47 */     localbmh.a(0.0F - f7, 0.0F - f8, 0.0D, f2, f5);
/* 48 */     localbmh.a(f6 - f7, 0.0F - f8, 0.0D, f3, f5);
/* 49 */     localbmh.a(f6 - f7, 1.0F - f8, 0.0D, f3, f4);
/* 50 */     localbmh.a(0.0F - f7, 1.0F - f8, 0.0D, f2, f4);
/* 51 */     localbmh.a();
/*    */     
/* 53 */     GL11.glDisable(32826);
/* 54 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(ze paramze)
/*    */   {
/* 59 */     return bpz.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */