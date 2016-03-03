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
/*     */ public class ans
/*     */   extends aji
/*     */ {
/*  19 */   private static final int[][] a = { { 2, 6 }, { 3, 7 }, { 2, 3 }, { 6, 7 }, { 0, 4 }, { 1, 5 }, { 0, 1 }, { 4, 5 } };
/*     */   
/*     */ 
/*     */ 
/*     */   private final aji b;
/*     */   
/*     */ 
/*     */   private final int M;
/*     */   
/*     */ 
/*     */   private boolean N;
/*     */   
/*     */ 
/*     */   private int O;
/*     */   
/*     */ 
/*     */ 
/*     */   protected ans(aji paramaji, int paramInt)
/*     */   {
/*  38 */     super(paramaji.J);
/*  39 */     this.b = paramaji;
/*  40 */     this.M = paramInt;
/*  41 */     c(paramaji.v);
/*  42 */     b(paramaji.w / 3.0F);
/*  43 */     a(paramaji.H);
/*  44 */     g(255);
/*  45 */     a(abt.b);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     if (this.N) {
/*  51 */       a(0.5F * (this.O % 2), 0.5F * (this.O / 2 % 2), 0.5F * (this.O / 4 % 2), 0.5F + 0.5F * (this.O % 2), 0.5F + 0.5F * (this.O / 2 % 2), 0.5F + 0.5F * (this.O / 4 % 2));
/*     */     } else {
/*  53 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  59 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  64 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  69 */     return 10;
/*     */   }
/*     */   
/*     */   public void e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  73 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  75 */     if ((i & 0x4) != 0) {
/*  76 */       a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/*  78 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(aji paramaji) {
/*  83 */     return paramaji instanceof ans;
/*     */   }
/*     */   
/*     */   private boolean f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  87 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/*  88 */     if ((a(localaji)) && (paramahl.e(paramInt1, paramInt2, paramInt3) == paramInt4)) {
/*  89 */       return true;
/*     */     }
/*     */     
/*  92 */     return false;
/*     */   }
/*     */   
/*     */   public boolean f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  96 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  97 */     int j = i & 0x3;
/*     */     
/*  99 */     float f1 = 0.5F;
/* 100 */     float f2 = 1.0F;
/*     */     
/* 102 */     if ((i & 0x4) != 0) {
/* 103 */       f1 = 0.0F;
/* 104 */       f2 = 0.5F;
/*     */     }
/*     */     
/* 107 */     float f3 = 0.0F;
/* 108 */     float f4 = 1.0F;
/* 109 */     float f5 = 0.0F;
/* 110 */     float f6 = 0.5F;
/*     */     
/* 112 */     boolean bool = true;
/*     */     aji localaji;
/* 114 */     int k; int m; if (j == 0) {
/* 115 */       f3 = 0.5F;
/* 116 */       f6 = 1.0F;
/*     */       
/* 118 */       localaji = paramahl.a(paramInt1 + 1, paramInt2, paramInt3);
/* 119 */       k = paramahl.e(paramInt1 + 1, paramInt2, paramInt3);
/* 120 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 121 */         m = k & 0x3;
/* 122 */         if ((m == 3) && (!f(paramahl, paramInt1, paramInt2, paramInt3 + 1, i))) {
/* 123 */           f6 = 0.5F;
/* 124 */           bool = false;
/* 125 */         } else if ((m == 2) && (!f(paramahl, paramInt1, paramInt2, paramInt3 - 1, i))) {
/* 126 */           f5 = 0.5F;
/* 127 */           bool = false;
/*     */         }
/*     */       }
/* 130 */     } else if (j == 1) {
/* 131 */       f4 = 0.5F;
/* 132 */       f6 = 1.0F;
/*     */       
/* 134 */       localaji = paramahl.a(paramInt1 - 1, paramInt2, paramInt3);
/* 135 */       k = paramahl.e(paramInt1 - 1, paramInt2, paramInt3);
/* 136 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 137 */         m = k & 0x3;
/* 138 */         if ((m == 3) && (!f(paramahl, paramInt1, paramInt2, paramInt3 + 1, i))) {
/* 139 */           f6 = 0.5F;
/* 140 */           bool = false;
/* 141 */         } else if ((m == 2) && (!f(paramahl, paramInt1, paramInt2, paramInt3 - 1, i))) {
/* 142 */           f5 = 0.5F;
/* 143 */           bool = false;
/*     */         }
/*     */       }
/* 146 */     } else if (j == 2) {
/* 147 */       f5 = 0.5F;
/* 148 */       f6 = 1.0F;
/*     */       
/* 150 */       localaji = paramahl.a(paramInt1, paramInt2, paramInt3 + 1);
/* 151 */       k = paramahl.e(paramInt1, paramInt2, paramInt3 + 1);
/* 152 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 153 */         m = k & 0x3;
/* 154 */         if ((m == 1) && (!f(paramahl, paramInt1 + 1, paramInt2, paramInt3, i))) {
/* 155 */           f4 = 0.5F;
/* 156 */           bool = false;
/* 157 */         } else if ((m == 0) && (!f(paramahl, paramInt1 - 1, paramInt2, paramInt3, i))) {
/* 158 */           f3 = 0.5F;
/* 159 */           bool = false;
/*     */         }
/*     */       }
/* 162 */     } else if (j == 3) {
/* 163 */       localaji = paramahl.a(paramInt1, paramInt2, paramInt3 - 1);
/* 164 */       k = paramahl.e(paramInt1, paramInt2, paramInt3 - 1);
/* 165 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 166 */         m = k & 0x3;
/* 167 */         if ((m == 1) && (!f(paramahl, paramInt1 + 1, paramInt2, paramInt3, i))) {
/* 168 */           f4 = 0.5F;
/* 169 */           bool = false;
/* 170 */         } else if ((m == 0) && (!f(paramahl, paramInt1 - 1, paramInt2, paramInt3, i))) {
/* 171 */           f3 = 0.5F;
/* 172 */           bool = false;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 177 */     a(f3, f1, f5, f4, f2, f6);
/* 178 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean g(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 186 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 187 */     int j = i & 0x3;
/*     */     
/* 189 */     float f1 = 0.5F;
/* 190 */     float f2 = 1.0F;
/*     */     
/* 192 */     if ((i & 0x4) != 0) {
/* 193 */       f1 = 0.0F;
/* 194 */       f2 = 0.5F;
/*     */     }
/*     */     
/* 197 */     float f3 = 0.0F;
/* 198 */     float f4 = 0.5F;
/* 199 */     float f5 = 0.5F;
/* 200 */     float f6 = 1.0F;
/*     */     
/* 202 */     boolean bool = false;
/*     */     aji localaji;
/* 204 */     int k; int m; if (j == 0) {
/* 205 */       localaji = paramahl.a(paramInt1 - 1, paramInt2, paramInt3);
/* 206 */       k = paramahl.e(paramInt1 - 1, paramInt2, paramInt3);
/* 207 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 208 */         m = k & 0x3;
/* 209 */         if ((m == 3) && (!f(paramahl, paramInt1, paramInt2, paramInt3 - 1, i))) {
/* 210 */           f5 = 0.0F;
/* 211 */           f6 = 0.5F;
/* 212 */           bool = true;
/* 213 */         } else if ((m == 2) && (!f(paramahl, paramInt1, paramInt2, paramInt3 + 1, i))) {
/* 214 */           f5 = 0.5F;
/* 215 */           f6 = 1.0F;
/* 216 */           bool = true;
/*     */         }
/*     */       }
/* 219 */     } else if (j == 1) {
/* 220 */       localaji = paramahl.a(paramInt1 + 1, paramInt2, paramInt3);
/* 221 */       k = paramahl.e(paramInt1 + 1, paramInt2, paramInt3);
/* 222 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 223 */         f3 = 0.5F;
/* 224 */         f4 = 1.0F;
/* 225 */         m = k & 0x3;
/* 226 */         if ((m == 3) && (!f(paramahl, paramInt1, paramInt2, paramInt3 - 1, i))) {
/* 227 */           f5 = 0.0F;
/* 228 */           f6 = 0.5F;
/* 229 */           bool = true;
/* 230 */         } else if ((m == 2) && (!f(paramahl, paramInt1, paramInt2, paramInt3 + 1, i))) {
/* 231 */           f5 = 0.5F;
/* 232 */           f6 = 1.0F;
/* 233 */           bool = true;
/*     */         }
/*     */       }
/* 236 */     } else if (j == 2) {
/* 237 */       localaji = paramahl.a(paramInt1, paramInt2, paramInt3 - 1);
/* 238 */       k = paramahl.e(paramInt1, paramInt2, paramInt3 - 1);
/* 239 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 240 */         f5 = 0.0F;
/* 241 */         f6 = 0.5F;
/*     */         
/* 243 */         m = k & 0x3;
/* 244 */         if ((m == 1) && (!f(paramahl, paramInt1 - 1, paramInt2, paramInt3, i))) {
/* 245 */           bool = true;
/* 246 */         } else if ((m == 0) && (!f(paramahl, paramInt1 + 1, paramInt2, paramInt3, i))) {
/* 247 */           f3 = 0.5F;
/* 248 */           f4 = 1.0F;
/* 249 */           bool = true;
/*     */         }
/*     */       }
/* 252 */     } else if (j == 3) {
/* 253 */       localaji = paramahl.a(paramInt1, paramInt2, paramInt3 + 1);
/* 254 */       k = paramahl.e(paramInt1, paramInt2, paramInt3 + 1);
/* 255 */       if ((a(localaji)) && ((i & 0x4) == (k & 0x4))) {
/* 256 */         m = k & 0x3;
/* 257 */         if ((m == 1) && (!f(paramahl, paramInt1 - 1, paramInt2, paramInt3, i))) {
/* 258 */           bool = true;
/* 259 */         } else if ((m == 0) && (!f(paramahl, paramInt1 + 1, paramInt2, paramInt3, i))) {
/* 260 */           f3 = 0.5F;
/* 261 */           f4 = 1.0F;
/* 262 */           bool = true;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 267 */     if (bool) {
/* 268 */       a(f3, f1, f5, f4, f2, f6);
/*     */     }
/* 270 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/* 276 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/* 277 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     
/* 279 */     boolean bool = f(paramahb, paramInt1, paramInt2, paramInt3);
/* 280 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     
/* 282 */     if ((bool) && 
/* 283 */       (g(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 284 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*     */     
/*     */ 
/* 288 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 301 */     this.b.b(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*     */   {
/* 306 */     this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 311 */     this.b.b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 316 */     return this.b.c(paramahl, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public float a(sa paramsa)
/*     */   {
/* 321 */     return this.b.a(paramsa);
/*     */   }
/*     */   
/*     */   public int w()
/*     */   {
/* 326 */     return this.b.w();
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 331 */     return this.b.a(paramInt1, this.M);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/* 336 */     return this.b.a(paramahb);
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 341 */     return this.b.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa, azw paramazw)
/*     */   {
/* 346 */     this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramsa, paramazw);
/*     */   }
/*     */   
/*     */   public boolean v()
/*     */   {
/* 351 */     return this.b.v();
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean)
/*     */   {
/* 356 */     return this.b.a(paramInt, paramBoolean);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 361 */     return this.b.c(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 366 */     a(paramahb, paramInt1, paramInt2, paramInt3, ajn.a);
/* 367 */     this.b.b(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 372 */     this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/* 382 */     this.b.b(paramahb, paramInt1, paramInt2, paramInt3, paramsa);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 387 */     this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 392 */     return this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, 0, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, agw paramagw)
/*     */   {
/* 397 */     this.b.a(paramahb, paramInt1, paramInt2, paramInt3, paramagw);
/*     */   }
/*     */   
/*     */   public awv f(int paramInt)
/*     */   {
/* 402 */     return this.b.f(this.M);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 407 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/* 408 */     int j = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x4;
/*     */     
/* 410 */     if (i == 0) paramahb.a(paramInt1, paramInt2, paramInt3, 0x2 | j, 2);
/* 411 */     if (i == 1) paramahb.a(paramInt1, paramInt2, paramInt3, 0x1 | j, 2);
/* 412 */     if (i == 2) paramahb.a(paramInt1, paramInt2, paramInt3, 0x3 | j, 2);
/* 413 */     if (i == 3) paramahb.a(paramInt1, paramInt2, paramInt3, 0x0 | j, 2);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/* 418 */     if ((paramInt4 == 0) || ((paramInt4 != 1) && (paramFloat2 > 0.5D))) {
/* 419 */       return paramInt5 | 0x4;
/*     */     }
/* 421 */     return paramInt5;
/*     */   }
/*     */   
/*     */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2)
/*     */   {
/* 426 */     azu[] arrayOfazu1 = new azu[8];
/* 427 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 428 */     int j = i & 0x3;
/* 429 */     int k = (i & 0x4) == 4 ? 1 : 0;
/* 430 */     int[] arrayOfInt1 = a[(j + 0)];
/*     */     
/* 432 */     this.N = true;
/* 433 */     int i3; for (int m = 0; m < 8; m++) {
/* 434 */       this.O = m;
/*     */       
/* 436 */       for (i3 : arrayOfInt1) {
/* 437 */         if (i3 == m) {}
/*     */       }
/*     */       
/* 440 */       arrayOfazu1[m] = super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazw1, paramazw2);
/*     */     }
/*     */     
/* 443 */     for (??? : arrayOfInt1) {
/* 444 */       arrayOfazu1[???] = null;
/*     */     }
/*     */     
/* 447 */     ??? = null;
/* 448 */     double d1 = 0.0D;
/*     */     
/* 450 */     for (azu localazu : arrayOfazu1) {
/* 451 */       if (localazu != null) {
/* 452 */         double d2 = localazu.f.e(paramazw2);
/*     */         
/* 454 */         if (d2 > d1) {
/* 455 */           ??? = localazu;
/* 456 */           d1 = d2;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 461 */     return (azu)???;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */