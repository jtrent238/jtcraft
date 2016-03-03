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
/*     */ public abstract class ajs
/*     */   extends aji
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   protected ajs(boolean paramBoolean)
/*     */   {
/*  20 */     super(awt.q);
/*  21 */     a(true);
/*  22 */     a(abt.d);
/*  23 */     this.a = paramBoolean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  31 */     return null;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  36 */     return this.a ? 30 : 20;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  55 */     if ((paramInt4 == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) return true;
/*  56 */     if ((paramInt4 == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) return true;
/*  57 */     if ((paramInt4 == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) return true;
/*  58 */     if ((paramInt4 == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) return true;
/*  59 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  64 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())
/*  65 */       return true;
/*  66 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())
/*  67 */       return true;
/*  68 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())
/*  69 */       return true;
/*  70 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) {
/*  71 */       return true;
/*     */     }
/*  73 */     return false;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  78 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  80 */     int j = i & 0x8;
/*  81 */     i &= 0x7;
/*     */     
/*  83 */     if ((paramInt4 == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) { i = 4;
/*  84 */     } else if ((paramInt4 == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) { i = 3;
/*  85 */     } else if ((paramInt4 == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) { i = 2;
/*  86 */     } else if ((paramInt4 == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) i = 1; else {
/*  87 */       i = e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*  89 */     return i + j;
/*     */   }
/*     */   
/*     */   private int e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())
/*  94 */       return 1;
/*  95 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())
/*  96 */       return 2;
/*  97 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())
/*  98 */       return 3;
/*  99 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) {
/* 100 */       return 4;
/*     */     }
/* 102 */     return 1;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 107 */     if (m(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 108 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/* 109 */       int j = 0;
/*     */       
/* 111 */       if ((!paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r()) && (i == 1)) j = 1;
/* 112 */       if ((!paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r()) && (i == 2)) j = 1;
/* 113 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r()) && (i == 3)) j = 1;
/* 114 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) && (i == 4)) { j = 1;
/*     */       }
/* 116 */       if (j != 0) {
/* 117 */         b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 118 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 124 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 125 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 126 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 127 */       return false;
/*     */     }
/* 129 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 134 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 135 */     b(i);
/*     */   }
/*     */   
/*     */   private void b(int paramInt) {
/* 139 */     int i = paramInt & 0x7;
/* 140 */     int j = (paramInt & 0x8) > 0 ? 1 : 0;
/*     */     
/* 142 */     float f1 = 0.375F;
/* 143 */     float f2 = 0.625F;
/* 144 */     float f3 = 0.1875F;
/* 145 */     float f4 = 0.125F;
/* 146 */     if (j != 0) { f4 = 0.0625F;
/*     */     }
/* 148 */     if (i == 1) {
/* 149 */       a(0.0F, f1, 0.5F - f3, f4, f2, 0.5F + f3);
/* 150 */     } else if (i == 2) {
/* 151 */       a(1.0F - f4, f1, 0.5F - f3, 1.0F, f2, 0.5F + f3);
/* 152 */     } else if (i == 3) {
/* 153 */       a(0.5F - f3, f1, 0.0F, 0.5F + f3, f2, f4);
/* 154 */     } else if (i == 4) {
/* 155 */       a(0.5F - f3, f1, 1.0F - f4, 0.5F + f3, f2, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {}
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 165 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 166 */     int j = i & 0x7;
/* 167 */     int k = 8 - (i & 0x8);
/* 168 */     if (k == 0) { return true;
/*     */     }
/* 170 */     paramahb.a(paramInt1, paramInt2, paramInt3, j + k, 3);
/* 171 */     paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     
/* 173 */     paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     
/* 175 */     a(paramahb, paramInt1, paramInt2, paramInt3, j);
/*     */     
/* 177 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     
/* 179 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 184 */     if ((paramInt4 & 0x8) > 0) {
/* 185 */       int i = paramInt4 & 0x7;
/* 186 */       a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */     }
/* 188 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 193 */     return (paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) > 0 ? 15 : 0;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 198 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 199 */     if ((i & 0x8) == 0) return 0;
/* 200 */     int j = i & 0x7;
/*     */     
/* 202 */     if ((j == 5) && (paramInt4 == 1)) return 15;
/* 203 */     if ((j == 4) && (paramInt4 == 2)) return 15;
/* 204 */     if ((j == 3) && (paramInt4 == 3)) return 15;
/* 205 */     if ((j == 2) && (paramInt4 == 4)) return 15;
/* 206 */     if ((j == 1) && (paramInt4 == 5)) { return 15;
/*     */     }
/* 208 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 213 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 218 */     if (paramahb.E) return;
/* 219 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 220 */     if ((i & 0x8) == 0) {
/* 221 */       return;
/*     */     }
/* 223 */     if (this.a) {
/* 224 */       n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 226 */       paramahb.a(paramInt1, paramInt2, paramInt3, i & 0x7, 3);
/*     */       
/* 228 */       int j = i & 0x7;
/* 229 */       a(paramahb, paramInt1, paramInt2, paramInt3, j);
/*     */       
/* 231 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/* 232 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/* 238 */     float f1 = 0.1875F;
/* 239 */     float f2 = 0.125F;
/* 240 */     float f3 = 0.125F;
/* 241 */     a(0.5F - f1, 0.5F - f2, 0.5F - f3, 0.5F + f1, 0.5F + f2, 0.5F + f3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/* 246 */     if (paramahb.E) return;
/* 247 */     if (!this.a) { return;
/*     */     }
/* 249 */     if ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x8) != 0) {
/* 250 */       return;
/*     */     }
/*     */     
/* 253 */     n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 257 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 258 */     int j = i & 0x7;
/* 259 */     int k = (i & 0x8) != 0 ? 1 : 0;
/*     */     
/*     */ 
/* 262 */     b(i);
/* 263 */     List localList = paramahb.a(zc.class, azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + this.F, paramInt3 + this.G));
/* 264 */     int m = !localList.isEmpty() ? 1 : 0;
/*     */     
/* 266 */     if ((m != 0) && (k == 0)) {
/* 267 */       paramahb.a(paramInt1, paramInt2, paramInt3, j | 0x8, 3);
/* 268 */       a(paramahb, paramInt1, paramInt2, paramInt3, j);
/* 269 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 271 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.6F);
/*     */     }
/* 273 */     if ((m == 0) && (k != 0)) {
/* 274 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 3);
/* 275 */       a(paramahb, paramInt1, paramInt2, paramInt3, j);
/* 276 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */       
/* 278 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, 0.5F);
/*     */     }
/*     */     
/* 281 */     if (m != 0) {
/* 282 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 287 */     paramahb.d(paramInt1, paramInt2, paramInt3, this);
/*     */     
/* 289 */     if (paramInt4 == 1) {
/* 290 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 291 */     } else if (paramInt4 == 2) {
/* 292 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 293 */     } else if (paramInt4 == 3) {
/* 294 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 295 */     } else if (paramInt4 == 4) {
/* 296 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/*     */     } else {
/* 298 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */