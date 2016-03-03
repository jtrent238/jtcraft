/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ars
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private boolean b;
/*    */   
/*    */   public ars(aji paramaji, boolean paramBoolean)
/*    */   {
/* 15 */     this.a = paramaji;
/* 16 */     this.b = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 21 */     if (paramahb.a(paramInt1, paramInt2 + 1, paramInt3) != ajn.aL) return false;
/* 22 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3).o() != awt.a) && (paramahb.a(paramInt1, paramInt2, paramInt3) != ajn.aL)) { return false;
/*    */     }
/* 24 */     int i = 0;
/* 25 */     if (paramahb.a(paramInt1 - 1, paramInt2, paramInt3) == ajn.aL) i++;
/* 26 */     if (paramahb.a(paramInt1 + 1, paramInt2, paramInt3) == ajn.aL) i++;
/* 27 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 - 1) == ajn.aL) i++;
/* 28 */     if (paramahb.a(paramInt1, paramInt2, paramInt3 + 1) == ajn.aL) i++;
/* 29 */     if (paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.aL) { i++;
/*    */     }
/* 31 */     int j = 0;
/* 32 */     if (paramahb.c(paramInt1 - 1, paramInt2, paramInt3)) j++;
/* 33 */     if (paramahb.c(paramInt1 + 1, paramInt2, paramInt3)) j++;
/* 34 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 - 1)) j++;
/* 35 */     if (paramahb.c(paramInt1, paramInt2, paramInt3 + 1)) j++;
/* 36 */     if (paramahb.c(paramInt1, paramInt2 - 1, paramInt3)) { j++;
/*    */     }
/* 38 */     if (((!this.b) && (i == 4) && (j == 1)) || (i == 5)) {
/* 39 */       paramahb.d(paramInt1, paramInt2, paramInt3, this.a, 0, 2);
/* 40 */       paramahb.d = true;
/* 41 */       this.a.a(paramahb, paramInt1, paramInt2, paramInt3, paramRandom);
/* 42 */       paramahb.d = false;
/*    */     }
/*    */     
/* 45 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ars.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */