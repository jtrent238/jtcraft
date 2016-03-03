/*    */ 
/*    */ 
/*    */ public class axu
/*    */   extends axn
/*    */ {
/*    */   public axu(long paramLong, axn paramaxn)
/*    */   {
/*  8 */     super(paramLong);
/*  9 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 14 */     int i = paramInt1 - 1;
/* 15 */     int j = paramInt2 - 1;
/* 16 */     int k = paramInt3 + 2;
/* 17 */     int m = paramInt4 + 2;
/* 18 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*    */     
/* 20 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 21 */     for (int n = 0; n < paramInt4; n++) {
/* 22 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 23 */         int i2 = c(arrayOfInt1[(i1 + 0 + (n + 1) * k)]);
/* 24 */         int i3 = c(arrayOfInt1[(i1 + 2 + (n + 1) * k)]);
/* 25 */         int i4 = c(arrayOfInt1[(i1 + 1 + (n + 0) * k)]);
/* 26 */         int i5 = c(arrayOfInt1[(i1 + 1 + (n + 2) * k)]);
/* 27 */         int i6 = c(arrayOfInt1[(i1 + 1 + (n + 1) * k)]);
/* 28 */         if ((i6 != i2) || (i6 != i4) || (i6 != i3) || (i6 != i5)) {
/* 29 */           arrayOfInt2[(i1 + n * paramInt3)] = ahu.v.ay;
/*    */         } else {
/* 31 */           arrayOfInt2[(i1 + n * paramInt3)] = -1;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 36 */     return arrayOfInt2;
/*    */   }
/*    */   
/*    */   private int c(int paramInt) {
/* 40 */     if (paramInt >= 2) {
/* 41 */       return 2 + (paramInt & 0x1);
/*    */     }
/* 43 */     return paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */