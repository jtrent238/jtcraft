/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aev
/*    */ {
/*  7 */   private String[][] a = { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
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
/* 31 */   private Object[][] b = { { ade.aA, ajn.ab, ade.j, ade.i, ade.k }, { ade.Q, ade.U, ade.Y, ade.ac, ade.ag }, { ade.R, ade.V, ade.Z, ade.ad, ade.ah }, { ade.S, ade.W, ade.aa, ade.ae, ade.ai }, { ade.T, ade.X, ade.ab, ade.af, ade.aj } };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(afe paramafe)
/*    */   {
/* 40 */     for (int i = 0; i < this.b[0].length; i++)
/*    */     {
/* 42 */       Object localObject = this.b[0][i];
/*    */       
/* 44 */       for (int j = 0; j < this.b.length - 1; j++) {
/* 45 */         adb localadb = (adb)this.b[(j + 1)][i];
/*    */         
/* 47 */         paramafe.a(new add(localadb), new Object[] { this.a[j], Character.valueOf('X'), localObject });
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */