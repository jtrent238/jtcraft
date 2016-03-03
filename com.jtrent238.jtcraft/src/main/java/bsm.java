/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsm
/*    */   extends bsl
/*    */ {
/*    */   private final xl k;
/* 15 */   private float l = 0.0F;
/*    */   
/*    */   public bsm(xl paramxl) {
/* 18 */     super(new bqx("minecraft:minecart.base"));
/*    */     
/* 20 */     this.k = paramxl;
/* 21 */     this.g = true;
/* 22 */     this.h = 0;
/*    */   }
/*    */   
/*    */   public void a()
/*    */   {
/* 27 */     if (this.k.K) {
/* 28 */       this.j = true;
/* 29 */       return;
/*    */     }
/*    */     
/* 32 */     this.d = ((float)this.k.s);
/* 33 */     this.e = ((float)this.k.t);
/* 34 */     this.f = ((float)this.k.u);
/*    */     
/* 36 */     float f = qh.a(this.k.v * this.k.v + this.k.x * this.k.x);
/* 37 */     if (f >= 0.01D) {
/* 38 */       this.l = qh.a(this.l + 0.0025F, 0.0F, 1.0F);
/*    */       
/* 40 */       this.b = (0.0F + qh.a(f, 0.0F, 0.5F) * 0.7F);
/*    */     } else {
/* 42 */       this.l = 0.0F;
/* 43 */       this.b = 0.0F;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */