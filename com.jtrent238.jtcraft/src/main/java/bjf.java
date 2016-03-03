/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bjf
/*     */   extends ahb
/*     */ {
/*     */   private bjb a;
/*     */   private bjd b;
/*  34 */   private pz c = new pz();
/*  35 */   private Set J = new HashSet();
/*  36 */   private Set K = new HashSet();
/*  37 */   private final bao L = bao.B();
/*  38 */   private final Set M = new HashSet();
/*     */   
/*     */   public bjf(bjb parambjb, ahj paramahj, int paramInt, rd paramrd, qi paramqi)
/*     */   {
/*  42 */     super(new azo(), "MpServer", aqo.a(paramInt), paramahj, paramqi);
/*     */     
/*  44 */     this.a = parambjb;
/*  45 */     this.r = paramrd;
/*  46 */     x(8, 64, 8);
/*  47 */     this.z = parambjb.a;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  52 */     super.b();
/*  53 */     a(I() + 1L);
/*  54 */     if (O().b("doDaylightCycle")) {
/*  55 */       b(J() + 1L);
/*     */     }
/*     */     
/*  58 */     this.C.a("reEntryProcessing");
/*  59 */     for (int i = 0; (i < 10) && (!this.K.isEmpty()); i++) {
/*  60 */       sa localsa = (sa)this.K.iterator().next();
/*  61 */       this.K.remove(localsa);
/*  62 */       if (!this.e.contains(localsa)) { d(localsa);
/*     */       }
/*     */     }
/*  65 */     this.C.c("connection");
/*  66 */     this.a.a();
/*  67 */     this.C.c("chunkCache");
/*  68 */     this.b.d();
/*     */     
/*  70 */     this.C.c("blocks");
/*  71 */     g();
/*     */     
/*  73 */     this.C.b();
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*     */   
/*     */ 
/*     */   protected apu j()
/*     */   {
/*  82 */     this.b = new bjd(this);
/*  83 */     return this.b;
/*     */   }
/*     */   
/*     */   protected void g()
/*     */   {
/*  88 */     super.g();
/*     */     
/*  90 */     this.M.retainAll(this.F);
/*  91 */     if (this.M.size() == this.F.size()) {
/*  92 */       this.M.clear();
/*     */     }
/*     */     
/*  95 */     int i = 0;
/*     */     
/*  97 */     for (agu localagu : this.F) {
/*  98 */       if (!this.M.contains(localagu)) {
/*  99 */         int j = localagu.a * 16;
/* 100 */         int k = localagu.b * 16;
/*     */         
/* 102 */         this.C.a("getChunk");
/* 103 */         apx localapx = e(localagu.a, localagu.b);
/*     */         
/* 105 */         a(j, k, localapx);
/*     */         
/* 107 */         this.C.b();
/*     */         
/* 109 */         this.M.add(localagu);
/* 110 */         i++; if (i >= 10)
/* 111 */           return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, boolean paramBoolean) {
/* 117 */     if (paramBoolean) this.b.c(paramInt1, paramInt2); else
/* 118 */       this.b.b(paramInt1, paramInt2);
/* 119 */     if (!paramBoolean) {
/* 120 */       c(paramInt1 * 16, 0, paramInt2 * 16, paramInt1 * 16 + 15, 256, paramInt2 * 16 + 15);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d(sa paramsa)
/*     */   {
/* 126 */     boolean bool = super.d(paramsa);
/* 127 */     this.J.add(paramsa);
/*     */     
/* 129 */     if (!bool) {
/* 130 */       this.K.add(paramsa);
/*     */     }
/* 132 */     else if ((paramsa instanceof xl)) {
/* 133 */       this.L.X().a(new bsm((xl)paramsa));
/*     */     }
/*     */     
/*     */ 
/* 137 */     return bool;
/*     */   }
/*     */   
/*     */   public void e(sa paramsa)
/*     */   {
/* 142 */     super.e(paramsa);
/* 143 */     this.J.remove(paramsa);
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa)
/*     */   {
/* 148 */     super.a(paramsa);
/* 149 */     if (this.K.contains(paramsa)) {
/* 150 */       this.K.remove(paramsa);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(sa paramsa)
/*     */   {
/* 156 */     super.b(paramsa);
/* 157 */     int i = 0;
/* 158 */     if (this.J.contains(paramsa)) {
/* 159 */       if (paramsa.Z()) {
/* 160 */         this.K.add(paramsa);
/* 161 */         i = 1;
/*     */       } else {
/* 163 */         this.J.remove(paramsa);
/*     */       }
/*     */     }
/* 166 */     if ((bnn.a.a(paramsa).a()) && (i == 0)) {
/* 167 */       this.L.g.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt, sa paramsa) {
/* 172 */     sa localsa = a(paramInt);
/* 173 */     if (localsa != null) {
/* 174 */       e(localsa);
/*     */     }
/*     */     
/* 177 */     this.J.add(paramsa);
/* 178 */     paramsa.d(paramInt);
/* 179 */     if (!d(paramsa)) {
/* 180 */       this.K.add(paramsa);
/*     */     }
/* 182 */     this.c.a(paramInt, paramsa);
/* 183 */     if (bnn.a.a(paramsa).a()) {
/* 184 */       this.L.g.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public sa a(int paramInt)
/*     */   {
/* 190 */     if (paramInt == this.L.h.y()) {
/* 191 */       return this.L.h;
/*     */     }
/* 193 */     return (sa)this.c.a(paramInt);
/*     */   }
/*     */   
/*     */   public sa b(int paramInt) {
/* 197 */     sa localsa = (sa)this.c.d(paramInt);
/* 198 */     if (localsa != null) {
/* 199 */       this.J.remove(localsa);
/* 200 */       e(localsa);
/*     */     }
/* 202 */     return localsa;
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/* 206 */     a(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/* 207 */     if (super.d(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, 3)) {
/* 208 */       return true;
/*     */     }
/* 210 */     return false;
/*     */   }
/*     */   
/*     */   public void F()
/*     */   {
/* 215 */     this.a.b().a(new fq("Quitting"));
/*     */   }
/*     */   
/*     */   protected void o()
/*     */   {
/* 220 */     if (this.t.g) {}
/*     */   }
/*     */   
/*     */   protected int p()
/*     */   {
/* 225 */     return this.L.u.c;
/*     */   }
/*     */   
/*     */   public void C(int paramInt1, int paramInt2, int paramInt3) {
/* 229 */     int i = 16;
/* 230 */     Random localRandom = new Random();
/*     */     
/* 232 */     for (int j = 0; j < 1000; j++) {
/* 233 */       int k = paramInt1 + this.s.nextInt(i) - this.s.nextInt(i);
/* 234 */       int m = paramInt2 + this.s.nextInt(i) - this.s.nextInt(i);
/* 235 */       int n = paramInt3 + this.s.nextInt(i) - this.s.nextInt(i);
/*     */       
/* 237 */       aji localaji = a(k, m, n);
/* 238 */       if (localaji.o() == awt.a) {
/* 239 */         if ((this.s.nextInt(8) > m) && (this.t.j())) {
/* 240 */           a("depthsuspend", k + this.s.nextFloat(), m + this.s.nextFloat(), n + this.s.nextFloat(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */       } else {
/* 243 */         localaji.b(this, k, m, n, localRandom);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 249 */     this.e.removeAll(this.f);
/* 250 */     sa localsa; int j; int k; for (int i = 0; i < this.f.size(); i++) {
/* 251 */       localsa = (sa)this.f.get(i);
/* 252 */       j = localsa.ah;
/* 253 */       k = localsa.aj;
/* 254 */       if ((localsa.ag) && (c(j, k))) {
/* 255 */         e(j, k).b(localsa);
/*     */       }
/*     */     }
/*     */     
/* 259 */     for (i = 0; i < this.f.size(); i++) {
/* 260 */       b((sa)this.f.get(i));
/*     */     }
/* 262 */     this.f.clear();
/*     */     
/* 264 */     for (i = 0; i < this.e.size(); i++) {
/* 265 */       localsa = (sa)this.e.get(i);
/*     */       
/* 267 */       if (localsa.m != null) {
/* 268 */         if ((localsa.m.K) || (localsa.m.l != localsa)) {
/* 269 */           localsa.m.l = null;
/* 270 */           localsa.m = null;
/*     */         }
/*     */         
/*     */       }
/* 274 */       else if (localsa.K) {
/* 275 */         j = localsa.ah;
/* 276 */         k = localsa.aj;
/* 277 */         if ((localsa.ag) && (c(j, k))) {
/* 278 */           e(j, k).b(localsa);
/*     */         }
/* 280 */         this.e.remove(i--);
/* 281 */         b(localsa);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public k a(b paramb)
/*     */   {
/* 289 */     k localk = super.a(paramb);
/*     */     
/* 291 */     localk.a("Forced entities", new bjg(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 298 */     localk.a("Retry entities", new bjh(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 305 */     localk.a("Server brand", new bji(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 312 */     localk.a("Server type", new bjj(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 319 */     return localk;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat1, float paramFloat2, boolean paramBoolean)
/*     */   {
/* 324 */     double d1 = this.L.i.e(paramDouble1, paramDouble2, paramDouble3);
/* 325 */     bso localbso = new bso(new bqx(paramString), paramFloat1, paramFloat2, (float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*     */     
/* 327 */     if ((paramBoolean) && (d1 > 100.0D))
/*     */     {
/* 329 */       double d2 = Math.sqrt(d1) / 40.0D;
/* 330 */       this.L.X().a(localbso, (int)(d2 * 20.0D));
/*     */     } else {
/* 332 */       this.L.X().a(localbso);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, dh paramdh)
/*     */   {
/* 338 */     this.L.k.a(new bke(this, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, this.L.k, paramdh));
/*     */   }
/*     */   
/*     */   public void a(bac parambac) {
/* 342 */     this.D = parambac;
/*     */   }
/*     */   
/*     */   public void b(long paramLong)
/*     */   {
/* 347 */     if (paramLong < 0L) {
/* 348 */       paramLong = -paramLong;
/* 349 */       O().b("doDaylightCycle", "false");
/*     */     } else {
/* 351 */       O().b("doDaylightCycle", "true");
/*     */     }
/* 353 */     super.b(paramLong);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */