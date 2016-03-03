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
/*     */ public class aoh
/*     */   extends aji
/*     */ {
/*     */   public aoh()
/*     */   {
/*  21 */     super(awt.l);
/*  22 */     a(true);
/*  23 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  28 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  33 */     return 20;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  38 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  49 */     float f1 = 0.0625F;
/*     */     
/*  51 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  53 */     float f2 = 1.0F;
/*  54 */     float f3 = 1.0F;
/*  55 */     float f4 = 1.0F;
/*  56 */     float f5 = 0.0F;
/*  57 */     float f6 = 0.0F;
/*  58 */     float f7 = 0.0F;
/*  59 */     int j = i > 0 ? 1 : 0;
/*     */     
/*  61 */     if ((i & 0x2) != 0) {
/*  62 */       f5 = Math.max(f5, 0.0625F);
/*  63 */       f2 = 0.0F;
/*  64 */       f3 = 0.0F;
/*  65 */       f6 = 1.0F;
/*  66 */       f4 = 0.0F;
/*  67 */       f7 = 1.0F;
/*  68 */       j = 1;
/*     */     }
/*  70 */     if ((i & 0x8) != 0) {
/*  71 */       f2 = Math.min(f2, 0.9375F);
/*  72 */       f5 = 1.0F;
/*  73 */       f3 = 0.0F;
/*  74 */       f6 = 1.0F;
/*  75 */       f4 = 0.0F;
/*  76 */       f7 = 1.0F;
/*  77 */       j = 1;
/*     */     }
/*  79 */     if ((i & 0x4) != 0) {
/*  80 */       f7 = Math.max(f7, 0.0625F);
/*  81 */       f4 = 0.0F;
/*  82 */       f2 = 0.0F;
/*  83 */       f5 = 1.0F;
/*  84 */       f3 = 0.0F;
/*  85 */       f6 = 1.0F;
/*  86 */       j = 1;
/*     */     }
/*  88 */     if ((i & 0x1) != 0) {
/*  89 */       f4 = Math.min(f4, 0.9375F);
/*  90 */       f7 = 1.0F;
/*  91 */       f2 = 0.0F;
/*  92 */       f5 = 1.0F;
/*  93 */       f3 = 0.0F;
/*  94 */       f6 = 1.0F;
/*  95 */       j = 1;
/*     */     }
/*  97 */     if ((j == 0) && (a(paramahl.a(paramInt1, paramInt2 + 1, paramInt3)))) {
/*  98 */       f3 = Math.min(f3, 0.9375F);
/*  99 */       f6 = 1.0F;
/* 100 */       f2 = 0.0F;
/* 101 */       f5 = 1.0F;
/* 102 */       f4 = 0.0F;
/* 103 */       f7 = 1.0F;
/*     */     }
/* 105 */     a(f2, f3, f4, f5, f6, f7);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 110 */     return null;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 115 */     switch (paramInt4) {
/*     */     default: 
/* 117 */       return false;
/*     */     case 1: 
/* 119 */       return a(paramahb.a(paramInt1, paramInt2 + 1, paramInt3));
/*     */     case 2: 
/* 121 */       return a(paramahb.a(paramInt1, paramInt2, paramInt3 + 1));
/*     */     case 3: 
/* 123 */       return a(paramahb.a(paramInt1, paramInt2, paramInt3 - 1));
/*     */     case 5: 
/* 125 */       return a(paramahb.a(paramInt1 - 1, paramInt2, paramInt3));
/*     */     }
/* 127 */     return a(paramahb.a(paramInt1 + 1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   private boolean a(aji paramaji)
/*     */   {
/* 132 */     return (paramaji.d()) && (paramaji.J.c());
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 137 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 138 */     int j = i;
/*     */     
/* 140 */     if (j > 0) {
/* 141 */       for (int k = 0; k <= 3; k++) {
/* 142 */         int m = 1 << k;
/* 143 */         if (((i & m) != 0) && 
/* 144 */           (!a(paramahb.a(paramInt1 + p.a[k], paramInt2, paramInt3 + p.b[k]))))
/*     */         {
/* 146 */           if ((paramahb.a(paramInt1, paramInt2 + 1, paramInt3) != this) || ((paramahb.e(paramInt1, paramInt2 + 1, paramInt3) & m) == 0)) {
/* 147 */             j &= (m ^ 0xFFFFFFFF);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 154 */     if (j == 0)
/*     */     {
/* 156 */       if (!a(paramahb.a(paramInt1, paramInt2 + 1, paramInt3))) {
/* 157 */         return false;
/*     */       }
/*     */     }
/* 160 */     if (j != i) {
/* 161 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 2);
/*     */     }
/* 163 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public int D()
/*     */   {
/* 169 */     return agx.c();
/*     */   }
/*     */   
/*     */   public int i(int paramInt)
/*     */   {
/* 174 */     return agx.c();
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 179 */     return paramahl.a(paramInt1, paramInt3).c(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 184 */     if ((!paramahb.E) && (!e(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 185 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 186 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 192 */     if ((!paramahb.E) && 
/* 193 */       (paramahb.s.nextInt(4) == 0)) {
/* 194 */       int i = 4;
/* 195 */       int j = 5;
/* 196 */       int k = 0;
/* 197 */       for (int m = paramInt1 - i; m <= paramInt1 + i; m++)
/* 198 */         for (n = paramInt3 - i; n <= paramInt3 + i; n++)
/* 199 */           for (i1 = paramInt2 - 1; i1 <= paramInt2 + 1; i1++)
/* 200 */             if (paramahb.a(m, i1, n) == this) { j--; if (j <= 0) {
/* 201 */                 k = 1;
/*     */                 break label118;
/*     */               }
/*     */             }
/*     */       label118:
/* 206 */       m = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 207 */       int n = paramahb.s.nextInt(6);
/* 208 */       int i1 = p.e[n];
/*     */       int i3;
/* 210 */       if ((n == 1) && (paramInt2 < 255) && (paramahb.c(paramInt1, paramInt2 + 1, paramInt3))) {
/* 211 */         if (k != 0) { return;
/*     */         }
/* 213 */         int i2 = paramahb.s.nextInt(16) & m;
/* 214 */         if (i2 > 0) {
/* 215 */           for (i3 = 0; i3 <= 3; i3++) {
/* 216 */             if (!a(paramahb.a(paramInt1 + p.a[i3], paramInt2 + 1, paramInt3 + p.b[i3]))) {
/* 217 */               i2 &= (1 << i3 ^ 0xFFFFFFFF);
/*     */             }
/*     */           }
/* 220 */           if (i2 > 0)
/* 221 */             paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this, i2, 2);
/*     */         } } else { aji localaji;
/*     */         int i4;
/* 224 */         if ((n >= 2) && (n <= 5) && ((m & 1 << i1) == 0)) {
/* 225 */           if (k != 0) { return;
/*     */           }
/* 227 */           localaji = paramahb.a(paramInt1 + p.a[i1], paramInt2, paramInt3 + p.b[i1]);
/* 228 */           if (localaji.J == awt.a)
/*     */           {
/* 230 */             i3 = i1 + 1 & 0x3;
/* 231 */             i4 = i1 + 3 & 0x3;
/*     */             
/*     */ 
/* 234 */             if (((m & 1 << i3) != 0) && (a(paramahb.a(paramInt1 + p.a[i1] + p.a[i3], paramInt2, paramInt3 + p.b[i1] + p.b[i3]))))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 239 */               paramahb.d(paramInt1 + p.a[i1], paramInt2, paramInt3 + p.b[i1], this, 1 << i3, 2);
/* 240 */             } else if (((m & 1 << i4) != 0) && (a(paramahb.a(paramInt1 + p.a[i1] + p.a[i4], paramInt2, paramInt3 + p.b[i1] + p.b[i4]))))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/* 245 */               paramahb.d(paramInt1 + p.a[i1], paramInt2, paramInt3 + p.b[i1], this, 1 << i4, 2);
/*     */ 
/*     */             }
/* 248 */             else if (((m & 1 << i3) != 0) && (paramahb.c(paramInt1 + p.a[i1] + p.a[i3], paramInt2, paramInt3 + p.b[i1] + p.b[i3])) && (a(paramahb.a(paramInt1 + p.a[i3], paramInt2, paramInt3 + p.b[i3]))))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 257 */               paramahb.d(paramInt1 + p.a[i1] + p.a[i3], paramInt2, paramInt3 + p.b[i1] + p.b[i3], this, 1 << (i1 + 2 & 0x3), 2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 265 */             else if (((m & 1 << i4) != 0) && (paramahb.c(paramInt1 + p.a[i1] + p.a[i4], paramInt2, paramInt3 + p.b[i1] + p.b[i4])) && (a(paramahb.a(paramInt1 + p.a[i4], paramInt2, paramInt3 + p.b[i4]))))
/*     */             {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 274 */               paramahb.d(paramInt1 + p.a[i1] + p.a[i4], paramInt2, paramInt3 + p.b[i1] + p.b[i4], this, 1 << (i1 + 2 & 0x3), 2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             }
/* 284 */             else if (a(paramahb.a(paramInt1 + p.a[i1], paramInt2 + 1, paramInt3 + p.b[i1]))) {
/* 285 */               paramahb.d(paramInt1 + p.a[i1], paramInt2, paramInt3 + p.b[i1], this, 0, 2);
/*     */             }
/*     */           }
/* 288 */           else if ((localaji.J.k()) && (localaji.d()))
/*     */           {
/* 290 */             paramahb.a(paramInt1, paramInt2, paramInt3, m | 1 << i1, 2);
/*     */           }
/*     */           
/*     */         }
/* 294 */         else if (paramInt2 > 1) {
/* 295 */           localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*     */           
/* 297 */           if (localaji.J == awt.a) {
/* 298 */             i3 = paramahb.s.nextInt(16) & m;
/* 299 */             if (i3 > 0) {
/* 300 */               paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this, i3, 2);
/*     */             }
/* 302 */           } else if (localaji == this) {
/* 303 */             i3 = paramahb.s.nextInt(16) & m;
/* 304 */             i4 = paramahb.e(paramInt1, paramInt2 - 1, paramInt3);
/* 305 */             if (i4 != (i4 | i3)) {
/* 306 */               paramahb.a(paramInt1, paramInt2 - 1, paramInt3, i4 | i3, 2);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/* 317 */     int i = 0;
/* 318 */     switch (paramInt4) {
/*     */     case 2: 
/* 320 */       i = 1;
/* 321 */       break;
/*     */     case 3: 
/* 323 */       i = 4;
/* 324 */       break;
/*     */     case 4: 
/* 326 */       i = 8;
/* 327 */       break;
/*     */     case 5: 
/* 329 */       i = 2;
/*     */     }
/*     */     
/* 332 */     if (i != 0) {
/* 333 */       return i;
/*     */     }
/* 335 */     return paramInt5;
/*     */   }
/*     */   
/*     */ 
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 341 */     return null;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 346 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 351 */     if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/* 352 */       paramyz.a(pp.C[aji.b(this)], 1);
/*     */       
/*     */ 
/* 355 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ajn.bd, 1, 0));
/*     */     } else {
/* 357 */       super.a(paramahb, paramyz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */