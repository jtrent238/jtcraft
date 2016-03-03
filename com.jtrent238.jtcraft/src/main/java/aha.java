/*    */ 
/*    */ public class aha
/*    */ {
/*  4 */   private static int[] a = new int[65536];
/*    */   
/*    */   public static void a(int[] paramArrayOfInt) {
/*  7 */     a = paramArrayOfInt;
/*    */   }
/*    */   
/*    */   public static int a(double paramDouble1, double paramDouble2) {
/* 11 */     paramDouble2 *= paramDouble1;
/* 12 */     int i = (int)((1.0D - paramDouble1) * 255.0D);
/* 13 */     int j = (int)((1.0D - paramDouble2) * 255.0D);
/* 14 */     return a[(j << 8 | i)];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */