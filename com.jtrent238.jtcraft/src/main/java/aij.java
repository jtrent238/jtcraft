/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aij
/*    */   extends ahu
/*    */ {
/*    */   private boolean aC;
/* 12 */   private arw aD = new arw();
/* 13 */   private arv aE = new arv(4);
/*    */   
/*    */   public aij(int paramInt, boolean paramBoolean) {
/* 16 */     super(paramInt);
/* 17 */     this.aC = paramBoolean;
/*    */     
/* 19 */     if (paramBoolean) {
/* 20 */       this.ai = ajn.aE;
/*    */     }
/* 22 */     this.at.clear();
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 28 */     if (this.aC) { int j;
/*    */       int k;
/* 30 */       for (int i = 0; i < 3; i++) {
/* 31 */         j = paramInt1 + paramRandom.nextInt(16) + 8;
/* 32 */         k = paramInt2 + paramRandom.nextInt(16) + 8;
/* 33 */         this.aD.a(paramahb, paramRandom, j, paramahb.f(j, k), k);
/*    */       }
/* 35 */       for (i = 0; i < 2; i++) {
/* 36 */         j = paramInt1 + paramRandom.nextInt(16) + 8;
/* 37 */         k = paramInt2 + paramRandom.nextInt(16) + 8;
/* 38 */         this.aE.a(paramahb, paramRandom, j, paramahb.f(j, k), k);
/*    */       }
/*    */     }
/*    */     
/* 42 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 47 */     return new asn(false);
/*    */   }
/*    */   
/*    */   protected ahu k()
/*    */   {
/* 52 */     ahu localahu = new aij(this.ay + 128, true).a(13828095, true).a(this.af + " Spikes").c().a(0.0F, 0.5F).a(new ahv(this.am + 0.1F, this.an + 0.1F));
/*    */     
/*    */ 
/* 55 */     localahu.am = (this.am + 0.3F);
/* 56 */     localahu.an = (this.an + 0.4F);
/*    */     
/* 58 */     return localahu;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */