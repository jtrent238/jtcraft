/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnu
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/zombie/zombie.png");
/*    */   private float f;
/*    */   
/*    */   public bnu(bhr parambhr, float paramFloat1, float paramFloat2) {
/* 14 */     super(parambhr, paramFloat1 * paramFloat2);
/* 15 */     this.f = paramFloat2;
/*    */   }
/*    */   
/*    */   protected void a(ye paramye, float paramFloat)
/*    */   {
/* 20 */     GL11.glScalef(this.f, this.f, this.f);
/*    */   }
/*    */   
/*    */   protected bqx a(ye paramye)
/*    */   {
/* 25 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */