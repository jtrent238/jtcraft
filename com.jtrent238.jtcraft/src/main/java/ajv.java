/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajv
/*    */   extends akf
/*    */ {
/*    */   private rf[] a;
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 13 */     if (paramInt2 < 7) {
/* 14 */       if (paramInt2 == 6) {
/* 15 */         paramInt2 = 5;
/*    */       }
/* 17 */       return this.a[(paramInt2 >> 1)];
/*    */     }
/* 19 */     return this.a[3];
/*    */   }
/*    */   
/*    */ 
/*    */   protected adb i()
/*    */   {
/* 25 */     return ade.bF;
/*    */   }
/*    */   
/*    */   protected adb P()
/*    */   {
/* 30 */     return ade.bF;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 35 */     this.a = new rf[4];
/*    */     
/* 37 */     for (int i = 0; i < this.a.length; i++) {
/* 38 */       this.a[i] = paramrg.a(N() + "_stage_" + i);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */