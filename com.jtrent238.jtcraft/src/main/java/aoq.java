/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class aoq
/*     */   extends aor
/*     */   implements rb
/*     */ {
/*  24 */   public static final rv[][] a = { { rv.c, rv.e }, { rv.m, rv.j }, { rv.g }, { rv.l } };
/*     */   
/*     */ 
/*     */ 
/*     */   private long i;
/*     */   
/*     */ 
/*     */ 
/*     */   private float j;
/*     */   
/*     */ 
/*     */ 
/*     */   private boolean k;
/*     */   
/*     */ 
/*     */ 
/*  40 */   private int l = -1;
/*     */   
/*     */   private int m;
/*     */   
/*     */   private int n;
/*     */   private add o;
/*     */   private String p;
/*     */   
/*     */   public void h()
/*     */   {
/*  50 */     if (this.b.I() % 80L == 0L) {
/*  51 */       y();
/*  52 */       x();
/*     */     } }
/*     */   
/*     */   private void x() { Iterator localIterator;
/*     */     yz localyz;
/*  57 */     if ((this.k) && (this.l > 0) && (!this.b.E) && (this.m > 0))
/*     */     {
/*  59 */       double d = this.l * 10 + 10;
/*  60 */       int i1 = 0;
/*  61 */       if ((this.l >= 4) && (this.m == this.n)) {
/*  62 */         i1 = 1;
/*     */       }
/*     */       
/*  65 */       azt localazt = azt.a(this.c, this.d, this.e, this.c + 1, this.d + 1, this.e + 1).b(d, d, d);
/*  66 */       localazt.e = this.b.R();
/*  67 */       List localList = this.b.a(yz.class, localazt);
/*  68 */       for (localIterator = localList.iterator(); localIterator.hasNext();) { localyz = (yz)localIterator.next();
/*  69 */         localyz.c(new rw(this.m, 180, i1, true));
/*     */       }
/*     */       
/*  72 */       if ((this.l >= 4) && (this.m != this.n) && (this.n > 0)) {
/*  73 */         for (localIterator = localList.iterator(); localIterator.hasNext();) { localyz = (yz)localIterator.next();
/*  74 */           localyz.c(new rw(this.n, 180, 0, true));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void y() {
/*  81 */     int i1 = this.l;
/*     */     
/*  83 */     if (!this.b.i(this.c, this.d + 1, this.e)) {
/*  84 */       this.k = false;
/*  85 */       this.l = 0;
/*     */     } else {
/*  87 */       this.k = true;
/*  88 */       this.l = 0;
/*     */       
/*  90 */       for (int i2 = 1; i2 <= 4; i2++) {
/*  91 */         int i3 = this.d - i2;
/*  92 */         if (i3 < 0) {
/*     */           break;
/*     */         }
/*     */         
/*  96 */         int i4 = 1;
/*  97 */         for (int i5 = this.c - i2; (i5 <= this.c + i2) && (i4 != 0); i5++) {
/*  98 */           for (int i6 = this.e - i2; i6 <= this.e + i2; i6++) {
/*  99 */             aji localaji = this.b.a(i5, i3, i6);
/* 100 */             if ((localaji != ajn.bE) && (localaji != ajn.R) && (localaji != ajn.ah) && (localaji != ajn.S)) {
/* 101 */               i4 = 0;
/* 102 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 107 */         if (i4 == 0) break;
/* 108 */         this.l = i2;
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/* 114 */       if (this.l == 0) {
/* 115 */         this.k = false;
/*     */       }
/*     */     }
/*     */     
/* 119 */     if ((!this.b.E) && (this.l == 4) && (i1 < this.l)) {
/* 120 */       for (yz localyz : this.b.a(yz.class, azt.a(this.c, this.d, this.e, this.c, this.d - 4, this.e).b(10.0D, 5.0D, 10.0D))) {
/* 121 */         localyz.a(pc.K);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public float i()
/*     */   {
/* 129 */     if (!this.k) {
/* 130 */       return 0.0F;
/*     */     }
/*     */     
/* 133 */     int i1 = (int)(this.b.I() - this.i);
/* 134 */     this.i = this.b.I();
/* 135 */     if (i1 > 1) {
/* 136 */       this.j -= i1 / 40.0F;
/*     */       
/* 138 */       if (this.j < 0.0F) {
/* 139 */         this.j = 0.0F;
/*     */       }
/*     */     }
/* 142 */     this.j += 0.025F;
/* 143 */     if (this.j > 1.0F) {
/* 144 */       this.j = 1.0F;
/*     */     }
/* 146 */     return this.j;
/*     */   }
/*     */   
/*     */   public int j() {
/* 150 */     return this.m;
/*     */   }
/*     */   
/*     */   public int k() {
/* 154 */     return this.n;
/*     */   }
/*     */   
/*     */   public int l() {
/* 158 */     return this.l;
/*     */   }
/*     */   
/*     */   public void c(int paramInt)
/*     */   {
/* 163 */     this.l = paramInt;
/*     */   }
/*     */   
/*     */   public void d(int paramInt) {
/* 167 */     this.m = 0;
/*     */     
/*     */ 
/* 170 */     for (int i1 = 0; (i1 < this.l) && (i1 < 3); i1++) {
/* 171 */       for (rv localrv : a[i1]) {
/* 172 */         if (localrv.H == paramInt) {
/* 173 */           this.m = paramInt;
/* 174 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/* 181 */     this.n = 0;
/*     */     
/*     */ 
/* 184 */     if (this.l >= 4) {
/* 185 */       for (int i1 = 0; i1 < 4; i1++) {
/* 186 */         for (rv localrv : a[i1]) {
/* 187 */           if (localrv.H == paramInt) {
/* 188 */             this.n = paramInt;
/* 189 */             return;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public ft m()
/*     */   {
/* 198 */     dh localdh = new dh();
/* 199 */     b(localdh);
/* 200 */     return new gf(this.c, this.d, this.e, 3, localdh);
/*     */   }
/*     */   
/*     */   public double n()
/*     */   {
/* 205 */     return 65536.0D;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 210 */     super.a(paramdh);
/*     */     
/* 212 */     this.m = paramdh.f("Primary");
/* 213 */     this.n = paramdh.f("Secondary");
/* 214 */     this.l = paramdh.f("Levels");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 219 */     super.b(paramdh);
/*     */     
/* 221 */     paramdh.a("Primary", this.m);
/* 222 */     paramdh.a("Secondary", this.n);
/*     */     
/* 224 */     paramdh.a("Levels", this.l);
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/* 229 */     return 1;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/* 234 */     if (paramInt == 0) {
/* 235 */       return this.o;
/*     */     }
/* 237 */     return null;
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/* 242 */     if ((paramInt1 == 0) && (this.o != null)) {
/* 243 */       if (paramInt2 >= this.o.b) {
/* 244 */         add localadd = this.o;
/* 245 */         this.o = null;
/* 246 */         return localadd;
/*     */       }
/* 248 */       this.o.b -= paramInt2;
/* 249 */       return new add(this.o.b(), paramInt2, this.o.k());
/*     */     }
/*     */     
/* 252 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/* 257 */     if ((paramInt == 0) && (this.o != null)) {
/* 258 */       add localadd = this.o;
/* 259 */       this.o = null;
/* 260 */       return localadd;
/*     */     }
/* 262 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/* 267 */     if (paramInt == 0) {
/* 268 */       this.o = paramadd;
/*     */     }
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 274 */     return k_() ? this.p : "container.beacon";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/* 279 */     return (this.p != null) && (this.p.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 283 */     this.p = paramString;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 288 */     return 1;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 293 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 294 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 295 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void f() {}
/*     */   
/*     */ 
/*     */   public void l_() {}
/*     */   
/*     */ 
/*     */   public boolean b(int paramInt, add paramadd)
/*     */   {
/* 308 */     return (paramadd.b() == ade.bC) || (paramadd.b() == ade.i) || (paramadd.b() == ade.k) || (paramadd.b() == ade.j);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */