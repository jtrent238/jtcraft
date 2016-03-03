/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zm
/*    */   extends zk
/*    */ {
/*    */   public zm(ahb paramahb)
/*    */   {
/* 12 */     super(paramahb);
/*    */   }
/*    */   
/*    */   public zm(ahb paramahb, sv paramsv) {
/* 16 */     super(paramahb, paramsv);
/*    */   }
/*    */   
/*    */   public zm(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 20 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected void a(azu paramazu)
/*    */   {
/* 25 */     if (paramazu.g != null) {
/* 26 */       paramazu.g.a(ro.a(this, j()), 0.0F);
/*    */     }
/* 28 */     for (int i = 0; i < 32; i++) {
/* 29 */       this.o.a("portal", this.s, this.t + this.Z.nextDouble() * 2.0D, this.u, this.Z.nextGaussian(), 0.0D, this.Z.nextGaussian());
/*    */     }
/*    */     
/* 32 */     if (!this.o.E) {
/* 33 */       if ((j() != null) && ((j() instanceof mw))) {
/* 34 */         mw localmw = (mw)j();
/*    */         
/* 36 */         if ((localmw.a.b().d()) && (localmw.o == this.o)) {
/* 37 */           if (j().am()) {
/* 38 */             j().a(null);
/*    */           }
/* 40 */           j().a(this.s, this.t, this.u);
/* 41 */           j().R = 0.0F;
/* 42 */           j().a(ro.h, 5.0F);
/*    */         }
/*    */       }
/* 45 */       B();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */