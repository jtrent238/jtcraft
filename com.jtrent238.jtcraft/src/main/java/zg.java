/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zg
/*    */   extends ze
/*    */ {
/* 12 */   public int e = 1;
/*    */   
/*    */   public zg(ahb paramahb) {
/* 15 */     super(paramahb);
/*    */   }
/*    */   
/*    */   public zg(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 19 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*    */   }
/*    */   
/*    */   public zg(ahb paramahb, sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 23 */     super(paramahb, paramsv, paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   protected void a(azu paramazu)
/*    */   {
/* 28 */     if (!this.o.E) {
/* 29 */       if (paramazu.g != null) {
/* 30 */         paramazu.g.a(ro.a(this, this.a), 6.0F);
/*    */       }
/* 32 */       this.o.a(null, this.s, this.t, this.u, this.e, true, this.o.O().b("mobGriefing"));
/* 33 */       B();
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(dh paramdh)
/*    */   {
/* 39 */     super.b(paramdh);
/* 40 */     paramdh.a("ExplosionPower", this.e);
/*    */   }
/*    */   
/*    */   public void a(dh paramdh)
/*    */   {
/* 45 */     super.a(paramdh);
/* 46 */     if (paramdh.b("ExplosionPower", 99)) this.e = paramdh.f("ExplosionPower");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */