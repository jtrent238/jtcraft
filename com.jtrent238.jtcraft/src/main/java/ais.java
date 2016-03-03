/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ais
/*    */   extends ahu
/*    */ {
/* 12 */   private static final ask aC = new ask(false);
/*    */   
/*    */   protected ais(int paramInt) {
/* 15 */     super(paramInt);
/*    */     
/* 17 */     this.at.add(new ahx(wi.class, 1, 2, 6));
/*    */     
/* 19 */     this.ar.x = 1;
/* 20 */     this.ar.y = 4;
/* 21 */     this.ar.z = 20;
/*    */   }
/*    */   
/*    */   public arc a(Random paramRandom)
/*    */   {
/* 26 */     if (paramRandom.nextInt(5) > 0) {
/* 27 */       return aC;
/*    */     }
/* 29 */     return this.az;
/*    */   }
/*    */   
/*    */   protected ahu k()
/*    */   {
/* 34 */     ait localait = new ait(this.ay + 128, this);
/*    */     
/* 36 */     localait.ao = ((this.ao + 1.0F) * 0.5F);
/* 37 */     localait.am = (this.am * 0.5F + 0.3F);
/* 38 */     localait.an = (this.an * 0.5F + 1.2F);
/*    */     
/* 40 */     return localait;
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*    */   {
/* 46 */     ae.a(2);
/* 47 */     for (int i = 0; i < 7; i++) {
/* 48 */       int j = paramInt1 + paramRandom.nextInt(16) + 8;
/* 49 */       int k = paramInt2 + paramRandom.nextInt(16) + 8;
/* 50 */       int m = paramRandom.nextInt(paramahb.f(j, k) + 32);
/* 51 */       ae.a(paramahb, paramRandom, j, m, k);
/*    */     }
/*    */     
/* 54 */     super.a(paramahb, paramRandom, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ais.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */