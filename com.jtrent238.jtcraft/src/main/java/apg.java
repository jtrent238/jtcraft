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
/*     */ public class apg
/*     */   extends aor
/*     */   implements rl
/*     */ {
/*  16 */   private static final int[] k = { 0 };
/*     */   
/*     */ 
/*  19 */   private static final int[] l = { 2, 1 };
/*     */   
/*     */ 
/*  22 */   private static final int[] m = { 1 };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  28 */   private add[] n = new add[3];
/*     */   public int a;
/*     */   public int i;
/*     */   public int j;
/*     */   private String o;
/*     */   
/*     */   public int a()
/*     */   {
/*  36 */     return this.n.length;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  41 */     return this.n[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  46 */     if (this.n[paramInt1] != null) {
/*  47 */       if (this.n[paramInt1].b <= paramInt2) {
/*  48 */         localadd = this.n[paramInt1];
/*  49 */         this.n[paramInt1] = null;
/*  50 */         return localadd;
/*     */       }
/*  52 */       add localadd = this.n[paramInt1].a(paramInt2);
/*  53 */       if (this.n[paramInt1].b == 0) this.n[paramInt1] = null;
/*  54 */       return localadd;
/*     */     }
/*     */     
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  62 */     if (this.n[paramInt] != null) {
/*  63 */       add localadd = this.n[paramInt];
/*  64 */       this.n[paramInt] = null;
/*  65 */       return localadd;
/*     */     }
/*  67 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  72 */     this.n[paramInt] = paramadd;
/*  73 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  78 */     return k_() ? this.o : "container.furnace";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  83 */     return (this.o != null) && (this.o.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  87 */     this.o = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/*  93 */     super.a(paramdh);
/*  94 */     dq localdq = paramdh.c("Items", 10);
/*  95 */     this.n = new add[a()];
/*  96 */     for (int i1 = 0; i1 < localdq.c(); i1++) {
/*  97 */       dh localdh = localdq.b(i1);
/*  98 */       int i2 = localdh.d("Slot");
/*  99 */       if ((i2 >= 0) && (i2 < this.n.length)) { this.n[i2] = add.a(localdh);
/*     */       }
/*     */     }
/* 102 */     this.a = paramdh.e("BurnTime");
/* 103 */     this.j = paramdh.e("CookTime");
/* 104 */     this.i = a(this.n[1]);
/* 105 */     if (paramdh.b("CustomName", 8)) this.o = paramdh.j("CustomName");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 110 */     super.b(paramdh);
/* 111 */     paramdh.a("BurnTime", (short)this.a);
/* 112 */     paramdh.a("CookTime", (short)this.j);
/* 113 */     dq localdq = new dq();
/*     */     
/* 115 */     for (int i1 = 0; i1 < this.n.length; i1++) {
/* 116 */       if (this.n[i1] != null) {
/* 117 */         dh localdh = new dh();
/* 118 */         localdh.a("Slot", (byte)i1);
/* 119 */         this.n[i1].b(localdh);
/* 120 */         localdq.a(localdh);
/*     */       }
/*     */     }
/* 123 */     paramdh.a("Items", localdq);
/* 124 */     if (k_()) paramdh.a("CustomName", this.o);
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 129 */     return 64;
/*     */   }
/*     */   
/*     */   public int d(int paramInt) {
/* 133 */     return this.j * paramInt / 200;
/*     */   }
/*     */   
/*     */   public int e(int paramInt) {
/* 137 */     if (this.i == 0) this.i = 200;
/* 138 */     return this.a * paramInt / this.i;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 142 */     return this.a > 0;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 147 */     int i1 = this.a > 0 ? 1 : 0;
/* 148 */     int i2 = 0;
/* 149 */     if (this.a > 0) {
/* 150 */       this.a -= 1;
/*     */     }
/*     */     
/* 153 */     if (!this.b.E) {
/* 154 */       if ((this.a != 0) || ((this.n[1] != null) && (this.n[0] != null))) {
/* 155 */         if ((this.a == 0) && (k())) {
/* 156 */           this.i = (this.a = a(this.n[1]));
/* 157 */           if (this.a > 0) {
/* 158 */             i2 = 1;
/* 159 */             if (this.n[1] != null) {
/* 160 */               this.n[1].b -= 1;
/* 161 */               if (this.n[1].b == 0) {
/* 162 */                 adb localadb = this.n[1].b().t();
/* 163 */                 this.n[1] = (localadb != null ? new add(localadb) : null);
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/*     */         
/* 169 */         if ((i()) && (k())) {
/* 170 */           this.j += 1;
/* 171 */           if (this.j == 200) {
/* 172 */             this.j = 0;
/* 173 */             j();
/* 174 */             i2 = 1;
/*     */           }
/*     */         } else {
/* 177 */           this.j = 0;
/*     */         }
/*     */       }
/*     */       
/* 181 */       if (i1 != (this.a > 0 ? 1 : 0)) {
/* 182 */         i2 = 1;
/* 183 */         ale.a(this.a > 0, this.b, this.c, this.d, this.e);
/*     */       }
/*     */     }
/*     */     
/* 187 */     if (i2 != 0) e();
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 191 */     if (this.n[0] == null) return false;
/* 192 */     add localadd = afa.a().a(this.n[0]);
/* 193 */     if (localadd == null) return false;
/* 194 */     if (this.n[2] == null) return true;
/* 195 */     if (!this.n[2].a(localadd)) return false;
/* 196 */     if ((this.n[2].b < d()) && (this.n[2].b < this.n[2].e())) return true;
/* 197 */     if (this.n[2].b < localadd.e()) return true;
/* 198 */     return false;
/*     */   }
/*     */   
/*     */   public void j() {
/* 202 */     if (!k()) { return;
/*     */     }
/* 204 */     add localadd = afa.a().a(this.n[0]);
/* 205 */     if (this.n[2] == null) { this.n[2] = localadd.m();
/* 206 */     } else if (this.n[2].b() == localadd.b()) { this.n[2].b += 1;
/*     */     }
/* 208 */     this.n[0].b -= 1;
/* 209 */     if (this.n[0].b <= 0) this.n[0] = null;
/*     */   }
/*     */   
/*     */   public static int a(add paramadd) {
/* 213 */     if (paramadd == null) return 0;
/* 214 */     adb localadb = paramadd.b();
/*     */     
/*     */ 
/* 217 */     if (((localadb instanceof abh)) && (aji.a(localadb) != ajn.a)) {
/* 218 */       aji localaji = aji.a(localadb);
/*     */       
/* 220 */       if (localaji == ajn.bx) {
/* 221 */         return 150;
/*     */       }
/*     */       
/* 224 */       if (localaji.o() == awt.d) {
/* 225 */         return 300;
/*     */       }
/*     */       
/* 228 */       if (localaji == ajn.ci) {
/* 229 */         return 16000;
/*     */       }
/*     */     }
/*     */     
/* 233 */     if (((localadb instanceof acg)) && (((acg)localadb).j().equals("WOOD")))
/* 234 */       return 200;
/* 235 */     if (((localadb instanceof aeh)) && (((aeh)localadb).j().equals("WOOD")))
/* 236 */       return 200;
/* 237 */     if (((localadb instanceof ada)) && (((ada)localadb).i().equals("WOOD"))) {
/* 238 */       return 200;
/*     */     }
/*     */     
/* 241 */     if (localadb == ade.y) {
/* 242 */       return 100;
/*     */     }
/*     */     
/* 245 */     if (localadb == ade.h) { return 1600;
/*     */     }
/* 247 */     if (localadb == ade.at) { return 20000;
/*     */     }
/* 249 */     if (localadb == adb.a(ajn.g)) { return 100;
/*     */     }
/* 251 */     if (localadb == ade.bj) { return 2400;
/*     */     }
/* 253 */     return 0;
/*     */   }
/*     */   
/*     */   public static boolean b(add paramadd) {
/* 257 */     return a(paramadd) > 0;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 262 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 263 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 264 */     return true;
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
/* 277 */     if (paramInt == 2) return false;
/* 278 */     if (paramInt == 1) return b(paramadd);
/* 279 */     return true;
/*     */   }
/*     */   
/*     */   public int[] c(int paramInt)
/*     */   {
/* 284 */     if (paramInt == 0)
/* 285 */       return l;
/* 286 */     if (paramInt == 1) {
/* 287 */       return k;
/*     */     }
/* 289 */     return m;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(int paramInt1, add paramadd, int paramInt2)
/*     */   {
/* 295 */     return b(paramInt1, paramadd);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean b(int paramInt1, add paramadd, int paramInt2)
/*     */   {
/* 301 */     if ((paramInt2 == 0) && (paramInt1 == 1) && 
/* 302 */       (paramadd.b() != ade.ar)) { return false;
/*     */     }
/*     */     
/* 305 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */