/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ln
/*    */   implements Comparator
/*    */ {
/*    */   private final r a;
/*    */   
/*    */   public ln(r paramr)
/*    */   {
/* 12 */     this.a = paramr;
/*    */   }
/*    */   
/*    */   public int a(mw parammw1, mw parammw2)
/*    */   {
/* 17 */     double d1 = parammw1.e(this.a.a, this.a.b, this.a.c);
/* 18 */     double d2 = parammw2.e(this.a.a, this.a.b, this.a.c);
/*    */     
/* 20 */     if (d1 < d2)
/* 21 */       return -1;
/* 22 */     if (d1 > d2) {
/* 23 */       return 1;
/*    */     }
/* 25 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */