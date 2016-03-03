/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bot
/*    */   extends bok
/*    */ {
/*  9 */   private static final bqx a = new bqx("textures/entity/slime/slime.png");
/*    */   private bhr f;
/*    */   
/*    */   public bot(bhr parambhr1, bhr parambhr2, float paramFloat) {
/* 13 */     super(parambhr1, paramFloat);
/* 14 */     this.f = parambhr2;
/*    */   }
/*    */   
/*    */   protected int a(ym paramym, int paramInt, float paramFloat)
/*    */   {
/* 19 */     if (paramym.ap()) {
/* 20 */       return 0;
/*    */     }
/* 22 */     if (paramInt == 0) {
/* 23 */       a(this.f);
/*    */       
/* 25 */       GL11.glEnable(2977);
/* 26 */       GL11.glEnable(3042);
/* 27 */       GL11.glBlendFunc(770, 771);
/*    */       
/* 29 */       return 1;
/*    */     }
/* 31 */     if (paramInt == 1) {
/* 32 */       GL11.glDisable(3042);
/* 33 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     }
/* 35 */     return -1;
/*    */   }
/*    */   
/*    */   protected void a(ym paramym, float paramFloat)
/*    */   {
/* 40 */     float f1 = paramym.bX();
/* 41 */     float f2 = (paramym.bm + (paramym.i - paramym.bm) * paramFloat) / (f1 * 0.5F + 1.0F);
/* 42 */     float f3 = 1.0F / (f2 + 1.0F);
/* 43 */     GL11.glScalef(f3 * f1, 1.0F / f3 * f1, f3 * f1);
/*    */   }
/*    */   
/*    */   protected bqx a(ym paramym)
/*    */   {
/* 48 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */