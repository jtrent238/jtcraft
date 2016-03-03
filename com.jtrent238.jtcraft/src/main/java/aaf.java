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
/*     */ 
/*     */ public class aaf
/*     */   extends zs
/*     */ {
/*  20 */   public aae a = new aae(this, 3, 3);
/*  21 */   public rb f = new aaw();
/*     */   private ahb g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   
/*  27 */   public aaf(yx paramyx, ahb paramahb, int paramInt1, int paramInt2, int paramInt3) { this.g = paramahb;
/*  28 */     this.h = paramInt1;
/*  29 */     this.i = paramInt2;
/*  30 */     this.j = paramInt3;
/*  31 */     a(new aax(paramyx.d, this.a, this.f, 0, 124, 35));
/*     */     int m;
/*  33 */     for (int k = 0; k < 3; k++) {
/*  34 */       for (m = 0; m < 3; m++) {
/*  35 */         a(new aay(this.a, m + k * 3, 30 + m * 18, 17 + k * 18));
/*     */       }
/*     */     }
/*     */     
/*  39 */     for (k = 0; k < 3; k++) {
/*  40 */       for (m = 0; m < 9; m++) {
/*  41 */         a(new aay(paramyx, m + k * 9 + 9, 8 + m * 18, 84 + k * 18));
/*     */       }
/*     */     }
/*  44 */     for (k = 0; k < 9; k++) {
/*  45 */       a(new aay(paramyx, k, 8 + k * 18, 142));
/*     */     }
/*     */     
/*  48 */     a(this.a);
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/*  53 */     this.f.a(0, afe.a().a(this.a, this.g));
/*     */   }
/*     */   
/*     */   public void b(yz paramyz)
/*     */   {
/*  58 */     super.b(paramyz);
/*  59 */     if (this.g.E) { return;
/*     */     }
/*  61 */     for (int k = 0; k < 9; k++) {
/*  62 */       add localadd = this.a.a_(k);
/*  63 */       if (localadd != null) {
/*  64 */         paramyz.a(localadd, false);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  71 */     if (this.g.a(this.h, this.i, this.j) != ajn.ai) return false;
/*  72 */     if (paramyz.e(this.h + 0.5D, this.i + 0.5D, this.j + 0.5D) > 64.0D) return false;
/*  73 */     return true;
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/*  78 */     add localadd1 = null;
/*  79 */     aay localaay = (aay)this.c.get(paramInt);
/*  80 */     if ((localaay != null) && (localaay.e())) {
/*  81 */       add localadd2 = localaay.d();
/*  82 */       localadd1 = localadd2.m();
/*     */       
/*  84 */       if (paramInt == 0) {
/*  85 */         if (!a(localadd2, 10, 46, true)) {
/*  86 */           return null;
/*     */         }
/*  88 */         localaay.a(localadd2, localadd1);
/*  89 */       } else if ((paramInt >= 10) && (paramInt < 37)) {
/*  90 */         if (!a(localadd2, 37, 46, false)) {
/*  91 */           return null;
/*     */         }
/*  93 */       } else if ((paramInt >= 37) && (paramInt < 46)) {
/*  94 */         if (!a(localadd2, 10, 37, false)) {
/*  95 */           return null;
/*     */         }
/*     */       }
/*  98 */       else if (!a(localadd2, 10, 46, false)) {
/*  99 */         return null;
/*     */       }
/*     */       
/* 102 */       if (localadd2.b == 0) {
/* 103 */         localaay.c(null);
/*     */       } else {
/* 105 */         localaay.f();
/*     */       }
/* 107 */       if (localadd2.b == localadd1.b)
/*     */       {
/* 109 */         return null;
/*     */       }
/* 111 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 114 */     return localadd1;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, aay paramaay)
/*     */   {
/* 119 */     return (paramaay.f != this.f) && (super.a(paramadd, paramaay));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aaf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */