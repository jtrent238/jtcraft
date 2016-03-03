/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnp
/*    */   extends bno
/*    */ {
/* 12 */   private static final bqx a = new bqx("textures/entity/experience_orb.png");
/*    */   
/*    */   public bnp() {
/* 15 */     this.d = 0.15F;
/* 16 */     this.e = 0.75F;
/*    */   }
/*    */   
/*    */   public void a(sq paramsq, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 21 */     GL11.glPushMatrix();
/* 22 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */     
/* 24 */     b(paramsq);
/*    */     
/* 26 */     int i = paramsq.f();
/* 27 */     float f1 = (i % 4 * 16 + 0) / 64.0F;
/* 28 */     float f2 = (i % 4 * 16 + 16) / 64.0F;
/* 29 */     float f3 = (i / 4 * 16 + 0) / 64.0F;
/* 30 */     float f4 = (i / 4 * 16 + 16) / 64.0F;
/*    */     
/* 32 */     float f5 = 1.0F;
/* 33 */     float f6 = 0.5F;
/* 34 */     float f7 = 0.25F;
/*    */     
/*    */ 
/* 37 */     int j = paramsq.c(paramFloat2);
/* 38 */     int k = j % 65536;
/* 39 */     int m = j / 65536;
/* 40 */     buu.a(buu.c, k / 1.0F, m / 1.0F);
/* 41 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/*    */ 
/* 44 */     float f8 = 255.0F;
/* 45 */     float f9 = (paramsq.a + paramFloat2) / 2.0F;
/* 46 */     m = (int)((qh.a(f9 + 0.0F) + 1.0F) * 0.5F * f8);
/* 47 */     int n = (int)f8;
/* 48 */     int i1 = (int)((qh.a(f9 + 4.1887903F) + 1.0F) * 0.1F * f8);
/* 49 */     int i2 = m << 16 | n << 8 | i1;
/* 50 */     GL11.glRotatef(180.0F - this.b.j, 0.0F, 1.0F, 0.0F);
/* 51 */     GL11.glRotatef(-this.b.k, 1.0F, 0.0F, 0.0F);
/* 52 */     float f10 = 0.3F;
/* 53 */     GL11.glScalef(f10, f10, f10);
/* 54 */     bmh localbmh = bmh.a;
/* 55 */     localbmh.b();
/* 56 */     localbmh.a(i2, 128);
/* 57 */     localbmh.c(0.0F, 1.0F, 0.0F);
/* 58 */     localbmh.a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/* 59 */     localbmh.a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/* 60 */     localbmh.a(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
/* 61 */     localbmh.a(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
/* 62 */     localbmh.a();
/*    */     
/* 64 */     GL11.glDisable(3042);
/* 65 */     GL11.glDisable(32826);
/* 66 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(sq paramsq)
/*    */   {
/* 71 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */