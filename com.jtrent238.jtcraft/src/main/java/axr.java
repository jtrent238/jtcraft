/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public class axr
/*     */   extends axn
/*     */ {
/*   8 */   private static final Logger c = ;
/*     */   private axn d;
/*     */   
/*     */   public axr(long paramLong, axn paramaxn1, axn paramaxn2) {
/*  12 */     super(paramLong);
/*  13 */     this.a = paramaxn1;
/*  14 */     this.d = paramaxn2;
/*     */   }
/*     */   
/*     */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  19 */     int[] arrayOfInt1 = this.a.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*  20 */     int[] arrayOfInt2 = this.d.a(paramInt1 - 1, paramInt2 - 1, paramInt3 + 2, paramInt4 + 2);
/*     */     
/*  22 */     int[] arrayOfInt3 = axl.a(paramInt3 * paramInt4);
/*  23 */     for (int i = 0; i < paramInt4; i++) {
/*  24 */       for (int j = 0; j < paramInt3; j++) {
/*  25 */         a(j + paramInt1, i + paramInt2);
/*  26 */         int k = arrayOfInt1[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  27 */         int m = arrayOfInt2[(j + 1 + (i + 1) * (paramInt3 + 2))];
/*  28 */         int n = (m - 2) % 29 == 0 ? 1 : 0;
/*  29 */         if (k > 255) {
/*  30 */           c.debug("old! " + k);
/*     */         }
/*  32 */         if ((k != 0) && (m >= 2) && ((m - 2) % 29 == 1) && (k < 128)) {
/*  33 */           if (ahu.d(k + 128) != null) {
/*  34 */             arrayOfInt3[(j + i * paramInt3)] = (k + 128);
/*     */           } else {
/*  36 */             arrayOfInt3[(j + i * paramInt3)] = k;
/*     */           }
/*  38 */         } else if ((a(3) == 0) || (n != 0)) {
/*  39 */           int i1 = k;
/*  40 */           int i2; if (k == ahu.q.ay) {
/*  41 */             i1 = ahu.F.ay;
/*  42 */           } else if (k == ahu.s.ay) {
/*  43 */             i1 = ahu.G.ay;
/*  44 */           } else if (k == ahu.P.ay) {
/*  45 */             i1 = ahu.Q.ay;
/*  46 */           } else if (k == ahu.R.ay) {
/*  47 */             i1 = ahu.p.ay;
/*  48 */           } else if (k == ahu.t.ay) {
/*  49 */             i1 = ahu.H.ay;
/*  50 */           } else if (k == ahu.U.ay) {
/*  51 */             i1 = ahu.V.ay;
/*  52 */           } else if (k == ahu.S.ay) {
/*  53 */             i1 = ahu.T.ay;
/*  54 */           } else if (k == ahu.p.ay) {
/*  55 */             if (a(3) == 0) {
/*  56 */               i1 = ahu.G.ay;
/*     */             } else {
/*  58 */               i1 = ahu.s.ay;
/*     */             }
/*  60 */           } else if (k == ahu.A.ay) {
/*  61 */             i1 = ahu.B.ay;
/*  62 */           } else if (k == ahu.J.ay) {
/*  63 */             i1 = ahu.K.ay;
/*  64 */           } else if (k == ahu.o.ay) {
/*  65 */             i1 = ahu.M.ay;
/*  66 */           } else if (k == ahu.r.ay) {
/*  67 */             i1 = ahu.W.ay;
/*  68 */           } else if (k == ahu.X.ay) {
/*  69 */             i1 = ahu.Y.ay;
/*  70 */           } else if (a(k, ahu.aa.ay)) {
/*  71 */             i1 = ahu.Z.ay;
/*  72 */           } else if ((k == ahu.M.ay) && 
/*  73 */             (a(3) == 0)) {
/*  74 */             i2 = a(2);
/*  75 */             if (i2 == 0) {
/*  76 */               i1 = ahu.p.ay;
/*     */             } else {
/*  78 */               i1 = ahu.s.ay;
/*     */             }
/*     */           }
/*     */           
/*  82 */           if ((n != 0) && (i1 != k)) {
/*  83 */             if (ahu.d(i1 + 128) != null) {
/*  84 */               i1 += 128;
/*     */             } else {
/*  86 */               i1 = k;
/*     */             }
/*     */           }
/*  89 */           if (i1 == k) {
/*  90 */             arrayOfInt3[(j + i * paramInt3)] = k;
/*     */           } else {
/*  92 */             i2 = arrayOfInt1[(j + 1 + (i + 1 - 1) * (paramInt3 + 2))];
/*  93 */             int i3 = arrayOfInt1[(j + 1 + 1 + (i + 1) * (paramInt3 + 2))];
/*  94 */             int i4 = arrayOfInt1[(j + 1 - 1 + (i + 1) * (paramInt3 + 2))];
/*  95 */             int i5 = arrayOfInt1[(j + 1 + (i + 1 + 1) * (paramInt3 + 2))];
/*  96 */             int i6 = 0;
/*  97 */             if (a(i2, k)) {
/*  98 */               i6++;
/*     */             }
/* 100 */             if (a(i3, k)) {
/* 101 */               i6++;
/*     */             }
/* 103 */             if (a(i4, k)) {
/* 104 */               i6++;
/*     */             }
/* 106 */             if (a(i5, k)) {
/* 107 */               i6++;
/*     */             }
/* 109 */             if (i6 >= 3) {
/* 110 */               arrayOfInt3[(j + i * paramInt3)] = i1;
/*     */             } else {
/* 112 */               arrayOfInt3[(j + i * paramInt3)] = k;
/*     */             }
/*     */           }
/*     */         } else {
/* 116 */           arrayOfInt3[(j + i * paramInt3)] = k;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 121 */     return arrayOfInt3;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */