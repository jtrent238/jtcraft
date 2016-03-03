/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aqa
/*    */ {
/*    */   public final byte[] a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public aqa(byte[] paramArrayOfByte, int paramInt)
/*    */   {
/* 15 */     this.a = paramArrayOfByte;
/* 16 */     this.b = paramInt;
/* 17 */     this.c = (paramInt + 4);
/*    */   }
/*    */   
/*    */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/* 21 */     int i = paramInt1 << this.c | paramInt3 << this.b | paramInt2;
/* 22 */     int j = i >> 1;
/* 23 */     int k = i & 0x1;
/*    */     
/* 25 */     if (k == 0) {
/* 26 */       return this.a[j] & 0xF;
/*    */     }
/* 28 */     return this.a[j] >> 4 & 0xF;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aqa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */