/*     */ 
/*     */ public class axw
/*     */   extends axn
/*     */ {
/*     */   public axw(long paramLong, axn paramaxn)
/*     */   {
/*   7 */     super(paramLong);
/*   8 */     this.a = paramaxn;
/*     */   }
/*     */   
/*     */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  13 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*     */     
/*  15 */     int[] arrayOfInt2 = axl.a(paramInt3 * paramInt4);
/*  16 */     for (int i = 0; i < paramInt4; i++) {
/*  17 */       for (int j = 0; j < paramInt3; j++) {
/*  18 */         a(j + paramInt1, i + paramInt2);
/*  19 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  20 */         ahu localahu = ahu.d(k);
/*  21 */         int m; int n; int i1; int i2; if (k == ahu.C.ay) {
/*  22 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  23 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  24 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  25 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  26 */           if ((m == ahu.o.ay) || (n == ahu.o.ay) || (i1 == ahu.o.ay) || (i2 == ahu.o.ay)) {
/*  27 */             arrayOfInt2[(j + i * paramInt3)] = ahu.D.ay;
/*     */           } else {
/*  29 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*     */           }
/*  31 */         } else if ((localahu != null) && (localahu.l() == aik.class)) {
/*  32 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  33 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  34 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  35 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  36 */           if ((!c(m)) || (!c(n)) || (!c(i1)) || (!c(i2))) {
/*  37 */             arrayOfInt2[(j + i * paramInt3)] = ahu.L.ay;
/*  38 */           } else if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  39 */             arrayOfInt2[(j + i * paramInt3)] = ahu.E.ay;
/*     */           } else {
/*  41 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*     */           }
/*  43 */         } else if ((k == ahu.r.ay) || (k == ahu.W.ay) || (k == ahu.I.ay)) {
/*  44 */           a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.N.ay);
/*  45 */         } else if ((localahu != null) && (localahu.j())) {
/*  46 */           a(arrayOfInt1, arrayOfInt2, j, i, paramInt3, k, ahu.O.ay);
/*  47 */         } else if ((k == ahu.Z.ay) || (k == ahu.aa.ay)) {
/*  48 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  49 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  50 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  51 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  52 */           if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  53 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*  54 */           } else if ((!d(m)) || (!d(n)) || (!d(i1)) || (!d(i2))) {
/*  55 */             arrayOfInt2[(j + i * paramInt3)] = ahu.q.ay;
/*     */           } else {
/*  57 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*     */           }
/*  59 */         } else if ((k != ahu.o.ay) && (k != ahu.M.ay) && (k != ahu.v.ay) && (k != ahu.u.ay)) {
/*  60 */           m = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  61 */           n = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  62 */           i1 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  63 */           i2 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  64 */           if ((b(m)) || (b(n)) || (b(i1)) || (b(i2))) {
/*  65 */             arrayOfInt2[(j + i * paramInt3)] = ahu.E.ay;
/*     */           } else {
/*  67 */             arrayOfInt2[(j + i * paramInt3)] = k;
/*     */           }
/*     */         }
/*     */         else {
/*  71 */           arrayOfInt2[(j + i * paramInt3)] = k;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  77 */     return arrayOfInt2;
/*     */   }
/*     */   
/*     */   private void a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*  81 */     if (b(paramInt4)) {
/*  82 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*  83 */       return;
/*     */     }
/*  85 */     int i = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 - 1) * (paramInt3 + 2))];
/*  86 */     int j = paramArrayOfInt1[(paramInt1 + 1 + 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  87 */     int k = paramArrayOfInt1[(paramInt1 + 1 - 1 + (paramInt2 + 1) * (paramInt3 + 2))];
/*  88 */     int m = paramArrayOfInt1[(paramInt1 + 1 + (paramInt2 + 1 + 1) * (paramInt3 + 2))];
/*  89 */     if ((b(i)) || (b(j)) || (b(k)) || (b(m))) {
/*  90 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt5;
/*     */     } else {
/*  92 */       paramArrayOfInt2[(paramInt1 + paramInt2 * paramInt3)] = paramInt4;
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean c(int paramInt) {
/*  97 */     if ((ahu.d(paramInt) != null) && (ahu.d(paramInt).l() == aik.class)) {
/*  98 */       return true;
/*     */     }
/*     */     
/* 101 */     return (paramInt == ahu.L.ay) || (paramInt == ahu.J.ay) || (paramInt == ahu.K.ay) || (paramInt == ahu.s.ay) || (paramInt == ahu.t.ay) || (b(paramInt));
/*     */   }
/*     */   
/*     */   private boolean d(int paramInt) {
/* 105 */     return (ahu.d(paramInt) != null) && ((ahu.d(paramInt) instanceof ail));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */