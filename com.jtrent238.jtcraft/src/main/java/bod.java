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
/*    */ public class bod
/*    */   extends bno
/*    */ {
/*    */   private adb a;
/*    */   private int f;
/*    */   
/*    */   public bod(adb paramadb, int paramInt)
/*    */   {
/* 19 */     this.a = paramadb;
/* 20 */     this.f = paramInt;
/*    */   }
/*    */   
/*    */   public bod(adb paramadb) {
/* 24 */     this(paramadb, 0);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 30 */     rf localrf = this.a.b_(this.f);
/* 31 */     if (localrf == null) {
/* 32 */       return;
/*    */     }
/*    */     
/* 35 */     GL11.glPushMatrix();
/*    */     
/* 37 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 38 */     GL11.glEnable(32826);
/* 39 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 40 */     b(paramsa);
/*    */     
/* 42 */     bmh localbmh = bmh.a;
/*    */     
/* 44 */     if (localrf == adp.b("bottle_splash"))
/*    */     {
/* 46 */       int i = aen.a(((zo)paramsa).k(), false);
/* 47 */       float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 48 */       float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 49 */       float f3 = (i & 0xFF) / 255.0F;
/*    */       
/* 51 */       GL11.glColor3f(f1, f2, f3);
/* 52 */       GL11.glPushMatrix();
/* 53 */       a(localbmh, adp.b("overlay"));
/* 54 */       GL11.glPopMatrix();
/* 55 */       GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*    */     }
/*    */     
/* 58 */     a(localbmh, localrf);
/*    */     
/* 60 */     GL11.glDisable(32826);
/* 61 */     GL11.glPopMatrix();
/*    */   }
/*    */   
/*    */   protected bqx a(sa paramsa)
/*    */   {
/* 66 */     return bpz.c;
/*    */   }
/*    */   
/*    */   private void a(bmh parambmh, rf paramrf) {
/* 70 */     float f1 = paramrf.c();
/* 71 */     float f2 = paramrf.d();
/* 72 */     float f3 = paramrf.e();
/* 73 */     float f4 = paramrf.f();
/* 74 */     float f5 = 1.0F;
/* 75 */     float f6 = 0.5F;
/* 76 */     float f7 = 0.25F;
/* 77 */     GL11.glRotatef(180.0F - this.b.j, 0.0F, 1.0F, 0.0F);
/* 78 */     GL11.glRotatef(-this.b.k, 1.0F, 0.0F, 0.0F);
/* 79 */     parambmh.b();
/* 80 */     parambmh.c(0.0F, 1.0F, 0.0F);
/* 81 */     parambmh.a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/* 82 */     parambmh.a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/* 83 */     parambmh.a(f5 - f6, f5 - f7, 0.0D, f2, f3);
/* 84 */     parambmh.a(0.0F - f6, f5 - f7, 0.0D, f1, f3);
/* 85 */     parambmh.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */