/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class alh
/*     */   extends aji
/*     */   implements ajo
/*     */ {
/*  17 */   private static final Logger a = ;
/*     */   
/*     */   private rf b;
/*     */   private rf M;
/*     */   private rf N;
/*     */   
/*     */   protected alh()
/*     */   {
/*  25 */     super(awt.b);
/*  26 */     a(true);
/*  27 */     a(abt.b);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  32 */     if (paramInt1 == 1) return this.b;
/*  33 */     if (paramInt1 == 0) return ajn.d.h(paramInt1);
/*  34 */     return this.L;
/*     */   }
/*     */   
/*     */   public rf e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  39 */     if (paramInt4 == 1) return this.b;
/*  40 */     if (paramInt4 == 0) return ajn.d.h(paramInt4);
/*  41 */     awt localawt = paramahl.a(paramInt1, paramInt2 + 1, paramInt3).o();
/*  42 */     if ((localawt == awt.y) || (localawt == awt.z)) return this.M;
/*  43 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  48 */     this.L = paramrg.a(N() + "_side");
/*  49 */     this.b = paramrg.a(N() + "_top");
/*  50 */     this.M = paramrg.a(N() + "_side_snowed");
/*  51 */     this.N = paramrg.a(N() + "_side_overlay");
/*     */   }
/*     */   
/*     */   public int D()
/*     */   {
/*  56 */     double d1 = 0.5D;
/*  57 */     double d2 = 1.0D;
/*     */     
/*  59 */     return aha.a(d1, d2);
/*     */   }
/*     */   
/*     */   public int i(int paramInt)
/*     */   {
/*  64 */     return D();
/*     */   }
/*     */   
/*     */ 
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  70 */     int i = 0;
/*  71 */     int j = 0;
/*  72 */     int k = 0;
/*     */     
/*  74 */     for (int m = -1; m <= 1; m++) {
/*  75 */       for (int n = -1; n <= 1; n++) {
/*  76 */         int i1 = paramahl.a(paramInt1 + n, paramInt3 + m).b(paramInt1 + n, paramInt2, paramInt3 + m);
/*     */         
/*  78 */         i += ((i1 & 0xFF0000) >> 16);
/*  79 */         j += ((i1 & 0xFF00) >> 8);
/*  80 */         k += (i1 & 0xFF);
/*     */       }
/*     */     }
/*     */     
/*  84 */     return (i / 9 & 0xFF) << 16 | (j / 9 & 0xFF) << 8 | k / 9 & 0xFF;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  89 */     if (paramahb.E) { return;
/*     */     }
/*  91 */     if ((paramahb.k(paramInt1, paramInt2 + 1, paramInt3) < 4) && (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).k() > 2)) {
/*  92 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.d);
/*     */     }
/*  94 */     else if (paramahb.k(paramInt1, paramInt2 + 1, paramInt3) >= 9) {
/*  95 */       for (int i = 0; i < 4; i++) {
/*  96 */         int j = paramInt1 + paramRandom.nextInt(3) - 1;
/*  97 */         int k = paramInt2 + paramRandom.nextInt(5) - 3;
/*  98 */         int m = paramInt3 + paramRandom.nextInt(3) - 1;
/*  99 */         aji localaji = paramahb.a(j, k + 1, m);
/* 100 */         if ((paramahb.a(j, k, m) == ajn.d) && (paramahb.e(j, k, m) == 0) && (paramahb.k(j, k + 1, m) >= 4) && (localaji.k() <= 2)) {
/* 101 */           paramahb.b(j, k, m, ajn.c);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 110 */     return ajn.d.a(0, paramRandom, paramInt2);
/*     */   }
/*     */   
/*     */   public static rf e() {
/* 114 */     return ajn.c.N;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 119 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3) {
/*     */     label304:
/* 129 */     for (int i = 0; i < 128; i++) {
/* 130 */       int j = paramInt1;
/* 131 */       int k = paramInt2 + 1;
/* 132 */       int m = paramInt3;
/* 133 */       for (int n = 0; n < i / 16; n++) {
/* 134 */         j += paramRandom.nextInt(3) - 1;
/* 135 */         k += (paramRandom.nextInt(3) - 1) * paramRandom.nextInt(3) / 2;
/* 136 */         m += paramRandom.nextInt(3) - 1;
/* 137 */         if ((paramahb.a(j, k - 1, m) != ajn.c) || (paramahb.a(j, k, m).r())) {
/*     */           break label304;
/*     */         }
/*     */       }
/*     */       
/* 142 */       if (paramahb.a(j, k, m).J == awt.a) {
/* 143 */         if (paramRandom.nextInt(8) != 0) {
/* 144 */           if (ajn.H.j(paramahb, j, k, m)) paramahb.d(j, k, m, ajn.H, 1, 3);
/*     */         } else {
/* 146 */           String str = paramahb.a(j, m).a(paramRandom, j, k, m);
/* 147 */           a.debug("Flower in " + paramahb.a(j, m).af + ": " + str);
/* 148 */           alc localalc = alc.e(str);
/* 149 */           if ((localalc != null) && (localalc.j(paramahb, j, k, m))) {
/* 150 */             int i1 = alc.f(str);
/* 151 */             paramahb.d(j, k, m, localalc, i1, 3);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */