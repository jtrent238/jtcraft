/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ail
/*     */   extends ahu
/*     */ {
/*     */   private byte[] aC;
/*     */   private long aD;
/*     */   private awl aE;
/*     */   private awl aF;
/*     */   private awl aG;
/*     */   private boolean aH;
/*     */   private boolean aI;
/*     */   
/*     */   public ail(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/*  24 */     super(paramInt);
/*  25 */     this.aH = paramBoolean1;
/*  26 */     this.aI = paramBoolean2;
/*     */     
/*  28 */     b();
/*  29 */     a(2.0F, 0.0F);
/*     */     
/*     */ 
/*  32 */     this.at.clear();
/*  33 */     this.ai = ajn.m;
/*  34 */     this.aj = 1;
/*  35 */     this.ak = ajn.ce;
/*     */     
/*  37 */     this.ar.x = 64537;
/*  38 */     this.ar.A = 20;
/*  39 */     this.ar.C = 3;
/*  40 */     this.ar.D = 5;
/*  41 */     this.ar.y = 0;
/*     */     
/*  43 */     this.at.clear();
/*     */     
/*  45 */     if (paramBoolean2) {
/*  46 */       this.ar.x = 5;
/*     */     }
/*     */   }
/*     */   
/*     */   public arc a(Random paramRandom)
/*     */   {
/*  52 */     return this.az;
/*     */   }
/*     */   
/*     */   public int c(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  57 */     return 10387789;
/*     */   }
/*     */   
/*     */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  62 */     return 9470285;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/*  67 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*     */   {
/*  73 */     if ((this.aC == null) || (this.aD != paramahb.H())) {
/*  74 */       a(paramahb.H());
/*     */     }
/*  76 */     if ((this.aE == null) || (this.aF == null) || (this.aD != paramahb.H())) {
/*  77 */       Random localRandom = new Random(this.aD);
/*  78 */       this.aE = new awl(localRandom, 4);
/*  79 */       this.aF = new awl(localRandom, 1);
/*     */     }
/*  81 */     this.aD = paramahb.H();
/*     */     
/*     */ 
/*  84 */     double d1 = 0.0D;
/*  85 */     if (this.aH) {
/*  86 */       i = (paramInt1 & 0xFFFFFFF0) + (paramInt2 & 0xF);
/*  87 */       j = (paramInt2 & 0xFFFFFFF0) + (paramInt1 & 0xF);
/*     */       
/*  89 */       double d2 = Math.min(Math.abs(paramDouble), this.aE.a(i * 0.25D, j * 0.25D));
/*  90 */       if (d2 > 0.0D) {
/*  91 */         double d3 = 0.001953125D;
/*  92 */         double d4 = Math.abs(this.aF.a(i * d3, j * d3));
/*  93 */         d1 = d2 * d2 * 2.5D;
/*  94 */         double d5 = Math.ceil(d4 * 50.0D) + 14.0D;
/*  95 */         if (d1 > d5) {
/*  96 */           d1 = d5;
/*     */         }
/*  98 */         d1 += 64.0D;
/*     */       }
/*     */     }
/*     */     
/* 102 */     int i = paramInt1 & 0xF;
/* 103 */     int j = paramInt2 & 0xF;
/*     */     
/* 105 */     int k = 63;
/*     */     
/* 107 */     aji localaji1 = ajn.ce;
/* 108 */     aji localaji2 = this.ak;
/*     */     
/* 110 */     int m = (int)(paramDouble / 3.0D + 3.0D + paramRandom.nextDouble() * 0.25D);
/* 111 */     int n = Math.cos(paramDouble / 3.0D * 3.141592653589793D) > 0.0D ? 1 : 0;
/* 112 */     int i1 = -1;
/* 113 */     int i2 = 0;
/*     */     
/* 115 */     int i3 = paramArrayOfaji.length / 256;
/* 116 */     for (int i4 = 255; i4 >= 0; i4--) {
/* 117 */       int i5 = (j * 16 + i) * i3 + i4;
/*     */       
/* 119 */       if (((paramArrayOfaji[i5] == null) || (paramArrayOfaji[i5].o() == awt.a)) && (i4 < (int)d1)) {
/* 120 */         paramArrayOfaji[i5] = ajn.b;
/*     */       }
/*     */       
/* 123 */       if (i4 <= 0 + paramRandom.nextInt(5)) {
/* 124 */         paramArrayOfaji[i5] = ajn.h;
/*     */       } else {
/* 126 */         aji localaji3 = paramArrayOfaji[i5];
/*     */         
/* 128 */         if ((localaji3 == null) || (localaji3.o() == awt.a)) {
/* 129 */           i1 = -1;
/* 130 */         } else if (localaji3 == ajn.b) { int i6;
/* 131 */           if (i1 == -1) {
/* 132 */             i2 = 0;
/* 133 */             if (m <= 0) {
/* 134 */               localaji1 = null;
/* 135 */               localaji2 = ajn.b;
/* 136 */             } else if ((i4 >= 59) && (i4 <= 64)) {
/* 137 */               localaji1 = ajn.ce;
/* 138 */               localaji2 = this.ak;
/*     */             }
/*     */             
/* 141 */             if ((i4 < 63) && ((localaji1 == null) || (localaji1.o() == awt.a))) {
/* 142 */               localaji1 = ajn.j;
/*     */             }
/*     */             
/* 145 */             i1 = m + Math.max(0, i4 - 63);
/* 146 */             if (i4 >= 62) {
/* 147 */               if ((this.aI) && (i4 > 86 + m * 2)) {
/* 148 */                 if (n != 0) {
/* 149 */                   paramArrayOfaji[i5] = ajn.d;
/* 150 */                   paramArrayOfByte[i5] = 1;
/*     */                 } else {
/* 152 */                   paramArrayOfaji[i5] = ajn.c;
/*     */                 }
/* 154 */               } else if (i4 > 66 + m) {
/* 155 */                 i6 = 16;
/* 156 */                 if ((i4 < 64) || (i4 > 127)) {
/* 157 */                   i6 = 1;
/* 158 */                 } else if (n == 0)
/*     */                 {
/* 160 */                   i6 = d(paramInt1, i4, paramInt2);
/*     */                 }
/* 162 */                 if (i6 < 16) {
/* 163 */                   paramArrayOfaji[i5] = ajn.ce;
/* 164 */                   paramArrayOfByte[i5] = ((byte)i6);
/*     */                 } else {
/* 166 */                   paramArrayOfaji[i5] = ajn.ch;
/*     */                 }
/*     */               } else {
/* 169 */                 paramArrayOfaji[i5] = this.ai;
/* 170 */                 paramArrayOfByte[i5] = ((byte)this.aj);
/* 171 */                 i2 = 1;
/*     */               }
/*     */             } else {
/* 174 */               paramArrayOfaji[i5] = localaji2;
/* 175 */               if (localaji2 == ajn.ce) {
/* 176 */                 paramArrayOfByte[i5] = 1;
/*     */               }
/*     */             }
/* 179 */           } else if (i1 > 0) {
/* 180 */             i1--;
/*     */             
/* 182 */             if (i2 != 0) {
/* 183 */               paramArrayOfaji[i5] = ajn.ce;
/* 184 */               paramArrayOfByte[i5] = 1;
/*     */             } else {
/* 186 */               i6 = d(paramInt1, i4, paramInt2);
/* 187 */               if (i6 < 16) {
/* 188 */                 paramArrayOfaji[i5] = ajn.ce;
/* 189 */                 paramArrayOfByte[i5] = i6;
/*     */               } else {
/* 191 */                 paramArrayOfaji[i5] = ajn.ch;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(long paramLong) {
/* 201 */     this.aC = new byte[64];
/* 202 */     Arrays.fill(this.aC, (byte)16);
/*     */     
/* 204 */     Random localRandom = new Random(paramLong);
/* 205 */     this.aG = new awl(localRandom, 1);
/*     */     
/* 207 */     for (int i = 0; i < 64; i++) {
/* 208 */       i += localRandom.nextInt(5) + 1;
/* 209 */       if (i < 64) {
/* 210 */         this.aC[i] = 1;
/*     */       }
/*     */     }
/*     */     
/* 214 */     i = localRandom.nextInt(4) + 2;
/* 215 */     for (int j = 0; j < i; j++) {
/* 216 */       k = localRandom.nextInt(3) + 1;
/* 217 */       m = localRandom.nextInt(64);
/*     */       
/* 219 */       for (n = 0; (m + n < 64) && (n < k); n++) {
/* 220 */         this.aC[(m + n)] = 4;
/*     */       }
/*     */     }
/* 223 */     j = localRandom.nextInt(4) + 2;
/* 224 */     for (int k = 0; k < j; k++) {
/* 225 */       m = localRandom.nextInt(3) + 2;
/* 226 */       n = localRandom.nextInt(64);
/*     */       
/* 228 */       for (i1 = 0; (n + i1 < 64) && (i1 < m); i1++) {
/* 229 */         this.aC[(n + i1)] = 12;
/*     */       }
/*     */     }
/* 232 */     k = localRandom.nextInt(4) + 2;
/* 233 */     int i2; for (int m = 0; m < k; m++) {
/* 234 */       n = localRandom.nextInt(3) + 1;
/* 235 */       i1 = localRandom.nextInt(64);
/*     */       
/* 237 */       for (i2 = 0; (i1 + i2 < 64) && (i2 < n); i2++) {
/* 238 */         this.aC[(i1 + i2)] = 14;
/*     */       }
/*     */     }
/* 241 */     m = localRandom.nextInt(3) + 3;
/* 242 */     int n = 0;
/* 243 */     for (int i1 = 0; i1 < m; i1++) {
/* 244 */       i2 = 1;
/* 245 */       n += localRandom.nextInt(16) + 4;
/*     */       
/* 247 */       for (int i3 = 0; (n + i3 < 64) && (i3 < i2); i3++) {
/* 248 */         this.aC[(n + i3)] = 0;
/* 249 */         if ((n + i3 > 1) && (localRandom.nextBoolean())) {
/* 250 */           this.aC[(n + i3 - 1)] = 8;
/*     */         }
/* 252 */         if ((n + i3 < 63) && (localRandom.nextBoolean())) {
/* 253 */           this.aC[(n + i3 + 1)] = 8;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private byte d(int paramInt1, int paramInt2, int paramInt3) {
/* 260 */     int i = (int)Math.round(this.aG.a(paramInt1 * 1.0D / 512.0D, paramInt1 * 1.0D / 512.0D) * 2.0D);
/* 261 */     return this.aC[((paramInt2 + i + 64) % 64)];
/*     */   }
/*     */   
/*     */   protected ahu k()
/*     */   {
/* 266 */     boolean bool = this.ay == ahu.Z.ay;
/*     */     
/* 268 */     ail localail = new ail(this.ay + 128, bool, this.aI);
/*     */     
/* 270 */     if (!bool) {
/* 271 */       localail.a(g);
/* 272 */       localail.a(this.af + " M");
/*     */     } else {
/* 274 */       localail.a(this.af + " (Bryce)");
/*     */     }
/* 276 */     localail.a(this.ag, true);
/*     */     
/* 278 */     return localail;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */