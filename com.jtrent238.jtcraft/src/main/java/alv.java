/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alv
/*     */   extends aji
/*     */ {
/*     */   protected alv()
/*     */   {
/*  16 */     super(awt.q);
/*  17 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  22 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  31 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  36 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  41 */     return 12;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     if ((paramInt4 == 0) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r())) return true;
/*  47 */     if ((paramInt4 == 1) && (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3))) return true;
/*  48 */     if ((paramInt4 == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) return true;
/*  49 */     if ((paramInt4 == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) return true;
/*  50 */     if ((paramInt4 == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) return true;
/*  51 */     if ((paramInt4 == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) return true;
/*  52 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  57 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())
/*  58 */       return true;
/*  59 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())
/*  60 */       return true;
/*  61 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())
/*  62 */       return true;
/*  63 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())
/*  64 */       return true;
/*  65 */     if (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3))
/*  66 */       return true;
/*  67 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r()) {
/*  68 */       return true;
/*     */     }
/*  70 */     return false;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  75 */     int i = paramInt5;
/*     */     
/*  77 */     int j = i & 0x8;
/*  78 */     i &= 0x7;
/*     */     
/*  80 */     i = -1;
/*     */     
/*  82 */     if ((paramInt4 == 0) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r())) i = 0;
/*  83 */     if ((paramInt4 == 1) && (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3))) i = 5;
/*  84 */     if ((paramInt4 == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r())) i = 4;
/*  85 */     if ((paramInt4 == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r())) i = 3;
/*  86 */     if ((paramInt4 == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r())) i = 2;
/*  87 */     if ((paramInt4 == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r())) { i = 1;
/*     */     }
/*  89 */     return i + j;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  94 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  95 */     int j = i & 0x7;
/*  96 */     int k = i & 0x8;
/*     */     
/*  98 */     if (j == b(1)) {
/*  99 */       if ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x1) == 0) {
/* 100 */         paramahb.a(paramInt1, paramInt2, paramInt3, 0x5 | k, 2);
/*     */       } else {
/* 102 */         paramahb.a(paramInt1, paramInt2, paramInt3, 0x6 | k, 2);
/*     */       }
/* 104 */     } else if (j == b(0)) {
/* 105 */       if ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x1) == 0) {
/* 106 */         paramahb.a(paramInt1, paramInt2, paramInt3, 0x7 | k, 2);
/*     */       } else {
/* 108 */         paramahb.a(paramInt1, paramInt2, paramInt3, 0x0 | k, 2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 114 */     switch (paramInt) {
/*     */     case 0: 
/* 116 */       return 0;
/*     */     case 1: 
/* 118 */       return 5;
/*     */     case 2: 
/* 120 */       return 4;
/*     */     case 3: 
/* 122 */       return 3;
/*     */     case 4: 
/* 124 */       return 2;
/*     */     case 5: 
/* 126 */       return 1;
/*     */     }
/* 128 */     return -1;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 133 */     if (e(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 134 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/* 135 */       int j = 0;
/*     */       
/* 137 */       if ((!paramahb.a(paramInt1 - 1, paramInt2, paramInt3).r()) && (i == 1)) j = 1;
/* 138 */       if ((!paramahb.a(paramInt1 + 1, paramInt2, paramInt3).r()) && (i == 2)) j = 1;
/* 139 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 - 1).r()) && (i == 3)) j = 1;
/* 140 */       if ((!paramahb.a(paramInt1, paramInt2, paramInt3 + 1).r()) && (i == 4)) j = 1;
/* 141 */       if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (i == 5)) j = 1;
/* 142 */       if ((!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (i == 6)) j = 1;
/* 143 */       if ((!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r()) && (i == 0)) j = 1;
/* 144 */       if ((!paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r()) && (i == 7)) { j = 1;
/*     */       }
/* 146 */       if (j != 0) {
/* 147 */         b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 148 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 154 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 155 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 156 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 157 */       return false;
/*     */     }
/* 159 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 164 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3) & 0x7;
/* 165 */     float f = 0.1875F;
/* 166 */     if (i == 1) {
/* 167 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 168 */     } else if (i == 2) {
/* 169 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 170 */     } else if (i == 3) {
/* 171 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 172 */     } else if (i == 4) {
/* 173 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/* 174 */     } else if ((i == 5) || (i == 6)) {
/* 175 */       f = 0.25F;
/* 176 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/* 177 */     } else if ((i == 0) || (i == 7)) {
/* 178 */       f = 0.25F;
/* 179 */       a(0.5F - f, 0.4F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 185 */     if (paramahb.E) return true;
/* 186 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 187 */     int j = i & 0x7;
/* 188 */     int k = 8 - (i & 0x8);
/*     */     
/* 190 */     paramahb.a(paramInt1, paramInt2, paramInt3, j + k, 3);
/*     */     
/* 192 */     paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, k > 0 ? 0.6F : 0.5F);
/*     */     
/* 194 */     paramahb.d(paramInt1, paramInt2, paramInt3, this);
/* 195 */     if (j == 1) {
/* 196 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 197 */     } else if (j == 2) {
/* 198 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 199 */     } else if (j == 3) {
/* 200 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 201 */     } else if (j == 4) {
/* 202 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/* 203 */     } else if ((j == 5) || (j == 6)) {
/* 204 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 205 */     } else if ((j == 0) || (j == 7)) {
/* 206 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*     */     }
/*     */     
/* 209 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 214 */     if ((paramInt4 & 0x8) > 0) {
/* 215 */       paramahb.d(paramInt1, paramInt2, paramInt3, this);
/* 216 */       int i = paramInt4 & 0x7;
/* 217 */       if (i == 1) {
/* 218 */         paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 219 */       } else if (i == 2) {
/* 220 */         paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 221 */       } else if (i == 3) {
/* 222 */         paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 223 */       } else if (i == 4) {
/* 224 */         paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/* 225 */       } else if ((i == 5) || (i == 6)) {
/* 226 */         paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 227 */       } else if ((i == 0) || (i == 7)) {
/* 228 */         paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*     */       }
/*     */     }
/* 231 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 236 */     return (paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) > 0 ? 15 : 0;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 241 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 242 */     if ((i & 0x8) == 0) return 0;
/* 243 */     int j = i & 0x7;
/*     */     
/* 245 */     if ((j == 0) && (paramInt4 == 0)) return 15;
/* 246 */     if ((j == 7) && (paramInt4 == 0)) return 15;
/* 247 */     if ((j == 6) && (paramInt4 == 1)) return 15;
/* 248 */     if ((j == 5) && (paramInt4 == 1)) return 15;
/* 249 */     if ((j == 4) && (paramInt4 == 2)) return 15;
/* 250 */     if ((j == 3) && (paramInt4 == 3)) return 15;
/* 251 */     if ((j == 2) && (paramInt4 == 4)) return 15;
/* 252 */     if ((j == 1) && (paramInt4 == 5)) { return 15;
/*     */     }
/* 254 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 259 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */