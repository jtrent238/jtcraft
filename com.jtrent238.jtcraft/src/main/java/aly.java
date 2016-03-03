/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aly
/*    */   extends aji
/*    */ {
/*    */   private rf a;
/*    */   
/*    */   protected aly()
/*    */   {
/* 15 */     super(awt.C);
/* 16 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 21 */     if ((paramInt1 == 1) || (paramInt1 == 0)) return this.a;
/* 22 */     return this.L;
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 27 */     return ade.ba;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 32 */     return 3 + paramRandom.nextInt(5);
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom)
/*    */   {
/* 37 */     int i = a(paramRandom) + paramRandom.nextInt(1 + paramInt);
/* 38 */     if (i > 9) {
/* 39 */       i = 9;
/*    */     }
/* 41 */     return i;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 46 */     this.L = paramrg.a(N() + "_side");
/* 47 */     this.a = paramrg.a(N() + "_top");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */