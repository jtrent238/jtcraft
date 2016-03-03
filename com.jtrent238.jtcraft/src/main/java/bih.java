/*    */ 
/*    */ 
/*    */ 
/*    */ public class bih
/*    */   extends bhr
/*    */ {
/*    */   bix a;
/*  8 */   bix[] b = new bix[8];
/*    */   
/*    */   public bih() {
/* 11 */     int i = -16;
/* 12 */     this.a = new bix(this, 0, 0);
/* 13 */     this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
/* 14 */     this.a.d += 24 + i;
/*    */     
/* 16 */     for (int j = 0; j < this.b.length; j++) {
/* 17 */       this.b[j] = new bix(this, 48, 0);
/*    */       
/* 19 */       double d = j * 3.141592653589793D * 2.0D / this.b.length;
/* 20 */       float f1 = (float)Math.cos(d) * 5.0F;
/* 21 */       float f2 = (float)Math.sin(d) * 5.0F;
/* 22 */       this.b[j].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
/*    */       
/* 24 */       this.b[j].c = f1;
/* 25 */       this.b[j].e = f2;
/* 26 */       this.b[j].d = (31 + i);
/*    */       
/* 28 */       d = j * 3.141592653589793D * -2.0D / this.b.length + 1.5707963267948966D;
/* 29 */       this.b[j].g = ((float)d);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 35 */     for (bix localbix : this.b)
/*    */     {
/* 37 */       localbix.f = paramFloat3;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 43 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 45 */     this.a.a(paramFloat6);
/* 46 */     for (int i = 0; i < this.b.length; i++) {
/* 47 */       this.b[i].a(paramFloat6);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */