/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amn
/*    */   extends aji
/*    */ {
/*    */   public amn()
/*    */   {
/* 12 */     super(awt.e);
/* 13 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 18 */     if (this == ajn.q) return ade.h;
/* 19 */     if (this == ajn.ag) return ade.i;
/* 20 */     if (this == ajn.x) return ade.aR;
/* 21 */     if (this == ajn.bA) return ade.bC;
/* 22 */     if (this == ajn.bY) return ade.bU;
/* 23 */     return adb.a(this);
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 28 */     if (this == ajn.x) return 4 + paramRandom.nextInt(5);
/* 29 */     return 1;
/*    */   }
/*    */   
/*    */   public int a(int paramInt, Random paramRandom)
/*    */   {
/* 34 */     if ((paramInt > 0) && (adb.a(this) != a(0, paramRandom, paramInt))) {
/* 35 */       int i = paramRandom.nextInt(paramInt + 2) - 1;
/* 36 */       if (i < 0) {
/* 37 */         i = 0;
/*    */       }
/* 39 */       return a(paramRandom) * (i + 1);
/*    */     }
/* 41 */     return a(paramRandom);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*    */   {
/* 46 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
/*    */     
/*    */ 
/* 49 */     if (a(paramInt4, paramahb.s, paramInt5) != adb.a(this)) {
/* 50 */       int i = 0;
/* 51 */       if (this == ajn.q) {
/* 52 */         i = qh.a(paramahb.s, 0, 2);
/* 53 */       } else if (this == ajn.ag) {
/* 54 */         i = qh.a(paramahb.s, 3, 7);
/* 55 */       } else if (this == ajn.bA) {
/* 56 */         i = qh.a(paramahb.s, 3, 7);
/* 57 */       } else if (this == ajn.x) {
/* 58 */         i = qh.a(paramahb.s, 2, 5);
/* 59 */       } else if (this == ajn.bY) {
/* 60 */         i = qh.a(paramahb.s, 2, 5);
/*    */       }
/* 62 */       c(paramahb, paramInt1, paramInt2, paramInt3, i);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public int a(int paramInt)
/*    */   {
/* 69 */     if (this == ajn.x) return 4;
/* 70 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */