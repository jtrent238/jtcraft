/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public class bhh extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   public bix d;
/*    */   public bix e;
/*    */   public bix f;
/*    */   public bix g;
/*    */   public bix h;
/*    */   
/*    */   public bhh()
/*    */   {
/* 16 */     int i = 16;
/* 17 */     this.a = new bix(this, 0, 0);
/* 18 */     this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
/* 19 */     this.a.a(0.0F, -1 + i, -4.0F);
/*    */     
/* 21 */     this.g = new bix(this, 14, 0);
/* 22 */     this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
/* 23 */     this.g.a(0.0F, -1 + i, -4.0F);
/*    */     
/* 25 */     this.h = new bix(this, 14, 4);
/* 26 */     this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
/* 27 */     this.h.a(0.0F, -1 + i, -4.0F);
/*    */     
/* 29 */     this.b = new bix(this, 0, 9);
/* 30 */     this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
/* 31 */     this.b.a(0.0F, i, 0.0F);
/*    */     
/* 33 */     this.c = new bix(this, 26, 0);
/* 34 */     this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
/* 35 */     this.c.a(-2.0F, 3 + i, 1.0F);
/*    */     
/* 37 */     this.d = new bix(this, 26, 0);
/* 38 */     this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
/* 39 */     this.d.a(1.0F, 3 + i, 1.0F);
/*    */     
/* 41 */     this.e = new bix(this, 24, 13);
/* 42 */     this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
/* 43 */     this.e.a(-4.0F, -3 + i, 0.0F);
/*    */     
/* 45 */     this.f = new bix(this, 24, 13);
/* 46 */     this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
/* 47 */     this.f.a(4.0F, -3 + i, 0.0F);
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 52 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 54 */     if (this.s) {
/* 55 */       float f1 = 2.0F;
/* 56 */       GL11.glPushMatrix();
/* 57 */       GL11.glTranslatef(0.0F, 5.0F * paramFloat6, 2.0F * paramFloat6);
/* 58 */       this.a.a(paramFloat6);
/* 59 */       this.g.a(paramFloat6);
/* 60 */       this.h.a(paramFloat6);
/* 61 */       GL11.glPopMatrix();
/* 62 */       GL11.glPushMatrix();
/* 63 */       GL11.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/* 64 */       GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/* 65 */       this.b.a(paramFloat6);
/* 66 */       this.c.a(paramFloat6);
/* 67 */       this.d.a(paramFloat6);
/* 68 */       this.e.a(paramFloat6);
/* 69 */       this.f.a(paramFloat6);
/* 70 */       GL11.glPopMatrix();
/*    */     } else {
/* 72 */       this.a.a(paramFloat6);
/* 73 */       this.g.a(paramFloat6);
/* 74 */       this.h.a(paramFloat6);
/* 75 */       this.b.a(paramFloat6);
/* 76 */       this.c.a(paramFloat6);
/* 77 */       this.d.a(paramFloat6);
/* 78 */       this.e.a(paramFloat6);
/* 79 */       this.f.a(paramFloat6);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 85 */     this.a.f = (paramFloat5 / 57.295776F);
/* 86 */     this.a.g = (paramFloat4 / 57.295776F);
/*    */     
/* 88 */     this.g.f = this.a.f;
/* 89 */     this.g.g = this.a.g;
/*    */     
/* 91 */     this.h.f = this.a.f;
/* 92 */     this.h.g = this.a.g;
/*    */     
/* 94 */     this.b.f = 1.5707964F;
/*    */     
/* 96 */     this.c.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 97 */     this.d.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 98 */     this.e.h = paramFloat3;
/* 99 */     this.f.h = (-paramFloat3);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */