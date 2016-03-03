/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class anq
/*    */   extends alk
/*    */ {
/* 11 */   private static final rf[] a = new rf[16];
/*    */   
/*    */   public anq(awt paramawt) {
/* 14 */     super("glass", paramawt, false);
/* 15 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 20 */     return a[(paramInt2 % a.length)];
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 25 */     return paramInt;
/*    */   }
/*    */   
/*    */   public static int b(int paramInt) {
/* 29 */     return (paramInt ^ 0xFFFFFFFF) & 0xF;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 34 */     for (int i = 0; i < a.length; i++) {
/* 35 */       paramList.add(new add(paramadb, 1, i));
/*    */     }
/*    */   }
/*    */   
/*    */   public int w()
/*    */   {
/* 41 */     return 1;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 46 */     for (int i = 0; i < a.length; i++) {
/* 47 */       a[i] = paramrg.a(N() + "_" + acj.b[b(i)]);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 53 */     return 0;
/*    */   }
/*    */   
/*    */   protected boolean E()
/*    */   {
/* 58 */     return true;
/*    */   }
/*    */   
/*    */   public boolean d()
/*    */   {
/* 63 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */