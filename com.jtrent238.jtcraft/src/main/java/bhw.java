/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhw
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/* 14 */   protected float g = 8.0F;
/* 15 */   protected float h = 4.0F;
/*    */   
/*    */   public bhw(int paramInt, float paramFloat) {
/* 18 */     this.a = new bix(this, 0, 0);
/* 19 */     this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, paramFloat);
/* 20 */     this.a.a(0.0F, 18 - paramInt, -6.0F);
/*    */     
/* 22 */     this.b = new bix(this, 28, 8);
/* 23 */     this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, paramFloat);
/* 24 */     this.b.a(0.0F, 17 - paramInt, 2.0F);
/*    */     
/* 26 */     this.c = new bix(this, 0, 16);
/* 27 */     this.c.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 28 */     this.c.a(-3.0F, 24 - paramInt, 7.0F);
/*    */     
/* 30 */     this.d = new bix(this, 0, 16);
/* 31 */     this.d.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 32 */     this.d.a(3.0F, 24 - paramInt, 7.0F);
/*    */     
/* 34 */     this.e = new bix(this, 0, 16);
/* 35 */     this.e.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 36 */     this.e.a(-3.0F, 24 - paramInt, -5.0F);
/*    */     
/* 38 */     this.f = new bix(this, 0, 16);
/* 39 */     this.f.a(-2.0F, 0.0F, -2.0F, 4, paramInt, 4, paramFloat);
/* 40 */     this.f.a(3.0F, 24 - paramInt, -5.0F);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 45 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 47 */     if (this.s) {
/* 48 */       float f1 = 2.0F;
/* 49 */       GL11.glPushMatrix();
/* 50 */       GL11.glTranslatef(0.0F, this.g * paramFloat6, this.h * paramFloat6);
/* 51 */       this.a.a(paramFloat6);
/* 52 */       GL11.glPopMatrix();
/* 53 */       GL11.glPushMatrix();
/* 54 */       GL11.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/* 55 */       GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 56 */       this.b.a(paramFloat6);
/* 57 */       this.c.a(paramFloat6);
/* 58 */       this.d.a(paramFloat6);
/* 59 */       this.e.a(paramFloat6);
/* 60 */       this.f.a(paramFloat6);
/* 61 */       GL11.glPopMatrix();
/*    */     } else {
/* 63 */       this.a.a(paramFloat6);
/* 64 */       this.b.a(paramFloat6);
/* 65 */       this.c.a(paramFloat6);
/* 66 */       this.d.a(paramFloat6);
/* 67 */       this.e.a(paramFloat6);
/* 68 */       this.f.a(paramFloat6);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 74 */     float f1 = 57.295776F;
/* 75 */     this.a.f = (paramFloat5 / 57.295776F);
/* 76 */     this.a.g = (paramFloat4 / 57.295776F);
/* 77 */     this.b.f = 1.5707964F;
/*    */     
/* 79 */     this.c.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 80 */     this.d.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 81 */     this.e.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 82 */     this.f.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */