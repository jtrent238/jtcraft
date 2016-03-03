/*    */ import java.util.Random;
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
/*    */ public class bki
/*    */   extends bkm
/*    */ {
/* 16 */   private static final bqx a = new bqx("textures/entity/explosion.png");
/*    */   private int aB;
/*    */   private int aC;
/*    */   private bqf aD;
/*    */   private float aE;
/*    */   
/*    */   public bki(bqf parambqf, ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 23 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/* 24 */     this.aD = parambqf;
/* 25 */     this.aC = (6 + this.Z.nextInt(4));
/* 26 */     this.at = (this.au = this.av = this.Z.nextFloat() * 0.6F + 0.4F);
/* 27 */     this.aE = (1.0F - (float)paramDouble4 * 0.5F);
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 32 */     int i = (int)((this.aB + paramFloat1) * 15.0F / this.aC);
/* 33 */     if (i > 15) return;
/* 34 */     this.aD.a(a);
/*    */     
/* 36 */     float f1 = i % 4 / 4.0F;
/* 37 */     float f2 = f1 + 0.24975F;
/* 38 */     float f3 = i / 4 / 4.0F;
/* 39 */     float f4 = f3 + 0.24975F;
/*    */     
/* 41 */     float f5 = 2.0F * this.aE;
/*    */     
/* 43 */     float f6 = (float)(this.p + (this.s - this.p) * paramFloat1 - ay);
/* 44 */     float f7 = (float)(this.q + (this.t - this.q) * paramFloat1 - az);
/* 45 */     float f8 = (float)(this.r + (this.u - this.r) * paramFloat1 - aA);
/* 46 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 47 */     GL11.glDisable(2896);
/* 48 */     bam.a();
/* 49 */     parambmh.b();
/* 50 */     parambmh.a(this.at, this.au, this.av, 1.0F);
/* 51 */     parambmh.c(0.0F, 1.0F, 0.0F);
/* 52 */     parambmh.b(240);
/* 53 */     parambmh.a(f6 - paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 - paramFloat4 * f5 - paramFloat6 * f5, f2, f4);
/* 54 */     parambmh.a(f6 - paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 - paramFloat4 * f5 + paramFloat6 * f5, f2, f3);
/* 55 */     parambmh.a(f6 + paramFloat2 * f5 + paramFloat5 * f5, f7 + paramFloat3 * f5, f8 + paramFloat4 * f5 + paramFloat6 * f5, f1, f3);
/* 56 */     parambmh.a(f6 + paramFloat2 * f5 - paramFloat5 * f5, f7 - paramFloat3 * f5, f8 + paramFloat4 * f5 - paramFloat6 * f5, f1, f4);
/* 57 */     parambmh.a();
/* 58 */     GL11.glPolygonOffset(0.0F, 0.0F);
/* 59 */     GL11.glEnable(2896);
/*    */   }
/*    */   
/*    */   public int c(float paramFloat)
/*    */   {
/* 64 */     return 61680;
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 69 */     this.p = this.s;
/* 70 */     this.q = this.t;
/* 71 */     this.r = this.u;
/* 72 */     this.aB += 1;
/* 73 */     if (this.aB == this.aC) B();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 78 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */