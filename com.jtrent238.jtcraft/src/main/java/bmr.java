/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bmr
/*    */   extends bml
/*    */ {
/* 13 */   private static final bqx b = new bqx("textures/entity/sign.png");
/*    */   
/* 15 */   private final bhz c = new bhz();
/*    */   
/*    */   public void a(apm paramapm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat)
/*    */   {
/* 19 */     aji localaji = paramapm.q();
/*    */     
/* 21 */     GL11.glPushMatrix();
/* 22 */     float f1 = 0.6666667F;
/* 23 */     if (localaji == ajn.an) {
/* 24 */       GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/* 25 */       float f2 = paramapm.p() * 360 / 16.0F;
/* 26 */       GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/* 27 */       this.c.b.j = true;
/*    */     } else {
/* 29 */       int i = paramapm.p();
/* 30 */       f3 = 0.0F;
/*    */       
/* 32 */       if (i == 2) f3 = 180.0F;
/* 33 */       if (i == 4) f3 = 90.0F;
/* 34 */       if (i == 5) { f3 = -90.0F;
/*    */       }
/* 36 */       GL11.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/* 37 */       GL11.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
/* 38 */       GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
/*    */       
/* 40 */       this.c.b.j = false;
/*    */     }
/*    */     
/* 43 */     a(b);
/*    */     
/* 45 */     GL11.glPushMatrix();
/* 46 */     GL11.glScalef(f1, -f1, -f1);
/* 47 */     this.c.a();
/* 48 */     GL11.glPopMatrix();
/* 49 */     bbu localbbu = b();
/*    */     
/* 51 */     float f3 = 0.016666668F * f1;
/* 52 */     GL11.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
/* 53 */     GL11.glScalef(f3, -f3, f3);
/* 54 */     GL11.glNormal3f(0.0F, 0.0F, -1.0F * f3);
/* 55 */     GL11.glDepthMask(false);
/*    */     
/* 57 */     int j = 0;
/* 58 */     for (int k = 0; k < paramapm.a.length; k++) {
/* 59 */       String str = paramapm.a[k];
/* 60 */       if (k == paramapm.i) {
/* 61 */         str = "> " + str + " <";
/* 62 */         localbbu.b(str, -localbbu.a(str) / 2, k * 10 - paramapm.a.length * 5, j);
/*    */       } else {
/* 64 */         localbbu.b(str, -localbbu.a(str) / 2, k * 10 - paramapm.a.length * 5, j);
/*    */       }
/*    */     }
/* 67 */     GL11.glDepthMask(true);
/* 68 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 69 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */