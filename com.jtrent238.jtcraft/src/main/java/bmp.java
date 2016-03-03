/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmp
/*    */   extends bml
/*    */ {
/*    */   public void a(apj paramapj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*    */   {
/* 13 */     GL11.glPushMatrix();
/* 14 */     GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2, (float)paramDouble3 + 0.5F);
/* 15 */     a(paramapj.a(), paramDouble1, paramDouble2, paramDouble3, paramFloat);
/* 16 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   public static void a(agq paramagq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/* 20 */     sa localsa = paramagq.h();
/* 21 */     if (localsa != null) {
/* 22 */       localsa.a(paramagq.a());
/* 23 */       float f = 0.4375F;
/* 24 */       GL11.glTranslatef(0.0F, 0.4F, 0.0F);
/* 25 */       GL11.glRotatef((float)(paramagq.d + (paramagq.c - paramagq.d) * paramFloat) * 10.0F, 0.0F, 1.0F, 0.0F);
/* 26 */       GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
/* 27 */       GL11.glTranslatef(0.0F, -0.4F, 0.0F);
/* 28 */       GL11.glScalef(f, f, f);
/* 29 */       localsa.b(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 30 */       bnn.a.a(localsa, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */