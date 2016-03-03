/*    */ import java.lang.management.ManagementFactory;
/*    */ import java.lang.management.RuntimeMXBean;
/*    */ import java.util.List;
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
/*    */ class h
/*    */   implements Callable
/*    */ {
/*    */   h(b paramb) {}
/*    */   
/*    */   public String a()
/*    */   {
/* 81 */     RuntimeMXBean localRuntimeMXBean = ManagementFactory.getRuntimeMXBean();
/* 82 */     List localList = localRuntimeMXBean.getInputArguments();
/* 83 */     int i = 0;
/* 84 */     StringBuilder localStringBuilder = new StringBuilder();
/*    */     
/* 86 */     for (String str : localList) {
/* 87 */       if (str.startsWith("-X")) {
/* 88 */         if (i++ > 0) {
/* 89 */           localStringBuilder.append(" ");
/*    */         }
/*    */         
/* 92 */         localStringBuilder.append(str);
/*    */       }
/*    */     }
/*    */     
/* 96 */     return String.format("%d total; %s", new Object[] { Integer.valueOf(i), localStringBuilder.toString() });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */