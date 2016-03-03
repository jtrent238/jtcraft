/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ public class bjw
/*    */   extends bkm
/*    */ {
/*    */   private sa a;
/*    */   private int aB;
/*    */   private int aC;
/*    */   private String aD;
/*    */   
/*    */   public bjw(ahb paramahb, sa paramsa)
/*    */   {
/* 14 */     this(paramahb, paramsa, "crit");
/*    */   }
/*    */   
/*    */   public bjw(ahb paramahb, sa paramsa, String paramString) {
/* 18 */     super(paramahb, paramsa.s, paramsa.C.b + paramsa.N / 2.0F, paramsa.u, paramsa.v, paramsa.w, paramsa.x);
/* 19 */     this.a = paramsa;
/* 20 */     this.aC = 3;
/* 21 */     this.aD = paramString;
/* 22 */     h();
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(bmh parambmh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*    */   
/*    */ 
/*    */   public void h()
/*    */   {
/* 31 */     for (int i = 0; i < 16; i++) {
/* 32 */       double d1 = this.Z.nextFloat() * 2.0F - 1.0F;
/* 33 */       double d2 = this.Z.nextFloat() * 2.0F - 1.0F;
/* 34 */       double d3 = this.Z.nextFloat() * 2.0F - 1.0F;
/* 35 */       if (d1 * d1 + d2 * d2 + d3 * d3 <= 1.0D) {
/* 36 */         double d4 = this.a.s + d1 * this.a.M / 4.0D;
/* 37 */         double d5 = this.a.C.b + this.a.N / 2.0F + d2 * this.a.N / 4.0D;
/* 38 */         double d6 = this.a.u + d3 * this.a.M / 4.0D;
/* 39 */         this.o.a(this.aD, d4, d5, d6, d1, d2 + 0.2D, d3);
/*    */       } }
/* 41 */     this.aB += 1;
/* 42 */     if (this.aB >= this.aC) B();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 47 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */