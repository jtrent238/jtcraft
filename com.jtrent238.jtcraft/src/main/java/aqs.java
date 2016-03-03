/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aqs
/*     */   extends aqx
/*     */ {
/*  11 */   private float[] d = new float['Ѐ'];
/*     */   
/*     */   protected void a(long paramLong, int paramInt1, int paramInt2, aji[] paramArrayOfaji, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3, int paramInt4, double paramDouble4) {
/*  14 */     Random localRandom = new Random(paramLong);
/*     */     
/*  16 */     double d1 = paramInt1 * 16 + 8;
/*  17 */     double d2 = paramInt2 * 16 + 8;
/*     */     
/*  19 */     float f1 = 0.0F;
/*  20 */     float f2 = 0.0F;
/*     */     
/*  22 */     if (paramInt4 <= 0) {
/*  23 */       i = this.a * 16 - 16;
/*  24 */       paramInt4 = i - localRandom.nextInt(i / 4);
/*     */     }
/*  26 */     int i = 0;
/*     */     
/*  28 */     if (paramInt3 == -1) {
/*  29 */       paramInt3 = paramInt4 / 2;
/*  30 */       i = 1;
/*     */     }
/*     */     
/*  33 */     float f3 = 1.0F;
/*  34 */     for (int j = 0; j < 256; j++) {
/*  35 */       if ((j == 0) || (localRandom.nextInt(3) == 0)) {
/*  36 */         f3 = 1.0F + localRandom.nextFloat() * localRandom.nextFloat() * 1.0F;
/*     */       }
/*  38 */       this.d[j] = (f3 * f3);
/*     */     }
/*  41 */     for (; 
/*  41 */         paramInt3 < paramInt4; paramInt3++) {
/*  42 */       double d3 = 1.5D + qh.a(paramInt3 * 3.1415927F / paramInt4) * paramFloat1 * 1.0F;
/*  43 */       double d4 = d3 * paramDouble4;
/*     */       
/*  45 */       d3 *= (localRandom.nextFloat() * 0.25D + 0.75D);
/*  46 */       d4 *= (localRandom.nextFloat() * 0.25D + 0.75D);
/*     */       
/*  48 */       float f4 = qh.b(paramFloat3);
/*  49 */       float f5 = qh.a(paramFloat3);
/*  50 */       paramDouble1 += qh.b(paramFloat2) * f4;
/*  51 */       paramDouble2 += f5;
/*  52 */       paramDouble3 += qh.a(paramFloat2) * f4;
/*     */       
/*  54 */       paramFloat3 *= 0.7F;
/*     */       
/*  56 */       paramFloat3 += f2 * 0.05F;
/*  57 */       paramFloat2 += f1 * 0.05F;
/*     */       
/*  59 */       f2 *= 0.8F;
/*  60 */       f1 *= 0.5F;
/*  61 */       f2 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 2.0F;
/*  62 */       f1 += (localRandom.nextFloat() - localRandom.nextFloat()) * localRandom.nextFloat() * 4.0F;
/*     */       
/*  64 */       if ((i != 0) || (localRandom.nextInt(4) != 0))
/*     */       {
/*     */ 
/*  67 */         double d5 = paramDouble1 - d1;
/*  68 */         double d6 = paramDouble3 - d2;
/*  69 */         double d7 = paramInt4 - paramInt3;
/*  70 */         double d8 = paramFloat1 + 2.0F + 16.0F;
/*  71 */         if (d5 * d5 + d6 * d6 - d7 * d7 > d8 * d8) {
/*  72 */           return;
/*     */         }
/*     */         
/*     */ 
/*  76 */         if ((paramDouble1 >= d1 - 16.0D - d3 * 2.0D) && (paramDouble3 >= d2 - 16.0D - d3 * 2.0D) && (paramDouble1 <= d1 + 16.0D + d3 * 2.0D) && (paramDouble3 <= d2 + 16.0D + d3 * 2.0D))
/*     */         {
/*     */ 
/*  79 */           int k = qh.c(paramDouble1 - d3) - paramInt1 * 16 - 1;
/*  80 */           int m = qh.c(paramDouble1 + d3) - paramInt1 * 16 + 1;
/*     */           
/*  82 */           int n = qh.c(paramDouble2 - d4) - 1;
/*  83 */           int i1 = qh.c(paramDouble2 + d4) + 1;
/*     */           
/*  85 */           int i2 = qh.c(paramDouble3 - d3) - paramInt2 * 16 - 1;
/*  86 */           int i3 = qh.c(paramDouble3 + d3) - paramInt2 * 16 + 1;
/*     */           
/*  88 */           if (k < 0) k = 0;
/*  89 */           if (m > 16) { m = 16;
/*     */           }
/*  91 */           if (n < 1) n = 1;
/*  92 */           if (i1 > 248) { i1 = 248;
/*     */           }
/*  94 */           if (i2 < 0) i2 = 0;
/*  95 */           if (i3 > 16) { i3 = 16;
/*     */           }
/*  97 */           int i4 = 0;
/*  98 */           int i8; for (int i5 = k; (i4 == 0) && (i5 < m); i5++) {
/*  99 */             for (int i6 = i2; (i4 == 0) && (i6 < i3); i6++) {
/* 100 */               for (int i7 = i1 + 1; (i4 == 0) && (i7 >= n - 1); i7--) {
/* 101 */                 i8 = (i5 * 16 + i6) * 256 + i7;
/* 102 */                 if ((i7 >= 0) && (i7 < 256))
/*     */                 {
/* 104 */                   aji localaji1 = paramArrayOfaji[i8];
/* 105 */                   if ((localaji1 == ajn.i) || (localaji1 == ajn.j)) {
/* 106 */                     i4 = 1;
/*     */                   }
/* 108 */                   if ((i7 != n - 1) && (i5 != k) && (i5 != m - 1) && (i6 != i2) && (i6 != i3 - 1))
/* 109 */                     i7 = n;
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/* 114 */           if (i4 == 0)
/*     */           {
/* 116 */             for (i5 = k; i5 < m; i5++) {
/* 117 */               double d9 = (i5 + paramInt1 * 16 + 0.5D - paramDouble1) / d3;
/* 118 */               for (i8 = i2; i8 < i3; i8++) {
/* 119 */                 double d10 = (i8 + paramInt2 * 16 + 0.5D - paramDouble3) / d3;
/* 120 */                 int i9 = (i5 * 16 + i8) * 256 + i1;
/* 121 */                 int i10 = 0;
/* 122 */                 if (d9 * d9 + d10 * d10 < 1.0D) {
/* 123 */                   for (int i11 = i1 - 1; i11 >= n; i11--) {
/* 124 */                     double d11 = (i11 + 0.5D - paramDouble2) / d4;
/* 125 */                     if ((d9 * d9 + d10 * d10) * this.d[i11] + d11 * d11 / 6.0D < 1.0D) {
/* 126 */                       aji localaji2 = paramArrayOfaji[i9];
/* 127 */                       if (localaji2 == ajn.c) i10 = 1;
/* 128 */                       if ((localaji2 == ajn.b) || (localaji2 == ajn.d) || (localaji2 == ajn.c)) {
/* 129 */                         if (i11 < 10) {
/* 130 */                           paramArrayOfaji[i9] = ajn.k;
/*     */                         } else {
/* 132 */                           paramArrayOfaji[i9] = null;
/* 133 */                           if ((i10 != 0) && (paramArrayOfaji[(i9 - 1)] == ajn.d))
/* 134 */                             paramArrayOfaji[(i9 - 1)] = this.c.a(i5 + paramInt1 * 16, i8 + paramInt2 * 16).ai;
/*     */                         }
/*     */                       }
/*     */                     }
/* 138 */                     i9--;
/*     */                   }
/*     */                 }
/*     */               }
/*     */             }
/* 143 */             if (i != 0) break;
/*     */           }
/*     */         }
/*     */       }
/*     */     } }
/*     */   
/* 149 */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, aji[] paramArrayOfaji) { if (this.b.nextInt(50) != 0) return;
/* 150 */     double d1 = paramInt1 * 16 + this.b.nextInt(16);
/* 151 */     double d2 = this.b.nextInt(this.b.nextInt(40) + 8) + 20;
/* 152 */     double d3 = paramInt2 * 16 + this.b.nextInt(16);
/*     */     
/* 154 */     int i = 1;
/*     */     
/* 156 */     for (int j = 0; j < i; j++)
/*     */     {
/* 158 */       float f1 = this.b.nextFloat() * 3.1415927F * 2.0F;
/* 159 */       float f2 = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
/* 160 */       float f3 = (this.b.nextFloat() * 2.0F + this.b.nextFloat()) * 2.0F;
/*     */       
/* 162 */       a(this.b.nextLong(), paramInt3, paramInt4, paramArrayOfaji, d1, d2, d3, f3, f1, f2, 0, 0, 3.0D);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */