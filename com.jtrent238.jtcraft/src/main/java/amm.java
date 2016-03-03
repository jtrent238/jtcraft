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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amm
/*    */   extends alx
/*    */ {
/* 17 */   public static final String[] M = { "oak", "spruce", "birch", "jungle" };
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 23 */     paramList.add(new add(paramadb, 1, 0));
/* 24 */     paramList.add(new add(paramadb, 1, 1));
/* 25 */     paramList.add(new add(paramadb, 1, 2));
/* 26 */     paramList.add(new add(paramadb, 1, 3));
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 31 */     this.a = new rf[M.length];
/* 32 */     this.b = new rf[M.length];
/*    */     
/* 34 */     for (int i = 0; i < this.a.length; i++) {
/* 35 */       this.a[i] = paramrg.a(N() + "_" + M[i]);
/* 36 */       this.b[i] = paramrg.a(N() + "_" + M[i] + "_top");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */