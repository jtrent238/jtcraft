/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agn
/*     */ {
/*     */   private add a;
/*     */   private add b;
/*     */   private add c;
/*     */   private int d;
/*     */   private int e;
/*     */   
/*     */   public agn(dh paramdh)
/*     */   {
/*  16 */     a(paramdh);
/*     */   }
/*     */   
/*     */   public agn(add paramadd1, add paramadd2, add paramadd3) {
/*  20 */     this.a = paramadd1;
/*  21 */     this.b = paramadd2;
/*  22 */     this.c = paramadd3;
/*  23 */     this.e = 7;
/*     */   }
/*     */   
/*     */   public agn(add paramadd1, add paramadd2) {
/*  27 */     this(paramadd1, null, paramadd2);
/*     */   }
/*     */   
/*     */   public agn(add paramadd, adb paramadb) {
/*  31 */     this(paramadd, new add(paramadb));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public add a()
/*     */   {
/*  39 */     return this.a;
/*     */   }
/*     */   
/*     */   public add b() {
/*  43 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  47 */     return this.b != null;
/*     */   }
/*     */   
/*     */   public add d() {
/*  51 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean a(agn paramagn) {
/*  55 */     if ((this.a.b() != paramagn.a.b()) || (this.c.b() != paramagn.c.b())) {
/*  56 */       return false;
/*     */     }
/*  58 */     return ((this.b == null) && (paramagn.b == null)) || ((this.b != null) && (paramagn.b != null) && (this.b.b() == paramagn.b.b()));
/*     */   }
/*     */   
/*     */   public boolean b(agn paramagn)
/*     */   {
/*  63 */     return (a(paramagn)) && ((this.a.b < paramagn.a.b) || ((this.b != null) && (this.b.b < paramagn.b.b)));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void f()
/*     */   {
/*  71 */     this.d += 1;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/*  75 */     this.e += paramInt;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  79 */     return this.d >= this.e;
/*     */   }
/*     */   
/*     */   public void h() {
/*  83 */     this.d = this.e;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh) {
/*  87 */     dh localdh1 = paramdh.m("buy");
/*  88 */     this.a = add.a(localdh1);
/*  89 */     dh localdh2 = paramdh.m("sell");
/*  90 */     this.c = add.a(localdh2);
/*  91 */     if (paramdh.b("buyB", 10)) {
/*  92 */       this.b = add.a(paramdh.m("buyB"));
/*     */     }
/*  94 */     if (paramdh.b("uses", 99)) {
/*  95 */       this.d = paramdh.f("uses");
/*     */     }
/*  97 */     if (paramdh.b("maxUses", 99)) {
/*  98 */       this.e = paramdh.f("maxUses");
/*     */     } else {
/* 100 */       this.e = 7;
/*     */     }
/*     */   }
/*     */   
/*     */   public dh i() {
/* 105 */     dh localdh = new dh();
/* 106 */     localdh.a("buy", this.a.b(new dh()));
/* 107 */     localdh.a("sell", this.c.b(new dh()));
/* 108 */     if (this.b != null) {
/* 109 */       localdh.a("buyB", this.b.b(new dh()));
/*     */     }
/* 111 */     localdh.a("uses", this.d);
/* 112 */     localdh.a("maxUses", this.e);
/* 113 */     return localdh;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */