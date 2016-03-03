/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bou
/*    */   extends bok
/*    */ {
/* 14 */   private static final bqx a = new bqx("textures/entity/snowman.png");
/*    */   private bif f;
/*    */   
/*    */   public bou() {
/* 18 */     super(new bif(), 0.5F);
/* 19 */     this.f = ((bif)this.i);
/* 20 */     a(this.f);
/*    */   }
/*    */   
/*    */   protected void a(wr paramwr, float paramFloat)
/*    */   {
/* 25 */     super.c(paramwr, paramFloat);
/* 26 */     add localadd = new add(ajn.aK, 1);
/* 27 */     if ((localadd.b() instanceof abh)) {
/* 28 */       GL11.glPushMatrix();
/* 29 */       this.f.c.c(0.0625F);
/*    */       
/* 31 */       if (blm.a(aji.a(localadd.b()).b())) {
/* 32 */         float f1 = 0.625F;
/* 33 */         GL11.glTranslatef(0.0F, -0.34375F, 0.0F);
/* 34 */         GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/* 35 */         GL11.glScalef(f1, -f1, f1);
/*    */       }
/*    */       
/* 38 */       this.b.f.a(paramwr, localadd, 0);
/*    */       
/* 40 */       GL11.glPopMatrix();
/*    */     }
/*    */   }
/*    */   
/*    */   protected bqx a(wr paramwr)
/*    */   {
/* 46 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */