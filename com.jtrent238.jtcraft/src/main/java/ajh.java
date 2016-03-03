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
/*     */ public class ajh
/*     */   extends akk
/*     */ {
/*  24 */   public static final int[][] a = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
/*     */   
/*     */ 
/*     */ 
/*     */   private rf[] b;
/*     */   
/*     */ 
/*     */ 
/*     */   private rf[] M;
/*     */   
/*     */ 
/*     */   private rf[] N;
/*     */   
/*     */ 
/*     */ 
/*     */   public ajh()
/*     */   {
/*  41 */     super(awt.n);
/*     */     
/*  43 */     e();
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  48 */     if (paramahb.E) { return true;
/*     */     }
/*  50 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  52 */     if (!b(i))
/*     */     {
/*  54 */       int j = l(i);
/*  55 */       paramInt1 += a[j][0];
/*  56 */       paramInt3 += a[j][1];
/*  57 */       if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) {
/*  58 */         return true;
/*     */       }
/*  60 */       i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/*  63 */     if ((!paramahb.t.e()) || (paramahb.a(paramInt1, paramInt3) == ahu.w)) {
/*  64 */       double d1 = paramInt1 + 0.5D;
/*  65 */       double d2 = paramInt2 + 0.5D;
/*  66 */       double d3 = paramInt3 + 0.5D;
/*  67 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  68 */       int k = l(i);
/*  69 */       paramInt1 += a[k][0];
/*  70 */       paramInt3 += a[k][1];
/*  71 */       if (paramahb.a(paramInt1, paramInt2, paramInt3) == this) {
/*  72 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*  73 */         d1 = (d1 + paramInt1 + 0.5D) / 2.0D;
/*  74 */         d2 = (d2 + paramInt2 + 0.5D) / 2.0D;
/*  75 */         d3 = (d3 + paramInt3 + 0.5D) / 2.0D;
/*     */       }
/*  77 */       paramahb.a(null, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, 5.0F, true, true);
/*  78 */       return true;
/*     */     }
/*     */     
/*  81 */     if (c(i)) {
/*  82 */       localObject = null;
/*  83 */       for (yz localyz : paramahb.h) {
/*  84 */         if (localyz.bm()) {
/*  85 */           r localr = localyz.bB;
/*  86 */           if ((localr.a == paramInt1) && (localr.b == paramInt2) && (localr.c == paramInt3)) {
/*  87 */             localObject = localyz;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  92 */       if (localObject == null) {
/*  93 */         a(paramahb, paramInt1, paramInt2, paramInt3, false);
/*     */       } else {
/*  95 */         paramyz.b(new fr("tile.bed.occupied", new Object[0]));
/*  96 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 100 */     Object localObject = paramyz.a(paramInt1, paramInt2, paramInt3);
/* 101 */     if (localObject == za.a) {
/* 102 */       a(paramahb, paramInt1, paramInt2, paramInt3, true);
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     if (localObject == za.c) {
/* 107 */       paramyz.b(new fr("tile.bed.noSleep", new Object[0]));
/* 108 */     } else if (localObject == za.f) {
/* 109 */       paramyz.b(new fr("tile.bed.notSafe", new Object[0]));
/*     */     }
/* 111 */     return true;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 116 */     if (paramInt1 == 0) {
/* 117 */       return ajn.f.h(paramInt1);
/*     */     }
/*     */     
/* 120 */     int i = l(paramInt2);
/* 121 */     int j = p.i[i][paramInt1];
/* 122 */     int k = b(paramInt2) ? 1 : 0;
/*     */     
/* 124 */     if (((k == 1) && (j == 2)) || ((k == 0) && (j == 3))) {
/* 125 */       return this.b[k];
/*     */     }
/* 127 */     if ((j == 5) || (j == 4)) {
/* 128 */       return this.M[k];
/*     */     }
/* 130 */     return this.N[k];
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 135 */     this.N = new rf[] { paramrg.a(N() + "_feet_top"), paramrg.a(N() + "_head_top") };
/* 136 */     this.b = new rf[] { paramrg.a(N() + "_feet_end"), paramrg.a(N() + "_head_end") };
/* 137 */     this.M = new rf[] { paramrg.a(N() + "_feet_side"), paramrg.a(N() + "_head_side") };
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 142 */     return 14;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 147 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/* 152 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 157 */     e();
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 162 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 163 */     int j = l(i);
/*     */     
/* 165 */     if (b(i)) {
/* 166 */       if (paramahb.a(paramInt1 - a[j][0], paramInt2, paramInt3 - a[j][1]) != this) {
/* 167 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/* 170 */     else if (paramahb.a(paramInt1 + a[j][0], paramInt2, paramInt3 + a[j][1]) != this) {
/* 171 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/* 172 */       if (!paramahb.E) {
/* 173 */         b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 181 */     if (b(paramInt1)) {
/* 182 */       return adb.d(0);
/*     */     }
/* 184 */     return ade.aV;
/*     */   }
/*     */   
/*     */   private void e() {
/* 188 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
/*     */   }
/*     */   
/*     */   public static boolean b(int paramInt) {
/* 192 */     return (paramInt & 0x8) != 0;
/*     */   }
/*     */   
/*     */   public static boolean c(int paramInt) {
/* 196 */     return (paramInt & 0x4) != 0;
/*     */   }
/*     */   
/*     */   public static void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 200 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 201 */     if (paramBoolean) {
/* 202 */       i |= 0x4;
/*     */     } else {
/* 204 */       i &= 0xFFFFFFFB;
/*     */     }
/* 206 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 4);
/*     */   }
/*     */   
/*     */   public static r a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 210 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 211 */     int j = akk.l(i);
/*     */     
/*     */ 
/* 214 */     for (int k = 0; k <= 1; k++) {
/* 215 */       int m = paramInt1 - a[j][0] * k - 1;
/* 216 */       int n = paramInt3 - a[j][1] * k - 1;
/* 217 */       int i1 = m + 2;
/* 218 */       int i2 = n + 2;
/*     */       
/* 220 */       for (int i3 = m; i3 <= i1; i3++) {
/* 221 */         for (int i4 = n; i4 <= i2; i4++) {
/* 222 */           if ((ahb.a(paramahb, i3, paramInt2 - 1, i4)) && (!paramahb.a(i3, paramInt2, i4).o().k()) && (!paramahb.a(i3, paramInt2 + 1, i4).o().k())) {
/* 223 */             if (paramInt4 > 0) {
/* 224 */               paramInt4--;
/*     */             }
/*     */             else {
/* 227 */               return new r(i3, paramInt2, i4);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 233 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 238 */     if (!b(paramInt4)) {
/* 239 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public int h()
/*     */   {
/* 245 */     return 1;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 250 */     return ade.aV;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 255 */     if ((paramyz.bE.d) && 
/* 256 */       (b(paramInt4))) {
/* 257 */       int i = l(paramInt4);
/* 258 */       paramInt1 -= a[i][0];
/* 259 */       paramInt3 -= a[i][1];
/* 260 */       if (paramahb.a(paramInt1, paramInt2, paramInt3) == this) {
/* 261 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */