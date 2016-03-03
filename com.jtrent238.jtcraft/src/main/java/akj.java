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
/*     */ public abstract class akj
/*     */   extends akk
/*     */ {
/*     */   protected final boolean a;
/*     */   
/*     */   protected akj(boolean paramBoolean)
/*     */   {
/*  19 */     super(awt.q);
/*  20 */     this.a = paramBoolean;
/*  21 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  26 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  31 */     if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/*  32 */       return false;
/*     */     }
/*  34 */     return super.c(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/*  40 */       return false;
/*     */     }
/*  42 */     return super.j(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  47 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  49 */     if (!g(paramahb, paramInt1, paramInt2, paramInt3, i)) {
/*  50 */       boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*  51 */       if ((this.a) && (!bool)) {
/*  52 */         paramahb.d(paramInt1, paramInt2, paramInt3, i(), i, 2);
/*  53 */       } else if (!this.a)
/*     */       {
/*     */ 
/*     */ 
/*  57 */         paramahb.d(paramInt1, paramInt2, paramInt3, e(), i, 2);
/*  58 */         if (!bool) {
/*  59 */           paramahb.a(paramInt1, paramInt2, paramInt3, e(), k(i), -1);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  68 */     if (paramInt1 == 0) {
/*  69 */       if (this.a) {
/*  70 */         return ajn.aA.h(paramInt1);
/*     */       }
/*  72 */       return ajn.az.h(paramInt1);
/*     */     }
/*  74 */     if (paramInt1 == 1) {
/*  75 */       return this.L;
/*     */     }
/*     */     
/*  78 */     return ajn.T.h(1);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  83 */     if ((paramInt4 == 0) || (paramInt4 == 1))
/*     */     {
/*  85 */       return false;
/*     */     }
/*  87 */     return true;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  92 */     return 36;
/*     */   }
/*     */   
/*     */   protected boolean c(int paramInt) {
/*  96 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 101 */     return b(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 107 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 108 */     if (!c(i)) {
/* 109 */       return 0;
/*     */     }
/*     */     
/* 112 */     int j = l(i);
/*     */     
/* 114 */     if ((j == 0) && (paramInt4 == 3)) return f(paramahl, paramInt1, paramInt2, paramInt3, i);
/* 115 */     if ((j == 1) && (paramInt4 == 4)) return f(paramahl, paramInt1, paramInt2, paramInt3, i);
/* 116 */     if ((j == 2) && (paramInt4 == 2)) return f(paramahl, paramInt1, paramInt2, paramInt3, i);
/* 117 */     if ((j == 3) && (paramInt4 == 5)) { return f(paramahl, paramInt1, paramInt2, paramInt3, i);
/*     */     }
/* 119 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 124 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 125 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 126 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 127 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 128 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 129 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/* 130 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 131 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 132 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/* 133 */       return;
/*     */     }
/*     */     
/* 136 */     b(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   protected void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/* 140 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 142 */     if (!g(paramahb, paramInt1, paramInt2, paramInt3, i)) {
/* 143 */       boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, i);
/* 144 */       if (((this.a) && (!bool)) || ((!this.a) && (bool) && (!paramahb.a(paramInt1, paramInt2, paramInt3, this)))) {
/* 145 */         int j = -1;
/*     */         
/*     */ 
/* 148 */         if (i(paramahb, paramInt1, paramInt2, paramInt3, i)) {
/* 149 */           j = -3;
/* 150 */         } else if (this.a) {
/* 151 */           j = -2;
/*     */         }
/*     */         
/* 154 */         paramahb.a(paramInt1, paramInt2, paramInt3, this, b(i), j);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean g(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 160 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 164 */     return h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4) > 0;
/*     */   }
/*     */   
/*     */   protected int h(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 168 */     int i = l(paramInt4);
/*     */     
/* 170 */     int j = paramInt1 + p.a[i];
/* 171 */     int k = paramInt3 + p.b[i];
/* 172 */     int m = paramahb.g(j, paramInt2, k, p.d[i]);
/*     */     
/* 174 */     if (m >= 15) return m;
/* 175 */     return Math.max(m, paramahb.a(j, paramInt2, k) == ajn.af ? paramahb.e(j, paramInt2, k) : 0);
/*     */   }
/*     */   
/*     */   protected int h(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 179 */     int i = l(paramInt4);
/*     */     
/* 181 */     switch (i) {
/*     */     case 0: 
/*     */     case 2: 
/* 184 */       return Math.max(i(paramahl, paramInt1 - 1, paramInt2, paramInt3, 4), i(paramahl, paramInt1 + 1, paramInt2, paramInt3, 5));
/*     */     case 1: 
/*     */     case 3: 
/* 187 */       return Math.max(i(paramahl, paramInt1, paramInt2, paramInt3 + 1, 3), i(paramahl, paramInt1, paramInt2, paramInt3 - 1, 2));
/*     */     }
/*     */     
/* 190 */     return 0;
/*     */   }
/*     */   
/*     */   protected int i(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 194 */     aji localaji = paramahl.a(paramInt1, paramInt2, paramInt3);
/* 195 */     if (a(localaji)) {
/* 196 */       if (localaji == ajn.af) {
/* 197 */         return paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */       }
/* 199 */       return paramahl.e(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */     
/*     */ 
/* 203 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/* 208 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 213 */     int i = ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3) + 2) % 4;
/* 214 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/*     */     
/* 216 */     boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, i);
/* 217 */     if (bool) {
/* 218 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 224 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 228 */     int i = l(paramahb.e(paramInt1, paramInt2, paramInt3));
/* 229 */     if (i == 1) {
/* 230 */       paramahb.e(paramInt1 + 1, paramInt2, paramInt3, this);
/* 231 */       paramahb.b(paramInt1 + 1, paramInt2, paramInt3, this, 4);
/*     */     }
/* 233 */     if (i == 3) {
/* 234 */       paramahb.e(paramInt1 - 1, paramInt2, paramInt3, this);
/* 235 */       paramahb.b(paramInt1 - 1, paramInt2, paramInt3, this, 5);
/*     */     }
/* 237 */     if (i == 2) {
/* 238 */       paramahb.e(paramInt1, paramInt2, paramInt3 + 1, this);
/* 239 */       paramahb.b(paramInt1, paramInt2, paramInt3 + 1, this, 2);
/*     */     }
/* 241 */     if (i == 0) {
/* 242 */       paramahb.e(paramInt1, paramInt2, paramInt3 - 1, this);
/* 243 */       paramahb.b(paramInt1, paramInt2, paramInt3 - 1, this, 3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 249 */     if (this.a) {
/* 250 */       paramahb.d(paramInt1 + 1, paramInt2, paramInt3, this);
/* 251 */       paramahb.d(paramInt1 - 1, paramInt2, paramInt3, this);
/* 252 */       paramahb.d(paramInt1, paramInt2, paramInt3 + 1, this);
/* 253 */       paramahb.d(paramInt1, paramInt2, paramInt3 - 1, this);
/* 254 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 255 */       paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*     */     }
/* 257 */     super.b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 262 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected boolean a(aji paramaji)
/*     */   {
/* 272 */     return paramaji.f();
/*     */   }
/*     */   
/*     */   protected int f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 276 */     return 15;
/*     */   }
/*     */   
/*     */   public static boolean d(aji paramaji) {
/* 280 */     return (ajn.aR.e(paramaji)) || (ajn.bU.e(paramaji));
/*     */   }
/*     */   
/*     */   public boolean e(aji paramaji) {
/* 284 */     return (paramaji == e()) || (paramaji == i());
/*     */   }
/*     */   
/*     */   public boolean i(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 288 */     int i = l(paramInt4);
/* 289 */     if (d(paramahb.a(paramInt1 - p.a[i], paramInt2, paramInt3 - p.b[i]))) {
/* 290 */       int j = paramahb.e(paramInt1 - p.a[i], paramInt2, paramInt3 - p.b[i]);
/* 291 */       int k = l(j);
/* 292 */       return k != i;
/*     */     }
/* 294 */     return false;
/*     */   }
/*     */   
/*     */   protected int k(int paramInt) {
/* 298 */     return b(paramInt);
/*     */   }
/*     */   
/*     */   protected abstract int b(int paramInt);
/*     */   
/*     */   protected abstract akj e();
/*     */   
/*     */   protected abstract akj i();
/*     */   
/*     */   public boolean c(aji paramaji)
/*     */   {
/* 309 */     return e(paramaji);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */