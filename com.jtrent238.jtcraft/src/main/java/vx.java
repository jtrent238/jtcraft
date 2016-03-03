/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vx
/*    */ {
/* 10 */   private static azw a = azw.a(0.0D, 0.0D, 0.0D);
/*    */   
/*    */   public static azw a(td paramtd, int paramInt1, int paramInt2) {
/* 13 */     return c(paramtd, paramInt1, paramInt2, null);
/*    */   }
/*    */   
/*    */   public static azw a(td paramtd, int paramInt1, int paramInt2, azw paramazw) {
/* 17 */     a.a = (paramazw.a - paramtd.s);
/* 18 */     a.b = (paramazw.b - paramtd.t);
/* 19 */     a.c = (paramazw.c - paramtd.u);
/* 20 */     return c(paramtd, paramInt1, paramInt2, a);
/*    */   }
/*    */   
/*    */   public static azw b(td paramtd, int paramInt1, int paramInt2, azw paramazw) {
/* 24 */     a.a = (paramtd.s - paramazw.a);
/* 25 */     a.b = (paramtd.t - paramazw.b);
/* 26 */     a.c = (paramtd.u - paramazw.c);
/* 27 */     return c(paramtd, paramInt1, paramInt2, a);
/*    */   }
/*    */   
/*    */   private static azw c(td paramtd, int paramInt1, int paramInt2, azw paramazw) {
/* 31 */     Random localRandom = paramtd.aI();
/* 32 */     int i = 0;
/* 33 */     int j = 0;int k = 0;int m = 0;
/* 34 */     float f1 = -99999.0F;
/*    */     
/*    */     int n;
/* 37 */     if (paramtd.bY()) {
/* 38 */       double d1 = paramtd.bV().e(qh.c(paramtd.s), qh.c(paramtd.t), qh.c(paramtd.u)) + 4.0F;
/* 39 */       double d2 = paramtd.bW() + paramInt1;
/* 40 */       n = d1 < d2 * d2 ? 1 : 0;
/* 41 */     } else { n = 0;
/*    */     }
/* 43 */     for (int i1 = 0; i1 < 10; i1++) {
/* 44 */       int i2 = localRandom.nextInt(2 * paramInt1) - paramInt1;
/* 45 */       int i3 = localRandom.nextInt(2 * paramInt2) - paramInt2;
/* 46 */       int i4 = localRandom.nextInt(2 * paramInt1) - paramInt1;
/*    */       
/* 48 */       if ((paramazw == null) || (i2 * paramazw.a + i4 * paramazw.c >= 0.0D))
/*    */       {
/* 50 */         i2 += qh.c(paramtd.s);
/* 51 */         i3 += qh.c(paramtd.t);
/* 52 */         i4 += qh.c(paramtd.u);
/*    */         
/* 54 */         if ((n == 0) || (paramtd.b(i2, i3, i4))) {
/* 55 */           float f2 = paramtd.a(i2, i3, i4);
/* 56 */           if (f2 > f1) {
/* 57 */             f1 = f2;
/* 58 */             j = i2;
/* 59 */             k = i3;
/* 60 */             m = i4;
/* 61 */             i = 1;
/*    */           }
/*    */         } } }
/* 64 */     if (i != 0) {
/* 65 */       return azw.a(j, k, m);
/*    */     }
/*    */     
/* 68 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */