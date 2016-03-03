/*    */ 
/*    */ 
/*    */ public class bii
/*    */ {
/*    */   public azw a;
/*    */   public float b;
/*    */   public float c;
/*    */   
/*    */   public bii(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5)
/*    */   {
/* 11 */     this(azw.a(paramFloat1, paramFloat2, paramFloat3), paramFloat4, paramFloat5);
/*    */   }
/*    */   
/*    */   public bii a(float paramFloat1, float paramFloat2) {
/* 15 */     return new bii(this, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   public bii(bii parambii, float paramFloat1, float paramFloat2) {
/* 19 */     this.a = parambii.a;
/* 20 */     this.b = paramFloat1;
/* 21 */     this.c = paramFloat2;
/*    */   }
/*    */   
/*    */   public bii(azw paramazw, float paramFloat1, float paramFloat2) {
/* 25 */     this.a = paramazw;
/* 26 */     this.b = paramFloat1;
/* 27 */     this.c = paramFloat2;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */