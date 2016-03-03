/*    */ import java.util.Random;
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
/*    */ public class bhl
/*    */   extends bhr
/*    */ {
/*    */   bix a;
/* 16 */   bix[] b = new bix[9];
/*    */   
/*    */   public bhl() {
/* 19 */     int i = -16;
/* 20 */     this.a = new bix(this, 0, 0);
/* 21 */     this.a.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
/* 22 */     this.a.d += 24 + i;
/*    */     
/* 24 */     Random localRandom = new Random(1660L);
/* 25 */     for (int j = 0; j < this.b.length; j++) {
/* 26 */       this.b[j] = new bix(this, 0, 0);
/*    */       
/* 28 */       float f1 = ((j % 3 - j / 3 % 2 * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 29 */       float f2 = (j / 3 / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 30 */       int k = localRandom.nextInt(7) + 8;
/* 31 */       this.b[j].a(-1.0F, 0.0F, -1.0F, 2, k, 2);
/*    */       
/* 33 */       this.b[j].c = f1;
/* 34 */       this.b[j].e = f2;
/* 35 */       this.b[j].d = (31 + i);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 41 */     for (int i = 0; i < this.b.length; i++)
/*    */     {
/* 43 */       this.b[i].f = (0.2F * qh.a(paramFloat3 * 0.3F + i) + 0.4F);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 49 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 51 */     GL11.glPushMatrix();
/* 52 */     GL11.glTranslatef(0.0F, 0.6F, 0.0F);
/*    */     
/* 54 */     this.a.a(paramFloat6);
/* 55 */     for (bix localbix : this.b) {
/* 56 */       localbix.a(paramFloat6);
/*    */     }
/*    */     
/* 59 */     GL11.glPopMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */