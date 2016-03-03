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
/*     */ public class aki
/*     */   extends aje
/*     */ {
/*     */   private rf[] b;
/*     */   
/*     */   public aki()
/*     */   {
/*  23 */     super(true);
/*     */     
/*  25 */     a(true);
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb)
/*     */   {
/*  30 */     return 20;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/*  35 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/*  40 */     if (paramahb.E) {
/*  41 */       return;
/*     */     }
/*     */     
/*  44 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  45 */     if ((i & 0x8) != 0) {
/*  46 */       return;
/*     */     }
/*     */     
/*  49 */     a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  54 */     if (paramahb.E) { return;
/*     */     }
/*  56 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  57 */     if ((i & 0x8) == 0) {
/*  58 */       return;
/*     */     }
/*     */     
/*  61 */     a(paramahb, paramInt1, paramInt2, paramInt3, i);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  66 */     return (paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) != 0 ? 15 : 0;
/*     */   }
/*     */   
/*     */   public int c(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  71 */     if ((paramahl.e(paramInt1, paramInt2, paramInt3) & 0x8) == 0) return 0;
/*  72 */     return paramInt4 == 1 ? 15 : 0;
/*     */   }
/*     */   
/*     */   private void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  76 */     int i = (paramInt4 & 0x8) != 0 ? 1 : 0;
/*  77 */     int j = 0;
/*     */     
/*  79 */     float f = 0.125F;
/*  80 */     List localList = paramahb.a(xl.class, azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 1 - f, paramInt3 + 1 - f));
/*  81 */     if (!localList.isEmpty()) {
/*  82 */       j = 1;
/*     */     }
/*     */     
/*  85 */     if ((j != 0) && (i == 0)) {
/*  86 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt4 | 0x8, 3);
/*  87 */       paramahb.d(paramInt1, paramInt2, paramInt3, this);
/*  88 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*  89 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/*  92 */     if ((j == 0) && (i != 0)) {
/*  93 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt4 & 0x7, 3);
/*  94 */       paramahb.d(paramInt1, paramInt2, paramInt3, this);
/*  95 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/*  96 */       paramahb.c(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */     
/*  99 */     if (j != 0) {
/* 100 */       paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*     */     }
/*     */     
/* 103 */     paramahb.f(paramInt1, paramInt2, paramInt3, this);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 108 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/* 109 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/* 114 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 119 */     if ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x8) > 0) {
/* 120 */       float f = 0.125F;
/* 121 */       List localList1 = paramahb.a(xn.class, azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 1 - f, paramInt3 + 1 - f));
/*     */       
/* 123 */       if (localList1.size() > 0) {
/* 124 */         return ((xn)localList1.get(0)).e().g();
/*     */       }
/*     */       
/* 127 */       List localList2 = paramahb.a(xl.class, azt.a(paramInt1 + f, paramInt2, paramInt3 + f, paramInt1 + 1 - f, paramInt2 + 1 - f, paramInt3 + 1 - f), sj.c);
/*     */       
/* 129 */       if (localList2.size() > 0) {
/* 130 */         return zs.b((rb)localList2.get(0));
/*     */       }
/*     */     }
/*     */     
/* 134 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 139 */     this.b = new rf[2];
/* 140 */     this.b[0] = paramrg.a(N());
/* 141 */     this.b[1] = paramrg.a(N() + "_powered");
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/* 146 */     if ((paramInt2 & 0x8) != 0) {
/* 147 */       return this.b[1];
/*     */     }
/* 149 */     return this.b[0];
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */