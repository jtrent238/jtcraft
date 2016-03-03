/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aci
/*    */   extends adl
/*    */ {
/*    */   public aci(aji paramaji, ako paramako, String[] paramArrayOfString)
/*    */   {
/* 11 */     super(paramaji, paramako, paramArrayOfString);
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 16 */     if (ako.d(paramInt) == 0) {
/* 17 */       return ((ako)this.b).b[0];
/*    */     }
/* 19 */     return ((ako)this.b).a(true, paramInt);
/*    */   }
/*    */   
/*    */   public int a(add paramadd, int paramInt)
/*    */   {
/* 24 */     int i = ako.d(paramadd.k());
/* 25 */     if ((i == 2) || (i == 3)) {
/* 26 */       return aha.a(0.5D, 1.0D);
/*    */     }
/* 28 */     return super.a(paramadd, paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */