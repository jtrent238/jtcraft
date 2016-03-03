/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arw
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     while ((paramahb.c(paramInt1, paramInt2, paramInt3)) && (paramInt2 > 2)) {
/* 16 */       paramInt2--;
/*    */     }
/* 18 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.aE) {
/* 19 */       return false;
/*    */     }
/* 21 */     paramInt2 += paramRandom.nextInt(4);
/*    */     
/* 23 */     int i = paramRandom.nextInt(4) + 7;
/* 24 */     int j = i / 4 + paramRandom.nextInt(2);
/*    */     
/* 26 */     if ((j > 1) && (paramRandom.nextInt(60) == 0))
/* 27 */       paramInt2 += 10 + paramRandom.nextInt(30);
/*    */     int n;
/*    */     int i1;
/* 30 */     for (int k = 0; k < i; k++) {
/* 31 */       float f1 = (1.0F - k / i) * j;
/* 32 */       n = qh.f(f1);
/*    */       
/* 34 */       for (i1 = -n; i1 <= n; i1++) {
/* 35 */         float f2 = qh.a(i1) - 0.25F;
/* 36 */         for (int i3 = -n; i3 <= n; i3++) {
/* 37 */           float f3 = qh.a(i3) - 0.25F;
/* 38 */           if (((i1 == 0) && (i3 == 0)) || (f2 * f2 + f3 * f3 <= f1 * f1))
/*    */           {
/*    */ 
/* 41 */             if (((i1 != -n) && (i1 != n) && (i3 != -n) && (i3 != n)) || 
/* 42 */               (paramRandom.nextFloat() <= 0.75F))
/*    */             {
/*    */ 
/*    */ 
/*    */ 
/* 47 */               aji localaji2 = paramahb.a(paramInt1 + i1, paramInt2 + k, paramInt3 + i3);
/* 48 */               if ((localaji2.o() == awt.a) || (localaji2 == ajn.d) || (localaji2 == ajn.aE) || (localaji2 == ajn.aD)) {
/* 49 */                 a(paramahb, paramInt1 + i1, paramInt2 + k, paramInt3 + i3, ajn.cj);
/*    */               }
/* 51 */               if ((k != 0) && (n > 1)) {
/* 52 */                 localaji2 = paramahb.a(paramInt1 + i1, paramInt2 - k, paramInt3 + i3);
/* 53 */                 if ((localaji2.o() == awt.a) || (localaji2 == ajn.d) || (localaji2 == ajn.aE) || (localaji2 == ajn.aD))
/* 54 */                   a(paramahb, paramInt1 + i1, paramInt2 - k, paramInt3 + i3, ajn.cj);
/*    */               }
/*    */             } }
/*    */         }
/*    */       }
/*    */     }
/* 60 */     k = j - 1;
/* 61 */     if (k < 0) {
/* 62 */       k = 0;
/* 63 */     } else if (k > 1) {
/* 64 */       k = 1;
/*    */     }
/* 66 */     for (int m = -k; m <= k; m++) {
/* 67 */       for (n = -k; n <= k; n++) {
/* 68 */         i1 = paramInt2 - 1;
/* 69 */         int i2 = 50;
/* 70 */         if ((Math.abs(m) == 1) && (Math.abs(n) == 1)) {
/* 71 */           i2 = paramRandom.nextInt(5);
/*    */         }
/* 73 */         while (i1 > 50) {
/* 74 */           aji localaji1 = paramahb.a(paramInt1 + m, i1, paramInt3 + n);
/* 75 */           if ((localaji1.o() != awt.a) && (localaji1 != ajn.d) && (localaji1 != ajn.aE) && (localaji1 != ajn.aD) && (localaji1 != ajn.cj)) break;
/* 76 */           a(paramahb, paramInt1 + m, i1, paramInt3 + n, ajn.cj);
/*    */           
/*    */ 
/*    */ 
/* 80 */           i1--;
/* 81 */           i2--;
/* 82 */           if (i2 <= 0) {
/* 83 */             i1 -= paramRandom.nextInt(5) + 1;
/* 84 */             i2 = paramRandom.nextInt(5);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 90 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */