/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bov
/*    */   extends bok
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/spider_eyes.png");
/* 12 */   private static final bqx f = new bqx("textures/entity/spider/spider.png");
/*    */   
/*    */   public bov() {
/* 15 */     super(new big(), 1.0F);
/* 16 */     a(new big());
/*    */   }
/*    */   
/*    */   protected float b(yn paramyn)
/*    */   {
/* 21 */     return 180.0F;
/*    */   }
/*    */   
/*    */   protected int a(yn paramyn, int paramInt, float paramFloat)
/*    */   {
/* 26 */     if (paramInt != 0) return -1;
/* 27 */     a(a);
/* 28 */     GL11.glEnable(3042);
/* 29 */     GL11.glDisable(3008);
/* 30 */     GL11.glBlendFunc(1, 1);
/* 31 */     if (paramyn.ap()) {
/* 32 */       GL11.glDepthMask(false);
/*    */     } else {
/* 34 */       GL11.glDepthMask(true);
/*    */     }
/* 36 */     int i = 61680;
/* 37 */     int j = i % 65536;
/* 38 */     int k = i / 65536;
/*    */     
/* 40 */     buu.a(buu.c, j / 1.0F, k / 1.0F);
/* 41 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 42 */     return 1;
/*    */   }
/*    */   
/*    */   protected bqx a(yn paramyn)
/*    */   {
/* 47 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */