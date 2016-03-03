/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
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
/*     */ public class aen
/*     */ {
/*  52 */   private static final HashMap n = new HashMap();
/*  53 */   private static final HashMap o = new HashMap();
/*     */   
/*     */ 
/*     */ 
/*     */   static
/*     */   {
/*  59 */     a = null;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */     c = "+0-1-2-3&4-4+13";
/*  82 */     n.put(Integer.valueOf(rv.l.c()), "0 & !1 & !2 & !3 & 0+6");
/*     */     
/*  84 */     b = "-0+1-2-3&4-4+13";
/*  85 */     n.put(Integer.valueOf(rv.c.c()), "!0 & 1 & !2 & !3 & 1+6");
/*     */     
/*  87 */     h = "+0+1-2-3&4-4+13";
/*  88 */     n.put(Integer.valueOf(rv.n.c()), "0 & 1 & !2 & !3 & 0+6");
/*     */     
/*  90 */     f = "+0-1+2-3&4-4+13";
/*  91 */     n.put(Integer.valueOf(rv.h.c()), "0 & !1 & 2 & !3");
/*     */     
/*  93 */     d = "-0-1+2-3&4-4+13";
/*  94 */     n.put(Integer.valueOf(rv.u.c()), "!0 & !1 & 2 & !3 & 2+6");
/*     */     
/*  96 */     e = "-0+3-4+13";
/*  97 */     n.put(Integer.valueOf(rv.t.c()), "!0 & !1 & !2 & 3 & 3+6");
/*  98 */     n.put(Integer.valueOf(rv.i.c()), "!0 & !1 & 2 & 3");
/*  99 */     n.put(Integer.valueOf(rv.d.c()), "!0 & 1 & !2 & 3 & 3+6");
/*     */     
/* 101 */     g = "+0-1-2+3&4-4+13";
/* 102 */     n.put(Integer.valueOf(rv.g.c()), "0 & !1 & !2 & 3 & 3+6");
/*     */     
/* 104 */     l = "-0+1+2-3+13&4-4";
/* 105 */     n.put(Integer.valueOf(rv.r.c()), "!0 & 1 & 2 & !3 & 2+6");
/*     */     
/*     */ 
/* 108 */     n.put(Integer.valueOf(rv.p.c()), "!0 & 1 & 2 & 3 & 2+6");
/*     */     
/* 110 */     m = "+0-1+2+3+13&4-4";
/* 111 */     n.put(Integer.valueOf(rv.o.c()), "0 & !1 & 2 & 3 & 2+6");
/*     */     
/*     */ 
/* 114 */     j = "+5-6-7";
/* 115 */     o.put(Integer.valueOf(rv.c.c()), "5");
/* 116 */     o.put(Integer.valueOf(rv.e.c()), "5");
/* 117 */     o.put(Integer.valueOf(rv.g.c()), "5");
/* 118 */     o.put(Integer.valueOf(rv.l.c()), "5");
/* 119 */     o.put(Integer.valueOf(rv.i.c()), "5");
/* 120 */     o.put(Integer.valueOf(rv.h.c()), "5");
/* 121 */     o.put(Integer.valueOf(rv.m.c()), "5");
/* 122 */     o.put(Integer.valueOf(rv.u.c()), "5");
/*     */   }
/*     */   
/* 125 */   public static final String i = "-5+6-7";
/*     */   
/*     */ 
/*     */ 
/* 129 */   public static final String k = "+14&13-13";
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean a(int paramInt1, int paramInt2)
/*     */   {
/* 182 */     return (paramInt1 & 1 << paramInt2) != 0;
/*     */   }
/*     */   
/*     */   private static int c(int paramInt1, int paramInt2) {
/* 186 */     return a(paramInt1, paramInt2) ? 1 : 0;
/*     */   }
/*     */   
/*     */   private static int d(int paramInt1, int paramInt2) {
/* 190 */     return a(paramInt1, paramInt2) ? 0 : 1;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt) {
/* 194 */     return a(paramInt, 5, 4, 3, 2, 1);
/*     */   }
/*     */   
/*     */   public static int a(Collection paramCollection)
/*     */   {
/* 199 */     int i1 = 3694022;
/*     */     
/* 201 */     if ((paramCollection == null) || (paramCollection.isEmpty())) {
/* 202 */       return i1;
/*     */     }
/*     */     
/* 205 */     float f1 = 0.0F;
/* 206 */     float f2 = 0.0F;
/* 207 */     float f3 = 0.0F;
/* 208 */     float f4 = 0.0F;
/*     */     
/* 210 */     for (rw localrw : paramCollection) {
/* 211 */       int i2 = rv.a[localrw.a()].j();
/*     */       
/* 213 */       for (int i3 = 0; i3 <= localrw.c(); i3++) {
/* 214 */         f1 += (i2 >> 16 & 0xFF) / 255.0F;
/* 215 */         f2 += (i2 >> 8 & 0xFF) / 255.0F;
/* 216 */         f3 += (i2 >> 0 & 0xFF) / 255.0F;
/* 217 */         f4 += 1.0F;
/*     */       }
/*     */     }
/*     */     
/* 221 */     f1 = f1 / f4 * 255.0F;
/* 222 */     f2 = f2 / f4 * 255.0F;
/* 223 */     f3 = f3 / f4 * 255.0F;
/*     */     
/* 225 */     return (int)f1 << 16 | (int)f2 << 8 | (int)f3;
/*     */   }
/*     */   
/*     */   public static boolean b(Collection paramCollection) {
/* 229 */     for (rw localrw : paramCollection) {
/* 230 */       if (!localrw.e()) { return false;
/*     */       }
/*     */     }
/* 233 */     return true;
/*     */   }
/*     */   
/* 236 */   private static final HashMap p = new HashMap();
/*     */   
/*     */   public static int a(int paramInt, boolean paramBoolean)
/*     */   {
/* 240 */     if (!paramBoolean) {
/* 241 */       if (p.containsKey(Integer.valueOf(paramInt))) {
/* 242 */         return ((Integer)p.get(Integer.valueOf(paramInt))).intValue();
/*     */       }
/* 244 */       int i1 = a(b(paramInt, false));
/* 245 */       p.put(Integer.valueOf(paramInt), Integer.valueOf(i1));
/* 246 */       return i1;
/*     */     }
/*     */     
/* 249 */     return a(b(paramInt, paramBoolean));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */   private static final String[] q = { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
/*     */   
/*     */ 
/*     */   public static final String a;
/*     */   
/*     */ 
/*     */   public static final String b;
/*     */   
/*     */ 
/*     */   public static final String c;
/*     */   
/*     */ 
/*     */   public static final String d;
/*     */   
/*     */ 
/*     */   public static final String e;
/*     */   
/*     */ 
/*     */   public static final String f;
/*     */   
/*     */ 
/*     */   public static final String g;
/*     */   
/*     */ 
/*     */   public static final String h;
/*     */   
/*     */ 
/*     */   public static final String j;
/*     */   
/*     */ 
/*     */   public static final String l;
/*     */   
/*     */   public static final String m;
/*     */   
/*     */ 
/*     */   public static String c(int paramInt)
/*     */   {
/* 294 */     int i1 = a(paramInt);
/* 295 */     return q[i1];
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 304 */     int i1 = 0;
/* 305 */     if (paramBoolean1) {
/* 306 */       i1 = d(paramInt4, paramInt2);
/* 307 */     } else if (paramInt1 != -1) {
/* 308 */       if ((paramInt1 == 0) && (h(paramInt4) == paramInt2)) {
/* 309 */         i1 = 1;
/* 310 */       } else if ((paramInt1 == 1) && (h(paramInt4) > paramInt2)) {
/* 311 */         i1 = 1;
/* 312 */       } else if ((paramInt1 == 2) && (h(paramInt4) < paramInt2)) {
/* 313 */         i1 = 1;
/*     */       }
/*     */     } else {
/* 316 */       i1 = c(paramInt4, paramInt2);
/*     */     }
/* 318 */     if (paramBoolean2) {
/* 319 */       i1 *= paramInt3;
/*     */     }
/* 321 */     if (paramBoolean3) {
/* 322 */       i1 *= -1;
/*     */     }
/* 324 */     return i1;
/*     */   }
/*     */   
/*     */   private static int h(int paramInt) {
/* 328 */     for (int i1 = 0; 
/* 329 */         paramInt > 0; i1++) {
/* 330 */       paramInt &= paramInt - 1;
/*     */     }
/* 332 */     return i1;
/*     */   }
/*     */   
/*     */   private static int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 337 */     if ((paramInt1 >= paramString.length()) || (paramInt2 < 0) || (paramInt1 >= paramInt2)) {
/* 338 */       return 0;
/*     */     }
/*     */     
/*     */ 
/* 342 */     int i1 = paramString.indexOf('|', paramInt1);
/* 343 */     if ((i1 >= 0) && (i1 < paramInt2)) {
/* 344 */       i2 = a(paramString, paramInt1, i1 - 1, paramInt3);
/* 345 */       if (i2 > 0) {
/* 346 */         return i2;
/*     */       }
/*     */       
/* 349 */       i3 = a(paramString, i1 + 1, paramInt2, paramInt3);
/* 350 */       if (i3 > 0) {
/* 351 */         return i3;
/*     */       }
/* 353 */       return 0;
/*     */     }
/*     */     
/* 356 */     int i2 = paramString.indexOf('&', paramInt1);
/* 357 */     if ((i2 >= 0) && (i2 < paramInt2)) {
/* 358 */       i3 = a(paramString, paramInt1, i2 - 1, paramInt3);
/* 359 */       if (i3 <= 0) {
/* 360 */         return 0;
/*     */       }
/*     */       
/* 363 */       i4 = a(paramString, i2 + 1, paramInt2, paramInt3);
/* 364 */       if (i4 <= 0) {
/* 365 */         return 0;
/*     */       }
/*     */       
/* 368 */       if (i3 > i4) {
/* 369 */         return i3;
/*     */       }
/* 371 */       return i4;
/*     */     }
/*     */     
/* 374 */     int i3 = 0;
/* 375 */     int i4 = 0;
/* 376 */     int i5 = 0;
/* 377 */     boolean bool2 = false;
/* 378 */     boolean bool3 = false;
/* 379 */     int i6 = -1;
/* 380 */     int i7 = 0;
/* 381 */     int i8 = 0;
/* 382 */     int i9 = 0;
/* 383 */     boolean bool1; for (int i10 = paramInt1; i10 < paramInt2; i10++)
/*     */     {
/* 385 */       int i11 = paramString.charAt(i10);
/* 386 */       if ((i11 >= 48) && (i11 <= 57)) {
/* 387 */         if (i3 != 0) {
/* 388 */           i8 = i11 - 48;
/* 389 */           i4 = 1;
/*     */         } else {
/* 391 */           i7 *= 10;
/* 392 */           i7 += i11 - 48;
/* 393 */           i5 = 1;
/*     */         }
/* 395 */       } else if (i11 == 42) {
/* 396 */         i3 = 1;
/* 397 */       } else if (i11 == 33) {
/* 398 */         if (i5 != 0) {
/* 399 */           i9 += a(bool2, i4, bool3, i6, i7, i8, paramInt3);
/* 400 */           i5 = bool1 = i3 = bool3 = bool2 = 0;
/* 401 */           i7 = i8 = 0;
/* 402 */           i6 = -1;
/*     */         }
/*     */         
/* 405 */         bool2 = true;
/* 406 */       } else if (i11 == 45) {
/* 407 */         if (i5 != 0) {
/* 408 */           i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 409 */           i5 = bool1 = i3 = bool3 = bool2 = 0;
/* 410 */           i7 = i8 = 0;
/* 411 */           i6 = -1;
/*     */         }
/*     */         
/* 414 */         bool3 = true;
/* 415 */       } else if ((i11 == 61) || (i11 == 60) || (i11 == 62)) {
/* 416 */         if (i5 != 0) {
/* 417 */           i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 418 */           i5 = bool1 = i3 = bool3 = bool2 = 0;
/* 419 */           i7 = i8 = 0;
/* 420 */           i6 = -1;
/*     */         }
/*     */         
/* 423 */         if (i11 == 61) {
/* 424 */           i6 = 0;
/* 425 */         } else if (i11 == 60) {
/* 426 */           i6 = 2;
/* 427 */         } else if (i11 == 62) {
/* 428 */           i6 = 1;
/*     */         }
/* 430 */       } else if ((i11 == 43) && 
/* 431 */         (i5 != 0)) {
/* 432 */         i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/* 433 */         i5 = bool1 = i3 = bool3 = bool2 = 0;
/* 434 */         i7 = i8 = 0;
/* 435 */         i6 = -1;
/*     */       }
/*     */     }
/*     */     
/* 439 */     if (i5 != 0) {
/* 440 */       i9 += a(bool2, bool1, bool3, i6, i7, i8, paramInt3);
/*     */     }
/*     */     
/* 443 */     return i9;
/*     */   }
/*     */   
/*     */   public static List b(int paramInt, boolean paramBoolean)
/*     */   {
/* 448 */     ArrayList localArrayList = null;
/*     */     
/* 450 */     for (rv localrv : rv.a)
/* 451 */       if ((localrv != null) && ((!localrv.i()) || (paramBoolean)))
/*     */       {
/*     */ 
/* 454 */         String str1 = (String)n.get(Integer.valueOf(localrv.c()));
/* 455 */         if (str1 != null)
/*     */         {
/*     */ 
/*     */ 
/* 459 */           int i3 = a(str1, 0, str1.length(), paramInt);
/* 460 */           if (i3 > 0) {
/* 461 */             int i4 = 0;
/* 462 */             String str2 = (String)o.get(Integer.valueOf(localrv.c()));
/* 463 */             if (str2 != null) {
/* 464 */               i4 = a(str2, 0, str2.length(), paramInt);
/* 465 */               if (i4 < 0) {
/* 466 */                 i4 = 0;
/*     */               }
/*     */             }
/*     */             
/* 470 */             if (localrv.b()) {
/* 471 */               i3 = 1;
/*     */             }
/*     */             else {
/* 474 */               i3 = 1200 * (i3 * 3 + (i3 - 1) * 2);
/* 475 */               i3 >>= i4;
/* 476 */               i3 = (int)Math.round(i3 * localrv.g());
/*     */               
/* 478 */               if ((paramInt & 0x4000) != 0) {
/* 479 */                 i3 = (int)Math.round(i3 * 0.75D + 0.5D);
/*     */               }
/*     */             }
/*     */             
/* 483 */             if (localArrayList == null) {
/* 484 */               localArrayList = new ArrayList();
/*     */             }
/* 486 */             rw localrw = new rw(localrv.c(), i3, i4);
/* 487 */             if ((paramInt & 0x4000) != 0) localrw.a(true);
/* 488 */             localArrayList.add(localrw);
/*     */           }
/*     */         }
/*     */       }
/* 492 */     return localArrayList;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private static int a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*     */   {
/* 578 */     if (paramBoolean3) {
/* 579 */       if (!a(paramInt1, paramInt2)) {
/* 580 */         return 0;
/*     */       }
/* 582 */     } else if (paramBoolean1) {
/* 583 */       paramInt1 &= (1 << paramInt2 ^ 0xFFFFFFFF);
/* 584 */     } else if (paramBoolean2) {
/* 585 */       if ((paramInt1 & 1 << paramInt2) == 0) {
/* 586 */         paramInt1 |= 1 << paramInt2;
/*     */       } else {
/* 588 */         paramInt1 &= (1 << paramInt2 ^ 0xFFFFFFFF);
/*     */       }
/*     */     } else {
/* 591 */       paramInt1 |= 1 << paramInt2;
/*     */     }
/* 593 */     return paramInt1;
/*     */   }
/*     */   
/*     */   public static int a(int paramInt, String paramString)
/*     */   {
/* 598 */     int i1 = 0;
/* 599 */     int i2 = paramString.length();
/*     */     
/* 601 */     int i3 = 0;
/* 602 */     boolean bool1 = false;
/* 603 */     boolean bool2 = false;
/* 604 */     boolean bool3 = false;
/* 605 */     int i4 = 0;
/* 606 */     for (int i5 = i1; i5 < i2; i5++)
/*     */     {
/* 608 */       int i6 = paramString.charAt(i5);
/* 609 */       if ((i6 >= 48) && (i6 <= 57)) {
/* 610 */         i4 *= 10;
/* 611 */         i4 += i6 - 48;
/* 612 */         i3 = 1;
/* 613 */       } else if (i6 == 33) {
/* 614 */         if (i3 != 0) {
/* 615 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 616 */           i3 = bool2 = bool1 = bool3 = 0;
/* 617 */           i4 = 0;
/*     */         }
/*     */         
/* 620 */         bool1 = true;
/* 621 */       } else if (i6 == 45) {
/* 622 */         if (i3 != 0) {
/* 623 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 624 */           i3 = bool2 = bool1 = bool3 = 0;
/* 625 */           i4 = 0;
/*     */         }
/*     */         
/* 628 */         bool2 = true;
/* 629 */       } else if (i6 == 43) {
/* 630 */         if (i3 != 0) {
/* 631 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 632 */           i3 = bool2 = bool1 = bool3 = 0;
/* 633 */           i4 = 0;
/*     */         }
/* 635 */       } else if (i6 == 38) {
/* 636 */         if (i3 != 0) {
/* 637 */           paramInt = a(paramInt, i4, bool2, bool1, bool3);
/* 638 */           i3 = bool2 = bool1 = bool3 = 0;
/* 639 */           i4 = 0;
/*     */         }
/* 641 */         bool3 = true;
/*     */       }
/*     */     }
/* 644 */     if (i3 != 0) {
/* 645 */       paramInt = a(paramInt, i4, bool2, bool1, bool3);
/*     */     }
/*     */     
/* 648 */     return paramInt & 0x7FFF;
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
/*     */   public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 663 */     return (a(paramInt1, paramInt2) ? 16 : 0) | (a(paramInt1, paramInt3) ? 8 : 0) | (a(paramInt1, paramInt4) ? 4 : 0) | (a(paramInt1, paramInt5) ? 2 : 0) | (a(paramInt1, paramInt6) ? 1 : 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */