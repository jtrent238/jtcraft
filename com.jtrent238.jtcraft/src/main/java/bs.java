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
/*     */ class bs
/*     */ {
/*     */   double a;
/*     */   double b;
/*     */   
/*     */   bs() {}
/*     */   
/*     */   bs(double paramDouble1, double paramDouble2)
/*     */   {
/* 233 */     this.a = paramDouble1;
/* 234 */     this.b = paramDouble2;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   double a(bs parambs)
/*     */   {
/* 243 */     double d1 = this.a - parambs.a;
/* 244 */     double d2 = this.b - parambs.b;
/*     */     
/* 246 */     return Math.sqrt(d1 * d1 + d2 * d2);
/*     */   }
/*     */   
/*     */   void a() {
/* 250 */     double d = b();
/* 251 */     this.a /= d;
/* 252 */     this.b /= d;
/*     */   }
/*     */   
/*     */   float b() {
/* 256 */     return qh.a(this.a * this.a + this.b * this.b);
/*     */   }
/*     */   
/*     */   public void b(bs parambs) {
/* 260 */     this.a -= parambs.a;
/* 261 */     this.b -= parambs.b;
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 265 */     boolean bool = false;
/*     */     
/* 267 */     if (this.a < paramDouble1) {
/* 268 */       this.a = paramDouble1;
/* 269 */       bool = true;
/* 270 */     } else if (this.a > paramDouble3) {
/* 271 */       this.a = paramDouble3;
/* 272 */       bool = true;
/*     */     }
/*     */     
/* 275 */     if (this.b < paramDouble2) {
/* 276 */       this.b = paramDouble2;
/* 277 */       bool = true;
/* 278 */     } else if (this.b > paramDouble4) {
/* 279 */       this.b = paramDouble4;
/* 280 */       bool = true;
/*     */     }
/*     */     
/* 283 */     return bool;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb) {
/* 287 */     int i = qh.c(this.a);
/* 288 */     int j = qh.c(this.b);
/*     */     
/* 290 */     for (int k = 256; k > 0; k--) {
/* 291 */       if (paramahb.a(i, k, j).o() != awt.a) {
/* 292 */         return k + 1;
/*     */       }
/*     */     }
/*     */     
/* 296 */     return 257;
/*     */   }
/*     */   
/*     */   public boolean b(ahb paramahb) {
/* 300 */     int i = qh.c(this.a);
/* 301 */     int j = qh.c(this.b);
/*     */     
/* 303 */     int k = 256; if (k > 0) {
/* 304 */       awt localawt = paramahb.a(i, k, j).o();
/*     */       
/* 306 */       return (!localawt.d()) && (localawt != awt.o);
/*     */     }
/*     */     
/* 309 */     return false;
/*     */   }
/*     */   
/*     */   public void a(Random paramRandom, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 313 */     this.a = qh.a(paramRandom, paramDouble1, paramDouble3);
/* 314 */     this.b = qh.a(paramRandom, paramDouble2, paramDouble4);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */