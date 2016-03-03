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
/*     */ 
/*     */ public class ua
/*     */   extends ui
/*     */ {
/*     */   private wf d;
/*     */   ahb a;
/*     */   private wf e;
/*     */   int b;
/*     */   double c;
/*     */   
/*     */   public ua(wf paramwf, double paramDouble)
/*     */   {
/*  23 */     this.d = paramwf;
/*  24 */     this.a = paramwf.o;
/*  25 */     this.c = paramDouble;
/*  26 */     a(3);
/*     */   }
/*     */   
/*     */   public boolean a()
/*     */   {
/*  31 */     if (!this.d.ce()) return false;
/*  32 */     this.e = f();
/*  33 */     return this.e != null;
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  38 */     return (this.e.Z()) && (this.e.ce()) && (this.b < 60);
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/*  43 */     this.e = null;
/*  44 */     this.b = 0;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  49 */     this.d.j().a(this.e, 10.0F, this.d.x());
/*  50 */     this.d.m().a(this.e, this.c);
/*  51 */     this.b += 1;
/*  52 */     if ((this.b >= 60) && (this.d.f(this.e) < 9.0D)) g();
/*     */   }
/*     */   
/*     */   private wf f() {
/*  56 */     float f = 8.0F;
/*  57 */     List localList = this.a.a(this.d.getClass(), this.d.C.b(f, f, f));
/*  58 */     double d1 = Double.MAX_VALUE;
/*  59 */     Object localObject = null;
/*  60 */     for (wf localwf : localList) {
/*  61 */       if ((this.d.a(localwf)) && (this.d.f(localwf) < d1)) {
/*  62 */         localObject = localwf;
/*  63 */         d1 = this.d.f(localwf);
/*     */       }
/*     */     }
/*  66 */     return (wf)localObject;
/*     */   }
/*     */   
/*     */   private void g() {
/*  70 */     rx localrx = this.d.a(this.e);
/*  71 */     if (localrx == null) { return;
/*     */     }
/*  73 */     yz localyz = this.d.cd();
/*  74 */     if ((localyz == null) && (this.e.cd() != null)) {
/*  75 */       localyz = this.e.cd();
/*     */     }
/*     */     
/*  78 */     if (localyz != null) {
/*  79 */       localyz.a(pp.x);
/*     */       
/*  81 */       if ((this.d instanceof wh)) {
/*  82 */         localyz.a(pc.H);
/*     */       }
/*     */     }
/*     */     
/*  86 */     this.d.c(6000);
/*  87 */     this.e.c(6000);
/*  88 */     this.d.cf();
/*  89 */     this.e.cf();
/*  90 */     localrx.c(41536);
/*  91 */     localrx.b(this.d.s, this.d.t, this.d.u, 0.0F, 0.0F);
/*  92 */     this.a.d(localrx);
/*     */     
/*  94 */     Random localRandom = this.d.aI();
/*  95 */     for (int i = 0; i < 7; i++) {
/*  96 */       double d1 = localRandom.nextGaussian() * 0.02D;
/*  97 */       double d2 = localRandom.nextGaussian() * 0.02D;
/*  98 */       double d3 = localRandom.nextGaussian() * 0.02D;
/*  99 */       this.a.a("heart", this.d.s + localRandom.nextFloat() * this.d.M * 2.0F - this.d.M, this.d.t + 0.5D + localRandom.nextFloat() * this.d.N, this.d.u + localRandom.nextFloat() * this.d.M * 2.0F - this.d.M, d1, d2, d3);
/*     */     }
/*     */     
/*     */ 
/* 103 */     if (this.a.O().b("doMobLoot")) this.a.d(new sq(this.a, this.d.s, this.d.t, this.d.u, localRandom.nextInt(7) + 1));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */