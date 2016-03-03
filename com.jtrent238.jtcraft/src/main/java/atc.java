/*    */ import java.util.LinkedList;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class atc
/*    */   extends avm
/*    */ {
/*    */   public atc() {}
/*    */   
/*    */   public atc(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 16 */     super(paramInt1, paramInt2);
/*    */     
/* 18 */     ata localata = new ata(0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/* 19 */     this.a.add(localata);
/* 20 */     localata.a(localata, this.a, paramRandom);
/*    */     
/* 22 */     c();
/* 23 */     a(paramahb, paramRandom, 10);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\atc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */