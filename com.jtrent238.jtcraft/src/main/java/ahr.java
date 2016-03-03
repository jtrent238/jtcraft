/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ahr
/*     */   implements ahl
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private apx[][] c;
/*     */   private boolean d;
/*     */   private ahb e;
/*     */   
/*     */   public ahr(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
/*     */   {
/*  18 */     this.e = paramahb;
/*     */     
/*  20 */     this.a = (paramInt1 - paramInt7 >> 4);
/*  21 */     this.b = (paramInt3 - paramInt7 >> 4);
/*  22 */     int i = paramInt4 + paramInt7 >> 4;
/*  23 */     int j = paramInt6 + paramInt7 >> 4;
/*     */     
/*  25 */     this.c = new apx[i - this.a + 1][j - this.b + 1];
/*     */     
/*  27 */     this.d = true;
/*  28 */     int m; apx localapx; for (int k = this.a; k <= i; k++) {
/*  29 */       for (m = this.b; m <= j; m++) {
/*  30 */         localapx = paramahb.e(k, m);
/*  31 */         if (localapx != null) {
/*  32 */           this.c[(k - this.a)][(m - this.b)] = localapx;
/*     */         }
/*     */       }
/*     */     }
/*  36 */     for (k = paramInt1 >> 4; k <= paramInt4 >> 4; k++) {
/*  37 */       for (m = paramInt3 >> 4; m <= paramInt6 >> 4; m++) {
/*  38 */         localapx = this.c[(k - this.a)][(m - this.b)];
/*  39 */         if ((localapx != null) && 
/*  40 */           (!localapx.c(paramInt2, paramInt5))) {
/*  41 */           this.d = false;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean T()
/*     */   {
/*  50 */     return this.d;
/*     */   }
/*     */   
/*     */   public aji a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  55 */     aji localaji = ajn.a;
/*  56 */     if ((paramInt2 >= 0) && 
/*  57 */       (paramInt2 < 256))
/*     */     {
/*  59 */       int i = (paramInt1 >> 4) - this.a;
/*  60 */       int j = (paramInt3 >> 4) - this.b;
/*     */       
/*  62 */       if ((i >= 0) && (i < this.c.length) && (j >= 0) && (j < this.c[i].length))
/*     */       {
/*  64 */         apx localapx = this.c[i][j];
/*  65 */         if (localapx != null) {
/*  66 */           localaji = localapx.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  71 */     return localaji;
/*     */   }
/*     */   
/*     */   public aor o(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  76 */     int i = (paramInt1 >> 4) - this.a;
/*  77 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/*  79 */     return this.c[i][j].e(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  91 */     int i = a(ahn.a, paramInt1, paramInt2, paramInt3);
/*  92 */     int j = a(ahn.b, paramInt1, paramInt2, paramInt3);
/*  93 */     if (j < paramInt4) j = paramInt4;
/*  94 */     return i << 20 | j << 4;
/*     */   }
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
/*     */   public int e(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 142 */     if (paramInt2 < 0) return 0;
/* 143 */     if (paramInt2 >= 256) return 0;
/* 144 */     int i = (paramInt1 >> 4) - this.a;
/* 145 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/* 147 */     return this.c[i][j].c(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ahu a(int paramInt1, int paramInt2)
/*     */   {
/* 157 */     return this.e.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 162 */     return a(paramInt1, paramInt2, paramInt3).o() == awt.a;
/*     */   }
/*     */   
/*     */   public int a(ahn paramahn, int paramInt1, int paramInt2, int paramInt3) {
/* 166 */     if (paramInt2 < 0) paramInt2 = 0;
/* 167 */     if (paramInt2 >= 256) paramInt2 = 255;
/* 168 */     if ((paramInt2 < 0) || (paramInt2 >= 256) || (paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 > 30000000)) {
/* 169 */       return paramahn.c;
/*     */     }
/* 171 */     if ((paramahn == ahn.a) && (this.e.t.g)) {
/* 172 */       return 0;
/*     */     }
/*     */     
/* 175 */     if (a(paramInt1, paramInt2, paramInt3).n()) {
/* 176 */       i = b(paramahn, paramInt1, paramInt2 + 1, paramInt3);
/* 177 */       j = b(paramahn, paramInt1 + 1, paramInt2, paramInt3);
/* 178 */       int k = b(paramahn, paramInt1 - 1, paramInt2, paramInt3);
/* 179 */       int m = b(paramahn, paramInt1, paramInt2, paramInt3 + 1);
/* 180 */       int n = b(paramahn, paramInt1, paramInt2, paramInt3 - 1);
/* 181 */       if (j > i) i = j;
/* 182 */       if (k > i) i = k;
/* 183 */       if (m > i) i = m;
/* 184 */       if (n > i) i = n;
/* 185 */       return i;
/*     */     }
/*     */     
/* 188 */     int i = (paramInt1 >> 4) - this.a;
/* 189 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/* 191 */     return this.c[i][j].a(paramahn, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public int b(ahn paramahn, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 196 */     if (paramInt2 < 0) paramInt2 = 0;
/* 197 */     if (paramInt2 >= 256) paramInt2 = 255;
/* 198 */     if ((paramInt2 < 0) || (paramInt2 >= 256) || (paramInt1 < -30000000) || (paramInt3 < -30000000) || (paramInt1 >= 30000000) || (paramInt3 > 30000000)) {
/* 199 */       return paramahn.c;
/*     */     }
/* 201 */     int i = (paramInt1 >> 4) - this.a;
/* 202 */     int j = (paramInt3 >> 4) - this.b;
/*     */     
/* 204 */     return this.c[i][j].a(paramahn, paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */   }
/*     */   
/*     */   public int R()
/*     */   {
/* 209 */     return 256;
/*     */   }
/*     */   
/*     */   public int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 214 */     return a(paramInt1, paramInt2, paramInt3).c(this, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */