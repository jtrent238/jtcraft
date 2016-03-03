/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asf
/*    */   extends arc
/*    */ {
/*    */   public asf()
/*    */   {
/* 12 */     super(false);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     int i = paramRandom.nextInt(5) + 7;
/* 20 */     int j = i - paramRandom.nextInt(2) - 3;
/* 21 */     int k = i - j;
/* 22 */     int m = 1 + paramRandom.nextInt(k + 1);
/*    */     
/* 24 */     int n = 1;
/*    */     
/* 26 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) {
/* 27 */       return false;
/*    */     }
/*    */     
/*    */     int i4;
/* 31 */     for (int i1 = paramInt2; (i1 <= paramInt2 + 1 + i) && (n != 0); i1++)
/*    */     {
/* 33 */       i2 = 1;
/* 34 */       if (i1 - paramInt2 < j) {
/* 35 */         i2 = 0;
/*    */       } else {
/* 37 */         i2 = m;
/*    */       }
/* 39 */       for (i3 = paramInt1 - i2; (i3 <= paramInt1 + i2) && (n != 0); i3++) {
/* 40 */         for (i4 = paramInt3 - i2; (i4 <= paramInt3 + i2) && (n != 0); i4++) {
/* 41 */           if ((i1 >= 0) && (i1 < 256)) {
/* 42 */             aji localaji3 = paramahb.a(i3, i1, i4);
/* 43 */             if (!a(localaji3)) n = 0;
/*    */           } else {
/* 45 */             n = 0;
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 51 */     if (n == 0) { return false;
/*    */     }
/*    */     
/* 54 */     aji localaji1 = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/* 55 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d)) || (paramInt2 >= 256 - i - 1)) {
/* 56 */       return false;
/*    */     }
/* 58 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*    */     
/*    */ 
/* 61 */     int i2 = 0;
/* 62 */     for (int i3 = paramInt2 + i; i3 >= paramInt2 + j; i3--)
/*    */     {
/* 64 */       for (i4 = paramInt1 - i2; i4 <= paramInt1 + i2; i4++) {
/* 65 */         int i5 = i4 - paramInt1;
/* 66 */         for (int i6 = paramInt3 - i2; i6 <= paramInt3 + i2; i6++) {
/* 67 */           int i7 = i6 - paramInt3;
/* 68 */           if (((Math.abs(i5) != i2) || (Math.abs(i7) != i2) || (i2 <= 0)) && 
/* 69 */             (!paramahb.a(i4, i3, i6).j())) {
/* 70 */             a(paramahb, i4, i3, i6, ajn.t, 1);
/*    */           }
/*    */         }
/*    */       }
/* 74 */       if ((i2 >= 1) && (i3 == paramInt2 + j + 1)) {
/* 75 */         i2--;
/* 76 */       } else if (i2 < m) {
/* 77 */         i2++;
/*    */       }
/*    */     }
/* 80 */     for (i3 = 0; i3 < i - 1; i3++) {
/* 81 */       aji localaji2 = paramahb.a(paramInt1, paramInt2 + i3, paramInt3);
/* 82 */       if ((localaji2.o() == awt.a) || (localaji2.o() == awt.j)) a(paramahb, paramInt1, paramInt2 + i3, paramInt3, ajn.r, 1);
/*    */     }
/* 84 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */