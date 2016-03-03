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
/*     */ public class sq
/*     */   extends sa
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*  20 */   private int d = 5;
/*     */   private int e;
/*     */   private yz f;
/*     */   private int g;
/*     */   
/*     */   public sq(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt) {
/*  26 */     super(paramahb);
/*  27 */     a(0.5F, 0.5F);
/*  28 */     this.L = (this.N / 2.0F);
/*  29 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  31 */     this.y = ((float)(Math.random() * 360.0D));
/*     */     
/*  33 */     this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
/*  34 */     this.w = ((float)(Math.random() * 0.2D) * 2.0F);
/*  35 */     this.x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
/*     */     
/*  37 */     this.e = paramInt;
/*     */   }
/*     */   
/*     */   protected boolean g_()
/*     */   {
/*  42 */     return false;
/*     */   }
/*     */   
/*     */   public sq(ahb paramahb) {
/*  46 */     super(paramahb);
/*  47 */     a(0.25F, 0.25F);
/*  48 */     this.L = (this.N / 2.0F);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public int c(float paramFloat)
/*     */   {
/*  57 */     float f1 = 0.5F;
/*  58 */     if (f1 < 0.0F) f1 = 0.0F;
/*  59 */     if (f1 > 1.0F) f1 = 1.0F;
/*  60 */     int i = super.c(paramFloat);
/*     */     
/*  62 */     int j = i & 0xFF;
/*  63 */     int k = i >> 16 & 0xFF;
/*  64 */     j += (int)(f1 * 15.0F * 16.0F);
/*  65 */     if (j > 240) j = 240;
/*  66 */     return j | k << 16;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  71 */     super.h();
/*  72 */     if (this.c > 0) this.c -= 1;
/*  73 */     this.p = this.s;
/*  74 */     this.q = this.t;
/*  75 */     this.r = this.u;
/*     */     
/*  77 */     this.w -= 0.029999999329447746D;
/*  78 */     if (this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() == awt.i) {
/*  79 */       this.w = 0.20000000298023224D;
/*  80 */       this.v = ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
/*  81 */       this.x = ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
/*  82 */       a("random.fizz", 0.4F, 2.0F + this.Z.nextFloat() * 0.4F);
/*     */     }
/*  84 */     j(this.s, (this.C.b + this.C.e) / 2.0D, this.u);
/*     */     
/*  86 */     double d1 = 8.0D;
/*     */     
/*     */ 
/*  89 */     if (this.g < this.a - 20 + y() % 100) {
/*  90 */       if ((this.f == null) || (this.f.f(this) > d1 * d1)) {
/*  91 */         this.f = this.o.a(this, d1);
/*     */       }
/*  93 */       this.g = this.a;
/*     */     }
/*     */     
/*  96 */     if (this.f != null) {
/*  97 */       double d2 = (this.f.s - this.s) / d1;
/*  98 */       double d3 = (this.f.t + this.f.g() - this.t) / d1;
/*  99 */       double d4 = (this.f.u - this.u) / d1;
/* 100 */       double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
/* 101 */       double d6 = 1.0D - d5;
/* 102 */       if (d6 > 0.0D) {
/* 103 */         d6 *= d6;
/* 104 */         this.v += d2 / d5 * d6 * 0.1D;
/* 105 */         this.w += d3 / d5 * d6 * 0.1D;
/* 106 */         this.x += d4 / d5 * d6 * 0.1D;
/*     */       }
/*     */     }
/*     */     
/* 110 */     d(this.v, this.w, this.x);
/*     */     
/* 112 */     float f1 = 0.98F;
/* 113 */     if (this.D) {
/* 114 */       f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.98F;
/*     */     }
/*     */     
/* 117 */     this.v *= f1;
/* 118 */     this.w *= 0.9800000190734863D;
/* 119 */     this.x *= f1;
/*     */     
/* 121 */     if (this.D) {
/* 122 */       this.w *= -0.8999999761581421D;
/*     */     }
/*     */     
/* 125 */     this.a += 1;
/*     */     
/* 127 */     this.b += 1;
/* 128 */     if (this.b >= 6000) {
/* 129 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean N()
/*     */   {
/* 135 */     return this.o.a(this.C, awt.h, this);
/*     */   }
/*     */   
/*     */   protected void f(int paramInt)
/*     */   {
/* 140 */     a(ro.a, paramInt);
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 145 */     if (aw()) return false;
/* 146 */     Q();
/* 147 */     this.d = ((int)(this.d - paramFloat));
/* 148 */     if (this.d <= 0) {
/* 149 */       B();
/*     */     }
/* 151 */     return false;
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 156 */     paramdh.a("Health", (short)(byte)this.d);
/* 157 */     paramdh.a("Age", (short)this.b);
/* 158 */     paramdh.a("Value", (short)this.e);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 163 */     this.d = (paramdh.e("Health") & 0xFF);
/* 164 */     this.b = paramdh.e("Age");
/* 165 */     this.e = paramdh.e("Value");
/*     */   }
/*     */   
/*     */   public void b_(yz paramyz)
/*     */   {
/* 170 */     if (this.o.E) { return;
/*     */     }
/* 172 */     if ((this.c == 0) && (paramyz.bt == 0)) {
/* 173 */       paramyz.bt = 2;
/* 174 */       this.o.a(paramyz, "random.orb", 0.1F, 0.5F * ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.8F));
/* 175 */       paramyz.a(this, 1);
/* 176 */       paramyz.v(this.e);
/* 177 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public int e() {
/* 182 */     return this.e;
/*     */   }
/*     */   
/*     */   public int f()
/*     */   {
/* 187 */     if (this.e >= 2477)
/* 188 */       return 10;
/* 189 */     if (this.e >= 1237)
/* 190 */       return 9;
/* 191 */     if (this.e >= 617)
/* 192 */       return 8;
/* 193 */     if (this.e >= 307)
/* 194 */       return 7;
/* 195 */     if (this.e >= 149)
/* 196 */       return 6;
/* 197 */     if (this.e >= 73)
/* 198 */       return 5;
/* 199 */     if (this.e >= 37)
/* 200 */       return 4;
/* 201 */     if (this.e >= 17)
/* 202 */       return 3;
/* 203 */     if (this.e >= 7)
/* 204 */       return 2;
/* 205 */     if (this.e >= 3) {
/* 206 */       return 1;
/*     */     }
/*     */     
/* 209 */     return 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static int a(int paramInt)
/*     */   {
/* 222 */     if (paramInt >= 2477)
/* 223 */       return 2477;
/* 224 */     if (paramInt >= 1237)
/* 225 */       return 1237;
/* 226 */     if (paramInt >= 617)
/* 227 */       return 617;
/* 228 */     if (paramInt >= 307)
/* 229 */       return 307;
/* 230 */     if (paramInt >= 149)
/* 231 */       return 149;
/* 232 */     if (paramInt >= 73)
/* 233 */       return 73;
/* 234 */     if (paramInt >= 37)
/* 235 */       return 37;
/* 236 */     if (paramInt >= 17)
/* 237 */       return 17;
/* 238 */     if (paramInt >= 7)
/* 239 */       return 7;
/* 240 */     if (paramInt >= 3) {
/* 241 */       return 3;
/*     */     }
/*     */     
/* 244 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 249 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\sq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */