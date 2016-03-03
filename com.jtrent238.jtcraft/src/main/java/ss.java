/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ss
/*     */   extends sa
/*     */ {
/*     */   private int e;
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   
/*     */   public ss(ahb paramahb)
/*     */   {
/*  20 */     super(paramahb);
/*  21 */     this.L = 0.0F;
/*  22 */     a(0.5F, 0.5F);
/*     */   }
/*     */   
/*     */   public ss(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  26 */     this(paramahb);
/*  27 */     this.b = paramInt1;
/*  28 */     this.c = paramInt2;
/*  29 */     this.d = paramInt3;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */   public void a(int paramInt)
/*     */   {
/*  37 */     this.a = paramInt;
/*  38 */     this.A = (this.y = paramInt * 90);
/*     */     
/*  40 */     float f1 = f();
/*  41 */     float f2 = i();
/*  42 */     float f3 = f();
/*     */     
/*  44 */     if ((paramInt == 2) || (paramInt == 0)) {
/*  45 */       f3 = 0.5F;
/*  46 */       this.y = (this.A = p.f[paramInt] * 90);
/*     */     } else {
/*  48 */       f1 = 0.5F;
/*     */     }
/*     */     
/*  51 */     f1 /= 32.0F;
/*  52 */     f2 /= 32.0F;
/*  53 */     f3 /= 32.0F;
/*     */     
/*  55 */     float f4 = this.b + 0.5F;
/*  56 */     float f5 = this.c + 0.5F;
/*  57 */     float f6 = this.d + 0.5F;
/*     */     
/*  59 */     float f7 = 0.5625F;
/*     */     
/*  61 */     if (paramInt == 2) f6 -= f7;
/*  62 */     if (paramInt == 1) f4 -= f7;
/*  63 */     if (paramInt == 0) f6 += f7;
/*  64 */     if (paramInt == 3) { f4 += f7;
/*     */     }
/*  66 */     if (paramInt == 2) f4 -= c(f());
/*  67 */     if (paramInt == 1) f6 += c(f());
/*  68 */     if (paramInt == 0) f4 += c(f());
/*  69 */     if (paramInt == 3) f6 -= c(f());
/*  70 */     f5 += c(i());
/*     */     
/*  72 */     b(f4, f5, f6);
/*     */     
/*  74 */     float f8 = -0.03125F;
/*  75 */     this.C.b(f4 - f1 - f8, f5 - f2 - f8, f6 - f3 - f8, f4 + f1 + f8, f5 + f2 + f8, f6 + f3 + f8);
/*     */   }
/*     */   
/*     */   private float c(int paramInt) {
/*  79 */     if (paramInt == 32) return 0.5F;
/*  80 */     if (paramInt == 64) return 0.5F;
/*  81 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  86 */     this.p = this.s;
/*  87 */     this.q = this.t;
/*  88 */     this.r = this.u;
/*  89 */     if ((this.e++ == 100) && (!this.o.E)) {
/*  90 */       this.e = 0;
/*  91 */       if ((!this.K) && (!e())) {
/*  92 */         B();
/*  93 */         b(null);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  99 */     if (!this.o.a(this, this.C).isEmpty()) {
/* 100 */       return false;
/*     */     }
/* 102 */     int i = Math.max(1, f() / 16);
/* 103 */     int j = Math.max(1, i() / 16);
/*     */     
/* 105 */     int k = this.b;
/* 106 */     int m = this.c;
/* 107 */     int n = this.d;
/* 108 */     if (this.a == 2) k = qh.c(this.s - f() / 32.0F);
/* 109 */     if (this.a == 1) n = qh.c(this.u - f() / 32.0F);
/* 110 */     if (this.a == 0) k = qh.c(this.s - f() / 32.0F);
/* 111 */     if (this.a == 3) n = qh.c(this.u - f() / 32.0F);
/* 112 */     m = qh.c(this.t - i() / 32.0F);
/*     */     Object localObject;
/* 114 */     for (int i1 = 0; i1 < i; i1++) {
/* 115 */       for (int i2 = 0; i2 < j; i2++)
/*     */       {
/* 117 */         if ((this.a == 2) || (this.a == 0)) {
/* 118 */           localObject = this.o.a(k + i1, m + i2, this.d).o();
/*     */         } else {
/* 120 */           localObject = this.o.a(this.b, m + i2, n + i1).o();
/*     */         }
/* 122 */         if (!((awt)localObject).a())
/* 123 */           return false;
/*     */       }
/*     */     }
/* 126 */     List localList = this.o.b(this, this.C);
/* 127 */     for (Iterator localIterator = localList.iterator(); localIterator.hasNext();) { localObject = (sa)localIterator.next();
/* 128 */       if ((localObject instanceof ss)) {
/* 129 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/* 138 */     return true;
/*     */   }
/*     */   
/*     */   public boolean j(sa paramsa)
/*     */   {
/* 143 */     if ((paramsa instanceof yz)) {
/* 144 */       return a(ro.a((yz)paramsa), 0.0F);
/*     */     }
/* 146 */     return false;
/*     */   }
/*     */   
/*     */   public void i(int paramInt)
/*     */   {
/* 151 */     this.o.X();
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 156 */     if (aw()) return false;
/* 157 */     if ((!this.K) && (!this.o.E)) {
/* 158 */       B();
/* 159 */       Q();
/* 160 */       b(paramro.j());
/*     */     }
/* 162 */     return true;
/*     */   }
/*     */   
/*     */   public void d(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 167 */     if ((!this.o.E) && (!this.K) && (paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D)) {
/* 168 */       B();
/* 169 */       b(null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void g(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 175 */     if ((!this.o.E) && (!this.K) && (paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D)) {
/* 176 */       B();
/* 177 */       b(null);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 183 */     paramdh.a("Direction", (byte)this.a);
/* 184 */     paramdh.a("TileX", this.b);
/* 185 */     paramdh.a("TileY", this.c);
/* 186 */     paramdh.a("TileZ", this.d);
/*     */     
/*     */ 
/* 189 */     switch (this.a) {
/*     */     case 2: 
/* 191 */       paramdh.a("Dir", (byte)0);
/* 192 */       break;
/*     */     case 1: 
/* 194 */       paramdh.a("Dir", (byte)1);
/* 195 */       break;
/*     */     case 0: 
/* 197 */       paramdh.a("Dir", (byte)2);
/* 198 */       break;
/*     */     case 3: 
/* 200 */       paramdh.a("Dir", (byte)3);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 207 */     if (paramdh.b("Direction", 99)) {
/* 208 */       this.a = paramdh.d("Direction");
/*     */     } else {
/* 210 */       switch (paramdh.d("Dir")) {
/*     */       case 0: 
/* 212 */         this.a = 2;
/* 213 */         break;
/*     */       case 1: 
/* 215 */         this.a = 1;
/* 216 */         break;
/*     */       case 2: 
/* 218 */         this.a = 0;
/* 219 */         break;
/*     */       case 3: 
/* 221 */         this.a = 3;
/*     */       }
/*     */       
/*     */     }
/* 225 */     this.b = paramdh.f("TileX");
/* 226 */     this.c = paramdh.f("TileY");
/* 227 */     this.d = paramdh.f("TileZ");
/* 228 */     a(this.a);
/*     */   }
/*     */   
/*     */   public abstract int f();
/*     */   
/*     */   public abstract int i();
/*     */   
/*     */   public abstract void b(sa paramsa);
/*     */   
/*     */   protected boolean V()
/*     */   {
/* 239 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */