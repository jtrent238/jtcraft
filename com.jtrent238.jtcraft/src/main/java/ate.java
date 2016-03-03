/*    */ import java.util.ArrayList;
/*    */ import java.util.LinkedList;
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
/*    */ public class ate
/*    */   extends avm
/*    */ {
/*    */   public ate() {}
/*    */   
/*    */   public ate(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 70 */     super(paramInt1, paramInt2);
/*    */     
/* 72 */     atw localatw = new atw(paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/* 73 */     this.a.add(localatw);
/* 74 */     localatw.a(localatw, this.a, paramRandom);
/*    */     
/* 76 */     ArrayList localArrayList = localatw.e;
/* 77 */     while (!localArrayList.isEmpty()) {
/* 78 */       int i = paramRandom.nextInt(localArrayList.size());
/* 79 */       avk localavk = (avk)localArrayList.remove(i);
/* 80 */       localavk.a(localatw, this.a, paramRandom);
/*    */     }
/*    */     
/* 83 */     c();
/* 84 */     a(paramahb, paramRandom, 48, 70);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */