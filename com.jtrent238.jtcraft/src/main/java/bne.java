/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bne
/*    */   extends bno
/*    */ {
/* 12 */   private static final bqx f = new bqx("textures/entity/boat.png");
/*    */   protected bhr a;
/*    */   
/*    */   public bne() {
/* 16 */     this.d = 0.5F;
/* 17 */     this.a = new bhe();
/*    */   }
/*    */   
/*    */   public void a(xi paramxi, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 22 */     GL11.glPushMatrix();
/*    */     
/* 24 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 26 */     GL11.glRotatef(180.0F - paramFloat1, 0.0F, 1.0F, 0.0F);
/* 27 */     float f1 = paramxi.f() - paramFloat2;
/* 28 */     float f2 = paramxi.e() - paramFloat2;
/* 29 */     if (f2 < 0.0F) f2 = 0.0F;
/* 30 */     if (f1 > 0.0F) {
/* 31 */       GL11.glRotatef(qh.a(f1) * f1 * f2 / 10.0F * paramxi.i(), 1.0F, 0.0F, 0.0F);
/*    */     }
/*    */     
/* 34 */     float f3 = 0.75F;
/* 35 */     GL11.glScalef(f3, f3, f3);
/* 36 */     GL11.glScalef(1.0F / f3, 1.0F / f3, 1.0F / f3);
/*    */     
/* 38 */     b(paramxi);
/* 39 */     GL11.glScalef(-1.0F, -1.0F, 1.0F);
/* 40 */     this.a.a(paramxi, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
/* 41 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(xi paramxi)
/*    */   {
/* 46 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */