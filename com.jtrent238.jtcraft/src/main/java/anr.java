/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class anr
/*    */   extends aoa
/*    */ {
/* 14 */   private static final rf[] a = new rf[16];
/* 15 */   private static final rf[] b = new rf[16];
/*    */   
/*    */   public anr() {
/* 18 */     super("glass", "glass_pane_top", awt.s, false);
/* 19 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public rf b(int paramInt1, int paramInt2)
/*    */   {
/* 24 */     return a[(paramInt2 % a.length)];
/*    */   }
/*    */   
/*    */   public rf b(int paramInt) {
/* 28 */     return b[((paramInt ^ 0xFFFFFFFF) & 0xF)];
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 33 */     return b(paramInt1, (paramInt2 ^ 0xFFFFFFFF) & 0xF);
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 38 */     return paramInt;
/*    */   }
/*    */   
/*    */   public static int c(int paramInt) {
/* 42 */     return paramInt & 0xF;
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 47 */     for (int i = 0; i < a.length; i++) {
/* 48 */       paramList.add(new add(paramadb, 1, i));
/*    */     }
/*    */   }
/*    */   
/*    */   public int w()
/*    */   {
/* 54 */     return 1;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 59 */     super.a(paramrg);
/* 60 */     for (int i = 0; i < a.length; i++) {
/* 61 */       a[i] = paramrg.a(N() + "_" + acj.b[c(i)]);
/* 62 */       b[i] = paramrg.a(N() + "_pane_top_" + acj.b[c(i)]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */