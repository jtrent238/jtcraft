/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xw
/*     */   extends sa
/*     */ {
/*     */   public int a;
/*     */   private sv b;
/*     */   
/*     */   public xw(ahb paramahb)
/*     */   {
/*  18 */     super(paramahb);
/*  19 */     this.k = true;
/*  20 */     a(0.98F, 0.98F);
/*  21 */     this.L = (this.N / 2.0F);
/*     */   }
/*     */   
/*     */   public xw(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, sv paramsv) {
/*  25 */     this(paramahb);
/*     */     
/*  27 */     b(paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  29 */     float f = (float)(Math.random() * 3.1415927410125732D * 2.0D);
/*  30 */     this.v = (-(float)Math.sin(f) * 0.02F);
/*  31 */     this.w = 0.20000000298023224D;
/*  32 */     this.x = (-(float)Math.cos(f) * 0.02F);
/*     */     
/*  34 */     this.a = 80;
/*     */     
/*  36 */     this.p = paramDouble1;
/*  37 */     this.q = paramDouble2;
/*  38 */     this.r = paramDouble3;
/*  39 */     this.b = paramsv;
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   protected boolean g_()
/*     */   {
/*  48 */     return false;
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/*  53 */     return !this.K;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  58 */     this.p = this.s;
/*  59 */     this.q = this.t;
/*  60 */     this.r = this.u;
/*     */     
/*  62 */     this.w -= 0.03999999910593033D;
/*  63 */     d(this.v, this.w, this.x);
/*  64 */     this.v *= 0.9800000190734863D;
/*  65 */     this.w *= 0.9800000190734863D;
/*  66 */     this.x *= 0.9800000190734863D;
/*     */     
/*  68 */     if (this.D) {
/*  69 */       this.v *= 0.699999988079071D;
/*  70 */       this.x *= 0.699999988079071D;
/*  71 */       this.w *= -0.5D;
/*     */     }
/*     */     
/*  74 */     if (this.a-- <= 0) {
/*  75 */       B();
/*  76 */       if (!this.o.E) {
/*  77 */         f();
/*     */       }
/*     */     } else {
/*  80 */       this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   private void f()
/*     */   {
/*  86 */     float f = 4.0F;
/*  87 */     this.o.a(this, this.s, this.t, this.u, f, true);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/*  92 */     paramdh.a("Fuse", (byte)this.a);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/*  97 */     this.a = paramdh.d("Fuse");
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 102 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public sv e() {
/* 106 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */