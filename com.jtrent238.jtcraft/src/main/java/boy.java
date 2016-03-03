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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class boy
/*    */   extends bno
/*    */ {
/* 24 */   private blm a = new blm();
/*    */   
/*    */   public boy() {
/* 27 */     this.d = 0.5F;
/*    */   }
/*    */   
/*    */   public void a(xw paramxw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 32 */     GL11.glPushMatrix();
/* 33 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 34 */     if (paramxw.a - paramFloat2 + 1.0F < 10.0F) {
/* 35 */       f1 = 1.0F - (paramxw.a - paramFloat2 + 1.0F) / 10.0F;
/* 36 */       if (f1 < 0.0F) f1 = 0.0F;
/* 37 */       if (f1 > 1.0F) f1 = 1.0F;
/* 38 */       f1 *= f1;
/* 39 */       f1 *= f1;
/* 40 */       float f2 = 1.0F + f1 * 0.3F;
/* 41 */       GL11.glScalef(f2, f2, f2);
/*    */     }
/*    */     
/* 44 */     float f1 = (1.0F - (paramxw.a - paramFloat2 + 1.0F) / 100.0F) * 0.8F;
/* 45 */     b(paramxw);
/* 46 */     this.a.a(ajn.W, 0, paramxw.d(paramFloat2));
/* 47 */     if (paramxw.a / 5 % 2 == 0) {
/* 48 */       GL11.glDisable(3553);
/* 49 */       GL11.glDisable(2896);
/* 50 */       GL11.glEnable(3042);
/* 51 */       GL11.glBlendFunc(770, 772);
/* 52 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, f1);
/* 53 */       this.a.a(ajn.W, 0, 1.0F);
/* 54 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 55 */       GL11.glDisable(3042);
/* 56 */       GL11.glEnable(2896);
/* 57 */       GL11.glEnable(3553);
/*    */     }
/* 59 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(xw paramxw)
/*    */   {
/* 64 */     return bpz.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\boy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */