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
/*     */ public class akc
/*     */   extends akj
/*     */   implements akw
/*     */ {
/*     */   public akc(boolean paramBoolean)
/*     */   {
/*  20 */     super(paramBoolean);
/*  21 */     this.A = true;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  26 */     return ade.bS;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  31 */     return ade.bS;
/*     */   }
/*     */   
/*     */   protected int b(int paramInt)
/*     */   {
/*  36 */     return 2;
/*     */   }
/*     */   
/*     */   protected akj e()
/*     */   {
/*  41 */     return ajn.bV;
/*     */   }
/*     */   
/*     */   protected akj i()
/*     */   {
/*  46 */     return ajn.bU;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  51 */     return 37;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  56 */     int i = (this.a) || ((paramInt2 & 0x8) != 0) ? 1 : 0;
/*     */     
/*  58 */     if (paramInt1 == 0) {
/*  59 */       if (i != 0) {
/*  60 */         return ajn.aA.h(paramInt1);
/*     */       }
/*  62 */       return ajn.az.h(paramInt1);
/*     */     }
/*  64 */     if (paramInt1 == 1) {
/*  65 */       if (i != 0) {
/*  66 */         return ajn.bV.L;
/*     */       }
/*  68 */       return this.L;
/*     */     }
/*     */     
/*  71 */     return ajn.T.h(1);
/*     */   }
/*     */   
/*     */   protected boolean c(int paramInt)
/*     */   {
/*  76 */     return (this.a) || ((paramInt & 0x8) != 0);
/*     */   }
/*     */   
/*     */   protected int f(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  81 */     return e(paramahl, paramInt1, paramInt2, paramInt3).a();
/*     */   }
/*     */   
/*     */   private int j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  85 */     if (!d(paramInt4)) {
/*  86 */       return h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*  88 */     return Math.max(h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4) - h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4), 0);
/*     */   }
/*     */   
/*     */   public boolean d(int paramInt)
/*     */   {
/*  93 */     return (paramInt & 0x4) == 4;
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  98 */     int i = h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*  99 */     if (i >= 15) return true;
/* 100 */     if (i == 0) { return false;
/*     */     }
/* 102 */     int j = h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/* 103 */     if (j == 0) { return true;
/*     */     }
/* 105 */     return i >= j;
/*     */   }
/*     */   
/*     */   protected int h(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 110 */     int i = super.h(paramahb, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     
/* 112 */     int j = l(paramInt4);
/* 113 */     int k = paramInt1 + p.a[j];
/* 114 */     int m = paramInt3 + p.b[j];
/* 115 */     aji localaji = paramahb.a(k, paramInt2, m);
/*     */     
/* 117 */     if (localaji.M()) {
/* 118 */       i = localaji.g(paramahb, k, paramInt2, m, p.f[j]);
/* 119 */     } else if ((i < 15) && (localaji.r())) {
/* 120 */       k += p.a[j];
/* 121 */       m += p.b[j];
/*     */       
/* 123 */       localaji = paramahb.a(k, paramInt2, m);
/* 124 */       if (localaji.M()) {
/* 125 */         i = localaji.g(paramahb, k, paramInt2, m, p.f[j]);
/*     */       }
/*     */     }
/*     */     
/* 129 */     return i;
/*     */   }
/*     */   
/*     */   public aoz e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 133 */     return (aoz)paramahl.o(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 138 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 139 */     boolean bool = this.a | (i & 0x8) != 0;
/* 140 */     int j = !d(i) ? 1 : 0;
/* 141 */     int k = j != 0 ? 4 : 0;
/* 142 */     k |= (bool ? 8 : 0);
/*     */     
/* 144 */     paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "random.click", 0.3F, j != 0 ? 0.55F : 0.5F);
/*     */     
/* 146 */     paramahb.a(paramInt1, paramInt2, paramInt3, k | i & 0x3, 2);
/* 147 */     c(paramahb, paramInt1, paramInt2, paramInt3, paramahb.s);
/* 148 */     return true;
/*     */   }
/*     */   
/*     */   protected void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 153 */     if (!paramahb.a(paramInt1, paramInt2, paramInt3, this)) {
/* 154 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 155 */       int j = j(paramahb, paramInt1, paramInt2, paramInt3, i);
/* 156 */       int k = e(paramahb, paramInt1, paramInt2, paramInt3).a();
/*     */       
/* 158 */       if ((j != k) || (c(i) != a(paramahb, paramInt1, paramInt2, paramInt3, i)))
/*     */       {
/* 160 */         if (i(paramahb, paramInt1, paramInt2, paramInt3, i)) {
/* 161 */           paramahb.a(paramInt1, paramInt2, paramInt3, this, b(0), -1);
/*     */         } else {
/* 163 */           paramahb.a(paramInt1, paramInt2, paramInt3, this, b(0), 0);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/* 170 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 171 */     int j = j(paramahb, paramInt1, paramInt2, paramInt3, i);
/* 172 */     int k = e(paramahb, paramInt1, paramInt2, paramInt3).a();
/* 173 */     e(paramahb, paramInt1, paramInt2, paramInt3).a(j);
/*     */     
/* 175 */     if ((k != j) || (!d(i))) {
/* 176 */       boolean bool = a(paramahb, paramInt1, paramInt2, paramInt3, i);
/* 177 */       int m = (this.a) || ((i & 0x8) != 0) ? 1 : 0;
/* 178 */       if ((m != 0) && (!bool)) {
/* 179 */         paramahb.a(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFF7, 2);
/* 180 */       } else if ((m == 0) && (bool)) {
/* 181 */         paramahb.a(paramInt1, paramInt2, paramInt3, i | 0x8, 2);
/*     */       }
/* 183 */       e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 189 */     if (this.a)
/*     */     {
/* 191 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 192 */       paramahb.d(paramInt1, paramInt2, paramInt3, i(), i | 0x8, 4);
/*     */     }
/* 194 */     c(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 199 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/* 200 */     paramahb.a(paramInt1, paramInt2, paramInt3, a(paramahb, 0));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 205 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/* 206 */     paramahb.p(paramInt1, paramInt2, paramInt3);
/*     */     
/* 208 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 213 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 214 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/* 215 */     if (localaor != null) {
/* 216 */       return localaor.c(paramInt4, paramInt5);
/*     */     }
/* 218 */     return false;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 223 */     return new aoz();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */