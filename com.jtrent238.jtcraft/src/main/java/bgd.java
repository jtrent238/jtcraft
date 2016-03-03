/*    */ import java.net.UnknownHostException;
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
/*    */ class bgd
/*    */   implements Runnable
/*    */ {
/*    */   bgd(bgc parambgc) {}
/*    */   
/*    */   public void run()
/*    */   {
/*    */     try
/*    */     {
/* 66 */       bgc.b(this.a).g().a(bgc.a(this.a));
/*    */     } catch (UnknownHostException localUnknownHostException) {
/* 68 */       bgc.a(this.a).e = -1L;
/* 69 */       bgc.a(this.a).d = (a.e + "Can't resolve hostname");
/*    */     } catch (Exception localException) {
/* 71 */       bgc.a(this.a).e = -1L;
/* 72 */       bgc.a(this.a).d = (a.e + "Can't connect to server.");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */