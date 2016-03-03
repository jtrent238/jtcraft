/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.vecmath.Matrix4f;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bpj
/*     */ {
/*     */   private final bmg a;
/*     */   private final bqy b;
/*     */   private final String c;
/*  30 */   private final List d = Lists.newArrayList();
/*  31 */   private final Map e = Maps.newHashMap();
/*  32 */   private final List f = Lists.newArrayList();
/*     */   private Matrix4f g;
/*     */   private int h;
/*     */   private int i;
/*     */   private float j;
/*     */   private float k;
/*     */   
/*     */   public bpj(bqf parambqf, bqy parambqy, bmg parambmg, bqx parambqx)
/*     */   {
/*  41 */     this.b = parambqy;
/*  42 */     this.a = parambmg;
/*  43 */     this.j = 0.0F;
/*  44 */     this.k = 0.0F;
/*  45 */     this.h = parambmg.c;
/*  46 */     this.i = parambmg.d;
/*  47 */     this.c = parambqx.toString();
/*  48 */     c();
/*     */     
/*  50 */     a(parambqf, parambqx);
/*     */   }
/*     */   
/*     */   public void a(bqf parambqf, bqx parambqx) {
/*  54 */     JsonParser localJsonParser = new JsonParser();
/*  55 */     InputStream localInputStream = null;
/*     */     try
/*     */     {
/*  58 */       bqw localbqw = this.b.a(parambqx);
/*  59 */       localInputStream = localbqw.b();
/*  60 */       localObject1 = localJsonParser.parse(IOUtils.toString(localInputStream, Charsets.UTF_8)).getAsJsonObject();
/*     */       JsonArray localJsonArray;
/*  62 */       if (pu.d((JsonObject)localObject1, "targets")) {
/*  63 */         localJsonArray = ((JsonObject)localObject1).getAsJsonArray("targets");
/*  64 */         m = 0;
/*     */         
/*  66 */         for (localIterator = localJsonArray.iterator(); localIterator.hasNext();) { localJsonElement = (JsonElement)localIterator.next();
/*     */           try {
/*  68 */             a(localJsonElement);
/*     */           } catch (Exception localException2) {
/*  70 */             locallb = lb.a(localException2);
/*  71 */             locallb.a("targets[" + m + "]");
/*  72 */             throw locallb;
/*     */           }
/*  74 */           m++;
/*     */         }
/*     */       }
/*     */       
/*  78 */       if (pu.d((JsonObject)localObject1, "passes")) {
/*  79 */         localJsonArray = ((JsonObject)localObject1).getAsJsonArray("passes");
/*  80 */         m = 0;
/*     */         
/*  82 */         for (localIterator = localJsonArray.iterator(); localIterator.hasNext();) { localJsonElement = (JsonElement)localIterator.next();
/*     */           try {
/*  84 */             a(parambqf, localJsonElement);
/*     */           } catch (Exception localException3) {
/*  86 */             locallb = lb.a(localException3);
/*  87 */             locallb.a("passes[" + m + "]");
/*  88 */             throw locallb;
/*     */           }
/*  90 */           m++; } } } catch (Exception localException1) { int m;
/*     */       Iterator localIterator;
/*     */       JsonElement localJsonElement;
/*     */       lb locallb;
/*  94 */       Object localObject1 = lb.a(localException1);
/*  95 */       ((lb)localObject1).b(parambqx.a());
/*  96 */       throw ((Throwable)localObject1);
/*     */     } finally {
/*  98 */       IOUtils.closeQuietly(localInputStream);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(JsonElement paramJsonElement) {
/* 103 */     if (pu.a(paramJsonElement)) {
/* 104 */       a(paramJsonElement.getAsString(), this.h, this.i);
/*     */     } else {
/* 106 */       JsonObject localJsonObject = pu.l(paramJsonElement, "target");
/*     */       
/* 108 */       String str = pu.h(localJsonObject, "name");
/* 109 */       int m = pu.a(localJsonObject, "width", this.h);
/* 110 */       int n = pu.a(localJsonObject, "height", this.i);
/*     */       
/* 112 */       if (this.e.containsKey(str)) {
/* 113 */         throw new lb(str + " is already defined");
/*     */       }
/* 115 */       a(str, m, n);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bqf parambqf, JsonElement paramJsonElement)
/*     */   {
/* 121 */     JsonObject localJsonObject1 = pu.l(paramJsonElement, "pass");
/*     */     
/* 123 */     String str1 = pu.h(localJsonObject1, "name");
/* 124 */     String str2 = pu.h(localJsonObject1, "intarget");
/* 125 */     String str3 = pu.h(localJsonObject1, "outtarget");
/* 126 */     bmg localbmg1 = a(str2);
/* 127 */     bmg localbmg2 = a(str3);
/*     */     
/* 129 */     if (localbmg1 == null) {
/* 130 */       throw new lb("Input target '" + str2 + "' does not exist");
/*     */     }
/* 132 */     if (localbmg2 == null) {
/* 133 */       throw new lb("Output target '" + str3 + "' does not exist");
/*     */     }
/*     */     
/* 136 */     bpk localbpk = a(str1, localbmg1, localbmg2);
/*     */     
/* 138 */     JsonArray localJsonArray1 = pu.a(localJsonObject1, "auxtargets", null);
/* 139 */     int m; Iterator localIterator; if (localJsonArray1 != null) {
/* 140 */       m = 0;
/* 141 */       for (localIterator = localJsonArray1.iterator(); localIterator.hasNext();) { localObject1 = (JsonElement)localIterator.next();
/*     */         try {
/* 143 */           JsonObject localJsonObject2 = pu.l((JsonElement)localObject1, "auxtarget");
/* 144 */           localObject2 = pu.h(localJsonObject2, "name");
/* 145 */           localObject3 = pu.h(localJsonObject2, "id");
/* 146 */           bmg localbmg3 = a((String)localObject3);
/*     */           
/* 148 */           if (localbmg3 == null)
/*     */           {
/* 150 */             bqx localbqx = new bqx("textures/effect/" + (String)localObject3 + ".png");
/*     */             try {
/* 152 */               this.b.a(localbqx);
/*     */             } catch (FileNotFoundException localFileNotFoundException) {
/* 154 */               throw new lb("Render target or texture '" + (String)localObject3 + "' does not exist");
/*     */             }
/*     */             
/* 157 */             parambqf.a(localbqx);
/* 158 */             bqh localbqh = parambqf.b(localbqx);
/* 159 */             int i1 = pu.m(localJsonObject2, "width");
/* 160 */             int i2 = pu.m(localJsonObject2, "height");
/* 161 */             boolean bool = pu.i(localJsonObject2, "bilinear");
/* 162 */             if (bool) {
/* 163 */               GL11.glTexParameteri(3553, 10241, 9729);
/* 164 */               GL11.glTexParameteri(3553, 10240, 9729);
/*     */             } else {
/* 166 */               GL11.glTexParameteri(3553, 10241, 9728);
/* 167 */               GL11.glTexParameteri(3553, 10240, 9728);
/*     */             }
/* 169 */             localbpk.a((String)localObject2, Integer.valueOf(localbqh.b()), i1, i2);
/*     */           } else {
/* 171 */             localbpk.a((String)localObject2, localbmg3, localbmg3.a, localbmg3.b);
/*     */           }
/*     */         } catch (Exception localException1) {
/* 174 */           Object localObject2 = lb.a(localException1);
/* 175 */           ((lb)localObject2).a("auxtargets[" + m + "]");
/* 176 */           throw ((Throwable)localObject2);
/*     */         }
/* 178 */         m++;
/*     */       } }
/*     */     Object localObject1;
/*     */     Object localObject3;
/* 182 */     JsonArray localJsonArray2 = pu.a(localJsonObject1, "uniforms", null);
/* 183 */     int n; if (localJsonArray2 != null) {
/* 184 */       n = 0;
/* 185 */       for (localObject1 = localJsonArray2.iterator(); ((Iterator)localObject1).hasNext();) { JsonElement localJsonElement = (JsonElement)((Iterator)localObject1).next();
/*     */         try {
/* 187 */           b(localJsonElement);
/*     */         } catch (Exception localException2) {
/* 189 */           localObject3 = lb.a(localException2);
/* 190 */           ((lb)localObject3).a("uniforms[" + n + "]");
/* 191 */           throw ((Throwable)localObject3);
/*     */         }
/* 193 */         n++;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(JsonElement paramJsonElement) {
/* 199 */     JsonObject localJsonObject = pu.l(paramJsonElement, "uniform");
/* 200 */     String str = pu.h(localJsonObject, "name");
/* 201 */     bpo localbpo = ((bpk)this.d.get(this.d.size() - 1)).c().a(str);
/*     */     
/* 203 */     if (localbpo == null) {
/* 204 */       throw new lb("Uniform '" + str + "' does not exist");
/*     */     }
/*     */     
/* 207 */     float[] arrayOfFloat = new float[4];
/* 208 */     int m = 0;
/* 209 */     JsonArray localJsonArray = pu.t(localJsonObject, "values");
/*     */     
/* 211 */     for (JsonElement localJsonElement : localJsonArray) {
/*     */       try {
/* 213 */         arrayOfFloat[m] = pu.d(localJsonElement, "value");
/*     */       } catch (Exception localException) {
/* 215 */         lb locallb = lb.a(localException);
/* 216 */         locallb.a("values[" + m + "]");
/* 217 */         throw locallb;
/*     */       }
/* 219 */       m++;
/*     */     }
/*     */     
/* 222 */     switch (m)
/*     */     {
/*     */     case 0: 
/*     */       break;
/*     */     case 1: 
/* 227 */       localbpo.a(arrayOfFloat[0]);
/* 228 */       break;
/*     */     case 2: 
/* 230 */       localbpo.a(arrayOfFloat[0], arrayOfFloat[1]);
/* 231 */       break;
/*     */     case 3: 
/* 233 */       localbpo.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/* 234 */       break;
/*     */     case 4: 
/* 236 */       localbpo.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(String paramString, int paramInt1, int paramInt2)
/*     */   {
/* 242 */     bmg localbmg = new bmg(paramInt1, paramInt2, true);
/* 243 */     localbmg.a(0.0F, 0.0F, 0.0F, 0.0F);
/* 244 */     this.e.put(paramString, localbmg);
/*     */     
/* 246 */     if ((paramInt1 == this.h) && (paramInt2 == this.i)) {
/* 247 */       this.f.add(localbmg);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 252 */     for (Iterator localIterator = this.e.values().iterator(); localIterator.hasNext();) { localObject = (bmg)localIterator.next();
/* 253 */       ((bmg)localObject).a(); }
/*     */     Object localObject;
/* 255 */     for (localIterator = this.d.iterator(); localIterator.hasNext();) { localObject = (bpk)localIterator.next();
/* 256 */       ((bpk)localObject).b();
/*     */     }
/* 258 */     this.d.clear();
/*     */   }
/*     */   
/*     */   public bpk a(String paramString, bmg parambmg1, bmg parambmg2) {
/* 262 */     bpk localbpk = new bpk(this.b, paramString, parambmg1, parambmg2);
/* 263 */     this.d.add(this.d.size(), localbpk);
/* 264 */     return localbpk;
/*     */   }
/*     */   
/*     */   private void c() {
/* 268 */     this.g = new Matrix4f();
/* 269 */     this.g.setIdentity();
/* 270 */     this.g.m00 = (2.0F / this.a.a);
/* 271 */     this.g.m11 = (2.0F / -this.a.b);
/* 272 */     this.g.m22 = -0.0020001999F;
/* 273 */     this.g.m33 = 1.0F;
/* 274 */     this.g.m03 = -1.0F;
/* 275 */     this.g.m13 = 1.0F;
/* 276 */     this.g.m23 = -1.0001999F;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/* 280 */     this.h = this.a.a;
/* 281 */     this.i = this.a.b;
/* 282 */     c();
/* 283 */     for (Iterator localIterator = this.d.iterator(); localIterator.hasNext();) { localObject = (bpk)localIterator.next();
/* 284 */       ((bpk)localObject).a(this.g); }
/*     */     Object localObject;
/* 286 */     for (localIterator = this.f.iterator(); localIterator.hasNext();) { localObject = (bmg)localIterator.next();
/* 287 */       ((bmg)localObject).a(paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float paramFloat)
/*     */   {
/* 293 */     if (paramFloat < this.k) {
/* 294 */       this.j += 1.0F - this.k;
/* 295 */       this.j += paramFloat;
/*     */     } else {
/* 297 */       this.j += paramFloat - this.k;
/*     */     }
/* 299 */     this.k = paramFloat;
/* 300 */     while (this.j > 20.0F) {
/* 301 */       this.j -= 20.0F;
/*     */     }
/* 303 */     for (bpk localbpk : this.d) {
/* 304 */       localbpk.a(this.j / 20.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public final String b() {
/* 309 */     return this.c;
/*     */   }
/*     */   
/*     */   private bmg a(String paramString) {
/* 313 */     if (paramString == null) return null;
/* 314 */     if (paramString.equals("minecraft:main")) return this.a;
/* 315 */     return (bmg)this.e.get(paramString);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */