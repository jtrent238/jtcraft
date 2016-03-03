/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arp
/*    */   extends asq
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public arp(int paramInt1, int paramInt2)
/*    */   {
/* 15 */     super(false);
/* 16 */     this.b = paramInt1;
/* 17 */     this.a = paramInt2;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/*    */     aji localaji1;
/* 24 */     while ((((localaji1 = paramahb.a(paramInt1, paramInt2, paramInt3)).o() == awt.a) || (localaji1.o() == awt.j)) && (paramInt2 > 0)) {
/* 25 */       paramInt2--;
/*    */     }
/* 27 */     aji localaji2 = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 28 */     if ((localaji2 == ajn.d) || (localaji2 == ajn.c)) {
/* 29 */       paramInt2++;
/* 30 */       a(paramahb, paramInt1, paramInt2, paramInt3, ajn.r, this.b);
/*    */       
/* 32 */       for (int i = paramInt2; i <= paramInt2 + 2; i++) {
/* 33 */         int j = i - paramInt2;
/* 34 */         int k = 2 - j;
/* 35 */         for (int m = paramInt1 - k; m <= paramInt1 + k; m++) {
/* 36 */           int n = m - paramInt1;
/* 37 */           for (int i1 = paramInt3 - k; i1 <= paramInt3 + k; i1++) {
/* 38 */             int i2 = i1 - paramInt3;
/* 39 */             if (((Math.abs(n) != k) || (Math.abs(i2) != k) || (paramRandom.nextInt(2) != 0)) && 
/* 40 */               (!paramahb.a(m, i, i1).j()))
/* 41 */               a(paramahb, m, i, i1, ajn.t, this.a);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 46 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */