/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class alx
/*    */   extends ang
/*    */ {
/*    */   protected rf[] a;
/*    */   protected rf[] b;
/*    */   
/*    */   public alx()
/*    */   {
/* 19 */     super(awt.d);
/* 20 */     a(abt.b);
/* 21 */     c(2.0F);
/* 22 */     a(f);
/*    */   }
/*    */   
/*    */   public static int c(int paramInt) {
/* 26 */     return paramInt & 0x3;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 31 */     return 1;
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 36 */     return adb.a(this);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*    */   {
/* 41 */     int i = 4;
/* 42 */     int j = i + 1;
/*    */     
/* 44 */     if (paramahb.b(paramInt1 - j, paramInt2 - j, paramInt3 - j, paramInt1 + j, paramInt2 + j, paramInt3 + j)) {
/* 45 */       for (int k = -i; k <= i; k++) {
/* 46 */         for (int m = -i; m <= i; m++) {
/* 47 */           for (int n = -i; n <= i; n++) {
/* 48 */             if (paramahb.a(paramInt1 + k, paramInt2 + m, paramInt3 + n).o() == awt.j) {
/* 49 */               int i1 = paramahb.e(paramInt1 + k, paramInt2 + m, paramInt3 + n);
/* 50 */               if ((i1 & 0x8) == 0) {
/* 51 */                 paramahb.a(paramInt1 + k, paramInt2 + m, paramInt3 + n, i1 | 0x8, 4);
/*    */               }
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   protected rf b(int paramInt)
/*    */   {
/* 62 */     return this.a[(paramInt % this.a.length)];
/*    */   }
/*    */   
/*    */   protected rf d(int paramInt)
/*    */   {
/* 67 */     return this.b[(paramInt % this.b.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */