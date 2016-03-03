/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import com.google.common.collect.HashMultimap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import org.apache.logging.log4j.MarkerManager;
/*     */ import paulscode.sound.SoundSystemConfig;
/*     */ import paulscode.sound.SoundSystemException;
/*     */ import paulscode.sound.codecs.CodecJOrbis;
/*     */ import paulscode.sound.libraries.LibraryLWJGLOpenAL;
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
/*     */ public class btj
/*     */ {
/*  35 */   private static final Marker a = MarkerManager.getMarker("SOUNDS");
/*  36 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */ 
/*     */   private final btp c;
/*     */   
/*     */ 
/*     */   private final bbj d;
/*     */   
/*     */ 
/*     */   private btn e;
/*     */   
/*     */   private boolean f;
/*     */   
/*  49 */   private int g = 0;
/*     */   
/*  51 */   private final Map h = HashBiMap.create();
/*  52 */   private final Map i = ((BiMap)this.h).inverse();
/*  53 */   private Map j = Maps.newHashMap();
/*  54 */   private final Multimap k = HashMultimap.create();
/*     */   
/*  56 */   private final List l = Lists.newArrayList();
/*  57 */   private final Map m = Maps.newHashMap();
/*  58 */   private final Map n = Maps.newHashMap();
/*     */   
/*     */   public btj(btp parambtp, bbj parambbj) {
/*  61 */     this.c = parambtp;
/*  62 */     this.d = parambbj;
/*     */     
/*     */     try
/*     */     {
/*  66 */       SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
/*  67 */       SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
/*     */     } catch (SoundSystemException localSoundSystemException) {
/*  69 */       b.error(a, "Error linking with the LibraryJavaSound plug-in", localSoundSystemException);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  74 */     b();
/*  75 */     i();
/*     */   }
/*     */   
/*     */   private synchronized void i() {
/*  79 */     if (this.f) return;
/*     */     try
/*     */     {
/*  82 */       new Thread(new btk(this), "Sound Library Loader").start();
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     catch (RuntimeException localRuntimeException)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*  92 */       b.error(a, "Error starting SoundSystem. Turning off sounds & music", localRuntimeException);
/*     */       
/*  94 */       this.d.a(w.a, 0.0F);
/*  95 */       this.d.b();
/*     */     }
/*     */   }
/*     */   
/*     */   private float a(w paramw) {
/* 100 */     if ((paramw == null) || (paramw == w.a)) {
/* 101 */       return 1.0F;
/*     */     }
/*     */     
/* 104 */     return this.d.a(paramw);
/*     */   }
/*     */   
/*     */   public void a(w paramw, float paramFloat) {
/* 108 */     if (!this.f) {
/* 109 */       return;
/*     */     }
/*     */     
/* 112 */     if (paramw == w.a) {
/* 113 */       this.e.setMasterVolume(paramFloat);
/* 114 */       return;
/*     */     }
/*     */     
/* 117 */     for (String str : this.k.get(paramw)) {
/* 118 */       bst localbst = (bst)this.h.get(str);
/* 119 */       float f1 = a(localbst, (bti)this.j.get(localbst), paramw);
/* 120 */       if (f1 <= 0.0F) {
/* 121 */         b(localbst);
/*     */       } else {
/* 123 */         this.e.setVolume(str, f1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 129 */     if (this.f) {
/* 130 */       c();
/*     */       
/* 132 */       this.e.cleanup();
/* 133 */       this.f = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public void c() {
/* 138 */     if (this.f) {
/* 139 */       for (String str : this.h.keySet()) {
/* 140 */         this.e.stop(str);
/*     */       }
/* 142 */       this.h.clear();
/* 143 */       this.m.clear();
/* 144 */       this.l.clear();
/* 145 */       this.k.clear();
/* 146 */       this.j.clear();
/* 147 */       this.n.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 152 */     this.g += 1;
/*     */     
/*     */ 
/* 155 */     for (Iterator localIterator = this.l.iterator(); localIterator.hasNext();) { localObject1 = (bsv)localIterator.next();
/* 156 */       ((bsv)localObject1).a();
/*     */       
/* 158 */       if (((bsv)localObject1).k()) {
/* 159 */         b((bst)localObject1);
/*     */       } else {
/* 161 */         localObject2 = (String)this.i.get(localObject1);
/*     */         
/* 163 */         this.e.setVolume((String)localObject2, a((bst)localObject1, (bti)this.j.get(localObject1), this.c.a(((bsv)localObject1).b()).d()));
/* 164 */         this.e.setPitch((String)localObject2, a((bst)localObject1, (bti)this.j.get(localObject1)));
/* 165 */         this.e.setPosition((String)localObject2, ((bsv)localObject1).g(), ((bsv)localObject1).h(), ((bsv)localObject1).i());
/*     */       }
/*     */     }
/*     */     
/*     */     Object localObject2;
/* 170 */     localIterator = this.h.entrySet().iterator();
/* 171 */     bst localbst; while (localIterator.hasNext()) {
/* 172 */       localObject1 = (Map.Entry)localIterator.next();
/*     */       
/* 174 */       localObject2 = (String)((Map.Entry)localObject1).getKey();
/* 175 */       localbst = (bst)((Map.Entry)localObject1).getValue();
/*     */       
/* 177 */       if (!this.e.playing((String)localObject2)) {
/* 178 */         int i1 = ((Integer)this.n.get(localObject2)).intValue();
/* 179 */         if (i1 <= this.g) {
/* 180 */           int i2 = localbst.d();
/* 181 */           if ((localbst.c()) && (i2 > 0)) {
/* 182 */             this.m.put(localbst, Integer.valueOf(this.g + i2));
/*     */           }
/* 184 */           localIterator.remove();
/* 185 */           b.debug(a, "Removed channel {} because it's not playing anymore", new Object[] { localObject2 });
/* 186 */           this.e.removeSource((String)localObject2);
/* 187 */           this.n.remove(localObject2);
/*     */           
/* 189 */           this.j.remove(localbst);
/*     */           try {
/* 191 */             this.k.remove(this.c.a(localbst.b()).d(), localObject2);
/*     */           }
/*     */           catch (RuntimeException localRuntimeException) {}
/*     */           
/*     */ 
/* 196 */           if ((localbst instanceof bsv)) {
/* 197 */             this.l.remove(localbst);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 203 */     Object localObject1 = this.m.entrySet().iterator();
/* 204 */     while (((Iterator)localObject1).hasNext()) {
/* 205 */       localObject2 = (Map.Entry)((Iterator)localObject1).next();
/*     */       
/* 207 */       if (this.g >= ((Integer)((Map.Entry)localObject2).getValue()).intValue()) {
/* 208 */         localbst = (bst)((Map.Entry)localObject2).getKey();
/*     */         
/*     */ 
/* 211 */         if ((localbst instanceof bsv)) {
/* 212 */           ((bsv)localbst).a();
/*     */         }
/*     */         
/* 215 */         c(localbst);
/* 216 */         ((Iterator)localObject1).remove();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(bst parambst) {
/* 222 */     if (!this.f) { return false;
/*     */     }
/* 224 */     String str = (String)this.i.get(parambst);
/* 225 */     if (str == null) { return false;
/*     */     }
/* 227 */     return (this.e.playing(str)) || ((this.n.containsKey(str)) && (((Integer)this.n.get(str)).intValue() <= this.g));
/*     */   }
/*     */   
/*     */   public void b(bst parambst) {
/* 231 */     if (!this.f) { return;
/*     */     }
/* 233 */     String str = (String)this.i.get(parambst);
/* 234 */     if (str != null) {
/* 235 */       this.e.stop(str);
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(bst parambst) {
/* 240 */     if (!this.f) { return;
/*     */     }
/* 242 */     if (this.e.getMasterVolume() <= 0.0F) {
/* 243 */       b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[] { parambst.b() });
/* 244 */       return;
/*     */     }
/*     */     
/* 247 */     bto localbto = this.c.a(parambst.b());
/* 248 */     if (localbto == null) {
/* 249 */       b.warn(a, "Unable to play unknown soundEvent: {}", new Object[] { parambst.b() });
/* 250 */       return;
/*     */     }
/*     */     
/* 253 */     bti localbti = localbto.b();
/* 254 */     if (localbti == btp.a) {
/* 255 */       b.warn(a, "Unable to play empty soundEvent: {}", new Object[] { localbto.c() });
/* 256 */       return;
/*     */     }
/*     */     
/* 259 */     float f1 = parambst.e();
/* 260 */     float f2 = 16.0F;
/* 261 */     if (f1 > 1.0F) { f2 *= f1;
/*     */     }
/* 263 */     w localw = localbto.d();
/* 264 */     float f3 = a(parambst, localbti, localw);
/* 265 */     double d1 = a(parambst, localbti);
/*     */     
/* 267 */     bqx localbqx = localbti.a();
/* 268 */     if (f3 == 0.0F) {
/* 269 */       b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[] { localbqx });
/* 270 */       return;
/*     */     }
/*     */     
/* 273 */     boolean bool = (parambst.c()) && (parambst.d() == 0);
/*     */     
/* 275 */     String str = UUID.randomUUID().toString();
/*     */     
/* 277 */     if (localbti.d()) {
/* 278 */       this.e.newStreamingSource(false, str, a(localbqx), localbqx.toString(), bool, parambst.g(), parambst.h(), parambst.i(), parambst.j().a(), f2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */       this.e.newSource(false, str, a(localbqx), localbqx.toString(), bool, parambst.g(), parambst.h(), parambst.i(), parambst.j().a(), f2);
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
/* 305 */     b.debug(a, "Playing sound {} for event {} as channel {}", new Object[] { localbti.a(), localbto.c(), str });
/*     */     
/* 307 */     this.e.setPitch(str, (float)d1);
/* 308 */     this.e.setVolume(str, f3);
/* 309 */     this.e.play(str);
/*     */     
/* 311 */     this.n.put(str, Integer.valueOf(this.g + 20));
/* 312 */     this.h.put(str, parambst);
/* 313 */     this.j.put(parambst, localbti);
/*     */     
/* 315 */     if (localw != w.a) {
/* 316 */       this.k.put(localw, str);
/*     */     }
/*     */     
/* 319 */     if ((parambst instanceof bsv)) {
/* 320 */       this.l.add((bsv)parambst);
/*     */     }
/*     */   }
/*     */   
/*     */   private float a(bst parambst, bti parambti) {
/* 325 */     return (float)qh.a(parambst.f() * parambti.b(), 0.5D, 2.0D);
/*     */   }
/*     */   
/*     */   private float a(bst parambst, bti parambti, w paramw) {
/* 329 */     return (float)qh.a(parambst.e() * parambti.c() * a(paramw), 0.0D, 1.0D);
/*     */   }
/*     */   
/*     */   public void e() {
/* 333 */     for (String str : this.h.keySet()) {
/* 334 */       b.debug(a, "Pausing channel {}", new Object[] { str });
/* 335 */       this.e.pause(str);
/*     */     }
/*     */   }
/*     */   
/*     */   public void f() {
/* 340 */     for (String str : this.h.keySet()) {
/* 341 */       b.debug(a, "Resuming channel {}", new Object[] { str });
/* 342 */       this.e.play(str);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bst parambst, int paramInt) {
/* 347 */     this.m.put(parambst, Integer.valueOf(this.g + paramInt));
/*     */   }
/*     */   
/*     */   private static URL a(bqx parambqx) {
/* 351 */     String str = String.format("%s:%s:%s", new Object[] { "mcsounddomain", parambqx.b(), parambqx.a() });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 357 */     btl localbtl = new btl(parambqx);
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
/*     */     try
/*     */     {
/* 375 */       return new URL(null, str, localbtl);
/*     */     } catch (MalformedURLException localMalformedURLException) {
/* 377 */       throw new Error("TODO: Sanely handle url exception! :D");
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, float paramFloat)
/*     */   {
/* 383 */     if ((!this.f) || (paramyz == null)) { return;
/*     */     }
/* 385 */     float f1 = paramyz.B + (paramyz.z - paramyz.B) * paramFloat;
/* 386 */     float f2 = paramyz.A + (paramyz.y - paramyz.A) * paramFloat;
/*     */     
/* 388 */     double d1 = paramyz.p + (paramyz.s - paramyz.p) * paramFloat;
/* 389 */     double d2 = paramyz.q + (paramyz.t - paramyz.q) * paramFloat;
/* 390 */     double d3 = paramyz.r + (paramyz.u - paramyz.r) * paramFloat;
/*     */     
/* 392 */     float f3 = qh.b((f2 + 90.0F) * 0.017453292F);
/* 393 */     float f4 = qh.a((f2 + 90.0F) * 0.017453292F);
/*     */     
/* 395 */     float f5 = qh.b(-f1 * 0.017453292F);
/* 396 */     float f6 = qh.a(-f1 * 0.017453292F);
/*     */     
/* 398 */     float f7 = qh.b((-f1 + 90.0F) * 0.017453292F);
/* 399 */     float f8 = qh.a((-f1 + 90.0F) * 0.017453292F);
/*     */     
/* 401 */     float f9 = f3 * f5;
/* 402 */     float f10 = f6;
/* 403 */     float f11 = f4 * f5;
/*     */     
/* 405 */     float f12 = f3 * f7;
/* 406 */     float f13 = f8;
/* 407 */     float f14 = f4 * f7;
/*     */     
/* 409 */     this.e.setListenerPosition((float)d1, (float)d2, (float)d3);
/* 410 */     this.e.setListenerOrientation(f9, f10, f11, f12, f13, f14);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\btj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */