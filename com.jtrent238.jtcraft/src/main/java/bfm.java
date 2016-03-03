/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class bfm
/*     */   extends zs
/*     */ {
/*  60 */   public List a = new ArrayList();
/*     */   
/*     */   public bfm(yz paramyz) {
/*  63 */     yx localyx = paramyz.bm;
/*  64 */     for (int i = 0; i < 5; i++) {
/*  65 */       for (int j = 0; j < 9; j++) {
/*  66 */         a(new aay(bfl.f(), i * 9 + j, 9 + j * 18, 18 + i * 18));
/*     */       }
/*     */     }
/*     */     
/*  70 */     for (i = 0; i < 9; i++) {
/*  71 */       a(new aay(localyx, i, 9 + i * 18, 112));
/*     */     }
/*     */     
/*  74 */     a(0.0F);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  79 */     return true;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*  83 */     int i = this.a.size() / 9 - 5 + 1;
/*     */     
/*  85 */     int j = (int)(paramFloat * i + 0.5D);
/*  86 */     if (j < 0) j = 0;
/*  87 */     for (int k = 0; k < 5; k++) {
/*  88 */       for (int m = 0; m < 9; m++) {
/*  89 */         int n = m + (k + j) * 9;
/*  90 */         if ((n >= 0) && (n < this.a.size())) {
/*  91 */           bfl.f().a(m + k * 9, (add)this.a.get(n));
/*     */         } else {
/*  93 */           bfl.f().a(m + k * 9, null);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 100 */     return this.a.size() > 45;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void a(int paramInt1, int paramInt2, boolean paramBoolean, yz paramyz) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/* 115 */     if ((paramInt >= this.c.size() - 9) && (paramInt < this.c.size())) {
/* 116 */       aay localaay = (aay)this.c.get(paramInt);
/*     */       
/* 118 */       if ((localaay != null) && (localaay.e())) {
/* 119 */         localaay.c(null);
/*     */       }
/*     */     }
/*     */     
/* 123 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, aay paramaay)
/*     */   {
/* 128 */     return paramaay.i > 90;
/*     */   }
/*     */   
/*     */   public boolean b(aay paramaay)
/*     */   {
/* 133 */     return ((paramaay.f instanceof yx)) || ((paramaay.i > 90) && (paramaay.h <= 162));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bfm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */