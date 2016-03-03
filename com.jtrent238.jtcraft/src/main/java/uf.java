/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class uf
/*    */   extends ui
/*    */ {
/*    */   private sw a;
/*    */   
/*    */   public uf(sw paramsw)
/*    */   {
/* 11 */     this.a = paramsw;
/* 12 */     a(4);
/* 13 */     paramsw.m().e(true);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 18 */     return (this.a.M()) || (this.a.P());
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 23 */     if (this.a.aI().nextFloat() < 0.8F) this.a.l().a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */