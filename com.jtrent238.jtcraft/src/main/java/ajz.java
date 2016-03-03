/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ajz
/*     */   extends akk
/*     */   implements ajo
/*     */ {
/*     */   private rf[] a;
/*     */   
/*     */   public ajz()
/*     */   {
/*  18 */     super(awt.k);
/*  19 */     a(true);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  24 */     return this.a[2];
/*     */   }
/*     */   
/*     */   public rf b(int paramInt) {
/*  28 */     if ((paramInt < 0) || (paramInt >= this.a.length)) {
/*  29 */       paramInt = this.a.length - 1;
/*     */     }
/*  31 */     return this.a[paramInt];
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  37 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  38 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*  39 */       paramahb.d(paramInt1, paramInt2, paramInt3, e(0), 0, 2);
/*  40 */     } else if (paramahb.s.nextInt(5) == 0) {
/*  41 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  42 */       int j = c(i);
/*  43 */       if (j < 2) {
/*  44 */         j++;
/*  45 */         paramahb.a(paramInt1, paramInt2, paramInt3, j << 2 | l(i), 2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  52 */     int i = l(paramahb.e(paramInt1, paramInt2, paramInt3));
/*     */     
/*  54 */     paramInt1 += p.a[i];
/*  55 */     paramInt3 += p.b[i];
/*  56 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*     */     
/*  58 */     return (localaji == ajn.r) && (alx.c(paramahb.e(paramInt1, paramInt2, paramInt3)) == 3);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  63 */     return 28;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  68 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  73 */     return false;
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  78 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  79 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  84 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  85 */     return super.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  90 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*  91 */     int j = l(i);
/*  92 */     int k = c(i);
/*     */     
/*  94 */     int m = 4 + k * 2;
/*  95 */     int n = 5 + k * 2;
/*     */     
/*  97 */     float f = m / 2.0F;
/*     */     
/*  99 */     switch (j) {
/*     */     case 0: 
/* 101 */       a((8.0F - f) / 16.0F, (12.0F - n) / 16.0F, (15.0F - m) / 16.0F, (8.0F + f) / 16.0F, 0.75F, 0.9375F);
/* 102 */       break;
/*     */     case 2: 
/* 104 */       a((8.0F - f) / 16.0F, (12.0F - n) / 16.0F, 0.0625F, (8.0F + f) / 16.0F, 0.75F, (1.0F + m) / 16.0F);
/* 105 */       break;
/*     */     case 1: 
/* 107 */       a(0.0625F, (12.0F - n) / 16.0F, (8.0F - f) / 16.0F, (1.0F + m) / 16.0F, 0.75F, (8.0F + f) / 16.0F);
/* 108 */       break;
/*     */     case 3: 
/* 110 */       a((15.0F - m) / 16.0F, (12.0F - n) / 16.0F, (8.0F - f) / 16.0F, 0.9375F, 0.75F, (8.0F + f) / 16.0F);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 117 */     int i = ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3) + 0) % 4;
/* 118 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/* 123 */     if ((paramInt4 == 1) || (paramInt4 == 0)) {
/* 124 */       paramInt4 = 2;
/*     */     }
/* 126 */     return p.f[p.e[paramInt4]];
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 131 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 132 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 133 */       paramahb.d(paramInt1, paramInt2, paramInt3, e(0), 0, 2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int c(int paramInt) {
/* 138 */     return (paramInt & 0xC) >> 2;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 143 */     int i = c(paramInt4);
/* 144 */     int j = 1;
/* 145 */     if (i >= 2) {
/* 146 */       j = 3;
/*     */     }
/* 148 */     for (int k = 0; k < j; k++) {
/* 149 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.aR, 1, 3));
/*     */     }
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 155 */     return ade.aR;
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 160 */     return 3;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 165 */     this.a = new rf[3];
/*     */     
/* 167 */     for (int i = 0; i < this.a.length; i++) {
/* 168 */       this.a[i] = paramrg.a(N() + "_stage_" + i);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 174 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 175 */     int j = c(i);
/* 176 */     if (j >= 2) return false;
/* 177 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 187 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 188 */     int j = akk.l(i);
/* 189 */     int k = c(i);
/* 190 */     k++;
/* 191 */     paramahb.a(paramInt1, paramInt2, paramInt3, k << 2 | j, 2);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */