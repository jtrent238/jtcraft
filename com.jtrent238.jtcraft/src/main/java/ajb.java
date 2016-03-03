/*     */ import java.util.List;
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
/*     */ public class ajb
/*     */   extends akx
/*     */ {
/*  22 */   public static final String[] a = { "intact", "slightlyDamaged", "veryDamaged" };
/*     */   
/*     */ 
/*     */ 
/*  26 */   private static final String[] N = { "anvil_top_damaged_0", "anvil_top_damaged_1", "anvil_top_damaged_2" };
/*     */   
/*     */   public int b;
/*     */   
/*     */   private rf[] O;
/*     */   
/*     */   protected ajb()
/*     */   {
/*  34 */     super(awt.g);
/*  35 */     g(0);
/*  36 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  41 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  46 */     return false;
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  51 */     if ((this.b == 3) && (paramInt1 == 1)) {
/*  52 */       int i = (paramInt2 >> 2) % this.O.length;
/*  53 */       return this.O[i];
/*     */     }
/*  55 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  60 */     this.L = paramrg.a("anvil_base");
/*  61 */     this.O = new rf[N.length];
/*     */     
/*  63 */     for (int i = 0; i < this.O.length; i++) {
/*  64 */       this.O[i] = paramrg.a(N[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  70 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3;
/*  71 */     int j = paramahb.e(paramInt1, paramInt2, paramInt3) >> 2;
/*     */     
/*  73 */     i++;i %= 4;
/*  74 */     if (i == 0) paramahb.a(paramInt1, paramInt2, paramInt3, 0x2 | j << 2, 2);
/*  75 */     if (i == 1) paramahb.a(paramInt1, paramInt2, paramInt3, 0x3 | j << 2, 2);
/*  76 */     if (i == 2) paramahb.a(paramInt1, paramInt2, paramInt3, 0x0 | j << 2, 2);
/*  77 */     if (i == 3) paramahb.a(paramInt1, paramInt2, paramInt3, 0x1 | j << 2, 2);
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  82 */     if (paramahb.E) {
/*  83 */       return true;
/*     */     }
/*  85 */     paramyz.c(paramInt1, paramInt2, paramInt3);
/*  86 */     return true;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  91 */     return 35;
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  96 */     return paramInt >> 2;
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 101 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3) & 0x3;
/*     */     
/* 103 */     if ((i == 3) || (i == 1)) {
/* 104 */       a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
/*     */     } else {
/* 106 */       a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 112 */     paramList.add(new add(paramadb, 1, 0));
/* 113 */     paramList.add(new add(paramadb, 1, 1));
/* 114 */     paramList.add(new add(paramadb, 1, 2));
/*     */   }
/*     */   
/*     */   protected void a(xj paramxj)
/*     */   {
/* 119 */     paramxj.a(true);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 124 */     paramahb.c(1022, paramInt1, paramInt2, paramInt3, 0);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 129 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */