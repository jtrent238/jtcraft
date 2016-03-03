/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnc
/*    */   extends bok
/*    */ {
/* 10 */   private static final bqx a = new bqx("textures/entity/bat.png");
/*    */   private int f;
/*    */   
/*    */   public bnc() {
/* 14 */     super(new bhc(), 0.25F);
/* 15 */     this.f = ((bhc)this.i).a();
/*    */   }
/*    */   
/*    */   public void a(we paramwe, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 20 */     int i = ((bhc)this.i).a();
/* 21 */     if (i != this.f) {
/* 22 */       this.f = i;
/* 23 */       this.i = new bhc();
/*    */     }
/* 25 */     super.a(paramwe, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   protected bqx a(we paramwe)
/*    */   {
/* 30 */     return a;
/*    */   }
/*    */   
/*    */   protected void a(we paramwe, float paramFloat)
/*    */   {
/* 35 */     GL11.glScalef(0.35F, 0.35F, 0.35F);
/*    */   }
/*    */   
/*    */   protected void a(we paramwe, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 40 */     super.a(paramwe, paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected void a(we paramwe, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 45 */     if (!paramwe.bP()) {
/* 46 */       GL11.glTranslatef(0.0F, qh.b(paramFloat1 * 0.3F) * 0.1F, 0.0F);
/*    */     } else {
/* 48 */       GL11.glTranslatef(0.0F, -0.1F, 0.0F);
/*    */     }
/* 50 */     super.a(paramwe, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */