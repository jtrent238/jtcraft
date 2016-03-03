/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayc
/*    */   extends axn
/*    */ {
/*    */   public ayc(long paramLong, axn paramaxn)
/*    */   {
/* 10 */     super(paramLong);
/* 11 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 16 */     int i = paramInt1 >> 1;
/* 17 */     int j = paramInt2 >> 1;
/* 18 */     int k = (paramInt3 >> 1) + 2;
/* 19 */     int m = (paramInt4 >> 1) + 2;
/* 20 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*    */     
/* 22 */     int n = k - 1 << 1;
/* 23 */     int i1 = m - 1 << 1;
/*    */     
/* 25 */     int[] arrayOfInt2 = axl.a(n * i1);
/*    */     
/* 27 */     for (int i2 = 0; i2 < m - 1; i2++) {
/* 28 */       i3 = (i2 << 1) * n;
/*    */       
/* 30 */       int i4 = 0;
/* 31 */       int i5 = arrayOfInt1[(i4 + 0 + (i2 + 0) * k)];
/* 32 */       int i6 = arrayOfInt1[(i4 + 0 + (i2 + 1) * k)];
/* 33 */       for (; i4 < k - 1; i4++) {
/* 34 */         a(i4 + i << 1, i2 + j << 1);
/*    */         
/* 36 */         int i7 = arrayOfInt1[(i4 + 1 + (i2 + 0) * k)];
/* 37 */         int i8 = arrayOfInt1[(i4 + 1 + (i2 + 1) * k)];
/*    */         
/* 39 */         arrayOfInt2[i3] = i5;
/* 40 */         arrayOfInt2[(i3++ + n)] = a(new int[] { i5, i6 });
/* 41 */         arrayOfInt2[i3] = a(new int[] { i5, i7 });
/* 42 */         arrayOfInt2[(i3++ + n)] = b(i5, i7, i6, i8);
/*    */         
/* 44 */         i5 = i7;
/* 45 */         i6 = i8;
/*    */       }
/*    */     }
/*    */     
/* 49 */     int[] arrayOfInt3 = axl.a(paramInt3 * paramInt4);
/* 50 */     for (int i3 = 0; i3 < paramInt4; i3++) {
/* 51 */       System.arraycopy(arrayOfInt2, (i3 + (paramInt2 & 0x1)) * n + (paramInt1 & 0x1), arrayOfInt3, i3 * paramInt3, paramInt3);
/*    */     }
/* 53 */     return arrayOfInt3;
/*    */   }
/*    */   
/*    */   public static axn b(long paramLong, axn paramaxn, int paramInt) {
/* 57 */     Object localObject = paramaxn;
/* 58 */     for (int i = 0; i < paramInt; i++) {
/* 59 */       localObject = new ayc(paramLong + i, (axn)localObject);
/*    */     }
/* 61 */     return (axn)localObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */