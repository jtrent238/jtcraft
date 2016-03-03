/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import javax.imageio.ImageIO;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bpz
/*     */   extends bpp
/*     */   implements bqk, rg
/*     */ {
/*  35 */   private static final Logger d = ;
/*     */   
/*  37 */   public static final bqx b = new bqx("textures/atlas/blocks.png");
/*  38 */   public static final bqx c = new bqx("textures/atlas/items.png");
/*     */   
/*     */ 
/*  41 */   private final List e = Lists.newArrayList();
/*  42 */   private final Map f = Maps.newHashMap();
/*  43 */   private final Map g = Maps.newHashMap();
/*     */   
/*     */   private final int h;
/*     */   private final String i;
/*     */   private int j;
/*  48 */   private int k = 1;
/*     */   
/*  50 */   private final bqd l = new bqd("missingno");
/*     */   
/*     */   public bpz(int paramInt, String paramString) {
/*  53 */     this.h = paramInt;
/*  54 */     this.i = paramString;
/*  55 */     g();
/*     */   }
/*     */   
/*     */   private void f() {
/*     */     int[] arrayOfInt;
/*  60 */     if (this.k > 1.0F) {
/*  61 */       int m = 16;
/*  62 */       int n = 32;
/*  63 */       int i1 = 32;
/*     */       
/*  65 */       this.l.b(32);
/*  66 */       this.l.c(32);
/*     */       
/*  68 */       arrayOfInt = new int['Ѐ'];
/*  69 */       System.arraycopy(bqi.b, 0, arrayOfInt, 0, bqi.b.length);
/*     */       
/*  71 */       bqi.a(arrayOfInt, 16, 16, 8);
/*     */     }
/*     */     else {
/*  74 */       arrayOfInt = bqi.b;
/*  75 */       this.l.b(16);
/*  76 */       this.l.c(16);
/*     */     }
/*     */     
/*  79 */     int[][] arrayOfInt1 = new int[this.j + 1][];
/*  80 */     arrayOfInt1[0] = arrayOfInt;
/*  81 */     this.l.a(Lists.newArrayList(new int[][][] { arrayOfInt1 }));
/*     */   }
/*     */   
/*     */   public void a(bqy parambqy)
/*     */   {
/*  86 */     f();
/*     */     
/*  88 */     c();
/*     */     
/*  90 */     b(parambqy);
/*     */   }
/*     */   
/*     */   public void b(bqy parambqy) {
/*  94 */     int m = bao.D();
/*  95 */     bpv localbpv = new bpv(m, m, true, 0, this.j);
/*     */     
/*  97 */     this.g.clear();
/*  98 */     this.e.clear();
/*     */     
/* 100 */     int n = Integer.MAX_VALUE;
/*     */     
/*     */ 
/* 103 */     for (Iterator localIterator1 = this.f.entrySet().iterator(); localIterator1.hasNext();) { localObject1 = (Map.Entry)localIterator1.next();
/* 104 */       localObject2 = new bqx((String)((Map.Entry)localObject1).getKey());
/* 105 */       bqd localbqd1 = (bqd)((Map.Entry)localObject1).getValue();
/*     */       
/* 107 */       localObject3 = a((bqx)localObject2, 0);
/*     */       try {
/* 109 */         bqw localbqw = parambqy.a((bqx)localObject3);
/*     */         
/* 111 */         localObject4 = new BufferedImage[1 + this.j];
/* 112 */         localObject4[0] = ImageIO.read(localbqw.b());
/*     */         
/*     */ 
/* 115 */         localObject5 = (bsi)localbqw.a("texture");
/* 116 */         int i3; Iterator localIterator2; if (localObject5 != null) {
/* 117 */           localObject6 = ((bsi)localObject5).c();
/*     */           
/*     */ 
/* 120 */           if (!((List)localObject6).isEmpty()) {
/* 121 */             int i2 = localObject4[0].getWidth();
/* 122 */             i3 = localObject4[0].getHeight();
/* 123 */             if ((qh.b(i2) != i2) || (qh.b(i3) != i3)) {
/* 124 */               throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
/*     */             }
/*     */           }
/*     */           
/* 128 */           for (localIterator2 = ((List)localObject6).iterator(); localIterator2.hasNext();) { i3 = ((Integer)localIterator2.next()).intValue();
/*     */             
/* 130 */             if ((i3 > 0) && (i3 < localObject4.length - 1) && (localObject4[i3] == null)) {
/* 131 */               bqx localbqx = a((bqx)localObject2, i3);
/*     */               try {
/* 133 */                 localObject4[i3] = ImageIO.read(parambqy.a(localbqx).b());
/*     */               } catch (IOException localIOException2) {
/* 135 */                 d.error("Unable to load miplevel {} from: {}", new Object[] { Integer.valueOf(i3), localbqx, localIOException2 });
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 141 */         Object localObject6 = (bsa)localbqw.a("animation");
/* 142 */         localbqd1.a((BufferedImage[])localObject4, (bsa)localObject6, this.k > 1.0F);
/*     */       } catch (RuntimeException localRuntimeException) {
/* 144 */         d.error("Unable to parse metadata from " + localObject3, localRuntimeException);
/* 145 */         continue;
/*     */       } catch (IOException localIOException1) {
/* 147 */         d.error("Using missing texture, unable to load " + localObject3, localIOException1); }
/* 148 */       continue;
/*     */       
/*     */ 
/* 151 */       n = Math.min(n, Math.min(localbqd1.a(), localbqd1.b()));
/*     */       
/* 153 */       localbpv.a(localbqd1); }
/*     */     Object localObject3;
/*     */     Object localObject4;
/*     */     Object localObject5;
/* 157 */     int i1 = qh.c(n);
/* 158 */     if (i1 < this.j) {
/* 159 */       d.debug("{}: dropping miplevel from {} to {}, because of minTexel: {}", new Object[] { this.i, Integer.valueOf(this.j), Integer.valueOf(i1), Integer.valueOf(n) });
/* 160 */       this.j = i1;
/*     */     }
/*     */     
/* 163 */     for (Object localObject1 = this.f.values().iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (bqd)((Iterator)localObject1).next();
/*     */       try {
/* 165 */         ((bqd)localObject2).d(this.j);
/*     */       } catch (Throwable localThrowable1) {
/* 167 */         localObject3 = b.a(localThrowable1, "Applying mipmap");
/* 168 */         k localk = ((b)localObject3).a("Sprite being mipmapped");
/*     */         
/* 170 */         localk.a("Sprite name", new bqa(this, (bqd)localObject2));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 177 */         localk.a("Sprite size", new bqb(this, (bqd)localObject2));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 184 */         localk.a("Sprite frames", new bqc(this, (bqd)localObject2));
/*     */         
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 191 */         localk.a("Mipmap levels", Integer.valueOf(this.j));
/*     */         
/* 193 */         throw new s((b)localObject3);
/*     */       }
/*     */     }
/* 196 */     this.l.d(this.j);
/*     */     
/*     */ 
/* 199 */     localbpv.a(this.l);
/*     */     
/*     */     try
/*     */     {
/* 203 */       localbpv.c();
/*     */     } catch (bpy localbpy) {
/* 205 */       throw localbpy;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 210 */     d.info("Created: {}x{} {}-atlas", new Object[] { Integer.valueOf(localbpv.a()), Integer.valueOf(localbpv.b()), this.i });
/* 211 */     bqi.a(b(), this.j, localbpv.a(), localbpv.b(), this.k);
/*     */     
/* 213 */     HashMap localHashMap = Maps.newHashMap(this.f);
/* 214 */     for (Object localObject2 = localbpv.d().iterator(); ((Iterator)localObject2).hasNext();) { localbqd2 = (bqd)((Iterator)localObject2).next();
/*     */       
/*     */ 
/* 217 */       localObject3 = localbqd2.g();
/* 218 */       localHashMap.remove(localObject3);
/* 219 */       this.g.put(localObject3, localbqd2);
/*     */       
/*     */       try
/*     */       {
/* 223 */         bqi.a(localbqd2.a(0), localbqd2.a(), localbqd2.b(), localbqd2.h(), localbqd2.i(), false, false);
/*     */       } catch (Throwable localThrowable2) {
/* 225 */         localObject4 = b.a(localThrowable2, "Stitching texture atlas");
/* 226 */         localObject5 = ((b)localObject4).a("Texture being stitched together");
/*     */         
/* 228 */         ((k)localObject5).a("Atlas path", this.i);
/* 229 */         ((k)localObject5).a("Sprite", localbqd2);
/*     */         
/* 231 */         throw new s((b)localObject4);
/*     */       }
/*     */       
/*     */ 
/* 235 */       if (localbqd2.m()) {
/* 236 */         this.e.add(localbqd2);
/*     */       } else {
/* 238 */         localbqd2.l();
/*     */       }
/*     */     }
/*     */     
/*     */     bqd localbqd2;
/* 243 */     for (localObject2 = localHashMap.values().iterator(); ((Iterator)localObject2).hasNext();) { localbqd2 = (bqd)((Iterator)localObject2).next();
/* 244 */       localbqd2.a(this.l);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private bqx a(bqx parambqx, int paramInt)
/*     */   {
/* 251 */     if (paramInt == 0) {
/* 252 */       return new bqx(parambqx.b(), String.format("%s/%s%s", new Object[] { this.i, parambqx.a(), ".png" }));
/*     */     }
/* 254 */     return new bqx(parambqx.b(), String.format("%s/mipmaps/%s.%d%s", new Object[] { this.i, parambqx.a(), Integer.valueOf(paramInt), ".png" }));
/*     */   }
/*     */   
/*     */   private void g()
/*     */   {
/* 259 */     this.f.clear();
/*     */     
/*     */     Object localObject;
/* 262 */     if (this.h == 0) {
/* 263 */       for (localIterator = aji.c.iterator(); localIterator.hasNext();) { localObject = (aji)localIterator.next();
/* 264 */         if (((aji)localObject).o() != awt.a) {
/* 265 */           ((aji)localObject).a(this);
/*     */         }
/*     */       }
/*     */       
/* 269 */       bao.B().g.a(this);
/* 270 */       bnn.a.a(this);
/*     */     }
/*     */     
/* 273 */     for (Iterator localIterator = adb.e.iterator(); localIterator.hasNext();) { localObject = (adb)localIterator.next();
/* 274 */       if (localObject != null)
/*     */       {
/* 276 */         if (((adb)localObject).d() == this.h) {
/* 277 */           ((adb)localObject).a(this);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public bqd b(String paramString) {
/* 284 */     bqd localbqd = (bqd)this.g.get(paramString);
/* 285 */     if (localbqd == null) localbqd = this.l;
/* 286 */     return localbqd;
/*     */   }
/*     */   
/*     */   public void d() {
/* 290 */     bqi.b(b());
/* 291 */     for (bqd localbqd : this.e) {
/* 292 */       localbqd.j();
/*     */     }
/*     */   }
/*     */   
/*     */   public rf a(String paramString)
/*     */   {
/* 298 */     if (paramString == null) {
/* 299 */       throw new IllegalArgumentException("Name cannot be null!");
/*     */     }
/*     */     
/* 302 */     if ((paramString.indexOf('/') != -1) || (paramString.indexOf('\\') != -1)) {
/* 303 */       throw new IllegalArgumentException("Name cannot contain slashes!");
/*     */     }
/*     */     
/* 306 */     Object localObject = (bqd)this.f.get(paramString);
/* 307 */     if (localObject == null) {
/* 308 */       if (this.h == 1)
/*     */       {
/* 310 */         if ("clock".equals(paramString)) {
/* 311 */           localObject = new bql(paramString);
/* 312 */         } else if ("compass".equals(paramString)) {
/* 313 */           localObject = new bqm(paramString);
/*     */         } else {
/* 315 */           localObject = new bqd(paramString);
/*     */         }
/*     */       } else {
/* 318 */         localObject = new bqd(paramString);
/*     */       }
/* 320 */       this.f.put(paramString, localObject);
/*     */     }
/*     */     
/* 323 */     return (rf)localObject;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/* 328 */     return this.h;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 333 */     d();
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 337 */     this.j = paramInt;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 341 */     this.k = paramInt;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */