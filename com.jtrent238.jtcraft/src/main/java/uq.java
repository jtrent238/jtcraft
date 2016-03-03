/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uq
/*     */   extends ui
/*     */ {
/*     */   ahb a;
/*     */   td b;
/*     */   int c;
/*     */   double d;
/*     */   boolean e;
/*     */   ayf f;
/*     */   Class g;
/*     */   private int h;
/*     */   private double i;
/*     */   private double j;
/*     */   private double k;
/*     */   
/*     */   public uq(td paramtd, Class paramClass, double paramDouble, boolean paramBoolean)
/*     */   {
/*  23 */     this(paramtd, paramDouble, paramBoolean);
/*  24 */     this.g = paramClass;
/*     */   }
/*     */   
/*     */   public uq(td paramtd, double paramDouble, boolean paramBoolean) {
/*  28 */     this.b = paramtd;
/*  29 */     this.a = paramtd.o;
/*  30 */     this.d = paramDouble;
/*  31 */     this.e = paramBoolean;
/*  32 */     a(3);
/*     */   }
/*     */   
/*     */   public boolean a()
/*     */   {
/*  37 */     sv localsv = this.b.o();
/*  38 */     if (localsv == null) return false;
/*  39 */     if (!localsv.Z()) return false;
/*  40 */     if ((this.g != null) && (!this.g.isAssignableFrom(localsv.getClass()))) return false;
/*  41 */     this.f = this.b.m().a(localsv);
/*  42 */     return this.f != null;
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  47 */     sv localsv = this.b.o();
/*  48 */     if (localsv == null) return false;
/*  49 */     if (!localsv.Z()) return false;
/*  50 */     if (!this.e) return !this.b.m().g();
/*  51 */     if (!this.b.b(qh.c(localsv.s), qh.c(localsv.t), qh.c(localsv.u))) return false;
/*  52 */     return true;
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/*  57 */     this.b.m().a(this.f, this.d);
/*  58 */     this.h = 0;
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/*  63 */     this.b.m().h();
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  68 */     sv localsv = this.b.o();
/*  69 */     this.b.j().a(localsv, 30.0F, 30.0F);
/*  70 */     double d1 = this.b.e(localsv.s, localsv.C.b, localsv.u);
/*  71 */     double d2 = this.b.M * 2.0F * (this.b.M * 2.0F) + localsv.M;
/*  72 */     this.h -= 1;
/*     */     
/*  74 */     if (((this.e) || (this.b.n().a(localsv))) && 
/*  75 */       (this.h <= 0) && (
/*  76 */       ((this.i == 0.0D) && (this.j == 0.0D) && (this.k == 0.0D)) || (localsv.e(this.i, this.j, this.k) >= 1.0D) || (this.b.aI().nextFloat() < 0.05F))) {
/*  77 */       this.i = localsv.s;
/*  78 */       this.j = localsv.C.b;
/*  79 */       this.k = localsv.u;
/*  80 */       this.h = (4 + this.b.aI().nextInt(7));
/*     */       
/*  82 */       if (d1 > 1024.0D) {
/*  83 */         this.h += 10;
/*  84 */       } else if (d1 > 256.0D) {
/*  85 */         this.h += 5;
/*     */       }
/*     */       
/*  88 */       if (!this.b.m().a(localsv, this.d)) {
/*  89 */         this.h += 15;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  95 */     this.c = Math.max(this.c - 1, 0);
/*     */     
/*  97 */     if ((d1 <= d2) && (this.c <= 20)) {
/*  98 */       this.c = 20;
/*  99 */       if (this.b.be() != null) this.b.ba();
/* 100 */       this.b.n(localsv);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */