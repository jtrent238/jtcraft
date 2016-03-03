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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xz
/*     */   extends yg
/*     */ {
/*     */   private int bp;
/*     */   private int bq;
/*  26 */   private int br = 30;
/*  27 */   private int bs = 3;
/*     */   
/*     */   public xz(ahb paramahb) {
/*  30 */     super(paramahb);
/*     */     
/*  32 */     this.c.a(1, new uf(this));
/*  33 */     this.c.a(2, new vi(this));
/*  34 */     this.c.a(3, new tw(this, wn.class, 6.0F, 1.0D, 1.2D));
/*  35 */     this.c.a(4, new uq(this, 1.0D, false));
/*  36 */     this.c.a(5, new vc(this, 0.8D));
/*  37 */     this.c.a(6, new un(this, yz.class, 8.0F));
/*  38 */     this.c.a(6, new vb(this));
/*     */     
/*  40 */     this.d.a(1, new vo(this, yz.class, 0, true));
/*  41 */     this.d.a(2, new vn(this, false));
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  46 */     super.aD();
/*     */     
/*  48 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  53 */     return true;
/*     */   }
/*     */   
/*     */   public int ax()
/*     */   {
/*  58 */     if (o() == null) { return 3;
/*     */     }
/*  60 */     return 3 + (int)(aS() - 1.0F);
/*     */   }
/*     */   
/*     */   protected void b(float paramFloat)
/*     */   {
/*  65 */     super.b(paramFloat);
/*     */     
/*  67 */     this.bq = ((int)(this.bq + paramFloat * 1.5F));
/*  68 */     if (this.bq > this.br - 5) this.bq = (this.br - 5);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  73 */     super.c();
/*     */     
/*  75 */     this.af.a(16, Byte.valueOf((byte)-1));
/*  76 */     this.af.a(17, Byte.valueOf((byte)0));
/*  77 */     this.af.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  82 */     super.b(paramdh);
/*  83 */     if (this.af.a(17) == 1) paramdh.a("powered", true);
/*  84 */     paramdh.a("Fuse", (short)this.br);
/*  85 */     paramdh.a("ExplosionRadius", (byte)this.bs);
/*  86 */     paramdh.a("ignited", cc());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  91 */     super.a(paramdh);
/*  92 */     this.af.b(17, Byte.valueOf((byte)(paramdh.n("powered") ? 1 : 0)));
/*  93 */     if (paramdh.b("Fuse", 99)) this.br = paramdh.e("Fuse");
/*  94 */     if (paramdh.b("ExplosionRadius", 99)) this.bs = paramdh.d("ExplosionRadius");
/*  95 */     if (paramdh.n("ignited")) cd();
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 100 */     if (Z()) {
/* 101 */       this.bp = this.bq;
/*     */       
/*     */ 
/* 104 */       if (cc()) {
/* 105 */         a(1);
/*     */       }
/*     */       
/* 108 */       int i = cb();
/* 109 */       if ((i > 0) && (this.bq == 0)) {
/* 110 */         a("creeper.primed", 1.0F, 0.5F);
/*     */       }
/* 112 */       this.bq += i;
/* 113 */       if (this.bq < 0) this.bq = 0;
/* 114 */       if (this.bq >= this.br) {
/* 115 */         this.bq = this.br;
/* 116 */         ce();
/*     */       }
/*     */     }
/* 119 */     super.h();
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 124 */     return "mob.creeper.say";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 129 */     return "mob.creeper.death";
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/* 134 */     super.a(paramro);
/*     */     
/* 136 */     if ((paramro.j() instanceof yl))
/*     */     {
/* 138 */       int i = adb.b(ade.cd);
/* 139 */       int j = adb.b(ade.co);
/* 140 */       int k = i + this.Z.nextInt(j - i + 1);
/* 141 */       a(adb.d(k), 1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 151 */     return this.af.a(17) == 1;
/*     */   }
/*     */   
/*     */   public float a(float paramFloat) {
/* 155 */     return (this.bp + (this.bq - this.bp) * paramFloat) / (this.br - 2);
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 160 */     return ade.H;
/*     */   }
/*     */   
/*     */   public int cb() {
/* 164 */     return this.af.a(16);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 168 */     this.af.b(16, Byte.valueOf((byte)paramInt));
/*     */   }
/*     */   
/*     */   public void a(xh paramxh)
/*     */   {
/* 173 */     super.a(paramxh);
/* 174 */     this.af.b(17, Byte.valueOf((byte)1));
/*     */   }
/*     */   
/*     */   protected boolean a(yz paramyz)
/*     */   {
/* 179 */     add localadd = paramyz.bm.h();
/* 180 */     if ((localadd != null) && (localadd.b() == ade.d)) {
/* 181 */       this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.ignite", 1.0F, this.Z.nextFloat() * 0.4F + 0.8F);
/* 182 */       paramyz.ba();
/* 183 */       if (!this.o.E) {
/* 184 */         cd();
/* 185 */         localadd.a(1, paramyz);
/* 186 */         return true;
/*     */       }
/*     */     }
/*     */     
/* 190 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   private void ce() {
/* 194 */     if (!this.o.E) {
/* 195 */       boolean bool = this.o.O().b("mobGriefing");
/* 196 */       if (bZ()) this.o.a(this, this.s, this.t, this.u, this.bs * 2, bool); else
/* 197 */         this.o.a(this, this.s, this.t, this.u, this.bs, bool);
/* 198 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean cc() {
/* 203 */     return this.af.a(18) != 0;
/*     */   }
/*     */   
/*     */   public void cd() {
/* 207 */     this.af.b(18, Byte.valueOf((byte)1));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */