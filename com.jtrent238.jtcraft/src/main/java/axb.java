/*    */ public class axb
/*    */   extends axn
/*    */ {
/*    */   public axb(long paramLong, axn paramaxn)
/*    */   {
/*  6 */     super(paramLong);
/*  7 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 12 */     int i = paramInt1 - 1;
/* 13 */     int j = paramInt2 - 1;
/* 14 */     int k = paramInt3 + 2;
/* 15 */     int m = paramInt4 + 2;
/* 16 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*    */     
/* 18 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 19 */     for (int n = 0; n < paramInt4; n++) {
/* 20 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 21 */         int i2 = arrayOfInt1[(i1 + 0 + (n + 0) * k)];
/* 22 */         int i3 = arrayOfInt1[(i1 + 2 + (n + 0) * k)];
/* 23 */         int i4 = arrayOfInt1[(i1 + 0 + (n + 2) * k)];
/* 24 */         int i5 = arrayOfInt1[(i1 + 2 + (n + 2) * k)];
/* 25 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 26 */         a(i1 + paramInt1, n + paramInt2);
/* 27 */         if ((i6 == 0) && ((i2 != 0) || (i3 != 0) || (i4 != 0) || (i5 != 0))) {
/* 28 */           int i7 = 1;
/* 29 */           int i8 = 1;
/* 30 */           if ((i2 != 0) && (a(i7++) == 0)) i8 = i2;
/* 31 */           if ((i3 != 0) && (a(i7++) == 0)) i8 = i3;
/* 32 */           if ((i4 != 0) && (a(i7++) == 0)) i8 = i4;
/* 33 */           if ((i5 != 0) && (a(i7++) == 0)) i8 = i5;
/* 34 */           if (a(3) == 0) {
/* 35 */             arrayOfInt2[(i1 + n * paramInt3)] = i8;
/*    */           }
/* 37 */           else if (i8 == 4) arrayOfInt2[(i1 + n * paramInt3)] = 4; else {
/* 38 */             arrayOfInt2[(i1 + n * paramInt3)] = 0;
/*    */           }
/* 40 */         } else if ((i6 > 0) && ((i2 == 0) || (i3 == 0) || (i4 == 0) || (i5 == 0))) {
/* 41 */           if (a(5) == 0) {
/* 42 */             if (i6 == 4) arrayOfInt2[(i1 + n * paramInt3)] = 4; else
/* 43 */               arrayOfInt2[(i1 + n * paramInt3)] = 0;
/* 44 */           } else arrayOfInt2[(i1 + n * paramInt3)] = i6;
/*    */         } else {
/* 46 */           arrayOfInt2[(i1 + n * paramInt3)] = i6;
/*    */         }
/*    */       }
/*    */     }
/* 50 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */