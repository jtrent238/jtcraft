/*    */ import java.util.concurrent.Callable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class g
/*    */   implements Callable
/*    */ {
/*    */   g(b paramb) {}
/*    */   
/*    */   public String a()
/*    */   {
/* 66 */     Runtime localRuntime = Runtime.getRuntime();
/* 67 */     long l1 = localRuntime.maxMemory();
/* 68 */     long l2 = localRuntime.totalMemory();
/* 69 */     long l3 = localRuntime.freeMemory();
/* 70 */     long l4 = l1 / 1024L / 1024L;
/* 71 */     long l5 = l2 / 1024L / 1024L;
/* 72 */     long l6 = l3 / 1024L / 1024L;
/*    */     
/* 74 */     return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l1 + " bytes (" + l4 + " MB)";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */