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
/*    */ 
/*    */ 
/*    */ public class boz
/*    */   extends bok
/*    */ {
/* 16 */   private static final bqx a = new bqx("textures/entity/iron_golem.png");
/*    */   private final bij f;
/*    */   
/*    */   public boz() {
/* 20 */     super(new bij(), 0.5F);
/* 21 */     this.f = ((bij)this.i);
/*    */   }
/*    */   
/*    */   public void a(wt paramwt, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 26 */     super.a(paramwt, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(wt paramwt)
/*    */   {
/* 31 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(wt paramwt, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 36 */     super.a(paramwt, paramFloat1, paramFloat2, paramFloat3);
/* 37 */     if (paramwt.aF < 0.01D) { return;
/*    */     }
/* 39 */     float f1 = 13.0F;
/* 40 */     float f2 = paramwt.aG - paramwt.aF * (1.0F - paramFloat3) + 6.0F;
/* 41 */     float f3 = (Math.abs(f2 % f1 - f1 * 0.5F) - f1 * 0.25F) / (f1 * 0.25F);
/* 42 */     GL11.glRotatef(6.5F * f3, 0.0F, 0.0F, 1.0F);
/*    */   }
/*    */   
/*    */   protected void a(wt paramwt, float paramFloat)
/*    */   {
/* 47 */     super.c(paramwt, paramFloat);
/* 48 */     if (paramwt.cb() == 0) { return;
/*    */     }
/* 50 */     GL11.glEnable(32826);
/* 51 */     GL11.glPushMatrix();
/*    */     
/*    */ 
/* 54 */     GL11.glRotatef(5.0F + 180.0F * this.f.c.f / 3.1415927F, 1.0F, 0.0F, 0.0F);
/* 55 */     GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
/* 56 */     GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/* 57 */     float f1 = 0.8F;
/* 58 */     GL11.glScalef(f1, -f1, f1);
/*    */     
/* 60 */     int i = paramwt.c(paramFloat);
/* 61 */     int j = i % 65536;
/* 62 */     int k = i / 65536;
/* 63 */     buu.a(buu.c, j / 1.0F, k / 1.0F);
/*    */     
/* 65 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 66 */     a(bpz.b);
/* 67 */     this.c.a(ajn.O, 0, 1.0F);
/* 68 */     GL11.glPopMatrix();
/* 69 */     GL11.glDisable(32826);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */