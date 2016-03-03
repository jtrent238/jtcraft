/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ane
/*     */   extends aji
/*     */ {
/*     */   protected ane()
/*     */   {
/*  14 */     super(awt.k);
/*  15 */     float f = 0.375F;
/*  16 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/*  17 */     a(true);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  22 */     if ((paramahb.a(paramInt1, paramInt2 - 1, paramInt3) != ajn.aH) && 
/*  23 */       (!e(paramahb, paramInt1, paramInt2, paramInt3))) {
/*  24 */       return;
/*     */     }
/*     */     
/*  27 */     if (paramahb.c(paramInt1, paramInt2 + 1, paramInt3)) {
/*  28 */       int i = 1;
/*  29 */       while (paramahb.a(paramInt1, paramInt2 - i, paramInt3) == this) {
/*  30 */         i++;
/*     */       }
/*  32 */       if (i < 3) {
/*  33 */         int j = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  34 */         if (j == 15) {
/*  35 */           paramahb.b(paramInt1, paramInt2 + 1, paramInt3, this);
/*  36 */           paramahb.a(paramInt1, paramInt2, paramInt3, 0, 4);
/*     */         } else {
/*  38 */           paramahb.a(paramInt1, paramInt2, paramInt3, j + 1, 4);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*  47 */     if (localaji == this) return true;
/*  48 */     if ((localaji != ajn.c) && (localaji != ajn.d) && (localaji != ajn.m)) return false;
/*  49 */     if (paramahb.a(paramInt1 - 1, paramInt2 - 1, paramInt3).o() == awt.h) return true;
/*  50 */     if (paramahb.a(paramInt1 + 1, paramInt2 - 1, paramInt3).o() == awt.h) return true;
/*  51 */     if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 - 1).o() == awt.h) return true;
/*  52 */     if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 + 1).o() == awt.h) return true;
/*  53 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  58 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected final boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  62 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  63 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*  64 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  65 */       return false;
/*     */     }
/*  67 */     return true;
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  72 */     return c(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  77 */     return null;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  82 */     return ade.aE;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  91 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 101 */     return 1;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 106 */     return ade.aE;
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 111 */     return paramahl.a(paramInt1, paramInt3).b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */