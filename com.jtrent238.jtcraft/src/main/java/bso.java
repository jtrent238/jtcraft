/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bso
/*    */   extends bsk
/*    */ {
/*    */   public static bso a(bqx parambqx, float paramFloat)
/*    */   {
/* 12 */     return new bso(parambqx, 0.25F, paramFloat, false, 0, bsu.a, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public static bso a(bqx parambqx) {
/* 16 */     return new bso(parambqx, 1.0F, 1.0F, false, 0, bsu.a, 0.0F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public static bso a(bqx parambqx, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 20 */     return new bso(parambqx, 4.0F, 1.0F, false, 0, bsu.b, paramFloat1, paramFloat2, paramFloat3);
/*    */   }
/*    */   
/*    */   public bso(bqx parambqx, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 24 */     this(parambqx, paramFloat1, paramFloat2, false, 0, bsu.b, paramFloat3, paramFloat4, paramFloat5);
/*    */   }
/*    */   
/*    */   private bso(bqx parambqx, float paramFloat1, float paramFloat2, boolean paramBoolean, int paramInt, bsu parambsu, float paramFloat3, float paramFloat4, float paramFloat5) {
/* 28 */     super(parambqx);
/* 29 */     this.b = paramFloat1;
/* 30 */     this.c = paramFloat2;
/* 31 */     this.d = paramFloat3;
/* 32 */     this.e = paramFloat4;
/* 33 */     this.f = paramFloat5;
/* 34 */     this.g = paramBoolean;
/* 35 */     this.h = paramInt;
/* 36 */     this.i = parambsu;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bso.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */