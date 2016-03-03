/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acp
/*    */   extends adb
/*    */ {
/*    */   public acp()
/*    */   {
/* 10 */     a(abt.f);
/*    */   }
/*    */   
/*    */   public boolean e(add paramadd)
/*    */   {
/* 15 */     return true;
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 20 */     if (!paramyz.bE.d) {
/* 21 */       paramadd.b -= 1;
/*    */     }
/* 23 */     paramahb.a(paramyz, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 24 */     if (!paramahb.E) paramahb.d(new zn(paramahb, paramyz));
/* 25 */     return paramadd;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */