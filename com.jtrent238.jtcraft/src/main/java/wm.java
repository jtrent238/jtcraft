/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wm
/*    */   extends wh
/*    */ {
/*    */   public wm(ahb paramahb)
/*    */   {
/* 13 */     super(paramahb);
/* 14 */     a(0.9F, 1.3F);
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 19 */     add localadd = paramyz.bm.h();
/* 20 */     if ((localadd != null) && (localadd.b() == ade.z) && (d() >= 0)) {
/* 21 */       if (localadd.b == 1) {
/* 22 */         paramyz.bm.a(paramyz.bm.c, new add(ade.A));
/* 23 */         return true;
/*    */       }
/*    */       
/* 26 */       if ((paramyz.bm.a(new add(ade.A))) && (!paramyz.bE.d)) {
/* 27 */         paramyz.bm.a(paramyz.bm.c, 1);
/* 28 */         return true;
/*    */       }
/*    */     }
/* 31 */     if ((localadd != null) && (localadd.b() == ade.aZ) && (d() >= 0)) {
/* 32 */       B();
/* 33 */       this.o.a("largeexplode", this.s, this.t + this.N / 2.0F, this.u, 0.0D, 0.0D, 0.0D);
/* 34 */       if (!this.o.E) {
/* 35 */         wh localwh = new wh(this.o);
/* 36 */         localwh.b(this.s, this.t, this.u, this.y, this.z);
/* 37 */         localwh.g(aS());
/* 38 */         localwh.aM = this.aM;
/* 39 */         this.o.d(localwh);
/* 40 */         for (int i = 0; i < 5; i++) {
/* 41 */           this.o.d(new xk(this.o, this.s, this.t + this.N, this.u, new add(ajn.Q)));
/*    */         }
/* 43 */         localadd.a(1, paramyz);
/* 44 */         a("mob.sheep.shear", 1.0F, 1.0F);
/*    */       }
/* 46 */       return true;
/*    */     }
/* 48 */     return super.a(paramyz);
/*    */   }
/*    */   
/*    */   public wm c(rx paramrx)
/*    */   {
/* 53 */     return new wm(this.o);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */