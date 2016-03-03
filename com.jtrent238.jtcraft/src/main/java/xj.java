/*     */ import java.util.ArrayList;
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
/*     */ public class xj
/*     */   extends sa
/*     */ {
/*     */   private aji e;
/*     */   public int a;
/*     */   public int b;
/*  24 */   public boolean c = true;
/*     */   private boolean f;
/*     */   private boolean g;
/*  27 */   private int h = 40;
/*  28 */   private float i = 2.0F;
/*     */   public dh d;
/*     */   
/*     */   public xj(ahb paramahb) {
/*  32 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public xj(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, aji paramaji) {
/*  36 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3, paramaji, 0);
/*     */   }
/*     */   
/*     */   public xj(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, aji paramaji, int paramInt) {
/*  40 */     super(paramahb);
/*  41 */     this.e = paramaji;
/*  42 */     this.a = paramInt;
/*  43 */     this.k = true;
/*  44 */     a(0.98F, 0.98F);
/*  45 */     this.L = (this.N / 2.0F);
/*  46 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  48 */     this.v = 0.0D;
/*  49 */     this.w = 0.0D;
/*  50 */     this.x = 0.0D;
/*     */     
/*  52 */     this.p = paramDouble1;
/*  53 */     this.q = paramDouble2;
/*  54 */     this.r = paramDouble3;
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean g_()
/*     */   {
/*  60 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public boolean R()
/*     */   {
/*  69 */     return !this.K;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  74 */     if (this.e.o() == awt.a) {
/*  75 */       B();
/*  76 */       return;
/*     */     }
/*     */     
/*  79 */     this.p = this.s;
/*  80 */     this.q = this.t;
/*  81 */     this.r = this.u;
/*  82 */     this.b += 1;
/*     */     
/*  84 */     this.w -= 0.03999999910593033D;
/*  85 */     d(this.v, this.w, this.x);
/*  86 */     this.v *= 0.9800000190734863D;
/*  87 */     this.w *= 0.9800000190734863D;
/*  88 */     this.x *= 0.9800000190734863D;
/*     */     
/*  90 */     if (!this.o.E) {
/*  91 */       int j = qh.c(this.s);
/*  92 */       int k = qh.c(this.t);
/*  93 */       int m = qh.c(this.u);
/*     */       
/*  95 */       if (this.b == 1) {
/*  96 */         if (this.o.a(j, k, m) == this.e) {
/*  97 */           this.o.f(j, k, m);
/*     */         } else {
/*  99 */           B();
/* 100 */           return;
/*     */         }
/*     */       }
/*     */       
/* 104 */       if (this.D) {
/* 105 */         this.v *= 0.699999988079071D;
/* 106 */         this.x *= 0.699999988079071D;
/* 107 */         this.w *= -0.5D;
/*     */         
/* 109 */         if (this.o.a(j, k, m) != ajn.M) {
/* 110 */           B();
/*     */           
/* 112 */           if ((!this.f) && (this.o.a(this.e, j, k, m, true, 1, null, null)) && (!akx.e(this.o, j, k - 1, m)) && (this.o.d(j, k, m, this.e, this.a, 3)))
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 120 */             if ((this.e instanceof akx)) {
/* 121 */               ((akx)this.e).a(this.o, j, k, m, this.a);
/*     */             }
/* 123 */             if ((this.d != null) && ((this.e instanceof akw))) {
/* 124 */               aor localaor = this.o.o(j, k, m);
/*     */               
/* 126 */               if (localaor != null) {
/* 127 */                 dh localdh = new dh();
/* 128 */                 localaor.b(localdh);
/* 129 */                 for (String str : this.d.c()) {
/* 130 */                   dy localdy = this.d.a(str);
/* 131 */                   if ((!str.equals("x")) && (!str.equals("y")) && (!str.equals("z")))
/* 132 */                     localdh.a(str, localdy.b());
/*     */                 }
/* 134 */                 localaor.a(localdh);
/* 135 */                 localaor.e();
/*     */               }
/*     */             }
/*     */           }
/* 139 */           else if ((this.c) && (!this.f)) { a(new add(this.e, 1, this.e.a(this.a)), 0.0F);
/*     */           }
/*     */         }
/* 142 */       } else if (((this.b > 100) && (!this.o.E) && ((k < 1) || (k > 256))) || (this.b > 600)) {
/* 143 */         if (this.c) a(new add(this.e, 1, this.e.a(this.a)), 0.0F);
/* 144 */         B();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(float paramFloat)
/*     */   {
/* 151 */     if (this.g) {
/* 152 */       int j = qh.f(paramFloat - 1.0F);
/* 153 */       if (j > 0) {
/* 154 */         ArrayList localArrayList = new ArrayList(this.o.b(this, this.C));
/* 155 */         int k = this.e == ajn.bQ ? 1 : 0;
/* 156 */         ro localro = k != 0 ? ro.m : ro.n;
/*     */         
/* 158 */         for (sa localsa : localArrayList) {
/* 159 */           localsa.a(localro, Math.min(qh.d(j * this.i), this.h));
/*     */         }
/*     */         
/* 162 */         if ((k != 0) && (this.Z.nextFloat() < 0.05000000074505806D + j * 0.05D)) {
/* 163 */           int m = this.a >> 2;
/* 164 */           int n = this.a & 0x3;
/*     */           
/* 166 */           m++; if (m > 2) {
/* 167 */             this.f = true;
/*     */           } else {
/* 169 */             this.a = (n | m << 2);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 178 */     paramdh.a("Tile", (byte)aji.b(this.e));
/* 179 */     paramdh.a("TileID", aji.b(this.e));
/* 180 */     paramdh.a("Data", (byte)this.a);
/* 181 */     paramdh.a("Time", (byte)this.b);
/* 182 */     paramdh.a("DropItem", this.c);
/* 183 */     paramdh.a("HurtEntities", this.g);
/* 184 */     paramdh.a("FallHurtAmount", this.i);
/* 185 */     paramdh.a("FallHurtMax", this.h);
/* 186 */     if (this.d != null) paramdh.a("TileEntityData", this.d);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 191 */     if (paramdh.b("TileID", 99)) {
/* 192 */       this.e = aji.e(paramdh.f("TileID"));
/*     */     } else {
/* 194 */       this.e = aji.e(paramdh.d("Tile") & 0xFF);
/*     */     }
/*     */     
/* 197 */     this.a = (paramdh.d("Data") & 0xFF);
/* 198 */     this.b = (paramdh.d("Time") & 0xFF);
/*     */     
/* 200 */     if (paramdh.b("HurtEntities", 99)) {
/* 201 */       this.g = paramdh.n("HurtEntities");
/* 202 */       this.i = paramdh.h("FallHurtAmount");
/* 203 */       this.h = paramdh.f("FallHurtMax");
/* 204 */     } else if (this.e == ajn.bQ) {
/* 205 */       this.g = true;
/*     */     }
/*     */     
/* 208 */     if (paramdh.b("DropItem", 99)) {
/* 209 */       this.c = paramdh.n("DropItem");
/*     */     }
/*     */     
/* 212 */     if (paramdh.b("TileEntityData", 10)) {
/* 213 */       this.d = paramdh.m("TileEntityData");
/*     */     }
/*     */     
/* 216 */     if (this.e.o() == awt.a) {
/* 217 */       this.e = ajn.m;
/*     */     }
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 223 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public ahb e() {
/* 227 */     return this.o;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 231 */     this.g = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean aA()
/*     */   {
/* 236 */     return false;
/*     */   }
/*     */   
/*     */   public void a(k paramk)
/*     */   {
/* 241 */     super.a(paramk);
/* 242 */     paramk.a("Immitating block ID", Integer.valueOf(aji.b(this.e)));
/* 243 */     paramk.a("Immitating block data", Integer.valueOf(this.a));
/*     */   }
/*     */   
/*     */   public aji f()
/*     */   {
/* 248 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */