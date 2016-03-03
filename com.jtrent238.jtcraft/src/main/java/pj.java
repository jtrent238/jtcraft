/*    */ import java.text.DecimalFormat;
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
/*    */ final class pj
/*    */   implements pm
/*    */ {
/*    */   public String a(int paramInt)
/*    */   {
/* 71 */     double d1 = paramInt / 20.0D;
/* 72 */     double d2 = d1 / 60.0D;
/* 73 */     double d3 = d2 / 60.0D;
/* 74 */     double d4 = d3 / 24.0D;
/* 75 */     double d5 = d4 / 365.0D;
/*    */     
/* 77 */     if (d5 > 0.5D)
/* 78 */       return ph.n().format(d5) + " y";
/* 79 */     if (d4 > 0.5D)
/* 80 */       return ph.n().format(d4) + " d";
/* 81 */     if (d3 > 0.5D)
/* 82 */       return ph.n().format(d3) + " h";
/* 83 */     if (d2 > 0.5D) {
/* 84 */       return ph.n().format(d2) + " m";
/*    */     }
/* 86 */     return d1 + " s";
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */