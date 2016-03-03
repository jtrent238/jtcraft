/*    */ import java.util.Random;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bog
/*    */   extends bno
/*    */ {
/*    */   public void a(xh paramxh, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 14 */     bmh localbmh = bmh.a;
/*    */     
/* 16 */     GL11.glDisable(3553);
/* 17 */     GL11.glDisable(2896);
/* 18 */     GL11.glEnable(3042);
/* 19 */     GL11.glBlendFunc(770, 1);
/*    */     
/* 21 */     double[] arrayOfDouble1 = new double[8];
/* 22 */     double[] arrayOfDouble2 = new double[8];
/* 23 */     double d1 = 0.0D;
/* 24 */     double d2 = 0.0D;
/*    */     
/* 26 */     Random localRandom1 = new Random(paramxh.a);
/* 27 */     for (int j = 7; j >= 0; j--) {
/* 28 */       arrayOfDouble1[j] = d1;
/* 29 */       arrayOfDouble2[j] = d2;
/* 30 */       d1 += localRandom1.nextInt(11) - 5;
/* 31 */       d2 += localRandom1.nextInt(11) - 5;
/*    */     }
/*    */     
/*    */ 
/* 35 */     for (int i = 0; i < 4; i++) {
/* 36 */       Random localRandom2 = new Random(paramxh.a);
/* 37 */       for (int k = 0; k < 3; k++) {
/* 38 */         int m = 7;
/* 39 */         int n = 0;
/* 40 */         if (k > 0) m = 7 - k;
/* 41 */         if (k > 0) n = m - 2;
/* 42 */         double d3 = arrayOfDouble1[m] - d1;
/* 43 */         double d4 = arrayOfDouble2[m] - d2;
/* 44 */         for (int i1 = m; i1 >= n; i1--) {
/* 45 */           double d5 = d3;
/* 46 */           double d6 = d4;
/* 47 */           if (k == 0) {
/* 48 */             d3 += localRandom2.nextInt(11) - 5;
/* 49 */             d4 += localRandom2.nextInt(11) - 5;
/*    */           } else {
/* 51 */             d3 += localRandom2.nextInt(31) - 15;
/* 52 */             d4 += localRandom2.nextInt(31) - 15;
/*    */           }
/*    */           
/* 55 */           localbmh.a(5);
/* 56 */           float f = 0.5F;
/* 57 */           localbmh.a(0.9F * f, 0.9F * f, 1.0F * f, 0.3F);
/*    */           
/* 59 */           double d7 = 0.1D + i * 0.2D;
/* 60 */           if (k == 0) { d7 *= (i1 * 0.1D + 1.0D);
/*    */           }
/* 62 */           double d8 = 0.1D + i * 0.2D;
/* 63 */           if (k == 0) { d8 *= ((i1 - 1) * 0.1D + 1.0D);
/*    */           }
/* 65 */           for (int i2 = 0; i2 < 5; i2++) {
/* 66 */             double d9 = paramDouble1 + 0.5D - d7;
/* 67 */             double d10 = paramDouble3 + 0.5D - d7;
/* 68 */             if ((i2 == 1) || (i2 == 2)) d9 += d7 * 2.0D;
/* 69 */             if ((i2 == 2) || (i2 == 3)) { d10 += d7 * 2.0D;
/*    */             }
/* 71 */             double d11 = paramDouble1 + 0.5D - d8;
/* 72 */             double d12 = paramDouble3 + 0.5D - d8;
/* 73 */             if ((i2 == 1) || (i2 == 2)) d11 += d8 * 2.0D;
/* 74 */             if ((i2 == 2) || (i2 == 3)) { d12 += d8 * 2.0D;
/*    */             }
/* 76 */             localbmh.a(d11 + d3, paramDouble2 + i1 * 16, d12 + d4);
/* 77 */             localbmh.a(d9 + d5, paramDouble2 + (i1 + 1) * 16, d10 + d6);
/*    */           }
/*    */           
/*    */ 
/* 81 */           localbmh.a();
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 86 */     GL11.glDisable(3042);
/* 87 */     GL11.glEnable(2896);
/* 88 */     GL11.glEnable(3553);
/*    */   }
/*    */   
/*    */ 
/*    */   protected bqx a(xh paramxh)
/*    */   {
/* 94 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */