/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class ya
/*     */   extends yg
/*     */ {
/*  26 */   private static final UUID bp = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  27 */   private static final tj bq = new tj(bp, "Attacking speed boost", 6.199999809265137D, 0).a(false);
/*     */   
/*  29 */   private static boolean[] br = new boolean['Ā'];
/*     */   private int bs;
/*     */   
/*  32 */   static { br[aji.b(ajn.c)] = true;
/*  33 */     br[aji.b(ajn.d)] = true;
/*  34 */     br[aji.b(ajn.m)] = true;
/*  35 */     br[aji.b(ajn.n)] = true;
/*  36 */     br[aji.b(ajn.N)] = true;
/*  37 */     br[aji.b(ajn.O)] = true;
/*  38 */     br[aji.b(ajn.P)] = true;
/*  39 */     br[aji.b(ajn.Q)] = true;
/*  40 */     br[aji.b(ajn.W)] = true;
/*  41 */     br[aji.b(ajn.aF)] = true;
/*  42 */     br[aji.b(ajn.aG)] = true;
/*  43 */     br[aji.b(ajn.aK)] = true;
/*  44 */     br[aji.b(ajn.ba)] = true;
/*  45 */     br[aji.b(ajn.bh)] = true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private int bt;
/*     */   
/*     */   private sa bu;
/*     */   
/*     */   private boolean bv;
/*     */   
/*     */   public ya(ahb paramahb)
/*     */   {
/*  58 */     super(paramahb);
/*  59 */     a(0.6F, 2.9F);
/*  60 */     this.W = 1.0F;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  65 */     super.aD();
/*     */     
/*  67 */     a(yj.a).a(40.0D);
/*  68 */     a(yj.d).a(0.30000001192092896D);
/*  69 */     a(yj.e).a(7.0D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  74 */     super.c();
/*     */     
/*  76 */     this.af.a(16, new Byte((byte)0));
/*  77 */     this.af.a(17, new Byte((byte)0));
/*  78 */     this.af.a(18, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  83 */     super.b(paramdh);
/*  84 */     paramdh.a("carried", (short)aji.b(cb()));
/*  85 */     paramdh.a("carriedData", (short)cc());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  90 */     super.a(paramdh);
/*  91 */     a(aji.e(paramdh.e("carried")));
/*  92 */     a(paramdh.e("carriedData"));
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/*  97 */     yz localyz = this.o.b(this, 64.0D);
/*  98 */     if (localyz != null) {
/*  99 */       if (f(localyz)) {
/* 100 */         this.bv = true;
/* 101 */         if (this.bt == 0) this.o.a(localyz.s, localyz.t, localyz.u, "mob.endermen.stare", 1.0F, 1.0F);
/* 102 */         if (this.bt++ == 5) {
/* 103 */           this.bt = 0;
/* 104 */           a(true);
/* 105 */           return localyz;
/*     */         }
/*     */       } else {
/* 108 */         this.bt = 0;
/*     */       }
/*     */     }
/* 111 */     return null;
/*     */   }
/*     */   
/*     */   private boolean f(yz paramyz) {
/* 115 */     add localadd = paramyz.bm.b[3];
/* 116 */     if ((localadd != null) && (localadd.b() == adb.a(ajn.aK))) { return false;
/*     */     }
/* 118 */     azw localazw1 = paramyz.j(1.0F).a();
/* 119 */     azw localazw2 = azw.a(this.s - paramyz.s, this.C.b + this.N / 2.0F - (paramyz.t + paramyz.g()), this.u - paramyz.u);
/* 120 */     double d1 = localazw2.b();
/* 121 */     localazw2 = localazw2.a();
/* 122 */     double d2 = localazw1.b(localazw2);
/* 123 */     return (d2 > 1.0D - 0.025D / d1) && (paramyz.p(this));
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 128 */     if (L()) { a(ro.e, 1.0F);
/*     */     }
/* 130 */     if (this.bu != this.bm) {
/* 131 */       ti localti = a(yj.d);
/* 132 */       localti.b(bq);
/*     */       
/* 134 */       if (this.bm != null) {
/* 135 */         localti.a(bq);
/*     */       }
/*     */     }
/*     */     
/* 139 */     this.bu = this.bm;
/*     */     
/* 141 */     if ((!this.o.E) && 
/* 142 */       (this.o.O().b("mobGriefing"))) { int j;
/* 143 */       int k; aji localaji1; if (cb().o() == awt.a) {
/* 144 */         if (this.Z.nextInt(20) == 0) {
/* 145 */           i = qh.c(this.s - 2.0D + this.Z.nextDouble() * 4.0D);
/* 146 */           j = qh.c(this.t + this.Z.nextDouble() * 3.0D);
/* 147 */           k = qh.c(this.u - 2.0D + this.Z.nextDouble() * 4.0D);
/* 148 */           localaji1 = this.o.a(i, j, k);
/* 149 */           if (br[aji.b(localaji1)] != 0) {
/* 150 */             a(localaji1);
/* 151 */             a(this.o.e(i, j, k));
/* 152 */             this.o.b(i, j, k, ajn.a);
/*     */           }
/*     */         }
/*     */       }
/* 156 */       else if (this.Z.nextInt(2000) == 0) {
/* 157 */         i = qh.c(this.s - 1.0D + this.Z.nextDouble() * 2.0D);
/* 158 */         j = qh.c(this.t + this.Z.nextDouble() * 2.0D);
/* 159 */         k = qh.c(this.u - 1.0D + this.Z.nextDouble() * 2.0D);
/* 160 */         localaji1 = this.o.a(i, j, k);
/* 161 */         aji localaji2 = this.o.a(i, j - 1, k);
/* 162 */         if ((localaji1.o() == awt.a) && (localaji2.o() != awt.a) && (localaji2.d())) {
/* 163 */           this.o.d(i, j, k, cb(), cc(), 3);
/* 164 */           a(ajn.a);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 172 */     for (int i = 0; i < 2; i++) {
/* 173 */       this.o.a("portal", this.s + (this.Z.nextDouble() - 0.5D) * this.M, this.t + this.Z.nextDouble() * this.N - 0.25D, this.u + (this.Z.nextDouble() - 0.5D) * this.M, (this.Z.nextDouble() - 0.5D) * 2.0D, -this.Z.nextDouble(), (this.Z.nextDouble() - 0.5D) * 2.0D);
/*     */     }
/*     */     
/*     */ 
/* 177 */     if ((this.o.w()) && (!this.o.E)) {
/* 178 */       float f = d(1.0F);
/* 179 */       if ((f > 0.5F) && 
/* 180 */         (this.o.i(qh.c(this.s), qh.c(this.t), qh.c(this.u))) && (this.Z.nextFloat() * 30.0F < (f - 0.4F) * 2.0F)) {
/* 181 */         this.bm = null;
/* 182 */         a(false);
/* 183 */         this.bv = false;
/* 184 */         bZ();
/*     */       }
/*     */     }
/*     */     
/* 188 */     if ((L()) || (al())) {
/* 189 */       this.bm = null;
/* 190 */       a(false);
/* 191 */       this.bv = false;
/* 192 */       bZ();
/*     */     }
/*     */     
/* 195 */     if ((cd()) && (!this.bv) && (this.Z.nextInt(100) == 0)) {
/* 196 */       a(false);
/*     */     }
/*     */     
/* 199 */     this.bc = false;
/* 200 */     if (this.bm != null) {
/* 201 */       a(this.bm, 100.0F, 100.0F);
/*     */     }
/*     */     
/* 204 */     if ((!this.o.E) && (Z())) {
/* 205 */       if (this.bm != null) {
/* 206 */         if (((this.bm instanceof yz)) && (f((yz)this.bm))) {
/* 207 */           if (this.bm.f(this) < 16.0D) {
/* 208 */             bZ();
/*     */           }
/* 210 */           this.bs = 0;
/* 211 */         } else if ((this.bm.f(this) > 256.0D) && 
/* 212 */           (this.bs++ >= 30) && 
/* 213 */           (c(this.bm))) {
/* 214 */           this.bs = 0;
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 219 */         a(false);
/* 220 */         this.bs = 0;
/*     */       }
/*     */     }
/*     */     
/* 224 */     super.e();
/*     */   }
/*     */   
/*     */   protected boolean bZ() {
/* 228 */     double d1 = this.s + (this.Z.nextDouble() - 0.5D) * 64.0D;
/* 229 */     double d2 = this.t + (this.Z.nextInt(64) - 32);
/* 230 */     double d3 = this.u + (this.Z.nextDouble() - 0.5D) * 64.0D;
/* 231 */     return k(d1, d2, d3);
/*     */   }
/*     */   
/*     */   protected boolean c(sa paramsa) {
/* 235 */     azw localazw = azw.a(this.s - paramsa.s, this.C.b + this.N / 2.0F - paramsa.t + paramsa.g(), this.u - paramsa.u);
/* 236 */     localazw = localazw.a();
/* 237 */     double d1 = 16.0D;
/* 238 */     double d2 = this.s + (this.Z.nextDouble() - 0.5D) * 8.0D - localazw.a * d1;
/* 239 */     double d3 = this.t + (this.Z.nextInt(16) - 8) - localazw.b * d1;
/* 240 */     double d4 = this.u + (this.Z.nextDouble() - 0.5D) * 8.0D - localazw.c * d1;
/* 241 */     return k(d2, d3, d4);
/*     */   }
/*     */   
/*     */   protected boolean k(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 245 */     double d1 = this.s;
/* 246 */     double d2 = this.t;
/* 247 */     double d3 = this.u;
/*     */     
/* 249 */     this.s = paramDouble1;
/* 250 */     this.t = paramDouble2;
/* 251 */     this.u = paramDouble3;
/* 252 */     int i = 0;
/* 253 */     int j = qh.c(this.s);
/* 254 */     int k = qh.c(this.t);
/* 255 */     int m = qh.c(this.u);
/*     */     int n;
/* 257 */     if (this.o.d(j, k, m)) {
/* 258 */       n = 0;
/* 259 */       while ((n == 0) && (k > 0)) {
/* 260 */         aji localaji = this.o.a(j, k - 1, m);
/* 261 */         if (localaji.o().c()) {
/* 262 */           n = 1;
/*     */         } else {
/* 264 */           this.t -= 1.0D;
/* 265 */           k--;
/*     */         }
/*     */       }
/* 268 */       if (n != 0) {
/* 269 */         b(this.s, this.t, this.u);
/* 270 */         if ((this.o.a(this, this.C).isEmpty()) && (!this.o.d(this.C))) {
/* 271 */           i = 1;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 276 */     if (i != 0) {
/* 277 */       n = 128;
/* 278 */       for (int i1 = 0; i1 < n; i1++) {
/* 279 */         double d4 = i1 / (n - 1.0D);
/* 280 */         float f1 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/* 281 */         float f2 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/* 282 */         float f3 = (this.Z.nextFloat() - 0.5F) * 0.2F;
/*     */         
/* 284 */         double d5 = d1 + (this.s - d1) * d4 + (this.Z.nextDouble() - 0.5D) * this.M * 2.0D;
/* 285 */         double d6 = d2 + (this.t - d2) * d4 + this.Z.nextDouble() * this.N;
/* 286 */         double d7 = d3 + (this.u - d3) * d4 + (this.Z.nextDouble() - 0.5D) * this.M * 2.0D;
/* 287 */         this.o.a("portal", d5, d6, d7, f1, f2, f3);
/*     */       }
/*     */       
/* 290 */       this.o.a(d1, d2, d3, "mob.endermen.portal", 1.0F, 1.0F);
/* 291 */       a("mob.endermen.portal", 1.0F, 1.0F);
/* 292 */       return true;
/*     */     }
/* 294 */     b(d1, d2, d3);
/* 295 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected String t()
/*     */   {
/* 301 */     return cd() ? "mob.endermen.scream" : "mob.endermen.idle";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 306 */     return "mob.endermen.hit";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 311 */     return "mob.endermen.death";
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 316 */     return ade.bi;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 321 */     adb localadb = u();
/* 322 */     if (localadb != null) {
/* 323 */       int i = this.Z.nextInt(2 + paramInt);
/* 324 */       for (int j = 0; j < i; j++)
/* 325 */         a(localadb, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aji paramaji) {
/* 330 */     this.af.b(16, Byte.valueOf((byte)(aji.b(paramaji) & 0xFF)));
/*     */   }
/*     */   
/*     */   public aji cb() {
/* 334 */     return aji.e(this.af.a(16));
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 338 */     this.af.b(17, Byte.valueOf((byte)(paramInt & 0xFF)));
/*     */   }
/*     */   
/*     */   public int cc() {
/* 342 */     return this.af.a(17);
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 347 */     if (aw()) return false;
/* 348 */     a(true);
/*     */     
/* 350 */     if (((paramro instanceof rp)) && ((paramro.j() instanceof yz))) {
/* 351 */       this.bv = true;
/*     */     }
/*     */     
/* 354 */     if ((paramro instanceof rq)) {
/* 355 */       this.bv = false;
/* 356 */       for (int i = 0; i < 64; i++) {
/* 357 */         if (bZ()) {
/* 358 */           return true;
/*     */         }
/*     */       }
/* 361 */       return false;
/*     */     }
/*     */     
/* 364 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean cd() {
/* 368 */     return this.af.a(18) > 0;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 372 */     this.af.b(18, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */