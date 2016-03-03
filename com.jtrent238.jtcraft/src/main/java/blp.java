/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ public class blp
/*    */   implements Comparator
/*    */ {
/*    */   private sv a;
/*    */   
/*    */   public blp(sv paramsv)
/*    */   {
/* 11 */     this.a = paramsv;
/*    */   }
/*    */   
/*    */   public int a(blo paramblo1, blo paramblo2)
/*    */   {
/* 16 */     if ((paramblo1.l) && (!paramblo2.l)) return 1;
/* 17 */     if ((paramblo2.l) && (!paramblo1.l)) { return -1;
/*    */     }
/* 19 */     double d1 = paramblo1.a(this.a);
/* 20 */     double d2 = paramblo2.a(this.a);
/*    */     
/* 22 */     if (d1 < d2) return 1;
/* 23 */     if (d1 > d2) { return -1;
/*    */     }
/* 25 */     return paramblo1.s < paramblo2.s ? 1 : -1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */