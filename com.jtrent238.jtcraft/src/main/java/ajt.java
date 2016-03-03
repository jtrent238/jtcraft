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
/*     */ public class ajt
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   
/*     */   protected ajt()
/*     */   {
/*  20 */     super(awt.A);
/*  21 */     a(true);
/*  22 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
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
/*  37 */           a(paramahb, paramInt1, paramInt2 + 1, paramInt3, this);
/*     */         } else {
/*  39 */           paramahb.a(paramInt1, paramInt2, paramInt3, j + 1, 4);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     float f = 0.0625F;
/*  48 */     return azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 1 - f, paramInt3 + 1 - f);
/*     */   }
/*     */   
/*     */   public azt g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  53 */     float f = 0.0625F;
/*  54 */     return azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 1, paramInt3 + 1 - f);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  59 */     if (paramInt1 == 1) return this.a;
/*  60 */     if (paramInt1 == 0) return this.b;
/*  61 */     return this.L;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  66 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  71 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  76 */     return 13;
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  81 */     if (!super.c(paramahb, paramInt1, paramInt2, paramInt3)) { return false;
/*     */     }
/*  83 */     return j(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  88 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  89 */       paramahb.a(paramInt1, paramInt2, paramInt3, true);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  95 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3).o().a()) return false;
/*  96 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3).o().a()) return false;
/*  97 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1).o().a()) return false;
/*  98 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1).o().a()) return false;
/*  99 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/* 100 */     return (localaji == ajn.aF) || (localaji == ajn.m);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/* 105 */     paramsa.a(ro.g, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 110 */     this.L = paramrg.a(N() + "_side");
/* 111 */     this.a = paramrg.a(N() + "_top");
/* 112 */     this.b = paramrg.a(N() + "_bottom");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */