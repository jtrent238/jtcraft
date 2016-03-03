/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afk
/*    */ {
/*  9 */   private String[][] a = { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
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
/* 27 */   private Object[][] b = { { ajn.f, ajn.e, ade.j, ade.i, ade.k }, { ade.o, ade.s, ade.b, ade.w, ade.D }, { ade.n, ade.r, ade.a, ade.v, ade.C }, { ade.p, ade.t, ade.c, ade.x, ade.E }, { ade.I, ade.J, ade.K, ade.L, ade.M } };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void a(afe paramafe)
/*    */   {
/* 37 */     for (int i = 0; i < this.b[0].length; i++) {
/* 38 */       Object localObject = this.b[0][i];
/*    */       
/* 40 */       for (int j = 0; j < this.b.length - 1; j++) {
/* 41 */         adb localadb = (adb)this.b[(j + 1)][i];
/* 42 */         paramafe.a(new add(localadb), new Object[] { this.a[j], Character.valueOf('#'), ade.y, Character.valueOf('X'), localObject });
/*    */       }
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 48 */     paramafe.a(new add(ade.aZ), new Object[] { " #", "# ", Character.valueOf('#'), ade.j });
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */