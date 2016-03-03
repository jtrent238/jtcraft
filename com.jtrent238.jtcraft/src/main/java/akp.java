/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akp
/*     */   extends aji
/*     */ {
/*     */   public akp()
/*     */   {
/*  13 */     super(awt.D);
/*     */     
/*  15 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  20 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  25 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  30 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  34 */     if ((akx.e(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (paramInt2 >= 0)) {
/*  35 */       int i = 32;
/*  36 */       if ((akx.M) || (!paramahb.b(paramInt1 - i, paramInt2 - i, paramInt3 - i, paramInt1 + i, paramInt2 + i, paramInt3 + i))) {
/*  37 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*  38 */         while ((akx.e(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (paramInt2 > 0))
/*  39 */           paramInt2--;
/*  40 */         if (paramInt2 > 0) {
/*  41 */           paramahb.d(paramInt1, paramInt2, paramInt3, this, 0, 2);
/*     */         }
/*     */       } else {
/*  44 */         xj localxj = new xj(paramahb, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this);
/*  45 */         paramahb.d(localxj);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  52 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*  53 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*     */   {
/*  59 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  63 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != this) { return;
/*     */     }
/*  65 */     for (int i = 0; i < 1000; i++) {
/*  66 */       int j = paramInt1 + paramahb.s.nextInt(16) - paramahb.s.nextInt(16);
/*  67 */       int k = paramInt2 + paramahb.s.nextInt(8) - paramahb.s.nextInt(8);
/*  68 */       int m = paramInt3 + paramahb.s.nextInt(16) - paramahb.s.nextInt(16);
/*  69 */       if (paramahb.a(j, k, m).J == awt.a) {
/*  70 */         if (!paramahb.E) {
/*  71 */           paramahb.d(j, k, m, this, paramahb.e(paramInt1, paramInt2, paramInt3), 2);
/*  72 */           paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */         } else {
/*  74 */           int n = 128;
/*  75 */           for (int i1 = 0; i1 < n; i1++) {
/*  76 */             double d1 = paramahb.s.nextDouble();
/*  77 */             float f1 = (paramahb.s.nextFloat() - 0.5F) * 0.2F;
/*  78 */             float f2 = (paramahb.s.nextFloat() - 0.5F) * 0.2F;
/*  79 */             float f3 = (paramahb.s.nextFloat() - 0.5F) * 0.2F;
/*     */             
/*  81 */             double d2 = j + (paramInt1 - j) * d1 + (paramahb.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  82 */             double d3 = k + (paramInt2 - k) * d1 + paramahb.s.nextDouble() * 1.0D - 0.5D;
/*  83 */             double d4 = m + (paramInt3 - m) * d1 + (paramahb.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  84 */             paramahb.a("portal", d2, d3, d4, f1, f2, f3);
/*     */           }
/*     */         }
/*  87 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  94 */     return 5;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/* 103 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 108 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 113 */     return true;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 118 */     return 27;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 123 */     return adb.d(0);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */