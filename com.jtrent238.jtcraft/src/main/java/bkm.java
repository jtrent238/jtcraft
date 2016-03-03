/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkm
/*     */   extends sa
/*     */ {
/*     */   protected int b;
/*     */   protected int c;
/*     */   protected float d;
/*     */   protected float e;
/*     */   protected int f;
/*     */   protected int g;
/*     */   protected float h;
/*     */   protected float i;
/*     */   protected float at;
/*     */   protected float au;
/*     */   protected float av;
/*  20 */   protected float aw = 1.0F;
/*     */   protected rf ax;
/*     */   public static double ay;
/*     */   public static double az;
/*     */   public static double aA;
/*     */   
/*  26 */   protected bkm(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) { super(paramahb);
/*     */     
/*  28 */     a(0.2F, 0.2F);
/*  29 */     this.L = (this.N / 2.0F);
/*  30 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  31 */     this.S = paramDouble1;
/*  32 */     this.T = paramDouble2;
/*  33 */     this.U = paramDouble3;
/*  34 */     this.at = (this.au = this.av = 1.0F);
/*     */     
/*  36 */     this.d = (this.Z.nextFloat() * 3.0F);
/*  37 */     this.e = (this.Z.nextFloat() * 3.0F);
/*     */     
/*  39 */     this.h = ((this.Z.nextFloat() * 0.5F + 0.5F) * 2.0F);
/*     */     
/*  41 */     this.g = ((int)(4.0F / (this.Z.nextFloat() * 0.9F + 0.1F)));
/*  42 */     this.f = 0;
/*     */   }
/*     */   
/*     */   public bkm(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  46 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  48 */     this.v = (paramDouble4 + (float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  49 */     this.w = (paramDouble5 + (float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  50 */     this.x = (paramDouble6 + (float)(Math.random() * 2.0D - 1.0D) * 0.4F);
/*  51 */     float f1 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
/*     */     
/*  53 */     float f2 = qh.a(this.v * this.v + this.w * this.w + this.x * this.x);
/*  54 */     this.v = (this.v / f2 * f1 * 0.4000000059604645D);
/*  55 */     this.w = (this.w / f2 * f1 * 0.4000000059604645D + 0.10000000149011612D);
/*  56 */     this.x = (this.x / f2 * f1 * 0.4000000059604645D);
/*     */   }
/*     */   
/*     */   public bkm a(float paramFloat)
/*     */   {
/*  61 */     this.v *= paramFloat;
/*  62 */     this.w = ((this.w - 0.10000000149011612D) * paramFloat + 0.10000000149011612D);
/*  63 */     this.x *= paramFloat;
/*  64 */     return this;
/*     */   }
/*     */   
/*     */   public bkm f(float paramFloat) {
/*  68 */     a(0.2F * paramFloat, 0.2F * paramFloat);
/*  69 */     this.h *= paramFloat;
/*  70 */     return this;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat1, float paramFloat2, float paramFloat3) {
/*  74 */     this.at = paramFloat1;
/*  75 */     this.au = paramFloat2;
/*  76 */     this.av = paramFloat3;
/*     */   }
/*     */   
/*     */   public void g(float paramFloat) {
/*  80 */     this.aw = paramFloat;
/*     */   }
/*     */   
/*     */   public float b() {
/*  84 */     return this.at;
/*     */   }
/*     */   
/*     */   public float d() {
/*  88 */     return this.au;
/*     */   }
/*     */   
/*     */   public float e() {
/*  92 */     return this.av;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected boolean g_()
/*     */   {
/* 101 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public void h()
/*     */   {
/* 110 */     this.p = this.s;
/* 111 */     this.q = this.t;
/* 112 */     this.r = this.u;
/*     */     
/* 114 */     if (this.f++ >= this.g) { B();
/*     */     }
/* 116 */     this.w -= 0.04D * this.i;
/* 117 */     d(this.v, this.w, this.x);
/* 118 */     this.v *= 0.9800000190734863D;
/* 119 */     this.w *= 0.9800000190734863D;
/* 120 */     this.x *= 0.9800000190734863D;
/*     */     
/* 122 */     if (this.D) {
/* 123 */       this.v *= 0.699999988079071D;
/* 124 */       this.x *= 0.699999988079071D;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/* 129 */     float f1 = this.b / 16.0F;
/* 130 */     float f2 = f1 + 0.0624375F;
/* 131 */     float f3 = this.c / 16.0F;
/* 132 */     float f4 = f3 + 0.0624375F;
/* 133 */     float f5 = 0.1F * this.h;
/*     */     
/* 135 */     if (this.ax != null) {
/* 136 */       f1 = this.ax.c();
/* 137 */       f2 = this.ax.d();
/* 138 */       f3 = this.ax.e();
/* 139 */       f4 = this.ax.f();
/*     */     }
/*     */     
/* 142 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - ay);
/* 143 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - az);
/* 144 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aA);
/*     */     
/* 146 */     parambmh.a(this.at, this.au, this.av, this.aw);
/*     */     
/* 148 */     parambmh.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 149 */     parambmh.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 150 */     parambmh.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 151 */     parambmh.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/*     */   }
/*     */   
/*     */   public int a() {
/* 155 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public void a(rf paramrf)
/*     */   {
/* 167 */     if (a() == 1) {
/* 168 */       this.ax = paramrf;
/* 169 */     } else if (a() == 2) {
/* 170 */       this.ax = paramrf;
/*     */     } else {
/* 172 */       throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
/*     */     }
/*     */   }
/*     */   
/*     */   public void k(int paramInt) {
/* 177 */     if (a() != 0) {
/* 178 */       throw new RuntimeException("Invalid call to Particle.setMiscTex");
/*     */     }
/* 180 */     this.b = (paramInt % 16);
/* 181 */     this.c = (paramInt / 16);
/*     */   }
/*     */   
/*     */   public void i() {
/* 185 */     this.b += 1;
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 190 */     return false;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 195 */     return getClass().getSimpleName() + ", Pos (" + this.s + "," + this.t + "," + this.u + "), RGBA (" + this.at + "," + this.au + "," + this.av + "," + this.aw + "), Age " + this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */