/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bni
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/creeper/creeper_armor.png");
/* 11 */   private static final bqx f = new bqx("textures/entity/creeper/creeper.png");
/*    */   
/* 13 */   private bhr g = new bhj(2.0F);
/*    */   
/*    */   public bni() {
/* 16 */     super(new bhj(), 0.5F);
/*    */   }
/*    */   
/*    */   protected void a(xz paramxz, float paramFloat)
/*    */   {
/* 21 */     float f1 = paramxz.a(paramFloat);
/*    */     
/* 23 */     float f2 = 1.0F + qh.a(f1 * 100.0F) * f1 * 0.01F;
/* 24 */     if (f1 < 0.0F) f1 = 0.0F;
/* 25 */     if (f1 > 1.0F) f1 = 1.0F;
/* 26 */     f1 *= f1;
/* 27 */     f1 *= f1;
/* 28 */     float f3 = (1.0F + f1 * 0.4F) * f2;
/* 29 */     float f4 = (1.0F + f1 * 0.1F) / f2;
/* 30 */     GL11.glScalef(f3, f4, f3);
/*    */   }
/*    */   
/*    */   protected int a(xz paramxz, float paramFloat1, float paramFloat2)
/*    */   {
/* 35 */     float f1 = paramxz.a(paramFloat2);
/*    */     
/* 37 */     if ((int)(f1 * 10.0F) % 2 == 0) { return 0;
/*    */     }
/* 39 */     int i = (int)(f1 * 0.2F * 255.0F);
/* 40 */     if (i < 0) i = 0;
/* 41 */     if (i > 255) { i = 255;
/*    */     }
/* 43 */     int j = 255;
/* 44 */     int k = 255;
/* 45 */     int m = 255;
/*    */     
/* 47 */     return i << 24 | j << 16 | k << 8 | m;
/*    */   }
/*    */   
/*    */   protected int a(xz paramxz, int paramInt, float paramFloat)
/*    */   {
/* 52 */     if (paramxz.bZ()) {
/* 53 */       if (paramxz.ap()) {
/* 54 */         GL11.glDepthMask(false);
/*    */       } else {
/* 56 */         GL11.glDepthMask(true);
/*    */       }
/* 58 */       if (paramInt == 1) {
/* 59 */         float f1 = paramxz.aa + paramFloat;
/* 60 */         a(a);
/* 61 */         GL11.glMatrixMode(5890);
/* 62 */         GL11.glLoadIdentity();
/* 63 */         float f2 = f1 * 0.01F;
/* 64 */         float f3 = f1 * 0.01F;
/* 65 */         GL11.glTranslatef(f2, f3, 0.0F);
/* 66 */         a(this.g);
/* 67 */         GL11.glMatrixMode(5888);
/* 68 */         GL11.glEnable(3042);
/* 69 */         float f4 = 0.5F;
/* 70 */         GL11.glColor4f(f4, f4, f4, 1.0F);
/* 71 */         GL11.glDisable(2896);
/* 72 */         GL11.glBlendFunc(1, 1);
/* 73 */         return 1;
/*    */       }
/* 75 */       if (paramInt == 2) {
/* 76 */         GL11.glMatrixMode(5890);
/* 77 */         GL11.glLoadIdentity();
/* 78 */         GL11.glMatrixMode(5888);
/* 79 */         GL11.glEnable(2896);
/* 80 */         GL11.glDisable(3042);
/*    */       }
/*    */     }
/* 83 */     return -1;
/*    */   }
/*    */   
/*    */   protected int b(xz paramxz, int paramInt, float paramFloat)
/*    */   {
/* 88 */     return -1;
/*    */   }
/*    */   
/*    */   protected bqx a(xz paramxz)
/*    */   {
/* 93 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */