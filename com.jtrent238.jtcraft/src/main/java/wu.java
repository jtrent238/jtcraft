/*    */ import java.util.Random;
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
/*    */ public abstract class wu
/*    */   extends td
/*    */   implements ry
/*    */ {
/*    */   public wu(ahb paramahb)
/*    */   {
/* 19 */     super(paramahb);
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean aE()
/*    */   {
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   public boolean by()
/*    */   {
/* 30 */     return this.o.b(this.C);
/*    */   }
/*    */   
/*    */   public int q()
/*    */   {
/* 35 */     return 120;
/*    */   }
/*    */   
/*    */   protected boolean v()
/*    */   {
/* 40 */     return true;
/*    */   }
/*    */   
/*    */   protected int e(yz paramyz)
/*    */   {
/* 45 */     return 1 + this.o.s.nextInt(3);
/*    */   }
/*    */   
/*    */   public void C()
/*    */   {
/* 50 */     int i = ar();
/*    */     
/* 52 */     super.C();
/*    */     
/* 54 */     if ((Z()) && (!M())) {
/* 55 */       h(--i);
/* 56 */       if (ar() == -20) {
/* 57 */         h(0);
/* 58 */         a(ro.e, 2.0F);
/*    */       }
/*    */     } else {
/* 61 */       h(300);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */