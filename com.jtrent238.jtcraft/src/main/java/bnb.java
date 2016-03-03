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
/*    */ public class bnb
/*    */   extends bno
/*    */ {
/* 14 */   private static final bqx a = new bqx("textures/entity/arrow.png");
/*    */   
/*    */   public void a(zc paramzc, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 18 */     b(paramzc);
/*    */     
/* 20 */     GL11.glPushMatrix();
/*    */     
/* 22 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 23 */     GL11.glRotatef(paramzc.A + (paramzc.y - paramzc.A) * paramFloat2 - 90.0F, 0.0F, 1.0F, 0.0F);
/* 24 */     GL11.glRotatef(paramzc.B + (paramzc.z - paramzc.B) * paramFloat2, 0.0F, 0.0F, 1.0F);
/*    */     
/* 26 */     bmh localbmh = bmh.a;
/* 27 */     int i = 0;
/*    */     
/* 29 */     float f1 = 0.0F;
/* 30 */     float f2 = 0.5F;
/* 31 */     float f3 = (0 + i * 10) / 32.0F;
/* 32 */     float f4 = (5 + i * 10) / 32.0F;
/*    */     
/* 34 */     float f5 = 0.0F;
/* 35 */     float f6 = 0.15625F;
/* 36 */     float f7 = (5 + i * 10) / 32.0F;
/* 37 */     float f8 = (10 + i * 10) / 32.0F;
/* 38 */     float f9 = 0.05625F;
/* 39 */     GL11.glEnable(32826);
/* 40 */     float f10 = paramzc.b - paramFloat2;
/* 41 */     if (f10 > 0.0F) {
/* 42 */       float f11 = -qh.a(f10 * 3.0F) * f10;
/* 43 */       GL11.glRotatef(f11, 0.0F, 0.0F, 1.0F);
/*    */     }
/* 45 */     GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
/* 46 */     GL11.glScalef(f9, f9, f9);
/*    */     
/* 48 */     GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
/*    */     
/* 50 */     GL11.glNormal3f(f9, 0.0F, 0.0F);
/* 51 */     localbmh.b();
/* 52 */     localbmh.a(-7.0D, -2.0D, -2.0D, f5, f7);
/* 53 */     localbmh.a(-7.0D, -2.0D, 2.0D, f6, f7);
/* 54 */     localbmh.a(-7.0D, 2.0D, 2.0D, f6, f8);
/* 55 */     localbmh.a(-7.0D, 2.0D, -2.0D, f5, f8);
/* 56 */     localbmh.a();
/*    */     
/* 58 */     GL11.glNormal3f(-f9, 0.0F, 0.0F);
/* 59 */     localbmh.b();
/* 60 */     localbmh.a(-7.0D, 2.0D, -2.0D, f5, f7);
/* 61 */     localbmh.a(-7.0D, 2.0D, 2.0D, f6, f7);
/* 62 */     localbmh.a(-7.0D, -2.0D, 2.0D, f6, f8);
/* 63 */     localbmh.a(-7.0D, -2.0D, -2.0D, f5, f8);
/* 64 */     localbmh.a();
/*    */     
/* 66 */     for (int j = 0; j < 4; j++)
/*    */     {
/* 68 */       GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 69 */       GL11.glNormal3f(0.0F, 0.0F, f9);
/* 70 */       localbmh.b();
/* 71 */       localbmh.a(-8.0D, -2.0D, 0.0D, f1, f3);
/* 72 */       localbmh.a(8.0D, -2.0D, 0.0D, f2, f3);
/* 73 */       localbmh.a(8.0D, 2.0D, 0.0D, f2, f4);
/* 74 */       localbmh.a(-8.0D, 2.0D, 0.0D, f1, f4);
/* 75 */       localbmh.a();
/*    */     }
/*    */     
/* 78 */     GL11.glDisable(32826);
/* 79 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(zc paramzc)
/*    */   {
/* 84 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */