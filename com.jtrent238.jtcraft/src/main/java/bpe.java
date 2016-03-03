/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpe
/*    */   extends bok
/*    */ {
/* 12 */   private static final bqx a = new bqx("textures/entity/wolf/wolf.png");
/* 13 */   private static final bqx f = new bqx("textures/entity/wolf/wolf_tame.png");
/* 14 */   private static final bqx g = new bqx("textures/entity/wolf/wolf_angry.png");
/* 15 */   private static final bqx h = new bqx("textures/entity/wolf/wolf_collar.png");
/*    */   
/*    */   public bpe(bhr parambhr1, bhr parambhr2, float paramFloat) {
/* 18 */     super(parambhr1, paramFloat);
/* 19 */     a(parambhr2);
/*    */   }
/*    */   
/*    */   protected float a(wv paramwv, float paramFloat)
/*    */   {
/* 24 */     return paramwv.ch();
/*    */   }
/*    */   
/*    */   protected int a(wv paramwv, int paramInt, float paramFloat)
/*    */   {
/* 29 */     if ((paramInt == 0) && (paramwv.cg())) {
/* 30 */       float f1 = paramwv.d(paramFloat) * paramwv.p(paramFloat);
/* 31 */       a(a);
/* 32 */       GL11.glColor3f(f1, f1, f1);
/*    */       
/* 34 */       return 1;
/*    */     }
/* 36 */     if ((paramInt == 1) && (paramwv.bZ())) {
/* 37 */       a(h);
/* 38 */       int i = paramwv.cj();
/* 39 */       GL11.glColor3f(wp.bp[i][0], wp.bp[i][1], wp.bp[i][2]);
/*    */       
/* 41 */       return 1;
/*    */     }
/* 43 */     return -1;
/*    */   }
/*    */   
/*    */   protected bqx a(wv paramwv)
/*    */   {
/* 48 */     if (paramwv.bZ()) {
/* 49 */       return f;
/*    */     }
/* 51 */     if (paramwv.ci()) {
/* 52 */       return g;
/*    */     }
/* 54 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */