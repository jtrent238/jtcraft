/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmo
/*    */   extends bml
/*    */ {
/* 11 */   private static final bqx b = new bqx("textures/entity/chest/ender.png");
/* 12 */   private bhg c = new bhg();
/*    */   
/*    */   public void a(ape paramape, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*    */   {
/* 16 */     int i = 0;
/*    */     
/* 18 */     if (paramape.o()) {
/* 19 */       i = paramape.p();
/*    */     }
/*    */     
/* 22 */     a(b);
/*    */     
/* 24 */     GL11.glPushMatrix();
/* 25 */     GL11.glEnable(32826);
/* 26 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 27 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
/* 28 */     GL11.glScalef(1.0F, -1.0F, -1.0F);
/*    */     
/* 30 */     GL11.glTranslatef(0.5F, 0.5F, 0.5F);
/* 31 */     int j = 0;
/* 32 */     if (i == 2) j = 180;
/* 33 */     if (i == 3) j = 0;
/* 34 */     if (i == 4) j = 90;
/* 35 */     if (i == 5) { j = -90;
/*    */     }
/* 37 */     GL11.glRotatef(j, 0.0F, 1.0F, 0.0F);
/* 38 */     GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*    */     
/* 40 */     float f = paramape.i + (paramape.a - paramape.i) * paramFloat;
/* 41 */     f = 1.0F - f;
/* 42 */     f = 1.0F - f * f * f;
/*    */     
/* 44 */     this.c.a.f = (-(f * 3.1415927F / 2.0F));
/* 45 */     this.c.a();
/* 46 */     GL11.glDisable(32826);
/* 47 */     GL11.glPopMatrix();
/* 48 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */