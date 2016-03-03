/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class xk
/*     */   extends sa
/*     */ {
/*  21 */   private static final Logger d = ;
/*     */   
/*     */ 
/*     */   public int a;
/*     */   
/*     */ 
/*     */   public int b;
/*     */   
/*  29 */   private int e = 5;
/*     */   private String f;
/*     */   private String g;
/*  32 */   public float c = (float)(Math.random() * 3.141592653589793D * 2.0D);
/*     */   
/*     */   public xk(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  35 */     super(paramahb);
/*  36 */     a(0.25F, 0.25F);
/*  37 */     this.L = (this.N / 2.0F);
/*  38 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  40 */     this.y = ((float)(Math.random() * 360.0D));
/*     */     
/*  42 */     this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
/*  43 */     this.w = 0.20000000298023224D;
/*  44 */     this.x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
/*     */   }
/*     */   
/*     */   public xk(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, add paramadd) {
/*  48 */     this(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*  49 */     a(paramadd);
/*     */   }
/*     */   
/*     */   protected boolean g_()
/*     */   {
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   public xk(ahb paramahb) {
/*  58 */     super(paramahb);
/*  59 */     a(0.25F, 0.25F);
/*  60 */     this.L = (this.N / 2.0F);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  65 */     z().a(10, 5);
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  70 */     if (f() == null) {
/*  71 */       B();
/*  72 */       return;
/*     */     }
/*  74 */     super.h();
/*  75 */     if (this.b > 0) this.b -= 1;
/*  76 */     this.p = this.s;
/*  77 */     this.q = this.t;
/*  78 */     this.r = this.u;
/*     */     
/*  80 */     this.w -= 0.03999999910593033D;
/*  81 */     this.X = j(this.s, (this.C.b + this.C.e) / 2.0D, this.u);
/*  82 */     d(this.v, this.w, this.x);
/*     */     
/*  84 */     int i = ((int)this.p != (int)this.s) || ((int)this.q != (int)this.t) || ((int)this.r != (int)this.u) ? 1 : 0;
/*     */     
/*  86 */     if ((i != 0) || (this.aa % 25 == 0)) {
/*  87 */       if (this.o.a(qh.c(this.s), qh.c(this.t), qh.c(this.u)).o() == awt.i) {
/*  88 */         this.w = 0.20000000298023224D;
/*  89 */         this.v = ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
/*  90 */         this.x = ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F);
/*  91 */         a("random.fizz", 0.4F, 2.0F + this.Z.nextFloat() * 0.4F);
/*     */       }
/*     */       
/*  94 */       if (!this.o.E) {
/*  95 */         k();
/*     */       }
/*     */     }
/*     */     
/*  99 */     float f1 = 0.98F;
/* 100 */     if (this.D) {
/* 101 */       f1 = this.o.a(qh.c(this.s), qh.c(this.C.b) - 1, qh.c(this.u)).K * 0.98F;
/*     */     }
/*     */     
/* 104 */     this.v *= f1;
/* 105 */     this.w *= 0.9800000190734863D;
/* 106 */     this.x *= f1;
/*     */     
/* 108 */     if (this.D) {
/* 109 */       this.w *= -0.5D;
/*     */     }
/*     */     
/* 112 */     this.a += 1;
/* 113 */     if ((!this.o.E) && (this.a >= 6000)) {
/* 114 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   private void k() {
/* 119 */     for (xk localxk : this.o.a(xk.class, this.C.b(0.5D, 0.0D, 0.5D))) {
/* 120 */       a(localxk);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(xk paramxk) {
/* 125 */     if (paramxk == this) return false;
/* 126 */     if ((!paramxk.Z()) || (!Z())) return false;
/* 127 */     add localadd1 = f();
/* 128 */     add localadd2 = paramxk.f();
/*     */     
/* 130 */     if (localadd2.b() != localadd1.b()) return false;
/* 131 */     if ((localadd2.p() ^ localadd1.p())) return false;
/* 132 */     if ((localadd2.p()) && (!localadd2.q().equals(localadd1.q()))) return false;
/* 133 */     if (localadd2.b() == null) return false;
/* 134 */     if ((localadd2.b().n()) && (localadd2.k() != localadd1.k())) return false;
/* 135 */     if (localadd2.b < localadd1.b) return paramxk.a(this);
/* 136 */     if (localadd2.b + localadd1.b > localadd2.e()) { return false;
/*     */     }
/* 138 */     localadd2.b += localadd1.b;
/* 139 */     paramxk.b = Math.max(paramxk.b, this.b);
/* 140 */     paramxk.a = Math.min(paramxk.a, this.a);
/* 141 */     paramxk.a(localadd2);
/* 142 */     B();
/*     */     
/* 144 */     return true;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 149 */     this.a = 4800;
/*     */   }
/*     */   
/*     */   public boolean N()
/*     */   {
/* 154 */     return this.o.a(this.C, awt.h, this);
/*     */   }
/*     */   
/*     */   protected void f(int paramInt)
/*     */   {
/* 159 */     a(ro.a, paramInt);
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 164 */     if (aw()) return false;
/* 165 */     if ((f() != null) && (f().b() == ade.bN) && (paramro.c())) return false;
/* 166 */     Q();
/* 167 */     this.e = ((int)(this.e - paramFloat));
/* 168 */     if (this.e <= 0) {
/* 169 */       B();
/*     */     }
/* 171 */     return false;
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 176 */     paramdh.a("Health", (short)(byte)this.e);
/* 177 */     paramdh.a("Age", (short)this.a);
/* 178 */     if (j() != null) paramdh.a("Thrower", this.f);
/* 179 */     if (i() != null) paramdh.a("Owner", this.g);
/* 180 */     if (f() != null) paramdh.a("Item", f().b(new dh()));
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 185 */     this.e = (paramdh.e("Health") & 0xFF);
/* 186 */     this.a = paramdh.e("Age");
/* 187 */     if (paramdh.c("Owner")) this.g = paramdh.j("Owner");
/* 188 */     if (paramdh.c("Thrower")) this.f = paramdh.j("Thrower");
/* 189 */     dh localdh = paramdh.m("Item");
/* 190 */     a(add.a(localdh));
/* 191 */     if (f() == null) B();
/*     */   }
/*     */   
/*     */   public void b_(yz paramyz)
/*     */   {
/* 196 */     if (this.o.E) { return;
/*     */     }
/* 198 */     add localadd = f();
/* 199 */     int i = localadd.b;
/* 200 */     if ((this.b == 0) && ((this.g == null) || (6000 - this.a <= 200) || (this.g.equals(paramyz.b_()))) && (paramyz.bm.a(localadd))) {
/* 201 */       if (localadd.b() == adb.a(ajn.r)) paramyz.a(pc.g);
/* 202 */       if (localadd.b() == adb.a(ajn.s)) paramyz.a(pc.g);
/* 203 */       if (localadd.b() == ade.aA) paramyz.a(pc.t);
/* 204 */       if (localadd.b() == ade.i) paramyz.a(pc.w);
/* 205 */       if (localadd.b() == ade.bj) paramyz.a(pc.A);
/* 206 */       if ((localadd.b() == ade.i) && (j() != null)) {
/* 207 */         yz localyz = this.o.a(j());
/* 208 */         if ((localyz != null) && (localyz != paramyz)) {
/* 209 */           localyz.a(pc.x);
/*     */         }
/*     */       }
/* 212 */       this.o.a(paramyz, "random.pop", 0.2F, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 213 */       paramyz.a(this, i);
/* 214 */       if (localadd.b <= 0) { B();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public String b_()
/*     */   {
/* 221 */     return dd.a("item." + f().a());
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 226 */     return false;
/*     */   }
/*     */   
/*     */   public void b(int paramInt)
/*     */   {
/* 231 */     super.b(paramInt);
/*     */     
/* 233 */     if (!this.o.E) k();
/*     */   }
/*     */   
/*     */   public add f() {
/* 237 */     add localadd = z().f(10);
/*     */     
/* 239 */     if (localadd == null) {
/* 240 */       return new add(ajn.b);
/*     */     }
/*     */     
/* 243 */     return localadd;
/*     */   }
/*     */   
/*     */   public void a(add paramadd) {
/* 247 */     z().b(10, paramadd);
/* 248 */     z().h(10);
/*     */   }
/*     */   
/*     */   public String i() {
/* 252 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 256 */     this.g = paramString;
/*     */   }
/*     */   
/*     */   public String j() {
/* 260 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(String paramString) {
/* 264 */     this.f = paramString;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */