/*     */ import java.util.List;
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
/*     */ public class ajq
/*     */   extends ajc
/*     */ {
/*  20 */   private Random a = new Random();
/*     */   private rf b;
/*     */   
/*     */   public ajq() {
/*  24 */     super(awt.f);
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  29 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  34 */     return 25;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  39 */     return new aov();
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  44 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  49 */     a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
/*  50 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*  51 */     g();
/*  52 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  57 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  62 */     if (paramahb.E) {
/*  63 */       return true;
/*     */     }
/*  65 */     aov localaov = (aov)paramahb.o(paramInt1, paramInt2, paramInt3);
/*  66 */     if (localaov != null) { paramyz.a(localaov);
/*     */     }
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  73 */     if (paramadd.u()) {
/*  74 */       ((aov)paramahb.o(paramInt1, paramInt2, paramInt3)).a(paramadd.s());
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  80 */     double d1 = paramInt1 + 0.4F + paramRandom.nextFloat() * 0.2F;
/*  81 */     double d2 = paramInt2 + 0.7F + paramRandom.nextFloat() * 0.3F;
/*  82 */     double d3 = paramInt3 + 0.4F + paramRandom.nextFloat() * 0.2F;
/*     */     
/*  84 */     paramahb.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*     */   {
/*  89 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*  90 */     if ((localaor instanceof aov)) {
/*  91 */       aov localaov = (aov)localaor;
/*  92 */       for (int i = 0; i < localaov.a(); i++) {
/*  93 */         add localadd = localaov.a(i);
/*  94 */         if (localadd != null) {
/*  95 */           float f1 = this.a.nextFloat() * 0.8F + 0.1F;
/*  96 */           float f2 = this.a.nextFloat() * 0.8F + 0.1F;
/*  97 */           float f3 = this.a.nextFloat() * 0.8F + 0.1F;
/*     */           
/*  99 */           while (localadd.b > 0) {
/* 100 */             int j = this.a.nextInt(21) + 10;
/* 101 */             if (j > localadd.b) j = localadd.b;
/* 102 */             localadd.b -= j;
/*     */             
/* 104 */             xk localxk = new xk(paramahb, paramInt1 + f1, paramInt2 + f2, paramInt3 + f3, new add(localadd.b(), j, localadd.k()));
/* 105 */             float f4 = 0.05F;
/* 106 */             localxk.v = ((float)this.a.nextGaussian() * f4);
/* 107 */             localxk.w = ((float)this.a.nextGaussian() * f4 + 0.2F);
/* 108 */             localxk.x = ((float)this.a.nextGaussian() * f4);
/* 109 */             paramahb.d(localxk);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 114 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 119 */     return ade.bt;
/*     */   }
/*     */   
/*     */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 124 */     return ade.bt;
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 129 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 134 */     return zs.b((rb)paramahb.o(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 139 */     super.a(paramrg);
/* 140 */     this.b = paramrg.a(N() + "_base");
/*     */   }
/*     */   
/*     */   public rf e() {
/* 144 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */