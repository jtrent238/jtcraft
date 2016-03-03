/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.TimerTask;
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
/*    */ class rj
/*    */   extends TimerTask
/*    */ {
/*    */   rj(ri paramri) {}
/*    */   
/*    */   public void run()
/*    */   {
/* 48 */     if (!ri.a(this.a).W())
/*    */       return;
/*    */     HashMap localHashMap;
/* 51 */     synchronized (ri.b(this.a)) {
/* 52 */       localHashMap = new HashMap(ri.c(this.a));
/* 53 */       if (ri.d(this.a) == 0) localHashMap.putAll(ri.e(this.a));
/* 54 */       localHashMap.put("snooper_count", Integer.valueOf(ri.f(this.a)));
/* 55 */       localHashMap.put("snooper_token", ri.g(this.a));
/*    */     }
/*    */     
/* 58 */     pv.a(ri.h(this.a), localHashMap, true);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */