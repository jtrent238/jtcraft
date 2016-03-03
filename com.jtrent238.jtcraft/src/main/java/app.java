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
/*     */ public class app
/*     */   extends aji
/*     */ {
/*     */   private final boolean a;
/*     */   private rf b;
/*     */   private rf M;
/*     */   private rf N;
/*     */   
/*     */   public app(boolean paramBoolean)
/*     */   {
/*  38 */     super(awt.H);
/*  39 */     this.a = paramBoolean;
/*  40 */     a(i);
/*  41 */     c(0.5F);
/*  42 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public rf e() {
/*  46 */     return this.N;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*  50 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  55 */     int i = b(paramInt2);
/*     */     
/*  57 */     if (i > 5) {
/*  58 */       return this.N;
/*     */     }
/*     */     
/*  61 */     if (paramInt1 == i)
/*     */     {
/*     */ 
/*  64 */       if ((c(paramInt2)) || (this.B > 0.0D) || (this.C > 0.0D) || (this.D > 0.0D) || (this.E < 1.0D) || (this.F < 1.0D) || (this.G < 1.0D)) {
/*  65 */         return this.b;
/*     */       }
/*  67 */       return this.N;
/*     */     }
/*  69 */     if (paramInt1 == q.a[i]) {
/*  70 */       return this.M;
/*     */     }
/*     */     
/*  73 */     return this.L;
/*     */   }
/*     */   
/*     */   public static rf e(String paramString) {
/*  77 */     if (paramString == "piston_side") return ajn.J.L;
/*  78 */     if (paramString == "piston_top_normal") return ajn.J.N;
/*  79 */     if (paramString == "piston_top_sticky") return ajn.F.N;
/*  80 */     if (paramString == "piston_inner") { return ajn.J.b;
/*     */     }
/*  82 */     return null;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  87 */     this.L = paramrg.a("piston_side");
/*  88 */     this.N = paramrg.a(this.a ? "piston_top_sticky" : "piston_top_normal");
/*  89 */     this.b = paramrg.a("piston_inner");
/*  90 */     this.M = paramrg.a("piston_bottom");
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  95 */     return 16;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 100 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 110 */     int i = a(paramahb, paramInt1, paramInt2, paramInt3, paramsv);
/* 111 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/* 112 */     if (!paramahb.E) {
/* 113 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 119 */     if (!paramahb.E) {
/* 120 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 126 */     if ((!paramahb.E) && (paramahb.o(paramInt1, paramInt2, paramInt3) == null)) {
/* 127 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 132 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 133 */     int j = b(i);
/*     */     
/* 135 */     if (j == 7) {
/* 136 */       return;
/*     */     }
/*     */     
/* 139 */     boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, j);
/*     */     
/* 141 */     if ((bool) && (!c(i))) {
/* 142 */       if (h(paramahb, paramInt1, paramInt2, paramInt3, j)) {
/* 143 */         paramahb.c(paramInt1, paramInt2, paramInt3, this, 0, j);
/*     */       }
/* 145 */     } else if ((!bool) && (c(i))) {
/* 146 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 2);
/* 147 */       paramahb.c(paramInt1, paramInt2, paramInt3, this, 1, j);
/*     */     }
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
/*     */ 
/*     */   private boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 164 */     if ((paramInt4 != 0) && (paramahb.f(paramInt1, paramInt2 - 1, paramInt3, 0))) return true;
/* 165 */     if ((paramInt4 != 1) && (paramahb.f(paramInt1, paramInt2 + 1, paramInt3, 1))) return true;
/* 166 */     if ((paramInt4 != 2) && (paramahb.f(paramInt1, paramInt2, paramInt3 - 1, 2))) return true;
/* 167 */     if ((paramInt4 != 3) && (paramahb.f(paramInt1, paramInt2, paramInt3 + 1, 3))) return true;
/* 168 */     if ((paramInt4 != 5) && (paramahb.f(paramInt1 + 1, paramInt2, paramInt3, 5))) return true;
/* 169 */     if ((paramInt4 != 4) && (paramahb.f(paramInt1 - 1, paramInt2, paramInt3, 4))) { return true;
/*     */     }
/*     */     
/* 172 */     if (paramahb.f(paramInt1, paramInt2, paramInt3, 0)) return true;
/* 173 */     if (paramahb.f(paramInt1, paramInt2 + 2, paramInt3, 1)) return true;
/* 174 */     if (paramahb.f(paramInt1, paramInt2 + 1, paramInt3 - 1, 2)) return true;
/* 175 */     if (paramahb.f(paramInt1, paramInt2 + 1, paramInt3 + 1, 3)) return true;
/* 176 */     if (paramahb.f(paramInt1 - 1, paramInt2 + 1, paramInt3, 4)) return true;
/* 177 */     if (paramahb.f(paramInt1 + 1, paramInt2 + 1, paramInt3, 5)) { return true;
/*     */     }
/* 179 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 185 */     if (!paramahb.E) {
/* 186 */       boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, paramInt5);
/*     */       
/* 188 */       if ((bool) && (paramInt4 == 1)) {
/* 189 */         paramahb.a(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 2);
/* 190 */         return false; }
/* 191 */       if ((!bool) && (paramInt4 == 0)) {
/* 192 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 196 */     if (paramInt4 == 0) {
/* 197 */       if (i(paramahb, paramInt1, paramInt2, paramInt3, paramInt5)) {
/* 198 */         paramahb.a(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 2);
/* 199 */         paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "tile.piston.out", 0.5F, paramahb.s.nextFloat() * 0.25F + 0.6F);
/*     */       } else {
/* 201 */         return false;
/*     */       }
/* 203 */     } else if (paramInt4 == 1)
/*     */     {
/* 205 */       aor localaor1 = paramahb.o(paramInt1 + q.b[paramInt5], paramInt2 + q.c[paramInt5], paramInt3 + q.d[paramInt5]);
/* 206 */       if ((localaor1 instanceof aps)) {
/* 207 */         ((aps)localaor1).f();
/*     */       }
/*     */       
/* 210 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.M, paramInt5, 3);
/* 211 */       paramahb.a(paramInt1, paramInt2, paramInt3, apr.a(this, paramInt5, paramInt5, false, true));
/*     */       
/*     */ 
/* 214 */       if (this.a) {
/* 215 */         int i = paramInt1 + q.b[paramInt5] * 2;
/* 216 */         int j = paramInt2 + q.c[paramInt5] * 2;
/* 217 */         int k = paramInt3 + q.d[paramInt5] * 2;
/* 218 */         aji localaji = paramahb.a(i, j, k);
/* 219 */         int m = paramahb.e(i, j, k);
/* 220 */         int n = 0;
/*     */         
/* 222 */         if (localaji == ajn.M)
/*     */         {
/*     */ 
/* 225 */           aor localaor2 = paramahb.o(i, j, k);
/* 226 */           if ((localaor2 instanceof aps)) {
/* 227 */             aps localaps = (aps)localaor2;
/*     */             
/* 229 */             if ((localaps.c() == paramInt5) && (localaps.b()))
/*     */             {
/* 231 */               localaps.f();
/* 232 */               localaji = localaps.a();
/* 233 */               m = localaps.p();
/* 234 */               n = 1;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 239 */         if ((n == 0) && (localaji.o() != awt.a) && (a(localaji, paramahb, i, j, k, false)) && ((localaji.h() == 0) || (localaji == ajn.J) || (localaji == ajn.F)))
/*     */         {
/* 241 */           paramInt1 += q.b[paramInt5];
/* 242 */           paramInt2 += q.c[paramInt5];
/* 243 */           paramInt3 += q.d[paramInt5];
/*     */           
/* 245 */           paramahb.d(paramInt1, paramInt2, paramInt3, ajn.M, m, 3);
/* 246 */           paramahb.a(paramInt1, paramInt2, paramInt3, apr.a(localaji, m, paramInt5, false, false));
/*     */           
/* 248 */           paramahb.f(i, j, k);
/* 249 */         } else if (n == 0) {
/* 250 */           paramahb.f(paramInt1 + q.b[paramInt5], paramInt2 + q.c[paramInt5], paramInt3 + q.d[paramInt5]);
/*     */         }
/*     */       } else {
/* 253 */         paramahb.f(paramInt1 + q.b[paramInt5], paramInt2 + q.c[paramInt5], paramInt3 + q.d[paramInt5]);
/*     */       }
/*     */       
/* 256 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "tile.piston.in", 0.5F, paramahb.s.nextFloat() * 0.15F + 0.6F);
/*     */     }
/* 258 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 263 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 265 */     if (c(i)) {
/* 266 */       float f = 0.25F;
/* 267 */       switch (b(i)) {
/*     */       case 0: 
/* 269 */         a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 270 */         break;
/*     */       case 1: 
/* 272 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 273 */         break;
/*     */       case 2: 
/* 275 */         a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
/* 276 */         break;
/*     */       case 3: 
/* 278 */         a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
/* 279 */         break;
/*     */       case 4: 
/* 281 */         a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 282 */         break;
/*     */       case 5: 
/* 284 */         a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */     else {
/* 288 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/* 294 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/* 299 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 300 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 305 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 306 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 311 */     return false;
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 315 */     return paramInt & 0x7;
/*     */   }
/*     */   
/*     */   public static boolean c(int paramInt) {
/* 319 */     return (paramInt & 0x8) != 0;
/*     */   }
/*     */   
/*     */   public static int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv) {
/* 323 */     if ((qh.e((float)paramsv.s - paramInt1) < 2.0F) && (qh.e((float)paramsv.u - paramInt3) < 2.0F))
/*     */     {
/* 325 */       double d = paramsv.t + 1.82D - paramsv.L;
/* 326 */       if (d - paramInt2 > 2.0D) {
/* 327 */         return 1;
/*     */       }
/*     */       
/* 330 */       if (paramInt2 - d > 0.0D) {
/* 331 */         return 0;
/*     */       }
/*     */     }
/*     */     
/* 335 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/* 336 */     if (i == 0) return 2;
/* 337 */     if (i == 1) return 5;
/* 338 */     if (i == 2) return 3;
/* 339 */     if (i == 3) return 4;
/* 340 */     return 0;
/*     */   }
/*     */   
/*     */   private static boolean a(aji paramaji, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 345 */     if (paramaji == ajn.Z) {
/* 346 */       return false;
/*     */     }
/*     */     
/* 349 */     if ((paramaji == ajn.J) || (paramaji == ajn.F))
/*     */     {
/* 351 */       if (c(paramahb.e(paramInt1, paramInt2, paramInt3))) {
/* 352 */         return false;
/*     */       }
/*     */     } else {
/* 355 */       if (paramaji.f(paramahb, paramInt1, paramInt2, paramInt3) == -1.0F) {
/* 356 */         return false;
/*     */       }
/*     */       
/* 359 */       if (paramaji.h() == 2) {
/* 360 */         return false;
/*     */       }
/*     */       
/* 363 */       if (paramaji.h() == 1) {
/* 364 */         if (!paramBoolean) {
/* 365 */           return false;
/*     */         }
/* 367 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 371 */     if ((paramaji instanceof akw))
/*     */     {
/* 373 */       return false;
/*     */     }
/*     */     
/* 376 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean h(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 381 */     int i = paramInt1 + q.b[paramInt4];
/* 382 */     int j = paramInt2 + q.c[paramInt4];
/* 383 */     int k = paramInt3 + q.d[paramInt4];
/*     */     
/* 385 */     for (int m = 0; m < 13; m++)
/*     */     {
/* 387 */       if ((j <= 0) || (j >= 255))
/*     */       {
/* 389 */         return false;
/*     */       }
/*     */       
/* 392 */       aji localaji = paramahb.a(i, j, k);
/* 393 */       if (localaji.o() == awt.a) {
/*     */         break;
/*     */       }
/*     */       
/* 397 */       if (!a(localaji, paramahb, i, j, k, true)) {
/* 398 */         return false;
/*     */       }
/*     */       
/* 401 */       if (localaji.h() == 1) {
/*     */         break;
/*     */       }
/*     */       
/* 405 */       if (m == 12)
/*     */       {
/* 407 */         return false;
/*     */       }
/*     */       
/* 410 */       i += q.b[paramInt4];
/* 411 */       j += q.c[paramInt4];
/* 412 */       k += q.d[paramInt4];
/*     */     }
/*     */     
/* 415 */     return true;
/*     */   }
/*     */   
/*     */   private boolean i(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 419 */     int i = paramInt1 + q.b[paramInt4];
/* 420 */     int j = paramInt2 + q.c[paramInt4];
/* 421 */     int k = paramInt3 + q.d[paramInt4];
/*     */     
/* 423 */     for (int m = 0; m < 13; m++) {
/* 424 */       if ((j <= 0) || (j >= 255))
/*     */       {
/* 426 */         return false;
/*     */       }
/*     */       
/* 429 */       aji localaji1 = paramahb.a(i, j, k);
/* 430 */       if (localaji1.o() == awt.a) {
/*     */         break;
/*     */       }
/*     */       
/* 434 */       if (!a(localaji1, paramahb, i, j, k, true)) {
/* 435 */         return false;
/*     */       }
/*     */       
/* 438 */       if (localaji1.h() == 1)
/*     */       {
/* 440 */         localaji1.b(paramahb, i, j, k, paramahb.e(i, j, k), 0);
/*     */         
/* 442 */         paramahb.f(i, j, k);
/* 443 */         break;
/*     */       }
/*     */       
/* 446 */       if (m == 12)
/*     */       {
/* 448 */         return false;
/*     */       }
/*     */       
/* 451 */       i += q.b[paramInt4];
/* 452 */       j += q.c[paramInt4];
/* 453 */       k += q.d[paramInt4];
/*     */     }
/*     */     
/* 456 */     m = i;
/* 457 */     int n = j;
/* 458 */     int i1 = k;
/* 459 */     int i2 = 0;
/* 460 */     aji[] arrayOfaji = new aji[13];
/*     */     int i3;
/* 462 */     int i4; int i5; while ((i != paramInt1) || (j != paramInt2) || (k != paramInt3)) {
/* 463 */       i3 = i - q.b[paramInt4];
/* 464 */       i4 = j - q.c[paramInt4];
/* 465 */       i5 = k - q.d[paramInt4];
/*     */       
/* 467 */       aji localaji2 = paramahb.a(i3, i4, i5);
/* 468 */       int i6 = paramahb.e(i3, i4, i5);
/*     */       
/* 470 */       if ((localaji2 == this) && (i3 == paramInt1) && (i4 == paramInt2) && (i5 == paramInt3)) {
/* 471 */         paramahb.d(i, j, k, ajn.M, paramInt4 | (this.a ? 8 : 0), 4);
/* 472 */         paramahb.a(i, j, k, apr.a(ajn.K, paramInt4 | (this.a ? 8 : 0), paramInt4, true, false));
/*     */       } else {
/* 474 */         paramahb.d(i, j, k, ajn.M, i6, 4);
/* 475 */         paramahb.a(i, j, k, apr.a(localaji2, i6, paramInt4, true, false));
/*     */       }
/* 477 */       arrayOfaji[(i2++)] = localaji2;
/*     */       
/* 479 */       i = i3;
/* 480 */       j = i4;
/* 481 */       k = i5;
/*     */     }
/*     */     
/* 484 */     i = m;
/* 485 */     j = n;
/* 486 */     k = i1;
/* 487 */     i2 = 0;
/*     */     
/* 489 */     while ((i != paramInt1) || (j != paramInt2) || (k != paramInt3)) {
/* 490 */       i3 = i - q.b[paramInt4];
/* 491 */       i4 = j - q.c[paramInt4];
/* 492 */       i5 = k - q.d[paramInt4];
/*     */       
/* 494 */       paramahb.d(i3, i4, i5, arrayOfaji[(i2++)]);
/*     */       
/* 496 */       i = i3;
/* 497 */       j = i4;
/* 498 */       k = i5;
/*     */     }
/*     */     
/* 501 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\app.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */