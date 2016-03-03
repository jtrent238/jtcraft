/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhv
/*    */ {
/*    */   public bii[] a;
/*    */   public int b;
/*    */   private boolean c;
/*    */   
/*    */   public bhv(bii[] paramArrayOfbii)
/*    */   {
/* 12 */     this.a = paramArrayOfbii;
/* 13 */     this.b = paramArrayOfbii.length;
/*    */   }
/*    */   
/*    */   public bhv(bii[] paramArrayOfbii, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2) {
/* 17 */     this(paramArrayOfbii);
/*    */     
/* 19 */     float f1 = 0.0F / paramFloat1;
/* 20 */     float f2 = 0.0F / paramFloat2;
/* 21 */     paramArrayOfbii[0] = paramArrayOfbii[0].a(paramInt3 / paramFloat1 - f1, paramInt2 / paramFloat2 + f2);
/* 22 */     paramArrayOfbii[1] = paramArrayOfbii[1].a(paramInt1 / paramFloat1 + f1, paramInt2 / paramFloat2 + f2);
/* 23 */     paramArrayOfbii[2] = paramArrayOfbii[2].a(paramInt1 / paramFloat1 + f1, paramInt4 / paramFloat2 - f2);
/* 24 */     paramArrayOfbii[3] = paramArrayOfbii[3].a(paramInt3 / paramFloat1 - f1, paramInt4 / paramFloat2 - f2);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a()
/*    */   {
/* 37 */     bii[] arrayOfbii = new bii[this.a.length];
/* 38 */     for (int i = 0; i < this.a.length; i++)
/* 39 */       arrayOfbii[i] = this.a[(this.a.length - i - 1)];
/* 40 */     this.a = arrayOfbii;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat) {
/* 44 */     azw localazw1 = this.a[1].a.a(this.a[0].a);
/* 45 */     azw localazw2 = this.a[1].a.a(this.a[2].a);
/* 46 */     azw localazw3 = localazw2.c(localazw1).a();
/*    */     
/* 48 */     parambmh.b();
/* 49 */     if (this.c) {
/* 50 */       parambmh.c(-(float)localazw3.a, -(float)localazw3.b, -(float)localazw3.c);
/*    */     } else {
/* 52 */       parambmh.c((float)localazw3.a, (float)localazw3.b, (float)localazw3.c);
/*    */     }
/*    */     
/* 55 */     for (int i = 0; i < 4; i++) {
/* 56 */       bii localbii = this.a[i];
/* 57 */       parambmh.a((float)localbii.a.a * paramFloat, (float)localbii.a.b * paramFloat, (float)localbii.a.c * paramFloat, localbii.b, localbii.c);
/*    */     }
/* 59 */     parambmh.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */