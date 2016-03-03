/*    */ public class qm
/*    */ {
/*    */   private float a;
/*    */   private float b;
/*    */   private float c;
/*    */   
/*    */   public float a(float paramFloat1, float paramFloat2)
/*    */   {
/*  9 */     this.a += paramFloat1;
/*    */     
/* 11 */     paramFloat1 = (this.a - this.b) * paramFloat2;
/* 12 */     this.c += (paramFloat1 - this.c) * 0.5F;
/* 13 */     if (((paramFloat1 > 0.0F) && (paramFloat1 > this.c)) || ((paramFloat1 < 0.0F) && (paramFloat1 < this.c))) {
/* 14 */       paramFloat1 = this.c;
/*    */     }
/* 16 */     this.b += paramFloat1;
/*    */     
/* 18 */     return paramFloat1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */