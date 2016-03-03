/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bag
/*    */   extends baf
/*    */ {
/*    */   public bag(String paramString)
/*    */   {
/* 10 */     super(paramString);
/*    */   }
/*    */   
/*    */   public int a(List paramList)
/*    */   {
/* 15 */     float f = 0.0F;
/*    */     
/* 17 */     for (yz localyz : paramList) {
/* 18 */       f += localyz.aS() + localyz.bs();
/*    */     }
/*    */     
/* 21 */     if (paramList.size() > 0) { f /= paramList.size();
/*    */     }
/* 23 */     return qh.f(f);
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 28 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */