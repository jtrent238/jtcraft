/*    */ 
/*    */ 
/*    */ public class awx
/*    */   extends axn
/*    */ {
/*    */   public awx(long paramLong, axn paramaxn)
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
/* 23 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * (paramInt3 + 2))];
/* 24 */         int i3 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * (paramInt3 + 2))];
/* 25 */         int i4 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * (paramInt3 + 2))];
/* 26 */         int i5 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * (paramInt3 + 2))];
/*    */         
/* 28 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 29 */         int i7 = 0;
/* 30 */         if (i2 == 0) i7++;
/* 31 */         if (i3 == 0) i7++;
/* 32 */         if (i4 == 0) i7++;
/* 33 */         if (i5 == 0) { i7++;
/*    */         }
/* 35 */         if ((i6 == 0) && (i7 > 3)) {
/* 36 */           arrayOfInt2[(i1 + n * paramInt3)] = ahu.M.ay;
/*    */         } else {
/* 38 */           arrayOfInt2[(i1 + n * paramInt3)] = i6;
/*    */         }
/*    */       }
/*    */     }
/* 42 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */