/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aid
/*    */   extends ahu
/*    */ {
/* 14 */   private arn aC = new ase(ajn.aU, 8);
/* 15 */   private asn aD = new asn(false);
/*    */   
/* 17 */   private int aE = 0;
/* 18 */   private int aF = 1;
/* 19 */   private int aG = 2;
/*    */   private int aH;
/*    */   
/*    */   protected aid(int paramInt, boolean paramBoolean)
/*    */   {
/* 24 */     super(paramInt);
/* 25 */     this.aH = this.aE;
/* 26 */     if (paramBoolean) {
/* 27 */       this.ar.x = 3;
/* 28 */       this.aH = this.aF;
/*    */     }
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 34 */     if (paramRandom.nextInt(3) > 0) {
/* 35 */       return this.aD;
/*    */     }
/* 37 */     return super.a(paramRandom);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 42 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */     
/*    */ 
/* 45 */     int i = 3 + paramRandom.nextInt(6);
/* 46 */     int k; int m; for (int j = 0; j < i; j++) {
/* 47 */       k = paramInt1 + paramRandom.nextInt(16);
/* 48 */       m = paramRandom.nextInt(28) + 4;
/* 49 */       int n = paramInt2 + paramRandom.nextInt(16);
/* 50 */       if (paramahb.a(k, m, n) == ajn.b) {
/* 51 */         paramahb.d(k, m, n, ajn.bA, 0, 2);
/*    */       }
/*    */     }
/*    */     
/*    */ 
/* 56 */     for (i = 0; i < 7; i++) {
/* 57 */       j = paramInt1 + paramRandom.nextInt(16);
/* 58 */       k = paramRandom.nextInt(64);
/* 59 */       m = paramInt2 + paramRandom.nextInt(16);
/* 60 */       this.aC.a(paramahb, paramRandom, j, k, m);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, Random paramRandom, aji[] paramArrayOfaji, byte[] paramArrayOfByte, int paramInt1, int paramInt2, double paramDouble)
/*    */   {
/* 66 */     this.ai = ajn.c;
/* 67 */     this.aj = 0;
/* 68 */     this.ak = ajn.d;
/* 69 */     if (((paramDouble < -1.0D) || (paramDouble > 2.0D)) && (this.aH == this.aG)) {
/* 70 */       this.ai = ajn.n;
/* 71 */       this.ak = ajn.n;
/* 72 */     } else if ((paramDouble > 1.0D) && (this.aH != this.aF)) {
/* 73 */       this.ai = ajn.b;
/* 74 */       this.ak = ajn.b;
/*    */     }
/* 76 */     b(paramahb, paramRandom, paramArrayOfaji, paramArrayOfByte, paramInt1, paramInt2, paramDouble);
/*    */   }
/*    */   
/*    */   private aid b(ahu paramahu) {
/* 80 */     this.aH = this.aG;
/*    */     
/* 82 */     a(paramahu.ag, true);
/* 83 */     a(paramahu.af + " M");
/* 84 */     a(new ahv(paramahu.am, paramahu.an));
/* 85 */     a(paramahu.ao, paramahu.ap);
/* 86 */     return this;
/*    */   }
/*    */   
/*    */   protected ahu k()
/*    */   {
/* 91 */     return new aid(this.ay + 128, false).b(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */