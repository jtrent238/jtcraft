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
/*     */ public abstract class td
/*     */   extends sw
/*     */ {
/*  16 */   public static final UUID h = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
/*  17 */   public static final tj i = new tj(h, "Fleeing speed bonus", 2.0D, 2).a(false);
/*     */   private ayf bp;
/*     */   protected sa bm;
/*     */   protected boolean bn;
/*     */   protected int bo;
/*     */   
/*  23 */   public td(ahb paramahb) { super(paramahb);
/*     */     
/*  25 */     this.bs = new ut(this, 1.0D);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  33 */   private r bq = new r(0, 0, 0);
/*  34 */   private float br = -1.0F;
/*     */   private ui bs;
/*     */   private boolean bt;
/*     */   
/*     */   protected boolean bP() {
/*  39 */     return false;
/*     */   }
/*     */   
/*     */   protected void bq()
/*     */   {
/*  44 */     this.o.C.a("ai");
/*  45 */     if ((this.bo > 0) && 
/*  46 */       (--this.bo == 0)) {
/*  47 */       ti localti = a(yj.d);
/*  48 */       localti.b(i);
/*     */     }
/*     */     
/*  51 */     this.bn = bP();
/*  52 */     float f1 = 16.0F;
/*     */     
/*  54 */     if (this.bm == null) {
/*  55 */       this.bm = bR();
/*  56 */       if (this.bm != null) {
/*  57 */         this.bp = this.o.a(this, this.bm, f1, true, false, false, true);
/*     */       }
/*     */     }
/*  60 */     else if (this.bm.Z()) {
/*  61 */       float f2 = this.bm.e(this);
/*  62 */       if (p(this.bm)) {
/*  63 */         a(this.bm, f2);
/*     */       }
/*     */     } else {
/*  66 */       this.bm = null;
/*     */     }
/*     */     
/*  69 */     if (((this.bm instanceof mw)) && 
/*  70 */       (((mw)this.bm).c.d())) {
/*  71 */       this.bm = null;
/*     */     }
/*     */     
/*  74 */     this.o.C.b();
/*     */     
/*     */ 
/*  77 */     if ((!this.bn) && (this.bm != null) && ((this.bp == null) || (this.Z.nextInt(20) == 0))) {
/*  78 */       this.bp = this.o.a(this, this.bm, f1, true, false, false, true);
/*  79 */     } else if ((!this.bn) && (((this.bp == null) && (this.Z.nextInt(180) == 0)) || (((this.Z.nextInt(120) == 0) || (this.bo > 0)) && 
/*  80 */       (this.aU < 100)))) {
/*  81 */       bQ();
/*     */     }
/*     */     
/*     */ 
/*  85 */     int j = qh.c(this.C.b + 0.5D);
/*     */     
/*  87 */     boolean bool1 = M();
/*  88 */     boolean bool2 = P();
/*  89 */     this.z = 0.0F;
/*  90 */     if ((this.bp == null) || (this.Z.nextInt(100) == 0)) {
/*  91 */       super.bq();
/*  92 */       this.bp = null;
/*  93 */       return;
/*     */     }
/*     */     
/*  96 */     this.o.C.a("followpath");
/*  97 */     azw localazw = this.bp.a(this);
/*  98 */     double d1 = this.M * 2.0F;
/*  99 */     while ((localazw != null) && (localazw.d(this.s, localazw.b, this.u) < d1 * d1)) {
/* 100 */       this.bp.a();
/* 101 */       if (this.bp.b()) {
/* 102 */         localazw = null;
/* 103 */         this.bp = null;
/* 104 */       } else { localazw = this.bp.a(this);
/*     */       }
/*     */     }
/* 107 */     this.bc = false;
/* 108 */     if (localazw != null) {
/* 109 */       double d2 = localazw.a - this.s;
/* 110 */       double d3 = localazw.c - this.u;
/* 111 */       double d4 = localazw.b - j;
/* 112 */       float f3 = (float)(Math.atan2(d3, d2) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 113 */       float f4 = qh.g(f3 - this.y);
/* 114 */       this.be = ((float)a(yj.d).e());
/* 115 */       if (f4 > 30.0F) {
/* 116 */         f4 = 30.0F;
/*     */       }
/* 118 */       if (f4 < -30.0F) {
/* 119 */         f4 = -30.0F;
/*     */       }
/* 121 */       this.y += f4;
/*     */       
/* 123 */       if ((this.bn) && 
/* 124 */         (this.bm != null)) {
/* 125 */         double d5 = this.bm.s - this.s;
/* 126 */         double d6 = this.bm.u - this.u;
/*     */         
/* 128 */         float f5 = this.y;
/* 129 */         this.y = ((float)(Math.atan2(d6, d5) * 180.0D / 3.1415927410125732D) - 90.0F);
/*     */         
/* 131 */         f4 = (f5 - this.y + 90.0F) * 3.1415927F / 180.0F;
/* 132 */         this.bd = (-qh.a(f4) * this.be * 1.0F);
/* 133 */         this.be = (qh.b(f4) * this.be * 1.0F);
/*     */       }
/*     */       
/* 136 */       if (d4 > 0.0D) {
/* 137 */         this.bc = true;
/*     */       }
/*     */     }
/*     */     
/* 141 */     if (this.bm != null) {
/* 142 */       a(this.bm, 30.0F, 30.0F);
/*     */     }
/*     */     
/* 145 */     if ((this.E) && (!bS())) this.bc = true;
/* 146 */     if ((this.Z.nextFloat() < 0.8F) && ((bool1) || (bool2))) this.bc = true;
/* 147 */     this.o.C.b();
/*     */   }
/*     */   
/*     */   protected void bQ() {
/* 151 */     this.o.C.a("stroll");
/* 152 */     int j = 0;
/* 153 */     int k = -1;
/* 154 */     int m = -1;
/* 155 */     int n = -1;
/* 156 */     float f1 = -99999.0F;
/* 157 */     for (int i1 = 0; i1 < 10; i1++) {
/* 158 */       int i2 = qh.c(this.s + this.Z.nextInt(13) - 6.0D);
/* 159 */       int i3 = qh.c(this.t + this.Z.nextInt(7) - 3.0D);
/* 160 */       int i4 = qh.c(this.u + this.Z.nextInt(13) - 6.0D);
/* 161 */       float f2 = a(i2, i3, i4);
/* 162 */       if (f2 > f1) {
/* 163 */         f1 = f2;
/* 164 */         k = i2;
/* 165 */         m = i3;
/* 166 */         n = i4;
/* 167 */         j = 1;
/*     */       }
/*     */     }
/*     */     
/* 171 */     if (j != 0) {
/* 172 */       this.bp = this.o.a(this, k, m, n, 10.0F, true, false, false, true);
/*     */     }
/* 174 */     this.o.C.b();
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(sa paramsa, float paramFloat) {}
/*     */   
/*     */   public float a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 182 */     return 0.0F;
/*     */   }
/*     */   
/*     */   protected sa bR() {
/* 186 */     return null;
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 191 */     int j = qh.c(this.s);
/* 192 */     int k = qh.c(this.C.b);
/* 193 */     int m = qh.c(this.u);
/* 194 */     return (super.by()) && (a(j, k, m) >= 0.0F);
/*     */   }
/*     */   
/*     */   public boolean bS() {
/* 198 */     return this.bp != null;
/*     */   }
/*     */   
/*     */   public void a(ayf paramayf) {
/* 202 */     this.bp = paramayf;
/*     */   }
/*     */   
/*     */   public sa bT() {
/* 206 */     return this.bm;
/*     */   }
/*     */   
/*     */   public void b(sa paramsa) {
/* 210 */     this.bm = paramsa;
/*     */   }
/*     */   
/*     */   public boolean bU()
/*     */   {
/* 215 */     return b(qh.c(this.s), qh.c(this.t), qh.c(this.u));
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt1, int paramInt2, int paramInt3) {
/* 219 */     if (this.br == -1.0F) return true;
/* 220 */     return this.bq.e(paramInt1, paramInt2, paramInt3) < this.br * this.br;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 224 */     this.bq.b(paramInt1, paramInt2, paramInt3);
/* 225 */     this.br = paramInt4;
/*     */   }
/*     */   
/*     */   public r bV() {
/* 229 */     return this.bq;
/*     */   }
/*     */   
/*     */   public float bW() {
/* 233 */     return this.br;
/*     */   }
/*     */   
/*     */   public void bX() {
/* 237 */     this.br = -1.0F;
/*     */   }
/*     */   
/*     */   public boolean bY() {
/* 241 */     return this.br != -1.0F;
/*     */   }
/*     */   
/*     */   protected void bL()
/*     */   {
/* 246 */     super.bL();
/*     */     
/* 248 */     if ((bN()) && (bO() != null) && (bO().o == this.o))
/*     */     {
/* 250 */       sa localsa = bO();
/* 251 */       a((int)localsa.s, (int)localsa.t, (int)localsa.u, 5);
/*     */       
/* 253 */       float f = e(localsa);
/*     */       
/* 255 */       if (((this instanceof tg)) && (((tg)this).ca())) {
/* 256 */         if (f > 10.0F) {
/* 257 */           a(true, true);
/*     */         }
/* 259 */         return;
/*     */       }
/*     */       
/* 262 */       if (!this.bt) {
/* 263 */         this.c.a(2, this.bs);
/* 264 */         m().a(false);
/* 265 */         this.bt = true;
/*     */       }
/*     */       
/* 268 */       o(f);
/*     */       
/* 270 */       if (f > 4.0F)
/*     */       {
/* 272 */         m().a(localsa, 1.0D);
/*     */       }
/* 274 */       if (f > 6.0F)
/*     */       {
/* 276 */         double d1 = (localsa.s - this.s) / f;
/* 277 */         double d2 = (localsa.t - this.t) / f;
/* 278 */         double d3 = (localsa.u - this.u) / f;
/*     */         
/* 280 */         this.v += d1 * Math.abs(d1) * 0.4D;
/* 281 */         this.w += d2 * Math.abs(d2) * 0.4D;
/* 282 */         this.x += d3 * Math.abs(d3) * 0.4D;
/*     */       }
/* 284 */       if (f > 10.0F) {
/* 285 */         a(true, true);
/*     */       }
/*     */     }
/* 288 */     else if ((!bN()) && (this.bt)) {
/* 289 */       this.bt = false;
/* 290 */       this.c.a(this.bs);
/* 291 */       m().a(true);
/* 292 */       bX();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void o(float paramFloat) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */