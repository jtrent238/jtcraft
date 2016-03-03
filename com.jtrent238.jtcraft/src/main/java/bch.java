/*    */ 
/*    */ 
/*    */ public abstract class bch
/*    */   extends bcm
/*    */ {
/*    */   public bch(bao parambao, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/*  8 */     super(parambao, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*    */   
/*    */ 
/*    */   protected boolean a(int paramInt)
/*    */   {
/* 17 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a() {}
/*    */   
/*    */ 
/*    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, bmh parambmh, int paramInt5, int paramInt6)
/*    */   {
/* 26 */     b(paramInt1).a(paramInt1, paramInt2, paramInt3, c(), paramInt4, parambmh, paramInt5, paramInt6, c(paramInt5, paramInt6) == paramInt1);
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2, int paramInt3) {
/* 30 */     if (e(paramInt2)) {
/* 31 */       int i = c(paramInt1, paramInt2);
/* 32 */       if (i >= 0) {
/* 33 */         int j = this.e + (this.a / 2 - c() / 2 + 2);
/* 34 */         int k = this.b + 4 - g() + (i * this.f + this.j);
/* 35 */         int m = paramInt1 - j;
/* 36 */         int n = paramInt2 - k;
/* 37 */         if (b(i).a(i, paramInt1, paramInt2, paramInt3, m, n)) {
/* 38 */           b(false);
/* 39 */           return true;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 44 */     return false;
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt1, int paramInt2, int paramInt3) {
/* 48 */     for (int i = 0; i < b(); i++) {
/* 49 */       int j = this.e + (this.a / 2 - c() / 2 + 2);
/* 50 */       int k = this.b + 4 - g() + (i * this.f + this.j);
/* 51 */       int m = paramInt1 - j;
/* 52 */       int n = paramInt2 - k;
/* 53 */       b(i).b(i, paramInt1, paramInt2, paramInt3, m, n);
/*    */     }
/*    */     
/* 56 */     b(true);
/* 57 */     return false;
/*    */   }
/*    */   
/*    */   public abstract bci b(int paramInt);
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */