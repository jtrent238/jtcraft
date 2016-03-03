/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class amf
/*     */   extends ajr
/*     */ {
/*     */   private rf[] a;
/*     */   
/*     */   protected amf()
/*     */   {
/*  16 */     a(true);
/*  17 */     float f = 0.5F;
/*  18 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  19 */     a(null);
/*     */   }
/*     */   
/*     */   protected boolean a(aji paramaji)
/*     */   {
/*  24 */     return paramaji == ajn.aM;
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  29 */     return a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3));
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  35 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  36 */     if (i < 3)
/*     */     {
/*  38 */       if (paramRandom.nextInt(10) == 0) {
/*  39 */         i++;
/*  40 */         paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */       }
/*     */     }
/*     */     
/*  44 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  55 */     if (paramInt2 >= 3) {
/*  56 */       return this.a[2];
/*     */     }
/*  58 */     if (paramInt2 > 0) {
/*  59 */       return this.a[1];
/*     */     }
/*  61 */     return this.a[0];
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  66 */     return 6;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/*  75 */     if (paramahb.E) {
/*  76 */       return;
/*     */     }
/*  78 */     int i = 1;
/*  79 */     if (paramInt4 >= 3) {
/*  80 */       i = 2 + paramahb.s.nextInt(3);
/*  81 */       if (paramInt5 > 0) {
/*  82 */         i += paramahb.s.nextInt(paramInt5 + 1);
/*     */       }
/*     */     }
/*  85 */     for (int j = 0; j < i; j++) {
/*  86 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.bm));
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  92 */     return null;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  97 */     return 0;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 102 */     return ade.bm;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 107 */     this.a = new rf[3];
/*     */     
/* 109 */     for (int i = 0; i < this.a.length; i++) {
/* 110 */       this.a[i] = paramrg.a(N() + "_stage_" + i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */