/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zl
/*    */   extends zk
/*    */ {
/*    */   public zl(ahb paramahb)
/*    */   {
/* 12 */     super(paramahb);
/*    */   }
/*    */   
/*    */   public zl(ahb paramahb, sv paramsv) {
/* 16 */     super(paramahb, paramsv);
/*    */   }
/*    */   
/*    */   public zl(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 20 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected void a(azu paramazu)
/*    */   {
/* 25 */     if (paramazu.g != null) {
/* 26 */       paramazu.g.a(ro.a(this, j()), 0.0F);
/*    */     }
/* 28 */     if ((!this.o.E) && (this.Z.nextInt(8) == 0)) {
/* 29 */       i = 1;
/* 30 */       if (this.Z.nextInt(32) == 0) i = 4;
/* 31 */       for (int j = 0; j < i; j++) {
/* 32 */         wg localwg = new wg(this.o);
/* 33 */         localwg.c(41536);
/*    */         
/* 35 */         localwg.b(this.s, this.t, this.u, this.y, 0.0F);
/* 36 */         this.o.d(localwg);
/*    */       }
/*    */     }
/*    */     
/* 40 */     for (int i = 0; i < 8; i++) {
/* 41 */       this.o.a("snowballpoof", this.s, this.t, this.u, 0.0D, 0.0D, 0.0D);
/*    */     }
/* 43 */     if (!this.o.E) {
/* 44 */       B();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */