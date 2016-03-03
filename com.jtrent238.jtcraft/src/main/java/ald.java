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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ald
/*     */   extends ajc
/*     */ {
/*     */   public ald()
/*     */   {
/*  27 */     super(awt.q);
/*  28 */     g();
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  33 */     float f1 = 0.375F;
/*  34 */     float f2 = f1 / 2.0F;
/*  35 */     a(0.5F - f2, 0.0F, 0.5F - f2, 0.5F + f2, f1, 0.5F + f2);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  40 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  45 */     return 33;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  55 */     add localadd = paramyz.bm.h();
/*  56 */     if ((localadd == null) || (!(localadd.b() instanceof abh))) { return false;
/*     */     }
/*  58 */     apf localapf = e(paramahb, paramInt1, paramInt2, paramInt3);
/*  59 */     if (localapf != null) {
/*  60 */       if (localapf.a() != null) {
/*  61 */         return false;
/*     */       }
/*  63 */       aji localaji = aji.a(localadd.b());
/*  64 */       if (!a(localaji, localadd.k())) {
/*  65 */         return false;
/*     */       }
/*  67 */       localapf.a(localadd.b(), localadd.k());
/*  68 */       localapf.e();
/*     */       
/*  70 */       if (!paramahb.a(paramInt1, paramInt2, paramInt3, localadd.k(), 2))
/*     */       {
/*  72 */         paramahb.g(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */       
/*  75 */       if (!paramyz.bE.d) {
/*  76 */         if (--localadd.b <= 0) {
/*  77 */           paramyz.bm.a(paramyz.bm.c, null);
/*     */         }
/*     */       }
/*     */       
/*  81 */       return true;
/*     */     }
/*  83 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(aji paramaji, int paramInt) {
/*  87 */     if ((paramaji == ajn.N) || (paramaji == ajn.O) || (paramaji == ajn.aF) || (paramaji == ajn.P) || (paramaji == ajn.Q) || (paramaji == ajn.g) || (paramaji == ajn.I)) {
/*  88 */       return true;
/*     */     }
/*  90 */     if ((paramaji == ajn.H) && (paramInt == 2)) {
/*  91 */       return true;
/*     */     }
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  98 */     apf localapf = e(paramahb, paramInt1, paramInt2, paramInt3);
/*  99 */     if ((localapf != null) && (localapf.a() != null)) {
/* 100 */       return localapf.a();
/*     */     }
/* 102 */     return ade.bE;
/*     */   }
/*     */   
/*     */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 107 */     apf localapf = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 108 */     if ((localapf != null) && (localapf.a() != null)) {
/* 109 */       return localapf.b();
/*     */     }
/* 111 */     return 0;
/*     */   }
/*     */   
/*     */   public boolean K()
/*     */   {
/* 116 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 121 */     return (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 126 */     if (!ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3)) {
/* 127 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*     */       
/* 129 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/* 137 */     apf localapf = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 138 */     if ((localapf != null) && (localapf.a() != null)) {
/* 139 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(localapf.a(), 1, localapf.b()));
/*     */     }
/* 141 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz)
/*     */   {
/* 146 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramyz);
/*     */     
/* 148 */     if (paramyz.bE.d) {
/* 149 */       apf localapf = e(paramahb, paramInt1, paramInt2, paramInt3);
/* 150 */       if (localapf != null)
/*     */       {
/* 152 */         localapf.a(adb.d(0), 0);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 159 */     return ade.bE;
/*     */   }
/*     */   
/*     */   private apf e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 163 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/* 164 */     if ((localaor != null) && ((localaor instanceof apf))) {
/* 165 */       return (apf)localaor;
/*     */     }
/* 167 */     return null;
/*     */   }
/*     */   
/*     */ 
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/* 173 */     Object localObject = null;
/* 174 */     int i = 0;
/* 175 */     switch (paramInt) {
/*     */     default: 
/*     */       break;
/*     */     case 1: 
/* 179 */       localObject = ajn.O;
/* 180 */       i = 0;
/* 181 */       break;
/*     */     case 2: 
/* 183 */       localObject = ajn.N;
/* 184 */       break;
/*     */     case 3: 
/* 186 */       localObject = ajn.g;
/* 187 */       i = 0;
/* 188 */       break;
/*     */     case 4: 
/* 190 */       localObject = ajn.g;
/* 191 */       i = 1;
/* 192 */       break;
/*     */     case 5: 
/* 194 */       localObject = ajn.g;
/* 195 */       i = 2;
/* 196 */       break;
/*     */     case 6: 
/* 198 */       localObject = ajn.g;
/* 199 */       i = 3;
/* 200 */       break;
/*     */     case 12: 
/* 202 */       localObject = ajn.g;
/* 203 */       i = 4;
/* 204 */       break;
/*     */     case 13: 
/* 206 */       localObject = ajn.g;
/* 207 */       i = 5;
/* 208 */       break;
/*     */     case 7: 
/* 210 */       localObject = ajn.Q;
/* 211 */       break;
/*     */     case 8: 
/* 213 */       localObject = ajn.P;
/* 214 */       break;
/*     */     case 9: 
/* 216 */       localObject = ajn.aF;
/* 217 */       break;
/*     */     case 10: 
/* 219 */       localObject = ajn.I;
/* 220 */       break;
/*     */     case 11: 
/* 222 */       localObject = ajn.H;
/* 223 */       i = 2;
/*     */     }
/*     */     
/* 226 */     return new apf(adb.a((aji)localObject), i);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ald.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */