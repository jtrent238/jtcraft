/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arg
/*    */   extends arn
/*    */ {
/*    */   private final qx[] a;
/*    */   private final int b;
/*    */   
/*    */   public arg(qx[] paramArrayOfqx, int paramInt)
/*    */   {
/* 18 */     this.a = paramArrayOfqx;
/* 19 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     aji localaji;
/* 25 */     while ((((localaji = paramahb.a(paramInt1, paramInt2, paramInt3)).o() == awt.a) || (localaji.o() == awt.j)) && (paramInt2 > 1)) {
/* 26 */       paramInt2--;
/*    */     }
/* 28 */     if (paramInt2 < 1) {
/* 29 */       return false;
/*    */     }
/* 31 */     paramInt2++;
/*    */     
/* 33 */     for (int i = 0; i < 4; i++) {
/* 34 */       int j = paramInt1 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 35 */       int k = paramInt2 + paramRandom.nextInt(3) - paramRandom.nextInt(3);
/* 36 */       int m = paramInt3 + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 37 */       if ((paramahb.c(j, k, m)) && (ahb.a(paramahb, j, k - 1, m))) {
/* 38 */         paramahb.d(j, k, m, ajn.ae, 0, 2);
/* 39 */         aow localaow = (aow)paramahb.o(j, k, m);
/* 40 */         if ((localaow != null) && 
/* 41 */           (localaow != null)) { qx.a(paramRandom, this.a, localaow, this.b);
/*    */         }
/* 43 */         if ((paramahb.c(j - 1, k, m)) && (ahb.a(paramahb, j - 1, k - 1, m))) {
/* 44 */           paramahb.d(j - 1, k, m, ajn.aa, 0, 2);
/*    */         }
/* 46 */         if ((paramahb.c(j + 1, k, m)) && (ahb.a(paramahb, j - 1, k - 1, m))) {
/* 47 */           paramahb.d(j + 1, k, m, ajn.aa, 0, 2);
/*    */         }
/* 49 */         if ((paramahb.c(j, k, m - 1)) && (ahb.a(paramahb, j - 1, k - 1, m))) {
/* 50 */           paramahb.d(j, k, m - 1, ajn.aa, 0, 2);
/*    */         }
/* 52 */         if ((paramahb.c(j, k, m + 1)) && (ahb.a(paramahb, j - 1, k - 1, m))) {
/* 53 */           paramahb.d(j, k, m + 1, ajn.aa, 0, 2);
/*    */         }
/* 55 */         return true;
/*    */       }
/*    */     }
/*    */     
/* 59 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */