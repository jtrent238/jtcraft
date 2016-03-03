/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bom
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/cat/black.png");
/* 11 */   private static final bqx f = new bqx("textures/entity/cat/ocelot.png");
/* 12 */   private static final bqx g = new bqx("textures/entity/cat/red.png");
/* 13 */   private static final bqx h = new bqx("textures/entity/cat/siamese.png");
/*    */   
/*    */   public bom(bhr parambhr, float paramFloat) {
/* 16 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(wn paramwn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 21 */     super.a(paramwn, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(wn paramwn)
/*    */   {
/* 26 */     switch (paramwn.cg()) {
/*    */     case 0: 
/*    */     default: 
/* 29 */       return f;
/*    */     case 1: 
/* 31 */       return a;
/*    */     case 2: 
/* 33 */       return g;
/*    */     }
/* 35 */     return h;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(wn paramwn, float paramFloat)
/*    */   {
/* 41 */     super.a(paramwn, paramFloat);
/* 42 */     if (paramwn.bZ()) {
/* 43 */       GL11.glScalef(0.8F, 0.8F, 0.8F);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */