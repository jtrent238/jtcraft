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
/*     */ public class bcz
/*     */   extends bdw
/*     */ {
/*  19 */   private static bny a = new bny();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private final bdb f;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  37 */   private ass g = ass.e();
/*     */   private String h;
/*     */   private String i;
/*     */   private String r;
/*     */   private bda s;
/*     */   private bcb t;
/*     */   private bcb u;
/*     */   private bcb v;
/*     */   
/*     */   public bcz(bdb parambdb, String paramString) {
/*  47 */     this.f = parambdb;
/*     */     
/*  49 */     a(paramString);
/*     */   }
/*     */   
/*     */   public String a() {
/*  53 */     return this.g.toString();
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/*  57 */     this.g = ass.a(paramString);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  62 */     this.n.clear();
/*     */     
/*  64 */     this.h = brp.a("createWorld.customize.flat.title", new Object[0]);
/*  65 */     this.i = brp.a("createWorld.customize.flat.tile", new Object[0]);
/*  66 */     this.r = brp.a("createWorld.customize.flat.height", new Object[0]);
/*     */     
/*  68 */     this.s = new bda(this);
/*     */     
/*  70 */     this.n.add(this.t = new bcb(2, this.l / 2 - 154, this.m - 52, 100, 20, brp.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
/*  71 */     this.n.add(this.u = new bcb(3, this.l / 2 - 50, this.m - 52, 100, 20, brp.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
/*  72 */     this.n.add(this.v = new bcb(4, this.l / 2 - 155, this.m - 52, 150, 20, brp.a("createWorld.customize.flat.removeLayer", new Object[0])));
/*     */     
/*  74 */     this.n.add(new bcb(0, this.l / 2 - 155, this.m - 28, 150, 20, brp.a("gui.done", new Object[0])));
/*  75 */     this.n.add(new bcb(5, this.l / 2 + 5, this.m - 52, 150, 20, brp.a("createWorld.customize.presets", new Object[0])));
/*  76 */     this.n.add(new bcb(1, this.l / 2 + 5, this.m - 28, 150, 20, brp.a("gui.cancel", new Object[0])));
/*     */     
/*  78 */     this.t.m = (this.u.m = 0);
/*     */     
/*  80 */     this.g.d();
/*  81 */     f();
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  86 */     int j = this.g.c().size() - this.s.k - 1;
/*     */     
/*  88 */     if (parambcb.k == 1) {
/*  89 */       this.k.a(this.f);
/*  90 */     } else if (parambcb.k == 0) {
/*  91 */       this.f.a = a();
/*  92 */       this.k.a(this.f);
/*  93 */     } else if (parambcb.k == 5) {
/*  94 */       this.k.a(new bdq(this));
/*  95 */     } else if ((parambcb.k == 4) && (h())) {
/*  96 */       this.g.c().remove(j);
/*  97 */       this.s.k = Math.min(this.s.k, this.g.c().size() - 1);
/*     */     }
/*     */     
/* 100 */     this.g.d();
/* 101 */     f();
/*     */   }
/*     */   
/*     */   public void f() {
/* 105 */     boolean bool = h();
/* 106 */     this.v.l = bool;
/* 107 */     this.u.l = bool;
/*     */     
/*     */ 
/* 110 */     this.u.l = false;
/* 111 */     this.t.l = false;
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 115 */     return (this.s.k > -1) && (this.s.k < this.g.c().size());
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 120 */     c();
/*     */     
/* 122 */     this.s.a(paramInt1, paramInt2, paramFloat);
/* 123 */     a(this.q, this.h, this.l / 2, 8, 16777215);
/*     */     
/* 125 */     int j = this.l / 2 - 92 - 16;
/* 126 */     b(this.q, this.i, j, 32, 16777215);
/* 127 */     b(this.q, this.r, j + 2 + 213 - this.q.a(this.r), 32, 16777215);
/*     */     
/* 129 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */