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
/*     */ public class asy
/*     */   extends avk
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private int d;
/*     */   
/*     */   public asy() {}
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 210 */     paramdh.a("hr", this.a);
/* 211 */     paramdh.a("sc", this.b);
/* 212 */     paramdh.a("hps", this.c);
/* 213 */     paramdh.a("Num", this.d);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 218 */     this.a = paramdh.n("hr");
/* 219 */     this.b = paramdh.n("sc");
/* 220 */     this.c = paramdh.n("hps");
/* 221 */     this.d = paramdh.f("Num");
/*     */   }
/*     */   
/*     */   public asy(int paramInt1, Random paramRandom, asv paramasv, int paramInt2) {
/* 225 */     super(paramInt1);
/* 226 */     this.g = paramInt2;
/* 227 */     this.f = paramasv;
/* 228 */     this.a = (paramRandom.nextInt(3) == 0);
/* 229 */     this.b = ((!this.a) && (paramRandom.nextInt(23) == 0));
/*     */     
/* 231 */     if ((this.g == 2) || (this.g == 0)) {
/* 232 */       this.d = (paramasv.d() / 5);
/*     */     } else {
/* 234 */       this.d = (paramasv.b() / 5);
/*     */     }
/*     */   }
/*     */   
/*     */   public static asv a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 240 */     asv localasv = new asv(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
/*     */     
/* 242 */     int i = paramRandom.nextInt(3) + 2;
/* 243 */     while (i > 0) {
/* 244 */       int j = i * 5;
/*     */       
/* 246 */       switch (paramInt4) {
/*     */       case 2: 
/* 248 */         localasv.d = (paramInt1 + 2);
/* 249 */         localasv.c = (paramInt3 - (j - 1));
/* 250 */         break;
/*     */       case 0: 
/* 252 */         localasv.d = (paramInt1 + 2);
/* 253 */         localasv.f = (paramInt3 + (j - 1));
/* 254 */         break;
/*     */       case 1: 
/* 256 */         localasv.a = (paramInt1 - (j - 1));
/* 257 */         localasv.f = (paramInt3 + 2);
/* 258 */         break;
/*     */       case 3: 
/* 260 */         localasv.d = (paramInt1 + (j - 1));
/* 261 */         localasv.f = (paramInt3 + 2);
/*     */       }
/*     */       
/*     */       
/* 265 */       if (avk.a(paramList, localasv) == null) break;
/* 266 */       i--;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 272 */     if (i > 0) {
/* 273 */       return localasv;
/*     */     }
/*     */     
/* 276 */     return null;
/*     */   }
/*     */   
/*     */   public void a(avk paramavk, List paramList, Random paramRandom)
/*     */   {
/* 281 */     int i = d();
/* 282 */     int j = paramRandom.nextInt(4);
/* 283 */     switch (this.g) {
/*     */     case 2: 
/* 285 */       if (j <= 1) {
/* 286 */         asx.a(paramavk, paramList, paramRandom, this.f.a, this.f.b - 1 + paramRandom.nextInt(3), this.f.c - 1, this.g, i);
/* 287 */       } else if (j == 2) {
/* 288 */         asx.a(paramavk, paramList, paramRandom, this.f.a - 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.c, 1, i);
/*     */       } else {
/* 290 */         asx.a(paramavk, paramList, paramRandom, this.f.d + 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.c, 3, i);
/*     */       }
/* 292 */       break;
/*     */     case 0: 
/* 294 */       if (j <= 1) {
/* 295 */         asx.a(paramavk, paramList, paramRandom, this.f.a, this.f.b - 1 + paramRandom.nextInt(3), this.f.f + 1, this.g, i);
/* 296 */       } else if (j == 2) {
/* 297 */         asx.a(paramavk, paramList, paramRandom, this.f.a - 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.f - 3, 1, i);
/*     */       } else {
/* 299 */         asx.a(paramavk, paramList, paramRandom, this.f.d + 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.f - 3, 3, i);
/*     */       }
/* 301 */       break;
/*     */     case 1: 
/* 303 */       if (j <= 1) {
/* 304 */         asx.a(paramavk, paramList, paramRandom, this.f.a - 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.c, this.g, i);
/* 305 */       } else if (j == 2) {
/* 306 */         asx.a(paramavk, paramList, paramRandom, this.f.a, this.f.b - 1 + paramRandom.nextInt(3), this.f.c - 1, 2, i);
/*     */       } else {
/* 308 */         asx.a(paramavk, paramList, paramRandom, this.f.a, this.f.b - 1 + paramRandom.nextInt(3), this.f.f + 1, 0, i);
/*     */       }
/* 310 */       break;
/*     */     case 3: 
/* 312 */       if (j <= 1) {
/* 313 */         asx.a(paramavk, paramList, paramRandom, this.f.d + 1, this.f.b - 1 + paramRandom.nextInt(3), this.f.c, this.g, i);
/* 314 */       } else if (j == 2) {
/* 315 */         asx.a(paramavk, paramList, paramRandom, this.f.d - 3, this.f.b - 1 + paramRandom.nextInt(3), this.f.c - 1, 2, i);
/*     */       } else {
/* 317 */         asx.a(paramavk, paramList, paramRandom, this.f.d - 3, this.f.b - 1 + paramRandom.nextInt(3), this.f.f + 1, 0, i);
/*     */       }
/*     */       
/*     */       break;
/*     */     }
/*     */     
/* 323 */     if (i < 8) { int k;
/* 324 */       int m; if ((this.g == 2) || (this.g == 0)) {
/* 325 */         for (k = this.f.c + 3; k + 3 <= this.f.f; k += 5) {
/* 326 */           m = paramRandom.nextInt(5);
/* 327 */           if (m == 0) {
/* 328 */             asx.a(paramavk, paramList, paramRandom, this.f.a - 1, this.f.b, k, 1, i + 1);
/* 329 */           } else if (m == 1) {
/* 330 */             asx.a(paramavk, paramList, paramRandom, this.f.d + 1, this.f.b, k, 3, i + 1);
/*     */           }
/*     */         }
/*     */       } else {
/* 334 */         for (k = this.f.a + 3; k + 3 <= this.f.d; k += 5) {
/* 335 */           m = paramRandom.nextInt(5);
/* 336 */           if (m == 0) {
/* 337 */             asx.a(paramavk, paramList, paramRandom, k, this.f.b, this.f.c - 1, 2, i + 1);
/* 338 */           } else if (m == 1) {
/* 339 */             asx.a(paramavk, paramList, paramRandom, k, this.f.b, this.f.f + 1, 0, i + 1);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, asv paramasv, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, qx[] paramArrayOfqx, int paramInt4)
/*     */   {
/* 348 */     int i = a(paramInt1, paramInt3);
/* 349 */     int j = a(paramInt2);
/* 350 */     int k = b(paramInt1, paramInt3);
/*     */     
/* 352 */     if ((paramasv.b(i, j, k)) && 
/* 353 */       (paramahb.a(i, j, k).o() == awt.a)) {
/* 354 */       int m = paramRandom.nextBoolean() ? 1 : 0;
/* 355 */       paramahb.d(i, j, k, ajn.aq, a(ajn.aq, m), 2);
/* 356 */       xm localxm = new xm(paramahb, i + 0.5F, j + 0.5F, k + 0.5F);
/* 357 */       qx.a(paramRandom, paramArrayOfqx, localxm, paramInt4);
/* 358 */       paramahb.d(localxm);
/* 359 */       return true;
/*     */     }
/*     */     
/*     */ 
/* 363 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, asv paramasv)
/*     */   {
/* 369 */     if (a(paramahb, paramasv)) {
/* 370 */       return false;
/*     */     }
/*     */     
/* 373 */     int i = 0;
/* 374 */     int j = 2;
/* 375 */     int k = 0;
/* 376 */     int m = 2;
/* 377 */     int n = this.d * 5 - 1;
/*     */     
/*     */ 
/* 380 */     a(paramahb, paramasv, 0, 0, 0, 2, 1, n, ajn.a, ajn.a, false);
/* 381 */     a(paramahb, paramasv, paramRandom, 0.8F, 0, 2, 0, 2, 2, n, ajn.a, ajn.a, false);
/*     */     
/* 383 */     if (this.b)
/* 384 */       a(paramahb, paramasv, paramRandom, 0.6F, 0, 0, 0, 2, 1, n, ajn.G, ajn.a, false);
/*     */     int i2;
/*     */     int i3;
/*     */     int i5;
/* 388 */     for (int i1 = 0; i1 < this.d; i1++)
/*     */     {
/* 390 */       i2 = 2 + i1 * 5;
/*     */       
/* 392 */       a(paramahb, paramasv, 0, 0, i2, 0, 1, i2, ajn.aJ, ajn.a, false);
/* 393 */       a(paramahb, paramasv, 2, 0, i2, 2, 1, i2, ajn.aJ, ajn.a, false);
/* 394 */       if (paramRandom.nextInt(4) == 0) {
/* 395 */         a(paramahb, paramasv, 0, 2, i2, 0, 2, i2, ajn.f, ajn.a, false);
/* 396 */         a(paramahb, paramasv, 2, 2, i2, 2, 2, i2, ajn.f, ajn.a, false);
/*     */       } else {
/* 398 */         a(paramahb, paramasv, 0, 2, i2, 2, 2, i2, ajn.f, ajn.a, false);
/*     */       }
/* 400 */       a(paramahb, paramasv, paramRandom, 0.1F, 0, 2, i2 - 1, ajn.G, 0);
/* 401 */       a(paramahb, paramasv, paramRandom, 0.1F, 2, 2, i2 - 1, ajn.G, 0);
/* 402 */       a(paramahb, paramasv, paramRandom, 0.1F, 0, 2, i2 + 1, ajn.G, 0);
/* 403 */       a(paramahb, paramasv, paramRandom, 0.1F, 2, 2, i2 + 1, ajn.G, 0);
/* 404 */       a(paramahb, paramasv, paramRandom, 0.05F, 0, 2, i2 - 2, ajn.G, 0);
/* 405 */       a(paramahb, paramasv, paramRandom, 0.05F, 2, 2, i2 - 2, ajn.G, 0);
/* 406 */       a(paramahb, paramasv, paramRandom, 0.05F, 0, 2, i2 + 2, ajn.G, 0);
/* 407 */       a(paramahb, paramasv, paramRandom, 0.05F, 2, 2, i2 + 2, ajn.G, 0);
/*     */       
/* 409 */       a(paramahb, paramasv, paramRandom, 0.05F, 1, 2, i2 - 1, ajn.aa, 0);
/* 410 */       a(paramahb, paramasv, paramRandom, 0.05F, 1, 2, i2 + 1, ajn.aa, 0);
/*     */       
/* 412 */       if (paramRandom.nextInt(100) == 0) {
/* 413 */         a(paramahb, paramasv, paramRandom, 2, 0, i2 - 1, qx.a(asx.b(), new qx[] { ade.bR.b(paramRandom) }), 3 + paramRandom.nextInt(4));
/*     */       }
/* 415 */       if (paramRandom.nextInt(100) == 0) {
/* 416 */         a(paramahb, paramasv, paramRandom, 0, 0, i2 + 1, qx.a(asx.b(), new qx[] { ade.bR.b(paramRandom) }), 3 + paramRandom.nextInt(4));
/*     */       }
/* 418 */       if ((this.b) && (!this.c)) {
/* 419 */         i3 = a(0);int i4 = i2 - 1 + paramRandom.nextInt(3);
/* 420 */         i5 = a(1, i4);
/* 421 */         i4 = b(1, i4);
/* 422 */         if (paramasv.b(i5, i3, i4)) {
/* 423 */           this.c = true;
/* 424 */           paramahb.d(i5, i3, i4, ajn.ac, 0, 2);
/* 425 */           apj localapj = (apj)paramahb.o(i5, i3, i4);
/* 426 */           if (localapj != null) { localapj.a().a("CaveSpider");
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 432 */     for (i1 = 0; i1 <= 2; i1++) {
/* 433 */       for (i2 = 0; i2 <= n; i2++) {
/* 434 */         i3 = -1;
/* 435 */         aji localaji2 = a(paramahb, i1, i3, i2, paramasv);
/* 436 */         if (localaji2.o() == awt.a) {
/* 437 */           i5 = -1;
/* 438 */           a(paramahb, ajn.f, 0, i1, i5, i2, paramasv);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 443 */     if (this.a) {
/* 444 */       for (i1 = 0; i1 <= n; i1++) {
/* 445 */         aji localaji1 = a(paramahb, 1, -1, i1, paramasv);
/* 446 */         if ((localaji1.o() != awt.a) && (localaji1.j())) {
/* 447 */           a(paramahb, paramasv, paramRandom, 0.7F, 1, 0, i1, ajn.aq, a(ajn.aq, 0));
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 452 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */