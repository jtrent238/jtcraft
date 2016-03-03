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
/*    */ public class ahv
/*    */ {
/*    */   public float a;
/*    */   public float b;
/*    */   
/*    */   public ahv(float paramFloat1, float paramFloat2)
/*    */   {
/* 37 */     this.a = paramFloat1;
/* 38 */     this.b = paramFloat2;
/*    */   }
/*    */   
/*    */   public ahv a() {
/* 42 */     return new ahv(this.a * 0.8F, this.b * 0.6F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ahv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */