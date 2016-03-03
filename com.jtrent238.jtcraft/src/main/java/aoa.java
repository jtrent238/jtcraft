/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aoa
/*     */   extends aji
/*     */ {
/*     */   private final String a;
/*     */   private final boolean b;
/*     */   private final String M;
/*     */   private rf N;
/*     */   
/*     */   protected aoa(String paramString1, String paramString2, awt paramawt, boolean paramBoolean)
/*     */   {
/*  20 */     super(paramawt);
/*  21 */     this.a = paramString2;
/*  22 */     this.b = paramBoolean;
/*  23 */     this.M = paramString1;
/*  24 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  29 */     if (!this.b) {
/*  30 */       return null;
/*     */     }
/*  32 */     return super.a(paramInt1, paramRandom, paramInt2);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  37 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  42 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  47 */     return this.J == awt.s ? 41 : 18;
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  52 */     if (paramahl.a(paramInt1, paramInt2, paramInt3) == this) return false;
/*  53 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  58 */     boolean bool1 = a(paramahb.a(paramInt1, paramInt2, paramInt3 - 1));
/*  59 */     boolean bool2 = a(paramahb.a(paramInt1, paramInt2, paramInt3 + 1));
/*  60 */     boolean bool3 = a(paramahb.a(paramInt1 - 1, paramInt2, paramInt3));
/*  61 */     boolean bool4 = a(paramahb.a(paramInt1 + 1, paramInt2, paramInt3));
/*     */     
/*  63 */     if (((bool3) && (bool4)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2))) {
/*  64 */       a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  65 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  66 */     } else if ((bool3) && (!bool4)) {
/*  67 */       a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
/*  68 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  69 */     } else if ((!bool3) && (bool4)) {
/*  70 */       a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
/*  71 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*  73 */     if (((bool1) && (bool2)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2))) {
/*  74 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
/*  75 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  76 */     } else if ((bool1) && (!bool2)) {
/*  77 */       a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
/*  78 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  79 */     } else if ((!bool1) && (bool2)) {
/*  80 */       a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
/*  81 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  87 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  92 */     float f1 = 0.4375F;
/*  93 */     float f2 = 0.5625F;
/*  94 */     float f3 = 0.4375F;
/*  95 */     float f4 = 0.5625F;
/*     */     
/*  97 */     boolean bool1 = a(paramahl.a(paramInt1, paramInt2, paramInt3 - 1));
/*  98 */     boolean bool2 = a(paramahl.a(paramInt1, paramInt2, paramInt3 + 1));
/*  99 */     boolean bool3 = a(paramahl.a(paramInt1 - 1, paramInt2, paramInt3));
/* 100 */     boolean bool4 = a(paramahl.a(paramInt1 + 1, paramInt2, paramInt3));
/*     */     
/* 102 */     if (((bool3) && (bool4)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2))) {
/* 103 */       f1 = 0.0F;
/* 104 */       f2 = 1.0F;
/* 105 */     } else if ((bool3) && (!bool4)) {
/* 106 */       f1 = 0.0F;
/* 107 */     } else if ((!bool3) && (bool4)) {
/* 108 */       f2 = 1.0F;
/*     */     }
/* 110 */     if (((bool1) && (bool2)) || ((!bool3) && (!bool4) && (!bool1) && (!bool2))) {
/* 111 */       f3 = 0.0F;
/* 112 */       f4 = 1.0F;
/* 113 */     } else if ((bool1) && (!bool2)) {
/* 114 */       f3 = 0.0F;
/* 115 */     } else if ((!bool1) && (bool2)) {
/* 116 */       f4 = 1.0F;
/*     */     }
/*     */     
/* 119 */     a(f1, 0.0F, f3, f2, 1.0F, f4);
/*     */   }
/*     */   
/*     */   public rf e() {
/* 123 */     return this.N;
/*     */   }
/*     */   
/*     */   public final boolean a(aji paramaji) {
/* 127 */     return (paramaji.j()) || (paramaji == this) || (paramaji == ajn.w) || (paramaji == ajn.cn) || (paramaji == ajn.co) || ((paramaji instanceof aoa));
/*     */   }
/*     */   
/*     */   protected boolean E()
/*     */   {
/* 132 */     return true;
/*     */   }
/*     */   
/*     */   protected add j(int paramInt)
/*     */   {
/* 137 */     return new add(adb.a(this), 1, paramInt);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 142 */     this.L = paramrg.a(this.M);
/* 143 */     this.N = paramrg.a(this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */