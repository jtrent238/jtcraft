/*     */ 
/*     */ 
/*     */ 
/*     */ public class amt
/*     */   extends aje
/*     */ {
/*     */   protected rf b;
/*     */   
/*     */   protected amt()
/*     */   {
/*  11 */     super(true);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  16 */     if ((paramInt2 & 0x8) == 0) {
/*  17 */       return this.L;
/*     */     }
/*  19 */     return this.b;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg)
/*     */   {
/*  25 */     super.a(paramrg);
/*  26 */     this.b = paramrg.a(N() + "_powered");
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
/*  30 */     if (paramInt5 >= 8) {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     int i = paramInt4 & 0x7;
/*     */     
/*  36 */     int j = 1;
/*  37 */     switch (i) {
/*     */     case 0: 
/*  39 */       if (paramBoolean) {
/*  40 */         paramInt3++;
/*     */       } else {
/*  42 */         paramInt3--;
/*     */       }
/*  44 */       break;
/*     */     case 1: 
/*  46 */       if (paramBoolean) {
/*  47 */         paramInt1--;
/*     */       } else {
/*  49 */         paramInt1++;
/*     */       }
/*  51 */       break;
/*     */     case 2: 
/*  53 */       if (paramBoolean) {
/*  54 */         paramInt1--;
/*     */       } else {
/*  56 */         paramInt1++;
/*  57 */         paramInt2++;
/*  58 */         j = 0;
/*     */       }
/*  60 */       i = 1;
/*  61 */       break;
/*     */     case 3: 
/*  63 */       if (paramBoolean) {
/*  64 */         paramInt1--;
/*  65 */         paramInt2++;
/*  66 */         j = 0;
/*     */       } else {
/*  68 */         paramInt1++;
/*     */       }
/*  70 */       i = 1;
/*  71 */       break;
/*     */     case 4: 
/*  73 */       if (paramBoolean) {
/*  74 */         paramInt3++;
/*     */       } else {
/*  76 */         paramInt3--;
/*  77 */         paramInt2++;
/*  78 */         j = 0;
/*     */       }
/*  80 */       i = 0;
/*  81 */       break;
/*     */     case 5: 
/*  83 */       if (paramBoolean) {
/*  84 */         paramInt3++;
/*  85 */         paramInt2++;
/*  86 */         j = 0;
/*     */       } else {
/*  88 */         paramInt3--;
/*     */       }
/*  90 */       i = 0;
/*     */     }
/*     */     
/*     */     
/*  94 */     if (a(paramahb, paramInt1, paramInt2, paramInt3, paramBoolean, paramInt5, i)) {
/*  95 */       return true;
/*     */     }
/*  97 */     if ((j != 0) && (a(paramahb, paramInt1, paramInt2 - 1, paramInt3, paramBoolean, paramInt5, i))) {
/*  98 */       return true;
/*     */     }
/* 100 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5) {
/* 104 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*     */     
/* 106 */     if (localaji == this) {
/* 107 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 108 */       int j = i & 0x7;
/*     */       
/* 110 */       if ((paramInt5 == 1) && ((j == 0) || (j == 4) || (j == 5))) {
/* 111 */         return false;
/*     */       }
/* 113 */       if ((paramInt5 == 0) && ((j == 1) || (j == 2) || (j == 3))) {
/* 114 */         return false;
/*     */       }
/*     */       
/* 117 */       if ((i & 0x8) != 0) {
/* 118 */         if (paramahb.v(paramInt1, paramInt2, paramInt3)) {
/* 119 */           return true;
/*     */         }
/* 121 */         return a(paramahb, paramInt1, paramInt2, paramInt3, i, paramBoolean, paramInt4 + 1);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 126 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, aji paramaji)
/*     */   {
/* 131 */     boolean bool = paramahb.v(paramInt1, paramInt2, paramInt3);
/* 132 */     bool = (bool) || (a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, true, 0)) || (a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, false, 0));
/*     */     
/* 134 */     int i = 0;
/* 135 */     if ((bool) && ((paramInt4 & 0x8) == 0)) {
/* 136 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt5 | 0x8, 3);
/* 137 */       i = 1;
/* 138 */     } else if ((!bool) && ((paramInt4 & 0x8) != 0)) {
/* 139 */       paramahb.a(paramInt1, paramInt2, paramInt3, paramInt5, 3);
/* 140 */       i = 1;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 146 */     if (i != 0) {
/* 147 */       paramahb.d(paramInt1, paramInt2 - 1, paramInt3, this);
/* 148 */       if ((paramInt5 == 2) || (paramInt5 == 3) || (paramInt5 == 4) || (paramInt5 == 5)) {
/* 149 */         paramahb.d(paramInt1, paramInt2 + 1, paramInt3, this);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */