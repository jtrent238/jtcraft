/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class aco
/*    */   extends adb
/*    */ {
/*    */   public aco()
/*    */   {
/*  9 */     this.h = 16;
/* 10 */     a(abt.f);
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 15 */     if (paramyz.bE.d) { return paramadd;
/*    */     }
/* 17 */     paramadd.b -= 1;
/* 18 */     paramahb.a(paramyz, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 19 */     if (!paramahb.E) paramahb.d(new zm(paramahb, paramyz));
/* 20 */     return paramadd;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aco.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */