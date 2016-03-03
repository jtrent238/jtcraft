/*    */ 
/*    */ 
/*    */ 
/*    */ public class yw
/*    */ {
/*    */   public boolean a;
/*    */   public boolean b;
/*    */   public boolean c;
/*    */   public boolean d;
/* 10 */   public boolean e = true;
/* 11 */   private float f = 0.05F;
/* 12 */   private float g = 0.1F;
/*    */   
/*    */   public void a(dh paramdh) {
/* 15 */     dh localdh = new dh();
/*    */     
/* 17 */     localdh.a("invulnerable", this.a);
/* 18 */     localdh.a("flying", this.b);
/* 19 */     localdh.a("mayfly", this.c);
/* 20 */     localdh.a("instabuild", this.d);
/* 21 */     localdh.a("mayBuild", this.e);
/* 22 */     localdh.a("flySpeed", this.f);
/* 23 */     localdh.a("walkSpeed", this.g);
/* 24 */     paramdh.a("abilities", localdh);
/*    */   }
/*    */   
/*    */   public void b(dh paramdh) {
/* 28 */     if (paramdh.b("abilities", 10)) {
/* 29 */       dh localdh = paramdh.m("abilities");
/*    */       
/* 31 */       this.a = localdh.n("invulnerable");
/* 32 */       this.b = localdh.n("flying");
/* 33 */       this.c = localdh.n("mayfly");
/* 34 */       this.d = localdh.n("instabuild");
/*    */       
/* 36 */       if (localdh.b("flySpeed", 99)) {
/* 37 */         this.f = localdh.h("flySpeed");
/* 38 */         this.g = localdh.h("walkSpeed");
/*    */       }
/* 40 */       if (localdh.b("mayBuild", 1)) {
/* 41 */         this.e = localdh.n("mayBuild");
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public float a() {
/* 47 */     return this.f;
/*    */   }
/*    */   
/*    */   public void a(float paramFloat) {
/* 51 */     this.f = paramFloat;
/*    */   }
/*    */   
/*    */   public float b() {
/* 55 */     return this.g;
/*    */   }
/*    */   
/*    */   public void b(float paramFloat) {
/* 59 */     this.g = paramFloat;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */