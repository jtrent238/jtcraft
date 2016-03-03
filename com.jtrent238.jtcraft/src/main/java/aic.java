/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aic
/*    */   extends ahu
/*    */ {
/*    */   public aic(int paramInt)
/*    */   {
/* 12 */     super(paramInt);
/*    */     
/*    */ 
/* 15 */     this.at.clear();
/* 16 */     this.ai = ajn.m;
/* 17 */     this.ak = ajn.m;
/*    */     
/* 19 */     this.ar.x = 64537;
/* 20 */     this.ar.A = 2;
/* 21 */     this.ar.C = 50;
/* 22 */     this.ar.D = 10;
/*    */     
/* 24 */     this.at.clear();
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 29 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */     
/* 31 */     if (paramRandom.nextInt(1000) == 0) {
/* 32 */       int i = paramInt1 + paramRandom.nextInt(16) + 8;
/* 33 */       int j = paramInt2 + paramRandom.nextInt(16) + 8;
/* 34 */       arl localarl = new arl();
/* 35 */       localarl.a(paramahb, paramRandom, i, paramahb.f(i, j) + 1, j);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */