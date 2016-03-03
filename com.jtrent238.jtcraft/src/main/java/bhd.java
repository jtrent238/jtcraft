/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhd
/*    */   extends bhr
/*    */ {
/*    */   private bix[] a;
/*    */   private bix b;
/*    */   
/*    */   public bhd()
/*    */   {
/* 13 */     this.a = new bix[12];
/*    */     
/* 15 */     for (int i = 0; i < this.a.length; i++) {
/* 16 */       this.a[i] = new bix(this, 0, 16);
/* 17 */       this.a[i].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
/*    */     }
/*    */     
/* 20 */     this.b = new bix(this, 0, 0);
/* 21 */     this.b.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 26 */     return 8;
/*    */   }
/*    */   
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 31 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*    */     
/* 33 */     this.b.a(paramFloat6);
/* 34 */     for (int i = 0; i < this.a.length; i++) {
/* 35 */       this.a[i].a(paramFloat6);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*    */   {
/* 41 */     float f = paramFloat3 * 3.1415927F * -0.1F;
/* 42 */     for (int i = 0; i < 4; i++) {
/* 43 */       this.a[i].d = (-2.0F + qh.b((i * 2 + paramFloat3) * 0.25F));
/* 44 */       this.a[i].c = (qh.b(f) * 9.0F);
/* 45 */       this.a[i].e = (qh.a(f) * 9.0F);
/* 46 */       f += 1.5707964F;
/*    */     }
/*    */     
/* 49 */     f = 0.7853982F + paramFloat3 * 3.1415927F * 0.03F;
/* 50 */     for (i = 4; i < 8; i++) {
/* 51 */       this.a[i].d = (2.0F + qh.b((i * 2 + paramFloat3) * 0.25F));
/* 52 */       this.a[i].c = (qh.b(f) * 7.0F);
/* 53 */       this.a[i].e = (qh.a(f) * 7.0F);
/* 54 */       f += 1.5707964F;
/*    */     }
/*    */     
/* 57 */     f = 0.47123894F + paramFloat3 * 3.1415927F * -0.05F;
/* 58 */     for (i = 8; i < 12; i++) {
/* 59 */       this.a[i].d = (11.0F + qh.b((i * 1.5F + paramFloat3) * 0.5F));
/* 60 */       this.a[i].c = (qh.b(f) * 5.0F);
/* 61 */       this.a[i].e = (qh.a(f) * 5.0F);
/* 62 */       f += 1.5707964F;
/*    */     }
/*    */     
/* 65 */     this.b.g = (paramFloat4 / 57.295776F);
/* 66 */     this.b.f = (paramFloat5 / 57.295776F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */