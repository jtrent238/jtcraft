/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class mq
/*     */ {
/*  17 */   private static final Logger a = ;
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
/*     */   private final mt b;
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
/* 166 */   private final List c = new ArrayList();
/* 167 */   private final qd d = new qd();
/* 168 */   private final List e = new ArrayList();
/* 169 */   private final List f = new ArrayList();
/*     */   private int g;
/*     */   private long h;
/*     */   
/*     */   public mq(mt parammt) {
/* 174 */     this.b = parammt;
/*     */     
/* 176 */     a(parammt.q().ah().s());
/*     */   }
/*     */   
/*     */   public mt a() {
/* 180 */     return this.b;
/*     */   }
/*     */   
/*     */   public void b() {
/* 184 */     long l = this.b.I();
/*     */     int j;
/* 186 */     mr localmr; if (l - this.h > 8000L) {
/* 187 */       this.h = l;
/*     */       
/* 189 */       for (j = 0; j < this.f.size(); j++) {
/* 190 */         localmr = (mr)this.f.get(j);
/* 191 */         localmr.b();
/* 192 */         localmr.a();
/*     */       }
/*     */     } else {
/* 195 */       for (j = 0; j < this.e.size(); j++) {
/* 196 */         localmr = (mr)this.e.get(j);
/* 197 */         localmr.b();
/*     */       }
/*     */     }
/*     */     
/* 201 */     this.e.clear();
/*     */     
/* 203 */     if (this.c.isEmpty()) {
/* 204 */       aqo localaqo = this.b.t;
/* 205 */       if (!localaqo.e()) {
/* 206 */         this.b.b.b();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2) {
/* 212 */     long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32;
/* 213 */     return this.d.a(l) != null;
/*     */   }
/*     */   
/*     */   private mr a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 217 */     long l = paramInt1 + 2147483647L | paramInt2 + 2147483647L << 32;
/* 218 */     mr localmr = (mr)this.d.a(l);
/* 219 */     if ((localmr == null) && (paramBoolean)) {
/* 220 */       localmr = new mr(this, paramInt1, paramInt2);
/* 221 */       this.d.a(l, localmr);
/* 222 */       this.f.add(localmr);
/*     */     }
/* 224 */     return localmr;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3) {
/* 228 */     int j = paramInt1 >> 4;
/* 229 */     int k = paramInt3 >> 4;
/* 230 */     mr localmr = a(j, k, false);
/* 231 */     if (localmr != null) {
/* 232 */       localmr.a(paramInt1 & 0xF, paramInt2, paramInt3 & 0xF);
/*     */     }
/*     */   }
/*     */   
/* 236 */   private final int[][] i = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
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
/*     */   public void a(mw parammw)
/*     */   {
/* 249 */     int j = (int)parammw.s >> 4;
/* 250 */     int k = (int)parammw.u >> 4;
/*     */     
/* 252 */     parammw.d = parammw.s;
/* 253 */     parammw.e = parammw.u;
/*     */     
/* 255 */     for (int m = j - this.g; m <= j + this.g; m++) {
/* 256 */       for (int n = k - this.g; n <= k + this.g; n++) {
/* 257 */         a(m, n, true).a(parammw);
/*     */       }
/*     */     }
/*     */     
/* 261 */     this.c.add(parammw);
/* 262 */     b(parammw);
/*     */   }
/*     */   
/*     */   public void b(mw parammw) {
/* 266 */     ArrayList localArrayList = new ArrayList(parammw.f);
/* 267 */     int j = 0;
/* 268 */     int k = this.g;
/* 269 */     int m = (int)parammw.s >> 4;
/* 270 */     int n = (int)parammw.u >> 4;
/* 271 */     int i1 = 0;
/* 272 */     int i2 = 0;
/* 273 */     agu localagu = mr.a(a(m, n, true));
/*     */     
/* 275 */     parammw.f.clear();
/*     */     
/*     */ 
/* 278 */     if (localArrayList.contains(localagu)) {
/* 279 */       parammw.f.add(localagu);
/*     */     }
/*     */     
/*     */ 
/* 283 */     for (int i3 = 1; i3 <= k * 2; i3++) {
/* 284 */       for (int i4 = 0; i4 < 2; i4++) {
/* 285 */         int[] arrayOfInt = this.i[(j++ % 4)];
/*     */         
/* 287 */         for (int i5 = 0; i5 < i3; i5++) {
/* 288 */           i1 += arrayOfInt[0];
/* 289 */           i2 += arrayOfInt[1];
/*     */           
/* 291 */           localagu = mr.a(a(m + i1, n + i2, true));
/* 292 */           if (localArrayList.contains(localagu)) {
/* 293 */             parammw.f.add(localagu);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 300 */     j %= 4;
/* 301 */     for (i3 = 0; i3 < k * 2; i3++) {
/* 302 */       i1 += this.i[j][0];
/* 303 */       i2 += this.i[j][1];
/*     */       
/* 305 */       localagu = mr.a(a(m + i1, n + i2, true));
/* 306 */       if (localArrayList.contains(localagu)) {
/* 307 */         parammw.f.add(localagu);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(mw parammw) {
/* 313 */     int j = (int)parammw.d >> 4;
/* 314 */     int k = (int)parammw.e >> 4;
/*     */     
/* 316 */     for (int m = j - this.g; m <= j + this.g; m++) {
/* 317 */       for (int n = k - this.g; n <= k + this.g; n++) {
/* 318 */         mr localmr = a(m, n, false);
/* 319 */         if (localmr != null) { localmr.b(parammw);
/*     */         }
/*     */       }
/*     */     }
/* 323 */     this.c.remove(parammw);
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/* 327 */     int j = paramInt1 - paramInt3;
/* 328 */     int k = paramInt2 - paramInt4;
/* 329 */     if ((j < -paramInt5) || (j > paramInt5)) return false;
/* 330 */     if ((k < -paramInt5) || (k > paramInt5)) return false;
/* 331 */     return true;
/*     */   }
/*     */   
/*     */   public void d(mw parammw) {
/* 335 */     int j = (int)parammw.s >> 4;
/* 336 */     int k = (int)parammw.u >> 4;
/*     */     
/* 338 */     double d1 = parammw.d - parammw.s;
/* 339 */     double d2 = parammw.e - parammw.u;
/* 340 */     double d3 = d1 * d1 + d2 * d2;
/* 341 */     if (d3 < 64.0D) { return;
/*     */     }
/* 343 */     int m = (int)parammw.d >> 4;
/* 344 */     int n = (int)parammw.e >> 4;
/* 345 */     int i1 = this.g;
/*     */     
/* 347 */     int i2 = j - m;
/* 348 */     int i3 = k - n;
/* 349 */     if ((i2 == 0) && (i3 == 0)) { return;
/*     */     }
/* 351 */     for (int i4 = j - i1; i4 <= j + i1; i4++) {
/* 352 */       for (int i5 = k - i1; i5 <= k + i1; i5++) {
/* 353 */         if (!a(i4, i5, m, n, i1)) {
/* 354 */           a(i4, i5, true).a(parammw);
/*     */         }
/* 356 */         if (!a(i4 - i2, i5 - i3, j, k, i1)) {
/* 357 */           mr localmr = a(i4 - i2, i5 - i3, false);
/* 358 */           if (localmr != null) { localmr.b(parammw);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 363 */     b(parammw);
/*     */     
/* 365 */     parammw.d = parammw.s;
/* 366 */     parammw.e = parammw.u;
/*     */   }
/*     */   
/*     */   public boolean a(mw parammw, int paramInt1, int paramInt2) {
/* 370 */     mr localmr = a(paramInt1, paramInt2, false);
/*     */     
/* 372 */     return (localmr != null) && (mr.b(localmr).contains(parammw)) && (!parammw.f.contains(mr.a(localmr)));
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 376 */     paramInt = qh.a(paramInt, 3, 20);
/* 377 */     if (paramInt == this.g) return;
/* 378 */     int j = paramInt - this.g;
/*     */     
/* 380 */     for (mw localmw : this.c) {
/* 381 */       int k = (int)localmw.s >> 4;
/* 382 */       int m = (int)localmw.u >> 4;
/*     */       int n;
/* 384 */       int i1; if (j > 0) {
/* 385 */         for (n = k - paramInt; n <= k + paramInt; n++) {
/* 386 */           for (i1 = m - paramInt; i1 <= m + paramInt; i1++) {
/* 387 */             mr localmr = a(n, i1, true);
/*     */             
/* 389 */             if (!mr.b(localmr).contains(localmw)) {
/* 390 */               localmr.a(localmw);
/*     */             }
/*     */           }
/*     */         }
/*     */       } else {
/* 395 */         for (n = k - this.g; n <= k + this.g; n++) {
/* 396 */           for (i1 = m - this.g; i1 <= m + this.g; i1++) {
/* 397 */             if (!a(n, i1, k, m, paramInt)) {
/* 398 */               a(n, i1, true).b(localmw);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 405 */     this.g = paramInt;
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 409 */     return paramInt * 16 - 16;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */