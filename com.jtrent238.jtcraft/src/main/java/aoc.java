/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoc
/*     */   extends aji
/*     */ {
/*     */   protected aoc()
/*     */   {
/*  12 */     super(awt.q);
/*  13 */     a(true);
/*  14 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  19 */     return null;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  24 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  29 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  34 */     return 2;
/*     */   }
/*     */   
/*     */   private boolean m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  38 */     if (ahb.a(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  39 */       return true;
/*     */     }
/*  41 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  42 */     if ((localaji == ajn.aJ) || (localaji == ajn.bk) || (localaji == ajn.w) || (localaji == ajn.bK)) {
/*  43 */       return true;
/*     */     }
/*  45 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  50 */     if (paramahb.c(paramInt1 - 1, paramInt2, paramInt3, true))
/*  51 */       return true;
/*  52 */     if (paramahb.c(paramInt1 + 1, paramInt2, paramInt3, true))
/*  53 */       return true;
/*  54 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 - 1, true))
/*  55 */       return true;
/*  56 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 + 1, true))
/*  57 */       return true;
/*  58 */     if (m(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/*  59 */       return true;
/*     */     }
/*     */     
/*  62 */     return false;
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  67 */     int i = paramInt5;
/*     */     
/*  69 */     if ((paramInt4 == 1) && (m(paramahb, paramInt1, paramInt2 - 1, paramInt3))) i = 5;
/*  70 */     if ((paramInt4 == 2) && (paramahb.c(paramInt1, paramInt2, paramInt3 + 1, true))) i = 4;
/*  71 */     if ((paramInt4 == 3) && (paramahb.c(paramInt1, paramInt2, paramInt3 - 1, true))) i = 3;
/*  72 */     if ((paramInt4 == 4) && (paramahb.c(paramInt1 + 1, paramInt2, paramInt3, true))) i = 2;
/*  73 */     if ((paramInt4 == 5) && (paramahb.c(paramInt1 - 1, paramInt2, paramInt3, true))) { i = 1;
/*     */     }
/*  75 */     return i;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  80 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*  81 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 0) b(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  86 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 0) {
/*  87 */       if (paramahb.c(paramInt1 - 1, paramInt2, paramInt3, true)) {
/*  88 */         paramahb.a(paramInt1, paramInt2, paramInt3, 1, 2);
/*  89 */       } else if (paramahb.c(paramInt1 + 1, paramInt2, paramInt3, true)) {
/*  90 */         paramahb.a(paramInt1, paramInt2, paramInt3, 2, 2);
/*  91 */       } else if (paramahb.c(paramInt1, paramInt2, paramInt3 - 1, true)) {
/*  92 */         paramahb.a(paramInt1, paramInt2, paramInt3, 3, 2);
/*  93 */       } else if (paramahb.c(paramInt1, paramInt2, paramInt3 + 1, true)) {
/*  94 */         paramahb.a(paramInt1, paramInt2, paramInt3, 4, 2);
/*  95 */       } else if (m(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/*  96 */         paramahb.a(paramInt1, paramInt2, paramInt3, 5, 2);
/*     */       }
/*     */     }
/*  99 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 104 */     b(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   protected boolean b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji) {
/* 108 */     if (e(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 109 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 110 */       int j = 0;
/*     */       
/* 112 */       if ((!paramahb.c(paramInt1 - 1, paramInt2, paramInt3, true)) && (i == 1)) j = 1;
/* 113 */       if ((!paramahb.c(paramInt1 + 1, paramInt2, paramInt3, true)) && (i == 2)) j = 1;
/* 114 */       if ((!paramahb.c(paramInt1, paramInt2, paramInt3 - 1, true)) && (i == 3)) j = 1;
/* 115 */       if ((!paramahb.c(paramInt1, paramInt2, paramInt3 + 1, true)) && (i == 4)) j = 1;
/* 116 */       if ((!m(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (i == 5)) { j = 1;
/*     */       }
/* 118 */       if (j != 0) {
/* 119 */         b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 120 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 121 */         return true;
/*     */       }
/*     */     } else {
/* 124 */       return true;
/*     */     }
/* 126 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 130 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 131 */       if (paramahb.a(paramInt1, paramInt2, paramInt3) == this) {
/* 132 */         b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 133 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/* 135 */       return false;
/*     */     }
/* 137 */     return true;
/*     */   }
/*     */   
/*     */   public azu a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azw paramazw1, azw paramazw2)
/*     */   {
/* 142 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*     */     
/* 144 */     float f = 0.15F;
/* 145 */     if (i == 1) {
/* 146 */       a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
/* 147 */     } else if (i == 2) {
/* 148 */       a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
/* 149 */     } else if (i == 3) {
/* 150 */       a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
/* 151 */     } else if (i == 4) {
/* 152 */       a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
/*     */     } else {
/* 154 */       f = 0.1F;
/* 155 */       a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.6F, 0.5F + f);
/*     */     }
/*     */     
/* 158 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazw1, paramazw2);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 163 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 164 */     double d1 = paramInt1 + 0.5F;
/* 165 */     double d2 = paramInt2 + 0.7F;
/* 166 */     double d3 = paramInt3 + 0.5F;
/* 167 */     double d4 = 0.2199999988079071D;
/* 168 */     double d5 = 0.27000001072883606D;
/* 169 */     if (i == 1) {
/* 170 */       paramahb.a("smoke", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 171 */       paramahb.a("flame", d1 - d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 172 */     } else if (i == 2) {
/* 173 */       paramahb.a("smoke", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 174 */       paramahb.a("flame", d1 + d5, d2 + d4, d3, 0.0D, 0.0D, 0.0D);
/* 175 */     } else if (i == 3) {
/* 176 */       paramahb.a("smoke", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 177 */       paramahb.a("flame", d1, d2 + d4, d3 - d5, 0.0D, 0.0D, 0.0D);
/* 178 */     } else if (i == 4) {
/* 179 */       paramahb.a("smoke", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/* 180 */       paramahb.a("flame", d1, d2 + d4, d3 + d5, 0.0D, 0.0D, 0.0D);
/*     */     } else {
/* 182 */       paramahb.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 183 */       paramahb.a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */