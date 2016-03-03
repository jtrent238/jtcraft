/*    */ public class axd
/*    */   extends axn
/*    */ {
/*    */   public axd(long paramLong, axn paramaxn)
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
/* 21 */         int i2 = arrayOfInt1[(i1 + 1 + (n + 1) * k)];
/* 22 */         a(i1 + paramInt1, n + paramInt2);
/* 23 */         if (i2 == 0) {
/* 24 */           arrayOfInt2[(i1 + n * paramInt3)] = 0;
/*    */         } else {
/* 26 */           int i3 = a(6);
/* 27 */           if (i3 == 0) { i3 = 4;
/* 28 */           } else if (i3 <= 1) i3 = 3; else
/* 29 */             i3 = 1;
/* 30 */           arrayOfInt2[(i1 + n * paramInt3)] = i3;
/*    */         }
/*    */       }
/*    */     }
/* 34 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */