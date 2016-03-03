/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class abq
/*    */   extends adb
/*    */ {
/*    */   private rf a;
/*    */   
/*    */   public abq()
/*    */   {
/* 17 */     a(true);
/* 18 */     f(0);
/* 19 */     a(abt.l);
/*    */   }
/*    */   
/*    */   public String a(add paramadd)
/*    */   {
/* 24 */     if (paramadd.k() == 1) {
/* 25 */       return "item.charcoal";
/*    */     }
/* 27 */     return "item.coal";
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 32 */     paramList.add(new add(paramadb, 1, 0));
/* 33 */     paramList.add(new add(paramadb, 1, 1));
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 38 */     if (paramInt == 1) {
/* 39 */       return this.a;
/*    */     }
/* 41 */     return super.b_(paramInt);
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 46 */     super.a(paramrg);
/*    */     
/* 48 */     this.a = paramrg.a("charcoal");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */