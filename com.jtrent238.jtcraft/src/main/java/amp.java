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
/*     */ public class amp
/*     */   extends alk
/*     */ {
/*  24 */   public static final int[][] a = { new int[0], { 3, 1 }, { 2, 0 } };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public amp()
/*     */   {
/*  31 */     super("portal", awt.E, false);
/*  32 */     a(true);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  37 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */     
/*  39 */     if ((paramahb.t.d()) && (paramahb.O().b("doMobSpawning")) && (paramRandom.nextInt(2000) < paramahb.r.a()))
/*     */     {
/*  41 */       int i = paramInt2;
/*  42 */       while ((!ahb.a(paramahb, paramInt1, i, paramInt3)) && (i > 0)) {
/*  43 */         i--;
/*     */       }
/*  45 */       if ((i > 0) && (!paramahb.a(paramInt1, i + 1, paramInt3).r()))
/*     */       {
/*  47 */         sa localsa = aee.a(paramahb, 57, paramInt1 + 0.5D, i + 1.1D, paramInt3 + 0.5D);
/*  48 */         if (localsa != null) {
/*  49 */           localsa.am = localsa.ai();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  57 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  62 */     int i = b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */     
/*  64 */     if (i == 0) {
/*  65 */       if ((paramahl.a(paramInt1 - 1, paramInt2, paramInt3) == this) || (paramahl.a(paramInt1 + 1, paramInt2, paramInt3) == this)) {
/*  66 */         i = 1;
/*     */       } else {
/*  68 */         i = 2;
/*     */       }
/*     */       
/*  71 */       if (((paramahl instanceof ahb)) && (!((ahb)paramahl).E)) {
/*  72 */         ((ahb)paramahl).a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */       }
/*     */     }
/*     */     
/*  76 */     float f1 = 0.125F;
/*  77 */     float f2 = 0.125F;
/*     */     
/*  79 */     if (i == 1) {
/*  80 */       f1 = 0.5F;
/*     */     }
/*  82 */     if (i == 2) {
/*  83 */       f2 = 0.5F;
/*     */     }
/*     */     
/*  86 */     a(0.5F - f1, 0.0F, 0.5F - f2, 0.5F + f1, 1.0F, 0.5F + f2);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  91 */     return false;
/*     */   }
/*     */   
/*     */   public boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  95 */     amq localamq1 = new amq(paramahb, paramInt1, paramInt2, paramInt3, 1);
/*  96 */     amq localamq2 = new amq(paramahb, paramInt1, paramInt2, paramInt3, 2);
/*     */     
/*  98 */     if ((localamq1.b()) && (amq.a(localamq1) == 0)) {
/*  99 */       localamq1.c();
/* 100 */       return true; }
/* 101 */     if ((localamq2.b()) && (amq.a(localamq2) == 0)) {
/* 102 */       localamq2.c();
/* 103 */       return true;
/*     */     }
/*     */     
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 111 */     int i = b(paramahb.e(paramInt1, paramInt2, paramInt3));
/* 112 */     amq localamq1 = new amq(paramahb, paramInt1, paramInt2, paramInt3, 1);
/* 113 */     amq localamq2 = new amq(paramahb, paramInt1, paramInt2, paramInt3, 2);
/*     */     
/* 115 */     if ((i == 1) && ((!localamq1.b()) || (amq.a(localamq1) < amq.b(localamq1) * amq.c(localamq1)))) {
/* 116 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.a);
/* 117 */     } else if ((i == 2) && ((!localamq2.b()) || (amq.a(localamq2) < amq.b(localamq2) * amq.c(localamq2)))) {
/* 118 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.a);
/* 119 */     } else if ((i == 0) && (!localamq1.b()) && (!localamq2.b())) {
/* 120 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 126 */     int i = 0;
/*     */     
/* 128 */     if (paramahl.a(paramInt1, paramInt2, paramInt3) == this) {
/* 129 */       i = b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */       
/* 131 */       if (i == 0) return false;
/* 132 */       if ((i == 2) && (paramInt4 != 5) && (paramInt4 != 4)) return false;
/* 133 */       if ((i == 1) && (paramInt4 != 3) && (paramInt4 != 2)) { return false;
/*     */       }
/*     */     }
/* 136 */     int j = (paramahl.a(paramInt1 - 1, paramInt2, paramInt3) == this) && (paramahl.a(paramInt1 - 2, paramInt2, paramInt3) != this) ? 1 : 0;
/* 137 */     int k = (paramahl.a(paramInt1 + 1, paramInt2, paramInt3) == this) && (paramahl.a(paramInt1 + 2, paramInt2, paramInt3) != this) ? 1 : 0;
/*     */     
/* 139 */     int m = (paramahl.a(paramInt1, paramInt2, paramInt3 - 1) == this) && (paramahl.a(paramInt1, paramInt2, paramInt3 - 2) != this) ? 1 : 0;
/* 140 */     int n = (paramahl.a(paramInt1, paramInt2, paramInt3 + 1) == this) && (paramahl.a(paramInt1, paramInt2, paramInt3 + 2) != this) ? 1 : 0;
/*     */     
/* 142 */     int i1 = (j != 0) || (k != 0) || (i == 1) ? 1 : 0;
/* 143 */     int i2 = (m != 0) || (n != 0) || (i == 2) ? 1 : 0;
/*     */     
/* 145 */     if ((i1 != 0) && (paramInt4 == 4)) return true;
/* 146 */     if ((i1 != 0) && (paramInt4 == 5)) return true;
/* 147 */     if ((i2 != 0) && (paramInt4 == 2)) return true;
/* 148 */     if ((i2 != 0) && (paramInt4 == 3)) { return true;
/*     */     }
/* 150 */     return false;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 155 */     return 0;
/*     */   }
/*     */   
/*     */   public int w()
/*     */   {
/* 160 */     return 1;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/* 165 */     if ((paramsa.m == null) && (paramsa.l == null)) paramsa.ah();
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 170 */     if (paramRandom.nextInt(100) == 0) {
/* 171 */       paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "portal.portal", 0.5F, paramRandom.nextFloat() * 0.4F + 0.8F, false);
/*     */     }
/* 173 */     for (int i = 0; i < 4; i++) {
/* 174 */       double d1 = paramInt1 + paramRandom.nextFloat();
/* 175 */       double d2 = paramInt2 + paramRandom.nextFloat();
/* 176 */       double d3 = paramInt3 + paramRandom.nextFloat();
/* 177 */       double d4 = 0.0D;
/* 178 */       double d5 = 0.0D;
/* 179 */       double d6 = 0.0D;
/* 180 */       int j = paramRandom.nextInt(2) * 2 - 1;
/* 181 */       d4 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 182 */       d5 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 183 */       d6 = (paramRandom.nextFloat() - 0.5D) * 0.5D;
/* 184 */       if ((paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == this) || (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == this)) {
/* 185 */         d3 = paramInt3 + 0.5D + 0.25D * j;
/* 186 */         d6 = paramRandom.nextFloat() * 2.0F * j;
/*     */       } else {
/* 188 */         d1 = paramInt1 + 0.5D + 0.25D * j;
/* 189 */         d4 = paramRandom.nextFloat() * 2.0F * j;
/*     */       }
/*     */       
/* 192 */       paramahb.a("portal", d1, d2, d3, d4, d5, d6);
/*     */     }
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 198 */     return adb.d(0);
/*     */   }
/*     */   
/*     */   public static int b(int paramInt) {
/* 202 */     return paramInt & 0x3;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */