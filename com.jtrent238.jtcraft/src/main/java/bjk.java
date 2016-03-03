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
/*     */ public class bjk
/*     */   extends blk
/*     */ {
/*     */   public final bjb a;
/*     */   private final pq bO;
/*     */   private double bP;
/*     */   private double bQ;
/*     */   private double bR;
/*     */   private double bS;
/*     */   private float bT;
/*     */   private float bU;
/*     */   private boolean bV;
/*     */   private boolean bW;
/*     */   private boolean bX;
/*     */   private int bY;
/*     */   private boolean cd;
/*     */   private String ce;
/*     */   
/*     */   public bjk(bao parambao, ahb paramahb, bbs parambbs, bjb parambjb, pq parampq)
/*     */   {
/*  36 */     super(parambao, paramahb, parambbs, 0);
/*  37 */     this.a = parambjb;
/*  38 */     this.bO = parampq;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void f(float paramFloat) {}
/*     */   
/*     */ 
/*     */   public void a(sa paramsa)
/*     */   {
/*  53 */     super.a(paramsa);
/*     */     
/*  55 */     if ((paramsa instanceof xl)) {
/*  56 */       this.d.X().a(new bsn(this, (xl)paramsa));
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  62 */     if (!this.o.d(qh.c(this.s), 0, qh.c(this.u))) return;
/*  63 */     super.h();
/*     */     
/*  65 */     if (am()) {
/*  66 */       this.a.a(new jg(this.y, this.z, this.D));
/*  67 */       this.a.a(new jk(this.bd, this.be, this.c.c, this.c.d));
/*     */     } else {
/*  69 */       a();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  74 */     boolean bool1 = ao();
/*  75 */     if (bool1 != this.bX) {
/*  76 */       if (bool1) this.a.a(new jj(this, 4)); else {
/*  77 */         this.a.a(new jj(this, 5));
/*     */       }
/*  79 */       this.bX = bool1;
/*     */     }
/*     */     
/*  82 */     boolean bool2 = an();
/*  83 */     if (bool2 != this.bW) {
/*  84 */       if (bool2) this.a.a(new jj(this, 1)); else {
/*  85 */         this.a.a(new jj(this, 2));
/*     */       }
/*  87 */       this.bW = bool2;
/*     */     }
/*     */     
/*  90 */     double d1 = this.s - this.bP;
/*  91 */     double d2 = this.C.b - this.bQ;
/*  92 */     double d3 = this.u - this.bS;
/*     */     
/*  94 */     double d4 = this.y - this.bT;
/*  95 */     double d5 = this.z - this.bU;
/*     */     
/*  97 */     int i = (d1 * d1 + d2 * d2 + d3 * d3 > 9.0E-4D) || (this.bY >= 20) ? 1 : 0;
/*  98 */     int j = (d4 != 0.0D) || (d5 != 0.0D) ? 1 : 0;
/*     */     
/* 100 */     if (this.m != null) {
/* 101 */       this.a.a(new jf(this.v, -999.0D, -999.0D, this.x, this.y, this.z, this.D));
/* 102 */       i = 0;
/*     */     }
/* 104 */     else if ((i != 0) && (j != 0)) {
/* 105 */       this.a.a(new jf(this.s, this.C.b, this.t, this.u, this.y, this.z, this.D));
/* 106 */     } else if (i != 0) {
/* 107 */       this.a.a(new je(this.s, this.C.b, this.t, this.u, this.D));
/* 108 */     } else if (j != 0) {
/* 109 */       this.a.a(new jg(this.y, this.z, this.D));
/*     */     } else {
/* 111 */       this.a.a(new jd(this.D));
/*     */     }
/*     */     
/*     */ 
/* 115 */     this.bY += 1;
/* 116 */     this.bV = this.D;
/*     */     
/* 118 */     if (i != 0) {
/* 119 */       this.bP = this.s;
/* 120 */       this.bQ = this.C.b;
/* 121 */       this.bR = this.t;
/* 122 */       this.bS = this.u;
/* 123 */       this.bY = 0;
/*     */     }
/* 125 */     if (j != 0) {
/* 126 */       this.bT = this.y;
/* 127 */       this.bU = this.z;
/*     */     }
/*     */   }
/*     */   
/*     */   public xk a(boolean paramBoolean)
/*     */   {
/* 133 */     int i = paramBoolean ? 3 : 4;
/* 134 */     this.a.a(new ji(i, 0, 0, 0, 0));
/* 135 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(xk paramxk) {}
/*     */   
/*     */   public void a(String paramString)
/*     */   {
/* 143 */     this.a.a(new ir(paramString));
/*     */   }
/*     */   
/*     */   public void ba()
/*     */   {
/* 148 */     super.ba();
/* 149 */     this.a.a(new ip(this, 1));
/*     */   }
/*     */   
/*     */   public void bH()
/*     */   {
/* 154 */     this.a.a(new is(it.a));
/*     */   }
/*     */   
/*     */   protected void d(ro paramro, float paramFloat)
/*     */   {
/* 159 */     if (aw()) return;
/* 160 */     g(aS() - paramFloat);
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 165 */     this.a.a(new iy(this.bo.d));
/* 166 */     b();
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/* 171 */     this.bm.b(null);
/* 172 */     super.k();
/*     */   }
/*     */   
/*     */   public void n(float paramFloat)
/*     */   {
/* 177 */     if (this.cd) {
/* 178 */       super.n(paramFloat);
/*     */     } else {
/* 180 */       g(paramFloat);
/* 181 */       this.cd = true;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ph paramph, int paramInt)
/*     */   {
/* 187 */     if (paramph == null) {
/* 188 */       return;
/*     */     }
/*     */     
/* 191 */     if (paramph.f) { super.a(paramph, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void q()
/*     */   {
/* 204 */     this.a.a(new jh(this.bE));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void i()
/*     */   {
/* 214 */     this.a.a(new jj(this, 6, (int)(v() * 100.0F)));
/*     */   }
/*     */   
/*     */   public void j() {
/* 218 */     this.a.a(new jj(this, 7));
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 222 */     this.ce = paramString;
/*     */   }
/*     */   
/*     */   public String l() {
/* 226 */     return this.ce;
/*     */   }
/*     */   
/*     */   public pq m() {
/* 230 */     return this.bO;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */