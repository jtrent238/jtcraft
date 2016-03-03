/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bns
/*    */   extends bno
/*    */ {
/* 14 */   private static final bqx a = new bqx("textures/particle/particles.png");
/*    */   
/*    */   public void a(xe paramxe, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 18 */     GL11.glPushMatrix();
/*    */     
/* 20 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 21 */     GL11.glEnable(32826);
/* 22 */     GL11.glScalef(0.5F, 0.5F, 0.5F);
/* 23 */     b(paramxe);
/* 24 */     bmh localbmh = bmh.a;
/*    */     
/* 26 */     int i = 1;
/* 27 */     int j = 2;
/* 28 */     float f1 = (i * 8 + 0) / 128.0F;
/* 29 */     float f2 = (i * 8 + 8) / 128.0F;
/* 30 */     float f3 = (j * 8 + 0) / 128.0F;
/* 31 */     float f4 = (j * 8 + 8) / 128.0F;
/*    */     
/* 33 */     float f5 = 1.0F;
/* 34 */     float f6 = 0.5F;
/* 35 */     float f7 = 0.5F;
/*    */     
/* 37 */     GL11.glRotatef(180.0F - this.b.j, 0.0F, 1.0F, 0.0F);
/* 38 */     GL11.glRotatef(-this.b.k, 1.0F, 0.0F, 0.0F);
/* 39 */     localbmh.b();
/* 40 */     localbmh.c(0.0F, 1.0F, 0.0F);
/* 41 */     localbmh.a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
/* 42 */     localbmh.a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
/* 43 */     localbmh.a(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
/* 44 */     localbmh.a(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
/* 45 */     localbmh.a();
/*    */     
/* 47 */     GL11.glDisable(32826);
/* 48 */     GL11.glPopMatrix();
/*    */     
/* 50 */     if (paramxe.b != null) {
/* 51 */       float f8 = paramxe.b.k(paramFloat2);
/* 52 */       float f9 = qh.a(qh.c(f8) * 3.1415927F);
/*    */       
/* 54 */       azw localazw = azw.a(-0.5D, 0.03D, 0.8D);
/* 55 */       localazw.a(-(paramxe.b.B + (paramxe.b.z - paramxe.b.B) * paramFloat2) * 3.1415927F / 180.0F);
/* 56 */       localazw.b(-(paramxe.b.A + (paramxe.b.y - paramxe.b.A) * paramFloat2) * 3.1415927F / 180.0F);
/* 57 */       localazw.b(f9 * 0.5F);
/* 58 */       localazw.a(-f9 * 0.7F);
/*    */       
/* 60 */       double d1 = paramxe.b.p + (paramxe.b.s - paramxe.b.p) * paramFloat2 + localazw.a;
/* 61 */       double d2 = paramxe.b.q + (paramxe.b.t - paramxe.b.q) * paramFloat2 + localazw.b;
/* 62 */       double d3 = paramxe.b.r + (paramxe.b.u - paramxe.b.r) * paramFloat2 + localazw.c;
/* 63 */       double d4 = paramxe.b == bao.B().h ? 0.0D : paramxe.b.g();
/*    */       
/* 65 */       if ((this.b.l.aw > 0) || (paramxe.b != bao.B().h)) {
/* 66 */         float f10 = (paramxe.b.aN + (paramxe.b.aM - paramxe.b.aN) * paramFloat2) * 3.1415927F / 180.0F;
/* 67 */         double d6 = qh.a(f10);
/* 68 */         double d8 = qh.b(f10);
/* 69 */         d1 = paramxe.b.p + (paramxe.b.s - paramxe.b.p) * paramFloat2 - d8 * 0.35D - d6 * 0.85D;
/* 70 */         d2 = paramxe.b.q + d4 + (paramxe.b.t - paramxe.b.q) * paramFloat2 - 0.45D;
/* 71 */         d3 = paramxe.b.r + (paramxe.b.u - paramxe.b.r) * paramFloat2 - d6 * 0.35D + d8 * 0.85D;
/*    */       }
/*    */       
/* 74 */       double d5 = paramxe.p + (paramxe.s - paramxe.p) * paramFloat2;
/* 75 */       double d7 = paramxe.q + (paramxe.t - paramxe.q) * paramFloat2 + 0.25D;
/* 76 */       double d9 = paramxe.r + (paramxe.u - paramxe.r) * paramFloat2;
/*    */       
/* 78 */       double d10 = (float)(d1 - d5);
/* 79 */       double d11 = (float)(d2 - d7);
/* 80 */       double d12 = (float)(d3 - d9);
/*    */       
/* 82 */       GL11.glDisable(3553);
/* 83 */       GL11.glDisable(2896);
/* 84 */       localbmh.a(3);
/* 85 */       localbmh.c(0);
/* 86 */       int k = 16;
/* 87 */       for (int m = 0; m <= k; m++) {
/* 88 */         float f11 = m / k;
/* 89 */         localbmh.a(paramDouble1 + d10 * f11, paramDouble2 + d11 * (f11 * f11 + f11) * 0.5D + 0.25D, paramDouble3 + d12 * f11);
/*    */       }
/* 91 */       localbmh.a();
/* 92 */       GL11.glEnable(2896);
/* 93 */       GL11.glEnable(3553);
/*    */     }
/*    */   }
/*    */   
/*    */   protected bqx a(xe paramxe)
/*    */   {
/* 99 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */