/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arj
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   
/*    */   public arj(int paramInt)
/*    */   {
/* 15 */     this.a = ajn.aG;
/* 16 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 21 */     if (paramahb.a(paramInt1, paramInt2, paramInt3).o() != awt.h) return false;
/* 22 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 23 */     int j = 1;
/* 24 */     for (int k = paramInt1 - i; k <= paramInt1 + i; k++) {
/* 25 */       for (int m = paramInt3 - i; m <= paramInt3 + i; m++) {
/* 26 */         int n = k - paramInt1;
/* 27 */         int i1 = m - paramInt3;
/* 28 */         if (n * n + i1 * i1 <= i * i) {
/* 29 */           for (int i2 = paramInt2 - j; i2 <= paramInt2 + j; i2++) {
/* 30 */             aji localaji = paramahb.a(k, i2, m);
/* 31 */             if ((localaji == ajn.d) || (localaji == ajn.aG)) {
/* 32 */               paramahb.d(k, i2, m, this.a, 0, 2);
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 38 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */