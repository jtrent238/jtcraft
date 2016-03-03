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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class akv
/*     */   extends ajc
/*     */ {
/*     */   protected akv()
/*     */   {
/*  29 */     super(awt.e);
/*  30 */     a(abt.c);
/*     */     
/*  32 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
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
/*  47 */     return 22;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  52 */     return adb.a(ajn.Z);
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/*  57 */     return 8;
/*     */   }
/*     */   
/*     */   protected boolean E()
/*     */   {
/*  62 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  68 */     int i = 0;
/*  69 */     int j = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/*     */     
/*  71 */     if (j == 0) i = 2;
/*  72 */     if (j == 1) i = 5;
/*  73 */     if (j == 2) i = 3;
/*  74 */     if (j == 3) { i = 4;
/*     */     }
/*  76 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  81 */     aav localaav = paramyz.bS();
/*  82 */     ape localape = (ape)paramahb.o(paramInt1, paramInt2, paramInt3);
/*  83 */     if ((localaav == null) || (localape == null)) { return true;
/*     */     }
/*  85 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3).r()) { return true;
/*     */     }
/*  87 */     if (paramahb.E) {
/*  88 */       return true;
/*     */     }
/*     */     
/*  91 */     localaav.a(localape);
/*  92 */     paramyz.a(localaav);
/*     */     
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  99 */     return new ape();
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 104 */     for (int i = 0; i < 3; i++) {
/* 105 */       double d1 = paramInt1 + paramRandom.nextFloat();
/* 106 */       double d2 = paramInt2 + paramRandom.nextFloat();
/* 107 */       double d3 = paramInt3 + paramRandom.nextFloat();
/* 108 */       double d4 = 0.0D;
/* 109 */       double d5 = 0.0D;
/* 110 */       double d6 = 0.0D;
/* 111 */       int j = paramRandom.nextInt(2) * 2 - 1;
/* 112 */       int k = paramRandom.nextInt(2) * 2 - 1;
/* 113 */       d4 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
/* 114 */       d5 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
/* 115 */       d6 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
/* 116 */       d3 = paramInt3 + 0.5D + 0.25D * k;
/* 117 */       d6 = paramRandom.nextFloat() * 1.0F * k;
/* 118 */       d1 = paramInt1 + 0.5D + 0.25D * j;
/* 119 */       d4 = paramRandom.nextFloat() * 1.0F * j;
/*     */       
/* 121 */       paramahb.a("portal", d1, d2, d3, d4, d5, d6);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/* 129 */     this.L = paramrg.a("obsidian");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */