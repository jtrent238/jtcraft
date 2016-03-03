/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bok
/*    */   extends boh
/*    */ {
/*    */   public bok(bhr parambhr, float paramFloat)
/*    */   {
/* 13 */     super(parambhr, paramFloat);
/*    */   }
/*    */   
/*    */   protected boolean b(sw paramsw)
/*    */   {
/* 18 */     return (super.b(paramsw)) && ((paramsw.bi()) || ((paramsw.bH()) && (paramsw == this.b.i)));
/*    */   }
/*    */   
/*    */   public void a(sw paramsw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 23 */     super.a(paramsw, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */     
/* 25 */     b(paramsw, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*    */   }
/*    */   
/*    */   private double a(double paramDouble1, double paramDouble2, double paramDouble3) {
/* 29 */     return paramDouble1 + (paramDouble2 - paramDouble1) * paramDouble3;
/*    */   }
/*    */   
/*    */   protected void b(sw paramsw, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 33 */     sa localsa = paramsw.bO();
/* 34 */     if (localsa != null) {
/* 35 */       paramDouble2 -= (1.6D - paramsw.N) * 0.5D;
/* 36 */       bmh localbmh = bmh.a;
/* 37 */       double d1 = a(localsa.A, localsa.y, paramFloat2 * 0.5F) * 0.01745329238474369D;
/* 38 */       double d2 = a(localsa.B, localsa.z, paramFloat2 * 0.5F) * 0.01745329238474369D;
/* 39 */       double d3 = Math.cos(d1);
/* 40 */       double d4 = Math.sin(d1);
/* 41 */       double d5 = Math.sin(d2);
/* 42 */       if ((localsa instanceof ss)) {
/* 43 */         d3 = 0.0D;
/* 44 */         d4 = 0.0D;
/* 45 */         d5 = -1.0D;
/*    */       }
/* 47 */       double d6 = Math.cos(d2);
/* 48 */       double d7 = a(localsa.p, localsa.s, paramFloat2) - d3 * 0.7D - d4 * 0.5D * d6;
/* 49 */       double d8 = a(localsa.q + localsa.g() * 0.7D, localsa.t + localsa.g() * 0.7D, paramFloat2) - d5 * 0.5D - 0.25D;
/* 50 */       double d9 = a(localsa.r, localsa.u, paramFloat2) - d4 * 0.7D + d3 * 0.5D * d6;
/*    */       
/* 52 */       double d10 = a(paramsw.aN, paramsw.aM, paramFloat2) * 0.01745329238474369D + 1.5707963267948966D;
/* 53 */       d3 = Math.cos(d10) * paramsw.M * 0.4D;
/* 54 */       d4 = Math.sin(d10) * paramsw.M * 0.4D;
/* 55 */       double d11 = a(paramsw.p, paramsw.s, paramFloat2) + d3;
/* 56 */       double d12 = a(paramsw.q, paramsw.t, paramFloat2);
/* 57 */       double d13 = a(paramsw.r, paramsw.u, paramFloat2) + d4;
/* 58 */       paramDouble1 += d3;
/* 59 */       paramDouble3 += d4;
/*    */       
/* 61 */       double d14 = (float)(d7 - d11);
/* 62 */       double d15 = (float)(d8 - d12);
/* 63 */       double d16 = (float)(d9 - d13);
/*    */       
/* 65 */       GL11.glDisable(3553);
/* 66 */       GL11.glDisable(2896);
/* 67 */       GL11.glDisable(2884);
/*    */       
/* 69 */       int i = 24;
/* 70 */       double d17 = 0.025D;
/* 71 */       localbmh.a(5);
/* 72 */       float f; for (int j = 0; j <= 24; j++) {
/* 73 */         if (j % 2 == 0) {
/* 74 */           localbmh.a(0.5F, 0.4F, 0.3F, 1.0F);
/*    */         } else {
/* 76 */           localbmh.a(0.35F, 0.28F, 0.21000001F, 1.0F);
/*    */         }
/* 78 */         f = j / 24.0F;
/* 79 */         localbmh.a(paramDouble1 + d14 * f + 0.0D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F), paramDouble3 + d16 * f);
/* 80 */         localbmh.a(paramDouble1 + d14 * f + 0.025D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F) + 0.025D, paramDouble3 + d16 * f);
/*    */       }
/* 82 */       localbmh.a();
/*    */       
/* 84 */       localbmh.a(5);
/* 85 */       for (j = 0; j <= 24; j++) {
/* 86 */         if (j % 2 == 0) {
/* 87 */           localbmh.a(0.5F, 0.4F, 0.3F, 1.0F);
/*    */         } else {
/* 89 */           localbmh.a(0.35F, 0.28F, 0.21000001F, 1.0F);
/*    */         }
/* 91 */         f = j / 24.0F;
/* 92 */         localbmh.a(paramDouble1 + d14 * f + 0.0D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F) + 0.025D, paramDouble3 + d16 * f);
/* 93 */         localbmh.a(paramDouble1 + d14 * f + 0.025D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F), paramDouble3 + d16 * f + 0.025D);
/*    */       }
/* 95 */       localbmh.a();
/*    */       
/* 97 */       GL11.glEnable(2896);
/* 98 */       GL11.glEnable(3553);
/* 99 */       GL11.glEnable(2884);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bok.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */