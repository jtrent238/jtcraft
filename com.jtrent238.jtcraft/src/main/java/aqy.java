/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqy
/*     */   extends aqx
/*     */ {
/*     */   protected void a(long paramLong, int paramInt1, int paramInt2, aji[] paramArrayOfaji, double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/*  13 */     a(paramLong, paramInt1, paramInt2, paramArrayOfaji, paramDouble1, paramDouble2, paramDouble3, 1.0F + this.b.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5D);
/*     */   }
/*     */   
/*     */   protected void a(long paramLong, int paramInt1, int paramInt2, aji[] paramArrayOfaji, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4) {
/*  17 */     double d1 = paramInt1 * 16 + 8;
/*  18 */     double d2 = paramInt2 * 16 + 8;
/*     */     
/*  20 */     float f1 = 0.0F;
/*  21 */     float f2 = 0.0F;
/*  22 */     Random localRandom = new Random(paramLong);
/*     */     
/*  24 */     if (paramInt4 <= 0) {
/*  25 */       i = this.a * 16 - 16;
/*  26 */       paramInt4 = i - localRandom.nextInt(i / 4);
/*     */     }
/*  28 */     int i = 0;
/*     */     
/*  30 */     if (paramInt3 == -1) {
/*  31 */       paramInt3 = paramInt4 / 2;
/*  32 */       i = 1;
/*     */     }
/*     */     
/*  35 */     int j = localRandom.nextInt(paramInt4 / 2) + paramInt4 / 4;
/*  36 */     int k = localRandom.nextInt(6) == 0 ? 1 : 0;
/*  38 */     for (; 
/*  38 */         paramInt3 < paramInt4; paramInt3++) {
/*  39 */       double d3 = 1.5D + qh.a(paramInt3 * 3.1415927F / paramInt4) * paramFloat1 * 1.0F;
/*  40 */       double d4 = d3 * paramDouble4;
/*     */       
/*  42 */       float f3 = qh.b(paramFloat3);
/*  43 */       float f4 = qh.a(paramFloat3);
/*  44 */       paramDouble1 += qh.b(paramFloat2) * f3;
/*  45 */       paramDouble2 += f4;
/*  46 */       paramDouble3 += qh.a(paramFloat2) * f3;
/*     */       
/*  48 */       if (k != 0) {
/*  49 */         paramFloat3 *= 0.92F;
/*     */       } else {
/*  51 */         paramFloat3 *= 0.7F;
/*     */       }
/*  53 */       paramFloat3 += f2 * 0.1F;
/*  54 */       paramFloat2 += f1 * 0.1F;
/*     */       
/*  56 */       f2 *= 0.9F;
/*  57 */       f1 *= 0.75F;
/*  58 */       f2 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 2.0F;
/*  59 */       f1 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 4.0F;
/*     */       
/*  61 */       if ((i == 0) && (paramInt3 == j) && (paramFloat1 > 1.0F)) {
/*  62 */         a(localRandom.nextLong(), paramInt1, paramInt2, paramArrayOfaji, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 - 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  63 */         a(localRandom.nextLong(), paramInt1, paramInt2, paramArrayOfaji, paramDouble1, paramDouble2, paramDouble3, localRandom.nextFloat() * 0.5F + 0.5F, paramFloat2 + 1.5707964F, paramFloat3 / 3.0F, paramInt3, paramInt4, 1.0D);
/*  64 */         return;
/*     */       }
/*  66 */       if ((i != 0) || (localRandom.nextInt(4) != 0))
/*     */       {
/*     */ 
/*  69 */         double d5 = paramDouble1 - d1;
/*  70 */         double d6 = paramDouble3 - d2;
/*  71 */         double d7 = paramInt4 - paramInt3;
/*  72 */         double d8 = paramFloat1 + 2.0F + 16.0F;
/*  73 */         if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) {
/*  74 */           return;
/*     */         }
/*     */         
/*     */ 
/*  78 */         if ((paramDouble1 >= d1 - 16.0D - d3 * 2.0D) && (paramDouble3 >= d2 - 16.0D - d3 * 2.0D) && (paramDouble1 <= d1 + 16.0D + d3 * 2.0D) && (paramDouble3 <= d2 + 16.0D + d3 * 2.0D))
/*     */         {
/*  80 */           int m = qh.c(paramDouble1 - d3) - paramInt1 * 16 - 1;
/*  81 */           int n = qh.c(paramDouble1 + d3) - paramInt1 * 16 + 1;
/*     */           
/*  83 */           int i1 = qh.c(paramDouble2 - d4) - 1;
/*  84 */           int i2 = qh.c(paramDouble2 + d4) + 1;
/*     */           
/*  86 */           int i3 = qh.c(paramDouble3 - d3) - paramInt2 * 16 - 1;
/*  87 */           int i4 = qh.c(paramDouble3 + d3) - paramInt2 * 16 + 1;
/*     */           
/*  89 */           if (m < 0) m = 0;
/*  90 */           if (n > 16) { n = 16;
/*     */           }
/*  92 */           if (i1 < 1) i1 = 1;
/*  93 */           if (i2 > 120) { i2 = 120;
/*     */           }
/*  95 */           if (i3 < 0) i3 = 0;
/*  96 */           if (i4 > 16) { i4 = 16;
/*     */           }
/*  98 */           int i5 = 0;
/*  99 */           int i9; for (int i6 = m; (i5 == 0) && (i6 < n); i6++) {
/* 100 */             for (int i7 = i3; (i5 == 0) && (i7 < i4); i7++) {
/* 101 */               for (int i8 = i2 + 1; (i5 == 0) && (i8 >= i1 - 1); i8--) {
/* 102 */                 i9 = (i6 * 16 + i7) * 128 + i8;
/* 103 */                 if ((i8 >= 0) && (i8 < 128))
/*     */                 {
/* 105 */                   aji localaji1 = paramArrayOfaji[i9];
/* 106 */                   if ((localaji1 == ajn.k) || (localaji1 == ajn.l)) {
/* 107 */                     i5 = 1;
/*     */                   }
/* 109 */                   if ((i8 != i1 - 1) && (i6 != m) && (i6 != n - 1) && (i7 != i3) && (i7 != i4 - 1))
/* 110 */                     i8 = i1;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/* 115 */           if (i5 == 0)
/*     */           {
/* 117 */             for (i6 = m; i6 < n; i6++) {
/* 118 */               double d9 = (i6 + paramInt1 * 16 + 0.5D - paramDouble1) / d3;
/* 119 */               for (i9 = i3; i9 < i4; i9++) {
/* 120 */                 double d10 = (i9 + paramInt2 * 16 + 0.5D - paramDouble3) / d3;
/* 121 */                 int i10 = (i6 * 16 + i9) * 128 + i2;
/* 122 */                 for (int i11 = i2 - 1; i11 >= i1; i11--) {
/* 123 */                   double d11 = (i11 + 0.5D - paramDouble2) / d4;
/* 124 */                   if ((d11 > -0.7D) && (d9 * d9 + d11 * d11 + d10 * d10 < 1.0D)) {
/* 125 */                     aji localaji2 = paramArrayOfaji[i10];
/* 126 */                     if ((localaji2 == ajn.aL) || (localaji2 == ajn.d) || (localaji2 == ajn.c)) {
/* 127 */                       paramArrayOfaji[i10] = null;
/*     */                     }
/*     */                   }
/* 130 */                   i10--;
/*     */                 }
/*     */               }
/*     */             }
/* 134 */             if (i != 0) break;
/*     */           }
/*     */         }
/*     */       }
/*     */     } }
/*     */   
/* 140 */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, aji[] paramArrayOfaji) { int i = this.b.nextInt(this.b.nextInt(this.b.nextInt(10) + 1) + 1);
/* 141 */     if (this.b.nextInt(5) != 0) { i = 0;
/*     */     }
/* 143 */     for (int j = 0; j < i; j++) {
/* 144 */       double d1 = paramInt1 * 16 + this.b.nextInt(16);
/* 145 */       double d2 = this.b.nextInt(128);
/* 146 */       double d3 = paramInt2 * 16 + this.b.nextInt(16);
/*     */       
/* 148 */       int k = 1;
/* 149 */       if (this.b.nextInt(4) == 0) {
/* 150 */         a(this.b.nextLong(), paramInt3, paramInt4, paramArrayOfaji, d1, d2, d3);
/* 151 */         k += this.b.nextInt(4);
/*     */       }
/*     */       
/* 154 */       for (int m = 0; m < k; m++)
/*     */       {
/* 156 */         float f1 = this.b.nextFloat() * 3.1415927F * 2.0F;
/* 157 */         float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 158 */         float f3 = this.b.nextFloat() * 2.0F + this.b.nextFloat();
/*     */         
/* 160 */         a(this.b.nextLong(), paramInt3, paramInt4, paramArrayOfaji, d1, d2, d3, f3 * 2.0F, f1, f2, 0, 0, 0.5D);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */