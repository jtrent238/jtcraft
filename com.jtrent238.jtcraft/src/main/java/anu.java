/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anu
/*     */   extends ajr
/*     */   implements ajo
/*     */ {
/*     */   private final aji a;
/*     */   private rf b;
/*     */   
/*     */   protected anu(aji paramaji)
/*     */   {
/*  16 */     this.a = paramaji;
/*     */     
/*  18 */     a(true);
/*  19 */     float f = 0.125F;
/*  20 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  21 */     a(null);
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
/*  34 */       float f = n(paramahb, paramInt1, paramInt2, paramInt3);
/*     */       
/*  36 */       if (paramRandom.nextInt((int)(25.0F / f) + 1) == 0) {
/*  37 */         int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  38 */         if (i < 7) {
/*  39 */           i++;
/*  40 */           paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */         } else {
/*  42 */           if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this.a) return;
/*  43 */           if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this.a) return;
/*  44 */           if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == this.a) return;
/*  45 */           if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == this.a) { return;
/*     */           }
/*  47 */           int j = paramRandom.nextInt(4);
/*  48 */           int k = paramInt1;
/*  49 */           int m = paramInt3;
/*  50 */           if (j == 0) k--;
/*  51 */           if (j == 1) k++;
/*  52 */           if (j == 2) m--;
/*  53 */           if (j == 3) m++;
/*  54 */           aji localaji = paramahb.a(k, paramInt2 - 1, m);
/*  55 */           if ((paramahb.a(k, paramInt2, m).J == awt.a) && ((localaji == ajn.ak) || (localaji == ajn.d) || (localaji == ajn.c))) {
/*  56 */             paramahb.b(k, paramInt2, m, this.a);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  65 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3) + qh.a(paramahb.s, 2, 5);
/*  66 */     if (i > 7) i = 7;
/*  67 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   private float n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  71 */     float f1 = 1.0F;
/*     */     
/*  73 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3 - 1);
/*  74 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3 + 1);
/*  75 */     aji localaji3 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3);
/*  76 */     aji localaji4 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3);
/*     */     
/*  78 */     aji localaji5 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3 - 1);
/*  79 */     aji localaji6 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3 - 1);
/*  80 */     aji localaji7 = paramahb.a(paramInt1 + 1, paramInt2, paramInt3 + 1);
/*  81 */     aji localaji8 = paramahb.a(paramInt1 - 1, paramInt2, paramInt3 + 1);
/*     */     
/*  83 */     int i = (localaji3 == this) || (localaji4 == this) ? 1 : 0;
/*  84 */     int j = (localaji1 == this) || (localaji2 == this) ? 1 : 0;
/*  85 */     int k = (localaji5 == this) || (localaji6 == this) || (localaji7 == this) || (localaji8 == this) ? 1 : 0;
/*     */     
/*  87 */     for (int m = paramInt1 - 1; m <= paramInt1 + 1; m++) {
/*  88 */       for (int n = paramInt3 - 1; n <= paramInt3 + 1; n++) {
/*  89 */         aji localaji9 = paramahb.a(m, paramInt2 - 1, n);
/*     */         
/*  91 */         float f2 = 0.0F;
/*  92 */         if (localaji9 == ajn.ak) {
/*  93 */           f2 = 1.0F;
/*  94 */           if (paramahb.e(m, paramInt2 - 1, n) > 0) { f2 = 3.0F;
/*     */           }
/*     */         }
/*  97 */         if ((m != paramInt1) || (n != paramInt3)) { f2 /= 4.0F;
/*     */         }
/*  99 */         f1 += f2;
/*     */       }
/*     */     }
/* 102 */     if ((k != 0) || ((i != 0) && (j != 0))) { f1 /= 2.0F;
/*     */     }
/* 104 */     return f1;
/*     */   }
/*     */   
/*     */   public int i(int paramInt)
/*     */   {
/* 109 */     int i = paramInt * 32;
/* 110 */     int j = 255 - paramInt * 8;
/* 111 */     int k = paramInt * 4;
/* 112 */     return i << 16 | j << 8 | k;
/*     */   }
/*     */   
/*     */   public int d(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 117 */     return i(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/* 122 */     float f = 0.125F;
/* 123 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 128 */     this.F = ((paramahl.e(paramInt1, paramInt2, paramInt3) * 2 + 2) / 16.0F);
/* 129 */     float f = 0.125F;
/* 130 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)this.F, 0.5F + f);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 135 */     return 19;
/*     */   }
/*     */   
/*     */   public int e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3) {
/* 139 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 140 */     if (i < 7) return -1;
/* 141 */     if (paramahl.a(paramInt1 - 1, paramInt2, paramInt3) == this.a) return 0;
/* 142 */     if (paramahl.a(paramInt1 + 1, paramInt2, paramInt3) == this.a) return 1;
/* 143 */     if (paramahl.a(paramInt1, paramInt2, paramInt3 - 1) == this.a) return 2;
/* 144 */     if (paramahl.a(paramInt1, paramInt2, paramInt3 + 1) == this.a) return 3;
/* 145 */     return -1;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*     */   {
/* 154 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
/*     */     
/* 156 */     if (paramahb.E) {
/* 157 */       return;
/*     */     }
/*     */     
/* 160 */     adb localadb = null;
/* 161 */     if (this.a == ajn.aK) localadb = ade.bb;
/* 162 */     if (this.a == ajn.ba) localadb = ade.bc;
/* 163 */     for (int i = 0; i < 3; i++) {
/* 164 */       if (paramahb.s.nextInt(15) <= paramInt4) {
/* 165 */         a(paramahb, paramInt1, paramInt2, paramInt3, new add(localadb));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2) {
/* 171 */     return null;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 176 */     return 1;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 181 */     if (this.a == ajn.aK)
/* 182 */       return ade.bb;
/* 183 */     if (this.a == ajn.ba) {
/* 184 */       return ade.bc;
/*     */     }
/*     */     
/* 187 */     return adb.d(0);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 192 */     this.L = paramrg.a(N() + "_disconnected");
/* 193 */     this.b = paramrg.a(N() + "_connected");
/*     */   }
/*     */   
/*     */   public rf i() {
/* 197 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 202 */     if (paramahb.e(paramInt1, paramInt2, paramInt3) == 7) {
/* 203 */       return false;
/*     */     }
/* 205 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 210 */     return true;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 215 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */