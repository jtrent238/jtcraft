/*    */ import java.util.Comparator;
/*    */ 
/*    */ public class blq implements Comparator
/*    */ {
/*    */   private double a;
/*    */   private double b;
/*    */   private double c;
/*    */   
/*    */   public blq(sa paramsa)
/*    */   {
/* 11 */     this.a = (-paramsa.s);
/* 12 */     this.b = (-paramsa.t);
/* 13 */     this.c = (-paramsa.u);
/*    */   }
/*    */   
/*    */   public int a(blo paramblo1, blo paramblo2)
/*    */   {
/* 18 */     double d1 = paramblo1.n + this.a;
/* 19 */     double d2 = paramblo1.o + this.b;
/* 20 */     double d3 = paramblo1.p + this.c;
/*    */     
/* 22 */     double d4 = paramblo2.n + this.a;
/* 23 */     double d5 = paramblo2.o + this.b;
/* 24 */     double d6 = paramblo2.p + this.c;
/*    */     
/* 26 */     return (int)((d1 * d1 + d2 * d2 + d3 * d3 - (d4 * d4 + d5 * d5 + d6 * d6)) * 1024.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */