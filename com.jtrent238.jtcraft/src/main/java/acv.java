/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acv
/*    */   extends adb
/*    */ {
/*    */   private rf a;
/*    */   
/*    */   public acv()
/*    */   {
/* 13 */     f(64);
/* 14 */     e(1);
/* 15 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public boolean f()
/*    */   {
/* 20 */     return true;
/*    */   }
/*    */   
/*    */   public boolean g()
/*    */   {
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   public add a(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 30 */     if (paramyz.bK != null) {
/* 31 */       int i = paramyz.bK.e();
/* 32 */       paramadd.a(i, paramyz);
/* 33 */       paramyz.ba();
/*    */     } else {
/* 35 */       paramahb.a(paramyz, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 36 */       if (!paramahb.E) {
/* 37 */         paramahb.d(new xe(paramahb, paramyz));
/*    */       }
/* 39 */       paramyz.ba();
/*    */     }
/* 41 */     return paramadd;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 46 */     this.k = paramrg.a(w() + "_uncast");
/* 47 */     this.a = paramrg.a(w() + "_cast");
/*    */   }
/*    */   
/*    */   public rf i() {
/* 51 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean e_(add paramadd)
/*    */   {
/* 56 */     return super.e_(paramadd);
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 61 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */