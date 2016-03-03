/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akf
/*     */   extends ajr
/*     */   implements ajo
/*     */ {
/*     */   private rf[] a;
/*     */   
/*     */   protected akf()
/*     */   {
/*  14 */     a(true);
/*  15 */     float f = 0.5F;
/*  16 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  17 */     a(null);
/*     */     
/*  19 */     c(0.0F);
/*  20 */     a(h);
/*  21 */     H();
/*     */   }
/*     */   
/*     */   protected boolean a(aji paramaji)
/*     */   {
/*  26 */     return paramaji == ajn.ak;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  31 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*  32 */     if (paramahb.k(paramInt1, paramInt2 + 1, paramInt3) >= 9)
/*     */     {
/*  34 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  35 */       if (i < 7) {
/*  36 */         float f = n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */         
/*  38 */         if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0) {
/*  39 */           i++;
/*  40 */           paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  47 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3) + qh.a(paramahb.s, 2, 5);
/*  48 */     if (i > 7) i = 7;
/*  49 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   private float n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  53 */     float f1 = 1.0F;
/*     */     
/*  55 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  56 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  57 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  58 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  60 */     aji localaji5 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  61 */     aji localaji6 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3 - 1);
/*  62 */     aji localaji7 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3 + 1);
/*  63 */     aji localaji8 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3 + 1);
/*     */     
/*  65 */     int i = (localaji3 == this) || (localaji4 == this) ? 1 : 0;
/*  66 */     int j = (localaji1 == this) || (localaji2 == this) ? 1 : 0;
/*  67 */     int k = (localaji5 == this) || (localaji6 == this) || (localaji7 == this) || (localaji8 == this) ? 1 : 0;
/*     */     
/*  69 */     for (int m = paramInt1 - 1; m <= paramInt1 + 1; m++) {
/*  70 */       for (int n = paramInt3 - 1; n <= paramInt3 + 1; n++)
/*     */       {
/*  72 */         float f2 = 0.0F;
/*  73 */         if (paramahb.a(m, paramInt2 - 1, n) == ajn.ak) {
/*  74 */           f2 = 1.0F;
/*  75 */           if (paramahb.e(m, paramInt2 - 1, n) > 0) { f2 = 3.0F;
/*     */           }
/*     */         }
/*  78 */         if ((m != paramInt1) || (n != paramInt3)) { f2 /= 4.0F;
/*     */         }
/*  80 */         f1 += f2;
/*     */       }
/*     */     }
/*  83 */     if ((k != 0) || ((i != 0) && (j != 0))) { f1 /= 2.0F;
/*     */     }
/*  85 */     return f1;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  90 */     if ((paramInt2 < 0) || (paramInt2 > 7)) paramInt2 = 7;
/*  91 */     return this.a[paramInt2];
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  96 */     return 6;
/*     */   }
/*     */   
/*     */   protected adb i() {
/* 100 */     return ade.N;
/*     */   }
/*     */   
/*     */   protected adb P() {
/* 104 */     return ade.O;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 114 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, 0);
/*     */     
/* 116 */     if (paramahb.E) {
/* 117 */       return;
/*     */     }
/* 119 */     if (paramInt4 >= 7)
/*     */     {
/* 121 */       int i = 3 + paramInt5;
/* 122 */       for (int j = 0; j < i; j++) {
/* 123 */         if (paramahb.s.nextInt(15) <= paramInt4) {
/* 124 */           a(paramahb, paramInt1, paramInt2, paramInt3, new add(i(), 1, 0));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2) {
/* 131 */     if (paramInt1 == 7) {
/* 132 */       return P();
/*     */     }
/*     */     
/* 135 */     return i();
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 140 */     return 1;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 145 */     return i();
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 150 */     this.a = new rf[8];
/*     */     
/* 152 */     for (int i = 0; i < this.a.length; i++) {
/* 153 */       this.a[i] = paramrg.a(N() + "_stage_" + i);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 160 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 7) {
/* 161 */       return false;
/*     */     }
/* 163 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 168 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 173 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */