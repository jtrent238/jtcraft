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
/*     */ public abstract class ze
/*     */   extends sa
/*     */ {
/*  19 */   private int e = -1;
/*  20 */   private int f = -1;
/*  21 */   private int g = -1;
/*     */   
/*     */   private aji h;
/*     */   private boolean i;
/*     */   public sv a;
/*     */   private int at;
/*     */   
/*     */   public ze(ahb paramahb)
/*     */   {
/*  30 */     super(paramahb);
/*  31 */     a(1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private int au;
/*     */   public double b;
/*     */   public double c;
/*     */   public double d;
/*     */   protected void c() {}
/*     */   
/*  40 */   public boolean a(double paramDouble) { double d1 = this.C.a() * 4.0D;
/*  41 */     d1 *= 64.0D;
/*  42 */     return paramDouble < d1 * d1;
/*     */   }
/*     */   
/*     */   public ze(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  46 */     super(paramahb);
/*  47 */     a(1.0F, 1.0F);
/*     */     
/*  49 */     b(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
/*  50 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  52 */     double d1 = qh.a(paramDouble4 * paramDouble4 + paramDouble5 * paramDouble5 + paramDouble6 * paramDouble6);
/*  53 */     this.b = (paramDouble4 / d1 * 0.1D);
/*  54 */     this.c = (paramDouble5 / d1 * 0.1D);
/*  55 */     this.d = (paramDouble6 / d1 * 0.1D);
/*     */   }
/*     */   
/*     */   public ze(ahb paramahb, sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  59 */     super(paramahb);
/*  60 */     this.a = paramsv;
/*     */     
/*  62 */     a(1.0F, 1.0F);
/*     */     
/*  64 */     b(paramsv.s, paramsv.t, paramsv.u, paramsv.y, paramsv.z);
/*  65 */     b(this.s, this.t, this.u);
/*  66 */     this.L = 0.0F;
/*     */     
/*  68 */     this.v = (this.w = this.x = 0.0D);
/*     */     
/*  70 */     paramDouble1 += this.Z.nextGaussian() * 0.4D;
/*  71 */     paramDouble2 += this.Z.nextGaussian() * 0.4D;
/*  72 */     paramDouble3 += this.Z.nextGaussian() * 0.4D;
/*  73 */     double d1 = qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*  74 */     this.b = (paramDouble1 / d1 * 0.1D);
/*  75 */     this.c = (paramDouble2 / d1 * 0.1D);
/*  76 */     this.d = (paramDouble3 / d1 * 0.1D);
/*     */   }
/*     */   
/*     */ 
/*     */   public void h()
/*     */   {
/*  82 */     if ((!this.o.E) && (((this.a != null) && (this.a.K)) || (!this.o.d((int)this.s, (int)this.t, (int)this.u)))) {
/*  83 */       B();
/*  84 */       return;
/*     */     }
/*     */     
/*  87 */     super.h();
/*  88 */     e(1);
/*     */     
/*  90 */     if (this.i) {
/*  91 */       if (this.o.a(this.e, this.f, this.g) == this.h) {
/*  92 */         this.at += 1;
/*  93 */         if (this.at == 600) B();
/*  94 */         return;
/*     */       }
/*  96 */       this.i = false;
/*     */       
/*  98 */       this.v *= this.Z.nextFloat() * 0.2F;
/*  99 */       this.w *= this.Z.nextFloat() * 0.2F;
/* 100 */       this.x *= this.Z.nextFloat() * 0.2F;
/* 101 */       this.at = 0;
/* 102 */       this.au = 0;
/*     */     }
/*     */     else {
/* 105 */       this.au += 1;
/*     */     }
/*     */     
/* 108 */     azw localazw1 = azw.a(this.s, this.t, this.u);
/* 109 */     azw localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 110 */     azu localazu1 = this.o.a(localazw1, localazw2);
/*     */     
/* 112 */     localazw1 = azw.a(this.s, this.t, this.u);
/* 113 */     localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 114 */     if (localazu1 != null) {
/* 115 */       localazw2 = azw.a(localazu1.f.a, localazu1.f.b, localazu1.f.c);
/*     */     }
/* 117 */     Object localObject = null;
/* 118 */     List localList = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 119 */     double d1 = 0.0D;
/* 120 */     for (int j = 0; j < localList.size(); j++) {
/* 121 */       sa localsa = (sa)localList.get(j);
/* 122 */       if ((localsa.R()) && ((!localsa.i(this.a)) || (this.au >= 25)))
/*     */       {
/* 124 */         float f3 = 0.3F;
/* 125 */         azt localazt = localsa.C.b(f3, f3, f3);
/* 126 */         azu localazu2 = localazt.a(localazw1, localazw2);
/* 127 */         if (localazu2 != null) {
/* 128 */           double d2 = localazw1.d(localazu2.f);
/* 129 */           if ((d2 < d1) || (d1 == 0.0D)) {
/* 130 */             localObject = localsa;
/* 131 */             d1 = d2;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 136 */     if (localObject != null) {
/* 137 */       localazu1 = new azu((sa)localObject);
/*     */     }
/*     */     
/* 140 */     if (localazu1 != null) {
/* 141 */       a(localazu1);
/*     */     }
/*     */     
/* 144 */     this.s += this.v;
/* 145 */     this.t += this.w;
/* 146 */     this.u += this.x;
/*     */     
/* 148 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/* 149 */     this.y = ((float)(Math.atan2(this.x, this.v) * 180.0D / 3.1415927410125732D) + 90.0F);
/* 150 */     this.z = ((float)(Math.atan2(f1, this.w) * 180.0D / 3.1415927410125732D) - 90.0F);
/*     */     
/* 152 */     while (this.z - this.B < -180.0F)
/* 153 */       this.B -= 360.0F;
/* 154 */     while (this.z - this.B >= 180.0F) {
/* 155 */       this.B += 360.0F;
/*     */     }
/* 157 */     while (this.y - this.A < -180.0F)
/* 158 */       this.A -= 360.0F;
/* 159 */     while (this.y - this.A >= 180.0F) {
/* 160 */       this.A += 360.0F;
/*     */     }
/* 162 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 163 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 165 */     float f2 = e();
/* 166 */     if (M()) {
/* 167 */       for (int k = 0; k < 4; k++) {
/* 168 */         float f4 = 0.25F;
/* 169 */         this.o.a("bubble", this.s - this.v * f4, this.t - this.w * f4, this.u - this.x * f4, this.v, this.w, this.x);
/*     */       }
/* 171 */       f2 = 0.8F;
/*     */     }
/*     */     
/* 174 */     this.v += this.b;
/* 175 */     this.w += this.c;
/* 176 */     this.x += this.d;
/* 177 */     this.v *= f2;
/* 178 */     this.w *= f2;
/* 179 */     this.x *= f2;
/*     */     
/* 181 */     this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
/*     */     
/* 183 */     b(this.s, this.t, this.u);
/*     */   }
/*     */   
/*     */   protected float e() {
/* 187 */     return 0.95F;
/*     */   }
/*     */   
/*     */   protected abstract void a(azu paramazu);
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 194 */     paramdh.a("xTile", (short)this.e);
/* 195 */     paramdh.a("yTile", (short)this.f);
/* 196 */     paramdh.a("zTile", (short)this.g);
/* 197 */     paramdh.a("inTile", (byte)aji.b(this.h));
/* 198 */     paramdh.a("inGround", (byte)(this.i ? 1 : 0));
/* 199 */     paramdh.a("direction", a(new double[] { this.v, this.w, this.x }));
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 204 */     this.e = paramdh.e("xTile");
/* 205 */     this.f = paramdh.e("yTile");
/* 206 */     this.g = paramdh.e("zTile");
/* 207 */     this.h = aji.e(paramdh.d("inTile") & 0xFF);
/* 208 */     this.i = (paramdh.d("inGround") == 1);
/*     */     
/*     */ 
/*     */ 
/* 212 */     if (paramdh.b("direction", 9)) {
/* 213 */       dq localdq = paramdh.c("direction", 6);
/* 214 */       this.v = localdq.d(0);
/* 215 */       this.w = localdq.d(1);
/* 216 */       this.x = localdq.d(2);
/*     */     } else {
/* 218 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/* 224 */     return true;
/*     */   }
/*     */   
/*     */   public float af()
/*     */   {
/* 229 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 234 */     if (aw()) return false;
/* 235 */     Q();
/*     */     
/* 237 */     if (paramro.j() != null) {
/* 238 */       azw localazw = paramro.j().ag();
/* 239 */       if (localazw != null) {
/* 240 */         this.v = localazw.a;
/* 241 */         this.w = localazw.b;
/* 242 */         this.x = localazw.c;
/* 243 */         this.b = (this.v * 0.1D);
/* 244 */         this.c = (this.w * 0.1D);
/* 245 */         this.d = (this.x * 0.1D);
/*     */       }
/* 247 */       if ((paramro.j() instanceof sv)) {
/* 248 */         this.a = ((sv)paramro.j());
/*     */       }
/* 250 */       return true;
/*     */     }
/* 252 */     return false;
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 257 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/* 262 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/* 267 */     return 15728880;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */