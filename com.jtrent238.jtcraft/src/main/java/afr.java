/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afr
/*    */   extends aft
/*    */ {
/*    */   protected afr(int paramInt1, int paramInt2)
/*    */   {
/* 11 */     super(paramInt1, paramInt2, afu.j);
/*    */     
/* 13 */     b("durability");
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 18 */     return 5 + (paramInt - 1) * 8;
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 23 */     return super.a(paramInt) + 50;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 28 */     return 3;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 33 */     if (paramadd.g()) return true;
/* 34 */     return super.a(paramadd);
/*    */   }
/*    */   
/*    */   public static boolean a(add paramadd, int paramInt, Random paramRandom) {
/* 38 */     if (((paramadd.b() instanceof abb)) && (paramRandom.nextFloat() < 0.6F)) return false;
/* 39 */     return paramRandom.nextInt(paramInt + 1) > 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */