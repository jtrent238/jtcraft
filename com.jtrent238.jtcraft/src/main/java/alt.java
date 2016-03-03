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
/*     */ public abstract class alt
/*     */   extends aod
/*     */ {
/*     */   int[] a;
/*     */   protected int b;
/*  28 */   protected rf[][] M = new rf[2][];
/*     */   
/*     */   public alt() {
/*  31 */     super(awt.j, false);
/*  32 */     a(true);
/*  33 */     a(abt.c);
/*  34 */     c(0.2F);
/*  35 */     g(1);
/*  36 */     a(h);
/*     */   }
/*     */   
/*     */   public int D()
/*     */   {
/*  41 */     double d1 = 0.5D;
/*  42 */     double d2 = 1.0D;
/*     */     
/*  44 */     return agx.a(d1, d2);
/*     */   }
/*     */   
/*     */   public int i(int paramInt)
/*     */   {
/*  49 */     return agx.c();
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  54 */     int i = 0;
/*  55 */     int j = 0;
/*  56 */     int k = 0;
/*     */     
/*  58 */     for (int m = -1; m <= 1; m++) {
/*  59 */       for (int n = -1; n <= 1; n++) {
/*  60 */         int i1 = paramahl.a(paramInt1 + n, paramInt3 + m).c(paramInt1 + n, paramInt2, paramInt3 + m);
/*     */         
/*  62 */         i += ((i1 & 0xFF0000) >> 16);
/*  63 */         j += ((i1 & 0xFF00) >> 8);
/*  64 */         k += (i1 & 0xFF);
/*     */       }
/*     */     }
/*     */     
/*  68 */     return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/*  73 */     int i = 1;
/*  74 */     int j = i + 1;
/*     */     
/*  76 */     if (paramahb.b(paramInt1 - j, paramInt2 - j, paramInt3 - j, paramInt1 + j, paramInt2 + j, paramInt3 + j)) {
/*  77 */       for (int k = -i; k <= i; k++) {
/*  78 */         for (int m = -i; m <= i; m++) {
/*  79 */           for (int n = -i; n <= i; n++)
/*  80 */             if (paramahb.a(paramInt1 + k, paramInt2 + m, paramInt3 + n).o() == awt.j) {
/*  81 */               int i1 = paramahb.e(paramInt1 + k, paramInt2 + m, paramInt3 + n);
/*  82 */               paramahb.a(paramInt1 + k, paramInt2 + m, paramInt3 + n, i1 | 0x8, 4);
/*     */             }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  90 */     if (paramahb.E) { return;
/*     */     }
/*  92 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  93 */     if (((i & 0x8) != 0) && ((i & 0x4) == 0)) {
/*  94 */       int j = 4;
/*  95 */       int k = j + 1;
/*     */       
/*  97 */       int m = 32;
/*  98 */       int n = m * m;
/*  99 */       int i1 = m / 2;
/* 100 */       if (this.a == null) {
/* 101 */         this.a = new int[m * m * m];
/*     */       }
/*     */       
/* 104 */       if (paramahb.b(paramInt1 - k, paramInt2 - k, paramInt3 - k, paramInt1 + k, paramInt2 + k, paramInt3 + k)) { int i3;
/* 105 */         int i4; for (i2 = -j; i2 <= j; i2++) {
/* 106 */           for (i3 = -j; i3 <= j; i3++)
/* 107 */             for (i4 = -j; i4 <= j; i4++) {
/* 108 */               aji localaji = paramahb.a(paramInt1 + i2, paramInt2 + i3, paramInt3 + i4);
/* 109 */               if ((localaji == ajn.r) || (localaji == ajn.s)) {
/* 110 */                 this.a[((i2 + i1) * n + (i3 + i1) * m + (i4 + i1))] = 0;
/* 111 */               } else if (localaji.o() == awt.j) {
/* 112 */                 this.a[((i2 + i1) * n + (i3 + i1) * m + (i4 + i1))] = -2;
/*     */               } else
/* 114 */                 this.a[((i2 + i1) * n + (i3 + i1) * m + (i4 + i1))] = -1;
/*     */             }
/*     */         }
/* 117 */         for (i2 = 1; i2 <= 4; i2++) {
/* 118 */           for (i3 = -j; i3 <= j; i3++) {
/* 119 */             for (i4 = -j; i4 <= j; i4++) {
/* 120 */               for (int i5 = -j; i5 <= j; i5++) {
/* 121 */                 if (this.a[((i3 + i1) * n + (i4 + i1) * m + (i5 + i1))] == i2 - 1) {
/* 122 */                   if (this.a[((i3 + i1 - 1) * n + (i4 + i1) * m + (i5 + i1))] == -2) {
/* 123 */                     this.a[((i3 + i1 - 1) * n + (i4 + i1) * m + (i5 + i1))] = i2;
/*     */                   }
/* 125 */                   if (this.a[((i3 + i1 + 1) * n + (i4 + i1) * m + (i5 + i1))] == -2) {
/* 126 */                     this.a[((i3 + i1 + 1) * n + (i4 + i1) * m + (i5 + i1))] = i2;
/*     */                   }
/* 128 */                   if (this.a[((i3 + i1) * n + (i4 + i1 - 1) * m + (i5 + i1))] == -2) {
/* 129 */                     this.a[((i3 + i1) * n + (i4 + i1 - 1) * m + (i5 + i1))] = i2;
/*     */                   }
/* 131 */                   if (this.a[((i3 + i1) * n + (i4 + i1 + 1) * m + (i5 + i1))] == -2) {
/* 132 */                     this.a[((i3 + i1) * n + (i4 + i1 + 1) * m + (i5 + i1))] = i2;
/*     */                   }
/* 134 */                   if (this.a[((i3 + i1) * n + (i4 + i1) * m + (i5 + i1 - 1))] == -2) {
/* 135 */                     this.a[((i3 + i1) * n + (i4 + i1) * m + (i5 + i1 - 1))] = i2;
/*     */                   }
/* 137 */                   if (this.a[((i3 + i1) * n + (i4 + i1) * m + (i5 + i1 + 1))] == -2)
/* 138 */                     this.a[((i3 + i1) * n + (i4 + i1) * m + (i5 + i1 + 1))] = i2;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 145 */       int i2 = this.a[(i1 * n + i1 * m + i1)];
/* 146 */       if (i2 >= 0) {
/* 147 */         paramahb.a(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFF7, 4);
/*     */       } else {
/* 149 */         e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 156 */     if ((paramahb.y(paramInt1, paramInt2 + 1, paramInt3)) && (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (paramRandom.nextInt(15) == 1)) {
/* 157 */       double d1 = paramInt1 + paramRandom.nextFloat();
/* 158 */       double d2 = paramInt2 - 0.05D;
/* 159 */       double d3 = paramInt3 + paramRandom.nextFloat();
/*     */       
/* 161 */       paramahb.a("dripWater", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 166 */     b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 167 */     paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 172 */     return paramRandom.nextInt(20) == 0 ? 1 : 0;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 177 */     return adb.a(ajn.g);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 182 */     if (!paramahb.E) {
/* 183 */       int i = b(paramInt4);
/* 184 */       if (paramInt5 > 0) {
/* 185 */         i -= (2 << paramInt5);
/* 186 */         if (i < 10) {
/* 187 */           i = 10;
/*     */         }
/*     */       }
/* 190 */       if (paramahb.s.nextInt(i) == 0) {
/* 191 */         adb localadb = a(paramInt4, paramahb.s, paramInt5);
/* 192 */         a(paramahb, paramInt1, paramInt2, paramInt3, new add(localadb, 1, a(paramInt4)));
/*     */       }
/*     */       
/* 195 */       i = 200;
/* 196 */       if (paramInt5 > 0) {
/* 197 */         i -= (10 << paramInt5);
/* 198 */         if (i < 40) {
/* 199 */           i = 40;
/*     */         }
/*     */       }
/* 202 */       c(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, i);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
/*     */   
/*     */   protected int b(int paramInt)
/*     */   {
/* 211 */     return 20;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 216 */     if ((!paramahb.E) && (paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/* 217 */       paramyz.a(pp.C[aji.b(this)], 1);
/*     */       
/*     */ 
/* 220 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(adb.a(this), 1, paramInt4 & 0x3));
/*     */     } else {
/* 222 */       super.a(paramahb, paramyz, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 228 */     return paramInt & 0x3;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 233 */     return !this.P;
/*     */   }
/*     */   
/*     */   public abstract rf a(int paramInt1, int paramInt2);
/*     */   
/*     */   public void b(boolean paramBoolean)
/*     */   {
/* 240 */     this.P = paramBoolean;
/* 241 */     this.b = (paramBoolean ? 0 : 1);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected add j(int paramInt)
/*     */   {
/* 249 */     return new add(adb.a(this), 1, paramInt & 0x3);
/*     */   }
/*     */   
/*     */   public abstract String[] e();
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */