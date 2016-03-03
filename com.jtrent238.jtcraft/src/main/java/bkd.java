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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkd
/*     */   extends bkm
/*     */ {
/* 280 */   private int a = 160;
/*     */   private boolean aB;
/*     */   private boolean aC;
/*     */   private final bkn aD;
/*     */   private float aE;
/*     */   private float aF;
/*     */   private float aG;
/*     */   private boolean aH;
/*     */   
/*     */   public bkd(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, bkn parambkn)
/*     */   {
/* 291 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/* 292 */     this.v = paramDouble4;
/* 293 */     this.w = paramDouble5;
/* 294 */     this.x = paramDouble6;
/* 295 */     this.aD = parambkn;
/*     */     
/* 297 */     this.h *= 0.75F;
/*     */     
/* 299 */     this.g = (48 + this.Z.nextInt(12));
/* 300 */     this.X = false;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 304 */     this.aB = paramBoolean;
/*     */   }
/*     */   
/*     */   public void f(boolean paramBoolean) {
/* 308 */     this.aC = paramBoolean;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 312 */     float f1 = ((paramInt & 0xFF0000) >> 16) / 255.0F;
/* 313 */     float f2 = ((paramInt & 0xFF00) >> 8) / 255.0F;
/* 314 */     float f3 = ((paramInt & 0xFF) >> 0) / 255.0F;
/* 315 */     float f4 = 1.0F;
/* 316 */     b(f1 * f4, f2 * f4, f3 * f4);
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 320 */     this.aE = (((paramInt & 0xFF0000) >> 16) / 255.0F);
/* 321 */     this.aF = (((paramInt & 0xFF00) >> 8) / 255.0F);
/* 322 */     this.aG = (((paramInt & 0xFF) >> 0) / 255.0F);
/* 323 */     this.aH = true;
/*     */   }
/*     */   
/*     */   public azt J()
/*     */   {
/* 328 */     return null;
/*     */   }
/*     */   
/*     */   public boolean S()
/*     */   {
/* 333 */     return false;
/*     */   }
/*     */   
/*     */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/* 338 */     if ((!this.aC) || (this.f < this.g / 3) || ((this.f + this.g) / 3 % 2 == 0)) {
/* 339 */       super.a(parambmh, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 345 */     this.p = this.s;
/* 346 */     this.q = this.t;
/* 347 */     this.r = this.u;
/*     */     
/* 349 */     if (this.f++ >= this.g) B();
/* 350 */     if (this.f > this.g / 2) {
/* 351 */       g(1.0F - (this.f - this.g / 2) / this.g);
/*     */       
/* 353 */       if (this.aH) {
/* 354 */         this.at += (this.aE - this.at) * 0.2F;
/* 355 */         this.au += (this.aF - this.au) * 0.2F;
/* 356 */         this.av += (this.aG - this.av) * 0.2F;
/*     */       }
/*     */     }
/*     */     
/* 360 */     k(this.a + (7 - this.f * 8 / this.g));
/*     */     
/* 362 */     this.w -= 0.004D;
/* 363 */     d(this.v, this.w, this.x);
/* 364 */     this.v *= 0.9100000262260437D;
/* 365 */     this.w *= 0.9100000262260437D;
/* 366 */     this.x *= 0.9100000262260437D;
/*     */     
/* 368 */     if (this.D) {
/* 369 */       this.v *= 0.699999988079071D;
/* 370 */       this.x *= 0.699999988079071D;
/*     */     }
/*     */     
/* 373 */     if ((this.aB) && (this.f < this.g / 2) && ((this.f + this.g) % 2 == 0)) {
/* 374 */       bkd localbkd = new bkd(this.o, this.s, this.t, this.u, 0.0D, 0.0D, 0.0D, this.aD);
/* 375 */       localbkd.b(this.at, this.au, this.av);
/* 376 */       localbkd.f = (localbkd.g / 2);
/* 377 */       if (this.aH) {
/* 378 */         localbkd.aH = true;
/* 379 */         localbkd.aE = this.aE;
/* 380 */         localbkd.aF = this.aF;
/* 381 */         localbkd.aG = this.aG;
/*     */       }
/* 383 */       localbkd.aC = this.aC;
/* 384 */       this.aD.a(localbkd);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int c(float paramFloat)
/*     */   {
/* 394 */     return 15728880;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/* 399 */     return 1.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */