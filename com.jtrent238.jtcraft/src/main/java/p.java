/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class p
/*    */ {
/* 12 */   public static final int[] a = { 0, -1, 0, 1 };
/*    */   
/*    */ 
/* 15 */   public static final int[] b = { 1, 0, -1, 0 };
/*    */   
/*    */ 
/*    */ 
/* 19 */   public static final String[] c = { "SOUTH", "WEST", "NORTH", "EAST" };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 24 */   public static final int[] d = { 3, 4, 2, 5 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 29 */   public static final int[] e = { -1, -1, 2, 0, 1, 3 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 34 */   public static final int[] f = { 2, 3, 0, 1 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 39 */   public static final int[] g = { 1, 2, 3, 0 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 44 */   public static final int[] h = { 3, 0, 1, 2 };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 49 */   public static final int[][] i = { { 1, 0, 3, 2, 5, 4 }, { 1, 0, 5, 4, 2, 3 }, { 1, 0, 2, 3, 4, 5 }, { 1, 0, 4, 5, 3, 2 } };
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
/*    */   public static int a(double paramDouble1, double paramDouble2)
/*    */   {
/* 69 */     if (qh.e((float)paramDouble1) > qh.e((float)paramDouble2)) {
/* 70 */       if (paramDouble1 > 0.0D) {
/* 71 */         return 1;
/*    */       }
/* 73 */       return 3;
/*    */     }
/*    */     
/* 76 */     if (paramDouble2 > 0.0D) {
/* 77 */       return 2;
/*    */     }
/* 79 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */