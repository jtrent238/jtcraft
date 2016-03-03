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
/*     */ public class ro
/*     */ {
/*  13 */   public static ro a = new ro("inFire").n();
/*  14 */   public static ro b = new ro("onFire").k().n();
/*  15 */   public static ro c = new ro("lava").n();
/*  16 */   public static ro d = new ro("inWall").k();
/*  17 */   public static ro e = new ro("drown").k();
/*  18 */   public static ro f = new ro("starve").k().m();
/*  19 */   public static ro g = new ro("cactus");
/*  20 */   public static ro h = new ro("fall").k();
/*  21 */   public static ro i = new ro("outOfWorld").k().l();
/*  22 */   public static ro j = new ro("generic").k();
/*  23 */   public static ro k = new ro("magic").k().t();
/*  24 */   public static ro l = new ro("wither").k();
/*  25 */   public static ro m = new ro("anvil");
/*  26 */   public static ro n = new ro("fallingBlock");
/*     */   private boolean p;
/*     */   
/*  29 */   public static ro a(sv paramsv) { return new rp("mob", paramsv); }
/*     */   
/*     */   public static ro a(yz paramyz)
/*     */   {
/*  33 */     return new rp("player", paramyz);
/*     */   }
/*     */   
/*     */   public static ro a(zc paramzc, sa paramsa) {
/*  37 */     return new rq("arrow", paramzc, paramsa).b();
/*     */   }
/*     */   
/*     */   public static ro a(ze paramze, sa paramsa) {
/*  41 */     if (paramsa == null) {
/*  42 */       return new rq("onFire", paramze, paramze).n().b();
/*     */     }
/*  44 */     return new rq("fireball", paramze, paramsa).n().b();
/*     */   }
/*     */   
/*     */   public static ro a(sa paramsa1, sa paramsa2) {
/*  48 */     return new rq("thrown", paramsa1, paramsa2).b();
/*     */   }
/*     */   
/*     */   public static ro b(sa paramsa1, sa paramsa2) {
/*  52 */     return new rq("indirectMagic", paramsa1, paramsa2).k().t();
/*     */   }
/*     */   
/*     */   public static ro a(sa paramsa) {
/*  56 */     return new rp("thorns", paramsa).t();
/*     */   }
/*     */   
/*     */   public static ro a(agw paramagw) {
/*  60 */     if ((paramagw != null) && (paramagw.c() != null)) {
/*  61 */       return new rp("explosion.player", paramagw.c()).q().d();
/*     */     }
/*  63 */     return new ro("explosion").q().d();
/*     */   }
/*     */   
/*     */ 
/*     */   private boolean q;
/*     */   
/*     */   private boolean r;
/*     */   
/*  71 */   private float s = 0.3F;
/*     */   private boolean t;
/*     */   private boolean u;
/*     */   private boolean v;
/*     */   private boolean w;
/*     */   private boolean x;
/*     */   public String o;
/*     */   
/*  79 */   public boolean a() { return this.u; }
/*     */   
/*     */   public ro b()
/*     */   {
/*  83 */     this.u = true;
/*  84 */     return this;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  88 */     return this.x;
/*     */   }
/*     */   
/*     */   public ro d() {
/*  92 */     this.x = true;
/*  93 */     return this;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  97 */     return this.p;
/*     */   }
/*     */   
/*     */   public float f() {
/* 101 */     return this.s;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 105 */     return this.q;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 109 */     return this.r;
/*     */   }
/*     */   
/*     */ 
/*     */   protected ro(String paramString)
/*     */   {
/* 115 */     this.o = paramString;
/*     */   }
/*     */   
/*     */   public sa i() {
/* 119 */     return j();
/*     */   }
/*     */   
/*     */   public sa j() {
/* 123 */     return null;
/*     */   }
/*     */   
/*     */   protected ro k() {
/* 127 */     this.p = true;
/*     */     
/* 129 */     this.s = 0.0F;
/* 130 */     return this;
/*     */   }
/*     */   
/*     */   protected ro l() {
/* 134 */     this.q = true;
/* 135 */     return this;
/*     */   }
/*     */   
/*     */   protected ro m() {
/* 139 */     this.r = true;
/*     */     
/* 141 */     this.s = 0.0F;
/* 142 */     return this;
/*     */   }
/*     */   
/*     */   protected ro n() {
/* 146 */     this.t = true;
/* 147 */     return this;
/*     */   }
/*     */   
/*     */   public fj b(sv paramsv) {
/* 151 */     sv localsv = paramsv.aX();
/* 152 */     String str1 = "death.attack." + this.o;
/* 153 */     String str2 = str1 + ".player";
/*     */     
/* 155 */     if ((localsv != null) && (dd.c(str2))) {
/* 156 */       return new fr(str2, new Object[] { paramsv.c_(), localsv.c_() });
/*     */     }
/* 158 */     return new fr(str1, new Object[] { paramsv.c_() });
/*     */   }
/*     */   
/*     */   public boolean o()
/*     */   {
/* 163 */     return this.t;
/*     */   }
/*     */   
/*     */   public String p() {
/* 167 */     return this.o;
/*     */   }
/*     */   
/*     */   public ro q() {
/* 171 */     this.v = true;
/* 172 */     return this;
/*     */   }
/*     */   
/*     */   public boolean r() {
/* 176 */     return this.v;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 180 */     return this.w;
/*     */   }
/*     */   
/*     */   public ro t() {
/* 184 */     this.w = true;
/* 185 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */