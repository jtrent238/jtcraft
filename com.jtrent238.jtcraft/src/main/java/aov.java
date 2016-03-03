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
/*     */ public class aov
/*     */   extends aor
/*     */   implements rl
/*     */ {
/*  16 */   private static final int[] a = { 3 };
/*     */   
/*     */ 
/*  19 */   private static final int[] i = { 0, 1, 2 };
/*     */   
/*     */ 
/*     */ 
/*  23 */   private add[] j = new add[4];
/*     */   
/*     */   private int k;
/*     */   private int l;
/*     */   private adb m;
/*     */   private String n;
/*     */   
/*     */   public String b()
/*     */   {
/*  32 */     return k_() ? this.n : "container.brewing";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  37 */     return (this.n != null) && (this.n.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  41 */     this.n = paramString;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  46 */     return this.j.length;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  51 */     if (this.k > 0) {
/*  52 */       this.k -= 1;
/*     */       
/*  54 */       if (this.k == 0)
/*     */       {
/*  56 */         l();
/*  57 */         e();
/*  58 */       } else if (!k()) {
/*  59 */         this.k = 0;
/*  60 */         e();
/*  61 */       } else if (this.m != this.j[3].b()) {
/*  62 */         this.k = 0;
/*  63 */         e();
/*     */       }
/*  65 */     } else if (k()) {
/*  66 */       this.k = 400;
/*  67 */       this.m = this.j[3].b();
/*     */     }
/*     */     
/*  70 */     int i1 = j();
/*  71 */     if (i1 != this.l) {
/*  72 */       this.l = i1;
/*  73 */       this.b.a(this.c, this.d, this.e, i1, 2);
/*     */     }
/*     */     
/*  76 */     super.h();
/*     */   }
/*     */   
/*     */   public int i() {
/*  80 */     return this.k;
/*     */   }
/*     */   
/*     */   private boolean k() {
/*  84 */     if ((this.j[3] == null) || (this.j[3].b <= 0)) {
/*  85 */       return false;
/*     */     }
/*  87 */     add localadd = this.j[3];
/*     */     
/*     */ 
/*  90 */     if (!localadd.b().m(localadd)) {
/*  91 */       return false;
/*     */     }
/*     */     
/*  94 */     boolean bool = false;
/*  95 */     for (int i1 = 0; i1 < 3; i1++) {
/*  96 */       if ((this.j[i1] != null) && (this.j[i1].b() == ade.bn)) {
/*  97 */         int i2 = this.j[i1].k();
/*  98 */         int i3 = c(i2, localadd);
/*     */         
/* 100 */         if ((!adp.g(i2)) && (adp.g(i3))) {
/* 101 */           bool = true;
/* 102 */           break;
/*     */         }
/*     */         
/* 105 */         List localList1 = ade.bn.c(i2);
/* 106 */         List localList2 = ade.bn.c(i3);
/*     */         
/* 108 */         if (((i2 <= 0) || (localList1 != localList2)) && ((localList1 == null) || ((!localList1.equals(localList2)) && (localList2 != null))))
/*     */         {
/* 110 */           if (i2 != i3) {
/* 111 */             bool = true;
/* 112 */             break;
/*     */           } }
/*     */       }
/*     */     }
/* 116 */     return bool;
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
/*     */   private void l()
/*     */   {
/* 144 */     if (!k()) {
/* 145 */       return;
/*     */     }
/*     */     
/* 148 */     add localadd = this.j[3];
/*     */     
/*     */ 
/*     */ 
/* 152 */     for (int i1 = 0; i1 < 3; i1++) {
/* 153 */       if ((this.j[i1] != null) && (this.j[i1].b() == ade.bn)) {
/* 154 */         int i2 = this.j[i1].k();
/* 155 */         int i3 = c(i2, localadd);
/*     */         
/* 157 */         List localList1 = ade.bn.c(i2);
/* 158 */         List localList2 = ade.bn.c(i3);
/*     */         
/* 160 */         if (((i2 > 0) && (localList1 == localList2)) || ((localList1 != null) && ((localList1.equals(localList2)) || (localList2 == null))))
/*     */         {
/* 162 */           if ((!adp.g(i2)) && (adp.g(i3))) {
/* 163 */             this.j[i1].b(i3);
/*     */           }
/*     */         }
/* 166 */         else if (i2 != i3) {
/* 167 */           this.j[i1].b(i3);
/*     */         }
/*     */       }
/*     */     }
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
/* 188 */     if (localadd.b().u()) {
/* 189 */       this.j[3] = new add(localadd.b().t());
/*     */     } else {
/* 191 */       this.j[3].b -= 1;
/* 192 */       if (this.j[3].b <= 0) {
/* 193 */         this.j[3] = null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private int c(int paramInt, add paramadd) {
/* 199 */     if (paramadd == null) {
/* 200 */       return paramInt;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 210 */     if (paramadd.b().m(paramadd)) {
/* 211 */       return aen.a(paramInt, paramadd.b().i(paramadd));
/*     */     }
/* 213 */     return paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 219 */     super.a(paramdh);
/*     */     
/* 221 */     dq localdq = paramdh.c("Items", 10);
/* 222 */     this.j = new add[a()];
/* 223 */     for (int i1 = 0; i1 < localdq.c(); i1++) {
/* 224 */       dh localdh = localdq.b(i1);
/* 225 */       int i2 = localdh.d("Slot");
/* 226 */       if ((i2 >= 0) && (i2 < this.j.length)) { this.j[i2] = add.a(localdh);
/*     */       }
/*     */     }
/* 229 */     this.k = paramdh.e("BrewTime");
/* 230 */     if (paramdh.b("CustomName", 8)) this.n = paramdh.j("CustomName");
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 235 */     super.b(paramdh);
/*     */     
/* 237 */     paramdh.a("BrewTime", (short)this.k);
/* 238 */     dq localdq = new dq();
/*     */     
/* 240 */     for (int i1 = 0; i1 < this.j.length; i1++) {
/* 241 */       if (this.j[i1] != null) {
/* 242 */         dh localdh = new dh();
/* 243 */         localdh.a("Slot", (byte)i1);
/* 244 */         this.j[i1].b(localdh);
/* 245 */         localdq.a(localdh);
/*     */       }
/*     */     }
/* 248 */     paramdh.a("Items", localdq);
/* 249 */     if (k_()) paramdh.a("CustomName", this.n);
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/* 254 */     if ((paramInt >= 0) && (paramInt < this.j.length)) {
/* 255 */       return this.j[paramInt];
/*     */     }
/* 257 */     return null;
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/* 262 */     if ((paramInt1 >= 0) && (paramInt1 < this.j.length)) {
/* 263 */       add localadd = this.j[paramInt1];
/* 264 */       this.j[paramInt1] = null;
/* 265 */       return localadd;
/*     */     }
/* 267 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/* 272 */     if ((paramInt >= 0) && (paramInt < this.j.length)) {
/* 273 */       add localadd = this.j[paramInt];
/* 274 */       this.j[paramInt] = null;
/* 275 */       return localadd;
/*     */     }
/* 277 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/* 282 */     if ((paramInt >= 0) && (paramInt < this.j.length)) {
/* 283 */       this.j[paramInt] = paramadd;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public int d()
/*     */   {
/* 290 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 295 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 296 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 297 */     return true;
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
/* 310 */     if (paramInt == 3)
/*     */     {
/* 312 */       return paramadd.b().m(paramadd);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 318 */     return (paramadd.b() == ade.bn) || (paramadd.b() == ade.bo);
/*     */   }
/*     */   
/*     */   public void d(int paramInt) {
/* 322 */     this.k = paramInt;
/*     */   }
/*     */   
/*     */   public int j() {
/* 326 */     int i1 = 0;
/* 327 */     for (int i2 = 0; i2 < 3; i2++) {
/* 328 */       if (this.j[i2] != null) {
/* 329 */         i1 |= 1 << i2;
/*     */       }
/*     */     }
/* 332 */     return i1;
/*     */   }
/*     */   
/*     */   public int[] c(int paramInt)
/*     */   {
/* 337 */     if (paramInt == 1) {
/* 338 */       return a;
/*     */     }
/*     */     
/* 341 */     return i;
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt1, add paramadd, int paramInt2)
/*     */   {
/* 346 */     return b(paramInt1, paramadd);
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt1, add paramadd, int paramInt2)
/*     */   {
/* 351 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */