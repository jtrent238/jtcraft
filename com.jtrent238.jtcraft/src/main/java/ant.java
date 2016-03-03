/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ant
/*    */   extends alw
/*    */ {
/*    */   protected ant(awt paramawt)
/*    */   {
/* 10 */     super(paramawt);
/*    */     
/* 12 */     a(false);
/* 13 */     if (paramawt == awt.i) a(true);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 18 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/* 19 */     if (paramahb.a(paramInt1, paramInt2, paramInt3) == this) {
/* 20 */       n(paramahb, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void n(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 25 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*    */     
/* 27 */     paramahb.d(paramInt1, paramInt2, paramInt3, aji.e(aji.b(this) - 1), i, 2);
/* 28 */     paramahb.a(paramInt1, paramInt2, paramInt3, aji.e(aji.b(this) - 1), a(paramahb));
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 33 */     if (this.J == awt.i) {
/* 34 */       int i = paramRandom.nextInt(3);
/* 35 */       for (int j = 0; j < i; j++) {
/* 36 */         paramInt1 += paramRandom.nextInt(3) - 1;
/* 37 */         paramInt2++;
/* 38 */         paramInt3 += paramRandom.nextInt(3) - 1;
/* 39 */         aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 40 */         if (localaji.J == awt.a) {
/* 41 */           if ((o(paramahb, paramInt1 - 1, paramInt2, paramInt3)) || (o(paramahb, paramInt1 + 1, paramInt2, paramInt3)) || (o(paramahb, paramInt1, paramInt2, paramInt3 - 1)) || (o(paramahb, paramInt1, paramInt2, paramInt3 + 1)) || (o(paramahb, paramInt1, paramInt2 - 1, paramInt3)) || (o(paramahb, paramInt1, paramInt2 + 1, paramInt3))) {
/* 42 */             paramahb.b(paramInt1, paramInt2, paramInt3, ajn.ab);
/*    */           }
/*    */         }
/* 45 */         else if (localaji.J.c()) {
/* 46 */           return;
/*    */         }
/*    */       }
/* 49 */       if (i == 0) {
/* 50 */         j = paramInt1;
/* 51 */         int k = paramInt3;
/* 52 */         for (int m = 0; m < 3; m++) {
/* 53 */           paramInt1 = j + paramRandom.nextInt(3) - 1;
/* 54 */           paramInt3 = k + paramRandom.nextInt(3) - 1;
/* 55 */           if ((paramahb.c(paramInt1, paramInt2 + 1, paramInt3)) && (o(paramahb, paramInt1, paramInt2, paramInt3))) {
/* 56 */             paramahb.b(paramInt1, paramInt2 + 1, paramInt3, ajn.ab);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean o(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 64 */     return paramahb.a(paramInt1, paramInt2, paramInt3).o().h();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */