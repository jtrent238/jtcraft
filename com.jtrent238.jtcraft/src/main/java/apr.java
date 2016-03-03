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
/*     */ public class apr
/*     */   extends ajc
/*     */ {
/*     */   public apr()
/*     */   {
/*  18 */     super(awt.H);
/*  19 */     c(-1.0F);
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  24 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/*  33 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*  34 */     if ((localaor instanceof aps)) {
/*  35 */       ((aps)localaor).f();
/*     */     } else {
/*  37 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  48 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  53 */     return -1;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  58 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  63 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  69 */     if ((!paramahb.E) && (paramahb.o(paramInt1, paramInt2, paramInt3) == null))
/*     */     {
/*  71 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  72 */       return true;
/*     */     }
/*  74 */     return false;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  79 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/*  84 */     if (paramahb.E) { return;
/*     */     }
/*  86 */     aps localaps = e(paramahb, paramInt1, paramInt2, paramInt3);
/*  87 */     if (localaps == null) {
/*  88 */       return;
/*     */     }
/*     */     
/*  91 */     localaps.a().b(paramahb, paramInt1, paramInt2, paramInt3, localaps.p(), 0);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  96 */     if (!paramahb.E) {
/*  97 */       paramahb.o(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public static aor a(aji paramaji, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/* 102 */     return new aps(paramaji, paramInt1, paramInt2, paramBoolean1, paramBoolean2);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 107 */     aps localaps = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 108 */     if (localaps == null) {
/* 109 */       return null;
/*     */     }
/*     */     
/*     */ 
/* 113 */     float f = localaps.a(0.0F);
/* 114 */     if (localaps.b()) {
/* 115 */       f = 1.0F - f;
/*     */     }
/* 117 */     return a(paramahb, paramInt1, paramInt2, paramInt3, localaps.a(), f, localaps.c());
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 122 */     aps localaps = e(paramahl, paramInt1, paramInt2, paramInt3);
/* 123 */     if (localaps != null) {
/* 124 */       aji localaji = localaps.a();
/* 125 */       if ((localaji == this) || (localaji.o() == awt.a)) {
/* 126 */         return;
/*     */       }
/* 128 */       localaji.a(paramahl, paramInt1, paramInt2, paramInt3);
/*     */       
/* 130 */       float f = localaps.a(0.0F);
/* 131 */       if (localaps.b()) {
/* 132 */         f = 1.0F - f;
/*     */       }
/* 134 */       int i = localaps.c();
/* 135 */       this.B = (localaji.x() - q.b[i] * f);
/* 136 */       this.C = (localaji.z() - q.c[i] * f);
/* 137 */       this.D = (localaji.B() - q.d[i] * f);
/* 138 */       this.E = (localaji.y() - q.b[i] * f);
/* 139 */       this.F = (localaji.A() - q.c[i] * f);
/* 140 */       this.G = (localaji.C() - q.d[i] * f);
/*     */     }
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, float paramFloat, int paramInt4) {
/* 145 */     if ((paramaji == this) || (paramaji.o() == awt.a)) {
/* 146 */       return null;
/*     */     }
/* 148 */     azt localazt = paramaji.a(paramahb, paramInt1, paramInt2, paramInt3);
/*     */     
/* 150 */     if (localazt == null) {
/* 151 */       return null;
/*     */     }
/*     */     
/*     */ 
/* 155 */     if (q.b[paramInt4] < 0) {
/* 156 */       localazt.a -= q.b[paramInt4] * paramFloat;
/*     */     } else {
/* 158 */       localazt.d -= q.b[paramInt4] * paramFloat;
/*     */     }
/* 160 */     if (q.c[paramInt4] < 0) {
/* 161 */       localazt.b -= q.c[paramInt4] * paramFloat;
/*     */     } else {
/* 163 */       localazt.e -= q.c[paramInt4] * paramFloat;
/*     */     }
/* 165 */     if (q.d[paramInt4] < 0) {
/* 166 */       localazt.c -= q.d[paramInt4] * paramFloat;
/*     */     } else {
/* 168 */       localazt.f -= q.d[paramInt4] * paramFloat;
/*     */     }
/* 170 */     return localazt;
/*     */   }
/*     */   
/*     */   private aps e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 174 */     aor localaor = paramahl.o(paramInt1, paramInt2, paramInt3);
/* 175 */     if ((localaor instanceof aps)) {
/* 176 */       return (aps)localaor;
/*     */     }
/* 178 */     return null;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 183 */     return adb.d(0);
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/* 189 */     this.L = paramrg.a("piston_top_normal");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */