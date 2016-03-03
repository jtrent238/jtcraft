/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.File;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import tv.twitch.chat.ChatUserInfo;
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
/*     */ public class bct
/*     */   extends bdw
/*     */   implements bcv
/*     */ {
/*  38 */   private static final Set f = Sets.newHashSet(new String[] { "http", "https" });
/*     */   
/*  40 */   private static final Logger g = LogManager.getLogger();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  45 */   private String h = "";
/*  46 */   private int i = -1;
/*     */   private boolean r;
/*     */   private boolean s;
/*     */   private int t;
/*  50 */   private List u = new ArrayList();
/*     */   private URI v;
/*     */   protected bcd a;
/*  53 */   private String w = "";
/*     */   
/*     */   public bct() {}
/*     */   
/*     */   public bct(String paramString)
/*     */   {
/*  59 */     this.w = paramString;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  64 */     Keyboard.enableRepeatEvents(true);
/*     */     
/*  66 */     this.i = this.k.r.b().c().size();
/*  67 */     this.a = new bcd(this.q, 4, this.m - 12, this.l - 4, 12);
/*  68 */     this.a.f(100);
/*  69 */     this.a.a(false);
/*  70 */     this.a.b(true);
/*  71 */     this.a.a(this.w);
/*  72 */     this.a.d(false);
/*     */   }
/*     */   
/*     */   public void m()
/*     */   {
/*  77 */     Keyboard.enableRepeatEvents(false);
/*     */     
/*  79 */     this.k.r.b().d();
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  84 */     this.a.a();
/*     */   }
/*     */   
/*     */   protected void a(char paramChar, int paramInt)
/*     */   {
/*  89 */     this.s = false;
/*     */     
/*  91 */     if (paramInt == 15) {
/*  92 */       a();
/*     */     } else {
/*  94 */       this.r = false;
/*     */     }
/*     */     
/*  97 */     if (paramInt == 1) {
/*  98 */       this.k.a(null);
/*  99 */     } else if ((paramInt == 28) || (paramInt == 156)) {
/* 100 */       String str = this.a.b().trim();
/*     */       
/* 102 */       if (str.length() > 0) {
/* 103 */         a(str);
/*     */       }
/*     */       
/* 106 */       this.k.a(null);
/* 107 */     } else if (paramInt == 200) {
/* 108 */       b(-1);
/* 109 */     } else if (paramInt == 208) {
/* 110 */       b(1);
/* 111 */     } else if (paramInt == 201) {
/* 112 */       this.k.r.b().b(this.k.r.b().i() - 1);
/* 113 */     } else if (paramInt == 209) {
/* 114 */       this.k.r.b().b(-this.k.r.b().i() + 1);
/*     */     } else {
/* 116 */       this.a.a(paramChar, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 121 */     this.k.r.b().a(paramString);
/* 122 */     this.k.h.a(paramString);
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 127 */     super.k();
/*     */     
/* 129 */     int j = Mouse.getEventDWheel();
/*     */     
/* 131 */     if (j != 0) {
/* 132 */       if (j > 1) j = 1;
/* 133 */       if (j < -1) j = -1;
/* 134 */       if (!r()) j *= 7;
/* 135 */       this.k.r.b().b(j);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 141 */     if ((paramInt3 == 0) && 
/* 142 */       (this.k.u.o)) {
/* 143 */       fj localfj = this.k.r.b().a(Mouse.getX(), Mouse.getY());
/*     */       
/* 145 */       if (localfj != null) {
/* 146 */         fh localfh = localfj.b().h();
/* 147 */         if (localfh != null) {
/* 148 */           if (r()) {
/* 149 */             this.a.b(localfj.e());
/*     */           }
/* 151 */           else if (localfh.a() == fi.a) {
/*     */             try {
/* 153 */               URI localURI = new URI(localfh.b());
/*     */               
/* 155 */               if (!f.contains(localURI.getScheme().toLowerCase())) {
/* 156 */                 throw new URISyntaxException(localfh.b(), "Unsupported protocol: " + localURI.getScheme().toLowerCase());
/*     */               }
/*     */               
/* 159 */               if (this.k.u.p) {
/* 160 */                 this.v = localURI;
/* 161 */                 this.k.a(new bcu(this, localfh.b(), 0, false));
/*     */               } else {
/* 163 */                 a(localURI);
/*     */               }
/*     */             } catch (URISyntaxException localURISyntaxException) {
/* 166 */               g.error("Can't open url for " + localfh, localURISyntaxException);
/*     */             } } else { Object localObject;
/* 168 */             if (localfh.a() == fi.b) {
/* 169 */               localObject = new File(localfh.b()).toURI();
/* 170 */               a((URI)localObject);
/* 171 */             } else if (localfh.a() == fi.e) {
/* 172 */               this.a.a(localfh.b());
/* 173 */             } else if (localfh.a() == fi.c) {
/* 174 */               a(localfh.b());
/* 175 */             } else if (localfh.a() == fi.d) {
/* 176 */               localObject = this.k.Z().a(localfh.b());
/* 177 */               if (localObject != null) {
/* 178 */                 this.k.a(new bgs(this.k.Z(), (ChatUserInfo)localObject));
/*     */               } else {
/* 180 */                 g.error("Tried to handle twitch user but couldn't find them!");
/*     */               }
/*     */             } else {
/* 183 */               g.error("Don't know how to handle " + localfh);
/*     */             }
/*     */           }
/*     */           
/* 187 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 193 */     this.a.a(paramInt1, paramInt2, paramInt3);
/* 194 */     super.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean, int paramInt)
/*     */   {
/* 199 */     if (paramInt == 0) {
/* 200 */       if (paramBoolean) {
/* 201 */         a(this.v);
/*     */       }
/*     */       
/* 204 */       this.v = null;
/* 205 */       this.k.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(URI paramURI) {
/*     */     try {
/* 211 */       Class localClass = Class.forName("java.awt.Desktop");
/* 212 */       Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 213 */       localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { paramURI });
/*     */     } catch (Throwable localThrowable) {
/* 215 */       g.error("Couldn't open link", localThrowable);
/*     */     } }
/*     */   
/*     */   public void a() { Object localObject;
/*     */     String str;
/* 220 */     if (this.r) {
/* 221 */       this.a.b(this.a.a(-1, this.a.h(), false) - this.a.h());
/* 222 */       if (this.t >= this.u.size()) this.t = 0;
/*     */     } else {
/* 224 */       int j = this.a.a(-1, this.a.h(), false);
/*     */       
/* 226 */       this.u.clear();
/* 227 */       this.t = 0;
/* 228 */       localObject = this.a.b().substring(j).toLowerCase();
/* 229 */       str = this.a.b().substring(0, this.a.h());
/*     */       
/* 231 */       a(str, (String)localObject);
/*     */       
/* 233 */       if (this.u.isEmpty()) { return;
/*     */       }
/* 235 */       this.r = true;
/*     */       
/* 237 */       this.a.b(j - this.a.h());
/*     */     }
/*     */     
/* 240 */     if (this.u.size() > 1) {
/* 241 */       StringBuilder localStringBuilder = new StringBuilder();
/*     */       
/* 243 */       for (localObject = this.u.iterator(); ((Iterator)localObject).hasNext();) { str = (String)((Iterator)localObject).next();
/* 244 */         if (localStringBuilder.length() > 0) localStringBuilder.append(", ");
/* 245 */         localStringBuilder.append(str);
/*     */       }
/*     */       
/* 248 */       this.k.r.b().a(new fq(localStringBuilder.toString()), 1);
/*     */     }
/*     */     
/* 251 */     this.a.b((String)this.u.get(this.t++));
/*     */   }
/*     */   
/*     */   private void a(String paramString1, String paramString2) {
/* 255 */     if (paramString1.length() < 1) { return;
/*     */     }
/* 257 */     this.k.h.a.a(new iq(paramString1));
/* 258 */     this.s = true;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 262 */     int j = this.i + paramInt;
/* 263 */     int k = this.k.r.b().c().size();
/*     */     
/* 265 */     if (j < 0) j = 0;
/* 266 */     if (j > k) j = k;
/* 267 */     if (j == this.i) { return;
/*     */     }
/* 269 */     if (j == k) {
/* 270 */       this.i = k;
/* 271 */       this.a.a(this.h);
/* 272 */       return; }
/* 273 */     if (this.i == k) {
/* 274 */       this.h = this.a.b();
/*     */     }
/*     */     
/* 277 */     this.a.a((String)this.k.r.b().c().get(j));
/* 278 */     this.i = j;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 283 */     a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
/* 284 */     this.a.f();
/*     */     
/* 286 */     fj localfj1 = this.k.r.b().a(Mouse.getX(), Mouse.getY());
/* 287 */     if ((localfj1 != null) && (localfj1.b().i() != null)) {
/* 288 */       fl localfl = localfj1.b().i();
/*     */       Object localObject;
/* 290 */       if (localfl.a() == fm.c) {
/* 291 */         localObject = null;
/*     */         try
/*     */         {
/* 294 */           dy localdy = eb.a(localfl.b().c());
/* 295 */           if ((localdy != null) && ((localdy instanceof dh))) {
/* 296 */             localObject = add.a((dh)localdy);
/*     */           }
/*     */         }
/*     */         catch (ea localea) {}
/* 300 */         if (localObject != null) {
/* 301 */           a((add)localObject, paramInt1, paramInt2);
/*     */         } else {
/* 303 */           a(a.m + "Invalid Item!", paramInt1, paramInt2);
/*     */         }
/* 305 */       } else if (localfl.a() == fm.a) {
/* 306 */         a(Splitter.on("\n").splitToList(localfl.b().d()), paramInt1, paramInt2);
/* 307 */       } else if (localfl.a() == fm.b) {
/* 308 */         localObject = pp.a(localfl.b().c());
/*     */         
/* 310 */         if (localObject != null) {
/* 311 */           fj localfj2 = ((ph)localObject).e();
/* 312 */           fr localfr = new fr("stats.tooltip.type." + (((ph)localObject).d() ? "achievement" : "statistic"), new Object[0]);
/* 313 */           localfr.b().b(Boolean.valueOf(true));
/* 314 */           String str = (localObject instanceof pb) ? ((pb)localObject).f() : null;
/* 315 */           ArrayList localArrayList = Lists.newArrayList(new String[] { localfj2.d(), localfr.d() });
/* 316 */           if (str != null) localArrayList.addAll(this.q.c(str, 150));
/* 317 */           a(localArrayList, paramInt1, paramInt2);
/*     */         } else {
/* 319 */           a(a.m + "Invalid statistic/achievement!", paramInt1, paramInt2);
/*     */         }
/*     */       }
/*     */       
/* 323 */       GL11.glDisable(2896);
/*     */     }
/*     */     
/* 326 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */   
/*     */   public void a(String[] paramArrayOfString) {
/* 330 */     if (this.s) {
/* 331 */       this.r = false;
/* 332 */       this.u.clear();
/*     */       
/* 334 */       for (Object localObject2 : paramArrayOfString) {
/* 335 */         if (((String)localObject2).length() > 0) {
/* 336 */           this.u.add(localObject2);
/*     */         }
/*     */       }
/*     */       
/* 340 */       ??? = this.a.b().substring(this.a.a(-1, this.a.h(), false));
/* 341 */       String str = StringUtils.getCommonPrefix(paramArrayOfString);
/*     */       
/* 343 */       if ((str.length() > 0) && (!((String)???).equalsIgnoreCase(str))) {
/* 344 */         this.a.b(this.a.a(-1, this.a.h(), false) - this.a.h());
/* 345 */         this.a.b(str);
/* 346 */       } else if (this.u.size() > 0) {
/* 347 */         this.r = true;
/* 348 */         a();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 355 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */