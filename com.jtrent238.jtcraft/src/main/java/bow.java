/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bow
/*    */   extends bok
/*    */ {
/* 11 */   private static final bqx a = new bqx("textures/entity/squid.png");
/*    */   
/*    */   public bow(bhr parambhr, float paramFloat) {
/* 14 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */   public void a(ws paramws, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 19 */     super.a(paramws, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(ws paramws)
/*    */   {
/* 24 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(ws paramws, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 29 */     float f1 = paramws.bq + (paramws.bp - paramws.bq) * paramFloat3;
/* 30 */     float f2 = paramws.bs + (paramws.br - paramws.bs) * paramFloat3;
/*    */     
/* 32 */     GL11.glTranslatef(0.0F, 0.5F, 0.0F);
/* 33 */     GL11.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
/* 34 */     GL11.glRotatef(f1, 1.0F, 0.0F, 0.0F);
/* 35 */     GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/* 36 */     GL11.glTranslatef(0.0F, -1.2F, 0.0F);
/*    */   }
/*    */   
/*    */   protected float a(ws paramws, float paramFloat)
/*    */   {
/* 41 */     return paramws.bw + (paramws.bv - paramws.bw) * paramFloat;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */