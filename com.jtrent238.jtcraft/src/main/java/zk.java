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
/*     */ public abstract class zk
/*     */   extends sa
/*     */   implements zh
/*     */ {
/*  19 */   private int c = -1;
/*  20 */   private int d = -1;
/*  21 */   private int e = -1;
/*     */   private aji f;
/*     */   protected boolean a;
/*     */   public int b;
/*     */   private sv g;
/*     */   private String h;
/*     */   private int i;
/*     */   private int at;
/*     */   
/*     */   public zk(ahb paramahb) {
/*  31 */     super(paramahb);
/*  32 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public boolean a(double paramDouble)
/*     */   {
/*  41 */     double d1 = this.C.a() * 4.0D;
/*  42 */     d1 *= 64.0D;
/*  43 */     return paramDouble < d1 * d1;
/*     */   }
/*     */   
/*     */   public zk(ahb paramahb, sv paramsv) {
/*  47 */     super(paramahb);
/*  48 */     this.g = paramsv;
/*     */     
/*  50 */     a(0.25F, 0.25F);
/*     */     
/*  52 */     b(paramsv.s, paramsv.t + paramsv.g(), paramsv.u, paramsv.y, paramsv.z);
/*     */     
/*  54 */     this.s -= qh.b(this.y / 180.0F * 3.1415927F) * 0.16F;
/*  55 */     this.t -= 0.10000000149011612D;
/*  56 */     this.u -= qh.a(this.y / 180.0F * 3.1415927F) * 0.16F;
/*  57 */     b(this.s, this.t, this.u);
/*  58 */     this.L = 0.0F;
/*     */     
/*  60 */     float f1 = 0.4F;
/*  61 */     this.v = (-qh.a(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/*  62 */     this.x = (qh.b(this.y / 180.0F * 3.1415927F) * qh.b(this.z / 180.0F * 3.1415927F) * f1);
/*  63 */     this.w = (-qh.a((this.z + f()) / 180.0F * 3.1415927F) * f1);
/*     */     
/*  65 */     c(this.v, this.w, this.x, e(), 1.0F);
/*     */   }
/*     */   
/*     */   public zk(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  69 */     super(paramahb);
/*  70 */     this.i = 0;
/*     */     
/*  72 */     a(0.25F, 0.25F);
/*     */     
/*  74 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  75 */     this.L = 0.0F;
/*     */   }
/*     */   
/*     */   protected float e() {
/*  79 */     return 1.5F;
/*     */   }
/*     */   
/*     */   protected float f() {
/*  83 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void c(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*     */   {
/*  88 */     float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3);
/*     */     
/*  90 */     paramDouble1 /= f1;
/*  91 */     paramDouble2 /= f1;
/*  92 */     paramDouble3 /= f1;
/*     */     
/*  94 */     paramDouble1 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  95 */     paramDouble2 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*  96 */     paramDouble3 += this.Z.nextGaussian() * 0.007499999832361937D * paramFloat2;
/*     */     
/*  98 */     paramDouble1 *= paramFloat1;
/*  99 */     paramDouble2 *= paramFloat1;
/* 100 */     paramDouble3 *= paramFloat1;
/*     */     
/* 102 */     this.v = paramDouble1;
/* 103 */     this.w = paramDouble2;
/* 104 */     this.x = paramDouble3;
/*     */     
/* 106 */     float f2 = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*     */     
/* 108 */     this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/* 109 */     this.B = (this.z = (float)(Math.atan2(paramDouble2, f2) * 180.0D / 3.1415927410125732D));
/* 110 */     this.i = 0;
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 115 */     this.v = paramDouble1;
/* 116 */     this.w = paramDouble2;
/* 117 */     this.x = paramDouble3;
/* 118 */     if ((this.B == 0.0F) && (this.A == 0.0F)) {
/* 119 */       float f1 = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/* 120 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/* 121 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f1) * 180.0D / 3.1415927410125732D));
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 127 */     this.S = this.s;
/* 128 */     this.T = this.t;
/* 129 */     this.U = this.u;
/* 130 */     super.h();
/*     */     
/* 132 */     if (this.b > 0) { this.b -= 1;
/*     */     }
/* 134 */     if (this.a) {
/* 135 */       if (this.o.a(this.c, this.d, this.e) == this.f) {
/* 136 */         this.i += 1;
/* 137 */         if (this.i == 1200) B();
/* 138 */         return;
/*     */       }
/* 140 */       this.a = false;
/*     */       
/* 142 */       this.v *= this.Z.nextFloat() * 0.2F;
/* 143 */       this.w *= this.Z.nextFloat() * 0.2F;
/* 144 */       this.x *= this.Z.nextFloat() * 0.2F;
/* 145 */       this.i = 0;
/* 146 */       this.at = 0;
/*     */     }
/*     */     else {
/* 149 */       this.at += 1;
/*     */     }
/*     */     
/* 152 */     azw localazw1 = azw.a(this.s, this.t, this.u);
/* 153 */     azw localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 154 */     azu localazu1 = this.o.a(localazw1, localazw2);
/*     */     
/* 156 */     localazw1 = azw.a(this.s, this.t, this.u);
/* 157 */     localazw2 = azw.a(this.s + this.v, this.t + this.w, this.u + this.x);
/* 158 */     if (localazu1 != null) {
/* 159 */       localazw2 = azw.a(localazu1.f.a, localazu1.f.b, localazu1.f.c);
/*     */     }
/*     */     
/* 162 */     if (!this.o.E) {
/* 163 */       Object localObject = null;
/* 164 */       List localList = this.o.b(this, this.C.a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
/* 165 */       double d1 = 0.0D;
/* 166 */       sv localsv = j();
/* 167 */       for (int k = 0; k < localList.size(); k++) {
/* 168 */         sa localsa = (sa)localList.get(k);
/* 169 */         if ((localsa.R()) && ((localsa != localsv) || (this.at >= 5)))
/*     */         {
/* 171 */           float f5 = 0.3F;
/* 172 */           azt localazt = localsa.C.b(f5, f5, f5);
/* 173 */           azu localazu2 = localazt.a(localazw1, localazw2);
/* 174 */           if (localazu2 != null) {
/* 175 */             double d2 = localazw1.d(localazu2.f);
/* 176 */             if ((d2 < d1) || (d1 == 0.0D)) {
/* 177 */               localObject = localsa;
/* 178 */               d1 = d2;
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 183 */       if (localObject != null) {
/* 184 */         localazu1 = new azu((sa)localObject);
/*     */       }
/*     */     }
/*     */     
/* 188 */     if (localazu1 != null) {
/* 189 */       if ((localazu1.a == azv.b) && (this.o.a(localazu1.b, localazu1.c, localazu1.d) == ajn.aO)) {
/* 190 */         ah();
/*     */       } else {
/* 192 */         a(localazu1);
/*     */       }
/*     */     }
/* 195 */     this.s += this.v;
/* 196 */     this.t += this.w;
/* 197 */     this.u += this.x;
/*     */     
/* 199 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/* 200 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/* 201 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.1415927410125732D));
/*     */     
/* 203 */     while (this.z - this.B < -180.0F)
/* 204 */       this.B -= 360.0F;
/* 205 */     while (this.z - this.B >= 180.0F) {
/* 206 */       this.B += 360.0F;
/*     */     }
/* 208 */     while (this.y - this.A < -180.0F)
/* 209 */       this.A -= 360.0F;
/* 210 */     while (this.y - this.A >= 180.0F) {
/* 211 */       this.A += 360.0F;
/*     */     }
/* 213 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 214 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 216 */     float f2 = 0.99F;
/* 217 */     float f3 = i();
/*     */     
/* 219 */     if (M()) {
/* 220 */       for (int j = 0; j < 4; j++) {
/* 221 */         float f4 = 0.25F;
/* 222 */         this.o.a("bubble", this.s - this.v * f4, this.t - this.w * f4, this.u - this.x * f4, this.v, this.w, this.x);
/*     */       }
/* 224 */       f2 = 0.8F;
/*     */     }
/*     */     
/* 227 */     this.v *= f2;
/* 228 */     this.w *= f2;
/* 229 */     this.x *= f2;
/* 230 */     this.w -= f3;
/*     */     
/* 232 */     b(this.s, this.t, this.u);
/*     */   }
/*     */   
/*     */   protected float i() {
/* 236 */     return 0.03F;
/*     */   }
/*     */   
/*     */   protected abstract void a(azu paramazu);
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 243 */     paramdh.a("xTile", (short)this.c);
/* 244 */     paramdh.a("yTile", (short)this.d);
/* 245 */     paramdh.a("zTile", (short)this.e);
/* 246 */     paramdh.a("inTile", (byte)aji.b(this.f));
/* 247 */     paramdh.a("shake", (byte)this.b);
/* 248 */     paramdh.a("inGround", (byte)(this.a ? 1 : 0));
/*     */     
/* 250 */     if (((this.h == null) || (this.h.length() == 0)) && (this.g != null) && ((this.g instanceof yz))) {
/* 251 */       this.h = this.g.b_();
/*     */     }
/* 253 */     paramdh.a("ownerName", this.h == null ? "" : this.h);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 258 */     this.c = paramdh.e("xTile");
/* 259 */     this.d = paramdh.e("yTile");
/* 260 */     this.e = paramdh.e("zTile");
/* 261 */     this.f = aji.e(paramdh.d("inTile") & 0xFF);
/* 262 */     this.b = (paramdh.d("shake") & 0xFF);
/* 263 */     this.a = (paramdh.d("inGround") == 1);
/* 264 */     this.h = paramdh.j("ownerName");
/* 265 */     if ((this.h != null) && (this.h.length() == 0)) this.h = null;
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 270 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public sv j() {
/* 274 */     if ((this.g == null) && (this.h != null) && (this.h.length() > 0)) {
/* 275 */       this.g = this.o.a(this.h);
/*     */     }
/* 277 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */