/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arf
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   
/*    */   public arf(aji paramaji, int paramInt)
/*    */   {
/* 14 */     super(false);
/* 15 */     this.a = paramaji;
/* 16 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 21 */     while (paramInt2 > 3) {
/* 22 */       if (!paramahb.c(paramInt1, paramInt2 - 1, paramInt3)) {
/* 23 */         aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/* 24 */         if ((localaji == ajn.c) || (localaji == ajn.d) || (localaji == ajn.b)) {
/*    */           break;
/*    */         }
/*    */       }
/* 28 */       paramInt2--;
/*    */     }
/* 30 */     if (paramInt2 <= 3) {
/* 31 */       return false;
/*    */     }
/*    */     
/* 34 */     int i = this.b;
/* 35 */     int j = 0;
/* 36 */     while ((i >= 0) && (j < 3))
/*    */     {
/* 38 */       int k = i + paramRandom.nextInt(2);
/* 39 */       int m = i + paramRandom.nextInt(2);
/* 40 */       int n = i + paramRandom.nextInt(2);
/* 41 */       float f1 = (k + m + n) * 0.333F + 0.5F;
/* 42 */       for (int i1 = paramInt1 - k; i1 <= paramInt1 + k; i1++) {
/* 43 */         for (int i2 = paramInt3 - n; i2 <= paramInt3 + n; i2++) {
/* 44 */           for (int i3 = paramInt2 - m; i3 <= paramInt2 + m; i3++) {
/* 45 */             float f2 = i1 - paramInt1;
/* 46 */             float f3 = i2 - paramInt3;
/* 47 */             float f4 = i3 - paramInt2;
/* 48 */             if (f2 * f2 + f3 * f3 + f4 * f4 <= f1 * f1)
/*    */             {
/* 50 */               paramahb.d(i1, i3, i2, this.a, 0, 4);
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/* 55 */       paramInt1 += -(i + 1) + paramRandom.nextInt(2 + i * 2);
/* 56 */       paramInt3 += -(i + 1) + paramRandom.nextInt(2 + i * 2);
/* 57 */       paramInt2 += 0 - paramRandom.nextInt(2);
/* 58 */       j++;
/*    */     }
/*    */     
/* 61 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\arf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */