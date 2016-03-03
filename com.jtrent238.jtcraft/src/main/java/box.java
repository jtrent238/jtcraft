/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class box
/*    */   extends boi
/*    */ {
/*    */   protected void a(xv paramxv, float paramFloat, aji paramaji, int paramInt)
/*    */   {
/* 12 */     int i = paramxv.f();
/*    */     
/* 14 */     if ((i > -1) && 
/* 15 */       (i - paramFloat + 1.0F < 10.0F)) {
/* 16 */       float f1 = 1.0F - (i - paramFloat + 1.0F) / 10.0F;
/* 17 */       if (f1 < 0.0F) f1 = 0.0F;
/* 18 */       if (f1 > 1.0F) f1 = 1.0F;
/* 19 */       f1 *= f1;
/* 20 */       f1 *= f1;
/* 21 */       float f2 = 1.0F + f1 * 0.3F;
/* 22 */       GL11.glScalef(f2, f2, f2);
/*    */     }
/*    */     
/*    */ 
/* 26 */     super.a(paramxv, paramFloat, paramaji, paramInt);
/*    */     
/* 28 */     if ((i > -1) && (i / 5 % 2 == 0)) {
/* 29 */       GL11.glDisable(3553);
/* 30 */       GL11.glDisable(2896);
/* 31 */       GL11.glEnable(3042);
/* 32 */       GL11.glBlendFunc(770, 772);
/* 33 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, (1.0F - (i - paramFloat + 1.0F) / 100.0F) * 0.8F);
/*    */       
/* 35 */       GL11.glPushMatrix();
/* 36 */       this.f.a(ajn.W, 0, 1.0F);
/* 37 */       GL11.glPopMatrix();
/*    */       
/* 39 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 40 */       GL11.glDisable(3042);
/* 41 */       GL11.glEnable(2896);
/* 42 */       GL11.glEnable(3553);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\box.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */