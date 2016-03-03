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
/*     */ 
/*     */ 
/*     */ public class ub
/*     */   extends ui
/*     */ {
/*     */   private final sw a;
/*     */   private final float b;
/*     */   private float c;
/*     */   private boolean d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public ub(sw paramsw, float paramFloat)
/*     */   {
/*  25 */     this.a = paramsw;
/*  26 */     this.b = paramFloat;
/*  27 */     a(7);
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/*  32 */     this.c = 0.0F;
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/*  37 */     this.d = false;
/*  38 */     this.c = 0.0F;
/*     */   }
/*     */   
/*     */   public boolean a()
/*     */   {
/*  43 */     return (this.a.Z()) && (this.a.l != null) && ((this.a.l instanceof yz)) && ((this.d) || (this.a.bE()));
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  48 */     yz localyz = (yz)this.a.l;
/*  49 */     td localtd = (td)this.a;
/*     */     
/*  51 */     float f1 = qh.g(localyz.y - this.a.y) * 0.5F;
/*  52 */     if (f1 > 5.0F) f1 = 5.0F;
/*  53 */     if (f1 < -5.0F) { f1 = -5.0F;
/*     */     }
/*  55 */     this.a.y = qh.g(this.a.y + f1);
/*  56 */     if (this.c < this.b) this.c += (this.b - this.c) * 0.01F;
/*  57 */     if (this.c > this.b) { this.c = this.b;
/*     */     }
/*  59 */     int i = qh.c(this.a.s);
/*  60 */     int j = qh.c(this.a.t);
/*  61 */     int k = qh.c(this.a.u);
/*  62 */     float f2 = this.c;
/*  63 */     if (this.d) {
/*  64 */       if (this.e++ > this.f) {
/*  65 */         this.d = false;
/*     */       }
/*  67 */       f2 += f2 * 1.15F * qh.a(this.e / this.f * 3.1415927F);
/*     */     }
/*     */     
/*  70 */     float f3 = 0.91F;
/*  71 */     if (this.a.D) {
/*  72 */       f3 = this.a.o.a(qh.d(i), qh.d(j) - 1, qh.d(k)).K * 0.91F;
/*     */     }
/*  74 */     float f4 = 0.16277136F / (f3 * f3 * f3);
/*  75 */     float f5 = qh.a(localtd.y * 3.1415927F / 180.0F);
/*  76 */     float f6 = qh.b(localtd.y * 3.1415927F / 180.0F);
/*  77 */     float f7 = localtd.bl() * f4;
/*  78 */     float f8 = Math.max(f2, 1.0F);
/*  79 */     f8 = f7 / f8;
/*  80 */     float f9 = f2 * f8;
/*  81 */     float f10 = -(f9 * f5);
/*  82 */     float f11 = f9 * f6;
/*     */     
/*  84 */     if (qh.e(f10) > qh.e(f11)) {
/*  85 */       if (f10 < 0.0F) f10 -= this.a.M / 2.0F;
/*  86 */       if (f10 > 0.0F) f10 += this.a.M / 2.0F;
/*  87 */       f11 = 0.0F;
/*     */     } else {
/*  89 */       f10 = 0.0F;
/*  90 */       if (f11 < 0.0F) f11 -= this.a.M / 2.0F;
/*  91 */       if (f11 > 0.0F) { f11 += this.a.M / 2.0F;
/*     */       }
/*     */     }
/*  94 */     int m = qh.c(this.a.s + f10);
/*  95 */     int n = qh.c(this.a.u + f11);
/*     */     
/*  97 */     aye localaye = new aye(qh.d(this.a.M + 1.0F), qh.d(this.a.N + localyz.N + 1.0F), qh.d(this.a.M + 1.0F));
/*     */     Object localObject;
/*  99 */     if ((i != m) || (k != n))
/*     */     {
/*     */ 
/* 102 */       localObject = this.a.o.a(i, j, k);
/* 103 */       int i1 = (!a((aji)localObject)) && ((((aji)localObject).o() != awt.a) || (!a(this.a.o.a(i, j - 1, k)))) ? 1 : 0;
/*     */       
/* 105 */       if ((i1 != 0) && (ayg.a(this.a, m, j, n, localaye, false, false, true) == 0) && (ayg.a(this.a, i, j + 1, k, localaye, false, false, true) == 1) && (ayg.a(this.a, m, j + 1, n, localaye, false, false, true) == 1))
/*     */       {
/* 107 */         localtd.l().a();
/*     */       }
/*     */     }
/*     */     
/* 111 */     if ((!localyz.bE.d) && (this.c >= this.b * 0.5F) && (this.a.aI().nextFloat() < 0.006F) && (!this.d)) {
/* 112 */       localObject = localyz.be();
/*     */       
/* 114 */       if ((localObject != null) && (((add)localObject).b() == ade.bM)) {
/* 115 */         ((add)localObject).a(1, localyz);
/*     */         
/* 117 */         if (((add)localObject).b == 0) {
/* 118 */           add localadd = new add(ade.aM);
/* 119 */           localadd.d(((add)localObject).d);
/* 120 */           localyz.bm.a[localyz.bm.c] = localadd;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 125 */     this.a.e(0.0F, f2);
/*     */   }
/*     */   
/*     */   private boolean a(aji paramaji) {
/* 129 */     return (paramaji.b() == 10) || ((paramaji instanceof alj));
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 133 */     return this.d;
/*     */   }
/*     */   
/*     */   public void g() {
/* 137 */     this.d = true;
/* 138 */     this.e = 0;
/* 139 */     this.f = (this.a.aI().nextInt(841) + 140);
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 143 */     return (!f()) && (this.c > this.b * 0.3F);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */