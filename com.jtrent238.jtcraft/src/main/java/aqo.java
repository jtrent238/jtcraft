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
/*     */ public abstract class aqo
/*     */ {
/*  15 */   public static final float[] a = { 1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F };
/*     */   
/*     */   public ahb b;
/*     */   
/*     */   public ahm c;
/*     */   public String d;
/*     */   public aib e;
/*     */   public boolean f;
/*     */   public boolean g;
/*  24 */   public float[] h = new float[16];
/*     */   public int i;
/*     */   
/*     */   public final void a(ahb paramahb) {
/*  28 */     this.b = paramahb;
/*  29 */     this.c = paramahb.N().u();
/*  30 */     this.d = paramahb.N().y();
/*  31 */     b();
/*  32 */     a();
/*     */   }
/*     */   
/*     */   protected void a() {
/*  36 */     float f1 = 0.0F;
/*  37 */     for (int k = 0; k <= 15; k++) {
/*  38 */       float f2 = 1.0F - k / 15.0F;
/*  39 */       this.h[k] = ((1.0F - f2) / (f2 * 3.0F + 1.0F) * (1.0F - f1) + f1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b() {
/*  44 */     if (this.b.N().u() == ahm.c) {
/*  45 */       ass localass = ass.a(this.b.N().y());
/*  46 */       this.e = new aie(ahu.d(localass.a()), 0.5F);
/*     */     } else {
/*  48 */       this.e = new aib(this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public apu c() {
/*  53 */     if (this.c == ahm.c)
/*     */     {
/*  55 */       return new aqu(this.b, this.b.H(), this.b.N().s(), this.d);
/*     */     }
/*  57 */     return new aqz(this.b, this.b.H(), this.b.N().s());
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, int paramInt2)
/*     */   {
/*  62 */     return this.b.b(paramInt1, paramInt2) == ajn.c;
/*     */   }
/*     */   
/*     */   public float a(long paramLong, float paramFloat) {
/*  66 */     int k = (int)(paramLong % 24000L);
/*  67 */     float f1 = (k + paramFloat) / 24000.0F - 0.25F;
/*  68 */     if (f1 < 0.0F) f1 += 1.0F;
/*  69 */     if (f1 > 1.0F) f1 -= 1.0F;
/*  70 */     float f2 = f1;
/*  71 */     f1 = 1.0F - (float)((Math.cos(f1 * 3.141592653589793D) + 1.0D) / 2.0D);
/*  72 */     f1 = f2 + (f1 - f2) / 3.0F;
/*  73 */     return f1;
/*     */   }
/*     */   
/*     */   public int a(long paramLong)
/*     */   {
/*  78 */     return (int)(paramLong / 24000L % 8L + 8L) % 8;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  82 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*  87 */   private float[] j = new float[4];
/*     */   
/*     */   public float[] a(float paramFloat1, float paramFloat2)
/*     */   {
/*  91 */     float f1 = 0.4F;
/*  92 */     float f2 = qh.b(paramFloat1 * 3.1415927F * 2.0F) - 0.0F;
/*  93 */     float f3 = -0.0F;
/*  94 */     if ((f2 >= f3 - f1) && (f2 <= f3 + f1)) {
/*  95 */       float f4 = (f2 - f3) / f1 * 0.5F + 0.5F;
/*  96 */       float f5 = 1.0F - (1.0F - qh.a(f4 * 3.1415927F)) * 0.99F;
/*  97 */       f5 *= f5;
/*  98 */       this.j[0] = (f4 * 0.3F + 0.7F);
/*  99 */       this.j[1] = (f4 * f4 * 0.7F + 0.2F);
/* 100 */       this.j[2] = (f4 * f4 * 0.0F + 0.2F);
/* 101 */       this.j[3] = f5;
/* 102 */       return this.j;
/*     */     }
/*     */     
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   public azw b(float paramFloat1, float paramFloat2) {
/* 109 */     float f1 = qh.b(paramFloat1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
/* 110 */     if (f1 < 0.0F) f1 = 0.0F;
/* 111 */     if (f1 > 1.0F) { f1 = 1.0F;
/*     */     }
/* 113 */     float f2 = 0.7529412F;
/* 114 */     float f3 = 0.84705883F;
/* 115 */     float f4 = 1.0F;
/* 116 */     f2 *= (f1 * 0.94F + 0.06F);
/* 117 */     f3 *= (f1 * 0.94F + 0.06F);
/* 118 */     f4 *= (f1 * 0.91F + 0.09F);
/*     */     
/* 120 */     return azw.a(f2, f3, f4);
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   public static aqo a(int paramInt) {
/* 128 */     if (paramInt == -1) return new aqp();
/* 129 */     if (paramInt == 0) return new aqq();
/* 130 */     if (paramInt == 1) return new aqr();
/* 131 */     return null;
/*     */   }
/*     */   
/*     */   public float f() {
/* 135 */     return 128.0F;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 139 */     return true;
/*     */   }
/*     */   
/*     */   public r h() {
/* 143 */     return null;
/*     */   }
/*     */   
/*     */   public int i() {
/* 147 */     if (this.c == ahm.c) {
/* 148 */       return 4;
/*     */     }
/* 150 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 154 */     return (this.c != ahm.c) && (!this.g);
/*     */   }
/*     */   
/*     */   public double k() {
/* 158 */     if (this.c == ahm.c) {
/* 159 */       return 1.0D;
/*     */     }
/* 161 */     return 0.03125D;
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt1, int paramInt2) {
/* 165 */     return false;
/*     */   }
/*     */   
/*     */   public abstract String l();
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */