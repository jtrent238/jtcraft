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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aof
/*     */   extends aji
/*     */ {
/*     */   public aof()
/*     */   {
/*  21 */     super(awt.q);
/*  22 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*  23 */     a(true);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  28 */     return 10;
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  33 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  42 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  47 */     return false;
/*     */   }
/*     */   
/*     */   public int w()
/*     */   {
/*  52 */     return 1;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  57 */     return 30;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  62 */     return ade.F;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  67 */     return ade.F;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  72 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  73 */     int j = (i & 0x2) == 2 ? 1 : 0;
/*  74 */     int k = !ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3) ? 1 : 0;
/*     */     
/*  76 */     if (j != k) {
/*  77 */       b(paramahb, paramInt1, paramInt2, paramInt3, i, 0);
/*  78 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  84 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  85 */     int j = (i & 0x4) == 4 ? 1 : 0;
/*  86 */     int k = (i & 0x2) == 2 ? 1 : 0;
/*     */     
/*  88 */     if (k == 0) {
/*  89 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
/*  90 */     } else if (j == 0) {
/*  91 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*     */     } else {
/*  93 */       a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  99 */     int i = ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3) ? 0 : 2;
/* 100 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/* 101 */     a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 106 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4 | 0x1);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 111 */     if (paramahb.E) { return;
/*     */     }
/* 113 */     if ((paramyz.bF() != null) && (paramyz.bF().b() == ade.aZ)) {
/* 114 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt4 | 0x8, 4);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 119 */     for (int i = 0; i < 2; i++) {
/* 120 */       for (int j = 1; j < 42; j++) {
/* 121 */         int k = paramInt1 + p.a[i] * j;
/* 122 */         int m = paramInt3 + p.b[i] * j;
/* 123 */         aji localaji = paramahb.a(k, paramInt2, m);
/*     */         
/* 125 */         if (localaji == ajn.bC) {
/* 126 */           int n = paramahb.e(k, paramInt2, m) & 0x3;
/*     */           
/* 128 */           if (n == p.f[i]) {
/* 129 */             ajn.bC.a(paramahb, k, paramInt2, m, false, paramahb.e(k, paramInt2, m), true, j, paramInt4);
/*     */           }
/*     */         }
/*     */         else {
/* 133 */           if (localaji != ajn.bD) {
/*     */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa) {
/* 142 */     if (paramahb.E) { return;
/*     */     }
/* 144 */     if ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x1) == 1) {
/* 145 */       return;
/*     */     }
/*     */     
/* 148 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 153 */     if (paramahb.E) { return;
/*     */     }
/* 155 */     if ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x1) != 1) {
/* 156 */       return;
/*     */     }
/*     */     
/* 159 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 163 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 164 */     int j = (i & 0x1) == 1 ? 1 : 0;
/* 165 */     int k = 0;
/*     */     
/* 167 */     List localList = paramahb.b(null, azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + this.F, paramInt3 + this.G));
/* 168 */     if (!localList.isEmpty()) {
/* 169 */       for (sa localsa : localList) {
/* 170 */         if (!localsa.az()) {
/* 171 */           k = 1;
/* 172 */           break;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 177 */     if ((k != 0) && (j == 0)) {
/* 178 */       i |= 0x1;
/*     */     }
/*     */     
/* 181 */     if ((k == 0) && (j != 0)) {
/* 182 */       i &= 0xFFFFFFFE;
/*     */     }
/*     */     
/* 185 */     if (k != j) {
/* 186 */       paramahb.a(paramInt1, paramInt2, paramInt3, i, 3);
/* 187 */       a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */     }
/*     */     
/* 190 */     if (k != 0) {
/* 191 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 196 */     int i = paramInt1 + p.a[paramInt5];
/* 197 */     int j = paramInt2;
/* 198 */     int k = paramInt3 + p.b[paramInt5];
/* 199 */     aji localaji = paramahl.a(i, j, k);
/* 200 */     int m = (paramInt4 & 0x2) == 2 ? 1 : 0;
/*     */     int n;
/* 202 */     int i1; if (localaji == ajn.bC) {
/* 203 */       n = paramahl.e(i, j, k);
/* 204 */       i1 = n & 0x3;
/*     */       
/* 206 */       return i1 == p.f[paramInt5];
/*     */     }
/*     */     
/* 209 */     if (localaji == ajn.bD) {
/* 210 */       n = paramahl.e(i, j, k);
/* 211 */       i1 = (n & 0x2) == 2 ? 1 : 0;
/* 212 */       return m == i1;
/*     */     }
/*     */     
/* 215 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */