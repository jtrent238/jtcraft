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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class anj
/*     */   extends ajr
/*     */   implements ajo
/*     */ {
/*  27 */   public static final String[] a = { "oak", "spruce", "birch", "jungle", "acacia", "roofed_oak" };
/*     */   
/*     */ 
/*     */ 
/*  31 */   private static final rf[] b = new rf[a.length];
/*     */   
/*     */   protected anj() {
/*  34 */     float f = 0.4F;
/*  35 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*  36 */     a(abt.c);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/*  41 */     if (paramahb.E) { return;
/*     */     }
/*  43 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */     
/*  45 */     if ((paramahb.k(paramInt1, paramInt2 + 1, paramInt3) >= 9) && 
/*  46 */       (paramRandom.nextInt(7) == 0)) {
/*  47 */       c(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  54 */     paramInt2 &= 0x7;
/*  55 */     return b[qh.a(paramInt2, 0, 5)];
/*     */   }
/*     */   
/*     */   public void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  59 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  60 */     if ((i & 0x8) == 0) {
/*  61 */       paramahb.a(paramInt1, paramInt2, paramInt3, i | 0x8, 4);
/*     */     } else {
/*  63 */       d(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {
/*  68 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*     */     
/*  70 */     Object localObject = paramRandom.nextInt(10) == 0 ? new ard(true) : new asq(true);
/*     */     
/*  72 */     int j = 0;int k = 0;
/*  73 */     int m = 0;
/*     */     
/*  75 */     switch (i)
/*     */     {
/*     */ 
/*     */     case 1: 
/*  79 */       for (j = 0; j >= -1; j--) {
/*  80 */         for (k = 0; k >= -1; k--) {
/*  81 */           if ((a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k, 1)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k, 1)) && (a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k + 1, 1)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k + 1, 1)))
/*     */           {
/*  83 */             localObject = new asa(false, paramRandom.nextBoolean());
/*  84 */             m = 1;
/*     */             
/*     */             break label227;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*  91 */       if (m == 0) {
/*  92 */         j = k = 0;
/*  93 */         localObject = new asn(true);
/*     */       }
/*     */       
/*     */       break;
/*     */     case 2: 
/*  98 */       localObject = new are(true, false);
/*  99 */       break;
/*     */     
/*     */ 
/*     */     case 3: 
/* 103 */       for (j = 0; j >= -1; j--) {
/* 104 */         for (k = 0; k >= -1; k--) {
/* 105 */           if ((a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k, 3)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k, 3)) && (a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k + 1, 3)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k + 1, 3)))
/*     */           {
/* 107 */             localObject = new arz(true, 10, 20, 3, 3);
/* 108 */             m = 1;
/*     */             
/*     */             break label401;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 115 */       if (m == 0) {
/* 116 */         j = k = 0;
/* 117 */         localObject = new asq(true, 4 + paramRandom.nextInt(7), 3, 3, false);
/*     */       }
/*     */       
/*     */       break;
/*     */     case 4: 
/* 122 */       localObject = new ask(true);
/*     */       
/* 124 */       break;
/*     */     case 5: 
/*     */       label227:
/*     */       label401:
/* 128 */       for (j = 0; j >= -1; j--) {
/* 129 */         for (k = 0; k >= -1; k--) {
/* 130 */           if ((a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k, 5)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k, 5)) && (a(paramahb, paramInt1 + j, paramInt2, paramInt3 + k + 1, 5)) && (a(paramahb, paramInt1 + j + 1, paramInt2, paramInt3 + k + 1, 5)))
/*     */           {
/* 132 */             localObject = new asi(true);
/* 133 */             m = 1;
/*     */             
/*     */             break label580;
/*     */           }
/*     */         }
/*     */       }
/*     */       label580:
/* 140 */       if (m == 0) {
/* 141 */         return;
/*     */       }
/*     */       
/*     */ 
/*     */       break;
/*     */     }
/*     */     
/*     */     
/*     */ 
/* 150 */     aji localaji = ajn.a;
/* 151 */     if (m != 0) {
/* 152 */       paramahb.d(paramInt1 + j, paramInt2, paramInt3 + k, localaji, 0, 4);
/* 153 */       paramahb.d(paramInt1 + j + 1, paramInt2, paramInt3 + k, localaji, 0, 4);
/* 154 */       paramahb.d(paramInt1 + j, paramInt2, paramInt3 + k + 1, localaji, 0, 4);
/* 155 */       paramahb.d(paramInt1 + j + 1, paramInt2, paramInt3 + k + 1, localaji, 0, 4);
/*     */     } else {
/* 157 */       paramahb.d(paramInt1, paramInt2, paramInt3, localaji, 0, 4);
/*     */     }
/*     */     
/* 160 */     if (!((arn)localObject).a(paramahb, paramRandom, paramInt1 + j, paramInt2, paramInt3 + k)) {
/* 161 */       if (m != 0) {
/* 162 */         paramahb.d(paramInt1 + j, paramInt2, paramInt3 + k, this, i, 4);
/* 163 */         paramahb.d(paramInt1 + j + 1, paramInt2, paramInt3 + k, this, i, 4);
/* 164 */         paramahb.d(paramInt1 + j, paramInt2, paramInt3 + k + 1, this, i, 4);
/* 165 */         paramahb.d(paramInt1 + j + 1, paramInt2, paramInt3 + k + 1, this, i, 4);
/*     */       } else {
/* 167 */         paramahb.d(paramInt1, paramInt2, paramInt3, this, i, 4);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 173 */     return (paramahb.a(paramInt1, paramInt2, paramInt3) == this) && ((paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7) == paramInt4);
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/* 178 */     return qh.a(paramInt & 0x7, 0, 5);
/*     */   }
/*     */   
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 183 */     paramList.add(new add(paramadb, 1, 0));
/* 184 */     paramList.add(new add(paramadb, 1, 1));
/* 185 */     paramList.add(new add(paramadb, 1, 2));
/* 186 */     paramList.add(new add(paramadb, 1, 3));
/* 187 */     paramList.add(new add(paramadb, 1, 4));
/* 188 */     paramList.add(new add(paramadb, 1, 5));
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 193 */     for (int i = 0; i < b.length; i++) {
/* 194 */       b[i] = paramrg.a(N() + "_" + a[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/* 200 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 205 */     return paramahb.s.nextFloat() < 0.45D;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 210 */     c(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */