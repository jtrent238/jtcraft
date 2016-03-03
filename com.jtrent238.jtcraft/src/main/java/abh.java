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
/*     */ public class abh
/*     */   extends adb
/*     */ {
/*     */   protected final aji a;
/*     */   private rf b;
/*     */   
/*     */   public abh(aji paramaji)
/*     */   {
/*  19 */     this.a = paramaji;
/*     */   }
/*     */   
/*     */   public abh b(String paramString)
/*     */   {
/*  24 */     super.c(paramString);
/*  25 */     return this;
/*     */   }
/*     */   
/*     */   public int d()
/*     */   {
/*  30 */     if (this.a.O() != null) {
/*  31 */       return 1;
/*     */     }
/*  33 */     return 0;
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/*  38 */     if (this.b != null) {
/*  39 */       return this.b;
/*     */     }
/*  41 */     return this.a.h(1);
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  46 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  47 */     if ((localaji == ajn.aC) && ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7) < 1)) {
/*  48 */       paramInt4 = 1;
/*  49 */     } else if ((localaji != ajn.bd) && (localaji != ajn.H) && (localaji != ajn.I))
/*     */     {
/*     */ 
/*  52 */       if (paramInt4 == 0) paramInt2--;
/*  53 */       if (paramInt4 == 1) paramInt2++;
/*  54 */       if (paramInt4 == 2) paramInt3--;
/*  55 */       if (paramInt4 == 3) paramInt3++;
/*  56 */       if (paramInt4 == 4) paramInt1--;
/*  57 */       if (paramInt4 == 5) { paramInt1++;
/*     */       }
/*     */     }
/*  60 */     if (paramadd.b == 0) return false;
/*  61 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*     */     }
/*  63 */     if ((paramInt2 == 255) && (this.a.o().a())) { return false;
/*     */     }
/*  65 */     if (paramahb.a(this.a, paramInt1, paramInt2, paramInt3, false, paramInt4, paramyz, paramadd)) {
/*  66 */       int i = a(paramadd.k());
/*  67 */       int j = this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3, i);
/*  68 */       if (paramahb.d(paramInt1, paramInt2, paramInt3, this.a, j, 3))
/*     */       {
/*     */ 
/*     */ 
/*  72 */         if (paramahb.a(paramInt1, paramInt2, paramInt3) == this.a) {
/*  73 */           this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramadd);
/*  74 */           this.a.e(paramahb, paramInt1, paramInt2, paramInt3, j);
/*     */         }
/*  76 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.a.H.b(), (this.a.H.c() + 1.0F) / 2.0F, this.a.H.d() * 0.8F);
/*  77 */         paramadd.b -= 1;
/*     */       }
/*  79 */       return true;
/*     */     }
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz, add paramadd) {
/*  85 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  86 */     if (localaji == ajn.aC) {
/*  87 */       paramInt4 = 1;
/*  88 */     } else if ((localaji != ajn.bd) && (localaji != ajn.H) && (localaji != ajn.I)) {
/*  89 */       if (paramInt4 == 0) paramInt2--;
/*  90 */       if (paramInt4 == 1) paramInt2++;
/*  91 */       if (paramInt4 == 2) paramInt3--;
/*  92 */       if (paramInt4 == 3) paramInt3++;
/*  93 */       if (paramInt4 == 4) paramInt1--;
/*  94 */       if (paramInt4 == 5) { paramInt1++;
/*     */       }
/*     */     }
/*  97 */     return paramahb.a(this.a, paramInt1, paramInt2, paramInt3, false, paramInt4, null, paramadd);
/*     */   }
/*     */   
/*     */   public String a(add paramadd)
/*     */   {
/* 102 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public String a()
/*     */   {
/* 107 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public abt n_()
/*     */   {
/* 112 */     return this.a.J();
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 117 */     this.a.a(paramadb, paramabt, paramList);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 122 */     String str = this.a.O();
/* 123 */     if (str != null) {
/* 124 */       this.b = paramrg.a(str);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */