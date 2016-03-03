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
/*     */ public class amx
/*     */   extends aji
/*     */ {
/*  19 */   public static final String[] a = { "default", "chiseled", "lines" };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  27 */   private static final String[] b = { "side", "chiseled", "lines", null, null };
/*     */   
/*     */   private rf[] M;
/*     */   
/*     */   private rf N;
/*     */   private rf O;
/*     */   private rf P;
/*     */   private rf Q;
/*     */   
/*     */   public amx()
/*     */   {
/*  38 */     super(awt.e);
/*  39 */     a(abt.b);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  44 */     if ((paramInt2 == 2) || (paramInt2 == 3) || (paramInt2 == 4)) {
/*  45 */       if ((paramInt2 == 2) && ((paramInt1 == 1) || (paramInt1 == 0)))
/*  46 */         return this.O;
/*  47 */       if ((paramInt2 == 3) && ((paramInt1 == 5) || (paramInt1 == 4)))
/*  48 */         return this.O;
/*  49 */       if ((paramInt2 == 4) && ((paramInt1 == 2) || (paramInt1 == 3))) {
/*  50 */         return this.O;
/*     */       }
/*     */       
/*  53 */       return this.M[paramInt2];
/*     */     }
/*     */     
/*  56 */     if ((paramInt1 == 1) || ((paramInt1 == 0) && (paramInt2 == 1))) {
/*  57 */       if (paramInt2 == 1) {
/*  58 */         return this.N;
/*     */       }
/*  60 */       return this.P;
/*     */     }
/*  62 */     if (paramInt1 == 0) {
/*  63 */       return this.Q;
/*     */     }
/*  65 */     if ((paramInt2 < 0) || (paramInt2 >= this.M.length)) paramInt2 = 0;
/*  66 */     return this.M[paramInt2];
/*     */   }
/*     */   
/*     */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*     */   {
/*  71 */     if (paramInt5 == 2) {
/*  72 */       switch (paramInt4) {
/*     */       case 2: 
/*     */       case 3: 
/*  75 */         paramInt5 = 4;
/*  76 */         break;
/*     */       case 4: 
/*     */       case 5: 
/*  79 */         paramInt5 = 3;
/*  80 */         break;
/*     */       case 0: 
/*     */       case 1: 
/*  83 */         paramInt5 = 2;
/*     */       }
/*     */       
/*     */     }
/*     */     
/*  88 */     return paramInt5;
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  93 */     if ((paramInt == 3) || (paramInt == 4)) { return 2;
/*     */     }
/*  95 */     return paramInt;
/*     */   }
/*     */   
/*     */   protected add j(int paramInt)
/*     */   {
/* 100 */     if ((paramInt == 3) || (paramInt == 4)) return new add(adb.a(this), 1, 2);
/* 101 */     return super.j(paramInt);
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/* 106 */     return 39;
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 111 */     paramList.add(new add(paramadb, 1, 0));
/* 112 */     paramList.add(new add(paramadb, 1, 1));
/* 113 */     paramList.add(new add(paramadb, 1, 2));
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 118 */     this.M = new rf[b.length];
/*     */     
/* 120 */     for (int i = 0; i < this.M.length; i++) {
/* 121 */       if (b[i] == null) {
/* 122 */         this.M[i] = this.M[(i - 1)];
/*     */       } else {
/* 124 */         this.M[i] = paramrg.a(N() + "_" + b[i]);
/*     */       }
/*     */     }
/*     */     
/* 128 */     this.P = paramrg.a(N() + "_" + "top");
/* 129 */     this.N = paramrg.a(N() + "_" + "chiseled_top");
/* 130 */     this.O = paramrg.a(N() + "_" + "lines_top");
/* 131 */     this.Q = paramrg.a(N() + "_" + "bottom");
/*     */   }
/*     */   
/*     */   public awv f(int paramInt)
/*     */   {
/* 136 */     return awv.p;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */