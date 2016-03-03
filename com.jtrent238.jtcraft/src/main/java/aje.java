/*     */ import java.util.Random;
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
/*     */ public abstract class aje
/*     */   extends aji
/*     */ {
/*     */   protected final boolean a;
/*     */   
/*     */   public static final boolean b_(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 260 */     return a(paramahb.a(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public static final boolean a(aji paramaji) {
/* 264 */     return (paramaji == ajn.aq) || (paramaji == ajn.D) || (paramaji == ajn.E) || (paramaji == ajn.cc);
/*     */   }
/*     */   
/*     */   protected aje(boolean paramBoolean) {
/* 268 */     super(awt.q);
/* 269 */     this.a = paramBoolean;
/* 270 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/* 271 */     a(abt.e);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 275 */     return this.a;
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 280 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/* 289 */     return false;
/*     */   }
/*     */   
/*     */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2)
/*     */   {
/* 294 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 295 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazw1, paramazw2);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 300 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 301 */     if ((i >= 2) && (i <= 5)) {
/* 302 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*     */     } else {
/* 304 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 310 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 315 */     return 9;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 320 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 325 */     if (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/* 326 */       return true;
/*     */     }
/* 328 */     return false;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 333 */     if (!paramahb.E) {
/* 334 */       a(paramahb, paramInt1, paramInt2, paramInt3, true);
/*     */       
/* 336 */       if (this.a) {
/* 337 */         a(paramahb, paramInt1, paramInt2, paramInt3, this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 344 */     if (paramahb.E) { return;
/*     */     }
/* 346 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 347 */     int j = i;
/* 348 */     if (this.a) {
/* 349 */       j &= 0x7;
/*     */     }
/* 351 */     int k = 0;
/*     */     
/* 353 */     if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) k = 1;
/* 354 */     if ((j == 2) && (!ahb.a(paramahb, paramInt1 + 1, paramInt2, paramInt3))) k = 1;
/* 355 */     if ((j == 3) && (!ahb.a(paramahb, paramInt1 - 1, paramInt2, paramInt3))) k = 1;
/* 356 */     if ((j == 4) && (!ahb.a(paramahb, paramInt1, paramInt2, paramInt3 - 1))) k = 1;
/* 357 */     if ((j == 5) && (!ahb.a(paramahb, paramInt1, paramInt2, paramInt3 + 1))) { k = 1;
/*     */     }
/* 359 */     if (k != 0) {
/* 360 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 361 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 363 */       a(paramahb, paramInt1, paramInt2, paramInt3, i, j, paramaji);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, aji paramaji) {}
/*     */   
/*     */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 371 */     if (paramahb.E) return;
/* 372 */     new ajf(this, paramahb, paramInt1, paramInt2, paramInt3).a(paramahb.v(paramInt1, paramInt2, paramInt3), paramBoolean);
/*     */   }
/*     */   
/*     */ 
/*     */   public int h()
/*     */   {
/* 378 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 383 */     int i = paramInt4;
/* 384 */     if (this.a) {
/* 385 */       i &= 0x7;
/*     */     }
/*     */     
/* 388 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */     
/* 390 */     if ((i == 2) || (i == 3) || (i == 4) || (i == 5)) {
/* 391 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, paramaji);
/*     */     }
/* 393 */     if (this.a) {
/* 394 */       paramahb.d(paramInt1, paramInt2, paramInt3, paramaji);
/* 395 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, paramaji);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */