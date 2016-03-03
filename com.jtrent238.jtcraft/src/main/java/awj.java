/*     */ import java.util.Random;
/*     */ 
/*     */ public class awj
/*     */   extends awp
/*     */ {
/*   6 */   private int[] d = new int['Ȁ'];
/*     */   public double a;
/*     */   public double b;
/*     */   public double c;
/*     */   
/*     */   public awj() {
/*  12 */     this(new Random());
/*     */   }
/*     */   
/*     */   public awj(Random paramRandom) {
/*  16 */     this.a = (paramRandom.nextDouble() * 256.0D);
/*  17 */     this.b = (paramRandom.nextDouble() * 256.0D);
/*  18 */     this.c = (paramRandom.nextDouble() * 256.0D);
/*  19 */     for (int j = 0; j < 256; j++) {
/*  20 */       this.d[j] = j;
/*     */     }
/*     */     
/*  23 */     for (j = 0; j < 256; j++) {
/*  24 */       int k = paramRandom.nextInt(256 - j) + j;
/*  25 */       int m = this.d[j];
/*  26 */       this.d[j] = this.d[k];
/*  27 */       this.d[k] = m;
/*     */       
/*  29 */       this.d[(j + 256)] = this.d[j];
/*     */     }
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
/*     */   public final double b(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/*  71 */     return paramDouble2 + paramDouble1 * (paramDouble3 - paramDouble2);
/*     */   }
/*     */   
/*  74 */   private static final double[] e = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  75 */   private static final double[] f = { 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D };
/*  76 */   private static final double[] g = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*  77 */   private static final double[] h = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
/*  78 */   private static final double[] i = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
/*     */   
/*     */   public final double a(int paramInt, double paramDouble1, double paramDouble2) {
/*  81 */     int j = paramInt & 0xF;
/*  82 */     return h[j] * paramDouble1 + i[j] * paramDouble2;
/*     */   }
/*     */   
/*     */   public final double a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  86 */     int j = paramInt & 0xF;
/*  87 */     return e[j] * paramDouble1 + f[j] * paramDouble2 + g[j] * paramDouble3;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7)
/*     */   {
/*     */     double d9;
/*     */     
/*     */     int i11;
/*     */     
/*     */     int i12;
/*     */     
/*     */     double d10;
/* 100 */     if (paramInt2 == 1) {
/* 101 */       j = 0;int k = 0;int m = 0;n = 0;
/* 102 */       double d2 = 0.0D;double d3 = 0.0D;
/* 103 */       i5 = 0;
/* 104 */       double d4 = 1.0D / paramDouble7;
/* 105 */       for (int i7 = 0; i7 < paramInt1; i7++) {
/* 106 */         d6 = paramDouble1 + i7 * paramDouble4 + this.a;
/* 107 */         int i8 = (int)d6;
/* 108 */         if (d6 < i8) i8--;
/* 109 */         int i9 = i8 & 0xFF;
/* 110 */         d6 -= i8;
/* 111 */         d8 = d6 * d6 * d6 * (d6 * (d6 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 113 */         for (i10 = 0; i10 < paramInt3; i10++) {
/* 114 */           d9 = paramDouble3 + i10 * paramDouble6 + this.c;
/* 115 */           i11 = (int)d9;
/* 116 */           if (d9 < i11) i11--;
/* 117 */           i12 = i11 & 0xFF;
/* 118 */           d9 -= i11;
/* 119 */           d10 = d9 * d9 * d9 * (d9 * (d9 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 121 */           j = this.d[i9] + 0;
/* 122 */           k = this.d[j] + i12;
/* 123 */           m = this.d[(i9 + 1)] + 0;
/* 124 */           n = this.d[m] + i12;
/* 125 */           d2 = b(d8, a(this.d[k], d6, d9), a(this.d[n], d6 - 1.0D, 0.0D, d9));
/* 126 */           d3 = b(d8, a(this.d[(k + 1)], d6, 0.0D, d9 - 1.0D), a(this.d[(n + 1)], d6 - 1.0D, 0.0D, d9 - 1.0D));
/*     */           
/* 128 */           double d11 = b(d10, d2, d3);
/*     */           
/* 130 */           paramArrayOfDouble[(i5++)] += d11 * d4;
/*     */         }
/*     */       }
/* 133 */       return;
/*     */     }
/* 135 */     int j = 0;
/* 136 */     double d1 = 1.0D / paramDouble7;
/* 137 */     int n = -1;
/* 138 */     int i1 = 0;int i2 = 0;int i3 = 0;int i4 = 0;int i5 = 0;int i6 = 0;
/* 139 */     double d5 = 0.0D;double d6 = 0.0D;double d7 = 0.0D;double d8 = 0.0D;
/*     */     
/* 141 */     for (int i10 = 0; i10 < paramInt1; i10++) {
/* 142 */       d9 = paramDouble1 + i10 * paramDouble4 + this.a;
/* 143 */       i11 = (int)d9;
/* 144 */       if (d9 < i11) i11--;
/* 145 */       i12 = i11 & 0xFF;
/* 146 */       d9 -= i11;
/* 147 */       d10 = d9 * d9 * d9 * (d9 * (d9 * 6.0D - 15.0D) + 10.0D);
/*     */       
/* 149 */       for (int i13 = 0; i13 < paramInt3; i13++) {
/* 150 */         double d12 = paramDouble3 + i13 * paramDouble6 + this.c;
/* 151 */         int i14 = (int)d12;
/* 152 */         if (d12 < i14) i14--;
/* 153 */         int i15 = i14 & 0xFF;
/* 154 */         d12 -= i14;
/* 155 */         double d13 = d12 * d12 * d12 * (d12 * (d12 * 6.0D - 15.0D) + 10.0D);
/*     */         
/* 157 */         for (int i16 = 0; i16 < paramInt2; i16++) {
/* 158 */           double d14 = paramDouble2 + i16 * paramDouble5 + this.b;
/* 159 */           int i17 = (int)d14;
/* 160 */           if (d14 < i17) i17--;
/* 161 */           int i18 = i17 & 0xFF;
/* 162 */           d14 -= i17;
/* 163 */           double d15 = d14 * d14 * d14 * (d14 * (d14 * 6.0D - 15.0D) + 10.0D);
/*     */           
/* 165 */           if ((i16 == 0) || (i18 != n)) {
/* 166 */             n = i18;
/* 167 */             i1 = this.d[i12] + i18;
/* 168 */             i2 = this.d[i1] + i15;
/* 169 */             i3 = this.d[(i1 + 1)] + i15;
/* 170 */             i4 = this.d[(i12 + 1)] + i18;
/* 171 */             i5 = this.d[i4] + i15;
/* 172 */             i6 = this.d[(i4 + 1)] + i15;
/* 173 */             d5 = b(d10, a(this.d[i2], d9, d14, d12), a(this.d[i5], d9 - 1.0D, d14, d12));
/* 174 */             d6 = b(d10, a(this.d[i3], d9, d14 - 1.0D, d12), a(this.d[i6], d9 - 1.0D, d14 - 1.0D, d12));
/* 175 */             d7 = b(d10, a(this.d[(i2 + 1)], d9, d14, d12 - 1.0D), a(this.d[(i5 + 1)], d9 - 1.0D, d14, d12 - 1.0D));
/* 176 */             d8 = b(d10, a(this.d[(i3 + 1)], d9, d14 - 1.0D, d12 - 1.0D), a(this.d[(i6 + 1)], d9 - 1.0D, d14 - 1.0D, d12 - 1.0D));
/*     */           }
/*     */           
/* 179 */           double d16 = b(d15, d5, d6);
/* 180 */           double d17 = b(d15, d7, d8);
/* 181 */           double d18 = b(d13, d16, d17);
/*     */           
/* 183 */           paramArrayOfDouble[(j++)] += d18 * d1;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */