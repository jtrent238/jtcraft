/*     */ import java.util.ArrayList;
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
/*     */ public class aib
/*     */ {
/*     */   private axn c;
/*     */   private axn d;
/*  19 */   private ahy e = new ahy(this);
/*     */   
/*     */   private List f;
/*     */   
/*     */   protected aib()
/*     */   {
/*  25 */     this.f = new ArrayList();
/*  26 */     this.f.add(ahu.s);
/*  27 */     this.f.add(ahu.p);
/*  28 */     this.f.add(ahu.t);
/*  29 */     this.f.add(ahu.H);
/*  30 */     this.f.add(ahu.G);
/*  31 */     this.f.add(ahu.J);
/*  32 */     this.f.add(ahu.K);
/*     */   }
/*     */   
/*     */   public aib(long paramLong, ahm paramahm) {
/*  36 */     this();
/*     */     
/*  38 */     axn[] arrayOfaxn = axn.a(paramLong, paramahm);
/*  39 */     this.c = arrayOfaxn[0];
/*  40 */     this.d = arrayOfaxn[1];
/*     */   }
/*     */   
/*     */   public aib(ahb paramahb) {
/*  44 */     this(paramahb.H(), paramahb.N().u());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List a()
/*     */   {
/*  53 */     return this.f;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public ahu a(int paramInt1, int paramInt2)
/*     */   {
/*  61 */     return this.e.b(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public float[] a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*     */     
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  75 */     if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < paramInt3 * paramInt4)) {
/*  76 */       paramArrayOfFloat = new float[paramInt3 * paramInt4];
/*     */     }
/*     */     
/*  79 */     int[] arrayOfInt = this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*  80 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/*     */       try {
/*  82 */         float f1 = ahu.d(arrayOfInt[i]).h() / 65536.0F;
/*  83 */         if (f1 > 1.0F) f1 = 1.0F;
/*  84 */         paramArrayOfFloat[i] = f1;
/*     */       } catch (Throwable localThrowable) {
/*  86 */         b localb = b.a(localThrowable, "Invalid Biome id");
/*  87 */         k localk = localb.a("DownfallBlock");
/*  88 */         localk.a("biome id", Integer.valueOf(i));
/*  89 */         localk.a("downfalls[] size", Integer.valueOf(paramArrayOfFloat.length));
/*  90 */         localk.a("x", Integer.valueOf(paramInt1));
/*  91 */         localk.a("z", Integer.valueOf(paramInt2));
/*  92 */         localk.a("w", Integer.valueOf(paramInt3));
/*  93 */         localk.a("h", Integer.valueOf(paramInt4));
/*     */         
/*  95 */         throw new s(localb);
/*     */       }
/*     */     }
/*     */     
/*  99 */     return paramArrayOfFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public float a(float paramFloat, int paramInt)
/*     */   {
/* 107 */     return paramFloat;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public ahu[] a(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*     */     
/*     */     
/*     */ 
/* 117 */     if ((paramArrayOfahu == null) || (paramArrayOfahu.length < paramInt3 * paramInt4)) {
/* 118 */       paramArrayOfahu = new ahu[paramInt3 * paramInt4];
/*     */     }
/*     */     
/* 121 */     int[] arrayOfInt = this.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*     */     try {
/* 123 */       for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 124 */         paramArrayOfahu[i] = ahu.d(arrayOfInt[i]);
/*     */       }
/*     */     } catch (Throwable localThrowable) {
/* 127 */       b localb = b.a(localThrowable, "Invalid Biome id");
/* 128 */       k localk = localb.a("RawBiomeBlock");
/* 129 */       localk.a("biomes[] size", Integer.valueOf(paramArrayOfahu.length));
/* 130 */       localk.a("x", Integer.valueOf(paramInt1));
/* 131 */       localk.a("z", Integer.valueOf(paramInt2));
/* 132 */       localk.a("w", Integer.valueOf(paramInt3));
/* 133 */       localk.a("h", Integer.valueOf(paramInt4));
/*     */       
/* 135 */       throw new s(localb);
/*     */     }
/*     */     
/* 138 */     return paramArrayOfahu;
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
/*     */   public ahu[] b(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 151 */     return a(paramArrayOfahu, paramInt1, paramInt2, paramInt3, paramInt4, true);
/*     */   }
/*     */   
/*     */   public ahu[] a(ahu[] paramArrayOfahu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*     */     
/* 156 */     if ((paramArrayOfahu == null) || (paramArrayOfahu.length < paramInt3 * paramInt4)) {
/* 157 */       paramArrayOfahu = new ahu[paramInt3 * paramInt4];
/*     */     }
/*     */     
/* 160 */     if ((paramBoolean) && (paramInt3 == 16) && (paramInt4 == 16) && ((paramInt1 & 0xF) == 0) && ((paramInt2 & 0xF) == 0)) {
/* 161 */       localObject = this.e.d(paramInt1, paramInt2);
/* 162 */       System.arraycopy(localObject, 0, paramArrayOfahu, 0, paramInt3 * paramInt4);
/* 163 */       return paramArrayOfahu;
/*     */     }
/*     */     
/* 166 */     Object localObject = this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 167 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 168 */       paramArrayOfahu[i] = ahu.d(localObject[i]);
/*     */     }
/*     */     
/* 171 */     return paramArrayOfahu;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3, List paramList)
/*     */   {
/* 182 */     axl.a();
/* 183 */     int i = paramInt1 - paramInt3 >> 2;
/* 184 */     int j = paramInt2 - paramInt3 >> 2;
/* 185 */     int k = paramInt1 + paramInt3 >> 2;
/* 186 */     int m = paramInt2 + paramInt3 >> 2;
/*     */     
/* 188 */     int n = k - i + 1;
/* 189 */     int i1 = m - j + 1;
/*     */     
/* 191 */     int[] arrayOfInt = this.c.a(i, j, n, i1);
/*     */     try {
/* 193 */       for (int i2 = 0; i2 < n * i1; i2++) {
/* 194 */         localObject = ahu.d(arrayOfInt[i2]);
/* 195 */         if (!paramList.contains(localObject)) return false;
/*     */       }
/*     */     } catch (Throwable localThrowable) {
/* 198 */       Object localObject = b.a(localThrowable, "Invalid Biome id");
/* 199 */       k localk = ((b)localObject).a("Layer");
/* 200 */       localk.a("Layer", this.c.toString());
/* 201 */       localk.a("x", Integer.valueOf(paramInt1));
/* 202 */       localk.a("z", Integer.valueOf(paramInt2));
/* 203 */       localk.a("radius", Integer.valueOf(paramInt3));
/* 204 */       localk.a("allowed", paramList);
/*     */       
/* 206 */       throw new s((b)localObject);
/*     */     }
/*     */     
/* 209 */     return true;
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
/*     */   public agt a(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom)
/*     */   {
/* 275 */     axl.a();
/* 276 */     int i = paramInt1 - paramInt3 >> 2;
/* 277 */     int j = paramInt2 - paramInt3 >> 2;
/* 278 */     int k = paramInt1 + paramInt3 >> 2;
/* 279 */     int m = paramInt2 + paramInt3 >> 2;
/*     */     
/* 281 */     int n = k - i + 1;
/* 282 */     int i1 = m - j + 1;
/* 283 */     int[] arrayOfInt = this.c.a(i, j, n, i1);
/* 284 */     agt localagt = null;
/* 285 */     int i2 = 0;
/* 286 */     for (int i3 = 0; i3 < n * i1; i3++) {
/* 287 */       int i4 = i + i3 % n << 2;
/* 288 */       int i5 = j + i3 / n << 2;
/* 289 */       ahu localahu = ahu.d(arrayOfInt[i3]);
/* 290 */       if ((paramList.contains(localahu)) && (
/* 291 */         (localagt == null) || (paramRandom.nextInt(i2 + 1) == 0))) {
/* 292 */         localagt = new agt(i4, 0, i5);
/* 293 */         i2++;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 298 */     return localagt;
/*     */   }
/*     */   
/*     */   public void b() {
/* 302 */     this.e.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */