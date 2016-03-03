/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asn
/*    */   extends arc
/*    */ {
/*    */   public asn(boolean paramBoolean)
/*    */   {
/* 12 */     super(paramBoolean);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     int i = paramRandom.nextInt(4) + 6;
/* 20 */     int j = 1 + paramRandom.nextInt(2);
/* 21 */     int k = i - j;
/* 22 */     int m = 2 + paramRandom.nextInt(2);
/*    */     
/* 24 */     int n = 1;
/*    */     
/* 26 */     if ((paramInt2 < 1) || (paramInt2 + i + 1 > 256)) {
/* 27 */       return false;
/*    */     }
/*    */     
/*    */ 
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
/* 42 */             aji localaji2 = paramahb.a(i3, i1, i4);
/* 43 */             if ((localaji2.o() != awt.a) && (localaji2.o() != awt.j)) n = 0;
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
/* 55 */     if (((localaji1 != ajn.c) && (localaji1 != ajn.d) && (localaji1 != ajn.ak)) || (paramInt2 >= 256 - i - 1)) {
/* 56 */       return false;
/*    */     }
/* 58 */     a(paramahb, paramInt1, paramInt2 - 1, paramInt3, ajn.d);
/*    */     
/*    */ 
/* 61 */     int i2 = paramRandom.nextInt(2);
/* 62 */     int i3 = 1;
/* 63 */     int i4 = 0;
/* 64 */     for (int i5 = 0; i5 <= k; i5++)
/*    */     {
/* 66 */       i6 = paramInt2 + i - i5;
/*    */       
/* 68 */       for (int i7 = paramInt1 - i2; i7 <= paramInt1 + i2; i7++) {
/* 69 */         int i8 = i7 - paramInt1;
/* 70 */         for (int i9 = paramInt3 - i2; i9 <= paramInt3 + i2; i9++) {
/* 71 */           int i10 = i9 - paramInt3;
/* 72 */           if (((Math.abs(i8) != i2) || (Math.abs(i10) != i2) || (i2 <= 0)) && 
/* 73 */             (!paramahb.a(i7, i6, i9).j())) {
/* 74 */             a(paramahb, i7, i6, i9, ajn.t, 1);
/*    */           }
/*    */         }
/*    */       }
/* 78 */       if (i2 >= i3) {
/* 79 */         i2 = i4;
/* 80 */         i4 = 1;
/* 81 */         i3++;
/* 82 */         if (i3 > m) {
/* 83 */           i3 = m;
/*    */         }
/*    */       } else {
/* 86 */         i2++;
/*    */       }
/*    */     }
/* 89 */     i5 = paramRandom.nextInt(3);
/* 90 */     for (int i6 = 0; i6 < i - i5; i6++) {
/* 91 */       aji localaji3 = paramahb.a(paramInt1, paramInt2 + i6, paramInt3);
/* 92 */       if ((localaji3.o() == awt.a) || (localaji3.o() == awt.j)) a(paramahb, paramInt1, paramInt2 + i6, paramInt3, ajn.r, 1);
/*    */     }
/* 94 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */