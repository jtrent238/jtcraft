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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bkg
/*    */   extends bkm
/*    */ {
/* 19 */   private static final bqx a = new bqx("textures/particle/footprint.png");
/*    */   private int aB;
/*    */   private int aC;
/*    */   private bqf aD;
/*    */   
/*    */   public bkg(bqf parambqf, ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 25 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 26 */     this.aD = parambqf;
/* 27 */     this.v = (this.w = this.x = 0.0D);
/* 28 */     this.aC = 200;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 33 */     float f1 = (this.aB + paramFloat1) / this.aC;
/* 34 */     f1 *= f1;
/*    */     
/* 36 */     float f2 = 2.0F - f1 * 2.0F;
/* 37 */     if (f2 > 1.0F) f2 = 1.0F;
/* 38 */     f2 *= 0.2F;
/*    */     
/* 40 */     GL11.glDisable(2896);
/* 41 */     float f3 = 0.125F;
/*    */     
/* 43 */     float f4 = (float)(this.s - ay);
/* 44 */     float f5 = (float)(this.t - az);
/* 45 */     float f6 = (float)(this.u - aA);
/*    */     
/* 47 */     float f7 = this.o.n(qh.c(this.s), qh.c(this.t), qh.c(this.u));
/*    */     
/* 49 */     this.aD.a(a);
/* 50 */     GL11.glEnable(3042);
/* 51 */     GL11.glBlendFunc(770, 771);
/*    */     
/* 53 */     parambmh.b();
/* 54 */     parambmh.a(f7, f7, f7, f2);
/* 55 */     parambmh.a(f4 - f3, f5, f6 + f3, 0.0D, 1.0D);
/* 56 */     parambmh.a(f4 + f3, f5, f6 + f3, 1.0D, 1.0D);
/* 57 */     parambmh.a(f4 + f3, f5, f6 - f3, 1.0D, 0.0D);
/* 58 */     parambmh.a(f4 - f3, f5, f6 - f3, 0.0D, 0.0D);
/* 59 */     parambmh.a();
/*    */     
/* 61 */     GL11.glDisable(3042);
/* 62 */     GL11.glEnable(2896);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 67 */     this.aB += 1;
/* 68 */     if (this.aB == this.aC) B();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 73 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */