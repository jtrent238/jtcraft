/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aoo
/*    */   extends alj
/*    */ {
/* 11 */   public static final String[] b = { "oak", "spruce", "birch", "jungle", "acacia", "big_oak" };
/*    */   
/*    */ 
/*    */   public aoo(boolean paramBoolean)
/*    */   {
/* 16 */     super(paramBoolean, awt.d);
/* 17 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     return ajn.f.a(paramInt1, paramInt2 & 0x7);
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 27 */     return adb.a(ajn.bx);
/*    */   }
/*    */   
/*    */   protected add j(int paramInt)
/*    */   {
/* 32 */     return new add(adb.a(ajn.bx), 2, paramInt & 0x7);
/*    */   }
/*    */   
/*    */   public String b(int paramInt)
/*    */   {
/* 37 */     if ((paramInt < 0) || (paramInt >= b.length)) {
/* 38 */       paramInt = 0;
/*    */     }
/* 40 */     return super.a() + "." + b[paramInt];
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 45 */     if (paramadb == adb.a(ajn.bw)) { return;
/*    */     }
/* 47 */     for (int i = 0; i < b.length; i++) {
/* 48 */       paramList.add(new add(paramadb, 1, i));
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(rg paramrg) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aoo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */