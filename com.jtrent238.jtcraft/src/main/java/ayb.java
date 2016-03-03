/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayb
/*    */   extends axn
/*    */ {
/*    */   public ayb(long paramLong, axn paramaxn)
/*    */   {
/* 11 */     super(paramLong);
/* 12 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 17 */     paramInt1 -= 2;
/* 18 */     paramInt2 -= 2;
/* 19 */     int i = paramInt1 >> 2;
/* 20 */     int j = paramInt2 >> 2;
/* 21 */     int k = (paramInt3 >> 2) + 2;
/* 22 */     int m = (paramInt4 >> 2) + 2;
/* 23 */     int[] arrayOfInt1 = this.a.a(i, j, k, m);
/*    */     
/* 25 */     int n = k - 1 << 2;
/* 26 */     int i1 = m - 1 << 2;
/*    */     
/* 28 */     int[] arrayOfInt2 = axl.a(n * i1);
/* 29 */     for (int i2 = 0; i2 < m - 1; i2++)
/*    */     {
/* 31 */       i3 = 0;
/* 32 */       int i4 = arrayOfInt1[(i3 + 0 + (i2 + 0) * k)];
/* 33 */       int i5 = arrayOfInt1[(i3 + 0 + (i2 + 1) * k)];
/* 34 */       for (; i3 < k - 1; i3++) {
/* 35 */         double d1 = 3.6D;
/* 36 */         a(i3 + i << 2, i2 + j << 2);
/* 37 */         double d2 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 38 */         double d3 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */         
/* 40 */         a(i3 + i + 1 << 2, i2 + j << 2);
/* 41 */         double d4 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 42 */         double d5 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/*    */         
/* 44 */         a(i3 + i << 2, i2 + j + 1 << 2);
/* 45 */         double d6 = (a(1024) / 1024.0D - 0.5D) * 3.6D;
/* 46 */         double d7 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */         
/* 48 */         a(i3 + i + 1 << 2, i2 + j + 1 << 2);
/* 49 */         double d8 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/* 50 */         double d9 = (a(1024) / 1024.0D - 0.5D) * 3.6D + 4.0D;
/*    */         
/* 52 */         int i6 = arrayOfInt1[(i3 + 1 + (i2 + 0) * k)] & 0xFF;
/* 53 */         int i7 = arrayOfInt1[(i3 + 1 + (i2 + 1) * k)] & 0xFF;
/*    */         
/* 55 */         for (int i8 = 0; i8 < 4; i8++) {
/* 56 */           int i9 = ((i2 << 2) + i8) * n + (i3 << 2);
/* 57 */           for (int i10 = 0; i10 < 4; i10++) {
/* 58 */             double d10 = (i8 - d3) * (i8 - d3) + (i10 - d2) * (i10 - d2);
/* 59 */             double d11 = (i8 - d5) * (i8 - d5) + (i10 - d4) * (i10 - d4);
/* 60 */             double d12 = (i8 - d7) * (i8 - d7) + (i10 - d6) * (i10 - d6);
/* 61 */             double d13 = (i8 - d9) * (i8 - d9) + (i10 - d8) * (i10 - d8);
/*    */             
/* 63 */             if ((d10 < d11) && (d10 < d12) && (d10 < d13)) {
/* 64 */               arrayOfInt2[(i9++)] = i4;
/* 65 */             } else if ((d11 < d10) && (d11 < d12) && (d11 < d13)) {
/* 66 */               arrayOfInt2[(i9++)] = i6;
/* 67 */             } else if ((d12 < d10) && (d12 < d11) && (d12 < d13)) {
/* 68 */               arrayOfInt2[(i9++)] = i5;
/*    */             } else {
/* 70 */               arrayOfInt2[(i9++)] = i7;
/*    */             }
/*    */           }
/*    */         }
/*    */         
/* 75 */         i4 = i6;
/* 76 */         i5 = i7;
/*    */       }
/*    */     }
/*    */     
/* 80 */     int[] arrayOfInt3 = axl.a(paramInt3 * paramInt4);
/* 81 */     for (int i3 = 0; i3 < paramInt4; i3++) {
/* 82 */       System.arraycopy(arrayOfInt2, (i3 + (paramInt2 & 0x3)) * n + (paramInt1 & 0x3), arrayOfInt3, i3 * paramInt3, paramInt3);
/*    */     }
/* 84 */     return arrayOfInt3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */