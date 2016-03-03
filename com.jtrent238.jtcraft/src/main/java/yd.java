/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class yd
/*     */   extends sr
/*     */   implements yb
/*     */ {
/*     */   public int h;
/*     */   public double i;
/*     */   public double bm;
/*     */   public double bn;
/*     */   private sa bq;
/*     */   private int br;
/*     */   public int bo;
/*     */   public int bp;
/*  28 */   private int bs = 1;
/*     */   
/*     */   public yd(ahb paramahb) {
/*  31 */     super(paramahb);
/*  32 */     a(4.0F, 4.0F);
/*  33 */     this.ae = true;
/*  34 */     this.b = 5;
/*     */   }
/*     */   
/*     */   public boolean bP() {
/*  38 */     return this.af.a(16) != 0;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  43 */     if (aw()) return false;
/*  44 */     if (("fireball".equals(paramro.p())) && 
/*  45 */       ((paramro.j() instanceof yz)))
/*     */     {
/*  47 */       super.a(paramro, 1000.0F);
/*  48 */       ((yz)paramro.j()).a(pc.z);
/*  49 */       return true;
/*     */     }
/*     */     
/*     */ 
/*  53 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  58 */     super.c();
/*     */     
/*  60 */     this.af.a(16, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  65 */     super.aD();
/*     */     
/*  67 */     a(yj.a).a(10.0D);
/*     */   }
/*     */   
/*     */   protected void bq()
/*     */   {
/*  72 */     if ((!this.o.E) && (this.o.r == rd.a)) B();
/*  73 */     w();
/*     */     
/*  75 */     this.bo = this.bp;
/*  76 */     double d1 = this.i - this.s;
/*  77 */     double d2 = this.bm - this.t;
/*  78 */     double d3 = this.bn - this.u;
/*     */     
/*  80 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */     
/*  82 */     if ((d4 < 1.0D) || (d4 > 3600.0D)) {
/*  83 */       this.i = (this.s + (this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*  84 */       this.bm = (this.t + (this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*  85 */       this.bn = (this.u + (this.Z.nextFloat() * 2.0F - 1.0F) * 16.0F);
/*     */     }
/*     */     
/*  88 */     if (this.h-- <= 0) {
/*  89 */       this.h += this.Z.nextInt(5) + 2;
/*     */       
/*  91 */       d4 = qh.a(d4);
/*     */       
/*  93 */       if (a(this.i, this.bm, this.bn, d4)) {
/*  94 */         this.v += d1 / d4 * 0.1D;
/*  95 */         this.w += d2 / d4 * 0.1D;
/*  96 */         this.x += d3 / d4 * 0.1D;
/*     */       } else {
/*  98 */         this.i = this.s;
/*  99 */         this.bm = this.t;
/* 100 */         this.bn = this.u;
/*     */       }
/*     */     }
/*     */     
/* 104 */     if ((this.bq != null) && (this.bq.K)) this.bq = null;
/* 105 */     if ((this.bq == null) || (this.br-- <= 0)) {
/* 106 */       this.bq = this.o.b(this, 100.0D);
/* 107 */       if (this.bq != null) {
/* 108 */         this.br = 20;
/*     */       }
/*     */     }
/*     */     
/* 112 */     double d5 = 64.0D;
/* 113 */     if ((this.bq != null) && (this.bq.f(this) < d5 * d5)) {
/* 114 */       double d6 = this.bq.s - this.s;
/* 115 */       double d7 = this.bq.C.b + this.bq.N / 2.0F - (this.t + this.N / 2.0F);
/* 116 */       double d8 = this.bq.u - this.u;
/* 117 */       this.aM = (this.y = -(float)Math.atan2(d6, d8) * 180.0F / 3.1415927F);
/*     */       
/* 119 */       if (p(this.bq)) {
/* 120 */         if (this.bp == 10) {
/* 121 */           this.o.a(null, 1007, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */         }
/* 123 */         this.bp += 1;
/* 124 */         if (this.bp == 20) {
/* 125 */           this.o.a(null, 1008, (int)this.s, (int)this.t, (int)this.u, 0);
/* 126 */           zg localzg = new zg(this.o, this, d6, d7, d8);
/* 127 */           localzg.e = this.bs;
/* 128 */           double d9 = 4.0D;
/* 129 */           azw localazw = j(1.0F);
/* 130 */           localzg.s = (this.s + localazw.a * d9);
/* 131 */           localzg.t = (this.t + this.N / 2.0F + 0.5D);
/* 132 */           localzg.u = (this.u + localazw.c * d9);
/* 133 */           this.o.d(localzg);
/* 134 */           this.bp = -40;
/*     */         }
/*     */       }
/* 137 */       else if (this.bp > 0) { this.bp -= 1;
/*     */       }
/*     */     } else {
/* 140 */       this.aM = (this.y = -(float)Math.atan2(this.v, this.x) * 180.0F / 3.1415927F);
/* 141 */       if (this.bp > 0) { this.bp -= 1;
/*     */       }
/*     */     }
/* 144 */     if (!this.o.E) {
/* 145 */       int j = this.af.a(16);
/* 146 */       byte b = (byte)(this.bp > 10 ? 1 : 0);
/* 147 */       if (j != b) {
/* 148 */         this.af.b(16, Byte.valueOf(b));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
/* 154 */     double d1 = (this.i - this.s) / paramDouble4;
/* 155 */     double d2 = (this.bm - this.t) / paramDouble4;
/* 156 */     double d3 = (this.bn - this.u) / paramDouble4;
/*     */     
/* 158 */     azt localazt = this.C.b();
/* 159 */     for (int j = 1; j < paramDouble4; j++) {
/* 160 */       localazt.d(d1, d2, d3);
/* 161 */       if (!this.o.a(this, localazt).isEmpty()) { return false;
/*     */       }
/*     */     }
/* 164 */     return true;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 169 */     return "mob.ghast.moan";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 174 */     return "mob.ghast.scream";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 179 */     return "mob.ghast.death";
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 184 */     return ade.H;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 189 */     int j = this.Z.nextInt(2) + this.Z.nextInt(1 + paramInt);
/* 190 */     for (int k = 0; k < j; k++) {
/* 191 */       a(ade.bk, 1);
/*     */     }
/* 193 */     j = this.Z.nextInt(3) + this.Z.nextInt(1 + paramInt);
/* 194 */     for (k = 0; k < j; k++) {
/* 195 */       a(ade.H, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/* 201 */     return 10.0F;
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 206 */     return (this.Z.nextInt(20) == 0) && (super.by()) && (this.o.r != rd.a);
/*     */   }
/*     */   
/*     */   public int bB()
/*     */   {
/* 211 */     return 1;
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 216 */     super.b(paramdh);
/* 217 */     paramdh.a("ExplosionPower", this.bs);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 222 */     super.a(paramdh);
/* 223 */     if (paramdh.b("ExplosionPower", 99)) this.bs = paramdh.f("ExplosionPower");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */