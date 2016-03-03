/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ays
/*     */ {
/*     */   private long a;
/*  14 */   private ahm b = ahm.b;
/*  15 */   private String c = "";
/*     */   
/*     */   private int d;
/*     */   
/*     */   private int e;
/*     */   
/*     */   private int f;
/*     */   private long g;
/*     */   private long h;
/*     */   private long i;
/*     */   private long j;
/*     */   private dh k;
/*     */   private int l;
/*     */   private String m;
/*     */   private int n;
/*     */   private boolean o;
/*     */   private int p;
/*     */   private boolean q;
/*     */   private int r;
/*     */   private ahk s;
/*     */   private boolean t;
/*     */   private boolean u;
/*     */   private boolean v;
/*     */   private boolean w;
/*  39 */   private agy x = new agy();
/*     */   
/*     */ 
/*     */   protected ays() {}
/*     */   
/*     */ 
/*     */   public ays(dh paramdh)
/*     */   {
/*  47 */     this.a = paramdh.g("RandomSeed");
/*  48 */     if (paramdh.b("generatorName", 8)) {
/*  49 */       String str = paramdh.j("generatorName");
/*  50 */       this.b = ahm.a(str);
/*  51 */       if (this.b == null) {
/*  52 */         this.b = ahm.b;
/*  53 */       } else if (this.b.f()) {
/*  54 */         int i1 = 0;
/*  55 */         if (paramdh.b("generatorVersion", 99)) {
/*  56 */           i1 = paramdh.f("generatorVersion");
/*     */         }
/*  58 */         this.b = this.b.a(i1);
/*     */       }
/*     */       
/*  61 */       if (paramdh.b("generatorOptions", 8)) this.c = paramdh.j("generatorOptions");
/*     */     }
/*  63 */     this.s = ahk.a(paramdh.f("GameType"));
/*  64 */     if (paramdh.b("MapFeatures", 99)) {
/*  65 */       this.t = paramdh.n("MapFeatures");
/*     */     } else {
/*  67 */       this.t = true;
/*     */     }
/*  69 */     this.d = paramdh.f("SpawnX");
/*  70 */     this.e = paramdh.f("SpawnY");
/*  71 */     this.f = paramdh.f("SpawnZ");
/*  72 */     this.g = paramdh.g("Time");
/*  73 */     if (paramdh.b("DayTime", 99)) {
/*  74 */       this.h = paramdh.g("DayTime");
/*     */     } else {
/*  76 */       this.h = this.g;
/*     */     }
/*  78 */     this.i = paramdh.g("LastPlayed");
/*  79 */     this.j = paramdh.g("SizeOnDisk");
/*  80 */     this.m = paramdh.j("LevelName");
/*  81 */     this.n = paramdh.f("version");
/*  82 */     this.p = paramdh.f("rainTime");
/*  83 */     this.o = paramdh.n("raining");
/*  84 */     this.r = paramdh.f("thunderTime");
/*  85 */     this.q = paramdh.n("thundering");
/*  86 */     this.u = paramdh.n("hardcore");
/*     */     
/*  88 */     if (paramdh.b("initialized", 99)) {
/*  89 */       this.w = paramdh.n("initialized");
/*     */     } else {
/*  91 */       this.w = true;
/*     */     }
/*     */     
/*  94 */     if (paramdh.b("allowCommands", 99)) {
/*  95 */       this.v = paramdh.n("allowCommands");
/*     */     } else {
/*  97 */       this.v = (this.s == ahk.c);
/*     */     }
/*     */     
/* 100 */     if (paramdh.b("Player", 10)) {
/* 101 */       this.k = paramdh.m("Player");
/* 102 */       this.l = this.k.f("Dimension");
/*     */     }
/*     */     
/* 105 */     if (paramdh.b("GameRules", 10)) {
/* 106 */       this.x.a(paramdh.m("GameRules"));
/*     */     }
/*     */   }
/*     */   
/*     */   public ays(ahj paramahj, String paramString) {
/* 111 */     this.a = paramahj.d();
/* 112 */     this.s = paramahj.e();
/* 113 */     this.t = paramahj.g();
/* 114 */     this.m = paramString;
/* 115 */     this.u = paramahj.f();
/* 116 */     this.b = paramahj.h();
/* 117 */     this.c = paramahj.j();
/* 118 */     this.v = paramahj.i();
/* 119 */     this.w = false;
/*     */   }
/*     */   
/*     */   public ays(ays paramays) {
/* 123 */     this.a = paramays.a;
/* 124 */     this.b = paramays.b;
/* 125 */     this.c = paramays.c;
/* 126 */     this.s = paramays.s;
/* 127 */     this.t = paramays.t;
/* 128 */     this.d = paramays.d;
/* 129 */     this.e = paramays.e;
/* 130 */     this.f = paramays.f;
/* 131 */     this.g = paramays.g;
/* 132 */     this.h = paramays.h;
/* 133 */     this.i = paramays.i;
/* 134 */     this.j = paramays.j;
/* 135 */     this.k = paramays.k;
/* 136 */     this.l = paramays.l;
/* 137 */     this.m = paramays.m;
/* 138 */     this.n = paramays.n;
/* 139 */     this.p = paramays.p;
/* 140 */     this.o = paramays.o;
/* 141 */     this.r = paramays.r;
/* 142 */     this.q = paramays.q;
/* 143 */     this.u = paramays.u;
/* 144 */     this.v = paramays.v;
/* 145 */     this.w = paramays.w;
/* 146 */     this.x = paramays.x;
/*     */   }
/*     */   
/*     */   public dh a() {
/* 150 */     dh localdh = new dh();
/*     */     
/* 152 */     a(localdh, this.k);
/*     */     
/* 154 */     return localdh;
/*     */   }
/*     */   
/*     */   public dh a(dh paramdh) {
/* 158 */     dh localdh = new dh();
/* 159 */     a(localdh, paramdh);
/*     */     
/* 161 */     return localdh;
/*     */   }
/*     */   
/*     */   private void a(dh paramdh1, dh paramdh2) {
/* 165 */     paramdh1.a("RandomSeed", this.a);
/* 166 */     paramdh1.a("generatorName", this.b.a());
/* 167 */     paramdh1.a("generatorVersion", this.b.d());
/* 168 */     paramdh1.a("generatorOptions", this.c);
/* 169 */     paramdh1.a("GameType", this.s.a());
/* 170 */     paramdh1.a("MapFeatures", this.t);
/* 171 */     paramdh1.a("SpawnX", this.d);
/* 172 */     paramdh1.a("SpawnY", this.e);
/* 173 */     paramdh1.a("SpawnZ", this.f);
/* 174 */     paramdh1.a("Time", this.g);
/* 175 */     paramdh1.a("DayTime", this.h);
/* 176 */     paramdh1.a("SizeOnDisk", this.j);
/* 177 */     paramdh1.a("LastPlayed", MinecraftServer.ar());
/* 178 */     paramdh1.a("LevelName", this.m);
/* 179 */     paramdh1.a("version", this.n);
/* 180 */     paramdh1.a("rainTime", this.p);
/* 181 */     paramdh1.a("raining", this.o);
/* 182 */     paramdh1.a("thunderTime", this.r);
/* 183 */     paramdh1.a("thundering", this.q);
/* 184 */     paramdh1.a("hardcore", this.u);
/* 185 */     paramdh1.a("allowCommands", this.v);
/* 186 */     paramdh1.a("initialized", this.w);
/* 187 */     paramdh1.a("GameRules", this.x.a());
/*     */     
/* 189 */     if (paramdh2 != null) {
/* 190 */       paramdh1.a("Player", paramdh2);
/*     */     }
/*     */   }
/*     */   
/*     */   public long b() {
/* 195 */     return this.a;
/*     */   }
/*     */   
/*     */   public int c() {
/* 199 */     return this.d;
/*     */   }
/*     */   
/*     */   public int d() {
/* 203 */     return this.e;
/*     */   }
/*     */   
/*     */   public int e() {
/* 207 */     return this.f;
/*     */   }
/*     */   
/*     */   public long f() {
/* 211 */     return this.g;
/*     */   }
/*     */   
/*     */   public long g() {
/* 215 */     return this.h;
/*     */   }
/*     */   
/*     */   public long h() {
/* 219 */     return this.j;
/*     */   }
/*     */   
/*     */   public dh i() {
/* 223 */     return this.k;
/*     */   }
/*     */   
/*     */   public int j() {
/* 227 */     return this.l;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(int paramInt)
/*     */   {
/* 235 */     this.d = paramInt;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 239 */     this.e = paramInt;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 243 */     this.f = paramInt;
/*     */   }
/*     */   
/*     */   public void b(long paramLong) {
/* 247 */     this.g = paramLong;
/*     */   }
/*     */   
/*     */   public void c(long paramLong) {
/* 251 */     this.h = paramLong;
/*     */   }
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
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 267 */     this.d = paramInt1;
/* 268 */     this.e = paramInt2;
/* 269 */     this.f = paramInt3;
/*     */   }
/*     */   
/*     */   public String k() {
/* 273 */     return this.m;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 277 */     this.m = paramString;
/*     */   }
/*     */   
/*     */   public int l() {
/* 281 */     return this.n;
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/* 285 */     this.n = paramInt;
/*     */   }
/*     */   
/*     */   public long m() {
/* 289 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 293 */     return this.q;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 297 */     this.q = paramBoolean;
/*     */   }
/*     */   
/*     */   public int o() {
/* 301 */     return this.r;
/*     */   }
/*     */   
/*     */   public void f(int paramInt) {
/* 305 */     this.r = paramInt;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 309 */     return this.o;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 313 */     this.o = paramBoolean;
/*     */   }
/*     */   
/*     */   public int q() {
/* 317 */     return this.p;
/*     */   }
/*     */   
/*     */   public void g(int paramInt) {
/* 321 */     this.p = paramInt;
/*     */   }
/*     */   
/*     */   public ahk r() {
/* 325 */     return this.s;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 329 */     return this.t;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk) {
/* 333 */     this.s = paramahk;
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 337 */     return this.u;
/*     */   }
/*     */   
/*     */   public ahm u() {
/* 341 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(ahm paramahm) {
/* 345 */     this.b = paramahm;
/*     */   }
/*     */   
/*     */   public String y() {
/* 349 */     return this.c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean v()
/*     */   {
/* 357 */     return this.v;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean w()
/*     */   {
/* 365 */     return this.w;
/*     */   }
/*     */   
/*     */   public void d(boolean paramBoolean) {
/* 369 */     this.w = paramBoolean;
/*     */   }
/*     */   
/*     */   public agy x() {
/* 373 */     return this.x;
/*     */   }
/*     */   
/*     */   public void a(k paramk) {
/* 377 */     paramk.a("Level seed", new ayt(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 384 */     paramk.a("Level generator", new ayu(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 391 */     paramk.a("Level generator options", new ayv(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 398 */     paramk.a("Level spawn location", new ayw(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 405 */     paramk.a("Level time", new ayx(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 412 */     paramk.a("Level dimension", new ayy(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 419 */     paramk.a("Level storage version", new ayz(this));
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
/* 441 */     paramk.a("Level weather", new aza(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 448 */     paramk.a("Level game mode", new azb(this));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ays.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */