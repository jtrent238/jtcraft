/*    */ 
/*    */ public class axq
/*    */   extends axn
/*    */ {
/*    */   public axq(long paramLong, axn paramaxn)
/*    */   {
/*  7 */     super(paramLong);
/*  8 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 13 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*    */     
/* 15 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 16 */     for (int i = 0; i < paramInt4; i++) {
/* 17 */       for (int j = 0; j < paramInt3; j++) {
/* 18 */         a(j + paramInt1, i + paramInt2);
/* 19 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/* 20 */         if (a(57) == 0) {
/* 21 */           if (k == ahu.p.ay) {
/* 22 */             arrayOfInt2[(j + i * paramInt3)] = (ahu.p.ay + 128);
/*    */           } else {
/* 24 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*    */           }
/*    */         } else {
/* 27 */           arrayOfInt2[(j + i * paramInt3)] = k;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 32 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */