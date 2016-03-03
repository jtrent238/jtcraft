/*    */ 
/*    */ 
/*    */ 
/*    */ public class axf
/*    */   extends axn
/*    */ {
/*  7 */   private ahu[] c = { ahu.q, ahu.q, ahu.q, ahu.X, ahu.X, ahu.p };
/*    */   
/*    */ 
/*    */ 
/* 11 */   private ahu[] d = { ahu.s, ahu.R, ahu.r, ahu.p, ahu.P, ahu.u };
/*    */   
/*    */ 
/*    */ 
/* 15 */   private ahu[] e = { ahu.s, ahu.r, ahu.t, ahu.p };
/*    */   
/*    */ 
/*    */ 
/* 19 */   private ahu[] f = { ahu.A, ahu.A, ahu.A, ahu.S };
/*    */   
/*    */ 
/*    */ 
/*    */   public axf(long paramLong, axn paramaxn, ahm paramahm)
/*    */   {
/* 25 */     super(paramLong);
/* 26 */     this.a = paramaxn;
/*    */     
/* 28 */     if (paramahm == ahm.f) {
/* 29 */       this.c = new ahu[] { ahu.q, ahu.s, ahu.r, ahu.u, ahu.p, ahu.t };
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 37 */     int[] arrayOfInt1 = this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*    */     
/* 39 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 40 */     for (int i = 0; i < paramInt4; i++) {
/* 41 */       for (int j = 0; j < paramInt3; j++) {
/* 42 */         a(j + paramInt1, i + paramInt2);
/* 43 */         int k = arrayOfInt1[(j + i * paramInt3)];
/* 44 */         int m = (k & 0xF00) >> 8;
/* 45 */         k &= 0xF0FF;
/* 46 */         if (b(k)) {
/* 47 */           arrayOfInt2[(j + i * paramInt3)] = k;
/* 48 */         } else if (k == ahu.C.ay) {
/* 49 */           arrayOfInt2[(j + i * paramInt3)] = k;
/* 50 */         } else if (k == 1) {
/* 51 */           if (m > 0) {
/* 52 */             if (a(3) == 0) {
/* 53 */               arrayOfInt2[(j + i * paramInt3)] = ahu.ab.ay;
/*    */             } else {
/* 55 */               arrayOfInt2[(j + i * paramInt3)] = ahu.aa.ay;
/*    */             }
/*    */           } else {
/* 58 */             arrayOfInt2[(j + i * paramInt3)] = this.c[a(this.c.length)].ay;
/*    */           }
/* 60 */         } else if (k == 2) {
/* 61 */           if (m > 0) {
/* 62 */             arrayOfInt2[(j + i * paramInt3)] = ahu.J.ay;
/*    */           } else {
/* 64 */             arrayOfInt2[(j + i * paramInt3)] = this.d[a(this.d.length)].ay;
/*    */           }
/* 66 */         } else if (k == 3) {
/* 67 */           if (m > 0) {
/* 68 */             arrayOfInt2[(j + i * paramInt3)] = ahu.U.ay;
/*    */           } else {
/* 70 */             arrayOfInt2[(j + i * paramInt3)] = this.e[a(this.e.length)].ay;
/*    */           }
/* 72 */         } else if (k == 4) {
/* 73 */           arrayOfInt2[(j + i * paramInt3)] = this.f[a(this.f.length)].ay;
/*    */         } else {
/* 75 */           arrayOfInt2[(j + i * paramInt3)] = ahu.C.ay;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 80 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */