/*    */ import java.nio.FloatBuffer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bam
/*    */ {
/* 10 */   private static FloatBuffer a = ban.h(16);
/* 11 */   private static final azw b = azw.a(0.20000000298023224D, 1.0D, -0.699999988079071D).a();
/* 12 */   private static final azw c = azw.a(-0.20000000298023224D, 1.0D, 0.699999988079071D).a();
/*    */   
/*    */   public static void a() {
/* 15 */     GL11.glDisable(2896);
/* 16 */     GL11.glDisable(16384);
/* 17 */     GL11.glDisable(16385);
/* 18 */     GL11.glDisable(2903);
/*    */   }
/*    */   
/*    */   public static void b() {
/* 22 */     GL11.glEnable(2896);
/* 23 */     GL11.glEnable(16384);
/* 24 */     GL11.glEnable(16385);
/* 25 */     GL11.glEnable(2903);
/* 26 */     GL11.glColorMaterial(1032, 5634);
/* 27 */     float f1 = 0.4F;
/* 28 */     float f2 = 0.6F;
/* 29 */     float f3 = 0.0F;
/*    */     
/* 31 */     GL11.glLight(16384, 4611, a(b.a, b.b, b.c, 0.0D));
/* 32 */     GL11.glLight(16384, 4609, a(f2, f2, f2, 1.0F));
/* 33 */     GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 34 */     GL11.glLight(16384, 4610, a(f3, f3, f3, 1.0F));
/*    */     
/* 36 */     GL11.glLight(16385, 4611, a(c.a, c.b, c.c, 0.0D));
/* 37 */     GL11.glLight(16385, 4609, a(f2, f2, f2, 1.0F));
/* 38 */     GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 39 */     GL11.glLight(16385, 4610, a(f3, f3, f3, 1.0F));
/*    */     
/* 41 */     GL11.glShadeModel(7424);
/* 42 */     GL11.glLightModel(2899, a(f1, f1, f1, 1.0F));
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 46 */     return a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, (float)paramDouble4);
/*    */   }
/*    */   
/*    */   private static FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 50 */     a.clear();
/* 51 */     a.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 52 */     a.flip();
/* 53 */     return a;
/*    */   }
/*    */   
/*    */   public static void c() {
/* 57 */     GL11.glPushMatrix();
/* 58 */     GL11.glRotatef(-30.0F, 0.0F, 1.0F, 0.0F);
/* 59 */     GL11.glRotatef(165.0F, 1.0F, 0.0F, 0.0F);
/* 60 */     b();
/* 61 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */