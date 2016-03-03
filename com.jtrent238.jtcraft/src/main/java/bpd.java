/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpd
/*    */   extends bno
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/wither/wither_invulnerable.png");
/* 12 */   private static final bqx f = new bqx("textures/entity/wither/wither.png");
/*    */   private final bib g;
/*    */   
/*    */   public bpd()
/*    */   {
/* 17 */     this.g = new bib();
/*    */   }
/*    */   
/*    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 21 */     float f1 = paramFloat2 - paramFloat1;
/* 22 */     while (f1 < -180.0F)
/* 23 */       f1 += 360.0F;
/* 24 */     while (f1 >= 180.0F)
/* 25 */       f1 -= 360.0F;
/* 26 */     return paramFloat1 + paramFloat3 * f1;
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(zp paramzp, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 32 */     GL11.glPushMatrix();
/* 33 */     GL11.glDisable(2884);
/*    */     
/* 35 */     float f1 = a(paramzp.A, paramzp.y, paramFloat2);
/* 36 */     float f2 = paramzp.B + (paramzp.z - paramzp.B) * paramFloat2;
/*    */     
/* 38 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 40 */     float f3 = 0.0625F;
/* 41 */     GL11.glEnable(32826);
/* 42 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/*    */     
/* 44 */     GL11.glEnable(3008);
/*    */     
/* 46 */     b(paramzp);
/*    */     
/* 48 */     this.g.a(paramzp, 0.0F, 0.0F, 0.0F, f1, f2, f3);
/*    */     
/* 50 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(zp paramzp)
/*    */   {
/* 55 */     return paramzp.f() ? a : f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */