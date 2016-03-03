/*    */ import com.google.common.collect.ComparisonChain;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ public class blr
/*    */   implements Comparator
/*    */ {
/*    */   int a;
/*    */   int b;
/*    */   
/*    */   public blr(int paramInt1, int paramInt2)
/*    */   {
/* 13 */     this.a = paramInt1;
/* 14 */     this.b = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int a(bmd parambmd1, bmd parambmd2)
/*    */   {
/* 27 */     int i = parambmd1.a - this.a;
/* 28 */     int j = parambmd1.c - this.b;
/* 29 */     int k = parambmd2.a - this.a;
/* 30 */     int m = parambmd2.c - this.b;
/* 31 */     int n = i * i + j * j;
/* 32 */     int i1 = k * k + m * m;
/* 33 */     return ComparisonChain.start().compare(i1, n).result();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */