/*     */ import java.io.PrintStream;
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
/*     */ public class asd
/*     */   extends arn
/*     */ {
/*  16 */   private static final qx[] a = { new qx(ade.av, 0, 1, 1, 10), new qx(ade.j, 0, 1, 4, 10), new qx(ade.P, 0, 1, 1, 10), new qx(ade.O, 0, 1, 4, 10), new qx(ade.H, 0, 1, 4, 10), new qx(ade.F, 0, 1, 4, 10), new qx(ade.ar, 0, 1, 1, 10), new qx(ade.ao, 0, 1, 1, 1), new qx(ade.ax, 0, 1, 4, 10), new qx(ade.cd, 0, 1, 1, 10), new qx(ade.ce, 0, 1, 1, 10), new qx(ade.cb, 0, 1, 1, 10), new qx(ade.bY, 0, 1, 1, 2), new qx(ade.bX, 0, 1, 1, 5), new qx(ade.bZ, 0, 1, 1, 1) };
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
/*     */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  37 */     int i = 3;
/*  38 */     int j = paramRandom.nextInt(2) + 2;
/*  39 */     int k = paramRandom.nextInt(2) + 2;
/*     */     
/*  41 */     int m = 0;
/*  42 */     int i1; int i2; for (int n = paramInt1 - j - 1; n <= paramInt1 + j + 1; n++) {
/*  43 */       for (i1 = paramInt2 - 1; i1 <= paramInt2 + i + 1; i1++) {
/*  44 */         for (i2 = paramInt3 - k - 1; i2 <= paramInt3 + k + 1; i2++) {
/*  45 */           awt localawt = paramahb.a(n, i1, i2).o();
/*  46 */           if ((i1 == paramInt2 - 1) && (!localawt.a())) return false;
/*  47 */           if ((i1 == paramInt2 + i + 1) && (!localawt.a())) { return false;
/*     */           }
/*  49 */           if (((n == paramInt1 - j - 1) || (n == paramInt1 + j + 1) || (i2 == paramInt3 - k - 1) || (i2 == paramInt3 + k + 1)) && 
/*  50 */             (i1 == paramInt2) && (paramahb.c(n, i1, i2)) && (paramahb.c(n, i1 + 1, i2))) {
/*  51 */             m++;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*  59 */     if ((m < 1) || (m > 5)) { return false;
/*     */     }
/*  61 */     for (n = paramInt1 - j - 1; n <= paramInt1 + j + 1; n++) {
/*  62 */       for (i1 = paramInt2 + i; i1 >= paramInt2 - 1; i1--) {
/*  63 */         for (i2 = paramInt3 - k - 1; i2 <= paramInt3 + k + 1; i2++)
/*     */         {
/*  65 */           if ((n == paramInt1 - j - 1) || (i1 == paramInt2 - 1) || (i2 == paramInt3 - k - 1) || (n == paramInt1 + j + 1) || (i1 == paramInt2 + i + 1) || (i2 == paramInt3 + k + 1)) {
/*  66 */             if ((i1 >= 0) && (!paramahb.a(n, i1 - 1, i2).o().a())) {
/*  67 */               paramahb.f(n, i1, i2);
/*  68 */             } else if (paramahb.a(n, i1, i2).o().a()) {
/*  69 */               if ((i1 == paramInt2 - 1) && (paramRandom.nextInt(4) != 0)) {
/*  70 */                 paramahb.d(n, i1, i2, ajn.Y, 0, 2);
/*     */               } else {
/*  72 */                 paramahb.d(n, i1, i2, ajn.e, 0, 2);
/*     */               }
/*     */             }
/*     */           } else {
/*  76 */             paramahb.f(n, i1, i2);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  82 */     for (n = 0; n < 2; n++) {
/*  83 */       for (i1 = 0; i1 < 3; i1++) {
/*  84 */         i2 = paramInt1 + paramRandom.nextInt(j * 2 + 1) - j;
/*  85 */         int i3 = paramInt2;
/*  86 */         int i4 = paramInt3 + paramRandom.nextInt(k * 2 + 1) - k;
/*  87 */         if (paramahb.c(i2, i3, i4))
/*     */         {
/*  89 */           int i5 = 0;
/*  90 */           if (paramahb.a(i2 - 1, i3, i4).o().a()) i5++;
/*  91 */           if (paramahb.a(i2 + 1, i3, i4).o().a()) i5++;
/*  92 */           if (paramahb.a(i2, i3, i4 - 1).o().a()) i5++;
/*  93 */           if (paramahb.a(i2, i3, i4 + 1).o().a()) { i5++;
/*     */           }
/*  95 */           if (i5 == 1)
/*     */           {
/*  97 */             paramahb.d(i2, i3, i4, ajn.ae, 0, 2);
/*     */             
/*  99 */             qx[] arrayOfqx = qx.a(a, new qx[] { ade.bR.b(paramRandom) });
/*     */             
/* 101 */             aow localaow = (aow)paramahb.o(i2, i3, i4);
/* 102 */             if (localaow == null) break;
/* 103 */             qx.a(paramRandom, arrayOfqx, localaow, 8); break;
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 110 */     paramahb.d(paramInt1, paramInt2, paramInt3, ajn.ac, 0, 2);
/* 111 */     apj localapj = (apj)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 112 */     if (localapj != null) {
/* 113 */       localapj.a().a(a(paramRandom));
/*     */     } else {
/* 115 */       System.err.println("Failed to fetch mob spawner entity at (" + paramInt1 + ", " + paramInt2 + ", " + paramInt3 + ")");
/*     */     }
/*     */     
/* 118 */     return true;
/*     */   }
/*     */   
/*     */   private String a(Random paramRandom) {
/* 122 */     int i = paramRandom.nextInt(4);
/* 123 */     if (i == 0) return "Skeleton";
/* 124 */     if (i == 1) return "Zombie";
/* 125 */     if (i == 2) return "Zombie";
/* 126 */     if (i == 3) return "Spider";
/* 127 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */