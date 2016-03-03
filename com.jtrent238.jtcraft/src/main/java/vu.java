/*     */ import java.util.Random;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ public abstract class vu
/*     */   extends ui
/*     */ {
/*     */   protected td c;
/*     */   protected boolean d;
/*     */   private boolean a;
/*     */   private int b;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public vu(td paramtd, boolean paramBoolean)
/*     */   {
/*  30 */     this(paramtd, paramBoolean, false);
/*     */   }
/*     */   
/*     */   public vu(td paramtd, boolean paramBoolean1, boolean paramBoolean2) {
/*  34 */     this.c = paramtd;
/*  35 */     this.d = paramBoolean1;
/*  36 */     this.a = paramBoolean2;
/*     */   }
/*     */   
/*     */   public boolean b()
/*     */   {
/*  41 */     sv localsv = this.c.o();
/*  42 */     if (localsv == null) return false;
/*  43 */     if (!localsv.Z()) { return false;
/*     */     }
/*  45 */     double d1 = f();
/*  46 */     if (this.c.f(localsv) > d1 * d1) return false;
/*  47 */     if (this.d) {
/*  48 */       if (this.c.n().a(localsv)) {
/*  49 */         this.f = 0;
/*     */       }
/*  51 */       else if (++this.f > 60) { return false;
/*     */       }
/*     */     }
/*  54 */     if (((localsv instanceof mw)) && 
/*  55 */       (((mw)localsv).c.d())) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   protected double f() {
/*  63 */     ti localti = this.c.a(yj.b);
/*  64 */     return localti == null ? 16.0D : localti.e();
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/*  69 */     this.b = 0;
/*  70 */     this.e = 0;
/*  71 */     this.f = 0;
/*     */   }
/*     */   
/*     */   public void d()
/*     */   {
/*  76 */     this.c.d(null);
/*     */   }
/*     */   
/*     */   protected boolean a(sv paramsv, boolean paramBoolean) {
/*  80 */     if (paramsv == null) return false;
/*  81 */     if (paramsv == this.c) return false;
/*  82 */     if (!paramsv.Z()) return false;
/*  83 */     if (!this.c.a(paramsv.getClass())) { return false;
/*     */     }
/*  85 */     if (((this.c instanceof ta)) && (StringUtils.isNotEmpty(((ta)this.c).b()))) {
/*  86 */       if (((paramsv instanceof ta)) && (((ta)this.c).b().equals(((ta)paramsv).b())))
/*     */       {
/*  88 */         return false;
/*     */       }
/*     */       
/*  91 */       if (paramsv == ((ta)this.c).i_())
/*     */       {
/*  93 */         return false;
/*     */       }
/*  95 */     } else if (((paramsv instanceof yz)) && 
/*  96 */       (!paramBoolean) && (((yz)paramsv).bE.a)) { return false;
/*     */     }
/*     */     
/*  99 */     if (!this.c.b(qh.c(paramsv.s), qh.c(paramsv.t), qh.c(paramsv.u))) { return false;
/*     */     }
/* 101 */     if ((this.d) && (!this.c.n().a(paramsv))) { return false;
/*     */     }
/* 103 */     if (this.a) {
/* 104 */       if (--this.e <= 0) this.b = 0;
/* 105 */       if (this.b == 0) this.b = (a(paramsv) ? 1 : 2);
/* 106 */       if (this.b == 2) { return false;
/*     */       }
/*     */     }
/* 109 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(sv paramsv) {
/* 113 */     this.e = (10 + this.c.aI().nextInt(5));
/* 114 */     ayf localayf = this.c.m().a(paramsv);
/* 115 */     if (localayf == null) return false;
/* 116 */     aye localaye = localayf.c();
/* 117 */     if (localaye == null) return false;
/* 118 */     int i = localaye.a - qh.c(paramsv.s);
/* 119 */     int j = localaye.c - qh.c(paramsv.u);
/* 120 */     return i * i + j * j <= 2.25D;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */