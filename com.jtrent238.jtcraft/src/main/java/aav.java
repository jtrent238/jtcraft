/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aav
/*    */   extends rh
/*    */ {
/*    */   private ape a;
/*    */   
/*    */   public aav()
/*    */   {
/* 14 */     super("container.enderchest", false, 27);
/*    */   }
/*    */   
/*    */   public void a(ape paramape) {
/* 18 */     this.a = paramape;
/*    */   }
/*    */   
/*    */   public void a(dq paramdq) {
/* 22 */     for (int i = 0; i < a(); i++) {
/* 23 */       a(i, null);
/*    */     }
/* 25 */     for (i = 0; i < paramdq.c(); i++) {
/* 26 */       dh localdh = paramdq.b(i);
/* 27 */       int j = localdh.d("Slot") & 0xFF;
/* 28 */       if ((j >= 0) && (j < a())) a(j, add.a(localdh));
/*    */     }
/*    */   }
/*    */   
/*    */   public dq h() {
/* 33 */     dq localdq = new dq();
/* 34 */     for (int i = 0; i < a(); i++) {
/* 35 */       add localadd = a(i);
/* 36 */       if (localadd != null) {
/* 37 */         dh localdh = new dh();
/* 38 */         localdh.a("Slot", (byte)i);
/* 39 */         localadd.b(localdh);
/* 40 */         localdq.a(localdh);
/*    */       }
/*    */     }
/* 43 */     return localdq;
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 48 */     if ((this.a != null) && (!this.a.a(paramyz))) {
/* 49 */       return false;
/*    */     }
/* 51 */     return super.a(paramyz);
/*    */   }
/*    */   
/*    */   public void f()
/*    */   {
/* 56 */     if (this.a != null) {
/* 57 */       this.a.a();
/*    */     }
/* 59 */     super.f();
/*    */   }
/*    */   
/*    */   public void l_()
/*    */   {
/* 64 */     if (this.a != null) {
/* 65 */       this.a.b();
/*    */     }
/* 67 */     super.l_();
/* 68 */     this.a = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */