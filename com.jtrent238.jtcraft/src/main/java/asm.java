/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asm
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   
/*    */   public asm(aji paramaji)
/*    */   {
/* 14 */     this.a = paramaji;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 19 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) != ajn.b) return false;
/* 20 */     if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) != ajn.b) { return false;
/*    */     }
/* 22 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3).o() != awt.a) && (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.b)) { return false;
/*    */     }
/* 24 */     int i = 0;
/* 25 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == ajn.b) i++;
/* 26 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == ajn.b) i++;
/* 27 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == ajn.b) i++;
/* 28 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == ajn.b) { i++;
/*    */     }
/* 30 */     int j = 0;
/* 31 */     if (paramahb.c(paramInt1 - 1, paramInt2, paramInt3)) j++;
/* 32 */     if (paramahb.c(paramInt1 + 1, paramInt2, paramInt3)) j++;
/* 33 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 - 1)) j++;
/* 34 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 + 1)) { j++;
/*    */     }
/* 36 */     if ((i == 3) && (j == 1)) {
/* 37 */       paramahb.d(paramInt1, paramInt2, paramInt3, this.a, 0, 2);
/* 38 */       paramahb.d = true;
/* 39 */       this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/* 40 */       paramahb.d = false;
/*    */     }
/*    */     
/* 43 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */