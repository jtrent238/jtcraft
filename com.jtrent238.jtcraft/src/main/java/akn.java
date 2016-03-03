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
/*     */ public class akn
/*     */   extends aji
/*     */ {
/*     */   private rf[] a;
/*     */   private rf[] b;
/*     */   
/*     */   protected akn(awt paramawt)
/*     */   {
/*  32 */     super(paramawt);
/*     */     
/*  34 */     float f1 = 0.5F;
/*  35 */     float f2 = 1.0F;
/*  36 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  41 */     return this.b[0];
/*     */   }
/*     */   
/*     */   public rf e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  46 */     if ((paramInt4 == 1) || (paramInt4 == 0)) { return this.b[0];
/*     */     }
/*  48 */     int i = g(paramahl, paramInt1, paramInt2, paramInt3);
/*  49 */     int j = i & 0x3;
/*  50 */     int k = (i & 0x4) != 0 ? 1 : 0;
/*  51 */     int m = 0;
/*  52 */     int n = (i & 0x8) != 0 ? 1 : 0;
/*     */     
/*  54 */     if (k != 0) {
/*  55 */       if ((j == 0) && (paramInt4 == 2)) { m = m == 0 ? 1 : 0;
/*  56 */       } else if ((j == 1) && (paramInt4 == 5)) { m = m == 0 ? 1 : 0;
/*  57 */       } else if ((j == 2) && (paramInt4 == 3)) { m = m == 0 ? 1 : 0;
/*  58 */       } else if ((j == 3) && (paramInt4 == 4)) m = m == 0 ? 1 : 0;
/*     */     } else {
/*  60 */       if ((j == 0) && (paramInt4 == 5)) { m = m == 0 ? 1 : 0;
/*  61 */       } else if ((j == 1) && (paramInt4 == 3)) { m = m == 0 ? 1 : 0;
/*  62 */       } else if ((j == 2) && (paramInt4 == 4)) { m = m == 0 ? 1 : 0;
/*  63 */       } else if ((j == 3) && (paramInt4 == 2)) m = m == 0 ? 1 : 0;
/*  64 */       if ((i & 0x10) != 0) { m = m == 0 ? 1 : 0;
/*     */       }
/*     */     }
/*  67 */     if (n != 0) {
/*  68 */       return this.a[0];
/*     */     }
/*  70 */     return this.b[0];
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/*  76 */     this.a = new rf[2];
/*  77 */     this.b = new rf[2];
/*     */     
/*  79 */     this.a[0] = paramrg.a(N() + "_upper");
/*  80 */     this.b[0] = paramrg.a(N() + "_lower");
/*  81 */     this.a[1] = new re(this.a[0], true, false);
/*  82 */     this.b[1] = new re(this.b[0], true, false);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  91 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  96 */     int i = g(paramahl, paramInt1, paramInt2, paramInt3);
/*  97 */     return (i & 0x4) != 0;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 107 */     return 7;
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 112 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 113 */     return super.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 118 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 119 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 124 */     b(g(paramahl, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public int e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 128 */     return g(paramahl, paramInt1, paramInt2, paramInt3) & 0x3;
/*     */   }
/*     */   
/*     */   public boolean f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 132 */     return (g(paramahl, paramInt1, paramInt2, paramInt3) & 0x4) != 0;
/*     */   }
/*     */   
/*     */   private void b(int paramInt)
/*     */   {
/* 137 */     float f = 0.1875F;
/* 138 */     a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
/* 139 */     int i = paramInt & 0x3;
/* 140 */     int j = (paramInt & 0x4) != 0 ? 1 : 0;
/* 141 */     int k = (paramInt & 0x10) != 0 ? 1 : 0;
/* 142 */     if (i == 0) {
/* 143 */       if (j != 0) {
/* 144 */         if (k == 0) a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f); else
/* 145 */           a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/* 146 */       } else a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/* 147 */     } else if (i == 1) {
/* 148 */       if (j != 0) {
/* 149 */         if (k == 0) a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F); else
/* 150 */           a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/* 151 */       } else a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/* 152 */     } else if (i == 2) {
/* 153 */       if (j != 0) {
/* 154 */         if (k == 0) a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F); else
/* 155 */           a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/* 156 */       } else a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 157 */     } else if (i == 3) {
/* 158 */       if (j != 0) {
/* 159 */         if (k == 0) a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F); else
/* 160 */           a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 161 */       } else { a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {}
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 171 */     if (this.J == awt.f) { return true;
/*     */     }
/* 173 */     int i = g(paramahb, paramInt1, paramInt2, paramInt3);
/* 174 */     int j = i & 0x7;
/* 175 */     j ^= 0x4;
/* 176 */     if ((i & 0x8) == 0) {
/* 177 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 2);
/* 178 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 180 */       paramahb.a(paramInt1, paramInt2 - 1, paramInt3, j, 2);
/* 181 */       paramahb.c(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 184 */     paramahb.a(paramyz, 1003, paramInt1, paramInt2, paramInt3, 0);
/* 185 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 189 */     int i = g(paramahb, paramInt1, paramInt2, paramInt3);
/* 190 */     boolean bool = (i & 0x4) != 0;
/* 191 */     if (bool == paramBoolean) { return;
/*     */     }
/* 193 */     int j = i & 0x7;
/* 194 */     j ^= 0x4;
/* 195 */     if ((i & 0x8) == 0) {
/* 196 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 2);
/* 197 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     } else {
/* 199 */       paramahb.a(paramInt1, paramInt2 - 1, paramInt3, j, 2);
/* 200 */       paramahb.c(paramInt1, paramInt2 - 1, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 203 */     paramahb.a(null, 1003, paramInt1, paramInt2, paramInt3, 0);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 208 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 209 */     if ((i & 0x8) == 0) {
/* 210 */       int j = 0;
/* 211 */       if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) != this) {
/* 212 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 213 */         j = 1;
/*     */       }
/* 215 */       if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/* 216 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 217 */         j = 1;
/* 218 */         if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) == this) {
/* 219 */           paramahb.f(paramInt1, paramInt2 + 1, paramInt3);
/*     */         }
/*     */       }
/* 222 */       if (j != 0) {
/* 223 */         if (!paramahb.E) {
/* 224 */           b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*     */         }
/*     */       } else {
/* 227 */         boolean bool = (paramahb.v(paramInt1, paramInt2, paramInt3)) || (paramahb.v(paramInt1, paramInt2 + 1, paramInt3));
/* 228 */         if (((bool) || (paramaji.f())) && (paramaji != this)) {
/* 229 */           a(paramahb, paramInt1, paramInt2, paramInt3, bool);
/*     */         }
/*     */       }
/*     */     } else {
/* 233 */       if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) != this) {
/* 234 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/* 236 */       if (paramaji != this) {
/* 237 */         a(paramahb, paramInt1, paramInt2 - 1, paramInt3, paramaji);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 244 */     if ((paramInt1 & 0x8) != 0) return null;
/* 245 */     if (this.J == awt.f) return ade.aw;
/* 246 */     return ade.aq;
/*     */   }
/*     */   
/*     */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2)
/*     */   {
/* 251 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/* 252 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazw1, paramazw2);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 257 */     if (paramInt2 >= 255) { return false;
/*     */     }
/* 259 */     return (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (super.c(paramahb, paramInt1, paramInt2 + 1, paramInt3));
/*     */   }
/*     */   
/*     */   public int h()
/*     */   {
/* 264 */     return 1;
/*     */   }
/*     */   
/*     */   public int g(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 268 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 269 */     int j = (i & 0x8) != 0 ? 1 : 0;
/*     */     int k;
/*     */     int m;
/* 272 */     if (j != 0) {
/* 273 */       k = paramahl.e(paramInt1, paramInt2 - 1, paramInt3);
/* 274 */       m = i;
/*     */     } else {
/* 276 */       k = i;
/* 277 */       m = paramahl.e(paramInt1, paramInt2 + 1, paramInt3);
/*     */     }
/*     */     
/*     */ 
/* 281 */     int n = (m & 0x1) != 0 ? 1 : 0;
/* 282 */     return k & 0x7 | (j != 0 ? 8 : 0) | (n != 0 ? 16 : 0);
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 287 */     return this.J == awt.f ? ade.aw : ade.aq;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 292 */     if ((paramyz.bE.d) && 
/* 293 */       ((paramInt4 & 0x8) != 0) && 
/* 294 */       (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == this)) {
/* 295 */       paramahb.f(paramInt1, paramInt2 - 1, paramInt3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */