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
/*     */ public class aow
/*     */   extends aor
/*     */   implements rb
/*     */ {
/*  15 */   private add[] p = new add[36];
/*     */   
/*     */   public boolean a;
/*     */   public aow i;
/*     */   public aow j;
/*     */   public aow k;
/*     */   public aow l;
/*     */   public float m;
/*     */   public float n;
/*     */   public int o;
/*     */   private int q;
/*     */   private int r;
/*     */   private String s;
/*     */   
/*     */   public aow()
/*     */   {
/*  31 */     this.r = -1;
/*     */   }
/*     */   
/*     */   public aow(int paramInt)
/*     */   {
/*  36 */     this.r = paramInt;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  41 */     return 27;
/*     */   }
/*     */   
/*     */   public add a(int paramInt)
/*     */   {
/*  46 */     return this.p[paramInt];
/*     */   }
/*     */   
/*     */   public add a(int paramInt1, int paramInt2)
/*     */   {
/*  51 */     if (this.p[paramInt1] != null) {
/*  52 */       if (this.p[paramInt1].b <= paramInt2) {
/*  53 */         localadd = this.p[paramInt1];
/*  54 */         this.p[paramInt1] = null;
/*  55 */         e();
/*  56 */         return localadd;
/*     */       }
/*  58 */       add localadd = this.p[paramInt1].a(paramInt2);
/*  59 */       if (this.p[paramInt1].b == 0) this.p[paramInt1] = null;
/*  60 */       e();
/*  61 */       return localadd;
/*     */     }
/*     */     
/*  64 */     return null;
/*     */   }
/*     */   
/*     */   public add a_(int paramInt)
/*     */   {
/*  69 */     if (this.p[paramInt] != null) {
/*  70 */       add localadd = this.p[paramInt];
/*  71 */       this.p[paramInt] = null;
/*  72 */       return localadd;
/*     */     }
/*  74 */     return null;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, add paramadd)
/*     */   {
/*  79 */     this.p[paramInt] = paramadd;
/*  80 */     if ((paramadd != null) && (paramadd.b > d())) paramadd.b = d();
/*  81 */     e();
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  86 */     return k_() ? this.s : "container.chest";
/*     */   }
/*     */   
/*     */   public boolean k_()
/*     */   {
/*  91 */     return (this.s != null) && (this.s.length() > 0);
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  95 */     this.s = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 101 */     super.a(paramdh);
/* 102 */     dq localdq = paramdh.c("Items", 10);
/* 103 */     this.p = new add[a()];
/* 104 */     if (paramdh.b("CustomName", 8)) this.s = paramdh.j("CustomName");
/* 105 */     for (int i1 = 0; i1 < localdq.c(); i1++) {
/* 106 */       dh localdh = localdq.b(i1);
/* 107 */       int i2 = localdh.d("Slot") & 0xFF;
/* 108 */       if ((i2 >= 0) && (i2 < this.p.length)) this.p[i2] = add.a(localdh);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 114 */     super.b(paramdh);
/* 115 */     dq localdq = new dq();
/*     */     
/* 117 */     for (int i1 = 0; i1 < this.p.length; i1++) {
/* 118 */       if (this.p[i1] != null) {
/* 119 */         dh localdh = new dh();
/* 120 */         localdh.a("Slot", (byte)i1);
/* 121 */         this.p[i1].b(localdh);
/* 122 */         localdq.a(localdh);
/*     */       }
/*     */     }
/* 125 */     paramdh.a("Items", localdq);
/* 126 */     if (k_()) paramdh.a("CustomName", this.s);
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/* 131 */     return 64;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 136 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 137 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) return false;
/* 138 */     return true;
/*     */   }
/*     */   
/*     */   public void u()
/*     */   {
/* 143 */     super.u();
/* 144 */     this.a = false;
/*     */   }
/*     */   
/*     */   private void a(aow paramaow, int paramInt) {
/* 148 */     if (paramaow.r()) {
/* 149 */       this.a = false;
/* 150 */     } else if (this.a) {
/* 151 */       switch (paramInt) {
/*     */       case 2: 
/* 153 */         if (this.i != paramaow) this.a = false;
/*     */         break;
/*     */       case 0: 
/* 156 */         if (this.l != paramaow) this.a = false;
/*     */         break;
/*     */       case 3: 
/* 159 */         if (this.j != paramaow) this.a = false;
/*     */         break;
/*     */       case 1: 
/* 162 */         if (this.k != paramaow) this.a = false;
/*     */         break;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void i() {
/* 169 */     if (this.a) { return;
/*     */     }
/* 171 */     this.a = true;
/* 172 */     this.i = null;
/* 173 */     this.j = null;
/* 174 */     this.k = null;
/* 175 */     this.l = null;
/*     */     
/* 177 */     if (a(this.c - 1, this.d, this.e)) {
/* 178 */       this.k = ((aow)this.b.o(this.c - 1, this.d, this.e));
/*     */     }
/* 180 */     if (a(this.c + 1, this.d, this.e)) {
/* 181 */       this.j = ((aow)this.b.o(this.c + 1, this.d, this.e));
/*     */     }
/* 183 */     if (a(this.c, this.d, this.e - 1)) {
/* 184 */       this.i = ((aow)this.b.o(this.c, this.d, this.e - 1));
/*     */     }
/* 186 */     if (a(this.c, this.d, this.e + 1)) {
/* 187 */       this.l = ((aow)this.b.o(this.c, this.d, this.e + 1));
/*     */     }
/*     */     
/* 190 */     if (this.i != null) this.i.a(this, 0);
/* 191 */     if (this.l != null) this.l.a(this, 2);
/* 192 */     if (this.j != null) this.j.a(this, 1);
/* 193 */     if (this.k != null) this.k.a(this, 3);
/*     */   }
/*     */   
/*     */   private boolean a(int paramInt1, int paramInt2, int paramInt3) {
/* 197 */     if (this.b == null) {
/* 198 */       return false;
/*     */     }
/* 200 */     aji localaji = this.b.a(paramInt1, paramInt2, paramInt3);
/* 201 */     return ((localaji instanceof ajx)) && (((ajx)localaji).a == j());
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 206 */     super.h();
/* 207 */     i();
/*     */     
/* 209 */     this.q += 1;
/* 210 */     if ((!this.b.E) && (this.o != 0) && ((this.q + this.c + this.d + this.e) % 200 == 0))
/*     */     {
/* 212 */       this.o = 0;
/*     */       
/* 214 */       f1 = 5.0F;
/* 215 */       List localList = this.b.a(yz.class, azt.a(this.c - f1, this.d - f1, this.e - f1, this.c + 1 + f1, this.d + 1 + f1, this.e + 1 + f1));
/* 216 */       for (yz localyz : localList) {
/* 217 */         if ((localyz.bo instanceof aad)) {
/* 218 */           rb localrb = ((aad)localyz.bo).e();
/* 219 */           if ((localrb == this) || (((localrb instanceof ra)) && (((ra)localrb).a(this)))) {
/* 220 */             this.o += 1;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 226 */     this.n = this.m;
/*     */     
/* 228 */     float f1 = 0.1F;
/* 229 */     double d2; if ((this.o > 0) && (this.m == 0.0F) && 
/* 230 */       (this.i == null) && (this.k == null)) {
/* 231 */       double d1 = this.c + 0.5D;
/* 232 */       d2 = this.e + 0.5D;
/* 233 */       if (this.l != null) d2 += 0.5D;
/* 234 */       if (this.j != null) { d1 += 0.5D;
/*     */       }
/* 236 */       this.b.a(d1, this.d + 0.5D, d2, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*     */     }
/*     */     
/* 239 */     if (((this.o == 0) && (this.m > 0.0F)) || ((this.o > 0) && (this.m < 1.0F))) {
/* 240 */       float f2 = this.m;
/* 241 */       if (this.o > 0) this.m += f1; else
/* 242 */         this.m -= f1;
/* 243 */       if (this.m > 1.0F) {
/* 244 */         this.m = 1.0F;
/*     */       }
/* 246 */       float f3 = 0.5F;
/* 247 */       if ((this.m < f3) && (f2 >= f3) && 
/* 248 */         (this.i == null) && (this.k == null)) {
/* 249 */         d2 = this.c + 0.5D;
/* 250 */         double d3 = this.e + 0.5D;
/* 251 */         if (this.l != null) d3 += 0.5D;
/* 252 */         if (this.j != null) { d2 += 0.5D;
/*     */         }
/* 254 */         this.b.a(d2, this.d + 0.5D, d3, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*     */       }
/*     */       
/* 257 */       if (this.m < 0.0F) {
/* 258 */         this.m = 0.0F;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(int paramInt1, int paramInt2)
/*     */   {
/* 265 */     if (paramInt1 == 1) {
/* 266 */       this.o = paramInt2;
/* 267 */       return true;
/*     */     }
/* 269 */     return super.c(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void f()
/*     */   {
/* 274 */     if (this.o < 0) {
/* 275 */       this.o = 0;
/*     */     }
/* 277 */     this.o += 1;
/* 278 */     this.b.c(this.c, this.d, this.e, q(), 1, this.o);
/* 279 */     this.b.d(this.c, this.d, this.e, q());
/* 280 */     this.b.d(this.c, this.d - 1, this.e, q());
/*     */   }
/*     */   
/*     */   public void l_()
/*     */   {
/* 285 */     if ((q() instanceof ajx)) {
/* 286 */       this.o -= 1;
/* 287 */       this.b.c(this.c, this.d, this.e, q(), 1, this.o);
/* 288 */       this.b.d(this.c, this.d, this.e, q());
/* 289 */       this.b.d(this.c, this.d - 1, this.e, q());
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b(int paramInt, add paramadd)
/*     */   {
/* 295 */     return true;
/*     */   }
/*     */   
/*     */   public void s()
/*     */   {
/* 300 */     super.s();
/* 301 */     u();
/* 302 */     i();
/*     */   }
/*     */   
/*     */   public int j() {
/* 306 */     if (this.r == -1) {
/* 307 */       if ((this.b != null) && ((q() instanceof ajx))) {
/* 308 */         this.r = ((ajx)q()).a;
/*     */       } else {
/* 310 */         return 0;
/*     */       }
/*     */     }
/*     */     
/* 314 */     return this.r;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */