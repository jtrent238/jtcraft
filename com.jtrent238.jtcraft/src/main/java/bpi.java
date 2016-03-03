/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.io.InputStream;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GL13;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bpi
/*     */ {
/*  25 */   private static final Logger a = ;
/*  26 */   private static final bph b = new bph();
/*     */   
/*     */ 
/*  29 */   private static bpi c = null;
/*  30 */   private static int d = -1;
/*  31 */   private static boolean e = true;
/*     */   
/*     */ 
/*  34 */   private final Map f = Maps.newHashMap();
/*  35 */   private final List g = Lists.newArrayList();
/*  36 */   private final List h = Lists.newArrayList();
/*     */   
/*     */ 
/*  39 */   private final List i = Lists.newArrayList();
/*  40 */   private final List j = Lists.newArrayList();
/*  41 */   private final Map k = Maps.newHashMap();
/*     */   
/*     */   private final int l;
/*     */   
/*     */   private final String m;
/*     */   
/*     */   private final boolean n;
/*     */   
/*     */   private boolean o;
/*     */   
/*     */   private final bpg p;
/*     */   
/*     */   private final List q;
/*     */   
/*     */   private final List r;
/*     */   
/*     */   private final bpl s;
/*     */   private final bpl t;
/*     */   
/*     */   public bpi(bqy parambqy, String paramString)
/*     */   {
/*  62 */     JsonParser localJsonParser = new JsonParser();
/*     */     
/*  64 */     bqx localbqx = new bqx("shaders/program/" + paramString + ".json");
/*  65 */     this.m = paramString;
/*     */     
/*  67 */     InputStream localInputStream = null;
/*     */     try
/*     */     {
/*  70 */       localInputStream = parambqy.a(localbqx).b();
/*  71 */       JsonObject localJsonObject = localJsonParser.parse(IOUtils.toString(localInputStream, Charsets.UTF_8)).getAsJsonObject();
/*     */       
/*  73 */       String str = pu.h(localJsonObject, "vertex");
/*  74 */       localObject1 = pu.h(localJsonObject, "fragment");
/*     */       
/*  76 */       JsonArray localJsonArray1 = pu.a(localJsonObject, "samplers", null);
/*  77 */       int i1; Iterator localIterator1; if (localJsonArray1 != null) {
/*  78 */         i1 = 0;
/*  79 */         for (localIterator1 = localJsonArray1.iterator(); localIterator1.hasNext();) { localObject2 = (JsonElement)localIterator1.next();
/*     */           try {
/*  81 */             a((JsonElement)localObject2);
/*     */           } catch (Exception localException2) {
/*  83 */             lb locallb1 = lb.a(localException2);
/*  84 */             locallb1.a("samplers[" + i1 + "]");
/*  85 */             throw locallb1;
/*     */           }
/*  87 */           i1++;
/*     */         }
/*     */       }
/*     */       Object localObject2;
/*  91 */       JsonArray localJsonArray2 = pu.a(localJsonObject, "attributes", null);
/*  92 */       int i2; if (localJsonArray2 != null) {
/*  93 */         i2 = 0;
/*  94 */         this.q = Lists.newArrayListWithCapacity(localJsonArray2.size());
/*  95 */         this.r = Lists.newArrayListWithCapacity(localJsonArray2.size());
/*  96 */         for (localObject2 = localJsonArray2.iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (JsonElement)((Iterator)localObject2).next();
/*     */           try {
/*  98 */             this.r.add(pu.a((JsonElement)localObject3, "attribute"));
/*     */           } catch (Exception localException3) {
/* 100 */             lb locallb2 = lb.a(localException3);
/* 101 */             locallb2.a("attributes[" + i2 + "]");
/* 102 */             throw locallb2;
/*     */           }
/* 104 */           i2++;
/*     */         }
/*     */       } else {
/* 107 */         this.q = null;
/* 108 */         this.r = null;
/*     */       }
/*     */       
/* 111 */       JsonArray localJsonArray3 = pu.a(localJsonObject, "uniforms", null);
/* 112 */       int i3; if (localJsonArray3 != null) {
/* 113 */         i3 = 0;
/* 114 */         for (localObject3 = localJsonArray3.iterator(); ((Iterator)localObject3).hasNext();) { JsonElement localJsonElement = (JsonElement)((Iterator)localObject3).next();
/*     */           try {
/* 116 */             b(localJsonElement);
/*     */           } catch (Exception localException4) {
/* 118 */             lb locallb3 = lb.a(localException4);
/* 119 */             locallb3.a("uniforms[" + i3 + "]");
/* 120 */             throw locallb3;
/*     */           }
/* 122 */           i3++;
/*     */         }
/*     */       }
/*     */       
/* 126 */       this.p = bpg.a(pu.a(localJsonObject, "blend", null));
/* 127 */       this.n = pu.a(localJsonObject, "cull", true);
/*     */       
/* 129 */       this.s = bpl.a(parambqy, bpm.a, str);
/* 130 */       this.t = bpl.a(parambqy, bpm.b, (String)localObject1);
/*     */       
/* 132 */       this.l = bpn.b().c();
/* 133 */       bpn.b().b(this);
/*     */       
/* 135 */       i();
/*     */       
/* 137 */       if (this.r != null)
/* 138 */         for (localIterator2 = this.r.iterator(); localIterator2.hasNext();) { localObject3 = (String)localIterator2.next();
/* 139 */           int i4 = buu.b(this.l, (CharSequence)localObject3);
/* 140 */           this.q.add(Integer.valueOf(i4));
/*     */         }
/*     */     } catch (Exception localException1) { Object localObject3;
/*     */       Iterator localIterator2;
/* 144 */       Object localObject1 = lb.a(localException1);
/* 145 */       ((lb)localObject1).b(localbqx.a());
/* 146 */       throw ((Throwable)localObject1);
/*     */     } finally {
/* 148 */       IOUtils.closeQuietly(localInputStream);
/*     */     }
/*     */     
/* 151 */     d();
/*     */   }
/*     */   
/*     */   public void a() {
/* 155 */     bpn.b().a(this);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/* 160 */     buu.d(0);
/* 161 */     d = -1;
/* 162 */     c = null;
/* 163 */     e = true;
/*     */     
/*     */ 
/* 166 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 167 */       if (this.f.get(this.g.get(i1)) != null)
/*     */       {
/*     */ 
/*     */ 
/* 171 */         GL13.glActiveTexture(33984 + i1);
/* 172 */         GL11.glBindTexture(3553, 0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void c()
/*     */   {
/* 182 */     this.o = false;
/*     */     
/* 184 */     c = this;
/*     */     
/* 186 */     this.p.a();
/*     */     
/* 188 */     if (this.l != d) {
/* 189 */       buu.d(this.l);
/* 190 */       d = this.l;
/*     */     }
/*     */     
/* 193 */     if (e != this.n) {
/* 194 */       e = this.n;
/* 195 */       if (this.n) {
/* 196 */         GL11.glEnable(2884);
/*     */       } else {
/* 198 */         GL11.glDisable(2884);
/*     */       }
/*     */     }
/*     */     Object localObject;
/* 202 */     for (int i1 = 0; i1 < this.h.size(); i1++) {
/* 203 */       if (this.f.get(this.g.get(i1)) != null)
/*     */       {
/*     */ 
/*     */ 
/* 207 */         GL13.glActiveTexture(33984 + i1);
/* 208 */         GL11.glEnable(3553);
/* 209 */         localObject = this.f.get(this.g.get(i1));
/* 210 */         int i2 = -1;
/* 211 */         if ((localObject instanceof bmg)) {
/* 212 */           i2 = ((bmg)localObject).g;
/* 213 */         } else if ((localObject instanceof bqh)) {
/* 214 */           i2 = ((bqh)localObject).b();
/* 215 */         } else if ((localObject instanceof Integer)) {
/* 216 */           i2 = ((Integer)localObject).intValue();
/*     */         }
/* 218 */         if (i2 != -1)
/*     */         {
/*     */ 
/* 221 */           GL11.glBindTexture(3553, i2);
/*     */           
/* 223 */           buu.f(buu.a(this.l, (CharSequence)this.g.get(i1)), i1);
/*     */         }
/*     */       }
/*     */     }
/* 227 */     for (Iterator localIterator = this.i.iterator(); localIterator.hasNext();) { localObject = (bpo)localIterator.next();
/* 228 */       ((bpo)localObject).b();
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 233 */     this.o = true;
/*     */   }
/*     */   
/*     */   public bpo a(String paramString) {
/* 237 */     if (this.k.containsKey(paramString)) {
/* 238 */       return (bpo)this.k.get(paramString);
/*     */     }
/*     */     
/* 241 */     return null;
/*     */   }
/*     */   
/*     */   public bpo b(String paramString) {
/* 245 */     if (this.k.containsKey(paramString)) {
/* 246 */       return (bpo)this.k.get(paramString);
/*     */     }
/*     */     
/* 249 */     return b;
/*     */   }
/*     */   
/*     */   private void i() {
/* 253 */     int i1 = 0; String str; int i3; for (int i2 = 0; i1 < this.g.size(); i2++) {
/* 254 */       str = (String)this.g.get(i1);
/* 255 */       i3 = buu.a(this.l, str);
/* 256 */       if (i3 == -1) {
/* 257 */         a.warn("Shader " + this.m + "could not find sampler named " + str + " in the specified shader program.");
/*     */         
/* 259 */         this.f.remove(str);
/* 260 */         this.g.remove(i2);
/* 261 */         i2--;
/*     */       }
/*     */       else {
/* 264 */         this.h.add(Integer.valueOf(i3));
/*     */       }
/* 253 */       i1++;
/*     */     }
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
/* 267 */     for (bpo localbpo : this.i) {
/* 268 */       str = localbpo.a();
/* 269 */       i3 = buu.a(this.l, str);
/* 270 */       if (i3 == -1) {
/* 271 */         a.warn("Could not find uniform named " + str + " in the specified" + " shader program.");
/*     */       }
/*     */       else {
/* 274 */         this.j.add(Integer.valueOf(i3));
/* 275 */         localbpo.b(i3);
/* 276 */         this.k.put(str, localbpo);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/* 281 */   private void a(JsonElement paramJsonElement) { JsonObject localJsonObject = pu.l(paramJsonElement, "sampler");
/* 282 */     String str = pu.h(localJsonObject, "name");
/*     */     
/* 284 */     if (!pu.a(localJsonObject, "file"))
/*     */     {
/* 286 */       this.f.put(str, null);
/* 287 */       this.g.add(str);
/* 288 */       return;
/*     */     }
/* 290 */     this.g.add(str);
/*     */   }
/*     */   
/*     */   public void a(String paramString, Object paramObject) {
/* 294 */     if (this.f.containsKey(paramString)) {
/* 295 */       this.f.remove(paramString);
/*     */     }
/*     */     
/* 298 */     this.f.put(paramString, paramObject);
/* 299 */     d();
/*     */   }
/*     */   
/*     */   private void b(JsonElement paramJsonElement) {
/* 303 */     JsonObject localJsonObject = pu.l(paramJsonElement, "uniform");
/* 304 */     String str = pu.h(localJsonObject, "name");
/* 305 */     int i1 = bpo.a(pu.h(localJsonObject, "type"));
/* 306 */     int i2 = pu.m(localJsonObject, "count");
/* 307 */     float[] arrayOfFloat = new float[Math.max(i2, 16)];
/*     */     
/* 309 */     JsonArray localJsonArray = pu.t(localJsonObject, "values");
/* 310 */     if ((localJsonArray.size() != i2) && (localJsonArray.size() > 1)) {
/* 311 */       throw new lb("Invalid amount of values specified (expected " + i2 + ", found " + localJsonArray.size() + ")");
/*     */     }
/*     */     
/* 314 */     int i3 = 0;
/* 315 */     for (Iterator localIterator = localJsonArray.iterator(); localIterator.hasNext();) { localObject = (JsonElement)localIterator.next();
/*     */       try {
/* 317 */         arrayOfFloat[i3] = pu.d((JsonElement)localObject, "value");
/*     */       } catch (Exception localException) {
/* 319 */         lb locallb = lb.a(localException);
/* 320 */         locallb.a("values[" + i3 + "]");
/* 321 */         throw locallb;
/*     */       }
/* 323 */       i3++;
/*     */     }
/*     */     
/*     */ 
/* 327 */     if ((i2 > 1) && (localJsonArray.size() == 1)) {
/* 328 */       for (; i3 < i2; i3++) {
/* 329 */         arrayOfFloat[i3] = arrayOfFloat[0];
/*     */       }
/*     */     }
/*     */     
/* 333 */     int i4 = (i2 > 1) && (i2 <= 4) && (i1 < 8) ? i2 - 1 : 0;
/* 334 */     Object localObject = new bpo(str, i1 + i4, i2, this);
/*     */     
/* 336 */     if (i1 <= 3)
/*     */     {
/* 338 */       ((bpo)localObject).a((int)arrayOfFloat[0], (int)arrayOfFloat[1], (int)arrayOfFloat[2], (int)arrayOfFloat[3]);
/* 339 */     } else if (i1 <= 7)
/*     */     {
/* 341 */       ((bpo)localObject).b(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/*     */     }
/*     */     else {
/* 344 */       ((bpo)localObject).a(arrayOfFloat);
/*     */     }
/*     */     
/* 347 */     this.i.add(localObject);
/*     */   }
/*     */   
/*     */   public bpl e() {
/* 351 */     return this.s;
/*     */   }
/*     */   
/*     */   public bpl f() {
/* 355 */     return this.t;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int h()
/*     */   {
/* 363 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */