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
/*     */ 
/*     */ public class ara
/*     */   implements apu
/*     */ {
/*     */   private Random i;
/*     */   private awk j;
/*     */   private awk k;
/*     */   private awk l;
/*     */   public awk a;
/*     */   public awk b;
/*     */   private ahb m;
/*     */   private double[] n;
/*     */   private ahu[] o;
/*     */   double[] c;
/*     */   double[] d;
/*     */   double[] e;
/*     */   double[] f;
/*     */   double[] g;
/*     */   
/*     */   public ara(ahb paramahb, long paramLong)
/*     */   {
/*  37 */     this.m = paramahb;
/*     */     
/*  39 */     this.i = new Random(paramLong);
/*  40 */     this.j = new awk(this.i, 16);
/*  41 */     this.k = new awk(this.i, 16);
/*  42 */     this.l = new awk(this.i, 8);
/*     */     
/*  44 */     this.a = new awk(this.i, 10);
/*  45 */     this.b = new awk(this.i, 16);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, aji[] paramArrayOfaji, ahu[] paramArrayOfahu)
/*     */   {
/*  51 */     int i1 = 2;
/*     */     
/*  53 */     int i2 = i1 + 1;
/*  54 */     int i3 = 33;
/*  55 */     int i4 = i1 + 1;
/*  56 */     this.n = a(this.n, paramInt1 * i1, 0, paramInt2 * i1, i2, i3, i4);
/*     */     
/*  58 */     for (int i5 = 0; i5 < i1; i5++) {
/*  59 */       for (int i6 = 0; i6 < i1; i6++) {
/*  60 */         for (int i7 = 0; i7 < 32; i7++) {
/*  61 */           double d1 = 0.25D;
/*  62 */           double d2 = this.n[(((i5 + 0) * i4 + (i6 + 0)) * i3 + (i7 + 0))];
/*  63 */           double d3 = this.n[(((i5 + 0) * i4 + (i6 + 1)) * i3 + (i7 + 0))];
/*  64 */           double d4 = this.n[(((i5 + 1) * i4 + (i6 + 0)) * i3 + (i7 + 0))];
/*  65 */           double d5 = this.n[(((i5 + 1) * i4 + (i6 + 1)) * i3 + (i7 + 0))];
/*     */           
/*  67 */           double d6 = (this.n[(((i5 + 0) * i4 + (i6 + 0)) * i3 + (i7 + 1))] - d2) * d1;
/*  68 */           double d7 = (this.n[(((i5 + 0) * i4 + (i6 + 1)) * i3 + (i7 + 1))] - d3) * d1;
/*  69 */           double d8 = (this.n[(((i5 + 1) * i4 + (i6 + 0)) * i3 + (i7 + 1))] - d4) * d1;
/*  70 */           double d9 = (this.n[(((i5 + 1) * i4 + (i6 + 1)) * i3 + (i7 + 1))] - d5) * d1;
/*     */           
/*  72 */           for (int i8 = 0; i8 < 4; i8++) {
/*  73 */             double d10 = 0.125D;
/*     */             
/*  75 */             double d11 = d2;
/*  76 */             double d12 = d3;
/*  77 */             double d13 = (d4 - d2) * d10;
/*  78 */             double d14 = (d5 - d3) * d10;
/*     */             
/*  80 */             for (int i9 = 0; i9 < 8; i9++) {
/*  81 */               int i10 = i9 + i5 * 8 << 11 | 0 + i6 * 8 << 7 | i7 * 4 + i8;
/*  82 */               int i11 = 128;
/*  83 */               double d15 = 0.125D;
/*     */               
/*  85 */               double d16 = d11;
/*  86 */               double d17 = (d12 - d11) * d15;
/*  87 */               for (int i12 = 0; i12 < 8; i12++)
/*     */               {
/*  89 */                 aji localaji = null;
/*  90 */                 if (d16 > 0.0D) {
/*  91 */                   localaji = ajn.bs;
/*     */                 }
/*  93 */                 paramArrayOfaji[i10] = localaji;
/*  94 */                 i10 += i11;
/*  95 */                 d16 += d17;
/*     */               }
/*  97 */               d11 += d13;
/*  98 */               d12 += d14;
/*     */             }
/*     */             
/* 101 */             d2 += d6;
/* 102 */             d3 += d7;
/* 103 */             d4 += d8;
/* 104 */             d5 += d9;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, aji[] paramArrayOfaji, ahu[] paramArrayOfahu) {
/* 112 */     for (int i1 = 0; i1 < 16; i1++) {
/* 113 */       for (int i2 = 0; i2 < 16; i2++) {
/* 114 */         int i3 = 1;
/* 115 */         int i4 = -1;
/*     */         
/* 117 */         aji localaji1 = ajn.bs;
/* 118 */         aji localaji2 = ajn.bs;
/*     */         
/* 120 */         for (int i5 = 127; i5 >= 0; i5--) {
/* 121 */           int i6 = (i2 * 16 + i1) * 128 + i5;
/*     */           
/* 123 */           aji localaji3 = paramArrayOfaji[i6];
/* 124 */           if ((localaji3 == null) || (localaji3.o() == awt.a)) {
/* 125 */             i4 = -1;
/* 126 */           } else if (localaji3 == ajn.b) {
/* 127 */             if (i4 == -1) {
/* 128 */               if (i3 <= 0) {
/* 129 */                 localaji1 = null;
/* 130 */                 localaji2 = ajn.bs;
/*     */               }
/*     */               
/* 133 */               i4 = i3;
/* 134 */               if (i5 >= 0) paramArrayOfaji[i6] = localaji1; else
/* 135 */                 paramArrayOfaji[i6] = localaji2;
/* 136 */             } else if (i4 > 0) {
/* 137 */               i4--;
/* 138 */               paramArrayOfaji[i6] = localaji2;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public apx c(int paramInt1, int paramInt2)
/*     */   {
/* 151 */     return d(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */   public apx d(int paramInt1, int paramInt2)
/*     */   {
/* 157 */     this.i.setSeed(paramInt1 * 341873128712L + paramInt2 * 132897987541L);
/*     */     
/* 159 */     aji[] arrayOfaji = new aji[32768];
/* 160 */     this.o = this.m.v().b(this.o, paramInt1 * 16, paramInt2 * 16, 16, 16);
/*     */     
/* 162 */     a(paramInt1, paramInt2, arrayOfaji, this.o);
/* 163 */     b(paramInt1, paramInt2, arrayOfaji, this.o);
/*     */     
/* 165 */     apx localapx = new apx(this.m, arrayOfaji, paramInt1, paramInt2);
/* 166 */     byte[] arrayOfByte = localapx.m();
/*     */     
/* 168 */     for (int i1 = 0; i1 < arrayOfByte.length; i1++) {
/* 169 */       arrayOfByte[i1] = ((byte)this.o[i1].ay);
/*     */     }
/*     */     
/* 172 */     localapx.b();
/*     */     
/* 174 */     return localapx;
/*     */   }
/*     */   
/*     */ 
/*     */   private double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/* 180 */     if (paramArrayOfDouble == null) {
/* 181 */       paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6];
/*     */     }
/*     */     
/* 184 */     double d1 = 684.412D;
/* 185 */     double d2 = 684.412D;
/*     */     
/* 187 */     this.f = this.a.a(this.f, paramInt1, paramInt3, paramInt4, paramInt6, 1.121D, 1.121D, 0.5D);
/* 188 */     this.g = this.b.a(this.g, paramInt1, paramInt3, paramInt4, paramInt6, 200.0D, 200.0D, 0.5D);
/*     */     
/* 190 */     d1 *= 2.0D;
/*     */     
/* 192 */     this.c = this.l.a(this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1 / 80.0D, d2 / 160.0D, d1 / 80.0D);
/* 193 */     this.d = this.j.a(this.d, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/* 194 */     this.e = this.k.a(this.e, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, d1, d2, d1);
/*     */     
/* 196 */     int i1 = 0;
/* 197 */     int i2 = 0;
/*     */     
/* 199 */     for (int i3 = 0; i3 < paramInt4; i3++) {
/* 200 */       for (int i4 = 0; i4 < paramInt6; i4++) {
/* 201 */         double d3 = (this.f[i2] + 256.0D) / 512.0D;
/* 202 */         if (d3 > 1.0D) { d3 = 1.0D;
/*     */         }
/* 204 */         double d4 = this.g[i2] / 8000.0D;
/* 205 */         if (d4 < 0.0D) d4 = -d4 * 0.3D;
/* 206 */         d4 = d4 * 3.0D - 2.0D;
/*     */         
/* 208 */         float f1 = (i3 + paramInt1 - 0) / 1.0F;
/* 209 */         float f2 = (i4 + paramInt3 - 0) / 1.0F;
/* 210 */         float f3 = 100.0F - qh.c(f1 * f1 + f2 * f2) * 8.0F;
/* 211 */         if (f3 > 80.0F) f3 = 80.0F;
/* 212 */         if (f3 < -100.0F) f3 = -100.0F;
/* 213 */         if (d4 > 1.0D) d4 = 1.0D;
/* 214 */         d4 /= 8.0D;
/* 215 */         d4 = 0.0D;
/*     */         
/* 217 */         if (d3 < 0.0D) d3 = 0.0D;
/* 218 */         d3 += 0.5D;
/* 219 */         d4 = d4 * paramInt5 / 16.0D;
/*     */         
/* 221 */         i2++;
/*     */         
/* 223 */         double d5 = paramInt5 / 2.0D;
/*     */         
/* 225 */         for (int i5 = 0; i5 < paramInt5; i5++) {
/* 226 */           double d6 = 0.0D;
/*     */           
/* 228 */           double d7 = (i5 - d5) * 8.0D / d3;
/*     */           
/* 230 */           if (d7 < 0.0D) { d7 *= -1.0D;
/*     */           }
/* 232 */           double d8 = this.d[i1] / 512.0D;
/* 233 */           double d9 = this.e[i1] / 512.0D;
/*     */           
/* 235 */           double d10 = (this.c[i1] / 10.0D + 1.0D) / 2.0D;
/* 236 */           if (d10 < 0.0D) { d6 = d8;
/* 237 */           } else if (d10 > 1.0D) d6 = d9; else
/* 238 */             d6 = d8 + (d9 - d8) * d10;
/* 239 */           d6 -= 8.0D;
/*     */           
/* 241 */           d6 += f3;
/*     */           
/* 243 */           int i6 = 2;
/* 244 */           double d11; if (i5 > paramInt5 / 2 - i6) {
/* 245 */             d11 = (i5 - (paramInt5 / 2 - i6)) / 64.0F;
/* 246 */             if (d11 < 0.0D) d11 = 0.0D;
/* 247 */             if (d11 > 1.0D) d11 = 1.0D;
/* 248 */             d6 = d6 * (1.0D - d11) + -3000.0D * d11;
/*     */           }
/* 250 */           i6 = 8;
/* 251 */           if (i5 < i6) {
/* 252 */             d11 = (i6 - i5) / (i6 - 1.0F);
/* 253 */             d6 = d6 * (1.0D - d11) + -30.0D * d11;
/*     */           }
/*     */           
/* 256 */           paramArrayOfDouble[i1] = d6;
/* 257 */           i1++;
/*     */         }
/*     */       }
/*     */     }
/* 261 */     return paramArrayOfDouble;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/* 266 */     return true;
/*     */   }
/*     */   
/* 269 */   int[][] h = new int[32][32];
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(apu paramapu, int paramInt1, int paramInt2)
/*     */   {
/* 319 */     akx.M = true;
/* 320 */     int i1 = paramInt1 * 16;
/* 321 */     int i2 = paramInt2 * 16;
/*     */     
/* 323 */     ahu localahu = this.m.a(i1 + 16, i2 + 16);
/* 324 */     localahu.a(this.m, this.m.s, i1, i2);
/*     */     
/* 326 */     akx.M = false;
/*     */   }
/*     */   
/*     */   public boolean a(boolean paramBoolean, qk paramqk)
/*     */   {
/* 331 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void c() {}
/*     */   
/*     */ 
/*     */   public boolean d()
/*     */   {
/* 340 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e()
/*     */   {
/* 345 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public String f()
/*     */   {
/* 351 */     return "RandomLevelSource";
/*     */   }
/*     */   
/*     */   public List a(sx paramsx, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 356 */     ahu localahu = this.m.a(paramInt1, paramInt3);
/* 357 */     return localahu.a(paramsx);
/*     */   }
/*     */   
/*     */   public agt a(ahb paramahb, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 362 */     return null;
/*     */   }
/*     */   
/*     */   public int g()
/*     */   {
/* 367 */     return 0;
/*     */   }
/*     */   
/*     */   public void e(int paramInt1, int paramInt2) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ara.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */