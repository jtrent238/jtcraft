/*    */ 
/*    */ 
/*    */ public class axe
/*    */   extends axn
/*    */ {
/*    */   public axe(long paramLong, axn paramaxn)
/*    */   {
/*  8 */     super(paramLong);
/*  9 */     this.a = paramaxn;
/*    */   }
/*    */   
/*    */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 14 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*    */     
/* 16 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/* 17 */     for (int i = 0; i < paramInt4; i++) {
/* 18 */       for (int j = 0; j < paramInt3; j++) {
/* 19 */         a(j + paramInt1, i + paramInt2);
/* 20 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/* 21 */         if ((!a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.r.ay, ahu.I.ay)) && 
/* 22 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.aa.ay, ahu.Z.ay)) && 
/* 23 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.ab.ay, ahu.Z.ay)) && 
/* 24 */           (!b(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.U.ay, ahu.t.ay))) { int m;
/* 25 */           int n; int i1; int i2; if (k == ahu.q.ay) {
/* 26 */             m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/* 27 */             n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/* 28 */             i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/* 29 */             i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/* 30 */             if ((m == ahu.A.ay) || (n == ahu.A.ay) || (i1 == ahu.A.ay) || (i2 == ahu.A.ay)) {
/* 31 */               arrayOfInt2[(j + i * paramInt3)] = ahu.W.ay;
/*    */             } else {
/* 33 */               arrayOfInt2[(j + i * paramInt3)] = k;
/*    */             }
/* 35 */           } else if (k == ahu.u.ay)
/*    */           {
/* 37 */             m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/* 38 */             n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/* 39 */             i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/* 40 */             i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/* 41 */             if ((m == ahu.q.ay) || (n == ahu.q.ay) || (i1 == ahu.q.ay) || (i2 == ahu.q.ay) || (m == ahu.S.ay) || (n == ahu.S.ay) || (i1 == ahu.S.ay) || (i2 == ahu.S.ay) || (m == ahu.A.ay) || (n == ahu.A.ay) || (i1 == ahu.A.ay) || (i2 == ahu.A.ay))
/*    */             {
/* 43 */               arrayOfInt2[(j + i * paramInt3)] = ahu.p.ay;
/* 44 */             } else if ((m == ahu.J.ay) || (i2 == ahu.J.ay) || (n == ahu.J.ay) || (i1 == ahu.J.ay)) {
/* 45 */               arrayOfInt2[(j + i * paramInt3)] = ahu.L.ay;
/*    */             } else {
/* 47 */               arrayOfInt2[(j + i * paramInt3)] = k;
/*    */             }
/*    */           } else {
/* 50 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 55 */     return arrayOfInt2;
/*    */   }
/*    */   
/*    */   private boolean a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 59 */     if (a(paramInt4, paramInt5)) {
/* 60 */       int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/* 61 */       int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 62 */       int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 63 */       int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/* 64 */       if ((!b(i, paramInt5)) || (!b(j, paramInt5)) || (!b(k, paramInt5)) || (!b(m, paramInt5))) {
/* 65 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt6;
/*    */       } else {
/* 67 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*    */       }
/* 69 */       return true;
/*    */     }
/* 71 */     return false;
/*    */   }
/*    */   
/*    */   private boolean b(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/* 75 */     if (paramInt4 == paramInt5) {
/* 76 */       int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/* 77 */       int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 78 */       int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/* 79 */       int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/* 80 */       if ((!a(i, paramInt5)) || (!a(j, paramInt5)) || (!a(k, paramInt5)) || (!a(m, paramInt5))) {
/* 81 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt6;
/*    */       } else {
/* 83 */         paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*    */       }
/* 85 */       return true;
/*    */     }
/* 87 */     return false;
/*    */   }
/*    */   
/*    */   private boolean b(int paramInt1, int paramInt2) {
/* 91 */     if (a(paramInt1, paramInt2)) {
/* 92 */       return true;
/*    */     }
/* 94 */     if ((ahu.d(paramInt1) != null) && (ahu.d(paramInt2) != null)) {
/* 95 */       ahw localahw1 = ahu.d(paramInt1).m();
/* 96 */       ahw localahw2 = ahu.d(paramInt2).m();
/* 97 */       return (localahw1 == localahw2) || (localahw1 == ahw.c) || (localahw2 == ahw.c);
/*    */     }
/* 99 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */