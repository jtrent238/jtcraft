/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aik
/*    */   extends ahu
/*    */ {
/*    */   private boolean aC;
/*    */   
/*    */   public aik(int paramInt, boolean paramBoolean)
/*    */   {
/* 15 */     super(paramInt);
/* 16 */     this.aC = paramBoolean;
/* 17 */     if (paramBoolean) {
/* 18 */       this.ar.x = 2;
/*    */     } else {
/* 20 */       this.ar.x = 50;
/*    */     }
/* 22 */     this.ar.z = 25;
/* 23 */     this.ar.y = 4;
/*    */     
/* 25 */     if (!paramBoolean) {
/* 26 */       this.as.add(new ahx(wn.class, 2, 1, 1));
/*    */     }
/*    */     
/*    */ 
/* 30 */     this.at.add(new ahx(wg.class, 10, 4, 4));
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 35 */     if (paramRandom.nextInt(10) == 0) {
/* 36 */       return this.aA;
/*    */     }
/* 38 */     if (paramRandom.nextInt(2) == 0) {
/* 39 */       return new arp(3, 0);
/*    */     }
/* 41 */     if ((!this.aC) && (paramRandom.nextInt(3) == 0)) {
/* 42 */       return new arz(false, 10, 20, 3, 3);
/*    */     }
/* 44 */     return new asq(false, 4 + paramRandom.nextInt(7), 3, 3, true);
/*    */   }
/*    */   
/*    */   public arn b(Random paramRandom)
/*    */   {
/* 49 */     if (paramRandom.nextInt(4) == 0) {
/* 50 */       return new asp(ajn.H, 2);
/*    */     }
/* 52 */     return new asp(ajn.H, 1);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 57 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */     
/*    */ 
/* 60 */     int i = paramInt1 + paramRandom.nextInt(16) + 8;
/* 61 */     int j = paramInt2 + paramRandom.nextInt(16) + 8;
/* 62 */     int k = paramRandom.nextInt(paramahb.f(i, j) * 2);
/* 63 */     new asc().a(paramahb, paramRandom, i, k, j);
/*    */     
/*    */ 
/* 66 */     asr localasr = new asr();
/*    */     
/* 68 */     for (j = 0; j < 50; j++) {
/* 69 */       k = paramInt1 + paramRandom.nextInt(16) + 8;
/* 70 */       int m = 128;
/* 71 */       int n = paramInt2 + paramRandom.nextInt(16) + 8;
/* 72 */       localasr.a(paramahb, paramRandom, k, m, n);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */