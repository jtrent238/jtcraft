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
/*    */ public class bol
/*    */   extends bok
/*    */ {
/* 14 */   private static final bqx a = new bqx("textures/entity/cow/mooshroom.png");
/*    */   
/*    */   public bol(bhr parambhr, float paramFloat) {
/* 17 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(wm paramwm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 22 */     super.a(paramwm, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(wm paramwm)
/*    */   {
/* 27 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(wm paramwm, float paramFloat)
/*    */   {
/* 32 */     super.c(paramwm, paramFloat);
/* 33 */     if (paramwm.f()) { return;
/*    */     }
/* 35 */     a(bpz.b);
/* 36 */     GL11.glEnable(2884);
/* 37 */     GL11.glPushMatrix();
/* 38 */     GL11.glScalef(1.0F, -1.0F, 1.0F);
/* 39 */     GL11.glTranslatef(0.2F, 0.4F, 0.5F);
/* 40 */     GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
/* 41 */     this.c.a(ajn.Q, 0, 1.0F);
/* 42 */     GL11.glTranslatef(0.1F, 0.0F, -0.6F);
/* 43 */     GL11.glRotatef(42.0F, 0.0F, 1.0F, 0.0F);
/* 44 */     this.c.a(ajn.Q, 0, 1.0F);
/* 45 */     GL11.glPopMatrix();
/*    */     
/* 47 */     GL11.glPushMatrix();
/* 48 */     ((bhw)this.i).a.c(0.0625F);
/* 49 */     GL11.glScalef(1.0F, -1.0F, 1.0F);
/* 50 */     GL11.glTranslatef(0.0F, 0.75F, -0.2F);
/* 51 */     GL11.glRotatef(12.0F, 0.0F, 1.0F, 0.0F);
/* 52 */     this.c.a(ajn.Q, 0, 1.0F);
/* 53 */     GL11.glPopMatrix();
/*    */     
/* 55 */     GL11.glDisable(2884);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */