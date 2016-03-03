/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class vm
/*    */   extends vu
/*    */ {
/*    */   wt a;
/*    */   sv b;
/*    */   
/*    */   public vm(wt paramwt)
/*    */   {
/* 12 */     super(paramwt, false, true);
/* 13 */     this.a = paramwt;
/* 14 */     a(1);
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 19 */     vz localvz = this.a.bZ();
/* 20 */     if (localvz == null) return false;
/* 21 */     this.b = localvz.b(this.a);
/* 22 */     if (!a(this.b, false))
/*    */     {
/* 24 */       if (this.c.aI().nextInt(20) == 0) {
/* 25 */         this.b = localvz.c(this.a);
/* 26 */         return a(this.b, false);
/*    */       }
/* 28 */       return false;
/*    */     }
/* 30 */     return true;
/*    */   }
/*    */   
/*    */ 
/*    */   public void c()
/*    */   {
/* 36 */     this.a.d(this.b);
/* 37 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */