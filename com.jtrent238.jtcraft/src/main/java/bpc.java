/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpc
/*    */   extends bok
/*    */ {
/* 12 */   private static final bqx a = new bqx("textures/entity/wither/wither_invulnerable.png");
/* 13 */   private static final bqx f = new bqx("textures/entity/wither/wither.png");
/*    */   private int g;
/*    */   
/*    */   public bpc() {
/* 17 */     super(new bin(), 1.0F);
/* 18 */     this.g = ((bin)this.i).a();
/*    */   }
/*    */   
/*    */   public void a(xc paramxc, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     bln.a(paramxc, true);
/*    */     
/* 25 */     int i = ((bin)this.i).a();
/* 26 */     if (i != this.g) {
/* 27 */       this.g = i;
/* 28 */       this.i = new bin();
/*    */     }
/* 30 */     super.a(paramxc, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(xc paramxc)
/*    */   {
/* 35 */     int i = paramxc.ca();
/* 36 */     if ((i <= 0) || ((i <= 80) && (i / 5 % 2 == 1))) {
/* 37 */       return f;
/*    */     }
/* 39 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(xc paramxc, float paramFloat)
/*    */   {
/* 44 */     int i = paramxc.ca();
/* 45 */     if (i > 0) {
/* 46 */       float f1 = 2.0F - (i - paramFloat) / 220.0F * 0.5F;
/* 47 */       GL11.glScalef(f1, f1, f1);
/*    */     } else {
/* 49 */       GL11.glScalef(2.0F, 2.0F, 2.0F);
/*    */     }
/*    */   }
/*    */   
/*    */   protected int a(xc paramxc, int paramInt, float paramFloat)
/*    */   {
/* 55 */     if (paramxc.cb()) {
/* 56 */       if (paramxc.ap()) {
/* 57 */         GL11.glDepthMask(false);
/*    */       } else {
/* 59 */         GL11.glDepthMask(true);
/*    */       }
/* 61 */       if (paramInt == 1) {
/* 62 */         float f1 = paramxc.aa + paramFloat;
/* 63 */         a(a);
/* 64 */         GL11.glMatrixMode(5890);
/* 65 */         GL11.glLoadIdentity();
/* 66 */         float f2 = qh.b(f1 * 0.02F) * 3.0F;
/* 67 */         float f3 = f1 * 0.01F;
/* 68 */         GL11.glTranslatef(f2, f3, 0.0F);
/* 69 */         a(this.i);
/* 70 */         GL11.glMatrixMode(5888);
/* 71 */         GL11.glEnable(3042);
/* 72 */         float f4 = 0.5F;
/* 73 */         GL11.glColor4f(f4, f4, f4, 1.0F);
/* 74 */         GL11.glDisable(2896);
/* 75 */         GL11.glBlendFunc(1, 1);
/* 76 */         GL11.glTranslatef(0.0F, -0.01F, 0.0F);
/* 77 */         GL11.glScalef(1.1F, 1.1F, 1.1F);
/* 78 */         return 1;
/*    */       }
/* 80 */       if (paramInt == 2) {
/* 81 */         GL11.glMatrixMode(5890);
/* 82 */         GL11.glLoadIdentity();
/* 83 */         GL11.glMatrixMode(5888);
/* 84 */         GL11.glEnable(2896);
/* 85 */         GL11.glDisable(3042);
/*    */       }
/*    */     }
/* 88 */     return -1;
/*    */   }
/*    */   
/*    */   protected int b(xc paramxc, int paramInt, float paramFloat)
/*    */   {
/* 93 */     return -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */