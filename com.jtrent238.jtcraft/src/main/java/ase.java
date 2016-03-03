/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ase
/*    */   extends arn
/*    */ {
/*    */   private aji a;
/*    */   private int b;
/*    */   private aji c;
/*    */   
/*    */   public ase(aji paramaji, int paramInt)
/*    */   {
/* 16 */     this(paramaji, paramInt, ajn.b);
/*    */   }
/*    */   
/*    */   public ase(aji paramaji1, int paramInt, aji paramaji2) {
/* 20 */     this.a = paramaji1;
/* 21 */     this.b = paramInt;
/* 22 */     this.c = paramaji2;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 28 */     float f = paramRandom.nextFloat() * 3.1415927F;
/*    */     
/* 30 */     double d1 = paramInt1 + 8 + qh.a(f) * this.b / 8.0F;
/* 31 */     double d2 = paramInt1 + 8 - qh.a(f) * this.b / 8.0F;
/* 32 */     double d3 = paramInt3 + 8 + qh.b(f) * this.b / 8.0F;
/* 33 */     double d4 = paramInt3 + 8 - qh.b(f) * this.b / 8.0F;
/*    */     
/* 35 */     double d5 = paramInt2 + paramRandom.nextInt(3) - 2;
/* 36 */     double d6 = paramInt2 + paramRandom.nextInt(3) - 2;
/*    */     
/* 38 */     for (int i = 0; i <= this.b; i++) {
/* 39 */       double d7 = d1 + (d2 - d1) * i / this.b;
/* 40 */       double d8 = d5 + (d6 - d5) * i / this.b;
/* 41 */       double d9 = d3 + (d4 - d3) * i / this.b;
/*    */       
/* 43 */       double d10 = paramRandom.nextDouble() * this.b / 16.0D;
/* 44 */       double d11 = (qh.a(i * 3.1415927F / this.b) + 1.0F) * d10 + 1.0D;
/* 45 */       double d12 = (qh.a(i * 3.1415927F / this.b) + 1.0F) * d10 + 1.0D;
/*    */       
/* 47 */       int j = qh.c(d7 - d11 / 2.0D);
/* 48 */       int k = qh.c(d8 - d12 / 2.0D);
/* 49 */       int m = qh.c(d9 - d11 / 2.0D);
/*    */       
/* 51 */       int n = qh.c(d7 + d11 / 2.0D);
/* 52 */       int i1 = qh.c(d8 + d12 / 2.0D);
/* 53 */       int i2 = qh.c(d9 + d11 / 2.0D);
/*    */       
/* 55 */       for (int i3 = j; i3 <= n; i3++) {
/* 56 */         double d13 = (i3 + 0.5D - d7) / (d11 / 2.0D);
/* 57 */         if (d13 * d13 < 1.0D) {
/* 58 */           for (int i4 = k; i4 <= i1; i4++) {
/* 59 */             double d14 = (i4 + 0.5D - d8) / (d12 / 2.0D);
/* 60 */             if (d13 * d13 + d14 * d14 < 1.0D) {
/* 61 */               for (int i5 = m; i5 <= i2; i5++) {
/* 62 */                 double d15 = (i5 + 0.5D - d9) / (d11 / 2.0D);
/* 63 */                 if ((d13 * d13 + d14 * d14 + d15 * d15 < 1.0D) && 
/* 64 */                   (paramahb.a(i3, i4, i5) == this.c)) { paramahb.d(i3, i4, i5, this.a, 0, 2);
/*    */                 }
/*    */               }
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 73 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */