/*    */ 
/*    */ public class axv
/*    */   extends axn
/*    */ {
/*    */   private axn c;
/*    */   private axn d;
/*    */   
/*    */   public axv(long paramLong, axn paramaxn1, axn paramaxn2)
/*    */   {
/* 10 */     super(paramLong);
/* 11 */     this.c = paramaxn1;
/* 12 */     this.d = paramaxn2;
/*    */   }
/*    */   
/*    */   public void a(long paramLong)
/*    */   {
/* 17 */     this.c.a(paramLong);
/* 18 */     this.d.a(paramLong);
/* 19 */     super.a(paramLong);
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 24 */     int[] arrayOfInt1 = this.c.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 25 */     int[] arrayOfInt2 = this.d.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     
/* 27 */     int[] arrayOfInt3 = axl.a(paramInt3 * paramInt4);
/* 28 */     for (int i = 0; i < paramInt3 * paramInt4; i++) {
/* 29 */       if ((arrayOfInt1[i] == ahu.o.ay) || (arrayOfInt1[i] == ahu.M.ay)) {
/* 30 */         arrayOfInt3[i] = arrayOfInt1[i];
/*    */       }
/* 32 */       else if (arrayOfInt2[i] == ahu.v.ay) {
/* 33 */         if (arrayOfInt1[i] == ahu.A.ay) { arrayOfInt3[i] = ahu.z.ay;
/* 34 */         } else if ((arrayOfInt1[i] == ahu.C.ay) || (arrayOfInt1[i] == ahu.D.ay)) arrayOfInt3[i] = ahu.D.ay; else
/* 35 */           arrayOfInt2[i] &= 0xFF;
/*    */       } else {
/* 37 */         arrayOfInt3[i] = arrayOfInt1[i];
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 42 */     return arrayOfInt3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */