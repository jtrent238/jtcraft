/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aeg
/*     */   extends abh
/*     */ {
/*     */   private final boolean b;
/*     */   private final alj c;
/*     */   private final alj d;
/*     */   
/*     */   public aeg(aji paramaji, alj paramalj1, alj paramalj2, boolean paramBoolean)
/*     */   {
/*  15 */     super(paramaji);
/*  16 */     this.c = paramalj1;
/*  17 */     this.d = paramalj2;
/*     */     
/*  19 */     this.b = paramBoolean;
/*     */     
/*  21 */     f(0);
/*  22 */     a(true);
/*     */   }
/*     */   
/*     */   public rf b_(int paramInt)
/*     */   {
/*  27 */     return aji.a(this).a(2, paramInt);
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  32 */     return paramInt;
/*     */   }
/*     */   
/*     */   public String a(add paramadd)
/*     */   {
/*  37 */     return this.c.b(paramadd.k());
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  42 */     if (this.b) { return super.a(paramadd, paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */     }
/*  44 */     if (paramadd.b == 0) return false;
/*  45 */     if (!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) { return false;
/*     */     }
/*  47 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  48 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  49 */     int j = i & 0x7;
/*  50 */     int k = (i & 0x8) != 0 ? 1 : 0;
/*     */     
/*  52 */     if (((paramInt4 == 1) && (k == 0)) || ((paramInt4 == 0) && (k != 0) && (localaji == this.c) && (j == paramadd.k()))) {
/*  53 */       if ((paramahb.b(this.d.a(paramahb, paramInt1, paramInt2, paramInt3))) && (paramahb.d(paramInt1, paramInt2, paramInt3, this.d, j, 3))) {
/*  54 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.d.H.b(), (this.d.H.c() + 1.0F) / 2.0F, this.d.H.d() * 0.8F);
/*  55 */         paramadd.b -= 1;
/*     */       }
/*  57 */       return true; }
/*  58 */     if (a(paramadd, paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4)) {
/*  59 */       return true;
/*     */     }
/*  61 */     return super.a(paramadd, paramyz, paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, yz paramyz, add paramadd)
/*     */   {
/*  67 */     int i = paramInt1;int j = paramInt2;int k = paramInt3;
/*     */     
/*  69 */     aji localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  70 */     int m = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  71 */     int n = m & 0x7;
/*  72 */     int i1 = (m & 0x8) != 0 ? 1 : 0;
/*     */     
/*  74 */     if (((paramInt4 == 1) && (i1 == 0)) || ((paramInt4 == 0) && (i1 != 0) && (localaji1 == this.c) && (n == paramadd.k()))) {
/*  75 */       return true;
/*     */     }
/*     */     
/*  78 */     if (paramInt4 == 0) paramInt2--;
/*  79 */     if (paramInt4 == 1) paramInt2++;
/*  80 */     if (paramInt4 == 2) paramInt3--;
/*  81 */     if (paramInt4 == 3) paramInt3++;
/*  82 */     if (paramInt4 == 4) paramInt1--;
/*  83 */     if (paramInt4 == 5) { paramInt1++;
/*     */     }
/*  85 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  86 */     int i2 = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  87 */     n = i2 & 0x7;
/*     */     
/*  89 */     if ((localaji2 == this.c) && (n == paramadd.k())) {
/*  90 */       return true;
/*     */     }
/*     */     
/*  93 */     return super.a(paramahb, i, j, k, paramInt4, paramyz, paramadd);
/*     */   }
/*     */   
/*     */   private boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*  97 */     if (paramInt4 == 0) paramInt2--;
/*  98 */     if (paramInt4 == 1) paramInt2++;
/*  99 */     if (paramInt4 == 2) paramInt3--;
/* 100 */     if (paramInt4 == 3) paramInt3++;
/* 101 */     if (paramInt4 == 4) paramInt1--;
/* 102 */     if (paramInt4 == 5) { paramInt1++;
/*     */     }
/* 104 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 105 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 106 */     int j = i & 0x7;
/*     */     
/* 108 */     if ((localaji == this.c) && (j == paramadd.k())) {
/* 109 */       if ((paramahb.b(this.d.a(paramahb, paramInt1, paramInt2, paramInt3))) && (paramahb.d(paramInt1, paramInt2, paramInt3, this.d, j, 3))) {
/* 110 */         paramahb.a(paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this.d.H.b(), (this.d.H.c() + 1.0F) / 2.0F, this.d.H.d() * 0.8F);
/* 111 */         paramadd.b -= 1;
/*     */       }
/* 113 */       return true;
/*     */     }
/*     */     
/* 116 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aeg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */