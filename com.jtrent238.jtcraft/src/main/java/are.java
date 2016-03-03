/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class are
/*    */   extends arc
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public are(boolean paramBoolean1, boolean paramBoolean2)
/*    */   {
/* 17 */     super(paramBoolean1);
/* 18 */     this.a = paramBoolean2;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 23 */     int i = paramRandom.nextInt(3) + 5;
/* 24 */     if (this.a) {
/* 25 */       i += paramRandom.nextInt(7);
/*    */     }
/*    */     
/* 28 */     int j = 1;
/* 29 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) return false;
/*    */     int n;
/* 31 */     int i1; for (int k = paramInt2; k <= paramInt2 + 1 + i; k++) {
/* 32 */       m = 1;
/* 33 */       if (k == paramInt2) m = 0;
/* 34 */       if (k >= paramInt2 + 1 + i - 2) m = 2;
/* 35 */       for (n = paramInt1 - m; (n <= paramInt1 + m) && (j != 0); n++) {
/* 36 */         for (i1 = paramInt3 - m; (i1 <= paramInt3 + m) && (j != 0); i1++) {
/* 37 */           if ((k >= 0) && (k < 256)) {
/* 38 */             aji localaji3 = paramahb.a(n, k, i1);
/* 39 */             if (!a(localaji3)) j = 0;
/*    */           } else {
/* 41 */             j = 0;
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 47 */     if (j == 0) { return false;
/*    */     }
/* 49 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/* 50 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d) && (localaji1 != ajn.ak)) || (paramInt2 >= 256 - i - 1)) { return false;
/*    */     }
/* 52 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*    */     
/* 54 */     for (int m = paramInt2 - 3 + i; m <= paramInt2 + i; m++) {
/* 55 */       n = m - (paramInt2 + i);
/* 56 */       i1 = 1 - n / 2;
/* 57 */       for (int i2 = paramInt1 - i1; i2 <= paramInt1 + i1; i2++) {
/* 58 */         int i3 = i2 - paramInt1;
/* 59 */         for (int i4 = paramInt3 - i1; i4 <= paramInt3 + i1; i4++) {
/* 60 */           int i5 = i4 - paramInt3;
/* 61 */           if ((Math.abs(i3) != i1) || (Math.abs(i5) != i1) || ((paramRandom.nextInt(2) != 0) && (n != 0))) {
/* 62 */             aji localaji4 = paramahb.a(i2, m, i4);
/* 63 */             if ((localaji4.o() == awt.a) || (localaji4.o() == awt.j)) a(paramahb, i2, m, i4, ajn.t, 2);
/*    */           }
/*    */         }
/*    */       } }
/* 67 */     for (m = 0; m < i; m++) {
/* 68 */       aji localaji2 = paramahb.a(paramInt1, paramInt2 + m, paramInt3);
/* 69 */       if ((localaji2.o() == awt.a) || (localaji2.o() == awt.j)) a(paramahb, paramInt1, paramInt2 + m, paramInt3, ajn.r, 2);
/*    */     }
/* 71 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\are.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */