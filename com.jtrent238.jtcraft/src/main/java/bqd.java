/*     */ import com.google.common.collect.Lists;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bqd
/*     */   implements rf
/*     */ {
/*     */   private final String i;
/*  20 */   protected List a = Lists.newArrayList();
/*     */   
/*     */   private bsa j;
/*     */   
/*     */   protected boolean b;
/*     */   private boolean k;
/*     */   protected int c;
/*     */   protected int d;
/*     */   protected int e;
/*     */   protected int f;
/*     */   private float l;
/*     */   private float m;
/*     */   private float n;
/*     */   private float o;
/*     */   protected int g;
/*     */   protected int h;
/*     */   
/*     */   protected bqd(String paramString)
/*     */   {
/*  39 */     this.i = paramString;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*  43 */     this.c = paramInt3;
/*  44 */     this.d = paramInt4;
/*  45 */     this.b = paramBoolean;
/*     */     
/*  47 */     float f1 = (float)(0.009999999776482582D / paramInt1);
/*  48 */     float f2 = (float)(0.009999999776482582D / paramInt2);
/*     */     
/*  50 */     this.l = (paramInt3 / (float)paramInt1 + f1);
/*  51 */     this.m = ((paramInt3 + this.e) / (float)paramInt1 - f1);
/*  52 */     this.n = (paramInt4 / paramInt2 + f2);
/*  53 */     this.o = ((paramInt4 + this.f) / paramInt2 - f2);
/*     */     
/*     */ 
/*  56 */     if (this.k) {
/*  57 */       float f3 = 8.0F / paramInt1;
/*  58 */       float f4 = 8.0F / paramInt2;
/*     */       
/*  60 */       this.l += f3;
/*  61 */       this.m -= f3;
/*  62 */       this.n += f4;
/*  63 */       this.o -= f4;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bqd parambqd) {
/*  68 */     this.c = parambqd.c;
/*  69 */     this.d = parambqd.d;
/*     */     
/*  71 */     this.e = parambqd.e;
/*  72 */     this.f = parambqd.f;
/*     */     
/*  74 */     this.b = parambqd.b;
/*     */     
/*  76 */     this.l = parambqd.l;
/*  77 */     this.m = parambqd.m;
/*  78 */     this.n = parambqd.n;
/*  79 */     this.o = parambqd.o;
/*     */   }
/*     */   
/*     */   public int h() {
/*  83 */     return this.c;
/*     */   }
/*     */   
/*     */   public int i() {
/*  87 */     return this.d;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  92 */     return this.e;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  97 */     return this.f;
/*     */   }
/*     */   
/*     */   public float c()
/*     */   {
/* 102 */     return this.l;
/*     */   }
/*     */   
/*     */   public float d()
/*     */   {
/* 107 */     return this.m;
/*     */   }
/*     */   
/*     */   public float a(double paramDouble)
/*     */   {
/* 112 */     float f1 = this.m - this.l;
/* 113 */     return this.l + f1 * (float)paramDouble / 16.0F;
/*     */   }
/*     */   
/*     */   public float e()
/*     */   {
/* 118 */     return this.n;
/*     */   }
/*     */   
/*     */   public float f()
/*     */   {
/* 123 */     return this.o;
/*     */   }
/*     */   
/*     */   public float b(double paramDouble)
/*     */   {
/* 128 */     float f1 = this.o - this.n;
/* 129 */     return this.n + f1 * ((float)paramDouble / 16.0F);
/*     */   }
/*     */   
/*     */   public String g()
/*     */   {
/* 134 */     return this.i;
/*     */   }
/*     */   
/*     */   public void j() {
/* 138 */     this.h += 1;
/* 139 */     if (this.h >= this.j.a(this.g)) {
/* 140 */       int i1 = this.j.c(this.g);
/* 141 */       int i2 = this.j.c() == 0 ? this.a.size() : this.j.c();
/* 142 */       this.g = ((this.g + 1) % i2);
/* 143 */       this.h = 0;
/*     */       
/* 145 */       int i3 = this.j.c(this.g);
/* 146 */       if ((i1 != i3) && (i3 >= 0) && (i3 < this.a.size())) {
/* 147 */         bqi.a((int[][])this.a.get(i3), this.e, this.f, this.c, this.d, false, false);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public int[][] a(int paramInt) {
/* 153 */     return (int[][])this.a.get(paramInt);
/*     */   }
/*     */   
/*     */   public int k() {
/* 157 */     return this.a.size();
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 161 */     this.e = paramInt;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 165 */     this.f = paramInt;
/*     */   }
/*     */   
/*     */   public void a(BufferedImage[] paramArrayOfBufferedImage, bsa parambsa, boolean paramBoolean) {
/* 169 */     n();
/*     */     
/* 171 */     this.k = paramBoolean;
/*     */     
/* 173 */     BufferedImage localBufferedImage1 = paramArrayOfBufferedImage[0].getWidth();
/* 174 */     int i1 = paramArrayOfBufferedImage[0].getHeight();
/*     */     
/* 176 */     this.e = localBufferedImage1;
/* 177 */     this.f = i1;
/*     */     
/* 179 */     if (paramBoolean) {
/* 180 */       this.e += 16;
/* 181 */       this.f += 16;
/*     */     }
/*     */     
/*     */ 
/* 185 */     int[][] arrayOfInt = new int[paramArrayOfBufferedImage.length][];
/* 186 */     BufferedImage localBufferedImage2; for (int i2 = 0; i2 < paramArrayOfBufferedImage.length; i2++) {
/* 187 */       localBufferedImage2 = paramArrayOfBufferedImage[i2];
/*     */       
/*     */ 
/* 190 */       if (localBufferedImage2 != null)
/*     */       {
/* 192 */         if ((i2 > 0) && ((localBufferedImage2.getWidth() != localBufferedImage1 >> i2) || (localBufferedImage2.getHeight() != i1 >> i2))) {
/* 193 */           throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", new Object[] { Integer.valueOf(i2), Integer.valueOf(localBufferedImage2.getWidth()), Integer.valueOf(localBufferedImage2.getHeight()), Integer.valueOf(localBufferedImage1 >> i2), Integer.valueOf(i1 >> i2) }));
/*     */         }
/*     */         
/* 196 */         arrayOfInt[i2] = new int[localBufferedImage2.getWidth() * localBufferedImage2.getHeight()];
/* 197 */         localBufferedImage2.getRGB(0, 0, localBufferedImage2.getWidth(), localBufferedImage2.getHeight(), arrayOfInt[i2], 0, localBufferedImage2.getWidth());
/*     */       }
/*     */     }
/* 200 */     if (parambsa == null) {
/* 201 */       if (i1 != localBufferedImage1) {
/* 202 */         throw new RuntimeException("broken aspect ratio and not an animation");
/*     */       }
/*     */       
/* 205 */       a(arrayOfInt);
/* 206 */       this.a.add(a(arrayOfInt, localBufferedImage1, i1));
/*     */     } else {
/* 208 */       i2 = i1 / localBufferedImage1;
/* 209 */       localBufferedImage2 = localBufferedImage1;
/* 210 */       int i3 = localBufferedImage1;
/* 211 */       this.f = this.e;
/*     */       Object localObject;
/* 213 */       int i4; if (parambsa.c() > 0)
/*     */       {
/* 215 */         for (localObject = parambsa.e().iterator(); ((Iterator)localObject).hasNext();) { i4 = ((Integer)((Iterator)localObject).next()).intValue();
/* 216 */           if (i4 >= i2) {
/* 217 */             throw new RuntimeException("invalid frameindex " + i4);
/*     */           }
/* 219 */           e(i4);
/* 220 */           this.a.set(i4, a(a(arrayOfInt, localBufferedImage2, i3, i4), localBufferedImage2, i3));
/*     */         }
/* 222 */         this.j = parambsa;
/*     */       }
/*     */       else {
/* 225 */         localObject = Lists.newArrayList();
/*     */         
/* 227 */         for (i4 = 0; i4 < i2; i4++) {
/* 228 */           this.a.add(a(a(arrayOfInt, localBufferedImage2, i3, i4), localBufferedImage2, i3));
/*     */           
/* 230 */           ((List)localObject).add(new brz(i4, -1));
/*     */         }
/*     */         
/* 233 */         this.j = new bsa((List)localObject, this.e, this.f, parambsa.d());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(int paramInt) {
/* 239 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/* 241 */     for (int i1 = 0; i1 < this.a.size(); i1++) {
/* 242 */       int[][] arrayOfInt = (int[][])this.a.get(i1);
/*     */       
/* 244 */       if (arrayOfInt != null) {
/*     */         try
/*     */         {
/* 247 */           localArrayList.add(bqi.a(paramInt, this.e, arrayOfInt));
/*     */         } catch (Throwable localThrowable) {
/* 249 */           b localb = b.a(localThrowable, "Generating mipmaps for frame");
/* 250 */           k localk = localb.a("Frame being iterated");
/*     */           
/* 252 */           localk.a("Frame index", Integer.valueOf(i1));
/* 253 */           localk.a("Frame sizes", new bqe(this, arrayOfInt));
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
/* 267 */           throw new s(localb);
/*     */         }
/*     */       }
/*     */     }
/* 271 */     a(localArrayList);
/*     */   }
/*     */   
/*     */   private void a(int[][] paramArrayOfInt)
/*     */   {
/* 276 */     int[] arrayOfInt = paramArrayOfInt[0];
/*     */     
/* 278 */     int i1 = 0;
/* 279 */     int i2 = 0;
/* 280 */     int i3 = 0;
/* 281 */     int i4 = 0;
/* 282 */     for (int i5 = 0; i5 < arrayOfInt.length; i5++) {
/* 283 */       if ((arrayOfInt[i5] & 0xFF000000) != 0) {
/* 284 */         i2 += (arrayOfInt[i5] >> 16 & 0xFF);
/* 285 */         i3 += (arrayOfInt[i5] >> 8 & 0xFF);
/* 286 */         i4 += (arrayOfInt[i5] >> 0 & 0xFF);
/* 287 */         i1++;
/*     */       }
/*     */     }
/* 290 */     if (i1 == 0) {
/* 291 */       return;
/*     */     }
/* 293 */     i2 /= i1;
/* 294 */     i3 /= i1;
/* 295 */     i4 /= i1;
/* 296 */     for (i5 = 0; i5 < arrayOfInt.length; i5++) {
/* 297 */       if ((arrayOfInt[i5] & 0xFF000000) == 0) {
/* 298 */         arrayOfInt[i5] = (i2 << 16 | i3 << 8 | i4);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int[][] a(int[][] paramArrayOfInt, int paramInt1, int paramInt2) {
/* 304 */     if (!this.k) { return paramArrayOfInt;
/*     */     }
/* 306 */     int[][] arrayOfInt = new int[paramArrayOfInt.length][];
/*     */     
/* 308 */     for (int i1 = 0; i1 < paramArrayOfInt.length; i1++) {
/* 309 */       int[] arrayOfInt1 = paramArrayOfInt[i1];
/*     */       
/*     */ 
/* 312 */       if (arrayOfInt1 != null)
/*     */       {
/* 314 */         int[] arrayOfInt2 = new int[(paramInt1 + 16 >> i1) * (paramInt2 + 16 >> i1)];
/* 315 */         System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
/* 316 */         arrayOfInt[i1] = bqi.a(arrayOfInt2, paramInt1 >> i1, paramInt2 >> i1, 8 >> i1);
/*     */       }
/*     */     }
/* 319 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   private void e(int paramInt) {
/* 323 */     if (this.a.size() > paramInt) {
/* 324 */       return;
/*     */     }
/*     */     
/* 327 */     for (int i1 = this.a.size(); i1 <= paramInt; i1++) {
/* 328 */       this.a.add(null);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int[][] a(int[][] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3) {
/* 333 */     int[][] arrayOfInt = new int[paramArrayOfInt.length][];
/*     */     
/* 335 */     for (int i1 = 0; i1 < paramArrayOfInt.length; i1++) {
/* 336 */       int[] arrayOfInt1 = paramArrayOfInt[i1];
/*     */       
/*     */ 
/* 339 */       if (arrayOfInt1 != null)
/*     */       {
/* 341 */         arrayOfInt[i1] = new int[(paramInt1 >> i1) * (paramInt2 >> i1)];
/* 342 */         System.arraycopy(arrayOfInt1, paramInt3 * arrayOfInt[i1].length, arrayOfInt[i1], 0, arrayOfInt[i1].length);
/*     */       }
/*     */     }
/* 345 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   public void l() {
/* 349 */     this.a.clear();
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 353 */     return this.j != null;
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/* 357 */     this.a = paramList;
/*     */   }
/*     */   
/*     */   private void n() {
/* 361 */     this.j = null;
/* 362 */     a(Lists.newArrayList());
/* 363 */     this.g = 0;
/* 364 */     this.h = 0;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 369 */     return "TextureAtlasSprite{name='" + this.i + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.b + ", x=" + this.c + ", y=" + this.d + ", height=" + this.f + ", width=" + this.e + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */