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
/*     */ public class aog
/*     */   extends aji
/*     */ {
/*     */   public aog()
/*     */   {
/*  20 */     super(awt.q);
/*  21 */     a(abt.d);
/*  22 */     a(true);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  27 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  36 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  41 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  46 */     return 29;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  51 */     return 10;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  56 */     if ((paramInt4 == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) return true;
/*  57 */     if ((paramInt4 == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) return true;
/*  58 */     if ((paramInt4 == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) return true;
/*  59 */     if ((paramInt4 == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) return true;
/*  60 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  65 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())
/*  66 */       return true;
/*  67 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())
/*  68 */       return true;
/*  69 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())
/*  70 */       return true;
/*  71 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) {
/*  72 */       return true;
/*     */     }
/*  74 */     return false;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  79 */     int i = 0;
/*     */     
/*  81 */     if ((paramInt4 == 2) && (paramahb.c(paramInt1, paramInt2, paramInt3 + 1, true))) i = 2;
/*  82 */     if ((paramInt4 == 3) && (paramahb.c(paramInt1, paramInt2, paramInt3 - 1, true))) i = 0;
/*  83 */     if ((paramInt4 == 4) && (paramahb.c(paramInt1 + 1, paramInt2, paramInt3, true))) i = 1;
/*  84 */     if ((paramInt4 == 5) && (paramahb.c(paramInt1 - 1, paramInt2, paramInt3, true))) { i = 3;
/*     */     }
/*  86 */     return i;
/*     */   }
/*     */   
/*     */   public void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  91 */     a(paramahb, paramInt1, paramInt2, paramInt3, false, paramInt4, false, -1, 0);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  96 */     if (paramaji == this) return;
/*  97 */     if (e(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  98 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  99 */       int j = i & 0x3;
/* 100 */       int k = 0;
/*     */       
/* 102 */       if ((!paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r()) && (j == 3)) k = 1;
/* 103 */       if ((!paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r()) && (j == 1)) k = 1;
/* 104 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r()) && (j == 0)) k = 1;
/* 105 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) && (j == 2)) { k = 1;
/*     */       }
/* 107 */       if (k != 0) {
/* 108 */         b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/* 109 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, int paramInt4, boolean paramBoolean2, int paramInt5, int paramInt6) {
/* 115 */     int i = paramInt4 & 0x3;
/* 116 */     boolean bool1 = (paramInt4 & 0x4) == 4;
/* 117 */     boolean bool2 = (paramInt4 & 0x8) == 8;
/* 118 */     boolean bool3 = !paramBoolean1;
/* 119 */     boolean bool4 = false;
/* 120 */     int j = !ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3) ? 1 : 0;
/* 121 */     int k = p.a[i];
/* 122 */     int m = p.b[i];
/* 123 */     int n = 0;
/* 124 */     int[] arrayOfInt = new int[42];
/*     */     int i2;
/* 126 */     int i3; int i5; for (int i1 = 1; i1 < 42; i1++) {
/* 127 */       i2 = paramInt1 + k * i1;
/* 128 */       i3 = paramInt3 + m * i1;
/* 129 */       aji localaji = paramahb.a(i2, paramInt2, i3);
/*     */       
/* 131 */       if (localaji == ajn.bC) {
/* 132 */         i5 = paramahb.e(i2, paramInt2, i3);
/*     */         
/* 134 */         if ((i5 & 0x3) != p.f[i]) break;
/* 135 */         n = i1; break;
/*     */       }
/*     */       
/*     */ 
/* 139 */       if ((localaji == ajn.bD) || (i1 == paramInt5)) {
/* 140 */         i5 = i1 == paramInt5 ? paramInt6 : paramahb.e(i2, paramInt2, i3);
/* 141 */         boolean bool5 = (i5 & 0x8) != 8;
/* 142 */         int i6 = (i5 & 0x1) == 1 ? 1 : 0;
/* 143 */         int i7 = (i5 & 0x2) == 2 ? 1 : 0;
/* 144 */         bool3 &= i7 == j;
/* 145 */         bool4 |= ((bool5) && (i6 != 0));
/*     */         
/* 147 */         arrayOfInt[i1] = i5;
/*     */         
/* 149 */         if (i1 == paramInt5) {
/* 150 */           paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/* 151 */           bool3 &= bool5;
/*     */         }
/*     */       } else {
/* 154 */         arrayOfInt[i1] = -1;
/* 155 */         bool3 = false;
/*     */       }
/*     */     }
/*     */     
/* 159 */     bool3 &= n > 1;
/* 160 */     bool4 &= bool3;
/* 161 */     i1 = (bool3 ? 4 : 0) | (bool4 ? 8 : 0);
/* 162 */     paramInt4 = i | i1;
/*     */     int i4;
/* 164 */     if (n > 0) {
/* 165 */       i2 = paramInt1 + k * n;
/* 166 */       i3 = paramInt3 + m * n;
/* 167 */       i4 = p.f[i];
/* 168 */       paramahb.a(i2, paramInt2, i3, i4 | i1, 3);
/* 169 */       a(paramahb, i2, paramInt2, i3, i4);
/*     */       
/* 171 */       a(paramahb, i2, paramInt2, i3, bool3, bool4, bool1, bool2);
/*     */     }
/*     */     
/* 174 */     a(paramahb, paramInt1, paramInt2, paramInt3, bool3, bool4, bool1, bool2);
/*     */     
/* 176 */     if (!paramBoolean1) {
/* 177 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt4, 3);
/* 178 */       if (paramBoolean2) { a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */       }
/*     */     }
/* 181 */     if (bool1 != bool3) {
/* 182 */       for (i2 = 1; i2 < n; i2++) {
/* 183 */         i3 = paramInt1 + k * i2;
/* 184 */         i4 = paramInt3 + m * i2;
/* 185 */         i5 = arrayOfInt[i2];
/* 186 */         if (i5 >= 0)
/*     */         {
/* 188 */           if (bool3) {
/* 189 */             i5 |= 0x4;
/*     */           } else {
/* 191 */             i5 &= 0xFFFFFFFB;
/*     */           }
/*     */           
/* 194 */           paramahb.a(i3, paramInt2, i4, i5, 3);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 201 */     a(paramahb, paramInt1, paramInt2, paramInt3, false, paramahb.e(paramInt1, paramInt2, paramInt3), true, -1, 0);
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
/* 205 */     if ((paramBoolean2) && (!paramBoolean4)) {
/* 206 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.6F);
/* 207 */     } else if ((!paramBoolean2) && (paramBoolean4)) {
/* 208 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.5F);
/* 209 */     } else if ((paramBoolean1) && (!paramBoolean3)) {
/* 210 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.click", 0.4F, 0.7F);
/* 211 */     } else if ((!paramBoolean1) && (paramBoolean3)) {
/* 212 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.1D, paramInt3 + 0.5D, "random.bowhit", 0.4F, 1.2F / (paramahb.s.nextFloat() * 0.2F + 0.9F));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 217 */     paramahb.d(paramInt1, paramInt2, paramInt3, this);
/*     */     
/* 219 */     if (paramInt4 == 3) {
/* 220 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 221 */     } else if (paramInt4 == 1) {
/* 222 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 223 */     } else if (paramInt4 == 0) {
/* 224 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 225 */     } else if (paramInt4 == 2) {
/* 226 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 231 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 232 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 233 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 234 */       return false;
/*     */     }
/*     */     
/* 237 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 242 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3) & 0x3;
/* 243 */     float f = 0.1875F;
/*     */     
/* 245 */     if (i == 3) {
/* 246 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 247 */     } else if (i == 1) {
/* 248 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 249 */     } else if (i == 0) {
/* 250 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 251 */     } else if (i == 2) {
/* 252 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 258 */     int i = (paramInt4 & 0x4) == 4 ? 1 : 0;
/* 259 */     int j = (paramInt4 & 0x8) == 8 ? 1 : 0;
/*     */     
/* 261 */     if ((i != 0) || (j != 0)) {
/* 262 */       a(paramahb, paramInt1, paramInt2, paramInt3, true, paramInt4, false, -1, 0);
/*     */     }
/*     */     
/* 265 */     if (j != 0) {
/* 266 */       paramahb.d(paramInt1, paramInt2, paramInt3, this);
/* 267 */       int k = paramInt4 & 0x3;
/*     */       
/* 269 */       if (k == 3) {
/* 270 */         paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 271 */       } else if (k == 1) {
/* 272 */         paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 273 */       } else if (k == 0) {
/* 274 */         paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 275 */       } else if (k == 2) {
/* 276 */         paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */       }
/*     */     }
/*     */     
/* 280 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 285 */     return (paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) == 8 ? 15 : 0;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 290 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 291 */     if ((i & 0x8) != 8) return 0;
/* 292 */     int j = i & 0x3;
/*     */     
/* 294 */     if ((j == 2) && (paramInt4 == 2)) return 15;
/* 295 */     if ((j == 0) && (paramInt4 == 3)) return 15;
/* 296 */     if ((j == 1) && (paramInt4 == 4)) return 15;
/* 297 */     if ((j == 3) && (paramInt4 == 5)) { return 15;
/*     */     }
/* 299 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 304 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */