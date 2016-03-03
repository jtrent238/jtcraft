/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.TreeMap;
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
/*     */ public class vz
/*     */ {
/*     */   private ahb a;
/*  22 */   private final List b = new ArrayList();
/*     */   
/*  24 */   private final r c = new r(0, 0, 0);
/*  25 */   private final r d = new r(0, 0, 0);
/*     */   
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*  32 */   private TreeMap j = new TreeMap();
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
/*  44 */   private List k = new ArrayList();
/*     */   
/*     */   private int l;
/*     */   
/*     */   public vz() {}
/*     */   
/*     */   public vz(ahb paramahb)
/*     */   {
/*  52 */     this.a = paramahb;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/*  56 */     this.a = paramahb;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  60 */     this.g = paramInt;
/*  61 */     m();
/*  62 */     l();
/*  63 */     if (paramInt % 20 == 0) k();
/*  64 */     if (paramInt % 30 == 0) { j();
/*     */     }
/*  66 */     int m = this.h / 10;
/*  67 */     if ((this.l < m) && (this.b.size() > 20) && (this.a.s.nextInt(7000) == 0)) {
/*  68 */       azw localazw = a(qh.d(this.d.a), qh.d(this.d.b), qh.d(this.d.c), 2, 4, 2);
/*  69 */       if (localazw != null) {
/*  70 */         wt localwt = new wt(this.a);
/*  71 */         localwt.b(localazw.a, localazw.b, localazw.c);
/*  72 */         this.a.d(localwt);
/*  73 */         this.l += 1;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   private azw a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  81 */     for (int m = 0; m < 10; m++) {
/*  82 */       int n = paramInt1 + this.a.s.nextInt(16) - 8;
/*  83 */       int i1 = paramInt2 + this.a.s.nextInt(6) - 3;
/*  84 */       int i2 = paramInt3 + this.a.s.nextInt(16) - 8;
/*  85 */       if ((a(n, i1, i2)) && 
/*  86 */         (b(n, i1, i2, paramInt4, paramInt5, paramInt6))) return azw.a(n, i1, i2);
/*     */     }
/*  88 */     return null;
/*     */   }
/*     */   
/*     */   private boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  92 */     if (!ahb.a(this.a, paramInt1, paramInt2 - 1, paramInt3)) { return false;
/*     */     }
/*  94 */     int m = paramInt1 - paramInt4 / 2;
/*  95 */     int n = paramInt3 - paramInt6 / 2;
/*  96 */     for (int i1 = m; i1 < m + paramInt4; i1++) {
/*  97 */       for (int i2 = paramInt2; i2 < paramInt2 + paramInt5; i2++) {
/*  98 */         for (int i3 = n; i3 < n + paramInt6; i3++)
/*  99 */           if (this.a.a(i1, i2, i3).r()) return false;
/*     */       }
/*     */     }
/* 102 */     return true;
/*     */   }
/*     */   
/*     */   private void j()
/*     */   {
/* 107 */     List localList = this.a.a(wt.class, azt.a(this.d.a - this.e, this.d.b - 4, this.d.c - this.e, this.d.a + this.e, this.d.b + 4, this.d.c + this.e));
/*     */     
/* 109 */     this.l = localList.size();
/*     */   }
/*     */   
/*     */   private void k() {
/* 113 */     List localList = this.a.a(yv.class, azt.a(this.d.a - this.e, this.d.b - 4, this.d.c - this.e, this.d.a + this.e, this.d.b + 4, this.d.c + this.e));
/*     */     
/* 115 */     this.h = localList.size();
/*     */     
/* 117 */     if (this.h == 0)
/*     */     {
/* 119 */       this.j.clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public r a() {
/* 124 */     return this.d;
/*     */   }
/*     */   
/*     */   public int b() {
/* 128 */     return this.e;
/*     */   }
/*     */   
/*     */   public int c() {
/* 132 */     return this.b.size();
/*     */   }
/*     */   
/*     */   public int d() {
/* 136 */     return this.g - this.f;
/*     */   }
/*     */   
/*     */   public int e() {
/* 140 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2, int paramInt3) {
/* 144 */     return this.d.e(paramInt1, paramInt2, paramInt3) < this.e * this.e;
/*     */   }
/*     */   
/*     */   public List f() {
/* 148 */     return this.b;
/*     */   }
/*     */   
/*     */   public vy b(int paramInt1, int paramInt2, int paramInt3) {
/* 152 */     Object localObject = null;
/* 153 */     int m = Integer.MAX_VALUE;
/* 154 */     for (vy localvy : this.b) {
/* 155 */       int n = localvy.b(paramInt1, paramInt2, paramInt3);
/* 156 */       if (n < m) {
/* 157 */         localObject = localvy;
/* 158 */         m = n;
/*     */       }
/*     */     }
/* 161 */     return (vy)localObject;
/*     */   }
/*     */   
/*     */   public vy c(int paramInt1, int paramInt2, int paramInt3) {
/* 165 */     Object localObject = null;
/* 166 */     int m = Integer.MAX_VALUE;
/* 167 */     for (vy localvy : this.b)
/*     */     {
/* 169 */       int n = localvy.b(paramInt1, paramInt2, paramInt3);
/* 170 */       if (n > 256) n *= 1000; else {
/* 171 */         n = localvy.f();
/*     */       }
/* 173 */       if (n < m) {
/* 174 */         localObject = localvy;
/* 175 */         m = n;
/*     */       }
/*     */     }
/* 178 */     return (vy)localObject;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public vy e(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 186 */     if (this.d.e(paramInt1, paramInt2, paramInt3) > this.e * this.e) return null;
/* 187 */     vy localvy; for (Iterator localIterator = this.b.iterator(); localIterator.hasNext(); 
/* 188 */         return localvy)
/*     */     {
/* 187 */       localvy = (vy)localIterator.next();
/* 188 */       if ((localvy.a != paramInt1) || (localvy.c != paramInt3) || (Math.abs(localvy.b - paramInt2) > 1)) {} }
/* 189 */     return null;
/*     */   }
/*     */   
/*     */   public void a(vy paramvy) {
/* 193 */     this.b.add(paramvy);
/* 194 */     this.c.a += paramvy.a;
/* 195 */     this.c.b += paramvy.b;
/* 196 */     this.c.c += paramvy.c;
/* 197 */     n();
/* 198 */     this.f = paramvy.f;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 202 */     return this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public void a(sv paramsv) {
/* 206 */     for (wa localwa : this.k) {
/* 207 */       if (localwa.a == paramsv) {
/* 208 */         localwa.b = this.g;
/* 209 */         return;
/*     */       }
/*     */     }
/* 212 */     this.k.add(new wa(this, paramsv, this.g));
/*     */   }
/*     */   
/*     */   public sv b(sv paramsv) {
/* 216 */     double d1 = Double.MAX_VALUE;
/* 217 */     Object localObject = null;
/* 218 */     for (int m = 0; m < this.k.size(); m++) {
/* 219 */       wa localwa = (wa)this.k.get(m);
/* 220 */       double d2 = localwa.a.f(paramsv);
/* 221 */       if (d2 <= d1) {
/* 222 */         localObject = localwa;
/* 223 */         d1 = d2;
/*     */       } }
/* 225 */     return localObject != null ? ((wa)localObject).a : null;
/*     */   }
/*     */   
/*     */   public yz c(sv paramsv)
/*     */   {
/* 230 */     double d1 = Double.MAX_VALUE;
/* 231 */     Object localObject = null;
/*     */     
/* 233 */     for (String str : this.j.keySet()) {
/* 234 */       if (d(str)) {
/* 235 */         yz localyz = this.a.a(str);
/* 236 */         if (localyz != null) {
/* 237 */           double d2 = localyz.f(paramsv);
/* 238 */           if (d2 <= d1) {
/* 239 */             localObject = localyz;
/* 240 */             d1 = d2;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 245 */     return (yz)localObject;
/*     */   }
/*     */   
/*     */   private void l() {
/* 249 */     for (Iterator localIterator = this.k.iterator(); localIterator.hasNext(); 
/*     */         
/* 251 */         localIterator.remove())
/*     */     {
/* 250 */       wa localwa = (wa)localIterator.next();
/* 251 */       if ((localwa.a.Z()) && (Math.abs(this.g - localwa.b) <= 300)) {}
/*     */     }
/*     */   }
/*     */   
/*     */   private void m() {
/* 256 */     int m = 0;
/* 257 */     int n = this.a.s.nextInt(50) == 0 ? 1 : 0;
/* 258 */     for (Iterator localIterator = this.b.iterator(); localIterator.hasNext();) {
/* 259 */       vy localvy = (vy)localIterator.next();
/* 260 */       if (n != 0) localvy.d();
/* 261 */       if ((!f(localvy.a, localvy.b, localvy.c)) || (Math.abs(this.g - localvy.f) > 1200)) {
/* 262 */         this.c.a -= localvy.a;
/* 263 */         this.c.b -= localvy.b;
/* 264 */         this.c.c -= localvy.c;
/* 265 */         m = 1;
/* 266 */         localvy.g = true;
/* 267 */         localIterator.remove();
/*     */       }
/*     */     }
/*     */     
/* 271 */     if (m != 0) n();
/*     */   }
/*     */   
/*     */   private boolean f(int paramInt1, int paramInt2, int paramInt3) {
/* 275 */     return this.a.a(paramInt1, paramInt2, paramInt3) == ajn.ao;
/*     */   }
/*     */   
/*     */   private void n() {
/* 279 */     int m = this.b.size();
/* 280 */     if (m == 0) {
/* 281 */       this.d.b(0, 0, 0);
/* 282 */       this.e = 0;
/* 283 */       return;
/*     */     }
/* 285 */     this.d.b(this.c.a / m, this.c.b / m, this.c.c / m);
/* 286 */     int n = 0;
/* 287 */     for (vy localvy : this.b)
/* 288 */       n = Math.max(localvy.b(this.d.a, this.d.b, this.d.c), n);
/* 289 */     this.e = Math.max(32, (int)Math.sqrt(n) + 1);
/*     */   }
/*     */   
/*     */   public int a(String paramString) {
/* 293 */     Integer localInteger = (Integer)this.j.get(paramString);
/* 294 */     if (localInteger != null) {
/* 295 */       return localInteger.intValue();
/*     */     }
/* 297 */     return 0;
/*     */   }
/*     */   
/*     */   public int a(String paramString, int paramInt) {
/* 301 */     int m = a(paramString);
/* 302 */     int n = qh.a(m + paramInt, -30, 10);
/* 303 */     this.j.put(paramString, Integer.valueOf(n));
/* 304 */     return n;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean d(String paramString)
/*     */   {
/* 316 */     return a(paramString) <= -15;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 321 */     this.h = paramdh.f("PopSize");
/* 322 */     this.e = paramdh.f("Radius");
/* 323 */     this.l = paramdh.f("Golems");
/* 324 */     this.f = paramdh.f("Stable");
/* 325 */     this.g = paramdh.f("Tick");
/* 326 */     this.i = paramdh.f("MTick");
/* 327 */     this.d.a = paramdh.f("CX");
/* 328 */     this.d.b = paramdh.f("CY");
/* 329 */     this.d.c = paramdh.f("CZ");
/* 330 */     this.c.a = paramdh.f("ACX");
/* 331 */     this.c.b = paramdh.f("ACY");
/* 332 */     this.c.c = paramdh.f("ACZ");
/*     */     
/* 334 */     dq localdq1 = paramdh.c("Doors", 10);
/* 335 */     Object localObject; for (int m = 0; m < localdq1.c(); m++) {
/* 336 */       dh localdh = localdq1.b(m);
/*     */       
/* 338 */       localObject = new vy(localdh.f("X"), localdh.f("Y"), localdh.f("Z"), localdh.f("IDX"), localdh.f("IDZ"), localdh.f("TS"));
/* 339 */       this.b.add(localObject);
/*     */     }
/*     */     
/* 342 */     dq localdq2 = paramdh.c("Players", 10);
/* 343 */     for (int n = 0; n < localdq2.c(); n++) {
/* 344 */       localObject = localdq2.b(n);
/* 345 */       this.j.put(((dh)localObject).j("Name"), Integer.valueOf(((dh)localObject).f("S")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 351 */     paramdh.a("PopSize", this.h);
/* 352 */     paramdh.a("Radius", this.e);
/* 353 */     paramdh.a("Golems", this.l);
/* 354 */     paramdh.a("Stable", this.f);
/* 355 */     paramdh.a("Tick", this.g);
/* 356 */     paramdh.a("MTick", this.i);
/* 357 */     paramdh.a("CX", this.d.a);
/* 358 */     paramdh.a("CY", this.d.b);
/* 359 */     paramdh.a("CZ", this.d.c);
/* 360 */     paramdh.a("ACX", this.c.a);
/* 361 */     paramdh.a("ACY", this.c.b);
/* 362 */     paramdh.a("ACZ", this.c.c);
/*     */     
/* 364 */     dq localdq = new dq();
/* 365 */     for (Object localObject1 = this.b.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (vy)((Iterator)localObject1).next();
/* 366 */       localObject3 = new dh();
/* 367 */       ((dh)localObject3).a("X", ((vy)localObject2).a);
/* 368 */       ((dh)localObject3).a("Y", ((vy)localObject2).b);
/* 369 */       ((dh)localObject3).a("Z", ((vy)localObject2).c);
/* 370 */       ((dh)localObject3).a("IDX", ((vy)localObject2).d);
/* 371 */       ((dh)localObject3).a("IDZ", ((vy)localObject2).e);
/* 372 */       ((dh)localObject3).a("TS", ((vy)localObject2).f);
/* 373 */       localdq.a((dy)localObject3); }
/*     */     Object localObject3;
/* 375 */     paramdh.a("Doors", localdq);
/*     */     
/* 377 */     localObject1 = new dq();
/* 378 */     for (Object localObject2 = this.j.keySet().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (String)((Iterator)localObject2).next();
/* 379 */       dh localdh = new dh();
/* 380 */       localdh.a("Name", (String)localObject3);
/* 381 */       localdh.a("S", ((Integer)this.j.get(localObject3)).intValue());
/* 382 */       ((dq)localObject1).a(localdh);
/*     */     }
/* 384 */     paramdh.a("Players", (dy)localObject1);
/*     */   }
/*     */   
/*     */   public void h() {
/* 388 */     this.i = this.g;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean i()
/*     */   {
/* 394 */     return (this.i == 0) || (this.g - this.i >= 3600);
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 398 */     for (String str : this.j.keySet()) {
/* 399 */       a(str, paramInt);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */