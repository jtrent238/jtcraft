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
/*     */ public class alb
/*     */   extends aji
/*     */ {
/*  28 */   private int[] a = new int['Ā'];
/*  29 */   private int[] b = new int['Ā'];
/*     */   private rf[] M;
/*     */   
/*     */   protected alb() {
/*  33 */     super(awt.o);
/*     */     
/*  35 */     a(true);
/*     */   }
/*     */   
/*     */   public static void e()
/*     */   {
/*  40 */     ajn.ab.a(b(ajn.f), 5, 20);
/*  41 */     ajn.ab.a(b(ajn.bw), 5, 20);
/*  42 */     ajn.ab.a(b(ajn.bx), 5, 20);
/*  43 */     ajn.ab.a(b(ajn.aJ), 5, 20);
/*  44 */     ajn.ab.a(b(ajn.ad), 5, 20);
/*  45 */     ajn.ab.a(b(ajn.bG), 5, 20);
/*  46 */     ajn.ab.a(b(ajn.bF), 5, 20);
/*  47 */     ajn.ab.a(b(ajn.bH), 5, 20);
/*  48 */     ajn.ab.a(b(ajn.r), 5, 5);
/*  49 */     ajn.ab.a(b(ajn.s), 5, 5);
/*  50 */     ajn.ab.a(b(ajn.t), 30, 60);
/*  51 */     ajn.ab.a(b(ajn.u), 30, 60);
/*  52 */     ajn.ab.a(b(ajn.X), 30, 20);
/*  53 */     ajn.ab.a(b(ajn.W), 15, 100);
/*  54 */     ajn.ab.a(b(ajn.H), 60, 100);
/*  55 */     ajn.ab.a(b(ajn.cm), 60, 100);
/*  56 */     ajn.ab.a(b(ajn.N), 60, 100);
/*  57 */     ajn.ab.a(b(ajn.O), 60, 100);
/*  58 */     ajn.ab.a(b(ajn.L), 30, 60);
/*  59 */     ajn.ab.a(b(ajn.bd), 15, 100);
/*  60 */     ajn.ab.a(b(ajn.ci), 5, 5);
/*  61 */     ajn.ab.a(b(ajn.cf), 60, 20);
/*  62 */     ajn.ab.a(b(ajn.cg), 60, 20);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/*  66 */     this.a[paramInt1] = paramInt2;
/*  67 */     this.b[paramInt1] = paramInt3;
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  72 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  86 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  91 */     return 3;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  96 */     return 0;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/* 101 */     return 30;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 107 */     if (!paramahb.O().b("doFireTick")) {
/* 108 */       return;
/*     */     }
/*     */     
/* 111 */     int i = paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.aL ? 1 : 0;
/* 112 */     if (((paramahb.t instanceof aqr)) && 
/* 113 */       (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.h)) { i = 1;
/*     */     }
/*     */     
/* 116 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 117 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 120 */     if ((i == 0) && (paramahb.Q()) && (
/* 121 */       (paramahb.y(paramInt1, paramInt2, paramInt3)) || (paramahb.y(paramInt1 - 1, paramInt2, paramInt3)) || (paramahb.y(paramInt1 + 1, paramInt2, paramInt3)) || (paramahb.y(paramInt1, paramInt2, paramInt3 - 1)) || (paramahb.y(paramInt1, paramInt2, paramInt3 + 1)))) {
/* 122 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 123 */       return;
/*     */     }
/*     */     
/*     */ 
/* 127 */     int j = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 128 */     if (j < 15) {
/* 129 */       paramahb.a(paramInt1, paramInt2, paramInt3, j + paramRandom.nextInt(3) / 2, 4);
/*     */     }
/* 131 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb) + paramRandom.nextInt(10));
/*     */     
/* 133 */     if ((i == 0) && (!e(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 134 */       if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (j > 3)) paramahb.f(paramInt1, paramInt2, paramInt3);
/* 135 */       return;
/*     */     }
/*     */     
/* 138 */     if ((i == 0) && (!e(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && 
/* 139 */       (j == 15) && (paramRandom.nextInt(4) == 0)) {
/* 140 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 141 */       return;
/*     */     }
/*     */     
/*     */ 
/* 145 */     boolean bool = paramahb.z(paramInt1, paramInt2, paramInt3);
/* 146 */     int k = 0;
/* 147 */     if (bool) {
/* 148 */       k = -50;
/*     */     }
/* 150 */     a(paramahb, paramInt1 + 1, paramInt2, paramInt3, 300 + k, paramRandom, j);
/* 151 */     a(paramahb, paramInt1 - 1, paramInt2, paramInt3, 300 + k, paramRandom, j);
/* 152 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, 250 + k, paramRandom, j);
/* 153 */     a(paramahb, paramInt1, paramInt2 + 1, paramInt3, 250 + k, paramRandom, j);
/* 154 */     a(paramahb, paramInt1, paramInt2, paramInt3 - 1, 300 + k, paramRandom, j);
/* 155 */     a(paramahb, paramInt1, paramInt2, paramInt3 + 1, 300 + k, paramRandom, j);
/*     */     
/* 157 */     for (int m = paramInt1 - 1; m <= paramInt1 + 1; m++) {
/* 158 */       for (int n = paramInt3 - 1; n <= paramInt3 + 1; n++) {
/* 159 */         for (int i1 = paramInt2 - 1; i1 <= paramInt2 + 4; i1++) {
/* 160 */           if ((m != paramInt1) || (i1 != paramInt2) || (n != paramInt3))
/*     */           {
/* 162 */             int i2 = 100;
/* 163 */             if (i1 > paramInt2 + 1) {
/* 164 */               i2 += (i1 - (paramInt2 + 1)) * 100;
/*     */             }
/*     */             
/* 167 */             int i3 = m(paramahb, m, i1, n);
/* 168 */             if (i3 > 0) {
/* 169 */               int i4 = (i3 + 40 + paramahb.r.a() * 7) / (j + 30);
/* 170 */               if (bool) {
/* 171 */                 i4 /= 2;
/*     */               }
/* 173 */               if ((i4 > 0) && (paramRandom.nextInt(i2) <= i4) && 
/* 174 */                 ((!paramahb.Q()) || (!paramahb.y(m, i1, n))) && (!paramahb.y(m - 1, i1, paramInt3)) && (!paramahb.y(m + 1, i1, n)) && (!paramahb.y(m, i1, n - 1)) && (!paramahb.y(m, i1, n + 1)))
/*     */               {
/* 176 */                 int i5 = j + paramRandom.nextInt(5) / 4;
/* 177 */                 if (i5 > 15) i5 = 15;
/* 178 */                 paramahb.d(m, i1, n, this, i5, 3);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean L()
/*     */   {
/* 189 */     return false;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom, int paramInt5) {
/* 193 */     int i = this.b[aji.b(paramahb.a(paramInt1, paramInt2, paramInt3))];
/* 194 */     if (paramRandom.nextInt(paramInt4) < i) {
/* 195 */       int j = paramahb.a(paramInt1, paramInt2, paramInt3) == ajn.W ? 1 : 0;
/* 196 */       if ((paramRandom.nextInt(paramInt5 + 10) < 5) && (!paramahb.y(paramInt1, paramInt2, paramInt3))) {
/* 197 */         int k = paramInt5 + paramRandom.nextInt(5) / 4;
/* 198 */         if (k > 15) k = 15;
/* 199 */         paramahb.d(paramInt1, paramInt2, paramInt3, this, k, 3);
/*     */       } else {
/* 201 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/* 203 */       if (j != 0) {
/* 204 */         ajn.W.b(paramahb, paramInt1, paramInt2, paramInt3, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 210 */     if (e(paramahb, paramInt1 + 1, paramInt2, paramInt3)) return true;
/* 211 */     if (e(paramahb, paramInt1 - 1, paramInt2, paramInt3)) return true;
/* 212 */     if (e(paramahb, paramInt1, paramInt2 - 1, paramInt3)) return true;
/* 213 */     if (e(paramahb, paramInt1, paramInt2 + 1, paramInt3)) return true;
/* 214 */     if (e(paramahb, paramInt1, paramInt2, paramInt3 - 1)) return true;
/* 215 */     if (e(paramahb, paramInt1, paramInt2, paramInt3 + 1)) { return true;
/*     */     }
/* 217 */     return false;
/*     */   }
/*     */   
/*     */   private int m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 221 */     int i = 0;
/* 222 */     if (!paramahb.c(paramInt1, paramInt2, paramInt3)) { return 0;
/*     */     }
/* 224 */     i = a(paramahb, paramInt1 + 1, paramInt2, paramInt3, i);
/* 225 */     i = a(paramahb, paramInt1 - 1, paramInt2, paramInt3, i);
/* 226 */     i = a(paramahb, paramInt1, paramInt2 - 1, paramInt3, i);
/* 227 */     i = a(paramahb, paramInt1, paramInt2 + 1, paramInt3, i);
/* 228 */     i = a(paramahb, paramInt1, paramInt2, paramInt3 - 1, i);
/* 229 */     i = a(paramahb, paramInt1, paramInt2, paramInt3 + 1, i);
/*     */     
/* 231 */     return i;
/*     */   }
/*     */   
/*     */   public boolean v()
/*     */   {
/* 236 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 240 */     return this.a[aji.b(paramahl.a(paramInt1, paramInt2, paramInt3))] > 0;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 245 */     int i = this.a[aji.b(paramahb.a(paramInt1, paramInt2, paramInt3))];
/* 246 */     if (i > paramInt4) return i;
/* 247 */     return paramInt4;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 252 */     return (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (e(paramahb, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 257 */     if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (!e(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 258 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 264 */     if ((paramahb.t.i <= 0) && 
/* 265 */       (ajn.aO.e(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 266 */       return;
/*     */     }
/*     */     
/* 269 */     if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (!e(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 270 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 271 */       return;
/*     */     }
/*     */     
/* 274 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb) + paramahb.s.nextInt(10));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 283 */     if (paramRandom.nextInt(24) == 0)
/* 284 */       paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, "fire.fire", 1.0F + paramRandom.nextFloat(), paramRandom.nextFloat() * 0.7F + 0.3F, false);
/*     */     int i;
/*     */     float f1;
/* 287 */     float f2; float f3; if ((ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (ajn.ab.e(paramahb, paramInt1, paramInt2 - 1, paramInt3))) {
/* 288 */       for (i = 0; i < 3; i++) {
/* 289 */         f1 = paramInt1 + paramRandom.nextFloat();
/* 290 */         f2 = paramInt2 + paramRandom.nextFloat() * 0.5F + 0.5F;
/* 291 */         f3 = paramInt3 + paramRandom.nextFloat();
/* 292 */         paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } else {
/* 295 */       if (ajn.ab.e(paramahb, paramInt1 - 1, paramInt2, paramInt3)) {
/* 296 */         for (i = 0; i < 2; i++) {
/* 297 */           f1 = paramInt1 + paramRandom.nextFloat() * 0.1F;
/* 298 */           f2 = paramInt2 + paramRandom.nextFloat();
/* 299 */           f3 = paramInt3 + paramRandom.nextFloat();
/* 300 */           paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 303 */       if (ajn.ab.e(paramahb, paramInt1 + 1, paramInt2, paramInt3)) {
/* 304 */         for (i = 0; i < 2; i++) {
/* 305 */           f1 = paramInt1 + 1 - paramRandom.nextFloat() * 0.1F;
/* 306 */           f2 = paramInt2 + paramRandom.nextFloat();
/* 307 */           f3 = paramInt3 + paramRandom.nextFloat();
/* 308 */           paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 311 */       if (ajn.ab.e(paramahb, paramInt1, paramInt2, paramInt3 - 1)) {
/* 312 */         for (i = 0; i < 2; i++) {
/* 313 */           f1 = paramInt1 + paramRandom.nextFloat();
/* 314 */           f2 = paramInt2 + paramRandom.nextFloat();
/* 315 */           f3 = paramInt3 + paramRandom.nextFloat() * 0.1F;
/* 316 */           paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 319 */       if (ajn.ab.e(paramahb, paramInt1, paramInt2, paramInt3 + 1)) {
/* 320 */         for (i = 0; i < 2; i++) {
/* 321 */           f1 = paramInt1 + paramRandom.nextFloat();
/* 322 */           f2 = paramInt2 + paramRandom.nextFloat();
/* 323 */           f3 = paramInt3 + 1 - paramRandom.nextFloat() * 0.1F;
/* 324 */           paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 327 */       if (ajn.ab.e(paramahb, paramInt1, paramInt2 + 1, paramInt3)) {
/* 328 */         for (i = 0; i < 2; i++) {
/* 329 */           f1 = paramInt1 + paramRandom.nextFloat();
/* 330 */           f2 = paramInt2 + 1 - paramRandom.nextFloat() * 0.1F;
/* 331 */           f3 = paramInt3 + paramRandom.nextFloat();
/* 332 */           paramahb.a("largesmoke", f1, f2, f3, 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 340 */     this.M = new rf[] { paramrg.a(N() + "_layer_0"), paramrg.a(N() + "_layer_1") };
/*     */   }
/*     */   
/*     */ 
/*     */   public rf c(int paramInt)
/*     */   {
/* 346 */     return this.M[paramInt];
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 351 */     return this.M[0];
/*     */   }
/*     */   
/*     */   public awv f(int paramInt)
/*     */   {
/* 356 */     return awv.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */