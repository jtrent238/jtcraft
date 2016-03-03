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
/*     */ public class ank
/*     */   extends ajc
/*     */ {
/*     */   private Class a;
/*     */   private boolean b;
/*     */   
/*     */   protected ank(Class paramClass, boolean paramBoolean)
/*     */   {
/*  19 */     super(awt.d);
/*  20 */     this.b = paramBoolean;
/*  21 */     this.a = paramClass;
/*  22 */     float f1 = 0.25F;
/*  23 */     float f2 = 1.0F;
/*  24 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  29 */     return ajn.f.h(paramInt1);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  34 */     return null;
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  39 */     a(paramahb, paramInt1, paramInt2, paramInt3);
/*  40 */     return super.g(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  45 */     if (this.b) { return;
/*     */     }
/*  47 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  49 */     float f1 = 0.28125F;
/*  50 */     float f2 = 0.78125F;
/*  51 */     float f3 = 0.0F;
/*  52 */     float f4 = 1.0F;
/*     */     
/*  54 */     float f5 = 0.125F;
/*     */     
/*  56 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  57 */     if (i == 2) a(f3, f1, 1.0F - f5, f4, f2, 1.0F);
/*  58 */     if (i == 3) a(f3, f1, 0.0F, f4, f2, f5);
/*  59 */     if (i == 4) a(1.0F - f5, f1, f3, 1.0F, f2, f4);
/*  60 */     if (i == 5) a(0.0F, f1, f3, f5, f2, f4);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  65 */     return -1;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  70 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  75 */     return true;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  80 */     return false;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*     */     try {
/*  86 */       return (aor)this.a.newInstance();
/*     */     } catch (Exception localException) {
/*  88 */       throw new RuntimeException(localException);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  94 */     return ade.ap;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  99 */     int i = 0;
/*     */     
/* 101 */     if (this.b) {
/* 102 */       if (!paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o().a()) i = 1;
/*     */     } else {
/* 104 */       int j = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 105 */       i = 1;
/* 106 */       if ((j == 2) && (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).o().a())) i = 0;
/* 107 */       if ((j == 3) && (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).o().a())) i = 0;
/* 108 */       if ((j == 4) && (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).o().a())) i = 0;
/* 109 */       if ((j == 5) && (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).o().a())) i = 0;
/*     */     }
/* 111 */     if (i != 0) {
/* 112 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 113 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/* 116 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 121 */     return ade.ap;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ank.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */