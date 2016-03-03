/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afl
/*    */ {
/*  7 */   private String[][] a = { { "X", "X", "#" } };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 13 */   private Object[][] b = { { ajn.f, ajn.e, ade.j, ade.i, ade.k }, { ade.m, ade.q, ade.l, ade.u, ade.B } };
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(afe paramafe)
/*    */   {
/* 19 */     for (int i = 0; i < this.b[0].length; i++) {
/* 20 */       Object localObject = this.b[0][i];
/*    */       
/* 22 */       for (int j = 0; j < this.b.length - 1; j++) {
/* 23 */         adb localadb = (adb)this.b[(j + 1)][i];
/* 24 */         paramafe.a(new add(localadb), new Object[] { this.a[j], Character.valueOf('#'), ade.y, Character.valueOf('X'), localObject });
/*    */       }
/*    */     }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 32 */     paramafe.a(new add(ade.f, 1), new Object[] { " #X", "# X", " #X", Character.valueOf('X'), ade.F, Character.valueOf('#'), ade.y });
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 40 */     paramafe.a(new add(ade.g, 4), new Object[] { "X", "#", "Y", Character.valueOf('Y'), ade.G, Character.valueOf('X'), ade.ak, Character.valueOf('#'), ade.y });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */