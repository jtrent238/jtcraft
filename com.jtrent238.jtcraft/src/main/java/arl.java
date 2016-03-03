/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arl
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 12 */     while ((paramahb.c(paramInt1, paramInt2, paramInt3)) && (paramInt2 > 2)) {
/* 13 */       paramInt2--;
/*    */     }
/* 15 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.m) {
/* 16 */       return false;
/*    */     }
/*    */     
/*    */     int j;
/* 20 */     for (int i = -2; i <= 2; i++) {
/* 21 */       for (j = -2; j <= 2; j++) {
/* 22 */         if ((paramahb.c(paramInt1 + i, paramInt2 - 1, paramInt3 + j)) && (paramahb.c(paramInt1 + i, paramInt2 - 2, paramInt3 + j))) {
/* 23 */           return false;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 29 */     for (i = -1; i <= 0; i++) {
/* 30 */       for (j = -2; j <= 2; j++) {
/* 31 */         for (int k = -2; k <= 2; k++) {
/* 32 */           paramahb.d(paramInt1 + j, paramInt2 + i, paramInt3 + k, ajn.A, 0, 2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 38 */     paramahb.d(paramInt1, paramInt2, paramInt3, ajn.i, 0, 2);
/* 39 */     paramahb.d(paramInt1 - 1, paramInt2, paramInt3, ajn.i, 0, 2);
/* 40 */     paramahb.d(paramInt1 + 1, paramInt2, paramInt3, ajn.i, 0, 2);
/* 41 */     paramahb.d(paramInt1, paramInt2, paramInt3 - 1, ajn.i, 0, 2);
/* 42 */     paramahb.d(paramInt1, paramInt2, paramInt3 + 1, ajn.i, 0, 2);
/*    */     
/*    */ 
/* 45 */     for (i = -2; i <= 2; i++) {
/* 46 */       for (j = -2; j <= 2; j++) {
/* 47 */         if ((i == -2) || (i == 2) || (j == -2) || (j == 2)) {
/* 48 */           paramahb.d(paramInt1 + i, paramInt2 + 1, paramInt3 + j, ajn.A, 0, 2);
/*    */         }
/*    */       }
/*    */     }
/* 52 */     paramahb.d(paramInt1 + 2, paramInt2 + 1, paramInt3, ajn.U, 1, 2);
/* 53 */     paramahb.d(paramInt1 - 2, paramInt2 + 1, paramInt3, ajn.U, 1, 2);
/* 54 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3 + 2, ajn.U, 1, 2);
/* 55 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3 - 2, ajn.U, 1, 2);
/*    */     
/*    */ 
/* 58 */     for (i = -1; i <= 1; i++) {
/* 59 */       for (j = -1; j <= 1; j++) {
/* 60 */         if ((i == 0) && (j == 0)) {
/* 61 */           paramahb.d(paramInt1 + i, paramInt2 + 4, paramInt3 + j, ajn.A, 0, 2);
/*    */         } else {
/* 63 */           paramahb.d(paramInt1 + i, paramInt2 + 4, paramInt3 + j, ajn.U, 1, 2);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 69 */     for (i = 1; i <= 3; i++) {
/* 70 */       paramahb.d(paramInt1 - 1, paramInt2 + i, paramInt3 - 1, ajn.A, 0, 2);
/* 71 */       paramahb.d(paramInt1 - 1, paramInt2 + i, paramInt3 + 1, ajn.A, 0, 2);
/* 72 */       paramahb.d(paramInt1 + 1, paramInt2 + i, paramInt3 - 1, ajn.A, 0, 2);
/* 73 */       paramahb.d(paramInt1 + 1, paramInt2 + i, paramInt3 + 1, ajn.A, 0, 2);
/*    */     }
/*    */     
/* 76 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */