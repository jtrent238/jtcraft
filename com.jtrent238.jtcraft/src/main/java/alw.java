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
/*     */ public abstract class alw
/*     */   extends aji
/*     */ {
/*     */   private rf[] a;
/*     */   
/*     */   protected alw(awt paramawt)
/*     */   {
/*  23 */     super(paramawt);
/*  24 */     float f1 = 0.0F;
/*  25 */     float f2 = 0.0F;
/*     */     
/*  27 */     a(0.0F + f2, 0.0F + f1, 0.0F + f2, 1.0F + f2, 1.0F + f1, 1.0F + f2);
/*  28 */     a(true);
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  33 */     return this.J != awt.i;
/*     */   }
/*     */   
/*     */   public int D()
/*     */   {
/*  38 */     return 16777215;
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     if (this.J == awt.h) {
/*  44 */       int i = 0;
/*  45 */       int j = 0;
/*  46 */       int k = 0;
/*     */       
/*  48 */       for (int m = -1; m <= 1; m++) {
/*  49 */         for (int n = -1; n <= 1; n++) {
/*  50 */           int i1 = paramahl.a(paramInt1 + n, paramInt3 + m).aq;
/*     */           
/*  52 */           i += ((i1 & 0xFF0000) >> 16);
/*  53 */           j += ((i1 & 0xFF00) >> 8);
/*  54 */           k += (i1 & 0xFF);
/*     */         }
/*     */       }
/*     */       
/*  58 */       return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
/*     */     }
/*  60 */     return 16777215;
/*     */   }
/*     */   
/*     */   public static float b(int paramInt) {
/*  64 */     if (paramInt >= 8) paramInt = 0;
/*  65 */     return (paramInt + 1) / 9.0F;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  70 */     if ((paramInt1 == 0) || (paramInt1 == 1)) {
/*  71 */       return this.a[0];
/*     */     }
/*  73 */     return this.a[1];
/*     */   }
/*     */   
/*     */   protected int e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  78 */     if (paramahb.a(paramInt1, paramInt2, paramInt3).o() == this.J) return paramahb.e(paramInt1, paramInt2, paramInt3);
/*  79 */     return -1;
/*     */   }
/*     */   
/*     */   protected int e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/*  83 */     if (paramahl.a(paramInt1, paramInt2, paramInt3).o() != this.J) return -1;
/*  84 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  85 */     if (i >= 8) i = 0;
/*  86 */     return i;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  91 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, boolean paramBoolean)
/*     */   {
/* 101 */     return (paramBoolean) && (paramInt == 0);
/*     */   }
/*     */   
/*     */   public boolean d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 106 */     awt localawt = paramahl.a(paramInt1, paramInt2, paramInt3).o();
/* 107 */     if (localawt == this.J) return false;
/* 108 */     if (paramInt4 == 1) return true;
/* 109 */     if (localawt == awt.w) return false;
/* 110 */     return super.d(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 115 */     awt localawt = paramahl.a(paramInt1, paramInt2, paramInt3).o();
/* 116 */     if (localawt == this.J) return false;
/* 117 */     if (paramInt4 == 1) {
/* 118 */       return true;
/*     */     }
/* 120 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 125 */     return null;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 130 */     return 4;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 135 */     return null;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 140 */     return 0;
/*     */   }
/*     */   
/*     */   private azw f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 144 */     azw localazw = azw.a(0.0D, 0.0D, 0.0D);
/* 145 */     int i = e(paramahl, paramInt1, paramInt2, paramInt3);
/* 146 */     for (int j = 0; j < 4; j++)
/*     */     {
/* 148 */       int k = paramInt1;
/* 149 */       int m = paramInt2;
/* 150 */       int n = paramInt3;
/*     */       
/* 152 */       if (j == 0) k--;
/* 153 */       if (j == 1) n--;
/* 154 */       if (j == 2) k++;
/* 155 */       if (j == 3) { n++;
/*     */       }
/* 157 */       int i1 = e(paramahl, k, m, n);
/* 158 */       int i2; if (i1 < 0) {
/* 159 */         if (!paramahl.a(k, m, n).o().c()) {
/* 160 */           i1 = e(paramahl, k, m - 1, n);
/* 161 */           if (i1 >= 0) {
/* 162 */             i2 = i1 - (i - 8);
/* 163 */             localazw = localazw.c((k - paramInt1) * i2, (m - paramInt2) * i2, (n - paramInt3) * i2);
/*     */           }
/*     */         }
/*     */       }
/* 167 */       else if (i1 >= 0) {
/* 168 */         i2 = i1 - i;
/* 169 */         localazw = localazw.c((k - paramInt1) * i2, (m - paramInt2) * i2, (n - paramInt3) * i2);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 174 */     if (paramahl.e(paramInt1, paramInt2, paramInt3) >= 8) {
/* 175 */       j = 0;
/* 176 */       if ((j != 0) || (d(paramahl, paramInt1, paramInt2, paramInt3 - 1, 2))) j = 1;
/* 177 */       if ((j != 0) || (d(paramahl, paramInt1, paramInt2, paramInt3 + 1, 3))) j = 1;
/* 178 */       if ((j != 0) || (d(paramahl, paramInt1 - 1, paramInt2, paramInt3, 4))) j = 1;
/* 179 */       if ((j != 0) || (d(paramahl, paramInt1 + 1, paramInt2, paramInt3, 5))) j = 1;
/* 180 */       if ((j != 0) || (d(paramahl, paramInt1, paramInt2 + 1, paramInt3 - 1, 2))) j = 1;
/* 181 */       if ((j != 0) || (d(paramahl, paramInt1, paramInt2 + 1, paramInt3 + 1, 3))) j = 1;
/* 182 */       if ((j != 0) || (d(paramahl, paramInt1 - 1, paramInt2 + 1, paramInt3, 4))) j = 1;
/* 183 */       if ((j != 0) || (d(paramahl, paramInt1 + 1, paramInt2 + 1, paramInt3, 5))) j = 1;
/* 184 */       if (j != 0) localazw = localazw.a().c(0.0D, -6.0D, 0.0D);
/*     */     }
/* 186 */     localazw = localazw.a();
/* 187 */     return localazw;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa, azw paramazw)
/*     */   {
/* 192 */     azw localazw = f(paramahb, paramInt1, paramInt2, paramInt3);
/* 193 */     paramazw.a += localazw.a;
/* 194 */     paramazw.b += localazw.b;
/* 195 */     paramazw.c += localazw.c;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/* 200 */     if (this.J == awt.h) return 5;
/* 201 */     if (this.J == awt.i) {
/* 202 */       if (paramahb.t.g) {
/* 203 */         return 10;
/*     */       }
/* 205 */       return 30;
/*     */     }
/*     */     
/* 208 */     return 0;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 213 */     int i = paramahl.c(paramInt1, paramInt2, paramInt3, 0);
/* 214 */     int j = paramahl.c(paramInt1, paramInt2 + 1, paramInt3, 0);
/*     */     
/* 216 */     int k = i & 0xFF;
/* 217 */     int m = j & 0xFF;
/* 218 */     int n = i >> 16 & 0xFF;
/* 219 */     int i1 = j >> 16 & 0xFF;
/*     */     
/* 221 */     return (k > m ? k : m) | (n > i1 ? n : i1) << 16;
/*     */   }
/*     */   
/*     */   public int w()
/*     */   {
/* 226 */     return this.J == awt.h ? 1 : 0;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*     */     int i;
/* 231 */     if (this.J == awt.h) {
/* 232 */       if (paramRandom.nextInt(10) == 0) {
/* 233 */         i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 234 */         if ((i <= 0) || (i >= 8)) {
/* 235 */           paramahb.a("suspended", paramInt1 + paramRandom.nextFloat(), paramInt2 + paramRandom.nextFloat(), paramInt3 + paramRandom.nextFloat(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       }
/* 238 */       for (i = 0; i < 0; i++)
/*     */       {
/*     */ 
/* 241 */         int j = paramRandom.nextInt(4);
/* 242 */         int k = paramInt1;
/* 243 */         int m = paramInt3;
/* 244 */         if (j == 0) k--;
/* 245 */         if (j == 1) k++;
/* 246 */         if (j == 2) m--;
/* 247 */         if (j == 3) m++;
/* 248 */         if ((paramahb.a(k, paramInt2, m).o() == awt.a) && ((paramahb.a(k, paramInt2 - 1, m).o().c()) || (paramahb.a(k, paramInt2 - 1, m).o().d()))) {
/* 249 */           float f = 0.0625F;
/* 250 */           double d4 = paramInt1 + paramRandom.nextFloat();
/* 251 */           double d5 = paramInt2 + paramRandom.nextFloat();
/* 252 */           double d6 = paramInt3 + paramRandom.nextFloat();
/* 253 */           if (j == 0) d4 = paramInt1 - f;
/* 254 */           if (j == 1) d4 = paramInt1 + 1 + f;
/* 255 */           if (j == 2) d6 = paramInt3 - f;
/* 256 */           if (j == 3) { d6 = paramInt3 + 1 + f;
/*     */           }
/* 258 */           double d7 = 0.0D;
/* 259 */           double d8 = 0.0D;
/*     */           
/* 261 */           if (j == 0) d7 = -f;
/* 262 */           if (j == 1) d7 = f;
/* 263 */           if (j == 2) d8 = -f;
/* 264 */           if (j == 3) { d8 = f;
/*     */           }
/* 266 */           paramahb.a("splash", d4, d5, d6, d7, 0.0D, d8);
/*     */         }
/*     */       }
/*     */     }
/* 270 */     if ((this.J == awt.h) && (paramRandom.nextInt(64) == 0)) {
/* 271 */       i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 272 */       if ((i > 0) && (i < 8))
/* 273 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, "liquid.water", paramRandom.nextFloat() * 0.25F + 0.75F, paramRandom.nextFloat() * 1.0F + 0.5F, false); }
/*     */     double d1;
/*     */     double d2;
/* 276 */     double d3; if ((this.J == awt.i) && 
/* 277 */       (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).o() == awt.a) && (!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).c())) {
/* 278 */       if (paramRandom.nextInt(100) == 0) {
/* 279 */         d1 = paramInt1 + paramRandom.nextFloat();
/* 280 */         d2 = paramInt2 + this.F;
/* 281 */         d3 = paramInt3 + paramRandom.nextFloat();
/* 282 */         paramahb.a("lava", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 283 */         paramahb.a(d1, d2, d3, "liquid.lavapop", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false);
/*     */       }
/* 285 */       if (paramRandom.nextInt(200) == 0) {
/* 286 */         paramahb.a(paramInt1, paramInt2, paramInt3, "liquid.lava", 0.2F + paramRandom.nextFloat() * 0.2F, 0.9F + paramRandom.nextFloat() * 0.15F, false);
/*     */       }
/*     */     }
/*     */     
/* 290 */     if ((paramRandom.nextInt(10) == 0) && 
/* 291 */       (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (!paramahb.a(paramInt1, paramInt2 - 2, paramInt3).o().c())) {
/* 292 */       d1 = paramInt1 + paramRandom.nextFloat();
/* 293 */       d2 = paramInt2 - 1.05D;
/* 294 */       d3 = paramInt3 + paramRandom.nextFloat();
/*     */       
/* 296 */       if (this.J == awt.h) paramahb.a("dripWater", d1, d2, d3, 0.0D, 0.0D, 0.0D); else {
/* 297 */         paramahb.a("dripLava", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static double a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, awt paramawt) {
/* 303 */     azw localazw = null;
/* 304 */     if (paramawt == awt.h) localazw = ajn.i.f(paramahl, paramInt1, paramInt2, paramInt3);
/* 305 */     if (paramawt == awt.i) localazw = ajn.k.f(paramahl, paramInt1, paramInt2, paramInt3);
/* 306 */     if ((localazw.a == 0.0D) && (localazw.c == 0.0D)) return -1000.0D;
/* 307 */     return Math.atan2(localazw.c, localazw.a) - 1.5707963267948966D;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 312 */     n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 317 */     n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 321 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) return;
/* 322 */     if (this.J == awt.i) {
/* 323 */       int i = 0;
/* 324 */       if ((i != 0) || (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).o() == awt.h)) i = 1;
/* 325 */       if ((i != 0) || (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).o() == awt.h)) i = 1;
/* 326 */       if ((i != 0) || (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).o() == awt.h)) i = 1;
/* 327 */       if ((i != 0) || (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).o() == awt.h)) i = 1;
/* 328 */       if ((i != 0) || (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).o() == awt.h)) i = 1;
/* 329 */       if (i != 0) {
/* 330 */         int j = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 331 */         if (j == 0) {
/* 332 */           paramahb.b(paramInt1, paramInt2, paramInt3, ajn.Z);
/* 333 */         } else if (j <= 4) {
/* 334 */           paramahb.b(paramInt1, paramInt2, paramInt3, ajn.e);
/*     */         }
/* 336 */         m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 342 */     paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, "random.fizz", 0.5F, 2.6F + (paramahb.s.nextFloat() - paramahb.s.nextFloat()) * 0.8F);
/* 343 */     for (int i = 0; i < 8; i++) {
/* 344 */       paramahb.a("largesmoke", paramInt1 + Math.random(), paramInt2 + 1.2D, paramInt3 + Math.random(), 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 350 */     if (this.J == awt.i) {
/* 351 */       this.a = new rf[] { paramrg.a("lava_still"), paramrg.a("lava_flow") };
/*     */     }
/*     */     else
/*     */     {
/* 355 */       this.a = new rf[] { paramrg.a("water_still"), paramrg.a("water_flow") };
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public static rf e(String paramString)
/*     */   {
/* 362 */     if (paramString == "water_still") return ajn.i.a[0];
/* 363 */     if (paramString == "water_flow") return ajn.i.a[1];
/* 364 */     if (paramString == "lava_still") return ajn.k.a[0];
/* 365 */     if (paramString == "lava_flow") return ajn.k.a[1];
/* 366 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */