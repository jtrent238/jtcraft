/*     */ import java.util.List;
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
/*     */ abstract class awd
/*     */   extends avk
/*     */ {
/* 224 */   protected int k = -1;
/*     */   
/*     */   private int a;
/*     */   private boolean b;
/*     */   
/*     */   public awd() {}
/*     */   
/*     */   protected awd(awa paramawa, int paramInt)
/*     */   {
/* 233 */     super(paramInt);
/* 234 */     if (paramawa != null) {
/* 235 */       this.b = paramawa.b;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 241 */     paramdh.a("HPos", this.k);
/* 242 */     paramdh.a("VCount", this.a);
/* 243 */     paramdh.a("Desert", this.b);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 248 */     this.k = paramdh.f("HPos");
/* 249 */     this.a = paramdh.f("VCount");
/* 250 */     this.b = paramdh.n("Desert");
/*     */   }
/*     */   
/*     */   protected avk a(awa paramawa, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
/* 254 */     switch (this.g) {
/*     */     case 2: 
/* 256 */       return avp.a(paramawa, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d());
/*     */     case 0: 
/* 258 */       return avp.a(paramawa, paramList, paramRandom, this.f.a - 1, this.f.b + paramInt1, this.f.c + paramInt2, 1, d());
/*     */     case 1: 
/* 260 */       return avp.a(paramawa, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d());
/*     */     case 3: 
/* 262 */       return avp.a(paramawa, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.c - 1, 2, d());
/*     */     }
/* 264 */     return null;
/*     */   }
/*     */   
/*     */   protected avk b(awa paramawa, List paramList, Random paramRandom, int paramInt1, int paramInt2) {
/* 268 */     switch (this.g) {
/*     */     case 2: 
/* 270 */       return avp.a(paramawa, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d());
/*     */     case 0: 
/* 272 */       return avp.a(paramawa, paramList, paramRandom, this.f.d + 1, this.f.b + paramInt1, this.f.c + paramInt2, 3, d());
/*     */     case 1: 
/* 274 */       return avp.a(paramawa, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d());
/*     */     case 3: 
/* 276 */       return avp.a(paramawa, paramList, paramRandom, this.f.a + paramInt2, this.f.b + paramInt1, this.f.f + 1, 0, d());
/*     */     }
/* 278 */     return null;
/*     */   }
/*     */   
/*     */   protected int b(ahb paramahb, asv paramasv)
/*     */   {
/* 283 */     int i = 0;
/* 284 */     int j = 0;
/* 285 */     for (int m = this.f.c; m <= this.f.f; m++) {
/* 286 */       for (int n = this.f.a; n <= this.f.d; n++) {
/* 287 */         if (paramasv.b(n, 64, m)) {
/* 288 */           i += Math.max(paramahb.i(n, m), paramahb.t.i());
/* 289 */           j++;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 294 */     if (j == 0) {
/* 295 */       return -1;
/*     */     }
/* 297 */     return i / j;
/*     */   }
/*     */   
/*     */   protected static boolean a(asv paramasv) {
/* 301 */     return (paramasv != null) && (paramasv.b > 10);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void a(ahb paramahb, asv paramasv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 316 */     if (this.a >= paramInt4) {
/* 317 */       return;
/*     */     }
/*     */     
/* 320 */     for (int i = this.a; i < paramInt4; i++) {
/* 321 */       int j = a(paramInt1 + i, paramInt3);
/* 322 */       int m = a(paramInt2);
/* 323 */       int n = b(paramInt1 + i, paramInt3);
/*     */       
/* 325 */       if (!paramasv.b(j, m, n)) break;
/* 326 */       this.a += 1;
/*     */       
/* 328 */       yv localyv = new yv(paramahb, b(i));
/* 329 */       localyv.b(j + 0.5D, m, n + 0.5D, 0.0F, 0.0F);
/* 330 */       paramahb.d(localyv);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected int b(int paramInt)
/*     */   {
/* 339 */     return 0;
/*     */   }
/*     */   
/*     */   protected aji b(aji paramaji, int paramInt) {
/* 343 */     if (this.b) {
/* 344 */       if ((paramaji == ajn.r) || (paramaji == ajn.s))
/* 345 */         return ajn.A;
/* 346 */       if (paramaji == ajn.e)
/* 347 */         return ajn.A;
/* 348 */       if (paramaji == ajn.f)
/* 349 */         return ajn.A;
/* 350 */       if (paramaji == ajn.ad)
/* 351 */         return ajn.bz;
/* 352 */       if (paramaji == ajn.ar)
/* 353 */         return ajn.bz;
/* 354 */       if (paramaji == ajn.n) {
/* 355 */         return ajn.A;
/*     */       }
/*     */     }
/* 358 */     return paramaji;
/*     */   }
/*     */   
/*     */   protected int c(aji paramaji, int paramInt) {
/* 362 */     if (this.b) {
/* 363 */       if ((paramaji == ajn.r) || (paramaji == ajn.s))
/* 364 */         return 0;
/* 365 */       if (paramaji == ajn.e)
/* 366 */         return 0;
/* 367 */       if (paramaji == ajn.f) {
/* 368 */         return 2;
/*     */       }
/*     */     }
/* 371 */     return paramInt;
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, int paramInt4, asv paramasv)
/*     */   {
/* 376 */     aji localaji = b(paramaji, paramInt1);
/* 377 */     int i = c(paramaji, paramInt1);
/* 378 */     super.a(paramahb, localaji, i, paramInt2, paramInt3, paramInt4, paramasv);
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, asv paramasv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, aji paramaji1, aji paramaji2, boolean paramBoolean)
/*     */   {
/* 383 */     aji localaji1 = b(paramaji1, 0);
/* 384 */     int i = c(paramaji1, 0);
/* 385 */     aji localaji2 = b(paramaji2, 0);
/* 386 */     int j = c(paramaji2, 0);
/* 387 */     super.a(paramahb, paramasv, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, localaji1, i, localaji2, j, paramBoolean);
/*     */   }
/*     */   
/*     */   protected void b(ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, int paramInt4, asv paramasv)
/*     */   {
/* 392 */     aji localaji = b(paramaji, paramInt1);
/* 393 */     int i = c(paramaji, paramInt1);
/* 394 */     super.b(paramahb, localaji, i, paramInt2, paramInt3, paramInt4, paramasv);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */