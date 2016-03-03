/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ach
/*    */   extends adb
/*    */ {
/*    */   private awt a;
/*    */   
/*    */   public ach(awt paramawt)
/*    */   {
/* 15 */     this.a = paramawt;
/* 16 */     this.h = 1;
/* 17 */     a(abt.d);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 22 */     if (paramInt4 != 1) return false;
/* 23 */     paramInt2++;
/*    */     
/*    */     aji localaji;
/*    */     
/* 27 */     if (this.a == awt.d) localaji = ajn.ao; else {
/* 28 */       localaji = ajn.av;
/*    */     }
/* 30 */     if ((!paramyz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramadd)) || (!paramyz.a(paramInt1, paramInt2 + 1, paramInt3, paramInt4, paramadd))) return false;
/* 31 */     if (!localaji.c(paramahb, paramInt1, paramInt2, paramInt3)) { return false;
/*    */     }
/* 33 */     int i = qh.c((paramyz.y + 180.0F) * 4.0F / 360.0F - 0.5D) & 0x3;
/*    */     
/* 35 */     a(paramahb, paramInt1, paramInt2, paramInt3, i, localaji);
/*    */     
/* 37 */     paramadd.b -= 1;
/* 38 */     return true;
/*    */   }
/*    */   
/*    */   public static void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, aji paramaji)
/*    */   {
/* 43 */     int i = 0;
/* 44 */     int j = 0;
/* 45 */     if (paramInt4 == 0) j = 1;
/* 46 */     if (paramInt4 == 1) i = -1;
/* 47 */     if (paramInt4 == 2) j = -1;
/* 48 */     if (paramInt4 == 3) { i = 1;
/*    */     }
/* 50 */     int k = (paramahb.a(paramInt1 - i, paramInt2, paramInt3 - j).r() ? 1 : 0) + (paramahb.a(paramInt1 - i, paramInt2 + 1, paramInt3 - j).r() ? 1 : 0);
/* 51 */     int m = (paramahb.a(paramInt1 + i, paramInt2, paramInt3 + j).r() ? 1 : 0) + (paramahb.a(paramInt1 + i, paramInt2 + 1, paramInt3 + j).r() ? 1 : 0);
/*    */     
/* 53 */     int n = (paramahb.a(paramInt1 - i, paramInt2, paramInt3 - j) == paramaji) || (paramahb.a(paramInt1 - i, paramInt2 + 1, paramInt3 - j) == paramaji) ? 1 : 0;
/* 54 */     int i1 = (paramahb.a(paramInt1 + i, paramInt2, paramInt3 + j) == paramaji) || (paramahb.a(paramInt1 + i, paramInt2 + 1, paramInt3 + j) == paramaji) ? 1 : 0;
/*    */     
/* 56 */     int i2 = 0;
/* 57 */     if ((n != 0) && (i1 == 0)) { i2 = 1;
/* 58 */     } else if (m > k) { i2 = 1;
/*    */     }
/* 60 */     paramahb.d(paramInt1, paramInt2, paramInt3, paramaji, paramInt4, 2);
/* 61 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, paramaji, 0x8 | (i2 != 0 ? 1 : 0), 2);
/* 62 */     paramahb.d(paramInt1, paramInt2, paramInt3, paramaji);
/* 63 */     paramahb.d(paramInt1, paramInt2 + 1, paramInt3, paramaji);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ach.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */