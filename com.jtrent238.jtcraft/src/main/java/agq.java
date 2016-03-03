/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ public abstract class agq
/*     */ {
/*     */   public int b;
/*     */   private String a;
/*     */   private List e;
/*     */   private agr f;
/*     */   public double c;
/*     */   public double d;
/*     */   
/*     */   public agq()
/*     */   {
/*  16 */     this.b = 20;
/*  17 */     this.a = "Pig";
/*     */     
/*     */ 
/*     */ 
/*  21 */     this.g = 200;
/*  22 */     this.h = 800;
/*  23 */     this.i = 4;
/*     */     
/*  25 */     this.k = 6;
/*  26 */     this.l = 16;
/*  27 */     this.m = 4;
/*     */   }
/*     */   
/*  30 */   public String e() { if (i() == null) {
/*  31 */       if (this.a.equals("Minecart")) {
/*  32 */         this.a = "MinecartRideable";
/*     */       }
/*  34 */       return this.a;
/*     */     }
/*  36 */     return i().c; }
/*     */   
/*     */   private int g;
/*     */   private int h;
/*     */   
/*  41 */   public void a(String paramString) { this.a = paramString; }
/*     */   
/*     */   private int i;
/*     */   
/*  45 */   public boolean f() { return a().a(b() + 0.5D, c() + 0.5D, d() + 0.5D, this.l) != null; }
/*     */   
/*     */   private sa j;
/*     */   
/*  49 */   public void g() { if (!f()) {
/*     */       return;
/*     */     }
/*     */     double d3;
/*  53 */     if (a().E) {
/*  54 */       double d1 = b() + a().s.nextFloat();
/*  55 */       double d2 = c() + a().s.nextFloat();
/*  56 */       d3 = d() + a().s.nextFloat();
/*  57 */       a().a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  58 */       a().a("flame", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */       
/*  60 */       if (this.b > 0) this.b -= 1;
/*  61 */       this.d = this.c;
/*  62 */       this.c = ((this.c + 1000.0F / (this.b + 200.0F)) % 360.0D);
/*     */     } else {
/*  64 */       if (this.b == -1) { j();
/*     */       }
/*  66 */       if (this.b > 0) {
/*  67 */         this.b -= 1;
/*  68 */         return;
/*     */       }
/*     */       
/*  71 */       int n = 0;
/*     */       
/*  73 */       for (int i1 = 0; i1 < this.i; i1++) {
/*  74 */         sa localsa = sg.a(e(), a());
/*  75 */         if (localsa == null) { return;
/*     */         }
/*  77 */         int i2 = a().a(localsa.getClass(), azt.a(b(), c(), d(), b() + 1, c() + 1, d() + 1).b(this.m * 2, 4.0D, this.m * 2)).size();
/*     */         
/*  79 */         if (i2 >= this.k) {
/*  80 */           j();
/*  81 */           return;
/*     */         }
/*     */         
/*  84 */         d3 = b() + (a().s.nextDouble() - a().s.nextDouble()) * this.m;
/*  85 */         double d4 = c() + a().s.nextInt(3) - 1;
/*  86 */         double d5 = d() + (a().s.nextDouble() - a().s.nextDouble()) * this.m;
/*  87 */         Object localObject = (localsa instanceof sw) ? (sw)localsa : null;
/*     */         
/*  89 */         localsa.b(d3, d4, d5, a().s.nextFloat() * 360.0F, 0.0F);
/*     */         
/*  91 */         if ((localObject == null) || (((sw)localObject).by())) {
/*  92 */           a(localsa);
/*  93 */           a().c(2004, b(), c(), d(), 0);
/*     */           
/*  95 */           if (localObject != null) {
/*  96 */             ((sw)localObject).s();
/*     */           }
/*     */           
/*  99 */           n = 1;
/*     */         }
/*     */       }
/*     */       
/* 103 */       if (n != 0) j(); } }
/*     */   
/*     */   private int k;
/*     */   private int l;
/*     */   private int m;
/* 108 */   public sa a(sa paramsa) { if (i() != null) {
/* 109 */       Object localObject1 = new dh();
/* 110 */       paramsa.d((dh)localObject1);
/*     */       
/* 112 */       for (Object localObject2 = i().b.c().iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (String)((Iterator)localObject2).next();
/* 113 */         localObject4 = i().b.a((String)localObject3);
/* 114 */         ((dh)localObject1).a((String)localObject3, ((dy)localObject4).b()); }
/*     */       Object localObject3;
/*     */       Object localObject4;
/* 117 */       paramsa.f((dh)localObject1);
/* 118 */       if (paramsa.o != null) { paramsa.o.d(paramsa);
/*     */       }
/*     */       
/* 121 */       localObject2 = paramsa;
/* 122 */       while (((dh)localObject1).b("Riding", 10)) {
/* 123 */         localObject3 = ((dh)localObject1).m("Riding");
/* 124 */         localObject4 = sg.a(((dh)localObject3).j("id"), paramsa.o);
/* 125 */         if (localObject4 != null) {
/* 126 */           dh localdh = new dh();
/* 127 */           ((sa)localObject4).d(localdh);
/*     */           
/* 129 */           for (String str : ((dh)localObject3).c()) {
/* 130 */             dy localdy = ((dh)localObject3).a(str);
/* 131 */             localdh.a(str, localdy.b());
/*     */           }
/* 133 */           ((sa)localObject4).f(localdh);
/* 134 */           ((sa)localObject4).b(((sa)localObject2).s, ((sa)localObject2).t, ((sa)localObject2).u, ((sa)localObject2).y, ((sa)localObject2).z);
/*     */           
/* 136 */           if (paramsa.o != null) paramsa.o.d((sa)localObject4);
/* 137 */           ((sa)localObject2).a((sa)localObject4);
/*     */         }
/* 139 */         localObject2 = localObject4;
/* 140 */         localObject1 = localObject3;
/*     */       }
/*     */     }
/* 143 */     else if (((paramsa instanceof sv)) && (paramsa.o != null)) {
/* 144 */       ((sw)paramsa).a(null);
/* 145 */       a().d(paramsa);
/*     */     }
/*     */     
/* 148 */     return paramsa;
/*     */   }
/*     */   
/*     */   private void j() {
/* 152 */     if (this.h <= this.g) {
/* 153 */       this.b = this.g;
/*     */     } else {
/* 155 */       this.b = (this.g + a().s.nextInt(this.h - this.g));
/*     */     }
/*     */     
/* 158 */     if ((this.e != null) && (this.e.size() > 0)) {
/* 159 */       a((agr)qv.a(a().s, this.e));
/*     */     }
/*     */     
/* 162 */     a(1);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/* 166 */     this.a = paramdh.j("EntityId");
/* 167 */     this.b = paramdh.e("Delay");
/*     */     
/* 169 */     if (paramdh.b("SpawnPotentials", 9)) {
/* 170 */       this.e = new java.util.ArrayList();
/* 171 */       dq localdq = paramdh.c("SpawnPotentials", 10);
/*     */       
/* 173 */       for (int n = 0; n < localdq.c(); n++) {
/* 174 */         this.e.add(new agr(this, localdq.b(n)));
/*     */       }
/*     */     } else {
/* 177 */       this.e = null;
/*     */     }
/*     */     
/* 180 */     if (paramdh.b("SpawnData", 10)) {
/* 181 */       a(new agr(this, paramdh.m("SpawnData"), this.a));
/*     */     } else {
/* 183 */       a(null);
/*     */     }
/*     */     
/* 186 */     if (paramdh.b("MinSpawnDelay", 99)) {
/* 187 */       this.g = paramdh.e("MinSpawnDelay");
/* 188 */       this.h = paramdh.e("MaxSpawnDelay");
/* 189 */       this.i = paramdh.e("SpawnCount");
/*     */     }
/*     */     
/* 192 */     if (paramdh.b("MaxNearbyEntities", 99)) {
/* 193 */       this.k = paramdh.e("MaxNearbyEntities");
/* 194 */       this.l = paramdh.e("RequiredPlayerRange");
/*     */     }
/*     */     
/* 197 */     if (paramdh.b("SpawnRange", 99)) { this.m = paramdh.e("SpawnRange");
/*     */     }
/* 199 */     if ((a() != null) && (a().E)) {
/* 200 */       this.j = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh) {
/* 205 */     paramdh.a("EntityId", e());
/* 206 */     paramdh.a("Delay", (short)this.b);
/* 207 */     paramdh.a("MinSpawnDelay", (short)this.g);
/* 208 */     paramdh.a("MaxSpawnDelay", (short)this.h);
/* 209 */     paramdh.a("SpawnCount", (short)this.i);
/* 210 */     paramdh.a("MaxNearbyEntities", (short)this.k);
/* 211 */     paramdh.a("RequiredPlayerRange", (short)this.l);
/* 212 */     paramdh.a("SpawnRange", (short)this.m);
/*     */     
/* 214 */     if (i() != null) {
/* 215 */       paramdh.a("SpawnData", i().b.b());
/*     */     }
/*     */     
/* 218 */     if ((i() != null) || ((this.e != null) && (this.e.size() > 0))) {
/* 219 */       dq localdq = new dq();
/*     */       
/* 221 */       if ((this.e != null) && (this.e.size() > 0)) {
/* 222 */         for (agr localagr : this.e) {
/* 223 */           localdq.a(localagr.a());
/*     */         }
/*     */       } else {
/* 226 */         localdq.a(i().a());
/*     */       }
/*     */       
/* 229 */       paramdh.a("SpawnPotentials", localdq);
/*     */     }
/*     */   }
/*     */   
/*     */   public sa h() {
/* 234 */     if (this.j == null) {
/* 235 */       sa localsa = sg.a(e(), null);
/* 236 */       localsa = a(localsa);
/* 237 */       this.j = localsa;
/*     */     }
/*     */     
/* 240 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt) {
/* 244 */     if ((paramInt == 1) && (a().E)) {
/* 245 */       this.b = this.g;
/* 246 */       return true;
/*     */     }
/* 248 */     return false;
/*     */   }
/*     */   
/*     */   public agr i() {
/* 252 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(agr paramagr) {
/* 256 */     this.f = paramagr;
/*     */   }
/*     */   
/*     */   public abstract void a(int paramInt);
/*     */   
/*     */   public abstract ahb a();
/*     */   
/*     */   public abstract int b();
/*     */   
/*     */   public abstract int c();
/*     */   
/*     */   public abstract int d();
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */