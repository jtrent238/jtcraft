/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arv
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   
/*    */   public arv(int paramInt)
/*    */   {
/* 14 */     this.a = ajn.cj;
/* 15 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 20 */     while ((paramahb.c(paramInt1, paramInt2, paramInt3)) && (paramInt2 > 2)) {
/* 21 */       paramInt2--;
/*    */     }
/* 23 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.aE) {
/* 24 */       return false;
/*    */     }
/* 26 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 27 */     int j = 1;
/* 28 */     for (int k = paramInt1 - i; k <= paramInt1 + i; k++) {
/* 29 */       for (int m = paramInt3 - i; m <= paramInt3 + i; m++) {
/* 30 */         int n = k - paramInt1;
/* 31 */         int i1 = m - paramInt3;
/* 32 */         if (n * n + i1 * i1 <= i * i) {
/* 33 */           for (int i2 = paramInt2 - j; i2 <= paramInt2 + j; i2++) {
/* 34 */             aji localaji = paramahb.a(k, i2, m);
/* 35 */             if ((localaji == ajn.d) || (localaji == ajn.aE) || (localaji == ajn.aD)) {
/* 36 */               paramahb.d(k, i2, m, this.a, 0, 2);
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 42 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */