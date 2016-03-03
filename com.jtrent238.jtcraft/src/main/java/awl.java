/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awl
/*    */   extends awp
/*    */ {
/*    */   private awo[] a;
/*    */   private int b;
/*    */   
/*    */   public awl(Random paramRandom, int paramInt)
/*    */   {
/* 14 */     this.b = paramInt;
/* 15 */     this.a = new awo[paramInt];
/* 16 */     for (int i = 0; i < paramInt; i++) {
/* 17 */       this.a[i] = new awo(paramRandom);
/*    */     }
/*    */   }
/*    */   
/*    */   public double a(double paramDouble1, double paramDouble2)
/*    */   {
/* 23 */     double d1 = 0.0D;
/* 24 */     double d2 = 1.0D;
/*    */     
/* 26 */     for (int i = 0; i < this.b; i++) {
/* 27 */       d1 += this.a[i].a(paramDouble1 * d2, paramDouble2 * d2) / d2;
/* 28 */       d2 /= 2.0D;
/*    */     }
/*    */     
/* 31 */     return d1;
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
/*    */   public double[] a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5)
/*    */   {
/* 47 */     return a(paramArrayOfDouble, paramDouble1, paramDouble2, paramInt1, paramInt2, paramDouble3, paramDouble4, paramDouble5, 0.5D);
/*    */   }
/*    */   
/*    */   public double[] a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*    */   {
/* 52 */     if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length < paramInt1 * paramInt2)) paramArrayOfDouble = new double[paramInt1 * paramInt2]; else {
/* 53 */       for (int i = 0; i < paramArrayOfDouble.length; i++)
/* 54 */         paramArrayOfDouble[i] = 0.0D;
/*    */     }
/* 56 */     double d1 = 1.0D;
/* 57 */     double d2 = 1.0D;
/* 58 */     for (int j = 0; j < this.b; j++) {
/* 59 */       this.a[j].a(paramArrayOfDouble, paramDouble1, paramDouble2, paramInt1, paramInt2, paramDouble3 * d2 * d1, paramDouble4 * d2 * d1, 0.55D / d1);
/* 60 */       d2 *= paramDouble5;
/* 61 */       d1 *= paramDouble6;
/*    */     }
/*    */     
/* 64 */     return paramArrayOfDouble;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\awl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */