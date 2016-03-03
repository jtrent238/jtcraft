/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asl
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   
/*    */   public asl(aji paramaji)
/*    */   {
/* 15 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     if ((!paramahb.c(paramInt1, paramInt2, paramInt3)) || (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) != this.a)) {
/* 21 */       return false;
/*    */     }
/* 23 */     int i = paramRandom.nextInt(32) + 6;
/* 24 */     int j = paramRandom.nextInt(4) + 1;
/* 25 */     int m; int n; int i1; for (int k = paramInt1 - j; k <= paramInt1 + j; k++) {
/* 26 */       for (m = paramInt3 - j; m <= paramInt3 + j; m++) {
/* 27 */         n = k - paramInt1;
/* 28 */         i1 = m - paramInt3;
/* 29 */         if ((n * n + i1 * i1 <= j * j + 1) && 
/* 30 */           (paramahb.a(k, paramInt2 - 1, m) != this.a)) return false;
/*    */       }
/*    */     }
/* 33 */     for (k = paramInt2; k < paramInt2 + i; k++) {
/* 34 */       if (k >= 256) break;
/* 35 */       for (m = paramInt1 - j; m <= paramInt1 + j; m++) {
/* 36 */         for (n = paramInt3 - j; n <= paramInt3 + j; n++) {
/* 37 */           i1 = m - paramInt1;
/* 38 */           int i2 = n - paramInt3;
/* 39 */           if (i1 * i1 + i2 * i2 <= j * j + 1) {
/* 40 */             paramahb.d(m, k, n, ajn.Z, 0, 2);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 46 */     wz localwz = new wz(paramahb);
/* 47 */     localwz.b(paramInt1 + 0.5F, paramInt2 + i, paramInt3 + 0.5F, paramRandom.nextFloat() * 360.0F, 0.0F);
/* 48 */     paramahb.d(localwz);
/* 49 */     paramahb.d(paramInt1, paramInt2 + i, paramInt3, ajn.h, 0, 2);
/*    */     
/* 51 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */