/*    */ 
/*    */ 
/*    */ 
/*    */ public class axs
/*    */   extends axn
/*    */ {
/*    */   public axs(long paramLong, axn paramaxn)
/*    */   {
/*  9 */     super(paramLong);
/* 10 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 15 */     int i = paramInt1 - 1;
/* 16 */     int j = paramInt2 - 1;
/* 17 */     int k = paramInt3 + 2;
/* 18 */     int m = paramInt4 + 2;
/* 19 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*    */     
/* 21 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 22 */     for (int n = 0; n < paramInt4; n++) {
/* 23 */       for (int i1 = 0; i1 < paramInt3; i1++) {
/* 24 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1 - 1) * (paramInt3 + 2))];
/* 25 */         int i3 = arrayOfInt1[(i1 + 1 + 1 + (n + 1) * (paramInt3 + 2))];
/* 26 */         int i4 = arrayOfInt1[(i1 + 1 - 1 + (n + 1) * (paramInt3 + 2))];
/* 27 */         int i5 = arrayOfInt1[(i1 + 1 + (n + 1 + 1) * (paramInt3 + 2))];
/*    */         
/* 29 */         int i6 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 30 */         arrayOfInt2[(i1 + n * paramInt3)] = i6;
/* 31 */         a(i1 + paramInt1, n + paramInt2);
/* 32 */         if ((i6 == 0) && (i2 == 0) && (i3 == 0) && (i4 == 0) && (i5 == 0) && (a(2) == 0)) {
/* 33 */           arrayOfInt2[(i1 + n * paramInt3)] = 1;
/*    */         }
/*    */       }
/*    */     }
/* 37 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */