/*    */ import java.util.Comparator;
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
/*    */ 
/*    */ public class vq
/*    */   implements Comparator
/*    */ {
/*    */   private final sa a;
/*    */   
/*    */   public vq(sa paramsa)
/*    */   {
/* 65 */     this.a = paramsa;
/*    */   }
/*    */   
/*    */   public int a(sa paramsa1, sa paramsa2)
/*    */   {
/* 70 */     double d1 = this.a.f(paramsa1);
/* 71 */     double d2 = this.a.f(paramsa2);
/* 72 */     if (d1 < d2) return -1;
/* 73 */     if (d1 > d2) return 1;
/* 74 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */