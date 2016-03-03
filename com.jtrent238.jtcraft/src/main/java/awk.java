/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awk
/*    */   extends awp
/*    */ {
/*    */   private awj[] a;
/*    */   private int b;
/*    */   
/*    */   public awk(Random paramRandom, int paramInt)
/*    */   {
/* 16 */     this.b = paramInt;
/* 17 */     this.a = new awj[paramInt];
/* 18 */     for (int i = 0; i < paramInt; i++) {
/* 19 */       this.a[i] = new awj(paramRandom);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3)
/*    */   {
/* 49 */     if (paramArrayOfDouble == null) paramArrayOfDouble = new double[paramInt4 * paramInt5 * paramInt6]; else {
/* 50 */       for (int i = 0; i < paramArrayOfDouble.length; i++)
/* 51 */         paramArrayOfDouble[i] = 0.0D;
/*    */     }
/* 53 */     double d1 = 1.0D;
/*    */     
/* 55 */     for (int j = 0; j < this.b; j++) {
/* 56 */       double d2 = paramInt1 * d1 * paramDouble1;
/* 57 */       double d3 = paramInt2 * d1 * paramDouble2;
/* 58 */       double d4 = paramInt3 * d1 * paramDouble3;
/* 59 */       long l1 = qh.d(d2);
/* 60 */       long l2 = qh.d(d4);
/* 61 */       d2 -= l1;
/* 62 */       d4 -= l2;
/* 63 */       l1 %= 16777216L;
/* 64 */       l2 %= 16777216L;
/* 65 */       d2 += l1;
/* 66 */       d4 += l2;
/* 67 */       this.a[j].a(paramArrayOfDouble, d2, d3, d4, paramInt4, paramInt5, paramInt6, paramDouble1 * d1, paramDouble2 * d1, paramDouble3 * d1, d1);
/* 68 */       d1 /= 2.0D;
/*    */     }
/*    */     
/* 71 */     return paramArrayOfDouble;
/*    */   }
/*    */   
/*    */   public double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 75 */     return a(paramArrayOfDouble, paramInt1, 10, paramInt2, paramInt3, 1, paramInt4, paramDouble1, 1.0D, paramDouble2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */