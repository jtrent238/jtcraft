/*    */ public class bis
/*    */ {
/*    */   private bii[] h;
/*    */   private bhv[] i;
/*    */   public final float a;
/*    */   public final float b;
/*    */   public final float c;
/*    */   public final float d;
/*    */   public final float e;
/*    */   public final float f;
/*    */   public String g;
/*    */   
/*    */   public bis(bix parambix, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, int paramInt5, float paramFloat4) {
/* 14 */     this.a = paramFloat1;
/* 15 */     this.b = paramFloat2;
/* 16 */     this.c = paramFloat3;
/* 17 */     this.d = (paramFloat1 + paramInt3);
/* 18 */     this.e = (paramFloat2 + paramInt4);
/* 19 */     this.f = (paramFloat3 + paramInt5);
/* 20 */     this.h = new bii[8];
/* 21 */     this.i = new bhv[6];
/*    */     
/* 23 */     float f1 = paramFloat1 + paramInt3;
/* 24 */     float f2 = paramFloat2 + paramInt4;
/* 25 */     float f3 = paramFloat3 + paramInt5;
/*    */     
/* 27 */     paramFloat1 -= paramFloat4;
/* 28 */     paramFloat2 -= paramFloat4;
/* 29 */     paramFloat3 -= paramFloat4;
/* 30 */     f1 += paramFloat4;
/* 31 */     f2 += paramFloat4;
/* 32 */     f3 += paramFloat4;
/*    */     
/* 34 */     if (parambix.i) {
/* 35 */       float f4 = f1;
/* 36 */       f1 = paramFloat1;
/* 37 */       paramFloat1 = f4;
/*    */     }
/*    */     
/* 40 */     bii localbii1 = new bii(paramFloat1, paramFloat2, paramFloat3, 0.0F, 0.0F);
/* 41 */     bii localbii2 = new bii(f1, paramFloat2, paramFloat3, 0.0F, 8.0F);
/* 42 */     bii localbii3 = new bii(f1, f2, paramFloat3, 8.0F, 8.0F);
/* 43 */     bii localbii4 = new bii(paramFloat1, f2, paramFloat3, 8.0F, 0.0F);
/*    */     
/* 45 */     bii localbii5 = new bii(paramFloat1, paramFloat2, f3, 0.0F, 0.0F);
/* 46 */     bii localbii6 = new bii(f1, paramFloat2, f3, 0.0F, 8.0F);
/* 47 */     bii localbii7 = new bii(f1, f2, f3, 8.0F, 8.0F);
/* 48 */     bii localbii8 = new bii(paramFloat1, f2, f3, 8.0F, 0.0F);
/*    */     
/* 50 */     this.h[0] = localbii1;
/* 51 */     this.h[1] = localbii2;
/* 52 */     this.h[2] = localbii3;
/* 53 */     this.h[3] = localbii4;
/* 54 */     this.h[4] = localbii5;
/* 55 */     this.h[5] = localbii6;
/* 56 */     this.h[6] = localbii7;
/* 57 */     this.h[7] = localbii8;
/*    */     
/* 59 */     this.i[0] = new bhv(new bii[] { localbii6, localbii2, localbii3, localbii7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5 + paramInt4, parambix.a, parambix.b);
/*    */     
/*    */ 
/* 62 */     this.i[1] = new bhv(new bii[] { localbii1, localbii5, localbii8, localbii4 }, paramInt1, paramInt2 + paramInt5, paramInt1 + paramInt5, paramInt2 + paramInt5 + paramInt4, parambix.a, parambix.b);
/*    */     
/*    */ 
/*    */ 
/* 66 */     this.i[2] = new bhv(new bii[] { localbii6, localbii5, localbii1, localbii2 }, paramInt1 + paramInt5, paramInt2, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, parambix.a, parambix.b);
/*    */     
/*    */ 
/* 69 */     this.i[3] = new bhv(new bii[] { localbii3, localbii4, localbii8, localbii7 }, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt3, paramInt2, parambix.a, parambix.b);
/*    */     
/*    */ 
/*    */ 
/* 73 */     this.i[4] = new bhv(new bii[] { localbii2, localbii1, localbii4, localbii3 }, paramInt1 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, parambix.a, parambix.b);
/*    */     
/*    */ 
/* 76 */     this.i[5] = new bhv(new bii[] { localbii5, localbii6, localbii7, localbii8 }, paramInt1 + paramInt5 + paramInt3 + paramInt5, paramInt2 + paramInt5, paramInt1 + paramInt5 + paramInt3 + paramInt5 + paramInt3, paramInt2 + paramInt5 + paramInt4, parambix.a, parambix.b);
/*    */     
/*    */ 
/*    */ 
/* 80 */     if (parambix.i) {
/* 81 */       for (int j = 0; j < this.i.length; j++)
/* 82 */         this.i[j].a();
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat) {
/* 87 */     for (int j = 0; j < this.i.length; j++) {
/* 88 */       this.i[j].a(parambmh, paramFloat);
/*    */     }
/*    */   }
/*    */   
/*    */   public bis a(String paramString) {
/* 93 */     this.g = paramString;
/* 94 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */