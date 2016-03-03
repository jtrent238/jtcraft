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
/*     */ public class aky
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   
/*     */   protected aky()
/*     */   {
/*  21 */     super(awt.c);
/*  22 */     a(true);
/*  23 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/*  24 */     g(255);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  29 */     return azt.a(paramInt1 + 0, paramInt2 + 0, paramInt3 + 0, paramInt1 + 1, paramInt2 + 1, paramInt3 + 1);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  34 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  39 */     return false;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  44 */     if (paramInt1 == 1) {
/*  45 */       if (paramInt2 > 0) {
/*  46 */         return this.a;
/*     */       }
/*  48 */       return this.b;
/*     */     }
/*     */     
/*  51 */     return ajn.d.h(paramInt1);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  56 */     if ((m(paramahb, paramInt1, paramInt2, paramInt3)) || (paramahb.y(paramInt1, paramInt2 + 1, paramInt3))) {
/*  57 */       paramahb.a(paramInt1, paramInt2, paramInt3, 7, 2);
/*     */     } else {
/*  59 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  60 */       if (i > 0) {
/*  61 */         paramahb.a(paramInt1, paramInt2, paramInt3, i - 1, 2);
/*     */       }
/*  63 */       else if (!e(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  64 */         paramahb.b(paramInt1, paramInt2, paramInt3, ajn.d);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa, float paramFloat)
/*     */   {
/*  72 */     if ((!paramahb.E) && (paramahb.s.nextFloat() < paramFloat - 0.5F)) {
/*  73 */       if ((!(paramsa instanceof yz)) && (!paramahb.O().b("mobGriefing"))) {
/*  74 */         return;
/*     */       }
/*  76 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.d);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  81 */     int i = 0;
/*  82 */     for (int j = paramInt1 - i; j <= paramInt1 + i; j++) {
/*  83 */       for (int k = paramInt3 - i; k <= paramInt3 + i; k++) {
/*  84 */         aji localaji = paramahb.a(j, paramInt2 + 1, k);
/*  85 */         if ((localaji == ajn.aj) || (localaji == ajn.bc) || (localaji == ajn.bb) || (localaji == ajn.bN) || (localaji == ajn.bM))
/*  86 */           return true;
/*     */       }
/*     */     }
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   private boolean m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  93 */     for (int i = paramInt1 - 4; i <= paramInt1 + 4; i++) {
/*  94 */       for (int j = paramInt2; j <= paramInt2 + 1; j++) {
/*  95 */         for (int k = paramInt3 - 4; k <= paramInt3 + 4; k++)
/*  96 */           if (paramahb.a(i, j, k).o() == awt.h)
/*  97 */             return true;
/*     */       }
/*     */     }
/* 100 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 105 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/* 106 */     awt localawt = paramahb.a(paramInt1, paramInt2 + 1, paramInt3).o();
/* 107 */     if (localawt.a()) {
/* 108 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.d);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 118 */     return ajn.d.a(0, paramRandom, paramInt2);
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 123 */     return adb.a(ajn.d);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 128 */     this.a = paramrg.a(N() + "_wet");
/* 129 */     this.b = paramrg.a(N() + "_dry");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */