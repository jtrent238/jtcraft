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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aat
/*     */   extends zs
/*     */ {
/*     */   private agm a;
/*     */   private aas f;
/*     */   private final ahb g;
/*     */   
/*     */   public aat(yx paramyx, agm paramagm, ahb paramahb)
/*     */   {
/*  32 */     this.a = paramagm;
/*  33 */     this.g = paramahb;
/*     */     
/*  35 */     this.f = new aas(paramyx.d, paramagm);
/*  36 */     a(new aay(this.f, 0, 36, 53));
/*  37 */     a(new aay(this.f, 1, 62, 53));
/*  38 */     a(new aau(paramyx.d, paramagm, this.f, 2, 120, 53));
/*     */     
/*  40 */     for (int i = 0; i < 3; i++) {
/*  41 */       for (int j = 0; j < 9; j++) {
/*  42 */         a(new aay(paramyx, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     }
/*  45 */     for (i = 0; i < 9; i++) {
/*  46 */       a(new aay(paramyx, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public aas e() {
/*  51 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(aac paramaac)
/*     */   {
/*  56 */     super.a(paramaac);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  61 */     super.b();
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/*  66 */     this.f.h();
/*  67 */     super.a(paramrb);
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/*  71 */     this.f.c(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(int paramInt1, int paramInt2) {}
/*     */   
/*     */ 
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  80 */     return this.a.b() == paramyz;
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/*  85 */     add localadd1 = null;
/*  86 */     aay localaay = (aay)this.c.get(paramInt);
/*  87 */     if ((localaay != null) && (localaay.e())) {
/*  88 */       add localadd2 = localaay.d();
/*  89 */       localadd1 = localadd2.m();
/*     */       
/*  91 */       if (paramInt == 2) {
/*  92 */         if (!a(localadd2, 3, 39, true)) {
/*  93 */           return null;
/*     */         }
/*  95 */         localaay.a(localadd2, localadd1);
/*  96 */       } else if ((paramInt == 0) || (paramInt == 1)) {
/*  97 */         if (!a(localadd2, 3, 39, false)) {
/*  98 */           return null;
/*     */         }
/* 100 */       } else if ((paramInt >= 3) && (paramInt < 30)) {
/* 101 */         if (!a(localadd2, 30, 39, false)) {
/* 102 */           return null;
/*     */         }
/* 104 */       } else if ((paramInt >= 30) && (paramInt < 39) && 
/* 105 */         (!a(localadd2, 3, 30, false))) {
/* 106 */         return null;
/*     */       }
/*     */       
/* 109 */       if (localadd2.b == 0) {
/* 110 */         localaay.c(null);
/*     */       } else {
/* 112 */         localaay.f();
/*     */       }
/* 114 */       if (localadd2.b == localadd1.b) {
/* 115 */         return null;
/*     */       }
/* 117 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 120 */     return localadd1;
/*     */   }
/*     */   
/*     */   public void b(yz paramyz)
/*     */   {
/* 125 */     super.b(paramyz);
/* 126 */     this.a.a_(null);
/*     */     
/* 128 */     super.b(paramyz);
/* 129 */     if (this.g.E) { return;
/*     */     }
/* 131 */     add localadd = this.f.a_(0);
/* 132 */     if (localadd != null) {
/* 133 */       paramyz.a(localadd, false);
/*     */     }
/* 135 */     localadd = this.f.a_(1);
/* 136 */     if (localadd != null) {
/* 137 */       paramyz.a(localadd, false);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */