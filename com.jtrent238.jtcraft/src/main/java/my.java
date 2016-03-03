/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public class my
/*     */ {
/*  25 */   private static final Logger p = ;
/*     */   public sa a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public int e;
/*     */   public int f;
/*     */   public int g;
/*     */   public int h;
/*     */   public int i;
/*     */   public double j;
/*     */   public double k;
/*     */   public double l;
/*     */   public int m;
/*     */   private double q;
/*     */   private double r;
/*     */   private double s;
/*     */   private boolean t;
/*     */   private boolean u;
/*  44 */   private int v; private sa w; private boolean x; public boolean n; public Set o = new HashSet();
/*     */   
/*     */   public my(sa paramsa, int paramInt1, int paramInt2, boolean paramBoolean) {
/*  47 */     this.a = paramsa;
/*  48 */     this.b = paramInt1;
/*  49 */     this.c = paramInt2;
/*  50 */     this.u = paramBoolean;
/*     */     
/*  52 */     this.d = qh.c(paramsa.s * 32.0D);
/*  53 */     this.e = qh.c(paramsa.t * 32.0D);
/*  54 */     this.f = qh.c(paramsa.u * 32.0D);
/*  55 */     this.g = qh.d(paramsa.y * 256.0F / 360.0F);
/*  56 */     this.h = qh.d(paramsa.z * 256.0F / 360.0F);
/*     */     
/*  58 */     this.i = qh.d(paramsa.au() * 256.0F / 360.0F);
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*  62 */     if ((paramObject instanceof my)) {
/*  63 */       return ((my)paramObject).a.y() == this.a.y();
/*     */     }
/*     */     
/*  66 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  70 */     return this.a.y();
/*     */   }
/*     */   
/*     */   public void a(List paramList) {
/*  74 */     this.n = false;
/*  75 */     if ((!this.t) || (this.a.e(this.q, this.r, this.s) > 16.0D)) {
/*  76 */       this.q = this.a.s;
/*  77 */       this.r = this.a.t;
/*  78 */       this.s = this.a.u;
/*  79 */       this.t = true;
/*  80 */       this.n = true;
/*  81 */       b(paramList);
/*     */     }
/*     */     
/*  84 */     if ((this.w != this.a.m) || ((this.a.m != null) && (this.m % 60 == 0))) {
/*  85 */       this.w = this.a.m;
/*  86 */       a(new hx(0, this.a, this.a.m));
/*     */     }
/*     */     
/*  89 */     if (((this.a instanceof st)) && (this.m % 10 == 0)) {
/*  90 */       st localst = (st)this.a;
/*  91 */       add localadd = localst.j();
/*     */       ayi localayi;
/*  93 */       if ((localadd != null) && ((localadd.b() instanceof adh))) {
/*  94 */         localayi = ade.aY.a(localadd, this.a.o);
/*  95 */         for (yz localyz : paramList) {
/*  96 */           mw localmw = (mw)localyz;
/*  97 */           localayi.a(localmw, localadd);
/*     */           
/*  99 */           ft localft = ade.aY.c(localadd, this.a.o, localmw);
/* 100 */           if (localft != null) { localmw.a.a(localft);
/*     */           }
/*     */         }
/*     */       }
/* 104 */       b();
/* 105 */     } else if ((this.m % this.c == 0) || (this.a.al) || (this.a.z().a())) { int i2;
/* 106 */       int i3; if (this.a.m == null) {
/* 107 */         this.v += 1;
/* 108 */         i1 = this.a.as.a(this.a.s);
/* 109 */         i2 = qh.c(this.a.t * 32.0D);
/* 110 */         i3 = this.a.as.a(this.a.u);
/* 111 */         int i4 = qh.d(this.a.y * 256.0F / 360.0F);
/* 112 */         int i5 = qh.d(this.a.z * 256.0F / 360.0F);
/*     */         
/* 114 */         int i6 = i1 - this.d;
/* 115 */         int i7 = i2 - this.e;
/* 116 */         int i8 = i3 - this.f;
/*     */         
/* 118 */         Object localObject = null;
/*     */         
/* 120 */         int i9 = (Math.abs(i6) >= 4) || (Math.abs(i7) >= 4) || (Math.abs(i8) >= 4) || (this.m % 60 == 0) ? 1 : 0;
/* 121 */         int i10 = (Math.abs(i4 - this.g) >= 4) || (Math.abs(i5 - this.h) >= 4) ? 1 : 0;
/*     */         
/*     */ 
/*     */ 
/*     */ 
/* 126 */         if ((this.m > 0) || ((this.a instanceof zc))) {
/* 127 */           if ((i6 < -128) || (i6 >= 128) || (i7 < -128) || (i7 >= 128) || (i8 < -128) || (i8 >= 128) || (this.v > 400) || (this.x)) {
/* 128 */             this.v = 0;
/* 129 */             localObject = new ik(this.a.y(), i1, i2, i3, (byte)i4, (byte)i5);
/*     */           }
/* 131 */           else if ((i9 != 0) && (i10 != 0)) {
/* 132 */             localObject = new hh(this.a.y(), (byte)i6, (byte)i7, (byte)i8, (byte)i4, (byte)i5);
/* 133 */           } else if (i9 != 0) {
/* 134 */             localObject = new hg(this.a.y(), (byte)i6, (byte)i7, (byte)i8);
/* 135 */           } else if (i10 != 0) {
/* 136 */             localObject = new hi(this.a.y(), (byte)i4, (byte)i5);
/*     */           }
/*     */         }
/*     */         
/*     */ 
/* 141 */         if (this.u) {
/* 142 */           double d1 = this.a.v - this.j;
/* 143 */           double d2 = this.a.w - this.k;
/* 144 */           double d3 = this.a.x - this.l;
/*     */           
/* 146 */           double d4 = 0.02D;
/*     */           
/* 148 */           double d5 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */           
/* 150 */           if ((d5 > d4 * d4) || ((d5 > 0.0D) && (this.a.v == 0.0D) && (this.a.w == 0.0D) && (this.a.x == 0.0D))) {
/* 151 */             this.j = this.a.v;
/* 152 */             this.k = this.a.w;
/* 153 */             this.l = this.a.x;
/* 154 */             a(new hy(this.a.y(), this.j, this.k, this.l));
/*     */           }
/*     */         }
/*     */         
/* 158 */         if (localObject != null) {
/* 159 */           a((ft)localObject);
/*     */         }
/*     */         
/* 162 */         b();
/*     */         
/* 164 */         if (i9 != 0) {
/* 165 */           this.d = i1;
/* 166 */           this.e = i2;
/* 167 */           this.f = i3;
/*     */         }
/* 169 */         if (i10 != 0) {
/* 170 */           this.g = i4;
/* 171 */           this.h = i5;
/*     */         }
/*     */         
/* 174 */         this.x = false;
/*     */       }
/*     */       else {
/* 177 */         i1 = qh.d(this.a.y * 256.0F / 360.0F);
/* 178 */         i2 = qh.d(this.a.z * 256.0F / 360.0F);
/* 179 */         i3 = (Math.abs(i1 - this.g) >= 4) || (Math.abs(i2 - this.h) >= 4) ? 1 : 0;
/* 180 */         if (i3 != 0) {
/* 181 */           a(new hi(this.a.y(), (byte)i1, (byte)i2));
/* 182 */           this.g = i1;
/* 183 */           this.h = i2;
/*     */         }
/*     */         
/* 186 */         this.d = this.a.as.a(this.a.s);
/* 187 */         this.e = qh.c(this.a.t * 32.0D);
/* 188 */         this.f = this.a.as.a(this.a.u);
/*     */         
/* 190 */         b();
/*     */         
/* 192 */         this.x = true;
/*     */       }
/*     */       
/* 195 */       int i1 = qh.d(this.a.au() * 256.0F / 360.0F);
/* 196 */       if (Math.abs(i1 - this.i) >= 4) {
/* 197 */         a(new ht(this.a, (byte)i1));
/* 198 */         this.i = i1;
/*     */       }
/* 200 */       this.a.al = false;
/*     */     }
/*     */     
/* 203 */     this.m += 1;
/*     */     
/* 205 */     if (this.a.H) {
/* 206 */       b(new hy(this.a));
/* 207 */       this.a.H = false;
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 212 */     te localte = this.a.z();
/* 213 */     if (localte.a()) {
/* 214 */       b(new hw(this.a.y(), localte, false));
/*     */     }
/*     */     
/* 217 */     if ((this.a instanceof sv)) {
/* 218 */       tq localtq = (tq)((sv)this.a).bc();
/* 219 */       Set localSet = localtq.b();
/*     */       
/* 221 */       if (!localSet.isEmpty()) {
/* 222 */         b(new il(this.a.y(), localSet));
/*     */       }
/*     */       
/* 225 */       localSet.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ft paramft) {
/* 230 */     for (mw localmw : this.o) {
/* 231 */       localmw.a.a(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ft paramft) {
/* 236 */     a(paramft);
/* 237 */     if ((this.a instanceof mw)) {
/* 238 */       ((mw)this.a).a.a(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 243 */     for (mw localmw : this.o) {
/* 244 */       localmw.d(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(mw parammw) {
/* 249 */     if (this.o.contains(parammw)) {
/* 250 */       parammw.d(this.a);
/* 251 */       this.o.remove(parammw);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(mw parammw) {
/* 256 */     if (parammw == this.a) { return;
/*     */     }
/* 258 */     double d1 = parammw.s - this.d / 32;
/* 259 */     double d2 = parammw.u - this.f / 32;
/* 260 */     Object localObject2; if ((d1 >= -this.b) && (d1 <= this.b) && (d2 >= -this.b) && (d2 <= this.b)) {
/* 261 */       if ((!this.o.contains(parammw)) && ((d(parammw)) || (this.a.n))) {
/* 262 */         this.o.add(parammw);
/* 263 */         ft localft = c();
/* 264 */         parammw.a.a(localft);
/*     */         
/* 266 */         if (!this.a.z().d()) {
/* 267 */           parammw.a.a(new hw(this.a.y(), this.a.z(), true));
/*     */         }
/*     */         
/* 270 */         if ((this.a instanceof sv)) {
/* 271 */           tq localtq = (tq)((sv)this.a).bc();
/* 272 */           localObject2 = localtq.c();
/*     */           
/* 274 */           if (!((Collection)localObject2).isEmpty()) {
/* 275 */             parammw.a.a(new il(this.a.y(), (Collection)localObject2));
/*     */           }
/*     */         }
/*     */         
/* 279 */         this.j = this.a.v;
/* 280 */         this.k = this.a.w;
/* 281 */         this.l = this.a.x;
/*     */         
/* 283 */         if ((this.u) && (!(localft instanceof fz))) {
/* 284 */           parammw.a.a(new hy(this.a.y(), this.a.v, this.a.w, this.a.x));
/*     */         }
/*     */         
/* 287 */         if (this.a.m != null) {
/* 288 */           parammw.a.a(new hx(0, this.a, this.a.m));
/*     */         }
/* 290 */         if (((this.a instanceof sw)) && (((sw)this.a).bO() != null)) {
/* 291 */           parammw.a.a(new hx(1, this.a, ((sw)this.a).bO()));
/*     */         }
/*     */         
/* 294 */         if ((this.a instanceof sv)) {
/* 295 */           for (int i1 = 0; i1 < 5; i1++) {
/* 296 */             localObject2 = ((sv)this.a).q(i1);
/* 297 */             if (localObject2 != null) parammw.a.a(new hz(this.a.y(), i1, (add)localObject2));
/*     */           }
/*     */         }
/*     */         Object localObject1;
/* 301 */         if ((this.a instanceof yz)) {
/* 302 */           localObject1 = (yz)this.a;
/* 303 */           if (((yz)localObject1).bm()) {
/* 304 */             parammw.a.a(new hp((yz)localObject1, qh.c(this.a.s), qh.c(this.a.t), qh.c(this.a.u)));
/*     */           }
/*     */         }
/*     */         
/* 308 */         if ((this.a instanceof sv)) {
/* 309 */           localObject1 = (sv)this.a;
/* 310 */           for (localObject2 = ((sv)localObject1).aQ().iterator(); ((Iterator)localObject2).hasNext();) { rw localrw = (rw)((Iterator)localObject2).next();
/* 311 */             parammw.a.a(new in(this.a.y(), localrw));
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 316 */     else if (this.o.contains(parammw)) {
/* 317 */       this.o.remove(parammw);
/* 318 */       parammw.d(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean d(mw parammw)
/*     */   {
/* 324 */     return parammw.r().t().a(parammw, this.a.ah, this.a.aj);
/*     */   }
/*     */   
/*     */   public void b(List paramList) {
/* 328 */     for (int i1 = 0; i1 < paramList.size(); i1++) {
/* 329 */       b((mw)paramList.get(i1));
/*     */     }
/*     */   }
/*     */   
/*     */   private ft c() {
/* 334 */     if (this.a.K) {
/* 335 */       p.warn("Fetching addPacket for removed entity");
/*     */     }
/*     */     
/* 338 */     if ((this.a instanceof xk)) {
/* 339 */       return new fw(this.a, 2, 1);
/*     */     }
/* 341 */     if ((this.a instanceof mw))
/* 342 */       return new gb((yz)this.a);
/*     */     Object localObject;
/* 344 */     if ((this.a instanceof xl)) {
/* 345 */       localObject = (xl)this.a;
/* 346 */       return new fw(this.a, 10, ((xl)localObject).m());
/*     */     }
/* 348 */     if ((this.a instanceof xi)) {
/* 349 */       return new fw(this.a, 1);
/*     */     }
/* 351 */     if (((this.a instanceof ry)) || ((this.a instanceof xa))) {
/* 352 */       this.i = qh.d(this.a.au() * 256.0F / 360.0F);
/* 353 */       return new fz((sv)this.a);
/*     */     }
/* 355 */     if ((this.a instanceof xe)) {
/* 356 */       localObject = ((xe)this.a).b;
/* 357 */       return new fw(this.a, 90, localObject != null ? ((sa)localObject).y() : this.a.y());
/*     */     }
/* 359 */     if ((this.a instanceof zc)) {
/* 360 */       localObject = ((zc)this.a).c;
/* 361 */       return new fw(this.a, 60, localObject != null ? ((sa)localObject).y() : this.a.y());
/*     */     }
/* 363 */     if ((this.a instanceof zj)) {
/* 364 */       return new fw(this.a, 61);
/*     */     }
/* 366 */     if ((this.a instanceof zo)) {
/* 367 */       return new fw(this.a, 73, ((zo)this.a).k());
/*     */     }
/* 369 */     if ((this.a instanceof zn)) {
/* 370 */       return new fw(this.a, 75);
/*     */     }
/* 372 */     if ((this.a instanceof zm)) {
/* 373 */       return new fw(this.a, 65);
/*     */     }
/* 375 */     if ((this.a instanceof zd)) {
/* 376 */       return new fw(this.a, 72);
/*     */     }
/* 378 */     if ((this.a instanceof zf))
/* 379 */       return new fw(this.a, 76);
/*     */     fw localfw;
/* 381 */     if ((this.a instanceof ze)) {
/* 382 */       localObject = (ze)this.a;
/* 383 */       localfw = null;
/* 384 */       int i1 = 63;
/* 385 */       if ((this.a instanceof zi)) {
/* 386 */         i1 = 64;
/* 387 */       } else if ((this.a instanceof zp)) {
/* 388 */         i1 = 66;
/*     */       }
/* 390 */       if (((ze)localObject).a != null) {
/* 391 */         localfw = new fw(this.a, i1, ((ze)this.a).a.y());
/*     */       } else {
/* 393 */         localfw = new fw(this.a, i1, 0);
/*     */       }
/* 395 */       localfw.d((int)(((ze)localObject).b * 8000.0D));
/* 396 */       localfw.e((int)(((ze)localObject).c * 8000.0D));
/* 397 */       localfw.f((int)(((ze)localObject).d * 8000.0D));
/* 398 */       return localfw;
/*     */     }
/* 400 */     if ((this.a instanceof zl)) {
/* 401 */       return new fw(this.a, 62);
/*     */     }
/* 403 */     if ((this.a instanceof xw)) {
/* 404 */       return new fw(this.a, 50);
/*     */     }
/* 406 */     if ((this.a instanceof wz)) {
/* 407 */       return new fw(this.a, 51);
/*     */     }
/* 409 */     if ((this.a instanceof xj)) {
/* 410 */       localObject = (xj)this.a;
/* 411 */       return new fw(this.a, 70, aji.b(((xj)localObject).f()) | ((xj)localObject).a << 16);
/*     */     }
/* 413 */     if ((this.a instanceof tb)) {
/* 414 */       return new ga((tb)this.a);
/*     */     }
/* 416 */     if ((this.a instanceof st)) {
/* 417 */       localObject = (st)this.a;
/* 418 */       localfw = new fw(this.a, 71, ((st)localObject).a);
/* 419 */       localfw.a(qh.d(((st)localObject).b * 32));
/* 420 */       localfw.b(qh.d(((st)localObject).c * 32));
/* 421 */       localfw.c(qh.d(((st)localObject).d * 32));
/* 422 */       return localfw;
/*     */     }
/* 424 */     if ((this.a instanceof su)) {
/* 425 */       localObject = (su)this.a;
/* 426 */       localfw = new fw(this.a, 77);
/* 427 */       localfw.a(qh.d(((su)localObject).b * 32));
/* 428 */       localfw.b(qh.d(((su)localObject).c * 32));
/* 429 */       localfw.c(qh.d(((su)localObject).d * 32));
/* 430 */       return localfw;
/*     */     }
/* 432 */     if ((this.a instanceof sq)) {
/* 433 */       return new fx((sq)this.a);
/*     */     }
/* 435 */     throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
/*     */   }
/*     */   
/*     */   public void c(mw parammw) {
/* 439 */     if (this.o.contains(parammw)) {
/* 440 */       this.o.remove(parammw);
/* 441 */       parammw.d(this.a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\my.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */