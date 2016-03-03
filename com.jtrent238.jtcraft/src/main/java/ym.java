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
/*     */ public class ym
/*     */   extends sw
/*     */   implements yb
/*     */ {
/*     */   public float h;
/*     */   public float i;
/*     */   public float bm;
/*     */   private int bn;
/*     */   
/*     */   public ym(ahb paramahb)
/*     */   {
/*  25 */     super(paramahb);
/*  26 */     int j = 1 << this.Z.nextInt(3);
/*  27 */     this.L = 0.0F;
/*  28 */     this.bn = (this.Z.nextInt(20) + 10);
/*  29 */     a(j);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c()
/*     */   {
/*  35 */     super.c();
/*     */     
/*  37 */     this.af.a(16, new Byte((byte)1));
/*     */   }
/*     */   
/*     */   protected void a(int paramInt) {
/*  41 */     this.af.b(16, new Byte((byte)paramInt));
/*  42 */     a(0.6F * paramInt, 0.6F * paramInt);
/*  43 */     b(this.s, this.t, this.u);
/*  44 */     a(yj.a).a(paramInt * paramInt);
/*  45 */     g(aY());
/*  46 */     this.b = paramInt;
/*     */   }
/*     */   
/*     */   public int bX() {
/*  50 */     return this.af.a(16);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  55 */     super.b(paramdh);
/*  56 */     paramdh.a("Size", bX() - 1);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  61 */     super.a(paramdh);
/*  62 */     int j = paramdh.f("Size");
/*  63 */     if (j < 0) {
/*  64 */       j = 0;
/*     */     }
/*  66 */     a(j + 1);
/*     */   }
/*     */   
/*     */   protected String bP() {
/*  70 */     return "slime";
/*     */   }
/*     */   
/*     */   protected String bV() {
/*  74 */     return "mob.slime." + (bX() > 1 ? "big" : "small");
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  79 */     if ((!this.o.E) && (this.o.r == rd.a) && (bX() > 0)) {
/*  80 */       this.K = true;
/*     */     }
/*     */     
/*  83 */     this.i += (this.h - this.i) * 0.5F;
/*  84 */     this.bm = this.i;
/*  85 */     boolean bool = this.D;
/*  86 */     super.h();
/*     */     int j;
/*  88 */     if ((this.D) && (!bool)) {
/*  89 */       j = bX();
/*  90 */       for (int k = 0; k < j * 8; k++) {
/*  91 */         float f1 = this.Z.nextFloat() * 3.1415927F * 2.0F;
/*  92 */         float f2 = this.Z.nextFloat() * 0.5F + 0.5F;
/*  93 */         float f3 = qh.a(f1) * j * 0.5F * f2;
/*  94 */         float f4 = qh.b(f1) * j * 0.5F * f2;
/*  95 */         this.o.a(bP(), this.s + f3, this.C.b, this.u + f4, 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */       
/*  98 */       if (bW()) {
/*  99 */         a(bV(), bf(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) / 0.8F);
/*     */       }
/* 101 */       this.h = -0.5F;
/* 102 */     } else if ((!this.D) && (bool)) {
/* 103 */       this.h = 1.0F;
/*     */     }
/* 105 */     bS();
/*     */     
/* 107 */     if (this.o.E) {
/* 108 */       j = bX();
/* 109 */       a(0.6F * j, 0.6F * j);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bq()
/*     */   {
/* 115 */     w();
/* 116 */     yz localyz = this.o.b(this, 16.0D);
/* 117 */     if (localyz != null) {
/* 118 */       a(localyz, 10.0F, 20.0F);
/*     */     }
/* 120 */     if ((this.D) && (this.bn-- <= 0)) {
/* 121 */       this.bn = bR();
/* 122 */       if (localyz != null) {
/* 123 */         this.bn /= 3;
/*     */       }
/* 125 */       this.bc = true;
/* 126 */       if (bY()) {
/* 127 */         a(bV(), bf(), ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F) * 0.8F);
/*     */       }
/*     */       
/* 130 */       this.bd = (1.0F - this.Z.nextFloat() * 2.0F);
/* 131 */       this.be = (1 * bX());
/*     */     } else {
/* 133 */       this.bc = false;
/* 134 */       if (this.D) {
/* 135 */         this.bd = (this.be = 0.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bS() {
/* 141 */     this.h *= 0.6F;
/*     */   }
/*     */   
/*     */   protected int bR() {
/* 145 */     return this.Z.nextInt(20) + 10;
/*     */   }
/*     */   
/*     */   protected ym bQ() {
/* 149 */     return new ym(this.o);
/*     */   }
/*     */   
/*     */   public void B()
/*     */   {
/* 154 */     int j = bX();
/* 155 */     if ((!this.o.E) && (j > 1) && (aS() <= 0.0F)) {
/* 156 */       int k = 2 + this.Z.nextInt(3);
/* 157 */       for (int m = 0; m < k; m++) {
/* 158 */         float f1 = (m % 2 - 0.5F) * j / 4.0F;
/* 159 */         float f2 = (m / 2 - 0.5F) * j / 4.0F;
/* 160 */         ym localym = bQ();
/* 161 */         localym.a(j / 2);
/* 162 */         localym.b(this.s + f1, this.t + 0.5D, this.u + f2, this.Z.nextFloat() * 360.0F, 0.0F);
/* 163 */         this.o.d(localym);
/*     */       }
/*     */     }
/* 166 */     super.B();
/*     */   }
/*     */   
/*     */   public void b_(yz paramyz)
/*     */   {
/* 171 */     if (bT()) {
/* 172 */       int j = bX();
/* 173 */       if ((p(paramyz)) && (f(paramyz) < 0.6D * j * (0.6D * j)) && 
/* 174 */         (paramyz.a(ro.a(this), bU()))) {
/* 175 */         a("mob.attack", 1.0F, (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean bT()
/*     */   {
/* 182 */     return bX() > 1;
/*     */   }
/*     */   
/*     */   protected int bU() {
/* 186 */     return bX();
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 191 */     return "mob.slime." + (bX() > 1 ? "big" : "small");
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 196 */     return "mob.slime." + (bX() > 1 ? "big" : "small");
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 201 */     if (bX() == 1) return ade.aH;
/* 202 */     return adb.d(0);
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 207 */     apx localapx = this.o.d(qh.c(this.s), qh.c(this.u));
/* 208 */     if ((this.o.N().u() == ahm.c) && (this.Z.nextInt(4) != 1)) {
/* 209 */       return false;
/*     */     }
/* 211 */     if ((bX() == 1) || (this.o.r != rd.a))
/*     */     {
/* 213 */       ahu localahu = this.o.a(qh.c(this.s), qh.c(this.u));
/*     */       
/* 215 */       if ((localahu == ahu.u) && (this.t > 50.0D) && (this.t < 70.0D) && (this.Z.nextFloat() < 0.5F) && 
/* 216 */         (this.Z.nextFloat() < this.o.y()) && (this.o.k(qh.c(this.s), qh.c(this.t), qh.c(this.u)) <= this.Z.nextInt(8))) {
/* 217 */         return super.by();
/*     */       }
/*     */       
/* 220 */       if ((this.Z.nextInt(10) == 0) && (localapx.a(987234911L).nextInt(10) == 0) && (this.t < 40.0D)) {
/* 221 */         return super.by();
/*     */       }
/*     */     }
/* 224 */     return false;
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/* 229 */     return 0.4F * bX();
/*     */   }
/*     */   
/*     */   public int x()
/*     */   {
/* 234 */     return 0;
/*     */   }
/*     */   
/*     */   protected boolean bY() {
/* 238 */     return bX() > 0;
/*     */   }
/*     */   
/*     */   protected boolean bW() {
/* 242 */     return bX() > 2;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ym.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */