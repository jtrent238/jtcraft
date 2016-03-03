/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class blb
/*    */   extends bkm
/*    */ {
/*    */   private sa a;
/*    */   private sa aB;
/*    */   private int aC;
/*    */   private int aD;
/*    */   private float aE;
/*    */   
/*    */   public blb(ahb paramahb, sa paramsa1, sa paramsa2, float paramFloat)
/*    */   {
/* 18 */     super(paramahb, paramsa1.s, paramsa1.t, paramsa1.u, paramsa1.v, paramsa1.w, paramsa1.x);
/* 19 */     this.a = paramsa1;
/* 20 */     this.aB = paramsa2;
/* 21 */     this.aD = 3;
/* 22 */     this.aE = paramFloat;
/*    */   }
/*    */   
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*    */   {
/* 27 */     float f = (this.aC + paramFloat1) / this.aD;
/* 28 */     f *= f;
/*    */     
/* 30 */     double d1 = this.a.s;
/* 31 */     double d2 = this.a.t;
/* 32 */     double d3 = this.a.u;
/*    */     
/* 34 */     double d4 = this.aB.S + (this.aB.s - this.aB.S) * paramFloat1;
/* 35 */     double d5 = this.aB.T + (this.aB.t - this.aB.T) * paramFloat1 + this.aE;
/* 36 */     double d6 = this.aB.U + (this.aB.u - this.aB.U) * paramFloat1;
/*    */     
/* 38 */     double d7 = d1 + (d4 - d1) * f;
/* 39 */     double d8 = d2 + (d5 - d2) * f;
/* 40 */     double d9 = d3 + (d6 - d3) * f;
/*    */     
/* 42 */     int i = c(paramFloat1);
/* 43 */     int j = i % 65536;
/* 44 */     int k = i / 65536;
/* 45 */     buu.a(buu.c, j / 1.0F, k / 1.0F);
/* 46 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 48 */     d7 -= ay;
/* 49 */     d8 -= az;
/* 50 */     d9 -= aA;
/*    */     
/* 52 */     bnn.a.a(this.a, (float)d7, (float)d8, (float)d9, this.a.y, paramFloat1);
/*    */   }
/*    */   
/*    */   public void h()
/*    */   {
/* 57 */     this.aC += 1;
/* 58 */     if (this.aC == this.aD) B();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 63 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */