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
/*     */ public class bke
/*     */   extends bkm
/*     */ {
/*     */   private int aB;
/*     */   private final bkn aC;
/*     */   private dq aD;
/*     */   boolean a;
/*     */   
/*     */   public bke(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, bkn parambkn, dh paramdh)
/*     */   {
/*  22 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  23 */     this.v = paramDouble4;
/*  24 */     this.w = paramDouble5;
/*  25 */     this.x = paramDouble6;
/*  26 */     this.aC = parambkn;
/*  27 */     this.g = 8;
/*     */     
/*  29 */     if (paramdh != null) {
/*  30 */       this.aD = paramdh.c("Explosions", 10);
/*  31 */       if (this.aD.c() == 0) {
/*  32 */         this.aD = null;
/*     */       } else {
/*  34 */         this.g = (this.aD.c() * 2 - 1);
/*     */         
/*     */ 
/*  37 */         for (int i = 0; i < this.aD.c(); i++) {
/*  38 */           dh localdh = this.aD.b(i);
/*  39 */           if (localdh.n("Flicker")) {
/*  40 */             this.a = true;
/*  41 */             this.g += 15;
/*  42 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void h()
/*     */   {
/*  57 */     if ((this.aB == 0) && (this.aD != null)) {
/*  58 */       boolean bool1 = j();
/*     */       
/*  60 */       int j = 0;
/*  61 */       if (this.aD.c() >= 3) {
/*  62 */         j = 1;
/*     */       } else {
/*  64 */         for (int k = 0; k < this.aD.c(); k++) {
/*  65 */           dh localdh = this.aD.b(k);
/*  66 */           if (localdh.d("Type") == 1) {
/*  67 */             j = 1;
/*  68 */             break;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  73 */       String str = "fireworks." + (j != 0 ? "largeBlast" : "blast") + (bool1 ? "_far" : "");
/*  74 */       this.o.a(this.s, this.t, this.u, str, 20.0F, 0.95F + this.Z.nextFloat() * 0.1F, true);
/*     */     }
/*     */     Object localObject;
/*  77 */     if ((this.aB % 2 == 0) && (this.aD != null) && (this.aB / 2 < this.aD.c()))
/*     */     {
/*     */ 
/*  80 */       int i = this.aB / 2;
/*  81 */       localObject = this.aD.b(i);
/*     */       
/*  83 */       int m = ((dh)localObject).d("Type");
/*  84 */       boolean bool3 = ((dh)localObject).n("Trail");
/*  85 */       boolean bool4 = ((dh)localObject).n("Flicker");
/*  86 */       int[] arrayOfInt1 = ((dh)localObject).l("Colors");
/*  87 */       int[] arrayOfInt2 = ((dh)localObject).l("FadeColors");
/*     */       
/*  89 */       if (m == 1)
/*     */       {
/*  91 */         a(0.5D, 4, arrayOfInt1, arrayOfInt2, bool3, bool4);
/*  92 */       } else if (m == 2)
/*     */       {
/*  94 */         a(0.5D, new double[][] { { 0.0D, 1.0D }, { 0.3455D, 0.309D }, { 0.9511D, 0.309D }, { 0.3795918367346939D, -0.12653061224489795D }, { 0.6122448979591837D, -0.8040816326530612D }, { 0.0D, -0.35918367346938773D } }, arrayOfInt1, arrayOfInt2, bool3, bool4, false);
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
/*     */       }
/* 109 */       else if (m == 3)
/*     */       {
/* 111 */         a(0.5D, new double[][] { { 0.0D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.6D }, { 0.6D, 0.6D }, { 0.6D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.0D }, { 0.4D, 0.0D }, { 0.4D, -0.6D }, { 0.2D, -0.6D }, { 0.2D, -0.4D }, { 0.0D, -0.4D } }, arrayOfInt1, arrayOfInt2, bool3, bool4, true);
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
/*     */       }
/* 138 */       else if (m == 4) {
/* 139 */         a(arrayOfInt1, arrayOfInt2, bool3, bool4);
/*     */       }
/*     */       else {
/* 142 */         a(0.25D, 2, arrayOfInt1, arrayOfInt2, bool3, bool4);
/*     */       }
/*     */       
/* 145 */       int n = arrayOfInt1[0];
/* 146 */       float f1 = ((n & 0xFF0000) >> 16) / 255.0F;
/* 147 */       float f2 = ((n & 0xFF00) >> 8) / 255.0F;
/* 148 */       float f3 = ((n & 0xFF) >> 0) / 255.0F;
/* 149 */       bkc localbkc = new bkc(this.o, this.s, this.t, this.u);
/* 150 */       localbkc.b(f1, f2, f3);
/* 151 */       this.aC.a(localbkc);
/*     */     }
/*     */     
/* 154 */     this.aB += 1;
/* 155 */     if (this.aB > this.g) {
/* 156 */       if (this.a) {
/* 157 */         boolean bool2 = j();
/* 158 */         localObject = "fireworks." + (bool2 ? "twinkle_far" : "twinkle");
/* 159 */         this.o.a(this.s, this.t, this.u, (String)localObject, 20.0F, 0.9F + this.Z.nextFloat() * 0.15F, true);
/*     */       }
/*     */       
/* 162 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean j() {
/* 167 */     bao localbao = bao.B();
/* 168 */     if ((localbao != null) && (localbao.i != null) && 
/* 169 */       (localbao.i.e(this.s, this.t, this.u) < 256.0D)) {
/* 170 */       return false;
/*     */     }
/*     */     
/* 173 */     return true;
/*     */   }
/*     */   
/*     */   private void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2) {
/* 177 */     bkd localbkd = new bkd(this.o, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, this.aC);
/* 178 */     localbkd.a(paramBoolean1);
/* 179 */     localbkd.f(paramBoolean2);
/*     */     
/* 181 */     int i = this.Z.nextInt(paramArrayOfInt1.length);
/* 182 */     localbkd.a(paramArrayOfInt1[i]);
/* 183 */     if ((paramArrayOfInt2 != null) && (paramArrayOfInt2.length > 0)) {
/* 184 */       localbkd.c(paramArrayOfInt2[this.Z.nextInt(paramArrayOfInt2.length)]);
/*     */     }
/* 186 */     this.aC.a(localbkd);
/*     */   }
/*     */   
/*     */   private void a(double paramDouble, int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/* 191 */     double d1 = this.s;
/* 192 */     double d2 = this.t;
/* 193 */     double d3 = this.u;
/*     */     
/* 195 */     for (int i = -paramInt; i <= paramInt; i++) {
/* 196 */       for (int j = -paramInt; j <= paramInt; j++) {
/* 197 */         for (int k = -paramInt; k <= paramInt; k++) {
/* 198 */           double d4 = j + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5D;
/* 199 */           double d5 = i + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5D;
/* 200 */           double d6 = k + (this.Z.nextDouble() - this.Z.nextDouble()) * 0.5D;
/* 201 */           double d7 = qh.a(d4 * d4 + d5 * d5 + d6 * d6) / paramDouble + this.Z.nextGaussian() * 0.05D;
/*     */           
/* 203 */           a(d1, d2, d3, d4 / d7, d5 / d7, d6 / d7, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/*     */           
/* 205 */           if ((i != -paramInt) && (i != paramInt) && (j != -paramInt) && (j != paramInt)) {
/* 206 */             k += paramInt * 2 - 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(double paramDouble, double[][] paramArrayOfDouble, int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*     */   {
/* 215 */     double d1 = paramArrayOfDouble[0][0];
/* 216 */     double d2 = paramArrayOfDouble[0][1];
/*     */     
/*     */ 
/* 219 */     a(this.s, this.t, this.u, d1 * paramDouble, d2 * paramDouble, 0.0D, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/*     */     
/*     */ 
/* 222 */     float f = this.Z.nextFloat() * 3.1415927F;
/* 223 */     double d3 = paramBoolean3 ? 0.034D : 0.34D;
/* 224 */     for (int i = 0; i < 3; i++) {
/* 225 */       double d4 = f + i * 3.1415927F * d3;
/*     */       
/* 227 */       double d5 = d1;
/* 228 */       double d6 = d2;
/*     */       
/* 230 */       for (int j = 1; j < paramArrayOfDouble.length; j++)
/*     */       {
/* 232 */         double d7 = paramArrayOfDouble[j][0];
/* 233 */         double d8 = paramArrayOfDouble[j][1];
/*     */         
/* 235 */         for (double d9 = 0.25D; d9 <= 1.0D; d9 += 0.25D)
/*     */         {
/* 237 */           double d10 = (d5 + (d7 - d5) * d9) * paramDouble;
/* 238 */           double d11 = (d6 + (d8 - d6) * d9) * paramDouble;
/*     */           
/* 240 */           double d12 = d10 * Math.sin(d4);
/* 241 */           d10 *= Math.cos(d4);
/*     */           
/* 243 */           for (double d13 = -1.0D; d13 <= 1.0D; d13 += 2.0D) {
/* 244 */             a(this.s, this.t, this.u, d10 * d13, d11, d12 * d13, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/*     */           }
/*     */         }
/* 247 */         d5 = d7;
/* 248 */         d6 = d8;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, boolean paramBoolean1, boolean paramBoolean2)
/*     */   {
/* 257 */     double d1 = this.Z.nextGaussian() * 0.05D;
/* 258 */     double d2 = this.Z.nextGaussian() * 0.05D;
/*     */     
/* 260 */     for (int i = 0; i < 70; i++)
/*     */     {
/* 262 */       double d3 = this.v * 0.5D + this.Z.nextGaussian() * 0.15D + d1;
/* 263 */       double d4 = this.x * 0.5D + this.Z.nextGaussian() * 0.15D + d2;
/* 264 */       double d5 = this.w * 0.5D + this.Z.nextDouble() * 0.5D;
/*     */       
/* 266 */       a(this.s, this.t, this.u, d3, d5, d4, paramArrayOfInt1, paramArrayOfInt2, paramBoolean1, paramBoolean2);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public int a()
/*     */   {
/* 274 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */