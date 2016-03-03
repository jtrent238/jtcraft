/*    */ 
/*    */ 
/*    */ 
/*    */ public class adt
/*    */   extends adb
/*    */ {
/*    */   public adt()
/*    */   {
/*  9 */     this.h = 1;
/* 10 */     a(abt.e);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, sv paramsv)
/*    */   {
/* 15 */     if ((paramsv instanceof wo)) {
/* 16 */       wo localwo = (wo)paramsv;
/* 17 */       if ((!localwo.bZ()) && (!localwo.f())) {
/* 18 */         localwo.i(true);
/* 19 */         localwo.o.a(localwo, "mob.horse.leather", 0.5F, 1.0F);
/* 20 */         paramadd.b -= 1;
/*    */       }
/*    */       
/* 23 */       return true;
/*    */     }
/* 25 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, sv paramsv1, sv paramsv2)
/*    */   {
/* 30 */     a(paramadd, null, paramsv1);
/* 31 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */