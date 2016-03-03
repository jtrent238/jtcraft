/*     */ import java.util.Random;
/*     */ 
/*     */ public class akr
/*     */   extends alw
/*     */ {
/*     */   int a;
/*     */   
/*     */   protected akr(awt paramawt)
/*     */   {
/*  10 */     super(paramawt);
/*     */   }
/*     */   
/*     */   private void n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  14 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  16 */     paramahb.d(paramInt1, paramInt2, paramInt3, aji.e(aji.b(this) + 1), i, 2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  23 */     int i = e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/*  25 */     int j = 1;
/*  26 */     if ((this.J == awt.i) && (!paramahb.t.f)) { j = 2;
/*     */     }
/*  28 */     int k = 1;
/*  29 */     int m = a(paramahb);
/*  30 */     int i1; if (i > 0) {
/*  31 */       int n = -100;
/*  32 */       this.a = 0;
/*  33 */       n = a(paramahb, paramInt1 - 1, paramInt2, paramInt3, n);
/*  34 */       n = a(paramahb, paramInt1 + 1, paramInt2, paramInt3, n);
/*  35 */       n = a(paramahb, paramInt1, paramInt2, paramInt3 - 1, n);
/*  36 */       n = a(paramahb, paramInt1, paramInt2, paramInt3 + 1, n);
/*     */       
/*  38 */       i1 = n + j;
/*  39 */       if ((i1 >= 8) || (n < 0)) {
/*  40 */         i1 = -1;
/*     */       }
/*  42 */       if (e(paramahb, paramInt1, paramInt2 + 1, paramInt3) >= 0) {
/*  43 */         int i2 = e(paramahb, paramInt1, paramInt2 + 1, paramInt3);
/*  44 */         if (i2 >= 8) i1 = i2; else
/*  45 */           i1 = i2 + 8;
/*     */       }
/*  47 */       if ((this.a >= 2) && (this.J == awt.h))
/*     */       {
/*     */ 
/*  50 */         if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o().a()) {
/*  51 */           i1 = 0;
/*  52 */         } else if ((paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o() == this.J) && (paramahb.e(paramInt1, paramInt2 - 1, paramInt3) == 0)) {
/*  53 */           i1 = 0;
/*     */         }
/*     */       }
/*  56 */       if ((this.J == awt.i) && 
/*  57 */         (i < 8) && (i1 < 8) && 
/*  58 */         (i1 > i) && 
/*  59 */         (paramRandom.nextInt(4) != 0)) {
/*  60 */         m *= 4;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*  65 */       if (i1 == i) {
/*  66 */         if (k != 0) n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */       } else {
/*  68 */         i = i1;
/*  69 */         if (i < 0) {
/*  70 */           paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */         } else {
/*  72 */           paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*  73 */           paramahb.a(paramInt1, paramInt2, paramInt3, this, m);
/*  74 */           paramahb.d(paramInt1, paramInt2, paramInt3, this);
/*     */         }
/*     */       }
/*     */     } else {
/*  78 */       n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     }
/*  80 */     if (q(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/*  81 */       if ((this.J == awt.i) && 
/*  82 */         (paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o() == awt.h)) {
/*  83 */         paramahb.b(paramInt1, paramInt2 - 1, paramInt3, ajn.b);
/*  84 */         m(paramahb, paramInt1, paramInt2 - 1, paramInt3);
/*  85 */         return;
/*     */       }
/*     */       
/*     */ 
/*  89 */       if (i >= 8) {
/*  90 */         h(paramahb, paramInt1, paramInt2 - 1, paramInt3, i);
/*     */       } else {
/*  92 */         h(paramahb, paramInt1, paramInt2 - 1, paramInt3, i + 8);
/*     */       }
/*  94 */     } else if ((i >= 0) && ((i == 0) || (p(paramahb, paramInt1, paramInt2 - 1, paramInt3)))) {
/*  95 */       boolean[] arrayOfBoolean = o(paramahb, paramInt1, paramInt2, paramInt3);
/*  96 */       i1 = i + j;
/*  97 */       if (i >= 8) {
/*  98 */         i1 = 1;
/*     */       }
/* 100 */       if (i1 >= 8) return;
/* 101 */       if (arrayOfBoolean[0] != 0) h(paramahb, paramInt1 - 1, paramInt2, paramInt3, i1);
/* 102 */       if (arrayOfBoolean[1] != 0) h(paramahb, paramInt1 + 1, paramInt2, paramInt3, i1);
/* 103 */       if (arrayOfBoolean[2] != 0) h(paramahb, paramInt1, paramInt2, paramInt3 - 1, i1);
/* 104 */       if (arrayOfBoolean[3] != 0) h(paramahb, paramInt1, paramInt2, paramInt3 + 1, i1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void h(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 110 */     if (q(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 111 */       aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 112 */       if (this.J == awt.i) {
/* 113 */         m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */       } else {
/* 115 */         localaji.b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*     */       }
/* 117 */       paramahb.d(paramInt1, paramInt2, paramInt3, this, paramInt4, 3);
/*     */     }
/*     */   }
/*     */   
/* 121 */   boolean[] b = new boolean[4];
/* 122 */   int[] M = new int[4];
/*     */   
/*     */   private int c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 125 */     int i = 1000;
/* 126 */     for (int j = 0; j < 4; j++) {
/* 127 */       if (((j != 0) || (paramInt5 != 1)) && 
/* 128 */         ((j != 1) || (paramInt5 != 0)) && 
/* 129 */         ((j != 2) || (paramInt5 != 3)) && (
/* 130 */         (j != 3) || (paramInt5 != 2)))
/*     */       {
/* 132 */         int k = paramInt1;
/* 133 */         int m = paramInt2;
/* 134 */         int n = paramInt3;
/*     */         
/* 136 */         if (j == 0) k--;
/* 137 */         if (j == 1) k++;
/* 138 */         if (j == 2) n--;
/* 139 */         if (j == 3) { n++;
/*     */         }
/* 141 */         if (!p(paramahb, k, m, n))
/*     */         {
/* 143 */           if ((paramahb.a(k, m, n).o() != this.J) || (paramahb.e(k, m, n) != 0))
/*     */           {
/*     */ 
/* 146 */             if (p(paramahb, k, m - 1, n)) {
/* 147 */               if (paramInt4 < 4) {
/* 148 */                 int i1 = c(paramahb, k, m, n, paramInt4 + 1, j);
/* 149 */                 if (i1 < i) i = i1;
/*     */               }
/*     */             } else
/* 152 */               return paramInt4; }
/*     */         }
/*     */       }
/*     */     }
/* 156 */     return i;
/*     */   }
/*     */   
/*     */   private boolean[] o(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 160 */     for (int i = 0; i < 4; i++) {
/* 161 */       this.M[i] = 1000;
/* 162 */       j = paramInt1;
/* 163 */       int k = paramInt2;
/* 164 */       int m = paramInt3;
/*     */       
/* 166 */       if (i == 0) j--;
/* 167 */       if (i == 1) j++;
/* 168 */       if (i == 2) m--;
/* 169 */       if (i == 3) m++;
/* 170 */       if (!p(paramahb, j, k, m))
/*     */       {
/* 172 */         if ((paramahb.a(j, k, m).o() != this.J) || (paramahb.e(j, k, m) != 0))
/*     */         {
/*     */ 
/* 175 */           if (p(paramahb, j, k - 1, m)) {
/* 176 */             this.M[i] = c(paramahb, j, k, m, 1, i);
/*     */           } else {
/* 178 */             this.M[i] = 0;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 183 */     i = this.M[0];
/* 184 */     for (int j = 1; j < 4; j++) {
/* 185 */       if (this.M[j] < i) { i = this.M[j];
/*     */       }
/*     */     }
/* 188 */     for (j = 0; j < 4; j++) {
/* 189 */       this.b[j] = (this.M[j] == i ? 1 : false);
/*     */     }
/* 191 */     return this.b;
/*     */   }
/*     */   
/*     */   private boolean p(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 195 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 196 */     if ((localaji == ajn.ao) || (localaji == ajn.av) || (localaji == ajn.an) || (localaji == ajn.ap) || (localaji == ajn.aH)) {
/* 197 */       return true;
/*     */     }
/* 199 */     if (localaji.J == awt.E) { return true;
/*     */     }
/* 201 */     return localaji.J.c();
/*     */   }
/*     */   
/*     */   protected int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 205 */     int i = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 206 */     if (i < 0) return paramInt4;
/* 207 */     if (i == 0) this.a += 1;
/* 208 */     if (i >= 8) {
/* 209 */       i = 0;
/*     */     }
/* 211 */     return (paramInt4 < 0) || (i < paramInt4) ? i : paramInt4;
/*     */   }
/*     */   
/*     */   private boolean q(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 215 */     awt localawt = paramahb.a(paramInt1, paramInt2, paramInt3).o();
/* 216 */     if (localawt == this.J) return false;
/* 217 */     if (localawt == awt.i) return false;
/* 218 */     return !p(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 223 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/* 224 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) == this) {
/* 225 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean L()
/*     */   {
/* 231 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */