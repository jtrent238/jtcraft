/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bir
/*    */   extends bhr
/*    */ {
/*    */   private bix a;
/*    */   private bix b;
/*    */   private bix c;
/*    */   
/*    */   public bir(float paramFloat, boolean paramBoolean)
/*    */   {
/* 16 */     this.b = new bix(this, "glass");
/* 17 */     this.b.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/*    */     
/* 19 */     this.a = new bix(this, "cube");
/* 20 */     this.a.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/*    */     
/* 22 */     if (paramBoolean) {
/* 23 */       this.c = new bix(this, "base");
/* 24 */       this.c.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 30 */     GL11.glPushMatrix();
/* 31 */     GL11.glScalef(2.0F, 2.0F, 2.0F);
/* 32 */     GL11.glTranslatef(0.0F, -0.5F, 0.0F);
/* 33 */     if (this.c != null) {
/* 34 */       this.c.a(paramFloat6);
/*    */     }
/* 36 */     GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 37 */     GL11.glTranslatef(0.0F, 0.8F + paramFloat3, 0.0F);
/* 38 */     GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 39 */     this.b.a(paramFloat6);
/* 40 */     float f = 0.875F;
/* 41 */     GL11.glScalef(f, f, f);
/* 42 */     GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 43 */     GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 44 */     this.b.a(paramFloat6);
/* 45 */     GL11.glScalef(f, f, f);
/* 46 */     GL11.glRotatef(60.0F, 0.7071F, 0.0F, 0.7071F);
/* 47 */     GL11.glRotatef(paramFloat2, 0.0F, 1.0F, 0.0F);
/* 48 */     this.a.a(paramFloat6);
/* 49 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */