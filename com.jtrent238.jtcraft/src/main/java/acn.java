/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acn
/*     */   extends adb
/*     */ {
/*     */   public acn()
/*     */   {
/*  13 */     a(abt.f);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  19 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/*  20 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/*  22 */     if ((paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) && (localaji == ajn.br) && (!aku.b(i))) {
/*  23 */       if (paramahb.E) return true;
/*  24 */       paramahb.a(paramInt1, paramInt2, paramInt3, i + 4, 2);
/*  25 */       paramahb.f(paramInt1, paramInt2, paramInt3, ajn.br);
/*  26 */       paramadd.b -= 1;
/*     */       
/*  28 */       for (int j = 0; j < 16; j++) {
/*  29 */         double d1 = paramInt1 + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
/*  30 */         double d2 = paramInt2 + 0.8125F;
/*  31 */         double d3 = paramInt3 + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
/*  32 */         double d4 = 0.0D;
/*  33 */         double d5 = 0.0D;
/*  34 */         double d6 = 0.0D;
/*     */         
/*  36 */         paramahb.a("smoke", d1, d2, d3, d4, d5, d6);
/*     */       }
/*     */       
/*     */ 
/*  40 */       j = i & 0x3;
/*     */       
/*     */ 
/*  43 */       int k = 0;
/*  44 */       int m = 0;
/*  45 */       int n = 0;
/*  46 */       int i1 = 1;
/*  47 */       int i2 = p.g[j];
/*  48 */       int i4; int i5; for (int i3 = -2; i3 <= 2; i3++) {
/*  49 */         i4 = paramInt1 + p.a[i2] * i3;
/*  50 */         i5 = paramInt3 + p.b[i2] * i3;
/*     */         
/*  52 */         if (paramahb.a(i4, paramInt2, i5) == ajn.br) {
/*  53 */           if (!aku.b(paramahb.e(i4, paramInt2, i5))) {
/*  54 */             i1 = 0;
/*  55 */             break;
/*     */           }
/*  57 */           m = i3;
/*  58 */           if (n == 0) {
/*  59 */             k = i3;
/*  60 */             n = 1;
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/*  66 */       if ((i1 != 0) && (m == k + 2))
/*     */       {
/*     */ 
/*  69 */         for (i3 = k; i3 <= m; i3++) {
/*  70 */           i4 = paramInt1 + p.a[i2] * i3;
/*  71 */           i5 = paramInt3 + p.b[i2] * i3;
/*  72 */           i4 += p.a[j] * 4;
/*  73 */           i5 += p.b[j] * 4;
/*     */           
/*  75 */           if ((paramahb.a(i4, paramInt2, i5) != ajn.br) || (!aku.b(paramahb.e(i4, paramInt2, i5)))) {
/*  76 */             i1 = 0;
/*  77 */             break;
/*     */           }
/*     */         }
/*     */         int i6;
/*  81 */         for (i3 = k - 1; i3 <= m + 1; i3 += 4) {
/*  82 */           for (i4 = 1; i4 <= 3; i4++) {
/*  83 */             i5 = paramInt1 + p.a[i2] * i3;
/*  84 */             i6 = paramInt3 + p.b[i2] * i3;
/*  85 */             i5 += p.a[j] * i4;
/*  86 */             i6 += p.b[j] * i4;
/*     */             
/*  88 */             if ((paramahb.a(i5, paramInt2, i6) != ajn.br) || (!aku.b(paramahb.e(i5, paramInt2, i6)))) {
/*  89 */               i1 = 0;
/*  90 */               break;
/*     */             }
/*     */           }
/*     */         }
/*  94 */         if (i1 != 0)
/*     */         {
/*  96 */           for (i3 = k; i3 <= m; i3++) {
/*  97 */             for (i4 = 1; i4 <= 3; i4++) {
/*  98 */               i5 = paramInt1 + p.a[i2] * i3;
/*  99 */               i6 = paramInt3 + p.b[i2] * i3;
/* 100 */               i5 += p.a[j] * i4;
/* 101 */               i6 += p.b[j] * i4;
/*     */               
/* 103 */               paramahb.d(i5, paramInt2, i6, ajn.bq, 0, 2);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 109 */       return true;
/*     */     }
/* 111 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*     */   {
/* 117 */     azu localazu = a(paramahb, paramyz, false);
/* 118 */     if ((localazu != null) && (localazu.a == azv.b) && 
/* 119 */       (paramahb.a(localazu.b, localazu.c, localazu.d) == ajn.br)) {
/* 120 */       return paramadd;
/*     */     }
/*     */     
/*     */ 
/* 124 */     if (!paramahb.E) {
/* 125 */       agt localagt = paramahb.b("Stronghold", (int)paramyz.s, (int)paramyz.t, (int)paramyz.u);
/* 126 */       if (localagt != null) {
/* 127 */         zd localzd = new zd(paramahb, paramyz.s, paramyz.t + 1.62D - paramyz.L, paramyz.u);
/* 128 */         localzd.a(localagt.a, localagt.b, localagt.c);
/* 129 */         paramahb.d(localzd);
/*     */         
/* 131 */         paramahb.a(paramyz, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 132 */         paramahb.a(null, 1002, (int)paramyz.s, (int)paramyz.t, (int)paramyz.u, 0);
/* 133 */         if (!paramyz.bE.d) {
/* 134 */           paramadd.b -= 1;
/*     */         }
/*     */       }
/*     */     }
/* 138 */     return paramadd;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */