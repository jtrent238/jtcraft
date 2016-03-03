/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asr
/*    */   extends arn
/*    */ {
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 14 */     int i = paramInt1;
/* 15 */     int j = paramInt3;
/*    */     
/* 17 */     while (paramInt2 < 128) {
/* 18 */       if (paramahb.c(paramInt1, paramInt2, paramInt3)) {
/* 19 */         for (int k = 2; k <= 5; k++) {
/* 20 */           if (ajn.bd.d(paramahb, paramInt1, paramInt2, paramInt3, k)) {
/* 21 */             paramahb.d(paramInt1, paramInt2, paramInt3, ajn.bd, 1 << p.e[q.a[k]], 2);
/* 22 */             break;
/*    */           }
/*    */         }
/*    */       } else {
/* 26 */         paramInt1 = i + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/* 27 */         paramInt3 = j + paramRandom.nextInt(4) - paramRandom.nextInt(4);
/*    */       }
/* 29 */       paramInt2++;
/*    */     }
/*    */     
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */