/*    */ public class apv
/*    */ {
/*    */   public final byte[] a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public apv(int paramInt1, int paramInt2)
/*    */   {
/*  9 */     this.a = new byte[paramInt1 >> 1];
/* 10 */     this.b = paramInt2;
/* 11 */     this.c = (paramInt2 + 4);
/*    */   }
/*    */   
/*    */   public apv(byte[] paramArrayOfByte, int paramInt) {
/* 15 */     this.a = paramArrayOfByte;
/* 16 */     this.b = paramInt;
/* 17 */     this.c = (paramInt + 4);
/*    */   }
/*    */   
/*    */   public int a(int paramInt1, int paramInt2, int paramInt3) {
/* 21 */     int i = paramInt2 << this.c | paramInt3 << this.b | paramInt1;
/* 22 */     int j = i >> 1;
/* 23 */     int k = i & 0x1;
/*    */     
/* 25 */     if (k == 0) {
/* 26 */       return this.a[j] & 0xF;
/*    */     }
/* 28 */     return this.a[j] >> 4 & 0xF;
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 33 */     int i = paramInt2 << this.c | paramInt3 << this.b | paramInt1;
/*    */     
/* 35 */     int j = i >> 1;
/* 36 */     int k = i & 0x1;
/*    */     
/* 38 */     if (k == 0) {
/* 39 */       this.a[j] = ((byte)(this.a[j] & 0xF0 | paramInt4 & 0xF));
/*    */     } else {
/* 41 */       this.a[j] = ((byte)(this.a[j] & 0xF | (paramInt4 & 0xF) << 4));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */